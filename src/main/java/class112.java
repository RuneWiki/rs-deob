import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class112 extends class85 {

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    public int field1539 = 0;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
    public static int field1540 = 0;

    @OriginalMember(owner = "client!ci", name = "D", descriptor = "I")
    public static int field1544 = -1;

    @OriginalMember(owner = "client!ci", name = "G", descriptor = "F")
    public static float field1547;

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!ci", name = "F", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "Ljava/lang/Object;")
    public static Object field1542;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILbt;)V")
    private final void method732(int arg0, int arg1, class88 arg2) {
        if (arg1 == 2) {
            this.field1539 = arg2.method568((byte) 110);
        }
        int var4 = 28 % ((arg0 + 59) / 53);
        field1546++;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZLbt;)V")
    public final void method733(boolean arg0, class88 arg1) {
        while (true) {
            int var3 = arg1.method617(2);
            if (var3 == 0) {
                field1541++;
                if (!arg0) {
                    field1547 = 1.0223178F;
                    return;
                }
                return;
            }
            this.method732(-124, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIBIIIIIILbm;)Z")
    public static final boolean method734(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class215 arg11) {
        field1543++;
        int var12 = arg0;
        int var13 = arg5;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg0 - var14;
        class374.field4867[var14][var15] = 99;
        int var17 = arg5 - var15;
        class258.field3262[var14][var15] = 0;
        int var18 = -98 / ((-arg4 - 58) / 39);
        byte var19 = 0;
        class460.field6423[var19] = arg0;
        int var20 = 0;
        int var36 = var19 + 1;
        class394.field5145[var19] = arg5;
        int[][] var21 = arg11.field2742;
        while (true) {
            label282: while (true) {
                int var22;
                int var23;
                int var24;
                int var25;
                int var27;
                do {
                    do {
                        do {
                            label259: do {
                                if (var36 == var20) {
                                    class328.field4213 = var13;
                                    class482.field7025 = var12;
                                    return false;
                                }
                                var13 = class394.field5145[var20];
                                var12 = class460.field6423[var20];
                                var22 = var12 - var16;
                                var23 = var13 - var17;
                                var20 = var20 + 1 & 0xFFF;
                                var24 = var12 - arg11.field2751;
                                var25 = var13 - arg11.field2754;
                                if (arg6 == -4) {
                                    if (arg2 == var12 && arg8 == var13) {
                                        class482.field7025 = var12;
                                        class328.field4213 = var13;
                                        return true;
                                    }
                                } else if (arg6 == -3) {
                                    if (class127.method806(arg2, (byte) 81, arg8, arg10, arg1, arg9, var12, arg9, var13)) {
                                        class328.field4213 = var13;
                                        class482.field7025 = var12;
                                        return true;
                                    }
                                } else if (arg6 == -2) {
                                    if (arg11.method1366(0, arg2, var12, arg7, arg9, arg9, arg10, arg8, var13, arg1)) {
                                        class328.field4213 = var13;
                                        class482.field7025 = var12;
                                        return true;
                                    }
                                } else if (arg6 == -1) {
                                    if (arg11.method1372(arg8, arg7, var12, var13, arg2, arg10, true, arg9, arg1)) {
                                        class328.field4213 = var13;
                                        class482.field7025 = var12;
                                        return true;
                                    }
                                } else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
                                    if (arg11.method1380(arg6, arg2, arg3, var13, 5810, arg9, var12, arg8)) {
                                        class328.field4213 = var13;
                                        class482.field7025 = var12;
                                        return true;
                                    }
                                } else if (arg11.method1368(arg9, -44, arg8, arg3, var13, arg2, var12, arg6)) {
                                    class482.field7025 = var12;
                                    class328.field4213 = var13;
                                    return true;
                                }
                                var27 = class258.field3262[var22][var23] + 1;
                                if (var22 > 0 && class374.field4867[var22 - 1][var23] == 0 && (var21[var24 - 1][var25] & 0x43A40000) == 0 && (var21[var24 - 1][arg9 + var25 - 1] & 0x4E240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= (arg9 - 1)) {
                                            class460.field6423[var36] = var12 - 1;
                                            class394.field5145[var36] = var13;
                                            class374.field4867[var22 - 1][var23] = 2;
                                            var36 = var36 + 1 & 0xFFF;
                                            class258.field3262[var22 - 1][var23] = var27;
                                            break;
                                        }
                                        if ((var21[var24 - 1][var25 + var28] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 < (128 - arg9) && class374.field4867[var22 + 1][var23] == 0 && (var21[arg9 + var24][var25] & 0x60E40000) == 0 && (var21[arg9 + var24][var25 + arg9 - 1] & 0x78240000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if ((arg9 - 1) <= var29) {
                                            class460.field6423[var36] = var12 + 1;
                                            class394.field5145[var36] = var13;
                                            var36 = var36 + 1 & 0xFFF;
                                            class374.field4867[var22 + 1][var23] = 8;
                                            class258.field3262[var22 + 1][var23] = var27;
                                            break;
                                        }
                                        if ((var21[arg9 + var24][var25 + var29] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var23 > 0 && class374.field4867[var22][var23 - 1] == 0 && (var21[var24][var25 - 1] & 0x43A40000) == 0 && (var21[arg9 + var24 - 1][var25 - 1] & 0x60E40000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= arg9 - 1) {
                                            class460.field6423[var36] = var12;
                                            class394.field5145[var36] = var13 - 1;
                                            class374.field4867[var22][var23 - 1] = 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class258.field3262[var22][var23 - 1] = var27;
                                            break;
                                        }
                                        if ((var21[var24 + var30][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var23 < (128 - arg9) && class374.field4867[var22][var23 + 1] == 0 && (var21[var24][arg9 + var25] & 0x4E240000) == 0 && (var21[arg9 + var24 - 1][arg9 + var25] & 0x78240000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg9 - 1) {
                                            class460.field6423[var36] = var12;
                                            class394.field5145[var36] = var13 + 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class374.field4867[var22][var23 + 1] = 4;
                                            class258.field3262[var22][var23 + 1] = var27;
                                            break;
                                        }
                                        if ((var21[var24 + var31][arg9 + var25] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var22 > 0 && var23 > 0 && class374.field4867[var22 - 1][var23 - 1] == 0 && (var21[var24 - 1][var25 - 1] & 0x43A40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg9 <= var32) {
                                            class460.field6423[var36] = var12 - 1;
                                            class394.field5145[var36] = var13 - 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class374.field4867[var22 - 1][var23 - 1] = 3;
                                            class258.field3262[var22 - 1][var23 - 1] = var27;
                                            break;
                                        }
                                        if ((var21[var24 - 1][var25 + var32 - 1] & 0x4FA40000) != 0 || (var21[var24 + var32 - 1][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 < (128 - arg9) && var23 > 0 && class374.field4867[var22 + 1][var23 - 1] == 0 && (var21[arg9 + var24][var25 - 1] & 0x60E40000) == 0) {
                                    int var33 = 1;
                                    while (true) {
                                        if (var33 >= arg9) {
                                            class460.field6423[var36] = var12 + 1;
                                            class394.field5145[var36] = var13 - 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class374.field4867[var22 + 1][var23 - 1] = 9;
                                            class258.field3262[var22 + 1][var23 - 1] = var27;
                                            break;
                                        }
                                        if ((var21[arg9 + var24][var25 + var33 - 1] & 0x78E40000) != 0 || (var21[var24 + var33][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var33++;
                                    }
                                }
                                if (var22 > 0 && (128 - arg9) > var23 && class374.field4867[var22 - 1][var23 + 1] == 0 && (var21[var24 - 1][arg9 + var25] & 0x4E240000) == 0) {
                                    for (int var34 = 1; var34 < arg9; var34++) {
                                        if ((var21[var24 - 1][var25 + var34] & 0x4FA40000) != 0 || (var21[var24 + var34 - 1][arg9 + var25] & 0x7E240000) != 0) {
                                            continue label259;
                                        }
                                    }
                                    class460.field6423[var36] = var12 - 1;
                                    class394.field5145[var36] = var13 + 1;
                                    class374.field4867[var22 - 1][var23 + 1] = 6;
                                    var36 = var36 + 1 & 0xFFF;
                                    class258.field3262[var22 - 1][var23 + 1] = var27;
                                }
                            } while (128 - arg9 <= var22);
                        } while (128 - arg9 <= var23);
                    } while (class374.field4867[var22 + 1][var23 + 1] != 0);
                } while ((var21[arg9 + var24][arg9 + var25] & 0x78240000) != 0);
                for (int var35 = 1; var35 < arg9; var35++) {
                    if ((var21[var24 + var35][arg9 + var25] & 0x7E240000) != 0 || (var21[arg9 + var24][var25 + var35] & 0x78E40000) != 0) {
                        continue label282;
                    }
                }
                class460.field6423[var36] = var12 + 1;
                class394.field5145[var36] = var13 + 1;
                class374.field4867[var22 + 1][var23 + 1] = 12;
                var36 = var36 + 1 & 0xFFF;
                class258.field3262[var22 + 1][var23 + 1] = var27;
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method735(int arg0) {
        if (arg0 != -5196) {
            method736(-116);
        }
        field1542 = null;
    }

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)[Ldg;")
    public static final class12[] method736(int arg0) {
        field1545++;
        if (arg0 != 1336147968) {
            field1544 = -119;
        }
        return new class12[] { class275.field3510, class275.field3514, class275.field3515, class275.field3516, class275.field3517, class275.field3518, class275.field3519, class275.field3520, class275.field3521, class275.field3522 };
    }
}
