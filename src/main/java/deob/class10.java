package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("k")
public class class10 {

    @ObfuscatedName("k.f")
    public static final BigInteger field157 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("k.m")
    public static final BigInteger field158 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.j(I)J")
    public static long method1() {
        try {
            URL var0 = new URL(client.method2694("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class119 var4 = new class119(new byte[1000]);
            do {
                int var5 = var3.read(var4.field1996, var4.field1999, 1000 - var4.field1999);
                if (var5 == -1) {
                    var4.field1999 = 0;
                    return var4.method2495();
                }
                var4.field1999 += var5;
            } while (var4.field1999 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("s.l(JLjava/lang/String;I)I")
    public static final int method182(long arg0, String arg1) {
        Random var3 = new Random();
        class119 var4 = new class119(128);
        class119 var5 = new class119(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2301(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2304(var3.nextInt());
        }
        var4.method2304(var6[0]);
        var4.method2304(var6[1]);
        var4.method2433(arg0);
        var4.method2433(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2304(var3.nextInt());
        }
        var4.method2487(field157, field158);
        var5.method2301(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2304(var3.nextInt());
        }
        var5.method2433(var3.nextLong());
        var5.method2305(var3.nextLong());
        byte[] var10 = new byte[24];
        try {
            class149.field2242.method3833(0L);
            class149.field2242.method3857(var10);
            int var11;
            for (var11 = 0; var11 < 24 && var10[var11] == 0; var11++) {
            }
            if (var11 >= 24) {
                throw new IOException();
            }
        } catch (Exception var30) {
            for (int var13 = 0; var13 < 24; var13++) {
                var10[var13] = -1;
            }
        }
        var5.method2310(var10, 0, 24);
        var5.method2433(var3.nextLong());
        var5.method2487(field157, field158);
        int var14 = class119.method730(arg1);
        if (var14 % 8 != 0) {
            var14 += 8 - var14 % 8;
        }
        class119 var15 = new class119(var14);
        var15.method2307(arg1);
        var15.field1999 = var14;
        var15.method2332(var6);
        class119 var16 = new class119(var15.field1999 + var5.field1999 + var4.field1999 + 5);
        var16.method2301(2);
        var16.method2301(var4.field1999);
        var16.method2310(var4.field1996, 0, var4.field1999);
        var16.method2301(var5.field1999);
        var16.method2310(var5.field1996, 0, var5.field1999);
        var16.method2404(var15.field1999);
        var16.method2310(var15.field1996, 0, var15.field1999);
        byte[] var17 = var16.field1996;
        String var18 = class161.method633(var17, 0, var17.length);
        String var19 = var18;
        try {
            URL var20 = new URL(client.method2694("services", false) + "m=accountappeal/login.ws");
            URLConnection var21 = var20.openConnection();
            var21.setDoInput(true);
            var21.setDoOutput(true);
            var21.setConnectTimeout(5000);
            OutputStreamWriter var22 = new OutputStreamWriter(var21.getOutputStream());
            var22.write("data2=" + class226.method745(var19) + "&dest=" + class226.method745("passwordchoice.ws"));
            var22.flush();
            InputStream var23 = var21.getInputStream();
            class119 var24 = new class119(new byte[1000]);
            do {
                int var25 = var23.read(var24.field1996, var24.field1999, 1000 - var24.field1999);
                if (var25 == -1) {
                    var22.close();
                    var23.close();
                    String var26 = new String(var24.field1996);
                    if (var26.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var26.startsWith("WRONG")) {
                        return 7;
                    } else if (var26.startsWith("RELOAD")) {
                        return 3;
                    } else if (var26.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var24.method2333(var6);
                        while (var24.field1999 > 0 && var24.field1996[var24.field1999 - 1] == 0) {
                            var24.field1999--;
                        }
                        String var27 = new String(var24.field1996, 0, var24.field1999);
                        if (method556(var27)) {
                            class138.method2982(var27, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var24.field1999 += var25;
            } while (var24.field1999 < 1000);
            return 5;
        } catch (Throwable var29) {
            var29.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("client.a(Ljava/lang/String;I)Z")
    public static boolean method556(String arg0) {
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
