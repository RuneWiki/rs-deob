import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class254 extends class325 {

    @OriginalMember(owner = "client!dt", name = "H", descriptor = "I")
    private int field3789 = 10;

    @OriginalMember(owner = "client!dt", name = "L", descriptor = "I")
    private int field3793 = 2048;

    @OriginalMember(owner = "client!dt", name = "N", descriptor = "I")
    private int field3795 = 0;

    @OriginalMember(owner = "client!dt", name = "F", descriptor = "Lmga;")
    public static class739 field3787 = new class739(54, 4);

    @OriginalMember(owner = "client!dt", name = "D", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!dt", name = "E", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!dt", name = "I", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!dt", name = "J", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!dt", name = "K", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!dt", name = "M", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!dt", name = "C", descriptor = "[I")
    private int[] field3784;

    @OriginalMember(owner = "client!dt", name = "G", descriptor = "[I")
    private int[] field3788;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Ljp;IB)V", line = 3)
    public final void method95(class376 arg0, int arg1, byte arg2) {
        if (arg2 >= -41) {
            this.method95((class376) null, 55, (byte) 24);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field3795 = arg0.method2398(-1372747256);
                }
            } else {
                this.field3793 = arg0.method2359(-1);
            }
        } else {
            this.field3789 = arg0.method2398(-1372747256);
        }
        ++field3786;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)I", line = 46)
    public static final int method1692(int arg0, int arg1) {
        ++field3785;
        if (arg1 != -1196763737) {
            field3787 = null;
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)V", line = 58)
    public final void method101(boolean arg0) {
        this.method1695(124);
        if (!arg0) {
            this.field3788 = null;
        }
        ++field3794;
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "()V", line = 69)
    public class254() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V", line = 74)
    public static void method1693(int arg0) {
        field3787 = null;
        if (arg0 != 638841633) {
            field3787 = null;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIBIIII)V", line = 89)
    public static final void method1694(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        class94.method750(arg2 ^ -13904, arg3);
        ++field3791;
        int var7 = 0;
        if (arg2 != 114) {
            method1693(-85);
        }
        int var8 = arg3 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (~class523.field7178 >= ~arg0 && arg0 <= class495.field6845) {
            int[] var14 = class785.field10808[arg0];
            int var15 = class573.method3204(-arg3 + arg6, class174.field2335, arg2 + 124914962, class751.field10402);
            int var16 = class573.method3204(arg3 + arg6, class174.field2335, 124915076, class751.field10402);
            int var17 = class573.method3204(arg6 - var8, class174.field2335, 124915076, class751.field10402);
            int var18 = class573.method3204(arg6 - -var8, class174.field2335, 124915076, class751.field10402);
            class138.method1069(var14, (byte) 116, var15, var17, arg4);
            class138.method1069(var14, (byte) 119, var17, var18, arg1);
            class138.method1069(var14, (byte) -118, var18, var16, arg4);
        }
        int var19 = -1;
        while (~var7 > ~var9) {
            var19 += 2;
            var13 += 2;
            var12 += var19;
            var10 += var13;
            if (~var12 <= -1 && var11 >= 1) {
                --var11;
                class566.field7573[var11] = var7;
                var12 -= var11 << 1;
            }
            ++var7;
            if (~var10 <= -1) {
                --var9;
                var10 -= var9 << 1;
                int var20 = -var9 + arg0;
                int var21 = arg0 + var9;
                if (~var21 <= ~class523.field7178 && ~var20 >= ~class495.field6845) {
                    if (var9 < var8) {
                        int var22 = class566.field7573[var9];
                        int var23 = class573.method3204(arg6 - -var7, class174.field2335, 124915076, class751.field10402);
                        int var24 = class573.method3204(-var7 + arg6, class174.field2335, arg2 + 124914962, class751.field10402);
                        int var25 = class573.method3204(arg6 + var22, class174.field2335, arg2 ^ 124915190, class751.field10402);
                        int var26 = class573.method3204(arg6 - var22, class174.field2335, 124915076, class751.field10402);
                        if (~class495.field6845 <= ~var21) {
                            int[] var27 = class785.field10808[var21];
                            class138.method1069(var27, (byte) -81, var24, var26, arg4);
                            class138.method1069(var27, (byte) -69, var26, var25, arg1);
                            class138.method1069(var27, (byte) 86, var25, var23, arg4);
                        }
                        if (class523.field7178 <= var20) {
                            int[] var28 = class785.field10808[var20];
                            class138.method1069(var28, (byte) -99, var24, var26, arg4);
                            class138.method1069(var28, (byte) 96, var26, var25, arg1);
                            class138.method1069(var28, (byte) 122, var25, var23, arg4);
                        }
                    } else {
                        int var29 = class573.method3204(arg6 - -var7, class174.field2335, 124915076, class751.field10402);
                        int var30 = class573.method3204(-var7 + arg6, class174.field2335, 124915076, class751.field10402);
                        if (~class495.field6845 <= ~var21) {
                            class138.method1069(class785.field10808[var21], (byte) 76, var30, var29, arg4);
                        }
                        if (var20 >= class523.field7178) {
                            class138.method1069(class785.field10808[var20], (byte) 104, var30, var29, arg4);
                        }
                    }
                }
            }
            int var31 = -var7 + arg0;
            int var32 = arg0 + var7;
            if (class523.field7178 <= var32 && var31 <= class495.field6845) {
                int var33 = arg6 - -var9;
                int var34 = -var9 + arg6;
                if (~class174.field2335 >= ~var33 && class751.field10402 >= var34) {
                    int var35 = class573.method3204(var33, class174.field2335, 124915076, class751.field10402);
                    int var36 = class573.method3204(var34, class174.field2335, 124915076, class751.field10402);
                    if (var7 >= var8) {
                        if (class495.field6845 >= var32) {
                            class138.method1069(class785.field10808[var32], (byte) 81, var36, var35, arg4);
                        }
                        if (var31 >= class523.field7178) {
                            class138.method1069(class785.field10808[var31], (byte) -53, var36, var35, arg4);
                        }
                    } else {
                        int var37 = var7 <= var11 ? var11 : class566.field7573[var7];
                        int var38 = class573.method3204(arg6 + var37, class174.field2335, arg2 + 124914962, class751.field10402);
                        int var39 = class573.method3204(-var37 + arg6, class174.field2335, arg2 + 124914962, class751.field10402);
                        if (var32 <= class495.field6845) {
                            int[] var40 = class785.field10808[var32];
                            class138.method1069(var40, (byte) -80, var36, var39, arg4);
                            class138.method1069(var40, (byte) -115, var39, var38, arg1);
                            class138.method1069(var40, (byte) -124, var38, var35, arg4);
                        }
                        if (var31 >= class523.field7178) {
                            int[] var41 = class785.field10808[var31];
                            class138.method1069(var41, (byte) 83, var36, var39, arg4);
                            class138.method1069(var41, (byte) -37, var39, var38, arg1);
                            class138.method1069(var41, (byte) 114, var38, var35, arg4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(BI)[I", line = 281)
    public final int[] method100(byte arg0, int arg1) {
        if (arg0 < 21) {
            return null;
        } else {
            ++field3790;
            int[] var3 = super.field4727.method2603(arg1, -13476);
            if (super.field4727.field6067) {
                int var4 = class621.field8370[arg1];
                if (~this.field3795 == -1) {
                    short var5 = 0;
                    for (int var6 = 0; ~var6 > ~this.field3789; ++var6) {
                        if (this.field3784[var6] <= var4 && var4 < this.field3784[var6 + 1]) {
                            if (var4 < this.field3788[var6]) {
                                var5 = 4096;
                            }
                            break;
                        }
                    }
                    class278.method1802(var3, 0, class261.field3874, var5);
                } else {
                    for (int var7 = 0; var7 < class261.field3874; ++var7) {
                        int var8 = 0;
                        short var9 = 0;
                        int var10 = class556.field7498[var7];
                        int var11 = this.field3795;
                        if (var11 != 1) {
                            if (var11 != 2) {
                                if (~var11 == -4) {
                                    var8 = (-var4 + var10 >> 1) + 2048;
                                }
                            } else {
                                var8 = (var10 - -var4 - 4096 >> 1) + 2048;
                            }
                        } else {
                            var8 = var10;
                        }
                        for (int var12 = 0; ~var12 > ~this.field3789; ++var12) {
                            if (var8 >= this.field3784[var12] && var8 < this.field3784[var12 - -1]) {
                                if (this.field3788[var12] > var8) {
                                    var9 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var7] = var9;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "(I)V", line = 403)
    private final void method1695(int arg0) {
        ++field3792;
        this.field3788 = new int[this.field3789 - -1];
        int var2 = 0;
        this.field3784 = new int[this.field3789 + 1];
        if (arg0 >= 109) {
            int var3 = 4096 / this.field3789;
            int var4 = this.field3793 * var3 >> 12;
            for (int var5 = 0; this.field3789 > var5; ++var5) {
                this.field3784[var5] = var2;
                this.field3788[var5] = var2 + var4;
                var2 += var3;
            }
            this.field3784[this.field3789] = 4096;
            this.field3788[this.field3789] = this.field3788[0] + 4096;
        }
    }
}
