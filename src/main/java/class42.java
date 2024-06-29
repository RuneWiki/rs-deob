import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class42 {

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "I")
    private int field645;

    @OriginalMember(owner = "client!wca", name = "j", descriptor = "I")
    private int field648;

    @OriginalMember(owner = "client!wca", name = "n", descriptor = "Z")
    private boolean field652;

    @OriginalMember(owner = "client!wca", name = "m", descriptor = "Z")
    private boolean field651;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
    public static int field639 = -1;

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!wca", name = "h", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!wca", name = "i", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!wca", name = "k", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!wca", name = "l", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!wca", name = "o", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "Lofa;")
    public static class139 field642;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)Z")
    public final boolean method353(byte arg0) {
        if (arg0 != -84) {
            field646 = 45;
        }
        field643++;
        return this.field651;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V")
    public static void method354(int arg0) {
        if (arg0 != 1) {
            field642 = null;
        }
        field642 = null;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Z)V")
    public static final void method355(boolean arg0) {
        if (arg0) {
            method358(85, 9, 61, -39, -56, 13, 115, null, -126, 107, 8, -35);
        }
        field650++;
        if (class575.field8031 == 5) {
            class575.field8031 = 6;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IILgaa;)Ljava/lang/String;")
    public static final String method356(int arg0, int arg1, class460 arg2) {
        field649++;
        if (arg1 != -1) {
            method355(false);
        }
        if (!client.method715(arg2).method288(arg0, -73) && arg2.field6580 == null) {
            return null;
        } else if (arg2.field6623 == null || arg2.field6623.length <= arg0 || arg2.field6623[arg0] == null || arg2.field6623[arg0].trim().length() == 0) {
            return class491.field6959 ? "Hidden-" + arg0 : null;
        } else {
            return arg2.field6623[arg0];
        }
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(I)I")
    public final int method357(int arg0) {
        field641++;
        if (arg0 != -1) {
            field646 = -91;
        }
        return this.field648;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIIIIILrl;IIII)Z")
    public static final boolean method358(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class685 arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg4 != -1) {
            method358(-64, 32, -122, 14, 32, 101, 21, null, 76, 7, 95, 53);
        }
        field640++;
        int var12 = arg9;
        int var13 = arg1;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg9 - var14;
        class673.field9171[var14][var15] = 99;
        int var17 = arg1 - var15;
        class293.field3824[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class36.field540[var18] = arg9;
        int var35 = var18 + 1;
        class635.field8803[var18] = arg1;
        int[][] var20 = arg7.field9700;
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
                                    class197.field2538 = var12;
                                    class570.field7944 = var13;
                                    return false;
                                }
                                var12 = class36.field540[var19];
                                var13 = class635.field8803[var19];
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - arg7.field9685;
                                var24 = var13 - arg7.field9679;
                                if (arg2 == -4) {
                                    if (arg8 == var12 && arg6 == var13) {
                                        class197.field2538 = var12;
                                        class570.field7944 = var13;
                                        return true;
                                    }
                                } else if (arg2 == -3) {
                                    if (class406.method2409((byte) -116, arg0, var12, arg11, arg3, arg8, arg6, arg3, var13)) {
                                        class197.field2538 = var12;
                                        class570.field7944 = var13;
                                        return true;
                                    }
                                } else if (arg2 == -2) {
                                    if (arg7.method3797(arg3, arg11, arg6, var13, arg0, arg3, arg10, arg8, (byte) 121, var12)) {
                                        class197.field2538 = var12;
                                        class570.field7944 = var13;
                                        return true;
                                    }
                                } else if (arg2 == -1) {
                                    if (arg7.method3802(arg8, var12, true, arg0, arg10, arg6, arg3, arg11, var13)) {
                                        class197.field2538 = var12;
                                        class570.field7944 = var13;
                                        return true;
                                    }
                                } else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
                                    if (arg7.method3808(var13, arg3, arg4 - 34, arg8, arg2, arg5, var12, arg6)) {
                                        class197.field2538 = var12;
                                        class570.field7944 = var13;
                                        return true;
                                    }
                                } else if (arg7.method3801(var13, arg8, arg2, arg3, arg5, arg6, var12, (byte) 122)) {
                                    class197.field2538 = var12;
                                    class570.field7944 = var13;
                                    return true;
                                }
                                var26 = class293.field3824[var22][var21] + 1;
                                if (var22 > 0 && class673.field9171[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg3 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= (arg3 - 1)) {
                                            class36.field540[var35] = var12 - 1;
                                            class635.field8803[var35] = var13;
                                            class673.field9171[var22 - 1][var21] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class293.field3824[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if ((128 - arg3) > var22 && class673.field9171[var22 + 1][var21] == 0 && (var20[var23 + arg3][var24] & 0x60E40000) == 0 && (var20[var23 + arg3][var24 + arg3 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= (arg3 - 1)) {
                                            class36.field540[var35] = var12 + 1;
                                            class635.field8803[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class673.field9171[var22 + 1][var21] = 8;
                                            class293.field3824[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg3][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class673.field9171[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg3 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (arg3 - 1 <= var29) {
                                            class36.field540[var35] = var12;
                                            class635.field8803[var35] = var13 - 1;
                                            class673.field9171[var22][var21 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class293.field3824[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if ((128 - arg3) > var21 && class673.field9171[var22][var21 + 1] == 0 && (var20[var23][arg3 + var24] & 0x4E240000) == 0 && (var20[var23 + arg3 - 1][arg3 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (arg3 - 1 <= var30) {
                                            class36.field540[var35] = var12;
                                            class635.field8803[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class673.field9171[var22][var21 + 1] = 4;
                                            class293.field3824[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg3 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class673.field9171[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg3) {
                                            class36.field540[var35] = var12 - 1;
                                            class635.field8803[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class673.field9171[var22 - 1][var21 - 1] = 3;
                                            class293.field3824[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var22 < 128 - arg3 && var21 > 0 && class673.field9171[var22 + 1][var21 - 1] == 0 && (var20[arg3 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg3) {
                                            class36.field540[var35] = var12 + 1;
                                            class635.field8803[var35] = var13 - 1;
                                            class673.field9171[var22 + 1][var21 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class293.field3824[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg3 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && (128 - arg3) > var21 && class673.field9171[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][var24 + arg3] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg3; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][var24 + arg3] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class36.field540[var35] = var12 - 1;
                                    class635.field8803[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class673.field9171[var22 - 1][var21 + 1] = 6;
                                    class293.field3824[var22 - 1][var21 + 1] = var26;
                                }
                            } while (128 - arg3 <= var22);
                        } while (var21 >= 128 - arg3);
                    } while (class673.field9171[var22 + 1][var21 + 1] != 0);
                } while ((var20[arg3 + var23][arg3 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg3; var34++) {
                    if ((var20[var23 + var34][arg3 + var24] & 0x7E240000) != 0 || (var20[var23 + arg3][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class36.field540[var35] = var12 + 1;
                class635.field8803[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class673.field9171[var22 + 1][var21 + 1] = 12;
                class293.field3824[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(B)I")
    public final int method359(byte arg0) {
        field653++;
        int var2 = 125 % ((21 - arg0) / 49);
        return this.field645;
    }

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "(I)Z")
    public final boolean method360(int arg0) {
        if (arg0 != -5531) {
            method354(52);
        }
        field644++;
        return this.field652;
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(ZIIZ)V")
    public class42(boolean arg0, int arg1, int arg2, boolean arg3) {
        this.field645 = arg2;
        this.field648 = arg1;
        this.field652 = arg0;
        this.field651 = arg3;
    }
}
