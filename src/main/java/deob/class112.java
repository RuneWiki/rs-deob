package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("dz")
public class class112 {

    @ObfuscatedName("dz.t")
    public static final String[][] field1966 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("dz.i")
    public static final String[] field1959 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("dz.g")
    public static Calendar field1964;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1964 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class112() throws Throwable {
        throw new Error();
    }
}
