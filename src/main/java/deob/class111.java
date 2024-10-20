package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("dx")
public class class111 {

    @ObfuscatedName("dx.g")
    public static final String[][] field1937 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("dx.b")
    public static final String[] field1932 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("dx.w")
    public static Calendar field1933;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1933 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class111() throws Throwable {
        throw new Error();
    }
}
