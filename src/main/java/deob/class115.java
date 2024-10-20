package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("db")
public class class115 {

    @ObfuscatedName("db.x")
    public static final String[][] field2016 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("db.r")
    public static final String[] field2013 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("db.j")
    public static Calendar field2014;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2014 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class115() throws Throwable {
        throw new Error();
    }
}
