import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class214 extends class115 {

    @OriginalMember(owner = "client!dk", name = "Y", descriptor = "I")
    private int field3705 = 0;

    @OriginalMember(owner = "client!dk", name = "X", descriptor = "I")
    private int field3704 = 0;

    @OriginalMember(owner = "client!dk", name = "hb", descriptor = "I")
    private int field3714 = 0;

    @OriginalMember(owner = "client!dk", name = "W", descriptor = "I")
    public static int field3703 = 0;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "Lqe;")
    public static class168 field3698 = class66.method448("unzap", 95);

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "I")
    private int field3697;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "I")
    private int field3699;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "I")
    private int field3700;

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!dk", name = "V", descriptor = "I")
    private int field3702;

    @OriginalMember(owner = "client!dk", name = "Z", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!dk", name = "ab", descriptor = "I")
    private int field3707;

    @OriginalMember(owner = "client!dk", name = "bb", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!dk", name = "db", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!dk", name = "eb", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!dk", name = "fb", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!dk", name = "gb", descriptor = "I")
    private int field3713;

    @OriginalMember(owner = "client!dk", name = "cb", descriptor = "Lrd;")
    public static class207 field3709;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(Z)V")
    public static void method1379(boolean arg0) {
        field3709 = null;
        field3698 = null;
        if (arg0) {
            method1383((class256) null, (byte) -48, (class256) null, (class256) null);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        ++field3710;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field3705 = (arg1.method750(arg0 + -59) << 12) / 100;
                }
            } else {
                this.field3714 = (arg1.method750(arg0 ^ -47) << 12) / 100;
            }
        } else {
            this.field3704 = arg1.method740(arg0 ^ 16711787);
        }
        if (arg0 != 107) {
            this.method3((byte) -58, (class112) null, -28);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIZI)V")
    private final void method1380(int arg0, int arg1, boolean arg2, int arg3) {
        ++field3706;
        int var5 = arg0 > 2048 ? arg0 - -arg1 - (arg0 * arg1 >> 12) : (arg1 + 4096) * arg0 >> 12;
        if (arg2) {
            this.method1(73, -62);
        }
        if (var5 > 0) {
            int var6 = arg3 * 6;
            int var7 = -var5 + arg0 + arg0;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var11 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var11 * var12 >> 12;
            int var14 = -var13 + var5;
            int var15 = var7 - -var13;
            if (var9 == 0) {
                this.field3699 = var5;
                this.field3700 = var7;
                this.field3702 = var15;
                return;
            }
            if (~var9 == -2) {
                this.field3699 = var14;
                this.field3702 = var5;
                this.field3700 = var7;
                return;
            }
            if (var9 == 2) {
                this.field3700 = var15;
                this.field3699 = var7;
                this.field3702 = var5;
                return;
            }
            if (~var9 == -4) {
                this.field3700 = var5;
                this.field3699 = var7;
                this.field3702 = var14;
                return;
            }
            if (~var9 == -5) {
                this.field3699 = var15;
                this.field3702 = var7;
                this.field3700 = var5;
                return;
            }
            if (~var9 == -6) {
                this.field3699 = var5;
                this.field3702 = var7;
                this.field3700 = var14;
                return;
            }
        } else {
            this.field3699 = this.field3702 = this.field3700 = arg0;
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
    public class214() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIII)V")
    private final void method1381(int arg0, int arg1, int arg2, int arg3) {
        ++field3708;
        int var5 = ~arg3 < ~arg1 ? arg3 : arg1;
        int var6 = ~arg3 <= ~arg1 ? arg1 : arg3;
        int var7 = var5 < arg0 ? arg0 : var5;
        int var8 = var6 > arg0 ? arg0 : var6;
        int var9 = -var8 + var7;
        this.field3707 = (var7 + var8) / 2;
        if (~var9 < -1) {
            int var10 = (-arg3 + var7 << 12) / var9;
            int var11 = (-arg0 + var7 << 12) / var9;
            int var12 = (-arg1 + var7 << 12) / var9;
            if (~arg3 != ~var7) {
                if (arg1 == var7) {
                    this.field3697 = ~arg0 != ~var8 ? -var11 + 12288 : var10 + 4096;
                } else {
                    this.field3697 = ~arg3 != ~var8 ? -var10 + 20480 : var12 + 12288;
                }
            } else {
                this.field3697 = ~arg1 == ~var8 ? var11 + 20480 : -var12 + 4096;
            }
            this.field3697 /= 6;
        } else {
            this.field3697 = 0;
        }
        if (arg2 != -29191) {
            this.method3((byte) -32, (class112) null, 119);
        }
        if (~this.field3707 < -1 && ~this.field3707 > -4097) {
            this.field3713 = (var9 << 12) / (this.field3707 > 2048 ? -(this.field3707 * 2) + 8192 : this.field3707 * 2);
        } else {
            this.field3713 = 0;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIIIIIZII)Z")
    public static final boolean method1382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        ++field3711;
        for (int var12 = 0; ~var12 > -105; ++var12) {
            for (int var31 = 0; var31 < 104; ++var31) {
                class58.field804[var12][var31] = 0;
                class200.field3456[var12][var31] = 99999999;
            }
        }
        class58.field804[arg7][arg11] = 99;
        int var13 = arg7;
        byte var14 = 0;
        class200.field3456[arg7][arg11] = 0;
        class126.field2102[var14] = arg7;
        int var15 = arg11;
        int var32 = var14 + 1;
        class166.field2825[var14] = arg11;
        int var16 = 0;
        boolean var17 = false;
        int[][] var18 = class169.field2951[class196.field3401].field731;
        while (~var32 != ~var16) {
            var15 = class166.field2825[var16];
            var13 = class126.field2102[var16];
            var16 = var16 + 1 & 4095;
            if (arg4 == var13 && arg10 == var15) {
                var17 = true;
                break;
            }
            if (~arg2 != -1) {
                if ((arg2 < 5 || ~arg2 == -11) && class169.field2951[class196.field3401].method363(var13, arg10, arg2 + -1, 112, var15, arg6, arg4, 1)) {
                    var17 = true;
                    break;
                }
                if (~arg2 > -11 && class169.field2951[class196.field3401].method370(var13, 1, arg4, (byte) 100, arg10, arg6, arg2 + -1, var15)) {
                    var17 = true;
                    break;
                }
            }
            if (~arg5 != -1 && ~arg1 != -1 && class169.field2951[class196.field3401].method377(arg1, var15, arg10, arg5, var13, arg4, arg3, 1, 47)) {
                var17 = true;
                break;
            }
            int var30 = class200.field3456[var13][var15] + 1;
            if (var13 > 0 && class58.field804[var13 - 1][var15] == 0 && ~(var18[var13 + -1][var15] & 19661064) == -1) {
                class126.field2102[var32] = var13 - 1;
                class166.field2825[var32] = var15;
                var32 = var32 + 1 & 4095;
                class58.field804[var13 + -1][var15] = 2;
                class200.field3456[var13 + -1][var15] = var30;
            }
            if (var13 < 103 && class58.field804[var13 + 1][var15] == 0 && (19661184 & var18[var13 + 1][var15]) == 0) {
                class126.field2102[var32] = var13 + 1;
                class166.field2825[var32] = var15;
                class58.field804[var13 - -1][var15] = 8;
                class200.field3456[var13 + 1][var15] = var30;
                var32 = 4095 & var32 - -1;
            }
            if (var15 > 0 && ~class58.field804[var13][var15 - 1] == -1 && (var18[var13][var15 + -1] & 19661058) == 0) {
                class126.field2102[var32] = var13;
                class166.field2825[var32] = var15 + -1;
                var32 = var32 + 1 & 4095;
                class58.field804[var13][var15 + -1] = 1;
                class200.field3456[var13][var15 + -1] = var30;
            }
            if (var15 < 103 && class58.field804[var13][var15 + 1] == 0 && ~(19661088 & var18[var13][var15 + 1]) == -1) {
                class126.field2102[var32] = var13;
                class166.field2825[var32] = var15 - -1;
                class58.field804[var13][var15 + 1] = 4;
                var32 = 4095 & var32 - -1;
                class200.field3456[var13][var15 + 1] = var30;
            }
            if (var13 > 0 && ~var15 < -1 && class58.field804[var13 + -1][var15 + -1] == 0 && (19661070 & var18[var13 + -1][var15 + -1]) == 0 && ~(var18[var13 + -1][var15] & 19661064) == -1 && ~(var18[var13][var15 + -1] & 19661058) == -1) {
                class126.field2102[var32] = var13 + -1;
                class166.field2825[var32] = var15 + -1;
                class58.field804[var13 + -1][var15 + -1] = 3;
                var32 = var32 + 1 & 4095;
                class200.field3456[var13 + -1][var15 + -1] = var30;
            }
            if (var13 < 103 && var15 > 0 && ~class58.field804[var13 + 1][var15 + -1] == -1 && ~(19661187 & var18[var13 - -1][var15 - 1]) == -1 && ~(19661184 & var18[var13 + 1][var15]) == -1 && (19661058 & var18[var13][var15 + -1]) == 0) {
                class126.field2102[var32] = var13 + 1;
                class166.field2825[var32] = var15 - 1;
                var32 = 4095 & var32 - -1;
                class58.field804[var13 + 1][var15 - 1] = 9;
                class200.field3456[var13 + 1][var15 - 1] = var30;
            }
            if (var13 > 0 && ~var15 > -104 && class58.field804[var13 + -1][var15 + 1] == 0 && (var18[var13 - 1][var15 + 1] & 19661112) == 0 && (19661064 & var18[var13 + -1][var15]) == 0 && ~(19661088 & var18[var13][var15 + 1]) == -1) {
                class126.field2102[var32] = var13 + -1;
                class166.field2825[var32] = var15 + 1;
                class58.field804[var13 + -1][var15 - -1] = 6;
                class200.field3456[var13 + -1][var15 + 1] = var30;
                var32 = 4095 & var32 + 1;
            }
            if (~var13 > -104 && ~var15 > -104 && class58.field804[var13 - -1][var15 + 1] == 0 && (var18[var13 + 1][var15 + 1] & 19661280) == 0 && (var18[var13 + 1][var15] & 19661184) == 0 && ~(var18[var13][var15 - -1] & 19661088) == -1) {
                class126.field2102[var32] = var13 - -1;
                class166.field2825[var32] = var15 - -1;
                class58.field804[var13 + 1][var15 - -1] = 12;
                var32 = var32 + 1 & 4095;
                class200.field3456[var13 + 1][var15 + 1] = var30;
            }
        }
        class187.field3286 = 0;
        if (!var17) {
            if (!arg9) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = -var21 + arg4; ~var22 >= ~(arg4 + var21); ++var22) {
                for (int var23 = arg10 - var21; arg10 + var21 >= var23; ++var23) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class200.field3456[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (arg10 > var23) {
                            var25 = -var23 + arg10;
                        } else if (~(arg1 + arg10 + -1) > ~var23) {
                            var25 = 1 - (arg10 - -arg1) + var23;
                        }
                        if (~var22 > ~arg4) {
                            var24 = -var22 + arg4;
                        } else if (var22 > arg4 - 1 + arg5) {
                            var24 = 1 - arg4 - (arg5 - var22);
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (~var26 > ~var19 || var19 == var26 && var20 > class200.field3456[var22][var23]) {
                            var13 = var22;
                            var15 = var23;
                            var19 = var26;
                            var20 = class200.field3456[var22][var23];
                        }
                    }
                }
            }
            if (~var19 == -1001) {
                return false;
            }
            if (arg7 == var13 && ~arg11 == ~var15) {
                return false;
            }
            class187.field3286 = 1;
        }
        byte var27 = 0;
        class126.field2102[var27] = var13;
        int var33 = var27 + 1;
        class166.field2825[var27] = var15;
        if (arg8 > -14) {
            method1382(3, -43, -83, -83, -35, -26, -33, -126, -10, true, -96, 44);
        }
        int var28;
        int var29 = var28 = class58.field804[var13][var15];
        while (arg7 != var13 || arg11 != var15) {
            if (var28 != var29) {
                var28 = var29;
                class126.field2102[var33] = var13;
                class166.field2825[var33++] = var15;
            }
            if ((var29 & 2) == 0) {
                if (~(var29 & 8) != -1) {
                    --var13;
                }
            } else {
                ++var13;
            }
            if (~(1 & var29) == -1) {
                if (~(4 & var29) != -1) {
                    --var15;
                }
            } else {
                ++var15;
            }
            var29 = class58.field804[var13][var15];
        }
        if (var33 > 0) {
            class76.method514(arg0, (byte) -120, var33);
            return true;
        } else if (arg0 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        ++field3712;
        if (arg1 <= 11) {
            method1383((class256) null, (byte) 67, (class256) null, (class256) null);
        }
        int[][] var3 = super.field1882.method1242(arg0, -119);
        if (super.field1882.field3344) {
            int[][] var4 = this.method789(0, (byte) -124, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class130.field2297 < ~var11; ++var11) {
                this.method1381(var6[var11], var9[var11], -29191, var5[var11]);
                this.field3707 += this.field3705;
                if (~this.field3707 > -1) {
                    this.field3707 = 0;
                }
                this.field3713 += this.field3714;
                for (this.field3697 += this.field3704; this.field3697 < 0; this.field3697 += 4096) {
                }
                if (this.field3713 < 0) {
                    this.field3713 = 0;
                }
                if (this.field3713 > 4096) {
                    this.field3713 = 4096;
                }
                if (~this.field3707 < -4097) {
                    this.field3707 = 4096;
                }
                while (~this.field3697 < -4097) {
                    this.field3697 -= 4096;
                }
                this.method1380(this.field3707, this.field3713, false, this.field3697);
                var7[var11] = this.field3699;
                var8[var11] = this.field3702;
                var10[var11] = this.field3700;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Loe;BLoe;Loe;)V")
    public static final void method1383(class256 arg0, byte arg1, class256 arg2, class256 arg3) {
        class212.field3668 = arg0;
        if (arg1 != -10) {
            method1382(-64, -121, 64, 120, 58, -119, 54, 73, -28, true, 44, -49);
        }
        class158.field2728 = arg3;
        ++field3701;
        class145.field2531 = arg2;
    }
}
