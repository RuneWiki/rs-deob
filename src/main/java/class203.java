import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class203 extends class694 {

    @OriginalMember(owner = "client!bea", name = "G", descriptor = "I")
    public int field2974 = 1638;

    @OriginalMember(owner = "client!bea", name = "H", descriptor = "I")
    public int field2975 = 4;

    @OriginalMember(owner = "client!bea", name = "Q", descriptor = "[B")
    private byte[] field2984 = new byte[512];

    @OriginalMember(owner = "client!bea", name = "N", descriptor = "I")
    public int field2981 = 4;

    @OriginalMember(owner = "client!bea", name = "U", descriptor = "I")
    public int field2988 = 0;

    @OriginalMember(owner = "client!bea", name = "T", descriptor = "Z")
    public boolean field2987 = true;

    @OriginalMember(owner = "client!bea", name = "K", descriptor = "I")
    public int field2978 = 4;

    @OriginalMember(owner = "client!bea", name = "F", descriptor = "Z")
    public static boolean field2973 = false;

    @OriginalMember(owner = "client!bea", name = "J", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!bea", name = "L", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!bea", name = "O", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!bea", name = "P", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!bea", name = "R", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!bea", name = "S", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!bea", name = "V", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!bea", name = "W", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!bea", name = "I", descriptor = "[S")
    private short[] field2976;

    @OriginalMember(owner = "client!bea", name = "M", descriptor = "[S")
    private short[] field2980;

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "()V")
    public class203() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIII)I")
    public static final int method1355(int arg0, int arg1, int arg2, int arg3) {
        ++field2983;
        if (class144.field2149 == null) {
            return 0;
        } else {
            int var4 = arg1 >> 9;
            int var5 = arg0 >> 9;
            if (var4 >= 0 && ~var5 <= -1 && var4 <= class86.field1185 - 1 && var5 <= class526.field7212 + -1) {
                if (arg2 != 4) {
                    return -7;
                } else {
                    int var6 = arg3;
                    if (~arg3 > -4 && (class246.field3501[1][var4][var5] & 2) != 0) {
                        var6 = arg3 + 1;
                    }
                    return class144.field2149[var6].method267(arg1, arg0);
                }
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIIIIII)I")
    private final int method1356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2990;
        if (arg6 != 28351) {
            this.method39(41, 118);
        }
        int var8 = arg3 >> 12;
        int var9 = var8 + 1;
        int var10 = var8 & 255;
        int var11 = arg3 & 4095;
        if (~var9 <= ~arg4) {
            var9 = 0;
        }
        int var12 = var9 & 255;
        int var13 = var11 - 4096;
        int var14 = arg2 - 4096;
        int var15 = class528.field7228[var11];
        int var16 = this.field2984[var10 - -arg5] & 3;
        int var17;
        if (~var16 < -2) {
            var17 = ~var16 != -3 ? -arg2 + -var11 : var11 - arg2;
        } else {
            var17 = var16 != 0 ? -var11 + arg2 : arg2 + var11;
        }
        int var18 = 3 & this.field2984[arg5 + var12];
        int var19;
        if (var18 > 1) {
            var19 = ~var18 != -3 ? -arg2 + -var13 : -arg2 + var13;
        } else {
            var19 = ~var18 != -1 ? arg2 - var13 : var13 - -arg2;
        }
        int var20 = ((-var17 + var19) * var15 >> 12) + var17;
        int var21 = this.field2984[arg1 + var10] & 3;
        int var22;
        if (var21 > 1) {
            var22 = var21 == 2 ? -var14 + var11 : -var11 - var14;
        } else {
            var22 = ~var21 == -1 ? var11 + var14 : -var11 + var14;
        }
        int var23 = 3 & this.field2984[var12 - -arg1];
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? -var14 + var13 : -var13 + -var14;
        } else {
            var24 = var23 != 0 ? var14 - var13 : var13 + var14;
        }
        int var25 = ((var24 - var22) * var15 >> 12) + var22;
        return ((-var20 + var25) * arg0 >> 12) + var20;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field2986;
        if (arg0 <= 112) {
            this.method1358(95, -28, (int[]) null);
        }
        int[] var3 = super.field9751.method2712(arg1, (byte) 118);
        if (super.field9751.field6674) {
            this.method1358(96, arg1, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bea", name = "g", descriptor = "(I)V")
    public final void method40(int arg0) {
        ++field2982;
        if (arg0 <= 5) {
            this.field2988 = -45;
        }
        this.field2984 = class356.method2110(this.field2988, -109);
        this.method1357((byte) 122);
        for (int var2 = this.field2981 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field2976[var2];
            if (var3 > 8 || var3 < -8) {
                return;
            }
            --this.field2981;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(B)V")
    private final void method1357(byte arg0) {
        if (arg0 >= 39) {
            if (~this.field2974 < -1) {
                this.field2976 = new short[this.field2981];
                this.field2980 = new short[this.field2981];
                for (int var2 = 0; var2 < this.field2981; ++var2) {
                    this.field2976[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field2974 / 4096.0F), (double) var2)));
                    this.field2980[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            } else if (this.field2976 != null && ~this.field2976.length == ~this.field2981) {
                this.field2980 = new short[this.field2981];
                for (int var3 = 0; ~this.field2981 < ~var3; ++var3) {
                    this.field2980[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
            ++field2985;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILjr;B)V")
    public final void method19(int arg0, class96 arg1, byte arg2) {
        ++field2989;
        int var4 = 37 % ((58 - arg2) / 63);
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field2981 = arg1.method718(-113);
            } else {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        this.field2975 = this.field2978 = arg1.method718(-59);
                        return;
                    }
                    if (~arg0 == -5) {
                        this.field2988 = arg1.method718(-120);
                        return;
                    }
                    if (~arg0 == -6) {
                        this.field2975 = arg1.method718(-58);
                        return;
                    }
                    if (arg0 == 6) {
                        this.field2978 = arg1.method718(81);
                        return;
                    }
                } else {
                    this.field2974 = arg1.method722(4);
                    if (this.field2974 < 0) {
                        this.field2976 = new short[this.field2981];
                        for (int var6 = 0; this.field2981 > var6; ++var6) {
                            this.field2976[var6] = (short) arg1.method722(4);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field2987 = ~arg1.method718(-93) == -2;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(II[I)V")
    public final void method1358(int arg0, int arg1, int[] arg2) {
        ++field2979;
        int var4 = class105.field1409[arg1] * this.field2978;
        if (arg0 < 60) {
            this.method1356(-95, 118, -5, -106, 3, -74, -124);
        }
        if (this.field2981 != 1) {
            short var5 = this.field2976[0];
            if (var5 > 8 || var5 < -8) {
                int var6 = this.field2980[0] << 12;
                int var7 = this.field2978 * var6 >> 12;
                int var8 = this.field2975 * var6 >> 12;
                int var9 = var4 * var6 >> 12;
                int var10 = var9 >> 12;
                int var11 = var10 + 1;
                if (~var11 <= ~var7) {
                    var11 = 0;
                }
                int var12 = var9 & 4095;
                int var13 = this.field2984[255 & var11] & 255;
                int var14 = 255 & this.field2984[var10 & 255];
                int var15 = class528.field7228[var12];
                for (int var16 = 0; class465.field6544 > var16; ++var16) {
                    int var36 = class346.field4994[var16] * this.field2975;
                    int var37 = this.method1356(var15, var13, var12, var6 * var36 >> 12, var8, var14, 28351);
                    arg2[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; ~var17 > ~this.field2981; ++var17) {
                short var18 = this.field2976[var17];
                if (var18 > 8 || var18 < -8) {
                    int var19 = this.field2980[var17] << 12;
                    int var20 = this.field2975 * var19 >> 12;
                    int var21 = var4 * var19 >> 12;
                    int var22 = this.field2978 * var19 >> 12;
                    int var23 = var21 >> 12;
                    int var24 = var23 + 1;
                    if (~var24 <= ~var22) {
                        var24 = 0;
                    }
                    int var25 = var21 & 4095;
                    int var26 = class528.field7228[var25];
                    int var27 = 255 & this.field2984[255 & var23];
                    int var28 = 255 & this.field2984[var24 & 255];
                    if (this.field2987 && ~(this.field2981 + -1) == ~var17) {
                        for (int var29 = 0; class465.field6544 > var29; ++var29) {
                            int var30 = class346.field4994[var29] * this.field2975;
                            int var31 = this.method1356(var26, var28, var25, var19 * var30 >> 12, var20, var27, 28351);
                            int var32 = arg2[var29] - -(var18 * var31 >> 12);
                            arg2[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; var33 < class465.field6544; ++var33) {
                            int var34 = class346.field4994[var33] * this.field2975;
                            int var35 = this.method1356(var26, var28, var25, var19 * var34 >> 12, var20, var27, 28351);
                            arg2[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            short var38 = this.field2976[0];
            int var39 = this.field2980[0] << 12;
            int var40 = var4 * var39 >> 12;
            int var41 = this.field2978 * var39 >> 12;
            int var42 = this.field2975 * var39 >> 12;
            int var43 = var40 >> 12;
            int var44 = var43 + 1;
            int var45 = var40 & 4095;
            if (~var41 >= ~var44) {
                var44 = 0;
            }
            int var46 = 255 & this.field2984[255 & var44];
            int var47 = this.field2984[255 & var43] & 255;
            int var48 = class528.field7228[var45];
            if (this.field2987) {
                for (int var49 = 0; var49 < class465.field6544; ++var49) {
                    int var50 = class346.field4994[var49] * this.field2975;
                    int var51 = this.method1356(var48, var46, var45, var39 * var50 >> 12, var42, var47, 28351);
                    int var52 = var38 * var51 >> 12;
                    arg2[var49] = (var52 >> 1) + 2048;
                }
            } else {
                for (int var53 = 0; var53 < class465.field6544; ++var53) {
                    int var54 = class346.field4994[var53] * this.field2975;
                    int var55 = this.method1356(var48, var46, var45, var39 * var54 >> 12, var42, var47, 28351);
                    arg2[var53] = var38 * var55 >> 12;
                }
            }
        }
    }
}
