package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("cm")
public class class103 {

    @ObfuscatedName("cm.n")
    public static final String[][] field1835 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("cm.w")
    public static final String[] field1834 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("cm.i")
    public static Calendar field1836;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1836 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class103() throws Throwable {
        throw new Error();
    }
}
