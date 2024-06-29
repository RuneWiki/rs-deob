import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class278 extends class748 {

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public int field3705 = 1638;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "[B")
    private byte[] field3713 = new byte[512];

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    public int field3710 = 0;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "I")
    public int field3703 = 4;

    @OriginalMember(owner = "client!re", name = "V", descriptor = "I")
    public int field3717 = 4;

    @OriginalMember(owner = "client!re", name = "Z", descriptor = "I")
    public int field3721 = 4;

    @OriginalMember(owner = "client!re", name = "S", descriptor = "Z")
    public boolean field3714 = true;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "Lqk;")
    public static class148 field3708 = new class148(93, 1);

    @OriginalMember(owner = "client!re", name = "I", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!re", name = "X", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!re", name = "U", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field3716;

    @OriginalMember(owner = "client!re", name = "W", descriptor = "[I")
    public static int[] field3718;

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "[I")
    public static int[] field3722;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "[S")
    private short[] field3712;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "[S")
    private short[] field3715;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([IB)Ljava/lang/String;")
    public static final String method1672(int[] arg0, byte arg1) {
        ++field3704;
        StringBuffer var2 = new StringBuffer();
        int var3 = class468.field6402;
        for (int var4 = 0; arg0.length > var4; ++var4) {
            class365 var5 = class535.field7498.method2061(2798, arg0[var4]);
            if (~var5.field4683 != 0) {
                class21 var6 = (class21) class674.field9504.method3200((long) var5.field4683, -19983);
                if (var6 == null) {
                    class320 var7 = class320.method1870(class323.field4156, var5.field4683, 0);
                    if (var7 != null) {
                        var6 = class96.field1401.method2126(var7, true);
                        class674.field9504.method3199((byte) 78, var6, (long) var5.field4683);
                    }
                }
                if (var6 != null) {
                    class298.field3904[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    ++var3;
                }
            }
        }
        if (arg1 <= 23) {
            method1672((int[]) null, (byte) 24);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
    public class278() {
        super(0, true);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public final void method23(byte arg0) {
        this.field3713 = class545.method3257(false, this.field3710);
        ++field3711;
        this.method1675(arg0 ^ 26);
        for (int var2 = this.field3717 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field3715[var2];
            if (~var3 < -9 || var3 < -8) {
                break;
            }
            --this.field3717;
        }
        if (arg0 != 67) {
            field3718 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field3720;
        int[] var3 = super.field10407.method3873(arg1 + -255, arg0);
        if (arg1 != 255) {
            return null;
        } else {
            if (super.field10407.field9527) {
                this.method1673(arg0, (byte) -119, var3);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IB[I)V")
    public final void method1673(int arg0, byte arg1, int[] arg2) {
        ++field3719;
        int var4 = class370.field4727[arg0] * this.field3721;
        if (arg1 >= -23) {
            this.field3710 = 52;
        }
        if (this.field3717 == 1) {
            int var5 = this.field3712[0] << 12;
            short var6 = this.field3715[0];
            int var7 = this.field3703 * var5 >> 12;
            int var8 = this.field3721 * var5 >> 12;
            int var9 = var4 * var5 >> 12;
            int var10 = var9 >> 12;
            int var11 = var10 + 1;
            int var12 = var9 & 4095;
            if (var8 <= var11) {
                var11 = 0;
            }
            int var13 = 255 & this.field3713[var11 & 255];
            int var14 = class366.field4703[var12];
            int var15 = 255 & this.field3713[255 & var10];
            if (!this.field3714) {
                for (int var16 = 0; var16 < class424.field5889; ++var16) {
                    int var17 = class237.field3298[var16] * this.field3703;
                    int var18 = this.method1674(var12, var15, var14, var7, var5 * var17 >> 12, var13, -31310);
                    arg2[var16] = var6 * var18 >> 12;
                }
            } else {
                for (int var19 = 0; class424.field5889 > var19; ++var19) {
                    int var20 = class237.field3298[var19] * this.field3703;
                    int var21 = this.method1674(var12, var15, var14, var7, var5 * var20 >> 12, var13, -31310);
                    int var22 = var6 * var21 >> 12;
                    arg2[var19] = 2048 - -(var22 >> 1);
                }
            }
        } else {
            short var23 = this.field3715[0];
            if (~var23 < -9 || var23 < -8) {
                int var24 = this.field3712[0] << 12;
                int var25 = var4 * var24 >> 12;
                int var26 = this.field3703 * var24 >> 12;
                int var27 = this.field3721 * var24 >> 12;
                int var28 = var25 >> 12;
                int var29 = var28 + 1;
                int var30 = var25 & 4095;
                if (var29 >= var27) {
                    var29 = 0;
                }
                int var31 = 255 & this.field3713[255 & var28];
                int var32 = 255 & this.field3713[var29 & 255];
                int var33 = class366.field4703[var30];
                for (int var34 = 0; ~var34 > ~class424.field5889; ++var34) {
                    int var54 = class237.field3298[var34] * this.field3703;
                    int var55 = this.method1674(var30, var31, var33, var26, var24 * var54 >> 12, var32, -31310);
                    arg2[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; var35 < this.field3717; ++var35) {
                short var36 = this.field3715[var35];
                if (var36 > 8 || var36 < -8) {
                    int var37 = this.field3712[var35] << 12;
                    int var38 = var4 * var37 >> 12;
                    int var39 = this.field3703 * var37 >> 12;
                    int var40 = this.field3721 * var37 >> 12;
                    int var41 = var38 >> 12;
                    int var42 = var41 - -1;
                    int var43 = var38 & 4095;
                    if (~var42 <= ~var40) {
                        var42 = 0;
                    }
                    int var44 = 255 & this.field3713[255 & var41];
                    int var45 = this.field3713[255 & var42] & 255;
                    int var46 = class366.field4703[var43];
                    if (this.field3714 && ~(this.field3717 + -1) == ~var35) {
                        for (int var47 = 0; ~class424.field5889 < ~var47; ++var47) {
                            int var48 = class237.field3298[var47] * this.field3703;
                            int var49 = this.method1674(var43, var44, var46, var39, var37 * var48 >> 12, var45, -31310);
                            int var50 = (var36 * var49 >> 12) + arg2[var47];
                            arg2[var47] = 2048 - -(var50 >> 1);
                        }
                    } else {
                        for (int var51 = 0; class424.field5889 > var51; ++var51) {
                            int var52 = class237.field3298[var51] * this.field3703;
                            int var53 = this.method1674(var43, var44, var46, var39, var37 * var52 >> 12, var45, -31310);
                            arg2[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIII)I")
    private final int method1674(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3706;
        int var8 = arg4 >> 12;
        int var9 = var8 - -1;
        if (var9 >= arg3) {
            var9 = 0;
        }
        if (arg6 != -31310) {
            field3708 = null;
        }
        int var10 = var8 & 255;
        int var11 = arg4 & 4095;
        int var12 = var11 + -4096;
        int var13 = arg0 - 4096;
        int var14 = var9 & 255;
        int var15 = this.field3713[var10 - -arg1] & 3;
        int var16 = class366.field4703[var11];
        int var17;
        if (~var15 >= -2) {
            var17 = var15 == 0 ? var11 - -arg0 : -var11 + arg0;
        } else {
            var17 = ~var15 == -3 ? -arg0 + var11 : -var11 - arg0;
        }
        int var18 = this.field3713[var14 - -arg1] & 3;
        int var19;
        if (~var18 >= -2) {
            var19 = ~var18 == -1 ? var12 - -arg0 : -var12 + arg0;
        } else {
            var19 = var18 == 2 ? var12 - arg0 : -arg0 + -var12;
        }
        int var20 = this.field3713[arg5 + var10] & 3;
        int var21 = ((-var17 + var19) * var16 >> 12) + var17;
        int var22;
        if (~var20 < -2) {
            var22 = ~var20 != -3 ? -var11 + -var13 : var11 - var13;
        } else {
            var22 = ~var20 != -1 ? -var11 + var13 : var11 + var13;
        }
        int var23 = 3 & this.field3713[arg5 + var14];
        int var24;
        if (var23 <= 1) {
            var24 = var23 != 0 ? -var12 + var13 : var12 + var13;
        } else {
            var24 = var23 == 2 ? -var13 + var12 : -var12 + -var13;
        }
        int var25 = ((-var22 + var24) * var16 >> 12) + var22;
        return ((-var21 + var25) * arg2 >> 12) + var21;
    }

    @OriginalMember(owner = "client!re", name = "g", descriptor = "(I)V")
    private final void method1675(int arg0) {
        int var2 = 77 / ((arg0 - -75) / 32);
        ++field3709;
        if (this.field3705 <= 0) {
            if (this.field3715 != null && ~this.field3715.length == ~this.field3717) {
                this.field3712 = new short[this.field3717];
                for (int var3 = 0; ~var3 > ~this.field3717; ++var3) {
                    this.field3712[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
                return;
            }
        } else {
            this.field3715 = new short[this.field3717];
            this.field3712 = new short[this.field3717];
            for (int var4 = 0; ~this.field3717 < ~var4; ++var4) {
                this.field3715[var4] = (short) ((int) (Math.pow((double) ((float) this.field3705 / 4096.0F), (double) var4) * 4096.0D));
                this.field3712[var4] = (short) ((int) Math.pow(2.0D, (double) var4));
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "h", descriptor = "(I)V")
    public static void method1676(int arg0) {
        if (arg0 > -119) {
            field3718 = null;
        }
        field3718 = null;
        field3708 = null;
        field3722 = null;
        field3716 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZLvj;)V")
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        if (!arg1) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (arg0 != 2) {
                        if (arg0 != 3) {
                            if (arg0 != 4) {
                                if (~arg0 != -6) {
                                    if (arg0 == 6) {
                                        this.field3721 = arg2.method194((byte) 119);
                                    }
                                } else {
                                    this.field3703 = arg2.method194((byte) 119);
                                }
                            } else {
                                this.field3710 = arg2.method194((byte) 119);
                            }
                        } else {
                            this.field3703 = this.field3721 = arg2.method194((byte) 119);
                        }
                    } else {
                        this.field3705 = arg2.method173(-3);
                        if (this.field3705 < 0) {
                            this.field3715 = new short[this.field3717];
                            for (int var5 = 0; ~var5 > ~this.field3717; ++var5) {
                                this.field3715[var5] = (short) arg2.method173(-3);
                            }
                        }
                    }
                } else {
                    this.field3717 = arg2.method194((byte) 119);
                }
            } else {
                this.field3714 = arg2.method194((byte) 119) == 1;
            }
            ++field3707;
        }
    }
}
