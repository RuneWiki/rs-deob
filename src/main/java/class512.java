import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class512 extends class297 {

    @OriginalMember(owner = "client!jq", name = "J", descriptor = "I")
    public int field7121 = 1638;

    @OriginalMember(owner = "client!jq", name = "M", descriptor = "[B")
    private byte[] field7124 = new byte[512];

    @OriginalMember(owner = "client!jq", name = "U", descriptor = "Z")
    public boolean field7132 = true;

    @OriginalMember(owner = "client!jq", name = "K", descriptor = "I")
    public int field7122 = 4;

    @OriginalMember(owner = "client!jq", name = "Q", descriptor = "I")
    public int field7128 = 0;

    @OriginalMember(owner = "client!jq", name = "Y", descriptor = "I")
    public int field7136 = 4;

    @OriginalMember(owner = "client!jq", name = "S", descriptor = "I")
    public int field7130 = 4;

    @OriginalMember(owner = "client!jq", name = "X", descriptor = "[Ljava/awt/Color;")
    public static Color[] field7135 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

    @OriginalMember(owner = "client!jq", name = "I", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!jq", name = "L", descriptor = "I")
    public static int field7123;

    @OriginalMember(owner = "client!jq", name = "N", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!jq", name = "O", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!jq", name = "P", descriptor = "I")
    public static int field7127;

    @OriginalMember(owner = "client!jq", name = "R", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!jq", name = "V", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!jq", name = "Z", descriptor = "Lss;")
    public static class433 field7137;

    @OriginalMember(owner = "client!jq", name = "T", descriptor = "[S")
    private short[] field7131;

    @OriginalMember(owner = "client!jq", name = "W", descriptor = "[S")
    private short[] field7134;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lcea;II)V")
    public final void method17(class215 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field7136 = arg0.method1535(255);
                                }
                            } else {
                                this.field7130 = arg0.method1535(255);
                            }
                        } else {
                            this.field7128 = arg0.method1535(255);
                        }
                    } else {
                        this.field7130 = this.field7136 = arg0.method1535(255);
                    }
                } else {
                    this.field7121 = arg0.method1520(13638);
                    if (~this.field7121 > -1) {
                        this.field7131 = new short[this.field7122];
                        for (int var5 = 0; this.field7122 > var5; ++var5) {
                            this.field7131[var5] = (short) arg0.method1520(13638);
                        }
                    }
                }
            } else {
                this.field7122 = arg0.method1535(arg2 ^ 31192);
            }
        } else {
            this.field7132 = arg0.method1535(arg2 ^ 31192) == 1;
        }
        if (arg2 != 31015) {
            this.method3002(20, 127, -38, 124, -110, true, 16);
        }
        ++field7125;
    }

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field7126;
        int[] var3 = super.field4165.method127(arg1 ^ arg1, arg0);
        if (super.field4165.field266) {
            this.method3001(arg0, var3, (byte) 98);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V")
    public class512() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "(I)V")
    public final void method711(int arg0) {
        this.field7124 = class59.method622(this.field7128, 95);
        ++field7120;
        this.method2999((byte) -98);
        int var2 = this.field7122 + -1;
        if (arg0 < 108) {
            field7137 = null;
        }
        while (var2 >= 1) {
            short var3 = this.field7131[var2];
            if (var3 > 8) {
                return;
            }
            if (var3 < -8) {
                return;
            }
            --this.field7122;
            --var2;
        }
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)V")
    private final void method2999(byte arg0) {
        int var2 = 25 / ((arg0 - -28) / 57);
        if (~this.field7121 < -1) {
            this.field7134 = new short[this.field7122];
            this.field7131 = new short[this.field7122];
            for (int var3 = 0; this.field7122 > var3; ++var3) {
                this.field7131[var3] = (short) ((int) (Math.pow((double) ((float) this.field7121 / 4096.0F), (double) var3) * 4096.0D));
                this.field7134[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field7131 != null && this.field7131.length == this.field7122) {
            this.field7134 = new short[this.field7122];
            for (int var4 = 0; ~this.field7122 < ~var4; ++var4) {
                this.field7134[var4] = (short) ((int) Math.pow(2.0D, (double) var4));
            }
        }
        ++field7123;
    }

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "(I)V")
    public static void method3000(int arg0) {
        field7135 = null;
        if (arg0 != 13715) {
            field7137 = null;
        }
        field7137 = null;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I[IB)V")
    public final void method3001(int arg0, int[] arg1, byte arg2) {
        ++field7133;
        int var4 = class620.field8445[arg0] * this.field7136;
        if (arg2 > 91) {
            if (~this.field7122 != -2) {
                short var5 = this.field7131[0];
                if (~var5 < -9 || var5 < -8) {
                    int var6 = this.field7134[0] << 12;
                    int var7 = var4 * var6 >> 12;
                    int var8 = this.field7130 * var6 >> 12;
                    int var9 = this.field7136 * var6 >> 12;
                    int var10 = var7 >> 12;
                    int var11 = var10 + 1;
                    if (var11 >= var9) {
                        var11 = 0;
                    }
                    int var12 = var7 & 4095;
                    int var13 = this.field7124[255 & var11] & 255;
                    int var14 = this.field7124[255 & var10] & 255;
                    int var15 = class538.field7440[var12];
                    for (int var16 = 0; class525.field7275 > var16; ++var16) {
                        int var36 = class733.field9899[var16] * this.field7130;
                        int var37 = this.method3002(var13, var12, var8, var6 * var36 >> 12, var15, true, var14);
                        arg1[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; this.field7122 > var17; ++var17) {
                    short var18 = this.field7131[var17];
                    if (~var18 < -9 || ~var18 > 7) {
                        int var19 = this.field7134[var17] << 12;
                        int var20 = var4 * var19 >> 12;
                        int var21 = this.field7130 * var19 >> 12;
                        int var22 = this.field7136 * var19 >> 12;
                        int var23 = var20 >> 12;
                        int var24 = var23 + 1;
                        int var25 = var20 & 4095;
                        if (var24 >= var22) {
                            var24 = 0;
                        }
                        int var26 = this.field7124[var23 & 255] & 255;
                        int var27 = class538.field7440[var25];
                        int var28 = 255 & this.field7124[var24 & 255];
                        if (this.field7132 && this.field7122 - 1 == var17) {
                            for (int var29 = 0; class525.field7275 > var29; ++var29) {
                                int var30 = class733.field9899[var29] * this.field7130;
                                int var31 = this.method3002(var28, var25, var21, var19 * var30 >> 12, var27, true, var26);
                                int var32 = arg1[var29] - -(var18 * var31 >> 12);
                                arg1[var29] = (var32 >> 1) + 2048;
                            }
                        } else {
                            for (int var33 = 0; ~class525.field7275 < ~var33; ++var33) {
                                int var34 = class733.field9899[var33] * this.field7130;
                                int var35 = this.method3002(var28, var25, var21, var19 * var34 >> 12, var27, true, var26);
                                arg1[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                int var38 = this.field7134[0] << 12;
                short var39 = this.field7131[0];
                int var40 = var4 * var38 >> 12;
                int var41 = this.field7130 * var38 >> 12;
                int var42 = this.field7136 * var38 >> 12;
                int var43 = var40 >> 12;
                int var44 = var43 + 1;
                int var45 = var40 & 4095;
                if (var44 >= var42) {
                    var44 = 0;
                }
                int var46 = this.field7124[255 & var44] & 255;
                int var47 = class538.field7440[var45];
                int var48 = this.field7124[255 & var43] & 255;
                if (!this.field7132) {
                    for (int var49 = 0; var49 < class525.field7275; ++var49) {
                        int var50 = class733.field9899[var49] * this.field7130;
                        int var51 = this.method3002(var46, var45, var41, var38 * var50 >> 12, var47, true, var48);
                        arg1[var49] = var39 * var51 >> 12;
                    }
                } else {
                    for (int var52 = 0; ~var52 > ~class525.field7275; ++var52) {
                        int var53 = class733.field9899[var52] * this.field7130;
                        int var54 = this.method3002(var46, var45, var41, var38 * var53 >> 12, var47, true, var48);
                        int var55 = var39 * var54 >> 12;
                        arg1[var52] = (var55 >> 1) + 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIIZI)I")
    private final int method3002(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        ++field7127;
        int var8 = arg3 >> 12;
        int var9 = var8 - -1;
        int var10 = var8 & 255;
        int var11 = arg3 & 4095;
        if (~var9 <= ~arg2) {
            var9 = 0;
        }
        int var12 = var9 & 255;
        int var13 = var11 + -4096;
        int var14 = arg1 + -4096;
        int var15 = 3 & this.field7124[arg6 + var10];
        int var16 = class538.field7440[var11];
        int var17;
        if (var15 > 1) {
            var17 = ~var15 == -3 ? var11 - arg1 : -arg1 + -var11;
        } else {
            var17 = var15 != 0 ? arg1 - var11 : arg1 + var11;
        }
        int var18 = 3 & this.field7124[arg6 + var12];
        int var19;
        if (~var18 >= -2) {
            var19 = ~var18 == -1 ? arg1 + var13 : -var13 + arg1;
        } else {
            var19 = var18 != 2 ? -arg1 + -var13 : -arg1 + var13;
        }
        int var20 = this.field7124[arg0 + var10] & 3;
        if (!arg5) {
            return -82;
        } else {
            int var21 = var17 - -((-var17 + var19) * var16 >> 12);
            int var22;
            if (~var20 < -2) {
                var22 = var20 == 2 ? -var14 + var11 : -var11 - var14;
            } else {
                var22 = var20 != 0 ? -var11 + var14 : var11 - -var14;
            }
            int var23 = 3 & this.field7124[arg0 + var12];
            int var24;
            if (var23 > 1) {
                var24 = ~var23 == -3 ? -var14 + var13 : -var13 - var14;
            } else {
                var24 = var23 == 0 ? var13 - -var14 : -var13 + var14;
            }
            int var25 = ((-var22 + var24) * var16 >> 12) + var22;
            return var21 - -((-var21 + var25) * arg4 >> 12);
        }
    }
}
