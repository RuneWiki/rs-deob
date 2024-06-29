import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class437 extends class139 {

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "I")
    public int field6066 = 4;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
    public int field6063 = 4;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
    public int field6069 = 1638;

    @OriginalMember(owner = "client!ab", name = "Z", descriptor = "I")
    public int field6081 = 0;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "Z")
    public boolean field6065 = true;

    @OriginalMember(owner = "client!ab", name = "cb", descriptor = "I")
    public int field6084 = 4;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "[B")
    private byte[] field6072 = new byte[512];

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "Lbc;")
    public static class225 field6070 = new class225();

    @OriginalMember(owner = "client!ab", name = "Y", descriptor = "I")
    public static int field6080 = 2;

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "Lkj;")
    public static class366 field6077 = null;

    @OriginalMember(owner = "client!ab", name = "bb", descriptor = "I")
    public static int field6083 = 0;

    @OriginalMember(owner = "client!ab", name = "ab", descriptor = "I")
    public static int field6082 = 1338;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!ab", name = "db", descriptor = "I")
    public static int field6085;

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "[S")
    private short[] field6075;

    @OriginalMember(owner = "client!ab", name = "X", descriptor = "[S")
    private short[] field6079;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)V")
    private final void method2570(boolean arg0) {
        if (!arg0) {
            ++field6068;
            if (~this.field6069 >= -1) {
                if (this.field6075 != null && ~this.field6075.length == ~this.field6066) {
                    this.field6079 = new short[this.field6066];
                    for (int var2 = 0; ~this.field6066 < ~var2; ++var2) {
                        this.field6079[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                    }
                    return;
                }
            } else {
                this.field6079 = new short[this.field6066];
                this.field6075 = new short[this.field6066];
                for (int var3 = 0; ~var3 > ~this.field6066; ++var3) {
                    this.field6075[var3] = (short) ((int) (Math.pow((double) ((float) this.field6069 / 4096.0F), (double) var3) * 4096.0D));
                    this.field6079[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        ++field6064;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field6084 = arg0.method1701(-23121);
                                }
                            } else {
                                this.field6063 = arg0.method1701(-23121);
                            }
                        } else {
                            this.field6081 = arg0.method1701(arg1 + -23076);
                        }
                    } else {
                        this.field6063 = this.field6084 = arg0.method1701(-23121);
                    }
                } else {
                    this.field6069 = arg0.method1702(arg1 ^ 125);
                    if (~this.field6069 > -1) {
                        this.field6075 = new short[this.field6066];
                        for (int var5 = 0; this.field6066 > var5; ++var5) {
                            this.field6075[var5] = (short) arg0.method1702(arg1 + 6);
                        }
                    }
                }
            } else {
                this.field6066 = arg0.method1701(-23121);
            }
        } else {
            this.field6065 = arg0.method1701(-23121) == 1;
        }
        if (arg1 != -45) {
            this.field6079 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIBIIII)I")
    private final int method2571(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6076;
        int var8 = arg6 >> 12;
        int var9 = var8 + 1;
        if (~var9 <= ~arg3) {
            var9 = 0;
        }
        int var10 = arg6 & 4095;
        int var11 = var8 & 255;
        int var12 = arg5 + -4096;
        int var13 = var9 & 255;
        int var14 = var10 + -4096;
        int var15 = this.field6072[arg1 + var11] & 3;
        int var16 = class348.field5031[var10];
        int var17;
        if (var15 <= 1) {
            var17 = ~var15 == -1 ? var10 - -arg5 : -var10 + arg5;
        } else {
            var17 = ~var15 != -3 ? -arg5 + -var10 : var10 - arg5;
        }
        int var18 = 3 & this.field6072[arg1 + var13];
        int var19;
        if (var18 <= 1) {
            var19 = ~var18 != -1 ? -var14 + arg5 : arg5 + var14;
        } else {
            var19 = ~var18 == -3 ? -arg5 + var14 : -arg5 + -var14;
        }
        int var20 = ((-var17 + var19) * var16 >> 12) + var17;
        int var21 = 3 & this.field6072[arg0 + var11];
        int var22;
        if (~var21 < -2) {
            var22 = ~var21 == -3 ? -var12 + var10 : -var10 - var12;
        } else {
            var22 = ~var21 != -1 ? var12 - var10 : var10 - -var12;
        }
        int var23 = this.field6072[arg0 + var13] & 3;
        int var24;
        if (~var23 >= -2) {
            var24 = var23 == 0 ? var12 + var14 : -var14 + var12;
        } else {
            var24 = var23 == 2 ? -var12 + var14 : -var12 + -var14;
        }
        if (arg2 != 62) {
            this.method23(-66);
        }
        int var25 = ((-var22 + var24) * var16 >> 12) + var22;
        return var20 - -((-var20 + var25) * arg4 >> 12);
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "(B)V")
    public static void method2572(byte arg0) {
        if (arg0 != 64) {
            method2573(-22, -6, 86);
        }
        field6077 = null;
        field6070 = null;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public final void method23(int arg0) {
        this.field6072 = class62.method387(this.field6081, (byte) 104);
        ++field6085;
        if (arg0 == 7) {
            this.method2570(false);
            for (int var2 = this.field6066 + -1; var2 >= 1; --var2) {
                short var3 = this.field6075[var2];
                if (var3 > 8) {
                    return;
                }
                if (~var3 > 7) {
                    return;
                }
                --this.field6066;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(III)I")
    public static final int method2573(int arg0, int arg1, int arg2) {
        ++field6078;
        if (arg2 != 1178896940) {
            field6080 = 117;
        }
        int var3 = arg1 >>> 24;
        int var4 = ((16711935 & arg1) * var3 & -16711936 | (65280 & arg1) * var3 & 16711680) >>> 8;
        int var5 = -var3 + 255;
        return ((16711680 & (arg0 & 65280) * var5 | -16711936 & (16711935 & arg0) * var5) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        ++field6067;
        int[] var3 = super.field1844.method2176(arg0, 0);
        if (arg1 != 27782) {
            method2573(51, 7, 74);
        }
        if (super.field1844.field5045) {
            this.method2575(0, arg0, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    public class437() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Loa;B)I")
    public static final int method2574(class452 arg0, byte arg1) {
        ++field6073;
        int var2 = arg0.field6289;
        if (arg1 != -110) {
            field6082 = 22;
        }
        class332 var3 = arg0.method924((byte) -32);
        if (arg0.field2121) {
            var2 = arg0.field6255;
        } else if (~arg0.field2105 != ~var3.field4815 && ~arg0.field2105 != ~var3.field4794 && arg0.field2105 != var3.field4831 && arg0.field2105 != var3.field4788) {
            if (~arg0.field2105 == ~var3.field4819 || arg0.field2105 == var3.field4793 || ~arg0.field2105 == ~var3.field4816 || ~arg0.field2105 == ~var3.field4833) {
                var2 = arg0.field6274;
            }
        } else {
            var2 = arg0.field6257;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II[I)V")
    public final void method2575(int arg0, int arg1, int[] arg2) {
        ++field6074;
        int var4 = class237.field3559[arg1] * this.field6084;
        if (arg0 != 0) {
            this.field6081 = -4;
        }
        if (this.field6066 != 1) {
            short var5 = this.field6075[0];
            if (var5 > 8 || ~var5 > 7) {
                int var6 = this.field6079[0] << 12;
                int var7 = this.field6084 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = this.field6063 * var6 >> 12;
                int var10 = var8 >> 12;
                int var11 = var10 - -1;
                int var12 = var8 & 4095;
                if (~var11 <= ~var7) {
                    var11 = 0;
                }
                int var13 = 255 & this.field6072[255 & var11];
                int var14 = 255 & this.field6072[var10 & 255];
                int var15 = class348.field5031[var12];
                for (int var16 = 0; ~class356.field5147 < ~var16; ++var16) {
                    int var36 = class216.field3245[var16] * this.field6063;
                    int var37 = this.method2571(var13, var14, (byte) 62, var9, var15, var12, var6 * var36 >> 12);
                    arg2[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; this.field6066 > var17; ++var17) {
                short var18 = this.field6075[var17];
                if (~var18 < -9 || var18 < -8) {
                    int var19 = this.field6079[var17] << 12;
                    int var20 = var4 * var19 >> 12;
                    int var21 = this.field6063 * var19 >> 12;
                    int var22 = this.field6084 * var19 >> 12;
                    int var23 = var20 >> 12;
                    int var24 = var23 + 1;
                    if (~var24 <= ~var22) {
                        var24 = 0;
                    }
                    int var25 = var20 & 4095;
                    int var26 = this.field6072[var24 & 255] & 255;
                    int var27 = 255 & this.field6072[255 & var23];
                    int var28 = class348.field5031[var25];
                    if (this.field6065 && this.field6066 + -1 == var17) {
                        for (int var29 = 0; ~class356.field5147 < ~var29; ++var29) {
                            int var30 = class216.field3245[var29] * this.field6063;
                            int var31 = this.method2571(var26, var27, (byte) 62, var21, var28, var25, var19 * var30 >> 12);
                            int var32 = (var18 * var31 >> 12) + arg2[var29];
                            arg2[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; var33 < class356.field5147; ++var33) {
                            int var34 = class216.field3245[var33] * this.field6063;
                            int var35 = this.method2571(var26, var27, (byte) 62, var21, var28, var25, var19 * var34 >> 12);
                            arg2[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            int var38 = this.field6079[0] << 12;
            short var39 = this.field6075[0];
            int var40 = this.field6063 * var38 >> 12;
            int var41 = var4 * var38 >> 12;
            int var42 = this.field6084 * var38 >> 12;
            int var43 = var41 >> 12;
            int var44 = var43 - -1;
            int var45 = var41 & 4095;
            if (var42 <= var44) {
                var44 = 0;
            }
            int var46 = 255 & this.field6072[var44 & 255];
            int var47 = class348.field5031[var45];
            int var48 = this.field6072[255 & var43] & 255;
            if (this.field6065) {
                for (int var49 = 0; ~class356.field5147 < ~var49; ++var49) {
                    int var50 = class216.field3245[var49] * this.field6063;
                    int var51 = this.method2571(var46, var48, (byte) 62, var40, var47, var45, var38 * var50 >> 12);
                    int var52 = var39 * var51 >> 12;
                    arg2[var49] = (var52 >> 1) + 2048;
                }
            } else {
                for (int var53 = 0; class356.field5147 > var53; ++var53) {
                    int var54 = class216.field3245[var53] * this.field6063;
                    int var55 = this.method2571(var46, var48, (byte) 62, var40, var47, var45, var38 * var54 >> 12);
                    arg2[var53] = var39 * var55 >> 12;
                }
            }
        }
    }
}
