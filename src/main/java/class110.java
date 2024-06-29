import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public abstract class class110 {

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Lmh;")
    public static class128 field1862 = class22.method156(123, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Lvb;")
    public static class50 field1861;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "[Lqg;")
    public static class231[] field1860;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V", line = 12)
    public static void method668(boolean arg0) {
        field1861 = null;
        field1860 = null;
        field1862 = null;
        if (!arg0) {
            method669((byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (byte[][][]) ((byte[][][]) null), (byte[][]) ((byte[][]) null), (int[][]) ((int[][]) null), (byte[][]) ((byte[][]) null), 0, (int[][]) ((int[][]) null), false);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([[B[[F[[F[[B[[F[[[B[[B[[I[[BI[[IZ)[Lac;", line = 32)
    public static final class154[] method669(byte[][] arg0, float[][] arg1, float[][] arg2, byte[][] arg3, float[][] arg4, byte[][][] arg5, byte[][] arg6, int[][] arg7, byte[][] arg8, int arg9, int[][] arg10, boolean arg11) {
        field1859++;
        class120 var12 = new class120(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg3[var13][var14] & 0xFF;
                int var16 = arg8[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class201 var17 = class75.method493(var16 - 1, 4);
                    if (var17.field3562 == -1) {
                        continue;
                    }
                    class154 var18 = class139.method918(var17, 255, var12);
                    byte var19 = arg6[var13][var14];
                    int[] var20 = class313.field5285[var19];
                    var18.field2639 += var20.length / 2;
                    var18.field2666++;
                    if (var17.field3557 && var15 != 0) {
                        var18.field2639 += class28.field594[var19];
                    }
                }
                if ((arg3[var13][var14] & 0xFF) != 0 || var16 != 0 && arg6[var13][var14] == 0) {
                    int var21 = 0;
                    int[] var22 = new int[8];
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg8[var13][var14 + 1] & 0xFF;
                    int var28 = arg8[var13 - 1][var14] & 0xFF;
                    int var29 = arg8[var13][var14 - 1] & 0xFF;
                    int var30 = arg8[var13 - 1][var14 + 1] & 0xFF;
                    int var31 = arg8[var13 - 1][var14 - 1] & 0xFF;
                    int var32 = arg8[var13 + 1][var14] & 0xFF;
                    int var33 = arg8[var13 + 1][var14 + 1] & 0xFF;
                    int var34 = arg8[var13 + 1][var14 - 1] & 0xFF;
                    if (var30 == 0 || var16 == var30) {
                        boolean var43 = false;
                    } else {
                        class201 var35 = class75.method493(var30 - 1, 4);
                        if (var35.field3557 && var35.field3562 != -1) {
                            byte var36 = arg0[var13 - 1][var14 + 1];
                            byte var37 = arg6[var13 - 1][var14 + 1];
                            int var38 = class259.field4473[(var36 + 2 & 0x3) + var37 * 4];
                            int var39 = class259.field4473[(var36 + 3 & 0x3) + var37 * 4];
                            if (class77.field1423[var39][1] && class77.field1423[var38][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var21 == var41) {
                                        var22[var21++] = var30;
                                        break;
                                    }
                                    if (var22[var41] == var30) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var42 = false;
                        }
                    }
                    if (var31 == 0 || var16 == var31) {
                        boolean var52 = false;
                    } else {
                        class201 var44 = class75.method493(var31 - 1, 4);
                        if (var44.field3557 && var44.field3562 != -1) {
                            byte var45 = arg6[var13 - 1][var14 - 1];
                            byte var46 = arg0[var13 - 1][var14 - 1];
                            int var47 = class259.field4473[(var46 & 0x3) + var45 * 4];
                            int var48 = class259.field4473[(var46 + 3 & 0x3) + var45 * 4];
                            if (class77.field1423[var47][1] && class77.field1423[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var21 == var50) {
                                        var22[var21++] = var31;
                                        break;
                                    }
                                    if (var22[var50] == var31) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var51 = false;
                        }
                    }
                    if (var34 == 0 || var16 == var34) {
                        boolean var61 = false;
                    } else {
                        class201 var53 = class75.method493(var34 - 1, 4);
                        if (var53.field3557 && var53.field3562 != -1) {
                            byte var54 = arg6[var13 + 1][var14 - 1];
                            byte var55 = arg0[var13 + 1][var14 - 1];
                            int var56 = class259.field4473[(var55 & 0x3) + var54 * 4];
                            int var57 = class259.field4473[var54 * 4 + (var55 + 1 & 0x3)];
                            if (class77.field1423[var57][1] && class77.field1423[var56][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var21 == var59) {
                                        var22[var21++] = var34;
                                        break;
                                    }
                                    if (var22[var59] == var34) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var60 = false;
                        }
                    }
                    if (var33 == 0 || var16 == var33) {
                        boolean var70 = false;
                    } else {
                        class201 var62 = class75.method493(var33 - 1, 4);
                        if (var62.field3557 && var62.field3562 != -1) {
                            byte var63 = arg0[var13 + 1][var14 + 1];
                            byte var64 = arg6[var13 + 1][var14 + 1];
                            int var65 = class259.field4473[(var63 + 2 & 0x3) + var64 * 4];
                            int var66 = class259.field4473[var64 * 4 + (var63 + 1 & 0x3)];
                            if (class77.field1423[var65][1] && class77.field1423[var66][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var21 == var68) {
                                        var22[var21++] = var33;
                                        break;
                                    }
                                    if (var22[var68] == var33) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var27 != 0 && var16 != var27) {
                        class201 var71 = class75.method493(var27 - 1, 4);
                        if (var71.field3557 && var71.field3562 != -1) {
                            var23 = class259.field4473[(arg0[var13][var14 + 1] + 2 & 0x3) + arg6[var13][var14 + 1] * 4];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var21 == var72) {
                                    var22[var21++] = var27;
                                    break;
                                }
                                if (var22[var72] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var28 != 0 && var16 != var28) {
                        class201 var73 = class75.method493(var28 - 1, 4);
                        if (var73.field3557 && var73.field3562 != -1) {
                            var24 = class259.field4473[(arg0[var13 - 1][var14] + 3 & 0x3) + arg6[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var21 == var74) {
                                    var22[var21++] = var28;
                                    break;
                                }
                                if (var22[var74] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var16 != var29) {
                        class201 var75 = class75.method493(var29 - 1, 4);
                        if (var75.field3557 && var75.field3562 != -1) {
                            var25 = class259.field4473[arg6[var13][var14 - 1] * 4 + (arg0[var13][var14 - 1] & 0x3)];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var21 == var76) {
                                    var22[var21++] = var29;
                                    break;
                                }
                                if (var22[var76] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var32 != 0 && var16 != var32) {
                        class201 var77 = class75.method493(var32 - 1, 4);
                        if (var77.field3557 && var77.field3562 != -1) {
                            var26 = class259.field4473[arg6[var13 + 1][var14] * 4 + (arg0[var13 + 1][var14] + 1 & 0x3)];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var21 == var78) {
                                    var22[var21++] = var32;
                                    break;
                                }
                                if (var22[var78] == var32) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var21; var79++) {
                        int var80 = var22[var79];
                        boolean[] var81 = class77.field1423[var27 == var80 ? var23 : 0];
                        boolean[] var82 = class77.field1423[var29 == var80 ? var25 : 0];
                        boolean[] var83 = class77.field1423[var28 == var80 ? var24 : 0];
                        boolean[] var84 = class77.field1423[var32 == var80 ? var26 : 0];
                        class201 var85 = class75.method493(var80 - 1, 4);
                        class154 var86 = class139.method918(var85, 255, var12);
                        var86.field2639 += 5;
                        var86.field2639 += var81.length - 2;
                        var86.field2639 += var83.length - 2;
                        var86.field2639 += var82.length - 2;
                        var86.field2639 += var84.length - 2;
                        var86.field2666++;
                    }
                }
            }
        }
        if (arg11) {
            method668(true);
        }
        for (class154 var87 = (class154) var12.method729(-108); var87 != null; var87 = (class154) var12.method732(1)) {
            var87.method1022();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90 = arg3[var88][var89] & 0xFF;
                int var91;
                if ((arg5[arg9][var88][var89] & 0x8) != 0) {
                    var91 = 0;
                } else if ((arg5[1][var88][var89] & 0x2) == 2 && arg9 > 0) {
                    var91 = arg9 - 1;
                } else {
                    var91 = arg9;
                }
                int var92 = arg8[var88][var89] & 0xFF;
                if (var92 != 0) {
                    class201 var93 = class75.method493(var92 - 1, 4);
                    if (var93.field3562 == -1) {
                        continue;
                    }
                    class154 var94 = class139.method918(var93, 255, var12);
                    byte var95 = arg6[var88][var89];
                    byte var96 = arg0[var88][var89];
                    int var97 = class191.method1280(117, var93.field3562, arg7[var88][var89], var93.field3566);
                    int var98 = class191.method1280(-83, var93.field3562, arg7[var88 + 1][var89], var93.field3566);
                    int var99 = class191.method1280(94, var93.field3562, arg7[var88 + 1][var89 + 1], var93.field3566);
                    int var100 = class191.method1280(94, var93.field3562, arg7[var88][var89 + 1], var93.field3566);
                    class64.method428(var95, var94, var100, arg10, arg1, var89, var90 != 0 && var93.field3557, arg2, var88, var97, var96, (byte) -100, arg4, var98, var99, var91);
                }
                if ((arg3[var88][var89] & 0xFF) != 0 || var92 != 0 && arg6[var88][var89] == 0) {
                    int var101 = 0;
                    int var102 = 0;
                    int[] var103 = new int[8];
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg8[var88][var89 + 1] & 0xFF;
                    int var108 = arg8[var88 - 1][var89] & 0xFF;
                    int var109 = arg8[var88 + 1][var89] & 0xFF;
                    int var110 = arg8[var88 - 1][var89 + 1] & 0xFF;
                    int var111 = arg8[var88][var89 - 1] & 0xFF;
                    int var112 = arg8[var88 + 1][var89 - 1] & 0xFF;
                    int var113 = arg8[var88 - 1][var89 - 1] & 0xFF;
                    int var114 = arg8[var88 + 1][var89 + 1] & 0xFF;
                    if (var110 == 0 || var92 == var110) {
                        var110 = 0;
                    } else {
                        class201 var115 = class75.method493(var110 - 1, 4);
                        if (var115.field3557 && var115.field3562 != -1) {
                            byte var116 = arg0[var88 - 1][var89 + 1];
                            byte var117 = arg6[var88 - 1][var89 + 1];
                            int var118 = class259.field4473[(var116 + 3 & 0x3) + var117 * 4];
                            int var119 = class259.field4473[(var116 + 2 & 0x3) + var117 * 4];
                            if (class77.field1423[var118][1] && class77.field1423[var119][0]) {
                                var110 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var103[var101++] = var110;
                                        break;
                                    }
                                    if (var103[var120] == var110) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var110 = 0;
                        }
                    }
                    if (var113 == 0 || var92 == var113) {
                        var113 = 0;
                    } else {
                        class201 var121 = class75.method493(var113 - 1, 4);
                        if (var121.field3557 && var121.field3562 != -1) {
                            byte var122 = arg0[var88 - 1][var89 - 1];
                            byte var123 = arg6[var88 - 1][var89 - 1];
                            int var124 = class259.field4473[(var122 + 3 & 0x3) + var123 * 4];
                            int var125 = class259.field4473[(var122 & 0x3) + var123 * 4];
                            if (class77.field1423[var125][1] && class77.field1423[var124][0]) {
                                var113 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var101 == var126) {
                                        var103[var101++] = var113;
                                        break;
                                    }
                                    if (var103[var126] == var113) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var113 = 0;
                        }
                    }
                    if (var112 == 0 || var92 == var112) {
                        var112 = 0;
                    } else {
                        class201 var127 = class75.method493(var112 - 1, 4);
                        if (var127.field3557 && var127.field3562 != -1) {
                            byte var128 = arg0[var88 + 1][var89 - 1];
                            byte var129 = arg6[var88 + 1][var89 - 1];
                            int var130 = class259.field4473[var129 * 4 + (var128 & 0x3)];
                            int var131 = class259.field4473[(var128 + 1 & 0x3) + var129 * 4];
                            if (class77.field1423[var131][1] && class77.field1423[var130][0]) {
                                var112 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var101 == var132) {
                                        var103[var101++] = var112;
                                        break;
                                    }
                                    if (var103[var132] == var112) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var112 = 0;
                        }
                    }
                    if (var114 == 0 || var92 == var114) {
                        var114 = 0;
                    } else {
                        class201 var133 = class75.method493(var114 - 1, 4);
                        if (var133.field3557 && var133.field3562 != -1) {
                            byte var134 = arg0[var88 + 1][var89 + 1];
                            byte var135 = arg6[var88 + 1][var89 + 1];
                            int var136 = class259.field4473[var135 * 4 + (var134 + 2 & 0x3)];
                            int var137 = class259.field4473[var135 * 4 + (var134 + 1 & 0x3)];
                            if (class77.field1423[var136][1] && class77.field1423[var137][0]) {
                                var114 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var101 == var138) {
                                        var103[var101++] = var114;
                                        break;
                                    }
                                    if (var103[var138] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var107 != 0 && var92 != var107) {
                        class201 var139 = class75.method493(var107 - 1, 4);
                        if (var139.field3557 && var139.field3562 != -1) {
                            var102 = class259.field4473[arg6[var88][var89 + 1] * 4 + (arg0[var88][var89 + 1] + 2 & 0x3)];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var101 == var140) {
                                    var103[var101++] = var107;
                                    break;
                                }
                                if (var103[var140] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var92 != var108) {
                        class201 var141 = class75.method493(var108 - 1, 4);
                        if (var141.field3557 && var141.field3562 != -1) {
                            var104 = class259.field4473[(arg0[var88 - 1][var89] + 3 & 0x3) + arg6[var88 - 1][var89] * 4];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var101 == var142) {
                                    var103[var101++] = var108;
                                    break;
                                }
                                if (var103[var142] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var111 != 0 && var92 != var111) {
                        class201 var143 = class75.method493(var111 - 1, 4);
                        if (var143.field3557 && var143.field3562 != -1) {
                            var105 = class259.field4473[arg6[var88][var89 - 1] * 4 + (arg0[var88][var89 - 1] & 0x3)];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var103[var101++] = var111;
                                    break;
                                }
                                if (var103[var144] == var111) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var92 != var109) {
                        class201 var145 = class75.method493(var109 - 1, 4);
                        if (var145.field3557 && var145.field3562 != -1) {
                            var106 = class259.field4473[arg6[var88 + 1][var89] * 4 + (arg0[var88 + 1][var89] + 1 & 0x3)];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var101 == var146) {
                                    var103[var101++] = var109;
                                    break;
                                }
                                if (var103[var146] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var101; var147++) {
                        int var148 = var103[var147];
                        boolean[] var149 = class77.field1423[var107 == var148 ? var102 : 0];
                        boolean[] var150 = class77.field1423[var108 == var148 ? var104 : 0];
                        boolean[] var151 = class77.field1423[var109 == var148 ? var106 : 0];
                        boolean[] var152 = class77.field1423[var111 == var148 ? var105 : 0];
                        class201 var153 = class75.method493(var148 - 1, 4);
                        class154 var154 = class139.method918(var153, 255, var12);
                        int var155 = class191.method1280(-59, var153.field3562, arg7[var88][var89], var153.field3566) << 8 | 0xFF;
                        int var156 = class191.method1280(93, var153.field3562, arg7[var88 + 1][var89], var153.field3566) << 8 | 0xFF;
                        int var157 = class191.method1280(105, var153.field3562, arg7[var88 + 1][var89 + 1], var153.field3566) << 8 | 0xFF;
                        byte var158 = 6;
                        int var159 = class191.method1280(-40, var153.field3562, arg7[var88][var89 + 1], var153.field3566) << 8 | 0xFF;
                        boolean var160 = var110 != var148 && var150[0] && var149[1];
                        int var161 = var149.length + var158 - 2;
                        int var162 = var150.length + var161 - 2;
                        boolean var163 = var114 != var148 && var149[0] && var151[1];
                        int var164 = var152.length + var162 - 2;
                        boolean var165 = var113 != var148 && var152[0] && var150[1];
                        int var166 = var151.length + var164 - 2;
                        int[] var167 = new int[var166];
                        boolean var168 = var112 != var148 && var151[0] && var152[1];
                        int var169 = class42.method285((byte) 120, true, var154, var156, var155, var157, arg1, 64, (int[][]) null, arg10, arg4, 64, var159, 0.0F, arg2, 0, var89, var88);
                        int var170 = class42.method285((byte) 120, var160, var154, var156, var155, var157, arg1, 128, (int[][]) null, arg10, arg4, 0, var159, 0.0F, arg2, 0, var89, var88);
                        byte var171 = 0;
                        int var172 = class42.method285((byte) 117, var163, var154, var156, var155, var157, arg1, 128, (int[][]) null, arg10, arg4, 128, var159, 0.0F, arg2, 0, var89, var88);
                        int var173 = class42.method285((byte) 126, var165, var154, var156, var155, var157, arg1, 0, (int[][]) null, arg10, arg4, 0, var159, 0.0F, arg2, 0, var89, var88);
                        int var174 = class42.method285((byte) 126, var168, var154, var156, var155, var157, arg1, 0, (int[][]) null, arg10, arg4, 128, var159, 0.0F, arg2, 0, var89, var88);
                        int var180 = var171 + 1;
                        var167[var171] = var169;
                        var167[var180++] = var172;
                        if (var149.length > 2) {
                            var167[var180++] = class42.method285((byte) 104, var149[2], var154, var156, var155, var157, arg1, 128, (int[][]) null, arg10, arg4, 64, var159, 0.0F, arg2, 0, var89, var88);
                        }
                        var167[var180++] = var170;
                        if (var150.length > 2) {
                            var167[var180++] = class42.method285((byte) 121, var150[2], var154, var156, var155, var157, arg1, 64, (int[][]) null, arg10, arg4, 0, var159, 0.0F, arg2, 0, var89, var88);
                        }
                        var167[var180++] = var173;
                        if (var152.length > 2) {
                            var167[var180++] = class42.method285((byte) 111, var152[2], var154, var156, var155, var157, arg1, 0, (int[][]) null, arg10, arg4, 64, var159, 0.0F, arg2, 0, var89, var88);
                        }
                        var167[var180++] = var174;
                        if (var151.length > 2) {
                            var167[var180++] = class42.method285((byte) 116, var151[2], var154, var156, var155, var157, arg1, 64, (int[][]) null, arg10, arg4, 128, var159, 0.0F, arg2, 0, var89, var88);
                        }
                        var167[var180++] = var172;
                        var154.method1025(var91, var88, var89, var167, (int[]) null, true);
                    }
                }
            }
        }
        for (class154 var175 = (class154) var12.method729(-92); var175 != null; var175 = (class154) var12.method732(1)) {
            if (var175.field2649 == 0) {
                var175.method1978((byte) 70);
            } else {
                var175.method1028();
            }
        }
        int var176 = var12.method727((byte) 40);
        class154[] var177 = new class154[var176];
        var12.method724(var177, -1);
        long[] var178 = new long[var176];
        for (int var179 = 0; var179 < var176; var179++) {
            var178[var179] = var177[var179].field4915;
        }
        class72.method482(-66, var177, var178);
        return var177;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)[B")
    public abstract byte[] method541(int arg0);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([BI)V")
    public abstract void method542(byte[] arg0, int arg1);
}
