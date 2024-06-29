import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class450 extends class35 {

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "Lct;")
    public static class285 field6351 = new class285(30, 8);

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public int field6353;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public int field6356;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "[I")
    public int[] field6357;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "[I")
    public int[] field6364;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "[I")
    public int[] field6365;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "[Liu;")
    public class397[] field6352;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "[Liu;")
    public class397[] field6361;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "[Z")
    public static boolean[] field6362;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "[[[B")
    public byte[][][] field6354;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZIIII)V")
    public static final void method2651(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        class310.field4693 = arg3;
        class77.field1089 = arg4;
        class2.field42 = arg0;
        field6358++;
        class88.field1243 = arg1;
        if (arg5 != -15415) {
            return;
        }
        class486.field6835 = arg6;
        if (arg2 && class310.field4693 >= 100) {
            class200.field3027 = class77.field1089 * 128 + 64;
            class68.field920 = class2.field42 * 128 + 64;
            class344.field5191 = class25.method219(48602855, class486.field6836, class200.field3027, class68.field920) - class88.field1243;
        }
        class469.field6596 = 2;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lng;Ljava/lang/Object;I)V")
    public static final void method2652(class153 arg0, Object arg1, int arg2) {
        field6359++;
        if (arg0.field2128 == null) {
            return;
        }
        if (arg2 != 50) {
            field6351 = null;
        }
        for (int var3 = 0; var3 < 50 && arg0.field2128.peekEvent() != null; var3++) {
            class325.method2005(true, 1L);
        }
        if (arg1 != null) {
            arg0.field2128.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)V")
    public static void method2653(int arg0) {
        int var1 = -50 / ((55 - arg0) / 49);
        field6362 = null;
        field6351 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method2654(String[] arg0, byte arg1) {
        field6366++;
        String[] var2 = new String[5];
        int var3 = 0;
        if (arg1 <= 25) {
            method2654((String[]) null, (byte) 60);
        }
        while (var3 < 5) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILtf;IIIIIIIII)Z")
    public static final boolean method2655(int arg0, int arg1, class491 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field6363++;
        int var12 = arg8;
        int var13 = arg9;
        byte var14 = 64;
        if (arg10 != 1) {
            field6355 = -28;
        }
        byte var15 = 64;
        int var16 = arg8 - var14;
        int var17 = arg9 - var15;
        class401.field5859[var14][var15] = 99;
        class309.field4648[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class398.field5832[var18] = arg8;
        int var35 = var18 + 1;
        class40.field562[var18] = arg9;
        int[][] var20 = arg2.field6890;
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
                                    class270.field4001 = var12;
                                    class379.field5639 = var13;
                                    return false;
                                }
                                var12 = class398.field5832[var19];
                                var13 = class40.field562[var19];
                                var21 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var22 = var13 - var17;
                                var23 = var12 - arg2.field6898;
                                var24 = var13 - arg2.field6904;
                                if (arg7 == -4) {
                                    if (arg1 == var12 && arg5 == var13) {
                                        class379.field5639 = var13;
                                        class270.field4001 = var12;
                                        return true;
                                    }
                                } else if (arg7 == -3) {
                                    if (class146.method992(arg3, arg4, arg1, arg4, var12, var13, arg5, arg11, false)) {
                                        class270.field4001 = var12;
                                        class379.field5639 = var13;
                                        return true;
                                    }
                                } else if (arg7 == -2) {
                                    if (arg2.method2876(arg11, arg4, var12, arg4, var13, arg5, (byte) -38, arg0, arg3, arg1)) {
                                        class379.field5639 = var13;
                                        class270.field4001 = var12;
                                        return true;
                                    }
                                } else if (arg7 == -1) {
                                    if (arg2.method2874(arg11, arg0, arg3, arg1, var12, arg5, var13, arg4, -25971)) {
                                        class270.field4001 = var12;
                                        class379.field5639 = var13;
                                        return true;
                                    }
                                } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                                    if (arg2.method2866(arg1, arg5, arg7, arg6, var13, 2883848, var12, arg4)) {
                                        class270.field4001 = var12;
                                        class379.field5639 = var13;
                                        return true;
                                    }
                                } else if (arg2.method2861(arg1, arg10 ^ 0x65A4, arg4, arg7, var13, arg5, var12, arg6)) {
                                    class270.field4001 = var12;
                                    class379.field5639 = var13;
                                    return true;
                                }
                                var26 = class309.field4648[var21][var22] + 1;
                                if (var21 > 0 && class401.field5859[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + arg4 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if ((arg4 - 1) <= var27) {
                                            class398.field5832[var35] = var12 - 1;
                                            class40.field562[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class401.field5859[var21 - 1][var22] = 2;
                                            class309.field4648[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (128 - arg4 > var21 && class401.field5859[var21 + 1][var22] == 0 && (var20[var23 + arg4][var24] & 0x60E40000) == 0 && (var20[arg4 + var23][arg4 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= (arg4 - 1)) {
                                            class398.field5832[var35] = var12 + 1;
                                            class40.field562[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class401.field5859[var21 + 1][var22] = 8;
                                            class309.field4648[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[arg4 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class401.field5859[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg4 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= (arg4 - 1)) {
                                            class398.field5832[var35] = var12;
                                            class40.field562[var35] = var13 - 1;
                                            class401.field5859[var21][var22 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class309.field4648[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var22 < (128 - arg4) && class401.field5859[var21][var22 + 1] == 0 && (var20[var23][arg4 + var24] & 0x4E240000) == 0 && (var20[arg4 + var23 - 1][arg4 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if ((arg4 - 1) <= var30) {
                                            class398.field5832[var35] = var12;
                                            class40.field562[var35] = var13 + 1;
                                            class401.field5859[var21][var22 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class309.field4648[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg4 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class401.field5859[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg4 <= var31) {
                                            class398.field5832[var35] = var12 - 1;
                                            class40.field562[var35] = var13 - 1;
                                            class401.field5859[var21 - 1][var22 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class309.field4648[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var31 + var24 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var21 < 128 - arg4 && var22 > 0 && class401.field5859[var21 + 1][var22 - 1] == 0 && (var20[arg4 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg4) {
                                            class398.field5832[var35] = var12 + 1;
                                            class40.field562[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class401.field5859[var21 + 1][var22 - 1] = 9;
                                            class309.field4648[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg4 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && 128 - arg4 > var22 && class401.field5859[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][arg4 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg4; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 - (1 - var33)][arg4 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class398.field5832[var35] = var12 - 1;
                                    class40.field562[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class401.field5859[var21 - 1][var22 + 1] = 6;
                                    class309.field4648[var21 - 1][var22 + 1] = var26;
                                }
                            } while (var21 >= 128 - arg4);
                        } while (var22 >= 128 - arg4);
                    } while (class401.field5859[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg4 + var23][arg4 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg4; var34++) {
                    if ((var20[var23 + var34][arg4 + var24] & 0x7E240000) != 0 || (var20[arg4 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class398.field5832[var35] = var12 + 1;
                class40.field562[var35] = var13 + 1;
                class401.field5859[var21 + 1][var22 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class309.field4648[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)Z")
    public static final boolean method2656(int arg0, int arg1) {
        field6360++;
        if (arg1 == 2 || arg1 == 12 || arg1 == 17 || arg1 == 9 || arg1 == 1002) {
            return true;
        } else if (arg1 == 59 || arg1 == 1008) {
            return true;
        } else {
            if (arg0 != 1008) {
                field6362 = null;
            }
            return false;
        }
    }
}
