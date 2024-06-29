import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class237 extends class321 {

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field2946 = 1405;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "[I")
    public static int[] field2951 = new int[1];

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public int field2944;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public int field2947;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public int field2950;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "Lsp;")
    public class677 field2943;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;ZIILjava/lang/String;)V")
    public static final void method1420(String arg0, boolean arg1, int arg2, int arg3, String arg4) {
        field2945++;
        class357.method2103(-17689, arg2, true, arg3, arg1, arg0, arg4);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIIIIILjw;I)Z")
    public static final boolean method1421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class263 arg10, int arg11) {
        field2949++;
        int var12 = arg1;
        int var13 = arg11;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg1 - var14;
        if (arg9 < 32) {
            return false;
        }
        class106.field1145[var14][var15] = 99;
        int var17 = arg11 - var15;
        class378.field5119[var14][var15] = 0;
        byte var18 = 0;
        class60.field615[var18] = arg1;
        int var19 = 0;
        int var35 = var18 + 1;
        class299.field3729[var18] = arg11;
        int[][] var20 = arg10.field3286;
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
                                    class572.field8123 = var13;
                                    class701.field9839 = var12;
                                    return false;
                                }
                                var13 = class299.field3729[var19];
                                var12 = class60.field615[var19];
                                var19 = var19 + 1 & 0xFFF;
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var23 = var12 - arg10.field3289;
                                var24 = var13 - arg10.field3274;
                                if (arg6 == -4) {
                                    if (arg8 == var12 && arg2 == var13) {
                                        class572.field8123 = var13;
                                        class701.field9839 = var12;
                                        return true;
                                    }
                                } else if (arg6 == -3) {
                                    if (class248.method1461(arg4, arg7, arg8, arg0, arg2, var13, (byte) 116, arg7, var12)) {
                                        class572.field8123 = var13;
                                        class701.field9839 = var12;
                                        return true;
                                    }
                                } else if (arg6 == -2) {
                                    if (arg10.method1552(arg8, var12, arg5, arg2, arg7, arg4, arg0, var13, -68, arg7)) {
                                        class701.field9839 = var12;
                                        class572.field8123 = var13;
                                        return true;
                                    }
                                } else if (arg6 == -1) {
                                    if (arg10.method1555(arg0, arg4, var12, arg8, arg7, 1, arg5, var13, arg2)) {
                                        class572.field8123 = var13;
                                        class701.field9839 = var12;
                                        return true;
                                    }
                                } else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
                                    if (arg10.method1543(arg7, arg2, arg6, arg3, var12, 9816, arg8, var13)) {
                                        class572.field8123 = var13;
                                        class701.field9839 = var12;
                                        return true;
                                    }
                                } else if (arg10.method1558(arg3, arg8, 89, arg6, var12, arg7, var13, arg2)) {
                                    class701.field9839 = var12;
                                    class572.field8123 = var13;
                                    return true;
                                }
                                var26 = class378.field5119[var22][var21] + 1;
                                if (var22 > 0 && class106.field1145[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 - (1 - arg7)] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if ((arg7 - 1) <= var27) {
                                            class60.field615[var35] = var12 - 1;
                                            class299.field3729[var35] = var13;
                                            class106.field1145[var22 - 1][var21] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class378.field5119[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if ((128 - arg7) > var22 && class106.field1145[var22 + 1][var21] == 0 && (var20[var23 + arg7][var24] & 0x60E40000) == 0 && (var20[var23 + arg7][arg7 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= (arg7 - 1)) {
                                            class60.field615[var35] = var12 + 1;
                                            class299.field3729[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class106.field1145[var22 + 1][var21] = 8;
                                            class378.field5119[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[arg7 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class106.field1145[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg7 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if ((arg7 - 1) <= var29) {
                                            class60.field615[var35] = var12;
                                            class299.field3729[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class106.field1145[var22][var21 - 1] = 1;
                                            class378.field5119[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if ((128 - arg7) > var21 && class106.field1145[var22][var21 + 1] == 0 && (var20[var23][arg7 + var24] & 0x4E240000) == 0 && (var20[var23 + arg7 - 1][arg7 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg7 - 1)) {
                                            class60.field615[var35] = var12;
                                            class299.field3729[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class106.field1145[var22][var21 + 1] = 4;
                                            class378.field5119[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg7 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class106.field1145[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg7 <= var31) {
                                            class60.field615[var35] = var12 - 1;
                                            class299.field3729[var35] = var13 - 1;
                                            class106.field1145[var22 - 1][var21 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class378.field5119[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var22 < (128 - arg7) && var21 > 0 && class106.field1145[var22 + 1][var21 - 1] == 0 && (var20[arg7 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg7 <= var32) {
                                            class60.field615[var35] = var12 + 1;
                                            class299.field3729[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class106.field1145[var22 + 1][var21 - 1] = 9;
                                            class378.field5119[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg7 + var23][var32 + var24 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && (128 - arg7) > var21 && class106.field1145[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][arg7 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg7; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg7 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class60.field615[var35] = var12 - 1;
                                    class299.field3729[var35] = var13 + 1;
                                    class106.field1145[var22 - 1][var21 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class378.field5119[var22 - 1][var21 + 1] = var26;
                                }
                            } while (128 - arg7 <= var22);
                        } while ((128 - arg7) <= var21);
                    } while (class106.field1145[var22 + 1][var21 + 1] != 0);
                } while ((var20[var23 + arg7][arg7 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg7; var34++) {
                    if ((var20[var23 + var34][arg7 + var24] & 0x7E240000) != 0 || (var20[arg7 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class60.field615[var35] = var12 + 1;
                class299.field3729[var35] = var13 + 1;
                class106.field1145[var22 + 1][var21 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class378.field5119[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public static void method1422(byte arg0) {
        if (arg0 != 18) {
            method1422((byte) -25);
        }
        field2951 = null;
    }
}
