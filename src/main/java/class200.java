import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class200 extends class87 {

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public static int field2944 = 20;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "[Z")
    public static boolean[] field2948 = new boolean[8];

    @OriginalMember(owner = "client!va", name = "H", descriptor = "Ljava/lang/String;")
    public static String field2942 = "Loading title screen - ";

    @OriginalMember(owner = "client!va", name = "I", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)I")
    public static final int method1407(int arg0) {
        ++field2946;
        return arg0 != -1 ? -69 : class273.field4409;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)I")
    public static int method1408(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        ++field2949;
        if (arg1) {
            method1414(66, -91, 74, true, 43, -104, -31, -13, -107, 80, 15);
        }
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (super.field1378.field733) {
            class117.method875(var3, 0, class206.field3032, class140.field2272[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(III)V")
    public static final void method1409(int arg0, int arg1, int arg2) {
        class279 var3 = class111.method844(arg1, arg2, -1780180960);
        var3.method1928(false);
        var3.field4505 = arg0;
        ++field2950;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(B)Z")
    public static final boolean method1410(byte arg0) {
        if (arg0 != 59) {
            return true;
        } else {
            ++field2943;
            try {
                if (class207.field3062 == 2) {
                    if (class227.field3334 == null) {
                        class227.field3334 = class54.method387(class286.field4588, class192.field2833, class287.field4604);
                        if (class227.field3334 == null) {
                            return false;
                        }
                    }
                    if (class289.field4620 == null) {
                        class289.field4620 = new class41(class303.field4896, class138.field2244);
                    }
                    if (class284.field4575.method457(22050, class227.field3334, class204.field3011, -3187, class289.field4620)) {
                        class284.field4575.method435(false);
                        class284.field4575.method464(class263.field4133, 115);
                        class284.field4575.method441(class35.field451, arg0 ^ 68, class227.field3334);
                        class286.field4588 = null;
                        class207.field3062 = 0;
                        class289.field4620 = null;
                        class227.field3334 = null;
                        return true;
                    }
                }
            } catch (Exception var2) {
                var2.printStackTrace();
                class284.field4575.method454(127);
                class227.field3334 = null;
                class289.field4620 = null;
                class286.field4588 = null;
                class207.field3062 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZLhc;)Lai;")
    public static final class249 method1411(boolean arg0, class53 arg1) {
        class249 var2 = new class249();
        ++field2945;
        var2.field3773 = arg1.method331(-112);
        if (!arg0) {
            method1410((byte) -47);
        }
        var2.field3770 = class25.method169(var2.field3773, !arg0);
        return var2;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    public class200() {
        super(0, true);
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(III)V")
    public static final void method1412(int arg0, int arg1, int arg2) {
        class279 var3 = class111.method844(arg1, 6, -1780180960);
        var3.method1928(false);
        ++field2947;
        var3.field4505 = arg2;
        if (arg0 >= -39) {
            method1411(false, (class53) null);
        }
    }

    @OriginalMember(owner = "client!va", name = "g", descriptor = "(I)V")
    public static void method1413(int arg0) {
        if (arg0 != 2883854) {
            method1409(123, 6, 126);
        }
        field2942 = null;
        field2948 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIZIIIIIII)V")
    public static final void method1414(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; ~var11 > -105; ++var11) {
            for (int var27 = 0; ~var27 > -105; ++var27) {
                class5.field49[var11][var27] = 0;
                class156.field2435[var11][var27] = 99999999;
            }
        }
        class5.field49[arg4][arg7] = 99;
        int var12 = arg4;
        byte var13 = 0;
        int var14 = arg7;
        ++field2951;
        class156.field2435[arg4][arg7] = 0;
        if (arg6 == 2883848) {
            int var15 = 0;
            class158.field2460[var13] = arg4;
            boolean var16 = false;
            int var28 = var13 + 1;
            class181.field2719[var13] = arg7;
            int[][] var17 = class235.field3431[class37.field474].field3351;
            while (~var28 != ~var15) {
                var14 = class181.field2719[var15];
                var12 = class158.field2460[var15];
                var15 = var15 + 1 & 4095;
                if (~arg9 == ~var12 && ~arg0 == ~var14) {
                    var16 = true;
                    break;
                }
                if (~arg8 != -1) {
                    if ((~arg8 > -6 || arg8 == 10) && class235.field3431[class37.field474].method1583(arg5, arg0, arg9, arg8 + -1, 1, var14, 0, var12)) {
                        var16 = true;
                        break;
                    }
                    if (~arg8 > -11 && class235.field3431[class37.field474].method1580(1, arg0, var12, var14, arg5, arg9, arg8 - 1, (byte) -118)) {
                        var16 = true;
                        break;
                    }
                }
                if (~arg10 != -1 && ~arg2 != -1 && class235.field3431[class37.field474].method1582(arg10, var12, 1, arg9, var14, arg2, (byte) -103, arg0, arg1)) {
                    var16 = true;
                    break;
                }
                int var26 = class156.field2435[var12][var14] - -1;
                if (var12 > 0 && class5.field49[var12 + -1][var14] == 0 && ~(2883848 & var17[var12 + -1][var14]) == -1) {
                    class158.field2460[var28] = var12 + -1;
                    class181.field2719[var28] = var14;
                    var28 = var28 + 1 & 4095;
                    class5.field49[var12 + -1][var14] = 2;
                    class156.field2435[var12 - 1][var14] = var26;
                }
                if (var12 < 103 && ~class5.field49[var12 + 1][var14] == -1 && ~(var17[var12 - -1][var14] & 2883968) == -1) {
                    class158.field2460[var28] = var12 + 1;
                    class181.field2719[var28] = var14;
                    class5.field49[var12 - -1][var14] = 8;
                    var28 = var28 + 1 & 4095;
                    class156.field2435[var12 - -1][var14] = var26;
                }
                if (~var14 < -1 && ~class5.field49[var12][var14 - 1] == -1 && ~(2883842 & var17[var12][var14 + -1]) == -1) {
                    class158.field2460[var28] = var12;
                    class181.field2719[var28] = var14 - 1;
                    class5.field49[var12][var14 - 1] = 1;
                    var28 = var28 + 1 & 4095;
                    class156.field2435[var12][var14 + -1] = var26;
                }
                if (~var14 > -104 && ~class5.field49[var12][var14 + 1] == -1 && (var17[var12][var14 + 1] & 2883872) == 0) {
                    class158.field2460[var28] = var12;
                    class181.field2719[var28] = var14 + 1;
                    var28 = 4095 & var28 + 1;
                    class5.field49[var12][var14 + 1] = 4;
                    class156.field2435[var12][var14 + 1] = var26;
                }
                if (~var12 < -1 && var14 > 0 && class5.field49[var12 - 1][var14 - 1] == 0 && ~(2883854 & var17[var12 + -1][var14 + -1]) == -1 && (var17[var12 + -1][var14] & 2883848) == 0 && (var17[var12][var14 - 1] & 2883842) == 0) {
                    class158.field2460[var28] = var12 + -1;
                    class181.field2719[var28] = var14 + -1;
                    var28 = var28 + 1 & 4095;
                    class5.field49[var12 + -1][var14 + -1] = 3;
                    class156.field2435[var12 + -1][var14 + -1] = var26;
                }
                if (~var12 > -104 && var14 > 0 && ~class5.field49[var12 + 1][var14 + -1] == -1 && ~(2883971 & var17[var12 - -1][var14 - 1]) == -1 && (var17[var12 + 1][var14] & 2883968) == 0 && ~(var17[var12][var14 + -1] & 2883842) == -1) {
                    class158.field2460[var28] = var12 + 1;
                    class181.field2719[var28] = var14 + -1;
                    class5.field49[var12 + 1][var14 - 1] = 9;
                    class156.field2435[var12 + 1][var14 + -1] = var26;
                    var28 = var28 - -1 & 4095;
                }
                if (~var12 < -1 && ~var14 > -104 && class5.field49[var12 + -1][var14 + 1] == 0 && ~(var17[var12 + -1][var14 + 1] & 2883896) == -1 && ~(var17[var12 + -1][var14] & 2883848) == -1 && (2883872 & var17[var12][var14 + 1]) == 0) {
                    class158.field2460[var28] = var12 + -1;
                    class181.field2719[var28] = var14 + 1;
                    var28 = var28 - -1 & 4095;
                    class5.field49[var12 + -1][var14 + 1] = 6;
                    class156.field2435[var12 - 1][var14 + 1] = var26;
                }
                if (var12 < 103 && ~var14 > -104 && class5.field49[var12 - -1][var14 - -1] == 0 && ~(var17[var12 + 1][var14 + 1] & 2884064) == -1 && ~(var17[var12 + 1][var14] & 2883968) == -1 && ~(2883872 & var17[var12][var14 + 1]) == -1) {
                    class158.field2460[var28] = var12 + 1;
                    class181.field2719[var28] = var14 + 1;
                    var28 = var28 + 1 & 4095;
                    class5.field49[var12 + 1][var14 + 1] = 12;
                    class156.field2435[var12 - -1][var14 + 1] = var26;
                }
            }
            if (!var16) {
                if (!arg3) {
                    return;
                }
                int var18 = 1000;
                int var19 = 100;
                byte var20 = 10;
                for (int var21 = -var20 + arg9; var21 <= arg9 + var20; ++var21) {
                    for (int var22 = -var20 + arg0; ~(arg0 - -var20) <= ~var22; ++var22) {
                        if (var21 >= 0 && ~var22 <= -1 && ~var21 > -105 && ~var22 > -105 && class156.field2435[var21][var22] < 100) {
                            int var23 = 0;
                            int var24 = 0;
                            if (var22 < arg0) {
                                var24 = -var22 + arg0;
                            } else if (~(arg0 + arg2 + -1) > ~var22) {
                                var24 = var22 - -1 - (arg0 - -arg2);
                            }
                            if (~var21 <= ~arg9) {
                                if (~var21 < ~(arg10 + -1 + arg9)) {
                                    var23 = -arg9 + -arg10 + var21 + 1;
                                }
                            } else {
                                var23 = -var21 + arg9;
                            }
                            int var25 = var23 * var23 + var24 * var24;
                            if (~var25 > ~var18 || ~var18 == ~var25 && ~class156.field2435[var21][var22] > ~var19) {
                                var18 = var25;
                                var19 = class156.field2435[var21][var22];
                                var12 = var21;
                                var14 = var22;
                            }
                        }
                    }
                }
                if (~var18 == -1001) {
                    return;
                }
                if (~arg4 == ~var12 && arg7 == var14) {
                    return;
                }
            }
            class255.field3855 = var14;
            class258.field4001 = false;
            class113.field1883 = var12;
        }
    }
}
