import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class468 extends class184 {

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
    public int field6752 = 4;

    @OriginalMember(owner = "client!fj", name = "N", descriptor = "Z")
    public boolean field6759 = true;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
    public int field6757 = 0;

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "I")
    public int field6758 = 4;

    @OriginalMember(owner = "client!fj", name = "W", descriptor = "I")
    public int field6767 = 4;

    @OriginalMember(owner = "client!fj", name = "H", descriptor = "[B")
    private byte[] field6754 = new byte[512];

    @OriginalMember(owner = "client!fj", name = "V", descriptor = "I")
    public int field6766 = 1638;

    @OriginalMember(owner = "client!fj", name = "R", descriptor = "I")
    public static int field6762 = 0;

    @OriginalMember(owner = "client!fj", name = "U", descriptor = "Z")
    public static boolean field6765 = false;

    @OriginalMember(owner = "client!fj", name = "ab", descriptor = "[I")
    public static int[] field6771 = new int[6];

    @OriginalMember(owner = "client!fj", name = "Z", descriptor = "Lup;")
    public static class181 field6770 = new class181(2, 3);

    @OriginalMember(owner = "client!fj", name = "cb", descriptor = "F")
    public static float field6773;

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!fj", name = "O", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!fj", name = "Q", descriptor = "I")
    public static int field6761;

    @OriginalMember(owner = "client!fj", name = "S", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!fj", name = "T", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!fj", name = "X", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!fj", name = "Y", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!fj", name = "bb", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!fj", name = "D", descriptor = "[S")
    private short[] field6751;

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "[S")
    private short[] field6753;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)V")
    public static void method2821(int arg0) {
        if (arg0 != 0) {
            field6770 = null;
        }
        field6771 = null;
        field6770 = null;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)V")
    public final void method109(boolean arg0) {
        ++field6755;
        this.field6754 = class293.method1722(this.field6757, -15477);
        this.method2822((byte) -120);
        if (arg0) {
            this.method2824((byte) -94, 80, (int[]) null);
        }
        for (int var2 = this.field6767 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field6753[var2];
            if (var3 > 8) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field6767;
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V")
    private final void method2822(byte arg0) {
        if (arg0 <= -75) {
            ++field6761;
            if (~this.field6766 < -1) {
                this.field6751 = new short[this.field6767];
                this.field6753 = new short[this.field6767];
                for (int var2 = 0; this.field6767 > var2; ++var2) {
                    this.field6753[var2] = (short) ((int) (Math.pow((double) ((float) this.field6766 / 4096.0F), (double) var2) * 4096.0D));
                    this.field6751[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            } else if (this.field6753 != null && ~this.field6753.length == ~this.field6767) {
                this.field6751 = new short[this.field6767];
                for (int var3 = 0; var3 < this.field6767; ++var3) {
                    this.field6751[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BILfh;)V")
    public final void method7(byte arg0, int arg1, class463 arg2) {
        ++field6756;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field6758 = arg2.method2737(false);
                                }
                            } else {
                                this.field6752 = arg2.method2737(false);
                            }
                        } else {
                            this.field6757 = arg2.method2737(false);
                        }
                    } else {
                        this.field6752 = this.field6758 = arg2.method2737(false);
                    }
                } else {
                    this.field6766 = arg2.method2791(true);
                    if (~this.field6766 > -1) {
                        this.field6753 = new short[this.field6767];
                        for (int var5 = 0; var5 < this.field6767; ++var5) {
                            this.field6753[var5] = (short) arg2.method2791(true);
                        }
                    }
                }
            } else {
                this.field6767 = arg2.method2737(false);
            }
        } else {
            this.field6759 = ~arg2.method2737(false) == -2;
        }
        int var6 = 63 / ((-13 - arg0) / 51);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        if (arg1 != 578) {
            this.method2823(-47, 62, 124, 23, -118, 83, 62);
        }
        ++field6764;
        int[] var3 = super.field2409.method248(arg0, arg1 ^ 16776514);
        if (super.field2409.field436) {
            this.method2824((byte) 110, arg0, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    public class468() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIIII)I")
    private final int method2823(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6769;
        int var8 = arg6 >> 12;
        int var9 = var8 + 1;
        if (~var9 <= ~arg0) {
            var9 = 0;
        }
        int var10 = arg6 & 4095;
        int var11 = var8 & 255;
        int var12 = var9 & 255;
        int var13 = arg2 + -4096;
        int var14 = var10 + -4096;
        int var15 = class53.field707[var10];
        int var16 = 3 & this.field6754[var11 - -arg3];
        int var17;
        if (~var16 < -2) {
            var17 = var16 == 2 ? -arg2 + var10 : -arg2 + -var10;
        } else {
            var17 = ~var16 == -1 ? var10 - -arg2 : arg2 - var10;
        }
        int var18 = this.field6754[var12 - -arg3] & 3;
        if (arg1 < 76) {
            this.method7((byte) 86, -90, (class463) null);
        }
        int var19;
        if (~var18 >= -2) {
            var19 = var18 == 0 ? var14 - -arg2 : -var14 + arg2;
        } else {
            var19 = ~var18 != -3 ? -arg2 + -var14 : -arg2 + var14;
        }
        int var20 = 3 & this.field6754[arg5 + var11];
        int var21 = ((-var17 + var19) * var15 >> 12) + var17;
        int var22;
        if (~var20 < -2) {
            var22 = var20 != 2 ? -var10 + -var13 : -var13 + var10;
        } else {
            var22 = var20 != 0 ? -var10 + var13 : var10 - -var13;
        }
        int var23 = 3 & this.field6754[arg5 + var12];
        int var24;
        if (~var23 >= -2) {
            var24 = var23 == 0 ? var13 + var14 : var13 - var14;
        } else {
            var24 = var23 != 2 ? -var13 + -var14 : var14 - var13;
        }
        int var25 = ((-var22 + var24) * var15 >> 12) + var22;
        return ((-var21 + var25) * arg4 >> 12) + var21;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI[I)V")
    public final void method2824(byte arg0, int arg1, int[] arg2) {
        ++field6760;
        int var4 = class334.field4218[arg1] * this.field6758;
        if (arg0 <= 108) {
            this.field6757 = -96;
        }
        if (this.field6767 != 1) {
            short var5 = this.field6753[0];
            if (var5 > 8 || var5 < -8) {
                int var6 = this.field6751[0] << 12;
                int var7 = this.field6752 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = this.field6758 * var6 >> 12;
                int var10 = var8 >> 12;
                int var11 = var10 + 1;
                if (var11 >= var9) {
                    var11 = 0;
                }
                int var12 = var8 & 4095;
                int var13 = 255 & this.field6754[var11 & 255];
                int var14 = this.field6754[255 & var10] & 255;
                int var15 = class53.field707[var12];
                for (int var16 = 0; var16 < class245.field3167; ++var16) {
                    int var36 = class347.field4461[var16] * this.field6752;
                    int var37 = this.method2823(var7, 100, var12, var14, var15, var13, var6 * var36 >> 12);
                    arg2[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; ~this.field6767 < ~var17; ++var17) {
                short var18 = this.field6753[var17];
                if (~var18 < -9 || ~var18 > 7) {
                    int var19 = this.field6751[var17] << 12;
                    int var20 = this.field6752 * var19 >> 12;
                    int var21 = var4 * var19 >> 12;
                    int var22 = this.field6758 * var19 >> 12;
                    int var23 = var21 >> 12;
                    int var24 = var23 + 1;
                    int var25 = var21 & 4095;
                    if (var24 >= var22) {
                        var24 = 0;
                    }
                    int var26 = class53.field707[var25];
                    int var27 = this.field6754[255 & var23] & 255;
                    int var28 = this.field6754[var24 & 255] & 255;
                    if (this.field6759 && this.field6767 - 1 == var17) {
                        for (int var29 = 0; ~class245.field3167 < ~var29; ++var29) {
                            int var30 = class347.field4461[var29] * this.field6752;
                            int var31 = this.method2823(var20, 88, var25, var27, var26, var28, var19 * var30 >> 12);
                            int var32 = (var18 * var31 >> 12) + arg2[var29];
                            arg2[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; ~class245.field3167 < ~var33; ++var33) {
                            int var34 = class347.field4461[var33] * this.field6752;
                            int var35 = this.method2823(var20, 98, var25, var27, var26, var28, var19 * var34 >> 12);
                            arg2[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            int var38 = this.field6751[0] << 12;
            short var39 = this.field6753[0];
            int var40 = var4 * var38 >> 12;
            int var41 = this.field6752 * var38 >> 12;
            int var42 = this.field6758 * var38 >> 12;
            int var43 = var40 >> 12;
            int var44 = var43 + 1;
            if (var44 >= var42) {
                var44 = 0;
            }
            int var45 = var40 & 4095;
            int var46 = class53.field707[var45];
            int var47 = 255 & this.field6754[var44 & 255];
            int var48 = this.field6754[255 & var43] & 255;
            if (this.field6759) {
                for (int var49 = 0; ~var49 > ~class245.field3167; ++var49) {
                    int var50 = class347.field4461[var49] * this.field6752;
                    int var51 = this.method2823(var41, 94, var45, var48, var46, var47, var38 * var50 >> 12);
                    int var52 = var39 * var51 >> 12;
                    arg2[var49] = 2048 - -(var52 >> 1);
                }
            } else {
                for (int var53 = 0; var53 < class245.field3167; ++var53) {
                    int var54 = class347.field4461[var53] * this.field6752;
                    int var55 = this.method2823(var41, 85, var45, var48, var46, var47, var38 * var54 >> 12);
                    arg2[var53] = var39 * var55 >> 12;
                }
            }
        }
    }
}
