package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("y")
public class class102 {

    @ObfuscatedName("y.e")
    public static int[] field1428 = new int[256];

    @ObfuscatedName("y.c")
    public static int field1417 = 0;

    @ObfuscatedName("y.n")
    public static int field1411 = 0;

    @ObfuscatedName("y.v")
    public static int field1413 = 0;

    @ObfuscatedName("y.u")
    public static int field1412 = 0;

    @ObfuscatedName("y.bw")
    public static int[] field1431 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("y.bu")
    public static int field1432 = -1;

    @ObfuscatedName("y.bj")
    public static int[] field1415 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("y.ay")
    public static int field1429 = 0;

    @ObfuscatedName("y.as")
    public static int field1426 = 0;

    @ObfuscatedName("y.ar")
    public static String field1422 = "";

    @ObfuscatedName("y.aq")
    public static String field1419 = "";

    @ObfuscatedName("y.ax")
    public static int field1405 = 0;

    @ObfuscatedName("y.aw")
    public static int field1414 = 10;

    @ObfuscatedName("y.av")
    public static String field1409 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("y.ak")
    public static int field1420 = 0;

    @ObfuscatedName("y.ai")
    public static String field1423 = "";

    @ObfuscatedName("y.ap")
    public static boolean field1410 = false;

    @ObfuscatedName("y.ac")
    public static int field1399 = 0;

    @ObfuscatedName("y.ad")
    public static String field1425 = "";

    @ObfuscatedName("y.ab")
    public static String field1434 = "";

    @ObfuscatedName("y.ah")
    public static String field1424 = "";

    public class102() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("b.b(Ljava/awt/Component;Lek;Lek;I)V")
    public static void method1093(Component arg0, class89 arg1, class89 arg2) {
        if (Statics.field1418) {
            return;
        }
        class146.method2441();
        byte[] var3 = arg1.method1288("title.jpg", "");
        Statics.field1427 = new class156(var3, arg0);
        Statics.field1311 = Statics.field1427.method2581();
        Statics.field1404 = class150.method2347(arg2, "logo", "");
        Statics.field1400 = class150.method2347(arg2, "titlebox", "");
        Statics.field1401 = class150.method2347(arg2, "titlebutton", "");
        Statics.field1421 = class150.method2857(arg2, "runes", "");
        Statics.field1890 = class150.method2857(arg2, "title_mute", "");
        Statics.field2111 = new int[256];
        for (int var4 = 0; var4 < 64; var4++) {
            Statics.field2111[var4] = var4 * 262144;
        }
        for (int var5 = 0; var5 < 64; var5++) {
            Statics.field2111[var5 + 64] = var5 * 1024 + 16711680;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            Statics.field2111[var6 + 128] = var6 * 4 + 16776960;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            Statics.field2111[var7 + 192] = 16777215;
        }
        Statics.field1408 = new int[256];
        for (int var8 = 0; var8 < 64; var8++) {
            Statics.field1408[var8] = var8 * 1024;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            Statics.field1408[var9 + 64] = var9 * 4 + 65280;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            Statics.field1408[var10 + 128] = var10 * 262144 + 65535;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            Statics.field1408[var11 + 192] = 16777215;
        }
        Statics.field1402 = new int[256];
        for (int var12 = 0; var12 < 64; var12++) {
            Statics.field1402[var12] = var12 * 4;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            Statics.field1402[var13 + 64] = var13 * 262144 + 255;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            Statics.field1402[var14 + 128] = var14 * 1024 + 16711935;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            Statics.field1402[var15 + 192] = 16777215;
        }
        Statics.field1430 = new int[256];
        Statics.field1403 = new int[32768];
        Statics.field419 = new int[32768];
        method2389((class148) null);
        Statics.field723 = new int[32768];
        Statics.field19 = new int[32768];
        field1420 = 0;
        field1424 = "";
        field1425 = "";
        field1410 = false;
        if (Statics.field1898.field582) {
            class97.field1365 = 1;
            Statics.field938 = null;
            Statics.field1366 = -1;
            Statics.field701 = -1;
            Statics.field1367 = 0;
            Statics.field2144 = false;
            Statics.field1368 = 2;
        } else {
            class34 var16 = Statics.field1383;
            int var17 = var16.method1283("scape main");
            int var18 = var16.method1282(var17, "");
            class97.method2371(2, var16, var17, var18, 255, false);
        }
        class79.method1151(false);
        Statics.field1418 = true;
        Statics.field1427.method2589(0, 0);
        Statics.field1311.method2589(382, 0);
        Statics.field1404.method2463(382 - Statics.field1404.field2239 / 2, 18);
    }

    @ObfuscatedName("h.d(IIII)I")
    public static final int method1189(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("ep.w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method1381(String arg0, String arg1, String arg2) {
        field1434 = arg0;
        field1422 = arg1;
        field1423 = arg2;
    }

    @ObfuscatedName("eo.j(IIB)V")
    public static void method1390(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1415[var5] != arg0) {
                var2[var4] = field1415[var5];
                var3[var4] = field1431[var5];
                var4++;
            }
        }
        field1415 = var2;
        field1431 = var3;
        method2001(Statics.field644, 0, Statics.field644.length - 1, field1415, field1431);
    }

    @ObfuscatedName("x.s(B)V")
    public static void method1461() {
        try {
            if (Statics.field2122 == null) {
                Statics.field2122 = new class70(Statics.field1999, new URL(Statics.field2178));
            } else {
                byte[] var0 = Statics.field2122.method1144();
                if (var0 != null) {
                    class50 var1 = new class50(var0);
                    field1429 = var1.method720();
                    Statics.field644 = new class68[field1429];
                    int var2 = 0;
                    while (var2 < field1429) {
                        class68 var3 = Statics.field644[var2] = new class68();
                        int var4 = var1.method720();
                        var3.field749 = var4 & 0x7FFF;
                        var3.field747 = (var4 & 0x8000) != 0;
                        var3.field745 = var1.method688();
                        var3.field741 = var1.method688();
                        var3.field744 = var1.method726();
                        var3.field742 = var1.method683();
                        var3.field746 = var2++;
                    }
                    method2001(Statics.field644, 0, Statics.field644.length - 1, field1415, field1431);
                    field1410 = true;
                    Statics.field2122 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field2122 = null;
        }
    }

    @ObfuscatedName("bv.x([Lo;II[I[II)V")
    public static void method2001(class68[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class68 var8 = arg0[var7];
        arg0[var7] = arg0[arg1];
        arg0[arg1] = var8;
        while (var5 < var6) {
            boolean var9 = true;
            do {
                var6--;
                for (int var10 = 0; var10 < 4; var10++) {
                    int var11;
                    int var12;
                    if (arg3[var10] == 2) {
                        var11 = arg0[var6].field746;
                        var12 = var8.field746;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field742;
                        var12 = var8.field742;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field747 ? 1 : 0;
                        var12 = var8.field747 ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field749;
                        var12 = var8.field749;
                    }
                    if (var11 != var12) {
                        if ((arg4[var10] != 1 || var11 <= var12) && (arg4[var10] != 0 || var11 >= var12)) {
                            var9 = false;
                        }
                        break;
                    }
                    if (var10 == 3) {
                        var9 = false;
                    }
                }
            } while (var9);
            boolean var13 = true;
            do {
                var5++;
                for (int var14 = 0; var14 < 4; var14++) {
                    int var15;
                    int var16;
                    if (arg3[var14] == 2) {
                        var15 = arg0[var5].field746;
                        var16 = var8.field746;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field742;
                        var16 = var8.field742;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field747 ? 1 : 0;
                        var16 = var8.field747 ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field749;
                        var16 = var8.field749;
                    }
                    if (var15 != var16) {
                        if ((arg4[var14] != 1 || var15 >= var16) && (arg4[var14] != 0 || var15 <= var16)) {
                            var13 = false;
                        }
                        break;
                    }
                    if (var14 == 3) {
                        var13 = false;
                    }
                }
            } while (var13);
            if (var5 < var6) {
                class68 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2001(arg0, arg1, var6, arg3, arg4);
        method2001(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("cq.t(Lcm;I)V")
    public static final void method2389(class148 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1403.length; var2++) {
            Statics.field1403[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1403[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field419[var8] = (Statics.field1403[var8 - 1] + Statics.field1403[var8 + 1] + Statics.field1403[var8 - 128] + Statics.field1403[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1403;
            Statics.field1403 = Statics.field419;
            Statics.field419 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field2237; var11++) {
            for (int var12 = 0; var12 < arg0.field2239; var12++) {
                if (arg0.field2244[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field2241;
                    int var14 = var11 + 16 + arg0.field2242;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1403[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ar.h(Lbf;B)V")
    public static void method2868(class125 arg0) {
        if (field1410) {
            method2977(arg0);
            return;
        }
        if (class108.field1807 == 1 && class108.field1808 >= 715 && class108.field1809 >= 453) {
            Statics.field1898.field582 = !Statics.field1898.field582;
            class56.method3354();
            if (Statics.field1898.field582) {
                Statics.field47.method1004();
                class97.field1365 = 1;
                Statics.field938 = null;
            } else {
                class34 var1 = Statics.field1383;
                int var2 = var1.method1283("scape main");
                int var3 = var1.method1282(var2, "");
                class97.method2017(var1, var2, var3, 255, false);
            }
        }
        if (client.field1539 == 5) {
            return;
        }
        field1399++;
        if (client.field1539 != 10) {
            return;
        }
        if (client.field1538 == 0) {
            if (class108.field1807 == 1) {
                byte var4 = 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class108.field1808 >= var4 && class108.field1808 <= var4 + var6 && class108.field1809 >= var5 && class108.field1809 <= var5 + var7) {
                    method1461();
                    return;
                }
            }
            if (Statics.field2122 != null) {
                method1461();
            }
        }
        int var8 = class108.field1807;
        int var9 = class108.field1808;
        int var10 = class108.field1809;
        if (field1420 == 0) {
            short var11 = 302;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                field1420 = 3;
                field1426 = 0;
            }
            short var13 = 462;
            if (var8 == 1 && var9 >= var13 - 75 && var9 <= var13 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                field1434 = class85.field1182;
                field1422 = class85.field1183;
                field1423 = class85.field1203;
                field1420 = 2;
                field1426 = 0;
            }
        } else if (field1420 == 2) {
            short var14 = 231;
            int var26 = var14 + 30;
            if (var8 == 1 && var10 >= var26 - 15 && var10 < var26) {
                field1426 = 0;
            }
            var26 += 15;
            if (var8 == 1 && var10 >= var26 - 15 && var10 < var26) {
                field1426 = 1;
            }
            var26 += 15;
            short var15 = 302;
            short var16 = 321;
            if (var8 == 1 && var9 >= var15 - 75 && var9 <= var15 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field1424 = field1424.trim();
                if (field1424.length() == 0) {
                    method1381(class85.field1041, class85.field1093, class85.field1094);
                    return;
                }
                if (field1425.length() == 0) {
                    method1381(class85.field1095, class85.field1096, class85.field1097);
                    return;
                }
                method1381(class85.field1185, class85.field1186, class85.field1125);
                client.method897(20);
                return;
            }
            short var17 = 462;
            if (var8 == 1 && var9 >= var17 - 75 && var9 <= var17 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field1420 = 0;
                field1424 = "";
                field1425 = "";
            }
            while (true) {
                while (true) {
                    class113 var18 = class113.field1865;
                    boolean var19;
                    synchronized (class113.field1865) {
                        if (class113.field1884 == class113.field1868) {
                            var19 = false;
                        } else {
                            Statics.field1444 = class113.field1881[class113.field1884];
                            Statics.field2265 = class113.field1880[class113.field1884];
                            class113.field1884 = class113.field1884 + 1 & 0x7F;
                            var19 = true;
                        }
                    }
                    if (!var19) {
                        return;
                    }
                    boolean var21 = false;
                    for (int var22 = 0; var22 < field1409.length(); var22++) {
                        if (Statics.field2265 == field1409.charAt(var22)) {
                            var21 = true;
                            break;
                        }
                    }
                    if (field1426 == 0) {
                        if (Statics.field1444 == 85 && field1424.length() > 0) {
                            field1424 = field1424.substring(0, field1424.length() - 1);
                        }
                        if (Statics.field1444 == 84 || Statics.field1444 == 80) {
                            field1426 = 1;
                        }
                        if (var21 && field1424.length() < 320) {
                            field1424 = field1424 + Statics.field2265;
                        }
                    } else if (field1426 == 1) {
                        if (Statics.field1444 == 85 && field1425.length() > 0) {
                            field1425 = field1425.substring(0, field1425.length() - 1);
                        }
                        if (Statics.field1444 == 84 || Statics.field1444 == 80) {
                            field1426 = 0;
                        }
                        if (Statics.field1444 == 84) {
                            field1424 = field1424.trim();
                            if (field1424.length() == 0) {
                                method1381(class85.field1041, class85.field1093, class85.field1094);
                                return;
                            }
                            if (field1425.length() == 0) {
                                method1381(class85.field1095, class85.field1096, class85.field1097);
                                return;
                            }
                            method1381(class85.field1185, class85.field1186, class85.field1125);
                            client.method897(20);
                            return;
                        }
                        if (var21 && field1425.length() < 20) {
                            field1425 = field1425 + Statics.field2265;
                        }
                    }
                }
            }
        } else if (field1420 == 3) {
            short var23 = 382;
            short var24 = 321;
            if (var8 == 1 && var9 >= var23 - 75 && var9 <= var23 + 75 && var10 >= var24 - 20 && var10 <= var24 + 20) {
                field1420 = 0;
            }
        }
    }

    @ObfuscatedName("ak.f(Lbf;I)V")
    public static void method2977(class125 arg0) {
        if (class108.field1807 != 1) {
            return;
        }
        short var1 = 280;
        if (class108.field1808 >= var1 && class108.field1808 <= var1 + 14 && class108.field1809 >= 4 && class108.field1809 <= 18) {
            method1390(0, 0);
            return;
        }
        if (class108.field1808 >= var1 + 15 && class108.field1808 <= var1 + 80 && class108.field1809 >= 4 && class108.field1809 <= 18) {
            method1390(0, 1);
            return;
        }
        short var2 = 390;
        if (class108.field1808 >= var2 && class108.field1808 <= var2 + 14 && class108.field1809 >= 4 && class108.field1809 <= 18) {
            method1390(1, 0);
            return;
        }
        if (class108.field1808 >= var2 + 15 && class108.field1808 <= var2 + 80 && class108.field1809 >= 4 && class108.field1809 <= 18) {
            method1390(1, 1);
            return;
        }
        short var3 = 500;
        if (class108.field1808 >= var3 && class108.field1808 <= var3 + 14 && class108.field1809 >= 4 && class108.field1809 <= 18) {
            method1390(2, 0);
            return;
        }
        if (class108.field1808 >= var3 + 15 && class108.field1808 <= var3 + 80 && class108.field1809 >= 4 && class108.field1809 <= 18) {
            method1390(2, 1);
            return;
        }
        short var4 = 610;
        if (class108.field1808 >= var4 && class108.field1808 <= var4 + 14 && class108.field1809 >= 4 && class108.field1809 <= 18) {
            method1390(3, 0);
            return;
        }
        if (class108.field1808 >= var4 + 15 && class108.field1808 <= var4 + 80 && class108.field1809 >= 4 && class108.field1809 <= 18) {
            method1390(3, 1);
            return;
        }
        if (class108.field1808 >= 708 && class108.field1809 >= 4 && class108.field1808 <= 758 && class108.field1809 <= 20) {
            field1410 = false;
            Statics.field1427.method2589(0, 0);
            Statics.field1311.method2589(382, 0);
            Statics.field1404.method2463(382 - Statics.field1404.field2239 / 2, 18);
            return;
        }
        if (field1432 == -1) {
            return;
        }
        class68 var5 = Statics.field644[field1432];
        if (client.field1675 != var5.field747) {
            client.field1675 = var5.field747;
            class176.method3376(var5.field747);
        }
        Statics.field584 = var5.field745;
        client.field1533 = var5.field749;
        Statics.field2019 = client.field1781 == 0 ? 43594 : var5.field749 + 40000;
        Statics.field962 = client.field1781 == 0 ? 443 : var5.field749 + 50000;
        Statics.field1858 = Statics.field2019;
        field1410 = false;
        Statics.field1427.method2589(0, 0);
        Statics.field1311.method2589(382, 0);
        Statics.field1404.method2463(382 - Statics.field1404.field2239 / 2, 18);
        return;
    }

    @ObfuscatedName("ai.l(Lgk;Lgk;B)V")
    public static void method3022(class23 arg0, class23 arg1) {
        if (Statics.field512 == null) {
            Statics.field512 = Statics.method2864(Statics.field344, "sl_back", "");
        }
        if (Statics.field2516 == null) {
            Statics.field2516 = class150.method2857(Statics.field344, "sl_flags", "");
        }
        if (Statics.field2079 == null) {
            Statics.field2079 = class150.method2857(Statics.field344, "sl_arrows", "");
        }
        if (Statics.field1433 == null) {
            Statics.field1433 = class150.method2857(Statics.field344, "sl_stars", "");
        }
        class146.method2400(0, 23, 765, 480, 0);
        class146.method2429(0, 0, 125, 23, 12425273, 9135624);
        class146.method2429(125, 0, 640, 23, 5197647, 2697513);
        arg0.method302(class85.field1200, 62, 15, 0, -1);
        if (Statics.field1433 != null) {
            Statics.field1433[1].method2463(140, 1);
            arg1.method286(class85.field1160, 152, 10, 16777215, -1);
            Statics.field1433[0].method2463(140, 12);
            arg1.method286(class85.field1002, 152, 21, 16777215, -1);
        }
        if (Statics.field2079 != null) {
            short var2 = 280;
            if (field1415[0] == 0 && field1431[0] == 0) {
                Statics.field2079[2].method2463(var2, 4);
            } else {
                Statics.field2079[0].method2463(var2, 4);
            }
            if (field1415[0] == 0 && field1431[0] == 1) {
                Statics.field2079[3].method2463(var2 + 15, 4);
            } else {
                Statics.field2079[1].method2463(var2 + 15, 4);
            }
            arg0.method286(class85.field1009, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field1415[0] == 1 && field1431[0] == 0) {
                Statics.field2079[2].method2463(var3, 4);
            } else {
                Statics.field2079[0].method2463(var3, 4);
            }
            if (field1415[0] == 1 && field1431[0] == 1) {
                Statics.field2079[3].method2463(var3 + 15, 4);
            } else {
                Statics.field2079[1].method2463(var3 + 15, 4);
            }
            arg0.method286(class85.field1187, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field1415[0] == 2 && field1431[0] == 0) {
                Statics.field2079[2].method2463(var4, 4);
            } else {
                Statics.field2079[0].method2463(var4, 4);
            }
            if (field1415[0] == 2 && field1431[0] == 1) {
                Statics.field2079[3].method2463(var4 + 15, 4);
            } else {
                Statics.field2079[1].method2463(var4 + 15, 4);
            }
            arg0.method286(class85.field1184, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field1415[0] == 3 && field1431[0] == 0) {
                Statics.field2079[2].method2463(var5, 4);
            } else {
                Statics.field2079[0].method2463(var5, 4);
            }
            if (field1415[0] == 3 && field1431[0] == 1) {
                Statics.field2079[3].method2463(var5 + 15, 4);
            } else {
                Statics.field2079[1].method2463(var5 + 15, 4);
            }
            arg0.method286(class85.field1206, var5 + 32, 17, 16777215, -1);
        }
        class146.method2400(708, 4, 50, 16, 0);
        arg1.method302(class85.field1194, 733, 16, 16777215, -1);
        field1432 = -1;
        if (Statics.field512 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field1429) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field1429) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field1429) {
                    var9--;
                }
            } while (var9 != var10 || var8 != var11);
            int var12 = (765 - var6 * var8) / (var8 + 1);
            if (var12 > 5) {
                var12 = 5;
            }
            int var13 = (480 - var7 * var9) / (var9 + 1);
            if (var13 > 5) {
                var13 = 5;
            }
            int var14 = (765 - var6 * var8 - (var8 - 1) * var12) / 2;
            int var15 = (480 - var7 * var9 - (var9 - 1) * var13) / 2;
            int var16 = var15 + 23;
            int var17 = var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < field1429; var20++) {
                class68 var21 = Statics.field644[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field742);
                if (var21.field742 == -1) {
                    var23 = class85.field1077;
                    var22 = false;
                } else if (var21.field742 > 1980) {
                    var23 = class85.field1208;
                    var22 = false;
                }
                if (class108.field1801 >= var17 && class108.field1802 >= var16 && class108.field1801 < var6 + var17 && class108.field1802 < var7 + var16 && var22) {
                    field1432 = var20;
                    Statics.field512[var21.field747 ? 1 : 0].method2597(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field512[var21.field747 ? 1 : 0].method2589(var17, var16);
                }
                if (Statics.field2516 != null) {
                    Statics.field2516[(var21.field747 ? 8 : 0) + var21.field744].method2463(var17 + 29, var16);
                }
                arg0.method302(Integer.toString(var21.field749), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method302(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var24 = arg1.method281(Statics.field644[field1432].field741) + 6;
                int var25 = arg1.field244 + 8;
                class146.method2400(class108.field1801 - var24 / 2, class108.field1802 + 20 + 5, var24, var25, 16777120);
                class146.method2402(class108.field1801 - var24 / 2, class108.field1802 + 20 + 5, var24, var25, 0);
                arg1.method302(Statics.field644[field1432].field741, class108.field1801, class108.field1802 + 20 + 5 + arg1.field244 + 4, 0, -1);
            }
        }
        try {
            Graphics var26 = Statics.field1812.getGraphics();
            Statics.field617.method1475(var26, 0, 0);
        } catch (Exception var28) {
            Statics.field1812.repaint();
        }
    }

    @ObfuscatedName("ap.k(Lgk;Lgk;I)V")
    public static void method3099(class23 arg0, class23 arg1) {
        if (field1410) {
            method3022(arg0, arg1);
            return;
        }
        if (client.field1539 == 0 || client.field1539 == 5) {
            byte var2 = 20;
            arg0.method302(class85.field1011, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class146.method2402(230, var3, 304, 34, 9179409);
            class146.method2402(231, var3 + 1, 302, 32, 0);
            class146.method2400(232, var3 + 2, field1414 * 3, 30, 9179409);
            class146.method2400(field1414 * 3 + 232, var3 + 2, 300 - field1414 * 3, 30, 0);
            arg0.method302(field1419, 382, 276 - var2, 16777215, -1);
        }
        if (client.field1539 == 20) {
            Statics.field1400.method2463(382 - Statics.field1400.field2239 / 2, 271 - Statics.field1400.field2237 / 2);
            short var4 = 211;
            arg0.method302(field1434, 382, var4, 16776960, 0);
            int var89 = var4 + 15;
            arg0.method302(field1422, 382, var89, 16776960, 0);
            int var90 = var89 + 15;
            arg0.method302(field1423, 382, var90, 16776960, 0);
            int var91 = var90 + 15;
            int var92 = var91 + 10;
            arg0.method286(class85.field1130, 272, var92, 16777215, 0);
            short var5 = 200;
            String var6;
            for (var6 = field1424; arg0.method281(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
            }
            arg0.method286(class25.method357(var6), 312, var92, 16777215, 0);
            var89 = var92 + 15;
            String var8 = class85.field1189;
            String var9 = field1425;
            String var10 = class91.method382('*', var9.length());
            arg0.method286(var8 + var10, 274, var89, 16777215, 0);
            var89 += 15;
        }
        if (client.field1539 == 10) {
            Statics.field1400.method2463(202, 171);
            if (field1420 == 0) {
                short var11 = 251;
                arg0.method302(class85.field1190, 382, var11, 16776960, 0);
                int var93 = var11 + 30;
                short var12 = 302;
                short var13 = 291;
                Statics.field1401.method2463(var12 - 73, var13 - 20);
                arg0.method284(class85.field1191, var12 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var14 = 462;
                Statics.field1401.method2463(var14 - 73, var13 - 20);
                arg0.method284(class85.field1192, var14 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1420 == 2) {
                short var15 = 211;
                arg0.method302(field1434, 382, var15, 16776960, 0);
                int var94 = var15 + 15;
                arg0.method302(field1422, 382, var94, 16776960, 0);
                int var95 = var94 + 15;
                arg0.method302(field1423, 382, var95, 16776960, 0);
                int var96 = var95 + 15;
                int var97 = var96 + 10;
                arg0.method286(class85.field1130, 272, var97, 16777215, 0);
                short var16 = 200;
                String var17;
                for (var17 = field1424; arg0.method281(var17) > var16; var17 = var17.substring(1)) {
                }
                arg0.method286(class25.method357(var17) + (field1426 == 0 & client.field1541 % 40 < 20 ? class76.method1092(16776960) + class76.field876 : ""), 312, var97, 16777215, 0);
                var94 = var97 + 15;
                String var19 = class85.field1189;
                String var20 = field1425;
                String var21 = class91.method382('*', var20.length());
                arg0.method286(var19 + var21 + (field1426 == 1 & client.field1541 % 40 < 20 ? class76.method1092(16776960) + class76.field876 : ""), 274, var94, 16777215, 0);
                var94 += 15;
                short var22 = 302;
                short var23 = 321;
                Statics.field1401.method2463(var22 - 73, var23 - 20);
                arg0.method302(class85.field1193, var22, var23 + 5, 16777215, 0);
                short var24 = 462;
                Statics.field1401.method2463(var24 - 73, var23 - 20);
                arg0.method302(class85.field1194, var24, var23 + 5, 16777215, 0);
            } else if (field1420 == 3) {
                arg0.method302(class85.field1195, 382, 211, 16776960, 0);
                short var25 = 236;
                arg0.method302(class85.field1042, 382, var25, 16777215, 0);
                int var98 = var25 + 15;
                arg0.method302(class85.field1197, 382, var98, 16777215, 0);
                int var99 = var98 + 15;
                arg0.method302(class85.field1121, 382, var99, 16777215, 0);
                int var100 = var99 + 15;
                arg0.method302(class85.field1199, 382, var100, 16777215, 0);
                int var101 = var100 + 15;
                short var26 = 382;
                short var27 = 321;
                Statics.field1401.method2463(var26 - 73, var27 - 20);
                arg0.method302(class85.field1194, var26, var27 + 5, 16777215, 0);
            }
        }
        if (field1399 > 0) {
            int var28 = field1399;
            short var29 = 256;
            field1417 += var28 * 128;
            if (field1417 > Statics.field1403.length) {
                field1417 -= Statics.field1403.length;
                int var30 = (int) (Math.random() * 12.0D);
                method2389(Statics.field1421[var30]);
            }
            int var31 = 0;
            int var32 = var28 * 128;
            int var33 = (var29 - var28) * 128;
            for (int var34 = 0; var34 < var33; var34++) {
                int var35 = Statics.field723[var31 + var32] - Statics.field1403[field1417 + var31 & Statics.field1403.length - 1] * var28 / 6;
                if (var35 < 0) {
                    var35 = 0;
                }
                Statics.field723[var31++] = var35;
            }
            for (int var36 = var29 - var28; var36 < var29; var36++) {
                int var37 = var36 * 128;
                for (int var38 = 0; var38 < 128; var38++) {
                    int var39 = (int) (Math.random() * 100.0D);
                    if (var39 < 50 && var38 > 10 && var38 < 118) {
                        Statics.field723[var37 + var38] = 255;
                    } else {
                        Statics.field723[var37 + var38] = 0;
                    }
                }
            }
            if (field1411 > 0) {
                field1411 -= var28 * 4;
            }
            if (field1412 > 0) {
                field1412 -= var28 * 4;
            }
            if (field1411 == 0 && field1412 == 0) {
                int var40 = (int) (Math.random() * (double) (2000 / var28));
                if (var40 == 0) {
                    field1411 = 1024;
                }
                if (var40 == 1) {
                    field1412 = 1024;
                }
            }
            for (int var41 = 0; var41 < var29 - var28; var41++) {
                field1428[var41] = field1428[var28 + var41];
            }
            for (int var42 = var29 - var28; var42 < var29; var42++) {
                field1428[var42] = (int) (Math.sin((double) field1405 / 14.0D) * 16.0D + Math.sin((double) field1405 / 15.0D) * 14.0D + Math.sin((double) field1405 / 16.0D) * 12.0D);
                field1405++;
            }
            field1413 += var28 * 1824927345;
            int var43 = ((client.field1541 & 0x1) + var28) / 2;
            if (var43 > 0) {
                for (int var44 = 0; var44 < field1413 * 256786596; var44++) {
                    int var45 = (int) (Math.random() * 124.0D) + 2;
                    int var46 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field723[(var46 << 7) + var45] = 192;
                }
                field1413 = 0;
                int var47 = 0;
                label286: while (true) {
                    if (var47 >= var29) {
                        int var51 = 0;
                        while (true) {
                            if (var51 >= 128) {
                                break label286;
                            }
                            int var52 = 0;
                            for (int var53 = -var43; var53 < var29; var53++) {
                                int var54 = var53 * 128;
                                if (var43 + var53 < var29) {
                                    var52 += Statics.field19[var43 * 128 + var51 + var54];
                                }
                                if (var53 - (var43 + 1) >= 0) {
                                    var52 -= Statics.field19[var51 + var54 - (var43 + 1) * 128];
                                }
                                if (var53 >= 0) {
                                    Statics.field723[var51 + var54] = var52 / (var43 * 2 + 1);
                                }
                            }
                            var51++;
                        }
                    }
                    int var48 = 0;
                    int var49 = var47 * 128;
                    for (int var50 = -var43; var50 < 128; var50++) {
                        if (var43 + var50 < 128) {
                            var48 += Statics.field723[var49 + var50 + var43];
                        }
                        if (var50 - (var43 + 1) >= 0) {
                            var48 -= Statics.field723[var49 + var50 - (var43 + 1)];
                        }
                        if (var50 >= 0) {
                            Statics.field19[var49 + var50] = var48 / (var43 * 2 + 1);
                        }
                    }
                    var47++;
                }
            }
            field1399 = 0;
        }
        short var55 = 256;
        if (field1411 > 0) {
            for (int var56 = 0; var56 < 256; var56++) {
                if (field1411 > 768) {
                    Statics.field1430[var56] = method1189(Statics.field2111[var56], Statics.field1408[var56], 1024 - field1411);
                } else if (field1411 > 256) {
                    Statics.field1430[var56] = Statics.field1408[var56];
                } else {
                    Statics.field1430[var56] = method1189(Statics.field1408[var56], Statics.field2111[var56], 256 - field1411);
                }
            }
        } else if (field1412 > 0) {
            for (int var57 = 0; var57 < 256; var57++) {
                if (field1412 > 768) {
                    Statics.field1430[var57] = method1189(Statics.field2111[var57], Statics.field1402[var57], 1024 - field1412);
                } else if (field1412 > 256) {
                    Statics.field1430[var57] = Statics.field1402[var57];
                } else {
                    Statics.field1430[var57] = method1189(Statics.field1402[var57], Statics.field2111[var57], 256 - field1412);
                }
            }
        } else {
            for (int var58 = 0; var58 < 256; var58++) {
                Statics.field1430[var58] = Statics.field2111[var58];
            }
        }
        class146.method2396(0, 9, 128, var55 + 7);
        Statics.field1427.method2589(0, 0);
        class146.method2393();
        int var59 = 0;
        int var60 = 6885;
        for (int var61 = 1; var61 < var55 - 1; var61++) {
            int var62 = (var55 - var61) * field1428[var61] / var55;
            int var63 = var62 + 22;
            if (var63 < 0) {
                var63 = 0;
            }
            var59 += var63;
            for (int var64 = var63; var64 < 128; var64++) {
                int var65 = Statics.field723[var59++];
                if (var65 == 0) {
                    var60++;
                } else {
                    int var67 = 256 - var65;
                    int var68 = Statics.field1430[var65];
                    int var69 = Statics.field617.field2149[var60];
                    Statics.field617.field2149[var60++] = ((var68 & 0xFF00) * var65 + (var69 & 0xFF00) * var67 & 0xFF0000) + ((var68 & 0xFF00FF) * var65 + (var69 & 0xFF00FF) * var67 & 0xFF00FF00) >> 8;
                }
            }
            var60 += var63 + 765 - 128;
        }
        class146.method2396(637, 9, 765, var55 + 7);
        Statics.field1311.method2589(382, 0);
        class146.method2393();
        int var70 = 0;
        int var71 = 7546;
        for (int var72 = 1; var72 < var55 - 1; var72++) {
            int var73 = (var55 - var72) * field1428[var72] / var55;
            int var74 = 103 - var73;
            int var75 = var71 + var73;
            for (int var76 = 0; var76 < var74; var76++) {
                int var77 = Statics.field723[var70++];
                if (var77 == 0) {
                    var75++;
                } else {
                    int var79 = 256 - var77;
                    int var80 = Statics.field1430[var77];
                    int var81 = Statics.field617.field2149[var75];
                    Statics.field617.field2149[var75++] = ((var80 & 0xFF00) * var77 + (var81 & 0xFF00) * var79 & 0xFF0000) + ((var80 & 0xFF00FF) * var77 + (var81 & 0xFF00FF) * var79 & 0xFF00FF00) >> 8;
                }
            }
            var70 += 128 - var74;
            var71 = 765 - var74 - var73 + var75;
        }
        Statics.field1890[Statics.field1898.field582 ? 1 : 0].method2463(725, 463);
        if (client.field1539 > 5 && client.field1538 == 0) {
            if (Statics.field2502 == null) {
                Statics.field2502 = class150.method2347(Statics.field344, "sl_button", "");
            } else {
                byte var82 = 5;
                short var83 = 463;
                byte var84 = 100;
                byte var85 = 35;
                Statics.field2502.method2463(var82, var83);
                arg0.method302(class85.field1136 + " " + client.field1533, var84 / 2 + var82, var85 / 2 + var83 - 2, 16777215, 0);
                if (Statics.field2122 == null) {
                    arg1.method302(class85.field1210, var84 / 2 + var82, var85 / 2 + var83 + 12, 16777215, 0);
                } else {
                    arg1.method302(class85.field1209, var84 / 2 + var82, var85 / 2 + var83 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var86 = Statics.field1812.getGraphics();
            Statics.field617.method1475(var86, 0, 0);
        } catch (Exception var88) {
            Statics.field1812.repaint();
        }
    }
}
