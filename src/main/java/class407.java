import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class407 extends class56 {

    @OriginalMember(owner = "client!taa", name = "E", descriptor = "[B")
    private byte[] field5758 = new byte[512];

    @OriginalMember(owner = "client!taa", name = "D", descriptor = "I")
    public int field5757 = 4;

    @OriginalMember(owner = "client!taa", name = "F", descriptor = "I")
    public int field5759 = 4;

    @OriginalMember(owner = "client!taa", name = "L", descriptor = "Z")
    public boolean field5765 = true;

    @OriginalMember(owner = "client!taa", name = "J", descriptor = "I")
    public int field5763 = 4;

    @OriginalMember(owner = "client!taa", name = "R", descriptor = "I")
    public int field5771 = 0;

    @OriginalMember(owner = "client!taa", name = "T", descriptor = "I")
    public int field5773 = 1638;

    @OriginalMember(owner = "client!taa", name = "M", descriptor = "I")
    public static int field5766 = 0;

    @OriginalMember(owner = "client!taa", name = "S", descriptor = "I")
    public static int field5772 = -1;

    @OriginalMember(owner = "client!taa", name = "U", descriptor = "I")
    public static int field5774 = 0;

    @OriginalMember(owner = "client!taa", name = "G", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!taa", name = "I", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!taa", name = "K", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!taa", name = "N", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!taa", name = "O", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!taa", name = "P", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!taa", name = "H", descriptor = "[S")
    private short[] field5761;

    @OriginalMember(owner = "client!taa", name = "Q", descriptor = "[S")
    private short[] field5770;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIIIIIB)I", line = 5)
    private final int method2520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        ++field5762;
        int var8 = -26 % ((24 - arg6) / 61);
        int var9 = arg2 >> 12;
        int var10 = var9 - -1;
        int var11 = var9 & 255;
        int var12 = arg2 & 4095;
        if (~arg1 >= ~var10) {
            var10 = 0;
        }
        int var13 = var10 & 255;
        int var14 = arg3 + -4096;
        int var15 = var12 + -4096;
        int var16 = class47.field556[var12];
        int var17 = this.field5758[arg0 + var11] & 3;
        int var18;
        if (~var17 >= -2) {
            var18 = var17 != 0 ? arg3 - var12 : arg3 + var12;
        } else {
            var18 = ~var17 == -3 ? -arg3 + var12 : -var12 - arg3;
        }
        int var19 = 3 & this.field5758[var13 - -arg0];
        int var20;
        if (~var19 >= -2) {
            var20 = var19 == 0 ? arg3 + var15 : -var15 + arg3;
        } else {
            var20 = ~var19 == -3 ? -arg3 + var15 : -var15 - arg3;
        }
        int var21 = this.field5758[arg5 + var11] & 3;
        int var22 = ((-var18 + var20) * var16 >> 12) + var18;
        int var23;
        if (~var21 < -2) {
            var23 = ~var21 == -3 ? -var14 + var12 : -var12 - var14;
        } else {
            var23 = ~var21 != -1 ? -var12 + var14 : var12 - -var14;
        }
        int var24 = 3 & this.field5758[var13 - -arg5];
        int var25;
        if (var24 > 1) {
            var25 = ~var24 != -3 ? -var14 + -var15 : var15 - var14;
        } else {
            var25 = ~var24 == -1 ? var14 + var15 : var14 - var15;
        }
        int var26 = ((-var23 + var25) * var16 >> 12) + var23;
        return ((-var22 + var26) * arg4 >> 12) + var22;
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "()V", line = 159)
    public class407() {
        super(0, true);
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IZ)[I", line = 90)
    public final int[] method24(int arg0, boolean arg1) {
        ++field5767;
        if (!arg1) {
            this.field5763 = -126;
        }
        int[] var3 = super.field673.method3270(arg0, (byte) -42);
        if (super.field673.field8073) {
            this.method2522(!arg1, arg0, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "(I)V", line = 115)
    private final void method2521(int arg0) {
        ++field5764;
        if (arg0 >= -43) {
            this.field5757 = 115;
        }
        if (this.field5773 > 0) {
            this.field5770 = new short[this.field5759];
            this.field5761 = new short[this.field5759];
            for (int var2 = 0; ~var2 > ~this.field5759; ++var2) {
                this.field5770[var2] = (short) ((int) (Math.pow((double) ((float) this.field5773 / 4096.0F), (double) var2) * 4096.0D));
                this.field5761[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field5770 != null && ~this.field5770.length == ~this.field5759) {
            this.field5761 = new short[this.field5759];
            for (int var3 = 0; ~var3 > ~this.field5759; ++var3) {
                this.field5761[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZI[I)V", line = 164)
    public final void method2522(boolean arg0, int arg1, int[] arg2) {
        ++field5768;
        int var4 = class720.field10000[arg1] * this.field5757;
        if (!arg0) {
            if (this.field5759 != 1) {
                short var5 = this.field5770[0];
                if (var5 > 8 || var5 < -8) {
                    int var6 = this.field5761[0] << 12;
                    int var7 = var4 * var6 >> 12;
                    int var8 = this.field5763 * var6 >> 12;
                    int var9 = this.field5757 * var6 >> 12;
                    int var10 = var7 >> 12;
                    int var11 = var10 - -1;
                    if (var11 >= var9) {
                        var11 = 0;
                    }
                    int var12 = var7 & 4095;
                    int var13 = 255 & this.field5758[var10 & 255];
                    int var14 = this.field5758[255 & var11] & 255;
                    int var15 = class47.field556[var12];
                    for (int var16 = 0; ~var16 > ~class328.field4576; ++var16) {
                        int var36 = class132.field1945[var16] * this.field5763;
                        int var37 = this.method2520(var13, var8, var6 * var36 >> 12, var12, var15, var14, (byte) -121);
                        arg2[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; ~var17 > ~this.field5759; ++var17) {
                    short var18 = this.field5770[var17];
                    if (var18 > 8 || var18 < -8) {
                        int var19 = this.field5761[var17] << 12;
                        int var20 = this.field5763 * var19 >> 12;
                        int var21 = this.field5757 * var19 >> 12;
                        int var22 = var4 * var19 >> 12;
                        int var23 = var22 >> 12;
                        int var24 = var23 + 1;
                        int var25 = var22 & 4095;
                        if (~var21 >= ~var24) {
                            var24 = 0;
                        }
                        int var26 = class47.field556[var25];
                        int var27 = this.field5758[255 & var23] & 255;
                        int var28 = this.field5758[var24 & 255] & 255;
                        if (this.field5765 && ~(this.field5759 - 1) == ~var17) {
                            for (int var29 = 0; ~var29 > ~class328.field4576; ++var29) {
                                int var30 = class132.field1945[var29] * this.field5763;
                                int var31 = this.method2520(var27, var20, var19 * var30 >> 12, var25, var26, var28, (byte) -114);
                                int var32 = (var18 * var31 >> 12) + arg2[var29];
                                arg2[var29] = (var32 >> 1) + 2048;
                            }
                        } else {
                            for (int var33 = 0; var33 < class328.field4576; ++var33) {
                                int var34 = class132.field1945[var33] * this.field5763;
                                int var35 = this.method2520(var27, var20, var19 * var34 >> 12, var25, var26, var28, (byte) -99);
                                arg2[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                int var38 = this.field5761[0] << 12;
                short var39 = this.field5770[0];
                int var40 = var4 * var38 >> 12;
                int var41 = this.field5757 * var38 >> 12;
                int var42 = this.field5763 * var38 >> 12;
                int var43 = var40 >> 12;
                int var44 = var43 + 1;
                if (var44 >= var41) {
                    var44 = 0;
                }
                int var45 = var40 & 4095;
                int var46 = class47.field556[var45];
                int var47 = this.field5758[255 & var43] & 255;
                int var48 = this.field5758[var44 & 255] & 255;
                if (this.field5765) {
                    for (int var49 = 0; ~var49 > ~class328.field4576; ++var49) {
                        int var50 = class132.field1945[var49] * this.field5763;
                        int var51 = this.method2520(var47, var42, var38 * var50 >> 12, var45, var46, var48, (byte) 109);
                        int var52 = var39 * var51 >> 12;
                        arg2[var49] = 2048 - -(var52 >> 1);
                    }
                } else {
                    for (int var53 = 0; ~var53 > ~class328.field4576; ++var53) {
                        int var54 = class132.field1945[var53] * this.field5763;
                        int var55 = this.method2520(var47, var42, var38 * var54 >> 12, var45, var46, var48, (byte) 95);
                        arg2[var53] = var39 * var55 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ILee;I)V", line = 326)
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field5757 = arg1.method3750((byte) 35);
                                }
                            } else {
                                this.field5763 = arg1.method3750((byte) 35);
                            }
                        } else {
                            this.field5771 = arg1.method3750((byte) 35);
                        }
                    } else {
                        this.field5763 = this.field5757 = arg1.method3750((byte) 35);
                    }
                } else {
                    this.field5773 = arg1.method3706((byte) -94);
                    if (~this.field5773 > -1) {
                        this.field5770 = new short[this.field5759];
                        for (int var5 = 0; this.field5759 > var5; ++var5) {
                            this.field5770[var5] = (short) arg1.method3706((byte) -123);
                        }
                    }
                }
            } else {
                this.field5759 = arg1.method3750((byte) 35);
            }
        } else {
            this.field5765 = arg1.method3750((byte) 35) == 1;
        }
        if (arg0 == 3731) {
            ++field5760;
        }
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)V", line = 422)
    public final void method364(int arg0) {
        this.field5758 = class271.method1771((byte) 69, this.field5771);
        ++field5769;
        if (arg0 != 7) {
            this.method364(-53);
        }
        this.method2521(arg0 + -123);
        for (int var2 = this.field5759 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field5770[var2];
            if (~var3 < -9) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field5759;
        }
    }
}
