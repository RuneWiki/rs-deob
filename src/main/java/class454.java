import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class454 extends class118 {

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
    private int field6743 = -1;

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "I")
    public static int field6750 = 0;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "S")
    public static short field6745 = 32767;

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "Lwl;")
    public static class452 field6748 = new class452(89, 5);

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "I")
    public static int field6741;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "I")
    private int field6751;

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
    private int field6753;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "[I")
    private int[] field6740;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        if (arg1 != 1) {
            this.method706(117);
        }
        ++field6746;
        if (~arg0 == -1) {
            this.field6743 = arg2.method2323(arg1 + -64);
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
    public class454() {
        super(0, false);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V")
    public static final void method2823(int arg0, int arg1) {
        class446.method2756(-25456);
        ++field6741;
        int var2 = class98.method632(2048, arg1).field1459;
        if (var2 != 0) {
            int var3 = class287.field4375[arg1];
            if (var2 == 5) {
                class412.field6129 = var3;
            }
            if (arg0 == var2) {
                class367.field5379 = var3;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ldr;IIIII[[[BIIIIII)V")
    public static final void method2824(class261 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[][][] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field6742;
        if (arg1 != 0 && arg7 != 0) {
            if (arg9 <= 71) {
                method2826(46);
            }
            if (~arg1 == -10) {
                arg11 = arg11 + 1 & 3;
                arg1 = 1;
            }
            if (~arg1 == -11) {
                arg1 = 1;
                arg11 = 3 & arg11 + 3;
            }
            if (~arg1 == -12) {
                arg1 = 8;
                arg11 = arg11 - -3 & 3;
            }
            arg0.method352(arg12, arg5, arg4, arg3, arg8, arg2, arg6[arg1 - 1][arg11], arg7, arg10);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method2825(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class251.method1531(arg3, arg0);
        ++field6747;
        int var7 = 0;
        int var8 = -arg4 + arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (~class189.field2831 >= ~arg1 && ~class204.field3060 <= ~arg1) {
            int[] var15 = class292.field4448[arg1];
            int var16 = class198.method1192(class192.field2917, class39.field497, -arg3 + arg2, -3);
            int var17 = class198.method1192(class192.field2917, class39.field497, arg2 + arg3, -3);
            int var18 = class198.method1192(class192.field2917, class39.field497, -var8 + arg2, -3);
            int var19 = class198.method1192(class192.field2917, class39.field497, arg2 + var8, -3);
            class379.method2285(127, var15, var18, arg6, var16);
            class379.method2285(126, var15, var19, arg5, var18);
            class379.method2285(126, var15, var17, arg6, var19);
        }
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (~var12 <= -1 && var11 >= 1) {
                --var11;
                class207.field3095[var11] = var7;
                var12 -= var11 << 1;
            }
            ++var7;
            if (var10 >= 0) {
                --var9;
                var10 -= var9 << 1;
                int var20 = -var9 + arg1;
                int var21 = arg1 + var9;
                if (~var21 <= ~class189.field2831 && class204.field3060 >= var20) {
                    if (~var8 >= ~var9) {
                        int var22 = class198.method1192(class192.field2917, class39.field497, arg2 - -var7, -3);
                        int var23 = class198.method1192(class192.field2917, class39.field497, arg2 - var7, -3);
                        if (class204.field3060 >= var21) {
                            class379.method2285(126, class292.field4448[var21], var22, arg6, var23);
                        }
                        if (~class189.field2831 >= ~var20) {
                            class379.method2285(126, class292.field4448[var20], var22, arg6, var23);
                        }
                    } else {
                        int var24 = class207.field3095[var9];
                        int var25 = class198.method1192(class192.field2917, class39.field497, arg2 - -var7, -3);
                        int var26 = class198.method1192(class192.field2917, class39.field497, -var7 + arg2, -3);
                        int var27 = class198.method1192(class192.field2917, class39.field497, arg2 + var24, -3);
                        int var28 = class198.method1192(class192.field2917, class39.field497, -var24 + arg2, -3);
                        if (~var21 >= ~class204.field3060) {
                            int[] var29 = class292.field4448[var21];
                            class379.method2285(126, var29, var28, arg6, var26);
                            class379.method2285(125, var29, var27, arg5, var28);
                            class379.method2285(127, var29, var25, arg6, var27);
                        }
                        if (~class189.field2831 >= ~var20) {
                            int[] var30 = class292.field4448[var20];
                            class379.method2285(125, var30, var28, arg6, var26);
                            class379.method2285(126, var30, var27, arg5, var28);
                            class379.method2285(126, var30, var25, arg6, var27);
                        }
                    }
                }
            }
            int var31 = -var7 + arg1;
            int var32 = arg1 + var7;
            if (class189.field2831 <= var32 && var31 <= class204.field3060) {
                int var33 = arg2 + var9;
                int var34 = arg2 - var9;
                if (class192.field2917 <= var33 && ~var34 >= ~class39.field497) {
                    int var35 = class198.method1192(class192.field2917, class39.field497, var33, -3);
                    int var36 = class198.method1192(class192.field2917, class39.field497, var34, -3);
                    if (var8 > var7) {
                        int var37 = ~var7 < ~var11 ? class207.field3095[var7] : var11;
                        int var38 = class198.method1192(class192.field2917, class39.field497, arg2 + var37, -3);
                        int var39 = class198.method1192(class192.field2917, class39.field497, -var37 + arg2, -3);
                        if (~class204.field3060 <= ~var32) {
                            int[] var40 = class292.field4448[var32];
                            class379.method2285(125, var40, var39, arg6, var36);
                            class379.method2285(125, var40, var38, arg5, var39);
                            class379.method2285(127, var40, var35, arg6, var38);
                        }
                        if (~class189.field2831 >= ~var31) {
                            int[] var41 = class292.field4448[var31];
                            class379.method2285(127, var41, var39, arg6, var36);
                            class379.method2285(124, var41, var38, arg5, var39);
                            class379.method2285(124, var41, var35, arg6, var38);
                        }
                    } else {
                        if (class204.field3060 >= var32) {
                            class379.method2285(126, class292.field4448[var32], var35, arg6, var36);
                        }
                        if (~class189.field2831 >= ~var31) {
                            class379.method2285(124, class292.field4448[var31], var35, arg6, var36);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)I")
    public final int method707(boolean arg0) {
        ++field6749;
        if (arg0) {
            field6745 = -109;
        }
        return this.field6743;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
    public final void method702(int arg0, int arg1, int arg2) {
        super.method702(arg0, 103, arg2);
        if (arg1 <= 49) {
            field6750 = -115;
        }
        ++field6744;
        if (this.field6743 >= 0 && class185.field2791 != null) {
            int var4 = class185.field2791.method180(this.field6743, 37).field2126 ? 64 : 128;
            this.field6740 = class185.field2791.method185(var4, false, var4, 1.0F, 17486, this.field6743);
            this.field6753 = var4;
            this.field6751 = var4;
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
    public final void method706(int arg0) {
        ++field6739;
        super.method706(arg0);
        this.field6740 = null;
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V")
    public static void method2826(int arg0) {
        field6748 = null;
        if (arg0 != -987276671) {
            method2826(80);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method195(boolean arg0, int arg1) {
        if (arg0) {
            return null;
        } else {
            ++field6752;
            int[][] var3 = super.field1549.method2013(arg1, true);
            if (super.field1549.field4903) {
                int var4 = this.field6753 * (~class289.field4403 == ~this.field6751 ? arg1 : this.field6751 * arg1 / class289.field4403);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                if (class440.field6474 == this.field6753) {
                    for (int var8 = 0; ~class440.field6474 < ~var8; ++var8) {
                        int var9 = this.field6740[var4++];
                        var7[var8] = class406.method2552(4080, var9 << 4);
                        var6[var8] = class406.method2552(var9 >> 4, 4080);
                        var5[var8] = class406.method2552(16711680, var9) >> 12;
                    }
                } else {
                    for (int var10 = 0; class440.field6474 > var10; ++var10) {
                        int var11 = this.field6753 * var10 / class440.field6474;
                        int var12 = this.field6740[var4 - -var11];
                        var7[var10] = class406.method2552(4080, var12 << 4);
                        var6[var10] = class406.method2552(4080, var12 >> 4);
                        var5[var10] = class406.method2552(var12, 16711680) >> 12;
                    }
                }
            }
            return var3;
        }
    }
}
