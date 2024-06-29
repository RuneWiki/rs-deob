import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class50 extends class13 {

    @OriginalMember(owner = "client!in", name = "G", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field693 = new CRC32();

    @OriginalMember(owner = "client!in", name = "L", descriptor = "I")
    public static int field698 = 0;

    @OriginalMember(owner = "client!in", name = "K", descriptor = "I")
    public static int field697 = -1;

    @OriginalMember(owner = "client!in", name = "M", descriptor = "Lbj;")
    public static class131 field699 = new class131(50);

    @OriginalMember(owner = "client!in", name = "N", descriptor = "I")
    public static int field700 = 2;

    @OriginalMember(owner = "client!in", name = "E", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!in", name = "F", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!in", name = "H", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!in", name = "I", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!in", name = "J", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!in", name = "O", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZI)[I", line = 3)
    public final int[] method29(boolean arg0, int arg1) {
        ++field691;
        int[] var3 = super.field263.method893(arg1, 1578);
        if (super.field263.field1845) {
            int var4 = class277.field3873[arg1];
            for (int var5 = 0; ~var5 > ~class269.field3751; ++var5) {
                var3[var5] = this.method422(class296.field4148[var5], -126, var4) % 4096;
            }
        }
        if (!arg0) {
            field700 = 59;
        }
        return var3;
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V", line = 35)
    public class50() {
        super(0, true);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIILhh;IIIIIII)Z", line = 38)
    public static final boolean method421(int arg0, int arg1, int arg2, int arg3, class67 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field695;
        int var12 = arg6;
        int var13 = arg10;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = -var14 + arg6;
        class362.field5005[var14][var15] = 99;
        int var17 = -var15 + arg10;
        class347.field4756[var14][var15] = 0;
        byte var18 = 0;
        class212.field2963[var18] = arg6;
        int var19 = 0;
        int var35 = var18 + 1;
        class450.field6300[var18] = arg10;
        int[][] var20 = arg4.field1016;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (~var35 == ~var19) {
                                    class198.field2736 = var12;
                                    if (arg8 != -1) {
                                        return false;
                                    }
                                    class364.field5136 = var13;
                                    return false;
                                }
                                var12 = class212.field2963[var19];
                                var13 = class450.field6300[var19];
                                var21 = var13 - var17;
                                var19 = var19 + 1 & 4095;
                                var22 = var12 - var16;
                                var23 = -arg4.field993 + var12;
                                var24 = -arg4.field1009 + var13;
                                if (~arg3 != 3) {
                                    if (~arg3 != 2) {
                                        if (arg3 != -2) {
                                            if (arg3 != -1) {
                                                if (~arg3 != -1 && arg3 != 1 && ~arg3 != -3 && ~arg3 != -4 && arg3 != 9) {
                                                    if (arg4.method528(arg1, arg7, var13, arg3, arg11, arg8 + -28300, arg2, var12)) {
                                                        class198.field2736 = var12;
                                                        class364.field5136 = var13;
                                                        return true;
                                                    }
                                                } else if (arg4.method519(arg3, var13, arg7, arg1, arg2, var12, false, arg11)) {
                                                    class198.field2736 = var12;
                                                    class364.field5136 = var13;
                                                    return true;
                                                }
                                            } else if (arg4.method530(arg5, arg9, arg0, var12, (byte) -113, arg11, arg2, var13, arg1)) {
                                                class198.field2736 = var12;
                                                class364.field5136 = var13;
                                                return true;
                                            }
                                        } else if (arg4.method526(arg9, (byte) -113, arg11, arg2, arg5, arg1, var13, var12, arg0, arg11)) {
                                            class364.field5136 = var13;
                                            class198.field2736 = var12;
                                            return true;
                                        }
                                    } else if (class204.method1329(arg5, false, arg9, var13, arg11, arg11, var12, arg2, arg1)) {
                                        class364.field5136 = var13;
                                        class198.field2736 = var12;
                                        return true;
                                    }
                                } else if (~arg2 == ~var12 && arg1 == var13) {
                                    class198.field2736 = var12;
                                    class364.field5136 = var13;
                                    return true;
                                }
                                var26 = class347.field4756[var22][var21] + 1;
                                if (~var22 < -1 && ~class362.field5005[var22 + -1][var21] == -1 && (1134821376 & var20[var23 + -1][var24]) == 0 && ~(1310982144 & var20[var23 + -1][arg11 - 1 + var24]) == -1) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= arg11 + -1) {
                                            class212.field2963[var35] = var12 + -1;
                                            class450.field6300[var35] = var13;
                                            class362.field5005[var22 + -1][var21] = 2;
                                            var35 = 4095 & var35 + 1;
                                            class347.field4756[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + -1][var24 + var27] & 1336147968) != 0) {
                                            break;
                                        }
                                        ++var27;
                                    }
                                }
                                if (~var22 > ~(128 - arg11) && class362.field5005[var22 + 1][var21] == 0 && (var20[arg11 + var23][var24] & 1625554944) == 0 && (var20[arg11 + var23][arg11 + -1 + var24] & 2015625216) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (~var28 <= ~(arg11 - 1)) {
                                            class212.field2963[var35] = var12 + 1;
                                            class450.field6300[var35] = var13;
                                            class362.field5005[var22 - -1][var21] = 8;
                                            var35 = var35 + 1 & 4095;
                                            class347.field4756[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((2028208128 & var20[var23 - -arg11][var24 + var28]) != 0) {
                                            break;
                                        }
                                        ++var28;
                                    }
                                }
                                if (var21 > 0 && ~class362.field5005[var22][var21 - 1] == -1 && ~(var20[var23][var24 + -1] & 1134821376) == -1 && ~(1625554944 & var20[arg11 + var23 + -1][var24 + -1]) == -1) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg11 + -1) {
                                            class212.field2963[var35] = var12;
                                            class450.field6300[var35] = var13 + -1;
                                            class362.field5005[var22][var21 + -1] = 1;
                                            var35 = var35 - -1 & 4095;
                                            class347.field4756[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((1675886592 & var20[var23 + var29][var24 + -1]) != 0) {
                                            break;
                                        }
                                        ++var29;
                                    }
                                }
                                if (~var21 > ~(-arg11 + 128) && class362.field5005[var22][var21 + 1] == 0 && ~(var20[var23][arg11 + var24] & 1310982144) == -1 && (2015625216 & var20[var23 - (-arg11 - -1)][var24 - -arg11]) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (~var30 <= ~(arg11 + -1)) {
                                            class212.field2963[var35] = var12;
                                            class450.field6300[var35] = var13 - -1;
                                            var35 = var35 + 1 & 4095;
                                            class362.field5005[var22][var21 + 1] = 4;
                                            class347.field4756[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if (~(var20[var23 + var30][arg11 + var24] & 2116288512) != -1) {
                                            break;
                                        }
                                        ++var30;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && ~class362.field5005[var22 + -1][var21 + -1] == -1 && (1134821376 & var20[var23 - 1][var24 + -1]) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg11 <= var31) {
                                            class212.field2963[var35] = var12 + -1;
                                            class450.field6300[var35] = var13 + -1;
                                            var35 = var35 + 1 & 4095;
                                            class362.field5005[var22 + -1][var21 + -1] = 3;
                                            class347.field4756[var22 + -1][var21 + -1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + -1][-1 - -var31 + var24] & 1336147968) != 0 || (1675886592 & var20[var23 + -1 - -var31][var24 + -1]) != 0) {
                                            break;
                                        }
                                        ++var31;
                                    }
                                }
                                if (var22 < -arg11 + 128 && ~var21 < -1 && ~class362.field5005[var22 + 1][var21 - 1] == -1 && ~(var20[arg11 + var23][var24 - 1] & 1625554944) == -1) {
                                    int var32 = 1;
                                    while (true) {
                                        if (~var32 <= ~arg11) {
                                            class212.field2963[var35] = var12 + 1;
                                            class450.field6300[var35] = var13 + -1;
                                            class362.field5005[var22 + 1][var21 + -1] = 9;
                                            var35 = var35 + 1 & 4095;
                                            class347.field4756[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if (~(var20[arg11 + var23][var24 + -1 + var32] & 2028208128) != -1 || ~(1675886592 & var20[var23 + var32][var24 + -1]) != -1) {
                                            break;
                                        }
                                        ++var32;
                                    }
                                }
                                if (var22 > 0 && var21 < -arg11 + 128 && ~class362.field5005[var22 + -1][var21 - -1] == -1 && ~(1310982144 & var20[var23 + -1][var24 - -arg11]) == -1) {
                                    for (int var33 = 1; ~arg11 < ~var33; ++var33) {
                                        if (~(var20[var23 + -1][var24 + var33] & 1336147968) != -1 || (var20[var23 + -1 + var33][var24 - -arg11] & 2116288512) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class212.field2963[var35] = var12 + -1;
                                    class450.field6300[var35] = var13 + 1;
                                    var35 = 4095 & var35 + 1;
                                    class362.field5005[var22 + -1][var21 + 1] = 6;
                                    class347.field4756[var22 + -1][var21 - -1] = var26;
                                }
                            } while (~(-arg11 + 128) >= ~var22);
                        } while (-arg11 + 128 <= var21);
                    } while (class362.field5005[var22 + 1][var21 + 1] != 0);
                } while (~(var20[var23 - -arg11][arg11 + var24] & 2015625216) != -1);
                for (int var34 = 1; arg11 > var34; ++var34) {
                    if (~(var20[var23 + var34][var24 - -arg11] & 2116288512) != -1 || ~(var20[arg11 + var23][var24 + var34] & 2028208128) != -1) {
                        continue label286;
                    }
                }
                class212.field2963[var35] = var12 - -1;
                class450.field6300[var35] = var13 - -1;
                class362.field5005[var22 + 1][var21 + 1] = 12;
                var35 = var35 + 1 & 4095;
                class347.field4756[var22 + 1][var21 - -1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(III)I", line = 469)
    private final int method422(int arg0, int arg1, int arg2) {
        ++field694;
        int var4 = arg0 - -(arg2 * 57);
        if (arg1 > -71) {
            field700 = 75;
        }
        int var5 = var4 << 1 ^ var4;
        return -((Integer.MAX_VALUE & (var5 * 15731 * var5 - -789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(I)V", line = 488)
    public static void method423(int arg0) {
        field693 = null;
        if (arg0 == -10528) {
            field699 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BIII)V", line = 501)
    public static final void method424(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = -83 / ((arg0 - 10) / 50);
        ++field692;
        class239 var5 = class436.method2740(11, arg3, -323285792);
        var5.method1622(-104);
        var5.field3397 = arg1;
        var5.field3399 = arg2;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BIIILuo;ZLai;)V", line = 521)
    public static final void method425(byte arg0, int arg1, int arg2, int arg3, class345 arg4, boolean arg5, class357 arg6) {
        ++field696;
        if (arg5) {
            class349.field4805.method1501((class47.field661 - class349.field4805.method597()) / 2, (class214.field2993 - class349.field4805.method596()) / 2);
            class24.field415.method1501((class47.field661 - class24.field415.method597()) / 2, 18);
        }
        arg6.method2283((byte) -38, class47.field661 / 2, class214.field2993 / 2 + -26, -1, ~class129.field1827 != -2 ? class380.field5428.method2763(40, class210.field2935) : class40.field575.method2763(-79, class210.field2935), arg3);
        int var7 = class214.field2993 / 2 + -18;
        arg4.method59(class47.field661 / 2 + -152, var7, 304, 34, arg2, 0);
        arg4.method59(class47.field661 / 2 - 151, var7 + 1, 302, 32, 0, 0);
        arg4.method56(class47.field661 / 2 + -150, var7 + 2, class178.field2447 * 3, 30, arg1, 0);
        if (arg0 >= 89) {
            arg4.method56(class178.field2447 * 3 + class47.field661 / 2 + -150, var7 + 2, -(class178.field2447 * 3) + 300, 30, 0, 0);
            arg6.method2283((byte) -82, class47.field661 / 2, class214.field2993 / 2 + 4, -1, class347.field4732, arg3);
        }
    }
}
