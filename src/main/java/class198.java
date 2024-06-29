import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class198 extends class585 {

    @OriginalMember(owner = "client!c", name = "I", descriptor = "Z")
    public boolean field3023 = true;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "I")
    public int field3019 = 1638;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public int field3027 = 4;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "[B")
    private byte[] field3025 = new byte[512];

    @OriginalMember(owner = "client!c", name = "S", descriptor = "I")
    public int field3033 = 4;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "I")
    public int field3029 = 0;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "I")
    public int field3021 = 4;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    public static int field3020 = -1;

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "Lbu;")
    public static class21 field3031 = new class21(25, -2);

    @OriginalMember(owner = "client!c", name = "H", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!c", name = "P", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!c", name = "R", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!c", name = "T", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!c", name = "U", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!c", name = "V", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!c", name = "W", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "[S")
    private short[] field3024;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "[S")
    private short[] field3028;

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V", line = 4)
    public class198() {
        super(0, true);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lso;II)V", line = 9)
    public final void method54(class494 arg0, int arg1, int arg2) {
        ++field3034;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field3033 = arg0.method2964((byte) 104);
                                }
                            } else {
                                this.field3027 = arg0.method2964((byte) 47);
                            }
                        } else {
                            this.field3029 = arg0.method2964((byte) 118);
                        }
                    } else {
                        this.field3027 = this.field3033 = arg0.method2964((byte) 102);
                    }
                } else {
                    this.field3019 = arg0.method2988(-3);
                    if (~this.field3019 > -1) {
                        this.field3024 = new short[this.field3021];
                        for (int var5 = 0; ~this.field3021 < ~var5; ++var5) {
                            this.field3024[var5] = (short) arg0.method2988(-3);
                        }
                    }
                }
            } else {
                this.field3021 = arg0.method2964((byte) 56);
            }
        } else {
            this.field3023 = ~arg0.method2964((byte) 44) == -2;
        }
        if (arg1 != 1) {
            this.field3033 = 67;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lmea;I)Ljava/lang/String;", line = 101)
    public static final String method1365(class451 arg0, int arg1) {
        ++field3030;
        if (~client.method2046(arg0).method267((byte) 121) == -1) {
            return null;
        } else {
            if (arg1 != 6858) {
                method1367(94);
            }
            if (arg0.field6279 != null && arg0.field6279.trim().length() != 0) {
                return arg0.field6279;
            } else {
                return class81.field901 ? "Hidden-use" : null;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V", line = 130)
    private final void method1366(int arg0) {
        if (~this.field3019 < -1) {
            this.field3024 = new short[this.field3021];
            this.field3028 = new short[this.field3021];
            for (int var2 = 0; var2 < this.field3021; ++var2) {
                this.field3024[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field3019 / 4096.0F), (double) var2)));
                this.field3028[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field3024 != null && ~this.field3024.length == ~this.field3021) {
            this.field3028 = new short[this.field3021];
            for (int var3 = 0; this.field3021 > var3; ++var3) {
                this.field3028[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 != 0) {
            this.field3023 = false;
        }
        ++field3035;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V", line = 173)
    public static void method1367(int arg0) {
        field3031 = null;
        if (arg0 != -1386) {
            field3037 = -95;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZIIIII)I", line = 188)
    private final int method1368(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3036;
        int var8 = arg6 >> 12;
        int var9 = var8 + 1;
        if (~var9 <= ~arg3) {
            var9 = 0;
        }
        int var10 = arg6 & 4095;
        int var11 = var8 & 255;
        int var12 = arg4 + -4096;
        int var13 = var9 & 255;
        int var14 = var10 + -4096;
        int var15 = class202.field3143[var10];
        int var16 = this.field3025[arg2 + var11] & 3;
        int var17;
        if (var16 > 1) {
            var17 = var16 != 2 ? -arg4 + -var10 : -arg4 + var10;
        } else {
            var17 = ~var16 != -1 ? -var10 + arg4 : arg4 + var10;
        }
        int var18 = 3 & this.field3025[arg2 + var13];
        int var19;
        if (var18 <= 1) {
            var19 = ~var18 != -1 ? -var14 + arg4 : arg4 + var14;
        } else {
            var19 = var18 != 2 ? -var14 - arg4 : -arg4 + var14;
        }
        int var20 = this.field3025[arg5 + var11] & 3;
        if (!arg1) {
            return -60;
        } else {
            int var21 = var17 - -((-var17 + var19) * var15 >> 12);
            int var22;
            if (~var20 >= -2) {
                var22 = var20 != 0 ? -var10 + var12 : var10 + var12;
            } else {
                var22 = ~var20 != -3 ? -var10 - var12 : -var12 + var10;
            }
            int var23 = this.field3025[arg5 + var13] & 3;
            int var24;
            if (var23 <= 1) {
                var24 = var23 == 0 ? var14 - -var12 : var12 - var14;
            } else {
                var24 = var23 != 2 ? -var12 + -var14 : -var12 + var14;
            }
            int var25 = ((-var22 + var24) * var15 >> 12) + var22;
            return ((-var21 + var25) * arg0 >> 12) + var21;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II)[I", line = 264)
    public final int[] method55(int arg0, int arg1) {
        ++field3022;
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (arg1 < 123) {
            this.method52(18);
        }
        if (super.field8255.field3677) {
            this.method1369(104, arg0, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II[I)V", line = 286)
    public final void method1369(int arg0, int arg1, int[] arg2) {
        ++field3026;
        int var4 = class633.field8892[arg1] * this.field3033;
        if (arg0 > 14) {
            if (this.field3021 != 1) {
                short var5 = this.field3024[0];
                if (~var5 < -9 || ~var5 > 7) {
                    int var6 = this.field3028[0] << 12;
                    int var7 = this.field3033 * var6 >> 12;
                    int var8 = this.field3027 * var6 >> 12;
                    int var9 = var4 * var6 >> 12;
                    int var10 = var9 >> 12;
                    int var11 = var10 + 1;
                    if (~var11 <= ~var7) {
                        var11 = 0;
                    }
                    int var12 = var9 & 4095;
                    int var13 = class202.field3143[var12];
                    int var14 = 255 & this.field3025[255 & var11];
                    int var15 = 255 & this.field3025[255 & var10];
                    for (int var16 = 0; class293.field4278 > var16; ++var16) {
                        int var36 = class581.field8200[var16] * this.field3027;
                        int var37 = this.method1368(var13, true, var15, var8, var12, var14, var6 * var36 >> 12);
                        arg2[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; ~this.field3021 < ~var17; ++var17) {
                    short var18 = this.field3024[var17];
                    if (~var18 < -9 || var18 < -8) {
                        int var19 = this.field3028[var17] << 12;
                        int var20 = this.field3027 * var19 >> 12;
                        int var21 = var4 * var19 >> 12;
                        int var22 = this.field3033 * var19 >> 12;
                        int var23 = var21 >> 12;
                        int var24 = var23 + 1;
                        if (var22 <= var24) {
                            var24 = 0;
                        }
                        int var25 = var21 & 4095;
                        int var26 = 255 & this.field3025[255 & var23];
                        int var27 = this.field3025[var24 & 255] & 255;
                        int var28 = class202.field3143[var25];
                        if (this.field3023 && ~(this.field3021 - 1) == ~var17) {
                            for (int var29 = 0; ~class293.field4278 < ~var29; ++var29) {
                                int var30 = class581.field8200[var29] * this.field3027;
                                int var31 = this.method1368(var28, true, var26, var20, var25, var27, var19 * var30 >> 12);
                                int var32 = (var18 * var31 >> 12) + arg2[var29];
                                arg2[var29] = (var32 >> 1) + 2048;
                            }
                        } else {
                            for (int var33 = 0; class293.field4278 > var33; ++var33) {
                                int var34 = class581.field8200[var33] * this.field3027;
                                int var35 = this.method1368(var28, true, var26, var20, var25, var27, var19 * var34 >> 12);
                                arg2[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                short var38 = this.field3024[0];
                int var39 = this.field3028[0] << 12;
                int var40 = this.field3027 * var39 >> 12;
                int var41 = this.field3033 * var39 >> 12;
                int var42 = var4 * var39 >> 12;
                int var43 = var42 >> 12;
                int var44 = var43 - -1;
                if (~var44 <= ~var41) {
                    var44 = 0;
                }
                int var45 = var42 & 4095;
                int var46 = class202.field3143[var45];
                int var47 = this.field3025[var43 & 255] & 255;
                int var48 = 255 & this.field3025[var44 & 255];
                if (this.field3023) {
                    for (int var49 = 0; class293.field4278 > var49; ++var49) {
                        int var50 = class581.field8200[var49] * this.field3027;
                        int var51 = this.method1368(var46, true, var47, var40, var45, var48, var39 * var50 >> 12);
                        int var52 = var38 * var51 >> 12;
                        arg2[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; class293.field4278 > var53; ++var53) {
                        int var54 = class581.field8200[var53] * this.field3027;
                        int var55 = this.method1368(var46, true, var47, var40, var45, var48, var39 * var54 >> 12);
                        arg2[var53] = var38 * var55 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 446)
    public final void method52(int arg0) {
        this.field3025 = class31.method258(this.field3029, (byte) 32);
        ++field3032;
        this.method1366(0);
        if (arg0 == -4096) {
            for (int var2 = this.field3021 + -1; ~var2 <= -2; --var2) {
                short var3 = this.field3024[var2];
                if (var3 > 8 || ~var3 > 7) {
                    return;
                }
                --this.field3021;
            }
        }
    }
}
