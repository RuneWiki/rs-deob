package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("b")
public class class10 {

    @ObfuscatedName("b.f")
    public static final BigInteger field172 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("b.g")
    public static final BigInteger field163 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.h(JLjava/lang/String;I)I")
    public static final int method2286(long arg0, String arg1) {
        Random var3 = new Random();
        class119 var4 = new class119(128);
        class119 var5 = new class119(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2499(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2556(var3.nextInt());
        }
        var4.method2556(var6[0]);
        var4.method2556(var6[1]);
        var4.method2402(arg0);
        var4.method2402(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2556(var3.nextInt());
        }
        var4.method2403(field172, field163);
        var5.method2499(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2556(var3.nextInt());
        }
        var5.method2402(var3.nextLong());
        var5.method2406(var3.nextLong());
        class149.method889(var5);
        var5.method2402(var3.nextLong());
        var5.method2403(field172, field163);
        int var10 = class119.method2072(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class119 var11 = new class119(var10);
        var11.method2374(arg1);
        var11.field1973 = var10;
        var11.method2578(var6);
        class119 var12 = new class119(var11.field1973 + var5.field1973 + var4.field1973 + 5);
        var12.method2499(2);
        var12.method2499(var4.field1973);
        var12.method2377(var4.field1978, 0, var4.field1973);
        var12.method2499(var5.field1973);
        var12.method2377(var5.field1978, 0, var5.field1973);
        var12.method2369(var11.field1973);
        var12.method2377(var11.field1978, 0, var11.field1973);
        byte[] var13 = var12.field1978;
        String var14 = class161.method910(var13, 0, var13.length);
        String var15 = var14;
        try {
            URL var16 = new URL(client.method955("services", false) + "m=accountappeal/login.ws");
            URLConnection var17 = var16.openConnection();
            var17.setDoInput(true);
            var17.setDoOutput(true);
            var17.setConnectTimeout(5000);
            OutputStreamWriter var18 = new OutputStreamWriter(var17.getOutputStream());
            var18.write("data2=" + class226.method2076(var15) + "&dest=" + class226.method2076("passwordchoice.ws"));
            var18.flush();
            InputStream var19 = var17.getInputStream();
            class119 var20 = new class119(new byte[1000]);
            do {
                int var21 = var19.read(var20.field1978, var20.field1973, 1000 - var20.field1973);
                if (var21 == -1) {
                    var18.close();
                    var19.close();
                    String var22 = new String(var20.field1978);
                    if (var22.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var22.startsWith("WRONG")) {
                        return 7;
                    } else if (var22.startsWith("RELOAD")) {
                        return 3;
                    } else if (var22.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var20.method2501(var6);
                        while (var20.field1973 > 0 && var20.field1978[var20.field1973 - 1] == 0) {
                            var20.field1973--;
                        }
                        String var23 = new String(var20.field1978, 0, var20.field1973);
                        if (!method2169(var23)) {
                            return 5;
                        }
                        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                            try {
                                Desktop.getDesktop().browse(new URI(var23));
                                return 2;
                            } catch (Exception var26) {
                            }
                        }
                        if (class138.field2120.startsWith("win")) {
                            Statics.method764(var23, 0);
                        } else if (class138.field2120.startsWith("mac")) {
                            class138.method1054(var23, 1, "openjs");
                        } else {
                            Statics.method764(var23, 2);
                        }
                        return 2;
                    }
                }
                var20.field1973 += var21;
            } while (var20.field1973 < 1000);
            return 5;
        } catch (Throwable var27) {
            var27.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("cw.q(Ljava/lang/String;B)Z")
    public static boolean method2169(String arg0) {
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
