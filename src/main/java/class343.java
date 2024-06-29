import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class343 extends class17 {

    @OriginalMember(owner = "client!kp", name = "S", descriptor = "I")
    private int field4991 = 1;

    @OriginalMember(owner = "client!kp", name = "R", descriptor = "I")
    private int field4990 = 1;

    @OriginalMember(owner = "client!kp", name = "H", descriptor = "I")
    public static int field4980 = 0;

    @OriginalMember(owner = "client!kp", name = "J", descriptor = "I")
    public static int field4982 = -1;

    @OriginalMember(owner = "client!kp", name = "O", descriptor = "[I")
    public static int[] field4987 = new int[13];

    @OriginalMember(owner = "client!kp", name = "F", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!kp", name = "G", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!kp", name = "I", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!kp", name = "K", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!kp", name = "L", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!kp", name = "M", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!kp", name = "N", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!kp", name = "P", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!kp", name = "Q", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!kp", name = "U", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)[I", line = 5)
    public final int[] method27(int arg0, int arg1) {
        ++field4988;
        int[] var3 = super.field210.method2683(-17, arg0);
        if (super.field210.field6442) {
            int var4 = this.field4991 + this.field4991 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field4990 + 1 + this.field4990;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field4991 + arg0; ~(arg0 - -this.field4991) <= ~var9; ++var9) {
                int[] var13 = this.method88(var9 & class38.field417, -4526, 0);
                int[] var14 = new int[class530.field7763];
                int var15 = 0;
                for (int var16 = -this.field4990; ~var16 >= ~this.field4990; ++var16) {
                    var15 += var13[var16 & class43.field499];
                }
                int var17 = 0;
                while (var17 < class530.field7763) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field4990 + var17 & class43.field499];
                    ++var17;
                    var15 = var13[this.field4990 + var17 & class43.field499] + var18;
                }
                var8[-arg0 + this.field4991 + var9] = var14;
            }
            for (int var10 = 0; ~class530.field7763 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return arg1 < 53 ? null : var3;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIIIIII)V", line = 93)
    public static final void method2042(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field4992;
        if (arg0 > -67) {
            method2044((byte) -24);
        }
        if (class120.method807(-8810, arg3)) {
            if (class88.field1105[arg3] != null) {
                class10.method58(arg8, class88.field1105[arg3], arg7, -1, -31200, arg2, arg6, arg4, arg1, arg5);
            } else {
                class10.method58(arg8, class494.field6988[arg3], arg7, -1, -31200, arg2, arg6, arg4, arg1, arg5);
            }
        } else if (~arg8 != 0) {
            class306.field4450[arg8] = true;
        } else {
            for (int var9 = 0; var9 < 100; ++var9) {
                class306.field4450[var9] = true;
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BILjp;)Z", line = 133)
    public static final boolean method2043(byte arg0, int arg1, class241 arg2) {
        ++field4989;
        int var3 = arg2.method1520(-12494, 2);
        if (var3 == 0) {
            if (~arg2.method1520(-12494, 1) != -1) {
                method2043((byte) 34, arg1, arg2);
            }
            int var4 = arg2.method1520(-12494, 6);
            int var5 = arg2.method1520(-12494, 6);
            boolean var6 = ~arg2.method1520(-12494, 1) == -2;
            if (var6) {
                class326.field4758[class8.field131++] = arg1;
            }
            if (class378.field5355[arg1] != null) {
                throw new RuntimeException("hr:lr");
            } else {
                class357 var7 = class309.field4501[arg1];
                class22 var8 = class378.field5355[arg1] = new class22();
                var8.field3289 = arg1;
                if (class226.field3255[arg1] != null) {
                    var8.method131(class226.field3255[arg1], -1);
                }
                var8.method1408(var7.field5118, true, 989076559);
                var8.field3338 = var7.field5120;
                int var9 = var7.field5123;
                int var10 = var9 >> 28;
                int var11 = (var9 & 4181599) >> 14;
                int var12 = var9 & 255;
                var8.field276 = var7.field5126;
                var8.field3372[0] = class124.field1684[arg1];
                var8.field1904 = (byte) var10;
                var8.method138((var12 << 6) - (-var5 - -class367.field5241), (var11 << 6) + -class441.field6171 + var4, (byte) -100);
                var8.field258 = false;
                class309.field4501[arg1] = null;
                return true;
            }
        } else if (~var3 == -2) {
            int var13 = arg2.method1520(-12494, 2);
            int var14 = class309.field4501[arg1].field5123;
            class309.field4501[arg1].field5123 = (((var14 >> 28) + var13 & 3) << 28) - -(268435455 & var14);
            return false;
        } else if (arg0 <= 6) {
            return false;
        } else if (~var3 == -3) {
            int var15 = arg2.method1520(-12494, 5);
            int var16 = var15 >> 3;
            int var17 = 7 & var15;
            int var18 = class309.field4501[arg1].field5123;
            int var19 = 3 & (var18 >> 28) - -var16;
            int var20 = (4187510 & var18) >> 14;
            int var21 = 255 & var18;
            if (var17 == 0) {
                --var21;
                --var20;
            }
            if (~var17 == -2) {
                --var21;
            }
            if (var17 == 2) {
                ++var20;
                --var21;
            }
            if (~var17 == -4) {
                --var20;
            }
            if (~var17 == -5) {
                ++var20;
            }
            if (~var17 == -6) {
                --var20;
                ++var21;
            }
            if (~var17 == -7) {
                ++var21;
            }
            if (~var17 == -8) {
                ++var21;
                ++var20;
            }
            class309.field4501[arg1].field5123 = (var19 << 28) + (var20 << 14) + var21;
            return false;
        } else {
            int var22 = arg2.method1520(-12494, 18);
            int var23 = var22 >> 16;
            int var24 = var22 >> 8 & 255;
            int var25 = var22 & 255;
            int var26 = class309.field4501[arg1].field5123;
            int var27 = 3 & (var26 >> 28) + var23;
            int var28 = (var26 >> 14) + var24 & 255;
            int var29 = 255 & var26 - -var25;
            class309.field4501[arg1].field5123 = (var27 << 28) + (var28 << 14) + var29;
            return false;
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(B)V", line = 298)
    public static void method2044(byte arg0) {
        field4987 = null;
        int var1 = 78 / ((arg0 - -59) / 59);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IB)[[I", line = 307)
    public final int[][] method89(int arg0, byte arg1) {
        ++field4981;
        if (arg1 != -25) {
            method2042(-116, -61, -49, -127, 32, -128, 45, -28, -124);
        }
        int[][] var3 = super.field201.method1851(arg0, (byte) -56);
        if (super.field201.field4431) {
            int var4 = this.field4991 + this.field4991 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field4990 + this.field4990 - -1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field4991 + arg0; ~var9 >= ~(this.field4991 + arg0); ++var9) {
                int[][] var19 = this.method91(0, arg1 + 25, var9 & class38.field417);
                int[][] var20 = new int[3][class530.field7763];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field4990; ~this.field4990 <= ~var27; ++var27) {
                    int var37 = class43.field499 & var27;
                    var22 += var25[var37];
                    var21 += var24[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (class530.field7763 > var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class43.field499 & -this.field4990 + var31;
                    int var33 = var22 - var25[var32];
                    ++var31;
                    int var34 = var23 - var26[var32];
                    int var35 = var21 - var24[var32];
                    int var36 = class43.field499 & this.field4990 + var31;
                    var21 = var24[var36] + var35;
                    var23 = var26[var36] + var34;
                    var22 = var25[var36] + var33;
                }
                var8[var9 - (-this.field4991 + arg0)] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; var13 < class530.field7763; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var17 > ~var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var16 += var18[2][var13];
                    var15 += var18[1][var13];
                    var14 += var18[0][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V", line = 440)
    public class343() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)V", line = 444)
    public static final void method2045(int arg0, int arg1) {
        ++field4979;
        class90.method648(8743);
        int var2 = class385.field5412.method1951(arg1, -458).field3715;
        if (~var2 != -1) {
            int var3 = class163.field2413.field5408[arg1];
            if (arg0 == var2) {
                class234.field3409 = var3;
            }
            if (var2 == 6) {
                class149.field1973 = var3;
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(III)Lhm;", line = 467)
    public static final class150 method2046(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method2045(-40, -84);
        }
        ++field4983;
        class150 var3 = client.method1276(107, arg2);
        if (arg0 == -1) {
            return var3;
        } else {
            return var3 != null && var3.field2110 != null && arg0 < var3.field2110.length ? var3.field2110[arg0] : null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)V", line = 491)
    public static final void method2047(boolean arg0) {
        if (!arg0) {
            field4982 = 85;
        }
        ++field4984;
        class424.field5977 = false;
        class108.method738(class250.field3725, class123.field1679, (byte) 52, class2.field56, class388.field5445);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lwm;II)V", line = 503)
    public final void method34(class403 arg0, int arg1, int arg2) {
        ++field4985;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field205 = ~arg0.method2357((byte) 117) == -2;
                }
            } else {
                this.field4991 = arg0.method2357((byte) 106);
            }
        } else {
            this.field4990 = arg0.method2357((byte) 104);
        }
        if (arg2 != 5159) {
            method2043((byte) -65, -113, (class241) null);
        }
    }

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "(III)Z", line = 552)
    public static final boolean method2048(int arg0, int arg1, int arg2) {
        if (arg0 != 18902) {
            return false;
        } else {
            ++field4986;
            return (65536 & arg1) != 0;
        }
    }
}
