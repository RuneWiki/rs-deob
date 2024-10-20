package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("l")
public class class10 {

    @ObfuscatedName("l.e")
    public static final BigInteger field169 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("l.y")
    public static final BigInteger field171 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ae.w(I)J")
    public static long method742() {
        try {
            URL var0 = new URL(client.method749("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field2013, var4.field2012, 1000 - var4.field2012);
                if (var5 == -1) {
                    var4.field2012 = 0;
                    return var4.method2369();
                }
                var4.field2012 += var5;
            } while (var4.field2012 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("bd.x(JLjava/lang/String;B)I")
    public static final int method1093(long arg0, String arg1) {
        Random var3 = new Random();
        class120 var4 = new class120(128);
        class120 var5 = new class120(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2430(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2351(var3.nextInt());
        }
        var4.method2351(var6[0]);
        var4.method2351(var6[1]);
        var4.method2353(arg0);
        var4.method2353(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2351(var3.nextInt());
        }
        var4.method2383(field169, field171);
        var5.method2430(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2351(var3.nextInt());
        }
        var5.method2353(var3.nextLong());
        var5.method2352(var3.nextLong());
        byte[] var10 = new byte[24];
        try {
            class150.field2253.method3913(0L);
            class150.field2253.method3898(var10);
            int var11;
            for (var11 = 0; var11 < 24 && var10[var11] == 0; var11++) {
            }
            if (var11 >= 24) {
                throw new IOException();
            }
        } catch (Exception var33) {
            for (int var13 = 0; var13 < 24; var13++) {
                var10[var13] = -1;
            }
        }
        var5.method2463(var10, 0, 24);
        var5.method2353(var3.nextLong());
        var5.method2383(field169, field171);
        int var14 = class120.method973(arg1);
        if (var14 % 8 != 0) {
            var14 += 8 - var14 % 8;
        }
        class120 var15 = new class120(var14);
        var15.method2518(arg1);
        var15.field2012 = var14;
        var15.method2379(var6);
        class120 var16 = new class120(var15.field2012 + var5.field2012 + var4.field2012 + 5);
        var16.method2430(2);
        var16.method2430(var4.field2012);
        var16.method2463(var4.field2013, 0, var4.field2012);
        var16.method2430(var5.field2012);
        var16.method2463(var5.field2013, 0, var5.field2012);
        var16.method2349(var15.field2012);
        var16.method2463(var15.field2013, 0, var15.field2012);
        String var17 = class162.method1959(var16.field2013);
        try {
            URL var18 = new URL(client.method749("services", false) + "m=accountappeal/login.ws");
            URLConnection var19 = var18.openConnection();
            var19.setDoInput(true);
            var19.setDoOutput(true);
            var19.setConnectTimeout(5000);
            OutputStreamWriter var20 = new OutputStreamWriter(var19.getOutputStream());
            var20.write("data2=" + class227.method593(var17) + "&dest=" + class227.method593("passwordchoice.ws"));
            var20.flush();
            InputStream var21 = var19.getInputStream();
            class120 var22 = new class120(new byte[1000]);
            do {
                int var23 = var21.read(var22.field2013, var22.field2012, 1000 - var22.field2012);
                if (var23 == -1) {
                    var20.close();
                    var21.close();
                    String var24 = new String(var22.field2013);
                    if (var24.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var24.startsWith("WRONG")) {
                        return 7;
                    } else if (var24.startsWith("RELOAD")) {
                        return 3;
                    } else if (var24.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var22.method2380(var6);
                        while (var22.field2012 > 0 && var22.field2013[var22.field2012 - 1] == 0) {
                            var22.field2012--;
                        }
                        String var25 = new String(var22.field2013, 0, var22.field2012);
                        boolean var26;
                        if (var25 == null) {
                            var26 = false;
                        } else {
                            label107: {
                                try {
                                    new URL(var25);
                                } catch (MalformedURLException var31) {
                                    var26 = false;
                                    break label107;
                                }
                                var26 = true;
                            }
                        }
                        if (!var26) {
                            return 5;
                        }
                        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                            try {
                                Desktop.getDesktop().browse(new URI(var25));
                                return 2;
                            } catch (Exception var30) {
                            }
                        }
                        if (class139.field2152.startsWith("win")) {
                            Statics.method735(var25, 0, "openjs");
                        } else if (class139.field2152.startsWith("mac")) {
                            Statics.method735(var25, 1, "openjs");
                        } else {
                            Statics.method735(var25, 2, "openjs");
                        }
                        return 2;
                    }
                }
                var22.field2012 += var23;
            } while (var22.field2012 < 1000);
            return 5;
        } catch (Throwable var32) {
            var32.printStackTrace();
            return 5;
        }
    }
}
