import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class163 implements class161 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field2701 = 1;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "Lqd;")
    public static class40 field2708 = class147.method1106("details", (byte) -54);

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "Lqd;")
    public static class40 field2704 = class147.method1106("Ablegen", (byte) -109);

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field2706 = 0;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "Lqd;")
    public static class40 field2712 = class147.method1106("zap", (byte) -85);

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "Lqd;")
    public static class40 field2713 = class147.method1106("leuchten2:", (byte) -127);

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "[J")
    public static long[] field2711 = new long[32];

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "Z")
    public static boolean field2714 = false;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "Lqd;")
    public static class40 field2715 = class147.method1106("welle2:", (byte) -86);

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "[I")
    public static int[] field2705;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "[Lle;")
    public static class236[] field2710;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V", line = 7)
    public static void method1236(int arg0) {
        field2708 = null;
        field2705 = null;
        field2712 = null;
        field2713 = null;
        field2715 = null;
        field2704 = null;
        if (arg0 == 1) {
            field2710 = null;
            field2711 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([[B[[B[[[B[[IB[[F[[BI[[I[[F[[I[[F[[B[[I[[I)[Lwe;", line = 27)
    public static final class47[] method1237(byte[][] arg0, byte[][] arg1, byte[][][] arg2, int[][] arg3, byte arg4, float[][] arg5, byte[][] arg6, int arg7, int[][] arg8, float[][] arg9, int[][] arg10, float[][] arg11, byte[][] arg12, int[][] arg13, int[][] arg14) {
        field2702++;
        int[][] var15 = new int[105][105];
        if (arg4 <= 125) {
            field2714 = true;
        }
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg6[var16][var17];
                if (var18 == 0) {
                    var18 = arg6[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg6[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg6[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class308 var19 = class25.method183(-14949, (var18 & 0xFF) - 1);
                    var15[var16][var17] = (var19.field5163 + 1 << 16) + var19.field5171;
                }
            }
        }
        class199 var20 = new class199(128);
        for (int var21 = 1; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg6[var21][var22] != 0) {
                    int[] var23;
                    if (arg1[var21][var22] == 0) {
                        var23 = class244.field4037[0];
                    } else {
                        var23 = class315.field5347[arg12[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = 0;
                    int var25 = var15[var21][var22];
                    int var26 = var15[var21 + 1][var22];
                    if (arg10 != null) {
                        var24 = arg10[var21][var22] & 0xFFFFFF;
                    }
                    long var27 = (long) var25 << 32 | (long) var24;
                    int var29 = var15[var21][var22 + 1];
                    int var30 = var15[var21 + 1][var22 + 1];
                    long var31 = (long) var26 << 32 | (long) var24;
                    long var33 = (long) var24 | (long) var29 << 32;
                    long var35 = (long) var30 << 32 | (long) var24;
                    int var37 = var23.length / 2;
                    class47 var38 = (class47) var20.method1405((byte) 115, var27);
                    if (var38 == null) {
                        var38 = new class47((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg13 != null, var24);
                        var20.method1396(-19928, var27, var38);
                    }
                    var38.field925++;
                    var38.field902 += var37;
                    if (var27 != var31) {
                        class47 var39 = (class47) var20.method1405((byte) 115, var31);
                        if (var39 == null) {
                            var39 = new class47((var26 >> 16) - 1, (float) (var26 & 0xFFFF), false, arg13 != null, var24);
                            var20.method1396(-19928, var31, var39);
                        }
                        var39.field902 += var37;
                        var39.field925++;
                    }
                    if (var27 != var35 && var31 != var35) {
                        class47 var40 = (class47) var20.method1405((byte) 115, var35);
                        if (var40 == null) {
                            var40 = new class47((var30 >> 16) - 1, (float) (var30 & 0xFFFF), false, arg13 != null, var24);
                            var20.method1396(-19928, var35, var40);
                        }
                        var40.field902 += var37;
                        var40.field925++;
                    }
                    if (var27 != var33 && var31 != var33 && var33 != var35) {
                        class47 var41 = (class47) var20.method1405((byte) 115, var33);
                        if (var41 == null) {
                            var41 = new class47((var29 >> 16) - 1, (float) (var29 & 0xFFFF), false, arg13 != null, var24);
                            var20.method1396(-19928, var33, var41);
                        }
                        var41.field902 += var37;
                        var41.field925++;
                    }
                }
            }
        }
        for (class47 var42 = (class47) var20.method1400(-1); var42 != null; var42 = (class47) var20.method1403(-87)) {
            var42.method426();
        }
        for (int var43 = 1; var43 <= 102; var43++) {
            for (int var44 = 1; var44 <= 102; var44++) {
                if (arg6[var43][var44] != 0) {
                    int var45;
                    if ((arg2[arg7][var43][var44] & 0x8) != 0) {
                        var45 = 0;
                    } else if ((arg2[1][var43][var44] & 0x2) == 2 && arg7 > 0) {
                        var45 = arg7 - 1;
                    } else {
                        var45 = arg7;
                    }
                    int var46 = 128;
                    boolean[] var47 = null;
                    int var48 = 0;
                    if (arg10 != null) {
                        var46 = arg10[var43][var44] >>> 24 << 3;
                        var48 = arg10[var43][var44] & 0xFFFFFF;
                    }
                    byte var49;
                    int[] var50;
                    if (arg1[var43][var44] == 0) {
                        var49 = 0;
                        var50 = class244.field4037[0];
                    } else {
                        var49 = arg0[var43][var44];
                        var47 = class108.field1896[arg12[var43][var44]];
                        var50 = class315.field5347[arg12[var43][var44]];
                        if (var50.length == 0) {
                            continue;
                        }
                    }
                    int var51 = var15[var43 + 1][var44 + 1];
                    int var52 = var15[var43][var44];
                    int var53 = var15[var43 + 1][var44];
                    long var54 = (long) var48 | (long) var52 << 32;
                    int var56 = var15[var43][var44 + 1];
                    long var57 = (long) var53 << 32 | (long) var48;
                    long var59 = (long) var51 << 32 | (long) var48;
                    int var61 = arg8[var43][var44];
                    long var62 = (long) var48 | (long) var56 << 32;
                    int var64 = arg8[var43 + 1][var44 + 1];
                    int var65 = arg8[var43][var44 + 1];
                    int var66 = arg8[var43 + 1][var44];
                    int var67 = arg14[var43 + 1][var44];
                    int var68 = arg14[var43][var44];
                    int var69 = arg14[var43 + 1][var44 + 1];
                    int var70 = arg14[var43][var44 + 1];
                    int var71 = (var52 >> 16) - 1;
                    int var72 = (var53 >> 16) - 1;
                    int var73 = (var51 >> 16) - 1;
                    class47 var74 = (class47) var20.method1405((byte) 115, var54);
                    int var75 = (var56 >> 16) - 1;
                    class246.method1739(var52 >= var52, var47, var53 >= var52, arg11, class31.method284(120, var71, var68, var61), var46, arg5, var45, arg9, 1292988840, var56 >= var52, class31.method284(120, var71, var70, var65), var49, class31.method284(105, var71, var67, var66), arg3, class31.method284(83, var71, var69, var64), var52 <= var51, var44, var50, var74, var43, arg13);
                    if (var54 != var57) {
                        class47 var76 = (class47) var20.method1405((byte) 115, var57);
                        class246.method1739(var53 <= var52, var47, var53 <= var53, arg11, class31.method284(112, var72, var68, var61), var46, arg5, var45, arg9, 1292988840, var56 >= var53, class31.method284(110, var72, var70, var65), var49, class31.method284(104, var72, var67, var66), arg3, class31.method284(102, var72, var69, var64), var51 >= var53, var44, var50, var76, var43, arg13);
                    }
                    if (var54 != var59 && var57 != var59) {
                        class47 var77 = (class47) var20.method1405((byte) 115, var59);
                        class246.method1739(var52 >= var51, var47, var51 <= var53, arg11, class31.method284(122, var73, var68, var61), var46, arg5, var45, arg9, 1292988840, var56 >= var51, class31.method284(90, var73, var70, var65), var49, class31.method284(100, var73, var67, var66), arg3, class31.method284(93, var73, var69, var64), var51 >= var51, var44, var50, var77, var43, arg13);
                    }
                    if (var54 != var62 && var57 != var62 && var59 != var62) {
                        class47 var78 = (class47) var20.method1405((byte) 115, var62);
                        class246.method1739(var52 >= var56, var47, var56 <= var53, arg11, class31.method284(115, var75, var68, var61), var46, arg5, var45, arg9, 1292988840, var56 <= var56, class31.method284(84, var75, var70, var65), var49, class31.method284(112, var75, var67, var66), arg3, class31.method284(84, var75, var69, var64), var56 <= var51, var44, var50, var78, var43, arg13);
                    }
                }
            }
        }
        for (class47 var79 = (class47) var20.method1400(-1); var79 != null; var79 = (class47) var20.method1403(124)) {
            if (var79.field903 == 0) {
                var79.method2095(0);
            } else {
                var79.method424();
            }
        }
        int var80 = var20.method1397((byte) 86);
        class47[] var81 = new class47[var80];
        var20.method1406(128, var81);
        long[] var82 = new long[var80];
        for (int var83 = 0; var83 < var80; var83++) {
            var82[var83] = var81[var83].field5149;
        }
        class209.method1478(false, var81, var82);
        return var81;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BI)Z", line = 356)
    public static final boolean method1238(byte arg0, int arg1) {
        int var2 = -50 / ((-arg0 - 29) / 49);
        field2703++;
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZI[IJ)Lqd;", line = 368)
    public final class40 method1233(boolean arg0, int arg1, int[] arg2, long arg3) {
        if (!arg0) {
            field2713 = (class40) null;
        }
        field2707++;
        if (arg1 == 0) {
            class247 var6 = class204.method1436(arg2[0], (byte) -116);
            return var6.method1750((int) arg3, 1);
        } else if (arg1 == 1 || arg1 == 10) {
            class277 var7 = class165.method1243(-119, (int) arg3);
            return var7.field4628;
        } else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
            return class204.method1436(arg2[0], (byte) -77).method1750((int) arg3, 1);
        } else {
            return null;
        }
    }
}
