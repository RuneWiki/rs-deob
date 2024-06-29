import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class605 extends class404 {

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
    private int field8513;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "I")
    private int field8516;

    @OriginalMember(owner = "client!sl", name = "x", descriptor = "I")
    private int field8524;

    @OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
    private int field8523;

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "I")
    private int field8521;

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
    private int field8520;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
    private int field8515;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    private int field8517;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "Z")
    public static boolean field8512 = false;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public static int field8510;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
    public static int field8511;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    public static int field8514;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
    public static int field8518;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
    public static int field8519;

    @OriginalMember(owner = "client!sl", name = "v", descriptor = "I")
    public static int field8522;

    @OriginalMember(owner = "client!sl", name = "y", descriptor = "I")
    public static int field8525;

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "I")
    public static int field8526;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIIIIIIILwd;)Z", line = 6)
    public static final boolean method3314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class356 arg11) {
        ++field8526;
        int var12 = arg6;
        int var13 = arg7;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = -var14 + arg6;
        class517.field7067[var14][var15] = 99;
        int var17 = arg7 - var15;
        class470.field5973[var14][var15] = 0;
        byte var18 = 0;
        class19.field291[var18] = arg6;
        int var19 = 0;
        int var35 = var18 + 1;
        class534.field7204[var18] = arg7;
        int[][] var20 = arg11.field4537;
        if (arg0 >= -19) {
            return false;
        } else {
            while (true) {
                label284: while (true) {
                    int var21;
                    int var22;
                    int var23;
                    int var24;
                    int var26;
                    do {
                        do {
                            do {
                                label261: do {
                                    if (var35 == var19) {
                                        class190.field2379 = var12;
                                        class265.field3372 = var13;
                                        return false;
                                    }
                                    var13 = class534.field7204[var19];
                                    var12 = class19.field291[var19];
                                    var21 = -var16 + var12;
                                    var22 = -var17 + var13;
                                    var19 = var19 + 1 & 4095;
                                    var23 = var12 - arg11.field4555;
                                    var24 = -arg11.field4547 + var13;
                                    if (arg2 != -4) {
                                        if (arg2 != -3) {
                                            if (~arg2 != 1) {
                                                if (~arg2 != 0) {
                                                    if (~arg2 != -1 && ~arg2 != -2 && ~arg2 != -3 && ~arg2 != -4 && arg2 != 9) {
                                                        if (arg11.method1956(arg3, 80, arg2, arg4, arg5, var13, var12, arg9)) {
                                                            class265.field3372 = var13;
                                                            class190.field2379 = var12;
                                                            return true;
                                                        }
                                                    } else if (arg11.method1967(var12, var13, arg3, 67108864, arg4, arg5, arg2, arg9)) {
                                                        class265.field3372 = var13;
                                                        class190.field2379 = var12;
                                                        return true;
                                                    }
                                                } else if (arg11.method1952(-1, arg1, arg9, var13, arg4, arg10, var12, arg8, arg3)) {
                                                    class265.field3372 = var13;
                                                    class190.field2379 = var12;
                                                    return true;
                                                }
                                            } else if (arg11.method1962(arg1, arg3, (byte) 118, arg4, arg8, arg9, arg10, var13, var12, arg3)) {
                                                class190.field2379 = var12;
                                                class265.field3372 = var13;
                                                return true;
                                            }
                                        } else if (class43.method259(var12, false, arg3, var13, arg1, arg9, arg4, arg3, arg10)) {
                                            class190.field2379 = var12;
                                            class265.field3372 = var13;
                                            return true;
                                        }
                                    } else if (arg9 == var12 && arg4 == var13) {
                                        class190.field2379 = var12;
                                        class265.field3372 = var13;
                                        return true;
                                    }
                                    var26 = class470.field5973[var21][var22] - -1;
                                    if (~var21 < -1 && class517.field7067[var21 + -1][var22] == 0 && (1134821376 & var20[var23 + -1][var24]) == 0 && (1310982144 & var20[var23 - 1][arg3 + var24 - 1]) == 0) {
                                        int var27 = 1;
                                        while (true) {
                                            if (~(arg3 + -1) >= ~var27) {
                                                class19.field291[var35] = var12 + -1;
                                                class534.field7204[var35] = var13;
                                                var35 = var35 - -1 & 4095;
                                                class517.field7067[var21 + -1][var22] = 2;
                                                class470.field5973[var21 - 1][var22] = var26;
                                                break;
                                            }
                                            if (~(1336147968 & var20[var23 + -1][var24 + var27]) != -1) {
                                                break;
                                            }
                                            ++var27;
                                        }
                                    }
                                    if (~var21 > ~(-arg3 + 128) && class517.field7067[var21 + 1][var22] == 0 && ~(var20[arg3 + var23][var24] & 1625554944) == -1 && (var20[arg3 + var23][arg3 + -1 + var24] & 2015625216) == 0) {
                                        int var28 = 1;
                                        while (true) {
                                            if (~(arg3 + -1) >= ~var28) {
                                                class19.field291[var35] = var12 - -1;
                                                class534.field7204[var35] = var13;
                                                class517.field7067[var21 + 1][var22] = 8;
                                                var35 = var35 + 1 & 4095;
                                                class470.field5973[var21 + 1][var22] = var26;
                                                break;
                                            }
                                            if ((2028208128 & var20[arg3 + var23][var24 - -var28]) != 0) {
                                                break;
                                            }
                                            ++var28;
                                        }
                                    }
                                    if (~var22 < -1 && ~class517.field7067[var21][var22 - 1] == -1 && (1134821376 & var20[var23][var24 + -1]) == 0 && ~(1625554944 & var20[arg3 - 1 + var23][var24 + -1]) == -1) {
                                        int var29 = 1;
                                        while (true) {
                                            if (~var29 <= ~(arg3 + -1)) {
                                                class19.field291[var35] = var12;
                                                class534.field7204[var35] = var13 + -1;
                                                class517.field7067[var21][var22 + -1] = 1;
                                                var35 = var35 + 1 & 4095;
                                                class470.field5973[var21][var22 + -1] = var26;
                                                break;
                                            }
                                            if (~(1675886592 & var20[var23 - -var29][var24 + -1]) != -1) {
                                                break;
                                            }
                                            ++var29;
                                        }
                                    }
                                    if (var22 < -arg3 + 128 && class517.field7067[var21][var22 + 1] == 0 && (1310982144 & var20[var23][arg3 + var24]) == 0 && ~(var20[arg3 + var23 - 1][arg3 + var24] & 2015625216) == -1) {
                                        int var30 = 1;
                                        while (true) {
                                            if (var30 >= arg3 - 1) {
                                                class19.field291[var35] = var12;
                                                class534.field7204[var35] = var13 - -1;
                                                var35 = 4095 & var35 + 1;
                                                class517.field7067[var21][var22 - -1] = 4;
                                                class470.field5973[var21][var22 + 1] = var26;
                                                break;
                                            }
                                            if (~(var20[var23 + var30][arg3 + var24] & 2116288512) != -1) {
                                                break;
                                            }
                                            ++var30;
                                        }
                                    }
                                    if (~var21 < -1 && var22 > 0 && class517.field7067[var21 + -1][var22 + -1] == 0 && ~(var20[var23 + -1][var24 + -1] & 1134821376) == -1) {
                                        int var31 = 1;
                                        while (true) {
                                            if (~arg3 >= ~var31) {
                                                class19.field291[var35] = var12 + -1;
                                                class534.field7204[var35] = var13 + -1;
                                                class517.field7067[var21 - 1][var22 + -1] = 3;
                                                var35 = var35 - -1 & 4095;
                                                class470.field5973[var21 + -1][var22 + -1] = var26;
                                                break;
                                            }
                                            if ((1336147968 & var20[var23 + -1][var24 - 1 + var31]) != 0 || (var20[var31 + -1 + var23][var24 - 1] & 1675886592) != 0) {
                                                break;
                                            }
                                            ++var31;
                                        }
                                    }
                                    if (~var21 > ~(-arg3 + 128) && ~var22 < -1 && ~class517.field7067[var21 - -1][var22 + -1] == -1 && (1625554944 & var20[var23 - -arg3][var24 + -1]) == 0) {
                                        int var32 = 1;
                                        while (true) {
                                            if (var32 >= arg3) {
                                                class19.field291[var35] = var12 - -1;
                                                class534.field7204[var35] = var13 + -1;
                                                var35 = var35 + 1 & 4095;
                                                class517.field7067[var21 - -1][var22 - 1] = 9;
                                                class470.field5973[var21 + 1][var22 + -1] = var26;
                                                break;
                                            }
                                            if ((2028208128 & var20[arg3 + var23][var24 + var32 + -1]) != 0 || ~(var20[var23 + var32][var24 + -1] & 1675886592) != -1) {
                                                break;
                                            }
                                            ++var32;
                                        }
                                    }
                                    if (var21 > 0 && ~(128 - arg3) < ~var22 && class517.field7067[var21 + -1][var22 + 1] == 0 && (var20[var23 - 1][arg3 + var24] & 1310982144) == 0) {
                                        for (int var33 = 1; var33 < arg3; ++var33) {
                                            if (~(var20[var23 + -1][var24 - -var33] & 1336147968) != -1 || ~(2116288512 & var20[var23 + -1 + var33][arg3 + var24]) != -1) {
                                                continue label261;
                                            }
                                        }
                                        class19.field291[var35] = var12 + -1;
                                        class534.field7204[var35] = var13 + 1;
                                        var35 = var35 + 1 & 4095;
                                        class517.field7067[var21 + -1][var22 + 1] = 6;
                                        class470.field5973[var21 - 1][var22 + 1] = var26;
                                    }
                                } while (-arg3 + 128 <= var21);
                            } while (var22 >= 128 - arg3);
                        } while (class517.field7067[var21 + 1][var22 + 1] != 0);
                    } while ((var20[arg3 + var23][var24 - -arg3] & 2015625216) != 0);
                    for (int var34 = 1; ~arg3 < ~var34; ++var34) {
                        if (~(2116288512 & var20[var23 - -var34][arg3 + var24]) != -1 || ~(var20[arg3 + var23][var24 + var34] & 2028208128) != -1) {
                            continue label284;
                        }
                    }
                    class19.field291[var35] = var12 + 1;
                    class534.field7204[var35] = var13 + 1;
                    var35 = 4095 & var35 + 1;
                    class517.field7067[var21 + 1][var22 - -1] = 12;
                    class470.field5973[var21 + 1][var22 + 1] = var26;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBI)V", line = 442)
    public final void method1911(int arg0, byte arg1, int arg2) {
        ++field8522;
        if (arg1 != -34) {
            method3316(-24, 83);
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 455)
    public class605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field8513 = arg6;
        this.field8516 = arg4;
        this.field8524 = arg7;
        this.field8523 = arg3;
        this.field8521 = arg1;
        this.field8520 = arg0;
        this.field8515 = arg2;
        this.field8517 = arg5;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)V", line = 470)
    public final void method1910(int arg0, int arg1, int arg2) {
        if (arg1 != -21716) {
            this.field8523 = 115;
        }
        ++field8525;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIII)I", line = 482)
    public static final int method3315(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 4095) {
            return -13;
        } else {
            ++field8519;
            if (~arg0 > ~arg2) {
                return arg2;
            } else {
                return ~arg0 >= ~arg3 ? arg0 : arg3;
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(II)Z", line = 499)
    public static final boolean method3316(int arg0, int arg1) {
        ++field8518;
        if (arg1 != 23 && arg1 != 5 && ~arg1 != -18 && arg1 != 58 && ~arg1 != -14) {
            if (~arg1 != -21 && ~arg1 != -1002) {
                if (arg0 != -1) {
                    field8510 = 33;
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(III)V", line = 520)
    public final void method1912(int arg0, int arg1, int arg2) {
        ++field8514;
        int var4 = this.field8520 * arg1 >> 12;
        int var5 = this.field8521 * arg0 >> 12;
        int var6 = this.field8515 * arg1 >> 12;
        if (arg2 == 4) {
            int var7 = this.field8523 * arg0 >> 12;
            int var8 = this.field8516 * arg1 >> 12;
            int var9 = this.field8517 * arg0 >> 12;
            int var10 = this.field8513 * arg1 >> 12;
            int var11 = this.field8524 * arg0 >> 12;
            class579.method3198(var4, var8, var5, (byte) 42, super.field5064, var7, var11, var10, var6, var9);
        }
    }
}
