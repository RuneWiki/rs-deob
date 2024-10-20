package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("du")
public class class112 {

    @ObfuscatedName("du.s")
    public static final String[][] field1967 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("du.j")
    public static final String[] field1964 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("du.p")
    public static Calendar field1965;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1965 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class112() throws Throwable {
        throw new Error();
    }
}
