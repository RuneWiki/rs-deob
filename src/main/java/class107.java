import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class107 extends class101 {

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public int field1672;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public int field1669;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "[I")
    public static int[] field1670 = new int[14];

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "[I")
    public static int[] field1668 = new int[5];

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field1674 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V", line = 9)
    public static void method756(int arg0) {
        field1670 = null;
        if (arg0 != 1) {
            field1668 = (int[]) null;
        }
        field1668 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[[I[[B[[BI[[I[[[B[[F[[I[[B[[F[[B[[F[[I[[I)[Ljf;", line = 32)
    public static final class86[] method757(int arg0, int[][] arg1, byte[][] arg2, byte[][] arg3, int arg4, int[][] arg5, byte[][][] arg6, float[][] arg7, int[][] arg8, byte[][] arg9, float[][] arg10, byte[][] arg11, float[][] arg12, int[][] arg13, int[][] arg14) {
        field1675++;
        int[][] var15 = new int[105][105];
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg2[var16][var17];
                if (var18 == 0) {
                    var18 = arg2[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg2[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg2[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class304 var19 = class81.method543(true, (var18 & 0xFF) - 1);
                    var15[var16][var17] = (var19.field4636 + 1 << 16) + var19.field4637;
                }
            }
        }
        class192 var20 = new class192(128);
        for (int var21 = 1; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg2[var21][var22] != 0) {
                    int[] var23;
                    if (arg11[var21][var22] == 0) {
                        var23 = class120.field1877[0];
                    } else {
                        var23 = class222.field3391[arg9[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = 0;
                    if (arg14 != null) {
                        var24 = arg14[var21][var22] & 0xFFFFFF;
                    }
                    int var25 = var15[var21][var22];
                    int var26 = var15[var21 + 1][var22];
                    int var27 = var15[var21 + 1][var22 + 1];
                    int var28 = var15[var21][var22 + 1];
                    long var29 = (long) var26 << 32 | (long) var24;
                    long var31 = (long) var25 << 32 | (long) var24;
                    int var33 = var23.length / 2;
                    class86 var34 = (class86) var20.method1320(var31, 13002);
                    if (var34 == null) {
                        var34 = new class86((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg13 != null, var24);
                        var20.method1319(102, var31, var34);
                    }
                    var34.field1276++;
                    var34.field1260 += var33;
                    long var35 = (long) var24 | (long) var27 << 32;
                    long var37 = (long) var28 << 32 | (long) var24;
                    if (var29 != var31) {
                        class86 var39 = (class86) var20.method1320(var29, 13002);
                        if (var39 == null) {
                            var39 = new class86((var26 >> 16) - 1, (float) (var26 & 0xFFFF), false, arg13 != null, var24);
                            var20.method1319(-120, var29, var39);
                        }
                        var39.field1276++;
                        var39.field1260 += var33;
                    }
                    if (var31 != var35 && var29 != var35) {
                        class86 var40 = (class86) var20.method1320(var35, 13002);
                        if (var40 == null) {
                            var40 = new class86((var27 >> 16) - 1, (float) (var27 & 0xFFFF), false, arg13 != null, var24);
                            var20.method1319(123, var35, var40);
                        }
                        var40.field1276++;
                        var40.field1260 += var33;
                    }
                    if (var31 != var37 && var29 != var37 && var35 != var37) {
                        class86 var41 = (class86) var20.method1320(var37, 13002);
                        if (var41 == null) {
                            var41 = new class86((var28 >> 16) - 1, (float) (var28 & 0xFFFF), false, arg13 != null, var24);
                            var20.method1319(-78, var37, var41);
                        }
                        var41.field1260 += var33;
                        var41.field1276++;
                    }
                }
            }
        }
        for (class86 var42 = (class86) var20.method1321((byte) -119); var42 != null; var42 = (class86) var20.method1330((byte) -94)) {
            var42.method600();
        }
        for (int var43 = 1; var43 <= 102; var43++) {
            for (int var44 = 1; var44 <= 102; var44++) {
                byte var45 = arg2[var43][var44];
                if (var45 != 0) {
                    int var46;
                    if ((arg6[arg4][var43][var44] & 0x8) != 0) {
                        var46 = 0;
                    } else if ((arg6[1][var43][var44] & 0x2) == 2 && arg4 > 0) {
                        var46 = arg4 - 1;
                    } else {
                        var46 = arg4;
                    }
                    int var47 = 0;
                    int var48 = 128;
                    if (arg14 != null) {
                        var47 = arg14[var43][var44] & 0xFFFFFF;
                        var48 = arg14[var43][var44] >>> 24 << 3;
                    }
                    boolean[] var49 = null;
                    byte var50;
                    int[] var51;
                    if (arg11[var43][var44] == 0) {
                        var51 = class120.field1877[0];
                        byte var52 = 0;
                        int var53 = var52 + (arg2[var43 - 1][var44 - 1] == var45 ? 1 : -1);
                        byte var54 = 0;
                        byte var55 = 0;
                        byte var56 = 0;
                        int var57 = var55 + (arg2[var43 - 1][var44 + 1] == var45 ? 1 : -1);
                        int var58 = var56 + (arg2[var43 + 1][var44 - 1] == var45 ? 1 : -1);
                        if (arg2[var43][var44 - 1] == var45) {
                            var53++;
                            var58++;
                        } else {
                            var53--;
                            var58--;
                        }
                        int var59 = var54 + (arg2[var43 + 1][var44 + 1] == var45 ? 1 : -1);
                        if (arg2[var43 + 1][var44] == var45) {
                            var59++;
                            var58++;
                        } else {
                            var59--;
                            var58--;
                        }
                        if (arg2[var43][var44 + 1] == var45) {
                            var59++;
                            var57++;
                        } else {
                            var57--;
                            var59--;
                        }
                        if (arg2[var43 - 1][var44] == var45) {
                            var57++;
                            var53++;
                        } else {
                            var57--;
                            var53--;
                        }
                        int var60 = var58 - var57;
                        if (var60 < 0) {
                            var60 = -var60;
                        }
                        int var61 = var53 - var59;
                        if (var61 < 0) {
                            var61 = -var61;
                        }
                        var50 = (byte) (var60 <= var61 ? 0 : 1);
                        arg3[var43][var44] = var50;
                    } else {
                        var50 = arg3[var43][var44];
                        var51 = class222.field3391[arg9[var43][var44]];
                        var49 = class281.field4270[arg9[var43][var44]];
                        if (var51.length == 0) {
                            continue;
                        }
                    }
                    int var62 = var15[var43][var44];
                    int var63 = var15[var43 + 1][var44];
                    int var64 = var15[var43 + 1][var44 + 1];
                    int var65 = var15[var43][var44 + 1];
                    long var66 = (long) var47 | (long) var62 << 32;
                    long var68 = (long) var63 << 32 | (long) var47;
                    long var70 = (long) var65 << 32 | (long) var47;
                    long var72 = (long) var64 << 32 | (long) var47;
                    int var74 = arg1[var43][var44];
                    int var75 = arg1[var43 + 1][var44];
                    int var76 = arg1[var43 + 1][var44 + 1];
                    int var77 = arg1[var43][var44 + 1];
                    int var78 = arg8[var43 + 1][var44];
                    int var79 = arg8[var43][var44];
                    int var80 = arg8[var43 + 1][var44 + 1];
                    int var81 = arg8[var43][var44 + 1];
                    int var82 = (var63 >> 16) - 1;
                    int var83 = (var62 >> 16) - 1;
                    int var84 = (var64 >> 16) - 1;
                    int var85 = (var65 >> 16) - 1;
                    class86 var86 = (class86) var20.method1320(var66, 13002);
                    class149.method1078(arg5, var44, var62 <= var64, arg7, var51, var46, class161.method1135(var79, var83, 53, var74), arg12, var65 >= var62, class161.method1135(var81, var83, -115, var77), var62 >= var62, arg10, var49, var86, class161.method1135(var80, var83, 100, var76), arg13, var62 <= var63, false, class161.method1135(var78, var83, 74, var75), var50, var43, var48);
                    if (var66 != var68) {
                        class86 var87 = (class86) var20.method1320(var68, 13002);
                        class149.method1078(arg5, var44, var63 <= var64, arg7, var51, var46, class161.method1135(var79, var82, -103, var74), arg12, var63 <= var65, class161.method1135(var81, var82, 29, var77), var63 <= var62, arg10, var49, var87, class161.method1135(var80, var82, 120, var76), arg13, var63 >= var63, false, class161.method1135(var78, var82, 88, var75), var50, var43, var48);
                    }
                    if (var66 != var72 && var68 != var72) {
                        class86 var88 = (class86) var20.method1320(var72, 13002);
                        class149.method1078(arg5, var44, var64 <= var64, arg7, var51, var46, class161.method1135(var79, var84, 38, var74), arg12, var64 <= var65, class161.method1135(var81, var84, -128, var77), var64 <= var62, arg10, var49, var88, class161.method1135(var80, var84, 126, var76), arg13, var63 >= var64, false, class161.method1135(var78, var84, 29, var75), var50, var43, var48);
                    }
                    if (var66 != var70 && var68 != var70 && var70 != var72) {
                        class86 var89 = (class86) var20.method1320(var70, 13002);
                        class149.method1078(arg5, var44, var64 >= var65, arg7, var51, var46, class161.method1135(var79, var85, -88, var74), arg12, var65 <= var65, class161.method1135(var81, var85, 69, var77), var62 >= var65, arg10, var49, var89, class161.method1135(var80, var85, -69, var76), arg13, var63 >= var65, false, class161.method1135(var78, var85, 46, var75), var50, var43, var48);
                    }
                }
            }
        }
        for (class86 var90 = (class86) var20.method1321((byte) -98); var90 != null; var90 = (class86) var20.method1330((byte) -126)) {
            if (var90.field1268 == 0) {
                var90.method714(119);
            } else {
                var90.method598();
            }
        }
        int var91 = -31 / ((arg0 + 17) / 42);
        int var92 = var20.method1328(2);
        class86[] var93 = new class86[var92];
        long[] var94 = new long[var92];
        var20.method1323((byte) 89, var93);
        for (int var95 = 0; var95 < var92; var95++) {
            var94[var95] = var93[var95].field1603;
        }
        class17.method112(var94, (byte) -106, var93);
        return var93;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(II)V", line = 426)
    public class107(int arg0, int arg1) {
        this.field1672 = arg0;
        this.field1669 = arg1;
    }
}
