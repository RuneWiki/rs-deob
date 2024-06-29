import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class159 extends class196 {

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    private int field2629;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    private int field2625;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    private int field2628;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    private int field2623;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "I")
    private int field2636;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    private int field2630;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    private int field2624;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    private int field2626;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "Z")
    public static boolean field2627 = false;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "Ljava/lang/String;")
    public static String field2633 = "glow1:";

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field2622 = 0;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    public static int field2635 = 0;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "[I")
    public static int[] field2637 = new int[8];

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 5)
    public static void method1139(int arg0) {
        field2637 = null;
        if (arg0 >= -113) {
            method1139(-88);
        }
        field2633 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([[F[[I[[B[[F[[B[[I[[I[[I[[BI[[[I[[B[[II[[[B[[F)[Lrc;", line = 29)
    public static final class206[] method1140(float[][] arg0, int[][] arg1, byte[][] arg2, float[][] arg3, byte[][] arg4, int[][] arg5, int[][] arg6, int[][] arg7, byte[][] arg8, int arg9, int[][][] arg10, byte[][] arg11, int[][] arg12, int arg13, byte[][][] arg14, float[][] arg15) {
        field2631++;
        int[][] var16 = new int[105][105];
        for (int var17 = 1; var17 <= 103; var17++) {
            for (int var18 = 1; var18 <= 103; var18++) {
                int var19 = 0;
                if (arg10 != null) {
                    int var20 = arg10[arg13][var17 >> 3][var18 >> 3];
                    var19 = var20 >> 1 & 0x3;
                }
                boolean var21 = false;
                byte var22;
                if (var19 == 0) {
                    var22 = arg11[var17][var18];
                    if (var22 == 0) {
                        var22 = arg11[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg11[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg11[var17 - 1][var18 - 1];
                    }
                } else if (var19 == 1) {
                    var22 = arg11[var17][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg11[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg11[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg11[var17 - 1][var18];
                    }
                } else if (var19 == 2) {
                    var22 = arg11[var17 - 1][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg11[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg11[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg11[var17][var18];
                    }
                } else {
                    var22 = arg11[var17 - 1][var18];
                    if (var22 == 0) {
                        var22 = arg11[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg11[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg11[var17][var18 - 1];
                    }
                }
                if (var22 != 0) {
                    class229 var23 = class91.method616((var22 & 0xFF) - 1, -62);
                    var16[var17][var18] = (var23.field3647 + 1 << 16) + var23.field3642;
                }
            }
        }
        class69 var24 = new class69(128);
        for (int var25 = 1; var25 <= 102; var25++) {
            for (int var26 = 1; var26 <= 102; var26++) {
                if (arg11[var25][var26] != 0) {
                    int[] var27;
                    if (arg4[var25][var26] == 0) {
                        var27 = class17.field233[0];
                    } else {
                        var27 = class94.field1283[arg2[var25][var26]];
                        if (var27.length == 0) {
                            continue;
                        }
                    }
                    int var28 = 0;
                    int var29 = var16[var25][var26];
                    if (arg1 != null) {
                        var28 = arg1[var25][var26] & 0xFFFFFF;
                    }
                    int var30 = var16[var25 + 1][var26];
                    int var31 = var16[var25][var26 + 1];
                    int var32 = var16[var25 + 1][var26 + 1];
                    long var33 = (long) var28 | (long) var29 << 32;
                    long var35 = (long) var30 << 32 | (long) var28;
                    long var37 = (long) var28 | (long) var31 << 32;
                    long var39 = (long) var28 | (long) var32 << 32;
                    int var41 = var27.length / 2;
                    class206 var42 = (class206) var24.method451(var33, (byte) 100);
                    if (var42 == null) {
                        var42 = new class206((var29 >> 16) - 1, (float) (var29 & 0xFFFF), false, arg5 != null, var28);
                        var24.method461(-120, var33, var42);
                    }
                    var42.field3390++;
                    var42.field3391 += var41;
                    if (var33 != var35) {
                        class206 var43 = (class206) var24.method451(var35, (byte) 100);
                        if (var43 == null) {
                            var43 = new class206((var30 >> 16) - 1, (float) (var30 & 0xFFFF), false, arg5 != null, var28);
                            var24.method461(18, var35, var43);
                        }
                        var43.field3391 += var41;
                        var43.field3390++;
                    }
                    if (var33 != var39 && var35 != var39) {
                        class206 var44 = (class206) var24.method451(var39, (byte) 100);
                        if (var44 == null) {
                            var44 = new class206((var32 >> 16) - 1, (float) (var32 & 0xFFFF), false, arg5 != null, var28);
                            var24.method461(-123, var39, var44);
                        }
                        var44.field3391 += var41;
                        var44.field3390++;
                    }
                    if (var33 != var37 && var35 != var37 && var37 != var39) {
                        class206 var45 = (class206) var24.method451(var37, (byte) 100);
                        if (var45 == null) {
                            var45 = new class206((var31 >> 16) - 1, (float) (var31 & 0xFFFF), false, arg5 != null, var28);
                            var24.method461(-104, var37, var45);
                        }
                        var45.field3391 += var41;
                        var45.field3390++;
                    }
                }
            }
        }
        for (class206 var46 = (class206) var24.method458((byte) -16); var46 != null; var46 = (class206) var24.method455((byte) 64)) {
            var46.method1496();
        }
        for (int var47 = 1; var47 <= 102; var47++) {
            for (int var48 = 1; var48 <= 102; var48++) {
                byte var49 = arg11[var47][var48];
                if (var49 != 0) {
                    int var50;
                    if ((arg14[arg13][var47][var48] & 0x8) != 0) {
                        var50 = 0;
                    } else if ((arg14[1][var47][var48] & 0x2) == 2 && arg13 > 0) {
                        var50 = arg13 - 1;
                    } else {
                        var50 = arg13;
                    }
                    boolean[] var51 = null;
                    int var52 = 128;
                    int var53 = 0;
                    if (arg1 != null) {
                        var52 = arg1[var47][var48] >>> 24 << 3;
                        var53 = arg1[var47][var48] & 0xFFFFFF;
                    }
                    int[] var54;
                    byte var55;
                    if (arg4[var47][var48] == 0) {
                        byte var56 = 0;
                        var54 = class17.field233[0];
                        int var57 = var56 + (arg11[var47 - 1][var48 - 1] == var49 ? 1 : -1);
                        byte var58 = 0;
                        byte var59 = 0;
                        int var60 = var58 + (arg11[var47 + 1][var48 - 1] == var49 ? 1 : -1);
                        if (arg11[var47][var48 - 1] == var49) {
                            var60++;
                            var57++;
                        } else {
                            var60--;
                            var57--;
                        }
                        int var61 = var59 + (arg11[var47 - 1][var48 + 1] == var49 ? 1 : -1);
                        byte var62 = 0;
                        int var63 = var62 + (arg11[var47 + 1][var48 + 1] == var49 ? 1 : -1);
                        if (arg11[var47 + 1][var48] == var49) {
                            var63++;
                            var60++;
                        } else {
                            var60--;
                            var63--;
                        }
                        if (arg11[var47][var48 + 1] == var49) {
                            var61++;
                            var63++;
                        } else {
                            var63--;
                            var61--;
                        }
                        if (arg11[var47 - 1][var48] == var49) {
                            var61++;
                            var57++;
                        } else {
                            var61--;
                            var57--;
                        }
                        int var64 = var60 - var61;
                        int var65 = var57 - var63;
                        if (var65 < 0) {
                            var65 = -var65;
                        }
                        if (var64 < 0) {
                            var64 = -var64;
                        }
                        var55 = (byte) (var65 < var64 ? 1 : 0);
                        arg8[var47][var48] = var55;
                    } else {
                        var54 = class94.field1283[arg2[var47][var48]];
                        var51 = class196.field3197[arg2[var47][var48]];
                        var55 = arg8[var47][var48];
                        if (var54.length == 0) {
                            continue;
                        }
                    }
                    int var66 = var16[var47 + 1][var48];
                    int var67 = var16[var47][var48];
                    int var68 = var16[var47 + 1][var48 + 1];
                    int var69 = var16[var47][var48 + 1];
                    long var70 = (long) var69 << 32 | (long) var53;
                    long var72 = (long) var66 << 32 | (long) var53;
                    long var74 = (long) var53 | (long) var67 << 32;
                    long var76 = (long) var53 | (long) var68 << 32;
                    int var78 = arg12[var47][var48];
                    int var79 = arg12[var47 + 1][var48];
                    int var80 = arg12[var47 + 1][var48 + 1];
                    int var81 = arg12[var47][var48 + 1];
                    int var82 = arg7[var47][var48];
                    int var83 = arg7[var47 + 1][var48];
                    int var84 = arg7[var47 + 1][var48 + 1];
                    int var85 = (var67 >> 16) - 1;
                    int var86 = arg7[var47][var48 + 1];
                    int var87 = (var69 >> 16) - 1;
                    int var88 = (var66 >> 16) - 1;
                    int var89 = (var68 >> 16) - 1;
                    class206 var90 = (class206) var24.method451(var74, (byte) 100);
                    class227.method1606(arg15, arg0, arg6, true, class45.method290(var85, var80, true, var84), var67 >= var67, class45.method290(var85, var78, true, var82), var50, var47, var51, var54, var67 <= var68, arg5, var55, class45.method290(var85, var81, true, var86), var66 >= var67, class45.method290(var85, var79, true, var83), var90, var52, var48, arg3, var67 <= var69);
                    if (var72 != var74) {
                        class206 var91 = (class206) var24.method451(var72, (byte) 100);
                        class227.method1606(arg15, arg0, arg6, true, class45.method290(var88, var80, true, var84), var67 >= var66, class45.method290(var88, var78, true, var82), var50, var47, var51, var54, var68 >= var66, arg5, var55, class45.method290(var88, var81, true, var86), var66 <= var66, class45.method290(var88, var79, true, var83), var91, var52, var48, arg3, var66 <= var69);
                    }
                    if (var74 != var76 && var72 != var76) {
                        class206 var92 = (class206) var24.method451(var76, (byte) 100);
                        class227.method1606(arg15, arg0, arg6, true, class45.method290(var89, var80, true, var84), var67 >= var68, class45.method290(var89, var78, true, var82), var50, var47, var51, var54, var68 >= var68, arg5, var55, class45.method290(var89, var81, true, var86), var68 <= var66, class45.method290(var89, var79, true, var83), var92, var52, var48, arg3, var69 >= var68);
                    }
                    if (var70 != var74 && var70 != var72 && var70 != var76) {
                        class206 var93 = (class206) var24.method451(var70, (byte) 100);
                        class227.method1606(arg15, arg0, arg6, true, class45.method290(var87, var80, true, var84), var69 <= var67, class45.method290(var87, var78, true, var82), var50, var47, var51, var54, var69 <= var68, arg5, var55, class45.method290(var87, var81, true, var86), var69 <= var66, class45.method290(var87, var79, true, var83), var93, var52, var48, arg3, var69 <= var69);
                    }
                }
            }
        }
        for (class206 var94 = (class206) var24.method458((byte) -16); var94 != null; var94 = (class206) var24.method455((byte) -106)) {
            if (var94.field3384 == 0) {
                var94.method1212((byte) 99);
            } else {
                var94.method1500();
            }
        }
        if (arg9 < 50) {
            field2633 = (String) null;
        }
        int var95 = var24.method460(25595);
        class206[] var96 = new class206[var95];
        long[] var97 = new long[var95];
        var24.method457(false, var96);
        for (int var98 = 0; var98 < var95; var98++) {
            var97[var98] = var96[var98].field2744;
        }
        class83.method566(var97, 21571, var96);
        return var96;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 484)
    public class159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2629 = arg2;
        this.field2625 = arg6;
        this.field2628 = arg7;
        this.field2623 = arg5;
        this.field2636 = arg3;
        this.field2630 = arg0;
        this.field2624 = arg4;
        this.field2626 = arg1;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V", line = 516)
    public final void method1080(int arg0, int arg1, int arg2) {
        int var4 = this.field2626 * arg2 >> 12;
        int var5 = this.field2629 * arg0 >> 12;
        int var6 = this.field2636 * arg2 >> 12;
        if (arg1 != -6577) {
            return;
        }
        int var7 = this.field2630 * arg0 >> 12;
        field2632++;
        int var8 = this.field2623 * arg2 >> 12;
        int var9 = this.field2625 * arg0 >> 12;
        int var10 = this.field2628 * arg2 >> 12;
        int var11 = this.field2624 * arg0 >> 12;
        class150.method1093(var5, var9, var7, var11, var6, var8, var4, 109, var10, this.field3196);
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(III)V", line = 540)
    public final void method1081(int arg0, int arg1, int arg2) {
        field2638++;
        if (arg2 != 31947) {
            field2637 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIZ)V", line = 554)
    public final void method1083(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method1140((float[][]) ((float[][]) null), (int[][]) ((int[][]) null), (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), (int[][]) ((int[][]) null), (int[][]) ((int[][]) null), (int[][]) ((int[][]) null), (byte[][]) ((byte[][]) null), -13, (int[][][]) ((int[][][]) null), (byte[][]) ((byte[][]) null), (int[][]) ((int[][]) null), -128, (byte[][][]) ((byte[][][]) null), (float[][]) ((float[][]) null));
        }
        field2634++;
    }
}
