import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class6 extends class242 {

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
    private int field121 = 1;

    @OriginalMember(owner = "client!wj", name = "U", descriptor = "I")
    private int field124 = 1;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
    public static int field122 = 0;

    @OriginalMember(owner = "client!wj", name = "ab", descriptor = "I")
    public static int field130 = 0;

    @OriginalMember(owner = "client!wj", name = "bb", descriptor = "[I")
    public static int[] field131 = new int[5];

    @OriginalMember(owner = "client!wj", name = "Z", descriptor = "Lp;")
    public static class280 field129 = class18.method140((byte) -123, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!wj", name = "V", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!wj", name = "X", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!wj", name = "Y", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!wj", name = "cb", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!wj", name = "db", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!wj", name = "eb", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!wj", name = "W", descriptor = "Lqg;")
    public static class103 field126;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILp;)Lqg;")
    public static final class103 method70(int arg0, class280 arg1) {
        ++field123;
        if (arg0 != 0) {
            field130 = 85;
        }
        for (class103 var2 = (class103) class104.field1725.method651(12916); var2 != null; var2 = (class103) class104.field1725.method643(11066)) {
            if (var2.field1716.method1888(arg1, arg0 ^ 25648)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method71(boolean arg0, int arg1) {
        if (!arg0) {
            field130 = 48;
        }
        ++field127;
        int[][] var3 = super.field4257.method917(arg1, 1);
        if (super.field4257.field2357) {
            int var4 = this.field124 - -this.field124 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field121 + 1 + this.field121;
            int[][][] var7 = new int[var4][][];
            int var8 = 65536 / var6;
            for (int var9 = arg1 - this.field124; var9 <= this.field124 + arg1; ++var9) {
                int[][] var19 = this.method1648(26484, class29.field540 & var9, 0);
                int[][] var20 = new int[3][class264.field4654];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[1];
                int[] var25 = var19[2];
                int[] var26 = var19[0];
                for (int var27 = -this.field121; ~var27 >= ~this.field121; ++var27) {
                    int var37 = class230.field3968 & var27;
                    var23 += var25[var37];
                    var21 += var26[var37];
                    var22 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (class264.field4654 > var31) {
                    var28[var31] = var8 * var21 >> 16;
                    var29[var31] = var8 * var22 >> 16;
                    var30[var31] = var8 * var23 >> 16;
                    int var32 = class230.field3968 & var31 - this.field121;
                    int var33 = var22 - var24[var32];
                    ++var31;
                    int var34 = var23 - var25[var32];
                    int var35 = var21 - var26[var32];
                    int var36 = class230.field3968 & this.field121 + var31;
                    var23 = var25[var36] + var34;
                    var21 = var26[var36] + var35;
                    var22 = var24[var36] + var33;
                }
                var7[this.field124 + var9 + -arg1] = var20;
            }
            int[] var10 = var3[1];
            int[] var11 = var3[0];
            int[] var12 = var3[2];
            for (int var13 = 0; ~var13 > ~class264.field4654; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
                    int[][] var18 = var7[var17];
                    var14 += var18[0][var13];
                    var16 += var18[2][var13];
                    var15 += var18[1][var13];
                }
                var11[var13] = var5 * var14 >> 16;
                var10[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        int var3 = 119 % ((73 - arg1) / 41);
        int[] var4 = super.field4251.method1417((byte) 83, arg0);
        ++field134;
        if (super.field4251.field3655) {
            int var5 = this.field124 - (-this.field124 + -1);
            int var6 = 65536 / var5;
            int var7 = this.field121 + this.field121 - -1;
            int var8 = 65536 / var7;
            int[][] var9 = new int[var5][];
            for (int var10 = arg0 - this.field124; ~var10 >= ~(this.field124 + arg0); ++var10) {
                int[] var14 = this.method1647(0, class29.field540 & var10, 48);
                int var15 = 0;
                for (int var16 = -this.field121; ~this.field121 <= ~var16; ++var16) {
                    var15 += var14[var16 & class230.field3968];
                }
                int[] var17 = new int[class264.field4654];
                int var18 = 0;
                while (~var18 > ~class264.field4654) {
                    var17[var18] = var8 * var15 >> 16;
                    int var19 = var15 - var14[class230.field3968 & -this.field121 + var18];
                    ++var18;
                    var15 = var14[var18 - -this.field121 & class230.field3968] + var19;
                }
                var9[var10 - arg0 + this.field124] = var17;
            }
            for (int var11 = 0; ~class264.field4654 < ~var11; ++var11) {
                int var12 = 0;
                for (int var13 = 0; ~var13 > ~var5; ++var13) {
                    var12 += var9[var13][var11];
                }
                var4[var11] = var6 * var12 >> 16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIZIIIIILph;Lik;ZIII)Lik;")
    public static final class256 method72(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class78 arg8, class256 arg9, boolean arg10, int arg11, int arg12, int arg13) {
        ++field133;
        long var14 = ((long) arg11 << 48) + ((long) ((arg3 << 24) + (arg0 - -(arg1 << 16))) - -((long) arg5 << 32));
        class256 var16 = (class256) class188.field3297.method1480((byte) 50, var14);
        if (var16 == null) {
            byte var17;
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 == 3) {
                        var17 = 15;
                    } else if (~arg0 == -5) {
                        var17 = 18;
                    } else {
                        var17 = 21;
                    }
                } else {
                    var17 = 12;
                }
            } else {
                var17 = 9;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            class114 var20 = new class114(1 - -(var17 * var18), var17 * var18 * 2 - var17, 0);
            int var21 = var20.method832(0, 0, 0);
            int[][] var22 = new int[var18][var17];
            for (int var23 = 0; ~var18 < ~var23; ++var23) {
                int var30 = var19[var23];
                int var31 = var19[var23];
                for (int var32 = 0; var32 < var17; ++var32) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = class146.field2545[var33] * var31 + arg12 >> 16;
                    int var35 = class146.field2541[var33] * var30 + arg7 >> 16;
                    var22[var23][var32] = var20.method832(var34, 0, var35);
                }
            }
            for (int var24 = 0; ~var18 < ~var24; ++var24) {
                int var25 = (var24 * 256 + 128) / var18;
                int var26 = -var25 + 256;
                short var27 = (short) ((16515072 & (arg5 & 64512) * var26 + (64512 & arg11) * var25) + ((896 & arg5) * var26 + (arg11 & 896) * var25 & 229376) + (32512 & (arg5 & 127) * var26 + (127 & arg11) * var25) >> 8);
                byte var28 = (byte) (arg1 * var26 + arg3 * var25 >> 8);
                for (int var29 = 0; ~var17 < ~var29; ++var29) {
                    if (~var24 == -1) {
                        var20.method830(var21, var22[0][(var29 + 1) % var17], var22[0][var29], (byte) 1, var27, var28);
                    } else {
                        var20.method830(var22[var24 + -1][var29], var22[var24 - 1][(var29 + 1) % var17], var22[var24][(var29 + 1) % var17], (byte) 1, var27, var28);
                        var20.method830(var22[var24 + -1][var29], var22[var24][(var29 - -1) % var17], var22[var24][var29], (byte) 1, var27, var28);
                    }
                }
            }
            var16 = var20.method806(64, 768, -50, -10, -50);
            class188.field3297.method1483((byte) -125, var14, var16);
        }
        int var36 = arg0 * 64 + -1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = var36;
        int var40 = arg9.method1598();
        int var41 = -var36;
        class149 var42 = null;
        if (arg2) {
            if (~arg6 < -1665 || arg6 < 384) {
                var41 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var37 -= 128;
            }
            if (~arg6 < -1153 && arg6 < 1920) {
                var39 = var36 + 128;
            }
            if (arg6 > 640 && ~arg6 > -1409) {
                var38 = var36 + 128;
            }
        }
        int var43 = arg9.method1614();
        int var44 = arg9.method1626();
        int var45 = arg9.method1596();
        if (var44 < var41) {
            var44 = var41;
        }
        if (~var38 > ~var45) {
            var45 = var38;
        }
        if (arg8 != null) {
            int var46 = arg8.field1275[arg4];
            var42 = class157.method1113(-61, var46 >> 16);
            arg4 = var46 & 65535;
        }
        if (~var40 > ~var37) {
            var40 = var37;
        }
        if (~var43 < ~var39) {
            var43 = var39;
        }
        if (!arg10) {
            method72(-48, -62, true, 6, 113, -102, 28, -32, (class78) null, (class256) null, false, 47, -106, -54);
        }
        class256 var47;
        if (var42 != null) {
            var47 = var16.method1623(!var42.method1032(arg4, (byte) 1), true);
            var47.method1612((-var40 + var43) / 2, 128, (var45 - var44) / 2);
            var47.method1600((var40 - -var43) / 2, 0, (var44 - -var45) / 2);
            var47.method1618(var42, arg4);
        } else {
            var47 = var16.method1623(true, true);
            var47.method1612((-var40 + var43) / 2, 128, (-var44 + var45) / 2);
            var47.method1600((var40 + var43) / 2, 0, (var44 + var45) / 2);
        }
        if (arg6 != 0) {
            var47.method1619(arg6);
        }
        class239 var48 = (class239) var47;
        if (~class158.method1123(class231.field4013, arg12 + var40, -6230, arg7 - -var44) != ~arg13 || ~class158.method1123(class231.field4013, arg12 - -var43, -6230, arg7 + var45) != ~arg13) {
            for (int var49 = 0; ~var49 > ~var48.field4157; ++var49) {
                var48.field4156[var49] += class158.method1123(class231.field4013, var48.field4161[var49] + arg12, -6230, var48.field4144[var49] + arg7) - arg13;
            }
            var48.field4135 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(Z)V")
    public static void method73(boolean arg0) {
        field131 = null;
        field129 = null;
        if (arg0) {
            field126 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
    public class6() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)Lp;")
    public static final class280 method74(int arg0, int arg1) {
        ++field132;
        if (~arg0 < -1 && arg0 <= 255) {
            class280 var2 = new class280();
            var2.field4908 = 1;
            if (arg1 < 100) {
                method73(true);
            }
            var2.field4907 = new byte[1];
            var2.field4907[0] = (byte) arg0;
            return var2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field4248 = arg2.method189((byte) -103) == 1;
                }
            } else {
                this.field124 = arg2.method189((byte) -103);
            }
        } else {
            this.field121 = arg2.method189((byte) -103);
        }
        if (arg0 > -119) {
            this.field121 = 41;
        }
        ++field128;
    }
}
