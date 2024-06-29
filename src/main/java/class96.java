import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class96 extends class145 {

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    private final int field1963;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    private final int field1948;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    private final int field1954;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
    private final int field1967;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "Lsg;")
    public static class30 field1953 = class167.method1221((byte) 33, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "Lsg;")
    public static class30 field1961 = class167.method1221((byte) 33, "<col=c0ff00>");

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "Z")
    public static boolean field1959 = false;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "S")
    public static short field1962 = 205;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "Lsg;")
    public static class30 field1965 = class167.method1221((byte) 33, "::clientjs5drop");

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "Lsg;")
    private static class30 field1968 = class167.method1221((byte) 33, "yellow:");

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "Lsg;")
    public static class30 field1949 = field1968;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "Lsg;")
    public static class30 field1960 = field1968;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(IIIIIII)V")
    public class96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1963 = arg1;
        this.field1948 = arg3;
        this.field1954 = arg2;
        this.field1967 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)I")
    public static final int method781(int arg0, int arg1) {
        ++field1947;
        if (arg0 != -4) {
            method785((class13[]) null, false, false);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lmc;B)I")
    public static final int method782(class151 arg0, byte arg1) {
        ++field1950;
        int var2 = 0;
        if (arg0.method1112(class60.field1293, (byte) 53)) {
            ++var2;
        }
        if (arg0.method1112(class45.field1057, (byte) 50)) {
            ++var2;
        }
        if (arg0.method1112(class175.field3257, (byte) 58)) {
            ++var2;
        }
        if (arg0.method1112(class168.field3168, (byte) 119)) {
            ++var2;
        }
        if (arg1 >= -65) {
            method787(125, 33, -120, -63, (class20) null, (class20) null, -128, 97, 127L);
        }
        if (arg0.method1112(class104.field2092, (byte) 34)) {
            ++var2;
        }
        if (arg0.method1112(class79.field1709, (byte) 116)) {
            ++var2;
        }
        if (arg0.method1112(class220.field3975, (byte) 114)) {
            ++var2;
        }
        if (arg0.method1112(class176.field3273, (byte) 87)) {
            ++var2;
        }
        if (arg0.method1112(class90.field1821, (byte) 52)) {
            ++var2;
        }
        if (arg0.method1112(class177.field3288, (byte) 49)) {
            ++var2;
        }
        if (arg0.method1112(class246.field4391, (byte) 105)) {
            ++var2;
        }
        if (arg0.method1112(class32.field819, (byte) 74)) {
            ++var2;
        }
        if (arg0.method1112(class93.field1871, (byte) 109)) {
            ++var2;
        }
        if (arg0.method1112(class36.field867, (byte) 39)) {
            ++var2;
        }
        if (arg0.method1112(class203.field3629, (byte) 52)) {
            ++var2;
        }
        if (arg0.method1112(class52.field1172, (byte) 51)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIII)V")
    private static final void method783(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != -1978811924) {
            method782((class151) null, (byte) 104);
        }
        if (class48.field1096 <= arg4 && arg6 <= class252.field4458 && arg2 >= class275.field4804 && arg5 <= class167.field3064) {
            if (~arg1 != -2) {
                class50.method493(arg2, (byte) 72, arg4, arg6, arg3, arg5, arg1);
            } else {
                class203.method1435(arg2, arg0 + 1978808668, arg4, arg6, arg3, arg5);
            }
        } else if (~arg1 != -2) {
            class260.method1801(-29121, arg3, arg1, arg6, arg5, arg4, arg2);
        } else {
            class153.method1149((byte) -100, arg3, arg4, arg2, arg6, arg5);
        }
        ++field1946;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static void method784(byte arg0) {
        field1953 = null;
        if (arg0 != -59) {
            method782((class151) null, (byte) 111);
        }
        field1968 = null;
        field1961 = null;
        field1965 = null;
        field1960 = null;
        field1949 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([Lue;ZZ)V")
    public static final void method785(class13[] arg0, boolean arg1, boolean arg2) {
        ++field1951;
        if (!arg2) {
            for (int var3 = 0; ~var3 > -5; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; ~var5 > -105; ++var5) {
                        if (~(class272.field4771[var3][var4][var5] & 1) == -2) {
                            int var6 = var3;
                            if (~(class272.field4771[1][var4][var5] & 2) == -3) {
                                var6 = var3 - 1;
                            }
                            if (~var6 <= -1) {
                                arg0[var6].method134(2097152, var4, var5);
                            }
                        }
                    }
                }
            }
            class215.field3936 += -2 + (int) (5.0D * Math.random());
            class59.field1275 += -2 + (int) (5.0D * Math.random());
            if (class59.field1275 < -8) {
                class59.field1275 = -8;
            }
            if (class215.field3936 < -16) {
                class215.field3936 = -16;
            }
            if (class215.field3936 > 16) {
                class215.field3936 = 16;
            }
            if (class59.field1275 > 8) {
                class59.field1275 = 8;
            }
        }
        byte var7;
        if (arg2) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        int var8 = class215.field3936 >> 1;
        int[][] var9 = new int[104][104];
        int var10 = class59.field1275 >> 2 << 10;
        if (arg1) {
            method786(-109, -13, -28, -36, 70, -24, 66, false, 17, 55, false, 18);
        }
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var7 > var12; ++var12) {
            byte[][] var51 = class166.field3050[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; ++var54) {
                for (int var100 = 1; var100 < 103; ++var100) {
                    int var101 = class242.field4333[var12][var100 + 1][var54] + -class242.field4333[var12][var100 + -1][var54];
                    int var102 = class242.field4333[var12][var100][var54 + 1] + -class242.field4333[var12][var100][var54 + -1];
                    byte var103 = 74;
                    int var104 = (int) Math.sqrt((double) (var101 * var101 + var102 * var102 + 65536));
                    int var105 = (var101 << 8) / var104;
                    int var106 = (var102 << 8) / var104;
                    int var107 = (var51[var100][var54] >> 1) + (var51[var100][var54 + 1] >> 3) + (var51[var100][var54 + -1] >> 2) + (var51[var100 + 1][var54] >> 3) + (var51[var100 + -1][var54] >> 2);
                    int var108 = -65536 / var104;
                    int var109 = (var106 * -50 + var105 * -50 + var108 * -10) / var53 + var103;
                    var9[var100][var54] = -var107 + var109;
                }
            }
            for (int var55 = 0; var55 < 104; ++var55) {
                class189.field3446[var55] = 0;
                class170.field3203[var55] = 0;
                class30.field599[var55] = 0;
                class32.field810[var55] = 0;
                class232.field4142[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; ++var56) {
                for (int var85 = 0; var85 < 104; ++var85) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = class180.field3330[var12][var94][var85] & 255;
                        if (~var95 < -1) {
                            class169 var96 = class236.method1678(1, var95 + -1);
                            class189.field3446[var85] += var96.field3179;
                            class170.field3203[var85] += var96.field3183;
                            class30.field599[var85] += var96.field3181;
                            class32.field810[var85] += var96.field3177;
                            var10002 = class232.field4142[var85]++;
                        }
                    }
                    int var97 = var56 + -5;
                    if (var97 >= 0) {
                        int var98 = 255 & class180.field3330[var12][var97][var85];
                        if (~var98 < -1) {
                            class169 var99 = class236.method1678(1, var98 + -1);
                            class189.field3446[var85] -= var99.field3179;
                            class170.field3203[var85] -= var99.field3183;
                            class30.field599[var85] -= var99.field3181;
                            class32.field810[var85] -= var99.field3177;
                            var10002 = class232.field4142[var85]--;
                        }
                    }
                }
                if (~var56 <= -1) {
                    int var86 = 0;
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    for (int var91 = -5; ~var91 > -105; ++var91) {
                        int var92 = var91 + 5;
                        if (var92 < 104) {
                            var87 += class32.field810[var92];
                            var90 += class170.field3203[var92];
                            var86 += class189.field3446[var92];
                            var88 += class30.field599[var92];
                            var89 += class232.field4142[var92];
                        }
                        int var93 = var91 + -5;
                        if (~var93 <= -1) {
                            var88 -= class30.field599[var93];
                            var90 -= class170.field3203[var93];
                            var86 -= class189.field3446[var93];
                            var89 -= class232.field4142[var93];
                            var87 -= class32.field810[var93];
                        }
                        if (~var91 <= -1 && var89 > 0) {
                            var11[var56][var91] = class195.method1413(var86 * 256 / var87, var88 / var89, var90 / var89, (byte) -126);
                        }
                    }
                }
            }
            for (int var57 = 1; ~var57 > -104; ++var57) {
                for (int var58 = 1; var58 < 103; ++var58) {
                    if (arg2 || class81.method703(-15861) || ~(2 & class272.field4771[0][var57][var58]) != -1 || (class272.field4771[var12][var57][var58] & 16) == 0 && class246.method1730((byte) 51, var58, var12, var57) == class109.field2191) {
                        if (~class239.field4249 < ~var12) {
                            class239.field4249 = var12;
                        }
                        int var59 = class180.field3330[var12][var57][var58] & 255;
                        int var60 = class244.field4367[var12][var57][var58] & 255;
                        if (~var59 < -1 || ~var60 < -1) {
                            int var61 = class242.field4333[var12][var57][var58];
                            int var62 = class242.field4333[var12][var57 - -1][var58];
                            int var63 = class242.field4333[var12][var57 - -1][var58 + 1];
                            int var64 = class242.field4333[var12][var57][var58 + 1];
                            if (~var12 < -1) {
                                boolean var65 = true;
                                if (~var59 == -1 && ~class231.field4111[var12][var57][var58] != -1) {
                                    var65 = false;
                                }
                                if (var60 > 0 && !class253.method1760(var60 + -1, !arg1).field2653) {
                                    var65 = false;
                                }
                                if (var65 && ~var61 == ~var62 && ~var61 == ~var63 && ~var61 == ~var64) {
                                    class194.field3505[var12][var57][var58] = class182.method1314(class194.field3505[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var67;
                            if (var59 <= 0) {
                                var66 = 0;
                                var67 = -1;
                            } else {
                                var67 = var11[var57][var58];
                                int var68 = (var67 & 127) + var8;
                                if (var68 >= 0) {
                                    if (~var68 < -128) {
                                        var68 = 127;
                                    }
                                } else {
                                    var68 = 0;
                                }
                                int var69 = (var10 + var67 & 64512) + var68 - -(var67 & 896);
                                var66 = class213.field3857[class115.method894(arg1, 96, var69)];
                            }
                            int var70 = var9[var57][var58];
                            int var71 = var9[var57 + 1][var58];
                            int var72 = var9[var57 - -1][var58 + 1];
                            int var73 = var9[var57][var58 + 1];
                            if (~var60 != -1) {
                                int var74 = class231.field4111[var12][var57][var58] - -1;
                                byte var75 = class16.field329[var12][var57][var58];
                                class136 var76 = class253.method1760(var60 - 1, true);
                                int var77 = var76.field2667;
                                if (~var77 <= -1 && !class213.field3850.method509(var77, (byte) -51)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var81;
                                if (var77 < 0) {
                                    if (var76.field2664 != -1) {
                                        var78 = var76.field2664;
                                        int var79 = (127 & var78) + var8;
                                        if (~var79 <= -1) {
                                            if (~var79 < -128) {
                                                var79 = 127;
                                            }
                                        } else {
                                            var79 = 0;
                                        }
                                        int var80 = (64512 & var10 + var78) + (896 & var78) + var79;
                                        var81 = class213.field3857[class24.method214(19643, 96, var80)];
                                    } else {
                                        var78 = -2;
                                        var81 = 0;
                                    }
                                } else {
                                    var78 = -1;
                                    var81 = class213.field3857[class24.method214(19643, 96, class213.field3850.method510(var77, (byte) 40))];
                                }
                                if (~var76.field2652 <= -1) {
                                    int var82 = var76.field2652;
                                    int var83 = (var82 & 127) + var8;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (~var83 < -128) {
                                        var83 = 127;
                                    }
                                    int var84 = (64512 & var10 + var82) + (var82 & 896) + var83;
                                    var81 = class213.field3857[class24.method214(19643, 96, var84)];
                                }
                                class235.method1671(var12, var57, var58, var74, var75, var77, var61, var62, var63, var64, class115.method894(false, var70, var67), class115.method894(arg1, var71, var67), class115.method894(false, var72, var67), class115.method894(false, var73, var67), class24.method214(19643, var70, var78), class24.method214(19643, var71, var78), class24.method214(19643, var72, var78), class24.method214(19643, var73, var78), var66, var81);
                            } else {
                                class235.method1671(var12, var57, var58, 0, 0, -1, var61, var62, var63, var64, class115.method894(arg1, var70, var67), class115.method894(arg1, var71, var67), class115.method894(false, var72, var67), class115.method894(false, var73, var67), 0, 0, 0, 0, var66, 0);
                            }
                        }
                    }
                }
            }
            class180.field3330[var12] = null;
            class244.field4367[var12] = null;
            class231.field4111[var12] = null;
            class16.field329[var12] = null;
            class166.field3050[var12] = null;
        }
        class247.method1739(-50, -10, -50);
        if (!arg2) {
            for (int var13 = 0; ~var13 > -105; ++var13) {
                for (int var50 = 0; ~var50 > -105; ++var50) {
                    if ((2 & class272.field4771[1][var13][var50]) == 2) {
                        class256.method1776(var13, var50);
                    }
                }
            }
            for (int var14 = 0; var14 < 4; ++var14) {
                for (int var15 = 0; ~var15 >= -105; ++var15) {
                    for (int var16 = 0; var16 <= 104; ++var16) {
                        if ((class194.field3505[var14][var16][var15] & 1) != 0) {
                            int var17 = var15;
                            int var18 = var14;
                            while (var17 > 0 && (1 & class194.field3505[var14][var16][var17 + -1]) != 0) {
                                --var17;
                            }
                            int var19 = var14;
                            int var20;
                            for (var20 = var15; var20 < 104 && ~(1 & class194.field3505[var14][var16][var20 + 1]) != -1; ++var20) {
                            }
                            label359: while (var18 > 0) {
                                for (int var21 = var17; var20 >= var21; ++var21) {
                                    if (~(1 & class194.field3505[var18 + -1][var16][var21]) == -1) {
                                        break label359;
                                    }
                                }
                                --var18;
                            }
                            label348: while (~var19 > -4) {
                                for (int var22 = var17; ~var20 <= ~var22; ++var22) {
                                    if ((1 & class194.field3505[var19 + 1][var16][var22]) == 0) {
                                        break label348;
                                    }
                                }
                                ++var19;
                            }
                            int var23 = (var20 - -1 + -var17) * (-var18 + 1 + var19);
                            if (~var23 <= -9) {
                                short var24 = 240;
                                int var25 = class242.field4333[var19][var16][var17] - var24;
                                int var26 = class242.field4333[var18][var16][var17];
                                class157.method1170(1, var16 * 128, var16 * 128, var17 * 128, var20 * 128 + 128, var25, var26);
                                for (int var27 = var18; ~var27 >= ~var19; ++var27) {
                                    for (int var28 = var17; ~var20 <= ~var28; ++var28) {
                                        class194.field3505[var27][var16][var28] = class68.method612(class194.field3505[var27][var16][var28], -2);
                                    }
                                }
                            }
                        }
                        if (~(2 & class194.field3505[var14][var16][var15]) != -1) {
                            int var29;
                            for (var29 = var16; ~var29 < -1 && ~(class194.field3505[var14][var29 - 1][var15] & 2) != -1; --var29) {
                            }
                            int var30;
                            for (var30 = var16; ~var30 > -105 && (2 & class194.field3505[var14][var30 + 1][var15]) != 0; ++var30) {
                            }
                            int var31;
                            label414: for (var31 = var14; var31 > 0; --var31) {
                                for (int var32 = var29; ~var30 <= ~var32; ++var32) {
                                    if ((2 & class194.field3505[var31 + -1][var32][var15]) == 0) {
                                        break label414;
                                    }
                                }
                            }
                            int var33;
                            label402: for (var33 = var14; ~var33 > -4; ++var33) {
                                for (int var34 = var29; ~var34 >= ~var30; ++var34) {
                                    if ((class194.field3505[var33 + 1][var34][var15] & 2) == 0) {
                                        break label402;
                                    }
                                }
                            }
                            int var35 = (var33 - -1 + -var31) * (-var29 + 1 + var30);
                            if (var35 >= 8) {
                                short var36 = 240;
                                int var37 = class242.field4333[var31][var29][var15];
                                int var38 = class242.field4333[var33][var29][var15] + -var36;
                                class157.method1170(2, var29 * 128, var30 * 128 - -128, var15 * 128, var15 * 128, var38, var37);
                                for (int var39 = var31; var39 <= var33; ++var39) {
                                    for (int var40 = var29; ~var30 <= ~var40; ++var40) {
                                        class194.field3505[var39][var40][var15] = class68.method612(class194.field3505[var39][var40][var15], -3);
                                    }
                                }
                            }
                        }
                        if ((class194.field3505[var14][var16][var15] & 4) != 0) {
                            int var41 = var16;
                            int var42 = var16;
                            int var43;
                            for (var43 = var15; var43 > 0 && ~(class194.field3505[var14][var16][var43 + -1] & 4) != -1; --var43) {
                            }
                            int var44;
                            for (var44 = var15; var44 < 104 && (4 & class194.field3505[var14][var16][var44 + 1]) != 0; ++var44) {
                            }
                            label469: while (~var41 < -1) {
                                for (int var45 = var43; var45 <= var44; ++var45) {
                                    if ((class194.field3505[var14][var41 + -1][var45] & 4) == 0) {
                                        break label469;
                                    }
                                }
                                --var41;
                            }
                            label458: while (var42 < 104) {
                                for (int var46 = var43; var44 >= var46; ++var46) {
                                    if (~(4 & class194.field3505[var14][var42 - -1][var46]) == -1) {
                                        break label458;
                                    }
                                }
                                ++var42;
                            }
                            if ((var42 - var41 + 1) * (-var43 + var44 + 1) >= 4) {
                                int var47 = class242.field4333[var14][var41][var43];
                                class157.method1170(4, var41 * 128, var42 * 128 + 128, var43 * 128, var44 * 128 - -128, var47, var47);
                                for (int var48 = var41; var48 <= var42; ++var48) {
                                    for (int var49 = var43; var44 >= var49; ++var49) {
                                        class194.field3505[var14][var48][var49] = class68.method612(class194.field3505[var14][var48][var49], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIIZIIZI)Z")
    public static final boolean method786(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10, int arg11) {
        ++field1957;
        if (class247.field4394.method574(!arg10) == 2) {
            return class13.method124(arg6, arg0, arg5, arg4, arg2, arg8, arg11, arg7, arg1, arg9, (byte) -12, arg3);
        } else if (~class247.field4394.method574(true) < -3) {
            return class104.method839(arg1, arg8, 1, arg11, class247.field4394.method574(true), arg7, arg2, arg6, arg4, arg5, arg9, arg0, arg3);
        } else {
            if (arg10) {
                field1962 = 118;
            }
            return class133.method1007(arg6, arg2, arg3, arg9, arg11, (byte) -96, arg5, arg1, arg0, arg8, arg4, arg7);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIILni;Lni;IIJ)V")
    public static final void method787(int arg0, int arg1, int arg2, int arg3, class20 arg4, class20 arg5, int arg6, int arg7, long arg8) {
        if (arg4 != null || arg5 != null) {
            class225 var10 = new class225();
            var10.field4039 = arg8;
            var10.field4025 = arg1 * 128 + 64;
            var10.field4038 = arg2 * 128 + 64;
            var10.field4032 = arg3;
            var10.field4031 = arg4;
            var10.field4029 = arg5;
            var10.field4023 = arg6;
            var10.field4030 = arg7;
            for (int var11 = arg0; var11 >= 0; --var11) {
                if (class71.field1613[var11][arg1][arg2] == null) {
                    class71.field1613[var11][arg1][arg2] = new class195(var11, arg1, arg2);
                }
            }
            class71.field1613[arg0][arg1][arg2].field3532 = var10;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
    public final void method788(int arg0, int arg1, int arg2) {
        ++field1955;
        int var4 = this.field1954 * arg2 >> 12;
        if (arg1 > 120) {
            int var5 = this.field1967 * arg2 >> 12;
            int var6 = this.field1963 * arg0 >> 12;
            int var7 = this.field1948 * arg0 >> 12;
            method783(-1978811924, super.field2784, var6, super.field2779, var5, var7, var4);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lmc;ILmc;)I")
    public static final int method789(class151 arg0, int arg1, class151 arg2) {
        ++field1952;
        int var3 = arg1;
        if (arg2.method1112(class231.field4100, (byte) 80)) {
            var3 = arg1 + 1;
        }
        if (arg2.method1112(class110.field2201, (byte) 72)) {
            ++var3;
        }
        if (arg2.method1112(class271.field4764, (byte) 34)) {
            ++var3;
        }
        if (arg0.method1112(class231.field4100, (byte) 104)) {
            ++var3;
        }
        if (arg0.method1112(class110.field2201, (byte) 41)) {
            ++var3;
        }
        if (arg0.method1112(class271.field4764, (byte) 121)) {
            ++var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(ZII)V")
    public final void method790(boolean arg0, int arg1, int arg2) {
        ++field1958;
        if (arg0) {
            field1965 = null;
        }
        int var4 = this.field1954 * arg2 >> 12;
        int var5 = this.field1967 * arg2 >> 12;
        int var6 = this.field1948 * arg1 >> 12;
        int var7 = this.field1963 * arg1 >> 12;
        class150.method1090(123, super.field2784, super.field2779, var4, super.field2787, var6, var5, var7);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ldl;I)V")
    public static final void method791(class31 arg0, int arg1) {
        ++field1956;
        if (arg1 <= -48) {
            int var2 = arg0.field664;
            if (~var2 == -325) {
                if (~class8.field162 == 0) {
                    class8.field162 = arg0.field678;
                    class78.field1698 = arg0.field705;
                }
                if (!class185.field3380.field3381) {
                    arg0.field678 = class78.field1698;
                } else {
                    arg0.field678 = class8.field162;
                }
            } else if (~var2 == -326) {
                if (~class8.field162 == 0) {
                    class78.field1698 = arg0.field705;
                    class8.field162 = arg0.field678;
                }
                if (class185.field3380.field3381) {
                    arg0.field678 = class78.field1698;
                } else {
                    arg0.field678 = class8.field162;
                }
            } else if (var2 == 327) {
                arg0.field685 = 150;
                arg0.field639 = (int) (256.0D * Math.sin((double) class133.field2617 / 40.0D)) & 2047;
                arg0.field792 = 5;
                arg0.field715 = -1;
            } else if (var2 == 328) {
                if (class247.field4394.field2349 == null) {
                    arg0.field715 = 0;
                } else {
                    arg0.field685 = 150;
                    arg0.field639 = 2047 & (int) (256.0D * Math.sin((double) class133.field2617 / 40.0D));
                    arg0.field792 = 5;
                    arg0.field715 = ((int) class247.field4394.field2349.method297((byte) -72) << 11) - -2047;
                    arg0.field738 = class247.field4394.field1351;
                    arg0.field778 = class247.field4394.field1370;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZII)V")
    public final void method792(boolean arg0, int arg1, int arg2) {
        ++field1964;
        int var4 = this.field1954 * arg1 >> 12;
        int var5 = this.field1963 * arg2 >> 12;
        if (arg0) {
            method787(-60, -6, 37, -17, (class20) null, (class20) null, -15, 65, 29L);
        }
        int var6 = this.field1948 * arg2 >> 12;
        int var7 = this.field1967 * arg1 >> 12;
        class204.method1441(var5, var6, 76, var7, super.field2787, var4);
    }
}
