import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class106 extends class12 {

    @OriginalMember(owner = "client!as", name = "Q", descriptor = "Lla;")
    public static class319 field1492 = new class319(27, 6);

    @OriginalMember(owner = "client!as", name = "V", descriptor = "[Z")
    public static boolean[] field1497 = new boolean[100];

    @OriginalMember(owner = "client!as", name = "U", descriptor = "Lla;")
    public static class319 field1496 = new class319(107, 3);

    @OriginalMember(owner = "client!as", name = "W", descriptor = "I")
    public static int field1498 = 0;

    @OriginalMember(owner = "client!as", name = "P", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!as", name = "R", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!as", name = "S", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!as", name = "T", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(III)V", line = 6)
    public static final void method678(int arg0, int arg1, int arg2) {
        boolean var3 = class443.field6672[0][arg1][arg2] != null && class443.field6672[0][arg1][arg2].field6795 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class443.field6672[var4][arg1][arg2] == null) {
                class452 var5 = class443.field6672[var4][arg1][arg2] = new class452(var4, arg1, arg2);
                if (var3) {
                    var5.field6810++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IB)I", line = 26)
    public static final int method679(int arg0, byte arg1) {
        if (arg1 != 70) {
            method680(-47);
        }
        field1493++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(I)V", line = 38)
    public static void method680(int arg0) {
        field1496 = null;
        field1492 = null;
        field1497 = null;
        if (arg0 <= 94) {
            field1496 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIIIIILkg;II)Z", line = 56)
    public static final boolean method681(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class181 arg9, int arg10, int arg11) {
        field1494++;
        int var12 = arg6;
        int var13 = arg3;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg6 - var14;
        int var17 = arg3 - var15;
        class427.field6483[var14][var15] = 99;
        class478.field7080[var14][var15] = 0;
        byte var18 = 0;
        int var19 = arg10;
        class56.field814[var18] = arg6;
        int var35 = var18 + 1;
        class1.field6[var18] = arg3;
        int[][] var20 = arg9.field2451;
        while (true) {
            label282: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label259: do {
                                if (var35 == var19) {
                                    field1495 = var13;
                                    class118.field1621 = var12;
                                    return false;
                                }
                                var12 = class56.field814[var19];
                                var13 = class1.field6[var19];
                                var21 = var13 - var17;
                                var19 = var19 + 1 & 0xFFF;
                                var22 = var12 - var16;
                                var23 = var12 - arg9.field2433;
                                var24 = var13 - arg9.field2434;
                                if (arg4 == -4) {
                                    if (arg0 == var12 && arg11 == var13) {
                                        class118.field1621 = var12;
                                        field1495 = var13;
                                        return true;
                                    }
                                } else if (arg4 == -3) {
                                    if (class36.method314(var12, arg2, arg5, arg0, var13, (byte) 123, arg2, arg11, arg8)) {
                                        class118.field1621 = var12;
                                        field1495 = var13;
                                        return true;
                                    }
                                } else if (arg4 == -2) {
                                    if (arg9.method1223(var13, arg1, arg0, arg2, arg8, 0, arg11, arg2, var12, arg5)) {
                                        field1495 = var13;
                                        class118.field1621 = var12;
                                        return true;
                                    }
                                } else if (arg4 == -1) {
                                    if (arg9.method1225(arg1, arg8, arg0, arg2, arg11, var12, var13, arg5, 20198)) {
                                        field1495 = var13;
                                        class118.field1621 = var12;
                                        return true;
                                    }
                                } else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
                                    if (arg9.method1222(var13, arg7, var12, arg11, 2, arg2, arg4, arg0)) {
                                        field1495 = var13;
                                        class118.field1621 = var12;
                                        return true;
                                    }
                                } else if (arg9.method1228(arg4, var13, arg2, arg11, arg7, var12, false, arg0)) {
                                    field1495 = var13;
                                    class118.field1621 = var12;
                                    return true;
                                }
                                var26 = class478.field7080[var22][var21] + 1;
                                if (var22 > 0 && class427.field6483[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg2 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if ((arg2 - 1) <= var27) {
                                            class56.field814[var35] = var12 - 1;
                                            class1.field6[var35] = var13;
                                            class427.field6483[var22 - 1][var21] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class478.field7080[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var22 < (128 - arg2) && class427.field6483[var22 + 1][var21] == 0 && (var20[arg2 + var23][var24] & 0x60E40000) == 0 && (var20[arg2 + var23][var24 + arg2 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if ((arg2 - 1) <= var28) {
                                            class56.field814[var35] = var12 + 1;
                                            class1.field6[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class427.field6483[var22 + 1][var21] = 8;
                                            class478.field7080[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[arg2 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class427.field6483[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 - (1 - arg2)][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if ((arg2 - 1) <= var29) {
                                            class56.field814[var35] = var12;
                                            class1.field6[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class427.field6483[var22][var21 - 1] = 1;
                                            class478.field7080[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var21 < 128 - arg2 && class427.field6483[var22][var21 + 1] == 0 && (var20[var23][var24 + arg2] & 0x4E240000) == 0 && (var20[arg2 + var23 - 1][arg2 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= arg2 - 1) {
                                            class56.field814[var35] = var12;
                                            class1.field6[var35] = var13 + 1;
                                            class427.field6483[var22][var21 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class478.field7080[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][var24 + arg2] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class427.field6483[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg2) {
                                            class56.field814[var35] = var12 - 1;
                                            class1.field6[var35] = var13 - 1;
                                            class427.field6483[var22 - 1][var21 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class478.field7080[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var22 < (128 - arg2) && var21 > 0 && class427.field6483[var22 + 1][var21 - 1] == 0 && (var20[arg2 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg2 <= var32) {
                                            class56.field814[var35] = var12 + 1;
                                            class1.field6[var35] = var13 - 1;
                                            class427.field6483[var22 + 1][var21 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class478.field7080[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg2 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && var21 < 128 - arg2 && class427.field6483[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][arg2 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg2; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var33 + var23 - 1][arg2 + var24] & 0x7E240000) != 0) {
                                            continue label259;
                                        }
                                    }
                                    class56.field814[var35] = var12 - 1;
                                    class1.field6[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class427.field6483[var22 - 1][var21 + 1] = 6;
                                    class478.field7080[var22 - 1][var21 + 1] = var26;
                                }
                            } while ((128 - arg2) <= var22);
                        } while ((128 - arg2) <= var21);
                    } while (class427.field6483[var22 + 1][var21 + 1] != 0);
                } while ((var20[arg2 + var23][arg2 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg2; var34++) {
                    if ((var20[var23 + var34][arg2 + var24] & 0x7E240000) != 0 || (var20[arg2 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label282;
                    }
                }
                class56.field814[var35] = var12 + 1;
                class1.field6[var35] = var13 + 1;
                class427.field6483[var22 + 1][var21 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class478.field7080[var22 + 1][var21 + 1] = var26;
            }
        }
    }
}
