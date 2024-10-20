package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("co")
public class class103 {

    @ObfuscatedName("co.t")
    public static final String[][] field1830 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("co.b")
    public static final String[] field1828 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("co.p")
    public static Calendar field1827;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field1827 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class103() throws Throwable {
        throw new Error();
    }
}
