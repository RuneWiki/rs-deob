package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("do")
public class class111 {

    @ObfuscatedName("do.f")
    public static final String[][] field1946 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("do.s")
    public static final String[] field1953 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("do.q")
    public static Calendar field1948;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1948 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class111() throws Throwable {
        throw new Error();
    }
}
