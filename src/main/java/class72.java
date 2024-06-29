import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class72 {

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Lrd;")
    public static class114 field1593 = class84.method656("Privater Chat", (byte) 120);

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "[I")
    public static int[] field1597 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "Lrd;")
    private static class114 field1592 = class84.method656("Loaded wordpack", (byte) 122);

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Lrd;")
    public static class114 field1596 = class84.method656("mapback", (byte) 122);

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "Lrd;")
    public static class114 field1601 = class84.method656("null", (byte) 119);

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "Lrd;")
    public static class114 field1595 = class84.method656("Die Verbindung konnte", (byte) 118);

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "Lrd;")
    private static class114 field1605 = class84.method656("Sorry invited players only)3", (byte) 127);

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "Lrd;")
    public static class114 field1606 = field1592;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field1608 = -1;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "[I")
    public static int[] field1594 = new int[500];

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "Lrd;")
    public static class114 field1589 = field1605;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "Lmd;")
    public static class84 field1598 = new class84();

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Lrd;")
    public static class114 field1610 = class84.method656("", (byte) 119);

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "Lrd;")
    public static class114 field1618 = field1610;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "[I")
    public static int[] field1609 = new int[128];

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "Lrd;")
    public static class114 field1619 = field1610;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "[I")
    public static int[] field1616 = new int[50];

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "Lrd;")
    public static class114 field1614 = field1610;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "Lrd;")
    public static class114 field1613 = field1610;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "Lrd;")
    public static class114 field1612 = field1610;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "Lrd;")
    public static class114 field1617 = field1610;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "Lrd;")
    public static class114 field1615 = field1610;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "Lg;")
    public static class43 field1603;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static final void method583(int arg0) {
        field1607++;
        class131.method1053(arg0 + 13615, false);
        class22.field431 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class13.field291.length; var2++) {
            if (class73.field1660[var2] != -1 && class13.field291[var2] == null) {
                class13.field291[var2] = class100.field2298.method762(class73.field1660[var2], 0, (byte) 66);
                if (class13.field291[var2] == null) {
                    class22.field431++;
                    var1 = false;
                }
            }
            if (class34.field669[var2] != -1 && class39.field821[var2] == null) {
                class39.field821[var2] = class100.field2298.method763(0, class34.field669[var2], 0, class29.field583[var2]);
                if (class39.field821[var2] == null) {
                    var1 = false;
                    class22.field431++;
                }
            }
        }
        if (!var1) {
            class141.field3368 = 1;
            return;
        }
        class52.field1078 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class13.field291.length; var4++) {
            byte[] var56 = class39.field821[var4];
            if (var56 != null) {
                int var57 = (class74.field1708[var4] >> 8) * 64 - field1611;
                int var58 = (class74.field1708[var4] & 0xFF) * 64 - class65.field1408;
                if (class145.field3464) {
                    var57 = 10;
                    var58 = 10;
                }
                var3 &= class32.method235(arg0 ^ 0xFFFFFF7B, var57, var56, var58);
            }
        }
        if (!var3) {
            class141.field3368 = 2;
            return;
        }
        if (class141.field3368 != 0) {
            class90.method694(arg0 - 255, class21.field386, true, class117.field2753);
        }
        class128.method992(arg0 ^ 0xFFFFFF00);
        class101.field2325.method1017();
        if (arg0 != 255) {
            field1617 = null;
        }
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class90.field2132[var5].method673(arg0 - 3645);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class22.field430[var6][var54][var55] = 0;
                }
            }
        }
        class126.method975((byte) 64);
        int var7 = class13.field291.length;
        class110.method839(125);
        class131.method1053(13870, true);
        if (!class145.field3464) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class74.field1708[var8] >> 8) * 64 - field1611;
                int var18 = (class74.field1708[var8] & 0xFF) * 64 - class65.field1408;
                byte[] var19 = class13.field291[var8];
                if (var19 != null) {
                    class124.method967(var19, var17, var18, (byte) 68, class90.field2132, class65.field1409 * 8 - 48, class130.field3145 * 8 + -48);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class74.field1708[var9] >> 8) * 64 - field1611;
                int var15 = (class74.field1708[var9] & 0xFF) * 64 - class65.field1408;
                byte[] var16 = class13.field291[var9];
                if (var16 == null && class65.field1409 < 800) {
                    class80.method635(var14, arg0 ^ 0xFFFFFF40, 64, 64, var15);
                }
            }
            class131.method1053(13870, true);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class39.field821[var10];
                if (var11 != null) {
                    int var12 = (class74.field1708[var10] >> 8) * 64 - field1611;
                    int var13 = (class74.field1708[var10] & 0xFF) * 64 - class65.field1408;
                    class9.method70(class101.field2325, class90.field2132, var12, var11, 63, var13);
                }
            }
        }
        if (class145.field3464) {
            for (int var20 = 0; var20 < 4; var20++) {
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        int var36 = class3.field18[var20][var34][var35];
                        boolean var37 = false;
                        if (var36 != -1) {
                            int var38 = var36 >> 1 & 0x3;
                            int var39 = var36 >> 14 & 0x3FF;
                            int var40 = var36 >> 3 & 0x7FF;
                            int var41 = var36 >> 24 & 0x3;
                            int var42 = (var39 / 8 << 8) + var40 / 8;
                            for (int var43 = 0; var43 < class74.field1708.length; var43++) {
                                if (class74.field1708[var43] == var42 && class13.field291[var43] != null) {
                                    var37 = true;
                                    class137.method1111(var41, var34 * 8, class90.field2132, (var39 & 0x7) * 8, (var40 & 0x7) * 8, var38, -74, var35 * 8, var20, class13.field291[var43]);
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            class36.method257(var35 * 8, -1, var20, var34 * 8);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class3.field18[0][var21][var32];
                    if (var33 == -1) {
                        class80.method635(var21 * 8, -65, 8, 8, var32 * 8);
                    }
                }
            }
            class131.method1053(arg0 + 13615, true);
            for (int var22 = 0; var22 < 4; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class3.field18[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 1 & 0x3;
                            int var28 = var25 >> 14 & 0x3FF;
                            int var29 = var25 >> 3 & 0x7FF;
                            int var30 = (var28 / 8 << 8) + var29 / 8;
                            for (int var31 = 0; var31 < class74.field1708.length; var31++) {
                                if (class74.field1708[var31] == var30 && class39.field821[var31] != null) {
                                    class26.method195(var27, var22, class90.field2132, (var28 & 0x7) * 8, var24 * 8, class101.field2325, (byte) 37, class39.field821[var31], var23 * 8, var26, (var29 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class131.method1053(13870, true);
        class128.method992(arg0 ^ 0xFFFFFF00);
        class99.method745(class101.field2325, (byte) -108, class90.field2132);
        class131.method1053(arg0 ^ 0x36D1, true);
        int var44 = client.field409;
        if (class20.field346 < var44) {
            var44 = class20.field346;
        }
        if (var44 < class20.field346 - 1) {
            int var45 = class20.field346 - 1;
        }
        if (class64.field1370) {
            class101.field2325.method1032(client.field409);
        } else {
            class101.field2325.method1032(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class32.method237(var46, -128, var53);
            }
        }
        class140.method1117(69);
        class32.field654.method200(-127);
        if (class32.field657 != null) {
            class66.field1431++;
            class61.field1303.method1054(8, 67);
            class61.field1303.method476(arg0 - 7410, 1057001181);
        }
        if (!class145.field3464) {
            int var47 = (class130.field3145 + 6) / 8;
            int var48 = (class130.field3145 - 6) / 8;
            int var49 = (class65.field1409 + 6) / 8;
            int var50 = (class65.field1409 - 6) / 8;
            for (int var51 = var48 - 1; var51 <= var47 + 1; var51++) {
                for (int var52 = var50 - 1; var52 <= var49 + 1; var52++) {
                    if (var48 > var51 || var51 > var47 || var52 < var50 || var52 > var49) {
                        class100.field2298.method764(0, class101.method786((byte) 127, new class114[] { client.field406, class14.method113(var51, -31766), class63.field1357, class14.method113(var52, -31766) }));
                        class100.field2298.method764(0, class101.method786((byte) 126, new class114[] { class111.field2600, class14.method113(var51, -31766), class63.field1357, class14.method113(var52, arg0 - 32021) }));
                    }
                }
            }
        }
        if (class34.field671 == -1) {
            class12.method101(false, 30);
        } else {
            class12.method101(false, 35);
        }
        class132.method1061(16);
        class61.field1303.method1054(8, 100);
        class70.method553(105);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)Z")
    public static final boolean method584(int arg0) {
        field1600++;
        class140 var1 = class90.field2084;
        synchronized (class90.field2084) {
            if (class90.field2131 == class117.field2733) {
                return false;
            } else {
                class7.field96 = class116.field2718[class117.field2733];
                class26.field541 = class109.field2523[class117.field2733];
                class117.field2733 = class117.field2733 + arg0 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)[Loa;")
    public static final class93[] method585(int arg0) {
        field1602++;
        class93[] var1 = new class93[class120.field2796];
        for (int var2 = arg0; var2 < class120.field2796; var2++) {
            class93 var3 = var1[var2] = new class93();
            var3.field2168 = class78.field1776;
            var3.field2173 = class1.field14;
            var3.field2169 = class29.field599[var2];
            var3.field2172 = class120.field2814[var2];
            var3.field2174 = class111.field2594[var2];
            var3.field2175 = class140.field3328[var2];
            var3.field2170 = class31.field630;
            var3.field2171 = class140.field3346[var2];
        }
        class34.method246(-1958111762);
        return var1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static void method586(byte arg0) {
        field1615 = null;
        field1605 = null;
        field1601 = null;
        field1594 = null;
        field1613 = null;
        field1614 = null;
        field1603 = null;
        field1593 = null;
        field1598 = null;
        field1597 = null;
        field1596 = null;
        field1609 = null;
        field1617 = null;
        field1610 = null;
        field1592 = null;
        field1606 = null;
        field1595 = null;
        if (arg0 < 123) {
            return;
        }
        field1619 = null;
        field1616 = null;
        field1612 = null;
        field1589 = null;
        field1618 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)V")
    public static final void method587(byte arg0, int arg1) {
        class25.method190(-118);
        int var2 = class141.method1127(arg1, -1).field1936;
        field1591++;
        if (var2 == 0) {
            return;
        }
        int var3 = class123.field2896[arg1];
        if (var2 == 1) {
            if (var3 == 1) {
                class134.method1102(0.9D);
                ((class144) class134.field3277).method1144(0.9D, -28996);
            }
            if (var3 == 2) {
                class134.method1102(0.8D);
                ((class144) class134.field3277).method1144(0.8D, -28996);
            }
            if (var3 == 3) {
                class134.method1102(0.7D);
                ((class144) class134.field3277).method1144(0.7D, -28996);
            }
            if (var3 == 4) {
                class134.method1102(0.6D);
                ((class144) class134.field3277).method1144(0.6D, -28996);
            }
            class61.method498(0);
            class34.field678 = true;
        }
        if (arg0 > -68) {
            field1610 = null;
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class39.field825 != var4) {
                if (class39.field825 == 0 && class8.field112 != -1) {
                    class78.method618(0, class8.field112, false, class137.field3318, 0, var4, (byte) 124);
                    class82.field1828 = 0;
                } else if (var4 == 0) {
                    class78.method621(-128);
                    class82.field1828 = 0;
                } else {
                    class135.method1105((byte) -3, var4);
                }
                class39.field825 = var4;
            }
        }
        if (var2 == 9) {
            class130.field3139 = var3;
        }
        if (var2 == 6) {
            class100.field2296 = var3;
        }
        if (var2 == 5) {
            class5.field73 = var3;
        }
        if (var2 == 8) {
            class140.field3335 = true;
            class26.field532 = var3;
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class58.field1208 = 127;
            }
            if (var3 == 1) {
                class58.field1208 = 96;
            }
            if (var3 == 2) {
                class58.field1208 = 64;
            }
            if (var3 == 3) {
                class58.field1208 = 32;
            }
            if (var3 == 4) {
                class58.field1208 = 0;
            }
        }
        if (var2 != 10) {
            return;
        }
        if (var3 == 0) {
            class84.field1860 = 127;
        }
        if (var3 == 1) {
            class84.field1860 = 96;
        }
        if (var3 == 2) {
            class84.field1860 = 64;
        }
        if (var3 == 3) {
            class84.field1860 = 32;
        }
        if (var3 == 4) {
            class84.field1860 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)I")
    public static final int method588(int arg0) {
        field1604++;
        return arg0 == -9459 ? 19 : 102;
    }
}
