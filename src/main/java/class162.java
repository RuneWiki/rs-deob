import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class162 extends OutputStream {

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "Z")
    public static boolean field2228 = false;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field2230 = 0;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field2231 = -1;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    public static int field2235 = 0;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "Lqc;")
    public static class99 field2232 = new class99(64);

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "[I")
    public static int[] field2237 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "Lkm;")
    public static class133 field2236;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 8)
    public static void method1165(int arg0) {
        field2237 = null;
        field2232 = null;
        int var1 = -48 % ((arg0 + 49) / 35);
        field2236 = null;
    }

    @OriginalMember(owner = "client!wk", name = "write", descriptor = "(I)V", line = 22)
    public final void write(int arg0) throws IOException {
        field2226++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BLin;)Lin;", line = 31)
    public static final class344 method1166(byte arg0, class344 arg1) {
        field2224++;
        class344 var2 = client.method818(arg1);
        if (arg0 == -72) {
            if (var2 == null) {
                var2 = arg1.field5265;
            }
            return var2;
        } else {
            return (class344) null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZ)V", line = 49)
    public static final void method1167(int arg0, boolean arg1) {
        if (arg0 != 2) {
            method1165(-33);
        }
        field2225++;
        if (arg1 != class271.field4048) {
            class271.field4048 = arg1;
            class295.method2011((byte) 127);
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V", line = 64)
    public static final void method1168(int arg0) {
        if (arg0 == -5504) {
            field2234++;
            class213.field3073.method724(arg0 + 5504);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([[I[[[I[[I[[F[[F[[B[[I[[II[[[B[[F[[I[[B[[BI[[B)[Ltk;", line = 87)
    public static final class268[] method1169(int[][] arg0, int[][][] arg1, int[][] arg2, float[][] arg3, float[][] arg4, byte[][] arg5, int[][] arg6, int[][] arg7, int arg8, byte[][][] arg9, float[][] arg10, int[][] arg11, byte[][] arg12, byte[][] arg13, int arg14, byte[][] arg15) {
        field2227++;
        int[][] var16 = new int[105][105];
        for (int var17 = 1; var17 <= 103; var17++) {
            for (int var18 = 1; var18 <= 103; var18++) {
                int var19 = 0;
                if (arg1 != null) {
                    int var20 = arg1[arg14][var17 >> 3][var18 >> 3];
                    var19 = (var20 & 0x6) >> 1;
                }
                boolean var21 = false;
                byte var22;
                if (var19 == 0) {
                    var22 = arg15[var17][var18];
                    if (var22 == 0) {
                        var22 = arg15[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg15[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg15[var17 - 1][var18 - 1];
                    }
                } else if (var19 == 1) {
                    var22 = arg15[var17][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg15[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg15[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg15[var17 - 1][var18];
                    }
                } else if (var19 == 2) {
                    var22 = arg15[var17 - 1][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg15[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg15[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg15[var17][var18];
                    }
                } else {
                    var22 = arg15[var17 - 1][var18];
                    if (var22 == 0) {
                        var22 = arg15[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg15[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg15[var17][var18 - 1];
                    }
                }
                if (var22 != 0) {
                    class119 var23 = class309.method2121((var22 & 0xFF) - 1, 67);
                    var16[var17][var18] = (var23.field1611 + 1 << 16) + var23.field1622;
                }
            }
        }
        class17 var24 = new class17(128);
        for (int var25 = 1; var25 <= 102; var25++) {
            for (int var26 = 1; var26 <= 102; var26++) {
                if (arg15[var25][var26] != 0) {
                    int[] var27;
                    if (arg5[var25][var26] == 0) {
                        var27 = class119.field1604[0];
                    } else {
                        var27 = class342.field5126[arg13[var25][var26]];
                        if (var27.length == 0) {
                            continue;
                        }
                    }
                    int var28 = 0;
                    if (arg0 != null) {
                        var28 = arg0[var25][var26] & 0xFFFFFF;
                    }
                    int var29 = var16[var25 + 1][var26];
                    int var30 = var16[var25][var26];
                    int var31 = var16[var25 + 1][var26 + 1];
                    int var32 = var16[var25][var26 + 1];
                    long var33 = (long) var29 << 32 | (long) var28;
                    long var35 = (long) var28 | (long) var30 << 32;
                    long var37 = (long) var32 << 32 | (long) var28;
                    int var39 = var27.length / 2;
                    class268 var40 = (class268) var24.method111(40, var35);
                    if (var40 == null) {
                        var40 = new class268((var30 >> 16) - 1, (float) (var30 & 0xFFFF), false, arg2 != null, var28);
                        var24.method120(var35, var40, -22851);
                    }
                    var40.field3952++;
                    var40.field3976 += var39;
                    if (var33 != var35) {
                        class268 var41 = (class268) var24.method111(-107, var33);
                        if (var41 == null) {
                            var41 = new class268((var29 >> 16) - 1, (float) (var29 & 0xFFFF), false, arg2 != null, var28);
                            var24.method120(var33, var41, -22851);
                        }
                        var41.field3952++;
                        var41.field3976 += var39;
                    }
                    long var42 = (long) var28 | (long) var31 << 32;
                    if (var35 != var42 && var33 != var42) {
                        class268 var44 = (class268) var24.method111(-113, var42);
                        if (var44 == null) {
                            var44 = new class268((var31 >> 16) - 1, (float) (var31 & 0xFFFF), false, arg2 != null, var28);
                            var24.method120(var42, var44, -22851);
                        }
                        var44.field3976 += var39;
                        var44.field3952++;
                    }
                    if (var35 != var37 && var33 != var37 && var37 != var42) {
                        class268 var45 = (class268) var24.method111(5, var37);
                        if (var45 == null) {
                            var45 = new class268((var32 >> 16) - 1, (float) (var32 & 0xFFFF), false, arg2 != null, var28);
                            var24.method120(var37, var45, -22851);
                        }
                        var45.field3976 += var39;
                        var45.field3952++;
                    }
                }
            }
        }
        int var46 = 24 % ((80 - arg8) / 46);
        for (class268 var47 = (class268) var24.method110(0); var47 != null; var47 = (class268) var24.method115(0)) {
            var47.method1849();
        }
        for (int var48 = 1; var48 <= 102; var48++) {
            for (int var49 = 1; var49 <= 102; var49++) {
                byte var50 = arg15[var48][var49];
                if (var50 != 0) {
                    int var51;
                    if ((arg9[arg14][var48][var49] & 0x8) != 0) {
                        var51 = 0;
                    } else if ((arg9[1][var48][var49] & 0x2) == 2 && arg14 > 0) {
                        var51 = arg14 - 1;
                    } else {
                        var51 = arg14;
                    }
                    int var52 = 128;
                    int var53 = 0;
                    if (arg0 != null) {
                        var53 = arg0[var48][var49] & 0xFFFFFF;
                        var52 = arg0[var48][var49] >>> 24 << 3;
                    }
                    boolean[] var54 = null;
                    int[] var56;
                    byte var66;
                    if (arg5[var48][var49] == 0) {
                        byte var55 = 0;
                        var56 = class119.field1604[0];
                        byte var57 = 0;
                        byte var58 = 0;
                        int var59 = var58 + (arg15[var48 - 1][var49 - 1] == var50 ? 1 : -1);
                        byte var60 = 0;
                        int var61 = var55 + (arg15[var48 + 1][var49 - 1] == var50 ? 1 : -1);
                        int var62 = var60 + (arg15[var48 - 1][var49 + 1] == var50 ? 1 : -1);
                        if (arg15[var48][var49 - 1] == var50) {
                            var61++;
                            var59++;
                        } else {
                            var59--;
                            var61--;
                        }
                        int var63 = var57 + (arg15[var48 + 1][var49 + 1] == var50 ? 1 : -1);
                        if (arg15[var48 + 1][var49] == var50) {
                            var63++;
                            var61++;
                        } else {
                            var61--;
                            var63--;
                        }
                        if (arg15[var48][var49 + 1] == var50) {
                            var62++;
                            var63++;
                        } else {
                            var63--;
                            var62--;
                        }
                        if (arg15[var48 - 1][var49] == var50) {
                            var62++;
                            var59++;
                        } else {
                            var59--;
                            var62--;
                        }
                        int var64 = var59 - var63;
                        int var65 = var61 - var62;
                        if (var64 < 0) {
                            var64 = -var64;
                        }
                        if (var65 < 0) {
                            var65 = -var65;
                        }
                        var66 = (byte) (var64 < var65 ? 1 : 0);
                        arg12[var48][var49] = var66;
                    } else {
                        var54 = class291.field4341[arg13[var48][var49]];
                        var56 = class342.field5126[arg13[var48][var49]];
                        var66 = arg12[var48][var49];
                        if (var56.length == 0) {
                            continue;
                        }
                    }
                    int var67 = var16[var48][var49];
                    int var68 = var16[var48 + 1][var49 + 1];
                    int var69 = var16[var48 + 1][var49];
                    long var70 = (long) var67 << 32 | (long) var53;
                    int var72 = var16[var48][var49 + 1];
                    long var73 = (long) var53 | (long) var69 << 32;
                    long var75 = (long) var68 << 32 | (long) var53;
                    long var77 = (long) var72 << 32 | (long) var53;
                    int var79 = arg7[var48][var49];
                    int var80 = arg7[var48 + 1][var49];
                    int var81 = arg7[var48 + 1][var49 + 1];
                    int var82 = arg11[var48][var49];
                    int var83 = arg11[var48 + 1][var49];
                    int var84 = arg7[var48][var49 + 1];
                    int var85 = (var67 >> 16) - 1;
                    int var86 = (var68 >> 16) - 1;
                    int var87 = arg11[var48][var49 + 1];
                    int var88 = arg11[var48 + 1][var49 + 1];
                    int var89 = (var69 >> 16) - 1;
                    int var90 = (var72 >> 16) - 1;
                    class268 var91 = (class268) var24.method111(-103, var70);
                    class222.method1568(var54, var67 <= var68, class85.method658(var85, true, var84, var87), var51, var56, var91, arg4, arg10, var67 <= var67, var67 <= var69, class85.method658(var85, true, var80, var83), arg6, var48, arg2, var49, class85.method658(var85, true, var81, var88), arg3, 0, class85.method658(var85, true, var79, var82), var67 <= var72, var66, var52);
                    if (var70 != var73) {
                        class268 var92 = (class268) var24.method111(-114, var73);
                        class222.method1568(var54, var68 >= var69, class85.method658(var89, true, var84, var87), var51, var56, var92, arg4, arg10, var67 >= var69, var69 <= var69, class85.method658(var89, true, var80, var83), arg6, var48, arg2, var49, class85.method658(var89, true, var81, var88), arg3, 0, class85.method658(var89, true, var79, var82), var72 >= var69, var66, var52);
                    }
                    if (var70 != var75 && var73 != var75) {
                        class268 var93 = (class268) var24.method111(29, var75);
                        class222.method1568(var54, var68 >= var68, class85.method658(var86, true, var84, var87), var51, var56, var93, arg4, arg10, var68 <= var67, var68 <= var69, class85.method658(var86, true, var80, var83), arg6, var48, arg2, var49, class85.method658(var86, true, var81, var88), arg3, 0, class85.method658(var86, true, var79, var82), var72 >= var68, var66, var52);
                    }
                    if (var70 != var77 && var73 != var77 && var75 != var77) {
                        class268 var94 = (class268) var24.method111(13, var77);
                        class222.method1568(var54, var68 >= var72, class85.method658(var90, true, var84, var87), var51, var56, var94, arg4, arg10, var67 >= var72, var69 >= var72, class85.method658(var90, true, var80, var83), arg6, var48, arg2, var49, class85.method658(var90, true, var81, var88), arg3, 0, class85.method658(var90, true, var79, var82), var72 <= var72, var66, var52);
                    }
                }
            }
        }
        for (class268 var95 = (class268) var24.method110(0); var95 != null; var95 = (class268) var24.method115(0)) {
            if (var95.field3955 == 0) {
                var95.method1274((byte) -26);
            } else {
                var95.method1844();
            }
        }
        int var96 = var24.method114(11);
        long[] var97 = new long[var96];
        class268[] var98 = new class268[var96];
        var24.method117(var98, (byte) 19);
        for (int var99 = 0; var99 < var96; var99++) {
            var97[var99] = var98[var99].field2522;
        }
        class148.method1077(var98, false, var97);
        return var98;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lkm;II)[Ltj;", line = 548)
    public static final class258[] method1170(class133 arg0, int arg1, int arg2) {
        field2233++;
        if (arg2 != -1) {
            method1168(99);
        }
        return class189.method1326(true, arg0, arg1) ? class131.method937((byte) -112) : null;
    }
}
