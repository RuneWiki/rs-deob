import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 extends Canvas {

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field79;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Ltd;")
    private static class136 field72 = class145.method1172("M", 45);

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Ltd;")
    public static class136 field74 = field72;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Ltd;")
    public static class136 field67 = class145.method1172("<col=ffffff> )4 ", 45);

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Ltd;")
    public static class136 field69 = field72;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "Ltd;")
    private static class136 field80 = class145.method1172(" seconds)3", 45);

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Ltd;")
    public static class136 field81 = class145.method1172("mapmarker", 45);

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Ltd;")
    public static class136 field77 = field80;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Lpf;")
    public static class110 field70 = new class110(5000);

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "[Lm;")
    public static class83[] field83 = new class83[4];

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field88 = -1;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "Ltd;")
    public static class136 field86 = class145.method1172("Ihr Spielkonto wird bereits benutzt)3", 45);

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "[Ltd;")
    public static class136[] field87 = new class136[5];

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "[I")
    public static int[] field82 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public static int field85 = 0;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "[[[B")
    public static byte[][][] field84;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lsb;ILtd;)I")
    public static final int method23(class127 arg0, int arg1, class136 arg2) {
        field71++;
        int var3 = arg0.field2995;
        if (arg1 < 32) {
            method25(-76, -6, 110);
        }
        arg0.method1023(arg2.field3183, 0);
        arg0.field2995 += class41.field946.method315((byte) 91, arg0.field2960, 0, arg0.field2995, arg2.field3183, arg2.field3182);
        return arg0.field2995 - var3;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static void method24(int arg0) {
        field83 = null;
        field67 = null;
        field74 = null;
        field72 = null;
        field70 = null;
        field82 = null;
        field69 = null;
        if (arg0 != 8) {
            field88 = 27;
        }
        field77 = null;
        field86 = null;
        field84 = null;
        field81 = null;
        field80 = null;
        field87 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
    public static final void method25(int arg0, int arg1, int arg2) {
        class69 var3 = class93.field2197[class62.field1331][arg1][arg2];
        field68++;
        if (var3 == null) {
            class146.field3366.method769(class62.field1331, arg1, arg2);
            return;
        }
        class106 var4 = (class106) var3.method512(0);
        class106 var5 = null;
        int var6 = -99999999;
        while (var4 != null) {
            class121 var11 = class63.method472(var4.field2499, (byte) 116);
            int var12 = var11.field2812;
            if (var11.field2761 == 1) {
                var12 = (var4.field2495 + 1) * var12;
            }
            if (var12 > var6) {
                var6 = var12;
                var5 = var4;
            }
            var4 = (class106) var3.method520((byte) 127);
        }
        if (var5 == null) {
            class146.field3366.method769(class62.field1331, arg1, arg2);
        } else if (arg0 == 6012) {
            class106 var7 = null;
            class106 var8 = null;
            var3.method513(var5, 44);
            for (class106 var9 = (class106) var3.method512(0); var9 != null; var9 = (class106) var3.method520((byte) 32)) {
                if (var5.field2499 != var9.field2499) {
                    if (var8 == null) {
                        var8 = var9;
                    }
                    if (var8.field2499 != var9.field2499 && var7 == null) {
                        var7 = var9;
                    }
                }
            }
            int var10 = (arg2 << 7) + arg1 + 1610612736;
            class146.field3366.method775(class62.field1331, arg1, arg2, class65.method486(class62.field1331, (byte) -42, arg2 * 128 + 64, arg1 * 128 + 64), var5, var10, var8, var7);
        }
    }

    @OriginalMember(owner = "client!ac", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field79.paint(arg0);
        field78++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lmd;BLmd;)V")
    public static final void method26(class87 arg0, byte arg1, class87 arg2) {
        if (arg1 >= -36) {
            field70 = null;
        }
        class51.field1150 = arg0;
        field76++;
        class69.field1466 = arg2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static final void method27(byte arg0) {
        field75++;
        class133.method1082(false, (byte) 124);
        boolean var1 = true;
        class35.field842 = 0;
        for (int var2 = 0; var2 < class54.field1197.length; var2++) {
            if (class56.field1277[var2] != -1 && class54.field1197[var2] == null) {
                class54.field1197[var2] = class122.field2844.method669(0, class56.field1277[var2], -67);
                if (class54.field1197[var2] == null) {
                    class35.field842++;
                    var1 = false;
                }
            }
            if (class101.field2426[var2] != -1 && class88.field2091[var2] == null) {
                class88.field2091[var2] = class122.field2844.method664(class101.field2426[var2], class65.field1397[var2], 98, 0);
                if (class88.field2091[var2] == null) {
                    var1 = false;
                    class35.field842++;
                }
            }
        }
        if (!var1) {
            class86.field2026 = 1;
            return;
        }
        boolean var3 = true;
        class113.field2622 = 0;
        for (int var4 = 0; var4 < class54.field1197.length; var4++) {
            byte[] var56 = class88.field2091[var4];
            if (var56 != null) {
                int var57 = (class108.field2564[var4] & 0xFF) * 64 - class52.field1176;
                int var58 = (class108.field2564[var4] >> 8) * 64 - class91.field2145;
                if (class154.field3529) {
                    var58 = 10;
                    var57 = 10;
                }
                var3 &= class21.method159(var56, -101, var58, var57);
            }
        }
        if (!var3) {
            class86.field2026 = 2;
            return;
        }
        if (class86.field2026 != 0) {
            class105.method843(true, class79.method570(0, new class136[] { class47.field1073, class127.field3018 }), true);
        }
        class21.method155(119);
        class5.method32((byte) -107);
        class21.method155(110);
        class146.field3366.method761();
        class21.method155(114);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            field83[var5].method616(2);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class125.field2895[var6][var54][var55] = 0;
                }
            }
        }
        class21.method155(116);
        class109.method860((byte) 77);
        int var7 = class54.field1197.length;
        class13.method90(false);
        class133.method1082(true, (byte) 51);
        if (!class154.field3529) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class108.field2564[var8] & 0xFF) * 64 - class52.field1176;
                int var18 = (class108.field2564[var8] >> 8) * 64 - class91.field2145;
                byte[] var19 = class54.field1197[var8];
                if (var19 != null) {
                    class21.method155(111);
                    class146.method1177((class132.field3110 - 6) * 8, (byte) 116, var19, field83, var17, var18, (class54.field1203 - 6) * 8);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class108.field2564[var9] >> 8) * 64 - class91.field2145;
                int var15 = (class108.field2564[var9] & 0xFF) * 64 - class52.field1176;
                byte[] var16 = class54.field1197[var9];
                if (var16 == null && class54.field1203 < 800) {
                    class21.method155(119);
                    class87.method650(var14, 64, 64, (byte) 125, var15);
                }
            }
            class133.method1082(true, (byte) 103);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class88.field2091[var10];
                if (var11 != null) {
                    int var12 = (class108.field2564[var10] >> 8) * 64 - class91.field2145;
                    int var13 = (class108.field2564[var10] & 0xFF) * 64 - class52.field1176;
                    class21.method155(114);
                    class41.method343(var13, var12, class146.field3366, var11, field83, 8);
                }
            }
        }
        if (class154.field3529) {
            for (int var20 = 0; var20 < 4; var20++) {
                class21.method155(114);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        int var36 = class73.field1538[var20][var34][var35];
                        boolean var37 = false;
                        if (var36 != -1) {
                            int var38 = var36 >> 24 & 0x3;
                            int var39 = var36 >> 1 & 0x3;
                            int var40 = var36 >> 14 & 0x3FF;
                            int var41 = var36 >> 3 & 0x7FF;
                            int var42 = (var40 / 8 << 8) + (var41 / 8);
                            for (int var43 = 0; var43 < class108.field2564.length; var43++) {
                                if (class108.field2564[var43] == var42 && class54.field1197[var43] != null) {
                                    class39.method332(class54.field1197[var43], 0, var35 * 8, var20, (var40 & 0x7) * 8, var39, var34 * 8, var38, (var41 & 0x7) * 8, field83);
                                    var37 = true;
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            class19.method138(var20, var35 * 8, 0, var34 * 8);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class73.field1538[0][var21][var32];
                    if (var33 == -1) {
                        class87.method650(var21 * 8, 8, 8, (byte) 123, var32 * 8);
                    }
                }
            }
            class133.method1082(true, (byte) 71);
            for (int var22 = 0; var22 < 4; var22++) {
                class21.method155(108);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class73.field1538[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 1 & 0x3;
                            int var27 = var25 >> 24 & 0x3;
                            int var28 = var25 >> 3 & 0x7FF;
                            int var29 = var25 >> 14 & 0x3FF;
                            int var30 = (var29 / 8 << 8) + (var28 / 8);
                            for (int var31 = 0; var31 < class108.field2564.length; var31++) {
                                if (class108.field2564[var31] == var30 && class88.field2091[var31] != null) {
                                    class133.method1080(var27, class88.field2091[var31], var24 * 8, (var29 & 0x7) * 8, var26, class146.field3366, true, var22, (var28 & 0x7) * 8, field83, var23 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class133.method1082(true, (byte) 94);
        class5.method32((byte) 120);
        class21.method155(107);
        class99.method802(class146.field3366, field83, 64);
        class133.method1082(true, (byte) 75);
        int var44 = class76.field1714;
        if (class62.field1331 < var44) {
            var44 = class62.field1331;
        }
        if (arg0 >= -34) {
            return;
        }
        if (var44 < class62.field1331 - 1) {
            int var45 = class62.field1331 - 1;
        }
        if (class65.field1399) {
            class146.field3366.method784(class76.field1714);
        } else {
            class146.field3366.method784(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                method25(6012, var46, var53);
            }
        }
        class21.method155(112);
        class13.method92(0);
        class128.field3040.method1165((byte) -73);
        if (class63.field1357 != null) {
            class64.field1368++;
            class15.field304.method867(206, true);
            class15.field304.method989(1057001181, (byte) 41);
        }
        if (!class154.field3529) {
            int var47 = (class132.field3110 - 6) / 8;
            int var48 = (class54.field1203 - 6) / 8;
            int var49 = (class132.field3110 + 6) / 8;
            int var50 = (class54.field1203 + 6) / 8;
            for (int var51 = var47 - 1; var51 <= var49 + 1; var51++) {
                for (int var52 = var48 - 1; var52 <= var50 + 1; var52++) {
                    if (var51 < var47 || var51 > var49 || var52 < var48 || var50 < var52) {
                        class122.field2844.method654(false, class79.method570(0, new class136[] { class13.field264, class19.method140(var51, -128), class112.field2606, class19.method140(var52, -93) }));
                        class122.field2844.method654(false, class79.method570(0, new class136[] { class136.field3195, class19.method140(var51, -80), class112.field2606, class19.method140(var52, -119) }));
                    }
                }
            }
        }
        class73.method534((byte) 73, 30);
        class21.method155(105);
        class39.method333(true);
        class15.field304.method867(161, true);
        class64.method484(false);
    }

    @OriginalMember(owner = "client!ac", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field79.update(arg0);
        field66++;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class4(Component arg0) {
        this.field79 = arg0;
    }
}
