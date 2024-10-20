package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("d")
public class class10 {

    @ObfuscatedName("d.a")
    public static final BigInteger field164 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("d.s")
    public static final BigInteger field157 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bo.i(JLjava/lang/String;I)I")
    public static final int method1447(long arg0, String arg1) {
        Random var3 = new Random();
        class119 var4 = new class119(128);
        class119 var5 = new class119(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2296(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2299(var3.nextInt());
        }
        var4.method2299(var6[0]);
        var4.method2299(var6[1]);
        var4.method2301(arg0);
        var4.method2301(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2299(var3.nextInt());
        }
        var4.method2330(field164, field157);
        var5.method2296(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2299(var3.nextInt());
        }
        var5.method2301(var3.nextLong());
        var5.method2504(var3.nextLong());
        class149.method2295(var5);
        var5.method2301(var3.nextLong());
        var5.method2330(field164, field157);
        int var10 = class119.method3638(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class119 var11 = new class119(var10);
        var11.method2302(arg1);
        var11.field1984 = var10;
        var11.method2342(var6);
        class119 var12 = new class119(var11.field1984 + var5.field1984 + var4.field1984 + 5);
        var12.method2296(2);
        var12.method2296(var4.field1984);
        var12.method2305(var4.field1988, 0, var4.field1984);
        var12.method2296(var5.field1984);
        var12.method2305(var5.field1988, 0, var5.field1984);
        var12.method2381(var11.field1984);
        var12.method2305(var11.field1988, 0, var11.field1984);
        String var13 = class161.method947(var12.field1988);
        try {
            URL var14 = new URL(client.method1914("services", false) + "m=accountappeal/login.ws");
            URLConnection var15 = var14.openConnection();
            var15.setDoInput(true);
            var15.setDoOutput(true);
            var15.setConnectTimeout(5000);
            OutputStreamWriter var16 = new OutputStreamWriter(var15.getOutputStream());
            var16.write("data2=" + class226.method3200(var13) + "&dest=" + class226.method3200("passwordchoice.ws"));
            var16.flush();
            InputStream var17 = var15.getInputStream();
            class119 var18 = new class119(new byte[1000]);
            do {
                int var19 = var17.read(var18.field1988, var18.field1984, 1000 - var18.field1984);
                if (var19 == -1) {
                    var16.close();
                    var17.close();
                    String var20 = new String(var18.field1988);
                    if (var20.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var20.startsWith("WRONG")) {
                        return 7;
                    } else if (var20.startsWith("RELOAD")) {
                        return 3;
                    } else if (var20.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var18.method2327(var6);
                        while (var18.field1984 > 0 && var18.field1988[var18.field1984 - 1] == 0) {
                            var18.field1984--;
                        }
                        String var21 = new String(var18.field1988, 0, var18.field1984);
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
                            class138.method712(var21, true, "openjs", false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var18.field1984 += var19;
            } while (var18.field1984 < 1000);
            return 5;
        } catch (Throwable var26) {
            var26.printStackTrace();
            return 5;
        }
    }
}
