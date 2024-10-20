package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("q")
public class class10 {

    @ObfuscatedName("q.p")
    public static final BigInteger field142 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("q.l")
    public static final BigInteger field148 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("r.b(I)J")
    public static long method153() {
        try {
            URL var0 = new URL(client.method98("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class111 var4 = new class111(new byte[1000]);
            do {
                int var5 = var3.read(var4.field1897, var4.field1894, 1000 - var4.field1894);
                if (var5 == -1) {
                    var4.field1894 = 0;
                    return var4.method2133();
                }
                var4.field1894 += var5;
            } while (var4.field1894 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("fw.e(JLjava/lang/String;B)I")
    public static final int method2937(long arg0, String arg1) {
        Random var3 = new Random();
        class111 var4 = new class111(128);
        class111 var5 = new class111(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2112(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2115(var3.nextInt());
        }
        var4.method2115(var6[0]);
        var4.method2115(var6[1]);
        var4.method2187(arg0);
        var4.method2187(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2115(var3.nextInt());
        }
        var4.method2147(field142, field148);
        var5.method2112(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2115(var3.nextInt());
        }
        var5.method2187(var3.nextLong());
        var5.method2116(var3.nextLong());
        class141.method2441(var5);
        var5.method2187(var3.nextLong());
        var5.method2147(field142, field148);
        int var10 = class111.method1876(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class111 var11 = new class111(var10);
        var11.method2247(arg1);
        var11.field1894 = var10;
        var11.method2227(var6);
        class111 var12 = new class111(var11.field1894 + var5.field1894 + var4.field1894 + 5);
        var12.method2112(2);
        var12.method2112(var4.field1894);
        var12.method2121(var4.field1897, 0, var4.field1894);
        var12.method2112(var5.field1894);
        var12.method2121(var5.field1897, 0, var5.field1894);
        var12.method2201(var11.field1894);
        var12.method2121(var11.field1897, 0, var11.field1894);
        byte[] var13 = var12.field1897;
        String var14 = class152.method2734(var13, 0, var13.length);
        String var15 = var14;
        try {
            URL var16 = new URL(client.method98("services", false) + "m=accountappeal/login.ws");
            URLConnection var17 = var16.openConnection();
            var17.setDoInput(true);
            var17.setDoOutput(true);
            var17.setConnectTimeout(5000);
            OutputStreamWriter var18 = new OutputStreamWriter(var17.getOutputStream());
            var18.write("data2=" + class217.method2051(var15) + "&dest=" + class217.method2051("passwordchoice.ws"));
            var18.flush();
            InputStream var19 = var17.getInputStream();
            class111 var20 = new class111(new byte[1000]);
            do {
                int var21 = var19.read(var20.field1897, var20.field1894, 1000 - var20.field1894);
                if (var21 == -1) {
                    var18.close();
                    var19.close();
                    String var22 = new String(var20.field1897);
                    if (var22.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var22.startsWith("WRONG")) {
                        return 7;
                    } else if (var22.startsWith("RELOAD")) {
                        return 3;
                    } else if (var22.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var20.method2117(var6);
                        while (var20.field1894 > 0 && var20.field1897[var20.field1894 - 1] == 0) {
                            var20.field1894--;
                        }
                        String var23 = new String(var20.field1897, 0, var20.field1894);
                        if (method827(var23)) {
                            class130.method805(var23, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var20.field1894 += var21;
            } while (var20.field1894 < 1000);
            return 5;
        } catch (Throwable var25) {
            var25.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("an.a(Ljava/lang/String;I)Z")
    public static boolean method827(String arg0) {
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
