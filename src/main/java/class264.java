import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class264 extends class255 {

    @OriginalMember(owner = "client!wn", name = "q", descriptor = "I")
    private int field4040;

    @OriginalMember(owner = "client!wn", name = "v", descriptor = "I")
    private int field4045;

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "I")
    private int field4039;

    @OriginalMember(owner = "client!wn", name = "r", descriptor = "I")
    private int field4041;

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "[I")
    public static int[] field4038 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!wn", name = "t", descriptor = "I")
    public static int field4043 = 0;

    @OriginalMember(owner = "client!wn", name = "s", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!wn", name = "u", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!wn", name = "w", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!wn", name = "x", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!wn", name = "y", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)V", line = 4)
    public final void method699(int arg0, int arg1, int arg2) {
        field4042++;
        if (arg0 != 16900) {
            this.field4039 = -18;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIB)V", line = 18)
    public final void method701(int arg0, int arg1, byte arg2) {
        int var4 = this.field4039 * arg0 >> 12;
        field4046++;
        int var5 = this.field4041 * arg1 >> 12;
        int var6 = this.field4040 * arg1 >> 12;
        int var7 = 106 % ((1 - arg2) / 57);
        int var8 = this.field4045 * arg0 >> 12;
        class126.method936((byte) -113, var8, var6, var4, this.field3803, var5);
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(III)V", line = 36)
    public final void method703(int arg0, int arg1, int arg2) {
        field4044++;
        int var4 = this.field4039 * arg0 >> 12;
        int var5 = this.field4045 * arg0 >> 12;
        int var6 = this.field4041 * arg1 >> 12;
        int var7 = this.field4040 * arg1 >> 12;
        if (arg2 != 27159) {
            this.method699(77, -108, -65);
        }
        class193.method1391(this.field3809, this.field3812, var6, var4, this.field3803, var5, -108, var7);
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)V", line = 56)
    public static void method1961(int arg0) {
        field4038 = null;
        if (arg0 != 1) {
            field4048 = -71;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "([[B[[B[[I[[[II[[II[[F[[[B[[B[[F[[B[[I[[I[[F[[I)[Lnk;", line = 80)
    public static final class224[] method1962(byte[][] arg0, byte[][] arg1, int[][] arg2, int[][][] arg3, int arg4, int[][] arg5, int arg6, float[][] arg7, byte[][][] arg8, byte[][] arg9, float[][] arg10, byte[][] arg11, int[][] arg12, int[][] arg13, float[][] arg14, int[][] arg15) {
        int[][] var16 = new int[105][105];
        for (int var17 = 1; var17 <= 103; var17++) {
            for (int var18 = 1; var18 <= 103; var18++) {
                int var19 = 0;
                if (arg3 != null) {
                    int var20 = arg3[arg4][var17 >> 3][var18 >> 3];
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
                    class37 var23 = class165.method1177(26277, (var22 & 0xFF) - 1);
                    var16[var17][var18] = (var23.field557 + 1 << 16) + var23.field545;
                }
            }
        }
        if (arg6 != -764995956) {
            method1961(-101);
        }
        field4047++;
        class196 var24 = new class196(128);
        for (int var25 = 1; var25 <= 102; var25++) {
            for (int var26 = 1; var26 <= 102; var26++) {
                if (arg11[var25][var26] != 0) {
                    int[] var27;
                    if (arg1[var25][var26] == 0) {
                        var27 = class149.field2175[0];
                    } else {
                        var27 = class81.field1166[arg9[var25][var26]];
                        if (var27.length == 0) {
                            continue;
                        }
                    }
                    int var28 = var16[var25][var26];
                    int var29 = var16[var25 + 1][var26];
                    int var30 = var16[var25 + 1][var26 + 1];
                    int var31 = var16[var25][var26 + 1];
                    int var32 = 0;
                    if (arg15 != null) {
                        var32 = arg15[var25][var26] & 0xFFFFFF;
                    }
                    long var33 = (long) var32 | (long) var28 << 32;
                    long var35 = (long) var30 << 32 | (long) var32;
                    long var37 = (long) var32 | (long) var29 << 32;
                    long var39 = (long) var31 << 32 | (long) var32;
                    int var41 = var27.length / 2;
                    class224 var42 = (class224) var24.method1405(var33, false);
                    if (var42 == null) {
                        var42 = new class224((var28 >> 16) - 1, (float) (var28 & 0xFFFF), false, arg2 != null, var32);
                        var24.method1400(var33, 111, var42);
                    }
                    var42.field3363++;
                    var42.field3380 += var41;
                    if (var33 != var37) {
                        class224 var43 = (class224) var24.method1405(var37, false);
                        if (var43 == null) {
                            var43 = new class224((var29 >> 16) - 1, (float) (var29 & 0xFFFF), false, arg2 != null, var32);
                            var24.method1400(var37, 115, var43);
                        }
                        var43.field3363++;
                        var43.field3380 += var41;
                    }
                    if (var33 != var35 && var35 != var37) {
                        class224 var44 = (class224) var24.method1405(var35, false);
                        if (var44 == null) {
                            var44 = new class224((var30 >> 16) - 1, (float) (var30 & 0xFFFF), false, arg2 != null, var32);
                            var24.method1400(var35, 121, var44);
                        }
                        var44.field3380 += var41;
                        var44.field3363++;
                    }
                    if (var33 != var39 && var37 != var39 && var35 != var39) {
                        class224 var45 = (class224) var24.method1405(var39, false);
                        if (var45 == null) {
                            var45 = new class224((var31 >> 16) - 1, (float) (var31 & 0xFFFF), false, arg2 != null, var32);
                            var24.method1400(var39, 122, var45);
                        }
                        var45.field3363++;
                        var45.field3380 += var41;
                    }
                }
            }
        }
        for (class224 var46 = (class224) var24.method1406(0); var46 != null; var46 = (class224) var24.method1404(-86)) {
            var46.method1645();
        }
        for (int var47 = 1; var47 <= 102; var47++) {
            for (int var48 = 1; var48 <= 102; var48++) {
                byte var49 = arg11[var47][var48];
                if (var49 != 0) {
                    int var50;
                    if ((arg8[arg4][var47][var48] & 0x8) != 0) {
                        var50 = 0;
                    } else if ((arg8[1][var47][var48] & 0x2) == 2 && arg4 > 0) {
                        var50 = arg4 - 1;
                    } else {
                        var50 = arg4;
                    }
                    int var51 = 0;
                    int var52 = 128;
                    if (arg15 != null) {
                        var52 = arg15[var47][var48] >>> 24 << 3;
                        var51 = arg15[var47][var48] & 0xFFFFFF;
                    }
                    boolean[] var53 = null;
                    byte var54;
                    int[] var55;
                    if (arg1[var47][var48] == 0) {
                        byte var56 = 0;
                        var55 = class149.field2175[0];
                        int var57 = var56 + (arg11[var47 - 1][var48 - 1] == var49 ? 1 : -1);
                        byte var58 = 0;
                        int var59 = var58 + (arg11[var47 + 1][var48 - 1] == var49 ? 1 : -1);
                        byte var60 = 0;
                        int var61 = var60 + (arg11[var47 + 1][var48 + 1] == var49 ? 1 : -1);
                        byte var62 = 0;
                        if (arg11[var47][var48 - 1] == var49) {
                            var59++;
                            var57++;
                        } else {
                            var59--;
                            var57--;
                        }
                        int var63 = var62 + (arg11[var47 - 1][var48 + 1] == var49 ? 1 : -1);
                        if (arg11[var47 + 1][var48] == var49) {
                            var61++;
                            var59++;
                        } else {
                            var61--;
                            var59--;
                        }
                        if (arg11[var47][var48 + 1] == var49) {
                            var63++;
                            var61++;
                        } else {
                            var63--;
                            var61--;
                        }
                        if (arg11[var47 - 1][var48] == var49) {
                            var57++;
                            var63++;
                        } else {
                            var57--;
                            var63--;
                        }
                        int var64 = var57 - var61;
                        int var65 = var59 - var63;
                        if (var65 < 0) {
                            var65 = -var65;
                        }
                        if (var64 < 0) {
                            var64 = -var64;
                        }
                        var54 = (byte) (var65 <= var64 ? 0 : 1);
                        arg0[var47][var48] = var54;
                    } else {
                        var54 = arg0[var47][var48];
                        var53 = class359.field5665[arg9[var47][var48]];
                        var55 = class81.field1166[arg9[var47][var48]];
                        if (var55.length == 0) {
                            continue;
                        }
                    }
                    int var66 = var16[var47][var48];
                    int var67 = var16[var47 + 1][var48];
                    int var68 = var16[var47 + 1][var48 + 1];
                    long var69 = (long) var51 | (long) var66 << 32;
                    long var71 = (long) var67 << 32 | (long) var51;
                    long var73 = (long) var51 | (long) var68 << 32;
                    int var75 = var16[var47][var48 + 1];
                    long var76 = (long) var51 | (long) var75 << 32;
                    int var78 = arg13[var47 + 1][var48];
                    int var79 = arg13[var47][var48];
                    int var80 = arg13[var47 + 1][var48 + 1];
                    int var81 = arg13[var47][var48 + 1];
                    int var82 = arg12[var47][var48];
                    int var83 = arg12[var47][var48 + 1];
                    int var84 = arg12[var47 + 1][var48];
                    int var85 = arg12[var47 + 1][var48 + 1];
                    int var86 = (var66 >> 16) - 1;
                    int var87 = (var67 >> 16) - 1;
                    int var88 = (var68 >> 16) - 1;
                    class224 var89 = (class224) var24.method1405(var69, false);
                    class357.method2478(var50, 127, arg5, var67 >= var66, class333.method2352(var81, var83, var86, (byte) -13), class333.method2352(var79, var82, var86, (byte) -13), var47, arg10, class333.method2352(var78, var84, var86, (byte) -13), var54, var48, arg14, var66 <= var68, arg7, arg2, var55, var89, class333.method2352(var80, var85, var86, (byte) -13), var53, var75 >= var66, var52, var66 >= var66);
                    if (var69 != var71) {
                        class224 var90 = (class224) var24.method1405(var71, false);
                        class357.method2478(var50, 124, arg5, var67 <= var67, class333.method2352(var81, var83, var87, (byte) -13), class333.method2352(var79, var82, var87, (byte) -13), var47, arg10, class333.method2352(var78, var84, var87, (byte) -13), var54, var48, arg14, var68 >= var67, arg7, arg2, var55, var90, class333.method2352(var80, var85, var87, (byte) -13), var53, var67 <= var75, var52, var67 <= var66);
                    }
                    int var91 = (var75 >> 16) - 1;
                    if (var69 != var73 && var71 != var73) {
                        class224 var92 = (class224) var24.method1405(var73, false);
                        class357.method2478(var50, 124, arg5, var67 >= var68, class333.method2352(var81, var83, var88, (byte) -13), class333.method2352(var79, var82, var88, (byte) -13), var47, arg10, class333.method2352(var78, var84, var88, (byte) -13), var54, var48, arg14, var68 <= var68, arg7, arg2, var55, var92, class333.method2352(var80, var85, var88, (byte) -13), var53, var68 <= var75, var52, var68 <= var66);
                    }
                    if (var69 != var76 && var71 != var76 && var73 != var76) {
                        class224 var93 = (class224) var24.method1405(var76, false);
                        class357.method2478(var50, 126, arg5, var75 <= var67, class333.method2352(var81, var83, var91, (byte) -13), class333.method2352(var79, var82, var91, (byte) -13), var47, arg10, class333.method2352(var78, var84, var91, (byte) -13), var54, var48, arg14, var68 >= var75, arg7, arg2, var55, var93, class333.method2352(var80, var85, var91, (byte) -13), var53, var75 <= var75, var52, var75 <= var66);
                    }
                }
            }
        }
        for (class224 var94 = (class224) var24.method1406(0); var94 != null; var94 = (class224) var24.method1404(-58)) {
            if (var94.field3365 == 0) {
                var94.method876(8);
            } else {
                var94.method1642();
            }
        }
        int var95 = var24.method1409(0);
        long[] var96 = new long[var95];
        class224[] var97 = new class224[var95];
        var24.method1403(true, var97);
        for (int var98 = 0; var98 < var95; var98++) {
            var96[var98] = var97[var98].field1656;
        }
        class199.method1448(var97, (byte) -119, var96);
        return var97;
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(IIIIIII)V", line = 541)
    public class264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4040 = arg3;
        this.field4045 = arg2;
        this.field4039 = arg0;
        this.field4041 = arg1;
    }
}
