import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class618 extends class330 {

    @OriginalMember(owner = "client!he", name = "D", descriptor = "[B")
    private byte[] field8673 = new byte[512];

    @OriginalMember(owner = "client!he", name = "J", descriptor = "Z")
    public boolean field8678 = true;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public int field8672 = 4;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "I")
    public int field8676 = 4;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "I")
    public int field8674 = 4;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "I")
    public int field8677 = 0;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "I")
    public int field8684 = 1638;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "I")
    public static int field8675;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "I")
    public static int field8680;

    @OriginalMember(owner = "client!he", name = "M", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "I")
    public static int field8682;

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
    public static int field8685;

    @OriginalMember(owner = "client!he", name = "R", descriptor = "I")
    public static int field8686;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "I")
    public static int field8687;

    @OriginalMember(owner = "client!he", name = "T", descriptor = "I")
    public static int field8688;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "[S")
    private short[] field8679;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "[S")
    private short[] field8683;

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    public class618() {
        super(0, true);
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(B)V")
    public final void method653(byte arg0) {
        this.field8673 = class750.method4151(0, this.field8677);
        ++field8675;
        this.method3565(2);
        for (int var2 = this.field8676 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field8679[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            --this.field8676;
        }
        int var4 = 83 / ((50 - arg0) / 41);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    private final void method3565(int arg0) {
        if (~this.field8684 >= -1) {
            if (this.field8679 != null && this.field8679.length == this.field8676) {
                this.field8683 = new short[this.field8676];
                for (int var2 = 0; ~this.field8676 < ~var2; ++var2) {
                    this.field8683[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field8679 = new short[this.field8676];
            this.field8683 = new short[this.field8676];
            for (int var3 = 0; ~this.field8676 < ~var3; ++var3) {
                this.field8679[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field8684 / 4096.0F), (double) var3)));
                this.field8683[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 == 2) {
            ++field8682;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Z)V")
    public static final void method3566(boolean arg0) {
        class571.field8023.method314(-2);
        if (!arg0) {
            method3566(true);
        }
        ++field8680;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lgga;IB)V")
    public final void method466(class511 arg0, int arg1, byte arg2) {
        ++field8688;
        int var4 = -1 % ((-41 - arg2) / 42);
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field8676 = arg0.method3013(-106);
            } else {
                if (arg1 != 2) {
                    if (~arg1 == -4) {
                        this.field8672 = this.field8674 = arg0.method3013(110);
                        return;
                    }
                    if (~arg1 == -5) {
                        this.field8677 = arg0.method3013(73);
                        return;
                    }
                    if (arg1 == 5) {
                        this.field8672 = arg0.method3013(-103);
                        return;
                    }
                    if (~arg1 == -7) {
                        this.field8674 = arg0.method3013(-116);
                        return;
                    }
                } else {
                    this.field8684 = arg0.method3034(1);
                    if (this.field8684 < 0) {
                        this.field8679 = new short[this.field8676];
                        for (int var6 = 0; var6 < this.field8676; ++var6) {
                            this.field8679[var6] = (short) arg0.method3034(1);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field8678 = ~arg0.method3013(102) == -2;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIII)I")
    private final int method3567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8681;
        if (arg5 != -17289) {
            return 62;
        } else {
            int var8 = arg4 >> 12;
            int var9 = var8 - -1;
            if (~var9 <= ~arg0) {
                var9 = 0;
            }
            int var10 = arg4 & 4095;
            int var11 = var8 & 255;
            int var12 = var10 - 4096;
            int var13 = arg2 + -4096;
            int var14 = var9 & 255;
            int var15 = 3 & this.field8673[arg1 + var11];
            int var16 = class455.field6366[var10];
            int var17;
            if (var15 <= 1) {
                var17 = var15 == 0 ? arg2 + var10 : -var10 + arg2;
            } else {
                var17 = var15 != 2 ? -var10 - arg2 : -arg2 + var10;
            }
            int var18 = 3 & this.field8673[arg1 + var14];
            int var19;
            if (~var18 >= -2) {
                var19 = ~var18 == -1 ? arg2 + var12 : -var12 + arg2;
            } else {
                var19 = ~var18 != -3 ? -arg2 + -var12 : var12 - arg2;
            }
            int var20 = 3 & this.field8673[arg6 + var11];
            int var21 = ((-var17 + var19) * var16 >> 12) + var17;
            int var22;
            if (~var20 < -2) {
                var22 = var20 == 2 ? -var13 + var10 : -var10 + -var13;
            } else {
                var22 = var20 == 0 ? var10 + var13 : var13 - var10;
            }
            int var23 = 3 & this.field8673[arg6 + var14];
            int var24;
            if (~var23 >= -2) {
                var24 = ~var23 == -1 ? var12 + var13 : -var12 + var13;
            } else {
                var24 = ~var23 == -3 ? -var13 + var12 : -var12 + -var13;
            }
            int var25 = ((var24 - var22) * var16 >> 12) + var22;
            return ((var25 - var21) * arg3 >> 12) + var21;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BI[I)V")
    public final void method3568(byte arg0, int arg1, int[] arg2) {
        ++field8686;
        int var4 = class300.field4352[arg1] * this.field8674;
        if (arg0 <= 93) {
            this.method3567(106, 20, -49, -92, -65, 94, -102);
        }
        if (this.field8676 == 1) {
            short var5 = this.field8679[0];
            int var6 = this.field8683[0] << 12;
            int var7 = this.field8672 * var6 >> 12;
            int var8 = this.field8674 * var6 >> 12;
            int var9 = var4 * var6 >> 12;
            int var10 = var9 >> 12;
            int var11 = var10 + 1;
            if (var11 >= var8) {
                var11 = 0;
            }
            int var12 = var9 & 4095;
            int var13 = 255 & this.field8673[255 & var10];
            int var14 = class455.field6366[var12];
            int var15 = this.field8673[255 & var11] & 255;
            if (!this.field8678) {
                for (int var16 = 0; class80.field901 > var16; ++var16) {
                    int var17 = class404.field5705[var16] * this.field8672;
                    int var18 = this.method3567(var7, var13, var12, var14, var6 * var17 >> 12, -17289, var15);
                    arg2[var16] = var5 * var18 >> 12;
                }
            } else {
                for (int var19 = 0; var19 < class80.field901; ++var19) {
                    int var20 = class404.field5705[var19] * this.field8672;
                    int var21 = this.method3567(var7, var13, var12, var14, var6 * var20 >> 12, -17289, var15);
                    int var22 = var5 * var21 >> 12;
                    arg2[var19] = (var22 >> 1) + 2048;
                }
            }
        } else {
            short var23 = this.field8679[0];
            if (~var23 < -9 || ~var23 > 7) {
                int var24 = this.field8683[0] << 12;
                int var25 = this.field8674 * var24 >> 12;
                int var26 = var4 * var24 >> 12;
                int var27 = this.field8672 * var24 >> 12;
                int var28 = var26 >> 12;
                int var29 = var28 + 1;
                if (~var29 <= ~var25) {
                    var29 = 0;
                }
                int var30 = var26 & 4095;
                int var31 = class455.field6366[var30];
                int var32 = 255 & this.field8673[255 & var28];
                int var33 = this.field8673[var29 & 255] & 255;
                for (int var34 = 0; var34 < class80.field901; ++var34) {
                    int var54 = class404.field5705[var34] * this.field8672;
                    int var55 = this.method3567(var27, var32, var30, var31, var24 * var54 >> 12, -17289, var33);
                    arg2[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; ~this.field8676 < ~var35; ++var35) {
                short var36 = this.field8679[var35];
                if (~var36 < -9 || ~var36 > 7) {
                    int var37 = this.field8683[var35] << 12;
                    int var38 = var4 * var37 >> 12;
                    int var39 = this.field8674 * var37 >> 12;
                    int var40 = this.field8672 * var37 >> 12;
                    int var41 = var38 >> 12;
                    int var42 = var41 + 1;
                    if (~var42 <= ~var39) {
                        var42 = 0;
                    }
                    int var43 = var38 & 4095;
                    int var44 = class455.field6366[var43];
                    int var45 = 255 & this.field8673[var41 & 255];
                    int var46 = this.field8673[var42 & 255] & 255;
                    if (this.field8678 && this.field8676 + -1 == var35) {
                        for (int var47 = 0; ~var47 > ~class80.field901; ++var47) {
                            int var48 = class404.field5705[var47] * this.field8672;
                            int var49 = this.method3567(var40, var45, var43, var44, var37 * var48 >> 12, -17289, var46);
                            int var50 = (var36 * var49 >> 12) + arg2[var47];
                            arg2[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; ~var51 > ~class80.field901; ++var51) {
                            int var52 = class404.field5705[var51] * this.field8672;
                            int var53 = this.method3567(var40, var45, var43, var44, var37 * var52 >> 12, -17289, var46);
                            arg2[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)[I")
    public final int[] method464(int arg0, boolean arg1) {
        ++field8687;
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (arg1) {
            this.method3567(-33, -69, 75, 111, -24, -11, -14);
        }
        if (super.field4630.field5704) {
            this.method3568((byte) 127, arg0, var3);
        }
        return var3;
    }
}
