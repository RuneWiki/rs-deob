import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class193 extends class223 {

    @OriginalMember(owner = "client!da", name = "O", descriptor = "I")
    private int field3017 = 1;

    @OriginalMember(owner = "client!da", name = "T", descriptor = "I")
    private int field3022 = 1;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "Lvc;")
    public static class199 field3013 = new class199(0, 0);

    @OriginalMember(owner = "client!da", name = "U", descriptor = "Lpf;")
    public static class305 field3023 = new class305(16);

    @OriginalMember(owner = "client!da", name = "W", descriptor = "[S")
    public static short[] field3025 = new short[256];

    @OriginalMember(owner = "client!da", name = "J", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!da", name = "P", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!da", name = "R", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!da", name = "V", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!da", name = "X", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "[Lej;")
    public static class51[] field3015;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(B)V")
    public static final void method1370(byte arg0) {
        class218.field3329.method1172((byte) 127);
        ++field3020;
        if (arg0 != -98) {
            field3026 = 27;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIZII)V")
    public static final void method1371(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        class236.field3734[0].method57(arg4, arg2);
        class236.field3734[1].method57(arg4, arg2 + -16 + arg5);
        ++field3012;
        int var6 = (arg5 + -32) * arg5 / arg0;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg5 + -32 + -var6) * arg1 / (-arg5 + arg0);
        class66.method532(arg4, arg2 + 16, 16, arg5 + -32, class255.field4075);
        class66.method532(arg4, var7 + 16 + arg2, 16, var6, class108.field1683);
        class66.method516(arg4, arg2 + var7 - -16, var6, class180.field2830);
        class66.method516(arg4 + 1, arg2 + var7 + 16, var6, class180.field2830);
        class66.method525(arg4, var7 + 16 + arg2, 16, class180.field2830);
        class66.method525(arg4, arg2 + 17 + var7, 16, class180.field2830);
        class66.method516(arg4 + 15, var7 + 16 + arg2, var6, class293.field4561);
        class66.method516(arg4 - -14, arg2 - -17 + var7, var6 + -1, class293.field4561);
        class66.method525(arg4, var7 - -var6 + (arg2 - -15), 16, class293.field4561);
        class66.method525(arg4 - -1, arg2 + 14 + var6 + var7, 15, class293.field4561);
        if (!arg3) {
            method1373(50, (String) null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)[[I")
    public final int[][] method135(int arg0, int arg1) {
        ++field3019;
        if (arg0 < 0) {
            return null;
        } else {
            int[][] var3 = super.field3572.method1818(arg1, false);
            if (super.field3572.field4257) {
                int var4 = this.field3017 + 1 + this.field3017;
                int var5 = 65536 / var4;
                int var6 = this.field3022 + 1 + this.field3022;
                int[][][] var7 = new int[var4][][];
                int var8 = 65536 / var6;
                for (int var9 = -this.field3017 + arg1; this.field3017 + arg1 >= var9; ++var9) {
                    int[][] var19 = this.method1534(false, 0, var9 & class75.field1168);
                    int var20 = 0;
                    int[][] var21 = new int[3][class250.field4008];
                    int var22 = 0;
                    int[] var23 = var19[0];
                    int var24 = 0;
                    int[] var25 = var19[2];
                    int[] var26 = var19[1];
                    for (int var27 = -this.field3022; ~this.field3022 <= ~var27; ++var27) {
                        int var37 = var27 & class280.field4430;
                        var24 += var26[var37];
                        var22 += var25[var37];
                        var20 += var23[var37];
                    }
                    int[] var28 = var21[0];
                    int[] var29 = var21[2];
                    int[] var30 = var21[1];
                    int var31 = 0;
                    while (class250.field4008 > var31) {
                        var28[var31] = var8 * var20 >> 16;
                        var30[var31] = var8 * var24 >> 16;
                        var29[var31] = var8 * var22 >> 16;
                        int var32 = -this.field3022 + var31 & class280.field4430;
                        int var33 = var22 - var25[var32];
                        ++var31;
                        int var34 = var20 - var23[var32];
                        int var35 = var24 - var26[var32];
                        int var36 = class280.field4430 & this.field3022 + var31;
                        var24 = var26[var36] + var35;
                        var22 = var25[var36] + var33;
                        var20 = var23[var36] + var34;
                    }
                    var7[this.field3017 + var9 - arg1] = var21;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; class250.field4008 > var13; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; var4 > var17; ++var17) {
                        int[][] var18 = var7[var17];
                        var15 += var18[1][var13];
                        var14 += var18[0][var13];
                        var16 += var18[2][var13];
                    }
                    var10[var13] = var5 * var14 >> 16;
                    var11[var13] = var5 * var15 >> 16;
                    var12[var13] = var5 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)Lq;")
    public static final class130 method1372(int arg0, int arg1) {
        if (arg0 != 0) {
            method1373(-28, (String) null);
        }
        ++field3016;
        class130 var2 = (class130) class272.field4346.method1173((long) arg1, true);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class190.field2980.method721((byte) -117, 33, arg1);
            class130 var4 = new class130();
            if (var3 != null) {
                var4.method962((byte) -37, new class31(var3), arg1);
            }
            class272.field4346.method1167((byte) -63, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        ++field3018;
        int[] var3 = super.field3588.method1611(0, arg1);
        if (super.field3588.field3722) {
            int var4 = this.field3017 + 1 + this.field3017;
            int var5 = this.field3022 + this.field3022 + 1;
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field3017; ~(arg1 - -this.field3017) <= ~var9; ++var9) {
                int[] var13 = this.method1533(0, var9 & class75.field1168, -70);
                int var14 = 0;
                for (int var15 = -this.field3022; ~var15 >= ~this.field3022; ++var15) {
                    var14 += var13[var15 & class280.field4430];
                }
                int[] var16 = new int[class250.field4008];
                int var17 = 0;
                while (~class250.field4008 < ~var17) {
                    var16[var17] = var7 * var14 >> 16;
                    int var18 = var14 - var13[var17 - this.field3022 & class280.field4430];
                    ++var17;
                    var14 = var13[class280.field4430 & this.field3022 + var17] + var18;
                }
                var8[-arg1 + var9 + this.field3017] = var16;
            }
            for (int var10 = 0; ~var10 > ~class250.field4008; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var6 * var11 >> 16;
            }
        }
        return arg0 <= 14 ? null : var3;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1373(int arg0, String arg1) {
        if (arg0 != 1) {
            field3013 = null;
        }
        int var2 = arg1.length();
        ++field3021;
        int var3 = 0;
        for (int var4 = 0; var4 < var2; ++var4) {
            var3 = (var3 << 5) + -var3 - -class266.method1785(28035, arg1.charAt(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        ++field3014;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field3583 = arg0.method265(-126) == 1;
                }
            } else {
                this.field3017 = arg0.method265(-92);
            }
        } else {
            this.field3022 = arg0.method265(-89);
        }
        if (arg2 != 102) {
            field3015 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
    public class193() {
        super(1, false);
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(B)V")
    public static void method1374(byte arg0) {
        field3015 = null;
        field3013 = null;
        field3023 = null;
        field3025 = null;
        if (arg0 >= -116) {
            field3015 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([IIII[Ljava/lang/Object;)V")
    public static final void method1375(int[] arg0, int arg1, int arg2, int arg3, Object[] arg4) {
        if (arg1 > arg3) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg3;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var7;
            Object var8 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var8;
            for (int var9 = arg3; ~var9 > ~arg1; ++var9) {
                if (arg0[var9] < var7 - -(1 & var9)) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    Object var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg0[arg1] = arg0[var6];
            arg0[var6] = var7;
            arg4[arg1] = arg4[var6];
            arg4[var6] = var8;
            method1375(arg0, var6 + -1, arg2, arg3, arg4);
            method1375(arg0, arg1, -17290, var6 + 1, arg4);
        }
        ++field3024;
        if (arg2 != -17290) {
            field3026 = -125;
        }
    }
}
