package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("dk")
public class class111 {

    @ObfuscatedName("dk.m")
    public static final String[][] field1910 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("dk.l")
    public static final String[] field1916 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("dk.y")
    public static Calendar field1913;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1913 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class111() throws Throwable {
        throw new Error();
    }
}
