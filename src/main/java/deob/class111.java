package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("da")
public class class111 {

    @ObfuscatedName("da.i")
    public static final String[][] field1944 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("da.v")
    public static final String[] field1940 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("da.f")
    public static Calendar field1939;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1939 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class111() throws Throwable {
        throw new Error();
    }
}
