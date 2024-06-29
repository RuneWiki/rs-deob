import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class227 extends class276 {

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    private int field3815 = 4;

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "Z")
    private boolean field3825 = true;

    @OriginalMember(owner = "client!kd", name = "Z", descriptor = "I")
    private int field3826 = 4;

    @OriginalMember(owner = "client!kd", name = "ab", descriptor = "I")
    private int field3827 = 1638;

    @OriginalMember(owner = "client!kd", name = "V", descriptor = "I")
    private int field3822 = 0;

    @OriginalMember(owner = "client!kd", name = "db", descriptor = "[B")
    private byte[] field3830 = new byte[512];

    @OriginalMember(owner = "client!kd", name = "eb", descriptor = "I")
    private int field3831 = 4;

    @OriginalMember(owner = "client!kd", name = "X", descriptor = "Z")
    public static boolean field3824 = false;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!kd", name = "W", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!kd", name = "bb", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!kd", name = "cb", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!kd", name = "fb", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!kd", name = "gb", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!kd", name = "hb", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "[S")
    private short[] field3816;

    @OriginalMember(owner = "client!kd", name = "ib", descriptor = "[S")
    private short[] field3835;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)V")
    private final void method1523(byte arg0) {
        ++field3823;
        if (this.field3827 <= 0) {
            if (this.field3816 != null && this.field3816.length == this.field3815) {
                this.field3835 = new short[this.field3815];
                for (int var2 = 0; ~this.field3815 < ~var2; ++var2) {
                    this.field3835[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field3835 = new short[this.field3815];
            this.field3816 = new short[this.field3815];
            for (int var3 = 0; var3 < this.field3815; ++var3) {
                this.field3816[var3] = (short) ((int) (Math.pow((double) ((float) this.field3827 / 4096.0F), (double) var3) * 4096.0D));
                this.field3835[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 <= 35) {
            field3833 = 115;
        }
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)V")
    public static final void method1524(int arg0) {
        if (arg0 < -35) {
            class81.field1430.method53(true);
            class274.field4392.method53(true);
            ++field3818;
        }
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)V")
    public static final void method1525(byte arg0) {
        class239.field3925.method58(0);
        if (arg0 == -110) {
            ++field3829;
            class153.field2549.method58(0);
            class189.field3067.method58(0);
            class264.field4291.method58(0);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        int[] var3 = super.field4425.method992(17118, arg1);
        if (arg0 <= 39) {
            method1525((byte) -82);
        }
        ++field3828;
        if (super.field4425.field2448) {
            this.method1529(arg1, var3, 623758252);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)V")
    public static final void method1526(byte arg0, int arg1) {
        ++field3832;
        class144 var2 = (class144) class53.field923.method779(-105, (long) arg1);
        if (arg0 >= -124) {
            field3833 = -62;
        }
        if (var2 != null) {
            var2.method547(10026);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIII)I")
    private final int method1527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3813;
        if (arg6 > -75) {
            return 4;
        } else {
            int var8 = arg0 + -4096;
            int var9 = arg4 >> 12;
            int var10 = var9 + 1;
            int var11 = var9 & 255;
            int var12 = arg4 & 4095;
            int var13 = this.field3830[arg3 + var11] & 3;
            int var14;
            if (var13 <= 1) {
                var14 = ~var13 == -1 ? arg0 + var12 : -var12 + arg0;
            } else {
                var14 = var13 == 2 ? -arg0 + var12 : -arg0 + -var12;
            }
            int var15 = var12 + -4096;
            if (var10 >= arg1) {
                var10 = 0;
            }
            int var16 = class52.field909[var12];
            int var17 = var10 & 255;
            int var18 = this.field3830[var17 - -arg3] & 3;
            int var19;
            if (~var18 >= -2) {
                var19 = var18 == 0 ? var15 - -arg0 : arg0 - var15;
            } else {
                var19 = ~var18 == -3 ? -arg0 + var15 : -var15 - arg0;
            }
            int var20 = var14 - -((var19 - var14) * var16 >> 12);
            int var21 = 3 & this.field3830[arg2 + var11];
            int var22;
            if (~var21 < -2) {
                var22 = ~var21 == -3 ? -var8 + var12 : -var8 + -var12;
            } else {
                var22 = var21 != 0 ? -var12 + var8 : var8 + var12;
            }
            int var23 = this.field3830[arg2 + var17] & 3;
            int var24;
            if (var23 <= 1) {
                var24 = var23 != 0 ? var8 - var15 : var8 + var15;
            } else {
                var24 = ~var23 == -3 ? var15 - var8 : -var15 - var8;
            }
            int var25 = ((-var22 + var24) * var16 >> 12) + var22;
            return ((-var20 + var25) * arg5 >> 12) + var20;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
    public class227() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (arg2 != -1) {
            this.field3830 = null;
        }
        ++field3820;
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field3815 = arg1.method669((byte) 36);
            } else {
                if (~arg0 != -3) {
                    if (~arg0 == -4) {
                        this.field3831 = this.field3826 = arg1.method669((byte) 36);
                        return;
                    }
                    if (~arg0 == -5) {
                        this.field3822 = arg1.method669((byte) 36);
                        return;
                    }
                    if (arg0 == 5) {
                        this.field3831 = arg1.method669((byte) 36);
                        return;
                    }
                    if (arg0 == 6) {
                        this.field3826 = arg1.method669((byte) 36);
                        return;
                    }
                } else {
                    this.field3827 = arg1.method686(-3);
                    if (this.field3827 < 0) {
                        this.field3816 = new short[this.field3815];
                        for (int var5 = 0; ~this.field3815 < ~var5; ++var5) {
                            this.field3816[var5] = (short) arg1.method686(-3);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field3825 = ~arg1.method669((byte) 36) == -2;
        }
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)V")
    public static final void method1528(int arg0) {
        ++field3814;
        if (class273.field4378 != null && ~(class273.field4378.field1397 - (64 * class273.field4378.method528(-36) - 64) >> 7) == ~class79.field1364 && ~(class273.field4378.field1458 + 64 + -(class273.field4378.method528(-119) * 64) >> 7) == ~class53.field927) {
            class79.field1364 = 0;
        }
        for (int var1 = 0; ~var1 > -105; ++var1) {
            for (int var6 = 0; ~var6 > -105; ++var6) {
                class50.field861[var1][var6] = 0;
            }
        }
        if (arg0 == 64) {
            for (int var2 = 0; class157.field2624 > var2; ++var2) {
                class288 var5 = class105.field1874[class280.field4458[var2]];
                if (var5 != null) {
                    var5.field1428 = false;
                }
            }
            for (int var3 = 0; var3 < class187.field3037; ++var3) {
                class141 var4 = class42.field625[class292.field4668[var3]];
                if (var4 != null) {
                    var4.field1428 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[II)V")
    private final void method1529(int arg0, int[] arg1, int arg2) {
        ++field3817;
        int var4 = class206.field3389[arg0] * this.field3826;
        if (arg2 == 623758252) {
            if (~this.field3815 != -2) {
                short var5 = this.field3816[0];
                if (var5 > 8 || var5 < -8) {
                    int var6 = this.field3835[0] << 12;
                    int var7 = var4 * var6 >> 12;
                    int var8 = this.field3831 * var6 >> 12;
                    int var9 = this.field3826 * var6 >> 12;
                    int var10 = var7 >> 12;
                    int var11 = var10 + 1;
                    if (~var11 <= ~var9) {
                        var11 = 0;
                    }
                    int var12 = this.field3830[var11 & 255] & 255;
                    int var13 = this.field3830[var10 & 255] & 255;
                    int var14 = var7 & 4095;
                    int var15 = class52.field909[var14];
                    for (int var16 = 0; class53.field929 > var16; ++var16) {
                        int var36 = class175.field2883[var16] * this.field3831;
                        int var37 = this.method1527(var14, var8, var12, var13, var6 * var36 >> 12, var15, -86);
                        arg1[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; ~var17 > ~this.field3815; ++var17) {
                    short var18 = this.field3816[var17];
                    if (~var18 < -9 || var18 < -8) {
                        int var19 = this.field3835[var17] << 12;
                        int var20 = var4 * var19 >> 12;
                        int var21 = this.field3831 * var19 >> 12;
                        int var22 = var20 >> 12;
                        int var23 = var20 & 4095;
                        int var24 = this.field3826 * var19 >> 12;
                        int var25 = this.field3830[var22 & 255] & 255;
                        int var26 = var22 - -1;
                        if (var26 >= var24) {
                            var26 = 0;
                        }
                        int var27 = 255 & this.field3830[var26 & 255];
                        int var28 = class52.field909[var23];
                        if (this.field3825 && ~(this.field3815 + -1) == ~var17) {
                            for (int var29 = 0; ~class53.field929 < ~var29; ++var29) {
                                int var30 = class175.field2883[var29] * this.field3831;
                                int var31 = this.method1527(var23, var21, var27, var25, var19 * var30 >> 12, var28, -119);
                                int var32 = (var18 * var31 >> 12) + arg1[var29];
                                arg1[var29] = (var32 >> 1) + 2048;
                            }
                        } else {
                            for (int var33 = 0; class53.field929 > var33; ++var33) {
                                int var34 = class175.field2883[var33] * this.field3831;
                                int var35 = this.method1527(var23, var21, var27, var25, var19 * var34 >> 12, var28, -107);
                                arg1[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                short var38 = this.field3816[0];
                int var39 = this.field3835[0] << 12;
                int var40 = this.field3831 * var39 >> 12;
                int var41 = this.field3826 * var39 >> 12;
                int var42 = var4 * var39 >> 12;
                int var43 = var42 >> 12;
                int var44 = this.field3830[var43 & 255] & 255;
                int var45 = var42 & 4095;
                int var46 = class52.field909[var45];
                int var47 = var43 - -1;
                if (var47 >= var41) {
                    var47 = 0;
                }
                int var48 = 255 & this.field3830[255 & var47];
                if (this.field3825) {
                    for (int var49 = 0; class53.field929 > var49; ++var49) {
                        int var50 = class175.field2883[var49] * this.field3831;
                        int var51 = this.method1527(var45, var40, var48, var44, var39 * var50 >> 12, var46, -103);
                        int var52 = var38 * var51 >> 12;
                        arg1[var49] = 2048 - -(var52 >> 1);
                    }
                } else {
                    for (int var53 = 0; class53.field929 > var53; ++var53) {
                        int var54 = class175.field2883[var53] * this.field3831;
                        int var55 = this.method1527(var45, var40, var48, var44, var39 * var54 >> 12, var46, arg2 ^ -623758325);
                        arg1[var53] = var38 * var55 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
    public final void method22(int arg0) {
        this.field3830 = class50.method305((byte) -128, this.field3822);
        this.method1523((byte) 46);
        if (arg0 > 66) {
            ++field3819;
            for (int var2 = this.field3815 - 1; ~var2 <= -2; --var2) {
                short var3 = this.field3816[var2];
                if (~var3 < -9 || var3 < -8) {
                    return;
                }
                --this.field3815;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;I)I")
    public static final int method1530(boolean arg0, String arg1, String arg2, int arg3) {
        int var4 = arg1.length();
        ++field3834;
        int var5 = arg2.length();
        if (!arg0) {
            return 5;
        } else {
            int var6 = 0;
            int var7 = 0;
            char var8 = 0;
            char var9 = 0;
            while (var4 > -var8 + var7 || ~var5 < ~(var6 - var9)) {
                if (~var4 >= ~(-var8 + var7)) {
                    return -1;
                }
                if (var5 <= -var9 + var6) {
                    return 1;
                }
                char var22;
                if (~var8 == -1) {
                    var22 = arg1.charAt(var7++);
                } else {
                    var22 = var8;
                    boolean var23 = false;
                }
                char var24;
                if (~var9 == -1) {
                    var24 = arg2.charAt(var6++);
                } else {
                    var24 = var9;
                    boolean var25 = false;
                }
                var8 = class31.method211(var22, (byte) 97);
                var9 = class31.method211(var24, (byte) 97);
                char var26 = class254.method1680(var22, -87, arg3);
                char var27 = class254.method1680(var24, -76, arg3);
                if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                    char var28 = Character.toLowerCase(var26);
                    char var29 = Character.toLowerCase(var27);
                    if (~var28 != ~var29) {
                        return class60.method371(arg3, 14528, var28) + -class60.method371(arg3, 14528, var29);
                    }
                }
            }
            int var10 = Math.min(var4, var5);
            for (int var11 = 0; ~var11 > ~var10; ++var11) {
                int var16;
                int var17;
                if (~arg3 != -3) {
                    var16 = var11;
                    var17 = var11;
                } else {
                    var17 = -var11 + var4 - 1;
                    var16 = var5 + -1 + -var11;
                }
                char var18 = arg1.charAt(var17);
                char var19 = arg2.charAt(var16);
                if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                    char var20 = Character.toLowerCase(var18);
                    char var21 = Character.toLowerCase(var19);
                    if (var20 != var21) {
                        return class60.method371(arg3, 14528, var20) - class60.method371(arg3, 14528, var21);
                    }
                }
            }
            int var12 = -var5 + var4;
            if (~var12 != -1) {
                return var12;
            } else {
                for (int var13 = 0; var13 < var10; ++var13) {
                    char var14 = arg1.charAt(var13);
                    char var15 = arg2.charAt(var13);
                    if (var14 != var15) {
                        return class60.method371(arg3, 14528, var14) - class60.method371(arg3, 14528, var15);
                    }
                }
                return 0;
            }
        }
    }
}
