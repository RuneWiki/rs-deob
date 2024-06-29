import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class185 extends class175 {

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "I")
    public static int field3217 = 0;

    @OriginalMember(owner = "client!ek", name = "R", descriptor = "Lmb;")
    public static class96 field3218 = class243.method1708(":allyreq:", (byte) 91);

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "Lmb;")
    public static class96 field3216 = class243.method1708("gleiten:", (byte) 125);

    @OriginalMember(owner = "client!ek", name = "U", descriptor = "I")
    public static int field3221 = 0;

    @OriginalMember(owner = "client!ek", name = "X", descriptor = "[Lmb;")
    public static class96[] field3224 = new class96[200];

    @OriginalMember(owner = "client!ek", name = "T", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!ek", name = "W", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!ek", name = "Z", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!ek", name = "S", descriptor = "Lff;")
    public static class3 field3219;

    @OriginalMember(owner = "client!ek", name = "Y", descriptor = "[Lmj;")
    public static class246[] field3225;

    @OriginalMember(owner = "client!ek", name = "V", descriptor = "[Lsa;")
    public static class70[] field3222;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)V")
    public static final void method1304(int arg0) {
        ++field3223;
        class132.field2373 = new class146(32);
        int var1 = 80 / ((arg0 - 1) / 43);
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(B)V")
    public static void method1305(byte arg0) {
        field3219 = null;
        field3224 = null;
        field3216 = null;
        field3222 = null;
        field3218 = null;
        field3225 = null;
        if (arg0 != 109) {
            method1306(67, 127, 37, 87, -11, 77, 77, -6, false, 9, -42, -35);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        int var3 = 66 % ((arg0 - 62) / 54);
        int[] var4 = super.field3044.method904((byte) -76, arg1);
        if (super.field3044.field2150) {
            class102.method771(var4, 0, class1.field11, class23.field395[arg1]);
        }
        ++field3226;
        return var4;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
    public class185() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIIIIZIII)Z")
    public static final boolean method1306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        ++field3220;
        for (int var12 = 0; ~var12 > -105; ++var12) {
            for (int var31 = 0; ~var31 > -105; ++var31) {
                class2.field20[var12][var31] = 0;
                class90.field1495[var12][var31] = 99999999;
            }
        }
        class2.field20[arg4][arg6] = 99;
        int var13 = arg4;
        class90.field1495[arg4][arg6] = 0;
        int var14 = arg6;
        byte var15 = 0;
        class19.field318[var15] = arg4;
        int var16 = 0;
        boolean var17 = false;
        int var32 = var15 + 1;
        class222.field3799[var15] = arg6;
        int[][] var18 = class62.field1064[class216.field3712].field3566;
        while (~var32 != ~var16) {
            var14 = class222.field3799[var16];
            var13 = class19.field318[var16];
            var16 = var16 + 1 & 4095;
            if (~arg2 == ~var13 && arg5 == var14) {
                var17 = true;
                break;
            }
            if (~arg7 != -1) {
                if ((arg7 < 5 || ~arg7 == -11) && class62.field1064[class216.field3712].method1437(2, var13, arg7 + -1, arg5, 1, var14, arg1, arg2)) {
                    var17 = true;
                    break;
                }
                if (~arg7 > -11 && class62.field1064[class216.field3712].method1435(var14, var13, arg5, 6831, 2, arg2, arg1, arg7 + -1)) {
                    var17 = true;
                    break;
                }
            }
            if (~arg9 != -1 && arg0 != 0 && class62.field1064[class216.field3712].method1440(arg5, 2, var14, arg0, arg10, arg9, var13, arg2, 1)) {
                var17 = true;
                break;
            }
            int var30 = class90.field1495[var13][var14] + 1;
            if (var13 > 0 && ~class2.field20[var13 - 1][var14] == -1 && ~(19661070 & var18[var13 + -1][var14]) == -1 && ~(var18[var13 + -1][var14 + 1] & 19661112) == -1) {
                class19.field318[var32] = var13 + -1;
                class222.field3799[var32] = var14;
                var32 = 4095 & var32 + 1;
                class2.field20[var13 + -1][var14] = 2;
                class90.field1495[var13 + -1][var14] = var30;
            }
            if (var13 < 102 && ~class2.field20[var13 - -1][var14] == -1 && ~(var18[var13 - -2][var14] & 19661187) == -1 && (19661280 & var18[var13 - -2][var14 + 1]) == 0) {
                class19.field318[var32] = var13 + 1;
                class222.field3799[var32] = var14;
                var32 = var32 + 1 & 4095;
                class2.field20[var13 + 1][var14] = 8;
                class90.field1495[var13 + 1][var14] = var30;
            }
            if (~var14 < -1 && ~class2.field20[var13][var14 + -1] == -1 && (19661070 & var18[var13][var14 + -1]) == 0 && (19661187 & var18[var13 + 1][var14 - 1]) == 0) {
                class19.field318[var32] = var13;
                class222.field3799[var32] = var14 + -1;
                var32 = var32 + 1 & 4095;
                class2.field20[var13][var14 + -1] = 1;
                class90.field1495[var13][var14 - 1] = var30;
            }
            if (var14 < 102 && ~class2.field20[var13][var14 + 1] == -1 && ~(19661112 & var18[var13][var14 + 2]) == -1 && ~(var18[var13 - -1][var14 - -2] & 19661280) == -1) {
                class19.field318[var32] = var13;
                class222.field3799[var32] = var14 + 1;
                class2.field20[var13][var14 + 1] = 4;
                class90.field1495[var13][var14 - -1] = var30;
                var32 = 4095 & var32 + 1;
            }
            if (~var13 < -1 && var14 > 0 && ~class2.field20[var13 + -1][var14 - 1] == -1 && ~(19661112 & var18[var13 + -1][var14]) == -1 && (19661070 & var18[var13 + -1][var14 + -1]) == 0 && ~(19661187 & var18[var13][var14 - 1]) == -1) {
                class19.field318[var32] = var13 - 1;
                class222.field3799[var32] = var14 + -1;
                var32 = var32 - -1 & 4095;
                class2.field20[var13 + -1][var14 - 1] = 3;
                class90.field1495[var13 - 1][var14 - 1] = var30;
            }
            if (~var13 > -103 && ~var14 < -1 && class2.field20[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 + -1] & 19661070) == 0 && (19661187 & var18[var13 + 2][var14 + -1]) == 0 && ~(var18[var13 + 2][var14] & 19661280) == -1) {
                class19.field318[var32] = var13 + 1;
                class222.field3799[var32] = var14 + -1;
                var32 = 4095 & var32 + 1;
                class2.field20[var13 + 1][var14 + -1] = 9;
                class90.field1495[var13 + 1][var14 + -1] = var30;
            }
            if (~var13 < -1 && ~var14 > -103 && class2.field20[var13 + -1][var14 + 1] == 0 && ~(19661070 & var18[var13 - 1][var14 + 1]) == -1 && ~(var18[var13 - 1][var14 - -2] & 19661112) == -1 && ~(var18[var13][var14 - -2] & 19661280) == -1) {
                class19.field318[var32] = var13 - 1;
                class222.field3799[var32] = var14 + 1;
                class2.field20[var13 + -1][var14 + 1] = 6;
                class90.field1495[var13 + -1][var14 - -1] = var30;
                var32 = 4095 & var32 + 1;
            }
            if (var13 < 102 && ~var14 > -103 && ~class2.field20[var13 + 1][var14 - -1] == -1 && (var18[var13 + 1][var14 + 2] & 19661112) == 0 && (var18[var13 + 2][var14 - -2] & 19661280) == 0 && (var18[var13 + 2][var14 + 1] & 19661187) == 0) {
                class19.field318[var32] = var13 + 1;
                class222.field3799[var32] = var14 + 1;
                class2.field20[var13 + 1][var14 - -1] = 12;
                class90.field1495[var13 - -1][var14 + 1] = var30;
                var32 = var32 + 1 & 4095;
            }
        }
        client.field1983 = 0;
        if (!var17) {
            if (!arg8) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = -var21 + arg2; var22 <= arg2 + var21; ++var22) {
                for (int var23 = -var21 + arg5; var23 <= arg5 - -var21; ++var23) {
                    if (var22 >= 0 && var23 >= 0 && ~var22 > -105 && var23 < 104 && class90.field1495[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (var22 >= arg2) {
                            if (~var22 < ~(arg2 + arg9 - 1)) {
                                var24 = -arg9 + 1 + -arg2 + var22;
                            }
                        } else {
                            var24 = -var22 + arg2;
                        }
                        if (arg5 <= var23) {
                            if (arg5 - -arg0 + -1 < var23) {
                                var25 = -arg0 - (arg5 - 1) + var23;
                            }
                        } else {
                            var25 = arg5 - var23;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var26 < var19 || ~var19 == ~var26 && var20 > class90.field1495[var22][var23]) {
                            var14 = var23;
                            var13 = var22;
                            var19 = var26;
                            var20 = class90.field1495[var22][var23];
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg4 == var13 && ~arg6 == ~var14) {
                return false;
            }
            client.field1983 = 1;
        }
        if (arg11 != 10529) {
            return true;
        } else {
            byte var27 = 0;
            class19.field318[var27] = var13;
            int var33 = var27 + 1;
            class222.field3799[var27] = var14;
            int var28;
            int var29 = var28 = class2.field20[var13][var14];
            while (~arg4 != ~var13 || ~arg6 != ~var14) {
                if (~var28 != ~var29) {
                    var28 = var29;
                    class19.field318[var33] = var13;
                    class222.field3799[var33++] = var14;
                }
                if (~(var29 & 1) != -1) {
                    ++var14;
                } else if ((var29 & 4) != 0) {
                    --var14;
                }
                if ((var29 & 2) != 0) {
                    ++var13;
                } else if ((8 & var29) != 0) {
                    --var13;
                }
                var29 = class2.field20[var13][var14];
            }
            if (~var33 < -1) {
                class276.method1872(arg11 ^ -10528, var33, arg3);
                return true;
            } else if (~arg3 == -2) {
                return false;
            } else {
                return true;
            }
        }
    }
}
