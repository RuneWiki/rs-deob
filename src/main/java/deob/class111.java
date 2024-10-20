package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("dr")
public class class111 {

    @ObfuscatedName("dr.k")
    public static final String[][] field1910 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("dr.h")
    public static final String[] field1905 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("dr.o")
    public static Calendar field1907;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1907 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class111() throws Throwable {
        throw new Error();
    }
}
