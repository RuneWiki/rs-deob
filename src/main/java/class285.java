import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class285 extends class264 {

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "Z")
    private boolean field5107 = true;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "I")
    private int field5100 = 4096;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "Lcf;")
    private static class93 field5102 = class147.method1066("Loading wordpack )2 ", -48);

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "Leb;")
    public static class239 field5104 = null;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "Lcf;")
    public static class93 field5108 = field5102;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "I")
    public static int field5109 = 0;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "Lhc;")
    public static class228 field5105 = new class228(5000);

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(B)V")
    public static void method1949(byte arg0) {
        field5108 = null;
        field5102 = null;
        field5105 = null;
        field5104 = null;
        if (arg0 >= -2) {
            field5103 = -13;
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
    public class285() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field5107 = ~arg2.method1907(16832) == -2;
            }
        } else {
            this.field5100 = arg2.method1891(-125);
        }
        if (arg0 >= 11) {
            ++field5106;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method17(int arg0, boolean arg1) {
        int[][] var3 = super.field4705.method1089(arg0, 44);
        if (super.field4705.field2670) {
            int[] var4 = this.method1767(0, class53.field881 & arg0 - 1, 21654);
            int[] var5 = this.method1767(0, arg0, 21654);
            int[] var6 = this.method1767(0, arg0 + 1 & class53.field881, 21654);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class176.field3060; ++var10) {
                int var11 = (var5[class55.field910 & var10 + 1] + -var5[class55.field910 & var10 + -1]) * this.field5100;
                int var12 = (var6[var10] + -var4[var10]) * this.field5100;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 + 4096 + var15) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = 16777216 / var17;
                    var19 = var11 / var17;
                    var20 = var12 / var17;
                }
                if (this.field5107) {
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var20;
                var9[var10] = var18;
            }
        }
        ++field5101;
        if (arg1) {
            field5102 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZIIIIIIIIIII)Z")
    public static final boolean method1950(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field5099;
        for (int var12 = 0; var12 < 104; ++var12) {
            for (int var31 = 0; var31 < 104; ++var31) {
                class74.field1372[var12][var31] = 0;
                class124.field2202[var12][var31] = 99999999;
            }
        }
        if (arg4 != 5470) {
            field5102 = null;
        }
        int var13 = arg7;
        int var14 = 0;
        int var15 = arg2;
        byte var16 = 0;
        boolean var17 = false;
        class74.field1372[arg7][arg2] = 99;
        class124.field2202[arg7][arg2] = 0;
        class163.field2878[var16] = arg7;
        int var32 = var16 + 1;
        class101.field1759[var16] = arg2;
        int[][] var18 = class148.field2605[class138.field2405].field1769;
        while (~var14 != ~var32) {
            var15 = class101.field1759[var14];
            var13 = class163.field2878[var14];
            var14 = 4095 & var14 + 1;
            if (arg5 == var13 && arg11 == var15) {
                var17 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && class148.field2605[class138.field2405].method744(arg9 + -1, arg5, 117, 1, arg11, var13, arg1, var15)) {
                    var17 = true;
                    break;
                }
                if (arg9 < 10 && class148.field2605[class138.field2405].method736(arg5, var13, arg9 - 1, 1, arg1, arg11, (byte) 115, var15)) {
                    var17 = true;
                    break;
                }
            }
            if (~arg6 != -1 && ~arg8 != -1 && class148.field2605[class138.field2405].method737(1, arg5, 57, var13, arg6, arg8, arg10, arg11, var15)) {
                var17 = true;
                break;
            }
            int var30 = class124.field2202[var13][var15] + 1;
            if (~var13 < -1 && class74.field1372[var13 + -1][var15] == 0 && (var18[var13 + -1][var15] & 19661064) == 0) {
                class163.field2878[var32] = var13 + -1;
                class101.field1759[var32] = var15;
                var32 = var32 + 1 & 4095;
                class74.field1372[var13 + -1][var15] = 2;
                class124.field2202[var13 - 1][var15] = var30;
            }
            if (var13 < 103 && class74.field1372[var13 + 1][var15] == 0 && ~(19661184 & var18[var13 + 1][var15]) == -1) {
                class163.field2878[var32] = var13 + 1;
                class101.field1759[var32] = var15;
                var32 = 4095 & var32 + 1;
                class74.field1372[var13 + 1][var15] = 8;
                class124.field2202[var13 + 1][var15] = var30;
            }
            if (~var15 < -1 && ~class74.field1372[var13][var15 + -1] == -1 && ~(var18[var13][var15 + -1] & 19661058) == -1) {
                class163.field2878[var32] = var13;
                class101.field1759[var32] = var15 - 1;
                class74.field1372[var13][var15 + -1] = 1;
                var32 = var32 + 1 & 4095;
                class124.field2202[var13][var15 + -1] = var30;
            }
            if (~var15 > -104 && ~class74.field1372[var13][var15 - -1] == -1 && (19661088 & var18[var13][var15 + 1]) == 0) {
                class163.field2878[var32] = var13;
                class101.field1759[var32] = var15 + 1;
                class74.field1372[var13][var15 + 1] = 4;
                var32 = var32 + 1 & 4095;
                class124.field2202[var13][var15 - -1] = var30;
            }
            if (var13 > 0 && ~var15 < -1 && class74.field1372[var13 + -1][var15 + -1] == 0 && ~(var18[var13 + -1][var15 + -1] & 19661070) == -1 && ~(19661064 & var18[var13 + -1][var15]) == -1 && (19661058 & var18[var13][var15 - 1]) == 0) {
                class163.field2878[var32] = var13 - 1;
                class101.field1759[var32] = var15 + -1;
                var32 = var32 + 1 & 4095;
                class74.field1372[var13 - 1][var15 + -1] = 3;
                class124.field2202[var13 + -1][var15 + -1] = var30;
            }
            if (~var13 > -104 && ~var15 < -1 && ~class74.field1372[var13 + 1][var15 + -1] == -1 && ~(19661187 & var18[var13 + 1][var15 + -1]) == -1 && (19661184 & var18[var13 - -1][var15]) == 0 && (var18[var13][var15 + -1] & 19661058) == 0) {
                class163.field2878[var32] = var13 - -1;
                class101.field1759[var32] = var15 + -1;
                class74.field1372[var13 + 1][var15 - 1] = 9;
                var32 = 4095 & var32 - -1;
                class124.field2202[var13 + 1][var15 + -1] = var30;
            }
            if (var13 > 0 && ~var15 > -104 && ~class74.field1372[var13 + -1][var15 + 1] == -1 && (var18[var13 + -1][var15 + 1] & 19661112) == 0 && ~(var18[var13 - 1][var15] & 19661064) == -1 && ~(var18[var13][var15 + 1] & 19661088) == -1) {
                class163.field2878[var32] = var13 + -1;
                class101.field1759[var32] = var15 + 1;
                class74.field1372[var13 + -1][var15 + 1] = 6;
                class124.field2202[var13 + -1][var15 + 1] = var30;
                var32 = var32 - -1 & 4095;
            }
            if (~var13 > -104 && ~var15 > -104 && class74.field1372[var13 + 1][var15 + 1] == 0 && ~(var18[var13 + 1][var15 + 1] & 19661280) == -1 && ~(19661184 & var18[var13 - -1][var15]) == -1 && (var18[var13][var15 + 1] & 19661088) == 0) {
                class163.field2878[var32] = var13 + 1;
                class101.field1759[var32] = var15 + 1;
                class74.field1372[var13 + 1][var15 + 1] = 12;
                class124.field2202[var13 + 1][var15 - -1] = var30;
                var32 = var32 - -1 & 4095;
            }
        }
        class147.field2587 = 0;
        if (!var17) {
            if (!arg0) {
                return false;
            }
            int var19 = 100;
            int var20 = 1000;
            byte var21 = 10;
            for (int var22 = arg5 - var21; ~var22 >= ~(arg5 + var21); ++var22) {
                for (int var23 = -var21 + arg11; ~var23 >= ~(arg11 + var21); ++var23) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class124.field2202[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (~var22 <= ~arg5) {
                            if (~(arg5 - -arg6 + -1) > ~var22) {
                                var25 = -arg5 - arg6 + 1 + var22;
                            }
                        } else {
                            var25 = -var22 + arg5;
                        }
                        if (var23 < arg11) {
                            var24 = -var23 + arg11;
                        } else if (var23 > arg11 + -1 - -arg8) {
                            var24 = -arg8 + -arg11 + 1 + var23;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (~var26 > ~var20 || var20 == var26 && ~class124.field2202[var22][var23] > ~var19) {
                            var19 = class124.field2202[var22][var23];
                            var20 = var26;
                            var15 = var23;
                            var13 = var22;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (~arg7 == ~var13 && arg2 == var15) {
                return false;
            }
            class147.field2587 = 1;
        }
        byte var27 = 0;
        class163.field2878[var27] = var13;
        int var33 = var27 + 1;
        class101.field1759[var27] = var15;
        int var28;
        int var29 = var28 = class74.field1372[var13][var15];
        while (arg7 != var13 || arg2 != var15) {
            if (var28 != var29) {
                var28 = var29;
                class163.field2878[var33] = var13;
                class101.field1759[var33++] = var15;
            }
            if (~(1 & var29) != -1) {
                ++var15;
            } else if ((var29 & 4) != 0) {
                --var15;
            }
            if (~(var29 & 2) != -1) {
                ++var13;
            } else if (~(var29 & 8) != -1) {
                --var13;
            }
            var29 = class74.field1372[var13][var15];
        }
        if (var33 > 0) {
            class41.method232((byte) 63, var33, arg3);
            return true;
        } else if (arg3 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
