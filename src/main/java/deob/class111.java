package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("dg")
public class class111 {

    @ObfuscatedName("dg.o")
    public static final String[][] field1940 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("dg.f")
    public static final String[] field1939 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("dg.i")
    public static Calendar field1941;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1941 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class111() throws Throwable {
        throw new Error();
    }
}
