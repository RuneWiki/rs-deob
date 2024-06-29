import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class703 extends class529 {

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "Z")
    public boolean field9906 = true;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "I")
    public int field9915 = 4;

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "I")
    public int field9909 = 4;

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "I")
    public int field9916 = 4;

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "I")
    public int field9913 = 1638;

    @OriginalMember(owner = "client!gj", name = "S", descriptor = "[B")
    private byte[] field9918 = new byte[512];

    @OriginalMember(owner = "client!gj", name = "V", descriptor = "I")
    public int field9921 = 0;

    @OriginalMember(owner = "client!gj", name = "H", descriptor = "Lus;")
    public static class328 field9907 = new class328(70, 18);

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "Lus;")
    public static class328 field9920 = new class328(24, 4);

    @OriginalMember(owner = "client!gj", name = "W", descriptor = "I")
    public static int field9922 = 0;

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "I")
    public static int field9905;

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "I")
    public static int field9908;

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
    public static int field9911;

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "I")
    public static int field9912;

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "I")
    public static int field9914;

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "I")
    public static int field9917;

    @OriginalMember(owner = "client!gj", name = "T", descriptor = "I")
    public static int field9919;

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "[S")
    private short[] field9904;

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "[S")
    private short[] field9910;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(B)V", line = 12)
    public static void method3898(byte arg0) {
        field9907 = null;
        field9920 = null;
        if (arg0 != -109) {
            method3898((byte) 26);
        }
    }

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)V", line = 23)
    private final void method3899(int arg0) {
        if (this.field9913 > 0) {
            this.field9904 = new short[this.field9909];
            this.field9910 = new short[this.field9909];
            for (int var2 = 0; ~this.field9909 < ~var2; ++var2) {
                this.field9910[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field9913 / 4096.0F), (double) var2)));
                this.field9904[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field9910 != null && this.field9910.length == this.field9909) {
            this.field9904 = new short[this.field9909];
            for (int var3 = 0; ~var3 > ~this.field9909; ++var3) {
                this.field9904[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field9908;
        if (arg0 > -95) {
            method3898((byte) -93);
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V", line = 63)
    public final void method303(int arg0) {
        ++field9919;
        this.field9918 = class516.method2960(255, this.field9921);
        this.method3899(-117);
        for (int var2 = this.field9909 - 1; var2 >= 1; --var2) {
            short var3 = this.field9910[var2];
            if (var3 > 8 || ~var3 > 7) {
                break;
            }
            --this.field9909;
        }
        if (arg0 > -92) {
            this.method190(-122, (byte) 44, (class179) null);
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V", line = 282)
    public class703() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIBIIII)I", line = 102)
    private final int method3900(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9911;
        int var8 = arg6 >> 12;
        int var9 = var8 - -1;
        if (~var9 <= ~arg4) {
            var9 = 0;
        }
        int var10 = var8 & 255;
        int var11 = arg6 & 4095;
        int var12 = var11 + -4096;
        int var13 = arg1 + -4096;
        int var14 = var9 & 255;
        int var15 = class177.field2288[var11];
        int var16 = this.field9918[arg3 + var10] & 3;
        int var17;
        if (var16 > 1) {
            var17 = ~var16 != -3 ? -arg1 + -var11 : var11 - arg1;
        } else {
            var17 = var16 != 0 ? -var11 + arg1 : arg1 + var11;
        }
        int var18 = this.field9918[arg3 + var14] & 3;
        int var19;
        if (~var18 < -2) {
            var19 = var18 == 2 ? -arg1 + var12 : -arg1 + -var12;
        } else {
            var19 = ~var18 == -1 ? arg1 + var12 : -var12 + arg1;
        }
        if (arg2 != 79) {
            return -100;
        } else {
            int var20 = var17 - -((var19 - var17) * var15 >> 12);
            int var21 = this.field9918[arg5 + var10] & 3;
            int var22;
            if (var21 <= 1) {
                var22 = ~var21 == -1 ? var11 + var13 : -var11 + var13;
            } else {
                var22 = var21 == 2 ? -var13 + var11 : -var11 - var13;
            }
            int var23 = 3 & this.field9918[arg5 + var14];
            int var24;
            if (var23 > 1) {
                var24 = ~var23 == -3 ? var12 - var13 : -var12 - var13;
            } else {
                var24 = ~var23 == -1 ? var12 + var13 : -var12 + var13;
            }
            int var25 = ((-var22 + var24) * var15 >> 12) + var22;
            return var20 - -((-var20 + var25) * arg0 >> 12);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBLtn;)V", line = 177)
    public final void method190(int arg0, byte arg1, class179 arg2) {
        ++field9912;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field9915 = arg2.method1094(255);
                                }
                            } else {
                                this.field9916 = arg2.method1094(255);
                            }
                        } else {
                            this.field9921 = arg2.method1094(255);
                        }
                    } else {
                        this.field9916 = this.field9915 = arg2.method1094(255);
                    }
                } else {
                    this.field9913 = arg2.method1137((byte) -103);
                    if (~this.field9913 > -1) {
                        this.field9910 = new short[this.field9909];
                        for (int var5 = 0; ~this.field9909 < ~var5; ++var5) {
                            this.field9910[var5] = (short) arg2.method1137((byte) -79);
                        }
                    }
                }
            } else {
                this.field9909 = arg2.method1094(255);
            }
        } else {
            this.field9906 = arg2.method1094(255) == 1;
        }
        if (arg1 < 45) {
            this.method3900(46, -125, (byte) 97, 43, 103, 8, -100);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[II)V", line = 285)
    public final void method3901(int arg0, int[] arg1, int arg2) {
        ++field9917;
        int var4 = class310.field3960[arg0] * this.field9915;
        if (arg2 >= 37) {
            if (this.field9909 == 1) {
                int var5 = this.field9904[0] << 12;
                short var6 = this.field9910[0];
                int var7 = this.field9915 * var5 >> 12;
                int var8 = var4 * var5 >> 12;
                int var9 = this.field9916 * var5 >> 12;
                int var10 = var8 >> 12;
                int var11 = var10 + 1;
                int var12 = var8 & 4095;
                if (~var11 <= ~var7) {
                    var11 = 0;
                }
                int var13 = this.field9918[255 & var10] & 255;
                int var14 = class177.field2288[var12];
                int var15 = this.field9918[var11 & 255] & 255;
                if (this.field9906) {
                    for (int var16 = 0; ~var16 > ~class304.field3909; ++var16) {
                        int var17 = class225.field2973[var16] * this.field9916;
                        int var18 = this.method3900(var14, var12, (byte) 79, var13, var9, var15, var5 * var17 >> 12);
                        int var19 = var6 * var18 >> 12;
                        arg1[var16] = 2048 - -(var19 >> 1);
                    }
                } else {
                    for (int var20 = 0; var20 < class304.field3909; ++var20) {
                        int var21 = class225.field2973[var20] * this.field9916;
                        int var22 = this.method3900(var14, var12, (byte) 79, var13, var9, var15, var5 * var21 >> 12);
                        arg1[var20] = var6 * var22 >> 12;
                    }
                }
            } else {
                short var23 = this.field9910[0];
                if (~var23 < -9 || var23 < -8) {
                    int var24 = this.field9904[0] << 12;
                    int var25 = var4 * var24 >> 12;
                    int var26 = this.field9916 * var24 >> 12;
                    int var27 = this.field9915 * var24 >> 12;
                    int var28 = var25 >> 12;
                    int var29 = var28 - -1;
                    if (var29 >= var27) {
                        var29 = 0;
                    }
                    int var30 = var25 & 4095;
                    int var31 = class177.field2288[var30];
                    int var32 = 255 & this.field9918[255 & var28];
                    int var33 = this.field9918[var29 & 255] & 255;
                    for (int var34 = 0; var34 < class304.field3909; ++var34) {
                        int var54 = class225.field2973[var34] * this.field9916;
                        int var55 = this.method3900(var31, var30, (byte) 79, var32, var26, var33, var24 * var54 >> 12);
                        arg1[var34] = var23 * var55 >> 12;
                    }
                }
                for (int var35 = 1; ~this.field9909 < ~var35; ++var35) {
                    short var36 = this.field9910[var35];
                    if (~var36 < -9 || ~var36 > 7) {
                        int var37 = this.field9904[var35] << 12;
                        int var38 = this.field9915 * var37 >> 12;
                        int var39 = this.field9916 * var37 >> 12;
                        int var40 = var4 * var37 >> 12;
                        int var41 = var40 >> 12;
                        int var42 = var41 - -1;
                        if (var42 >= var38) {
                            var42 = 0;
                        }
                        int var43 = var40 & 4095;
                        int var44 = this.field9918[var42 & 255] & 255;
                        int var45 = this.field9918[var41 & 255] & 255;
                        int var46 = class177.field2288[var43];
                        if (this.field9906 && this.field9909 + -1 == var35) {
                            for (int var47 = 0; var47 < class304.field3909; ++var47) {
                                int var48 = class225.field2973[var47] * this.field9916;
                                int var49 = this.method3900(var46, var43, (byte) 79, var45, var39, var44, var37 * var48 >> 12);
                                int var50 = (var36 * var49 >> 12) + arg1[var47];
                                arg1[var47] = (var50 >> 1) + 2048;
                            }
                        } else {
                            for (int var51 = 0; class304.field3909 > var51; ++var51) {
                                int var52 = class225.field2973[var51] * this.field9916;
                                int var53 = this.method3900(var46, var43, (byte) 79, var45, var39, var44, var37 * var52 >> 12);
                                arg1[var51] += var36 * var53 >> 12;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)[I", line = 447)
    public final int[] method191(int arg0, byte arg1) {
        ++field9914;
        int[] var3 = super.field7456.method1635(arg0, -95);
        if (super.field7456.field3449) {
            this.method3901(arg0, var3, 123);
        }
        int var4 = -16 / ((27 - arg1) / 49);
        return var3;
    }
}
