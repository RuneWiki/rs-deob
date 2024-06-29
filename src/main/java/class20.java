import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class20 extends class298 {

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "[B")
    private byte[] field272 = new byte[512];

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "Z")
    public boolean field273 = true;

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "I")
    public int field277 = 0;

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "I")
    public int field276 = 4;

    @OriginalMember(owner = "client!hd", name = "Z", descriptor = "I")
    public int field281 = 4;

    @OriginalMember(owner = "client!hd", name = "bb", descriptor = "I")
    public int field283 = 4;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
    public int field267 = 1638;

    @OriginalMember(owner = "client!hd", name = "Y", descriptor = "I")
    public static int field280 = -1;

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "[I")
    public static int[] field274 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!hd", name = "fb", descriptor = "I")
    public static int field287 = 0;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!hd", name = "X", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!hd", name = "ab", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!hd", name = "cb", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!hd", name = "db", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!hd", name = "eb", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "[S")
    private short[] field269;

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "[S")
    private short[] field278;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([III)V", line = 3)
    public final void method127(int[] arg0, int arg1, int arg2) {
        ++field271;
        if (arg2 < 61) {
            this.method131(113, 33, 71, 62, -42, -115, 23);
        }
        int var4 = class156.field1865[arg1] * this.field276;
        if (~this.field281 != -2) {
            short var5 = this.field278[0];
            if (var5 > 8 || ~var5 > 7) {
                int var6 = this.field269[0] << 12;
                int var7 = var4 * var6 >> 12;
                int var8 = this.field283 * var6 >> 12;
                int var9 = this.field276 * var6 >> 12;
                int var10 = var7 >> 12;
                int var11 = var10 + 1;
                int var12 = var7 & 4095;
                if (~var11 <= ~var9) {
                    var11 = 0;
                }
                int var13 = 255 & this.field272[var10 & 255];
                int var14 = 255 & this.field272[var11 & 255];
                int var15 = class432.field6251[var12];
                for (int var16 = 0; class158.field1877 > var16; ++var16) {
                    int var36 = class236.field3260[var16] * this.field283;
                    int var37 = this.method131(var12, -4096, var6 * var36 >> 12, var15, var13, var8, var14);
                    arg0[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; ~var17 > ~this.field281; ++var17) {
                short var18 = this.field278[var17];
                if (~var18 < -9 || ~var18 > 7) {
                    int var19 = this.field269[var17] << 12;
                    int var20 = this.field276 * var19 >> 12;
                    int var21 = var4 * var19 >> 12;
                    int var22 = this.field283 * var19 >> 12;
                    int var23 = var21 >> 12;
                    int var24 = var23 + 1;
                    int var25 = var21 & 4095;
                    if (~var20 >= ~var24) {
                        var24 = 0;
                    }
                    int var26 = class432.field6251[var25];
                    int var27 = 255 & this.field272[var23 & 255];
                    int var28 = this.field272[255 & var24] & 255;
                    if (this.field273 && ~(this.field281 + -1) == ~var17) {
                        for (int var29 = 0; ~class158.field1877 < ~var29; ++var29) {
                            int var30 = class236.field3260[var29] * this.field283;
                            int var31 = this.method131(var25, -4096, var19 * var30 >> 12, var26, var27, var22, var28);
                            int var32 = arg0[var29] - -(var18 * var31 >> 12);
                            arg0[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; var33 < class158.field1877; ++var33) {
                            int var34 = class236.field3260[var33] * this.field283;
                            int var35 = this.method131(var25, -4096, var19 * var34 >> 12, var26, var27, var22, var28);
                            arg0[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            int var38 = this.field269[0] << 12;
            short var39 = this.field278[0];
            int var40 = var4 * var38 >> 12;
            int var41 = this.field283 * var38 >> 12;
            int var42 = this.field276 * var38 >> 12;
            int var43 = var40 >> 12;
            int var44 = var43 + 1;
            int var45 = var40 & 4095;
            if (var44 >= var42) {
                var44 = 0;
            }
            int var46 = class432.field6251[var45];
            int var47 = 255 & this.field272[255 & var43];
            int var48 = 255 & this.field272[var44 & 255];
            if (this.field273) {
                for (int var49 = 0; ~var49 > ~class158.field1877; ++var49) {
                    int var50 = class236.field3260[var49] * this.field283;
                    int var51 = this.method131(var45, -4096, var38 * var50 >> 12, var46, var47, var41, var48);
                    int var52 = var39 * var51 >> 12;
                    arg0[var49] = (var52 >> 1) + 2048;
                }
            } else {
                for (int var53 = 0; ~class158.field1877 < ~var53; ++var53) {
                    int var54 = class236.field3260[var53] * this.field283;
                    int var55 = this.method131(var45, -4096, var38 * var54 >> 12, var46, var47, var41, var48);
                    arg0[var53] = var39 * var55 >> 12;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(III)I", line = 166)
    public static final int method128(int arg0, int arg1, int arg2) {
        ++field279;
        int var3 = arg2 * 57 + arg0;
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * 15731 * var4 - arg1) * var4 - -1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 255;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILvt;)V", line = 180)
    public final void method10(int arg0, int arg1, class179 arg2) {
        ++field286;
        if (arg0 >= -44) {
            this.field273 = true;
        }
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field281 = arg2.method895((byte) -75);
            } else {
                if (~arg1 != -3) {
                    if (arg1 == 3) {
                        this.field283 = this.field276 = arg2.method895((byte) -124);
                        return;
                    }
                    if (arg1 == 4) {
                        this.field277 = arg2.method895((byte) -127);
                        return;
                    }
                    if (arg1 == 5) {
                        this.field283 = arg2.method895((byte) -117);
                        return;
                    }
                    if (~arg1 == -7) {
                        this.field276 = arg2.method895((byte) -86);
                        return;
                    }
                } else {
                    this.field267 = arg2.method906(-91);
                    if (this.field267 < 0) {
                        this.field278 = new short[this.field281];
                        for (int var5 = 0; ~var5 > ~this.field281; ++var5) {
                            this.field278[var5] = (short) arg2.method906(-91);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field273 = ~arg2.method895((byte) -91) == -2;
        }
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(III)I", line = 276)
    public static final int method129(int arg0, int arg1, int arg2) {
        if (arg1 != 3) {
            method129(127, -90, 119);
        }
        ++field285;
        return arg2 != 4 && arg2 != 5 ? 256 : class481.field6800[3 & arg0];
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V", line = 291)
    public final void method15(int arg0) {
        ++field284;
        this.field272 = class269.method1628(this.field277, 511);
        this.method130(true);
        for (int var2 = this.field281 - 1; ~var2 <= -2; --var2) {
            short var3 = this.field278[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            --this.field281;
        }
        if (arg0 >= -41) {
            this.field281 = -95;
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(Z)V", line = 321)
    private final void method130(boolean arg0) {
        ++field268;
        if (!arg0) {
            field287 = -55;
        }
        if (~this.field267 >= -1) {
            if (this.field278 != null && ~this.field278.length == ~this.field281) {
                this.field269 = new short[this.field281];
                for (int var2 = 0; ~var2 > ~this.field281; ++var2) {
                    this.field269[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
                return;
            }
        } else {
            this.field278 = new short[this.field281];
            this.field269 = new short[this.field281];
            for (int var3 = 0; ~var3 > ~this.field281; ++var3) {
                this.field278[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field267 / 4096.0F), (double) var3)));
                this.field269[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V", line = 488)
    public class20() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ)[I", line = 385)
    public final int[] method13(int arg0, boolean arg1) {
        ++field282;
        if (!arg1) {
            this.method13(-67, true);
        }
        int[] var3 = super.field4443.method2877(arg0, 1);
        if (super.field4443.field6915) {
            this.method127(var3, arg0, 67);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIII)I", line = 416)
    private final int method131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field275;
        int var8 = arg2 >> 12;
        int var9 = var8 - -1;
        int var10 = arg2 & 4095;
        if (~var9 <= ~arg5) {
            var9 = 0;
        }
        int var11 = var8 & 255;
        int var12 = var9 & 255;
        int var13 = arg0 - 4096;
        int var14 = arg1 + var10;
        int var15 = 3 & this.field272[arg4 + var11];
        int var16 = class432.field6251[var10];
        int var17;
        if (~var15 < -2) {
            var17 = ~var15 == -3 ? -arg0 + var10 : -arg0 + -var10;
        } else {
            var17 = ~var15 == -1 ? arg0 + var10 : -var10 + arg0;
        }
        int var18 = 3 & this.field272[var12 - -arg4];
        int var19;
        if (~var18 < -2) {
            var19 = var18 != 2 ? -arg0 + -var14 : var14 - arg0;
        } else {
            var19 = var18 == 0 ? var14 - -arg0 : arg0 - var14;
        }
        int var20 = ((-var17 + var19) * var16 >> 12) + var17;
        int var21 = 3 & this.field272[arg6 + var11];
        int var22;
        if (~var21 < -2) {
            var22 = var21 != 2 ? -var10 + -var13 : -var13 + var10;
        } else {
            var22 = ~var21 == -1 ? var10 + var13 : -var10 + var13;
        }
        int var23 = this.field272[var12 - -arg6] & 3;
        int var24;
        if (~var23 >= -2) {
            var24 = var23 != 0 ? var13 - var14 : var14 - -var13;
        } else {
            var24 = ~var23 == -3 ? -var13 + var14 : -var14 - var13;
        }
        int var25 = var22 - -((var24 - var22) * var16 >> 12);
        return ((-var20 + var25) * arg3 >> 12) + var20;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V", line = 495)
    public static void method132(int arg0) {
        if (arg0 != 0) {
            method129(-18, -97, 22);
        }
        field274 = null;
    }
}
