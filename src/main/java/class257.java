import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class257 extends class223 {

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    private int field4094 = 0;

    @OriginalMember(owner = "client!eb", name = "Z", descriptor = "I")
    private int field4101 = 4096;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "[I")
    public static int[] field4099 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "[I")
    public static int[] field4090 = new int[2500];

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "Lud;")
    public static class2 field4087 = new class2();

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!eb", name = "ab", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "Lub;")
    public static class92 field4095;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "[[[I")
    public static int[][][] field4098;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)I")
    public static final int method1733(byte arg0) {
        ++field4093;
        if ((double) class238.field3757 == 3.0D) {
            return 37;
        } else if ((double) class238.field3757 == 4.0D) {
            return 50;
        } else {
            if (arg0 < 9) {
                method1734(-68, -90, 45, -85, -117, -91, -17, 107, 125, 46);
            }
            if ((double) class238.field3757 == 6.0D) {
                return 75;
            } else {
                return (double) class238.field3757 == 8.0D ? 100 : 200;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1734(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 > -39) {
            field4102 = 48;
        }
        if (arg4 == arg7 && arg3 == arg6 && ~arg1 == ~arg8 && arg0 == arg9) {
            class116.method856(arg3, arg2, arg1, arg0, -121, arg4);
        } else {
            int var10 = arg4;
            int var11 = arg3;
            int var12 = arg4 * 3;
            int var13 = arg3 * 3;
            int var14 = arg7 * 3;
            int var15 = arg8 * 3;
            int var16 = arg6 * 3;
            int var17 = -var15 + arg1 + var14 - arg4;
            int var18 = -var14 + var12 + -var14 + var15;
            int var19 = arg9 * 3;
            int var20 = -var13 + var16;
            int var21 = -arg3 + -var19 + arg0 - -var16;
            int var22 = -var16 + -var16 + var19 + var13;
            int var23 = -var12 + var14;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var17 * var26;
                int var28 = var22 * var25;
                int var29 = var18 * var25;
                int var30 = var21 * var26;
                int var31 = var23 * var24;
                int var32 = (var29 + var31 + var27 >> 12) + arg4;
                int var33 = var20 * var24;
                int var34 = (var30 + var33 + var28 >> 12) + arg3;
                class116.method856(var11, arg2, var32, var34, -111, var10);
                var11 = var34;
                var10 = var32;
            }
        }
        ++field4100;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
    public class257() {
        super(1, false);
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(B)Z")
    public static final boolean method1735(byte arg0) {
        ++field4089;
        if (arg0 < 109) {
            field4092 = -72;
        }
        return class105.field1640 != 0 ? true : class236.field3728.method158((byte) 15);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        if (arg0 <= 14) {
            this.field4101 = -18;
        }
        ++field4097;
        int[] var3 = super.field3588.method1611(0, arg1);
        if (super.field3588.field3722) {
            int[] var4 = this.method1533(0, arg1, -93);
            for (int var5 = 0; class250.field4008 > var5; ++var5) {
                int var6 = var4[var5];
                if (~var6 <= ~this.field4094) {
                    if (this.field4101 >= var6) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field4101;
                    }
                } else {
                    var3[var5] = this.field4094;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BIIII)V")
    public static final void method1736(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~class112.field1727 >= ~arg4 && ~arg4 >= ~class278.field4410) {
            int var5 = class47.method396(class184.field2914, arg2, 74, class2.field42);
            int var6 = class47.method396(class184.field2914, arg3, 104, class2.field42);
            class76.method602(var5, arg4, var6, arg1, (byte) -41);
        }
        if (arg0 != 69) {
            method1736((byte) -5, -96, -110, 45, 36);
        }
        ++field4088;
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(B)V")
    public static void method1737(byte arg0) {
        field4087 = null;
        field4099 = null;
        if (arg0 != 65) {
            field4092 = 34;
        }
        field4090 = null;
        field4095 = null;
        field4098 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)[[I")
    public final int[][] method135(int arg0, int arg1) {
        ++field4085;
        if (arg0 <= 0) {
            field4098 = null;
        }
        int[][] var3 = super.field3572.method1818(arg1, false);
        if (super.field3572.field4257) {
            int[][] var4 = this.method1534(false, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var4[1];
            for (int var11 = 0; ~class250.field4008 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var10[var11];
                int var14 = var6[var11];
                if (~this.field4094 >= ~var12) {
                    if (var12 <= this.field4101) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field4101;
                    }
                } else {
                    var8[var11] = this.field4094;
                }
                if (~this.field4094 < ~var13) {
                    var7[var11] = this.field4094;
                } else if (~this.field4101 > ~var13) {
                    var7[var11] = this.field4101;
                } else {
                    var7[var11] = var13;
                }
                if (~this.field4094 < ~var14) {
                    var9[var11] = this.field4094;
                } else if (var14 <= this.field4101) {
                    var9[var11] = var14;
                } else {
                    var9[var11] = this.field4101;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)I")
    public static final int method1738(boolean arg0) {
        ++field4091;
        if (class183.field2893) {
            return 0;
        } else if (!class110.method819(false)) {
            return 1;
        } else {
            if (!arg0) {
                field4098 = null;
            }
            return !class109.field1685 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        if (arg2 != 102) {
            field4087 = null;
        }
        ++field4096;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field3583 = arg0.method265(-102) == 1;
                }
            } else {
                this.field4101 = arg0.method260((byte) -67);
            }
        } else {
            this.field4094 = arg0.method260((byte) -67);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method1739(byte arg0, long arg1) {
        ++field4086;
        if (arg1 > 0L && arg1 < 6582952005840035281L) {
            if (arg1 % 37L == 0L) {
                return null;
            } else {
                int var3 = 0;
                for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                    ++var3;
                }
                int var6 = 98 / ((-32 - arg0) / 48);
                StringBuffer var7 = new StringBuffer(var3);
                while (arg1 != 0L) {
                    long var8 = arg1;
                    arg1 /= 37L;
                    var7.append(class283.field4461[(int) (var8 - arg1 * 37L)]);
                }
                return var7.reverse().toString();
            }
        } else {
            return null;
        }
    }
}
