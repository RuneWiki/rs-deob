import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class760 extends class325 {

    @OriginalMember(owner = "client!cm", name = "O", descriptor = "I")
    private int field10531 = -1;

    @OriginalMember(owner = "client!cm", name = "G", descriptor = "F")
    public static float field10524;

    @OriginalMember(owner = "client!cm", name = "D", descriptor = "I")
    public static int field10521;

    @OriginalMember(owner = "client!cm", name = "E", descriptor = "I")
    public static int field10522;

    @OriginalMember(owner = "client!cm", name = "F", descriptor = "I")
    public static int field10523;

    @OriginalMember(owner = "client!cm", name = "H", descriptor = "I")
    public int field10525;

    @OriginalMember(owner = "client!cm", name = "I", descriptor = "I")
    public static int field10526;

    @OriginalMember(owner = "client!cm", name = "J", descriptor = "I")
    public int field10527;

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "I")
    public static int field10528;

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
    public static int field10529;

    @OriginalMember(owner = "client!cm", name = "C", descriptor = "Loja;")
    public static class480 field10520;

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "[I")
    public int[] field10530;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIIIIILoga;I)Z", line = 6)
    public static final boolean method4218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class502 arg9, int arg10) {
        ++field10528;
        if (arg7 != -2878) {
            return true;
        } else {
            int var11 = arg8;
            int var12 = arg1;
            byte var13 = 64;
            byte var14 = 64;
            int var15 = -var13 + arg8;
            class393.field5803[var13][var14] = 99;
            int var16 = -var14 + arg1;
            class5.field48[var13][var14] = 0;
            byte var17 = 0;
            int var18 = 0;
            class85.field1191[var17] = arg8;
            int var26 = var17 + 1;
            class23.field363[var17] = arg1;
            int[][] var19 = arg9.field6957;
            while (var26 != var18) {
                var12 = class23.field363[var18];
                var11 = class85.field1191[var18];
                int var20 = -var15 + var11;
                int var21 = -var16 + var12;
                var18 = var18 + 1 & 4095;
                int var22 = -arg9.field6941 + var11;
                int var23 = var12 - arg9.field6935;
                if (arg0 != -4) {
                    if (arg0 != -3) {
                        if (~arg0 != 1) {
                            if (~arg0 != 0) {
                                if (~arg0 != -1 && ~arg0 != -2 && ~arg0 != -3 && arg0 != 3 && arg0 != 9) {
                                    if (arg9.method2915(arg6, arg10, var11, arg0, var12, arg5, 2, (byte) -87)) {
                                        class275.field4086 = var11;
                                        class688.field9676 = var12;
                                        return true;
                                    }
                                } else if (arg9.method2907(arg0, arg5, (byte) 124, var12, arg10, 2, arg6, var11)) {
                                    class688.field9676 = var12;
                                    class275.field4086 = var11;
                                    return true;
                                }
                            } else if (arg9.method2912(var12, arg3, arg2, arg4, arg10, var11, arg7 ^ 2931, arg5, 2)) {
                                class275.field4086 = var11;
                                class688.field9676 = var12;
                                return true;
                            }
                        } else if (arg9.method2906(arg10, var11, 2, arg3, -1, arg5, var12, 2, arg4, arg2)) {
                            class688.field9676 = var12;
                            class275.field4086 = var11;
                            return true;
                        }
                    } else if (class374.method2322(arg3, arg5, arg10, arg7 ^ 2877, arg2, var11, 2, 2, var12)) {
                        class688.field9676 = var12;
                        class275.field4086 = var11;
                        return true;
                    }
                } else if (arg10 == var11 && ~arg5 == ~var12) {
                    class688.field9676 = var12;
                    class275.field4086 = var11;
                    return true;
                }
                int var25 = class5.field48[var20][var21] - -1;
                if (~var20 < -1 && ~class393.field5803[var20 + -1][var21] == -1 && (1134821376 & var19[var22 + -1][var23]) == 0 && (1310982144 & var19[var22 + -1][var23 + 1]) == 0) {
                    class85.field1191[var26] = var11 + -1;
                    class23.field363[var26] = var12;
                    var26 = 4095 & var26 + 1;
                    class393.field5803[var20 + -1][var21] = 2;
                    class5.field48[var20 + -1][var21] = var25;
                }
                if (~var20 > -127 && class393.field5803[var20 - -1][var21] == 0 && (var19[var22 + 2][var23] & 1625554944) == 0 && ~(2015625216 & var19[var22 + 2][var23 + 1]) == -1) {
                    class85.field1191[var26] = var11 + 1;
                    class23.field363[var26] = var12;
                    class393.field5803[var20 + 1][var21] = 8;
                    var26 = var26 - -1 & 4095;
                    class5.field48[var20 + 1][var21] = var25;
                }
                if (~var21 < -1 && ~class393.field5803[var20][var21 + -1] == -1 && (1134821376 & var19[var22][var23 + -1]) == 0 && ~(1625554944 & var19[var22 + 1][var23 + -1]) == -1) {
                    class85.field1191[var26] = var11;
                    class23.field363[var26] = var12 - 1;
                    class393.field5803[var20][var21 - 1] = 1;
                    var26 = 4095 & var26 + 1;
                    class5.field48[var20][var21 + -1] = var25;
                }
                if (~var21 > -127 && class393.field5803[var20][var21 + 1] == 0 && (1310982144 & var19[var22][var23 + 2]) == 0 && (2015625216 & var19[var22 - -1][var23 + 2]) == 0) {
                    class85.field1191[var26] = var11;
                    class23.field363[var26] = var12 + 1;
                    class393.field5803[var20][var21 + 1] = 4;
                    var26 = 4095 & var26 + 1;
                    class5.field48[var20][var21 + 1] = var25;
                }
                if (var20 > 0 && var21 > 0 && class393.field5803[var20 - 1][var21 + -1] == 0 && ~(1336147968 & var19[var22 - 1][var23]) == -1 && (1134821376 & var19[var22 - 1][var23 + -1]) == 0 && ~(1675886592 & var19[var22][var23 - 1]) == -1) {
                    class85.field1191[var26] = var11 - 1;
                    class23.field363[var26] = var12 + -1;
                    class393.field5803[var20 + -1][var21 + -1] = 3;
                    var26 = var26 + 1 & 4095;
                    class5.field48[var20 + -1][var21 - 1] = var25;
                }
                if (var20 < 126 && ~var21 < -1 && class393.field5803[var20 + 1][var21 + -1] == 0 && ~(1675886592 & var19[var22 - -1][var23 + -1]) == -1 && ~(var19[var22 + 2][var23 + -1] & 1625554944) == -1 && (2028208128 & var19[var22 - -2][var23]) == 0) {
                    class85.field1191[var26] = var11 - -1;
                    class23.field363[var26] = var12 + -1;
                    var26 = var26 + 1 & 4095;
                    class393.field5803[var20 + 1][var21 + -1] = 9;
                    class5.field48[var20 + 1][var21 + -1] = var25;
                }
                if (var20 > 0 && var21 < 126 && ~class393.field5803[var20 + -1][var21 - -1] == -1 && ~(var19[var22 + -1][var23 + 1] & 1336147968) == -1 && ~(1310982144 & var19[var22 + -1][var23 + 2]) == -1 && ~(var19[var22][var23 - -2] & 2116288512) == -1) {
                    class85.field1191[var26] = var11 + -1;
                    class23.field363[var26] = var12 + 1;
                    var26 = var26 - -1 & 4095;
                    class393.field5803[var20 - 1][var21 + 1] = 6;
                    class5.field48[var20 - 1][var21 - -1] = var25;
                }
                if (~var20 > -127 && var21 < 126 && ~class393.field5803[var20 + 1][var21 - -1] == -1 && ~(var19[var22 + 1][var23 - -2] & 2116288512) == -1 && (var19[var22 + 2][var23 + 2] & 2015625216) == 0 && (2028208128 & var19[var22 + 2][var23 + 1]) == 0) {
                    class85.field1191[var26] = var11 + 1;
                    class23.field363[var26] = var12 - -1;
                    class393.field5803[var20 + 1][var21 + 1] = 12;
                    var26 = var26 + 1 & 4095;
                    class5.field48[var20 + 1][var21 - -1] = var25;
                }
            }
            class688.field9676 = var12;
            class275.field4086 = var11;
            return false;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IB)[[I", line = 360)
    public int[][] method360(int arg0, byte arg1) {
        ++field10521;
        int[][] var3 = super.field4733.method1251((byte) 114, arg0);
        if (arg1 != -9) {
            return null;
        } else {
            if (super.field4733.field2369 && this.method4219(-26298)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = this.field10527 * (class657.field9077 == this.field10525 ? arg0 : this.field10525 * arg0 / class657.field9077);
                if (~class261.field3874 != ~this.field10527) {
                    for (int var8 = 0; class261.field3874 > var8; ++var8) {
                        int var9 = this.field10527 * var8 / class261.field3874;
                        int var10 = this.field10530[var7 + var9];
                        var6[var8] = class440.method2643(var10, 255) << 4;
                        var5[var8] = class440.method2643(4080, var10 >> 4);
                        var4[var8] = class440.method2643(var10, 16711680) >> 12;
                    }
                } else {
                    for (int var11 = 0; var11 < class261.field3874; ++var11) {
                        int var12 = this.field10530[var7++];
                        var6[var11] = class440.method2643(var12 << 4, 4080);
                        var5[var11] = class440.method2643(65280, var12) >> 4;
                        var4[var11] = class440.method2643(var12 >> 12, 4080);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Ljp;IB)V", line = 430)
    public final void method95(class376 arg0, int arg1, byte arg2) {
        if (~arg1 == -1) {
            this.field10531 = arg0.method2359(-1);
        }
        if (arg2 >= -41) {
            method4220((byte) 97);
        }
        ++field10523;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)Z", line = 446)
    public final boolean method4219(int arg0) {
        if (arg0 != -26298) {
            this.method417(-30);
        }
        ++field10529;
        if (this.field10530 != null) {
            return true;
        } else if (~this.field10531 <= -1) {
            class508 var2 = ~class150.field2089 > -1 ? class508.method2947(class15.field226, this.field10531) : class508.method2950(class15.field226, class150.field2089, this.field10531);
            var2.method2937();
            this.field10530 = var2.method2944();
            this.field10525 = var2.field7014;
            this.field10527 = var2.field7017;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V", line = 474)
    public class760() {
        super(0, false);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)I", line = 479)
    public final int method2064(byte arg0) {
        ++field10526;
        return arg0 != -17 ? 100 : this.field10531;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V", line = 491)
    public final void method417(int arg0) {
        super.method417(arg0);
        ++field10522;
        this.field10530 = null;
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "(B)V", line = 501)
    public static void method4220(byte arg0) {
        field10520 = null;
        if (arg0 != 115) {
            method4218(-119, -74, 63, -80, 49, -92, 48, -97, -43, (class502) null, 111);
        }
    }
}
