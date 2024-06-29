import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class96 {

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "[I")
    public static int[] field1419 = new int[2048];

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field1420 = -50;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "[Ljf;")
    public static class639[] field1422;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILup;IIIIIIIIZI)Z", line = 8)
    public static final boolean method789(int arg0, class238 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        field1418++;
        int var12 = arg9;
        int var13 = arg5;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg9 - var14;
        int var17 = arg5 - var15;
        class339.field4967[var14][var15] = 99;
        class532.field7661[var14][var15] = 0;
        if (!arg10) {
            field1422 = null;
        }
        byte var18 = 0;
        int var19 = 0;
        class457.field6638[var18] = arg9;
        int var35 = var18 + 1;
        class707.field9973[var18] = arg5;
        int[][] var20 = arg1.field3831;
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
                                    class689.field9795 = var13;
                                    class594.field8340 = var12;
                                    return false;
                                }
                                var13 = class707.field9973[var19];
                                var12 = class457.field6638[var19];
                                var21 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var22 = var13 - var17;
                                var23 = var12 - arg1.field3832;
                                var24 = var13 - arg1.field3828;
                                if (arg7 == -4) {
                                    if (arg2 == var12 && arg0 == var13) {
                                        class689.field9795 = var13;
                                        class594.field8340 = var12;
                                        return true;
                                    }
                                } else if (arg7 == -3) {
                                    if (class590.method3391((byte) -127, arg2, arg0, var13, arg11, arg11, var12, arg8, arg4)) {
                                        class689.field9795 = var13;
                                        class594.field8340 = var12;
                                        return true;
                                    }
                                } else if (arg7 == -2) {
                                    if (arg1.method1648(var12, arg11, arg11, arg0, var13, arg8, arg4, -16827, arg2, arg3)) {
                                        class689.field9795 = var13;
                                        class594.field8340 = var12;
                                        return true;
                                    }
                                } else if (arg7 == -1) {
                                    if (arg1.method1646(arg2, arg8, var12, var13, arg4, (byte) 114, arg3, arg11, arg0)) {
                                        class594.field8340 = var12;
                                        class689.field9795 = var13;
                                        return true;
                                    }
                                } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                                    if (arg1.method1637(var12, arg0, arg11, arg7, var13, arg6, true, arg2)) {
                                        class689.field9795 = var13;
                                        class594.field8340 = var12;
                                        return true;
                                    }
                                } else if (arg1.method1654(arg6, arg0, arg7, arg11, 1, arg2, var13, var12)) {
                                    class594.field8340 = var12;
                                    class689.field9795 = var13;
                                    return true;
                                }
                                var26 = class532.field7661[var21][var22] + 1;
                                if (var21 > 0 && class339.field4967[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + arg11 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= (arg11 - 1)) {
                                            class457.field6638[var35] = var12 - 1;
                                            class707.field9973[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class339.field4967[var21 - 1][var22] = 2;
                                            class532.field7661[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var21 < 128 - arg11 && class339.field4967[var21 + 1][var22] == 0 && (var20[arg11 + var23][var24] & 0x60E40000) == 0 && (var20[var23 + arg11][arg11 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (arg11 - 1 <= var28) {
                                            class457.field6638[var35] = var12 + 1;
                                            class707.field9973[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class339.field4967[var21 + 1][var22] = 8;
                                            class532.field7661[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg11][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class339.field4967[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg11 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if ((arg11 - 1) <= var29) {
                                            class457.field6638[var35] = var12;
                                            class707.field9973[var35] = var13 - 1;
                                            class339.field4967[var21][var22 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class532.field7661[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (128 - arg11 > var22 && class339.field4967[var21][var22 + 1] == 0 && (var20[var23][arg11 + var24] & 0x4E240000) == 0 && (var20[var23 + arg11 - 1][arg11 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if ((arg11 - 1) <= var30) {
                                            class457.field6638[var35] = var12;
                                            class707.field9973[var35] = var13 + 1;
                                            class339.field4967[var21][var22 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class532.field7661[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg11 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class339.field4967[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg11 <= var31) {
                                            class457.field6638[var35] = var12 - 1;
                                            class707.field9973[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class339.field4967[var21 - 1][var22 - 1] = 3;
                                            class532.field7661[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var31 + var24 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (128 - arg11 > var21 && var22 > 0 && class339.field4967[var21 + 1][var22 - 1] == 0 && (var20[var23 + arg11][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg11 <= var32) {
                                            class457.field6638[var35] = var12 + 1;
                                            class707.field9973[var35] = var13 - 1;
                                            class339.field4967[var21 + 1][var22 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class532.field7661[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg11 + var23][var32 + var24 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && var22 < 128 - arg11 && class339.field4967[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][arg11 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg11; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 - (1 - var33)][arg11 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class457.field6638[var35] = var12 - 1;
                                    class707.field9973[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class339.field4967[var21 - 1][var22 + 1] = 6;
                                    class532.field7661[var21 - 1][var22 + 1] = var26;
                                }
                            } while (128 - arg11 <= var21);
                        } while (128 - arg11 <= var22);
                    } while (class339.field4967[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg11 + var23][var24 + arg11] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg11; var34++) {
                    if ((var20[var23 + var34][arg11 + var24] & 0x7E240000) != 0 || (var20[arg11 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class457.field6638[var35] = var12 + 1;
                class707.field9973[var35] = var13 + 1;
                class339.field4967[var21 + 1][var22 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class532.field7661[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Ljava/lang/String;", line = 433)
    public static final String method790(int arg0, int arg1) {
        field1421++;
        return arg1 > -91 ? null : (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V", line = 449)
    public static void method791(byte arg0) {
        field1422 = null;
        if (arg0 == 90) {
            field1419 = null;
        }
    }
}
