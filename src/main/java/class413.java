import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class413 {

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "Lfja;")
    public static class783 field5658 = new class783(120, 0);

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V")
    public static final void method2442(byte arg0) {
        class431.field5870 = new class17[class724.field9956.method3723(5)][];
        field5656++;
        if (arg0 != 74) {
            method2444(-16);
        }
        class79.field1113 = new class17[class724.field9956.method3723(5)][];
        class157.field2548 = new boolean[class724.field9956.method3723(arg0 ^ 0x4F)];
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIIBIILjo;III)Z")
    public static final boolean method2443(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, class355 arg8, int arg9, int arg10, int arg11) {
        field5657++;
        int var12 = arg4;
        int var13 = arg10;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg4 - var14;
        int var17 = arg10 - var15;
        class567.field8018[var14][var15] = 99;
        class388.field5339[var14][var15] = 0;
        byte var18 = 0;
        class428.field5844[var18] = arg4;
        int var19 = 0;
        int var35 = var18 + 1;
        class513.field7012[var18] = arg10;
        int[][] var20 = arg8.field4830;
        if (arg5 < 47) {
            method2443(47, 3, -34, 12, -23, (byte) 124, -41, -38, null, 36, 54, 81);
        }
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
                                    class471.field6398 = var13;
                                    class640.field8803 = var12;
                                    return false;
                                }
                                var13 = class513.field7012[var19];
                                var12 = class428.field5844[var19];
                                var21 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var22 = var13 - var17;
                                var23 = var12 - arg8.field4843;
                                var24 = var13 - arg8.field4841;
                                if (arg0 == -4) {
                                    if (arg9 == var12 && arg7 == var13) {
                                        class471.field6398 = var13;
                                        class640.field8803 = var12;
                                        return true;
                                    }
                                } else if (arg0 == -3) {
                                    if (class28.method183(arg11, arg9, arg7, var12, arg2, var13, -1803607479, arg6, arg2)) {
                                        class640.field8803 = var12;
                                        class471.field6398 = var13;
                                        return true;
                                    }
                                } else if (arg0 == -2) {
                                    if (arg8.method2195(arg9, var13, arg2, var12, arg3, 8, arg6, arg7, arg2, arg11)) {
                                        class471.field6398 = var13;
                                        class640.field8803 = var12;
                                        return true;
                                    }
                                } else if (arg0 == -1) {
                                    if (arg8.method2190(var13, arg11, arg7, arg6, arg3, arg9, arg2, false, var12)) {
                                        class471.field6398 = var13;
                                        class640.field8803 = var12;
                                        return true;
                                    }
                                } else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
                                    if (arg8.method2186(arg0, arg2, 5282, var13, arg7, arg9, arg1, var12)) {
                                        class640.field8803 = var12;
                                        class471.field6398 = var13;
                                        return true;
                                    }
                                } else if (arg8.method2193(var12, arg0, arg2, arg9, arg1, var13, -1, arg7)) {
                                    class471.field6398 = var13;
                                    class640.field8803 = var12;
                                    return true;
                                }
                                var26 = class388.field5339[var21][var22] + 1;
                                if (var21 > 0 && class567.field8018[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg2 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if ((arg2 - 1) <= var27) {
                                            class428.field5844[var35] = var12 - 1;
                                            class513.field7012[var35] = var13;
                                            class567.field8018[var21 - 1][var22] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class388.field5339[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var21 < 128 - arg2 && class567.field8018[var21 + 1][var22] == 0 && (var20[arg2 + var23][var24] & 0x60E40000) == 0 && (var20[arg2 + var23][var24 + arg2 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if ((arg2 - 1) <= var28) {
                                            class428.field5844[var35] = var12 + 1;
                                            class513.field7012[var35] = var13;
                                            class567.field8018[var21 + 1][var22] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class388.field5339[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[arg2 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class567.field8018[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg2 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg2 - 1) {
                                            class428.field5844[var35] = var12;
                                            class513.field7012[var35] = var13 - 1;
                                            class567.field8018[var21][var22 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class388.field5339[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var22 < 128 - arg2 && class567.field8018[var21][var22 + 1] == 0 && (var20[var23][arg2 + var24] & 0x4E240000) == 0 && (var20[var23 + arg2 - 1][var24 + arg2] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= arg2 - 1) {
                                            class428.field5844[var35] = var12;
                                            class513.field7012[var35] = var13 + 1;
                                            class567.field8018[var21][var22 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class388.field5339[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg2 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class567.field8018[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg2 <= var31) {
                                            class428.field5844[var35] = var12 - 1;
                                            class513.field7012[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class567.field8018[var21 - 1][var22 - 1] = 3;
                                            class388.field5339[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (128 - arg2 > var21 && var22 > 0 && class567.field8018[var21 + 1][var22 - 1] == 0 && (var20[var23 + arg2][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg2) {
                                            class428.field5844[var35] = var12 + 1;
                                            class513.field7012[var35] = var13 - 1;
                                            class567.field8018[var21 + 1][var22 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class388.field5339[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg2 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && (128 - arg2) > var22 && class567.field8018[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][arg2 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg2; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg2 + var24] & 0x7E240000) != 0) {
                                            continue label261;
                                        }
                                    }
                                    class428.field5844[var35] = var12 - 1;
                                    class513.field7012[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class567.field8018[var21 - 1][var22 + 1] = 6;
                                    class388.field5339[var21 - 1][var22 + 1] = var26;
                                }
                            } while (var21 >= (128 - arg2));
                        } while (var22 >= 128 - arg2);
                    } while (class567.field8018[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg2 + var23][arg2 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg2; var34++) {
                    if ((var20[var23 + var34][arg2 + var24] & 0x7E240000) != 0 || (var20[arg2 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label284;
                    }
                }
                class428.field5844[var35] = var12 + 1;
                class513.field7012[var35] = var13 + 1;
                class567.field8018[var21 + 1][var22 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class388.field5339[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V")
    public static void method2444(int arg0) {
        if (arg0 <= 119) {
            method2444(-35);
        }
        field5658 = null;
    }
}
