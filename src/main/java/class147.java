import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class147 {

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field2248 = 0;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Lwm;")
    private static class152 field2250 = class157.method1048("Use", 127);

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field2255 = 2301979;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "[I")
    public static int[] field2252 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "Lwm;")
    public static class152 field2260 = field2250;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([[I[[F[[B[[I[[I[[FI[[B[[F[[I[[I[[[B[[BI[[B)[Laj;", line = 20)
    public static final class1[] method922(int[][] arg0, float[][] arg1, byte[][] arg2, int[][] arg3, int[][] arg4, float[][] arg5, int arg6, byte[][] arg7, float[][] arg8, int[][] arg9, int[][] arg10, byte[][][] arg11, byte[][] arg12, int arg13, byte[][] arg14) {
        field2259++;
        int[][] var15 = new int[105][105];
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg7[var16][var17];
                if (var18 == 0) {
                    var18 = arg7[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg7[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg7[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class16 var19 = class142.method898((var18 & 0xFF) - 1, 0);
                    var15[var16][var17] = (var19.field229 + 1 << 16) + var19.field218;
                }
            }
        }
        class231 var20 = new class231(128);
        for (int var21 = 1; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg7[var21][var22] != 0) {
                    int[] var23;
                    if (arg2[var21][var22] == 0) {
                        var23 = class94.field1348[0];
                    } else {
                        var23 = class23.field404[arg14[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = var15[var21 + 1][var22];
                    int var25 = var15[var21 + 1][var22 + 1];
                    int var26 = var15[var21][var22];
                    int var27 = 0;
                    if (arg3 != null) {
                        var27 = arg3[var21][var22] & 0xFFFFFF;
                    }
                    int var28 = var15[var21][var22 + 1];
                    long var29 = (long) var27 | (long) var24 << 32;
                    long var31 = (long) var26 << 32 | (long) var27;
                    int var33 = var23.length / 2;
                    long var34 = (long) var27 | (long) var28 << 32;
                    class1 var36 = (class1) var20.method1586(var31, -95);
                    if (var36 == null) {
                        var36 = new class1((var26 >> 16) - 1, (float) (var26 & 0xFFFF), false, arg4 != null, var27);
                        var20.method1593(var31, var36, 27497);
                    }
                    var36.field12 += var33;
                    var36.field6++;
                    if (var29 != var31) {
                        class1 var37 = (class1) var20.method1586(var29, -92);
                        if (var37 == null) {
                            var37 = new class1((var24 >> 16) - 1, (float) (var24 & 0xFFFF), false, arg4 != null, var27);
                            var20.method1593(var29, var37, arg6 + 27497);
                        }
                        var37.field12 += var33;
                        var37.field6++;
                    }
                    long var38 = (long) var27 | (long) var25 << 32;
                    if (var31 != var38 && var29 != var38) {
                        class1 var40 = (class1) var20.method1586(var38, arg6 ^ 0xFFFFFFB7);
                        if (var40 == null) {
                            var40 = new class1((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg4 != null, var27);
                            var20.method1593(var38, var40, 27497);
                        }
                        var40.field6++;
                        var40.field12 += var33;
                    }
                    if (var31 != var34 && var29 != var34 && var34 != var38) {
                        class1 var41 = (class1) var20.method1586(var34, -95);
                        if (var41 == null) {
                            var41 = new class1((var28 >> 16) - 1, (float) (var28 & 0xFFFF), false, arg4 != null, var27);
                            var20.method1593(var34, var41, 27497);
                        }
                        var41.field12 += var33;
                        var41.field6++;
                    }
                }
            }
        }
        for (class1 var42 = (class1) var20.method1585(-1506054736); var42 != null; var42 = (class1) var20.method1581((byte) 99)) {
            var42.method2();
        }
        for (int var43 = 1; var43 <= 102; var43++) {
            for (int var44 = 1; var44 <= 102; var44++) {
                byte var45 = arg7[var43][var44];
                if (var45 != 0) {
                    int var46;
                    if ((arg11[arg13][var43][var44] & 0x8) != 0) {
                        var46 = 0;
                    } else if ((arg11[1][var43][var44] & 0x2) == 2 && arg13 > 0) {
                        var46 = arg13 - 1;
                    } else {
                        var46 = arg13;
                    }
                    int var47 = 0;
                    int var48 = 128;
                    if (arg3 != null) {
                        var48 = arg3[var43][var44] >>> 24 << 3;
                        var47 = arg3[var43][var44] & 0xFFFFFF;
                    }
                    boolean[] var49 = null;
                    int[] var50;
                    byte var61;
                    if (arg2[var43][var44] == 0) {
                        var50 = class94.field1348[0];
                        byte var51 = 0;
                        byte var52 = 0;
                        int var53 = var51 + (arg7[var43 + 1][var44 - 1] == var45 ? 1 : -1);
                        int var54 = var52 + (arg7[var43 - 1][var44 - 1] == var45 ? 1 : -1);
                        if (arg7[var43][var44 - 1] == var45) {
                            var53++;
                            var54++;
                        } else {
                            var53--;
                            var54--;
                        }
                        byte var55 = 0;
                        int var56 = var55 + (arg7[var43 + 1][var44 + 1] == var45 ? 1 : -1);
                        byte var57 = 0;
                        if (arg7[var43 + 1][var44] == var45) {
                            var53++;
                            var56++;
                        } else {
                            var53--;
                            var56--;
                        }
                        int var58 = var57 + (arg7[var43 - 1][var44 + 1] == var45 ? 1 : -1);
                        if (arg7[var43][var44 + 1] == var45) {
                            var58++;
                            var56++;
                        } else {
                            var58--;
                            var56--;
                        }
                        if (arg7[var43 - 1][var44] == var45) {
                            var58++;
                            var54++;
                        } else {
                            var54--;
                            var58--;
                        }
                        int var59 = var53 - var58;
                        if (var59 < 0) {
                            var59 = -var59;
                        }
                        int var60 = var54 - var56;
                        if (var60 < 0) {
                            var60 = -var60;
                        }
                        var61 = (byte) (var59 > var60 ? 1 : 0);
                        arg12[var43][var44] = var61;
                    } else {
                        var49 = class170.field2664[arg14[var43][var44]];
                        var61 = arg12[var43][var44];
                        var50 = class23.field404[arg14[var43][var44]];
                        if (var50.length == 0) {
                            continue;
                        }
                    }
                    int var62 = var15[var43][var44 + 1];
                    int var63 = var15[var43][var44];
                    int var64 = var15[var43 + 1][var44 + 1];
                    long var65 = (long) var47 | (long) var63 << 32;
                    int var67 = var15[var43 + 1][var44];
                    long var68 = (long) var47 | (long) var67 << 32;
                    long var70 = (long) var47 | (long) var62 << 32;
                    long var72 = (long) var64 << 32 | (long) var47;
                    int var74 = arg9[var43][var44];
                    int var75 = arg9[var43 + 1][var44];
                    int var76 = arg9[var43 + 1][var44 + 1];
                    int var77 = arg0[var43][var44];
                    int var78 = arg0[var43 + 1][var44];
                    int var79 = arg9[var43][var44 + 1];
                    int var80 = arg0[var43 + 1][var44 + 1];
                    int var81 = (var63 >> 16) - 1;
                    int var82 = (var67 >> 16) - 1;
                    int var83 = arg0[var43][var44 + 1];
                    int var84 = (var64 >> 16) - 1;
                    class1 var85 = (class1) var20.method1586(var65, arg6 - 105);
                    class131.method829(255, var61, var44, var50, class26.method216(var81, false, var76, var80), var85, arg10, arg5, var63 <= var62, var46, arg8, class26.method216(var81, false, var75, var78), arg4, class26.method216(var81, false, var74, var77), var49, var43, var48, class26.method216(var81, false, var79, var83), arg1, var63 <= var64, var63 <= var63, var67 >= var63);
                    int var86 = (var62 >> 16) - 1;
                    if (var65 != var68) {
                        class1 var87 = (class1) var20.method1586(var68, -101);
                        class131.method829(255, var61, var44, var50, class26.method216(var82, false, var76, var80), var87, arg10, arg5, var62 >= var67, var46, arg8, class26.method216(var82, false, var75, var78), arg4, class26.method216(var82, false, var74, var77), var49, var43, var48, class26.method216(var82, false, var79, var83), arg1, var64 >= var67, var63 >= var67, var67 >= var67);
                    }
                    if (var65 != var72 && var68 != var72) {
                        class1 var88 = (class1) var20.method1586(var72, -77);
                        class131.method829(255, var61, var44, var50, class26.method216(var84, false, var76, var80), var88, arg10, arg5, var64 <= var62, var46, arg8, class26.method216(var84, false, var75, var78), arg4, class26.method216(var84, false, var74, var77), var49, var43, var48, class26.method216(var84, false, var79, var83), arg1, var64 >= var64, var63 >= var64, var64 <= var67);
                    }
                    if (var65 != var70 && var68 != var70 && var70 != var72) {
                        class1 var89 = (class1) var20.method1586(var70, -67);
                        class131.method829(255, var61, var44, var50, class26.method216(var86, false, var76, var80), var89, arg10, arg5, var62 >= var62, var46, arg8, class26.method216(var86, false, var75, var78), arg4, class26.method216(var86, false, var74, var77), var49, var43, var48, class26.method216(var86, false, var79, var83), arg1, var64 >= var62, var63 >= var62, var62 <= var67);
                    }
                }
            }
        }
        for (class1 var90 = (class1) var20.method1585(-1506054736); var90 != null; var90 = (class1) var20.method1581((byte) -68)) {
            if (var90.field1 == 0) {
                var90.method1880(arg6 ^ 0xFFFF9CE8);
            } else {
                var90.method4();
            }
        }
        int var91 = var20.method1582(-18869);
        class1[] var92 = new class1[var91];
        long[] var93 = new long[var91];
        var20.method1583(var92, (byte) 88);
        for (int var94 = arg6; var94 < var91; var94++) {
            var93[var94] = var92[var94].field4689;
        }
        class117.method769(arg6 + 119, var93, var92);
        return var92;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V", line = 415)
    public static final void method923(byte arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class249.field4170[var1] = true;
        }
        if (arg0 != 3) {
            method928(75);
        }
        field2249++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)V", line = 433)
    public static final void method924(int arg0, byte arg1) {
        field2253++;
        class303 var2 = class90.method589(false, arg0, 12);
        var2.method2114((byte) 122);
        int var3 = -33 / ((arg1 - 48) / 39);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V", line = 458)
    public static final void method925(int arg0, int arg1) {
        int var2 = 98 % ((-arg1) / 49);
        field2258++;
        if (class89.field1252 == 0) {
            class200.field3227.method2059(arg0, false);
        } else {
            class193.field3072 = arg0;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)V", line = 471)
    public static final void method926(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 35) {
            method926(-105, -102, 105, -77, 114);
        }
        if (arg3 < arg0) {
            for (int var5 = arg3; var5 < arg0; var5++) {
                class179.field2843[var5][arg1] = arg2;
            }
        } else {
            for (int var6 = arg0; var6 < arg3; var6++) {
                class179.field2843[var6][arg1] = arg2;
            }
        }
        field2254++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Loe;I)Loe;", line = 506)
    public static final class127 method927(class127 arg0, int arg1) {
        if (arg1 <= 37) {
            method927((class127) null, 99);
        }
        field2251++;
        class127 var2 = client.method1748(arg0);
        if (var2 == null) {
            var2 = arg0.field1808;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 548)
    public static void method928(int arg0) {
        field2252 = null;
        if (arg0 < 12) {
            method923((byte) -45);
        }
        field2260 = null;
        field2250 = null;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(IB)V", line = 561)
    public static final void method929(int arg0, byte arg1) {
        field2257++;
        if (arg1 < -102) {
            class14.method93(class14.field198, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
            class14.method88(-50.0F, -60.0F, -50.0F);
            class14.method87(class14.field186, 0);
            class14.method91();
        }
    }
}
