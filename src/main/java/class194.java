import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class194 extends class179 {

    @OriginalMember(owner = "client!bg", name = "V", descriptor = "Lke;")
    public static class256 field3543 = class316.method2202("details", 27626);

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "I")
    public static int field3539 = -1;

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!bg", name = "U", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V", line = 14)
    public static final void method1401(byte arg0) {
        if (arg0 <= 12) {
            field3539 = -126;
        }
        class17.field225.method2084(-120);
        field3540++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([[F[[B[[I[[I[[B[[I[[B[[F[[F[[IIZ[[[B[[B[[I)[Lgf;", line = 36)
    public static final class113[] method1402(float[][] arg0, byte[][] arg1, int[][] arg2, int[][] arg3, byte[][] arg4, int[][] arg5, byte[][] arg6, float[][] arg7, float[][] arg8, int[][] arg9, int arg10, boolean arg11, byte[][][] arg12, byte[][] arg13, int[][] arg14) {
        field3538++;
        int[][] var15 = new int[105][105];
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg4[var16][var17];
                if (var18 == 0) {
                    var18 = arg4[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg4[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg4[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class53 var19 = class108.method762(-44, (var18 & 0xFF) - 1);
                    var15[var16][var17] = (var19.field983 + 1 << 16) + var19.field969;
                }
            }
        }
        class254 var20 = new class254(128);
        for (int var21 = 1; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg4[var21][var22] != 0) {
                    int[] var23;
                    if (arg6[var21][var22] == 0) {
                        var23 = class145.field2567[0];
                    } else {
                        var23 = class74.field1387[arg13[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = var15[var21 + 1][var22];
                    int var25 = var15[var21][var22];
                    int var26 = 0;
                    int var27 = var15[var21 + 1][var22 + 1];
                    int var28 = var15[var21][var22 + 1];
                    if (arg2 != null) {
                        var26 = arg2[var21][var22] & 0xFFFFFF;
                    }
                    long var29 = (long) var25 << 32 | (long) var26;
                    long var31 = (long) var26 | (long) var24 << 32;
                    long var33 = (long) var27 << 32 | (long) var26;
                    long var35 = (long) var26 | (long) var28 << 32;
                    int var37 = var23.length / 2;
                    class113 var38 = (class113) var20.method1744((byte) 127, var29);
                    if (var38 == null) {
                        var38 = new class113((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg14 != null, var26);
                        var20.method1749(true, var38, var29);
                    }
                    var38.field1997++;
                    var38.field1996 += var37;
                    if (var29 != var31) {
                        class113 var39 = (class113) var20.method1744((byte) 125, var31);
                        if (var39 == null) {
                            var39 = new class113((var24 >> 16) - 1, (float) (var24 & 0xFFFF), false, arg14 != null, var26);
                            var20.method1749(arg11, var39, var31);
                        }
                        var39.field1997++;
                        var39.field1996 += var37;
                    }
                    if (var29 != var33 && var31 != var33) {
                        class113 var40 = (class113) var20.method1744((byte) 123, var33);
                        if (var40 == null) {
                            var40 = new class113((var27 >> 16) - 1, (float) (var27 & 0xFFFF), false, arg14 != null, var26);
                            var20.method1749(true, var40, var33);
                        }
                        var40.field1997++;
                        var40.field1996 += var37;
                    }
                    if (var29 != var35 && var31 != var35 && var33 != var35) {
                        class113 var41 = (class113) var20.method1744((byte) 124, var35);
                        if (var41 == null) {
                            var41 = new class113((var28 >> 16) - 1, (float) (var28 & 0xFFFF), false, arg14 != null, var26);
                            var20.method1749(arg11, var41, var35);
                        }
                        var41.field1996 += var37;
                        var41.field1997++;
                    }
                }
            }
        }
        for (class113 var42 = (class113) var20.method1743(true); var42 != null; var42 = (class113) var20.method1742((byte) 114)) {
            var42.method781();
        }
        for (int var43 = 1; var43 <= 102; var43++) {
            for (int var44 = 1; var44 <= 102; var44++) {
                byte var45 = arg4[var43][var44];
                if (var45 != 0) {
                    int var46 = 128;
                    int var47;
                    if ((arg12[arg10][var43][var44] & 0x8) != 0) {
                        var47 = 0;
                    } else if ((arg12[1][var43][var44] & 0x2) == 2 && arg10 > 0) {
                        var47 = arg10 - 1;
                    } else {
                        var47 = arg10;
                    }
                    int var48 = 0;
                    if (arg2 != null) {
                        var48 = arg2[var43][var44] & 0xFFFFFF;
                        var46 = arg2[var43][var44] >>> 24 << 3;
                    }
                    boolean[] var49 = null;
                    int[] var51;
                    byte var61;
                    if (arg6[var43][var44] == 0) {
                        byte var50 = 0;
                        var51 = class145.field2567[0];
                        byte var52 = 0;
                        int var53 = var52 + (arg4[var43 + 1][var44 - 1] == var45 ? 1 : -1);
                        int var54 = var50 + (arg4[var43 - 1][var44 - 1] == var45 ? 1 : -1);
                        byte var55 = 0;
                        int var56 = var55 + (arg4[var43 + 1][var44 + 1] == var45 ? 1 : -1);
                        byte var57 = 0;
                        if (arg4[var43][var44 - 1] == var45) {
                            var54++;
                            var53++;
                        } else {
                            var54--;
                            var53--;
                        }
                        int var58 = var57 + (arg4[var43 - 1][var44 + 1] == var45 ? 1 : -1);
                        if (arg4[var43 + 1][var44] == var45) {
                            var56++;
                            var53++;
                        } else {
                            var53--;
                            var56--;
                        }
                        if (arg4[var43][var44 + 1] == var45) {
                            var56++;
                            var58++;
                        } else {
                            var58--;
                            var56--;
                        }
                        if (arg4[var43 - 1][var44] == var45) {
                            var54++;
                            var58++;
                        } else {
                            var54--;
                            var58--;
                        }
                        int var59 = var53 - var58;
                        int var60 = var54 - var56;
                        if (var60 < 0) {
                            var60 = -var60;
                        }
                        if (var59 < 0) {
                            var59 = -var59;
                        }
                        var61 = (byte) (var60 < var59 ? 1 : 0);
                        arg1[var43][var44] = var61;
                    } else {
                        var61 = arg1[var43][var44];
                        var49 = class187.field3299[arg13[var43][var44]];
                        var51 = class74.field1387[arg13[var43][var44]];
                        if (var51.length == 0) {
                            continue;
                        }
                    }
                    int var62 = var15[var43][var44];
                    int var63 = var15[var43 + 1][var44];
                    int var64 = var15[var43 + 1][var44 + 1];
                    long var65 = (long) var62 << 32 | (long) var48;
                    long var67 = (long) var48 | (long) var63 << 32;
                    int var69 = arg3[var43][var44];
                    int var70 = var15[var43][var44 + 1];
                    long var71 = (long) var70 << 32 | (long) var48;
                    long var73 = (long) var48 | (long) var64 << 32;
                    int var75 = arg3[var43 + 1][var44];
                    int var76 = arg3[var43][var44 + 1];
                    int var77 = arg3[var43 + 1][var44 + 1];
                    int var78 = arg5[var43 + 1][var44];
                    int var79 = arg5[var43][var44];
                    int var80 = arg5[var43][var44 + 1];
                    int var81 = (var62 >> 16) - 1;
                    int var82 = arg5[var43 + 1][var44 + 1];
                    int var83 = (var64 >> 16) - 1;
                    class113 var84 = (class113) var20.method1744((byte) 123, var65);
                    class65.method501(arg9, arg0, var64 >= var62, var84, var51, var46, var62 <= var62, 94, arg8, class183.method1341((byte) 83, var82, var77, var81), var47, var70 >= var62, var44, var49, arg7, class183.method1341((byte) 83, var78, var75, var81), class183.method1341((byte) 83, var79, var69, var81), var63 >= var62, var43, class183.method1341((byte) 83, var80, var76, var81), var61, arg14);
                    int var85 = (var70 >> 16) - 1;
                    int var86 = (var63 >> 16) - 1;
                    if (var65 != var67) {
                        class113 var87 = (class113) var20.method1744((byte) 123, var67);
                        class65.method501(arg9, arg0, var63 <= var64, var87, var51, var46, var63 <= var62, 90, arg8, class183.method1341((byte) 83, var82, var77, var86), var47, var70 >= var63, var44, var49, arg7, class183.method1341((byte) 83, var78, var75, var86), class183.method1341((byte) 83, var79, var69, var86), var63 <= var63, var43, class183.method1341((byte) 83, var80, var76, var86), var61, arg14);
                    }
                    if (var65 != var73 && var67 != var73) {
                        class113 var88 = (class113) var20.method1744((byte) 127, var73);
                        class65.method501(arg9, arg0, var64 <= var64, var88, var51, var46, var64 <= var62, 92, arg8, class183.method1341((byte) 83, var82, var77, var83), var47, var64 <= var70, var44, var49, arg7, class183.method1341((byte) 83, var78, var75, var83), class183.method1341((byte) 83, var79, var69, var83), var63 >= var64, var43, class183.method1341((byte) 83, var80, var76, var83), var61, arg14);
                    }
                    if (var65 != var71 && var67 != var71 && var71 != var73) {
                        class113 var89 = (class113) var20.method1744((byte) 127, var71);
                        class65.method501(arg9, arg0, var70 <= var64, var89, var51, var46, var70 <= var62, 122, arg8, class183.method1341((byte) 83, var82, var77, var85), var47, var70 <= var70, var44, var49, arg7, class183.method1341((byte) 83, var78, var75, var85), class183.method1341((byte) 83, var79, var69, var85), var70 <= var63, var43, class183.method1341((byte) 83, var80, var76, var85), var61, arg14);
                    }
                }
            }
        }
        for (class113 var90 = (class113) var20.method1743(arg11); var90 != null; var90 = (class113) var20.method1742((byte) 100)) {
            if (var90.field1981 == 0) {
                var90.method1199(21966);
            } else {
                var90.method776();
            }
        }
        int var91 = var20.method1745(0);
        long[] var92 = new long[var91];
        class113[] var93 = new class113[var91];
        var20.method1751(1431655765, var93);
        for (int var94 = 0; var94 < var91; var94++) {
            var92[var94] = var93[var94].field2895;
        }
        class90.method670(29252, var92, var93);
        return var93;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V", line = 432)
    public class194() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)[I", line = 438)
    public final int[] method41(int arg0, int arg1) {
        field3542++;
        if (arg1 != -31598) {
            method1401((byte) -107);
        }
        int[] var3 = this.field3157.method1258(-45, arg0);
        if (this.field3157.field3081) {
            int[][] var4 = this.method1314(arg0, 158, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            for (int var8 = 0; var8 < class161.field2858; var8++) {
                var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V", line = 474)
    public static void method1403(boolean arg0) {
        if (arg0) {
            field3543 = null;
        }
    }
}
