package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("v")
public class class10 {

    @ObfuscatedName("v.w")
    public static final BigInteger field149 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("v.t")
    public static final BigInteger field154 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.p(I)J")
    public static long method172() {
        try {
            URL var0 = new URL(client.method103("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field1889, var4.field1885, 1000 - var4.field1885);
                if (var5 == -1) {
                    var4.field1885 = 0;
                    return var4.method2181();
                }
                var4.field1885 += var5;
            } while (var4.field1885 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("au.k(JLjava/lang/String;I)I")
    public static final int method653(long arg0, String arg1) {
        Random var3 = new Random();
        class111 var4 = new class111(128);
        class111 var5 = new class111(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2160(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2161(var3.nextInt());
        }
        var4.method2161(var6[0]);
        var4.method2161(var6[1]);
        var4.method2279(arg0);
        var4.method2279(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2161(var3.nextInt());
        }
        var4.method2195(field149, field154);
        var5.method2160(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2161(var3.nextInt());
        }
        var5.method2279(var3.nextLong());
        var5.method2164(var3.nextLong());
        class141.method3544(var5);
        var5.method2279(var3.nextLong());
        var5.method2195(field149, field154);
        int var10 = class111.method1406(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class111 var11 = new class111(var10);
        var11.method2186(arg1);
        var11.field1885 = var10;
        var11.method2249(var6);
        class111 var12 = new class111(var11.field1885 + var5.field1885 + var4.field1885 + 5);
        var12.method2160(2);
        var12.method2160(var4.field1885);
        var12.method2227(var4.field1889, 0, var4.field1885);
        var12.method2160(var5.field1885);
        var12.method2227(var5.field1889, 0, var5.field1885);
        var12.method2365(var11.field1885);
        var12.method2227(var11.field1889, 0, var11.field1885);
        String var13 = class152.method3128(var12.field1889);
        try {
            URL var14 = new URL(client.method103("services", false) + "m=accountappeal/login.ws");
            URLConnection var15 = var14.openConnection();
            var15.setDoInput(true);
            var15.setDoOutput(true);
            var15.setConnectTimeout(5000);
            OutputStreamWriter var16 = new OutputStreamWriter(var15.getOutputStream());
            var16.write("data2=" + class217.method1442(var13) + "&dest=" + class217.method1442("passwordchoice.ws"));
            var16.flush();
            InputStream var17 = var15.getInputStream();
            class111 var18 = new class111(new byte[1000]);
            do {
                int var19 = var17.read(var18.field1889, var18.field1885, 1000 - var18.field1885);
                if (var19 == -1) {
                    var16.close();
                    var17.close();
                    String var20 = new String(var18.field1889);
                    if (var20.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var20.startsWith("WRONG")) {
                        return 7;
                    } else if (var20.startsWith("RELOAD")) {
                        return 3;
                    } else if (var20.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var18.method2198(var6);
                        while (var18.field1885 > 0 && var18.field1889[var18.field1885 - 1] == 0) {
                            var18.field1885--;
                        }
                        String var21 = new String(var18.field1889, 0, var18.field1885);
                        boolean var22;
                        if (var21 == null) {
                            var22 = false;
                        } else {
                            label73: {
                                try {
                                    new URL(var21);
                                } catch (MalformedURLException var25) {
                                    var22 = false;
                                    break label73;
                                }
                                var22 = true;
                            }
                        }
                        if (var22) {
                            class130.method841(var21, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var18.field1885 += var19;
            } while (var18.field1885 < 1000);
            return 5;
        } catch (Throwable var26) {
            var26.printStackTrace();
            return 5;
        }
    }
}
