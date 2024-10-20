package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("j")
public class class10 {

    @ObfuscatedName("j.n")
    public static final BigInteger field170 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("j.u")
    public static final BigInteger field169 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("at.i(I)J")
    public static long method1026() {
        try {
            URL var0 = new URL(client.method2345("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class123 var4 = new class123(new byte[1000]);
            do {
                int var5 = var3.read(var4.field2049, var4.field2046, 1000 - var4.field2046);
                if (var5 == -1) {
                    var4.field2046 = 0;
                    return var4.method2426();
                }
                var4.field2046 += var5;
            } while (var4.field2046 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("af.h(JLjava/lang/String;I)I")
    public static final int method637(long arg0, String arg1) {
        Random var3 = new Random();
        class123 var4 = new class123(128);
        class123 var5 = new class123(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2389(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2569(var3.nextInt());
        }
        var4.method2569(var6[0]);
        var4.method2569(var6[1]);
        var4.method2538(arg0);
        var4.method2538(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2569(var3.nextInt());
        }
        var4.method2425(field170, field169);
        var5.method2389(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2569(var3.nextInt());
        }
        var5.method2538(var3.nextLong());
        var5.method2393(var3.nextLong());
        byte[] var10 = new byte[24];
        try {
            class153.field2284.method3922(0L);
            class153.field2284.method3924(var10);
            int var11;
            for (var11 = 0; var11 < 24 && var10[var11] == 0; var11++) {
            }
            if (var11 >= 24) {
                throw new IOException();
            }
        } catch (Exception var28) {
            for (int var13 = 0; var13 < 24; var13++) {
                var10[var13] = -1;
            }
        }
        var5.method2441(var10, 0, 24);
        var5.method2538(var3.nextLong());
        var5.method2425(field170, field169);
        int var14 = class123.method538(arg1);
        if (var14 % 8 != 0) {
            var14 += 8 - var14 % 8;
        }
        class123 var15 = new class123(var14);
        var15.method2395(arg1);
        var15.field2046 = var14;
        var15.method2578(var6);
        class123 var16 = new class123(var15.field2046 + var5.field2046 + var4.field2046 + 5);
        var16.method2389(2);
        var16.method2389(var4.field2046);
        var16.method2441(var4.field2049, 0, var4.field2046);
        var16.method2389(var5.field2046);
        var16.method2441(var5.field2049, 0, var5.field2046);
        var16.method2561(var15.field2046);
        var16.method2441(var15.field2049, 0, var15.field2046);
        String var17 = class165.method2836(var16.field2049);
        try {
            URL var18 = new URL(client.method2345("services", false) + "m=accountappeal/login.ws");
            URLConnection var19 = var18.openConnection();
            var19.setDoInput(true);
            var19.setDoOutput(true);
            var19.setConnectTimeout(5000);
            OutputStreamWriter var20 = new OutputStreamWriter(var19.getOutputStream());
            var20.write("data2=" + class230.method2991(var17) + "&dest=" + class230.method2991("passwordchoice.ws"));
            var20.flush();
            InputStream var21 = var19.getInputStream();
            class123 var22 = new class123(new byte[1000]);
            do {
                int var23 = var21.read(var22.field2049, var22.field2046, 1000 - var22.field2046);
                if (var23 == -1) {
                    var20.close();
                    var21.close();
                    String var24 = new String(var22.field2049);
                    if (var24.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var24.startsWith("WRONG")) {
                        return 7;
                    } else if (var24.startsWith("RELOAD")) {
                        return 3;
                    } else if (var24.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var22.method2422(var6);
                        while (var22.field2046 > 0 && var22.field2049[var22.field2046 - 1] == 0) {
                            var22.field2046--;
                        }
                        String var25 = new String(var22.field2049, 0, var22.field2046);
                        if (method2760(var25)) {
                            class142.method2324(var25, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var22.field2046 += var23;
            } while (var22.field2046 < 1000);
            return 5;
        } catch (Throwable var27) {
            var27.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("ep.e(Ljava/lang/String;B)Z")
    public static boolean method2760(String arg0) {
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
