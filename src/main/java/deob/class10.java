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

    @ObfuscatedName("h.j")
    public static final BigInteger field151 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("h.k")
    public static final BigInteger field147 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class10() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.n(JLjava/lang/String;B)I")
    public static final int method2(long arg0, String arg1) {
        Random var3 = new Random();
        class119 var4 = new class119(128);
        class119 var5 = new class119(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2323(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2326(var3.nextInt());
        }
        var4.method2326(var6[0]);
        var4.method2326(var6[1]);
        var4.method2350(arg0);
        var4.method2350(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2326(var3.nextInt());
        }
        var4.method2355(field151, field147);
        var5.method2323(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2326(var3.nextInt());
        }
        var5.method2350(var3.nextLong());
        var5.method2327(var3.nextLong());
        class149.method2689(var5);
        var5.method2350(var3.nextLong());
        var5.method2355(field151, field147);
        int var10 = class119.method2648(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class119 var11 = new class119(var10);
        var11.method2329(arg1);
        var11.field1977 = var10;
        var11.method2354(var6);
        class119 var12 = new class119(var11.field1977 + var5.field1977 + var4.field1977 + 5);
        var12.method2323(2);
        var12.method2323(var4.field1977);
        var12.method2425(var4.field1981, 0, var4.field1977);
        var12.method2323(var5.field1977);
        var12.method2425(var5.field1981, 0, var5.field1977);
        var12.method2324(var11.field1977);
        var12.method2425(var11.field1981, 0, var11.field1977);
        byte[] var13 = var12.field1981;
        int var14 = var13.length;
        StringBuilder var15 = new StringBuilder();
        for (int var16 = 0; var16 < var14; var16 += 3) {
            int var17 = var13[var16] & 0xFF;
            var15.append(class161.field2622[var17 >>> 2]);
            if (var16 < var14 - 1) {
                int var18 = var13[var16 + 1] & 0xFF;
                var15.append(class161.field2622[(var17 & 0x3) << 4 | var18 >>> 4]);
                if (var16 < var14 - 2) {
                    int var19 = var13[var16 + 2] & 0xFF;
                    var15.append(class161.field2622[(var18 & 0xF) << 2 | var19 >>> 6]).append(class161.field2622[var19 & 0x3F]);
                } else {
                    var15.append(class161.field2622[(var18 & 0xF) << 2]).append("=");
                }
            } else {
                var15.append(class161.field2622[(var17 & 0x3) << 4]).append("==");
            }
        }
        String var20 = var15.toString();
        String var22 = var20;
        try {
            URL var23 = new URL(client.method107("services", false) + "m=accountappeal/login.ws");
            URLConnection var24 = var23.openConnection();
            var24.setDoInput(true);
            var24.setDoOutput(true);
            var24.setConnectTimeout(5000);
            OutputStreamWriter var25 = new OutputStreamWriter(var24.getOutputStream());
            var25.write("data2=" + class226.method600(var22) + "&dest=" + class226.method600("passwordchoice.ws"));
            var25.flush();
            InputStream var26 = var24.getInputStream();
            class119 var27 = new class119(new byte[1000]);
            do {
                int var28 = var26.read(var27.field1981, var27.field1977, 1000 - var27.field1977);
                if (var28 == -1) {
                    var25.close();
                    var26.close();
                    String var29 = new String(var27.field1981);
                    if (var29.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var29.startsWith("WRONG")) {
                        return 7;
                    } else if (var29.startsWith("RELOAD")) {
                        return 3;
                    } else if (var29.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var27.method2390(var6);
                        while (var27.field1977 > 0 && var27.field1981[var27.field1977 - 1] == 0) {
                            var27.field1977--;
                        }
                        String var30 = new String(var27.field1981, 0, var27.field1977);
                        boolean var31;
                        if (var30 == null) {
                            var31 = false;
                        } else {
                            label87: {
                                try {
                                    new URL(var30);
                                } catch (MalformedURLException var34) {
                                    var31 = false;
                                    break label87;
                                }
                                var31 = true;
                            }
                        }
                        if (var31) {
                            class138.method932(var30, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var27.field1977 += var28;
            } while (var27.field1977 < 1000);
            return 5;
        } catch (Throwable var35) {
            var35.printStackTrace();
            return 5;
        }
    }
}
