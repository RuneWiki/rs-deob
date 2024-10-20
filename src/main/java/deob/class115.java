package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("dy")
public class class115 {

    @ObfuscatedName("dy.k")
    public static final String[][] field2015 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("dy.q")
    public static final String[] field2014 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("dy.f")
    public static Calendar field2013;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2013 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class115() throws Throwable {
        throw new Error();
    }
}
