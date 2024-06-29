import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class10 extends class99 {

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "I")
    private int field112 = 2048;

    @OriginalMember(owner = "client!ce", name = "bb", descriptor = "I")
    private int field115 = 1024;

    @OriginalMember(owner = "client!ce", name = "jb", descriptor = "I")
    private int field123 = 3072;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "S")
    public static short field105 = 205;

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "Lr;")
    public static class66 field110 = class93.method641(43, ")4");

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "Lr;")
    public static class66 field108 = class93.method641(43, "");

    @OriginalMember(owner = "client!ce", name = "hb", descriptor = "Lr;")
    public static class66 field121 = class93.method641(43, "Null");

    @OriginalMember(owner = "client!ce", name = "ib", descriptor = "Lr;")
    private static class66 field122 = class93.method641(43, "yellow:");

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "Lr;")
    public static class66 field109 = field122;

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "Lr;")
    public static class66 field113 = field122;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!ce", name = "cb", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!ce", name = "db", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ce", name = "eb", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!ce", name = "fb", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ce", name = "gb", descriptor = "[I")
    public static int[] field120;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method37(int arg0, boolean arg1) {
        ++field107;
        if (!arg1) {
            field122 = null;
        }
        int[][] var3 = super.field1946.method823(arg0, (byte) -123);
        if (super.field1946.field2297) {
            int[][] var4 = this.method683(-20, 0, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class199.field3432 > var11; ++var11) {
                var8[var11] = (var6[var11] * this.field112 >> 12) + this.field115;
                var9[var11] = (var5[var11] * this.field112 >> 12) + this.field115;
                var10[var11] = (var7[var11] * this.field112 >> 12) + this.field115;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
    public class10() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        if (arg0 != -61) {
            field108 = null;
        }
        ++field111;
        int[] var3 = super.field1943.method749(false, arg1);
        if (super.field1943.field2147) {
            int[] var4 = this.method682(0, arg1, arg0 ^ -29154);
            for (int var5 = 0; var5 < class199.field3432; ++var5) {
                var3[var5] = this.field115 - -(var4[var5] * this.field112 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIZIIZIII)Z")
    private static final boolean method42(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; ~var12 > -105; ++var12) {
            for (int var31 = 0; var31 < 104; ++var31) {
                class132.field2463[var12][var31] = 0;
                class231.field4049[var12][var31] = 99999999;
            }
        }
        int var13 = arg10;
        class132.field2463[arg10][arg0] = 99;
        class231.field4049[arg10][arg0] = 0;
        ++field117;
        int var14 = arg0;
        byte var15 = 0;
        int var16 = 0;
        class188.field3263[var15] = arg10;
        int var32 = var15 + 1;
        class176.field3099[var15] = arg0;
        int[][] var17 = class193.field3346[class196.field3401].field2976;
        boolean var18 = false;
        while (~var32 != ~var16) {
            var13 = class188.field3263[var16];
            var14 = class176.field3099[var16];
            var16 = var16 + 1 & 4095;
            if (~arg6 == ~var13 && arg9 == var14) {
                var18 = true;
                break;
            }
            if (arg4 != 0) {
                if ((~arg4 > -6 || ~arg4 == -11) && class193.field3346[class196.field3401].method1125(arg2, arg6, (byte) 108, var13, 2, arg9, var14, arg4 - 1)) {
                    var18 = true;
                    break;
                }
                if (arg4 < 10 && class193.field3346[class196.field3401].method1128(arg6, var13, arg2, (byte) 69, 2, arg9, var14, arg4 - 1)) {
                    var18 = true;
                    break;
                }
            }
            if (~arg1 != -1 && ~arg3 != -1 && class193.field3346[class196.field3401].method1114(15856, arg9, 2, var14, arg3, var13, arg11, arg1, arg6)) {
                var18 = true;
                break;
            }
            int var30 = class231.field4049[var13][var14] - -1;
            if (~var13 < -1 && ~class132.field2463[var13 + -1][var14] == -1 && ~(19661070 & var17[var13 + -1][var14]) == -1 && (var17[var13 - 1][var14 + 1] & 19661112) == 0) {
                class188.field3263[var32] = var13 + -1;
                class176.field3099[var32] = var14;
                class132.field2463[var13 + -1][var14] = 2;
                class231.field4049[var13 + -1][var14] = var30;
                var32 = 4095 & var32 - -1;
            }
            if (var13 < 102 && ~class132.field2463[var13 + 1][var14] == -1 && ~(19661187 & var17[var13 - -2][var14]) == -1 && ~(var17[var13 + 2][var14 - -1] & 19661280) == -1) {
                class188.field3263[var32] = var13 + 1;
                class176.field3099[var32] = var14;
                class132.field2463[var13 + 1][var14] = 8;
                class231.field4049[var13 - -1][var14] = var30;
                var32 = var32 + 1 & 4095;
            }
            if (var14 > 0 && ~class132.field2463[var13][var14 + -1] == -1 && ~(19661070 & var17[var13][var14 + -1]) == -1 && (19661187 & var17[var13 + 1][var14 + -1]) == 0) {
                class188.field3263[var32] = var13;
                class176.field3099[var32] = var14 + -1;
                class132.field2463[var13][var14 - 1] = 1;
                var32 = 4095 & var32 + 1;
                class231.field4049[var13][var14 + -1] = var30;
            }
            if (~var14 > -103 && class132.field2463[var13][var14 + 1] == 0 && ~(var17[var13][var14 + 2] & 19661112) == -1 && (19661280 & var17[var13 + 1][var14 + 2]) == 0) {
                class188.field3263[var32] = var13;
                class176.field3099[var32] = var14 + 1;
                class132.field2463[var13][var14 + 1] = 4;
                class231.field4049[var13][var14 + 1] = var30;
                var32 = var32 + 1 & 4095;
            }
            if (~var13 < -1 && var14 > 0 && class132.field2463[var13 + -1][var14 + -1] == 0 && (19661112 & var17[var13 + -1][var14]) == 0 && ~(var17[var13 + -1][var14 - 1] & 19661070) == -1 && (var17[var13][var14 + -1] & 19661187) == 0) {
                class188.field3263[var32] = var13 - 1;
                class176.field3099[var32] = var14 - 1;
                var32 = 4095 & var32 - -1;
                class132.field2463[var13 + -1][var14 + -1] = 3;
                class231.field4049[var13 + -1][var14 + -1] = var30;
            }
            if (~var13 > -103 && ~var14 < -1 && class132.field2463[var13 + 1][var14 + -1] == 0 && (19661070 & var17[var13 + 1][var14 + -1]) == 0 && (19661187 & var17[var13 + 2][var14 + -1]) == 0 && (19661280 & var17[var13 + 2][var14]) == 0) {
                class188.field3263[var32] = var13 + 1;
                class176.field3099[var32] = var14 + -1;
                class132.field2463[var13 + 1][var14 - 1] = 9;
                var32 = var32 + 1 & 4095;
                class231.field4049[var13 + 1][var14 + -1] = var30;
            }
            if (var13 > 0 && ~var14 > -103 && class132.field2463[var13 + -1][var14 + 1] == 0 && ~(var17[var13 + -1][var14 + 1] & 19661070) == -1 && ~(19661112 & var17[var13 + -1][var14 + 2]) == -1 && ~(var17[var13][var14 + 2] & 19661280) == -1) {
                class188.field3263[var32] = var13 + -1;
                class176.field3099[var32] = var14 + 1;
                class132.field2463[var13 - 1][var14 + 1] = 6;
                var32 = 4095 & var32 + 1;
                class231.field4049[var13 + -1][var14 + 1] = var30;
            }
            if (~var13 > -103 && ~var14 > -103 && class132.field2463[var13 + 1][var14 - -1] == 0 && ~(19661112 & var17[var13 + 1][var14 + 2]) == -1 && (var17[var13 + 2][var14 - -2] & 19661280) == 0 && ~(var17[var13 + 2][var14 + 1] & 19661187) == -1) {
                class188.field3263[var32] = var13 - -1;
                class176.field3099[var32] = var14 + 1;
                class132.field2463[var13 - -1][var14 + 1] = 12;
                class231.field4049[var13 - -1][var14 + 1] = var30;
                var32 = var32 + 1 & 4095;
            }
        }
        class173.field3050 = 0;
        if (!var18) {
            if (!arg5) {
                return false;
            }
            int var19 = 1000;
            byte var20 = 10;
            int var21 = 100;
            for (int var22 = -var20 + arg6; ~var22 >= ~(arg6 + var20); ++var22) {
                for (int var23 = arg9 - var20; ~var23 >= ~(arg9 + var20); ++var23) {
                    if (~var22 <= -1 && var23 >= 0 && var22 < 104 && var23 < 104 && class231.field4049[var22][var23] < 100) {
                        int var24 = 0;
                        if (~arg6 < ~var22) {
                            var24 = arg6 - var22;
                        } else if (~var22 < ~(arg6 - -arg1 - 1)) {
                            var24 = -arg1 + 1 + var22 + -arg6;
                        }
                        int var25 = 0;
                        if (~var23 > ~arg9) {
                            var25 = -var23 + arg9;
                        } else if (arg3 + arg9 + -1 < var23) {
                            var25 = -arg3 + -arg9 + var23 + 1;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var19 > var26 || ~var19 == ~var26 && ~var21 < ~class231.field4049[var22][var23]) {
                            var14 = var23;
                            var13 = var22;
                            var21 = class231.field4049[var22][var23];
                            var19 = var26;
                        }
                    }
                }
            }
            if (~var19 == -1001) {
                return false;
            }
            if (~arg10 == ~var13 && arg0 == var14) {
                return false;
            }
            class173.field3050 = 1;
        }
        byte var27 = 0;
        class188.field3263[var27] = var13;
        if (!arg8) {
            field122 = null;
        }
        int var33 = var27 + 1;
        class176.field3099[var27] = var14;
        int var28;
        int var29 = var28 = class132.field2463[var13][var14];
        while (~arg10 != ~var13 || ~arg0 != ~var14) {
            if (~var28 != ~var29) {
                var28 = var29;
                class188.field3263[var33] = var13;
                class176.field3099[var33++] = var14;
            }
            if (~(var29 & 1) != -1) {
                ++var14;
            } else if ((var29 & 4) != 0) {
                --var14;
            }
            if (~(var29 & 2) != -1) {
                ++var13;
            } else if ((var29 & 8) != 0) {
                --var13;
            }
            var29 = class132.field2463[var13][var14];
        }
        if (~var33 < -1) {
            class183.method1219(var33, arg7, (byte) 125);
            return true;
        } else if (arg7 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        ++field106;
        if (arg0 > -22) {
            this.field123 = -76;
        }
        this.field112 = -this.field115 + this.field123;
    }

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "(I)V")
    public static void method43(int arg0) {
        field122 = null;
        if (arg0 != 9927) {
            field110 = null;
        }
        field120 = null;
        field121 = null;
        field108 = null;
        field113 = null;
        field110 = null;
        field109 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIIZIIII)Z")
    public static final boolean method44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field116;
        if (~class207.field3595.field2060 == arg9) {
            return method42(arg3, arg5, arg0, arg4, arg1, arg7, arg11, arg10, true, arg6, arg2, arg8);
        } else {
            return ~class207.field3595.field2060 < -3 ? class151.method1024(arg7, arg2, arg6, arg10, arg4, arg0, arg5, (byte) 121, arg11, arg3, arg1, arg8, class207.field3595.field2060) : class57.method378(arg6, arg5, arg1, arg4, arg3, arg11, (byte) 36, arg10, arg0, arg2, arg8, arg7);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field1938 = arg0.method1677(-6677) == 1;
                }
            } else {
                this.field123 = arg0.method1674(arg2 + 1355769545);
            }
        } else {
            this.field115 = arg0.method1674(arg2 ^ -1355769545);
        }
        ++field119;
        if (arg2 != -1) {
            this.method11((class249) null, -25, 117);
        }
    }
}
