import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class5 {

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field41 = 0;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field45 = -1;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Lr;")
    public static class71 field43;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)V", line = 5)
    public static final void method30(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            method32(92);
        }
        if (class284.field4771 != 0 && arg0 != -1) {
            class87.method614(class284.field4771, false, 0, arg0, (byte) -27, class296.field5051);
            class66.field1027 = true;
        }
        field40++;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([[II[[B[[F[[[BI[[I[[I[[I[[B[[B[[I[[F[[F[[B)[Luk;", line = 35)
    public static final class108[] method31(int[][] arg0, int arg1, byte[][] arg2, float[][] arg3, byte[][][] arg4, int arg5, int[][] arg6, int[][] arg7, int[][] arg8, byte[][] arg9, byte[][] arg10, int[][] arg11, float[][] arg12, float[][] arg13, byte[][] arg14) {
        field42++;
        int[][] var15 = new int[105][105];
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg14[var16][var17];
                if (var18 == 0) {
                    var18 = arg14[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg14[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg14[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class124 var19 = class228.method1625(10415, (var18 & 0xFF) - 1);
                    var15[var16][var17] = (var19.field2174 + 1 << 16) + var19.field2171;
                }
            }
        }
        class79 var20 = new class79(128);
        for (int var21 = 1; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg14[var21][var22] != 0) {
                    int[] var23;
                    if (arg10[var21][var22] == 0) {
                        var23 = class193.field3283[0];
                    } else {
                        var23 = class89.field1591[arg9[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = 0;
                    if (arg7 != null) {
                        var24 = arg7[var21][var22] & 0xFFFFFF;
                    }
                    int var25 = var15[var21][var22];
                    int var26 = var15[var21 + 1][var22];
                    int var27 = var15[var21][var22 + 1];
                    long var28 = (long) var25 << 32 | (long) var24;
                    int var30 = var15[var21 + 1][var22 + 1];
                    long var31 = (long) var26 << 32 | (long) var24;
                    long var33 = (long) var24 | (long) var30 << 32;
                    int var35 = var23.length / 2;
                    class108 var36 = (class108) var20.method507(var28, 602425312);
                    if (var36 == null) {
                        var36 = new class108((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg0 != null, var24);
                        var20.method503(var28, -97, var36);
                    }
                    var36.field1910++;
                    var36.field1924 += var35;
                    long var37 = (long) var24 | (long) var27 << 32;
                    if (var28 != var31) {
                        class108 var39 = (class108) var20.method507(var31, 602425312);
                        if (var39 == null) {
                            var39 = new class108((var26 >> 16) - 1, (float) (var26 & 0xFFFF), false, arg0 != null, var24);
                            var20.method503(var31, -85, var39);
                        }
                        var39.field1924 += var35;
                        var39.field1910++;
                    }
                    if (var28 != var33 && var31 != var33) {
                        class108 var40 = (class108) var20.method507(var33, 602425312);
                        if (var40 == null) {
                            var40 = new class108((var30 >> 16) - 1, (float) (var30 & 0xFFFF), false, arg0 != null, var24);
                            var20.method503(var33, -46, var40);
                        }
                        var40.field1924 += var35;
                        var40.field1910++;
                    }
                    if (var28 != var37 && var31 != var37 && var33 != var37) {
                        class108 var41 = (class108) var20.method507(var37, 602425312);
                        if (var41 == null) {
                            var41 = new class108((var27 >> 16) - 1, (float) (var27 & 0xFFFF), false, arg0 != null, var24);
                            var20.method503(var37, -50, var41);
                        }
                        var41.field1924 += var35;
                        var41.field1910++;
                    }
                }
            }
        }
        for (class108 var42 = (class108) var20.method502((byte) -104); var42 != null; var42 = (class108) var20.method494(true)) {
            var42.method737();
        }
        int var43 = 1;
        if (arg5 != -1) {
            field41 = 33;
        }
        while (var43 <= 102) {
            for (int var44 = 1; var44 <= 102; var44++) {
                byte var45 = arg14[var43][var44];
                if (var45 != 0) {
                    int var46;
                    if ((arg4[arg1][var43][var44] & 0x8) != 0) {
                        var46 = 0;
                    } else if ((arg4[1][var43][var44] & 0x2) == 2 && arg1 > 0) {
                        var46 = arg1 - 1;
                    } else {
                        var46 = arg1;
                    }
                    int var47 = 128;
                    boolean[] var48 = null;
                    int var49 = 0;
                    if (arg7 != null) {
                        var47 = arg7[var43][var44] >>> 24 << 3;
                        var49 = arg7[var43][var44] & 0xFFFFFF;
                    }
                    int[] var50;
                    byte var51;
                    if (arg10[var43][var44] == 0) {
                        var50 = class193.field3283[0];
                        byte var52 = 0;
                        int var53 = var52 + (arg14[var43 + 1][var44 + 1] == var45 ? 1 : -1);
                        byte var54 = 0;
                        int var55 = var54 + (arg14[var43 - 1][var44 + 1] == var45 ? 1 : -1);
                        byte var56 = 0;
                        byte var57 = 0;
                        int var58 = var57 + (arg14[var43 + 1][var44 - 1] == var45 ? 1 : -1);
                        int var59 = var56 + (arg14[var43 - 1][var44 - 1] == var45 ? 1 : -1);
                        if (arg14[var43][var44 - 1] == var45) {
                            var59++;
                            var58++;
                        } else {
                            var58--;
                            var59--;
                        }
                        if (arg14[var43 + 1][var44] == var45) {
                            var58++;
                            var53++;
                        } else {
                            var53--;
                            var58--;
                        }
                        if (arg14[var43][var44 + 1] == var45) {
                            var53++;
                            var55++;
                        } else {
                            var55--;
                            var53--;
                        }
                        if (arg14[var43 - 1][var44] == var45) {
                            var55++;
                            var59++;
                        } else {
                            var55--;
                            var59--;
                        }
                        int var60 = var58 - var55;
                        if (var60 < 0) {
                            var60 = -var60;
                        }
                        int var61 = var59 - var53;
                        if (var61 < 0) {
                            var61 = -var61;
                        }
                        var51 = (byte) (var60 > var61 ? 1 : 0);
                        arg2[var43][var44] = var51;
                    } else {
                        var50 = class89.field1591[arg9[var43][var44]];
                        var51 = arg2[var43][var44];
                        var48 = class180.field3072[arg9[var43][var44]];
                        if (var50.length == 0) {
                            continue;
                        }
                    }
                    int var62 = var15[var43 + 1][var44];
                    int var63 = var15[var43][var44];
                    int var64 = var15[var43 + 1][var44 + 1];
                    long var65 = (long) var63 << 32 | (long) var49;
                    int var67 = var15[var43][var44 + 1];
                    int var68 = arg8[var43 + 1][var44 + 1];
                    int var69 = arg8[var43][var44];
                    long var70 = (long) var64 << 32 | (long) var49;
                    int var72 = arg8[var43][var44 + 1];
                    int var73 = arg8[var43 + 1][var44];
                    long var74 = (long) var49 | (long) var67 << 32;
                    long var76 = (long) var49 | (long) var62 << 32;
                    int var78 = arg11[var43][var44];
                    int var79 = arg11[var43 + 1][var44 + 1];
                    int var80 = (var63 >> 16) - 1;
                    int var81 = arg11[var43 + 1][var44];
                    int var82 = arg11[var43][var44 + 1];
                    int var83 = (var62 >> 16) - 1;
                    int var84 = (var64 >> 16) - 1;
                    int var85 = (var67 >> 16) - 1;
                    class108 var86 = (class108) var20.method507(var65, 602425312);
                    class277.method1937(arg6, var86, var63 <= var64, var48, arg12, var46, class29.method183(true, var80, var68, var79), arg3, class29.method183(true, var80, var73, var81), var63 <= var63, arg13, var63 <= var62, class29.method183(true, var80, var69, var78), var44, var51, var63 <= var67, arg0, var50, class29.method183(true, var80, var72, var82), var43, 59, var47);
                    if (var65 != var76) {
                        class108 var87 = (class108) var20.method507(var76, 602425312);
                        class277.method1937(arg6, var87, var64 >= var62, var48, arg12, var46, class29.method183(true, var83, var68, var79), arg3, class29.method183(true, var83, var73, var81), var62 <= var63, arg13, var62 >= var62, class29.method183(true, var83, var69, var78), var44, var51, var62 <= var67, arg0, var50, class29.method183(true, var83, var72, var82), var43, 86, var47);
                    }
                    if (var65 != var70 && var70 != var76) {
                        class108 var88 = (class108) var20.method507(var70, 602425312);
                        class277.method1937(arg6, var88, var64 >= var64, var48, arg12, var46, class29.method183(true, var84, var68, var79), arg3, class29.method183(true, var84, var73, var81), var63 >= var64, arg13, var62 >= var64, class29.method183(true, var84, var69, var78), var44, var51, var67 >= var64, arg0, var50, class29.method183(true, var84, var72, var82), var43, 65, var47);
                    }
                    if (var65 != var74 && var74 != var76 && var70 != var74) {
                        class108 var89 = (class108) var20.method507(var74, 602425312);
                        class277.method1937(arg6, var89, var67 <= var64, var48, arg12, var46, class29.method183(true, var85, var68, var79), arg3, class29.method183(true, var85, var73, var81), var63 >= var67, arg13, var67 <= var62, class29.method183(true, var85, var69, var78), var44, var51, var67 >= var67, arg0, var50, class29.method183(true, var85, var72, var82), var43, 39, var47);
                    }
                }
            }
            var43++;
        }
        for (class108 var90 = (class108) var20.method502((byte) -104); var90 != null; var90 = (class108) var20.method494(true)) {
            if (var90.field1907 == 0) {
                var90.method961((byte) 89);
            } else {
                var90.method742();
            }
        }
        int var91 = var20.method500(arg5 - 4);
        long[] var92 = new long[var91];
        class108[] var93 = new class108[var91];
        var20.method495(arg5 ^ 0xFFFFFFFB, var93);
        for (int var94 = 0; var94 < var91; var94++) {
            var92[var94] = var93[var94].field2418;
        }
        class156.method1115(var92, var93, (byte) -94);
        return var93;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 434)
    public static void method32(int arg0) {
        field43 = null;
        if (arg0 >= -98) {
            field41 = -95;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([Lme;II)V", line = 446)
    public static final void method33(class75[] arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class75 var4 = arg0[var3];
            if (var4 != null && var4.field1280 == arg1 && (!var4.field1136 || !client.method874(var4))) {
                if (var4.field1184 == 0) {
                    if (!var4.field1136 && client.method874(var4) && class302.field5154 != var4) {
                        continue;
                    }
                    method33(arg0, var4.field1172, -112);
                    if (var4.field1274 != null) {
                        method33(var4.field1274, var4.field1172, -114);
                    }
                    class146 var5 = (class146) class191.field3195.method507((long) var4.field1172, 602425312);
                    if (var5 != null) {
                        class150.method1034(16294, var5.field2474);
                    }
                }
                if (var4.field1184 == 6) {
                    if (var4.field1235 != -1 || var4.field1192 != -1) {
                        boolean var6 = class135.method925(41, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field1192;
                        } else {
                            var7 = var4.field1235;
                        }
                        if (var7 != -1) {
                            class35 var8 = class284.method1973(var7, false);
                            if (var8 != null) {
                                var4.field1139 += class243.field4229;
                                while (var8.field539[var4.field1202] < var4.field1139) {
                                    var4.field1139 -= var8.field539[var4.field1202];
                                    var4.field1202++;
                                    if (var4.field1202 >= var8.field547.length) {
                                        var4.field1202 -= var8.field541;
                                        if (var4.field1202 < 0 || var8.field547.length <= var4.field1202) {
                                            var4.field1202 = 0;
                                        }
                                    }
                                    class138.method937(var4, 16);
                                }
                            }
                        }
                    }
                    if (var4.field1267 != 0 && !var4.field1136) {
                        int var9 = var4.field1267 >> 16;
                        int var10 = var4.field1267 << 16 >> 16;
                        int var11 = class243.field4229 * var10;
                        int var12 = class243.field4229 * var9;
                        var4.field1167 = var4.field1167 + var11 & 0x7FF;
                        var4.field1299 = var4.field1299 + var12 & 0x7FF;
                        class138.method937(var4, 16);
                    }
                }
            }
        }
        field44++;
        if (arg2 >= -91) {
            field45 = 98;
        }
    }
}
