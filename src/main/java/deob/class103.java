package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("y")
public class class103 {

    @ObfuscatedName("y.d")
    public static int field1410 = 0;

    @ObfuscatedName("y.c")
    public static int field1406 = 0;

    @ObfuscatedName("y.a")
    public static int field1411 = 0;

    @ObfuscatedName("y.w")
    public static int[] field1403 = new int[256];

    @ObfuscatedName("y.u")
    public static int field1409 = 0;

    @ObfuscatedName("y.bq")
    public static int field1429 = -1;

    @ObfuscatedName("y.bh")
    public static int[] field1427 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("y.be")
    public static int[] field1422 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("y.ay")
    public static String field1421 = "";

    @ObfuscatedName("y.at")
    public static int field1413 = 0;

    @ObfuscatedName("y.as")
    public static int field1407 = 0;

    @ObfuscatedName("y.ar")
    public static boolean field1408 = false;

    @ObfuscatedName("y.aq")
    public static String field1419 = "";

    @ObfuscatedName("y.ax")
    public static String field1415 = "";

    @ObfuscatedName("y.au")
    public static int field1414 = 10;

    @ObfuscatedName("y.ai")
    public static String field1420 = "";

    @ObfuscatedName("y.ad")
    public static String field1418 = "";

    @ObfuscatedName("y.aa")
    public static int field1412 = 0;

    @ObfuscatedName("y.ab")
    public static String field1423 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("y.ag")
    public static int field1416 = 0;

    @ObfuscatedName("y.ah")
    public static String field1417 = "";

    @ObfuscatedName("y.ae")
    public static int field1398 = 0;

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("f.r(Lgk;Lgk;B)V")
    public static void method794(class23 arg0, class23 arg1) {
        if (field1408) {
            method849(arg0, arg1);
            return;
        }
        if (client.field1693 == 0 || client.field1693 == 5) {
            byte var2 = 20;
            arg0.method81(class98.field1336, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class139.method2309(230, var3, 304, 34, 9179409);
            class139.method2309(231, var3 + 1, 302, 32, 0);
            class139.method2353(232, var3 + 2, field1414 * 3, 30, 9179409);
            class139.method2353(field1414 * 3 + 232, var3 + 2, 300 - field1414 * 3, 30, 0);
            arg0.method81(field1415, 382, 276 - var2, 16777215, -1);
        }
        if (client.field1693 == 20) {
            Statics.field1777.method2710(382 - Statics.field1777.field2180 / 2, 271 - Statics.field1777.field2178 / 2);
            short var4 = 211;
            arg0.method81(field1417, 382, var4, 16776960, 0);
            int var35 = var4 + 15;
            arg0.method81(field1418, 382, var35, 16776960, 0);
            int var36 = var35 + 15;
            arg0.method81(field1419, 382, var36, 16776960, 0);
            int var37 = var36 + 15;
            int var38 = var37 + 10;
            arg0.method62(class98.field1201, 272, var38, 16777215, 0);
            short var5 = 200;
            String var6;
            for (var6 = field1420; arg0.method89(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
            }
            arg0.method62(class6.method61(var6), 312, var38, 16777215, 0);
            var35 = var38 + 15;
            String var8 = class98.field1268;
            String var9 = field1421;
            String var10 = class99.method1448('*', var9.length());
            arg0.method62(var8 + var10, 274, var35, 16777215, 0);
            var35 += 15;
        }
        if (client.field1693 == 10) {
            Statics.field1777.method2710(202, 171);
            if (field1416 == 0) {
                short var11 = 251;
                arg0.method81(class98.field1359, 382, var11, 16776960, 0);
                int var39 = var11 + 30;
                short var12 = 302;
                short var13 = 291;
                Statics.field1399.method2710(var12 - 73, var13 - 20);
                arg0.method65(class98.field1346, var12 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var14 = 462;
                Statics.field1399.method2710(var14 - 73, var13 - 20);
                arg0.method65(class98.field1347, var14 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1416 == 2) {
                short var15 = 211;
                arg0.method81(field1417, 382, var15, 16776960, 0);
                int var40 = var15 + 15;
                arg0.method81(field1418, 382, var40, 16776960, 0);
                int var41 = var40 + 15;
                arg0.method81(field1419, 382, var41, 16776960, 0);
                int var42 = var41 + 15;
                int var43 = var42 + 10;
                arg0.method62(class98.field1201, 272, var43, 16777215, 0);
                short var16 = 200;
                String var17;
                for (var17 = field1420; arg0.method89(var17) > var16; var17 = var17.substring(1)) {
                }
                arg0.method62(class6.method61(var17) + (field1407 == 0 & client.field1483 % 40 < 20 ? class94.method2110(16776960) + class94.field1086 : ""), 312, var43, 16777215, 0);
                var40 = var43 + 15;
                String var19 = class98.field1268;
                String var20 = field1421;
                String var21 = class99.method1448('*', var20.length());
                arg0.method62(var19 + var21 + (field1407 == 1 & client.field1483 % 40 < 20 ? class94.method2110(16776960) + class94.field1086 : ""), 274, var40, 16777215, 0);
                var40 += 15;
                short var22 = 302;
                short var23 = 321;
                Statics.field1399.method2710(var22 - 73, var23 - 20);
                arg0.method81(class98.field1348, var22, var23 + 5, 16777215, 0);
                short var24 = 462;
                Statics.field1399.method2710(var24 - 73, var23 - 20);
                arg0.method81(class98.field1349, var24, var23 + 5, 16777215, 0);
            } else if (field1416 == 3) {
                arg0.method81(class98.field1243, 382, 211, 16776960, 0);
                short var25 = 236;
                arg0.method81(class98.field1297, 382, var25, 16777215, 0);
                int var44 = var25 + 15;
                arg0.method81(class98.field1352, 382, var44, 16777215, 0);
                int var45 = var44 + 15;
                arg0.method81(class98.field1353, 382, var45, 16777215, 0);
                int var46 = var45 + 15;
                arg0.method81(class98.field1354, 382, var46, 16777215, 0);
                int var47 = var46 + 15;
                short var26 = 382;
                short var27 = 321;
                Statics.field1399.method2710(var26 - 73, var27 - 20);
                arg0.method81(class98.field1349, var26, var27 + 5, 16777215, 0);
            }
        }
        if (field1412 > 0) {
            method2177(field1412);
            field1412 = 0;
        }
        method933();
        Statics.field80[Statics.field1855.field1380 ? 1 : 0].method2710(725, 463);
        if (client.field1693 > 5 && client.field1690 == 0) {
            if (Statics.field2544 == null) {
                Statics.field2544 = class146.method958(Statics.field887, "sl_button", "");
            } else {
                byte var28 = 5;
                short var29 = 463;
                byte var30 = 100;
                byte var31 = 35;
                Statics.field2544.method2710(var28, var29);
                arg0.method81(class98.field1313 + " " + client.field1687, var30 / 2 + var28, var31 / 2 + var29 - 2, 16777215, 0);
                if (Statics.field618 == null) {
                    arg1.method81(class98.field1259, var30 / 2 + var28, var31 / 2 + var29 + 12, 16777215, 0);
                } else {
                    arg1.method81(class98.field1364, var30 / 2 + var28, var31 / 2 + var29 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var32 = Statics.field2359.getGraphics();
            Statics.field879.method2293(var32, 0, 0);
        } catch (Exception var34) {
            Statics.field2359.repaint();
        }
    }

    @ObfuscatedName("e.z(Lgk;Lgk;I)V")
    public static void method849(class23 arg0, class23 arg1) {
        if (Statics.field547 == null) {
            Statics.field547 = class146.method854(Statics.field887, "sl_back", "");
        }
        if (Statics.field2852 == null) {
            Statics.field2852 = class146.method3072(Statics.field887, "sl_flags", "");
        }
        if (Statics.field2006 == null) {
            Statics.field2006 = class146.method3072(Statics.field887, "sl_arrows", "");
        }
        if (Statics.field1425 == null) {
            Statics.field1425 = class146.method3072(Statics.field887, "sl_stars", "");
        }
        class139.method2353(0, 23, 765, 480, 0);
        class139.method2355(0, 0, 125, 23, 12425273, 9135624);
        class139.method2355(125, 0, 640, 23, 5197647, 2697513);
        arg0.method81(class98.field1355, 62, 15, 0, -1);
        if (Statics.field1425 != null) {
            Statics.field1425[1].method2710(140, 1);
            arg1.method62(class98.field1365, 152, 10, 16777215, -1);
            Statics.field1425[0].method2710(140, 12);
            arg1.method62(class98.field1357, 152, 21, 16777215, -1);
        }
        if (Statics.field2006 != null) {
            short var2 = 280;
            if (field1427[0] == 0 && field1422[0] == 0) {
                Statics.field2006[2].method2710(var2, 4);
            } else {
                Statics.field2006[0].method2710(var2, 4);
            }
            if (field1427[0] == 0 && field1422[0] == 1) {
                Statics.field2006[3].method2710(var2 + 15, 4);
            } else {
                Statics.field2006[1].method2710(var2 + 15, 4);
            }
            arg0.method62(class98.field1350, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field1427[0] == 1 && field1422[0] == 0) {
                Statics.field2006[2].method2710(var3, 4);
            } else {
                Statics.field2006[0].method2710(var3, 4);
            }
            if (field1427[0] == 1 && field1422[0] == 1) {
                Statics.field2006[3].method2710(var3 + 15, 4);
            } else {
                Statics.field2006[1].method2710(var3 + 15, 4);
            }
            arg0.method62(class98.field1256, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field1427[0] == 2 && field1422[0] == 0) {
                Statics.field2006[2].method2710(var4, 4);
            } else {
                Statics.field2006[0].method2710(var4, 4);
            }
            if (field1427[0] == 2 && field1422[0] == 1) {
                Statics.field2006[3].method2710(var4 + 15, 4);
            } else {
                Statics.field2006[1].method2710(var4 + 15, 4);
            }
            arg0.method62(class98.field1360, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field1427[0] == 3 && field1422[0] == 0) {
                Statics.field2006[2].method2710(var5, 4);
            } else {
                Statics.field2006[0].method2710(var5, 4);
            }
            if (field1427[0] == 3 && field1422[0] == 1) {
                Statics.field2006[3].method2710(var5 + 15, 4);
            } else {
                Statics.field2006[1].method2710(var5 + 15, 4);
            }
            arg0.method62(class98.field1361, var5 + 32, 17, 16777215, -1);
        }
        class139.method2353(708, 4, 50, 16, 0);
        arg1.method81(class98.field1349, 733, 16, 16777215, -1);
        field1429 = -1;
        if (Statics.field547 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field1398) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field1398) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field1398) {
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
            for (int var20 = 0; var20 < field1398; var20++) {
                class69 var21 = Statics.field871[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field650);
                if (var21.field650 == -1) {
                    var23 = class98.field1362;
                    var22 = false;
                } else if (var21.field650 > 1980) {
                    var23 = class98.field1200;
                    var22 = false;
                }
                byte var24;
                if (var21.field656) {
                    if (var21.field652) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.field652) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class108.field1742 >= var17 && class108.field1743 >= var16 && class108.field1742 < var6 + var17 && class108.field1743 < var7 + var16 && var22) {
                    field1429 = var20;
                    Statics.field547[var24].method2625(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field547[var24].method2640(var17, var16);
                }
                if (Statics.field2852 != null) {
                    Statics.field2852[(var21.field652 ? 8 : 0) + var21.field649].method2710(var17 + 29, var16);
                }
                arg0.method81(Integer.toString(var21.field655), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method81(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method89(Statics.field871[field1429].field653) + 6;
                int var26 = arg1.field19 + 8;
                class139.method2353(class108.field1742 - var25 / 2, class108.field1743 + 20 + 5, var25, var26, 16777120);
                class139.method2309(class108.field1742 - var25 / 2, class108.field1743 + 20 + 5, var25, var26, 0);
                arg1.method81(Statics.field871[field1429].field653, class108.field1742, class108.field1743 + 20 + 5 + arg1.field19 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = Statics.field2359.getGraphics();
            Statics.field879.method2293(var27, 0, 0);
        } catch (Exception var29) {
            Statics.field2359.repaint();
        }
    }

    @ObfuscatedName("l.x(I)V")
    public static final void method933() {
        short var0 = 256;
        if (field1406 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field1406 > 768) {
                    Statics.field1883[var1] = method2361(Statics.field557[var1], Statics.field1404[var1], 1024 - field1406);
                } else if (field1406 > 256) {
                    Statics.field1883[var1] = Statics.field1404[var1];
                } else {
                    Statics.field1883[var1] = method2361(Statics.field1404[var1], Statics.field557[var1], 256 - field1406);
                }
            }
        } else if (field1409 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1409 > 768) {
                    Statics.field1883[var2] = method2361(Statics.field557[var2], Statics.field1434[var2], 1024 - field1409);
                } else if (field1409 > 256) {
                    Statics.field1883[var2] = Statics.field1434[var2];
                } else {
                    Statics.field1883[var2] = method2361(Statics.field1434[var2], Statics.field557[var2], 256 - field1409);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field1883[var3] = Statics.field557[var3];
            }
        }
        class139.method2344(0, 9, 128, var0 + 7);
        Statics.field1424.method2640(0, 0);
        class139.method2300();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field1403[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field1789[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field1883[var10];
                    int var14 = Statics.field879.field2025[var5];
                    Statics.field879.field2025[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class139.method2344(637, 9, 765, var0 + 7);
        Statics.field499.method2640(382, 0);
        class139.method2300();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field1403[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field1789[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field1883[var22];
                    int var26 = Statics.field879.field2025[var20];
                    Statics.field879.field2025[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("v.h(Lbk;I)V")
    public static void method1164(class122 arg0) {
        if (field1408) {
            method1547(arg0);
            return;
        }
        if (class108.field1748 == 1 && class108.field1737 >= 715 && class108.field1749 >= 453) {
            Statics.field1855.field1380 = !Statics.field1855.field1380;
            class101.method748();
            if (Statics.field1855.field1380) {
                class79.method2782();
            } else {
                class79.method1489(Statics.field1532, "scape main", "", 255, false);
            }
        }
        if (client.field1693 == 5) {
            return;
        }
        field1412++;
        if (client.field1693 != 10) {
            return;
        }
        if (client.field1690 == 0) {
            if (class108.field1748 == 1) {
                byte var1 = 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class108.field1737 >= var1 && class108.field1737 <= var1 + var3 && class108.field1749 >= var2 && class108.field1749 <= var2 + var4) {
                    method2002();
                    return;
                }
            }
            if (Statics.field618 != null) {
                method2002();
            }
        }
        int var5 = class108.field1748;
        int var6 = class108.field1737;
        int var7 = class108.field1749;
        if (field1416 == 0) {
            short var8 = 302;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                field1416 = 3;
                field1407 = 0;
            }
            short var10 = 462;
            if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                field1417 = class98.field1337;
                field1418 = class98.field1338;
                field1419 = class98.field1339;
                field1416 = 2;
                field1407 = 0;
            }
        } else if (field1416 == 2) {
            short var11 = 231;
            int var23 = var11 + 30;
            if (var5 == 1 && var7 >= var23 - 15 && var7 < var23) {
                field1407 = 0;
            }
            var23 += 15;
            if (var5 == 1 && var7 >= var23 - 15 && var7 < var23) {
                field1407 = 1;
            }
            var23 += 15;
            short var12 = 302;
            short var13 = 321;
            if (var5 == 1 && var6 >= var12 - 75 && var6 <= var12 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field1420 = field1420.trim();
                if (field1420.length() == 0) {
                    Statics.method2889(class98.field1247, class98.field1159, class98.field1249);
                    return;
                }
                if (field1421.length() == 0) {
                    Statics.method2889(class98.field1137, class98.field1135, class98.field1220);
                    return;
                }
                Statics.method2889(class98.field1340, class98.field1341, class98.field1342);
                client.method931(20);
                return;
            }
            short var14 = 462;
            if (var5 == 1 && var6 >= var14 - 75 && var6 <= var14 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field1416 = 0;
                field1420 = "";
                field1421 = "";
            }
            while (true) {
                while (true) {
                    class162 var15 = class162.field2423;
                    boolean var16;
                    synchronized (class162.field2423) {
                        if (class162.field2440 == class162.field2420) {
                            var16 = false;
                        } else {
                            Statics.field1736 = class162.field2427[class162.field2420];
                            Statics.field1445 = class162.field2434[class162.field2420];
                            class162.field2420 = class162.field2420 + 1 & 0x7F;
                            var16 = true;
                        }
                    }
                    if (!var16) {
                        return;
                    }
                    boolean var18 = false;
                    for (int var19 = 0; var19 < field1423.length(); var19++) {
                        if (Statics.field1445 == field1423.charAt(var19)) {
                            var18 = true;
                            break;
                        }
                    }
                    if (field1407 == 0) {
                        if (Statics.field1736 == 85 && field1420.length() > 0) {
                            field1420 = field1420.substring(0, field1420.length() - 1);
                        }
                        if (Statics.field1736 == 84 || Statics.field1736 == 80) {
                            field1407 = 1;
                        }
                        if (var18 && field1420.length() < 320) {
                            field1420 = field1420 + Statics.field1445;
                        }
                    } else if (field1407 == 1) {
                        if (Statics.field1736 == 85 && field1421.length() > 0) {
                            field1421 = field1421.substring(0, field1421.length() - 1);
                        }
                        if (Statics.field1736 == 84 || Statics.field1736 == 80) {
                            field1407 = 0;
                        }
                        if (Statics.field1736 == 84) {
                            field1420 = field1420.trim();
                            if (field1420.length() == 0) {
                                Statics.method2889(class98.field1247, class98.field1159, class98.field1249);
                                return;
                            }
                            if (field1421.length() == 0) {
                                Statics.method2889(class98.field1137, class98.field1135, class98.field1220);
                                return;
                            }
                            Statics.method2889(class98.field1340, class98.field1341, class98.field1342);
                            client.method931(20);
                            return;
                        }
                        if (var18 && field1421.length() < 20) {
                            field1421 = field1421 + Statics.field1445;
                        }
                    }
                }
            }
        } else if (field1416 == 3) {
            short var20 = 382;
            short var21 = 321;
            if (var5 == 1 && var6 >= var20 - 75 && var6 <= var20 + 75 && var7 >= var21 - 20 && var7 <= var21 + 20) {
                field1416 = 0;
            }
        }
    }

    @ObfuscatedName("t.s([Ll;II[I[II)V")
    public static void method1183(class69[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class69 var8 = arg0[var7];
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
                        var11 = arg0[var6].field654;
                        var12 = var8.field654;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field650;
                        var12 = var8.field650;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field652 ? 1 : 0;
                        var12 = var8.field652 ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field655;
                        var12 = var8.field655;
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
                        var15 = arg0[var5].field654;
                        var16 = var8.field654;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field650;
                        var16 = var8.field650;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field652 ? 1 : 0;
                        var16 = var8.field652 ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field655;
                        var16 = var8.field655;
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
                class69 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method1183(arg0, arg1, var6, arg3, arg4);
        method1183(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("q.j(Leg;Leg;S)I")
    public static int method1340(class81 arg0, class81 arg1) {
        int var2 = 0;
        if (arg0.method1101("title.jpg", "")) {
            var2++;
        }
        if (arg1.method1101("logo", "")) {
            var2++;
        }
        if (arg1.method1101("titlebox", "")) {
            var2++;
        }
        if (arg1.method1101("titlebutton", "")) {
            var2++;
        }
        if (arg1.method1101("runes", "")) {
            var2++;
        }
        if (arg1.method1101("title_mute", "")) {
            var2++;
        }
        arg1.method1101("sl_back", "");
        arg1.method1101("sl_flags", "");
        arg1.method1101("sl_arrows", "");
        arg1.method1101("sl_stars", "");
        arg1.method1101("sl_button", "");
        return var2;
    }

    @ObfuscatedName("p.t(I)V")
    public static void method1353() {
        if (!Statics.field1405) {
            return;
        }
        Statics.field1777 = null;
        Statics.field1399 = null;
        Statics.field1400 = null;
        Statics.field1424 = null;
        Statics.field499 = null;
        Statics.field2030 = null;
        Statics.field80 = null;
        Statics.field547 = null;
        Statics.field2852 = null;
        Statics.field2006 = null;
        Statics.field1425 = null;
        Statics.field2544 = null;
        Statics.field557 = null;
        Statics.field1404 = null;
        Statics.field1434 = null;
        Statics.field1883 = null;
        Statics.field855 = null;
        Statics.field1428 = null;
        Statics.field1789 = null;
        Statics.field1430 = null;
        class79.field881 = 1;
        Statics.field885 = null;
        Statics.field1390 = -1;
        Statics.field1384 = -1;
        Statics.field1856 = 0;
        Statics.field2201 = false;
        Statics.field1098 = 2;
        class53.method1343(true);
        Statics.field1405 = false;
    }

    @ObfuscatedName("x.l(Lbk;I)V")
    public static void method1547(class122 arg0) {
        if (class108.field1748 != 1) {
            return;
        }
        short var1 = 280;
        if (class108.field1737 >= var1 && class108.field1737 <= var1 + 14 && class108.field1749 >= 4 && class108.field1749 <= 18) {
            method2124(0, 0);
            return;
        }
        if (class108.field1737 >= var1 + 15 && class108.field1737 <= var1 + 80 && class108.field1749 >= 4 && class108.field1749 <= 18) {
            method2124(0, 1);
            return;
        }
        short var2 = 390;
        if (class108.field1737 >= var2 && class108.field1737 <= var2 + 14 && class108.field1749 >= 4 && class108.field1749 <= 18) {
            method2124(1, 0);
            return;
        }
        if (class108.field1737 >= var2 + 15 && class108.field1737 <= var2 + 80 && class108.field1749 >= 4 && class108.field1749 <= 18) {
            method2124(1, 1);
            return;
        }
        short var3 = 500;
        if (class108.field1737 >= var3 && class108.field1737 <= var3 + 14 && class108.field1749 >= 4 && class108.field1749 <= 18) {
            method2124(2, 0);
            return;
        }
        if (class108.field1737 >= var3 + 15 && class108.field1737 <= var3 + 80 && class108.field1749 >= 4 && class108.field1749 <= 18) {
            method2124(2, 1);
            return;
        }
        short var4 = 610;
        if (class108.field1737 >= var4 && class108.field1737 <= var4 + 14 && class108.field1749 >= 4 && class108.field1749 <= 18) {
            method2124(3, 0);
            return;
        }
        if (class108.field1737 >= var4 + 15 && class108.field1737 <= var4 + 80 && class108.field1749 >= 4 && class108.field1749 <= 18) {
            method2124(3, 1);
            return;
        }
        if (class108.field1737 >= 708 && class108.field1749 >= 4 && class108.field1737 <= 758 && class108.field1749 <= 20) {
            field1408 = false;
            Statics.field1424.method2640(0, 0);
            Statics.field499.method2640(382, 0);
            Statics.field2030.method2710(382 - Statics.field2030.field2180 / 2, 18);
            return;
        }
        if (field1429 == -1) {
            return;
        }
        class69 var5 = Statics.field871[field1429];
        if (client.field1477 != var5.field652) {
            client.field1477 = var5.field652;
            boolean var6 = var5.field652;
            if (Statics.field2510 != var6) {
                class165.method355();
                Statics.field2510 = var6;
            }
        }
        Statics.field904 = var5.field651;
        client.field1687 = var5.field655;
        Statics.field927 = client.field1476 == 0 ? 43594 : var5.field655 + 40000;
        Statics.field601 = client.field1476 == 0 ? 443 : var5.field655 + 50000;
        Statics.field1510 = Statics.field927;
        field1408 = false;
        Statics.field1424.method2640(0, 0);
        Statics.field499.method2640(382, 0);
        Statics.field2030.method2710(382 - Statics.field2030.field2180 / 2, 18);
        return;
    }

    @ObfuscatedName("client.p(I)I")
    public static int method1850() {
        return 6;
    }

    @ObfuscatedName("bv.g(Lcr;B)V")
    public static final void method1927(class145 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field855.length; var2++) {
            Statics.field855[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field855[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1428[var8] = (Statics.field855[var8 - 1] + Statics.field855[var8 + 1] + Statics.field855[var8 - 128] + Statics.field855[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field855;
            Statics.field855 = Statics.field1428;
            Statics.field1428 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field2178; var11++) {
            for (int var12 = 0; var12 < arg0.field2180; var12++) {
                if (arg0.field2182[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field2179;
                    int var14 = var11 + 16 + arg0.field2175;
                    int var15 = (var14 << 7) + var13;
                    Statics.field855[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("bs.o(Ljava/awt/Component;Leg;Leg;I)V")
    public static void method1944(Component arg0, class81 arg1, class81 arg2) {
        if (Statics.field1405) {
            return;
        }
        class139.method2307();
        byte[] var3 = arg1.method1106("title.jpg", "");
        Statics.field1424 = new class143(var3, arg0);
        Statics.field499 = Statics.field1424.method2692();
        Statics.field2030 = class146.method958(arg2, "logo", "");
        Statics.field1777 = class146.method958(arg2, "titlebox", "");
        Statics.field1399 = class146.method958(arg2, "titlebutton", "");
        Statics.field1400 = class146.method3072(arg2, "runes", "");
        Statics.field80 = class146.method3072(arg2, "title_mute", "");
        Statics.field557 = new int[256];
        for (int var4 = 0; var4 < 64; var4++) {
            Statics.field557[var4] = var4 * 262144;
        }
        for (int var5 = 0; var5 < 64; var5++) {
            Statics.field557[var5 + 64] = var5 * 1024 + 16711680;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            Statics.field557[var6 + 128] = var6 * 4 + 16776960;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            Statics.field557[var7 + 192] = 16777215;
        }
        Statics.field1404 = new int[256];
        for (int var8 = 0; var8 < 64; var8++) {
            Statics.field1404[var8] = var8 * 1024;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            Statics.field1404[var9 + 64] = var9 * 4 + 65280;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            Statics.field1404[var10 + 128] = var10 * 262144 + 65535;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            Statics.field1404[var11 + 192] = 16777215;
        }
        Statics.field1434 = new int[256];
        for (int var12 = 0; var12 < 64; var12++) {
            Statics.field1434[var12] = var12 * 4;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            Statics.field1434[var13 + 64] = var13 * 262144 + 255;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            Statics.field1434[var14 + 128] = var14 * 1024 + 16711935;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            Statics.field1434[var15 + 192] = 16777215;
        }
        Statics.field1883 = new int[256];
        Statics.field855 = new int[32768];
        Statics.field1428 = new int[32768];
        method1927((class145) null);
        Statics.field1789 = new int[32768];
        Statics.field1430 = new int[32768];
        field1416 = 0;
        field1420 = "";
        field1421 = "";
        field1408 = false;
        if (Statics.field1855.field1380) {
            class79.field881 = 1;
            Statics.field885 = null;
            Statics.field1390 = -1;
            Statics.field1384 = -1;
            Statics.field1856 = 0;
            Statics.field2201 = false;
            Statics.field1098 = 2;
        } else {
            class97 var16 = Statics.field1532;
            int var17 = var16.method1098("scape main");
            int var18 = var16.method1099(var17, "");
            class79.method1982(2, var16, var17, var18, 255, false);
        }
        class53.method1343(false);
        Statics.field1405 = true;
        Statics.field1424.method2640(0, 0);
        Statics.field499.method2640(382, 0);
        Statics.field2030.method2710(382 - Statics.field2030.field2180 / 2, 18);
    }

    @ObfuscatedName("bq.w(B)V")
    public static void method2002() {
        try {
            if (Statics.field618 == null) {
                Statics.field618 = new class92(Statics.field2009, new URL(Statics.field1480));
            } else {
                byte[] var0 = Statics.field618.method1334();
                if (var0 != null) {
                    class31 var1 = new class31(var0);
                    field1398 = var1.method373();
                    Statics.field871 = new class69[field1398];
                    int var2 = 0;
                    while (var2 < field1398) {
                        class69 var3 = Statics.field871[var2] = new class69();
                        int var4 = var1.method373();
                        var3.field655 = var4 & 0x3FFF;
                        var3.field652 = (var4 & 0x8000) != 0;
                        var3.field656 = (var4 & 0x4000) != 0;
                        var3.field651 = var1.method379();
                        var3.field653 = var1.method379();
                        var3.field649 = var1.method512();
                        var3.field650 = var1.method356();
                        var3.field654 = var2++;
                    }
                    method1183(Statics.field871, 0, Statics.field871.length - 1, field1427, field1422);
                    field1408 = true;
                    Statics.field618 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field618 = null;
        }
    }

    @ObfuscatedName("bg.i(IIB)V")
    public static void method2124(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1427[var5] != arg0) {
                var2[var4] = field1427[var5];
                var3[var4] = field1422[var5];
                var4++;
            }
        }
        field1427 = var2;
        field1422 = var3;
        method1183(Statics.field871, 0, Statics.field871.length - 1, field1427, field1422);
    }

    @ObfuscatedName("bi.e(II)V")
    public static final void method2177(int arg0) {
        short var1 = 256;
        field1410 += arg0 * 128;
        if (field1410 > Statics.field855.length) {
            field1410 -= Statics.field855.length;
            int var2 = (int) (Math.random() * 12.0D);
            method1927(Statics.field1400[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field1789[var3 + var4] - Statics.field855[field1410 + var3 & Statics.field855.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field1789[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field1789[var9 + var10] = 255;
                } else {
                    Statics.field1789[var9 + var10] = 0;
                }
            }
        }
        if (field1406 > 0) {
            field1406 -= arg0 * 4;
        }
        if (field1409 > 0) {
            field1409 -= arg0 * 4;
        }
        if (field1406 == 0 && field1409 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field1406 = 1024;
            }
            if (var12 == 1) {
                field1409 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field1403[var13] = field1403[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field1403[var14] = (int) (Math.sin((double) field1413 / 14.0D) * 16.0D + Math.sin((double) field1413 / 15.0D) * 14.0D + Math.sin((double) field1413 / 16.0D) * 12.0D);
            field1413++;
        }
        field1411 += arg0 * 1054906875;
        int var15 = ((client.field1483 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field1411 * -416442388; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field1789[(var18 << 7) + var17] = 192;
        }
        field1411 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field1789[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field1789[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1430[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1430[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1430[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field1789[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("cv.f(IIIB)I")
    public static final int method2361(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }
}
