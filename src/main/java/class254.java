import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class254 extends class160 {

    @OriginalMember(owner = "client!o", name = "X", descriptor = "I")
    private int field4068 = 4;

    @OriginalMember(owner = "client!o", name = "cb", descriptor = "Z")
    private boolean field4073 = true;

    @OriginalMember(owner = "client!o", name = "gb", descriptor = "[B")
    private byte[] field4077 = new byte[512];

    @OriginalMember(owner = "client!o", name = "jb", descriptor = "I")
    private int field4080 = 4;

    @OriginalMember(owner = "client!o", name = "db", descriptor = "I")
    private int field4074 = 4;

    @OriginalMember(owner = "client!o", name = "W", descriptor = "I")
    private int field4067 = 1638;

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "I")
    private int field4070 = 0;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "Ljava/lang/String;")
    public static String field4066 = "Please remove ";

    @OriginalMember(owner = "client!o", name = "U", descriptor = "Lpd;")
    public static class58 field4065 = new class58();

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!o", name = "eb", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!o", name = "fb", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!o", name = "hb", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!o", name = "bb", descriptor = "[S")
    private short[] field4072;

    @OriginalMember(owner = "client!o", name = "ib", descriptor = "[S")
    private short[] field4079;

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class254() {
        super(0, true);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIII)I")
    private final int method1730(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4063;
        int var8 = arg0 - 4096;
        int var9 = arg4 >> 12;
        int var10 = arg4 & 4095;
        int var11 = var9 + 1;
        if (~arg1 >= ~var11) {
            var11 = 0;
        }
        int var12 = var9 & 255;
        int var13 = var10 + -4096;
        int var14 = 83 % ((30 - arg2) / 52);
        int var15 = 3 & this.field4077[var12 - -arg5];
        int var16 = class130.field2050[var10];
        int var17 = var11 & 255;
        int var18;
        if (var15 <= 1) {
            var18 = var15 != 0 ? -var10 + arg0 : arg0 + var10;
        } else {
            var18 = var15 == 2 ? -arg0 + var10 : -arg0 + -var10;
        }
        int var19 = this.field4077[arg5 + var17] & 3;
        int var20;
        if (~var19 >= -2) {
            var20 = var19 != 0 ? -var13 + arg0 : arg0 + var13;
        } else {
            var20 = var19 != 2 ? -arg0 + -var13 : -arg0 + var13;
        }
        int var21 = this.field4077[arg6 + var12] & 3;
        int var22 = var18 - -((-var18 + var20) * var16 >> 12);
        int var23;
        if (var21 <= 1) {
            var23 = ~var21 == -1 ? var10 - -var8 : var8 - var10;
        } else {
            var23 = ~var21 == -3 ? -var8 + var10 : -var8 + -var10;
        }
        int var24 = 3 & this.field4077[arg6 + var17];
        int var25;
        if (var24 > 1) {
            var25 = ~var24 != -3 ? -var8 + -var13 : -var8 + var13;
        } else {
            var25 = ~var24 == -1 ? var13 - -var8 : -var13 + var8;
        }
        int var26 = ((-var23 + var25) * var16 >> 12) + var23;
        return ((var26 - var22) * arg3 >> 12) + var22;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        ++field4064;
        if (arg1 <= 11) {
            this.field4067 = 20;
        }
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field4068 = arg0.method633(56);
            } else {
                if (~arg2 != -3) {
                    if (~arg2 == -4) {
                        this.field4074 = this.field4080 = arg0.method633(50);
                        return;
                    }
                    if (arg2 == 4) {
                        this.field4070 = arg0.method633(51);
                        return;
                    }
                    if (~arg2 == -6) {
                        this.field4074 = arg0.method633(90);
                        return;
                    }
                    if (arg2 == 6) {
                        this.field4080 = arg0.method633(71);
                        return;
                    }
                } else {
                    this.field4067 = arg0.method649(-2);
                    if (~this.field4067 > -1) {
                        this.field4079 = new short[this.field4068];
                        for (int var5 = 0; ~var5 > ~this.field4068; ++var5) {
                            this.field4079[var5] = (short) arg0.method649(-2);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field4073 = ~arg0.method633(89) == -2;
        }
    }

    @OriginalMember(owner = "client!o", name = "i", descriptor = "(B)V")
    private final void method1731(byte arg0) {
        if (arg0 == -60) {
            if (~this.field4067 >= -1) {
                if (this.field4079 != null && this.field4079.length == this.field4068) {
                    this.field4072 = new short[this.field4068];
                    for (int var2 = 0; ~var2 > ~this.field4068; ++var2) {
                        this.field4072[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                    }
                }
            } else {
                this.field4072 = new short[this.field4068];
                this.field4079 = new short[this.field4068];
                for (int var3 = 0; ~var3 > ~this.field4068; ++var3) {
                    this.field4079[var3] = (short) ((int) (Math.pow((double) ((float) this.field4067 / 4096.0F), (double) var3) * 4096.0D));
                    this.field4072[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
            ++field4076;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([IIB)V")
    private final void method1732(int[] arg0, int arg1, byte arg2) {
        ++field4075;
        int var4 = class103.field1713[arg1] * this.field4080;
        if (arg2 > 18) {
            if (this.field4068 != 1) {
                short var5 = this.field4079[0];
                if (~var5 < -9 || var5 < -8) {
                    int var6 = this.field4072[0] << 12;
                    int var7 = this.field4074 * var6 >> 12;
                    int var8 = this.field4080 * var6 >> 12;
                    int var9 = var4 * var6 >> 12;
                    int var10 = var9 >> 12;
                    int var11 = this.field4077[var10 & 255] & 255;
                    int var12 = var9 & 4095;
                    int var13 = class130.field2050[var12];
                    int var14 = var10 + 1;
                    if (var14 >= var8) {
                        var14 = 0;
                    }
                    int var15 = 255 & this.field4077[var14 & 255];
                    for (int var16 = 0; ~var16 > ~class240.field3896; ++var16) {
                        int var36 = class190.field2946[var16] * this.field4074;
                        int var37 = this.method1730(var12, var7, 104, var13, var6 * var36 >> 12, var11, var15);
                        arg0[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; ~var17 > ~this.field4068; ++var17) {
                    short var18 = this.field4079[var17];
                    if (~var18 < -9 || ~var18 > 7) {
                        int var19 = this.field4072[var17] << 12;
                        int var20 = var4 * var19 >> 12;
                        int var21 = var20 >> 12;
                        int var22 = this.field4080 * var19 >> 12;
                        int var23 = var20 & 4095;
                        int var24 = class130.field2050[var23];
                        int var25 = this.field4074 * var19 >> 12;
                        int var26 = this.field4077[255 & var21] & 255;
                        int var27 = var21 - -1;
                        if (~var22 >= ~var27) {
                            var27 = 0;
                        }
                        int var28 = this.field4077[255 & var27] & 255;
                        if (this.field4073 && ~(this.field4068 + -1) == ~var17) {
                            for (int var29 = 0; var29 < class240.field3896; ++var29) {
                                int var30 = class190.field2946[var29] * this.field4074;
                                int var31 = this.method1730(var23, var25, -101, var24, var19 * var30 >> 12, var26, var28);
                                int var32 = (var18 * var31 >> 12) + arg0[var29];
                                arg0[var29] = (var32 >> 1) + 2048;
                            }
                        } else {
                            for (int var33 = 0; ~class240.field3896 < ~var33; ++var33) {
                                int var34 = class190.field2946[var33] * this.field4074;
                                int var35 = this.method1730(var23, var25, 119, var24, var19 * var34 >> 12, var26, var28);
                                arg0[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                int var38 = this.field4072[0] << 12;
                int var39 = this.field4074 * var38 >> 12;
                int var40 = this.field4080 * var38 >> 12;
                int var41 = var4 * var38 >> 12;
                int var42 = var41 >> 12;
                int var43 = var42 + 1;
                int var44 = var41 & 4095;
                int var45 = class130.field2050[var44];
                int var46 = 255 & this.field4077[255 & var42];
                if (~var43 <= ~var40) {
                    var43 = 0;
                }
                int var47 = this.field4077[var43 & 255] & 255;
                short var48 = this.field4079[0];
                if (!this.field4073) {
                    for (int var49 = 0; ~var49 > ~class240.field3896; ++var49) {
                        int var50 = class190.field2946[var49] * this.field4074;
                        int var51 = this.method1730(var44, var39, 101, var45, var38 * var50 >> 12, var46, var47);
                        arg0[var49] = var48 * var51 >> 12;
                    }
                } else {
                    for (int var52 = 0; ~class240.field3896 < ~var52; ++var52) {
                        int var53 = class190.field2946[var52] * this.field4074;
                        int var54 = this.method1730(var44, var39, 84, var45, var38 * var53 >> 12, var46, var47);
                        int var55 = var48 * var54 >> 12;
                        arg0[var52] = (var55 >> 1) + 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        if (arg1 != 57) {
            return null;
        } else {
            int[] var3 = super.field2488.method15((byte) 127, arg0);
            ++field4069;
            if (super.field2488.field42) {
                this.method1732(var3, arg0, (byte) 116);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IBLhc;I)[Led;")
    public static final class186[] method1733(int arg0, byte arg1, class235 arg2, int arg3) {
        ++field4071;
        int var4 = -50 % ((-31 - arg1) / 40);
        return !class212.method1440(arg3, arg2, arg0, 41) ? null : class81.method578((byte) 127);
    }

    @OriginalMember(owner = "client!o", name = "h", descriptor = "(B)V")
    public final void method210(byte arg0) {
        this.field4077 = class284.method1908(true, this.field4070);
        ++field4078;
        this.method1731((byte) -60);
        if (arg0 >= -124) {
            this.method1730(-38, -106, -86, -27, 46, 2, 91);
        }
        for (int var2 = this.field4068 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field4079[var2];
            if (~var3 < -9) {
                return;
            }
            if (var3 < -8) {
                return;
            }
            --this.field4068;
        }
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V")
    public static void method1734(int arg0) {
        if (arg0 > -63) {
            field4066 = null;
        }
        field4066 = null;
        field4065 = null;
    }
}
