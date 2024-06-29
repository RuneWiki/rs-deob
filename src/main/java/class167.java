import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class167 {

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "Lmg;")
    public static class101 field2509;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Ljv;")
    public static class56 field2511;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static void method1104(int arg0) {
        if (arg0 == 0) {
            field2509 = null;
            field2511 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 != 1) {
            return;
        }
        if (arg0 >= class424.field6204 && class76.field1021 >= arg0 && arg5 >= class424.field6204 && arg5 <= class76.field1021 && class424.field6204 <= arg6 && class76.field1021 >= arg6 && arg3 >= class424.field6204 && class76.field1021 >= arg3 && arg9 >= class417.field6057 && arg9 <= class224.field3193 && arg2 >= class417.field6057 && class224.field3193 >= arg2 && class417.field6057 <= arg8 && arg8 <= class224.field3193 && arg1 >= class417.field6057 && class224.field3193 >= arg1) {
            class78.method630((byte) -80, arg9, arg1, arg3, arg2, arg5, arg6, arg0, arg8, arg4);
        } else {
            class138.method924(arg4, arg8, arg2, arg6, arg0, arg9, arg1, (byte) 119, arg3, arg5);
        }
        field2508++;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIILeq;IIBIIIII)Z")
    public static final boolean method1106(int arg0, int arg1, int arg2, class141 arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2510++;
        int var12 = arg2;
        int var13 = arg1;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg2 - var14;
        int var17 = arg1 - var15;
        if (arg6 != 37) {
            return true;
        }
        class367.field5382[var14][var15] = 99;
        class250.field3452[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class223.field3172[var18] = arg2;
        int var35 = var18 + 1;
        class446.field6579[var18] = arg1;
        int[][] var20 = arg3.field2013;
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
                                    class489.field7139 = var12;
                                    class64.field871 = var13;
                                    return false;
                                }
                                var12 = class223.field3172[var19];
                                var13 = class446.field6579[var19];
                                var21 = var13 - var17;
                                var19 = var19 + 1 & 0xFFF;
                                var22 = var12 - var16;
                                var23 = var12 - arg3.field1992;
                                var24 = var13 - arg3.field1994;
                                if (arg0 == -4) {
                                    if (arg5 == var12 && arg10 == var13) {
                                        class489.field7139 = var12;
                                        class64.field871 = var13;
                                        return true;
                                    }
                                } else if (arg0 == -3) {
                                    if (class346.method2049(arg4, arg11, arg8, var13, arg10, var12, arg5, -4, arg4)) {
                                        class489.field7139 = var12;
                                        class64.field871 = var13;
                                        return true;
                                    }
                                } else if (arg0 == -2) {
                                    if (arg3.method953(arg11, var13, arg10, arg4, arg8, arg9, false, arg4, var12, arg5)) {
                                        class489.field7139 = var12;
                                        class64.field871 = var13;
                                        return true;
                                    }
                                } else if (arg0 == -1) {
                                    if (arg3.method951(arg9, arg10, var12, true, arg5, var13, arg4, arg8, arg11)) {
                                        class489.field7139 = var12;
                                        class64.field871 = var13;
                                        return true;
                                    }
                                } else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
                                    if (arg3.method943(-1, var12, arg5, arg7, arg10, arg4, var13, arg0)) {
                                        class489.field7139 = var12;
                                        class64.field871 = var13;
                                        return true;
                                    }
                                } else if (arg3.method944(arg5, arg7, arg4, -1, var12, arg10, var13, arg0)) {
                                    class64.field871 = var13;
                                    class489.field7139 = var12;
                                    return true;
                                }
                                var26 = class250.field3452[var22][var21] + 1;
                                if (var22 > 0 && class367.field5382[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + arg4 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if ((arg4 - 1) <= var27) {
                                            class223.field3172[var35] = var12 - 1;
                                            class446.field6579[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class367.field5382[var22 - 1][var21] = 2;
                                            class250.field3452[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if ((128 - arg4) > var22 && class367.field5382[var22 + 1][var21] == 0 && (var20[arg4 + var23][var24] & 0x60E40000) == 0 && (var20[arg4 + var23][var24 + arg4 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= arg4 - 1) {
                                            class223.field3172[var35] = var12 + 1;
                                            class446.field6579[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class367.field5382[var22 + 1][var21] = 8;
                                            class250.field3452[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[arg4 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class367.field5382[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg4 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg4 - 1) {
                                            class223.field3172[var35] = var12;
                                            class446.field6579[var35] = var13 - 1;
                                            class367.field5382[var22][var21 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class250.field3452[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (128 - arg4 > var21 && class367.field5382[var22][var21 + 1] == 0 && (var20[var23][arg4 + var24] & 0x4E240000) == 0 && (var20[arg4 + var23 - 1][arg4 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg4 - 1)) {
                                            class223.field3172[var35] = var12;
                                            class446.field6579[var35] = var13 + 1;
                                            class367.field5382[var22][var21 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class250.field3452[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][var24 + arg4] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class367.field5382[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg4) {
                                            class223.field3172[var35] = var12 - 1;
                                            class446.field6579[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class367.field5382[var22 - 1][var21 - 1] = 3;
                                            class250.field3452[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (128 - arg4 > var22 && var21 > 0 && class367.field5382[var22 + 1][var21 - 1] == 0 && (var20[arg4 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg4 <= var32) {
                                            class223.field3172[var35] = var12 + 1;
                                            class446.field6579[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class367.field5382[var22 + 1][var21 - 1] = 9;
                                            class250.field3452[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg4 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && var21 < (128 - arg4) && class367.field5382[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][arg4 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg4; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg4 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class223.field3172[var35] = var12 - 1;
                                    class446.field6579[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class367.field5382[var22 - 1][var21 + 1] = 6;
                                    class250.field3452[var22 - 1][var21 + 1] = var26;
                                }
                            } while (128 - arg4 <= var22);
                        } while ((128 - arg4) <= var21);
                    } while (class367.field5382[var22 + 1][var21 + 1] != 0);
                } while ((var20[arg4 + var23][arg4 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg4; var34++) {
                    if ((var20[var23 + var34][var24 + arg4] & 0x7E240000) != 0 || (var20[arg4 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class223.field3172[var35] = var12 + 1;
                class446.field6579[var35] = var13 + 1;
                class367.field5382[var22 + 1][var21 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class250.field3452[var22 + 1][var21 + 1] = var26;
            }
        }
    }
}
