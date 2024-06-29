import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class517 extends class337 {

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "I")
    public int field7513 = 4;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    public int field7516 = 4;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
    public int field7521 = 4;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "I")
    public int field7515 = 0;

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "[B")
    private byte[] field7523 = new byte[512];

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "Z")
    public boolean field7529 = true;

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "I")
    public int field7525 = 1638;

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "[I")
    public static int[] field7526 = new int[500];

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    public static int field7517 = 0;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
    public static int field7520;

    @OriginalMember(owner = "client!pg", name = "O", descriptor = "I")
    public static int field7524;

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
    public static int field7528;

    @OriginalMember(owner = "client!pg", name = "V", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "I")
    public static int field7532;

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "Lmm;")
    public static class186 field7530;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "[Ljr;")
    public static class74[] field7512;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "[S")
    private short[] field7514;

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "[S")
    private short[] field7522;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "(I)V", line = 3)
    public static void method3063(int arg0) {
        field7530 = null;
        field7512 = null;
        int var1 = 2 % ((-85 - arg0) / 37);
        field7526 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIBIIII)I", line = 22)
    private final int method3064(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7528;
        int var8 = arg5 >> 12;
        int var9 = var8 + 1;
        if (var9 >= arg1) {
            var9 = 0;
        }
        int var10 = arg5 & 4095;
        int var11 = var8 & 255;
        int var12 = var9 & 255;
        int var13 = arg4 - 4096;
        int var14 = var10 + -4096;
        int var15 = this.field7523[var11 - -arg0] & 3;
        int var16 = class443.field6511[var10];
        int var17;
        if (~var15 >= -2) {
            var17 = var15 != 0 ? arg4 - var10 : arg4 + var10;
        } else {
            var17 = ~var15 == -3 ? -arg4 + var10 : -arg4 + -var10;
        }
        int var18 = 3 & this.field7523[arg0 + var12];
        int var19;
        if (~var18 >= -2) {
            var19 = ~var18 == -1 ? arg4 + var14 : -var14 + arg4;
        } else {
            var19 = ~var18 == -3 ? -arg4 + var14 : -arg4 + -var14;
        }
        int var20 = ((-var17 + var19) * var16 >> 12) + var17;
        int var21 = this.field7523[arg6 + var11] & 3;
        int var22;
        if (var21 <= 1) {
            var22 = ~var21 == -1 ? var10 + var13 : -var10 + var13;
        } else {
            var22 = ~var21 == -3 ? -var13 + var10 : -var10 + -var13;
        }
        int var23 = this.field7523[var12 - -arg6] & 3;
        int var24;
        if (var23 <= 1) {
            var24 = var23 == 0 ? var14 - -var13 : -var14 + var13;
        } else {
            var24 = ~var23 == -3 ? -var13 + var14 : -var13 + -var14;
        }
        int var25 = ((-var22 + var24) * var16 >> 12) + var22;
        if (arg2 != 118) {
            this.field7521 = -121;
        }
        return var20 - -((-var20 + var25) * arg3 >> 12);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II[I)V", line = 96)
    public final void method3065(int arg0, int arg1, int[] arg2) {
        ++field7518;
        int var4 = class505.field7381[arg1] * this.field7516;
        int var5 = 116 % ((arg0 - -61) / 55);
        if (this.field7513 == 1) {
            int var6 = this.field7522[0] << 12;
            short var7 = this.field7514[0];
            int var8 = var4 * var6 >> 12;
            int var9 = this.field7521 * var6 >> 12;
            int var10 = this.field7516 * var6 >> 12;
            int var11 = var8 >> 12;
            int var12 = var11 - -1;
            if (var10 <= var12) {
                var12 = 0;
            }
            int var13 = var8 & 4095;
            int var14 = this.field7523[255 & var11] & 255;
            int var15 = class443.field6511[var13];
            int var16 = 255 & this.field7523[255 & var12];
            if (this.field7529) {
                for (int var17 = 0; var17 < class402.field5977; ++var17) {
                    int var18 = class109.field1530[var17] * this.field7521;
                    int var19 = this.method3064(var14, var9, (byte) 118, var15, var13, var6 * var18 >> 12, var16);
                    int var20 = var7 * var19 >> 12;
                    arg2[var17] = (var20 >> 1) + 2048;
                }
            } else {
                for (int var21 = 0; ~var21 > ~class402.field5977; ++var21) {
                    int var22 = class109.field1530[var21] * this.field7521;
                    int var23 = this.method3064(var14, var9, (byte) 118, var15, var13, var6 * var22 >> 12, var16);
                    arg2[var21] = var7 * var23 >> 12;
                }
            }
        } else {
            short var24 = this.field7514[0];
            if (var24 > 8 || var24 < -8) {
                int var25 = this.field7522[0] << 12;
                int var26 = this.field7521 * var25 >> 12;
                int var27 = this.field7516 * var25 >> 12;
                int var28 = var4 * var25 >> 12;
                int var29 = var28 >> 12;
                int var30 = var29 - -1;
                if (~var30 <= ~var27) {
                    var30 = 0;
                }
                int var31 = var28 & 4095;
                int var32 = this.field7523[255 & var29] & 255;
                int var33 = class443.field6511[var31];
                int var34 = 255 & this.field7523[255 & var30];
                for (int var35 = 0; var35 < class402.field5977; ++var35) {
                    int var55 = class109.field1530[var35] * this.field7521;
                    int var56 = this.method3064(var32, var26, (byte) 118, var33, var31, var25 * var55 >> 12, var34);
                    arg2[var35] = var24 * var56 >> 12;
                }
            }
            for (int var36 = 1; ~this.field7513 < ~var36; ++var36) {
                short var37 = this.field7514[var36];
                if (~var37 < -9 || ~var37 > 7) {
                    int var38 = this.field7522[var36] << 12;
                    int var39 = var4 * var38 >> 12;
                    int var40 = this.field7521 * var38 >> 12;
                    int var41 = this.field7516 * var38 >> 12;
                    int var42 = var39 >> 12;
                    int var43 = var42 + 1;
                    if (var43 >= var41) {
                        var43 = 0;
                    }
                    int var44 = var39 & 4095;
                    int var45 = this.field7523[255 & var42] & 255;
                    int var46 = class443.field6511[var44];
                    int var47 = 255 & this.field7523[var43 & 255];
                    if (this.field7529 && ~(this.field7513 + -1) == ~var36) {
                        for (int var48 = 0; ~var48 > ~class402.field5977; ++var48) {
                            int var49 = class109.field1530[var48] * this.field7521;
                            int var50 = this.method3064(var45, var40, (byte) 118, var46, var44, var38 * var49 >> 12, var47);
                            int var51 = (var37 * var50 >> 12) + arg2[var48];
                            arg2[var48] = (var51 >> 1) + 2048;
                        }
                    } else {
                        for (int var52 = 0; ~var52 > ~class402.field5977; ++var52) {
                            int var53 = class109.field1530[var52] * this.field7521;
                            int var54 = this.method3064(var45, var40, (byte) 118, var46, var44, var38 * var53 >> 12, var47);
                            arg2[var52] += var37 * var54 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V", line = 261)
    public class517() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V", line = 270)
    public final void method174(byte arg0) {
        this.field7523 = class38.method312(5, this.field7515);
        if (arg0 <= 1) {
            this.field7522 = null;
        }
        ++field7527;
        this.method3066(4096);
        for (int var2 = this.field7513 + -1; var2 >= 1; --var2) {
            short var3 = this.field7514[var2];
            if (var3 > 8) {
                return;
            }
            if (var3 < -8) {
                return;
            }
            --this.field7513;
        }
    }

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "(I)V", line = 300)
    private final void method3066(int arg0) {
        ++field7531;
        if (this.field7525 <= 0) {
            if (this.field7514 != null && this.field7514.length == this.field7513) {
                this.field7522 = new short[this.field7513];
                for (int var2 = 0; ~this.field7513 < ~var2; ++var2) {
                    this.field7522[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field7514 = new short[this.field7513];
            this.field7522 = new short[this.field7513];
            for (int var3 = 0; this.field7513 > var3; ++var3) {
                this.field7514[var3] = (short) ((int) (Math.pow((double) ((float) this.field7525 / 4096.0F), (double) var3) * 4096.0D));
                this.field7522[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 != 4096) {
            field7517 = -37;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)[I", line = 347)
    public final int[] method179(int arg0, byte arg1) {
        if (arg1 != -11) {
            field7517 = 52;
        }
        ++field7524;
        int[] var3 = super.field5007.method512(arg0, 0);
        if (super.field5007.field687) {
            this.method3065(arg1 + -112, arg0, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BILhp;)V", line = 373)
    public final void method177(byte arg0, int arg1, class217 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field7516 = arg2.method1515((byte) 125);
                                }
                            } else {
                                this.field7521 = arg2.method1515((byte) 125);
                            }
                        } else {
                            this.field7515 = arg2.method1515((byte) 126);
                        }
                    } else {
                        this.field7521 = this.field7516 = arg2.method1515((byte) 121);
                    }
                } else {
                    this.field7525 = arg2.method1529((byte) 91);
                    if (this.field7525 < 0) {
                        this.field7514 = new short[this.field7513];
                        for (int var5 = 0; this.field7513 > var5; ++var5) {
                            this.field7514[var5] = (short) arg2.method1529((byte) -112);
                        }
                    }
                }
            } else {
                this.field7513 = arg2.method1515((byte) 123);
            }
        } else {
            this.field7529 = ~arg2.method1515((byte) 124) == -2;
        }
        int var6 = 7 % ((82 - arg0) / 40);
        ++field7511;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lhp;B)Ljava/lang/String;", line = 480)
    public static final String method3067(class217 arg0, byte arg1) {
        ++field7519;
        if (arg1 != -94) {
            field7526 = null;
        }
        return class367.method2293(43, 32767, arg0);
    }
}
