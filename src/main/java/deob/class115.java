package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("dr")
public class class115 {

    @ObfuscatedName("dr.e")
    public static final String[][] field2016 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("dr.l")
    public static final String[] field2017 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("dr.c")
    public static Calendar field2018;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2018 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class115() throws Throwable {
        throw new Error();
    }
}
