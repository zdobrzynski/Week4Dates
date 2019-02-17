package com.ZachD.week4.Dates;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Date josh = new Date(1987, 2, 9);
        Date rattle = new Date(1988, 9, 10);
        long diff = rattle.getTime() - josh.getTime();
        String display;
        DateFormat formatter = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);

        System.out.println("The number of days between the release of The Joshua Tree and Rattle and Hum is " +
                diff / (1000 * 60 * 60 * 24) + " days.");

        Date today = new Date();
        System.out.println();
        display = formatter.format(today.getTime() + diff);

        System.out.println("If they released The Joshua Tree was released today, Rattle and Hum would release on " + display + ".");


    }
}
