import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class275 extends class69 {

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field4793 = -1;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "Lha;")
    private static class46 field4801 = class271.method1828("Loading sprites )2 ", -46);

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "[Lha;")
    public static class46[] field4795 = new class46[500];

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "[I")
    public static int[] field4798 = new int[128];

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "J")
    public static long field4808 = 0L;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "Lha;")
    public static class46 field4807 = field4801;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public int field4791;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    public int field4799;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
    public int field4802;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "I")
    public int field4804;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "I")
    public int field4809;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "Lhi;")
    public class24 field4792;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "Lhi;")
    public class24 field4797;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "Lha;")
    public class46 field4805;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "Z")
    public boolean field4800;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "[Ljava/lang/Object;")
    public Object[] field4796;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIII)I")
    private static final int method1855(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 255) {
            method1855(-18, 126, -27, 86, 103);
        }
        int var5 = 65536 - class62.field1049[arg2 * 1024 / arg3] >> 1;
        field4810++;
        return ((65536 - var5) * arg0 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIBI)I")
    public static final int method1856(int arg0, int arg1, byte arg2, int arg3) {
        field4803++;
        int var4 = arg0 / arg3;
        int var5 = arg1 / arg3;
        int var6 = arg0 & arg3 - 1;
        int var7 = arg3 - 1 & arg1;
        int var8 = class174.method1249(118, var4, var5);
        if (arg2 != -6) {
            return -3;
        }
        int var9 = class174.method1249(arg2 + 133, var4 - -1, var5);
        int var10 = class174.method1249(117, var4, var5 + 1);
        int var11 = class174.method1249(arg2 ^ 0xFFFFFF89, var4 + 1, var5 + 1);
        int var12 = method1855(var8, var9, var6, arg3, arg2 + 261);
        int var13 = method1855(var10, var11, var6, arg3, 255);
        return method1855(var12, var13, var7, arg3, 255);
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public static void method1857(int arg0) {
        field4807 = null;
        field4795 = null;
        field4801 = null;
        if (arg0 != 1) {
            field4808 = 2L;
        }
        field4798 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([Luf;IZ)V")
    public static final void method1858(class154[] arg0, int arg1, boolean arg2) {
        byte var3;
        if (arg2) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        if (arg1 != -7682) {
            method1859(116);
        }
        field4806++;
        if (!arg2) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class111.field2081[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class111.field2081[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg0[var7].method1120(var5, var6, -51);
                            }
                        }
                    }
                }
            }
            class141.field2554 += (int) (Math.random() * 5.0D) - 2;
            class4.field75 += (int) (Math.random() * 5.0D) - 2;
            if (class141.field2554 < -8) {
                class141.field2554 = -8;
            }
            if (class4.field75 < -16) {
                class4.field75 = -16;
            }
            if (class141.field2554 > 8) {
                class141.field2554 = 8;
            }
            if (class4.field75 > 16) {
                class4.field75 = 16;
            }
        }
        int var8 = class141.field2554 >> 2 << 10;
        int[][] var9 = new int[104][104];
        int[][] var10 = new int[104][104];
        int var11 = class4.field75 >> 1;
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var51 = class10.field171[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var100 = 1; var100 < 103; var100++) {
                    byte var101 = 74;
                    int var102 = class119.field2228[var12][var100 + 1][var54] - class119.field2228[var12][var100 - 1][var54];
                    int var103 = class119.field2228[var12][var100][var54 + 1] - class119.field2228[var12][var100][var54 - 1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + (var103 * var103) + 65536));
                    int var105 = -65536 / var104;
                    int var106 = (var102 << 8) / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var107 * -50 + var105 * -10 + var106 * -50) / var53 + var101;
                    int var109 = (var51[var100 - 1][var54] >> 2) + (var51[var100 + 1][var54] >> 3) + (var51[var100][var54 - -1] >> 3) + (var51[var100][var54] >> 1) + (var51[var100][var54 + -1] >> 2);
                    var9[var100][var54] = var108 - var109;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class70.field1210[var55] = 0;
                class92.field1719[var55] = 0;
                class234.field4061[var55] = 0;
                class98.field1814[var55] = 0;
                class236.field4100[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var85 = 0; var85 < 104; var85++) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = class162.field2874[var12][var94][var85] & 0xFF;
                        if (var95 > 0) {
                            class156 var96 = class134.method1039(true, var95 - 1);
                            class70.field1210[var85] += var96.field2784;
                            class92.field1719[var85] += var96.field2792;
                            class234.field4061[var85] += var96.field2786;
                            class98.field1814[var85] += var96.field2788;
                            var10002 = class236.field4100[var85]++;
                        }
                    }
                    int var97 = var56 - 5;
                    if (var97 >= 0) {
                        int var98 = class162.field2874[var12][var97][var85] & 0xFF;
                        if (var98 > 0) {
                            class156 var99 = class134.method1039(true, var98 - 1);
                            class70.field1210[var85] -= var99.field2784;
                            class92.field1719[var85] -= var99.field2792;
                            class234.field4061[var85] -= var99.field2786;
                            class98.field1814[var85] -= var99.field2788;
                            var10002 = class236.field4100[var85]--;
                        }
                    }
                }
                if (var56 >= 0) {
                    int var86 = 0;
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    for (int var91 = -5; var91 < 104; var91++) {
                        int var92 = var91 + 5;
                        int var93 = var91 - 5;
                        if (var92 < 104) {
                            var86 += class234.field4061[var92];
                            var90 += class98.field1814[var92];
                            var87 += class236.field4100[var92];
                            var88 += class92.field1719[var92];
                            var89 += class70.field1210[var92];
                        }
                        if (var93 >= 0) {
                            var86 -= class234.field4061[var93];
                            var88 -= class92.field1719[var93];
                            var87 -= class236.field4100[var93];
                            var89 -= class70.field1210[var93];
                            var90 -= class98.field1814[var93];
                        }
                        if (var91 >= 0 && var87 > 0) {
                            var10[var56][var91] = class168.method1194(var89 * 256 / var90, var88 / var87, var86 / var87, (byte) -122);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var58 = 1; var58 < 103; var58++) {
                    if (arg2 || class180.method1291(2047) || (class111.field2081[0][var57][var58] & 0x2) != 0 || (class111.field2081[var12][var57][var58] & 0x10) == 0 && class218.method1520(var57, var58, var12, 21944) == class243.field4321) {
                        if (class203.field3637 > var12) {
                            class203.field3637 = var12;
                        }
                        int var59 = class162.field2874[var12][var57][var58] & 0xFF;
                        int var60 = class120.field2251[var12][var57][var58] & 0xFF;
                        if (var59 > 0 || var60 > 0) {
                            int var61 = class119.field2228[var12][var57][var58 + 1];
                            int var62 = class119.field2228[var12][var57 + 1][var58 + 1];
                            int var63 = class119.field2228[var12][var57 + 1][var58];
                            int var64 = class119.field2228[var12][var57][var58];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (var59 == 0 && class170.field3023[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (var60 > 0 && !class135.method1040((byte) -85, var60 - 1).field3480) {
                                    var65 = false;
                                }
                                if (var65 && var63 == var64 && var62 == var64 && var61 == var64) {
                                    class120.field2249[var12][var57][var58] = class235.method1595(class120.field2249[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var69;
                            if (var59 > 0) {
                                var66 = var10[var57][var58];
                                int var67 = (var66 & 0x7F) + var11;
                                if (var67 < 0) {
                                    var67 = 0;
                                } else if (var67 > 127) {
                                    var67 = 127;
                                }
                                int var68 = (var66 + var8 & 0xFC00) + (var66 & 0x380) + var67;
                                var69 = class62.field1041[class245.method1678((byte) 100, 96, var68)];
                            } else {
                                var66 = -1;
                                var69 = 0;
                            }
                            int var70 = var9[var57][var58];
                            int var71 = var9[var57 + 1][var58 + 1];
                            int var72 = var9[var57][var58 + 1];
                            int var73 = var9[var57 + 1][var58];
                            if (var60 == 0) {
                                class163.method1182(var12, var57, var58, 0, 0, -1, var64, var63, var62, var61, class245.method1678((byte) 113, var70, var66), class245.method1678((byte) 113, var73, var66), class245.method1678((byte) 126, var71, var66), class245.method1678((byte) 126, var72, var66), 0, 0, 0, 0, var69, 0);
                            } else {
                                int var74 = class170.field3023[var12][var57][var58] + 1;
                                byte var75 = class46.field807[var12][var57][var58];
                                class194 var76 = class135.method1040((byte) -85, var60 - 1);
                                int var77 = var76.field3486;
                                if (var77 >= 0 && !class62.field1040.method735(arg1 ^ 0x1E01, var77)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var81;
                                if (var77 >= 0) {
                                    var78 = -1;
                                    var81 = class62.field1041[class249.method1696(class62.field1040.method728(var77, (byte) -99), (byte) 111, 96)];
                                } else if (var76.field3479 == -1) {
                                    var81 = 0;
                                    var78 = -2;
                                } else {
                                    var78 = var76.field3479;
                                    int var79 = (var78 & 0x7F) + var11;
                                    if (var79 < 0) {
                                        var79 = 0;
                                    } else if (var79 > 127) {
                                        var79 = 127;
                                    }
                                    int var80 = (var8 + var78 & 0xFC00) - (-(var78 & 0x380) - var79);
                                    var81 = class62.field1041[class249.method1696(var80, (byte) 80, 96)];
                                }
                                if (var76.field3485 >= 0) {
                                    int var82 = var76.field3485;
                                    int var83 = (var82 & 0x7F) + var11;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var8 + var82 & 0xFC00) - (-(var82 & 0x380) - var83);
                                    var81 = class62.field1041[class249.method1696(var84, (byte) 120, 96)];
                                }
                                class163.method1182(var12, var57, var58, var74, var75, var77, var64, var63, var62, var61, class245.method1678((byte) 97, var70, var66), class245.method1678((byte) 101, var73, var66), class245.method1678((byte) 118, var71, var66), class245.method1678((byte) 110, var72, var66), class249.method1696(var78, (byte) 103, var70), class249.method1696(var78, (byte) 65, var73), class249.method1696(var78, (byte) 74, var71), class249.method1696(var78, (byte) 126, var72), var69, var81);
                            }
                        }
                    }
                }
            }
            class162.field2874[var12] = null;
            class120.field2251[var12] = null;
            class170.field3023[var12] = null;
            class46.field807[var12] = null;
            class10.field171[var12] = null;
        }
        class209.method1474(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((class111.field2081[1][var13][var50] & 0x2) == 2) {
                    class17.method89(var13, var50);
                }
            }
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 <= 104; var15++) {
                for (int var16 = 0; var16 <= 104; var16++) {
                    if ((class120.field2249[var14][var16][var15] & 0x1) != 0) {
                        int var17;
                        for (var17 = var15; var17 > 0 && (class120.field2249[var14][var16][var17 - 1] & 0x1) != 0; var17--) {
                        }
                        int var18;
                        for (var18 = var15; var18 < 104 && (class120.field2249[var14][var16][var18 + 1] & 0x1) != 0; var18++) {
                        }
                        int var19 = var14;
                        int var20 = var14;
                        label353: while (var19 > 0) {
                            for (int var21 = var17; var21 <= var18; var21++) {
                                if ((class120.field2249[var19 - 1][var16][var21] & 0x1) == 0) {
                                    break label353;
                                }
                            }
                            var19--;
                        }
                        label342: while (var20 < 3) {
                            for (int var22 = var17; var22 <= var18; var22++) {
                                if ((class120.field2249[var20 + 1][var16][var22] & 0x1) == 0) {
                                    break label342;
                                }
                            }
                            var20++;
                        }
                        int var23 = (var18 + 1 - var17) * (var20 + 1 - var19);
                        if (var23 >= 8) {
                            short var24 = 240;
                            int var25 = class119.field2228[var19][var16][var17];
                            int var26 = class119.field2228[var20][var16][var17] - var24;
                            class258.method1731(1, var16 * 128, var16 * 128, var17 * 128, var18 * 128 + 128, var26, var25);
                            for (int var27 = var19; var27 <= var20; var27++) {
                                for (int var28 = var17; var28 <= var18; var28++) {
                                    class120.field2249[var27][var16][var28] = class50.method369(class120.field2249[var27][var16][var28], -2);
                                }
                            }
                        }
                    }
                    if ((class120.field2249[var14][var16][var15] & 0x2) != 0) {
                        int var29 = var16;
                        int var30 = var16;
                        while (var29 > 0 && (class120.field2249[var14][var29 - 1][var15] & 0x2) != 0) {
                            var29--;
                        }
                        while (var30 < 104 && (class120.field2249[var14][var30 + 1][var15] & 0x2) != 0) {
                            var30++;
                        }
                        int var31;
                        label409: for (var31 = var14; var31 > 0; var31--) {
                            for (int var32 = var29; var32 <= var30; var32++) {
                                if ((class120.field2249[var31 - 1][var32][var15] & 0x2) == 0) {
                                    break label409;
                                }
                            }
                        }
                        int var33;
                        label397: for (var33 = var14; var33 < 3; var33++) {
                            for (int var34 = var29; var34 <= var30; var34++) {
                                if ((class120.field2249[var33 + 1][var34][var15] & 0x2) == 0) {
                                    break label397;
                                }
                            }
                        }
                        int var35 = (var33 + 1 - var31) * (var30 + 1 - var29);
                        if (var35 >= 8) {
                            short var36 = 240;
                            int var37 = class119.field2228[var33][var29][var15] - var36;
                            int var38 = class119.field2228[var31][var29][var15];
                            class258.method1731(2, var29 * 128, var30 * 128 + 128, var15 * 128, var15 * 128, var37, var38);
                            for (int var39 = var31; var39 <= var33; var39++) {
                                for (int var40 = var29; var40 <= var30; var40++) {
                                    class120.field2249[var39][var40][var15] = class50.method369(class120.field2249[var39][var40][var15], -3);
                                }
                            }
                        }
                    }
                    if ((class120.field2249[var14][var16][var15] & 0x4) != 0) {
                        int var41 = var16;
                        int var42 = var16;
                        int var43;
                        for (var43 = var15; var43 > 0 && (class120.field2249[var14][var16][var43 - 1] & 0x4) != 0; var43--) {
                        }
                        int var44;
                        for (var44 = var15; var44 < 104 && (class120.field2249[var14][var16][var44 + 1] & 0x4) != 0; var44++) {
                        }
                        label463: while (var41 > 0) {
                            for (int var45 = var43; var45 <= var44; var45++) {
                                if ((class120.field2249[var14][var41 - 1][var45] & 0x4) == 0) {
                                    break label463;
                                }
                            }
                            var41--;
                        }
                        label452: while (var42 < 104) {
                            for (int var46 = var43; var46 <= var44; var46++) {
                                if ((class120.field2249[var14][var42 + 1][var46] & 0x4) == 0) {
                                    break label452;
                                }
                            }
                            var42++;
                        }
                        if ((var44 + 1 - var43) * (var42 + 1 - var41) >= 4) {
                            int var47 = class119.field2228[var14][var41][var43];
                            class258.method1731(4, var41 * 128, var42 * 128 + 128, var43 * 128, var44 * 128 + 128, var47, var47);
                            for (int var48 = var41; var48 <= var42; var48++) {
                                for (int var49 = var43; var49 <= var44; var49++) {
                                    class120.field2249[var14][var48][var49] = class50.method369(class120.field2249[var14][var48][var49], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V")
    public static final void method1859(int arg0) {
        class146.field2638.method83(25216);
        field4794++;
        class184.field3293.method83(25216);
        class217.field3837.method83(25216);
        if (arg0 <= 86) {
            method1858((class154[]) null, 116, true);
        }
    }
}
