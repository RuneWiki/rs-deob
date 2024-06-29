import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class182 extends class185 {

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "I")
    private int field2947;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "I")
    private int field2938;

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "I")
    private int field2950;

    @OriginalMember(owner = "client!vk", name = "E", descriptor = "I")
    private int field2951;

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "I")
    private int field2942;

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "I")
    private int field2945;

    @OriginalMember(owner = "client!vk", name = "C", descriptor = "I")
    private int field2949;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
    private int field2935;

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "[S")
    public static short[] field2943 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "Ljava/lang/String;")
    public static String field2941 = "flash3:";

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "Ltl;")
    public static class222 field2939 = new class222(4);

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!vk", name = "A", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!vk", name = "F", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "Lkb;")
    public static class39 field2934;

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "Lkb;")
    public static class39 field2946;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([[I[[B[[F[[B[[F[[FB[[I[[B[[B[[I[[I[[I[[[B[[[II)[Lkd;", line = 7)
    public static final class83[] method1256(int[][] arg0, byte[][] arg1, float[][] arg2, byte[][] arg3, float[][] arg4, float[][] arg5, byte arg6, int[][] arg7, byte[][] arg8, byte[][] arg9, int[][] arg10, int[][] arg11, int[][] arg12, byte[][][] arg13, int[][][] arg14, int arg15) {
        field2948++;
        int[][] var16 = new int[105][105];
        for (int var17 = 1; var17 <= 103; var17++) {
            for (int var18 = 1; var18 <= 103; var18++) {
                int var19 = 0;
                if (arg14 != null) {
                    int var20 = arg14[arg15][var17 >> 3][var18 >> 3];
                    var19 = (var20 & 0x6) >> 1;
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
                    class342 var23 = class266.method1891((byte) 120, (var22 & 0xFF) - 1);
                    var16[var17][var18] = (var23.field5326 + 1 << 16) + var23.field5327;
                }
            }
        }
        class246 var24 = new class246(128);
        for (int var25 = 1; var25 <= 102; var25++) {
            for (int var26 = 1; var26 <= 102; var26++) {
                if (arg1[var25][var26] != 0) {
                    int[] var27;
                    if (arg3[var25][var26] == 0) {
                        var27 = class295.field4633[0];
                    } else {
                        var27 = class284.field4486[arg8[var25][var26]];
                        if (var27.length == 0) {
                            continue;
                        }
                    }
                    int var28 = var16[var25][var26];
                    int var29 = var16[var25 + 1][var26];
                    int var30 = 0;
                    int var31 = var16[var25 + 1][var26 + 1];
                    if (arg10 != null) {
                        var30 = arg10[var25][var26] & 0xFFFFFF;
                    }
                    long var32 = (long) var29 << 32 | (long) var30;
                    int var34 = var16[var25][var26 + 1];
                    long var35 = (long) var30 | (long) var28 << 32;
                    long var37 = (long) var30 | (long) var31 << 32;
                    long var39 = (long) var34 << 32 | (long) var30;
                    int var41 = var27.length / 2;
                    class83 var42 = (class83) var24.method1743(var35, (byte) -115);
                    if (var42 == null) {
                        var42 = new class83((var28 >> 16) - 1, (float) (var28 & 0xFFFF), false, arg7 != null, var30);
                        var24.method1750(var42, (byte) 123, var35);
                    }
                    var42.field1265++;
                    var42.field1256 += var41;
                    if (var32 != var35) {
                        class83 var43 = (class83) var24.method1743(var32, (byte) 111);
                        if (var43 == null) {
                            var43 = new class83((var29 >> 16) - 1, (float) (var29 & 0xFFFF), false, arg7 != null, var30);
                            var24.method1750(var43, (byte) 121, var32);
                        }
                        var43.field1256 += var41;
                        var43.field1265++;
                    }
                    if (var35 != var37 && var32 != var37) {
                        class83 var44 = (class83) var24.method1743(var37, (byte) -21);
                        if (var44 == null) {
                            var44 = new class83((var31 >> 16) - 1, (float) (var31 & 0xFFFF), false, arg7 != null, var30);
                            var24.method1750(var44, (byte) 124, var37);
                        }
                        var44.field1256 += var41;
                        var44.field1265++;
                    }
                    if (var35 != var39 && var32 != var39 && var37 != var39) {
                        class83 var45 = (class83) var24.method1743(var39, (byte) -100);
                        if (var45 == null) {
                            var45 = new class83((var34 >> 16) - 1, (float) (var34 & 0xFFFF), false, arg7 != null, var30);
                            var24.method1750(var45, (byte) 124, var39);
                        }
                        var45.field1256 += var41;
                        var45.field1265++;
                    }
                }
            }
        }
        if (arg6 > -39) {
            method1257(99, true, 36, -112, 13, -16, -44);
        }
        for (class83 var46 = (class83) var24.method1746((byte) -33); var46 != null; var46 = (class83) var24.method1749((byte) 78)) {
            var46.method614();
        }
        for (int var47 = 1; var47 <= 102; var47++) {
            for (int var48 = 1; var48 <= 102; var48++) {
                byte var49 = arg1[var47][var48];
                if (var49 != 0) {
                    int var50 = 0;
                    int var51;
                    if ((arg13[arg15][var47][var48] & 0x8) != 0) {
                        var51 = 0;
                    } else if ((arg13[1][var47][var48] & 0x2) == 2 && arg15 > 0) {
                        var51 = arg15 - 1;
                    } else {
                        var51 = arg15;
                    }
                    int var52 = 128;
                    if (arg10 != null) {
                        var50 = arg10[var47][var48] & 0xFFFFFF;
                        var52 = arg10[var47][var48] >>> 24 << 3;
                    }
                    boolean[] var53 = null;
                    int[] var54;
                    byte var65;
                    if (arg3[var47][var48] == 0) {
                        var54 = class295.field4633[0];
                        byte var55 = 0;
                        int var56 = var55 + (arg1[var47 - 1][var48 - 1] == var49 ? 1 : -1);
                        byte var57 = 0;
                        int var58 = var57 + (arg1[var47 + 1][var48 - 1] == var49 ? 1 : -1);
                        if (arg1[var47][var48 - 1] == var49) {
                            var56++;
                            var58++;
                        } else {
                            var58--;
                            var56--;
                        }
                        byte var59 = 0;
                        int var60 = var59 + (arg1[var47 + 1][var48 + 1] == var49 ? 1 : -1);
                        if (arg1[var47 + 1][var48] == var49) {
                            var58++;
                            var60++;
                        } else {
                            var60--;
                            var58--;
                        }
                        byte var61 = 0;
                        int var62 = var61 + (arg1[var47 - 1][var48 + 1] == var49 ? 1 : -1);
                        if (arg1[var47][var48 + 1] == var49) {
                            var60++;
                            var62++;
                        } else {
                            var60--;
                            var62--;
                        }
                        if (arg1[var47 - 1][var48] == var49) {
                            var62++;
                            var56++;
                        } else {
                            var62--;
                            var56--;
                        }
                        int var63 = var56 - var60;
                        int var64 = var58 - var62;
                        if (var64 < 0) {
                            var64 = -var64;
                        }
                        if (var63 < 0) {
                            var63 = -var63;
                        }
                        var65 = (byte) (var63 >= var64 ? 0 : 1);
                        arg9[var47][var48] = var65;
                    } else {
                        var54 = class284.field4486[arg8[var47][var48]];
                        var65 = arg9[var47][var48];
                        var53 = class10.field103[arg8[var47][var48]];
                        if (var54.length == 0) {
                            continue;
                        }
                    }
                    int var66 = var16[var47][var48];
                    int var67 = var16[var47 + 1][var48 + 1];
                    int var68 = var16[var47 + 1][var48];
                    int var69 = var16[var47][var48 + 1];
                    long var70 = (long) var50 | (long) var66 << 32;
                    long var72 = (long) var50 | (long) var68 << 32;
                    long var74 = (long) var50 | (long) var69 << 32;
                    long var76 = (long) var67 << 32 | (long) var50;
                    int var78 = arg0[var47 + 1][var48];
                    int var79 = arg0[var47 + 1][var48 + 1];
                    int var80 = arg0[var47][var48 + 1];
                    int var81 = arg0[var47][var48];
                    int var82 = arg11[var47][var48];
                    int var83 = arg11[var47 + 1][var48];
                    int var84 = arg11[var47][var48 + 1];
                    int var85 = arg11[var47 + 1][var48 + 1];
                    int var86 = (var66 >> 16) - 1;
                    int var87 = (var68 >> 16) - 1;
                    int var88 = (var67 >> 16) - 1;
                    int var89 = (var69 >> 16) - 1;
                    class83 var90 = (class83) var24.method1743(var70, (byte) 107);
                    class124.method861(class256.method1812(-79, var86, var83, var78), var51, false, var53, arg5, arg7, var66 <= var67, class256.method1812(-82, var86, var82, var81), var90, var69 >= var66, arg4, var47, var54, var68 >= var66, var48, var65, class256.method1812(-55, var86, var84, var80), class256.method1812(-37, var86, var85, var79), arg12, var66 <= var66, var52, arg2);
                    if (var70 != var72) {
                        class83 var91 = (class83) var24.method1743(var72, (byte) 114);
                        class124.method861(class256.method1812(-74, var87, var83, var78), var51, false, var53, arg5, arg7, var68 <= var67, class256.method1812(-76, var87, var82, var81), var91, var69 >= var68, arg4, var47, var54, var68 >= var68, var48, var65, class256.method1812(-77, var87, var84, var80), class256.method1812(-125, var87, var85, var79), arg12, var68 <= var66, var52, arg2);
                    }
                    if (var70 != var76 && var72 != var76) {
                        class83 var92 = (class83) var24.method1743(var76, (byte) -125);
                        class124.method861(class256.method1812(-37, var88, var83, var78), var51, false, var53, arg5, arg7, var67 <= var67, class256.method1812(-77, var88, var82, var81), var92, var69 >= var67, arg4, var47, var54, var68 >= var67, var48, var65, class256.method1812(-34, var88, var84, var80), class256.method1812(-32, var88, var85, var79), arg12, var67 <= var66, var52, arg2);
                    }
                    if (var70 != var74 && var72 != var74 && var74 != var76) {
                        class83 var93 = (class83) var24.method1743(var74, (byte) -57);
                        class124.method861(class256.method1812(-115, var89, var83, var78), var51, false, var53, arg5, arg7, var67 >= var69, class256.method1812(-61, var89, var82, var81), var93, var69 <= var69, arg4, var47, var54, var68 >= var69, var48, var65, class256.method1812(-83, var89, var84, var80), class256.method1812(-38, var89, var85, var79), arg12, var66 >= var69, var52, arg2);
                    }
                }
            }
        }
        for (class83 var94 = (class83) var24.method1746((byte) -33); var94 != null; var94 = (class83) var24.method1749((byte) -97)) {
            if (var94.field1249 == 0) {
                var94.method465((byte) -122);
            } else {
                var94.method611();
            }
        }
        int var95 = var24.method1744(91);
        long[] var96 = new long[var95];
        class83[] var97 = new class83[var95];
        var24.method1752(var97, -58);
        for (int var98 = 0; var98 < var95; var98++) {
            var96[var98] = var97[var98].field916;
        }
        class20.method129(126, var97, var96);
        return var97;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIB)V", line = 467)
    public final void method718(int arg0, int arg1, byte arg2) {
        int var4 = -55 / ((arg2 + 39) / 61);
        field2937++;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZIIIII)V", line = 475)
    public static final void method1257(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class62.field815 = arg0;
        field2940++;
        class255.field4041 = arg3;
        class240.field3800 = arg4;
        class91.field1396 = arg6;
        int var7 = -15 % ((-arg2 - 45) / 45);
        class277.field4378 = arg5;
        if (arg1 && class62.field815 >= 100) {
            class27.field388 = class277.field4378 * 128 + 64;
            class74.field983 = class255.field4041 * 128 + 64;
            class161.field2644 = class227.method1653(class74.field983, class27.field388, -12282, class148.field2209) - class91.field1396;
        }
        class282.field4461 = 2;
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)V", line = 519)
    public static void method1258(int arg0) {
        field2946 = null;
        field2939 = null;
        field2943 = null;
        field2934 = null;
        field2941 = null;
        if (arg0 != 1) {
            field2939 = (class222) null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)I", line = 533)
    public static final int method1259(int arg0) {
        if (arg0 < 92) {
            return -111;
        } else {
            field2936++;
            return class263.field4172 == 0 ? 0 : class111.field1657[class263.field4172].method304();
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 549)
    public class182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2947 = arg5;
        this.field2938 = arg6;
        this.field2950 = arg2;
        this.field2951 = arg7;
        this.field2942 = arg4;
        this.field2945 = arg0;
        this.field2949 = arg1;
        this.field2935 = arg3;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)V", line = 575)
    public final void method721(int arg0, int arg1, int arg2) {
        field2952++;
        int var4 = this.field2949 * arg2 >> 12;
        if (arg1 != -1) {
            field2943 = (short[]) null;
        }
        int var5 = this.field2945 * arg0 >> 12;
        int var6 = this.field2935 * arg2 >> 12;
        int var7 = this.field2950 * arg0 >> 12;
        int var8 = this.field2942 * arg0 >> 12;
        int var9 = this.field2947 * arg2 >> 12;
        int var10 = this.field2938 * arg0 >> 12;
        int var11 = this.field2951 * arg2 >> 12;
        class168.method1156(var4, var8, var5, arg1 ^ 0xFFFFF8FF, var10, var9, var11, var6, this.field2974, var7);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBI)V", line = 601)
    public final void method717(int arg0, byte arg1, int arg2) {
        field2944++;
        if (arg1 <= 43) {
            this.method721(74, 48, 63);
        }
    }
}
