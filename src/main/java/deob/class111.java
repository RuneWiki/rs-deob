package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("de")
public class class111 {

    @ObfuscatedName("de.a")
    public static final String[][] field1951 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("de.r")
    public static final String[] field1945 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("de.f")
    public static Calendar field1946;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1946 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class111() throws Throwable {
        throw new Error();
    }
}
