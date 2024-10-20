package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("h")
public class class10 {

    @ObfuscatedName("h.e")
    public static final BigInteger field145 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("h.g")
    public static final BigInteger field141 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dl.n(I)J")
    public static long method2442() {
        try {
            URL var0 = new URL(client.method604("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field1888, var4.field1889, 1000 - var4.field1889);
                if (var5 == -1) {
                    var4.field1889 = 0;
                    return var4.method2412();
                }
                var4.field1889 += var5;
            } while (var4.field1889 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("fh.d(JLjava/lang/String;I)I")
    public static final int method3181(long arg0, String arg1) {
        Random var3 = new Random();
        class111 var4 = new class111(128);
        class111 var5 = new class111(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2213(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2216(var3.nextInt());
        }
        var4.method2216(var6[0]);
        var4.method2216(var6[1]);
        var4.method2258(arg0);
        var4.method2258(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2216(var3.nextInt());
        }
        var4.method2248(field145, field141);
        var5.method2213(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2216(var3.nextInt());
        }
        var5.method2258(var3.nextLong());
        var5.method2217(var3.nextLong());
        Statics.method1449(var5);
        var5.method2258(var3.nextLong());
        var5.method2248(field145, field141);
        int var10 = class111.method2148(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class111 var11 = new class111(var10);
        var11.method2219(arg1);
        var11.field1889 = var10;
        var11.method2244(var6);
        class111 var12 = new class111(var11.field1889 + var5.field1889 + var4.field1889 + 5);
        var12.method2213(2);
        var12.method2213(var4.field1889);
        var12.method2294(var4.field1888, 0, var4.field1889);
        var12.method2213(var5.field1889);
        var12.method2294(var5.field1888, 0, var5.field1889);
        var12.method2214(var11.field1889);
        var12.method2294(var11.field1888, 0, var11.field1889);
        byte[] var13 = var12.field1888;
        String var14 = class152.method2160(var13, 0, var13.length);
        String var15 = var14;
        try {
            URL var16 = new URL(client.method604("services", false) + "m=accountappeal/login.ws");
            URLConnection var17 = var16.openConnection();
            var17.setDoInput(true);
            var17.setDoOutput(true);
            var17.setConnectTimeout(5000);
            OutputStreamWriter var18 = new OutputStreamWriter(var17.getOutputStream());
            var18.write("data2=" + class217.method1450(var15) + "&dest=" + class217.method1450("passwordchoice.ws"));
            var18.flush();
            InputStream var19 = var17.getInputStream();
            class111 var20 = new class111(new byte[1000]);
            do {
                int var21 = var19.read(var20.field1888, var20.field1889, 1000 - var20.field1889);
                if (var21 == -1) {
                    var18.close();
                    var19.close();
                    String var22 = new String(var20.field1888);
                    if (var22.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var22.startsWith("WRONG")) {
                        return 7;
                    } else if (var22.startsWith("RELOAD")) {
                        return 3;
                    } else if (var22.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var20.method2245(var6);
                        while (var20.field1889 > 0 && var20.field1888[var20.field1889 - 1] == 0) {
                            var20.field1889--;
                        }
                        String var23 = new String(var20.field1888, 0, var20.field1889);
                        boolean var24;
                        if (var23 == null) {
                            var24 = false;
                        } else {
                            label73: {
                                try {
                                    new URL(var23);
                                } catch (MalformedURLException var27) {
                                    var24 = false;
                                    break label73;
                                }
                                var24 = true;
                            }
                        }
                        if (var24) {
                            class130.method133(var23, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var20.field1889 += var21;
            } while (var20.field1889 < 1000);
            return 5;
        } catch (Throwable var28) {
            var28.printStackTrace();
            return 5;
        }
    }
}
