package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("dw")
public class class115 {

    @ObfuscatedName("dw.m")
    public static final String[][] field2010 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("dw.w")
    public static final String[] field2008 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("dw.e")
    public static Calendar field2009;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2009 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class115() throws Throwable {
        throw new Error();
    }
}
