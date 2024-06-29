import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class619 extends class56 {

    @OriginalMember(owner = "client!nu", name = "J", descriptor = "I")
    public static int field8334 = 0;

    @OriginalMember(owner = "client!nu", name = "D", descriptor = "I")
    public static int field8328;

    @OriginalMember(owner = "client!nu", name = "E", descriptor = "I")
    public static int field8329;

    @OriginalMember(owner = "client!nu", name = "G", descriptor = "I")
    public static int field8331;

    @OriginalMember(owner = "client!nu", name = "H", descriptor = "I")
    public static int field8332;

    @OriginalMember(owner = "client!nu", name = "I", descriptor = "I")
    public static int field8333;

    @OriginalMember(owner = "client!nu", name = "F", descriptor = "Lnm;")
    public static class499 field8330;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lwj;IIIIIIIIII)Z", line = 4)
    public static final boolean method3508(class415 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field8333;
        int var11 = arg9;
        int var12 = arg10;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg9 - var13;
        class578.field7880[var13][var14] = 99;
        int var16 = -var14 + arg10;
        class68.field931[var13][var14] = 0;
        byte var17 = 0;
        if (arg5 != 1084489728) {
            field8334 = -103;
        }
        int var18 = 0;
        class186.field2252[var17] = arg9;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class496.field6942[var10001] = arg10;
        int[][] var19 = arg0.field5428;
        while (~var26 != ~var18) {
            var12 = class496.field6942[var18];
            var11 = class186.field2252[var18];
            var18 = 4095 & var18 + 1;
            int var20 = -arg0.field5435 + var11;
            int var21 = var12 - arg0.field5415;
            int var22 = -var15 + var11;
            int var23 = -var16 + var12;
            if (arg6 != -4) {
                if (arg6 != -3) {
                    if (~arg6 != 1) {
                        if (arg6 != -1) {
                            if (~arg6 != -1 && ~arg6 != -2 && ~arg6 != -3 && ~arg6 != -4 && ~arg6 != -10) {
                                if (arg0.method2474(-128, arg2, var12, arg1, arg6, arg3, var11, 1)) {
                                    class394.field5108 = var12;
                                    class324.field4020 = var11;
                                    return true;
                                }
                            } else if (arg0.method2479(-1, arg1, arg6, var12, arg2, var11, arg3, 1)) {
                                class324.field4020 = var11;
                                class394.field5108 = var12;
                                return true;
                            }
                        } else if (arg0.method2478(arg8, 1, (byte) 37, arg1, arg2, var11, arg7, var12, arg4)) {
                            class324.field4020 = var11;
                            class394.field5108 = var12;
                            return true;
                        }
                    } else if (arg0.method2482(30, arg8, arg7, 1, 1, var12, arg1, var11, arg4, arg2)) {
                        class394.field5108 = var12;
                        class324.field4020 = var11;
                        return true;
                    }
                } else if (class631.method3566(var12, 1, arg8, arg2, 1, arg7, arg1, (byte) -33, var11)) {
                    class324.field4020 = var11;
                    class394.field5108 = var12;
                    return true;
                }
            } else if (~arg2 == ~var11 && ~arg1 == ~var12) {
                class394.field5108 = var12;
                class324.field4020 = var11;
                return true;
            }
            int var25 = class68.field931[var22][var23] + 1;
            if (~var22 < -1 && ~class578.field7880[var22 + -1][var23] == -1 && (var19[var20 + -1][var21] & 1109655552) == 0) {
                class186.field2252[var26] = var11 + -1;
                class496.field6942[var26] = var12;
                var26 = 4095 & var26 + 1;
                class578.field7880[var22 - 1][var23] = 2;
                class68.field931[var22 + -1][var23] = var25;
            }
            if (var22 < 127 && ~class578.field7880[var22 + 1][var23] == -1 && (var19[var20 + 1][var21] & 1612972032) == 0) {
                class186.field2252[var26] = var11 + 1;
                class496.field6942[var26] = var12;
                var26 = var26 + 1 & 4095;
                class578.field7880[var22 - -1][var23] = 8;
                class68.field931[var22 + 1][var23] = var25;
            }
            if (~var23 < -1 && ~class578.field7880[var22][var23 + -1] == -1 && ~(1084489728 & var19[var20][var21 + -1]) == -1) {
                class186.field2252[var26] = var11;
                class496.field6942[var26] = var12 - 1;
                var26 = 4095 & var26 + 1;
                class578.field7880[var22][var23 - 1] = 1;
                class68.field931[var22][var23 + -1] = var25;
            }
            if (~var23 > -128 && ~class578.field7880[var22][var23 + 1] == -1 && (1210318848 & var19[var20][var21 + 1]) == 0) {
                class186.field2252[var26] = var11;
                class496.field6942[var26] = var12 + 1;
                class578.field7880[var22][var23 + 1] = 4;
                var26 = 4095 & var26 - -1;
                class68.field931[var22][var23 + 1] = var25;
            }
            if (~var22 < -1 && ~var23 < -1 && ~class578.field7880[var22 + -1][var23 - 1] == -1 && (var19[var20 + -1][var21 - 1] & 1134821376) == 0 && (1109655552 & var19[var20 + -1][var21]) == 0 && ~(var19[var20][var21 + -1] & 1084489728) == -1) {
                class186.field2252[var26] = var11 - 1;
                class496.field6942[var26] = var12 + -1;
                var26 = 4095 & var26 - -1;
                class578.field7880[var22 - 1][var23 + -1] = 3;
                class68.field931[var22 + -1][var23 - 1] = var25;
            }
            if (var22 < 127 && var23 > 0 && ~class578.field7880[var22 + 1][var23 + -1] == -1 && ~(1625554944 & var19[var20 - -1][var21 + -1]) == -1 && ~(1612972032 & var19[var20 + 1][var21]) == -1 && ~(1084489728 & var19[var20][var21 + -1]) == -1) {
                class186.field2252[var26] = var11 + 1;
                class496.field6942[var26] = var12 - 1;
                class578.field7880[var22 + 1][var23 - 1] = 9;
                var26 = var26 + 1 & 4095;
                class68.field931[var22 + 1][var23 + -1] = var25;
            }
            if (var22 > 0 && ~var23 > -128 && class578.field7880[var22 + -1][var23 + 1] == 0 && ~(1310982144 & var19[var20 + -1][var21 - -1]) == -1 && (var19[var20 + -1][var21] & 1109655552) == 0 && ~(1210318848 & var19[var20][var21 + 1]) == -1) {
                class186.field2252[var26] = var11 + -1;
                class496.field6942[var26] = var12 - -1;
                var26 = 4095 & var26 + 1;
                class578.field7880[var22 + -1][var23 + 1] = 6;
                class68.field931[var22 + -1][var23 + 1] = var25;
            }
            if (var22 < 127 && ~var23 > -128 && class578.field7880[var22 + 1][var23 + 1] == 0 && (2015625216 & var19[var20 + 1][var21 + 1]) == 0 && ~(1612972032 & var19[var20 - -1][var21]) == -1 && ~(1210318848 & var19[var20][var21 + 1]) == -1) {
                class186.field2252[var26] = var11 + 1;
                class496.field6942[var26] = var12 + 1;
                class578.field7880[var22 + 1][var23 + 1] = 12;
                var26 = var26 + 1 & 4095;
                class68.field931[var22 + 1][var23 + 1] = var25;
            }
        }
        class394.field5108 = var12;
        class324.field4020 = var11;
        return false;
    }

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "(I)V", line = 252)
    public static void method3509(int arg0) {
        int var1 = 71 / ((75 - arg0) / 50);
        field8330 = null;
    }

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "(I)I", line = 261)
    public static final int method3510(int arg0) {
        if (arg0 >= -54) {
            method3511(-87, -38, -52, (class377) null, (class377) null);
        }
        ++field8328;
        if (class634.field8654 == null) {
            if (!class672.field9218 && class748.field10391 != null) {
                return class748.field10391.field1025;
            }
            int var1 = class738.field10291.method109(122);
            int var2 = class738.field10291.method117(true);
            if (class304.field3626) {
                if (var1 > class705.field9916 && ~(class705.field9916 + class119.field1505) < ~var1) {
                    int var3 = -1;
                    for (int var4 = 0; ~var4 > ~class282.field3279; ++var4) {
                        if (!class35.field536) {
                            int var8 = var4 * 16 + class676.field9279 - -31;
                            if (var8 + -13 < var2 && var2 <= var8 + 3) {
                                var3 = var4;
                            }
                        } else {
                            int var9 = var4 * 16 + 33 + class676.field9279;
                            if (var2 > var9 + -13 && var2 <= var9 + 3) {
                                var3 = var4;
                            }
                        }
                    }
                    if (~var3 != 0) {
                        int var5 = 0;
                        class723 var6 = new class723(class365.field4542);
                        for (class581 var7 = (class581) var6.method4089(-1); var7 != null; var7 = (class581) var6.method4090(-1)) {
                            if (var3 == var5++) {
                                return ((class75) var7.field7925.field1703.field1903).field1025;
                            }
                        }
                    }
                } else if (class288.field3466 != null && ~class743.field10352 > ~var1 && ~var1 > ~(class743.field10352 + class189.field2275)) {
                    int var10 = -1;
                    for (int var11 = 0; ~class288.field3466.field7927 < ~var11; ++var11) {
                        if (class35.field536) {
                            int var15 = var11 * 16 + 33 + class656.field9045;
                            if (~var2 < ~(var15 + -13) && var15 + 3 >= var2) {
                                var10 = var11;
                            }
                        } else {
                            int var16 = class656.field9045 + 31 - -(var11 * 16);
                            if (var16 + -13 < var2 && ~(var16 + 3) <= ~var2) {
                                var10 = var11;
                            }
                        }
                    }
                    if (~var10 != 0) {
                        int var12 = 0;
                        class723 var13 = new class723(class288.field3466.field7925);
                        for (class75 var14 = (class75) var13.method4089(-1); var14 != null; var14 = (class75) var13.method4090(-1)) {
                            if (var12++ == var10) {
                                return var14.field1025;
                            }
                        }
                    }
                }
            } else if (~class705.field9916 > ~var1 && ~var1 > ~(class705.field9916 + class119.field1505)) {
                int var17 = -1;
                for (int var18 = 0; var18 < class245.field2894; ++var18) {
                    if (!class35.field536) {
                        int var22 = 31 - -((class245.field2894 + -1 + -var18) * 16) + class676.field9279;
                        if (var22 + -13 < var2 && var2 <= var22 + 3) {
                            var17 = var18;
                        }
                    } else {
                        int var23 = class676.field9279 + 33 - -((class245.field2894 + -1 + -var18) * 16);
                        if (~var2 < ~(var23 + -13) && var2 <= var23 + 3) {
                            var17 = var18;
                        }
                    }
                }
                if (var17 != -1) {
                    int var19 = 0;
                    class522 var20 = new class522(class5.field52);
                    for (class75 var21 = (class75) var20.method3136((byte) -47); var21 != null; var21 = (class75) var20.method3135((byte) 47)) {
                        if (var17 == var19++) {
                            return var21.field1025;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)[I", line = 458)
    public final int[] method145(int arg0, int arg1) {
        ++field8329;
        int[] var3 = super.field752.method1308(false, arg1);
        if (super.field752.field2441) {
            class211.method1333(var3, 0, class642.field8759, class349.field4354[arg1]);
        }
        if (arg0 != 0) {
            field8334 = -125;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIILbga;Lbga;)V", line = 482)
    public static final void method3511(int arg0, int arg1, int arg2, class377 arg3, class377 arg4) {
        class727 var5 = class267.method1583(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field10171 = arg3;
            var5.field10181 = arg4;
            int var6 = class704.field9910 == class621.field8523 ? 1 : 0;
            if (arg3.method503(false)) {
                if (arg3.method504((byte) -24)) {
                    arg3.field822 = class119.field1509[var6];
                    class119.field1509[var6] = arg3;
                } else {
                    arg3.field822 = class653.field9015[var6];
                    class653.field9015[var6] = arg3;
                    class257.field3034 = true;
                }
            } else {
                arg3.field822 = class454.field6399[var6];
                class454.field6399[var6] = arg3;
            }
            if (arg4 != null) {
                if (arg4.method503(false)) {
                    if (arg4.method504((byte) -24)) {
                        arg4.field822 = class119.field1509[var6];
                        class119.field1509[var6] = arg4;
                        return;
                    }
                    arg4.field822 = class653.field9015[var6];
                    class653.field9015[var6] = arg4;
                    class257.field3034 = true;
                    return;
                }
                arg4.field822 = class454.field6399[var6];
                class454.field6399[var6] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 540)
    public static final void method3512(String arg0, int arg1, boolean arg2) {
        class318.method1873("", arg0, (byte) 121, "", "", arg1, 0);
        ++field8332;
        if (arg2) {
            method3508((class415) null, -13, -54, 100, -91, 37, -18, 91, 57, -30, -27);
        }
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V", line = 551)
    public class619() {
        super(0, true);
    }
}
