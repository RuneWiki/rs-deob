package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("g")
public class class10 {

    @ObfuscatedName("g.u")
    public static final BigInteger field140 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("g.w")
    public static final BigInteger field137 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dv.e(B)J")
    public static long method2486() {
        try {
            URL var0 = new URL(client.method881("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field1835, var4.field1834, 1000 - var4.field1834);
                if (var5 == -1) {
                    var4.field1834 = 0;
                    return var4.method2265();
                }
                var4.field1834 += var5;
            } while (var4.field1834 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("g.a(JLjava/lang/String;I)I")
    public static final int method136(long arg0, String arg1) {
        Random var3 = new Random();
        class111 var4 = new class111(128);
        class111 var5 = new class111(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2366(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2229(var3.nextInt());
        }
        var4.method2229(var6[0]);
        var4.method2229(var6[1]);
        var4.method2312(arg0);
        var4.method2312(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2229(var3.nextInt());
        }
        var4.method2383(field140, field137);
        var5.method2366(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2229(var3.nextInt());
        }
        var5.method2312(var3.nextLong());
        var5.method2351(var3.nextLong());
        byte[] var10 = new byte[24];
        try {
            class141.field2096.method3674(0L);
            class141.field2096.method3661(var10);
            int var11;
            for (var11 = 0; var11 < 24 && var10[var11] == 0; var11++) {
            }
            if (var11 >= 24) {
                throw new IOException();
            }
        } catch (Exception var38) {
            for (int var13 = 0; var13 < 24; var13++) {
                var10[var13] = -1;
            }
        }
        var5.method2170(var10, 0, 24);
        var5.method2312(var3.nextLong());
        var5.method2383(field140, field137);
        int var14 = arg1.length() + 1;
        int var15 = var14;
        if (var14 % 8 != 0) {
            var15 = 8 - var14 % 8 + var14;
        }
        class111 var16 = new class111(var15);
        var16.method2177(arg1);
        var16.field1834 = var15;
        var16.method2191(var6);
        class111 var17 = new class111(var16.field1834 + var5.field1834 + var4.field1834 + 5);
        var17.method2366(2);
        var17.method2366(var4.field1834);
        var17.method2170(var4.field1835, 0, var4.field1834);
        var17.method2366(var5.field1834);
        var17.method2170(var5.field1835, 0, var5.field1834);
        var17.method2190(var16.field1834);
        var17.method2170(var16.field1835, 0, var16.field1834);
        byte[] var18 = var17.field1835;
        int var19 = var18.length;
        StringBuilder var20 = new StringBuilder();
        for (int var21 = 0; var21 < var19; var21 += 3) {
            int var22 = var18[var21] & 0xFF;
            var20.append(class152.field2492[var22 >>> 2]);
            if (var21 < var19 - 1) {
                int var23 = var18[var21 + 1] & 0xFF;
                var20.append(class152.field2492[(var22 & 0x3) << 4 | var23 >>> 4]);
                if (var21 < var19 - 2) {
                    int var24 = var18[var21 + 2] & 0xFF;
                    var20.append(class152.field2492[(var23 & 0xF) << 2 | var24 >>> 6]).append(class152.field2492[var24 & 0x3F]);
                } else {
                    var20.append(class152.field2492[(var23 & 0xF) << 2]).append("=");
                }
            } else {
                var20.append(class152.field2492[(var22 & 0x3) << 4]).append("==");
            }
        }
        String var25 = var20.toString();
        String var27 = var25;
        try {
            URL var28 = new URL(client.method881("services", false) + "m=accountappeal/login.ws");
            URLConnection var29 = var28.openConnection();
            var29.setDoInput(true);
            var29.setDoOutput(true);
            var29.setConnectTimeout(5000);
            OutputStreamWriter var30 = new OutputStreamWriter(var29.getOutputStream());
            var30.write("data2=" + class216.method3294(var27) + "&dest=" + class216.method3294("passwordchoice.ws"));
            var30.flush();
            InputStream var31 = var29.getInputStream();
            class111 var32 = new class111(new byte[1000]);
            do {
                int var33 = var31.read(var32.field1835, var32.field1834, 1000 - var32.field1834);
                if (var33 == -1) {
                    var30.close();
                    var31.close();
                    String var34 = new String(var32.field1835);
                    if (var34.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var34.startsWith("WRONG")) {
                        return 7;
                    } else if (var34.startsWith("RELOAD")) {
                        return 3;
                    } else if (var34.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var32.method2199(var6);
                        while (var32.field1834 > 0 && var32.field1835[var32.field1834 - 1] == 0) {
                            var32.field1834--;
                        }
                        String var35 = new String(var32.field1835, 0, var32.field1834);
                        if (method2956(var35)) {
                            class130.method2942(var35, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var32.field1834 += var33;
            } while (var32.field1834 < 1000);
            return 5;
        } catch (Throwable var37) {
            var37.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("fj.l(Ljava/lang/String;I)Z")
    public static boolean method2956(String arg0) {
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
