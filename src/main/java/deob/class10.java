package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("w")
public class class10 {

    @ObfuscatedName("w.g")
    public static final BigInteger field156 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("w.m")
    public static final BigInteger field149 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ee.l(JLjava/lang/String;B)I")
    public static final int method2942(long arg0, String arg1) {
        Random var3 = new Random();
        class119 var4 = new class119(128);
        class119 var5 = new class119(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2503(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2376(var3.nextInt());
        }
        var4.method2376(var6[0]);
        var4.method2376(var6[1]);
        var4.method2378(arg0);
        var4.method2378(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2376(var3.nextInt());
        }
        var4.method2408(field156, field149);
        var5.method2503(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2376(var3.nextInt());
        }
        var5.method2378(var3.nextLong());
        var5.method2377(var3.nextLong());
        class149.method937(var5);
        var5.method2378(var3.nextLong());
        var5.method2408(field156, field149);
        int var10 = class119.method156(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class119 var11 = new class119(var10);
        var11.method2379(arg1);
        var11.field1988 = var10;
        var11.method2457(var6);
        class119 var12 = new class119(var11.field1988 + var5.field1988 + var4.field1988 + 5);
        var12.method2503(2);
        var12.method2503(var4.field1988);
        var12.method2420(var4.field1986, 0, var4.field1988);
        var12.method2503(var5.field1988);
        var12.method2420(var5.field1986, 0, var5.field1988);
        var12.method2374(var11.field1988);
        var12.method2420(var11.field1986, 0, var11.field1988);
        byte[] var13 = var12.field1986;
        String var14 = class161.method192(var13, 0, var13.length);
        String var15 = var14;
        try {
            URL var16 = new URL(client.method2918("services", false) + "m=accountappeal/login.ws");
            URLConnection var17 = var16.openConnection();
            var17.setDoInput(true);
            var17.setDoOutput(true);
            var17.setConnectTimeout(5000);
            OutputStreamWriter var18 = new OutputStreamWriter(var17.getOutputStream());
            var18.write("data2=" + Statics.method2652(var15) + "&dest=" + Statics.method2652("passwordchoice.ws"));
            var18.flush();
            InputStream var19 = var17.getInputStream();
            class119 var20 = new class119(new byte[1000]);
            do {
                int var21 = var19.read(var20.field1986, var20.field1988, 1000 - var20.field1988);
                if (var21 == -1) {
                    var18.close();
                    var19.close();
                    String var22 = new String(var20.field1986);
                    if (var22.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var22.startsWith("WRONG")) {
                        return 7;
                    } else if (var22.startsWith("RELOAD")) {
                        return 3;
                    } else if (var22.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var20.method2405(var6);
                        while (var20.field1988 > 0 && var20.field1986[var20.field1988 - 1] == 0) {
                            var20.field1988--;
                        }
                        String var23 = new String(var20.field1986, 0, var20.field1988);
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
                            class138.method2770(var23, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var20.field1988 += var21;
            } while (var20.field1988 < 1000);
            return 5;
        } catch (Throwable var28) {
            var28.printStackTrace();
            return 5;
        }
    }
}
