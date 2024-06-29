import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class263 extends class386 {

    @OriginalMember(owner = "client!bq", name = "C", descriptor = "I")
    public int field3611 = 1638;

    @OriginalMember(owner = "client!bq", name = "D", descriptor = "I")
    public int field3612 = 4;

    @OriginalMember(owner = "client!bq", name = "H", descriptor = "I")
    public int field3616 = 4;

    @OriginalMember(owner = "client!bq", name = "M", descriptor = "I")
    public int field3621 = 4;

    @OriginalMember(owner = "client!bq", name = "K", descriptor = "I")
    public int field3619 = 0;

    @OriginalMember(owner = "client!bq", name = "U", descriptor = "Z")
    public boolean field3628 = true;

    @OriginalMember(owner = "client!bq", name = "W", descriptor = "[B")
    private byte[] field3630 = new byte[512];

    @OriginalMember(owner = "client!bq", name = "V", descriptor = "[I")
    public static int[] field3629 = new int[1];

    @OriginalMember(owner = "client!bq", name = "F", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!bq", name = "G", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!bq", name = "I", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!bq", name = "L", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!bq", name = "O", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!bq", name = "Q", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!bq", name = "R", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!bq", name = "S", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!bq", name = "T", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!bq", name = "N", descriptor = "Leaa;")
    public static class465 field3622;

    @OriginalMember(owner = "client!bq", name = "E", descriptor = "[S")
    private short[] field3613;

    @OriginalMember(owner = "client!bq", name = "J", descriptor = "[S")
    private short[] field3618;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIIZI)I")
    private final int method1598(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        ++field3624;
        if (arg5) {
            this.method1600(true, (int[]) null, 75);
        }
        int var8 = arg0 >> 12;
        int var9 = var8 + 1;
        int var10 = var8 & 255;
        if (~var9 <= ~arg3) {
            var9 = 0;
        }
        int var11 = arg0 & 4095;
        int var12 = var11 + -4096;
        int var13 = var9 & 255;
        int var14 = arg1 + -4096;
        int var15 = 3 & this.field3630[arg4 + var10];
        int var16 = class258.field3533[var11];
        int var17;
        if (~var15 >= -2) {
            var17 = ~var15 != -1 ? arg1 - var11 : arg1 + var11;
        } else {
            var17 = ~var15 == -3 ? -arg1 + var11 : -arg1 + -var11;
        }
        int var18 = this.field3630[arg4 + var13] & 3;
        int var19;
        if (~var18 >= -2) {
            var19 = ~var18 != -1 ? -var12 + arg1 : arg1 + var12;
        } else {
            var19 = var18 == 2 ? -arg1 + var12 : -arg1 + -var12;
        }
        int var20 = ((var19 - var17) * var16 >> 12) + var17;
        int var21 = this.field3630[var10 - -arg6] & 3;
        int var22;
        if (var21 <= 1) {
            var22 = var21 != 0 ? -var11 + var14 : var11 + var14;
        } else {
            var22 = ~var21 != -3 ? -var11 + -var14 : -var14 + var11;
        }
        int var23 = this.field3630[arg6 + var13] & 3;
        int var24;
        if (var23 <= 1) {
            var24 = var23 != 0 ? -var12 + var14 : var12 + var14;
        } else {
            var24 = var23 != 2 ? -var12 + -var14 : -var14 + var12;
        }
        int var25 = ((var24 - var22) * var16 >> 12) + var22;
        return ((-var20 + var25) * arg2 >> 12) + var20;
    }

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "(I)V")
    private final void method1599(int arg0) {
        if (arg0 != -10364) {
            field3629 = null;
        }
        ++field3614;
        if (this.field3611 > 0) {
            this.field3613 = new short[this.field3616];
            this.field3618 = new short[this.field3616];
            for (int var2 = 0; ~var2 > ~this.field3616; ++var2) {
                this.field3618[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field3611 / 4096.0F), (double) var2)));
                this.field3613[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field3618 != null && ~this.field3618.length == ~this.field3616) {
            this.field3613 = new short[this.field3616];
            for (int var3 = 0; ~this.field3616 < ~var3; ++var3) {
                this.field3613[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z[II)V")
    public final void method1600(boolean arg0, int[] arg1, int arg2) {
        if (!arg0) {
            method1601(37, (String) null, -24);
        }
        ++field3615;
        int var4 = class562.field8114[arg2] * this.field3621;
        if (~this.field3616 == -2) {
            short var5 = this.field3618[0];
            int var6 = this.field3613[0] << 12;
            int var7 = this.field3612 * var6 >> 12;
            int var8 = this.field3621 * var6 >> 12;
            int var9 = var4 * var6 >> 12;
            int var10 = var9 >> 12;
            int var11 = var10 + 1;
            int var12 = var9 & 4095;
            if (var11 >= var8) {
                var11 = 0;
            }
            int var13 = 255 & this.field3630[var10 & 255];
            int var14 = class258.field3533[var12];
            int var15 = 255 & this.field3630[var11 & 255];
            if (this.field3628) {
                for (int var16 = 0; ~class599.field8643 < ~var16; ++var16) {
                    int var17 = class152.field1879[var16] * this.field3612;
                    int var18 = this.method1598(var6 * var17 >> 12, var12, var14, var7, var13, false, var15);
                    int var19 = var5 * var18 >> 12;
                    arg1[var16] = (var19 >> 1) + 2048;
                }
            } else {
                for (int var20 = 0; class599.field8643 > var20; ++var20) {
                    int var21 = class152.field1879[var20] * this.field3612;
                    int var22 = this.method1598(var6 * var21 >> 12, var12, var14, var7, var13, false, var15);
                    arg1[var20] = var5 * var22 >> 12;
                }
            }
        } else {
            short var23 = this.field3618[0];
            if (var23 > 8 || ~var23 > 7) {
                int var24 = this.field3613[0] << 12;
                int var25 = var4 * var24 >> 12;
                int var26 = this.field3621 * var24 >> 12;
                int var27 = this.field3612 * var24 >> 12;
                int var28 = var25 >> 12;
                int var29 = var28 - -1;
                int var30 = var25 & 4095;
                if (~var29 <= ~var26) {
                    var29 = 0;
                }
                int var31 = 255 & this.field3630[var29 & 255];
                int var32 = class258.field3533[var30];
                int var33 = this.field3630[255 & var28] & 255;
                for (int var34 = 0; ~class599.field8643 < ~var34; ++var34) {
                    int var54 = class152.field1879[var34] * this.field3612;
                    int var55 = this.method1598(var24 * var54 >> 12, var30, var32, var27, var33, false, var31);
                    arg1[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; ~this.field3616 < ~var35; ++var35) {
                short var36 = this.field3618[var35];
                if (~var36 < -9 || var36 < -8) {
                    int var37 = this.field3613[var35] << 12;
                    int var38 = this.field3612 * var37 >> 12;
                    int var39 = this.field3621 * var37 >> 12;
                    int var40 = var4 * var37 >> 12;
                    int var41 = var40 >> 12;
                    int var42 = var41 + 1;
                    if (~var39 >= ~var42) {
                        var42 = 0;
                    }
                    int var43 = var40 & 4095;
                    int var44 = 255 & this.field3630[var41 & 255];
                    int var45 = 255 & this.field3630[var42 & 255];
                    int var46 = class258.field3533[var43];
                    if (this.field3628 && ~(this.field3616 - 1) == ~var35) {
                        for (int var47 = 0; var47 < class599.field8643; ++var47) {
                            int var48 = class152.field1879[var47] * this.field3612;
                            int var49 = this.method1598(var37 * var48 >> 12, var43, var46, var38, var44, !arg0, var45);
                            int var50 = (var36 * var49 >> 12) + arg1[var47];
                            arg1[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; ~class599.field8643 < ~var51; ++var51) {
                            int var52 = class152.field1879[var51] * this.field3612;
                            int var53 = this.method1598(var37 * var52 >> 12, var43, var46, var38, var44, false, var45);
                            arg1[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILjava/lang/String;I)I")
    public static final int method1601(int arg0, String arg1, int arg2) {
        ++field3625;
        if (arg0 != 1) {
            method1602(false);
        }
        return class276.method1674((byte) -109, arg1, arg2, true);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)[I")
    public final int[] method359(int arg0, int arg1) {
        ++field3617;
        int var3 = -13 / ((arg1 - 13) / 40);
        int[] var4 = super.field5140.method1564(arg0, true);
        if (super.field5140.field3482) {
            this.method1600(true, var4, arg0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
    public final void method358(int arg0) {
        this.field3630 = class576.method3367(this.field3619, -127);
        if (arg0 > 0) {
            ++field3623;
            this.method1599(-10364);
            for (int var2 = this.field3616 + -1; var2 >= 1; --var2) {
                short var3 = this.field3618[var2];
                if (~var3 < -9 || ~var3 > 7) {
                    return;
                }
                --this.field3616;
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IBLun;)V")
    public final void method355(int arg0, byte arg1, class389 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field3621 = arg2.method2229(255);
                                }
                            } else {
                                this.field3612 = arg2.method2229(255);
                            }
                        } else {
                            this.field3619 = arg2.method2229(255);
                        }
                    } else {
                        this.field3612 = this.field3621 = arg2.method2229(255);
                    }
                } else {
                    this.field3611 = arg2.method2270((byte) 71);
                    if (~this.field3611 > -1) {
                        this.field3618 = new short[this.field3616];
                        for (int var5 = 0; ~this.field3616 < ~var5; ++var5) {
                            this.field3618[var5] = (short) arg2.method2270((byte) 71);
                        }
                    }
                }
            } else {
                this.field3616 = arg2.method2229(255);
            }
        } else {
            this.field3628 = arg2.method2229(255) == 1;
        }
        if (arg1 <= 111) {
            this.field3618 = null;
        }
        ++field3620;
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V")
    public class263() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(Z)V")
    public static void method1602(boolean arg0) {
        if (arg0) {
            field3629 = null;
            field3622 = null;
        }
    }
}
