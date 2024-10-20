package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("m")
public class class10 {

    @ObfuscatedName("m.y")
    public static final BigInteger field161 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("m.k")
    public static final BigInteger field162 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("de.a(JLjava/lang/String;B)I")
    public static final int method2355(long arg0, String arg1) {
        Random var3 = new Random();
        class120 var4 = new class120(128);
        class120 var5 = new class120(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2452(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2635(var3.nextInt());
        }
        var4.method2635(var6[0]);
        var4.method2635(var6[1]);
        var4.method2565(arg0);
        var4.method2565(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2635(var3.nextInt());
        }
        var4.method2482(field161, field162);
        var5.method2452(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2635(var3.nextInt());
        }
        var5.method2565(var3.nextLong());
        var5.method2534(var3.nextLong());
        byte[] var10 = new byte[24];
        try {
            class150.field2235.method3954(0L);
            class150.field2235.method3956(var10);
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
        var5.method2456(var10, 0, 24);
        var5.method2565(var3.nextLong());
        var5.method2482(field161, field162);
        int var14 = class120.method2241(arg1);
        if (var14 % 8 != 0) {
            var14 += 8 - var14 % 8;
        }
        class120 var15 = new class120(var14);
        var15.method2543(arg1);
        var15.field1993 = var14;
        var15.method2655(var6);
        class120 var16 = new class120(var15.field1993 + var5.field1993 + var4.field1993 + 5);
        var16.method2452(2);
        var16.method2452(var4.field1993);
        var16.method2456(var4.field1994, 0, var4.field1993);
        var16.method2452(var5.field1993);
        var16.method2456(var5.field1994, 0, var5.field1993);
        var16.method2448(var15.field1993);
        var16.method2456(var15.field1994, 0, var15.field1993);
        String var17 = class162.method826(var16.field1994);
        try {
            URL var18 = new URL(client.method213("services", false) + "m=accountappeal/login.ws");
            URLConnection var19 = var18.openConnection();
            var19.setDoInput(true);
            var19.setDoOutput(true);
            var19.setConnectTimeout(5000);
            OutputStreamWriter var20 = new OutputStreamWriter(var19.getOutputStream());
            var20.write("data2=" + Statics.method1870(var17) + "&dest=" + Statics.method1870("passwordchoice.ws"));
            var20.flush();
            InputStream var21 = var19.getInputStream();
            class120 var22 = new class120(new byte[1000]);
            do {
                int var23 = var21.read(var22.field1994, var22.field1993, 1000 - var22.field1993);
                if (var23 == -1) {
                    var20.close();
                    var21.close();
                    String var24 = new String(var22.field1994);
                    if (var24.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var24.startsWith("WRONG")) {
                        return 7;
                    } else if (var24.startsWith("RELOAD")) {
                        return 3;
                    } else if (var24.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var22.method2503(var6);
                        while (var22.field1993 > 0 && var22.field1994[var22.field1993 - 1] == 0) {
                            var22.field1993--;
                        }
                        String var25 = new String(var22.field1994, 0, var22.field1993);
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
                            class139.method665(var25, true, "openjs", false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var22.field1993 += var23;
            } while (var22.field1993 < 1000);
            return 5;
        } catch (Throwable var30) {
            var30.printStackTrace();
            return 5;
        }
    }
}
