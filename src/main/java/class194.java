import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class194 extends class424 {

    @OriginalMember(owner = "client!co", name = "R", descriptor = "I")
    private int field2806 = 32768;

    @OriginalMember(owner = "client!co", name = "N", descriptor = "[I")
    public static int[] field2802 = new int[32];

    @OriginalMember(owner = "client!co", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field2803 = null;

    @OriginalMember(owner = "client!co", name = "L", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!co", name = "M", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!co", name = "P", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!co", name = "Q", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!co", name = "S", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!co", name = "U", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!co", name = "V", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!co", name = "W", descriptor = "[I")
    public static int[] field2811;

    @OriginalMember(owner = "client!co", name = "T", descriptor = "[S")
    public static short[] field2808;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(B)V")
    public static void method1343(byte arg0) {
        field2802 = null;
        field2811 = null;
        if (arg0 > 103) {
            field2808 = null;
            field2803 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method21(int arg0, boolean arg1) {
        ++field2810;
        int[][] var3 = super.field5896.method693(arg1, arg0);
        if (super.field5896.field1228) {
            int[] var4 = this.method2621(1, -121, arg0);
            int[] var5 = this.method2621(2, -118, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class303.field4135; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field2806 >> 12;
                int var12 = class62.field843[var10] * var11 >> 12;
                int var13 = class269.field3688[var10] * var11 >> 12;
                int var14 = class65.field898 & (var12 >> 12) + var9;
                int var15 = class174.field2484 & (var13 >> 12) + arg0;
                int[][] var16 = this.method2624(true, 0, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lrg;BI)V")
    public final void method19(class366 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field5893 = arg0.method2306((byte) 118) == 1;
            }
        } else {
            this.field2806 = arg0.method2297(13352) << 4;
        }
        if (arg1 != -48) {
            this.method113(46);
        }
        ++field2809;
    }

    @OriginalMember(owner = "client!co", name = "g", descriptor = "(I)V")
    public static final void method1344(int arg0) {
        ++field2807;
        class408 var1 = class142.field2082;
        synchronized (class142.field2082) {
            class142.field2082.method2522((byte) 74);
        }
        int var2 = -62 % ((34 - arg0) / 42);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BII[[B[[B[ZLap;[[BIIIILaj;Lea;)V")
    public static final void method1345(byte arg0, int arg1, int arg2, byte[][] arg3, byte[][] arg4, boolean[] arg5, class290 arg6, byte[][] arg7, int arg8, int arg9, int arg10, int arg11, class71 arg12, class58 arg13) {
        if (arg12 != null && arg6 != null || arg6 != null && arg11 == 12 || arg12 != null && arg11 == 0) {
            boolean[] var14 = arg12 != null && arg12.field988 ? class203.field2890[arg11] : class106.field1485[arg11];
            if (~arg8 < -1) {
                if (arg2 > 0) {
                    int var15 = 255 & arg3[arg2 - 1][arg8 + -1];
                    if (~var15 < -1) {
                        class71 var16 = class52.method422(var15 + -1, 7513);
                        if (~var16.field995 != 0 && var16.field988) {
                            byte var17 = arg4[arg2 + -1][arg8 + -1];
                            int var18 = 4 - -(arg7[arg2 + -1][arg8 + -1] * 2) & 7;
                            int var19 = class340.method2076(124, var16, arg13);
                            if (class111.field1720[var17][var18]) {
                                class370.field5117[0] = var16.field995;
                                class344.field4643[0] = var19;
                                class41.field539[0] = arg13.method166() ? var16.field997 : var16.field984;
                                class104.field1449[0] = var16.field992;
                                class134.field1999[0] = var16.field994;
                                class29.field403[0] = 256;
                            }
                        }
                    }
                }
                if (~(arg9 + -1) < ~arg2) {
                    int var20 = 255 & arg3[arg2 - -1][arg8 + -1];
                    if (~var20 < -1) {
                        class71 var21 = class52.method422(var20 - 1, 7513);
                        if (~var21.field995 != 0 && var21.field988) {
                            byte var22 = arg4[arg2 + 1][arg8 - 1];
                            int var23 = 6 - -(arg7[arg2 + 1][arg8 + -1] * 2) & 7;
                            int var24 = class340.method2076(121, var21, arg13);
                            if (class111.field1720[var22][var23]) {
                                class370.field5117[2] = var21.field995;
                                class344.field4643[2] = var24;
                                class41.field539[2] = arg13.method166() ? var21.field997 : var21.field984;
                                class104.field1449[2] = var21.field992;
                                class134.field1999[2] = var21.field994;
                                class29.field403[2] = 512;
                            }
                        }
                    }
                }
            }
            if (~arg8 > ~(arg10 + -1)) {
                if (arg2 > 0) {
                    int var25 = arg3[arg2 - 1][arg8 + 1] & 255;
                    if (var25 > 0) {
                        class71 var26 = class52.method422(var25 - 1, 7513);
                        if (var26.field995 != -1 && var26.field988) {
                            byte var27 = arg4[arg2 - 1][arg8 + 1];
                            int var28 = arg7[arg2 - 1][arg8 + 1] * 2 + 2 & 7;
                            int var29 = class340.method2076(24, var26, arg13);
                            if (class111.field1720[var27][var28]) {
                                class370.field5117[6] = var26.field995;
                                class344.field4643[6] = var29;
                                class41.field539[6] = arg13.method166() ? var26.field997 : var26.field984;
                                class104.field1449[6] = var26.field992;
                                class134.field1999[6] = var26.field994;
                                class29.field403[6] = 64;
                            }
                        }
                    }
                }
                if (~(arg9 + -1) < ~arg2) {
                    int var30 = arg3[arg2 - -1][arg8 - -1] & 255;
                    if (~var30 < -1) {
                        class71 var31 = class52.method422(var30 + -1, 7513);
                        if (var31.field995 != -1 && var31.field988) {
                            byte var32 = arg4[arg2 + 1][arg8 + 1];
                            int var33 = 7 & arg7[arg2 + 1][arg8 + 1] * 2;
                            int var34 = class340.method2076(123, var31, arg13);
                            if (class111.field1720[var32][var33]) {
                                class370.field5117[4] = var31.field995;
                                class344.field4643[4] = var34;
                                class41.field539[4] = !arg13.method166() ? var31.field984 : var31.field997;
                                class104.field1449[4] = var31.field992;
                                class134.field1999[4] = var31.field994;
                                class29.field403[4] = 128;
                            }
                        }
                    }
                }
            }
            if (~arg8 < -1) {
                int var35 = arg3[arg2][arg8 + -1] & 255;
                if (var35 > 0) {
                    class71 var36 = class52.method422(var35 + -1, 7513);
                    if (var36.field995 != -1) {
                        byte var37 = arg4[arg2][arg8 - 1];
                        byte var38 = arg7[arg2][arg8 - 1];
                        if (!var36.field988) {
                            if (!var14[arg1 & 3]) {
                                arg5[0] = class106.field1485[var37][class187.method1301(3, var38 + 2)];
                            }
                        } else {
                            int var39 = 2;
                            int var40 = var38 * 2 + 4;
                            int var41 = class340.method2076(126, var36, arg13);
                            for (int var42 = 0; ~var42 > -4; ++var42) {
                                var40 &= 7;
                                var39 &= 7;
                                if (class111.field1720[var37][var40] && ~var36.field994 <= ~class134.field1999[var39]) {
                                    class370.field5117[var39] = var36.field995;
                                    class344.field4643[var39] = var41;
                                    class41.field539[var39] = !arg13.method166() ? var36.field984 : var36.field997;
                                    class104.field1449[var39] = var36.field992;
                                    if (class134.field1999[var39] == var36.field994) {
                                        class29.field403[var39] = class431.method2655(class29.field403[var39], 32);
                                    } else {
                                        class29.field403[var39] = 32;
                                    }
                                    class134.field1999[var39] = var36.field994;
                                }
                                --var39;
                                ++var40;
                            }
                            if (!var14[arg1 & 3]) {
                                arg5[0] = class203.field2890[var37][class187.method1301(var38 + 2, 3)];
                            }
                        }
                    }
                }
            }
            if (arg10 + -1 > arg8) {
                int var43 = arg3[arg2][arg8 + 1] & 255;
                if (~var43 < -1) {
                    class71 var44 = class52.method422(var43 + -1, 7513);
                    if (var44.field995 != -1) {
                        byte var45 = arg4[arg2][arg8 + 1];
                        byte var46 = arg7[arg2][arg8 - -1];
                        if (!var44.field988) {
                            if (!var14[arg1 + 2 & 3]) {
                                arg5[2] = class106.field1485[var45][class187.method1301(var46, 3)];
                            }
                        } else {
                            int var47 = 4;
                            int var48 = var46 * 2 + 2;
                            int var49 = class340.method2076(-114, var44, arg13);
                            for (int var50 = 0; ~var50 > -4; ++var50) {
                                var47 &= 7;
                                var48 &= 7;
                                if (class111.field1720[var45][var48] && ~class134.field1999[var47] >= ~var44.field994) {
                                    class370.field5117[var47] = var44.field995;
                                    class344.field4643[var47] = var49;
                                    class41.field539[var47] = arg13.method166() ? var44.field997 : var44.field984;
                                    class104.field1449[var47] = var44.field992;
                                    if (class134.field1999[var47] != var44.field994) {
                                        class29.field403[var47] = 16;
                                    } else {
                                        class29.field403[var47] = class431.method2655(class29.field403[var47], 16);
                                    }
                                    class134.field1999[var47] = var44.field994;
                                }
                                ++var47;
                                --var48;
                            }
                            if (!var14[3 & arg1 + 2]) {
                                arg5[2] = class203.field2890[var45][class187.method1301(3, -(-var46))];
                            }
                        }
                    }
                }
            }
            if (~arg2 < -1) {
                int var51 = 255 & arg3[arg2 + -1][arg8];
                if (var51 > 0) {
                    class71 var52 = class52.method422(var51 + -1, 7513);
                    if (var52.field995 != -1) {
                        byte var53 = arg4[arg2 - 1][arg8];
                        byte var54 = arg7[arg2 + -1][arg8];
                        if (!var52.field988) {
                            if (!var14[3 & arg1 + 3]) {
                                arg5[3] = class106.field1485[var53][class187.method1301(3, var54 + 1)];
                            }
                        } else {
                            int var55 = 6;
                            int var56 = var54 * 2 + 4;
                            int var57 = class340.method2076(-60, var52, arg13);
                            for (int var58 = 0; var58 < 3; ++var58) {
                                var56 &= 7;
                                var55 &= 7;
                                if (class111.field1720[var53][var56] && class134.field1999[var55] <= var52.field994) {
                                    class370.field5117[var55] = var52.field995;
                                    class344.field4643[var55] = var57;
                                    class41.field539[var55] = arg13.method166() ? var52.field997 : var52.field984;
                                    class104.field1449[var55] = var52.field992;
                                    if (~class134.field1999[var55] == ~var52.field994) {
                                        class29.field403[var55] = class431.method2655(class29.field403[var55], 8);
                                    } else {
                                        class29.field403[var55] = 8;
                                    }
                                    class134.field1999[var55] = var52.field994;
                                }
                                ++var55;
                                --var56;
                            }
                            if (!var14[3 & arg1 + 3]) {
                                arg5[3] = class203.field2890[var53][class187.method1301(var54 + 1, 3)];
                            }
                        }
                    }
                }
            }
            if (arg2 < arg9 + -1) {
                int var59 = arg3[arg2 + 1][arg8] & 255;
                if (~var59 < -1) {
                    class71 var60 = class52.method422(var59 + -1, 7513);
                    if (~var60.field995 != 0) {
                        byte var61 = arg4[arg2 - -1][arg8];
                        byte var62 = arg7[arg2 + 1][arg8];
                        if (!var60.field988) {
                            if (!var14[3 & arg1 + 1]) {
                                arg5[1] = class106.field1485[var61][class187.method1301(var62 + 3, 3)];
                            }
                        } else {
                            int var63 = 4;
                            int var64 = var62 * 2 + 6;
                            int var65 = class340.method2076(122, var60, arg13);
                            for (int var66 = 0; ~var66 > -4; ++var66) {
                                var64 &= 7;
                                var63 &= 7;
                                if (class111.field1720[var61][var64] && ~class134.field1999[var63] >= ~var60.field994) {
                                    class370.field5117[var63] = var60.field995;
                                    class344.field4643[var63] = var65;
                                    class41.field539[var63] = !arg13.method166() ? var60.field984 : var60.field997;
                                    class104.field1449[var63] = var60.field992;
                                    if (~class134.field1999[var63] == ~var60.field994) {
                                        class29.field403[var63] = class431.method2655(class29.field403[var63], 4);
                                    } else {
                                        class29.field403[var63] = 4;
                                    }
                                    class134.field1999[var63] = var60.field994;
                                }
                                ++var64;
                                --var63;
                            }
                            if (!var14[arg1 + 1 & 3]) {
                                arg5[1] = class203.field2890[var61][class187.method1301(3, var62 + 3)];
                            }
                        }
                    }
                }
            }
        }
        ++field2805;
        if (arg12 != null) {
            int var67 = class340.method2076(123, arg12, arg13);
            if (arg12.field988) {
                for (int var68 = 0; ~var68 > -9; ++var68) {
                    int var69 = -(arg1 * 2) + var68 & 7;
                    if (class111.field1720[arg11][var68] && arg12.field994 >= class134.field1999[var69]) {
                        class370.field5117[var69] = arg12.field995;
                        class344.field4643[var69] = var67;
                        class41.field539[var69] = !arg13.method166() ? arg12.field984 : arg12.field997;
                        class104.field1449[var69] = arg12.field992;
                        if (class134.field1999[var69] == arg12.field994) {
                            class29.field403[var69] = class431.method2655(class29.field403[var69], 2);
                        } else {
                            class29.field403[var69] = 2;
                        }
                        class134.field1999[var69] = arg12.field994;
                    }
                }
            }
        }
        int var70 = -123 / ((arg0 - -2) / 45);
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V")
    public class194() {
        super(3, false);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIII)I")
    public static final int method1346(int arg0, int arg1, int arg2, int arg3) {
        ++field2804;
        int var4 = arg0 / arg3;
        int var5 = arg3 + -1 & arg0;
        int var6 = arg2 / arg3;
        int var7 = arg2 & arg3 - 1;
        int var8 = class39.method343(var4, var6, (byte) -65);
        int var9 = class39.method343(var4 - -1, var6, (byte) -72);
        int var10 = class39.method343(var4, var6 + 1, (byte) -84);
        if (arg1 != -27342) {
            return -89;
        } else {
            int var11 = class39.method343(var4 - -1, var6 + 1, (byte) -93);
            int var12 = class334.method2039(var8, var5, (byte) 121, var9, arg3);
            int var13 = class334.method2039(var10, var5, (byte) 86, var11, arg3);
            return class334.method2039(var12, var7, (byte) 90, var13, arg3);
        }
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(I)V")
    public final void method113(int arg0) {
        ++field2800;
        class361.method2227(4096);
        if (arg0 != 3) {
            this.method21(85, true);
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(IB)[I")
    public final int[] method43(int arg0, byte arg1) {
        ++field2801;
        if (arg1 != -10) {
            field2803 = null;
        }
        int[] var3 = super.field5892.method783(arg0, (byte) -97);
        if (super.field5892.field1427) {
            int[] var4 = this.method2621(1, -120, arg0);
            int[] var5 = this.method2621(2, arg1 ^ 120, arg0);
            for (int var6 = 0; var6 < class303.field4135; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field2806 >> 12;
                int var9 = class62.field843[var7] * var8 >> 12;
                int var10 = class269.field3688[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class65.field898;
                int var12 = class174.field2484 & arg0 - -(var10 >> 12);
                int[] var13 = this.method2621(0, -116, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; ~var1 > -33; ++var1) {
            field2802[var1] = var0 + -1;
            var0 += var0;
        }
    }
}
