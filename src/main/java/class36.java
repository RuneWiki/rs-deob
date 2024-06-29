import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class36 {

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lph;")
    public static class229 field589 = class266.method1858("::wm0", 0);

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Lph;")
    public static class229 field596 = class266.method1858("(U3", 0);

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Lph;")
    public static class229 field594 = class266.method1858("(U0a )2 non)2existant gosub script)2num: ", 0);

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Lph;")
    public static class229 field598 = class266.method1858("Cache:", 0);

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Lvm;")
    public static class202 field591 = new class202(64);

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Lph;")
    public static class229 field599 = class266.method1858("Gegenstand f-Ur Mitglieder", 0);

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "[I")
    public static int[] field597;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "[[B")
    public static byte[][] field590;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 15)
    public static void method289(int arg0) {
        field597 = null;
        field594 = null;
        field591 = null;
        field598 = null;
        if (arg0 == 5903) {
            field596 = null;
            field589 = null;
            field590 = (byte[][]) null;
            field599 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([[I[[B[[B[[F[[B[[[B[[B[[II[[F[[FI)[Lqj;", line = 32)
    public static final class264[] method290(int[][] arg0, byte[][] arg1, byte[][] arg2, float[][] arg3, byte[][] arg4, byte[][][] arg5, byte[][] arg6, int[][] arg7, int arg8, float[][] arg9, float[][] arg10, int arg11) {
        field592++;
        class97 var12 = new class97(128);
        if (arg11 >= -114) {
            field595 = -92;
        }
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg6[var13][var14] & 0xFF;
                int var16 = arg2[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class282 var17 = class110.method838(var16 - 1, false);
                    if (var17.field4676 == -1) {
                        continue;
                    }
                    class264 var18 = class165.method1212(var17, -107, var12);
                    byte var19 = arg1[var13][var14];
                    int[] var20 = class192.field3179[var19];
                    var18.field4432 += var20.length / 2;
                    var18.field4433++;
                    if (var17.field4666 && var15 != 0) {
                        var18.field4432 += class168.field2777[var19];
                    }
                }
                if ((arg6[var13][var14] & 0xFF) != 0 || var16 != 0 && arg1[var13][var14] == 0) {
                    int[] var21 = new int[8];
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg2[var13][var14 + 1] & 0xFF;
                    int var28 = arg2[var13 - 1][var14] & 0xFF;
                    int var29 = arg2[var13][var14 - 1] & 0xFF;
                    int var30 = arg2[var13 + 1][var14] & 0xFF;
                    int var31 = arg2[var13 + 1][var14 + 1] & 0xFF;
                    int var32 = arg2[var13 - 1][var14 - 1] & 0xFF;
                    int var33 = arg2[var13 + 1][var14 - 1] & 0xFF;
                    int var34 = arg2[var13 - 1][var14 + 1] & 0xFF;
                    if (var34 == 0 || var16 == var34) {
                        boolean var43 = false;
                    } else {
                        class282 var35 = class110.method838(var34 - 1, false);
                        if (var35.field4666 && var35.field4676 != -1) {
                            byte var36 = arg4[var13 - 1][var14 + 1];
                            byte var37 = arg1[var13 - 1][var14 + 1];
                            int var38 = class178.field2931[(var36 + 2 & 0x3) + var37 * 4];
                            int var39 = class178.field2931[(var36 + 3 & 0x3) + var37 * 4];
                            if (class48.field712[var39][1] && class48.field712[var38][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var22 == var41) {
                                        var21[var22++] = var34;
                                        break;
                                    }
                                    if (var21[var41] == var34) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var42 = false;
                        }
                    }
                    if (var32 == 0 || var16 == var32) {
                        boolean var52 = false;
                    } else {
                        class282 var44 = class110.method838(var32 - 1, false);
                        if (var44.field4666 && var44.field4676 != -1) {
                            byte var45 = arg4[var13 - 1][var14 - 1];
                            byte var46 = arg1[var13 - 1][var14 - 1];
                            int var47 = class178.field2931[(var45 & 0x3) + var46 * 4];
                            int var48 = class178.field2931[(var45 + 3 & 0x3) + var46 * 4];
                            if (class48.field712[var47][1] && class48.field712[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var22 == var50) {
                                        var21[var22++] = var32;
                                        break;
                                    }
                                    if (var21[var50] == var32) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var51 = false;
                        }
                    }
                    if (var33 == 0 || var16 == var33) {
                        boolean var61 = false;
                    } else {
                        class282 var53 = class110.method838(var33 - 1, false);
                        if (var53.field4666 && var53.field4676 != -1) {
                            byte var54 = arg4[var13 + 1][var14 - 1];
                            byte var55 = arg1[var13 + 1][var14 - 1];
                            int var56 = class178.field2931[(var54 & 0x3) + var55 * 4];
                            int var57 = class178.field2931[(var54 + 1 & 0x3) + var55 * 4];
                            if (class48.field712[var57][1] && class48.field712[var56][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var22 == var59) {
                                        var21[var22++] = var33;
                                        break;
                                    }
                                    if (var21[var59] == var33) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var60 = false;
                        }
                    }
                    if (var31 == 0 || var16 == var31) {
                        boolean var70 = false;
                    } else {
                        class282 var62 = class110.method838(var31 - 1, false);
                        if (var62.field4666 && var62.field4676 != -1) {
                            byte var63 = arg4[var13 + 1][var14 + 1];
                            byte var64 = arg1[var13 + 1][var14 + 1];
                            int var65 = class178.field2931[(var63 + 2 & 0x3) + var64 * 4];
                            int var66 = class178.field2931[(var63 + 1 & 0x3) + var64 * 4];
                            if (class48.field712[var65][1] && class48.field712[var66][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var22 == var68) {
                                        var21[var22++] = var31;
                                        break;
                                    }
                                    if (var21[var68] == var31) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var27 != 0 && var16 != var27) {
                        class282 var71 = class110.method838(var27 - 1, false);
                        if (var71.field4666 && var71.field4676 != -1) {
                            var24 = class178.field2931[arg1[var13][var14 + 1] * 4 + (arg4[var13][var14 + 1] + 2 & 0x3)];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var22 == var72) {
                                    var21[var22++] = var27;
                                    break;
                                }
                                if (var21[var72] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var28 != 0 && var16 != var28) {
                        class282 var73 = class110.method838(var28 - 1, false);
                        if (var73.field4666 && var73.field4676 != -1) {
                            var23 = class178.field2931[(arg4[var13 - 1][var14] + 3 & 0x3) + arg1[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var22 == var74) {
                                    var21[var22++] = var28;
                                    break;
                                }
                                if (var21[var74] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var16 != var29) {
                        class282 var75 = class110.method838(var29 - 1, false);
                        if (var75.field4666 && var75.field4676 != -1) {
                            var26 = class178.field2931[arg1[var13][var14 - 1] * 4 + (arg4[var13][var14 - 1] & 0x3)];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var22 == var76) {
                                    var21[var22++] = var29;
                                    break;
                                }
                                if (var21[var76] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var30 != 0 && var16 != var30) {
                        class282 var77 = class110.method838(var30 - 1, false);
                        if (var77.field4666 && var77.field4676 != -1) {
                            var25 = class178.field2931[(arg4[var13 + 1][var14] + 1 & 0x3) + arg1[var13 + 1][var14] * 4];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var22 == var78) {
                                    var21[var22++] = var30;
                                    break;
                                }
                                if (var21[var78] == var30) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var22; var79++) {
                        int var80 = var21[var79];
                        boolean[] var81 = class48.field712[var28 == var80 ? var23 : 0];
                        boolean[] var82 = class48.field712[var29 == var80 ? var26 : 0];
                        boolean[] var83 = class48.field712[var30 == var80 ? var25 : 0];
                        boolean[] var84 = class48.field712[var27 == var80 ? var24 : 0];
                        class282 var85 = class110.method838(var80 - 1, false);
                        class264 var86 = class165.method1212(var85, -32, var12);
                        var86.field4432 += 5;
                        var86.field4432 += var84.length - 2;
                        var86.field4432 += var81.length - 2;
                        var86.field4432 += var82.length - 2;
                        var86.field4432 += var83.length - 2;
                        var86.field4433++;
                    }
                }
            }
        }
        for (class264 var87 = (class264) var12.method711(0); var87 != null; var87 = (class264) var12.method718(27263)) {
            var87.method1840();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg5[arg8][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg5[1][var88][var89] & 0x2) == 2 && arg8 > 0) {
                    var90 = arg8 - 1;
                } else {
                    var90 = arg8;
                }
                int var91 = arg2[var88][var89] & 0xFF;
                int var92 = arg6[var88][var89] & 0xFF;
                if (var91 != 0) {
                    class282 var93 = class110.method838(var91 - 1, false);
                    if (var93.field4676 == -1) {
                        continue;
                    }
                    class264 var94 = class165.method1212(var93, -59, var12);
                    byte var95 = arg4[var88][var89];
                    byte var96 = arg1[var88][var89];
                    int var97 = class237.method1676(var93.field4676, arg0[var88][var89], true, var93.field4681);
                    int var98 = class237.method1676(var93.field4676, arg0[var88 + 1][var89], true, var93.field4681);
                    int var99 = class237.method1676(var93.field4676, arg0[var88 + 1][var89 + 1], true, var93.field4681);
                    int var100 = class237.method1676(var93.field4676, arg0[var88][var89 + 1], true, var93.field4681);
                    class85.method631(arg7, arg3, var95, var94, arg10, var96, var98, var97, var89, var90, var100, var88, var92 != 0 && var93.field4666, arg9, var99, 0);
                }
                if ((arg6[var88][var89] & 0xFF) != 0 || var91 != 0 && arg1[var88][var89] == 0) {
                    int var101 = 0;
                    int[] var102 = new int[8];
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg2[var88][var89 + 1] & 0xFF;
                    int var108 = arg2[var88][var89 - 1] & 0xFF;
                    int var109 = arg2[var88 - 1][var89] & 0xFF;
                    int var110 = arg2[var88 + 1][var89] & 0xFF;
                    int var111 = arg2[var88 - 1][var89 + 1] & 0xFF;
                    int var112 = arg2[var88 + 1][var89 - 1] & 0xFF;
                    int var113 = arg2[var88 - 1][var89 - 1] & 0xFF;
                    int var114 = arg2[var88 + 1][var89 + 1] & 0xFF;
                    if (var111 == 0 || var91 == var111) {
                        var111 = 0;
                    } else {
                        class282 var115 = class110.method838(var111 - 1, false);
                        if (var115.field4666 && var115.field4676 != -1) {
                            byte var116 = arg4[var88 - 1][var89 + 1];
                            byte var117 = arg1[var88 - 1][var89 + 1];
                            int var118 = class178.field2931[(var116 + 2 & 0x3) + var117 * 4];
                            int var119 = class178.field2931[(var116 + 3 & 0x3) + var117 * 4];
                            if (class48.field712[var119][1] && class48.field712[var118][0]) {
                                var111 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var102[var101++] = var111;
                                        break;
                                    }
                                    if (var102[var120] == var111) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var111 = 0;
                        }
                    }
                    if (var113 == 0 || var91 == var113) {
                        var113 = 0;
                    } else {
                        class282 var121 = class110.method838(var113 - 1, false);
                        if (var121.field4666 && var121.field4676 != -1) {
                            byte var122 = arg4[var88 - 1][var89 - 1];
                            byte var123 = arg1[var88 - 1][var89 - 1];
                            int var124 = class178.field2931[(var122 & 0x3) + var123 * 4];
                            int var125 = class178.field2931[var123 * 4 + (var122 + 3 & 0x3)];
                            if (class48.field712[var124][1] && class48.field712[var125][0]) {
                                var113 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var101 == var126) {
                                        var102[var101++] = var113;
                                        break;
                                    }
                                    if (var102[var126] == var113) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var113 = 0;
                        }
                    }
                    if (var112 == 0 || var91 == var112) {
                        var112 = 0;
                    } else {
                        class282 var127 = class110.method838(var112 - 1, false);
                        if (var127.field4666 && var127.field4676 != -1) {
                            byte var128 = arg4[var88 + 1][var89 - 1];
                            byte var129 = arg1[var88 + 1][var89 - 1];
                            int var130 = class178.field2931[(var128 + 1 & 0x3) + var129 * 4];
                            int var131 = class178.field2931[(var128 & 0x3) + var129 * 4];
                            if (class48.field712[var130][1] && class48.field712[var131][0]) {
                                var112 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var101 == var132) {
                                        var102[var101++] = var112;
                                        break;
                                    }
                                    if (var102[var132] == var112) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var112 = 0;
                        }
                    }
                    if (var114 == 0 || var91 == var114) {
                        var114 = 0;
                    } else {
                        class282 var133 = class110.method838(var114 - 1, false);
                        if (var133.field4666 && var133.field4676 != -1) {
                            byte var134 = arg4[var88 + 1][var89 + 1];
                            byte var135 = arg1[var88 + 1][var89 + 1];
                            int var136 = class178.field2931[var135 * 4 + (var134 + 2 & 0x3)];
                            int var137 = class178.field2931[(var134 + 1 & 0x3) + var135 * 4];
                            if (class48.field712[var136][1] && class48.field712[var137][0]) {
                                var114 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var101 == var138) {
                                        var102[var101++] = var114;
                                        break;
                                    }
                                    if (var102[var138] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var107 != 0 && var91 != var107) {
                        class282 var139 = class110.method838(var107 - 1, false);
                        if (var139.field4666 && var139.field4676 != -1) {
                            var105 = class178.field2931[(arg4[var88][var89 + 1] + 2 & 0x3) + arg1[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var101 == var140) {
                                    var102[var101++] = var107;
                                    break;
                                }
                                if (var102[var140] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var91 != var109) {
                        class282 var141 = class110.method838(var109 - 1, false);
                        if (var141.field4666 && var141.field4676 != -1) {
                            var103 = class178.field2931[(arg4[var88 - 1][var89] + 3 & 0x3) + arg1[var88 - 1][var89] * 4];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var101 == var142) {
                                    var102[var101++] = var109;
                                    break;
                                }
                                if (var102[var142] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var91 != var108) {
                        class282 var143 = class110.method838(var108 - 1, false);
                        if (var143.field4666 && var143.field4676 != -1) {
                            var104 = class178.field2931[(arg4[var88][var89 - 1] & 0x3) + arg1[var88][var89 - 1] * 4];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var102[var101++] = var108;
                                    break;
                                }
                                if (var102[var144] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var110 != 0 && var91 != var110) {
                        class282 var145 = class110.method838(var110 - 1, false);
                        if (var145.field4666 && var145.field4676 != -1) {
                            var106 = class178.field2931[arg1[var88 + 1][var89] * 4 + (arg4[var88 + 1][var89] + 1 & 0x3)];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var101 == var146) {
                                    var102[var101++] = var110;
                                    break;
                                }
                                if (var102[var146] == var110) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var101; var147++) {
                        int var148 = var102[var147];
                        boolean[] var149 = class48.field712[var109 == var148 ? var103 : 0];
                        boolean[] var150 = class48.field712[var107 == var148 ? var105 : 0];
                        boolean[] var151 = class48.field712[var108 == var148 ? var104 : 0];
                        boolean[] var152 = class48.field712[var110 == var148 ? var106 : 0];
                        class282 var153 = class110.method838(var148 - 1, false);
                        class264 var154 = class165.method1212(var153, -82, var12);
                        int var155 = class237.method1676(var153.field4676, arg0[var88][var89], true, var153.field4681) << 8 | 0xFF;
                        int var156 = class237.method1676(var153.field4676, arg0[var88 + 1][var89], true, var153.field4681) << 8 | 0xFF;
                        int var157 = class237.method1676(var153.field4676, arg0[var88 + 1][var89 + 1], true, var153.field4681) << 8 | 0xFF;
                        int var158 = class237.method1676(var153.field4676, arg0[var88][var89 + 1], true, var153.field4681) << 8 | 0xFF;
                        byte var159 = 6;
                        boolean var160 = var111 != var148 && var149[0] && var150[1];
                        boolean var161 = var114 != var148 && var150[0] && var152[1];
                        boolean var162 = var113 != var148 && var151[0] && var149[1];
                        int var163 = var150.length + var159 - 2;
                        int var164 = var149.length + var163 - 2;
                        int var165 = var151.length + var164 - 2;
                        boolean var166 = var112 != var148 && var152[0] && var151[1];
                        int var167 = var152.length + var165 - 2;
                        int[] var168 = new int[var167];
                        int var169 = class161.method1137(arg3, arg10, var154, 64, 0.0F, var88, arg7, arg9, var157, true, -2, 0, var155, 64, var158, var89, var156, (int[][]) null);
                        int var170 = class161.method1137(arg3, arg10, var154, 128, 0.0F, var88, arg7, arg9, var157, var160, -2, 0, var155, 0, var158, var89, var156, (int[][]) null);
                        byte var171 = 0;
                        int var172 = class161.method1137(arg3, arg10, var154, 128, 0.0F, var88, arg7, arg9, var157, var161, -2, 0, var155, 128, var158, var89, var156, (int[][]) null);
                        int var173 = class161.method1137(arg3, arg10, var154, 0, 0.0F, var88, arg7, arg9, var157, var162, -2, 0, var155, 0, var158, var89, var156, (int[][]) null);
                        int var174 = class161.method1137(arg3, arg10, var154, 0, 0.0F, var88, arg7, arg9, var157, var166, -2, 0, var155, 128, var158, var89, var156, (int[][]) null);
                        int var180 = var171 + 1;
                        var168[var171] = var169;
                        var168[var180++] = var172;
                        if (var150.length > 2) {
                            var168[var180++] = class161.method1137(arg3, arg10, var154, 128, 0.0F, var88, arg7, arg9, var157, var150[2], -2, 0, var155, 64, var158, var89, var156, (int[][]) null);
                        }
                        var168[var180++] = var170;
                        if (var149.length > 2) {
                            var168[var180++] = class161.method1137(arg3, arg10, var154, 64, 0.0F, var88, arg7, arg9, var157, var149[2], -2, 0, var155, 0, var158, var89, var156, (int[][]) null);
                        }
                        var168[var180++] = var173;
                        if (var151.length > 2) {
                            var168[var180++] = class161.method1137(arg3, arg10, var154, 0, 0.0F, var88, arg7, arg9, var157, var151[2], -2, 0, var155, 64, var158, var89, var156, (int[][]) null);
                        }
                        var168[var180++] = var174;
                        if (var152.length > 2) {
                            var168[var180++] = class161.method1137(arg3, arg10, var154, 64, 0.0F, var88, arg7, arg9, var157, var152[2], -2, 0, var155, 128, var158, var89, var156, (int[][]) null);
                        }
                        var168[var180++] = var172;
                        var154.method1838(var90, var88, var89, var168, (int[]) null, true);
                    }
                }
            }
        }
        for (class264 var175 = (class264) var12.method711(0); var175 != null; var175 = (class264) var12.method718(27263)) {
            if (var175.field4429 == 0) {
                var175.method598(37);
            } else {
                var175.method1839();
            }
        }
        int var176 = var12.method715(127);
        class264[] var177 = new class264[var176];
        var12.method721(0, var177);
        long[] var178 = new long[var176];
        for (int var179 = 0; var179 < var176; var179++) {
            var178[var179] = var177[var179].field1325;
        }
        class330.method2261(var178, var177, -1);
        return var177;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIZZI)V", line = 979)
    public static final void method291(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        if (arg5) {
            class99.method732();
        }
        field593++;
        if (class325.field5569 != null && (arg3 != 3 || class156.field2540 != arg6 || class326.field5576 != arg1)) {
            class266.method1861(class325.field5569, (byte) 86, class249.field4143);
            class325.field5569 = null;
        }
        if (arg3 == 3 && class325.field5569 == null) {
            class325.field5569 = class72.method566((byte) 53, class249.field4143, arg6, arg1, 0, 0);
            if (class325.field5569 != null) {
                class326.field5576 = arg1;
                class156.field2540 = arg6;
                class94.method702((byte) -121, class249.field4143);
            }
        }
        if (arg3 == 3 && class325.field5569 == null) {
            method291(arg0, -1, arg2, class72.field1231, true, true, -1);
            return;
        }
        Container var7;
        if (class325.field5569 != null) {
            var7 = class325.field5569;
        } else if (class160.field2590 == null) {
            var7 = class249.field4143.field1561;
        } else {
            var7 = class160.field2590;
        }
        class15.field177 = var7.getSize().width;
        class53.field754 = var7.getSize().height;
        if (class160.field2590 == var7) {
            Insets var8 = class160.field2590.getInsets();
            class15.field177 -= var8.right + var8.left;
            class53.field754 -= var8.top + var8.bottom;
        }
        if (arg3 >= 2) {
            class273.field4567 = class15.field177;
            class253.field4224 = 0;
            class266.field4484 = class53.field754;
            class324.field5540 = 0;
        } else {
            class253.field4224 = (class15.field177 - 765) / 2;
            class266.field4484 = 503;
            class324.field5540 = 0;
            class273.field4567 = 765;
        }
        if (arg4) {
            class136.method967(arg2 + 5324, class214.field3526);
            class233.method1655((byte) -10, class214.field3526);
            if (class4.field47 != null) {
                class4.field47.method1398((byte) -124, class214.field3526);
            }
            class157.field2561.method1851((byte) 99);
            class6.method32(-15012, class214.field3526);
            class122.method913(class214.field3526, (byte) -78);
            if (class4.field47 != null) {
                class4.field47.method1400(class214.field3526, -1);
            }
        } else {
            if (class99.field1675) {
                class99.method737(class273.field4567, class266.field4484);
            }
            class214.field3526.setSize(class273.field4567, class266.field4484);
            if (class160.field2590 == var7) {
                Insets var9 = class160.field2590.getInsets();
                class214.field3526.setLocation(class253.field4224 + var9.left, class324.field5540 + var9.top);
            } else {
                class214.field3526.setLocation(class253.field4224, class324.field5540);
            }
        }
        if (arg3 == 0 && arg0 > 0) {
            class99.method728(class214.field3526);
        }
        if (arg5 && arg3 > 0) {
            class214.field3526.setIgnoreRepaint(true);
            if (!class192.field3180) {
                class321.method2177();
                class156.field2534 = null;
                class156.field2534 = class229.method1594(class266.field4484, class214.field3526, class273.field4567, -5059);
                class210.method1467();
                if (class169.field2786 == 5) {
                    class263.method1832(class213.field3517, -128, true);
                } else {
                    class10.method71((byte) -93, false, class138.field2233);
                }
                try {
                    Graphics var10 = class214.field3526.getGraphics();
                    class156.field2534.method1101(var10, (byte) 79, 0, 0);
                } catch (Exception var14) {
                }
                class213.method1513((byte) 70);
                if (arg0 == 0) {
                    class156.field2534 = class229.method1594(503, class214.field3526, 765, -5059);
                } else {
                    class156.field2534 = null;
                }
                class247 var12 = class249.field4143.method678(class157.field2561.getClass(), (byte) -74);
                while (var12.field4125 == 0) {
                    class288.method1976((byte) 37, 100L);
                }
                if (var12.field4125 == 1) {
                    class192.field3180 = true;
                }
            }
            if (class192.field3180) {
                class99.method753(class214.field3526, class272.field4546 * 2);
            }
        }
        if (!class99.field1675 && arg3 > 0) {
            method291(arg0, -1, 0, 0, true, true, -1);
            return;
        }
        if (arg3 > 0 && arg0 == 0) {
            class204.field3364.setPriority(5);
            class156.field2534 = null;
            class246.method1711();
            ((class17) class310.field5207).method93(200, (byte) 100);
            if (class88.field1483) {
                class310.method2102(0.7F);
            }
        } else if (arg3 == 0 && arg0 > 0) {
            class204.field3364.setPriority(1);
            class156.field2534 = class229.method1594(503, class214.field3526, 765, arg2 ^ 0xFFFFEC3D);
            class246.method1709();
            class194.method1374();
            ((class17) class310.field5207).method93(20, (byte) 98);
            if (class88.field1483) {
                if (class191.field3153 == 1) {
                    class310.method2102(0.9F);
                }
                if (class191.field3153 == 2) {
                    class310.method2102(0.8F);
                }
                if (class191.field3153 == 3) {
                    class310.method2102(0.7F);
                }
                if (class191.field3153 == 4) {
                    class310.method2102(0.6F);
                }
            }
            class264.method1836();
        }
        class268.field4491 = !class61.method415((byte) 68);
        if (arg5) {
            class176.method1272((byte) 122);
        }
        if (arg3 < 2) {
            class319.field5389 = false;
        } else {
            class319.field5389 = true;
        }
        if (~class198.field3292 != arg2) {
            class304.method2052(71, true);
        }
        if (class121.field2031 != null && (class169.field2786 == 30 || class169.field2786 == 25)) {
            class105.method803((byte) -55);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class187.field3036[var13] = true;
        }
        class67.field1070 = true;
    }
}
