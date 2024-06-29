import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class152 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static volatile int field3744 = -1;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Lqf;")
    private static class117 field3737 = class72.method514(108, "No reply from loginserver)3");

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "Lqf;")
    public static class117 field3748 = class72.method514(110, ":0");

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "Lqf;")
    public static class117 field3742 = class72.method514(115, "System)2Update in: ");

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field3738 = -1;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "Lqf;")
    public static class117 field3745 = class72.method514(125, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "Lqf;")
    public static class117 field3739 = class72.method514(116, "(U4");

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field3752 = 0;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "Lqf;")
    public static class117 field3755 = class72.method514(115, "Spieler");

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "[I")
    public static int[] field3736 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "Lqf;")
    public static class117 field3761 = class72.method514(122, "Regeln versto-8en hat)3");

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Lqf;")
    private static class117 field3746 = class72.method514(99, "glow1:");

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "Lqf;")
    public static class117 field3762 = class72.method514(113, "<)4col> x");

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "Lqf;")
    public static class117 field3749 = field3746;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "Lqf;")
    public static class117 field3765 = field3737;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "Lqf;")
    public static class117 field3760 = field3746;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "J")
    public static long field3763 = 0L;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Lma;")
    public static class84 field3740;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "[Lr;")
    public static class118[] field3753;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lca;ILha;B)V")
    public static final void method1209(class16 arg0, int arg1, class50 arg2, byte arg3) {
        byte[] var4 = null;
        field3759++;
        class5 var5 = class34.field710;
        synchronized (class34.field710) {
            for (class124 var6 = (class124) class34.field710.method27(18823); var6 != null; var6 = (class124) class34.field710.method25((byte) -126)) {
                if ((long) arg1 == var6.field1495 && var6.field2914 == arg0 && var6.field2929 == 0) {
                    var4 = var6.field2927;
                    break;
                }
            }
        }
        if (var4 == null) {
            int var7 = -78 % ((3 - arg3) / 60);
            byte[] var8 = arg0.method134((byte) -119, arg1);
            arg2.method367(arg0, true, true, var8, arg1);
        } else {
            arg2.method367(arg0, true, true, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIII)V")
    public static final void method1210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3758++;
        if (class3.field35 == arg0 && class94.field2284 == arg1 && (class67.field1399 == arg5 || !class20.field334)) {
            return;
        }
        class3.field35 = arg0;
        class67.field1399 = arg5;
        class94.field2284 = arg1;
        if (!class20.field334) {
            class67.field1399 = 0;
        }
        class62.method430(25, (byte) -47);
        class119.method955(class76.field1659, false, null, 3);
        int var6 = class19.field312;
        class19.field312 = (arg1 - 6) * 8;
        int var7 = class19.field312 - var6;
        int var8 = class133.field3153;
        int var9 = class19.field312;
        class133.field3153 = arg0 * 8 - 48;
        int var10 = class133.field3153 - var8;
        int var11 = class133.field3153;
        for (int var12 = 0; var12 < 32768; var12++) {
            class58 var28 = class72.field1533[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field2004[var29] -= var10;
                    var28.field1970[var29] -= var7;
                }
                var28.field1998 -= var10 * 128;
                var28.field1960 -= var7 * 128;
            }
        }
        if (arg2 < 20) {
            field3763 = -123L;
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class21 var26 = class149.field3709[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field2004[var27] -= var10;
                    var26.field1970[var27] -= var7;
                }
                var26.field1960 -= var7 * 128;
                var26.field1998 -= var10 * 128;
            }
        }
        class140.field3344 = arg5;
        class141.field3395.method685((byte) 18, false, arg3, arg4);
        byte var14 = 0;
        byte var15 = 104;
        byte var16 = 1;
        byte var17 = 0;
        byte var18 = 1;
        byte var19 = 104;
        if (var10 < 0) {
            var14 = 103;
            var16 = -1;
            var15 = -1;
        }
        if (var7 < 0) {
            var17 = 103;
            var18 = -1;
            var19 = -1;
        }
        for (int var20 = var14; var20 != var15; var20 += var16) {
            for (int var22 = var17; var22 != var19; var22 += var18) {
                int var23 = var20 + var10;
                int var24 = var7 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class43.field858[var25][var20][var22] = class43.field858[var25][var23][var24];
                    } else {
                        class43.field858[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class23 var21 = (class23) class97.field2356.method27(18823); var21 != null; var21 = (class23) class97.field2356.method25((byte) -128)) {
            var21.field450 -= var10;
            var21.field439 -= var7;
            if (var21.field450 < 0 || var21.field439 < 0 || var21.field450 >= 104 || var21.field439 >= 104) {
                var21.method495(-114);
            }
        }
        class71.field1515 = 0;
        class68.field1427 = -1;
        if (class94.field2287 != 0) {
            class94.field2287 -= var10;
            class40.field802 -= var7;
        }
        class76.field1676 = false;
        class129.field3056.method26(121);
        class133.field3141.method26(116);
    }

    @OriginalMember(owner = "client!wc", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        int var2 = class97.method764(arg0, 89);
        if (var2 >= 0) {
            int var3 = class136.field3257 + 1 & 0x7F;
            if (class68.field1421 != var3) {
                class23.field457[class136.field3257] = -1;
                class119.field2840[class136.field3257] = var2;
                class136.field3257 = var3;
            }
        }
        field3750++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII[Lmf;IIIIIIB)V")
    public static final void method1211(int arg0, int arg1, int arg2, int arg3, class89[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, byte arg11) {
        if (arg11 != 1) {
            return;
        }
        field3741++;
        if (arg3 > arg1 || arg10 > arg0 || arg2 <= arg1 || arg6 <= arg0) {
            return;
        }
        for (int var12 = 0; var12 < arg4.length; var12++) {
            class89 var13 = arg4[var12];
            if (var13 != null && var13.field2154 == arg9 && (!var13.field2102 || !class136.method1063((byte) 93, var13))) {
                int var14 = var13.field2133 + arg3 - arg7;
                int var15 = var13.field2046 + arg10 - arg8;
                if (var13.field2142 == 8 && arg1 >= var14 && var15 <= arg0 && arg1 < var14 + var13.field2152 && arg0 < var13.field2095 + var15) {
                    class134.field3169 = var12;
                }
                if ((var13.field2124 >= 0 || var13.field2153 != 0) && arg1 >= var14 && var15 <= arg0 && var14 + var13.field2152 > arg1 && arg0 < var13.field2095 + var15) {
                    if (var13.field2124 < 0) {
                        class85.field1924 = var12;
                    } else {
                        class85.field1924 = var13.field2124;
                    }
                }
                if (var13.field2142 == 0) {
                    if (!var13.field2102 && class136.method1063((byte) 67, var13) && !class82.method646(97, var12, arg5)) {
                        continue;
                    }
                    method1211(arg0, arg1, var13.field2152 + var14, var14, arg4, arg5, var13.field2095 + var15, var13.field2103, var13.field2043, var13.field2125, var15, (byte) 1);
                    if (var13.field2084 != null) {
                        method1211(arg0, arg1, var13.field2152 + var14, var14, var13.field2084, arg5, var13.field2095 + var15, var13.field2103, var13.field2043, var13.field2125, var15, (byte) 1);
                    }
                    if (var13.field2123 > var13.field2095 && !var13.field2102) {
                        class48.method343((byte) 125, var15, var13.field2152 + var14, arg0, arg1, var13, var13.field2095, arg5, var13.field2123);
                    }
                    if (!var13.field2102) {
                        continue;
                    }
                }
                if (var13.field2094 == 1 && arg1 >= var14 && arg0 >= var15 && arg1 < var14 + var13.field2152 && arg0 < var13.field2095 + var15) {
                    boolean var16 = false;
                    if (var13.field2136 != 0) {
                        var16 = class133.method1031(30, var13);
                    }
                    if (!var16) {
                        class139.method1081(0, 25, class141.field3351, var13.field2125, var13.field2148, true, 0);
                        class34.field706++;
                    }
                }
                if (var13.field2094 == 2 && !class89.field2160 && var14 <= arg1 && var15 <= arg0 && arg1 < var13.field2152 + var14 && arg0 < var13.field2095 + var15) {
                    class117 var17 = class71.method504((byte) 41, var13);
                    if (var17 != null) {
                        class21.field340++;
                        class139.method1081(-1, 52, class73.method530((byte) -83, new class117[] { class115.field2729, var13.field2121 }), var13.field2125, var17, true, 0);
                    }
                }
                if (var13.field2094 == 3 && arg1 >= var14 && arg0 >= var15 && var13.field2152 + var14 > arg1 && arg0 < var13.field2095 + var15) {
                    class19.field315++;
                    byte var18;
                    if (arg5 == 3) {
                        var18 = 9;
                    } else {
                        var18 = 20;
                    }
                    class139.method1081(0, var18, class141.field3351, var13.field2125, class115.field2734, true, 0);
                }
                if (var13.field2094 == 4 && arg1 >= var14 && var15 <= arg0 && var13.field2152 + var14 > arg1 && arg0 < var13.field2095 + var15) {
                    class139.method1081(0, 40, class141.field3351, var13.field2125, var13.field2148, true, 0);
                    class56.field1156++;
                }
                if (var13.field2094 == 5 && arg1 >= var14 && arg0 >= var15 && var14 + var13.field2152 > arg1 && var13.field2095 + var15 > arg0) {
                    class139.method1081(0, 3, class141.field3351, var13.field2125, var13.field2148, true, 0);
                    class79.field1803++;
                }
                if (var13.field2094 == 6 && class115.field2719 == -1 && var14 <= arg1 && var15 <= arg0 && var14 + var13.field2152 > arg1 && var15 + var13.field2095 > arg0) {
                    class139.method1081(-1, 32, class141.field3351, var13.field2125, var13.field2148, true, 0);
                    class23.field440++;
                }
                if (var13.field2142 == 2) {
                    int var19 = 0;
                    for (int var20 = 0; var20 < var13.field2095; var20++) {
                        for (int var21 = 0; var21 < var13.field2152; var21++) {
                            int var22 = (var13.field2089 + 32) * var20 + var15;
                            int var23 = (var13.field2080 + 32) * var21 + var14;
                            if (var19 < 20) {
                                var23 += var13.field2041[var19];
                                var22 += var13.field2104[var19];
                            }
                            if (arg1 >= var23 && arg0 >= var22 && arg1 < var23 + 32 && var22 + 32 > arg0) {
                                class44.field879 = var19;
                                class85.field1939 = var13.field2125;
                                if (var13.field2161[var19] > 0) {
                                    class72 var24 = class27.method206(var13.field2161[var19] - 1, (byte) 90);
                                    if (class90.field2179 == 1 && class116.method902(class42.method292(var13, -5447), 1)) {
                                        if (class100.field2432 != var13.field2125 || class66.field1389 != var19) {
                                            class139.method1081(var19, 41, class73.method530((byte) -83, new class117[] { class146.field3571, class92.field2242, var24.field1544 }), var13.field2125, class13.field190, true, var24.field1546);
                                            class69.field1454++;
                                        }
                                    } else if (!class89.field2160 || !class116.method902(class42.method292(var13, -5447), 1)) {
                                        class134.field3178++;
                                        class117[] var25 = var24.field1593;
                                        if (class141.field3383) {
                                            var25 = class34.method268(5, var25);
                                        }
                                        if (class116.method902(class42.method292(var13, -5447), 1)) {
                                            for (int var26 = 4; var26 >= 3; var26--) {
                                                if (var25 != null && var25[var26] != null) {
                                                    class24.field462++;
                                                    byte var27;
                                                    if (var26 == 3) {
                                                        var27 = 57;
                                                    } else {
                                                        var27 = 58;
                                                    }
                                                    class139.method1081(var19, var27, class73.method530((byte) -83, new class117[] { class56.field1148, var24.field1544 }), var13.field2125, var25[var26], true, var24.field1546);
                                                } else if (var26 == 4) {
                                                    class139.method1081(var19, 58, class73.method530((byte) -83, new class117[] { class56.field1148, var24.field1544 }), var13.field2125, class99.field2395, true, var24.field1546);
                                                    class42.field844++;
                                                }
                                            }
                                        }
                                        if (class29.method217(class42.method292(var13, -5447), (byte) -125)) {
                                            class139.method1081(var19, 6, class73.method530((byte) -83, new class117[] { class56.field1148, var24.field1544 }), var13.field2125, class13.field190, true, var24.field1546);
                                            class70.field1497++;
                                        }
                                        if (class116.method902(class42.method292(var13, arg11 - 5448), arg11) && var25 != null) {
                                            for (int var28 = 2; var28 >= 0; var28--) {
                                                if (var25[var28] != null) {
                                                    class105.field2525++;
                                                    byte var29 = 0;
                                                    if (var28 == 0) {
                                                        var29 = 50;
                                                    }
                                                    if (var28 == 1) {
                                                        var29 = 39;
                                                    }
                                                    if (var28 == 2) {
                                                        var29 = 54;
                                                    }
                                                    class139.method1081(var19, var29, class73.method530((byte) -83, new class117[] { class56.field1148, var24.field1544 }), var13.field2125, var25[var28], true, var24.field1546);
                                                }
                                            }
                                        }
                                        class117[] var30 = var13.field2026;
                                        if (class141.field3383) {
                                            var30 = class34.method268(5, var30);
                                        }
                                        if (var30 != null) {
                                            for (int var31 = 4; var31 >= 0; var31--) {
                                                if (var30[var31] != null) {
                                                    class134.field3172++;
                                                    byte var32 = 0;
                                                    if (var31 == 0) {
                                                        var32 = 36;
                                                    }
                                                    if (var31 == 1) {
                                                        var32 = 12;
                                                    }
                                                    if (var31 == 2) {
                                                        var32 = 19;
                                                    }
                                                    if (var31 == 3) {
                                                        var32 = 8;
                                                    }
                                                    if (var31 == 4) {
                                                        var32 = 34;
                                                    }
                                                    class139.method1081(var19, var32, class73.method530((byte) -83, new class117[] { class56.field1148, var24.field1544 }), var13.field2125, var30[var31], true, var24.field1546);
                                                }
                                            }
                                        }
                                        class139.method1081(var19, 1002, class73.method530((byte) -83, new class117[] { class56.field1148, var24.field1544 }), var13.field2125, class48.field998, true, var24.field1546);
                                    } else if ((class16.field228 & 0x10) == 16) {
                                        class90.field2184++;
                                        class139.method1081(var19, 21, class73.method530((byte) -83, new class117[] { class115.field2723, class92.field2242, var24.field1544 }), var13.field2125, class90.field2199, true, var24.field1546);
                                    }
                                }
                            }
                            var19++;
                        }
                    }
                }
                if (var13.field2102) {
                    if (class89.field2160) {
                        if (class100.method781(-117, class42.method292(var13, arg11 ^ -5448)) && (class16.field228 & 0x20) == 32 && arg1 >= var14 && arg0 >= var15 && var13.field2152 + var14 > arg1 && var13.field2095 + var15 > arg0) {
                            class82.field1890++;
                            class139.method1081(var13.field2122, 5, class73.method530((byte) -83, new class117[] { class115.field2723, class5.field79, var13.field2105 }), var13.field2125, class90.field2199, true, 0);
                        }
                    } else if (var14 <= arg1 && arg0 >= var15 && var13.field2152 + var14 > arg1 && arg0 < var13.field2095 + var15) {
                        for (int var33 = 9; var33 >= 5; var33--) {
                            class117 var37 = class100.method785(var33, var13, (byte) 85);
                            if (var37 != null) {
                                class139.method1081(var13.field2122, 1006, var13.field2105, var13.field2125, var37, true, var33 + 1);
                                class41.field811++;
                            }
                        }
                        class117 var34 = class71.method504((byte) 49, var13);
                        if (var34 != null) {
                            class139.method1081(var13.field2122, 52, var13.field2105, var13.field2125, var34, true, 0);
                            class21.field340++;
                        }
                        for (int var35 = 4; var35 >= 0; var35--) {
                            class117 var36 = class100.method785(var35, var13, (byte) 110);
                            if (var36 != null) {
                                class41.field811++;
                                class139.method1081(var13.field2122, 24, var13.field2105, var13.field2125, var36, true, var35 + 1);
                            }
                        }
                        if (class5.method19(class42.method292(var13, arg11 ^ 0xFFFFEAB8), (byte) -35)) {
                            class139.method1081(var13.field2122, 32, class141.field3351, var13.field2125, class19.field297, true, 0);
                            class23.field440++;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILtc;IBI)V")
    public static final void method1212(int arg0, class134 arg1, int arg2, byte arg3, int arg4) {
        field3747++;
        if (class27.field531 >= 400) {
            return;
        }
        if (arg1.field3163 != null) {
            arg1 = arg1.method1037(81);
        }
        if (arg1 == null) {
            return;
        }
        if (arg3 > -14) {
            method1214((byte) -59);
        }
        if (!arg1.field3162) {
            return;
        }
        class117 var5 = arg1.field3205;
        if (arg1.field3183 != 0) {
            var5 = class73.method530((byte) -83, new class117[] { var5, class69.method489((byte) 66, class141.field3395.field339, arg1.field3183), class125.field2940, class125.field2968, class79.method614(15591, arg1.field3183), class90.field2214 });
        }
        if (class90.field2179 == 1) {
            class139.method1081(arg0, 31, class73.method530((byte) -83, new class117[] { class146.field3571, class64.field1328, var5 }), arg4, class13.field190, true, arg2);
            class19.field313++;
        } else if (!class89.field2160) {
            class147.field3590++;
            class117[] var6 = arg1.field3193;
            if (class141.field3383) {
                var6 = class34.method268(5, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method939(-1, class52.field1068)) {
                        class130.field3074++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 43;
                        }
                        if (var7 == 1) {
                            var8 = 27;
                        }
                        if (var7 == 2) {
                            var8 = 29;
                        }
                        if (var7 == 3) {
                            var8 = 7;
                        }
                        if (var7 == 4) {
                            var8 = 30;
                        }
                        class139.method1081(arg0, var8, class73.method530((byte) -83, new class117[] { class89.field2158, var5 }), arg4, var6[var7], true, arg2);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method939(-1, class52.field1068)) {
                        class16.field229++;
                        short var10 = 0;
                        if (class141.field3395.field339 < arg1.field3183) {
                            var10 = 2000;
                        }
                        int var11 = 0;
                        if (var9 == 0) {
                            var11 = var10 + 43;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 27;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 29;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 7;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 30;
                        }
                        class139.method1081(arg0, var11, class73.method530((byte) -83, new class117[] { class89.field2158, var5 }), arg4, var6[var9], true, arg2);
                    }
                }
            }
            class139.method1081(arg0, 1007, class73.method530((byte) -83, new class117[] { class89.field2158, var5 }), arg4, class48.field998, true, arg2);
            return;
        } else if ((class16.field228 & 0x2) == 2) {
            class139.method1081(arg0, 49, class73.method530((byte) -83, new class117[] { class115.field2723, class64.field1328, var5 }), arg4, class90.field2199, true, arg2);
            class67.field1398++;
            return;
        }
    }

    @OriginalMember(owner = "client!wc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3756++;
        if (class116.field2740 != null) {
            class45.field884 = -1;
        }
    }

    @OriginalMember(owner = "client!wc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3743++;
    }

    @OriginalMember(owner = "client!wc", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3764++;
        if (class116.field2740 != null) {
            class15.field208 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class25.field493.length) {
                var3 = class25.field493[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class45.field884 >= 0 && var3 >= 0) {
                class43.field859[class45.field884] = ~var3;
                class45.field884 = class45.field884 + 1 & 0x7F;
                if (class95.field2301 == class45.field884) {
                    class45.field884 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
    public static void method1213(boolean arg0) {
        field3753 = null;
        field3745 = null;
        field3739 = null;
        field3748 = null;
        field3737 = null;
        field3765 = null;
        field3755 = null;
        if (!arg0) {
            method1212(25, null, 96, (byte) 95, 108);
        }
        field3762 = null;
        field3742 = null;
        field3736 = null;
        field3760 = null;
        field3740 = null;
        field3749 = null;
        field3761 = null;
        field3746 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public static final void method1214(byte arg0) {
        field3754++;
        try {
            Graphics var1 = class3.field64.getGraphics();
            class32.field683.method210(4, 4, (byte) 78, var1);
        } catch (Exception var2) {
            class3.field64.repaint();
        }
        if (arg0 > -110) {
            method1211(-1, -31, -82, 123, null, 71, 80, -117, 37, 3, 9, (byte) 34);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([BZB)Ljava/lang/Object;")
    public static final Object method1215(byte[] arg0, boolean arg1, byte arg2) {
        field3751++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class140.field3338) {
            try {
                class105 var3 = (class105) Class.forName("ic").getDeclaredConstructor().newInstance();
                var3.method417(64, arg0);
                return var3;
            } catch (Throwable var5) {
                class140.field3338 = true;
            }
        }
        int var4 = -28 / ((arg2 - 26) / 36);
        return arg1 ? class65.method461(arg0, 0) : arg0;
    }

    @OriginalMember(owner = "client!wc", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field3757++;
        if (class116.field2740 != null) {
            class15.field208 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class25.field493.length) {
                var3 = class25.field493[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class45.field884 >= 0 && var3 >= 0) {
                class43.field859[class45.field884] = var3;
                class45.field884 = class45.field884 + 1 & 0x7F;
                if (class95.field2301 == class45.field884) {
                    class45.field884 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class136.field3257 + 1 & 0x7F;
                if (class68.field1421 != var4) {
                    class23.field457[class136.field3257] = var3;
                    class119.field2840[class136.field3257] = -1;
                    class136.field3257 = var4;
                }
            }
        }
        arg0.consume();
    }
}
