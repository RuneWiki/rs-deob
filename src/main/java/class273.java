import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class273 extends class666 {

    @OriginalMember(owner = "client!vt", name = "J", descriptor = "I")
    public int field3459 = 1638;

    @OriginalMember(owner = "client!vt", name = "R", descriptor = "I")
    public int field3466 = 4;

    @OriginalMember(owner = "client!vt", name = "G", descriptor = "I")
    public int field3456 = 0;

    @OriginalMember(owner = "client!vt", name = "S", descriptor = "[B")
    private byte[] field3467 = new byte[512];

    @OriginalMember(owner = "client!vt", name = "T", descriptor = "I")
    public int field3468 = 4;

    @OriginalMember(owner = "client!vt", name = "U", descriptor = "I")
    public int field3469 = 4;

    @OriginalMember(owner = "client!vt", name = "V", descriptor = "Z")
    public boolean field3470 = true;

    @OriginalMember(owner = "client!vt", name = "N", descriptor = "I")
    public static int field3463 = 0;

    @OriginalMember(owner = "client!vt", name = "D", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!vt", name = "E", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!vt", name = "I", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!vt", name = "K", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!vt", name = "L", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!vt", name = "O", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!vt", name = "Q", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!vt", name = "F", descriptor = "Lpr;")
    public static class407 field3455;

    @OriginalMember(owner = "client!vt", name = "H", descriptor = "[S")
    private short[] field3457;

    @OriginalMember(owner = "client!vt", name = "M", descriptor = "[S")
    private short[] field3462;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIIZII)I", line = 5)
    private final int method1558(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field3465;
        int var8 = arg5 >> 12;
        if (arg4) {
            method1561(-114);
        }
        int var9 = var8 + 1;
        if (var9 >= arg3) {
            var9 = 0;
        }
        int var10 = arg5 & 4095;
        int var11 = var8 & 255;
        int var12 = var9 & 255;
        int var13 = var10 - 4096;
        int var14 = arg1 + -4096;
        int var15 = class552.field7871[var10];
        int var16 = 3 & this.field3467[arg0 + var11];
        int var17;
        if (~var16 < -2) {
            var17 = ~var16 != -3 ? -arg1 + -var10 : -arg1 + var10;
        } else {
            var17 = var16 != 0 ? -var10 + arg1 : arg1 + var10;
        }
        int var18 = 3 & this.field3467[arg0 + var12];
        int var19;
        if (~var18 >= -2) {
            var19 = ~var18 == -1 ? var13 - -arg1 : arg1 - var13;
        } else {
            var19 = var18 == 2 ? var13 - arg1 : -var13 - arg1;
        }
        int var20 = var17 - -((-var17 + var19) * var15 >> 12);
        int var21 = this.field3467[arg6 + var11] & 3;
        int var22;
        if (~var21 < -2) {
            var22 = ~var21 != -3 ? -var10 + -var14 : var10 - var14;
        } else {
            var22 = var21 == 0 ? var10 + var14 : -var10 + var14;
        }
        int var23 = 3 & this.field3467[var12 - -arg6];
        int var24;
        if (var23 <= 1) {
            var24 = ~var23 != -1 ? -var13 + var14 : var13 + var14;
        } else {
            var24 = ~var23 == -3 ? -var14 + var13 : -var13 - var14;
        }
        int var25 = ((-var22 + var24) * var15 >> 12) + var22;
        return ((var25 - var20) * arg2 >> 12) + var20;
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(Z)V", line = 81)
    private final void method1559(boolean arg0) {
        ++field3453;
        if (!arg0) {
            this.method118(-34);
        }
        if (this.field3459 > 0) {
            this.field3457 = new short[this.field3469];
            this.field3462 = new short[this.field3469];
            for (int var2 = 0; ~var2 > ~this.field3469; ++var2) {
                this.field3462[var2] = (short) ((int) (Math.pow((double) ((float) this.field3459 / 4096.0F), (double) var2) * 4096.0D));
                this.field3457[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field3462 != null && this.field3462.length == this.field3469) {
            this.field3457 = new short[this.field3469];
            for (int var3 = 0; this.field3469 > var3; ++var3) {
                this.field3457[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "(I)V", line = 122)
    public static void method1560(int arg0) {
        if (arg0 == -1) {
            field3455 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "()V", line = 271)
    public class273() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILiaa;Z)V", line = 149)
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (!arg2) {
            this.field3470 = true;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field3466 = arg1.method2541(126);
                                }
                            } else {
                                this.field3468 = arg1.method2541(43);
                            }
                        } else {
                            this.field3456 = arg1.method2541(33);
                        }
                    } else {
                        this.field3468 = this.field3466 = arg1.method2541(103);
                    }
                } else {
                    this.field3459 = arg1.method2549((byte) 32);
                    if (~this.field3459 > -1) {
                        this.field3462 = new short[this.field3469];
                        for (int var5 = 0; ~var5 > ~this.field3469; ++var5) {
                            this.field3462[var5] = (short) arg1.method2549((byte) 32);
                        }
                    }
                }
            } else {
                this.field3469 = arg1.method2541(79);
            }
        } else {
            this.field3470 = ~arg1.method2541(45) == -2;
        }
        ++field3461;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)[I", line = 248)
    public final int[] method122(int arg0, int arg1) {
        ++field3458;
        int[] var3 = super.field9466.method1811(arg1, 95);
        if (arg0 > -21) {
            this.method122(-113, 43);
        }
        if (super.field9466.field4172) {
            this.method1562(var3, arg1, true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "(I)V", line = 275)
    public static final void method1561(int arg0) {
        ++field3464;
        class535.field7652 = new String[500];
        class492.field7136 = class612.field8650.field9123 + 2 + class612.field8650.field9130;
        class375.field4871 = class653.field9338.field9130 - -class653.field9338.field9123 + arg0;
        for (int var1 = 0; var1 < class535.field7652.length; ++var1) {
            class535.field7652[var1] = "";
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V", line = 295)
    public final void method118(int arg0) {
        ++field3460;
        this.field3467 = class498.method2863(this.field3456, 0);
        this.method1559(true);
        if (arg0 != -9) {
            method1560(79);
        }
        for (int var2 = this.field3469 + -1; var2 >= 1; --var2) {
            short var3 = this.field3462[var2];
            if (~var3 < -9 || var3 < -8) {
                return;
            }
            --this.field3469;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "([IIZ)V", line = 328)
    public final void method1562(int[] arg0, int arg1, boolean arg2) {
        ++field3454;
        int var4 = class476.field6935[arg1] * this.field3466;
        if (arg2) {
            if (this.field3469 != 1) {
                short var5 = this.field3462[0];
                if (~var5 < -9 || ~var5 > 7) {
                    int var6 = this.field3457[0] << 12;
                    int var7 = this.field3466 * var6 >> 12;
                    int var8 = var4 * var6 >> 12;
                    int var9 = this.field3468 * var6 >> 12;
                    int var10 = var8 >> 12;
                    int var11 = var10 - -1;
                    if (~var11 <= ~var7) {
                        var11 = 0;
                    }
                    int var12 = var8 & 4095;
                    int var13 = 255 & this.field3467[255 & var11];
                    int var14 = class552.field7871[var12];
                    int var15 = 255 & this.field3467[255 & var10];
                    for (int var16 = 0; ~var16 > ~class501.field7222; ++var16) {
                        int var36 = class579.field8246[var16] * this.field3468;
                        int var37 = this.method1558(var15, var12, var14, var9, false, var6 * var36 >> 12, var13);
                        arg0[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; ~this.field3469 < ~var17; ++var17) {
                    short var18 = this.field3462[var17];
                    if (var18 > 8 || var18 < -8) {
                        int var19 = this.field3457[var17] << 12;
                        int var20 = this.field3468 * var19 >> 12;
                        int var21 = this.field3466 * var19 >> 12;
                        int var22 = var4 * var19 >> 12;
                        int var23 = var22 >> 12;
                        int var24 = var23 + 1;
                        int var25 = var22 & 4095;
                        if (var24 >= var21) {
                            var24 = 0;
                        }
                        int var26 = class552.field7871[var25];
                        int var27 = 255 & this.field3467[255 & var24];
                        int var28 = this.field3467[var23 & 255] & 255;
                        if (this.field3470 && ~(this.field3469 + -1) == ~var17) {
                            for (int var29 = 0; var29 < class501.field7222; ++var29) {
                                int var30 = class579.field8246[var29] * this.field3468;
                                int var31 = this.method1558(var28, var25, var26, var20, false, var19 * var30 >> 12, var27);
                                int var32 = (var18 * var31 >> 12) + arg0[var29];
                                arg0[var29] = (var32 >> 1) + 2048;
                            }
                        } else {
                            for (int var33 = 0; class501.field7222 > var33; ++var33) {
                                int var34 = class579.field8246[var33] * this.field3468;
                                int var35 = this.method1558(var28, var25, var26, var20, false, var19 * var34 >> 12, var27);
                                arg0[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                int var38 = this.field3457[0] << 12;
                short var39 = this.field3462[0];
                int var40 = var4 * var38 >> 12;
                int var41 = this.field3466 * var38 >> 12;
                int var42 = this.field3468 * var38 >> 12;
                int var43 = var40 >> 12;
                int var44 = var43 - -1;
                int var45 = var40 & 4095;
                if (var41 <= var44) {
                    var44 = 0;
                }
                int var46 = this.field3467[var44 & 255] & 255;
                int var47 = 255 & this.field3467[var43 & 255];
                int var48 = class552.field7871[var45];
                if (this.field3470) {
                    for (int var49 = 0; ~var49 > ~class501.field7222; ++var49) {
                        int var50 = class579.field8246[var49] * this.field3468;
                        int var51 = this.method1558(var47, var45, var48, var42, false, var38 * var50 >> 12, var46);
                        int var52 = var39 * var51 >> 12;
                        arg0[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; var53 < class501.field7222; ++var53) {
                        int var54 = class579.field8246[var53] * this.field3468;
                        int var55 = this.method1558(var47, var45, var48, var42, false, var38 * var54 >> 12, var46);
                        arg0[var53] = var39 * var55 >> 12;
                    }
                }
            }
        }
    }
}
