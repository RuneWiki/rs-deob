import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class255 extends class573 {

    @OriginalMember(owner = "client!mm", name = "Q", descriptor = "I")
    public int field3779 = 1638;

    @OriginalMember(owner = "client!mm", name = "X", descriptor = "I")
    public int field3786 = 0;

    @OriginalMember(owner = "client!mm", name = "V", descriptor = "Z")
    public boolean field3784 = true;

    @OriginalMember(owner = "client!mm", name = "I", descriptor = "I")
    public int field3772 = 4;

    @OriginalMember(owner = "client!mm", name = "Y", descriptor = "[B")
    private byte[] field3787 = new byte[512];

    @OriginalMember(owner = "client!mm", name = "U", descriptor = "I")
    public int field3783 = 4;

    @OriginalMember(owner = "client!mm", name = "Z", descriptor = "I")
    public int field3788 = 4;

    @OriginalMember(owner = "client!mm", name = "K", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!mm", name = "L", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!mm", name = "N", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!mm", name = "O", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!mm", name = "P", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!mm", name = "R", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!mm", name = "S", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!mm", name = "W", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!mm", name = "ab", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!mm", name = "M", descriptor = "[S")
    private short[] field3775;

    @OriginalMember(owner = "client!mm", name = "T", descriptor = "[S")
    private short[] field3782;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
    public static final String method1692(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field3776;
        if (arg3 > -115) {
            method1696(106, -7, (byte) 36);
        }
        char[] var4 = new char[arg2];
        int var5 = 0;
        for (int var6 = 0; var6 < arg2; ++var6) {
            int var7 = 255 & arg1[arg0 + var6];
            if (~var7 != -1) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class343.field5108[var7 + -128];
                    if (var8 == 0) {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIIIB)I")
    private final int method1693(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        ++field3778;
        int var8 = arg4 >> 12;
        int var9 = var8 - -1;
        if (arg6 >= -81) {
            method1692(-20, (byte[]) null, 17, -110);
        }
        int var10 = var8 & 255;
        if (var9 >= arg3) {
            var9 = 0;
        }
        int var11 = arg4 & 4095;
        int var12 = var11 + -4096;
        int var13 = arg1 + -4096;
        int var14 = var9 & 255;
        int var15 = class335.field5014[var11];
        int var16 = 3 & this.field3787[arg0 + var10];
        int var17;
        if (var16 > 1) {
            var17 = var16 != 2 ? -arg1 + -var11 : var11 - arg1;
        } else {
            var17 = var16 == 0 ? var11 - -arg1 : arg1 - var11;
        }
        int var18 = 3 & this.field3787[arg0 + var14];
        int var19;
        if (var18 <= 1) {
            var19 = ~var18 == -1 ? arg1 + var12 : arg1 - var12;
        } else {
            var19 = var18 != 2 ? -arg1 + -var12 : -arg1 + var12;
        }
        int var20 = ((-var17 + var19) * var15 >> 12) + var17;
        int var21 = this.field3787[arg2 + var10] & 3;
        int var22;
        if (var21 > 1) {
            var22 = var21 != 2 ? -var11 + -var13 : var11 - var13;
        } else {
            var22 = ~var21 != -1 ? -var11 + var13 : var11 + var13;
        }
        int var23 = this.field3787[arg2 + var14] & 3;
        int var24;
        if (var23 <= 1) {
            var24 = var23 != 0 ? -var12 + var13 : var12 + var13;
        } else {
            var24 = var23 != 2 ? -var12 + -var13 : -var13 + var12;
        }
        int var25 = var22 - -((-var22 + var24) * var15 >> 12);
        return ((-var20 + var25) * arg5 >> 12) + var20;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        ++field3773;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field3788 = arg0.method732(-559537960);
                                }
                            } else {
                                this.field3783 = arg0.method732(arg2 ^ -559537957);
                            }
                        } else {
                            this.field3786 = arg0.method732(-559537960);
                        }
                    } else {
                        this.field3783 = this.field3788 = arg0.method732(arg2 + -559537963);
                    }
                } else {
                    this.field3779 = arg0.method721(-461515024);
                    if (~this.field3779 > -1) {
                        this.field3775 = new short[this.field3772];
                        for (int var5 = 0; var5 < this.field3772; ++var5) {
                            this.field3775[var5] = (short) arg0.method721(-461515024);
                        }
                    }
                }
            } else {
                this.field3772 = arg0.method732(-559537960);
            }
        } else {
            this.field3784 = ~arg0.method732(-559537960) == -2;
        }
        if (arg2 != 3) {
            this.field3782 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V")
    public class255() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field3789;
        if (arg1 != 1) {
            this.field3786 = -25;
        }
        int[] var3 = super.field8321.method3164(arg0, -117);
        if (super.field8321.field7825) {
            this.method1695(arg0, var3, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(B)V")
    private final void method1694(byte arg0) {
        if (this.field3779 > 0) {
            this.field3775 = new short[this.field3772];
            this.field3782 = new short[this.field3772];
            for (int var2 = 0; ~this.field3772 < ~var2; ++var2) {
                this.field3775[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field3779 / 4096.0F), (double) var2)));
                this.field3782[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field3775 != null && ~this.field3775.length == ~this.field3772) {
            this.field3782 = new short[this.field3772];
            for (int var3 = 0; var3 < this.field3772; ++var3) {
                this.field3782[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        int var4 = -106 % ((arg0 - 11) / 34);
        ++field3781;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I[IZ)V")
    public final void method1695(int arg0, int[] arg1, boolean arg2) {
        ++field3777;
        int var4 = class230.field3460[arg0] * this.field3788;
        if (!arg2) {
            if (this.field3772 != 1) {
                short var5 = this.field3775[0];
                if (~var5 < -9 || var5 < -8) {
                    int var6 = this.field3782[0] << 12;
                    int var7 = this.field3788 * var6 >> 12;
                    int var8 = var4 * var6 >> 12;
                    int var9 = this.field3783 * var6 >> 12;
                    int var10 = var8 >> 12;
                    int var11 = var10 + 1;
                    if (~var7 >= ~var11) {
                        var11 = 0;
                    }
                    int var12 = var8 & 4095;
                    int var13 = class335.field5014[var12];
                    int var14 = 255 & this.field3787[255 & var10];
                    int var15 = this.field3787[var11 & 255] & 255;
                    for (int var16 = 0; ~class540.field7555 < ~var16; ++var16) {
                        int var36 = class51.field1194[var16] * this.field3783;
                        int var37 = this.method1693(var14, var12, var15, var9, var6 * var36 >> 12, var13, (byte) -124);
                        arg1[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; ~this.field3772 < ~var17; ++var17) {
                    short var18 = this.field3775[var17];
                    if (var18 > 8 || ~var18 > 7) {
                        int var19 = this.field3782[var17] << 12;
                        int var20 = this.field3783 * var19 >> 12;
                        int var21 = var4 * var19 >> 12;
                        int var22 = this.field3788 * var19 >> 12;
                        int var23 = var21 >> 12;
                        int var24 = var23 + 1;
                        if (~var22 >= ~var24) {
                            var24 = 0;
                        }
                        int var25 = var21 & 4095;
                        int var26 = 255 & this.field3787[255 & var23];
                        int var27 = this.field3787[255 & var24] & 255;
                        int var28 = class335.field5014[var25];
                        if (this.field3784 && ~(this.field3772 - 1) == ~var17) {
                            for (int var29 = 0; class540.field7555 > var29; ++var29) {
                                int var30 = class51.field1194[var29] * this.field3783;
                                int var31 = this.method1693(var26, var25, var27, var20, var19 * var30 >> 12, var28, (byte) -110);
                                int var32 = (var18 * var31 >> 12) + arg1[var29];
                                arg1[var29] = (var32 >> 1) + 2048;
                            }
                        } else {
                            for (int var33 = 0; var33 < class540.field7555; ++var33) {
                                int var34 = class51.field1194[var33] * this.field3783;
                                int var35 = this.method1693(var26, var25, var27, var20, var19 * var34 >> 12, var28, (byte) -113);
                                arg1[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                int var38 = this.field3782[0] << 12;
                short var39 = this.field3775[0];
                int var40 = this.field3783 * var38 >> 12;
                int var41 = var4 * var38 >> 12;
                int var42 = this.field3788 * var38 >> 12;
                int var43 = var41 >> 12;
                int var44 = var43 + 1;
                if (var44 >= var42) {
                    var44 = 0;
                }
                int var45 = var41 & 4095;
                int var46 = this.field3787[var43 & 255] & 255;
                int var47 = this.field3787[255 & var44] & 255;
                int var48 = class335.field5014[var45];
                if (!this.field3784) {
                    for (int var49 = 0; class540.field7555 > var49; ++var49) {
                        int var50 = class51.field1194[var49] * this.field3783;
                        int var51 = this.method1693(var46, var45, var47, var40, var38 * var50 >> 12, var48, (byte) -111);
                        arg1[var49] = var39 * var51 >> 12;
                    }
                } else {
                    for (int var52 = 0; class540.field7555 > var52; ++var52) {
                        int var53 = class51.field1194[var52] * this.field3783;
                        int var54 = this.method1693(var46, var45, var47, var40, var38 * var53 >> 12, var48, (byte) -124);
                        int var55 = var39 * var54 >> 12;
                        arg1[var52] = 2048 - -(var55 >> 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1696(int arg0, int arg1, byte arg2) {
        ++field3780;
        if (arg2 >= -71) {
            return false;
        } else {
            return (262144 & arg0) != 0 | class167.method1269(arg0, arg1, (byte) -69) || class357.method2289((byte) 21, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
    public final void method617(int arg0) {
        ++field3774;
        this.field3787 = class490.method2947((byte) 114, this.field3786);
        this.method1694((byte) 98);
        for (int var2 = this.field3772 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field3775[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            --this.field3772;
        }
        if (arg0 != 4095) {
            this.field3786 = -81;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "([BIIIII)V")
    public static final void method1697(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 == -32709) {
            ++field3785;
            if (~arg5 < ~arg1) {
                int var6 = -arg1 + arg5 >> 2;
                int var7 = arg1 + arg3;
                while (true) {
                    --var6;
                    if (var6 < 0) {
                        int var8 = 3 & arg5 - arg1;
                        while (true) {
                            --var8;
                            if (var8 < 0) {
                                return;
                            }
                            arg0[var7++] = 1;
                        }
                    }
                    arg0[var7++] = 1;
                    arg0[var7++] = 1;
                    arg0[var7++] = 1;
                    arg0[var7++] = 1;
                }
            }
        }
    }
}
