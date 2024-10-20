package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("di")
public class class111 {

    @ObfuscatedName("di.z")
    public static final String[][] field1948 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("di.q")
    public static final String[] field1945 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("di.k")
    public static Calendar field1950;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1950 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class111() throws Throwable {
        throw new Error();
    }
}
