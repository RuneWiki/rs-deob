import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class684 extends class601 {

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "Z")
    public boolean field9544 = true;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "I")
    public int field9550 = 1638;

    @OriginalMember(owner = "client!ag", name = "G", descriptor = "[B")
    private byte[] field9542 = new byte[512];

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "I")
    public int field9547 = 4;

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "I")
    public int field9548 = 4;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "I")
    public int field9555 = 0;

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
    public int field9556 = 4;

    @OriginalMember(owner = "client!ag", name = "H", descriptor = "[B")
    public static byte[] field9543 = new byte[32896];

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "[I")
    public static int[] field9558;

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "I")
    public static int field9538;

    @OriginalMember(owner = "client!ag", name = "D", descriptor = "I")
    public static int field9539;

    @OriginalMember(owner = "client!ag", name = "E", descriptor = "I")
    public static int field9540;

    @OriginalMember(owner = "client!ag", name = "F", descriptor = "I")
    public static int field9541;

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "I")
    public static int field9545;

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "I")
    public static int field9546;

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "I")
    public static int field9549;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
    public static int field9551;

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "I")
    public static int field9557;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "J")
    public static long field9554;

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "[S")
    private short[] field9552;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "[S")
    private short[] field9553;

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -257; ++var1) {
            for (int var2 = 0; var2 <= var1; ++var2) {
                field9543[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field9558 = new int[4];
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)[I", line = 4)
    public final int[] method5(byte arg0, int arg1) {
        ++field9539;
        if (arg0 != -40) {
            this.field9552 = null;
        }
        int[] var3 = super.field7902.method382(arg1, true);
        if (super.field7902.field704) {
            this.method3855((byte) 111, arg1, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI[I)V", line = 27)
    public final void method3855(byte arg0, int arg1, int[] arg2) {
        if (arg0 <= 75) {
            this.method5((byte) -86, -65);
        }
        ++field9538;
        int var4 = class250.field3446[arg1] * this.field9547;
        if (this.field9548 == 1) {
            short var5 = this.field9552[0];
            int var6 = this.field9553[0] << 12;
            int var7 = this.field9556 * var6 >> 12;
            int var8 = this.field9547 * var6 >> 12;
            int var9 = var4 * var6 >> 12;
            int var10 = var9 >> 12;
            int var11 = var10 + 1;
            int var12 = var9 & 4095;
            if (~var8 >= ~var11) {
                var11 = 0;
            }
            int var13 = this.field9542[255 & var11] & 255;
            int var14 = class750.field10448[var12];
            int var15 = this.field9542[var10 & 255] & 255;
            if (!this.field9544) {
                for (int var16 = 0; var16 < class171.field2624; ++var16) {
                    int var17 = class453.field6186[var16] * this.field9556;
                    int var18 = this.method3857(var14, var13, var6 * var17 >> 12, -23034, var7, var15, var12);
                    arg2[var16] = var5 * var18 >> 12;
                }
            } else {
                for (int var19 = 0; class171.field2624 > var19; ++var19) {
                    int var20 = class453.field6186[var19] * this.field9556;
                    int var21 = this.method3857(var14, var13, var6 * var20 >> 12, -23034, var7, var15, var12);
                    int var22 = var5 * var21 >> 12;
                    arg2[var19] = (var22 >> 1) + 2048;
                }
            }
        } else {
            short var23 = this.field9552[0];
            if (~var23 < -9 || var23 < -8) {
                int var24 = this.field9553[0] << 12;
                int var25 = this.field9547 * var24 >> 12;
                int var26 = this.field9556 * var24 >> 12;
                int var27 = var4 * var24 >> 12;
                int var28 = var27 >> 12;
                int var29 = var28 + 1;
                int var30 = var27 & 4095;
                if (var25 <= var29) {
                    var29 = 0;
                }
                int var31 = 255 & this.field9542[255 & var29];
                int var32 = this.field9542[255 & var28] & 255;
                int var33 = class750.field10448[var30];
                for (int var34 = 0; var34 < class171.field2624; ++var34) {
                    int var54 = class453.field6186[var34] * this.field9556;
                    int var55 = this.method3857(var33, var31, var24 * var54 >> 12, -23034, var26, var32, var30);
                    arg2[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; var35 < this.field9548; ++var35) {
                short var36 = this.field9552[var35];
                if (var36 > 8 || ~var36 > 7) {
                    int var37 = this.field9553[var35] << 12;
                    int var38 = var4 * var37 >> 12;
                    int var39 = this.field9556 * var37 >> 12;
                    int var40 = this.field9547 * var37 >> 12;
                    int var41 = var38 >> 12;
                    int var42 = var41 + 1;
                    if (var40 <= var42) {
                        var42 = 0;
                    }
                    int var43 = var38 & 4095;
                    int var44 = this.field9542[var41 & 255] & 255;
                    int var45 = 255 & this.field9542[255 & var42];
                    int var46 = class750.field10448[var43];
                    if (this.field9544 && ~(this.field9548 + -1) == ~var35) {
                        for (int var47 = 0; ~var47 > ~class171.field2624; ++var47) {
                            int var48 = class453.field6186[var47] * this.field9556;
                            int var49 = this.method3857(var46, var45, var37 * var48 >> 12, -23034, var39, var44, var43);
                            int var50 = (var36 * var49 >> 12) + arg2[var47];
                            arg2[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; class171.field2624 > var51; ++var51) {
                            int var52 = class453.field6186[var51] * this.field9556;
                            int var53 = this.method3857(var46, var45, var37 * var52 >> 12, -23034, var39, var44, var43);
                            arg2[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(I)V", line = 192)
    public static void method3856(int arg0) {
        field9543 = null;
        field9558 = null;
        if (arg0 <= 63) {
            method3859(false, -110, -97);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V", line = 203)
    public final void method108(int arg0) {
        ++field9545;
        if (arg0 == 8351) {
            this.field9542 = class737.method4115(this.field9555, arg0 + -8237);
            this.method3861(arg0 + -8469);
            for (int var2 = this.field9548 - 1; var2 >= 1; --var2) {
                short var3 = this.field9552[var2];
                if (var3 > 8) {
                    return;
                }
                if (~var3 > 7) {
                    return;
                }
                --this.field9548;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V", line = 424)
    public class684() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIII)I", line = 244)
    private final int method3857(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9546;
        if (arg3 != -23034) {
            this.method3857(-118, 78, 0, -60, -106, 98, 112);
        }
        int var8 = arg2 >> 12;
        int var9 = var8 + 1;
        int var10 = var8 & 255;
        int var11 = arg2 & 4095;
        if (~arg4 >= ~var9) {
            var9 = 0;
        }
        int var12 = var9 & 255;
        int var13 = var11 + -4096;
        int var14 = arg6 + -4096;
        int var15 = this.field9542[arg5 + var10] & 3;
        int var16 = class750.field10448[var11];
        int var17;
        if (var15 > 1) {
            var17 = var15 == 2 ? var11 - arg6 : -var11 - arg6;
        } else {
            var17 = var15 != 0 ? -var11 + arg6 : var11 - -arg6;
        }
        int var18 = 3 & this.field9542[arg5 + var12];
        int var19;
        if (var18 > 1) {
            var19 = var18 == 2 ? -arg6 + var13 : -arg6 + -var13;
        } else {
            var19 = var18 == 0 ? arg6 + var13 : -var13 + arg6;
        }
        int var20 = ((-var17 + var19) * var16 >> 12) + var17;
        int var21 = 3 & this.field9542[arg1 + var10];
        int var22;
        if (~var21 < -2) {
            var22 = ~var21 != -3 ? -var11 - var14 : -var14 + var11;
        } else {
            var22 = var21 == 0 ? var11 + var14 : -var11 + var14;
        }
        int var23 = 3 & this.field9542[arg1 + var12];
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? -var14 + var13 : -var13 + -var14;
        } else {
            var24 = ~var23 == -1 ? var13 + var14 : var14 - var13;
        }
        int var25 = ((-var22 + var24) * var16 >> 12) + var22;
        return ((var25 - var20) * arg0 >> 12) + var20;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III[BII[BII)V", line = 318)
    public static final void method3858(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field9549;
        int var9 = -(arg5 >> 2);
        int var10 = -(arg4 & arg5);
        for (int var11 = -arg0; ~var11 > -1; ++var11) {
            int var10001;
            for (int var12 = var9; ~var12 > -1; ++var12) {
                var10001 = arg7++;
                arg6[var10001] = (byte) (arg6[var10001] + -arg3[arg2++]);
                int var14 = arg7++;
                arg6[var14] = (byte) (arg6[var14] + -arg3[arg2++]);
                int var15 = arg7++;
                arg6[var15] = (byte) (arg6[var15] + -arg3[arg2++]);
                int var16 = arg7++;
                arg6[var16] = (byte) (arg6[var16] + -arg3[arg2++]);
            }
            for (int var13 = var10; ~var13 > -1; ++var13) {
                var10001 = arg7++;
                arg6[var10001] = (byte) (arg6[var10001] + -arg3[arg2++]);
            }
            arg7 += arg1;
            arg2 += arg8;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZII)V", line = 368)
    public static final void method3859(boolean arg0, int arg1, int arg2) {
        ++field9551;
        class127 var3 = class760.method4231(arg2, -874792672, 6);
        var3.method1010(614);
        var3.field2099 = arg1;
        if (arg0) {
            field9554 = 77L;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZB)Ljava/lang/String;", line = 382)
    public static final String method3860(int arg0, boolean arg1, byte arg2) {
        int var3 = 35 / ((arg2 - 32) / 59);
        ++field9541;
        return arg1 && arg0 >= 0 ? class578.method3172(256, 10, arg1, arg0) : Integer.toString(arg0);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lee;BI)V", line = 431)
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field9547 = arg0.method3821((byte) 96);
                                }
                            } else {
                                this.field9556 = arg0.method3821((byte) -48);
                            }
                        } else {
                            this.field9555 = arg0.method3821((byte) 70);
                        }
                    } else {
                        this.field9556 = this.field9547 = arg0.method3821((byte) 94);
                    }
                } else {
                    this.field9550 = arg0.method3771((byte) -10);
                    if (this.field9550 < 0) {
                        this.field9552 = new short[this.field9548];
                        for (int var5 = 0; ~this.field9548 < ~var5; ++var5) {
                            this.field9552[var5] = (short) arg0.method3771((byte) -10);
                        }
                    }
                }
            } else {
                this.field9548 = arg0.method3821((byte) -92);
            }
        } else {
            this.field9544 = arg0.method3821((byte) 98) == 1;
        }
        if (arg1 != -61) {
            this.method108(-68);
        }
        ++field9557;
    }

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)V", line = 535)
    private final void method3861(int arg0) {
        if (this.field9550 > 0) {
            this.field9553 = new short[this.field9548];
            this.field9552 = new short[this.field9548];
            for (int var2 = 0; ~var2 > ~this.field9548; ++var2) {
                this.field9552[var2] = (short) ((int) (Math.pow((double) ((float) this.field9550 / 4096.0F), (double) var2) * 4096.0D));
                this.field9553[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field9552 != null && ~this.field9552.length == ~this.field9548) {
            this.field9553 = new short[this.field9548];
            for (int var3 = 0; ~this.field9548 < ~var3; ++var3) {
                this.field9553[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field9540;
        if (arg0 >= -115) {
            this.field9542 = null;
        }
    }
}
