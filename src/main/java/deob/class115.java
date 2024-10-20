package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("dr")
public class class115 {

    @ObfuscatedName("dr.i")
    public static final String[][] field2007 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("dr.h")
    public static final String[] field2003 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("dr.e")
    public static Calendar field2004;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2004 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class115() throws Throwable {
        throw new Error();
    }
}
