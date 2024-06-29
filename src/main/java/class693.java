import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class693 extends class335 {

    @OriginalMember(owner = "client!uca", name = "B", descriptor = "[B")
    private byte[] field9760 = new byte[512];

    @OriginalMember(owner = "client!uca", name = "D", descriptor = "I")
    public int field9762 = 4;

    @OriginalMember(owner = "client!uca", name = "M", descriptor = "Z")
    public boolean field9770 = true;

    @OriginalMember(owner = "client!uca", name = "P", descriptor = "I")
    public int field9773 = 1638;

    @OriginalMember(owner = "client!uca", name = "N", descriptor = "I")
    public int field9771 = 0;

    @OriginalMember(owner = "client!uca", name = "T", descriptor = "I")
    public int field9776 = 4;

    @OriginalMember(owner = "client!uca", name = "R", descriptor = "I")
    public int field9775 = 4;

    @OriginalMember(owner = "client!uca", name = "I", descriptor = "Z")
    public static boolean field9766 = false;

    @OriginalMember(owner = "client!uca", name = "W", descriptor = "I")
    public static int field9779 = 0;

    @OriginalMember(owner = "client!uca", name = "C", descriptor = "I")
    public static int field9761;

    @OriginalMember(owner = "client!uca", name = "E", descriptor = "I")
    public static int field9763;

    @OriginalMember(owner = "client!uca", name = "G", descriptor = "I")
    public static int field9764;

    @OriginalMember(owner = "client!uca", name = "H", descriptor = "I")
    public static int field9765;

    @OriginalMember(owner = "client!uca", name = "J", descriptor = "I")
    public static int field9767;

    @OriginalMember(owner = "client!uca", name = "K", descriptor = "I")
    public static int field9768;

    @OriginalMember(owner = "client!uca", name = "L", descriptor = "I")
    public static int field9769;

    @OriginalMember(owner = "client!uca", name = "O", descriptor = "I")
    public static int field9772;

    @OriginalMember(owner = "client!uca", name = "Q", descriptor = "I")
    public static int field9774;

    @OriginalMember(owner = "client!uca", name = "V", descriptor = "I")
    public static int field9778;

    @OriginalMember(owner = "client!uca", name = "X", descriptor = "I")
    public static int field9780;

    @OriginalMember(owner = "client!uca", name = "U", descriptor = "[S")
    private short[] field9777;

    @OriginalMember(owner = "client!uca", name = "Y", descriptor = "[S")
    private short[] field9781;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIIIIII)I")
    private final int method3906(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9768;
        if (arg2 != -13077) {
            this.field9771 = 16;
        }
        int var8 = arg3 >> 12;
        int var9 = var8 + 1;
        if (var9 >= arg5) {
            var9 = 0;
        }
        int var10 = arg3 & 4095;
        int var11 = var8 & 255;
        int var12 = var9 & 255;
        int var13 = arg0 + -4096;
        int var14 = var10 - 4096;
        int var15 = class170.field2426[var10];
        int var16 = this.field9760[arg6 + var11] & 3;
        int var17;
        if (var16 > 1) {
            var17 = ~var16 == -3 ? -arg0 + var10 : -arg0 + -var10;
        } else {
            var17 = var16 != 0 ? -var10 + arg0 : arg0 + var10;
        }
        int var18 = 3 & this.field9760[arg6 + var12];
        int var19;
        if (~var18 < -2) {
            var19 = var18 != 2 ? -arg0 + -var14 : -arg0 + var14;
        } else {
            var19 = var18 == 0 ? var14 - -arg0 : -var14 + arg0;
        }
        int var20 = ((-var17 + var19) * var15 >> 12) + var17;
        int var21 = 3 & this.field9760[arg1 + var11];
        int var22;
        if (~var21 >= -2) {
            var22 = var21 == 0 ? var10 + var13 : -var10 + var13;
        } else {
            var22 = ~var21 != -3 ? -var10 - var13 : var10 - var13;
        }
        int var23 = this.field9760[arg1 + var12] & 3;
        int var24;
        if (~var23 < -2) {
            var24 = ~var23 == -3 ? -var13 + var14 : -var14 - var13;
        } else {
            var24 = ~var23 == -1 ? var13 + var14 : -var14 + var13;
        }
        int var25 = ((var24 - var22) * var15 >> 12) + var22;
        return ((-var20 + var25) * arg4 >> 12) + var20;
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(B)V")
    public static final void method3907(byte arg0) {
        class496.field6835.method2168((byte) -104);
        if (arg0 == 108) {
            ++field9778;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ILio;)V")
    public static final void method3908(int arg0, class157 arg1) {
        ++field9767;
        if (~(arg1.field2199.length + -arg1.field2219) <= -2) {
            int var2 = arg1.method930(255);
            if (~var2 <= -1 && ~var2 >= -2) {
                if (arg1.field2199.length + -arg1.field2219 >= 2) {
                    int var3 = arg1.method963(-127);
                    if (arg1.field2199.length + -arg1.field2219 >= var3 * 6) {
                        int var4 = 0;
                        int var5 = 65 % ((-69 - arg0) / 42);
                        while (var3 > var4) {
                            int var6 = arg1.method963(-126);
                            int var7 = arg1.method908(false);
                            if (class235.field3125.length > var6 && class516.field7179[var6] && (class228.field2963.method3752(19, var6).field7501 != '1' || var7 >= -1 && ~var7 >= -2)) {
                                class235.field3125[var6] = var7;
                            }
                            ++var4;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "(I)V")
    private final void method3909(int arg0) {
        ++field9780;
        if (~this.field9773 >= -1) {
            if (this.field9777 != null && ~this.field9777.length == ~this.field9776) {
                this.field9781 = new short[this.field9776];
                for (int var2 = 0; ~var2 > ~this.field9776; ++var2) {
                    this.field9781[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field9777 = new short[this.field9776];
            this.field9781 = new short[this.field9776];
            for (int var3 = 0; ~var3 > ~this.field9776; ++var3) {
                this.field9777[var3] = (short) ((int) (Math.pow((double) ((float) this.field9773 / 4096.0F), (double) var3) * 4096.0D));
                this.field9781[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 < 68) {
            this.method2(36, (class157) null, -126);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ILio;I)V")
    public final void method2(int arg0, class157 arg1, int arg2) {
        if (arg2 == -66) {
            ++field9764;
            if (arg0 != 0) {
                if (arg0 == 1) {
                    this.field9776 = arg1.method930(arg2 ^ -191);
                } else {
                    if (~arg0 != -3) {
                        if (~arg0 == -4) {
                            this.field9762 = this.field9775 = arg1.method930(255);
                            return;
                        }
                        if (~arg0 == -5) {
                            this.field9771 = arg1.method930(arg2 + 321);
                            return;
                        }
                        if (~arg0 == -6) {
                            this.field9762 = arg1.method930(255);
                            return;
                        }
                        if (~arg0 == -7) {
                            this.field9775 = arg1.method930(255);
                            return;
                        }
                    } else {
                        this.field9773 = arg1.method928(2016790224);
                        if (~this.field9773 > -1) {
                            this.field9777 = new short[this.field9776];
                            for (int var5 = 0; ~this.field9776 < ~var5; ++var5) {
                                this.field9777[var5] = (short) arg1.method928(2016790224);
                            }
                            return;
                        }
                    }
                }
            } else {
                this.field9770 = arg1.method930(arg2 ^ -191) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "(I)J")
    public static final long method3910(int arg0) {
        if (arg0 != 0) {
            method3907((byte) 16);
        }
        ++field9769;
        return class618.field8581.method250(-123);
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)V")
    public final void method317(byte arg0) {
        this.field9760 = class704.method3955(this.field9771, 7433);
        ++field9765;
        this.method3909(87);
        for (int var2 = this.field9776 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field9777[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            --this.field9776;
        }
        int var4 = 127 / ((58 - arg0) / 60);
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(IIIIIII)V")
    public static final void method3911(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9772;
        class551.method3081(arg5 + -17040, arg3);
        if (arg5 == 512) {
            int var7 = 0;
            int var8 = -arg2 + arg3;
            if (~var8 > -1) {
                var8 = 0;
            }
            int var9 = arg3;
            int var10 = -arg3;
            int var11 = var8;
            int var12 = -var8;
            int var13 = -1;
            int var14 = -1;
            int[] var15 = class315.field4224[arg1];
            int var16 = -var8 + arg4;
            int var17 = arg4 + var8;
            class285.method1691(var16, var15, -7, -arg3 + arg4, arg6);
            class285.method1691(var17, var15, -7, var16, arg0);
            class285.method1691(arg3 + arg4, var15, -7, var17, arg6);
            while (~var9 < ~var7) {
                var14 += 2;
                var13 += 2;
                var10 += var13;
                var12 += var14;
                if (~var12 <= -1 && ~var11 <= -2) {
                    class46.field559[var11] = var7;
                    --var11;
                    var12 -= var11 << 1;
                }
                ++var7;
                if (var10 >= 0) {
                    --var9;
                    if (var9 < var8) {
                        int[] var18 = class315.field4224[arg1 + var9];
                        int[] var19 = class315.field4224[-var9 + arg1];
                        int var20 = class46.field559[var9];
                        int var21 = arg4 - -var7;
                        int var22 = -var7 + arg4;
                        int var23 = arg4 - -var20;
                        int var24 = arg4 - var20;
                        class285.method1691(var24, var18, arg5 + -519, var22, arg6);
                        class285.method1691(var23, var18, arg5 ^ -519, var24, arg0);
                        class285.method1691(var21, var18, -7, var23, arg6);
                        class285.method1691(var24, var19, -7, var22, arg6);
                        class285.method1691(var23, var19, -7, var24, arg0);
                        class285.method1691(var21, var19, -7, var23, arg6);
                    } else {
                        int[] var25 = class315.field4224[arg1 - -var9];
                        int[] var26 = class315.field4224[arg1 - var9];
                        int var27 = arg4 - -var7;
                        int var28 = -var7 + arg4;
                        class285.method1691(var27, var25, -7, var28, arg6);
                        class285.method1691(var27, var26, arg5 + -519, var28, arg6);
                    }
                    var10 -= var9 << 1;
                }
                int[] var29 = class315.field4224[arg1 - -var7];
                int[] var30 = class315.field4224[-var7 + arg1];
                int var31 = arg4 + var9;
                int var32 = -var9 + arg4;
                if (~var8 >= ~var7) {
                    class285.method1691(var31, var29, -7, var32, arg6);
                    class285.method1691(var31, var30, arg5 + -519, var32, arg6);
                } else {
                    int var33 = ~var11 <= ~var7 ? var11 : class46.field559[var7];
                    int var34 = arg4 + var33;
                    int var35 = -var33 + arg4;
                    class285.method1691(var35, var29, -7, var32, arg6);
                    class285.method1691(var34, var29, -7, var35, arg0);
                    class285.method1691(var31, var29, -7, var34, arg6);
                    class285.method1691(var35, var30, arg5 ^ -519, var32, arg6);
                    class285.method1691(var34, var30, -7, var35, arg0);
                    class285.method1691(var31, var30, -7, var34, arg6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "([III)V")
    public final void method3912(int[] arg0, int arg1, int arg2) {
        ++field9774;
        if (arg1 != -1) {
            this.field9781 = null;
        }
        int var4 = class686.field9697[arg2] * this.field9775;
        if (this.field9776 != 1) {
            short var5 = this.field9777[0];
            if (~var5 < -9 || var5 < -8) {
                int var6 = this.field9781[0] << 12;
                int var7 = this.field9762 * var6 >> 12;
                int var8 = this.field9775 * var6 >> 12;
                int var9 = var4 * var6 >> 12;
                int var10 = var9 >> 12;
                int var11 = var10 + 1;
                int var12 = var9 & 4095;
                if (~var8 >= ~var11) {
                    var11 = 0;
                }
                int var13 = 255 & this.field9760[255 & var11];
                int var14 = this.field9760[255 & var10] & 255;
                int var15 = class170.field2426[var12];
                for (int var16 = 0; ~class649.field8968 < ~var16; ++var16) {
                    int var36 = class376.field4981[var16] * this.field9762;
                    int var37 = this.method3906(var12, var13, -13077, var6 * var36 >> 12, var15, var7, var14);
                    arg0[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; ~var17 > ~this.field9776; ++var17) {
                short var18 = this.field9777[var17];
                if (var18 > 8 || ~var18 > 7) {
                    int var19 = this.field9781[var17] << 12;
                    int var20 = var4 * var19 >> 12;
                    int var21 = this.field9775 * var19 >> 12;
                    int var22 = this.field9762 * var19 >> 12;
                    int var23 = var20 >> 12;
                    int var24 = var23 + 1;
                    if (~var24 <= ~var21) {
                        var24 = 0;
                    }
                    int var25 = var20 & 4095;
                    int var26 = this.field9760[255 & var24] & 255;
                    int var27 = class170.field2426[var25];
                    int var28 = this.field9760[255 & var23] & 255;
                    if (this.field9770 && this.field9776 + -1 == var17) {
                        for (int var29 = 0; var29 < class649.field8968; ++var29) {
                            int var30 = class376.field4981[var29] * this.field9762;
                            int var31 = this.method3906(var25, var26, arg1 + -13076, var19 * var30 >> 12, var27, var22, var28);
                            int var32 = (var18 * var31 >> 12) + arg0[var29];
                            arg0[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; var33 < class649.field8968; ++var33) {
                            int var34 = class376.field4981[var33] * this.field9762;
                            int var35 = this.method3906(var25, var26, -13077, var19 * var34 >> 12, var27, var22, var28);
                            arg0[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            short var38 = this.field9777[0];
            int var39 = this.field9781[0] << 12;
            int var40 = this.field9762 * var39 >> 12;
            int var41 = this.field9775 * var39 >> 12;
            int var42 = var4 * var39 >> 12;
            int var43 = var42 >> 12;
            int var44 = var43 + 1;
            int var45 = var42 & 4095;
            if (~var44 <= ~var41) {
                var44 = 0;
            }
            int var46 = 255 & this.field9760[255 & var44];
            int var47 = class170.field2426[var45];
            int var48 = this.field9760[255 & var43] & 255;
            if (!this.field9770) {
                for (int var49 = 0; ~class649.field8968 < ~var49; ++var49) {
                    int var50 = class376.field4981[var49] * this.field9762;
                    int var51 = this.method3906(var45, var46, -13077, var39 * var50 >> 12, var47, var40, var48);
                    arg0[var49] = var38 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; var52 < class649.field8968; ++var52) {
                    int var53 = class376.field4981[var52] * this.field9762;
                    int var54 = this.method3906(var45, var46, arg1 ^ 13076, var39 * var53 >> 12, var47, var40, var48);
                    int var55 = var38 * var54 >> 12;
                    arg0[var52] = (var55 >> 1) + 2048;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZI)[I")
    public final int[] method3(boolean arg0, int arg1) {
        if (!arg0) {
            method3907((byte) -25);
        }
        ++field9761;
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (super.field4525.field5435) {
            this.method3912(var3, -1, arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uca", name = "<init>", descriptor = "()V")
    public class693() {
        super(0, true);
    }
}
