package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("c")
public class class10 {

    @ObfuscatedName("c.d")
    public static final BigInteger field162 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("c.u")
    public static final BigInteger field159 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("db.s(B)J")
    public static long method2283() {
        try {
            URL var0 = new URL(client.method2604("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class120 var4 = new class120(new byte[1000]);
            do {
                int var5 = var3.read(var4.field2008, var4.field2006, 1000 - var4.field2006);
                if (var5 == -1) {
                    var4.field2006 = 0;
                    return var4.method2344();
                }
                var4.field2006 += var5;
            } while (var4.field2006 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("ac.j(JLjava/lang/String;I)I")
    public static final int method945(long arg0, String arg1) {
        Random var3 = new Random();
        class120 var4 = new class120(128);
        class120 var5 = new class120(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2323(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2326(var3.nextInt());
        }
        var4.method2326(var6[0]);
        var4.method2326(var6[1]);
        var4.method2328(arg0);
        var4.method2328(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2326(var3.nextInt());
        }
        var4.method2358(field162, field159);
        var5.method2323(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2326(var3.nextInt());
        }
        var5.method2328(var3.nextLong());
        var5.method2374(var3.nextLong());
        class150.method2126(var5);
        var5.method2328(var3.nextLong());
        var5.method2358(field162, field159);
        int var10 = class120.method636(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class120 var11 = new class120(var10);
        var11.method2329(arg1);
        var11.field2006 = var10;
        var11.method2354(var6);
        class120 var12 = new class120(var11.field2006 + var5.field2006 + var4.field2006 + 5);
        var12.method2323(2);
        var12.method2323(var4.field2006);
        var12.method2332(var4.field2008, 0, var4.field2006);
        var12.method2323(var5.field2006);
        var12.method2332(var5.field2008, 0, var5.field2006);
        var12.method2507(var11.field2006);
        var12.method2332(var11.field2008, 0, var11.field2006);
        String var13 = class162.method2627(var12.field2008);
        try {
            URL var14 = new URL(client.method2604("services", false) + "m=accountappeal/login.ws");
            URLConnection var15 = var14.openConnection();
            var15.setDoInput(true);
            var15.setDoOutput(true);
            var15.setConnectTimeout(5000);
            OutputStreamWriter var16 = new OutputStreamWriter(var15.getOutputStream());
            var16.write("data2=" + class227.method2984(var13) + "&dest=" + class227.method2984("passwordchoice.ws"));
            var16.flush();
            InputStream var17 = var15.getInputStream();
            class120 var18 = new class120(new byte[1000]);
            do {
                int var19 = var17.read(var18.field2008, var18.field2006, 1000 - var18.field2006);
                if (var19 == -1) {
                    var16.close();
                    var17.close();
                    String var20 = new String(var18.field2008);
                    if (var20.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var20.startsWith("WRONG")) {
                        return 7;
                    } else if (var20.startsWith("RELOAD")) {
                        return 3;
                    } else if (var20.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var18.method2389(var6);
                        while (var18.field2006 > 0 && var18.field2008[var18.field2006 - 1] == 0) {
                            var18.field2006--;
                        }
                        String var21 = new String(var18.field2008, 0, var18.field2006);
                        if (method2794(var21)) {
                            class139.method2134(var21, true, "openjs", false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var18.field2006 += var19;
            } while (var18.field2006 < 1000);
            return 5;
        } catch (Throwable var23) {
            var23.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("eh.p(Ljava/lang/String;I)Z")
    public static boolean method2794(String arg0) {
        if (arg0 == null) {
            return false;
        }
        try {
            new URL(arg0);
            return true;
        } catch (MalformedURLException var2) {
            return false;
        }
    }
}
