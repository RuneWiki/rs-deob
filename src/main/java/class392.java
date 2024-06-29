import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public abstract class class392 {

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "Lkda;")
    public static class328 field5396;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)I")
    public abstract int method1587(byte arg0);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIII)I")
    public static final int method2331(int arg0, int arg1, int arg2, int arg3) {
        field5394++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else {
            if (arg1 != 18779) {
                method2334(-42);
            }
            return var4 == 2 ? 7 - arg3 : -arg2 + 7;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIILvba;IIIIIIII)Z")
    public static final boolean method2332(int arg0, int arg1, int arg2, class37 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field5395++;
        int var12 = arg5;
        int var13 = arg1;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg5 - var14;
        class507.field7198[var14][var15] = 99;
        int var17 = arg1 - var15;
        class476.field6739[var14][var15] = 0;
        byte var18 = 0;
        if (arg6 != -28421) {
            method2331(-125, 112, -23, 83);
        }
        int var19 = 0;
        class513.field7320[var18] = arg5;
        int var35 = var18 + 1;
        class59.field745[var18] = arg1;
        int[][] var20 = arg3.field439;
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
                                if (var35 == var19) {
                                    class330.field4554 = var12;
                                    class37.field455 = var13;
                                    return false;
                                }
                                var13 = class59.field745[var19];
                                var12 = class513.field7320[var19];
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - arg3.field435;
                                var24 = var13 - arg3.field458;
                                if (arg4 == -4) {
                                    if (arg11 == var12 && arg8 == var13) {
                                        class37.field455 = var13;
                                        class330.field4554 = var12;
                                        return true;
                                    }
                                } else if (arg4 == -3) {
                                    if (class11.method52(arg0, arg11, var12, var13, arg10, arg8, true, arg9, arg0)) {
                                        class37.field455 = var13;
                                        class330.field4554 = var12;
                                        return true;
                                    }
                                } else if (arg4 == -2) {
                                    if (arg3.method243(var12, arg10, arg0, arg2, arg0, var13, arg11, 14004, arg9, arg8)) {
                                        class37.field455 = var13;
                                        class330.field4554 = var12;
                                        return true;
                                    }
                                } else if (arg4 == -1) {
                                    if (arg3.method228(arg8, arg0, arg11, var12, arg10, var13, 104, arg2, arg9)) {
                                        class37.field455 = var13;
                                        class330.field4554 = var12;
                                        return true;
                                    }
                                } else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
                                    if (arg3.method241(arg8, var13, arg0, arg7, arg11, arg4, var12, arg6 ^ 0xFFFF907B)) {
                                        class37.field455 = var13;
                                        class330.field4554 = var12;
                                        return true;
                                    }
                                } else if (arg3.method237(arg0, var13, arg8, arg11, -24088, arg4, arg7, var12)) {
                                    class37.field455 = var13;
                                    class330.field4554 = var12;
                                    return true;
                                }
                                var26 = class476.field6739[var22][var21] + 1;
                                if (var22 > 0 && class507.field7198[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg0 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= (arg0 - 1)) {
                                            class513.field7320[var35] = var12 - 1;
                                            class59.field745[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class507.field7198[var22 - 1][var21] = 2;
                                            class476.field6739[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var22 < (128 - arg0) && class507.field7198[var22 + 1][var21] == 0 && (var20[arg0 + var23][var24] & 0x60E40000) == 0 && (var20[var23 + arg0][var24 + arg0 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= arg0 - 1) {
                                            class513.field7320[var35] = var12 + 1;
                                            class59.field745[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class507.field7198[var22 + 1][var21] = 8;
                                            class476.field6739[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg0][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class507.field7198[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg0 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (arg0 - 1 <= var29) {
                                            class513.field7320[var35] = var12;
                                            class59.field745[var35] = var13 - 1;
                                            class507.field7198[var22][var21 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class476.field6739[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if ((128 - arg0) > var21 && class507.field7198[var22][var21 + 1] == 0 && (var20[var23][var24 + arg0] & 0x4E240000) == 0 && (var20[arg0 + var23 - 1][arg0 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg0 - 1)) {
                                            class513.field7320[var35] = var12;
                                            class59.field745[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class507.field7198[var22][var21 + 1] = 4;
                                            class476.field6739[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg0 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class507.field7198[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg0) {
                                            class513.field7320[var35] = var12 - 1;
                                            class59.field745[var35] = var13 - 1;
                                            class507.field7198[var22 - 1][var21 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class476.field6739[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var22 < (128 - arg0) && var21 > 0 && class507.field7198[var22 + 1][var21 - 1] == 0 && (var20[var23 + arg0][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg0 <= var32) {
                                            class513.field7320[var35] = var12 + 1;
                                            class59.field745[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class507.field7198[var22 + 1][var21 - 1] = 9;
                                            class476.field6739[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg0 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && var21 < (128 - arg0) && class507.field7198[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][var24 + arg0] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg0; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg0 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class513.field7320[var35] = var12 - 1;
                                    class59.field745[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class507.field7198[var22 - 1][var21 + 1] = 6;
                                    class476.field6739[var22 - 1][var21 + 1] = var26;
                                }
                            } while (var22 >= 128 - arg0);
                        } while (var21 >= (128 - arg0));
                    } while (class507.field7198[var22 + 1][var21 + 1] != 0);
                } while ((var20[var23 + arg0][arg0 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg0; var34++) {
                    if ((var20[var23 + var34][arg0 + var24] & 0x7E240000) != 0 || (var20[arg0 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class513.field7320[var35] = var12 + 1;
                class59.field745[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class507.field7198[var22 + 1][var21 + 1] = 12;
                class476.field6739[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)I")
    public abstract int method1594(int arg0);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)Z")
    public abstract boolean method1595(boolean arg0);

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(Z)Z")
    public final boolean method2333(boolean arg0) {
        field5393++;
        if (arg0) {
            return false;
        } else {
            return this.method1597((byte) 103) || this.method1589(27928) || this.method1595(!arg0);
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
    public abstract void method1591(int arg0);

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)Lqw;")
    public abstract class68 method1585(byte arg0);

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(B)V")
    public abstract void method1596(byte arg0);

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)Z")
    public abstract boolean method1589(int arg0);

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)V")
    public static void method2334(int arg0) {
        if (arg0 != 0) {
            method2331(-59, -4, -77, 37);
        }
        field5396 = null;
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(B)Z")
    public abstract boolean method1597(byte arg0);
}
