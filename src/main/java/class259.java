import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class259 extends class224 {

    @OriginalMember(owner = "client!jh", name = "X", descriptor = "I")
    private int field4392 = 4;

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "I")
    private int field4388 = 4;

    @OriginalMember(owner = "client!jh", name = "Z", descriptor = "Z")
    public static boolean field4394 = false;

    @OriginalMember(owner = "client!jh", name = "V", descriptor = "Lkb;")
    public static class80 field4390 = new class80(32);

    @OriginalMember(owner = "client!jh", name = "db", descriptor = "I")
    public static int field4398 = 0;

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!jh", name = "U", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!jh", name = "W", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!jh", name = "Y", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!jh", name = "ab", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!jh", name = "bb", descriptor = "Ldk;")
    public static class241 field4396;

    @OriginalMember(owner = "client!jh", name = "cb", descriptor = "Z")
    public static boolean field4397;

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V", line = 4)
    public class259() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(Z)V", line = 8)
    public static void method1777(boolean arg0) {
        field4396 = null;
        field4390 = null;
        if (!arg0) {
            method1777(true);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)[I", line = 24)
    public final int[] method18(byte arg0, int arg1) {
        int var3 = -14 / ((20 - arg0) / 51);
        int[] var4 = this.field3613.method1866(1, arg1);
        field4386++;
        if (this.field3613.field4531) {
            int var5 = class187.field2961 / this.field4392;
            int var6 = class115.field1791 / this.field4388;
            int[] var8;
            if (var6 > 0) {
                int var7 = arg1 % var6;
                var8 = this.method1537(class115.field1791 * var7 / var6, 0, 0);
            } else {
                var8 = this.method1537(0, 0, 0);
            }
            for (int var9 = 0; var9 < class187.field2961; var9++) {
                if (var5 > 0) {
                    int var10 = var9 % var5;
                    var4[var9] = var8[class187.field2961 * var10 / var5];
                } else {
                    var4[var9] = var8[0];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZLj;)V", line = 84)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        if (arg0 == 0) {
            this.field4392 = arg2.method1042((byte) -122);
        } else if (arg0 == 1) {
            this.field4388 = arg2.method1042((byte) -95);
        }
        if (!arg1) {
            field4391++;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)I", line = 118)
    public static final int method1778(boolean arg0, int arg1) {
        field4393++;
        long var2 = class194.method1368((byte) -108);
        for (class215 var4 = arg0 ? (class215) class209.field3458.method499((byte) -99) : (class215) class209.field3458.method488(1); var4 != null; var4 = (class215) class209.field3458.method488(arg1 ^ 0x1)) {
            if ((var4.field3507 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field3507 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field292;
                    class122.field1891[var5] = class261.field4423[var5];
                    var4.method124((byte) 97);
                    return var5;
                }
                var4.method124((byte) 118);
            }
        }
        if (arg1 != 0) {
            method1778(false, -34);
        }
        return -1;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)[[I", line = 170)
    public final int[][] method17(int arg0, byte arg1) {
        if (arg1 != -77) {
            field4398 = 17;
        }
        field4387++;
        int[][] var3 = this.field3631.method1587(arg0, 9804);
        if (this.field3631.field3756) {
            int var4 = class115.field1791 / this.field4388;
            int var5 = class187.field2961 / this.field4392;
            int[][] var6;
            if (var4 <= 0) {
                var6 = this.method1535(0, 3, 0);
            } else {
                int var7 = arg0 % var4;
                var6 = this.method1535(0, 3, class115.field1791 * var7 / var4);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[2];
            int[] var10 = var6[1];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class187.field2961; var14++) {
                int var15;
                if (var5 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var5;
                    var15 = class187.field2961 * var16 / var5;
                }
                var11[var14] = var8[var15];
                var12[var14] = var10[var15];
                var13[var14] = var9[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "([[IZ[[I[[B[[B[[I[[F[[[B[[I[[I[[BI[[F[[F[[B)[Lvk;", line = 249)
    public static final class192[] method1779(int[][] arg0, boolean arg1, int[][] arg2, byte[][] arg3, byte[][] arg4, int[][] arg5, float[][] arg6, byte[][][] arg7, int[][] arg8, int[][] arg9, byte[][] arg10, int arg11, float[][] arg12, float[][] arg13, byte[][] arg14) {
        field4389++;
        int[][] var15 = new int[105][105];
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg10[var16][var17];
                if (var18 == 0) {
                    var18 = arg10[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg10[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg10[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class149 var19 = class282.method1943(113, (var18 & 0xFF) - 1);
                    var15[var16][var17] = (var19.field2301 + 1 << 16) + var19.field2297;
                }
            }
        }
        class80 var20 = new class80(128);
        for (int var21 = 1; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg10[var21][var22] != 0) {
                    int[] var23;
                    if (arg4[var21][var22] == 0) {
                        var23 = class145.field2253[0];
                    } else {
                        var23 = class215.field3508[arg3[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = 0;
                    if (arg5 != null) {
                        var24 = arg5[var21][var22] & 0xFFFFFF;
                    }
                    int var25 = var15[var21 + 1][var22];
                    int var26 = var15[var21][var22];
                    int var27 = var15[var21 + 1][var22 + 1];
                    long var28 = (long) var26 << 32 | (long) var24;
                    long var30 = (long) var25 << 32 | (long) var24;
                    int var32 = var15[var21][var22 + 1];
                    long var33 = (long) var32 << 32 | (long) var24;
                    int var35 = var23.length / 2;
                    class192 var36 = (class192) var20.method493(var28, 110);
                    if (var36 == null) {
                        var36 = new class192((var26 >> 16) - 1, (float) (var26 & 0xFFFF), false, arg0 != null, var24);
                        var20.method490(var36, var28, true);
                    }
                    var36.field3122++;
                    var36.field3107 += var35;
                    long var37 = (long) var27 << 32 | (long) var24;
                    if (var28 != var30) {
                        class192 var39 = (class192) var20.method493(var30, 69);
                        if (var39 == null) {
                            var39 = new class192((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg0 != null, var24);
                            var20.method490(var39, var30, true);
                        }
                        var39.field3122++;
                        var39.field3107 += var35;
                    }
                    if (var28 != var37 && var30 != var37) {
                        class192 var40 = (class192) var20.method493(var37, 104);
                        if (var40 == null) {
                            var40 = new class192((var27 >> 16) - 1, (float) (var27 & 0xFFFF), false, arg0 != null, var24);
                            var20.method490(var40, var37, true);
                        }
                        var40.field3107 += var35;
                        var40.field3122++;
                    }
                    if (var28 != var33 && var30 != var33 && var33 != var37) {
                        class192 var41 = (class192) var20.method493(var33, 40);
                        if (var41 == null) {
                            var41 = new class192((var32 >> 16) - 1, (float) (var32 & 0xFFFF), false, arg0 != null, var24);
                            var20.method490(var41, var33, arg1);
                        }
                        var41.field3107 += var35;
                        var41.field3122++;
                    }
                }
            }
        }
        for (class192 var42 = (class192) var20.method499((byte) -99); var42 != null; var42 = (class192) var20.method488(1)) {
            var42.method1354();
        }
        for (int var43 = 1; var43 <= 102; var43++) {
            for (int var44 = 1; var44 <= 102; var44++) {
                if (arg10[var43][var44] != 0) {
                    int var45 = 0;
                    int var46;
                    if ((arg7[arg11][var43][var44] & 0x8) != 0) {
                        var46 = 0;
                    } else if ((arg7[1][var43][var44] & 0x2) == 2 && arg11 > 0) {
                        var46 = arg11 - 1;
                    } else {
                        var46 = arg11;
                    }
                    int var47 = 128;
                    if (arg5 != null) {
                        var47 = arg5[var43][var44] >>> 24 << 3;
                        var45 = arg5[var43][var44] & 0xFFFFFF;
                    }
                    boolean[] var48 = null;
                    byte var49;
                    int[] var50;
                    if (arg4[var43][var44] == 0) {
                        var49 = 0;
                        var50 = class145.field2253[0];
                    } else {
                        var49 = arg14[var43][var44];
                        var50 = class215.field3508[arg3[var43][var44]];
                        var48 = class234.field3762[arg3[var43][var44]];
                        if (var50.length == 0) {
                            continue;
                        }
                    }
                    int var51 = var15[var43][var44];
                    int var52 = var15[var43 + 1][var44];
                    int var53 = var15[var43 + 1][var44 + 1];
                    long var54 = (long) var45 | (long) var51 << 32;
                    int var56 = var15[var43][var44 + 1];
                    long var57 = (long) var52 << 32 | (long) var45;
                    long var59 = (long) var45 | (long) var56 << 32;
                    int var61 = arg9[var43][var44];
                    int var62 = arg9[var43 + 1][var44 + 1];
                    long var63 = (long) var45 | (long) var53 << 32;
                    int var65 = arg9[var43 + 1][var44];
                    int var66 = arg9[var43][var44 + 1];
                    int var67 = arg8[var43][var44];
                    int var68 = arg8[var43 + 1][var44];
                    int var69 = arg8[var43][var44 + 1];
                    int var70 = (var51 >> 16) - 1;
                    int var71 = arg8[var43 + 1][var44 + 1];
                    int var72 = (var52 >> 16) - 1;
                    int var73 = (var53 >> 16) - 1;
                    int var74 = (var56 >> 16) - 1;
                    class192 var75 = (class192) var20.method493(var54, 68);
                    class55.method308(var50, arg6, var51 <= var56, class99.method742(var61, var67, (byte) -6, var70), class99.method742(var65, var68, (byte) 120, var70), var47, arg12, var48, var51 <= var52, var43, class99.method742(var66, var69, (byte) 124, var70), arg0, arg13, class99.method742(var62, var71, (byte) 111, var70), var51 >= var51, var44, var46, -67, var49, var75, arg2, var51 <= var53);
                    if (var54 != var57) {
                        class192 var76 = (class192) var20.method493(var57, 66);
                        class55.method308(var50, arg6, var56 >= var52, class99.method742(var61, var67, (byte) 117, var72), class99.method742(var65, var68, (byte) -86, var72), var47, arg12, var48, var52 >= var52, var43, class99.method742(var66, var69, (byte) -125, var72), arg0, arg13, class99.method742(var62, var71, (byte) -81, var72), var52 <= var51, var44, var46, -66, var49, var76, arg2, var53 >= var52);
                    }
                    if (var54 != var63 && var57 != var63) {
                        class192 var77 = (class192) var20.method493(var63, 57);
                        class55.method308(var50, arg6, var53 <= var56, class99.method742(var61, var67, (byte) 108, var73), class99.method742(var65, var68, (byte) 107, var73), var47, arg12, var48, var53 <= var52, var43, class99.method742(var66, var69, (byte) 112, var73), arg0, arg13, class99.method742(var62, var71, (byte) 120, var73), var53 <= var51, var44, var46, -13, var49, var77, arg2, var53 <= var53);
                    }
                    if (var54 != var59 && var57 != var59 && var59 != var63) {
                        class192 var78 = (class192) var20.method493(var59, 57);
                        class55.method308(var50, arg6, var56 >= var56, class99.method742(var61, var67, (byte) 110, var74), class99.method742(var65, var68, (byte) 119, var74), var47, arg12, var48, var52 >= var56, var43, class99.method742(var66, var69, (byte) 125, var74), arg0, arg13, class99.method742(var62, var71, (byte) -52, var74), var56 <= var51, var44, var46, -108, var49, var78, arg2, var53 >= var56);
                    }
                }
            }
        }
        for (class192 var79 = (class192) var20.method499((byte) -99); var79 != null; var79 = (class192) var20.method488(1)) {
            if (var79.field3118 == 0) {
                var79.method124((byte) 101);
            } else {
                var79.method1353();
            }
        }
        int var80 = var20.method498(23563);
        if (!arg1) {
            method1777(false);
        }
        class192[] var81 = new class192[var80];
        var20.method501(0, var81);
        long[] var82 = new long[var80];
        for (int var83 = 0; var83 < var80; var83++) {
            var82[var83] = var81[var83].field292;
        }
        class15.method66(4, var82, var81);
        return var81;
    }
}
