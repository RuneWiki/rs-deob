import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class122 extends class131 {

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    private int field1734 = -1;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "Lpk;")
    private class43 field1752 = null;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    private int field1739 = -32768;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "Z")
    private boolean field1755 = false;

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
    private int field1759 = -1;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
    private int field1736;

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "I")
    private int field1748;

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "I")
    private int field1746;

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "I")
    private int field1761;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    private int field1758;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    private int field1729;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "Lrj;")
    private class274 field1735;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    private int field1728;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
    private int field1745;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    private int field1731;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    private int field1730;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1733 = "Loading sprites - ";

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Lqd;")
    private class162 field1727;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "Lbc;")
    public static class282 field1756;

    @OriginalMember(owner = "client!gg", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1747++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z[Lhl;[[[II)V")
    public static final void method793(boolean arg0, class137[] arg1, int[][][] arg2, int arg3) {
        field1742++;
        byte var4;
        if (arg0) {
            var4 = 1;
        } else {
            var4 = 4;
        }
        if (!arg0) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < 104; var6++) {
                    for (int var7 = 0; var7 < 104; var7++) {
                        if ((class241.field3507[var5][var6][var7] & 0x1) == 1) {
                            int var8 = var5;
                            if ((class241.field3507[1][var6][var7] & 0x2) == 2) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method898(20532, var7, var6);
                            }
                        }
                    }
                }
            }
            class145.field2124 += (int) (Math.random() * 5.0D) - 2;
            class254.field3668 += (int) (Math.random() * 5.0D) - 2;
            if (class145.field2124 < -16) {
                class145.field2124 = -16;
            }
            if (class145.field2124 > 16) {
                class145.field2124 = 16;
            }
            if (class254.field3668 < -8) {
                class254.field3668 = -8;
            }
            if (class254.field3668 > 8) {
                class254.field3668 = 8;
            }
        }
        int var9 = class254.field3668 >> 2 << 10;
        int var10 = class145.field2124 >> 1;
        if (arg3 < 106) {
            method800(-94, (class82) null, 117, -120, (byte) -87);
        }
        int[][] var11 = new int[104][104];
        int[][] var12 = new int[104][104];
        for (int var13 = 0; var13 < var4; var13++) {
            byte[][] var52 = class263.field3812[var13];
            int var53 = (int) Math.sqrt(5100.0D);
            int var54 = var53 * 768 >> 8;
            for (int var55 = 1; var55 < 103; var55++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    byte var102 = 74;
                    int var103 = class290.field4536[var13][var101 + 1][var55] - class290.field4536[var13][var101 - 1][var55];
                    int var104 = class290.field4536[var13][var101][var55 + 1] - class290.field4536[var13][var101][var55 - 1];
                    int var105 = (int) Math.sqrt((double) (var103 * var103 + (var104 * var104) + 65536));
                    int var106 = (var103 << 8) / var105;
                    int var107 = -65536 / var105;
                    int var108 = (var104 << 8) / var105;
                    int var109 = (var108 * -50 + (var106 * -50 + (var107 * -10))) / var54 + var102;
                    int var110 = (var52[var101][var55 + 1] >> 3) + (var52[var101][var55 - 1] >> 2) + (var52[var101 + 1][var55] >> 3) + (var52[var101 + -1][var55] >> 2) + (var52[var101][var55] >> 1);
                    var12[var101][var55] = var109 - var110;
                }
            }
            for (int var56 = 0; var56 < 104; var56++) {
                class44.field525[var56] = 0;
                class95.field1274[var56] = 0;
                class4.field57[var56] = 0;
                class204.field2909[var56] = 0;
                class39.field470[var56] = 0;
            }
            for (int var57 = -5; var57 < 104; var57++) {
                for (int var86 = 0; var86 < 104; var86++) {
                    int var95 = var57 + 5;
                    int var10002;
                    if (var95 < 104) {
                        int var96 = class53.field602[var13][var95][var86] & 0xFF;
                        if (var96 > 0) {
                            class19 var97 = class1.method7(var96 - 1, -5629);
                            class44.field525[var86] += var97.field235;
                            class95.field1274[var86] += var97.field239;
                            class4.field57[var86] += var97.field228;
                            class204.field2909[var86] += var97.field227;
                            var10002 = class39.field470[var86]++;
                        }
                    }
                    int var98 = var57 - 5;
                    if (var98 >= 0) {
                        int var99 = class53.field602[var13][var98][var86] & 0xFF;
                        if (var99 > 0) {
                            class19 var100 = class1.method7(var99 - 1, -5629);
                            class44.field525[var86] -= var100.field235;
                            class95.field1274[var86] -= var100.field239;
                            class4.field57[var86] -= var100.field228;
                            class204.field2909[var86] -= var100.field227;
                            var10002 = class39.field470[var86]--;
                        }
                    }
                }
                if (var57 >= 0) {
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    int var91 = 0;
                    for (int var92 = -5; var92 < 104; var92++) {
                        int var93 = var92 + 5;
                        int var94 = var92 - 5;
                        if (var93 < 104) {
                            var91 += class4.field57[var93];
                            var87 += class44.field525[var93];
                            var88 += class204.field2909[var93];
                            var90 += class39.field470[var93];
                            var89 += class95.field1274[var93];
                        }
                        if (var94 >= 0) {
                            var87 -= class44.field525[var94];
                            var91 -= class4.field57[var94];
                            var89 -= class95.field1274[var94];
                            var88 -= class204.field2909[var94];
                            var90 -= class39.field470[var94];
                        }
                        if (var92 >= 0 && var90 > 0) {
                            var11[var57][var92] = class233.method1516(var91 / var90, var87 * 256 / var88, -27242, var89 / var90);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var59 = 1; var59 < 103; var59++) {
                    if (arg0 || class176.method1141(1) || (class241.field3507[0][var58][var59] & 0x2) != 0 || (class241.field3507[var13][var58][var59] & 0x10) == 0 && class101.method618(var13, false, var58, var59) == class251.field3626) {
                        if (var13 < class2.field30) {
                            class2.field30 = var13;
                        }
                        int var60 = class27.field324[var13][var58][var59] & 0xFF;
                        int var61 = class53.field602[var13][var58][var59] & 0xFF;
                        if (var61 > 0 || var60 > 0) {
                            int var62 = class290.field4536[var13][var58][var59];
                            int var63 = class290.field4536[var13][var58 + 1][var59];
                            int var64 = class290.field4536[var13][var58 + 1][var59 + 1];
                            int var65 = class290.field4536[var13][var58][var59 + 1];
                            if (var13 > 0) {
                                boolean var66 = true;
                                if (var61 == 0 && class93.field1254[var13][var58][var59] != 0) {
                                    var66 = false;
                                }
                                if (var60 > 0 && !class224.method1452(var60 - 1, 4).field2180) {
                                    var66 = false;
                                }
                                if (var66 && var62 == var63 && var62 == var64 && var62 == var65) {
                                    class64.field751[var13][var58][var59] = class220.method1432(class64.field751[var13][var58][var59], 4);
                                }
                            }
                            int var67;
                            int var68;
                            if (var61 <= 0) {
                                var67 = -1;
                                var68 = 0;
                            } else {
                                var67 = var11[var58][var59];
                                int var69 = (var67 & 0x7F) + var10;
                                if (var69 < 0) {
                                    var69 = 0;
                                } else if (var69 > 127) {
                                    var69 = 127;
                                }
                                int var70 = (var9 + var67 & 0xFC00) + (var67 & 0x380) + var69;
                                var68 = class297.field4693[class145.method949(65408, var70, 96)];
                            }
                            int var71 = var12[var58 + 1][var59];
                            int var72 = var12[var58][var59];
                            int var73 = var12[var58 + 1][var59 + 1];
                            int var74 = var12[var58][var59 + 1];
                            if (var60 == 0) {
                                class46.method291(var13, var58, var59, 0, 0, -1, var62, var63, var64, var65, class145.method949(65408, var67, var72), class145.method949(65408, var67, var71), class145.method949(65408, var67, var73), class145.method949(65408, var67, var74), 0, 0, 0, 0, var68, 0);
                            } else {
                                int var75 = class93.field1254[var13][var58][var59] + 1;
                                byte var76 = class143.field2044[var13][var58][var59];
                                class150 var77 = class224.method1452(var60 - 1, 4);
                                int var78 = var77.field2186;
                                if (var78 >= 0 && !class297.field4685.method771(var78, 80)) {
                                    var78 = -1;
                                }
                                int var79;
                                int var80;
                                if (var78 >= 0) {
                                    var79 = class297.field4693[class229.method1487(class297.field4685.method776((byte) 11, var78), 96, (byte) -84)];
                                    var80 = -1;
                                } else if (var77.field2178 == -1) {
                                    var79 = 0;
                                    var80 = -2;
                                } else {
                                    var80 = var77.field2178;
                                    int var81 = (var80 & 0x7F) + var10;
                                    if (var81 < 0) {
                                        var81 = 0;
                                    } else if (var81 > 127) {
                                        var81 = 127;
                                    }
                                    int var82 = (var9 + var80 & 0xFC00) + (var80 & 0x380) + var81;
                                    var79 = class297.field4693[class229.method1487(var82, 96, (byte) -84)];
                                }
                                if (var77.field2181 >= 0) {
                                    int var83 = var77.field2181;
                                    int var84 = (var83 & 0x7F) + var10;
                                    if (var84 < 0) {
                                        var84 = 0;
                                    } else if (var84 > 127) {
                                        var84 = 127;
                                    }
                                    int var85 = (var9 + var83 & 0xFC00) + (var83 & 0x380) + var84;
                                    var79 = class297.field4693[class229.method1487(var85, 96, (byte) -84)];
                                }
                                class46.method291(var13, var58, var59, var75, var76, var78, var62, var63, var64, var65, class145.method949(65408, var67, var72), class145.method949(65408, var67, var71), class145.method949(65408, var67, var73), class145.method949(65408, var67, var74), class229.method1487(var80, var72, (byte) -84), class229.method1487(var80, var71, (byte) -84), class229.method1487(var80, var73, (byte) -84), class229.method1487(var80, var74, (byte) -84), var68, var79);
                            }
                        }
                    }
                }
            }
            class53.field602[var13] = null;
            class27.field324[var13] = null;
            class93.field1254[var13] = null;
            class143.field2044[var13] = null;
            class263.field3812[var13] = null;
        }
        class105.method640(-50, -10, -50);
        if (arg0) {
            return;
        }
        for (int var14 = 0; var14 < 104; var14++) {
            for (int var51 = 0; var51 < 104; var51++) {
                if ((class241.field3507[1][var14][var51] & 0x2) == 2) {
                    class5.method30(var14, var51);
                }
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 <= 104; var16++) {
                for (int var17 = 0; var17 <= 104; var17++) {
                    if ((class64.field751[var15][var17][var16] & 0x1) != 0) {
                        int var18 = var16;
                        int var19;
                        for (var19 = var16; var19 < 104 && (class64.field751[var15][var17][var19 + 1] & 0x1) != 0; var19++) {
                        }
                        while (var18 > 0 && (class64.field751[var15][var17][var18 - 1] & 0x1) != 0) {
                            var18--;
                        }
                        int var20;
                        label352: for (var20 = var15; var20 > 0; var20--) {
                            for (int var21 = var18; var21 <= var19; var21++) {
                                if ((class64.field751[var20 - 1][var17][var21] & 0x1) == 0) {
                                    break label352;
                                }
                            }
                        }
                        int var22;
                        label340: for (var22 = var15; var22 < 3; var22++) {
                            for (int var23 = var18; var23 <= var19; var23++) {
                                if ((class64.field751[var22 + 1][var17][var23] & 0x1) == 0) {
                                    break label340;
                                }
                            }
                        }
                        int var24 = (var19 + 1 - var18) * (var22 + 1 - var20);
                        if (var24 >= 8) {
                            int var25 = class290.field4536[var20][var17][var18];
                            short var26 = 240;
                            int var27 = class290.field4536[var22][var17][var18] - var26;
                            class273.method1743(1, var17 * 128, var17 * 128, var18 * 128, var19 * 128 + 128, var27, var25);
                            for (int var28 = var20; var28 <= var22; var28++) {
                                for (int var29 = var18; var29 <= var19; var29++) {
                                    class64.field751[var28][var17][var29] = class5.method26(class64.field751[var28][var17][var29], -2);
                                }
                            }
                        }
                    }
                    if ((class64.field751[var15][var17][var16] & 0x2) != 0) {
                        int var30 = var17;
                        int var31;
                        for (var31 = var17; var31 > 0 && (class64.field751[var15][var31 - 1][var16] & 0x2) != 0; var31--) {
                        }
                        while (var30 < 104 && (class64.field751[var15][var30 + 1][var16] & 0x2) != 0) {
                            var30++;
                        }
                        int var32 = var15;
                        int var33;
                        label406: for (var33 = var15; var33 > 0; var33--) {
                            for (int var34 = var31; var34 <= var30; var34++) {
                                if ((class64.field751[var33 - 1][var34][var16] & 0x2) == 0) {
                                    break label406;
                                }
                            }
                        }
                        label395: while (var32 < 3) {
                            for (int var35 = var31; var35 <= var30; var35++) {
                                if ((class64.field751[var32 + 1][var35][var16] & 0x2) == 0) {
                                    break label395;
                                }
                            }
                            var32++;
                        }
                        int var36 = (var32 + 1 - var33) * (var30 + 1 - var31);
                        if (var36 >= 8) {
                            short var37 = 240;
                            int var38 = class290.field4536[var32][var31][var16] - var37;
                            int var39 = class290.field4536[var33][var31][var16];
                            class273.method1743(2, var31 * 128, var30 * 128 + 128, var16 * 128, var16 * 128, var38, var39);
                            for (int var40 = var33; var40 <= var32; var40++) {
                                for (int var41 = var31; var41 <= var30; var41++) {
                                    class64.field751[var40][var41][var16] = class5.method26(class64.field751[var40][var41][var16], -3);
                                }
                            }
                        }
                    }
                    if ((class64.field751[var15][var17][var16] & 0x4) != 0) {
                        int var42 = var17;
                        int var43 = var17;
                        int var44 = var16;
                        int var45;
                        for (var45 = var16; var45 > 0 && (class64.field751[var15][var17][var45 - 1] & 0x4) != 0; var45--) {
                        }
                        while (var44 < 104 && (class64.field751[var15][var17][var44 + 1] & 0x4) != 0) {
                            var44++;
                        }
                        label460: while (var42 > 0) {
                            for (int var46 = var45; var46 <= var44; var46++) {
                                if ((class64.field751[var15][var42 - 1][var46] & 0x4) == 0) {
                                    break label460;
                                }
                            }
                            var42--;
                        }
                        label449: while (var43 < 104) {
                            for (int var47 = var45; var47 <= var44; var47++) {
                                if ((class64.field751[var15][var43 + 1][var47] & 0x4) == 0) {
                                    break label449;
                                }
                            }
                            var43++;
                        }
                        if ((var43 - (var42 - 1)) * (var44 + 1 - var45) >= 4) {
                            int var48 = class290.field4536[var15][var42][var45];
                            class273.method1743(4, var42 * 128, var43 * 128 + 128, var45 * 128, var44 * 128 + 128, var48, var48);
                            for (int var49 = var42; var49 <= var43; var49++) {
                                for (int var50 = var45; var50 <= var44; var50++) {
                                    class64.field751[var15][var49][var50] = class5.method26(class64.field751[var15][var49][var50], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "()I")
    public final int method227() {
        field1740++;
        return this.field1739;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIIIIJILqd;)V")
    public final void method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class162 arg10) {
        field1749++;
        class131 var13 = this.method795(572894544);
        if (var13 != null) {
            var13.method235(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1727);
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public static void method794(int arg0) {
        field1756 = null;
        if (arg0 != -9) {
            field1756 = null;
        }
        field1733 = null;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)Lca;")
    public final class131 method795(int arg0) {
        if (arg0 == 572894544) {
            field1743++;
            return this.method801(false, (byte) -103);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lsi;Ljava/awt/Component;IIB)Lac;")
    public static final class127 method796(class56 arg0, Component arg1, int arg2, int arg3, byte arg4) {
        field1737++;
        if (class50.field571 == 0) {
            throw new IllegalStateException();
        }
        if (arg4 != 118) {
            method794(-29);
        }
        if (arg3 < 0 || arg3 >= 2) {
            throw new IllegalArgumentException();
        }
        if (arg2 < 256) {
            arg2 = 256;
        }
        try {
            class127 var5 = (class127) Class.forName("eg").getDeclaredConstructor().newInstance();
            var5.field1813 = new int[(class152.field2211 ? 2 : 1) * 256];
            var5.field1847 = arg2;
            var5.method111(arg1);
            var5.field1845 = (arg2 & 0xFFFFFC00) + 1024;
            if (var5.field1845 > 16384) {
                var5.field1845 = 16384;
            }
            var5.method112(var5.field1845);
            if (class206.field2935 > 0 && class20.field243 == null) {
                class20.field243 = new class40();
                class20.field243.field477 = arg0;
                arg0.method341(arg4 + 11451, class206.field2935, class20.field243);
            }
            if (class20.field243 != null) {
                if (class20.field243.field480[arg3] != null) {
                    throw new IllegalArgumentException();
                }
                class20.field243.field480[arg3] = var5;
            }
            return var5;
        } catch (Throwable var8) {
            try {
                class85 var6 = new class85(arg0, arg3);
                var6.field1847 = arg2;
                var6.field1813 = new int[(class152.field2211 ? 2 : 1) * 256];
                var6.method111(arg1);
                var6.field1845 = 16384;
                var6.method112(var6.field1845);
                if (class206.field2935 > 0 && class20.field243 == null) {
                    class20.field243 = new class40();
                    class20.field243.field477 = arg0;
                    arg0.method341(11569, class206.field2935, class20.field243);
                }
                if (class20.field243 != null) {
                    if (class20.field243.field480[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class20.field243.field480[arg3] = var6;
                }
                return var6;
            } catch (Throwable var7) {
                return new class127();
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIBIIIIIIII)V")
    public static final void method797(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1757++;
        if (arg2 != -119) {
            return;
        }
        int var11 = arg10 - arg3;
        if (arg10 < client.field4446) {
            var11++;
        }
        int var12 = arg5 - arg7;
        if (arg5 < class133.field1940) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var41 = (var13 + 1) * arg4 + arg0 >> 16;
            int var42 = arg0 + (arg4 * var13) >> 16;
            int var43 = var41 - var42;
            if (var43 > 0) {
                int var44 = arg3 + var13 >> 6;
                if (var44 >= 0 && var44 <= (class104.field1413.length - 1)) {
                    int var45 = arg8 + var41;
                    int var46 = arg8 + var42;
                    byte[][] var47 = class265.field3829[var44];
                    byte[][] var48 = class252.field3644[var44];
                    int[][] var49 = class104.field1413[var44];
                    byte[][] var50 = class248.field3612[var44];
                    byte[][] var51 = class178.field2533[var44];
                    byte[][] var52 = class141.field2031[var44];
                    for (int var53 = 0; var53 < var12; var53++) {
                        int var54 = arg6 + (arg1 * var53) >> 16;
                        int var55 = (var53 + 1) * arg1 + arg6 >> 16;
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = arg9 + var55;
                            int var58 = arg7 + var53 >> 6;
                            int var59 = arg9 + var54;
                            int var60 = arg7 + var53 & 0x3F;
                            int var61 = arg3 + var13 & 0x3F;
                            int var62 = (var60 << 6) + var61;
                            int var63;
                            if (var58 < 0 || var49.length - 1 < var58 || var49[var58] == null) {
                                if (class173.field2480.field835 != -1) {
                                    var63 = class173.field2480.field835;
                                } else if ((arg3 + var13 & 0x4) == (arg7 + var53 & 0x4)) {
                                    var63 = class52.field594[class149.field2166 + 1];
                                } else {
                                    var63 = 4936552;
                                }
                                if (var58 < 0 || var49.length - 1 < var58) {
                                    if (var63 == 0) {
                                        var63 = 1;
                                    }
                                    class155.method1018(var46, var59, var43, var56, var63);
                                    continue;
                                }
                            } else {
                                var63 = var49[var58][var62];
                            }
                            if (var63 == 0) {
                                var63 = 1;
                            }
                            int var64 = var48[var58] == null ? 0 : class52.field594[var48[var58][var62] & 0xFF];
                            int var65 = var51[var58] == null ? 0 : class52.field594[var51[var58][var62] & 0xFF];
                            if (var64 == 0 && var65 == 0) {
                                class155.method1018(var46, var59, var43, var56, var63);
                            } else {
                                if (var64 != 0) {
                                    byte var66 = var47[var58] == null ? 0 : var47[var58][var62];
                                    if (var64 == -1) {
                                        var64 = 1;
                                    }
                                    int var67 = var66 & 0xFC;
                                    if (var67 == 0 || var43 <= 1 || var56 <= 1) {
                                        class155.method1018(var46, var59, var43, var56, var64);
                                    } else {
                                        class198.method1276(var67 >> 2, var56, class155.field2242, var63, true, 127, var59, var46, var43, var66 & 0x3, var64);
                                    }
                                }
                                if (var65 != 0) {
                                    if (var65 == -1) {
                                        var65 = var63;
                                    }
                                    byte var68 = var52[var58][var62];
                                    int var69 = var68 & 0xFC;
                                    if (var69 == 0 || var43 <= 1 || var56 <= 1) {
                                        class155.method1018(var46, var59, var43, var56, var65);
                                    }
                                    class198.method1276(var69 >> 2, var56, class155.field2242, 0, var64 == 0, arg2 ^ 0xFFFFFFF6, var59, var46, var43, var68 & 0x3, var65);
                                }
                            }
                            if (var50[var58] != null) {
                                int var70 = var50[var58][var62] & 0xFF;
                                if (var70 != 0) {
                                    int var71;
                                    if (var43 == 1) {
                                        var71 = var46;
                                    } else {
                                        var71 = var45 - 1;
                                    }
                                    int var72;
                                    if (var56 == 1) {
                                        var72 = var59;
                                    } else {
                                        var72 = var57 - 1;
                                    }
                                    int var73 = 13421772;
                                    if (var70 >= 5 && var70 <= 8 || var70 >= 13 && var70 <= 16 || var70 >= 21 && var70 <= 24 || var70 == 27 || var70 == 28) {
                                        var70 -= 4;
                                        var73 = 13369344;
                                    }
                                    if (var70 == 1) {
                                        class155.method1015(var46, var59, var56, var73);
                                    } else if (var70 == 2) {
                                        class155.method1014(var46, var59, var43, var73);
                                    } else if (var70 == 3) {
                                        class155.method1015(var71, var59, var56, var73);
                                    } else if (var70 == 4) {
                                        class155.method1014(var46, var72, var43, var73);
                                    } else if (var70 == 9) {
                                        class155.method1015(var46, var59, var56, 16777215);
                                        class155.method1014(var46, var59, var43, var73);
                                    } else if (var70 == 10) {
                                        class155.method1015(var71, var59, var56, 16777215);
                                        class155.method1014(var46, var59, var43, var73);
                                    } else if (var70 == 11) {
                                        class155.method1015(var71, var59, var56, 16777215);
                                        class155.method1014(var46, var72, var43, var73);
                                    } else if (var70 == 12) {
                                        class155.method1015(var46, var59, var56, 16777215);
                                        class155.method1014(var46, var72, var43, var73);
                                    } else if (var70 == 17) {
                                        class155.method1014(var46, var59, 1, var73);
                                    } else if (var70 == 18) {
                                        class155.method1014(var71, var59, 1, var73);
                                    } else if (var70 == 19) {
                                        class155.method1014(var71, var72, 1, var73);
                                    } else if (var70 == 20) {
                                        class155.method1014(var46, var72, 1, var73);
                                    } else if (var70 == 25) {
                                        for (int var75 = 0; var75 < var56; var75++) {
                                            class155.method1014(var46 + var75, var72 - var75, 1, var73);
                                        }
                                    } else if (var70 == 26) {
                                        for (int var74 = 0; var74 < var56; var74++) {
                                            class155.method1014(var46 + var74, var59 - -var74, 1, var73);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg8 + var41;
                    int var77 = arg8 + var42;
                    for (int var78 = 0; var78 < var12; var78++) {
                        int var79;
                        if (class173.field2480.field835 != -1) {
                            var79 = class173.field2480.field835;
                        } else if ((arg3 + var13 & 0x4) == (arg7 + var78 & 0x4)) {
                            var79 = class52.field594[class149.field2166 + 1];
                        } else {
                            var79 = 4936552;
                        }
                        if (var79 == 0) {
                            var79 = 1;
                        }
                        int var80 = ((var78 + 1) * arg1 + arg6 >> 16) + arg9;
                        int var81 = (arg6 + (arg1 * var78) >> 16) + arg9;
                        int var82 = var80 - var81;
                        class155.method1018(var77, var81, var43, var82, var79);
                    }
                }
            }
        }
        for (int var14 = -2; var14 < var11 + 2; var14++) {
            int var15 = (var14 + 1) * arg4 + arg0 >> 16;
            int var16 = arg4 * var14 + arg0 >> 16;
            int var17 = var15 - var16;
            if (var17 > 0) {
                var10000 = arg8 + var15;
                int var19 = arg8 + var16;
                int var20 = arg3 + var14 >> 6;
                if (var20 >= 0 && (class261.field3791.length - 1) >= var20) {
                    int[][] var21 = class261.field3791[var20];
                    for (int var22 = -2; var22 < (var12 + 2); var22++) {
                        int var23 = arg6 + (arg1 * var22) >> 16;
                        int var24 = (var22 + 1) * arg1 + arg6 >> 16;
                        int var25 = var24 - var23;
                        if (var25 > 0) {
                            int var26 = arg9 + var23;
                            int var27 = arg7 + var22 >> 6;
                            var10000 = arg9 + var24;
                            if (var27 >= 0 && var27 <= var21.length - 1) {
                                int var29 = ((arg7 + var22 & 0x3F) << 6) + (arg3 + var14 & 0x3F);
                                if (var21[var27] != null) {
                                    int var30 = var21[var27][var29];
                                    int var31 = var30 & 0x1FFF;
                                    if (var31 != 0) {
                                        class177 var32 = class245.method1585(10, var31 - 1);
                                        boolean var33 = ((var30 & 0xBBEC) >> 15) == 1;
                                        int var34 = (var30 & 0x7B0A) >> 13;
                                        class43 var35 = var32.method1147(var33, (byte) 111, var34);
                                        if (var35 != null) {
                                            int var36 = var35.field18 * var17 / 4;
                                            int var37 = var35.field11 * var25 / 4;
                                            if (var32.field2510) {
                                                int var38 = (var30 & 0xF538B) >> 16;
                                                int var39 = (var30 & 0xF6BE3F) >> 20;
                                                if ((var34 & 0x1) == 1) {
                                                    int var40 = var38;
                                                    var38 = var39;
                                                    var39 = var40;
                                                }
                                                var36 = var17 * var38;
                                                var37 = var25 * var39;
                                            }
                                            if (var36 != 0 && var37 != 0) {
                                                if (var32.field2515 == 0) {
                                                    var35.method270(var19, var26 + var25 - var37, var36, var37);
                                                } else {
                                                    var35.method277(var19, var26 + var25 - var37, var36, var37, var32.field2515);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(IIIII)I")
    public static final int method798(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -31574) {
            method798(-70, -72, 81, -55, -112);
        }
        field1741++;
        int var5 = 65536 - class297.field4698[arg3 * 1024 / arg2] >> 1;
        return ((65536 - var5) * arg1 >> 16) + (arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(III)V")
    private final void method799(int arg0, int arg1, int arg2) {
        field1753++;
        int var4 = -99 % ((arg0 + 63) / 47);
        if (this.field1735 == null) {
            return;
        }
        int var5 = class198.field2819 - this.field1731;
        if (var5 > 100 && this.field1735.field4068 > 0) {
            int var6 = this.field1735.field4072.length - this.field1735.field4068;
            while (var6 > this.field1728 && var5 > this.field1735.field4081[this.field1728]) {
                var5 -= this.field1735.field4081[this.field1728];
                this.field1728++;
            }
            if (this.field1728 >= var6) {
                int var7 = 0;
                for (int var8 = var6; var8 < this.field1735.field4072.length; var8++) {
                    var7 += this.field1735.field4081[var8];
                }
                var5 %= var7;
            }
            this.field1745 = this.field1728 + 1;
            if (this.field1735.field4072.length <= this.field1745) {
                this.field1745 -= this.field1735.field4068;
                if (this.field1745 < 0 || this.field1745 >= this.field1735.field4072.length) {
                    this.field1745 = -1;
                }
            }
        }
        while (var5 > this.field1735.field4081[this.field1728]) {
            class270.method1730(this.field1728, arg1, arg2, (byte) 52, this.field1735, false);
            var5 -= this.field1735.field4081[this.field1728];
            this.field1728++;
            if (this.field1735.field4072.length <= this.field1728) {
                this.field1728 -= this.field1735.field4068;
                if (this.field1728 < 0 || this.field1728 >= this.field1735.field4072.length) {
                    this.field1735 = null;
                    break;
                }
            }
            this.field1745 = this.field1728 + 1;
            if (this.field1745 >= this.field1735.field4072.length) {
                this.field1745 -= this.field1735.field4068;
                if (this.field1745 < 0 || this.field1745 >= this.field1735.field4072.length) {
                    this.field1745 = -1;
                }
            }
        }
        this.field1730 = var5;
        this.field1731 = class198.field2819 - var5;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILwe;IIB)V")
    public static final void method800(int arg0, class82 arg1, int arg2, int arg3, byte arg4) {
        if (arg4 > -99) {
            field1733 = null;
        }
        field1744++;
        class6.method32(91);
        class155.method1022(arg3, arg2, arg3 + arg1.field1131, arg1.field1048 + arg2);
        if (class230.field3306 == 2 || class230.field3306 == 5 || class276.field4204 == null) {
            class155.method1026(arg3, arg2, 0, arg1.field977, arg1.field1017);
        } else {
            int var5 = (int) class274.field4085 + class139.field2016 & 0x7FF;
            int var6 = class177.field2507.field4563 / 32 + 48;
            int var7 = 464 - (class177.field2507.field4553 / 32);
            ((class187) class276.field4204).method1227(arg3, arg2, arg1.field1131, arg1.field1048, var6, var7, var5, class15.field187 + 256, arg1.field977, arg1.field1017);
            if (class258.field3757 != null) {
                for (int var8 = 0; var8 < class258.field3757.field2238; var8++) {
                    if (class258.field3757.method1007(var8, 121)) {
                        int var9 = ((class258.field3757.field2228[var8] & 0x3FFF) - class166.field2383) * 4 + 2 - (class177.field2507.field4553 / 32);
                        int var10 = class297.field4697[var5];
                        int var11 = var10 * 256 / (class15.field187 + 256);
                        int var12 = (((class258.field3757.field2228[var8] & 0xFFFC449) >> 14) - class110.field1473) * 4 + 2 - class177.field2507.field4563 / 32;
                        int var13 = class297.field4698[var5];
                        int var14 = var13 * 256 / (class15.field187 + 256);
                        int var15 = var9 * var11 + var12 * var14 >> 16;
                        int var16 = var9 * var14 - var11 * var12 >> 16;
                        class89 var17 = class11.field141;
                        if (class258.field3757.method1006(-90, var8) == 1) {
                            var17 = class204.field2904;
                        }
                        if (class258.field3757.method1006(-94, var8) == 2) {
                            var17 = class248.field3614;
                        }
                        int var18 = var17.method520(class258.field3757.field2229[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (var19 >= -arg1.field1131 && arg1.field1131 >= var19 && var16 >= -arg1.field1048 && arg1.field1048 >= var16) {
                            int var20 = 16777215;
                            if (class258.field3757.field2225[var8] != -1) {
                                var20 = class258.field3757.field2225[var8];
                            }
                            class155.method1036(arg1.field977, arg1.field1017);
                            var17.method522(class258.field3757.field2229[var8], arg1.field1131 / 2 + var19 + arg3, arg1.field1048 / 2 + -var16 + arg2, var18, 50, var20, 0, 256, 1, 0, 0);
                            class155.method1021();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class19.field236; var21++) {
                int var58 = class20.field248[var21] * 4 + 2 - (class177.field2507.field4553 / 32);
                int var59 = class104.field1418[var21] * 4 + 2 - (class177.field2507.field4563 / 32);
                class273 var60 = class164.method1081(0, class112.field1506[var21]);
                if (var60.field3991 != null) {
                    var60 = var60.method1751(-23199);
                    if (var60 == null || var60.field4000 == -1) {
                        continue;
                    }
                }
                class152.method999(class144.field2065[var60.field4000], var58, var59, arg3, (byte) 116, arg2, arg1);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var54 = 0; var54 < 104; var54++) {
                    class234 var55 = class80.field943[class199.field2833][var22][var54];
                    if (var55 != null) {
                        int var56 = var54 * 4 + 2 - (class177.field2507.field4553 / 32);
                        int var57 = var22 * 4 + 2 - (class177.field2507.field4563 / 32);
                        class152.method999(class257.field3725[0], var56, var57, arg3, (byte) 116, arg2, arg1);
                    }
                }
            }
            for (int var23 = 0; var23 < class294.field4642; var23++) {
                class54 var50 = class20.field244[class14.field176[var23]];
                if (var50 != null && var50.method325(120)) {
                    class267 var51 = var50.field636;
                    if (var51 != null && var51.field3884 != null) {
                        var51 = var51.method1707(-1);
                    }
                    if (var51 != null && var51.field3865 && var51.field3846) {
                        int var52 = var50.field4563 / 32 - (class177.field2507.field4563 / 32);
                        int var53 = var50.field4553 / 32 - (class177.field2507.field4553 / 32);
                        if (var51.field3881 == -1) {
                            class152.method999(class257.field3725[1], var53, var52, arg3, (byte) 116, arg2, arg1);
                        } else {
                            class152.method999(class144.field2065[var51.field3881], var53, var52, arg3, (byte) 116, arg2, arg1);
                        }
                    }
                }
            }
            for (int var24 = 0; var24 < class238.field3432; var24++) {
                class240 var40 = class253.field3656[class46.field540[var24]];
                if (var40 != null && var40.method325(115)) {
                    int var41 = var40.field4553 / 32 - (class177.field2507.field4553 / 32);
                    int var42 = var40.field4563 / 32 - (class177.field2507.field4563 / 32);
                    long var43 = class60.method370((byte) -8, var40.field3466);
                    boolean var45 = false;
                    for (int var46 = 0; var46 < class144.field2064; var46++) {
                        if (class267.field3844[var46] == var43 && class143.field2046[var46] != 0) {
                            var45 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    for (int var48 = 0; var48 < class34.field401; var48++) {
                        if (class38.field455[var48].field4489 == var43) {
                            var47 = true;
                            break;
                        }
                    }
                    boolean var49 = false;
                    if (class177.field2507.field3465 != 0 && var40.field3465 != 0 && class177.field2507.field3465 == var40.field3465) {
                        var49 = true;
                    }
                    if (var45) {
                        class152.method999(class257.field3725[3], var41, var42, arg3, (byte) 116, arg2, arg1);
                    } else if (var47) {
                        class152.method999(class257.field3725[5], var41, var42, arg3, (byte) 116, arg2, arg1);
                    } else if (var49) {
                        class152.method999(class257.field3725[4], var41, var42, arg3, (byte) 116, arg2, arg1);
                    } else {
                        class152.method999(class257.field3725[2], var41, var42, arg3, (byte) 116, arg2, arg1);
                    }
                }
            }
            class287[] var25 = class243.field3528;
            for (int var26 = 0; var26 < var25.length; var26++) {
                class287 var29 = var25[var26];
                if (var29 != null && var29.field4470 != 0 && class198.field2819 % 20 < 10) {
                    if (var29.field4470 == 1 && var29.field4459 >= 0 && var29.field4459 < class20.field244.length) {
                        class54 var30 = class20.field244[var29.field4459];
                        if (var30 != null) {
                            int var31 = var30.field4563 / 32 - (class177.field2507.field4563 / 32);
                            int var32 = var30.field4553 / 32 - (class177.field2507.field4553 / 32);
                            class133.method868(var29.field4466, var32, arg2, 60, var31, arg1, arg3, 360000);
                        }
                    }
                    if (var29.field4470 == 2) {
                        int var33 = (var29.field4473 - class166.field2383) * 4 + 2 - (class177.field2507.field4553 / 32);
                        int var34 = var29.field4468 * 4;
                        int var35 = var34 * var34;
                        int var36 = (var29.field4479 - class110.field1473) * 4 + 2 - class177.field2507.field4563 / 32;
                        class133.method868(var29.field4466, var33, arg2, 99, var36, arg1, arg3, var35);
                    }
                    if (var29.field4470 == 10 && var29.field4459 >= 0 && var29.field4459 < class253.field3656.length) {
                        class240 var37 = class253.field3656[var29.field4459];
                        if (var37 != null) {
                            int var38 = var37.field4563 / 32 - (class177.field2507.field4563 / 32);
                            int var39 = var37.field4553 / 32 - (class177.field2507.field4553 / 32);
                            class133.method868(var29.field4466, var39, arg2, 94, var38, arg1, arg3, 360000);
                        }
                    }
                }
            }
            if (class292.field4626 != 0) {
                int var27 = class292.field4626 * 4 + 2 - (class177.field2507.field4563 / 32 - (class177.field2507.method1556(3888) + -1) * 2);
                int var28 = class27.field325 * 4 + (class177.field2507.method1556(3888) + -1) * 2 + 2 - (class177.field2507.field4553 / 32);
                class152.method999(class80.field947, var28, var27, arg3, (byte) 116, arg2, arg1);
            }
            class155.method1018(arg1.field1131 / 2 + arg3 - 1, arg1.field1048 / 2 + -1 + arg2, 3, 3, 16777215);
        }
        class163.field2341[arg0] = true;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZB)Lca;")
    private final class131 method801(boolean arg0, byte arg1) {
        field1754++;
        boolean var3 = class290.field4536 != class180.field2550;
        class273 var4 = class164.method1081(0, this.field1729);
        int var5 = var4.field4052;
        if (var4.field3991 != null) {
            var4 = var4.method1751(-23199);
        }
        if (var4 == null) {
            return null;
        }
        if (class5.field67 != 0 && this.field1755 && (this.field1735 == null || this.field1735 != null && this.field1735.field4077 != var4.field4052)) {
            int var6 = var4.field4052;
            if (var4.field4052 == -1) {
                var6 = var5;
            }
            if (var6 == -1) {
                this.field1735 = null;
            } else {
                this.field1735 = class27.method165(var6, (byte) 72);
            }
            if (this.field1735 != null) {
                if (var4.field4001 && this.field1735.field4068 != -1) {
                    this.field1728 = (int) (Math.random() * (double) this.field1735.field4072.length);
                    this.field1731 -= (int) ((double) this.field1735.field4081[this.field1728] * Math.random());
                } else {
                    this.field1728 = 0;
                    this.field1731 = class198.field2819 - 1;
                }
            }
        }
        int var7 = this.field1736 & 0x3;
        int var8 = 88 % ((arg1 + 11) / 56);
        int var9;
        int var10;
        if (var7 == 1 || var7 == 3) {
            var10 = var4.field4008;
            var9 = var4.field4023;
        } else {
            var9 = var4.field4008;
            var10 = var4.field4023;
        }
        int var11 = (var10 + 1 >> 1) + this.field1761;
        int var12 = (var9 >> 1) + this.field1758;
        int var13 = (var9 + 1 >> 1) + this.field1758;
        int var14 = this.field1761 + (var10 >> 1);
        this.method799(123, var12 * 128, var14 * 128);
        boolean var15 = !var3 && var4.field3992 && (this.field1759 != var4.field4012 || (this.field1734 != this.field1728 || this.field1735 != null && (this.field1735.field4075 || class228.field3214) && this.field1745 != this.field1728) && class99.field1347 >= 2);
        if (arg0 && !var15) {
            return null;
        }
        int[][] var16 = class290.field4536[this.field1748];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var11] + var16[var13][var11] >> 2;
        int var18 = (this.field1758 << 7) + (var9 << 6);
        int var19 = (this.field1761 << 7) + (var10 << 6);
        int[][] var20 = null;
        if (var3) {
            var20 = class180.field2550[0];
        } else if (this.field1748 < 3) {
            var20 = class290.field4536[this.field1748 + 1];
        }
        boolean var21 = this.field1752 == null;
        class280 var22;
        if (this.field1735 == null) {
            var22 = var4.method1746(var21 ? class32.field378 : this.field1752, this.field1736, var17, var15, var16, false, this.field1746, var20, var19, -10, var18);
        } else {
            var22 = var4.method1742(this.field1728, this.field1746, var15, var17, var18, var19, this.field1735, var20, this.field1745, (byte) 69, this.field1730, var21 ? class32.field378 : this.field1752, var16, this.field1736);
        }
        return var22 == null ? null : var22.field4248;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIII)V")
    public final void method229(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1750++;
        this.method799(-15, arg3, arg4);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([BIII)I")
    public static final int method802(byte[] arg0, int arg1, int arg2, int arg3) {
        field1732++;
        int var4 = -1;
        int var5 = arg1;
        if (arg3 >= -116) {
            method794(-79);
        }
        while (var5 < arg2) {
            var4 = class79.field935[(arg0[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
            var5++;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(IIIIIIIZLca;)V")
    public class122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class131 arg8) {
        this.field1736 = arg2;
        this.field1748 = arg3;
        this.field1746 = arg1;
        this.field1761 = arg5;
        this.field1758 = arg4;
        this.field1729 = arg0;
        if (arg6 != -1) {
            this.field1735 = class27.method165(arg6, (byte) 13);
            this.field1728 = 0;
            if (this.field1735.field4072.length <= 1) {
                this.field1745 = 0;
            } else {
                this.field1745 = 1;
            }
            this.field1731 = class198.field2819 - 1;
            this.field1730 = 1;
            if (this.field1735.field4090 == 0 && arg8 != null && arg8 instanceof class122) {
                class122 var10 = (class122) arg8;
                if (this.field1735 == var10.field1735) {
                    this.field1731 = var10.field1731;
                    this.field1728 = var10.field1728;
                    this.field1730 = var10.field1730;
                    this.field1745 = var10.field1745;
                    return;
                }
            }
            if (arg7 && this.field1735.field4068 != -1) {
                this.field1728 = (int) ((double) this.field1735.field4072.length * Math.random());
                this.field1745 = this.field1728 + 1;
                if (this.field1745 >= this.field1735.field4072.length) {
                    this.field1745 -= this.field1735.field4068;
                    if (this.field1745 < 0 || this.field1735.field4072.length <= this.field1745) {
                        this.field1745 = -1;
                    }
                }
                this.field1730 = ((int) ((double) this.field1735.field4081[this.field1728] * Math.random())) + 1;
                this.field1731 = class198.field2819 - this.field1730;
            }
        }
        if (arg8 == null) {
            class273 var11 = class164.method1081(0, this.field1729);
            if (var11.field3991 != null) {
                this.field1755 = true;
                return;
            }
        }
    }
}
