import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class387 extends class214 {

    @OriginalMember(owner = "client!sm", name = "N", descriptor = "I")
    public int field5805 = 4;

    @OriginalMember(owner = "client!sm", name = "L", descriptor = "I")
    public int field5803 = 4;

    @OriginalMember(owner = "client!sm", name = "O", descriptor = "[B")
    private byte[] field5806 = new byte[512];

    @OriginalMember(owner = "client!sm", name = "S", descriptor = "I")
    public int field5810 = 4;

    @OriginalMember(owner = "client!sm", name = "R", descriptor = "Z")
    public boolean field5809 = true;

    @OriginalMember(owner = "client!sm", name = "Y", descriptor = "I")
    public int field5815 = 0;

    @OriginalMember(owner = "client!sm", name = "F", descriptor = "I")
    public int field5797 = 1638;

    @OriginalMember(owner = "client!sm", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field5800 = new String[100];

    @OriginalMember(owner = "client!sm", name = "D", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!sm", name = "E", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!sm", name = "J", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!sm", name = "K", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!sm", name = "M", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!sm", name = "Q", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!sm", name = "T", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!sm", name = "U", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!sm", name = "V", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!sm", name = "X", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!sm", name = "H", descriptor = "[I")
    public static int[] field5799;

    @OriginalMember(owner = "client!sm", name = "G", descriptor = "[S")
    private short[] field5798;

    @OriginalMember(owner = "client!sm", name = "P", descriptor = "[S")
    private short[] field5807;

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V", line = 5)
    public class387() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IB[I)V", line = 13)
    public final void method2420(int arg0, byte arg1, int[] arg2) {
        ++field5804;
        if (arg1 != -35) {
            this.method2422((byte) -86);
        }
        int var4 = class131.field2138[arg0] * this.field5803;
        if (~this.field5805 != -2) {
            short var5 = this.field5807[0];
            if (var5 > 8 || ~var5 > 7) {
                int var6 = this.field5798[0] << 12;
                int var7 = this.field5810 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = this.field5803 * var6 >> 12;
                int var10 = var8 >> 12;
                int var11 = var10 + 1;
                if (~var9 >= ~var11) {
                    var11 = 0;
                }
                int var12 = var8 & 4095;
                int var13 = class648.field9218[var12];
                int var14 = 255 & this.field5806[var11 & 255];
                int var15 = this.field5806[255 & var10] & 255;
                for (int var16 = 0; ~var16 > ~class626.field8787; ++var16) {
                    int var36 = class592.field8328[var16] * this.field5810;
                    int var37 = this.method2421(arg1 ^ -4062, var6 * var36 >> 12, var15, var7, var14, var12, var13);
                    arg2[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; ~this.field5805 < ~var17; ++var17) {
                short var18 = this.field5807[var17];
                if (var18 > 8 || ~var18 > 7) {
                    int var19 = this.field5798[var17] << 12;
                    int var20 = var4 * var19 >> 12;
                    int var21 = this.field5810 * var19 >> 12;
                    int var22 = this.field5803 * var19 >> 12;
                    int var23 = var20 >> 12;
                    int var24 = var23 + 1;
                    if (~var24 <= ~var22) {
                        var24 = 0;
                    }
                    int var25 = var20 & 4095;
                    int var26 = class648.field9218[var25];
                    int var27 = 255 & this.field5806[var24 & 255];
                    int var28 = 255 & this.field5806[var23 & 255];
                    if (this.field5809 && this.field5805 - 1 == var17) {
                        for (int var29 = 0; class626.field8787 > var29; ++var29) {
                            int var30 = class592.field8328[var29] * this.field5810;
                            int var31 = this.method2421(4095, var19 * var30 >> 12, var28, var21, var27, var25, var26);
                            int var32 = (var18 * var31 >> 12) + arg2[var29];
                            arg2[var29] = 2048 - -(var32 >> 1);
                        }
                    } else {
                        for (int var33 = 0; var33 < class626.field8787; ++var33) {
                            int var34 = class592.field8328[var33] * this.field5810;
                            int var35 = this.method2421(4095, var19 * var34 >> 12, var28, var21, var27, var25, var26);
                            arg2[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            int var38 = this.field5798[0] << 12;
            short var39 = this.field5807[0];
            int var40 = this.field5803 * var38 >> 12;
            int var41 = var4 * var38 >> 12;
            int var42 = this.field5810 * var38 >> 12;
            int var43 = var41 >> 12;
            int var44 = var43 + 1;
            if (var40 <= var44) {
                var44 = 0;
            }
            int var45 = var41 & 4095;
            int var46 = 255 & this.field5806[255 & var44];
            int var47 = this.field5806[255 & var43] & 255;
            int var48 = class648.field9218[var45];
            if (this.field5809) {
                for (int var49 = 0; class626.field8787 > var49; ++var49) {
                    int var50 = class592.field8328[var49] * this.field5810;
                    int var51 = this.method2421(arg1 + 4130, var38 * var50 >> 12, var47, var42, var46, var45, var48);
                    int var52 = var39 * var51 >> 12;
                    arg2[var49] = 2048 - -(var52 >> 1);
                }
            } else {
                for (int var53 = 0; ~var53 > ~class626.field8787; ++var53) {
                    int var54 = class592.field8328[var53] * this.field5810;
                    int var55 = this.method2421(arg1 ^ -4062, var38 * var54 >> 12, var47, var42, var46, var45, var48);
                    arg2[var53] = var39 * var55 >> 12;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIII)I", line = 178)
    private final int method2421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5814;
        int var8 = arg1 >> 12;
        int var9 = var8 + 1;
        if (arg3 <= var9) {
            var9 = 0;
        }
        int var10 = arg1 & arg0;
        int var11 = var8 & 255;
        int var12 = arg5 + -4096;
        int var13 = var9 & 255;
        int var14 = var10 - 4096;
        int var15 = this.field5806[arg2 + var11] & 3;
        int var16 = class648.field9218[var10];
        int var17;
        if (var15 <= 1) {
            var17 = ~var15 == -1 ? arg5 + var10 : -var10 + arg5;
        } else {
            var17 = var15 == 2 ? -arg5 + var10 : -arg5 + -var10;
        }
        int var18 = this.field5806[arg2 + var13] & 3;
        int var19;
        if (~var18 >= -2) {
            var19 = var18 == 0 ? arg5 + var14 : -var14 + arg5;
        } else {
            var19 = ~var18 == -3 ? -arg5 + var14 : -arg5 + -var14;
        }
        int var20 = var17 - -((-var17 + var19) * var16 >> 12);
        int var21 = 3 & this.field5806[var11 - -arg4];
        int var22;
        if (~var21 < -2) {
            var22 = var21 == 2 ? -var12 + var10 : -var10 + -var12;
        } else {
            var22 = var21 == 0 ? var10 + var12 : -var10 + var12;
        }
        int var23 = 3 & this.field5806[arg4 + var13];
        int var24;
        if (~var23 < -2) {
            var24 = var23 != 2 ? -var12 + -var14 : var14 - var12;
        } else {
            var24 = var23 != 0 ? var12 - var14 : var12 + var14;
        }
        int var25 = ((-var22 + var24) * var16 >> 12) + var22;
        return ((var25 - var20) * arg6 >> 12) + var20;
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V", line = 257)
    public final void method65(int arg0) {
        this.field5806 = class103.method851(this.field5815, (byte) -123);
        ++field5796;
        this.method2422((byte) -81);
        if (arg0 < 48) {
            this.field5805 = 30;
        }
        for (int var2 = this.field5805 + -1; var2 >= 1; --var2) {
            short var3 = this.field5807[var2];
            if (var3 > 8 || ~var3 > 7) {
                return;
            }
            --this.field5805;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILofa;I)V", line = 289)
    public final void method59(int arg0, class301 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field5803 = arg1.method1987(-21);
                                }
                            } else {
                                this.field5810 = arg1.method1987(-105);
                            }
                        } else {
                            this.field5815 = arg1.method1987(-66);
                        }
                    } else {
                        this.field5810 = this.field5803 = arg1.method1987(-58);
                    }
                } else {
                    this.field5797 = arg1.method1977((byte) 31);
                    if (this.field5797 < 0) {
                        this.field5807 = new short[this.field5805];
                        for (int var5 = 0; ~var5 > ~this.field5805; ++var5) {
                            this.field5807[var5] = (short) arg1.method1977((byte) -123);
                        }
                    }
                }
            } else {
                this.field5805 = arg1.method1987(-59);
            }
        } else {
            this.field5809 = ~arg1.method1987(-93) == -2;
        }
        if (arg0 < 92) {
            this.method2420(-71, (byte) 76, (int[]) null);
        }
        ++field5813;
    }

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "(B)V", line = 389)
    private final void method2422(byte arg0) {
        ++field5802;
        if (~this.field5797 < -1) {
            this.field5798 = new short[this.field5805];
            this.field5807 = new short[this.field5805];
            for (int var2 = 0; ~var2 > ~this.field5805; ++var2) {
                this.field5807[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field5797 / 4096.0F), (double) var2)));
                this.field5798[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field5807 != null && ~this.field5807.length == ~this.field5805) {
            this.field5798 = new short[this.field5805];
            for (int var3 = 0; var3 < this.field5805; ++var3) {
                this.field5798[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 != -81) {
            this.method2422((byte) 74);
        }
    }

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "(B)V", line = 428)
    public static void method2423(byte arg0) {
        if (arg0 != 126) {
            field5800 = null;
        }
        field5799 = null;
        field5800 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IB)[I", line = 444)
    public final int[] method64(int arg0, byte arg1) {
        ++field5801;
        if (arg1 != 5) {
            this.field5809 = false;
        }
        int[] var3 = super.field3544.method3869(arg0, -119);
        if (super.field3544.field9836) {
            this.method2420(arg0, (byte) -35, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(II)I", line = 477)
    public static final int method2424(int arg0, int arg1) {
        ++field5811;
        if (arg1 < 96) {
            return 0;
        } else if (arg1 < 128) {
            return 2;
        } else {
            if (arg0 != -610469044) {
                method2424(114, 94);
            }
            return 3;
        }
    }
}
