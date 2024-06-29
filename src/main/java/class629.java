import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class629 extends class30 {

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    public int field8723 = 4;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "Z")
    public boolean field8726 = true;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    public int field8717 = 0;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    public int field8729 = 1638;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
    public int field8732 = 4;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "[B")
    private byte[] field8734 = new byte[512];

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
    public int field8720 = 4;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "[I")
    public static int[] field8728 = new int[] { 3500, 200 };

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public static int field8718;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
    public static int field8719;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
    public static int field8721;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    public static int field8722;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    public static int field8724;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    public static int field8725;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "I")
    public static int field8730;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
    public static int field8731;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "[S")
    private short[] field8727;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "[S")
    private short[] field8733;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)V")
    public final void method29(byte arg0) {
        if (arg0 < -10) {
            ++field8725;
            this.field8734 = class273.method1695(this.field8717, (byte) -65);
            this.method3520((byte) -116);
            for (int var2 = this.field8720 - 1; var2 >= 1; --var2) {
                short var3 = this.field8733[var2];
                if (var3 > 8) {
                    return;
                }
                if (~var3 > 7) {
                    return;
                }
                --this.field8720;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class629() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V")
    public static void method3517(byte arg0) {
        if (arg0 > -112) {
            method3521(-44, 25, false, (String) null, 6, 100, 38, -54);
        }
        field8728 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lac;Z)V")
    public static final void method3518(class501 arg0, boolean arg1) {
        ++field8719;
        int var2 = arg0.method2871((byte) -87);
        class412.field5844 = new class555[var2];
        for (int var3 = 0; ~var3 > ~var2; ++var3) {
            class412.field5844[var3] = new class555();
            class412.field5844[var3].field7480 = arg0.method2871((byte) -87);
            class412.field5844[var3].field7479 = arg0.method2839(true);
        }
        class301.field4171 = arg0.method2871((byte) -87);
        class244.field3325 = arg0.method2871((byte) -87);
        class368.field4964 = arg0.method2871((byte) -87);
        class43.field526 = new class228[class244.field3325 - class301.field4171 - -1];
        for (int var4 = 0; class368.field4964 > var4; ++var4) {
            int var5 = arg0.method2871((byte) -87);
            class228 var6 = class43.field526[var5] = new class228();
            var6.field3536 = arg0.method2874((byte) -75);
            var6.field3535 = arg0.method2840(false);
            var6.field3173 = class301.field4171 + var5;
            var6.field3171 = arg0.method2839(true);
            var6.field3167 = arg0.method2839(arg1);
        }
        class58.field659 = arg0.method2840(!arg1);
        class184.field2656 = arg1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIBIII)I")
    private final int method3519(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field8722;
        int var8 = arg1 >> 12;
        int var9 = var8 - -1;
        int var10 = var8 & 255;
        if (var9 >= arg4) {
            var9 = 0;
        }
        int var11 = arg1 & 4095;
        int var12 = var9 & 255;
        int var13 = var11 + -4096;
        int var14 = arg0 + -4096;
        int var15 = class667.field9378[var11];
        int var16 = 3 & this.field8734[var10 - -arg5];
        int var17;
        if (var16 <= 1) {
            var17 = var16 != 0 ? -var11 + arg0 : arg0 + var11;
        } else {
            var17 = var16 != 2 ? -arg0 + -var11 : -arg0 + var11;
        }
        int var18 = -1 / ((arg3 - -47) / 50);
        int var19 = 3 & this.field8734[arg5 + var12];
        int var20;
        if (~var19 >= -2) {
            var20 = var19 == 0 ? arg0 + var13 : -var13 + arg0;
        } else {
            var20 = ~var19 != -3 ? -var13 - arg0 : -arg0 + var13;
        }
        int var21 = 3 & this.field8734[arg6 + var10];
        int var22 = var17 - -((-var17 + var20) * var15 >> 12);
        int var23;
        if (var21 > 1) {
            var23 = var21 != 2 ? -var11 + -var14 : var11 - var14;
        } else {
            var23 = ~var21 != -1 ? -var11 + var14 : var11 + var14;
        }
        int var24 = this.field8734[arg6 + var12] & 3;
        int var25;
        if (var24 <= 1) {
            var25 = var24 == 0 ? var13 + var14 : -var13 + var14;
        } else {
            var25 = var24 == 2 ? var13 - var14 : -var13 + -var14;
        }
        int var26 = ((-var23 + var25) * var15 >> 12) + var23;
        return ((-var22 + var26) * arg2 >> 12) + var22;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BILac;)V")
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field8723 = arg2.method2874((byte) -75);
                                }
                            } else {
                                this.field8732 = arg2.method2874((byte) -75);
                            }
                        } else {
                            this.field8717 = arg2.method2874((byte) -75);
                        }
                    } else {
                        this.field8732 = this.field8723 = arg2.method2874((byte) -75);
                    }
                } else {
                    this.field8729 = arg2.method2875(false);
                    if (this.field8729 < 0) {
                        this.field8733 = new short[this.field8720];
                        for (int var5 = 0; this.field8720 > var5; ++var5) {
                            this.field8733[var5] = (short) arg2.method2875(false);
                        }
                    }
                }
            } else {
                this.field8720 = arg2.method2874((byte) -75);
            }
        } else {
            this.field8726 = ~arg2.method2874((byte) -75) == -2;
        }
        ++field8721;
        if (arg0 <= 100) {
            this.method48(-31, -34);
        }
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(B)V")
    private final void method3520(byte arg0) {
        if (arg0 == -116) {
            if (this.field8729 <= 0) {
                if (this.field8733 != null && ~this.field8733.length == ~this.field8720) {
                    this.field8727 = new short[this.field8720];
                    for (int var2 = 0; var2 < this.field8720; ++var2) {
                        this.field8727[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                    }
                }
            } else {
                this.field8733 = new short[this.field8720];
                this.field8727 = new short[this.field8720];
                for (int var3 = 0; ~var3 > ~this.field8720; ++var3) {
                    this.field8733[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field8729 / 4096.0F), (double) var3)));
                    this.field8727[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
            ++field8718;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)[I")
    public final int[] method48(int arg0, int arg1) {
        ++field8724;
        if (arg0 != 1) {
            this.field8726 = true;
        }
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (super.field374.field9032) {
            this.method3522(var3, arg1, 4095);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIZLjava/lang/String;IIII)V")
    public static final void method3521(int arg0, int arg1, boolean arg2, String arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!arg2) {
            ++field8731;
            class544 var8 = new class544();
            var8.field7390 = class186.field2697 + arg5;
            var8.field7380 = arg7;
            var8.field7385 = arg0;
            var8.field7383 = arg4;
            var8.field7384 = arg3;
            var8.field7386 = arg1;
            var8.field7381 = arg6;
            class43.field508.method3906(var8, (byte) -19);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([III)V")
    public final void method3522(int[] arg0, int arg1, int arg2) {
        ++field8730;
        int var4 = class430.field6016[arg1] * this.field8723;
        if (arg2 != 4095) {
            this.field8733 = null;
        }
        if (~this.field8720 != -2) {
            short var5 = this.field8733[0];
            if (~var5 < -9 || ~var5 > 7) {
                int var6 = this.field8727[0] << 12;
                int var7 = this.field8732 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = this.field8723 * var6 >> 12;
                int var10 = var8 >> 12;
                int var11 = var10 + 1;
                int var12 = var8 & 4095;
                if (~var9 >= ~var11) {
                    var11 = 0;
                }
                int var13 = class667.field9378[var12];
                int var14 = this.field8734[var10 & 255] & 255;
                int var15 = 255 & this.field8734[255 & var11];
                for (int var16 = 0; ~var16 > ~class31.field399; ++var16) {
                    int var36 = class48.field568[var16] * this.field8732;
                    int var37 = this.method3519(var12, var6 * var36 >> 12, var13, (byte) 101, var7, var14, var15);
                    arg0[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; ~this.field8720 < ~var17; ++var17) {
                short var18 = this.field8733[var17];
                if (~var18 < -9 || var18 < -8) {
                    int var19 = this.field8727[var17] << 12;
                    int var20 = var4 * var19 >> 12;
                    int var21 = this.field8723 * var19 >> 12;
                    int var22 = this.field8732 * var19 >> 12;
                    int var23 = var20 >> 12;
                    int var24 = var23 + 1;
                    if (~var21 >= ~var24) {
                        var24 = 0;
                    }
                    int var25 = var20 & 4095;
                    int var26 = this.field8734[var23 & 255] & 255;
                    int var27 = class667.field9378[var25];
                    int var28 = 255 & this.field8734[255 & var24];
                    if (this.field8726 && this.field8720 + -1 == var17) {
                        for (int var29 = 0; ~var29 > ~class31.field399; ++var29) {
                            int var30 = class48.field568[var29] * this.field8732;
                            int var31 = this.method3519(var25, var19 * var30 >> 12, var27, (byte) 49, var22, var26, var28);
                            int var32 = (var18 * var31 >> 12) + arg0[var29];
                            arg0[var29] = 2048 - -(var32 >> 1);
                        }
                    } else {
                        for (int var33 = 0; ~var33 > ~class31.field399; ++var33) {
                            int var34 = class48.field568[var33] * this.field8732;
                            int var35 = this.method3519(var25, var19 * var34 >> 12, var27, (byte) 61, var22, var26, var28);
                            arg0[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            int var38 = this.field8727[0] << 12;
            short var39 = this.field8733[0];
            int var40 = this.field8732 * var38 >> 12;
            int var41 = this.field8723 * var38 >> 12;
            int var42 = var4 * var38 >> 12;
            int var43 = var42 >> 12;
            int var44 = var43 - -1;
            if (var41 <= var44) {
                var44 = 0;
            }
            int var45 = var42 & 4095;
            int var46 = this.field8734[255 & var44] & 255;
            int var47 = class667.field9378[var45];
            int var48 = this.field8734[255 & var43] & 255;
            if (this.field8726) {
                for (int var49 = 0; ~class31.field399 < ~var49; ++var49) {
                    int var50 = class48.field568[var49] * this.field8732;
                    int var51 = this.method3519(var45, var38 * var50 >> 12, var47, (byte) 119, var40, var48, var46);
                    int var52 = var39 * var51 >> 12;
                    arg0[var49] = (var52 >> 1) + 2048;
                }
            } else {
                for (int var53 = 0; var53 < class31.field399; ++var53) {
                    int var54 = class48.field568[var53] * this.field8732;
                    int var55 = this.method3519(var45, var38 * var54 >> 12, var47, (byte) -117, var40, var48, var46);
                    arg0[var53] = var39 * var55 >> 12;
                }
            }
        }
    }
}
