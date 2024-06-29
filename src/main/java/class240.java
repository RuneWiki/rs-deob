import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class240 extends class192 {

    @OriginalMember(owner = "client!ada", name = "L", descriptor = "[B")
    private byte[] field3225 = new byte[512];

    @OriginalMember(owner = "client!ada", name = "R", descriptor = "Z")
    public boolean field3231 = true;

    @OriginalMember(owner = "client!ada", name = "P", descriptor = "I")
    public int field3229 = 1638;

    @OriginalMember(owner = "client!ada", name = "K", descriptor = "I")
    public int field3224 = 4;

    @OriginalMember(owner = "client!ada", name = "W", descriptor = "I")
    public int field3236 = 4;

    @OriginalMember(owner = "client!ada", name = "S", descriptor = "I")
    public int field3232 = 0;

    @OriginalMember(owner = "client!ada", name = "X", descriptor = "I")
    public int field3237 = 4;

    @OriginalMember(owner = "client!ada", name = "U", descriptor = "Lfl;")
    public static class103 field3234 = new class103(3, 2);

    @OriginalMember(owner = "client!ada", name = "cb", descriptor = "Lnj;")
    public static class415 field3242 = new class415(70, 6);

    @OriginalMember(owner = "client!ada", name = "eb", descriptor = "I")
    public static int field3244 = 0;

    @OriginalMember(owner = "client!ada", name = "db", descriptor = "Lft;")
    public static class285 field3243 = new class285(13, 7);

    @OriginalMember(owner = "client!ada", name = "fb", descriptor = "I")
    public static int field3245 = 0;

    @OriginalMember(owner = "client!ada", name = "M", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!ada", name = "N", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!ada", name = "O", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!ada", name = "Q", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!ada", name = "T", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!ada", name = "V", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!ada", name = "Y", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!ada", name = "Z", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!ada", name = "ab", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!ada", name = "bb", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!ada", name = "I", descriptor = "[S")
    private short[] field3222;

    @OriginalMember(owner = "client!ada", name = "J", descriptor = "[S")
    private short[] field3223;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIIBIII)I")
    private final int method1513(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field3228;
        int var8 = arg2 >> 12;
        int var9 = var8 + 1;
        if (var9 >= arg5) {
            var9 = 0;
        }
        int var10 = var8 & 255;
        int var11 = arg2 & 4095;
        int var12 = arg4 + -4096;
        int var13 = -70 / ((61 - arg3) / 49);
        int var14 = var11 - 4096;
        int var15 = var9 & 255;
        int var16 = 3 & this.field3225[arg1 + var10];
        int var17 = class322.field4163[var11];
        int var18;
        if (~var16 < -2) {
            var18 = var16 != 2 ? -var11 - arg4 : var11 - arg4;
        } else {
            var18 = ~var16 != -1 ? -var11 + arg4 : arg4 + var11;
        }
        int var19 = this.field3225[var15 - -arg1] & 3;
        int var20;
        if (~var19 >= -2) {
            var20 = ~var19 != -1 ? -var14 + arg4 : var14 - -arg4;
        } else {
            var20 = ~var19 != -3 ? -arg4 + -var14 : -arg4 + var14;
        }
        int var21 = 3 & this.field3225[var10 - -arg6];
        int var22 = ((var20 - var18) * var17 >> 12) + var18;
        int var23;
        if (~var21 >= -2) {
            var23 = ~var21 != -1 ? -var11 + var12 : var11 - -var12;
        } else {
            var23 = var21 != 2 ? -var11 - var12 : -var12 + var11;
        }
        int var24 = 3 & this.field3225[var15 - -arg6];
        int var25;
        if (~var24 < -2) {
            var25 = ~var24 == -3 ? -var12 + var14 : -var14 - var12;
        } else {
            var25 = var24 == 0 ? var12 + var14 : -var14 + var12;
        }
        int var26 = ((-var23 + var25) * var17 >> 12) + var23;
        return ((-var22 + var26) * arg0 >> 12) + var22;
    }

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "(I)V")
    public static void method1514(int arg0) {
        field3234 = null;
        field3242 = null;
        field3243 = null;
        if (arg0 > -93) {
            field3242 = null;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "([IBI)V")
    public final void method1515(int[] arg0, byte arg1, int arg2) {
        ++field3233;
        int var4 = class221.field2895[arg2] * this.field3224;
        if (this.field3237 == 1) {
            int var5 = this.field3222[0] << 12;
            short var6 = this.field3223[0];
            int var7 = this.field3224 * var5 >> 12;
            int var8 = var4 * var5 >> 12;
            int var9 = this.field3236 * var5 >> 12;
            int var10 = var8 >> 12;
            int var11 = var10 - -1;
            if (~var7 >= ~var11) {
                var11 = 0;
            }
            int var12 = var8 & 4095;
            int var13 = this.field3225[255 & var11] & 255;
            int var14 = this.field3225[255 & var10] & 255;
            int var15 = class322.field4163[var12];
            if (!this.field3231) {
                for (int var16 = 0; var16 < class561.field7319; ++var16) {
                    int var17 = class183.field2359[var16] * this.field3236;
                    int var18 = this.method1513(var15, var14, var5 * var17 >> 12, (byte) 127, var12, var9, var13);
                    arg0[var16] = var6 * var18 >> 12;
                }
            } else {
                for (int var19 = 0; class561.field7319 > var19; ++var19) {
                    int var20 = class183.field2359[var19] * this.field3236;
                    int var21 = this.method1513(var15, var14, var5 * var20 >> 12, (byte) -114, var12, var9, var13);
                    int var22 = var6 * var21 >> 12;
                    arg0[var19] = (var22 >> 1) + 2048;
                }
            }
        } else {
            short var23 = this.field3223[0];
            if (~var23 < -9 || ~var23 > 7) {
                int var24 = this.field3222[0] << 12;
                int var25 = this.field3224 * var24 >> 12;
                int var26 = this.field3236 * var24 >> 12;
                int var27 = var4 * var24 >> 12;
                int var28 = var27 >> 12;
                int var29 = var28 + 1;
                if (var29 >= var25) {
                    var29 = 0;
                }
                int var30 = var27 & 4095;
                int var31 = this.field3225[255 & var28] & 255;
                int var32 = class322.field4163[var30];
                int var33 = this.field3225[var29 & 255] & 255;
                for (int var34 = 0; var34 < class561.field7319; ++var34) {
                    int var54 = class183.field2359[var34] * this.field3236;
                    int var55 = this.method1513(var32, var31, var24 * var54 >> 12, (byte) -95, var30, var26, var33);
                    arg0[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; ~var35 > ~this.field3237; ++var35) {
                short var36 = this.field3223[var35];
                if (~var36 < -9 || var36 < -8) {
                    int var37 = this.field3222[var35] << 12;
                    int var38 = var4 * var37 >> 12;
                    int var39 = this.field3224 * var37 >> 12;
                    int var40 = this.field3236 * var37 >> 12;
                    int var41 = var38 >> 12;
                    int var42 = var41 + 1;
                    int var43 = var38 & 4095;
                    if (var39 <= var42) {
                        var42 = 0;
                    }
                    int var44 = 255 & this.field3225[255 & var41];
                    int var45 = this.field3225[255 & var42] & 255;
                    int var46 = class322.field4163[var43];
                    if (this.field3231 && ~(this.field3237 + -1) == ~var35) {
                        for (int var47 = 0; var47 < class561.field7319; ++var47) {
                            int var48 = class183.field2359[var47] * this.field3236;
                            int var49 = this.method1513(var46, var44, var37 * var48 >> 12, (byte) 117, var43, var40, var45);
                            int var50 = (var36 * var49 >> 12) + arg0[var47];
                            arg0[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; class561.field7319 > var51; ++var51) {
                            int var52 = class183.field2359[var51] * this.field3236;
                            int var53 = this.method1513(var46, var44, var37 * var52 >> 12, (byte) -36, var43, var40, var45);
                            arg0[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
        if (arg1 != 47) {
            this.field3229 = 13;
        }
    }

    @OriginalMember(owner = "client!ada", name = "h", descriptor = "(I)Z")
    public static final boolean method1516(int arg0) {
        ++field3239;
        class537 var1 = (class537) class692.field9454.method2090(true);
        if (var1 == null) {
            return false;
        } else {
            for (int var2 = arg0; var1.field6991 > var2; ++var2) {
                if (var1.field6998[var2] != null && var1.field6998[var2].field7108 == 0) {
                    return false;
                }
                if (var1.field6994[var2] != null && var1.field6994[var2].field7108 == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILfd;I)V")
    public final void method109(int arg0, class418 arg1, int arg2) {
        ++field3235;
        if (arg2 != -12160) {
            this.method1515((int[]) null, (byte) -90, 19);
        }
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field3237 = arg1.method2396(-120);
            } else {
                if (arg0 != 2) {
                    if (arg0 == 3) {
                        this.field3236 = this.field3224 = arg1.method2396(99);
                        return;
                    }
                    if (~arg0 == -5) {
                        this.field3232 = arg1.method2396(-108);
                        return;
                    }
                    if (arg0 == 5) {
                        this.field3236 = arg1.method2396(30);
                        return;
                    }
                    if (~arg0 == -7) {
                        this.field3224 = arg1.method2396(-105);
                        return;
                    }
                } else {
                    this.field3229 = arg1.method2383(65280);
                    if (this.field3229 < 0) {
                        this.field3223 = new short[this.field3237];
                        for (int var5 = 0; ~var5 > ~this.field3237; ++var5) {
                            this.field3223[var5] = (short) arg1.method2383(65280);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field3231 = arg1.method2396(-126) == 1;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIIIIII[[[BILoa;III)V")
    public static final void method1517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int arg8, class43 arg9, int arg10, int arg11, int arg12) {
        ++field3241;
        if (arg8 != 0 && arg6 != 0) {
            if (arg8 == 9) {
                arg8 = 1;
                arg5 = arg5 + 1 & 3;
            }
            if (~arg8 == -11) {
                arg5 = arg5 - -3 & 3;
                arg8 = 1;
            }
            if (arg8 == 11) {
                arg8 = 8;
                arg5 = arg5 + 3 & 3;
            }
            if (arg1 == 3) {
                arg9.method395(arg3, arg4, arg12, arg10, arg11, arg2, arg7[arg8 + -1][arg5], arg6, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "()V")
    public class240() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "(B)V")
    public final void method618(byte arg0) {
        this.field3225 = class697.method3801(this.field3232, (byte) -30);
        ++field3238;
        this.method1520((byte) 98);
        if (arg0 == 63) {
            for (int var2 = this.field3237 + -1; ~var2 <= -2; --var2) {
                short var3 = this.field3223[var2];
                if (var3 > 8 || ~var3 > 7) {
                    return;
                }
                --this.field3237;
            }
        }
    }

    @OriginalMember(owner = "client!ada", name = "e", descriptor = "(B)V")
    public static final void method1518(byte arg0) {
        ++field3240;
        class700.field9771.method1528(5, (byte) 34);
        class2.field9.method1372(5, 1);
        class120.field1550.method269(false, 5);
        class348.field4436.method1906(5, 29514);
        class646.field8998.method522((byte) 114, 5);
        class232.field3109.method1288(false, 5);
        class552.field7163.method3028(5, 256);
        class91.field1202.method985(13303, 5);
        class388.field4971.method2182(false, 5);
        class543.field7052.method3026(114, 5);
        class536.field6983.method96(5, 5776);
        class650.field9060.method2289(5, 106);
        class414.field5331.method2894((byte) 103, 5);
        class191.field2445.method1073(5, 104);
        class97.field1307.method1740(5, (byte) -64);
        class382.field4898.method2017((byte) -123, 5);
        if (arg0 <= 37) {
            field3243 = null;
        }
        class277.field3629.method2495(-22, 5);
        class64.field882.method3725(-14331, 5);
        class122.field1588.method3641(5, 14);
        class671.field9319.method1800(5, 1000);
        class33.method268((byte) 82, 5);
        class175.method1181(50, 4096);
        class435.method2484(50, -2);
        class553.method2962(5, 19097);
        class384.method2187(5, true);
        class149.field1923.method3659(-97, 5);
        class379.field4852.method3659(-101, 5);
        class425.field5516.method3659(-104, 5);
        class703.field9805.method3659(-128, 5);
        class709.field9913.method3659(-128, 5);
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILba;III)Lcd;")
    public static final class564 method1519(int arg0, class107 arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 1) {
            field3234 = null;
        }
        ++field3226;
        return arg1 == null ? null : new class564(arg2, arg0, arg4, arg1.method813(), arg1.method820(), arg1.method799(), arg1.method816(), arg1.method793(), arg1.method805(), arg1.method810());
    }

    @OriginalMember(owner = "client!ada", name = "f", descriptor = "(B)V")
    private final void method1520(byte arg0) {
        if (~this.field3229 < -1) {
            this.field3222 = new short[this.field3237];
            this.field3223 = new short[this.field3237];
            for (int var2 = 0; ~var2 > ~this.field3237; ++var2) {
                this.field3223[var2] = (short) ((int) (Math.pow((double) ((float) this.field3229 / 4096.0F), (double) var2) * 4096.0D));
                this.field3222[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field3223 != null && this.field3223.length == this.field3237) {
            this.field3222 = new short[this.field3237];
            for (int var3 = 0; var3 < this.field3237; ++var3) {
                this.field3222[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 <= 18) {
            this.method1520((byte) 17);
        }
        ++field3227;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IB)[I")
    public final int[] method118(int arg0, byte arg1) {
        ++field3230;
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (arg1 >= -123) {
            return null;
        } else {
            if (super.field2448.field7266) {
                this.method1515(var3, (byte) 47, arg0);
            }
            return var3;
        }
    }
}
