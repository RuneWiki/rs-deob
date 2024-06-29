import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class75 extends class243 {

    @OriginalMember(owner = "client!u", name = "D", descriptor = "Z")
    public boolean field905 = true;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "[B")
    private byte[] field910 = new byte[512];

    @OriginalMember(owner = "client!u", name = "H", descriptor = "I")
    public int field909 = 4;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "I")
    public int field907 = 4;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "I")
    public int field915 = 1638;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "I")
    public int field912 = 4;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "I")
    public int field920 = 0;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "Z")
    public static boolean field906 = false;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "[S")
    private short[] field911;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "[S")
    private short[] field914;

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class75() {
        super(0, true);
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(B)V")
    public final void method85(byte arg0) {
        this.field910 = class242.method1454(this.field920, 512);
        ++field908;
        this.method558(-49);
        if (arg0 != 66) {
            this.field910 = null;
        }
        for (int var2 = this.field907 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field911[var2];
            if (var3 > 8) {
                return;
            }
            if (var3 < -8) {
                return;
            }
            --this.field907;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B[II)V")
    public final void method557(byte arg0, int[] arg1, int arg2) {
        ++field913;
        int var4 = class685.field9613[arg2] * this.field912;
        if (arg0 > -65) {
            this.method85((byte) 102);
        }
        if (~this.field907 == -2) {
            short var5 = this.field911[0];
            int var6 = this.field914[0] << 12;
            int var7 = this.field909 * var6 >> 12;
            int var8 = this.field912 * var6 >> 12;
            int var9 = var4 * var6 >> 12;
            int var10 = var9 >> 12;
            int var11 = var10 + 1;
            if (~var11 <= ~var8) {
                var11 = 0;
            }
            int var12 = var9 & 4095;
            int var13 = 255 & this.field910[255 & var10];
            int var14 = class443.field6171[var12];
            int var15 = this.field910[var11 & 255] & 255;
            if (!this.field905) {
                for (int var16 = 0; var16 < class687.field9628; ++var16) {
                    int var17 = class666.field9279[var16] * this.field909;
                    int var18 = this.method559(var14, var7, 2471, var6 * var17 >> 12, var15, var13, var12);
                    arg1[var16] = var5 * var18 >> 12;
                }
            } else {
                for (int var19 = 0; ~class687.field9628 < ~var19; ++var19) {
                    int var20 = class666.field9279[var19] * this.field909;
                    int var21 = this.method559(var14, var7, 2471, var6 * var20 >> 12, var15, var13, var12);
                    int var22 = var5 * var21 >> 12;
                    arg1[var19] = (var22 >> 1) + 2048;
                }
            }
        } else {
            short var23 = this.field911[0];
            if (var23 > 8 || var23 < -8) {
                int var24 = this.field914[0] << 12;
                int var25 = this.field909 * var24 >> 12;
                int var26 = this.field912 * var24 >> 12;
                int var27 = var4 * var24 >> 12;
                int var28 = var27 >> 12;
                int var29 = var28 + 1;
                int var30 = var27 & 4095;
                if (~var29 <= ~var26) {
                    var29 = 0;
                }
                int var31 = this.field910[255 & var28] & 255;
                int var32 = class443.field6171[var30];
                int var33 = 255 & this.field910[255 & var29];
                for (int var34 = 0; ~var34 > ~class687.field9628; ++var34) {
                    int var54 = class666.field9279[var34] * this.field909;
                    int var55 = this.method559(var32, var25, 2471, var24 * var54 >> 12, var33, var31, var30);
                    arg1[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; ~var35 > ~this.field907; ++var35) {
                short var36 = this.field911[var35];
                if (var36 > 8 || var36 < -8) {
                    int var37 = this.field914[var35] << 12;
                    int var38 = this.field909 * var37 >> 12;
                    int var39 = var4 * var37 >> 12;
                    int var40 = this.field912 * var37 >> 12;
                    int var41 = var39 >> 12;
                    int var42 = var41 + 1;
                    int var43 = var39 & 4095;
                    if (var40 <= var42) {
                        var42 = 0;
                    }
                    int var44 = 255 & this.field910[255 & var42];
                    int var45 = class443.field6171[var43];
                    int var46 = 255 & this.field910[var41 & 255];
                    if (this.field905 && ~(this.field907 + -1) == ~var35) {
                        for (int var47 = 0; ~class687.field9628 < ~var47; ++var47) {
                            int var48 = class666.field9279[var47] * this.field909;
                            int var49 = this.method559(var45, var38, 2471, var37 * var48 >> 12, var44, var46, var43);
                            int var50 = arg1[var47] - -(var36 * var49 >> 12);
                            arg1[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; ~var51 > ~class687.field9628; ++var51) {
                            int var52 = class666.field9279[var51] * this.field909;
                            int var53 = this.method559(var45, var38, 2471, var37 * var52 >> 12, var44, var46, var43);
                            arg1[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILji;B)V")
    public final void method1(int arg0, class611 arg1, byte arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field912 = arg1.method3428((byte) -103);
                                }
                            } else {
                                this.field909 = arg1.method3428((byte) -125);
                            }
                        } else {
                            this.field920 = arg1.method3428((byte) 70);
                        }
                    } else {
                        this.field909 = this.field912 = arg1.method3428((byte) 90);
                    }
                } else {
                    this.field915 = arg1.method3413(false);
                    if (this.field915 < 0) {
                        this.field911 = new short[this.field907];
                        for (int var5 = 0; this.field907 > var5; ++var5) {
                            this.field911[var5] = (short) arg1.method3413(false);
                        }
                    }
                }
            } else {
                this.field907 = arg1.method3428((byte) -103);
            }
        } else {
            this.field905 = ~arg1.method3428((byte) 91) == -2;
        }
        ++field916;
        if (arg2 > -92) {
            this.field910 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V")
    private final void method558(int arg0) {
        int var2 = -124 % ((arg0 - 9) / 49);
        ++field918;
        if (this.field915 <= 0) {
            if (this.field911 != null && ~this.field911.length == ~this.field907) {
                this.field914 = new short[this.field907];
                for (int var3 = 0; var3 < this.field907; ++var3) {
                    this.field914[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
                return;
            }
        } else {
            this.field911 = new short[this.field907];
            this.field914 = new short[this.field907];
            for (int var4 = 0; this.field907 > var4; ++var4) {
                this.field911[var4] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field915 / 4096.0F), (double) var4)));
                this.field914[var4] = (short) ((int) Math.pow(2.0D, (double) var4));
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)[I")
    public final int[] method5(int arg0, int arg1) {
        ++field917;
        if (arg0 != 255) {
            this.field910 = null;
        }
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (super.field3164.field9250) {
            this.method557((byte) -81, var3, arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIII)I")
    private final int method559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field919;
        int var8 = arg3 >> 12;
        int var9 = var8 + 1;
        if (~var9 <= ~arg1) {
            var9 = 0;
        }
        int var10 = var8 & 255;
        int var11 = arg3 & 4095;
        int var12 = var11 - 4096;
        if (arg2 != 2471) {
            this.method559(63, -5, -64, -95, -78, -54, -54);
        }
        int var13 = arg6 - 4096;
        int var14 = var9 & 255;
        int var15 = class443.field6171[var11];
        int var16 = 3 & this.field910[arg5 + var10];
        int var17;
        if (~var16 >= -2) {
            var17 = var16 != 0 ? -var11 + arg6 : var11 - -arg6;
        } else {
            var17 = var16 == 2 ? var11 - arg6 : -arg6 + -var11;
        }
        int var18 = 3 & this.field910[arg5 + var14];
        int var19;
        if (~var18 >= -2) {
            var19 = ~var18 != -1 ? -var12 + arg6 : arg6 + var12;
        } else {
            var19 = var18 != 2 ? -arg6 + -var12 : var12 - arg6;
        }
        int var20 = ((var19 - var17) * var15 >> 12) + var17;
        int var21 = this.field910[arg4 + var10] & 3;
        int var22;
        if (var21 <= 1) {
            var22 = ~var21 != -1 ? var13 - var11 : var11 + var13;
        } else {
            var22 = var21 == 2 ? var11 - var13 : -var11 + -var13;
        }
        int var23 = 3 & this.field910[arg4 + var14];
        int var24;
        if (var23 > 1) {
            var24 = var23 != 2 ? -var12 + -var13 : var12 - var13;
        } else {
            var24 = var23 != 0 ? var13 - var12 : var12 + var13;
        }
        int var25 = ((var24 - var22) * var15 >> 12) + var22;
        return ((var25 - var20) * arg0 >> 12) + var20;
    }
}
