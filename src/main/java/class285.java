import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class285 {

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "[Lbd;")
    public static class162[] field4812 = new class162[100];

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Z")
    public static volatile boolean field4811 = true;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 27)
    public static void method1967(int arg0) {
        field4812 = null;
        if (arg0 != -1) {
            field4812 = (class162[]) null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B[[I[[F[[B[[I[[B[[F[[I[[B[[F[[[B[[B[[I[[II)[Lba;", line = 47)
    public static final class26[] method1968(byte arg0, int[][] arg1, float[][] arg2, byte[][] arg3, int[][] arg4, byte[][] arg5, float[][] arg6, int[][] arg7, byte[][] arg8, float[][] arg9, byte[][][] arg10, byte[][] arg11, int[][] arg12, int[][] arg13, int arg14) {
        field4813++;
        int[][] var15 = new int[105][105];
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg11[var16][var17];
                if (var18 == 0) {
                    var18 = arg11[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg11[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg11[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class49 var19 = class4.method18((var18 & 0xFF) - 1, true);
                    var15[var16][var17] = (var19.field777 + 1 << 16) + var19.field790;
                }
            }
        }
        class235 var20 = new class235(128);
        for (int var21 = 1; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg11[var21][var22] != 0) {
                    int[] var23;
                    if (arg3[var21][var22] == 0) {
                        var23 = class43.field710[0];
                    } else {
                        var23 = class230.field3830[arg5[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = 0;
                    int var25 = var15[var21][var22];
                    if (arg4 != null) {
                        var24 = arg4[var21][var22] & 0xFFFFFF;
                    }
                    int var26 = var15[var21 + 1][var22];
                    int var27 = var15[var21 + 1][var22 + 1];
                    long var28 = (long) var24 | (long) var26 << 32;
                    long var30 = (long) var25 << 32 | (long) var24;
                    long var32 = (long) var27 << 32 | (long) var24;
                    int var34 = var15[var21][var22 + 1];
                    int var35 = var23.length / 2;
                    class26 var36 = (class26) var20.method1672(var30, 19760);
                    if (var36 == null) {
                        var36 = new class26((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg7 != null, var24);
                        var20.method1674(var36, false, var30);
                    }
                    var36.field432++;
                    var36.field419 += var35;
                    long var37 = (long) var34 << 32 | (long) var24;
                    if (var28 != var30) {
                        class26 var39 = (class26) var20.method1672(var28, 19760);
                        if (var39 == null) {
                            var39 = new class26((var26 >> 16) - 1, (float) (var26 & 0xFFFF), false, arg7 != null, var24);
                            var20.method1674(var39, false, var28);
                        }
                        var39.field432++;
                        var39.field419 += var35;
                    }
                    if (var30 != var32 && var28 != var32) {
                        class26 var40 = (class26) var20.method1672(var32, arg0 ^ 0x4D4E);
                        if (var40 == null) {
                            var40 = new class26((var27 >> 16) - 1, (float) (var27 & 0xFFFF), false, arg7 != null, var24);
                            var20.method1674(var40, false, var32);
                        }
                        var40.field419 += var35;
                        var40.field432++;
                    }
                    if (var30 != var37 && var28 != var37 && var32 != var37) {
                        class26 var41 = (class26) var20.method1672(var37, arg0 ^ 0x4D4E);
                        if (var41 == null) {
                            var41 = new class26((var34 >> 16) - 1, (float) (var34 & 0xFFFF), false, arg7 != null, var24);
                            var20.method1674(var41, false, var37);
                        }
                        var41.field432++;
                        var41.field419 += var35;
                    }
                }
            }
        }
        class26 var42 = (class26) var20.method1666((byte) -67);
        if (arg0 != 126) {
            return (class26[]) null;
        }
        while (var42 != null) {
            var42.method208();
            var42 = (class26) var20.method1673((byte) 110);
        }
        for (int var43 = 1; var43 <= 102; var43++) {
            for (int var44 = 1; var44 <= 102; var44++) {
                if (arg11[var43][var44] != 0) {
                    int var45;
                    if ((arg10[arg14][var43][var44] & 0x8) != 0) {
                        var45 = 0;
                    } else if ((arg10[1][var43][var44] & 0x2) == 2 && arg14 > 0) {
                        var45 = arg14 - 1;
                    } else {
                        var45 = arg14;
                    }
                    int var46 = 0;
                    int var47 = 128;
                    if (arg4 != null) {
                        var47 = arg4[var43][var44] >>> 24 << 3;
                        var46 = arg4[var43][var44] & 0xFFFFFF;
                    }
                    boolean[] var48 = null;
                    byte var49;
                    int[] var50;
                    if (arg3[var43][var44] == 0) {
                        var49 = 0;
                        var50 = class43.field710[0];
                    } else {
                        var50 = class230.field3830[arg5[var43][var44]];
                        var49 = arg8[var43][var44];
                        var48 = class252.field4204[arg5[var43][var44]];
                        if (var50.length == 0) {
                            continue;
                        }
                    }
                    int var51 = var15[var43 + 1][var44];
                    int var52 = var15[var43 + 1][var44 + 1];
                    int var53 = var15[var43][var44];
                    int var54 = var15[var43][var44 + 1];
                    long var55 = (long) var46 | (long) var53 << 32;
                    long var57 = (long) var46 | (long) var51 << 32;
                    long var59 = (long) var52 << 32 | (long) var46;
                    long var61 = (long) var46 | (long) var54 << 32;
                    int var63 = arg1[var43 + 1][var44];
                    int var64 = arg1[var43][var44];
                    int var65 = arg1[var43 + 1][var44 + 1];
                    int var66 = arg13[var43][var44];
                    int var67 = arg1[var43][var44 + 1];
                    int var68 = arg13[var43 + 1][var44];
                    int var69 = arg13[var43 + 1][var44 + 1];
                    int var70 = arg13[var43][var44 + 1];
                    int var71 = (var53 >> 16) - 1;
                    int var72 = (var51 >> 16) - 1;
                    int var73 = (var52 >> 16) - 1;
                    class26 var74 = (class26) var20.method1672(var55, 19760);
                    class18.method168(var48, arg9, class47.method350(var71, -68, var66, var64), arg7, class47.method350(var71, arg0 ^ 0xFFFFFFCE, var68, var63), var49, var52 >= var53, var43, var54 >= var53, var44, var51 >= var53, true, var74, arg12, var47, var53 <= var53, class47.method350(var71, -99, var70, var67), arg6, var45, class47.method350(var71, -95, var69, var65), var50, arg2);
                    int var75 = (var54 >> 16) - 1;
                    if (var55 != var57) {
                        class26 var76 = (class26) var20.method1672(var57, 19760);
                        class18.method168(var48, arg9, class47.method350(var72, -69, var66, var64), arg7, class47.method350(var72, -114, var68, var63), var49, var51 <= var52, var43, var54 >= var51, var44, var51 <= var51, true, var76, arg12, var47, var53 >= var51, class47.method350(var72, -110, var70, var67), arg6, var45, class47.method350(var72, arg0 - 195, var69, var65), var50, arg2);
                    }
                    if (var55 != var59 && var57 != var59) {
                        class26 var77 = (class26) var20.method1672(var59, 19760);
                        class18.method168(var48, arg9, class47.method350(var73, -88, var66, var64), arg7, class47.method350(var73, -91, var68, var63), var49, var52 >= var52, var43, var54 >= var52, var44, var51 >= var52, true, var77, arg12, var47, var53 >= var52, class47.method350(var73, arg0 - 226, var70, var67), arg6, var45, class47.method350(var73, -107, var69, var65), var50, arg2);
                    }
                    if (var55 != var61 && var57 != var61 && var59 != var61) {
                        class26 var78 = (class26) var20.method1672(var61, 19760);
                        class18.method168(var48, arg9, class47.method350(var75, -86, var66, var64), arg7, class47.method350(var75, -107, var68, var63), var49, var52 >= var54, var43, var54 >= var54, var44, var51 >= var54, true, var78, arg12, var47, var53 >= var54, class47.method350(var75, -69, var70, var67), arg6, var45, class47.method350(var75, -103, var69, var65), var50, arg2);
                    }
                }
            }
        }
        for (class26 var79 = (class26) var20.method1666((byte) 81); var79 != null; var79 = (class26) var20.method1673((byte) 54)) {
            if (var79.field431 == 0) {
                var79.method1183(false);
            } else {
                var79.method210();
            }
        }
        int var80 = var20.method1669(false);
        class26[] var81 = new class26[var80];
        var20.method1671(var81, 0);
        long[] var82 = new long[var80];
        for (int var83 = 0; var83 < var80; var83++) {
            var82[var83] = var81[var83].field2701;
        }
        class265.method1814(var82, var81, 0);
        return var81;
    }
}
