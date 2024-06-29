import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class48 extends class22 {

    @OriginalMember(owner = "client!i", name = "vb", descriptor = "I")
    private int field1276;

    @OriginalMember(owner = "client!i", name = "tb", descriptor = "I")
    private int field1274;

    @OriginalMember(owner = "client!i", name = "Cb", descriptor = "I")
    private int field1283;

    @OriginalMember(owner = "client!i", name = "zb", descriptor = "I")
    private int field1280;

    @OriginalMember(owner = "client!i", name = "Nb", descriptor = "I")
    private int field1294;

    @OriginalMember(owner = "client!i", name = "Qb", descriptor = "I")
    private int field1297;

    @OriginalMember(owner = "client!i", name = "Gb", descriptor = "I")
    private int field1287;

    @OriginalMember(owner = "client!i", name = "Pb", descriptor = "Lgd;")
    private class40 field1296;

    @OriginalMember(owner = "client!i", name = "Eb", descriptor = "I")
    private int field1285;

    @OriginalMember(owner = "client!i", name = "Ab", descriptor = "I")
    private int field1281;

    @OriginalMember(owner = "client!i", name = "sb", descriptor = "Lge;")
    public static class41 field1273 = new class41(64);

    @OriginalMember(owner = "client!i", name = "Fb", descriptor = "Lwb;")
    private static class130 field1286 = class26.method212("Members object", -32376);

    @OriginalMember(owner = "client!i", name = "Db", descriptor = "Lwb;")
    public static class130 field1284 = class26.method212("logo", -32376);

    @OriginalMember(owner = "client!i", name = "Lb", descriptor = "Lwb;")
    public static class130 field1292 = field1286;

    @OriginalMember(owner = "client!i", name = "Jb", descriptor = "Lwb;")
    public static class130 field1290 = class26.method212("@lre@", -32376);

    @OriginalMember(owner = "client!i", name = "Ob", descriptor = "Lwb;")
    private static class130 field1295 = class26.method212("Password: ", -32376);

    @OriginalMember(owner = "client!i", name = "Kb", descriptor = "I")
    public static int field1291 = 0;

    @OriginalMember(owner = "client!i", name = "Mb", descriptor = "Lwb;")
    public static class130 field1293 = field1295;

    @OriginalMember(owner = "client!i", name = "ub", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!i", name = "wb", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!i", name = "xb", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!i", name = "Bb", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!i", name = "Hb", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!i", name = "Ib", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!i", name = "Rb", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!i", name = "Sb", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!i", name = "Tb", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!i", name = "Ub", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!i", name = "yb", descriptor = "[I")
    public static int[] field1279;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V", line = 9)
    public static final void method423(int arg0) {
        class21.field621.method181(14664);
        class52.field1357.method744(0, 0);
        field1288++;
        if (arg0 == 18298) {
            class30.field849 = class12.method87(class30.field849);
        }
    }

    @OriginalMember(owner = "client!i", name = "g", descriptor = "(I)V", line = 26)
    public static void method424(int arg0) {
        field1279 = null;
        if (arg0 > -87) {
            return;
        }
        field1293 = null;
        field1292 = null;
        field1284 = null;
        field1286 = null;
        field1290 = null;
        field1273 = null;
        field1295 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILsb;Ljava/awt/Component;)Lta;", line = 54)
    public static final class114 method425(int arg0, class110 arg1, Component arg2) {
        class8.method65(arg1, arg2, (byte) -63);
        class114 var3 = new class114();
        class111.method849(var3, true);
        field1282++;
        return arg0 == 14406 ? var3 : null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILje;III)V", line = 70)
    public static final void method426(int arg0, class59 arg1, int arg2, int arg3, int arg4) {
        field1277++;
        if (class42.field1179 == arg1 || (class26.field757 >= 400 || arg4 != 2000)) {
            return;
        }
        class130 var5;
        if (arg1.field1474 == 0) {
            var5 = class15.method114(new class130[] { arg1.field1515, class21.method193(-4, class42.field1179.field1489, arg1.field1489), class119.field2918, class93.field2246, class109.method831(arg1.field1489, arg4 ^ 0x7DA), class59.field1494 }, -20349);
        } else {
            var5 = class15.method114(new class130[] { arg1.field1515, class119.field2918, class111.field2744, class109.method831(arg1.field1474, 10), class59.field1494 }, -20349);
        }
        if (class95.field2306 == 1) {
            class53.method450(arg3, arg0, class23.field679, class15.method114(new class130[] { class116.field2860, class30.field856, var5 }, -20349), 15, arg2, -115);
            class120.field2924++;
        } else if (class42.field1182 != 1) {
            for (int var6 = 4; var6 >= 0; var6--) {
                if (class1.field1[var6] != null) {
                    class64.field1637++;
                    short var7 = 0;
                    if (class1.field1[var6].method986(-66, class112.field2747)) {
                        if (arg1.field1489 > class42.field1179.field1489) {
                            var7 = 2000;
                        }
                        if (class42.field1179.field1505 != 0 && arg1.field1505 != 0) {
                            if (class42.field1179.field1505 == arg1.field1505) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class22.field629[var6]) {
                        var7 = 2000;
                    }
                    int var8 = 0;
                    if (var6 == 0) {
                        var8 = var7 + 30;
                    }
                    if (var6 == 1) {
                        var8 = var7 + 45;
                    }
                    if (var6 == 2) {
                        var8 = var7 + 12;
                    }
                    if (var6 == 3) {
                        var8 = var7 + 6;
                    }
                    if (var6 == 4) {
                        var8 = var7 + 26;
                    }
                    class53.method450(arg3, arg0, class1.field1[var6], class15.method114(new class130[] { class81.field1943, var5 }, -20349), var8, arg2, -123);
                }
            }
        } else if ((class45.field1231 & 0x8) == 8) {
            class53.method450(arg3, arg0, class95.field2303, class15.method114(new class130[] { class32.field883, class30.field856, var5 }, arg4 ^ 0xFFFFB753), 55, arg2, -112);
            class45.field1218++;
        }
        for (int var9 = 0; var9 < class26.field757; var9++) {
            if (class3.field73[var9] == 28) {
                class105.field2546[var9] = class15.method114(new class130[] { class23.field672, class41.field1167, class81.field1943, var5 }, -20349);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILjava/awt/Component;Lk;)V", line = 189)
    public static final void method427(int arg0, Component arg1, class60 arg2) {
        field1278++;
        if (class4.field165) {
            return;
        }
        class52.field1357 = class24.method206(class33.field915, class64.field1641, 258, arg2);
        class52.field1369 = class24.method206(class33.field915, class52.field1371, 258, arg2);
        class75.field1871 = class24.method206(class33.field915, class97.field2346, 258, arg2);
        class106.field2569 = class24.method206(class33.field915, class40.field1134, 258, arg2);
        class26.field738 = class24.method206(class33.field915, class99.field2400, 258, arg2);
        class109.field2640 = class24.method206(class33.field915, class85.field2035, 258, arg2);
        class105.field2548 = class19.method173(96, 4, arg1, 479);
        class52.field1369.method744(0, 0);
        class79.field1911 = class19.method173(156, 4, arg1, 172);
        class49.method433();
        class75.field1871.method744(0, 0);
        class21.field621 = class19.method173(261, 4, arg1, 190);
        class52.field1357.method744(0, 0);
        class8.field273 = class19.method173(334, 4, arg1, 512);
        class49.method433();
        class32.field897 = class19.method173(50, 4, arg1, 496);
        class61.field1589 = class19.method173(37, 4, arg1, 269);
        class96.field2333 = class19.method173(45, 4, arg1, 249);
        class28 var3 = class42.method408(arg2, class33.field915, class94.field2287, (byte) -108);
        class56.field1442 = class19.method173(var3.field791, 4, arg1, var3.field797);
        var3.method235(0, 0);
        class28 var4 = class42.method408(arg2, class33.field915, class37.field1079, (byte) -108);
        class83.field1955 = class19.method173(var4.field791, 4, arg1, var4.field797);
        var4.method235(0, 0);
        class28 var5 = class42.method408(arg2, class33.field915, class68.field1754, (byte) -108);
        class97.field2337 = class19.method173(var5.field791, 4, arg1, var5.field797);
        var5.method235(0, 0);
        class28 var6 = class42.method408(arg2, class33.field915, class96.field2335, (byte) -108);
        class7.field256 = class19.method173(var6.field791, 4, arg1, var6.field797);
        var6.method235(0, 0);
        class28 var7 = class42.method408(arg2, class33.field915, class35.field992, (byte) -108);
        class32.field896 = class19.method173(var7.field791, 4, arg1, var7.field797);
        var7.method235(0, 0);
        class28 var8 = class42.method408(arg2, class33.field915, class101.field2448, (byte) -108);
        class59.field1497 = class19.method173(var8.field791, 4, arg1, var8.field797);
        var8.method235(0, 0);
        class28 var9 = class42.method408(arg2, class33.field915, class27.field790, (byte) -108);
        class109.field2634 = class19.method173(var9.field791, 4, arg1, var9.field797);
        var9.method235(0, 0);
        class28 var10 = class42.method408(arg2, class33.field915, class67.field1705, (byte) -108);
        class75.field1882 = class19.method173(var10.field791, 4, arg1, var10.field797);
        var10.method235(0, 0);
        class28 var11 = class42.method408(arg2, class33.field915, class53.field1382, (byte) -108);
        if (arg0 >= -7) {
            method423(-32);
        }
        class17.field465 = class19.method173(var11.field791, 4, arg1, var11.field797);
        var11.method235(0, 0);
        class97.field2350 = class24.method206(class33.field915, class21.field617, 258, arg2);
        class18.field506 = class24.method206(class33.field915, class36.field1033, 258, arg2);
        class117.field2894 = class24.method206(class33.field915, class58.field1470, 258, arg2);
        class132.field3199 = class97.field2350.method749();
        class132.field3199.method746();
        class20.field586 = class18.field506.method749();
        class20.field586.method746();
        class119.field2919 = class97.field2350.method749();
        class119.field2919.method745();
        class98.field2375 = class18.field506.method749();
        class98.field2375.method745();
        class93.field2222 = class117.field2894.method749();
        class93.field2222.method745();
        class129.field3044 = class97.field2350.method749();
        class129.field3044.method746();
        class129.field3044.method745();
        class2.field49 = class18.field506.method749();
        class2.field49.method746();
        class2.field49.method745();
        class43.field1185 = class106.method803(class53.field1387, -17910, class33.field915, arg2);
        class35.field1013 = new int[151];
        class60.field1539 = new int[33];
        field1279 = new int[151];
        class112.field2762 = new int[33];
        for (int var12 = 0; var12 < 33; var12++) {
            int var17 = 999;
            int var18 = 0;
            for (int var19 = 0; var19 < 34; var19++) {
                if (class75.field1871.field2412[class75.field1871.field2407 * var12 + var19] == 0) {
                    if (var17 == 999) {
                        var17 = var19;
                    }
                } else if (var17 != 999) {
                    var18 = var19;
                    break;
                }
            }
            class112.field2762[var12] = var17;
            class60.field1539[var12] = var18 - var17;
        }
        for (int var13 = 5; var13 < 156; var13++) {
            int var14 = 0;
            int var15 = 999;
            for (int var16 = 25; var16 < 172; var16++) {
                if (class75.field1871.field2412[class75.field1871.field2407 * var13 + var16] == 0 && (var16 > 34 || var13 > 34)) {
                    if (var15 == 999) {
                        var15 = var16;
                    }
                } else if (var15 != 999) {
                    var14 = var16;
                    break;
                }
            }
            class35.field1013[var13 - 5] = var15 - 25;
            field1279[var13 - 5] = var14 - var15;
        }
        class4.field165 = true;
    }

    @OriginalMember(owner = "client!i", name = "h", descriptor = "(I)V", line = 351)
    public static final void method428(int arg0) {
        field1299++;
        try {
            if (class26.field760 == 0) {
                if (class47.field1255 != null) {
                    class47.field1255.method148(-127);
                    class47.field1255 = null;
                }
                class26.field760 = 1;
                class19.field558 = null;
                class15.field421 = false;
                class6.field211 = 0;
            }
            if (~class26.field760 == arg0) {
                if (class19.field558 == null) {
                    class19.field558 = class113.field2779.method839((byte) 84, class51.field1344);
                }
                if (class19.field558.field1099 == 2) {
                    throw new IOException();
                }
                if (class19.field558.field1099 == 1) {
                    class47.field1255 = new class18((Socket) class19.field558.field1100, class113.field2779);
                    class26.field760 = 2;
                    class19.field558 = null;
                }
            }
            if (class26.field760 == 2) {
                long var1 = class7.field252 = class124.field3012.method988(-75);
                class14.field406.field1057 = 0;
                class14.field406.method330(-1, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class14.field406.method330(-1, var3);
                class47.field1255.method145(0, 2, 0, class14.field406.field1067);
                class67.field1682.field1057 = 0;
                class26.field760 = 3;
            }
            if (class26.field760 == 3) {
                int var4 = class47.field1255.method153((byte) 49);
                if (var4 != 0) {
                    class41.method406(var4, -28388);
                    return;
                }
                class67.field1682.field1057 = 0;
                class26.field760 = 4;
            }
            if (class26.field760 == 4) {
                if (class67.field1682.field1057 < 8) {
                    int var5 = class47.field1255.method155((byte) -116);
                    if (var5 > 8 - class67.field1682.field1057) {
                        var5 = 8 - class67.field1682.field1057;
                    }
                    if (var5 > 0) {
                        class47.field1255.method149(99, var5, class67.field1682.field1057, class67.field1682.field1067);
                        class67.field1682.field1057 += var5;
                    }
                }
                if (class67.field1682.field1057 == 8) {
                    class67.field1682.field1057 = 0;
                    class92.field2215 = class67.field1682.method360(arg0 ^ 0xFFFFFFFC);
                    class26.field760 = 5;
                }
            }
            if (class26.field760 == 5) {
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class92.field2215 >> 32), (int) class92.field2215 };
                class14.field406.field1057 = 0;
                class14.field406.method330(-1, 10);
                class14.field406.method325(arg0 - 405801806, var6[0]);
                class14.field406.method325(-405801808, var6[1]);
                class14.field406.method325(-405801808, var6[2]);
                class14.field406.method325(-405801808, var6[3]);
                class14.field406.method325(-405801808, class113.field2779.field2716);
                class14.field406.method344(class124.field3012.method988(-85), -1652311768);
                class14.field406.method372(980803184, class124.field3002);
                class14.field406.method357(0, class63.field1603, class96.field2314);
                class29.field801.field1057 = 0;
                if (class40.field1109 == 40) {
                    class29.field801.method330(-1, 18);
                } else {
                    class29.field801.method330(-1, 16);
                }
                class29.field801.method330(-1, class14.field406.field1057 + 53);
                class29.field801.method325(-405801808, 427);
                class29.field801.method330(arg0 ^ 0x1, class4.field189 ? 1 : 0);
                class29.field801.method325(-405801808, class123.field2996.field1540);
                class29.field801.method325(-405801808, class83.field1952.field1540);
                class29.field801.method325(-405801808, class19.field569.field1540);
                class29.field801.method325(-405801808, class24.field734.field1540);
                class29.field801.method325(-405801808, class27.field775.field1540);
                class29.field801.method325(arg0 - 405801806, class64.field1634.field1540);
                class29.field801.method325(-405801808, class29.field802.field1540);
                class29.field801.method325(-405801808, class79.field1909.field1540);
                class29.field801.method325(-405801808, class31.field864.field1540);
                class29.field801.method325(-405801808, class130.field3151.field1540);
                class29.field801.method325(arg0 ^ 0x18300B4E, class20.field587.field1540);
                class29.field801.method325(arg0 ^ 0x18300B4E, class116.field2856.field1540);
                class29.field801.method370(8, class14.field406.field1057, class14.field406.field1067, 0);
                class47.field1255.method145(0, class29.field801.field1057, 0, class29.field801.field1067);
                class14.field406.method722(var6, 9109);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class67.field1682.method722(var6, arg0 ^ 0xFFFFDC6B);
                class26.field760 = 6;
            }
            if (class26.field760 == 6 && class47.field1255.method155((byte) -116) > 0) {
                int var8 = class47.field1255.method153((byte) 59);
                if (var8 == 21 && class40.field1109 == 20) {
                    class26.field760 = 7;
                } else if (var8 == 2) {
                    class26.field760 = 9;
                } else if (var8 == 15 && class40.field1109 == 40) {
                    class69.method564(-8350);
                    return;
                } else if (var8 == 23 && class95.field2295 < 1) {
                    class26.field760 = 0;
                    class95.field2295++;
                } else {
                    class41.method406(var8, arg0 ^ 0x6EE2);
                    return;
                }
            }
            if (class26.field760 == 7 && class47.field1255.method155((byte) -116) > 0) {
                class112.field2769 = (class47.field1255.method153((byte) 115) + 3) * 60;
                class26.field760 = 8;
            }
            if (class26.field760 == 8) {
                class6.field211 = 0;
                class30.method244(class2.field32, (byte) 68, class42.field1170, class15.method114(new class130[] { class109.method831(class112.field2769 / 60, 10), class35.field990 }, -20349));
                if (--class112.field2769 <= 0) {
                    class26.field760 = 0;
                }
            } else {
                if (class26.field760 == 9 && class47.field1255.method155((byte) -116) >= 8) {
                    class21.field605 = class47.field1255.method153((byte) -100);
                    class32.field891 = class47.field1255.method153((byte) 127) == 1;
                    class53.field1376 = class47.field1255.method153((byte) -65);
                    class53.field1376 <<= 0x8;
                    class53.field1376 += class47.field1255.method153((byte) 34);
                    class24.field696 = class47.field1255.method153((byte) -94);
                    class47.field1255.method149(96, 1, 0, class67.field1682.field1067);
                    class67.field1682.field1057 = 0;
                    class9.field314 = class67.field1682.method731(-7218);
                    class47.field1255.method149(105, 2, 0, class67.field1682.field1067);
                    class67.field1682.field1057 = 0;
                    class65.field1661 = class67.field1682.method351((byte) -111);
                    class26.field760 = 10;
                }
                if (class26.field760 != 10) {
                    class6.field211++;
                    if (class6.field211 > 2000) {
                        if (class95.field2295 < 1) {
                            class26.field760 = 0;
                            class95.field2295++;
                            if (class64.field1622 == class51.field1344) {
                                class51.field1344 = class19.field562;
                            } else {
                                class51.field1344 = class64.field1622;
                            }
                        } else {
                            class41.method406(-3, -28388);
                        }
                    }
                } else if (class47.field1255.method155((byte) -116) >= class65.field1661) {
                    class67.field1682.field1057 = 0;
                    class47.field1255.method149(arg0 + 117, class65.field1661, 0, class67.field1682.field1067);
                    class99.method738(127);
                    class99.field2383 = -1;
                    class64.method529(-5, false);
                    class9.field314 = -1;
                }
            }
        } catch (IOException var9) {
            if (class95.field2295 < 1) {
                if (class64.field1622 == class51.field1344) {
                    class51.field1344 = class19.field562;
                } else {
                    class51.field1344 = class64.field1622;
                }
                class95.field2295++;
                class26.field760 = 0;
            } else {
                class41.method406(-2, -28388);
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILmc;Lb;B)V", line = 668)
    public static final void method429(int arg0, class75 arg1, class7 arg2, byte arg3) {
        byte[] var4 = null;
        class108 var5 = class71.field1800;
        synchronized (class71.field1800) {
            class37 var6 = (class37) class71.field1800.method813(-117);
            while (true) {
                if (var6 != null) {
                    if ((long) arg0 != var6.field2329 || var6.field1081 != arg2 || var6.field1092 != 0) {
                        var6 = (class37) class71.field1800.method814((byte) -19);
                        continue;
                    }
                    var4 = var6.field1086;
                }
                if (arg3 != -94) {
                    field1286 = null;
                }
                break;
            }
        }
        field1275++;
        if (var4 == null) {
            byte[] var7 = arg2.method55(arg0, -9171);
            arg1.method583(true, -22625, var7, arg0, arg2);
        } else {
            arg1.method583(true, -22625, var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "(B)Lr;", line = 721)
    public final class102 method10(byte arg0) {
        field1300++;
        if (arg0 != -38) {
            return null;
        }
        if (this.field1296 != null) {
            int var2 = class130.field3128 - this.field1285;
            if (var2 > 100 && this.field1296.field1142 > 0) {
                var2 = 100;
            }
            label41: {
                do {
                    do {
                        if (var2 <= this.field1296.field1108[this.field1281]) {
                            break label41;
                        }
                        var2 -= this.field1296.field1108[this.field1281];
                        this.field1281++;
                    } while (this.field1281 < this.field1296.field1106.length);
                    this.field1281 -= this.field1296.field1142;
                } while (this.field1281 >= 0 && this.field1296.field1106.length > this.field1281);
                this.field1296 = null;
            }
            this.field1285 = class130.field3128 - var2;
        }
        class109 var3 = class32.method256(6, this.field1294);
        if (var3.field2629 != null) {
            var3 = var3.method826(113);
        }
        return var3 == null ? null : var3.method829(this.field1280, this.field1287, this.field1274, this.field1281, this.field1283, (byte) -82, this.field1296, this.field1297, this.field1276);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(IIIIIIIIZ)V", line = 772)
    public class48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field1276 = arg2;
        this.field1274 = arg5;
        this.field1283 = arg1;
        this.field1280 = arg3;
        this.field1294 = arg0;
        this.field1297 = arg6;
        this.field1287 = arg4;
        if (arg7 != -1) {
            this.field1296 = class85.method641(arg7, 12);
            this.field1285 = class130.field3128 - 1;
            this.field1281 = 0;
            if (arg8 && this.field1296.field1142 != -1) {
                this.field1281 = (int) ((double) this.field1296.field1106.length * Math.random());
                this.field1285 -= (int) ((double) this.field1296.field1108[this.field1281] * Math.random());
                return;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Lcb;", line = 805)
    public static final class15 method430(int arg0, int arg1) {
        field1301++;
        class15 var2 = (class15) class123.field2992.method402((long) arg1, -127);
        if (arg0 >= -127) {
            method427(113, null, null);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class124.field3000.method508(arg1, 0, 4);
        class15 var4 = new class15();
        if (var3 != null) {
            var4.method113((byte) 76, new class36(var3), arg1);
        }
        var4.method118(28345);
        class123.field2992.method403((long) arg1, var4, (byte) -101);
        return var4;
    }
}
