import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class185 {

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field2930 = 0;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2934 = "scroll:";

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "[[I")
    public static int[][] field2937 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "Lpk;")
    public static class120 field2932;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 4)
    public static void method1343(byte arg0) {
        field2932 = null;
        field2934 = null;
        if (arg0 != -9) {
            field2934 = (String) null;
        }
        field2937 = (int[][]) null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[[B[[I[[[B[[[I[[II[[B[[F[[I[[I[[I[[B[[F[[F[[B)[Ltd;", line = 20)
    public static final class256[] method1344(int arg0, byte[][] arg1, int[][] arg2, byte[][][] arg3, int[][][] arg4, int[][] arg5, int arg6, byte[][] arg7, float[][] arg8, int[][] arg9, int[][] arg10, int[][] arg11, byte[][] arg12, float[][] arg13, float[][] arg14, byte[][] arg15) {
        field2929++;
        int[][] var16 = new int[105][105];
        for (int var17 = 1; var17 <= 103; var17++) {
            for (int var18 = 1; var18 <= 103; var18++) {
                int var19 = 0;
                if (arg4 != null) {
                    int var20 = arg4[arg0][var17 >> 3][var18 >> 3];
                    var19 = (var20 & 0x7) >> 1;
                }
                boolean var21 = false;
                byte var22;
                if (var19 == 0) {
                    var22 = arg1[var17][var18];
                    if (var22 == 0) {
                        var22 = arg1[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg1[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg1[var17 - 1][var18 - 1];
                    }
                } else if (var19 == 1) {
                    var22 = arg1[var17][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg1[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg1[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg1[var17 - 1][var18];
                    }
                } else if (var19 == 2) {
                    var22 = arg1[var17 - 1][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg1[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg1[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg1[var17][var18];
                    }
                } else {
                    var22 = arg1[var17 - 1][var18];
                    if (var22 == 0) {
                        var22 = arg1[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg1[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg1[var17][var18 - 1];
                    }
                }
                if (var22 != 0) {
                    class141 var23 = class216.method1567((byte) -43, (var22 & 0xFF) - 1);
                    var16[var17][var18] = (var23.field2290 + 1 << 16) + var23.field2273;
                }
            }
        }
        class3 var24 = new class3(128);
        if (arg6 > -58) {
            field2925 = 98;
        }
        for (int var25 = 1; var25 <= 102; var25++) {
            for (int var26 = 1; var26 <= 102; var26++) {
                if (arg1[var25][var26] != 0) {
                    int[] var27;
                    if (arg12[var25][var26] == 0) {
                        var27 = class122.field1995[0];
                    } else {
                        var27 = field2937[arg7[var25][var26]];
                        if (var27.length == 0) {
                            continue;
                        }
                    }
                    int var28 = 0;
                    if (arg11 != null) {
                        var28 = arg11[var25][var26] & 0xFFFFFF;
                    }
                    int var29 = var16[var25 + 1][var26];
                    int var30 = var16[var25][var26 + 1];
                    int var31 = var16[var25 + 1][var26 + 1];
                    int var32 = var16[var25][var26];
                    long var33 = (long) var32 << 32 | (long) var28;
                    int var35 = var27.length / 2;
                    long var36 = (long) var28 | (long) var30 << 32;
                    long var38 = (long) var28 | (long) var29 << 32;
                    long var40 = (long) var28 | (long) var31 << 32;
                    class256 var42 = (class256) var24.method79(var33, (byte) 0);
                    if (var42 == null) {
                        var42 = new class256((var32 >> 16) - 1, (float) (var32 & 0xFFFF), false, arg9 != null, var28);
                        var24.method75(var42, -1, var33);
                    }
                    var42.field3781 += var35;
                    var42.field3801++;
                    if (var33 != var38) {
                        class256 var43 = (class256) var24.method79(var38, (byte) 0);
                        if (var43 == null) {
                            var43 = new class256((var29 >> 16) - 1, (float) (var29 & 0xFFFF), false, arg9 != null, var28);
                            var24.method75(var43, -1, var38);
                        }
                        var43.field3801++;
                        var43.field3781 += var35;
                    }
                    if (var33 != var40 && var38 != var40) {
                        class256 var44 = (class256) var24.method79(var40, (byte) 0);
                        if (var44 == null) {
                            var44 = new class256((var31 >> 16) - 1, (float) (var31 & 0xFFFF), false, arg9 != null, var28);
                            var24.method75(var44, -1, var40);
                        }
                        var44.field3801++;
                        var44.field3781 += var35;
                    }
                    if (var33 != var36 && var36 != var38 && var36 != var40) {
                        class256 var45 = (class256) var24.method79(var36, (byte) 0);
                        if (var45 == null) {
                            var45 = new class256((var30 >> 16) - 1, (float) (var30 & 0xFFFF), false, arg9 != null, var28);
                            var24.method75(var45, -1, var36);
                        }
                        var45.field3781 += var35;
                        var45.field3801++;
                    }
                }
            }
        }
        for (class256 var46 = (class256) var24.method71((byte) -93); var46 != null; var46 = (class256) var24.method84(1)) {
            var46.method1771();
        }
        for (int var47 = 1; var47 <= 102; var47++) {
            for (int var48 = 1; var48 <= 102; var48++) {
                byte var49 = arg1[var47][var48];
                if (var49 != 0) {
                    int var50;
                    if ((arg3[arg0][var47][var48] & 0x8) != 0) {
                        var50 = 0;
                    } else if ((arg3[1][var47][var48] & 0x2) == 2 && arg0 > 0) {
                        var50 = arg0 - 1;
                    } else {
                        var50 = arg0;
                    }
                    int var51 = 128;
                    int var52 = 0;
                    if (arg11 != null) {
                        var51 = arg11[var47][var48] >>> 24 << 3;
                        var52 = arg11[var47][var48] & 0xFFFFFF;
                    }
                    boolean[] var53 = null;
                    int[] var54;
                    byte var55;
                    if (arg12[var47][var48] == 0) {
                        var54 = class122.field1995[0];
                        byte var56 = 0;
                        byte var57 = 0;
                        byte var58 = 0;
                        int var59 = var57 + (arg1[var47 - 1][var48 + 1] == var49 ? 1 : -1);
                        byte var60 = 0;
                        int var61 = var56 + (arg1[var47 - 1][var48 - 1] == var49 ? 1 : -1);
                        int var62 = var58 + (arg1[var47 + 1][var48 + 1] == var49 ? 1 : -1);
                        int var63 = var60 + (arg1[var47 + 1][var48 - 1] == var49 ? 1 : -1);
                        if (arg1[var47][var48 - 1] == var49) {
                            var63++;
                            var61++;
                        } else {
                            var61--;
                            var63--;
                        }
                        if (arg1[var47 + 1][var48] == var49) {
                            var63++;
                            var62++;
                        } else {
                            var63--;
                            var62--;
                        }
                        if (arg1[var47][var48 + 1] == var49) {
                            var59++;
                            var62++;
                        } else {
                            var59--;
                            var62--;
                        }
                        if (arg1[var47 - 1][var48] == var49) {
                            var59++;
                            var61++;
                        } else {
                            var61--;
                            var59--;
                        }
                        int var64 = var61 - var62;
                        if (var64 < 0) {
                            var64 = -var64;
                        }
                        int var65 = var63 - var59;
                        if (var65 < 0) {
                            var65 = -var65;
                        }
                        var55 = (byte) (var65 <= var64 ? 0 : 1);
                        arg15[var47][var48] = var55;
                    } else {
                        var54 = field2937[arg7[var47][var48]];
                        var55 = arg15[var47][var48];
                        var53 = class129.field2063[arg7[var47][var48]];
                        if (var54.length == 0) {
                            continue;
                        }
                    }
                    int var66 = var16[var47 + 1][var48];
                    int var67 = var16[var47][var48 + 1];
                    int var68 = var16[var47][var48];
                    int var69 = var16[var47 + 1][var48 + 1];
                    long var70 = (long) var68 << 32 | (long) var52;
                    long var72 = (long) var66 << 32 | (long) var52;
                    long var74 = (long) var52 | (long) var67 << 32;
                    int var76 = arg5[var47 + 1][var48];
                    int var77 = arg5[var47 + 1][var48 + 1];
                    int var78 = arg5[var47][var48];
                    long var79 = (long) var69 << 32 | (long) var52;
                    int var81 = arg5[var47][var48 + 1];
                    int var82 = arg2[var47][var48];
                    int var83 = arg2[var47 + 1][var48];
                    int var84 = arg2[var47][var48 + 1];
                    int var85 = arg2[var47 + 1][var48 + 1];
                    int var86 = (var68 >> 16) - 1;
                    int var87 = (var66 >> 16) - 1;
                    class256 var88 = (class256) var24.method79(var70, (byte) 0);
                    int var89 = (var69 >> 16) - 1;
                    int var90 = (var67 >> 16) - 1;
                    class217.method1572(var53, arg13, arg8, var54, arg9, var51, var48, var55, class174.method1287(var86, -341, var83, var76), var69 >= var68, var67 >= var68, class174.method1287(var86, -341, var82, var78), class174.method1287(var86, -341, var85, var77), arg10, var66 >= var68, var47, 2, var68 >= var68, class174.method1287(var86, -341, var84, var81), arg14, var88, var50);
                    if (var70 != var72) {
                        class256 var91 = (class256) var24.method79(var72, (byte) 0);
                        class217.method1572(var53, arg13, arg8, var54, arg9, var51, var48, var55, class174.method1287(var87, -341, var83, var76), var66 <= var69, var66 <= var67, class174.method1287(var87, -341, var82, var78), class174.method1287(var87, -341, var85, var77), arg10, var66 >= var66, var47, 2, var68 >= var66, class174.method1287(var87, -341, var84, var81), arg14, var91, var50);
                    }
                    if (var70 != var79 && var72 != var79) {
                        class256 var92 = (class256) var24.method79(var79, (byte) 0);
                        class217.method1572(var53, arg13, arg8, var54, arg9, var51, var48, var55, class174.method1287(var89, -341, var83, var76), var69 >= var69, var69 <= var67, class174.method1287(var89, -341, var82, var78), class174.method1287(var89, -341, var85, var77), arg10, var66 >= var69, var47, 2, var69 <= var68, class174.method1287(var89, -341, var84, var81), arg14, var92, var50);
                    }
                    if (var70 != var74 && var72 != var74 && var74 != var79) {
                        class256 var93 = (class256) var24.method79(var74, (byte) 0);
                        class217.method1572(var53, arg13, arg8, var54, arg9, var51, var48, var55, class174.method1287(var90, -341, var83, var76), var69 >= var67, var67 <= var67, class174.method1287(var90, -341, var82, var78), class174.method1287(var90, -341, var85, var77), arg10, var66 >= var67, var47, 2, var68 >= var67, class174.method1287(var90, -341, var84, var81), arg14, var93, var50);
                    }
                }
            }
        }
        for (class256 var94 = (class256) var24.method71((byte) -93); var94 != null; var94 = (class256) var24.method84(1)) {
            if (var94.field3796 == 0) {
                var94.method489(false);
            } else {
                var94.method1774();
            }
        }
        int var95 = var24.method76((byte) -75);
        class256[] var96 = new class256[var95];
        long[] var97 = new long[var95];
        var24.method81(var96, 0);
        for (int var98 = 0; var98 < var95; var98++) {
            var97[var98] = var96[var98].field879;
        }
        class165.method1238((byte) 57, var96, var97);
        return var96;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLkn;)V", line = 476)
    public static final void method1345(byte arg0, class210 arg1) {
        field2933++;
        arg1.field3308 = false;
        if (arg1.field3306 != null) {
            arg1.field3306.field3006 = 0;
        }
        class210 var2 = arg1.method239();
        if (arg0 == 31) {
            while (var2 != null) {
                method1345((byte) 31, var2);
                var2 = arg1.method233();
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)I", line = 507)
    public static final int method1346(int arg0, int arg1, int arg2) {
        if (arg1 < 80) {
            method1343((byte) -86);
        }
        field2936++;
        int var3 = class30.method267(-63, 4, arg2 + 45365, arg0 + 91923) + (class30.method267(-125, 2, arg2 + 10294, arg0 + 37821) - 128 >> 1) + (class30.method267(-100, 1, arg2, arg0) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }
}
