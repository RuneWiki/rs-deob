import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class4 extends class224 {

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
    private int field47 = 4;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "Z")
    private boolean field46 = true;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "[B")
    private byte[] field50 = new byte[512];

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "I")
    private int field41 = 1638;

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "I")
    private int field53 = 0;

    @OriginalMember(owner = "client!vd", name = "Y", descriptor = "I")
    private int field57 = 4;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
    private int field45 = 4;

    @OriginalMember(owner = "client!vd", name = "X", descriptor = "I")
    public static int field56 = 0;

    @OriginalMember(owner = "client!vd", name = "db", descriptor = "I")
    public static int field62 = 0;

    @OriginalMember(owner = "client!vd", name = "eb", descriptor = "Lrh;")
    public static class46 field63 = new class46();

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!vd", name = "W", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!vd", name = "Z", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!vd", name = "ab", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!vd", name = "bb", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!vd", name = "cb", descriptor = "Lil;")
    public static class162 field61;

    @OriginalMember(owner = "client!vd", name = "fb", descriptor = "[Lwe;")
    public static class15[] field64;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "[S")
    private short[] field43;

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "[S")
    private short[] field52;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "[[[B")
    public static byte[][][] field49;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        ++field60;
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        if (super.field3625.field4425) {
            this.method22((byte) -79, var3, arg0);
        }
        if (!arg1) {
            this.method23(false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIII)I")
    private final int method17(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field55;
        int var8 = arg0 + -4096;
        if (arg3 != 4095) {
            return -46;
        } else {
            int var9 = arg1 >> 12;
            int var10 = var9 + 1;
            int var11 = var9 & 255;
            int var12 = 3 & this.field50[arg6 + var11];
            int var13 = arg1 & 4095;
            int var14 = var13 - 4096;
            int var15 = class202.field3159[var13];
            int var16;
            if (var12 > 1) {
                var16 = var12 != 2 ? -arg0 + -var13 : -arg0 + var13;
            } else {
                var16 = var12 == 0 ? var13 - -arg0 : -var13 + arg0;
            }
            if (arg2 <= var10) {
                var10 = 0;
            }
            int var17 = var10 & 255;
            int var18 = 3 & this.field50[arg6 + var17];
            int var19;
            if (~var18 < -2) {
                var19 = var18 != 2 ? -arg0 + -var14 : -arg0 + var14;
            } else {
                var19 = var18 != 0 ? -var14 + arg0 : var14 - -arg0;
            }
            int var20 = this.field50[arg5 + var11] & 3;
            int var21 = ((-var16 + var19) * var15 >> 12) + var16;
            int var22;
            if (var20 > 1) {
                var22 = var20 != 2 ? -var8 + -var13 : -var8 + var13;
            } else {
                var22 = var20 == 0 ? var8 + var13 : var8 - var13;
            }
            int var23 = this.field50[arg5 + var17] & 3;
            int var24;
            if (~var23 >= -2) {
                var24 = ~var23 == -1 ? var8 + var14 : var8 - var14;
            } else {
                var24 = ~var23 == -3 ? -var8 + var14 : -var14 - var8;
            }
            int var25 = ((-var22 + var24) * var15 >> 12) + var22;
            return ((-var21 + var25) * arg4 >> 12) + var21;
        }
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
    public final void method18(int arg0) {
        this.field50 = class74.method502(this.field53, -124);
        this.method23(true);
        if (arg0 < -4) {
            for (int var2 = this.field45 - 1; var2 >= 1; --var2) {
                short var3 = this.field43[var2];
                if (var3 > 8 || ~var3 > 7) {
                    break;
                }
                --this.field45;
            }
            ++field54;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(CI)Z")
    public static final boolean method19(char arg0, int arg1) {
        int var2 = -20 / ((48 - arg1) / 49);
        ++field42;
        return ~arg0 <= -49 && arg0 <= '9' || arg0 >= 'A' && ~arg0 >= -91 || arg0 >= 'a' && ~arg0 >= -123;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method20(String arg0, int arg1) {
        ++field51;
        if (arg1 != 23491) {
            return 3;
        } else if (class107.field1644 != null && arg0.length() != 0) {
            for (int var2 = 0; var2 < class107.field1644.field1110; ++var2) {
                if (class90.method605(class33.method266(" ", class107.field1644.field1112[var2], 0, "<br>"), arg0, 120)) {
                    return var2;
                }
            }
            return -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field57 = arg0.method201(255);
                                }
                            } else {
                                this.field47 = arg0.method201(255);
                            }
                        } else {
                            this.field53 = arg0.method201(255);
                        }
                    } else {
                        this.field47 = this.field57 = arg0.method201(255);
                    }
                } else {
                    this.field41 = arg0.method226(255);
                    if (~this.field41 > -1) {
                        this.field43 = new short[this.field45];
                        for (int var5 = 0; var5 < this.field45; ++var5) {
                            this.field43[var5] = (short) arg0.method226(255);
                        }
                    }
                }
            } else {
                this.field45 = arg0.method201(255);
            }
        } else {
            this.field46 = ~arg0.method201(255) == -2;
        }
        if (arg2 >= -46) {
            method21(-10);
        }
        ++field44;
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)V")
    public static void method21(int arg0) {
        if (arg0 == 17237) {
            field61 = null;
            field49 = null;
            field64 = null;
            field63 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B[II)V")
    private final void method22(byte arg0, int[] arg1, int arg2) {
        ++field58;
        if (arg0 > -3) {
            this.method16((class25) null, -17, (byte) -127);
        }
        int var4 = class251.field4018[arg2] * this.field57;
        if (~this.field45 != -2) {
            short var5 = this.field43[0];
            if (var5 > 8 || var5 < -8) {
                int var6 = this.field52[0] << 12;
                int var7 = var4 * var6 >> 12;
                int var8 = var7 >> 12;
                int var9 = 255 & this.field50[255 & var8];
                int var10 = var7 & 4095;
                int var11 = class202.field3159[var10];
                int var12 = var8 + 1;
                int var13 = this.field47 * var6 >> 12;
                int var14 = this.field57 * var6 >> 12;
                if (~var14 >= ~var12) {
                    var12 = 0;
                }
                int var15 = this.field50[255 & var12] & 255;
                for (int var16 = 0; class78.field1108 > var16; ++var16) {
                    int var36 = class243.field3893[var16] * this.field47;
                    int var37 = this.method17(var10, var6 * var36 >> 12, var13, 4095, var11, var15, var9);
                    arg1[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; this.field45 > var17; ++var17) {
                short var18 = this.field43[var17];
                if (~var18 < -9 || var18 < -8) {
                    int var19 = this.field52[var17] << 12;
                    int var20 = var4 * var19 >> 12;
                    int var21 = this.field57 * var19 >> 12;
                    int var22 = var20 >> 12;
                    int var23 = 255 & this.field50[var22 & 255];
                    int var24 = this.field47 * var19 >> 12;
                    int var25 = var22 + 1;
                    int var26 = var20 & 4095;
                    if (~var21 >= ~var25) {
                        var25 = 0;
                    }
                    int var27 = this.field50[var25 & 255] & 255;
                    int var28 = class202.field3159[var26];
                    if (this.field46 && this.field45 + -1 == var17) {
                        for (int var29 = 0; ~class78.field1108 < ~var29; ++var29) {
                            int var30 = class243.field3893[var29] * this.field47;
                            int var31 = this.method17(var26, var19 * var30 >> 12, var24, 4095, var28, var27, var23);
                            int var32 = (var18 * var31 >> 12) + arg1[var29];
                            arg1[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; ~var33 > ~class78.field1108; ++var33) {
                            int var34 = class243.field3893[var33] * this.field47;
                            int var35 = this.method17(var26, var19 * var34 >> 12, var24, 4095, var28, var27, var23);
                            arg1[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            short var38 = this.field43[0];
            int var39 = this.field52[0] << 12;
            int var40 = this.field47 * var39 >> 12;
            int var41 = var4 * var39 >> 12;
            int var42 = this.field57 * var39 >> 12;
            int var43 = var41 >> 12;
            int var44 = 255 & this.field50[var43 & 255];
            int var45 = var43 + 1;
            if (~var42 >= ~var45) {
                var45 = 0;
            }
            int var46 = 255 & this.field50[255 & var45];
            int var47 = var41 & 4095;
            int var48 = class202.field3159[var47];
            if (!this.field46) {
                for (int var49 = 0; class78.field1108 > var49; ++var49) {
                    int var50 = class243.field3893[var49] * this.field47;
                    int var51 = this.method17(var47, var39 * var50 >> 12, var40, 4095, var48, var46, var44);
                    arg1[var49] = var38 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; ~var52 > ~class78.field1108; ++var52) {
                    int var53 = class243.field3893[var52] * this.field47;
                    int var54 = this.method17(var47, var39 * var53 >> 12, var40, 4095, var48, var46, var44);
                    int var55 = var38 * var54 >> 12;
                    arg1[var52] = (var55 >> 1) + 2048;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(Z)V")
    private final void method23(boolean arg0) {
        if (arg0) {
            if (this.field41 <= 0) {
                if (this.field43 != null && ~this.field43.length == ~this.field45) {
                    this.field52 = new short[this.field45];
                    for (int var2 = 0; ~this.field45 < ~var2; ++var2) {
                        this.field52[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                    }
                }
            } else {
                this.field52 = new short[this.field45];
                this.field43 = new short[this.field45];
                for (int var3 = 0; ~this.field45 < ~var3; ++var3) {
                    this.field43[var3] = (short) ((int) (Math.pow((double) ((float) this.field41 / 4096.0F), (double) var3) * 4096.0D));
                    this.field52[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
            ++field48;
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class4() {
        super(0, true);
    }
}
