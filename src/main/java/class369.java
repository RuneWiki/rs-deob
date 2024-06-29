import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class369 extends class404 {

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "[B")
    private byte[] field5411 = new byte[512];

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
    public int field5420 = 4;

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "I")
    public int field5418 = 4;

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "I")
    public int field5416 = 4;

    @OriginalMember(owner = "client!gh", name = "R", descriptor = "Z")
    public boolean field5427 = true;

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "I")
    public int field5410 = 0;

    @OriginalMember(owner = "client!gh", name = "T", descriptor = "I")
    public int field5429 = 1638;

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "I")
    public static int field5413 = -1;

    @OriginalMember(owner = "client!gh", name = "O", descriptor = "I")
    public static int field5424 = 0;

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "[I")
    public static int[] field5422 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!gh", name = "V", descriptor = "Lbg;")
    public static class310 field5431;

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!gh", name = "N", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!gh", name = "P", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!gh", name = "Q", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!gh", name = "U", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!gh", name = "S", descriptor = "Lll;")
    public static class235 field5428;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "[S")
    private short[] field5409;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "[S")
    private short[] field5412;

    static {
        new class423("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field5431 = new class310(53, -1);
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V", line = 3)
    public final void method211(int arg0) {
        this.field5411 = class128.method867(this.field5410, -19333);
        ++field5415;
        if (arg0 != -3) {
            this.field5418 = -32;
        }
        this.method2240(arg0 ^ 66);
        for (int var2 = this.field5420 - 1; ~var2 <= -2; --var2) {
            short var3 = this.field5412[var2];
            if (~var3 < -9) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field5420;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILha;I)V", line = 32)
    public final void method87(int arg0, class40 arg1, int arg2) {
        ++field5425;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field5418 = arg1.method257((byte) 58);
                                }
                            } else {
                                this.field5416 = arg1.method257((byte) 120);
                            }
                        } else {
                            this.field5410 = arg1.method257((byte) 70);
                        }
                    } else {
                        this.field5416 = this.field5418 = arg1.method257((byte) 66);
                    }
                } else {
                    this.field5429 = arg1.method249(false);
                    if (~this.field5429 > -1) {
                        this.field5412 = new short[this.field5420];
                        for (int var5 = 0; this.field5420 > var5; ++var5) {
                            this.field5412[var5] = (short) arg1.method249(false);
                        }
                    }
                }
            } else {
                this.field5420 = arg1.method257((byte) 31);
            }
        } else {
            this.field5427 = ~arg1.method257((byte) 22) == -2;
        }
        if (arg0 != 0) {
            method2237((byte) 77, -28, -81);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([IBI)V", line = 126)
    public final void method2235(int[] arg0, byte arg1, int arg2) {
        ++field5430;
        int var4 = class289.field4381[arg2] * this.field5418;
        if (arg1 > 62) {
            if (this.field5420 != 1) {
                short var5 = this.field5412[0];
                if (var5 > 8 || ~var5 > 7) {
                    int var6 = this.field5409[0] << 12;
                    int var7 = this.field5418 * var6 >> 12;
                    int var8 = this.field5416 * var6 >> 12;
                    int var9 = var4 * var6 >> 12;
                    int var10 = var9 >> 12;
                    int var11 = var10 + 1;
                    int var12 = var9 & 4095;
                    if (~var11 <= ~var7) {
                        var11 = 0;
                    }
                    int var13 = this.field5411[255 & var10] & 255;
                    int var14 = class383.field5580[var12];
                    int var15 = 255 & this.field5411[var11 & 255];
                    for (int var16 = 0; class431.field6348 > var16; ++var16) {
                        int var36 = class167.field2594[var16] * this.field5416;
                        int var37 = this.method2239(var8, var13, var14, var12, (byte) -19, var6 * var36 >> 12, var15);
                        arg0[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; this.field5420 > var17; ++var17) {
                    short var18 = this.field5412[var17];
                    if (var18 > 8 || var18 < -8) {
                        int var19 = this.field5409[var17] << 12;
                        int var20 = this.field5416 * var19 >> 12;
                        int var21 = var4 * var19 >> 12;
                        int var22 = this.field5418 * var19 >> 12;
                        int var23 = var21 >> 12;
                        int var24 = var23 - -1;
                        int var25 = var21 & 4095;
                        if (var22 <= var24) {
                            var24 = 0;
                        }
                        int var26 = class383.field5580[var25];
                        int var27 = 255 & this.field5411[255 & var24];
                        int var28 = 255 & this.field5411[255 & var23];
                        if (this.field5427 && this.field5420 + -1 == var17) {
                            for (int var29 = 0; class431.field6348 > var29; ++var29) {
                                int var30 = class167.field2594[var29] * this.field5416;
                                int var31 = this.method2239(var20, var28, var26, var25, (byte) -43, var19 * var30 >> 12, var27);
                                int var32 = (var18 * var31 >> 12) + arg0[var29];
                                arg0[var29] = (var32 >> 1) + 2048;
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~class431.field6348; ++var33) {
                                int var34 = class167.field2594[var33] * this.field5416;
                                int var35 = this.method2239(var20, var28, var26, var25, (byte) -35, var19 * var34 >> 12, var27);
                                arg0[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                short var38 = this.field5412[0];
                int var39 = this.field5409[0] << 12;
                int var40 = this.field5418 * var39 >> 12;
                int var41 = var4 * var39 >> 12;
                int var42 = this.field5416 * var39 >> 12;
                int var43 = var41 >> 12;
                int var44 = var43 - -1;
                int var45 = var41 & 4095;
                if (~var40 >= ~var44) {
                    var44 = 0;
                }
                int var46 = class383.field5580[var45];
                int var47 = this.field5411[255 & var43] & 255;
                int var48 = 255 & this.field5411[var44 & 255];
                if (this.field5427) {
                    for (int var49 = 0; var49 < class431.field6348; ++var49) {
                        int var50 = class167.field2594[var49] * this.field5416;
                        int var51 = this.method2239(var42, var47, var46, var45, (byte) -94, var39 * var50 >> 12, var48);
                        int var52 = var38 * var51 >> 12;
                        arg0[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; ~class431.field6348 < ~var53; ++var53) {
                        int var54 = class167.field2594[var53] * this.field5416;
                        int var55 = this.method2239(var42, var47, var46, var45, (byte) -70, var39 * var54 >> 12, var48);
                        arg0[var53] = var38 * var55 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)[I", line = 288)
    public final int[] method90(int arg0, int arg1) {
        ++field5417;
        int[] var3 = super.field5870.method372(arg1, (byte) 57);
        if (super.field5870.field810) {
            this.method2235(var3, (byte) 117, arg1);
        }
        if (arg0 >= -47) {
            this.method2235((int[]) null, (byte) -3, -1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "(I)V", line = 311)
    public static void method2236(int arg0) {
        field5422 = null;
        field5431 = null;
        field5428 = null;
        if (arg0 != 28667) {
            method2236(25);
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V", line = 492)
    public class369() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(BII)V", line = 336)
    public static final void method2237(byte arg0, int arg1, int arg2) {
        ++field5414;
        class64 var3 = class230.method1387(arg1, (byte) 40, 1);
        var3.method441((byte) 58);
        var3.field1051 = arg2;
        if (arg0 >= -21) {
            field5428 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BIIII)I", line = 353)
    public static final int method2238(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5419;
        if (arg0 != -128) {
            field5431 = null;
        }
        int var5 = arg1 & 15;
        int var6 = var5 >= 8 ? arg3 : arg2;
        int var7 = ~var5 > -5 ? arg3 : (~var5 != -13 && var5 != 14 ? arg4 : arg2);
        return ((var5 & 1) != 0 ? -var6 : var6) + (~(2 & var5) == -1 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIBII)I", line = 374)
    private final int method2239(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field5421;
        int var8 = arg5 >> 12;
        int var9 = var8 + 1;
        if (~arg0 >= ~var9) {
            var9 = 0;
        }
        int var10 = var8 & 255;
        int var11 = arg5 & 4095;
        int var12 = var11 + -4096;
        int var13 = var9 & 255;
        int var14 = arg3 - 4096;
        int var15 = class383.field5580[var11];
        int var16 = this.field5411[arg1 + var10] & 3;
        if (arg4 >= -14) {
            this.field5416 = -120;
        }
        int var17;
        if (var16 > 1) {
            var17 = var16 != 2 ? -arg3 + -var11 : -arg3 + var11;
        } else {
            var17 = ~var16 == -1 ? arg3 + var11 : -var11 + arg3;
        }
        int var18 = 3 & this.field5411[arg1 + var13];
        int var19;
        if (var18 <= 1) {
            var19 = ~var18 != -1 ? -var12 + arg3 : arg3 + var12;
        } else {
            var19 = var18 == 2 ? -arg3 + var12 : -var12 - arg3;
        }
        int var20 = this.field5411[arg6 + var10] & 3;
        int var21 = var17 - -((var19 - var17) * var15 >> 12);
        int var22;
        if (~var20 < -2) {
            var22 = var20 == 2 ? -var14 + var11 : -var11 + -var14;
        } else {
            var22 = ~var20 != -1 ? var14 - var11 : var11 + var14;
        }
        int var23 = 3 & this.field5411[arg6 + var13];
        int var24;
        if (~var23 < -2) {
            var24 = var23 == 2 ? -var14 + var12 : -var12 + -var14;
        } else {
            var24 = ~var23 == -1 ? var12 + var14 : var14 - var12;
        }
        int var25 = ((-var22 + var24) * var15 >> 12) + var22;
        return var21 - -((-var21 + var25) * arg2 >> 12);
    }

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "(I)V", line = 453)
    private final void method2240(int arg0) {
        ++field5426;
        if (~this.field5429 >= -1) {
            if (this.field5412 != null && this.field5412.length == this.field5420) {
                this.field5409 = new short[this.field5420];
                for (int var2 = 0; ~this.field5420 < ~var2; ++var2) {
                    this.field5409[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field5412 = new short[this.field5420];
            this.field5409 = new short[this.field5420];
            for (int var3 = 0; ~var3 > ~this.field5420; ++var3) {
                this.field5412[var3] = (short) ((int) (Math.pow((double) ((float) this.field5429 / 4096.0F), (double) var3) * 4096.0D));
                this.field5409[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        int var4 = 96 % ((arg0 - 84) / 32);
    }
}
