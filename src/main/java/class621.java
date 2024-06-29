import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class621 extends class4 {

    @OriginalMember(owner = "client!sp", name = "F", descriptor = "Z")
    public boolean field8933 = true;

    @OriginalMember(owner = "client!sp", name = "N", descriptor = "[B")
    private byte[] field8941 = new byte[512];

    @OriginalMember(owner = "client!sp", name = "J", descriptor = "I")
    public int field8937 = 1638;

    @OriginalMember(owner = "client!sp", name = "G", descriptor = "I")
    public int field8934 = 0;

    @OriginalMember(owner = "client!sp", name = "O", descriptor = "I")
    public int field8942 = 4;

    @OriginalMember(owner = "client!sp", name = "L", descriptor = "I")
    public int field8939 = 4;

    @OriginalMember(owner = "client!sp", name = "X", descriptor = "I")
    public int field8951 = 4;

    @OriginalMember(owner = "client!sp", name = "E", descriptor = "Lim;")
    public static class353 field8932 = new class353(54, 6);

    @OriginalMember(owner = "client!sp", name = "T", descriptor = "Luv;")
    public static class3 field8947 = new class3(65, -1);

    @OriginalMember(owner = "client!sp", name = "H", descriptor = "I")
    public static int field8935;

    @OriginalMember(owner = "client!sp", name = "I", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!sp", name = "K", descriptor = "I")
    public static int field8938;

    @OriginalMember(owner = "client!sp", name = "M", descriptor = "I")
    public static int field8940;

    @OriginalMember(owner = "client!sp", name = "Q", descriptor = "I")
    public static int field8944;

    @OriginalMember(owner = "client!sp", name = "R", descriptor = "I")
    public static int field8945;

    @OriginalMember(owner = "client!sp", name = "S", descriptor = "I")
    public static int field8946;

    @OriginalMember(owner = "client!sp", name = "U", descriptor = "I")
    public static int field8948;

    @OriginalMember(owner = "client!sp", name = "V", descriptor = "I")
    public static int field8949;

    @OriginalMember(owner = "client!sp", name = "W", descriptor = "I")
    public static int field8950;

    @OriginalMember(owner = "client!sp", name = "Y", descriptor = "I")
    public static int field8952;

    @OriginalMember(owner = "client!sp", name = "Z", descriptor = "Lpe;")
    public static class157 field8953;

    @OriginalMember(owner = "client!sp", name = "P", descriptor = "[S")
    private short[] field8943;

    @OriginalMember(owner = "client!sp", name = "ab", descriptor = "[S")
    private short[] field8954;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILjj;)V")
    public static final void method3558(int arg0, class66 arg1) {
        for (int var2 = 0; ~var2 > ~class80.field1087; ++var2) {
            int var3 = class610.field8776[var2];
            class20 var4 = class364.field5092[var3];
            int var5 = arg1.method3045(-127);
            if ((var5 & 64) != 0) {
                var5 += arg1.method3045(-127) << 8;
            }
            if (~(32768 & var5) != -1) {
                var5 += arg1.method3045(-125) << 16;
            }
            class548.method3026(var3, 110, var4, var5, arg1);
        }
        ++field8948;
        if (arg0 > -14) {
            method3558(84, (class66) null);
        }
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "()V")
    public class621() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "(I)V")
    public final void method18(int arg0) {
        ++field8944;
        this.field8941 = class85.method478(this.field8934, (byte) 85);
        this.method3562(94);
        for (int var2 = this.field8939 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field8954[var2];
            if (~var3 < -9 || ~var3 > 7) {
                break;
            }
            --this.field8939;
        }
        if (arg0 != -9) {
            this.method15((byte) 95, -54);
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(III)Lqh;")
    public static final class293 method3559(int arg0, int arg1, int arg2) {
        class563 var3 = class199.field2605[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class293 var4 = var3.field7895;
            var3.field7895 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        if (arg0 >= -89) {
            field8932 = null;
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field8942 = arg1.method3045(-126);
                                }
                            } else {
                                this.field8951 = arg1.method3045(-127);
                            }
                        } else {
                            this.field8934 = arg1.method3045(-128);
                        }
                    } else {
                        this.field8951 = this.field8942 = arg1.method3045(-127);
                    }
                } else {
                    this.field8937 = arg1.method3087(true);
                    if (this.field8937 < 0) {
                        this.field8954 = new short[this.field8939];
                        for (int var5 = 0; ~this.field8939 < ~var5; ++var5) {
                            this.field8954[var5] = (short) arg1.method3087(true);
                        }
                    }
                }
            } else {
                this.field8939 = arg1.method3045(-126);
            }
        } else {
            this.field8933 = ~arg1.method3045(-125) == -2;
        }
        ++field8950;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IB[I)V")
    public final void method3560(int arg0, byte arg1, int[] arg2) {
        ++field8940;
        if (arg1 != 37) {
            this.field8954 = null;
        }
        int var4 = class130.field1606[arg0] * this.field8942;
        if (~this.field8939 == -2) {
            int var5 = this.field8943[0] << 12;
            short var6 = this.field8954[0];
            int var7 = var4 * var5 >> 12;
            int var8 = this.field8942 * var5 >> 12;
            int var9 = this.field8951 * var5 >> 12;
            int var10 = var7 >> 12;
            int var11 = var10 + 1;
            int var12 = var7 & 4095;
            if (var8 <= var11) {
                var11 = 0;
            }
            int var13 = 255 & this.field8941[var10 & 255];
            int var14 = class554.field7749[var12];
            int var15 = 255 & this.field8941[var11 & 255];
            if (!this.field8933) {
                for (int var16 = 0; ~class132.field1627 < ~var16; ++var16) {
                    int var17 = class66.field881[var16] * this.field8951;
                    int var18 = this.method3561(var13, var12, var14, var9, var15, var5 * var17 >> 12, 1);
                    arg2[var16] = var6 * var18 >> 12;
                }
            } else {
                for (int var19 = 0; var19 < class132.field1627; ++var19) {
                    int var20 = class66.field881[var19] * this.field8951;
                    int var21 = this.method3561(var13, var12, var14, var9, var15, var5 * var20 >> 12, arg1 + -36);
                    int var22 = var6 * var21 >> 12;
                    arg2[var19] = (var22 >> 1) + 2048;
                }
            }
        } else {
            short var23 = this.field8954[0];
            if (var23 > 8 || var23 < -8) {
                int var24 = this.field8943[0] << 12;
                int var25 = this.field8951 * var24 >> 12;
                int var26 = this.field8942 * var24 >> 12;
                int var27 = var4 * var24 >> 12;
                int var28 = var27 >> 12;
                int var29 = var28 + 1;
                int var30 = var27 & 4095;
                if (var26 <= var29) {
                    var29 = 0;
                }
                int var31 = this.field8941[255 & var29] & 255;
                int var32 = 255 & this.field8941[var28 & 255];
                int var33 = class554.field7749[var30];
                for (int var34 = 0; class132.field1627 > var34; ++var34) {
                    int var54 = class66.field881[var34] * this.field8951;
                    int var55 = this.method3561(var32, var30, var33, var25, var31, var24 * var54 >> 12, arg1 ^ 36);
                    arg2[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; ~var35 > ~this.field8939; ++var35) {
                short var36 = this.field8954[var35];
                if (var36 > 8 || ~var36 > 7) {
                    int var37 = this.field8943[var35] << 12;
                    int var38 = var4 * var37 >> 12;
                    int var39 = this.field8942 * var37 >> 12;
                    int var40 = this.field8951 * var37 >> 12;
                    int var41 = var38 >> 12;
                    int var42 = var41 + 1;
                    if (var39 <= var42) {
                        var42 = 0;
                    }
                    int var43 = var38 & 4095;
                    int var44 = this.field8941[var41 & 255] & 255;
                    int var45 = class554.field7749[var43];
                    int var46 = this.field8941[255 & var42] & 255;
                    if (this.field8933 && this.field8939 - 1 == var35) {
                        for (int var47 = 0; class132.field1627 > var47; ++var47) {
                            int var48 = class66.field881[var47] * this.field8951;
                            int var49 = this.method3561(var44, var43, var45, var40, var46, var37 * var48 >> 12, 1);
                            int var50 = arg2[var47] - -(var36 * var49 >> 12);
                            arg2[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; ~var51 > ~class132.field1627; ++var51) {
                            int var52 = class66.field881[var51] * this.field8951;
                            int var53 = this.method3561(var44, var43, var45, var40, var46, var37 * var52 >> 12, 1);
                            arg2[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIIIII)I")
    private final int method3561(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8938;
        int var8 = arg5 >> 12;
        int var9 = var8 + 1;
        int var10 = arg5 & 4095;
        if (~arg3 >= ~var9) {
            var9 = 0;
        }
        int var11 = var8 & 255;
        int var12 = arg1 + -4096;
        int var13 = var10 - 4096;
        int var14 = var9 & 255;
        int var15 = this.field8941[arg0 + var11] & 3;
        int var16 = class554.field7749[var10];
        int var17;
        if (~var15 >= -2) {
            var17 = ~var15 == -1 ? arg1 + var10 : -var10 + arg1;
        } else {
            var17 = ~var15 != -3 ? -arg1 + -var10 : var10 - arg1;
        }
        int var18 = this.field8941[arg0 + var14] & 3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? arg1 + var13 : -var13 + arg1;
        } else {
            var19 = ~var18 == -3 ? -arg1 + var13 : -arg1 + -var13;
        }
        int var20 = var17 - -((-var17 + var19) * var16 >> 12);
        int var21 = this.field8941[arg4 + var11] & 3;
        int var22;
        if (arg6 < var21) {
            var22 = var21 == 2 ? -var12 + var10 : -var10 - var12;
        } else {
            var22 = var21 == 0 ? var10 - -var12 : var12 - var10;
        }
        int var23 = this.field8941[var14 - -arg4] & 3;
        int var24;
        if (~var23 >= -2) {
            var24 = ~var23 == -1 ? var13 - -var12 : var12 - var13;
        } else {
            var24 = var23 != 2 ? -var12 + -var13 : -var12 + var13;
        }
        int var25 = ((-var22 + var24) * var16 >> 12) + var22;
        return ((var25 - var20) * arg2 >> 12) + var20;
    }

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "(I)V")
    private final void method3562(int arg0) {
        if (this.field8937 > 0) {
            this.field8954 = new short[this.field8939];
            this.field8943 = new short[this.field8939];
            for (int var2 = 0; ~var2 > ~this.field8939; ++var2) {
                this.field8954[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field8937 / 4096.0F), (double) var2)));
                this.field8943[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field8954 != null && ~this.field8954.length == ~this.field8939) {
            this.field8943 = new short[this.field8939];
            for (int var3 = 0; ~var3 > ~this.field8939; ++var3) {
                this.field8943[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field8946;
        if (arg0 < 41) {
            this.field8943 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "(I)V")
    public static void method3563(int arg0) {
        field8947 = null;
        if (arg0 != 16383) {
            method3558(111, (class66) null);
        }
        field8953 = null;
        field8932 = null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field8949;
        int[] var3 = super.field31.method2252(arg1, 11);
        if (arg0 != 10) {
            method3559(-100, -95, 71);
        }
        if (super.field31.field5127) {
            this.method3560(arg1, (byte) 37, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IILjq;Lpa;IIIJI)V")
    public static final void method3564(int arg0, int arg1, class447 arg2, class594 arg3, int arg4, int arg5, int arg6, long arg7, int arg8) {
        ++field8945;
        int var10 = arg0 * arg0 + arg5 * arg5;
        if ((long) var10 <= arg7) {
            if (arg6 != 256) {
                field8952 = -105;
            }
            int var11 = Math.min(arg2.field6330 / 2, arg2.field6218 / 2);
            if (~(var11 * var11) <= ~var10) {
                class310.method1865(arg1, 125, arg0, arg5, arg3, arg8, class525.field7312[arg4], arg2);
            } else {
                var11 -= 10;
                int var12;
                if (~field8952 == -5) {
                    var12 = (int) class521.field7250 & 16383;
                } else {
                    var12 = 16383 & (int) class521.field7250 + class374.field5212;
                }
                int var13 = class310.field3966[var12];
                int var14 = class310.field3965[var12];
                if (~field8952 != -5) {
                    var13 = var13 * 256 / (class54.field728 + 256);
                    var14 = var14 * 256 / (class54.field728 + 256);
                }
                int var15 = arg0 * var14 + arg5 * var13 >> 14;
                int var16 = arg5 * var14 + -(arg0 * var13) >> 14;
                double var17 = Math.atan2((double) var15, (double) var16);
                int var19 = (int) ((double) var11 * Math.sin(var17));
                int var20 = (int) ((double) var11 * Math.cos(var17));
                class183.field2337[arg4].method619((float) arg2.field6330 / 2.0F + (float) arg8 + (float) var19, (float) arg2.field6218 / 2.0F + (float) arg1 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "(I)V")
    public static final void method3565(int arg0) {
        if (arg0 < -81) {
            ++field8935;
            if (~class145.field1889 != 0) {
                class494.method2774(-60, false, -1, -1, class145.field1889);
                class145.field1889 = -1;
            }
        }
    }
}
