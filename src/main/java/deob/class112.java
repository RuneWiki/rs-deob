package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("du")
public class class112 {

    @ObfuscatedName("du.e")
    public static final String[][] field1937 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("du.w")
    public static final String[] field1938 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("du.f")
    public static Calendar field1944;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1944 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class112() throws Throwable {
        throw new Error();
    }
}
