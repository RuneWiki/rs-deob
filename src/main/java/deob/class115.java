package deob;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("dh")
public class class115 {

    @ObfuscatedName("dh.f")
    public static final String[][] field2016 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

    @ObfuscatedName("dh.e")
    public static final String[] field2009 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @ObfuscatedName("dh.n")
    public static Calendar field2010;

    static {
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        field2010 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("az.f(J)Ljava/lang/String;")
    public static String method898(long arg0) {
        field2010.setTime(new Date(arg0));
        int var2 = field2010.get(7);
        int var3 = field2010.get(5);
        int var4 = field2010.get(2);
        int var5 = field2010.get(1);
        int var6 = field2010.get(11);
        int var7 = field2010.get(12);
        int var8 = field2010.get(13);
        return field2009[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field2016[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
    }
}
