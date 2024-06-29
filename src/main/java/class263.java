import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class263 extends class13 {

    @OriginalMember(owner = "client!la", name = "F", descriptor = "I")
    public int field3660 = 4;

    @OriginalMember(owner = "client!la", name = "N", descriptor = "I")
    public int field3668 = 4;

    @OriginalMember(owner = "client!la", name = "M", descriptor = "I")
    public int field3667 = 0;

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "I")
    public int field3671 = 1638;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "[B")
    private byte[] field3674 = new byte[512];

    @OriginalMember(owner = "client!la", name = "V", descriptor = "I")
    public int field3676 = 4;

    @OriginalMember(owner = "client!la", name = "R", descriptor = "Z")
    public boolean field3672 = true;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field3658 = new String[100];

    @OriginalMember(owner = "client!la", name = "J", descriptor = "I")
    public static int field3664 = 0;

    @OriginalMember(owner = "client!la", name = "W", descriptor = "I")
    public static int field3677 = 0;

    @OriginalMember(owner = "client!la", name = "P", descriptor = "D")
    public static double field3670 = -1.0D;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!la", name = "K", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!la", name = "L", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!la", name = "O", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!la", name = "S", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!la", name = "X", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "[S")
    private short[] field3661;

    @OriginalMember(owner = "client!la", name = "I", descriptor = "[S")
    private short[] field3663;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIB)I", line = 11)
    private final int method1718(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        ++field3666;
        int var8 = arg0 >> 12;
        int var9 = var8 + 1;
        int var10 = var8 & 255;
        if (arg2 <= var9) {
            var9 = 0;
        }
        int var11 = arg0 & 4095;
        int var12 = var11 + -4096;
        int var13 = arg5 - 4096;
        int var14 = var9 & 255;
        if (arg6 != 77) {
            this.method33(109);
        }
        int var15 = class349.field4801[var11];
        int var16 = 3 & this.field3674[var10 - -arg1];
        int var17;
        if (var16 <= 1) {
            var17 = ~var16 != -1 ? -var11 + arg5 : arg5 + var11;
        } else {
            var17 = var16 != 2 ? -arg5 + -var11 : var11 - arg5;
        }
        int var18 = 3 & this.field3674[arg1 + var14];
        int var19;
        if (~var18 < -2) {
            var19 = var18 == 2 ? -arg5 + var12 : -var12 - arg5;
        } else {
            var19 = ~var18 != -1 ? arg5 - var12 : arg5 + var12;
        }
        int var20 = ((-var17 + var19) * var15 >> 12) + var17;
        int var21 = this.field3674[var10 - -arg3] & 3;
        int var22;
        if (var21 <= 1) {
            var22 = var21 != 0 ? var13 - var11 : var11 + var13;
        } else {
            var22 = var21 == 2 ? -var13 + var11 : -var11 - var13;
        }
        int var23 = this.field3674[arg3 + var14] & 3;
        int var24;
        if (~var23 < -2) {
            var24 = ~var23 == -3 ? -var13 + var12 : -var12 - var13;
        } else {
            var24 = var23 == 0 ? var12 + var13 : -var12 + var13;
        }
        int var25 = ((-var22 + var24) * var15 >> 12) + var22;
        return var20 - -((-var20 + var25) * arg4 >> 12);
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V", line = 89)
    public static void method1719(int arg0) {
        if (arg0 != 1) {
            field3664 = -127;
        }
        field3658 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lkh;BI)V", line = 99)
    public final void method31(class11 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field3676 = arg0.method172((byte) 52);
                                }
                            } else {
                                this.field3660 = arg0.method172((byte) 52);
                            }
                        } else {
                            this.field3667 = arg0.method172((byte) 52);
                        }
                    } else {
                        this.field3660 = this.field3676 = arg0.method172((byte) 52);
                    }
                } else {
                    this.field3671 = arg0.method207(7124);
                    if (this.field3671 < 0) {
                        this.field3663 = new short[this.field3668];
                        for (int var5 = 0; var5 < this.field3668; ++var5) {
                            this.field3663[var5] = (short) arg0.method207(7124);
                        }
                    }
                }
            } else {
                this.field3668 = arg0.method172((byte) 52);
            }
        } else {
            this.field3672 = arg0.method172((byte) 52) == 1;
        }
        if (arg1 < 50) {
            this.method1718(12, 49, -123, -13, 77, -20, (byte) -39);
        }
        ++field3665;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V", line = 211)
    public class263() {
        super(0, true);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V", line = 214)
    public static final void method1720(boolean arg0) {
        class203.field2790.method1865((byte) -80);
        ++field3673;
        class239.field3410.method1064(arg0);
        if (class109.field1565 != null) {
            class109.field1565.method1652(-16777216, class304.field4191);
        }
        class133.field1914.method1222(0);
        class304.field4191.setBackground(Color.black);
        class71.field1035 = -1;
        class203.field2790 = class113.method794(class304.field4191, -8356);
        class239.field3410 = class311.method2004(class304.field4191, -128, arg0);
        if (class109.field1565 != null) {
            class109.field1565.method1644(class304.field4191, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "(B)V", line = 247)
    private final void method1721(byte arg0) {
        ++field3675;
        if (arg0 > -22) {
            field3664 = 7;
        }
        if (~this.field3671 >= -1) {
            if (this.field3663 != null && this.field3663.length == this.field3668) {
                this.field3661 = new short[this.field3668];
                for (int var2 = 0; ~var2 > ~this.field3668; ++var2) {
                    this.field3661[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
                return;
            }
        } else {
            this.field3661 = new short[this.field3668];
            this.field3663 = new short[this.field3668];
            for (int var3 = 0; this.field3668 > var3; ++var3) {
                this.field3663[var3] = (short) ((int) (Math.pow((double) ((float) this.field3671 / 4096.0F), (double) var3) * 4096.0D));
                this.field3661[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II[I)V", line = 287)
    public final void method1722(int arg0, int arg1, int[] arg2) {
        ++field3678;
        int var4 = class277.field3873[arg0] * this.field3676;
        if (arg1 == 3) {
            if (~this.field3668 != -2) {
                short var5 = this.field3663[0];
                if (var5 > 8 || ~var5 > 7) {
                    int var6 = this.field3661[0] << 12;
                    int var7 = this.field3676 * var6 >> 12;
                    int var8 = this.field3660 * var6 >> 12;
                    int var9 = var4 * var6 >> 12;
                    int var10 = var9 >> 12;
                    int var11 = var10 - -1;
                    if (~var11 <= ~var7) {
                        var11 = 0;
                    }
                    int var12 = var9 & 4095;
                    int var13 = class349.field4801[var12];
                    int var14 = 255 & this.field3674[var11 & 255];
                    int var15 = this.field3674[255 & var10] & 255;
                    for (int var16 = 0; class269.field3751 > var16; ++var16) {
                        int var36 = class296.field4148[var16] * this.field3660;
                        int var37 = this.method1718(var6 * var36 >> 12, var15, var8, var14, var13, var12, (byte) 77);
                        arg2[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; this.field3668 > var17; ++var17) {
                    short var18 = this.field3663[var17];
                    if (var18 > 8 || ~var18 > 7) {
                        int var19 = this.field3661[var17] << 12;
                        int var20 = var4 * var19 >> 12;
                        int var21 = this.field3660 * var19 >> 12;
                        int var22 = this.field3676 * var19 >> 12;
                        int var23 = var20 >> 12;
                        int var24 = var23 + 1;
                        int var25 = var20 & 4095;
                        if (~var24 <= ~var22) {
                            var24 = 0;
                        }
                        int var26 = 255 & this.field3674[255 & var23];
                        int var27 = class349.field4801[var25];
                        int var28 = 255 & this.field3674[255 & var24];
                        if (this.field3672 && this.field3668 + -1 == var17) {
                            for (int var29 = 0; ~class269.field3751 < ~var29; ++var29) {
                                int var30 = class296.field4148[var29] * this.field3660;
                                int var31 = this.method1718(var19 * var30 >> 12, var26, var21, var28, var27, var25, (byte) 77);
                                int var32 = (var18 * var31 >> 12) + arg2[var29];
                                arg2[var29] = 2048 - -(var32 >> 1);
                            }
                        } else {
                            for (int var33 = 0; class269.field3751 > var33; ++var33) {
                                int var34 = class296.field4148[var33] * this.field3660;
                                int var35 = this.method1718(var19 * var34 >> 12, var26, var21, var28, var27, var25, (byte) 77);
                                arg2[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                int var38 = this.field3661[0] << 12;
                short var39 = this.field3663[0];
                int var40 = var4 * var38 >> 12;
                int var41 = this.field3660 * var38 >> 12;
                int var42 = this.field3676 * var38 >> 12;
                int var43 = var40 >> 12;
                int var44 = var43 + 1;
                int var45 = var40 & 4095;
                if (var44 >= var42) {
                    var44 = 0;
                }
                int var46 = class349.field4801[var45];
                int var47 = 255 & this.field3674[255 & var43];
                int var48 = 255 & this.field3674[var44 & 255];
                if (!this.field3672) {
                    for (int var49 = 0; var49 < class269.field3751; ++var49) {
                        int var50 = class296.field4148[var49] * this.field3660;
                        int var51 = this.method1718(var38 * var50 >> 12, var47, var41, var48, var46, var45, (byte) 77);
                        arg2[var49] = var39 * var51 >> 12;
                    }
                } else {
                    for (int var52 = 0; ~var52 > ~class269.field3751; ++var52) {
                        int var53 = class296.field4148[var52] * this.field3660;
                        int var54 = this.method1718(var38 * var53 >> 12, var47, var41, var48, var46, var45, (byte) 77);
                        int var55 = var39 * var54 >> 12;
                        arg2[var52] = (var55 >> 1) + 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)[I", line = 444)
    public final int[] method29(boolean arg0, int arg1) {
        ++field3669;
        if (!arg0) {
            this.method33(108);
        }
        int[] var3 = super.field263.method893(arg1, 1578);
        if (super.field263.field1845) {
            this.method1722(arg1, 3, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V", line = 472)
    public final void method33(int arg0) {
        this.field3674 = class305.method1967(-78, this.field3667);
        ++field3659;
        this.method1721((byte) -108);
        int var2 = -34 % ((2 - arg0) / 51);
        for (int var3 = this.field3668 + -1; ~var3 <= -2; --var3) {
            short var4 = this.field3663[var3];
            if (var4 > 8) {
                return;
            }
            if (var4 < -8) {
                return;
            }
            --this.field3668;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BC)C", line = 504)
    public static final char method1723(byte arg0, char arg1) {
        ++field3662;
        if (arg0 <= 54) {
            field3677 = 97;
        }
        return ~arg1 != -182 && arg1 != 402 ? Character.toTitleCase(arg1) : arg1;
    }
}
