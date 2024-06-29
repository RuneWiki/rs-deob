import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class211 extends class273 {

    @OriginalMember(owner = "client!km", name = "Q", descriptor = "I")
    private int field3347 = -1;

    @OriginalMember(owner = "client!km", name = "O", descriptor = "Ljf;")
    public static class227 field3345 = new class227(16);

    @OriginalMember(owner = "client!km", name = "J", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!km", name = "K", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!km", name = "M", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!km", name = "N", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!km", name = "P", descriptor = "I")
    public int field3346;

    @OriginalMember(owner = "client!km", name = "R", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!km", name = "S", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!km", name = "U", descriptor = "I")
    public int field3351;

    @OriginalMember(owner = "client!km", name = "V", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!km", name = "Y", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!km", name = "Z", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!km", name = "X", descriptor = "Lwf;")
    public static class306 field3353;

    @OriginalMember(owner = "client!km", name = "L", descriptor = "Lcl;")
    public static class63 field3342;

    @OriginalMember(owner = "client!km", name = "T", descriptor = "[I")
    public int[] field3350;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILjava/lang/String;)I", line = 5)
    public static final int method1410(int arg0, String arg1) {
        if (arg0 != -22859) {
            field3353 = (class306) null;
        }
        field3344++;
        for (int var2 = 0; var2 < class259.field4027.length; var2++) {
            if (class259.field4027[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(JI)V", line = 27)
    public static final void method1411(long arg0, int arg1) {
        field3341++;
        if (arg0 != 0L) {
            class282.field4329++;
            int var3 = -104 / ((52 - arg1) / 52);
            class265.field4095.method2064(255, 174);
            class265.field4095.method2023(arg0, 127);
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(B)I", line = 45)
    public final int method1412(byte arg0) {
        if (arg0 == -107) {
            field3348++;
            return this.field3347;
        } else {
            return 47;
        }
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(B)V", line = 63)
    public static void method1413(byte arg0) {
        field3342 = null;
        field3353 = null;
        if (arg0 != -33) {
            field3345 = (class227) null;
        }
        field3345 = null;
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V", line = 74)
    public class211() {
        super(0, false);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([[B[[F[[BI[[[I[[FB[[I[[B[[I[[I[[I[[I[[[B[[F[[B)[Lqa;", line = 80)
    public static final class217[] method1414(byte[][] arg0, float[][] arg1, byte[][] arg2, int arg3, int[][][] arg4, float[][] arg5, byte arg6, int[][] arg7, byte[][] arg8, int[][] arg9, int[][] arg10, int[][] arg11, int[][] arg12, byte[][][] arg13, float[][] arg14, byte[][] arg15) {
        field3355++;
        int[][] var16 = new int[105][105];
        for (int var17 = 1; var17 <= 103; var17++) {
            for (int var18 = 1; var18 <= 103; var18++) {
                int var19 = 0;
                if (arg4 != null) {
                    int var20 = arg4[arg3][var17 >> 3][var18 >> 3];
                    var19 = (var20 & 0x7) >> 1;
                }
                boolean var21 = false;
                byte var22;
                if (var19 == 0) {
                    var22 = arg0[var17][var18];
                    if (var22 == 0) {
                        var22 = arg0[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg0[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg0[var17 - 1][var18 - 1];
                    }
                } else if (var19 == 1) {
                    var22 = arg0[var17][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg0[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg0[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg0[var17 - 1][var18];
                    }
                } else if (var19 == 2) {
                    var22 = arg0[var17 - 1][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg0[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg0[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg0[var17][var18];
                    }
                } else {
                    var22 = arg0[var17 - 1][var18];
                    if (var22 == 0) {
                        var22 = arg0[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg0[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg0[var17][var18 - 1];
                    }
                }
                if (var22 != 0) {
                    class183 var23 = class79.method549((byte) -90, (var22 & 0xFF) - 1);
                    var16[var17][var18] = (var23.field2795 + 1 << 16) + var23.field2806;
                }
            }
        }
        class227 var24 = new class227(128);
        for (int var25 = 1; var25 <= 102; var25++) {
            for (int var26 = 1; var26 <= 102; var26++) {
                if (arg0[var25][var26] != 0) {
                    int[] var27;
                    if (arg15[var25][var26] == 0) {
                        var27 = class46.field653[0];
                    } else {
                        var27 = class303.field4691[arg8[var25][var26]];
                        if (var27.length == 0) {
                            continue;
                        }
                    }
                    int var28 = 0;
                    int var29 = var16[var25][var26];
                    if (arg9 != null) {
                        var28 = arg9[var25][var26] & 0xFFFFFF;
                    }
                    int var30 = var16[var25 + 1][var26];
                    int var31 = var16[var25][var26 + 1];
                    int var32 = var16[var25 + 1][var26 + 1];
                    long var33 = (long) var30 << 32 | (long) var28;
                    long var35 = (long) var28 | (long) var32 << 32;
                    long var37 = (long) var29 << 32 | (long) var28;
                    long var39 = (long) var28 | (long) var31 << 32;
                    int var41 = var27.length / 2;
                    class217 var42 = (class217) var24.method1558(var37, false);
                    if (var42 == null) {
                        var42 = new class217((var29 >> 16) - 1, (float) (var29 & 0xFFFF), false, arg10 != null, var28);
                        var24.method1550(var42, var37, (byte) 98);
                    }
                    var42.field3427++;
                    var42.field3419 += var41;
                    if (var33 != var37) {
                        class217 var43 = (class217) var24.method1558(var33, false);
                        if (var43 == null) {
                            var43 = new class217((var30 >> 16) - 1, (float) (var30 & 0xFFFF), false, arg10 != null, var28);
                            var24.method1550(var43, var33, (byte) 28);
                        }
                        var43.field3427++;
                        var43.field3419 += var41;
                    }
                    if (var35 != var37 && var33 != var35) {
                        class217 var44 = (class217) var24.method1558(var35, false);
                        if (var44 == null) {
                            var44 = new class217((var32 >> 16) - 1, (float) (var32 & 0xFFFF), false, arg10 != null, var28);
                            var24.method1550(var44, var35, (byte) 2);
                        }
                        var44.field3419 += var41;
                        var44.field3427++;
                    }
                    if (var37 != var39 && var33 != var39 && var35 != var39) {
                        class217 var45 = (class217) var24.method1558(var39, false);
                        if (var45 == null) {
                            var45 = new class217((var31 >> 16) - 1, (float) (var31 & 0xFFFF), false, arg10 != null, var28);
                            var24.method1550(var45, var39, (byte) 60);
                        }
                        var45.field3419 += var41;
                        var45.field3427++;
                    }
                }
            }
        }
        int var46 = -32 / ((54 - arg6) / 58);
        for (class217 var47 = (class217) var24.method1549((byte) 94); var47 != null; var47 = (class217) var24.method1546(-1)) {
            var47.method1453();
        }
        for (int var48 = 1; var48 <= 102; var48++) {
            for (int var49 = 1; var49 <= 102; var49++) {
                byte var50 = arg0[var48][var49];
                if (var50 != 0) {
                    int var51;
                    if ((arg13[arg3][var48][var49] & 0x8) != 0) {
                        var51 = 0;
                    } else if ((arg13[1][var48][var49] & 0x2) == 2 && arg3 > 0) {
                        var51 = arg3 - 1;
                    } else {
                        var51 = arg3;
                    }
                    int var52 = 0;
                    int var53 = 128;
                    if (arg9 != null) {
                        var52 = arg9[var48][var49] & 0xFFFFFF;
                        var53 = arg9[var48][var49] >>> 24 << 3;
                    }
                    boolean[] var54 = null;
                    byte var55;
                    int[] var56;
                    if (arg15[var48][var49] == 0) {
                        var56 = class46.field653[0];
                        byte var57 = 0;
                        int var58 = var57 + (arg0[var48 + 1][var49 - 1] == var50 ? 1 : -1);
                        byte var59 = 0;
                        int var60 = var59 + (arg0[var48 - 1][var49 - 1] == var50 ? 1 : -1);
                        byte var61 = 0;
                        if (arg0[var48][var49 - 1] == var50) {
                            var60++;
                            var58++;
                        } else {
                            var60--;
                            var58--;
                        }
                        byte var62 = 0;
                        int var63 = var61 + (arg0[var48 - 1][var49 + 1] == var50 ? 1 : -1);
                        int var64 = var62 + (arg0[var48 + 1][var49 + 1] == var50 ? 1 : -1);
                        if (arg0[var48 + 1][var49] == var50) {
                            var64++;
                            var58++;
                        } else {
                            var64--;
                            var58--;
                        }
                        if (arg0[var48][var49 + 1] == var50) {
                            var63++;
                            var64++;
                        } else {
                            var63--;
                            var64--;
                        }
                        if (arg0[var48 - 1][var49] == var50) {
                            var60++;
                            var63++;
                        } else {
                            var60--;
                            var63--;
                        }
                        int var65 = var58 - var63;
                        int var66 = var60 - var64;
                        if (var66 < 0) {
                            var66 = -var66;
                        }
                        if (var65 < 0) {
                            var65 = -var65;
                        }
                        var55 = (byte) (var66 >= var65 ? 0 : 1);
                        arg2[var48][var49] = var55;
                    } else {
                        var54 = class10.field102[arg8[var48][var49]];
                        var55 = arg2[var48][var49];
                        var56 = class303.field4691[arg8[var48][var49]];
                        if (var56.length == 0) {
                            continue;
                        }
                    }
                    int var67 = var16[var48][var49];
                    int var68 = var16[var48 + 1][var49];
                    int var69 = var16[var48 + 1][var49 + 1];
                    int var70 = var16[var48][var49 + 1];
                    long var71 = (long) var52 | (long) var67 << 32;
                    long var73 = (long) var52 | (long) var68 << 32;
                    long var75 = (long) var69 << 32 | (long) var52;
                    long var77 = (long) var70 << 32 | (long) var52;
                    int var79 = arg7[var48][var49];
                    int var80 = arg7[var48 + 1][var49];
                    int var81 = arg11[var48 + 1][var49];
                    int var82 = arg7[var48][var49 + 1];
                    int var83 = arg11[var48 + 1][var49 + 1];
                    int var84 = arg7[var48 + 1][var49 + 1];
                    int var85 = arg11[var48][var49];
                    int var86 = arg11[var48][var49 + 1];
                    int var87 = (var67 >> 16) - 1;
                    int var88 = (var70 >> 16) - 1;
                    int var89 = (var69 >> 16) - 1;
                    class217 var90 = (class217) var24.method1558(var71, false);
                    class188.method1297(arg10, var68 >= var67, arg1, var53, var70 >= var67, var54, arg12, var51, class104.method706((byte) -57, var87, var83, var84), var90, arg5, var56, var49, class104.method706((byte) 127, var87, var86, var82), class104.method706((byte) 126, var87, var85, var79), (byte) -87, var48, class104.method706((byte) 28, var87, var81, var80), var67 <= var67, var55, var67 <= var69, arg14);
                    int var91 = (var68 >> 16) - 1;
                    if (var71 != var73) {
                        class217 var92 = (class217) var24.method1558(var73, false);
                        class188.method1297(arg10, var68 <= var68, arg1, var53, var70 >= var68, var54, arg12, var51, class104.method706((byte) 14, var91, var83, var84), var92, arg5, var56, var49, class104.method706((byte) -9, var91, var86, var82), class104.method706((byte) -71, var91, var85, var79), (byte) -87, var48, class104.method706((byte) 126, var91, var81, var80), var67 >= var68, var55, var68 <= var69, arg14);
                    }
                    if (var71 != var75 && var73 != var75) {
                        class217 var93 = (class217) var24.method1558(var75, false);
                        class188.method1297(arg10, var69 <= var68, arg1, var53, var69 <= var70, var54, arg12, var51, class104.method706((byte) 126, var89, var83, var84), var93, arg5, var56, var49, class104.method706((byte) -100, var89, var86, var82), class104.method706((byte) -106, var89, var85, var79), (byte) -87, var48, class104.method706((byte) -81, var89, var81, var80), var67 >= var69, var55, var69 >= var69, arg14);
                    }
                    if (var71 != var77 && var73 != var77 && var75 != var77) {
                        class217 var94 = (class217) var24.method1558(var77, false);
                        class188.method1297(arg10, var70 <= var68, arg1, var53, var70 <= var70, var54, arg12, var51, class104.method706((byte) 126, var88, var83, var84), var94, arg5, var56, var49, class104.method706((byte) -106, var88, var86, var82), class104.method706((byte) 127, var88, var85, var79), (byte) -87, var48, class104.method706((byte) 127, var88, var81, var80), var70 <= var67, var55, var69 >= var70, arg14);
                    }
                }
            }
        }
        for (class217 var95 = (class217) var24.method1549((byte) -87); var95 != null; var95 = (class217) var24.method1546(-1)) {
            if (var95.field3418 == 0) {
                var95.method1284(0);
            } else {
                var95.method1449();
            }
        }
        int var96 = var24.method1559(-29512);
        long[] var97 = new long[var96];
        class217[] var98 = new class217[var96];
        var24.method1560(var98, 23);
        for (int var99 = 0; var99 < var96; var99++) {
            var97[var99] = var98[var99].field2852;
        }
        class105.method715(var98, var97, false);
        return var98;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(JI)V", line = 537)
    public static final void method1415(long arg0, int arg1) {
        if (!class298.field4569) {
            class309.field4866 += (float) arg0 * class207.field3125 / 40.0F;
            class123.field1922 += (float) arg0 * class228.field3656 / 40.0F;
        }
        int var3 = class299.field4643 + class79.field1173.field537;
        field3343++;
        if (arg1 != 32479) {
            field3353 = (class306) null;
        }
        int var4 = class79.field1173.field519 + class104.field1610;
        if ((class330.field5100 - var3) < -500 || (class330.field5100 - var3) > 500 || class332.field5139 - var4 < -500 || class332.field5139 - var4 > 500) {
            class332.field5139 = var4;
            class330.field5100 = var3;
        }
        if (class330.field5100 != var3) {
            int var5 = var3 - class330.field5100;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class330.field5100 += var6;
        }
        if (class332.field5139 != var4) {
            int var7 = var4 - class332.field5139;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class332.field5139 += var8;
        }
        class338.method2339(45);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BILgn;)V", line = 630)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        if (arg0 < 27) {
            this.field3351 = -117;
        }
        field3354++;
        if (arg1 == 0) {
            this.field3347 = arg2.method1994(false);
        }
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(B)Z", line = 643)
    public final boolean method1416(byte arg0) {
        field3349++;
        int var2 = 39 / ((45 - arg0) / 50);
        if (this.field3350 != null) {
            return true;
        } else if (this.field3347 < 0) {
            return false;
        } else {
            class178 var3 = class204.field3084 >= 0 ? class320.method2173(class204.field3084, this.field3347, class85.field1290, 17136) : class264.method1750(class85.field1290, this.field3347, -9837);
            var3.method1216();
            this.field3351 = var3.field3844;
            this.field3346 = var3.field3847;
            this.field3350 = var3.field2734;
            return true;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IB)[[I", line = 670)
    public int[][] method170(int arg0, byte arg1) {
        if (arg1 != 68) {
            method1415(41L, -34);
        }
        int[][] var3 = this.field4200.method539(152, arg0);
        field3352++;
        if (this.field4200.field1147 && this.method1416((byte) 109)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field3346 * (class99.field1533 == this.field3351 ? arg0 : this.field3351 * arg0 / class99.field1533);
            if (class27.field346 == this.field3346) {
                for (int var8 = 0; var8 < class27.field346; var8++) {
                    int var9 = this.field3350[var7++];
                    var6[var8] = class311.method2135(255, var9) << 4;
                    var5[var8] = class311.method2135(var9 >> 4, 4080);
                    var4[var8] = class311.method2135(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; var10 < class27.field346; var10++) {
                    int var11 = this.field3346 * var10 / class27.field346;
                    int var12 = this.field3350[var7 + var11];
                    var6[var10] = class311.method2135(4080, var12 << 4);
                    var5[var10] = class311.method2135(4080, var12 >> 4);
                    var4[var10] = class311.method2135(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(I)V", line = 740)
    public final void method1417(int arg0) {
        super.method1417((short) arg0);
        this.field3350 = null;
        field3340++;
    }
}
