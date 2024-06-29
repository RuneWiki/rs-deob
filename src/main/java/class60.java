import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class60 {

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field967 = 0;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field976 = 0;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "[Lim;")
    public static class191[] field977 = new class191[50];

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Ljava/lang/String;")
    public static String field973 = "Face here";

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "[I")
    public static int[] field969 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "Ll;")
    public static class133 field972;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Ll;")
    public static class133 field974;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Ll;")
    public static class133 field980;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V", line = 20)
    public static void method474(byte arg0) {
        if (arg0 != 75) {
            field980 = (class133) null;
        }
        field974 = null;
        field980 = null;
        field977 = null;
        field972 = null;
        field973 = null;
        field969 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([[[B[[B[[B[[I[[[I[[B[[I[[FI[[F[[I[[II[[B[[I[[F)[Lfm;", line = 36)
    public static final class127[] method475(byte[][][] arg0, byte[][] arg1, byte[][] arg2, int[][] arg3, int[][][] arg4, byte[][] arg5, int[][] arg6, float[][] arg7, int arg8, float[][] arg9, int[][] arg10, int[][] arg11, int arg12, byte[][] arg13, int[][] arg14, float[][] arg15) {
        field975++;
        int[][] var16 = new int[105][105];
        for (int var17 = 1; var17 <= 103; var17++) {
            for (int var18 = 1; var18 <= 103; var18++) {
                int var19 = 0;
                if (arg4 != null) {
                    int var20 = arg4[arg12][var17 >> 3][var18 >> 3];
                    var19 = var20 >> 1 & 0x3;
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
                    class50 var23 = class223.method1581((var22 & 0xFF) - 1, -28950);
                    var16[var17][var18] = (var23.field816 + 1 << 16) + var23.field796;
                }
            }
        }
        class170 var24 = new class170(128);
        for (int var25 = 1; var25 <= 102; var25++) {
            for (int var26 = 1; var26 <= 102; var26++) {
                if (arg1[var25][var26] != 0) {
                    int[] var27;
                    if (arg5[var25][var26] == 0) {
                        var27 = class107.field1671[0];
                    } else {
                        var27 = class304.field4755[arg2[var25][var26]];
                        if (var27.length == 0) {
                            continue;
                        }
                    }
                    int var28 = 0;
                    if (arg6 != null) {
                        var28 = arg6[var25][var26] & 0xFFFFFF;
                    }
                    int var29 = var16[var25 + 1][var26];
                    int var30 = var16[var25 + 1][var26 + 1];
                    int var31 = var16[var25][var26];
                    int var32 = var16[var25][var26 + 1];
                    long var33 = (long) var28 | (long) var29 << 32;
                    long var35 = (long) var32 << 32 | (long) var28;
                    long var37 = (long) var30 << 32 | (long) var28;
                    int var39 = var27.length / 2;
                    long var40 = (long) var31 << 32 | (long) var28;
                    class127 var42 = (class127) var24.method1222(0, var40);
                    if (var42 == null) {
                        var42 = new class127((var31 >> 16) - 1, (float) (var31 & 0xFFFF), false, arg10 != null, var28);
                        var24.method1227(var42, 0, var40);
                    }
                    var42.field1995 += var39;
                    var42.field1973++;
                    if (var33 != var40) {
                        class127 var43 = (class127) var24.method1222(0, var33);
                        if (var43 == null) {
                            var43 = new class127((var29 >> 16) - 1, (float) (var29 & 0xFFFF), false, arg10 != null, var28);
                            var24.method1227(var43, 0, var33);
                        }
                        var43.field1973++;
                        var43.field1995 += var39;
                    }
                    if (var37 != var40 && var33 != var37) {
                        class127 var44 = (class127) var24.method1222(0, var37);
                        if (var44 == null) {
                            var44 = new class127((var30 >> 16) - 1, (float) (var30 & 0xFFFF), false, arg10 != null, var28);
                            var24.method1227(var44, 0, var37);
                        }
                        var44.field1995 += var39;
                        var44.field1973++;
                    }
                    if (var35 != var40 && var33 != var35 && var35 != var37) {
                        class127 var45 = (class127) var24.method1222(0, var35);
                        if (var45 == null) {
                            var45 = new class127((var32 >> 16) - 1, (float) (var32 & 0xFFFF), false, arg10 != null, var28);
                            var24.method1227(var45, 0, var35);
                        }
                        var45.field1995 += var39;
                        var45.field1973++;
                    }
                }
            }
        }
        for (class127 var46 = (class127) var24.method1228(true); var46 != null; var46 = (class127) var24.method1223((byte) 13)) {
            var46.method924();
        }
        for (int var47 = 1; var47 <= 102; var47++) {
            for (int var48 = 1; var48 <= 102; var48++) {
                byte var49 = arg1[var47][var48];
                if (var49 != 0) {
                    int var50;
                    if ((arg0[arg12][var47][var48] & 0x8) != 0) {
                        var50 = 0;
                    } else if ((arg0[1][var47][var48] & 0x2) == 2 && arg12 > 0) {
                        var50 = arg12 - 1;
                    } else {
                        var50 = arg12;
                    }
                    int var51 = 0;
                    boolean[] var52 = null;
                    int var53 = 128;
                    if (arg6 != null) {
                        var51 = arg6[var47][var48] & 0xFFFFFF;
                        var53 = arg6[var47][var48] >>> 24 << 3;
                    }
                    int[] var56;
                    byte var65;
                    if (arg5[var47][var48] == 0) {
                        byte var54 = 0;
                        int var55 = var54 + (arg1[var47 - 1][var48 - 1] == var49 ? 1 : -1);
                        var56 = class107.field1671[0];
                        byte var57 = 0;
                        byte var58 = 0;
                        byte var59 = 0;
                        int var60 = var57 + (arg1[var47 + 1][var48 - 1] == var49 ? 1 : -1);
                        if (arg1[var47][var48 - 1] == var49) {
                            var60++;
                            var55++;
                        } else {
                            var55--;
                            var60--;
                        }
                        int var61 = var59 + (arg1[var47 - 1][var48 + 1] == var49 ? 1 : -1);
                        int var62 = var58 + (arg1[var47 + 1][var48 + 1] == var49 ? 1 : -1);
                        if (arg1[var47 + 1][var48] == var49) {
                            var60++;
                            var62++;
                        } else {
                            var60--;
                            var62--;
                        }
                        if (arg1[var47][var48 + 1] == var49) {
                            var62++;
                            var61++;
                        } else {
                            var62--;
                            var61--;
                        }
                        if (arg1[var47 - 1][var48] == var49) {
                            var55++;
                            var61++;
                        } else {
                            var55--;
                            var61--;
                        }
                        int var63 = var60 - var61;
                        int var64 = var55 - var62;
                        if (var64 < 0) {
                            var64 = -var64;
                        }
                        if (var63 < 0) {
                            var63 = -var63;
                        }
                        var65 = (byte) (var64 < var63 ? 1 : 0);
                        arg13[var47][var48] = var65;
                    } else {
                        var52 = class78.field1261[arg2[var47][var48]];
                        var65 = arg13[var47][var48];
                        var56 = class304.field4755[arg2[var47][var48]];
                        if (var56.length == 0) {
                            continue;
                        }
                    }
                    int var66 = var16[var47][var48];
                    int var67 = var16[var47 + 1][var48];
                    int var68 = var16[var47 + 1][var48 + 1];
                    long var69 = (long) var51 | (long) var66 << 32;
                    int var71 = var16[var47][var48 + 1];
                    long var72 = (long) var67 << 32 | (long) var51;
                    long var74 = (long) var68 << 32 | (long) var51;
                    long var76 = (long) var51 | (long) var71 << 32;
                    int var78 = arg11[var47][var48];
                    int var79 = arg11[var47 + 1][var48 + 1];
                    int var80 = arg11[var47 + 1][var48];
                    int var81 = arg3[var47][var48];
                    int var82 = arg3[var47 + 1][var48];
                    int var83 = arg11[var47][var48 + 1];
                    int var84 = arg3[var47][var48 + 1];
                    int var85 = arg3[var47 + 1][var48 + 1];
                    int var86 = (var66 >> 16) - 1;
                    int var87 = (var67 >> 16) - 1;
                    int var88 = (var68 >> 16) - 1;
                    class127 var89 = (class127) var24.method1222(0, var69);
                    class194.method1386(arg9, var66 <= var68, var50, var56, var66 <= var66, var66 <= var67, var47, var53, class106.method770((byte) -109, var86, var82, var80), class106.method770((byte) -123, var86, var85, var79), class106.method770((byte) -122, var86, var81, var78), arg10, var89, (byte) 125, class106.method770((byte) -126, var86, var84, var83), var65, arg7, arg14, arg15, var66 <= var71, var48, var52);
                    if (var69 != var72) {
                        class127 var90 = (class127) var24.method1222(0, var72);
                        class194.method1386(arg9, var68 >= var67, var50, var56, var67 <= var66, var67 <= var67, var47, var53, class106.method770((byte) -116, var87, var82, var80), class106.method770((byte) -116, var87, var85, var79), class106.method770((byte) -110, var87, var81, var78), arg10, var90, (byte) 124, class106.method770((byte) -114, var87, var84, var83), var65, arg7, arg14, arg15, var71 >= var67, var48, var52);
                    }
                    if (var69 != var74 && var72 != var74) {
                        class127 var91 = (class127) var24.method1222(0, var74);
                        class194.method1386(arg9, var68 >= var68, var50, var56, var66 >= var68, var67 >= var68, var47, var53, class106.method770((byte) -110, var88, var82, var80), class106.method770((byte) -117, var88, var85, var79), class106.method770((byte) -123, var88, var81, var78), arg10, var91, (byte) 123, class106.method770((byte) -121, var88, var84, var83), var65, arg7, arg14, arg15, var71 >= var68, var48, var52);
                    }
                    int var92 = (var71 >> 16) - 1;
                    if (var69 != var76 && var72 != var76 && var74 != var76) {
                        class127 var93 = (class127) var24.method1222(0, var76);
                        class194.method1386(arg9, var71 <= var68, var50, var56, var71 <= var66, var71 <= var67, var47, var53, class106.method770((byte) -117, var92, var82, var80), class106.method770((byte) -128, var92, var85, var79), class106.method770((byte) -124, var92, var81, var78), arg10, var93, (byte) 122, class106.method770((byte) -119, var92, var84, var83), var65, arg7, arg14, arg15, var71 <= var71, var48, var52);
                    }
                }
            }
        }
        if (arg8 >= -13) {
            field972 = (class133) null;
        }
        for (class127 var94 = (class127) var24.method1228(true); var94 != null; var94 = (class127) var24.method1223((byte) 13)) {
            if (var94.field1979 == 0) {
                var94.method403(1);
            } else {
                var94.method920();
            }
        }
        int var95 = var24.method1224(false);
        class127[] var96 = new class127[var95];
        var24.method1221((byte) -82, var96);
        long[] var97 = new long[var95];
        for (int var98 = 0; var98 < var95; var98++) {
            var97[var98] = var96[var98].field758;
        }
        class306.method2094(var96, var97, 1);
        return var96;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)Lqd;", line = 509)
    public static final class252 method476(int arg0) {
        field968++;
        if (arg0 >= -74) {
            field967 = 100;
        }
        class252 var1;
        if (class94.field1516) {
            var1 = new class172(class65.field1019, class228.field3627, class97.field1546[0], class320.field5001[0], class75.field1215[0], class73.field1201[0], class306.field4757[0], class63.field1002);
        } else {
            var1 = new class168(class65.field1019, class228.field3627, class97.field1546[0], class320.field5001[0], class75.field1215[0], class73.field1201[0], class306.field4757[0], class63.field1002);
        }
        class7.method56((byte) 59);
        return var1;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ll;B)V", line = 531)
    public static final void method477(class133 arg0, byte arg1) {
        class101.field1588 = arg0;
        field970++;
        if (arg1 != -80) {
            method474((byte) 40);
        }
    }
}
