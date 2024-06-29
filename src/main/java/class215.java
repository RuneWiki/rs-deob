import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class215 extends class157 {

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "[B")
    private byte[] field3869 = new byte[512];

    @OriginalMember(owner = "client!hb", name = "fb", descriptor = "I")
    private int field3887 = 1638;

    @OriginalMember(owner = "client!hb", name = "db", descriptor = "I")
    private int field3885 = 0;

    @OriginalMember(owner = "client!hb", name = "eb", descriptor = "Z")
    private boolean field3886 = true;

    @OriginalMember(owner = "client!hb", name = "cb", descriptor = "I")
    private int field3884 = 4;

    @OriginalMember(owner = "client!hb", name = "gb", descriptor = "I")
    private int field3888 = 4;

    @OriginalMember(owner = "client!hb", name = "Z", descriptor = "I")
    private int field3881 = 4;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "Lcc;")
    public static class209 field3873 = class95.method669(101, " de votre liste noire)3");

    @OriginalMember(owner = "client!hb", name = "ab", descriptor = "Lcc;")
    public static class209 field3882 = class95.method669(104, "::rect_debug");

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!hb", name = "Y", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!hb", name = "bb", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!hb", name = "hb", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!hb", name = "ib", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!hb", name = "jb", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "[S")
    private short[] field3875;

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "[S")
    private short[] field3877;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIZI)I")
    private final int method1506(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        ++field3876;
        int var8 = arg1 + -4096;
        int var9 = arg3 >> 12;
        int var10 = var9 + 1;
        if (var10 >= arg4) {
            var10 = 0;
        }
        int var11 = var10 & 255;
        int var12 = var9 & 255;
        int var13 = arg3 & 4095;
        int var14 = var13 + -4096;
        int var15 = 3 & this.field3869[arg6 + var12];
        int var16;
        if (var15 <= 1) {
            var16 = var15 != 0 ? -var13 + arg1 : arg1 + var13;
        } else {
            var16 = ~var15 != -3 ? -arg1 + -var13 : -arg1 + var13;
        }
        int var17 = class258.field4665[var13];
        int var18 = this.field3869[arg6 + var11] & 3;
        int var19;
        if (~var18 < -2) {
            var19 = var18 == 2 ? -arg1 + var14 : -arg1 + -var14;
        } else {
            var19 = var18 != 0 ? -var14 + arg1 : arg1 + var14;
        }
        int var20 = 3 & this.field3869[var12 - -arg2];
        if (!arg5) {
            this.field3888 = -1;
        }
        int var21 = var16 - -((-var16 + var19) * var17 >> 12);
        int var22;
        if (var20 > 1) {
            var22 = ~var20 == -3 ? -var8 + var13 : -var8 + -var13;
        } else {
            var22 = var20 != 0 ? -var13 + var8 : var13 - -var8;
        }
        int var23 = this.field3869[arg2 + var11] & 3;
        int var24;
        if (~var23 < -2) {
            var24 = var23 == 2 ? var14 - var8 : -var8 + -var14;
        } else {
            var24 = var23 != 0 ? var8 - var14 : var8 + var14;
        }
        int var25 = ((-var22 + var24) * var17 >> 12) + var22;
        return var21 - -((-var21 + var25) * arg0 >> 12);
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)Lka;")
    public static final class257 method1507(int arg0, int arg1) {
        ++field3883;
        class257 var2 = (class257) class150.field2734.method1257((long) arg0, -83);
        if (var2 != null) {
            return var2;
        } else if (arg1 != 12076) {
            return null;
        } else {
            byte[] var3;
            if (~arg0 <= -32769) {
                var3 = class30.field536.method353(32767 & arg0, -63, 1);
            } else {
                var3 = class104.field2008.method353(arg0, 114, 1);
            }
            class257 var4 = new class257();
            if (var3 != null) {
                var4.method1784(new class106(var3), true);
            }
            if (~arg0 <= -32769) {
                var4.method1772((byte) -125);
            }
            class150.field2734.method1259((long) arg0, var4, false);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        if (arg1 >= -29) {
            this.method1(-1, (byte) -104, (class106) null);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field3884 = arg2.method774((byte) 87);
                                }
                            } else {
                                this.field3881 = arg2.method774((byte) 82);
                            }
                        } else {
                            this.field3885 = arg2.method774((byte) 126);
                        }
                    } else {
                        this.field3881 = this.field3884 = arg2.method774((byte) 101);
                    }
                } else {
                    this.field3887 = arg2.method738(255);
                    if (~this.field3887 > -1) {
                        this.field3875 = new short[this.field3888];
                        for (int var5 = 0; var5 < this.field3888; ++var5) {
                            this.field3875[var5] = (short) arg2.method738(255);
                        }
                    }
                }
            } else {
                this.field3888 = arg2.method774((byte) 82);
            }
        } else {
            this.field3886 = arg2.method774((byte) 88) == 1;
        }
        ++field3889;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public final void method3(byte arg0) {
        int var2 = 103 / ((arg0 - -51) / 52);
        ++field3872;
        this.field3869 = class259.method1800(-256, this.field3885);
        this.method1511(0);
        for (int var3 = this.field3888 - 1; var3 >= 1; --var3) {
            short var4 = this.field3875[var3];
            if (~var4 < -9) {
                return;
            }
            if (~var4 > 7) {
                return;
            }
            --this.field3888;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([IIB)V")
    private final void method1508(int[] arg0, int arg1, byte arg2) {
        int var4 = class129.field2479[arg1] * this.field3884;
        ++field3890;
        if (arg2 >= 108) {
            if (~this.field3888 == -2) {
                short var5 = this.field3875[0];
                int var6 = this.field3877[0] << 12;
                int var7 = this.field3881 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = this.field3884 * var6 >> 12;
                int var10 = var8 >> 12;
                int var11 = var8 & 4095;
                int var12 = 255 & this.field3869[255 & var10];
                int var13 = var10 - -1;
                if (~var9 >= ~var13) {
                    var13 = 0;
                }
                int var14 = 255 & this.field3869[var13 & 255];
                int var15 = class258.field4665[var11];
                if (this.field3886) {
                    for (int var16 = 0; ~class226.field4124 < ~var16; ++var16) {
                        int var17 = class50.field987[var16] * this.field3881;
                        int var18 = this.method1506(var15, var11, var14, var6 * var17 >> 12, var7, true, var12);
                        int var19 = var5 * var18 >> 12;
                        arg0[var16] = (var19 >> 1) + 2048;
                    }
                } else {
                    for (int var20 = 0; ~var20 > ~class226.field4124; ++var20) {
                        int var21 = class50.field987[var20] * this.field3881;
                        int var22 = this.method1506(var15, var11, var14, var6 * var21 >> 12, var7, true, var12);
                        arg0[var20] = var5 * var22 >> 12;
                    }
                }
            } else {
                short var23 = this.field3875[0];
                if (~var23 < -9 || var23 < -8) {
                    int var24 = this.field3877[0] << 12;
                    int var25 = this.field3881 * var24 >> 12;
                    int var26 = var4 * var24 >> 12;
                    int var27 = var26 >> 12;
                    int var28 = this.field3884 * var24 >> 12;
                    int var29 = this.field3869[255 & var27] & 255;
                    int var30 = var26 & 4095;
                    int var31 = class258.field4665[var30];
                    int var32 = var27 + 1;
                    if (var32 >= var28) {
                        var32 = 0;
                    }
                    int var33 = 255 & this.field3869[var32 & 255];
                    for (int var34 = 0; ~class226.field4124 < ~var34; ++var34) {
                        int var54 = class50.field987[var34] * this.field3881;
                        int var55 = this.method1506(var31, var30, var33, var24 * var54 >> 12, var25, true, var29);
                        arg0[var34] = var23 * var55 >> 12;
                    }
                }
                for (int var35 = 1; this.field3888 > var35; ++var35) {
                    short var36 = this.field3875[var35];
                    if (var36 > 8 || var36 < -8) {
                        int var37 = this.field3877[var35] << 12;
                        int var38 = this.field3884 * var37 >> 12;
                        int var39 = var4 * var37 >> 12;
                        int var40 = var39 >> 12;
                        int var41 = 255 & this.field3869[var40 & 255];
                        int var42 = var40 + 1;
                        if (~var42 <= ~var38) {
                            var42 = 0;
                        }
                        int var43 = this.field3881 * var37 >> 12;
                        int var44 = 255 & this.field3869[var42 & 255];
                        int var45 = var39 & 4095;
                        int var46 = class258.field4665[var45];
                        if (this.field3886 && ~(this.field3888 - 1) == ~var35) {
                            for (int var47 = 0; ~class226.field4124 < ~var47; ++var47) {
                                int var48 = class50.field987[var47] * this.field3881;
                                int var49 = this.method1506(var46, var45, var44, var37 * var48 >> 12, var43, true, var41);
                                int var50 = (var36 * var49 >> 12) + arg0[var47];
                                arg0[var47] = (var50 >> 1) + 2048;
                            }
                        } else {
                            for (int var51 = 0; class226.field4124 > var51; ++var51) {
                                int var52 = class50.field987[var51] * this.field3881;
                                int var53 = this.method1506(var46, var45, var44, var37 * var52 >> 12, var43, true, var41);
                                arg0[var51] += var36 * var53 >> 12;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "(I)V")
    public static void method1509(int arg0) {
        field3882 = null;
        if (arg0 != -14611) {
            method1507(-119, 74);
        }
        field3873 = null;
    }

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "(I)V")
    public static final void method1510(int arg0) {
        class20.field382.method665(1);
        if (arg0 < 41) {
            field3882 = null;
        }
        ++field3874;
        class251.field4507.method665(1);
        class157.field2861.method665(1);
    }

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "(I)V")
    private final void method1511(int arg0) {
        if (arg0 < this.field3887) {
            this.field3877 = new short[this.field3888];
            this.field3875 = new short[this.field3888];
            for (int var2 = 0; var2 < this.field3888; ++var2) {
                this.field3875[var2] = (short) ((int) (Math.pow((double) ((float) this.field3887 / 4096.0F), (double) var2) * 4096.0D));
                this.field3877[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field3875 != null && ~this.field3875.length == ~this.field3888) {
            this.field3877 = new short[this.field3888];
            for (int var3 = 0; ~this.field3888 < ~var3; ++var3) {
                this.field3877[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field3871;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
    public class215() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        ++field3879;
        int[] var3 = super.field2879.method1269(arg1, arg0 + 17983);
        if (arg0 != -98) {
            field3873 = null;
        }
        if (super.field2879.field3363) {
            this.method1508(var3, arg1, (byte) 120);
        }
        return var3;
    }
}
