package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("c")
public class class10 {

    @ObfuscatedName("c.q")
    public static final BigInteger field151 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("c.r")
    public static final BigInteger field143 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ez.o(JLjava/lang/String;B)I")
    public static final int method2881(long arg0, String arg1) {
        Random var3 = new Random();
        class111 var4 = new class111(128);
        class111 var5 = new class111(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2204(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2369(var3.nextInt());
        }
        var4.method2369(var6[0]);
        var4.method2369(var6[1]);
        var4.method2209(arg0);
        var4.method2209(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2369(var3.nextInt());
        }
        var4.method2239(field151, field143);
        var5.method2204(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2369(var3.nextInt());
        }
        var5.method2209(var3.nextLong());
        var5.method2431(var3.nextLong());
        byte[] var10 = new byte[24];
        try {
            class141.field2131.method3764(0L);
            class141.field2131.method3763(var10);
            int var11;
            for (var11 = 0; var11 < 24 && var10[var11] == 0; var11++) {
            }
            if (var11 >= 24) {
                throw new IOException();
            }
        } catch (Exception var31) {
            for (int var13 = 0; var13 < 24; var13++) {
                var10[var13] = -1;
            }
        }
        var5.method2213(var10, 0, 24);
        var5.method2209(var3.nextLong());
        var5.method2239(field151, field143);
        int var14 = class111.method2151(arg1);
        if (var14 % 8 != 0) {
            var14 += 8 - var14 % 8;
        }
        class111 var15 = new class111(var14);
        var15.method2269(arg1);
        var15.field1861 = var14;
        var15.method2235(var6);
        class111 var16 = new class111(var15.field1861 + var5.field1861 + var4.field1861 + 5);
        var16.method2204(2);
        var16.method2204(var4.field1861);
        var16.method2213(var4.field1860, 0, var4.field1861);
        var16.method2204(var5.field1861);
        var16.method2213(var5.field1860, 0, var5.field1861);
        var16.method2205(var15.field1861);
        var16.method2213(var15.field1860, 0, var15.field1861);
        String var17 = class152.method1402(var16.field1860);
        try {
            URL var18 = new URL(client.method1953("services", false) + "m=accountappeal/login.ws");
            URLConnection var19 = var18.openConnection();
            var19.setDoInput(true);
            var19.setDoOutput(true);
            var19.setConnectTimeout(5000);
            OutputStreamWriter var20 = new OutputStreamWriter(var19.getOutputStream());
            var20.write("data2=" + class217.method2654(var17) + "&dest=" + class217.method2654("passwordchoice.ws"));
            var20.flush();
            InputStream var21 = var19.getInputStream();
            class111 var22 = new class111(new byte[1000]);
            do {
                int var23 = var21.read(var22.field1860, var22.field1861, 1000 - var22.field1861);
                if (var23 == -1) {
                    var20.close();
                    var21.close();
                    String var24 = new String(var22.field1860);
                    if (var24.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var24.startsWith("WRONG")) {
                        return 7;
                    } else if (var24.startsWith("RELOAD")) {
                        return 3;
                    } else if (var24.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var22.method2236(var6);
                        while (var22.field1861 > 0 && var22.field1860[var22.field1861 - 1] == 0) {
                            var22.field1861--;
                        }
                        String var25 = new String(var22.field1860, 0, var22.field1861);
                        boolean var26;
                        if (var25 == null) {
                            var26 = false;
                        } else {
                            label87: {
                                try {
                                    new URL(var25);
                                } catch (MalformedURLException var29) {
                                    var26 = false;
                                    break label87;
                                }
                                var26 = true;
                            }
                        }
                        if (var26) {
                            class130.method863(var25, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var22.field1861 += var23;
            } while (var22.field1861 < 1000);
            return 5;
        } catch (Throwable var30) {
            var30.printStackTrace();
            return 5;
        }
    }
}
