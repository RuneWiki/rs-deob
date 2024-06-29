import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class225 {

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "B")
    private byte field3712;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public int field3709;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public int field3708;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public int field3707;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public int field3715;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public int field3702;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "J")
    public static long field3710 = 0L;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "Lbd;")
    public static class340 field3714 = new class340(0, -1);

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 7)
    public static final void method1568(byte arg0) {
        int var1 = -1;
        int var2 = -69 % ((arg0 + 55) / 40);
        while (var1 < class252.field4144) {
            int var3;
            if (var1 == -1) {
                var3 = 2047;
            } else {
                var3 = class22.field556[var1];
            }
            class98 var4 = class182.field3151[var3];
            if (var4 != null) {
                class284.method2014(var4, var4.method49((byte) 105), 255);
            }
            var1++;
        }
        field3704++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 36)
    public static void method1569(int arg0) {
        field3714 = null;
        if (arg0 != 0) {
            method1569(91);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLoe;)Lb;", line = 46)
    public static final class69 method1570(byte arg0, class146 arg1) {
        field3713++;
        int var2 = 6 / ((arg0 - 44) / 39);
        return new class69(arg1.method1050(3), arg1.method1050(3), arg1.method1050(3), arg1.method1050(3), arg1.method1025((byte) -31), arg1.method1025((byte) -35), arg1.method1005((byte) 122));
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)I", line = 57)
    public final int method1571(byte arg0) {
        field3703++;
        int var2 = 49 / ((arg0 - 62) / 57);
        return this.field3712 & 0x7;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[[F[[B[[F[[I[[BI[[B[[[B[[I[[I[[I[[F[[B[[I[[[I)[Lwl;", line = 68)
    public static final class102[] method1572(int arg0, float[][] arg1, byte[][] arg2, float[][] arg3, int[][] arg4, byte[][] arg5, int arg6, byte[][] arg7, byte[][][] arg8, int[][] arg9, int[][] arg10, int[][] arg11, float[][] arg12, byte[][] arg13, int[][] arg14, int[][][] arg15) {
        field3706++;
        int[][] var16 = new int[105][105];
        for (int var17 = 1; var17 <= 103; var17++) {
            for (int var18 = 1; var18 <= 103; var18++) {
                int var19 = 0;
                if (arg15 != null) {
                    int var20 = arg15[arg0][var17 >> 3][var18 >> 3];
                    var19 = (var20 & 0x7) >> 1;
                }
                boolean var21 = false;
                byte var22;
                if (var19 == 0) {
                    var22 = arg7[var17][var18];
                    if (var22 == 0) {
                        var22 = arg7[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg7[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg7[var17 - 1][var18 - 1];
                    }
                } else if (var19 == 1) {
                    var22 = arg7[var17][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg7[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg7[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg7[var17 - 1][var18];
                    }
                } else if (var19 == 2) {
                    var22 = arg7[var17 - 1][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg7[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg7[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg7[var17][var18];
                    }
                } else {
                    var22 = arg7[var17 - 1][var18];
                    if (var22 == 0) {
                        var22 = arg7[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg7[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg7[var17][var18 - 1];
                    }
                }
                if (var22 != 0) {
                    class129 var23 = class56.method478((byte) -11, (var22 & 0xFF) - 1);
                    var16[var17][var18] = (var23.field2237 + 1 << 16) + var23.field2236;
                }
            }
        }
        class328 var24 = new class328(128);
        for (int var25 = 1; var25 <= 102; var25++) {
            for (int var26 = 1; var26 <= 102; var26++) {
                if (arg7[var25][var26] != 0) {
                    int[] var27;
                    if (arg13[var25][var26] == 0) {
                        var27 = class356.field5674[0];
                    } else {
                        var27 = class132.field2266[arg2[var25][var26]];
                        if (var27.length == 0) {
                            continue;
                        }
                    }
                    int var28 = 0;
                    if (arg9 != null) {
                        var28 = arg9[var25][var26] & 0xFFFFFF;
                    }
                    int var29 = var16[var25][var26];
                    int var30 = var16[var25 + 1][var26];
                    int var31 = var16[var25][var26 + 1];
                    int var32 = var16[var25 + 1][var26 + 1];
                    long var33 = (long) var28 | (long) var29 << 32;
                    long var35 = (long) var30 << 32 | (long) var28;
                    long var37 = (long) var31 << 32 | (long) var28;
                    long var39 = (long) var28 | (long) var32 << 32;
                    int var41 = var27.length / 2;
                    class102 var42 = (class102) var24.method2344(-1, var33);
                    if (var42 == null) {
                        var42 = new class102((var29 >> 16) - 1, (float) (var29 & 0xFFFF), false, arg14 != null, var28);
                        var24.method2337(var42, 709, var33);
                    }
                    var42.field1879 += var41;
                    var42.field1854++;
                    if (var33 != var35) {
                        class102 var43 = (class102) var24.method2344(-1, var35);
                        if (var43 == null) {
                            var43 = new class102((var30 >> 16) - 1, (float) (var30 & 0xFFFF), false, arg14 != null, var28);
                            var24.method2337(var43, 709, var35);
                        }
                        var43.field1879 += var41;
                        var43.field1854++;
                    }
                    if (var33 != var39 && var35 != var39) {
                        class102 var44 = (class102) var24.method2344(-1, var39);
                        if (var44 == null) {
                            var44 = new class102((var32 >> 16) - 1, (float) (var32 & 0xFFFF), false, arg14 != null, var28);
                            var24.method2337(var44, 709, var39);
                        }
                        var44.field1879 += var41;
                        var44.field1854++;
                    }
                    if (var33 != var37 && var35 != var37 && var37 != var39) {
                        class102 var45 = (class102) var24.method2344(-1, var37);
                        if (var45 == null) {
                            var45 = new class102((var31 >> 16) - 1, (float) (var31 & 0xFFFF), false, arg14 != null, var28);
                            var24.method2337(var45, 709, var37);
                        }
                        var45.field1879 += var41;
                        var45.field1854++;
                    }
                }
            }
        }
        for (class102 var46 = (class102) var24.method2345((byte) -125); var46 != null; var46 = (class102) var24.method2336(-111)) {
            var46.method769();
        }
        for (int var47 = 1; var47 <= 102; var47++) {
            for (int var48 = 1; var48 <= 102; var48++) {
                byte var49 = arg7[var47][var48];
                if (var49 != 0) {
                    int var50;
                    if ((arg8[arg0][var47][var48] & 0x8) != 0) {
                        var50 = 0;
                    } else if ((arg8[1][var47][var48] & 0x2) == 2 && arg0 > 0) {
                        var50 = arg0 - 1;
                    } else {
                        var50 = arg0;
                    }
                    int var51 = 0;
                    int var52 = 128;
                    if (arg9 != null) {
                        var51 = arg9[var47][var48] & 0xFFFFFF;
                        var52 = arg9[var47][var48] >>> 24 << 3;
                    }
                    boolean[] var53 = null;
                    int[] var54;
                    byte var65;
                    if (arg13[var47][var48] == 0) {
                        var54 = class356.field5674[0];
                        byte var55 = 0;
                        byte var56 = 0;
                        int var57 = var55 + (arg7[var47 - 1][var48 - 1] == var49 ? 1 : -1);
                        int var58 = var56 + (arg7[var47 + 1][var48 - 1] == var49 ? 1 : -1);
                        byte var59 = 0;
                        if (arg7[var47][var48 - 1] == var49) {
                            var57++;
                            var58++;
                        } else {
                            var58--;
                            var57--;
                        }
                        int var60 = var59 + (arg7[var47 + 1][var48 + 1] == var49 ? 1 : -1);
                        byte var61 = 0;
                        if (arg7[var47 + 1][var48] == var49) {
                            var60++;
                            var58++;
                        } else {
                            var60--;
                            var58--;
                        }
                        int var62 = var61 + (arg7[var47 - 1][var48 + 1] == var49 ? 1 : -1);
                        if (arg7[var47][var48 + 1] == var49) {
                            var60++;
                            var62++;
                        } else {
                            var62--;
                            var60--;
                        }
                        if (arg7[var47 - 1][var48] == var49) {
                            var62++;
                            var57++;
                        } else {
                            var62--;
                            var57--;
                        }
                        int var63 = var58 - var62;
                        int var64 = var57 - var60;
                        if (var64 < 0) {
                            var64 = -var64;
                        }
                        if (var63 < 0) {
                            var63 = -var63;
                        }
                        var65 = (byte) (var64 >= var63 ? 0 : 1);
                        arg5[var47][var48] = var65;
                    } else {
                        var53 = class68.field1261[arg2[var47][var48]];
                        var54 = class132.field2266[arg2[var47][var48]];
                        var65 = arg5[var47][var48];
                        if (var54.length == 0) {
                            continue;
                        }
                    }
                    int var66 = var16[var47][var48];
                    int var67 = var16[var47 + 1][var48];
                    int var68 = var16[var47 + 1][var48 + 1];
                    int var69 = var16[var47][var48 + 1];
                    long var70 = (long) var51 | (long) var68 << 32;
                    long var72 = (long) var66 << 32 | (long) var51;
                    long var74 = (long) var69 << 32 | (long) var51;
                    int var76 = arg11[var47][var48];
                    int var77 = arg11[var47 + 1][var48];
                    long var78 = (long) var67 << 32 | (long) var51;
                    int var80 = arg11[var47 + 1][var48 + 1];
                    int var81 = arg10[var47][var48 + 1];
                    int var82 = arg10[var47 + 1][var48];
                    int var83 = arg10[var47 + 1][var48 + 1];
                    int var84 = arg10[var47][var48];
                    int var85 = arg11[var47][var48 + 1];
                    int var86 = (var66 >> 16) - 1;
                    int var87 = (var67 >> 16) - 1;
                    int var88 = (var68 >> 16) - 1;
                    class102 var89 = (class102) var24.method2344(-1, var72);
                    int var90 = (var69 >> 16) - 1;
                    class148.method1063(class260.method1827(-112, var86, var84, var76), var67 >= var66, class260.method1827(-65, var86, var83, var80), var50, arg1, arg12, var69 >= var66, arg3, var48, arg4, var54, var89, class260.method1827(-104, var86, var82, var77), var66 <= var66, var53, var47, arg14, var65, var52, true, var68 >= var66, class260.method1827(-113, var86, var81, var85));
                    if (var72 != var78) {
                        class102 var91 = (class102) var24.method2344(-1, var78);
                        class148.method1063(class260.method1827(-54, var87, var84, var76), var67 >= var67, class260.method1827(-113, var87, var83, var80), var50, arg1, arg12, var69 >= var67, arg3, var48, arg4, var54, var91, class260.method1827(-120, var87, var82, var77), var67 <= var66, var53, var47, arg14, var65, var52, true, var67 <= var68, class260.method1827(-117, var87, var81, var85));
                    }
                    if (var70 != var72 && var70 != var78) {
                        class102 var92 = (class102) var24.method2344(-1, var70);
                        class148.method1063(class260.method1827(-53, var88, var84, var76), var68 <= var67, class260.method1827(-91, var88, var83, var80), var50, arg1, arg12, var68 <= var69, arg3, var48, arg4, var54, var92, class260.method1827(-72, var88, var82, var77), var68 <= var66, var53, var47, arg14, var65, var52, true, var68 >= var68, class260.method1827(-110, var88, var81, var85));
                    }
                    if (var72 != var74 && var74 != var78 && var70 != var74) {
                        class102 var93 = (class102) var24.method2344(-1, var74);
                        class148.method1063(class260.method1827(-61, var90, var84, var76), var69 <= var67, class260.method1827(-90, var90, var83, var80), var50, arg1, arg12, var69 >= var69, arg3, var48, arg4, var54, var93, class260.method1827(-107, var90, var82, var77), var69 <= var66, var53, var47, arg14, var65, var52, true, var69 <= var68, class260.method1827(-78, var90, var81, var85));
                    }
                }
            }
        }
        for (class102 var94 = (class102) var24.method2345((byte) -123); var94 != null; var94 = (class102) var24.method2336(-58)) {
            if (var94.field1856 == 0) {
                var94.method535(-2801);
            } else {
                var94.method770();
            }
        }
        int var95 = var24.method2340(-17734);
        long[] var96 = new long[var95];
        class102[] var97 = new class102[var95];
        var24.method2334(var97, true);
        for (int var98 = 0; var98 < var95; var98++) {
            var96[var98] = var97[var98].field1291;
        }
        if (arg6 <= 30) {
            return (class102[]) null;
        } else {
            class96.method736(var96, -1, var97);
            return var97;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)I", line = 530)
    public final int method1573(int arg0) {
        if (arg0 > -65) {
            this.field3708 = 0;
        }
        field3711++;
        return (this.field3712 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V", line = 563)
    public class225() {
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Loe;)V", line = 565)
    public class225(class146 arg0) {
        this.field3712 = arg0.method1029(-2);
        this.field3709 = arg0.method989(72);
        this.field3708 = arg0.method1004(3);
        this.field3707 = arg0.method1004(3);
        this.field3715 = arg0.method1004(3);
        this.field3702 = arg0.method1004(3);
    }
}
