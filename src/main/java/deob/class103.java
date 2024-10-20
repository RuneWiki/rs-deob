package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("cj")
public class class103 {

    @ObfuscatedName("cj.p")
    public static final String[][] field1847 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("cj.k")
    public static final String[] field1845 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("cj.e")
    public static Calendar field1844;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1844 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class103() throws Throwable {
        throw new Error();
    }
}
