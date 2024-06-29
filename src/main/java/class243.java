import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class243 {

    @OriginalMember(owner = "client!un", name = "k", descriptor = "[Lfa;")
    public static class128[] field3596 = new class128[2048];

    @OriginalMember(owner = "client!un", name = "p", descriptor = "Llm;")
    public static class291 field3601;

    @OriginalMember(owner = "client!un", name = "s", descriptor = "Lub;")
    public static class15 field3604;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public int field3590;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    public int field3594;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "I")
    public int field3595;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "I")
    public int field3597;

    @OriginalMember(owner = "client!un", name = "m", descriptor = "I")
    public int field3598;

    @OriginalMember(owner = "client!un", name = "n", descriptor = "I")
    public int field3599;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "I")
    public int field3600;

    @OriginalMember(owner = "client!un", name = "r", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!un", name = "q", descriptor = "Ltj;")
    public static class108 field3602;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "Lwe;")
    public static class233 field3587;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "[B")
    public byte[] field3588;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "[B")
    public byte[] field3592;

    static {
        new class349("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        field3601 = new class291(128);
        field3604 = new class15(4);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIII)I", line = 4)
    public static final int method1656(int arg0, int arg1, int arg2, int arg3) {
        field3593++;
        int var4 = arg2 & 0x3;
        if (arg0 < 8) {
            field3596 = null;
        }
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIIIBIIILqr;I)Z", line = 31)
    public static final boolean method1657(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, class41 arg10, int arg11) {
        field3591++;
        int var12 = arg9;
        if (arg6 >= -124) {
            return true;
        }
        int var13 = arg1;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg9 - var14;
        class87.field1132[var14][var15] = 99;
        int var17 = arg1 - var15;
        class399.field5612[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class287.field4187[var18] = arg9;
        int var35 = var18 + 1;
        class451.field6468[var18] = arg1;
        int[][] var20 = arg10.field572;
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
                                    class88.field1154 = var12;
                                    class418.field6003 = var13;
                                    return false;
                                }
                                var13 = class451.field6468[var19];
                                var12 = class287.field4187[var19];
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - arg10.field565;
                                var24 = var13 - arg10.field570;
                                if (arg7 == -4) {
                                    if (arg3 == var12 && arg0 == var13) {
                                        class88.field1154 = var12;
                                        class418.field6003 = var13;
                                        return true;
                                    }
                                } else if (arg7 == -3) {
                                    if (class253.method1763(arg5, arg11, arg3, arg11, arg8, arg0, var13, (byte) -74, var12)) {
                                        class88.field1154 = var12;
                                        class418.field6003 = var13;
                                        return true;
                                    }
                                } else if (arg7 == -2) {
                                    if (arg10.method270(0, arg4, arg8, arg5, arg11, arg3, arg11, var13, var12, arg0)) {
                                        class418.field6003 = var13;
                                        class88.field1154 = var12;
                                        return true;
                                    }
                                } else if (arg7 == -1) {
                                    if (arg10.method271(arg4, (byte) -66, var13, arg5, arg0, arg3, var12, arg11, arg8)) {
                                        class418.field6003 = var13;
                                        class88.field1154 = var12;
                                        return true;
                                    }
                                } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                                    if (arg10.method269(arg2, arg0, arg7, -3, var13, arg3, var12, arg11)) {
                                        class418.field6003 = var13;
                                        class88.field1154 = var12;
                                        return true;
                                    }
                                } else if (arg10.method283(arg7, false, var13, arg2, arg3, arg11, arg0, var12)) {
                                    class88.field1154 = var12;
                                    class418.field6003 = var13;
                                    return true;
                                }
                                var26 = class399.field5612[var22][var21] + 1;
                                if (var22 > 0 && class87.field1132[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + arg11 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= arg11 - 1) {
                                            class287.field4187[var35] = var12 - 1;
                                            class451.field6468[var35] = var13;
                                            class87.field1132[var22 - 1][var21] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class399.field5612[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if ((128 - arg11) > var22 && class87.field1132[var22 + 1][var21] == 0 && (var20[arg11 + var23][var24] & 0x60E40000) == 0 && (var20[var23 + arg11][var24 - (1 - arg11)] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if ((arg11 - 1) <= var28) {
                                            class287.field4187[var35] = var12 + 1;
                                            class451.field6468[var35] = var13;
                                            class87.field1132[var22 + 1][var21] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class399.field5612[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[arg11 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class87.field1132[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg11 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (arg11 - 1 <= var29) {
                                            class287.field4187[var35] = var12;
                                            class451.field6468[var35] = var13 - 1;
                                            class87.field1132[var22][var21 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class399.field5612[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var21 < (128 - arg11) && class87.field1132[var22][var21 + 1] == 0 && (var20[var23][arg11 + var24] & 0x4E240000) == 0 && (var20[var23 + arg11 - 1][arg11 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg11 - 1)) {
                                            class287.field4187[var35] = var12;
                                            class451.field6468[var35] = var13 + 1;
                                            class87.field1132[var22][var21 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class399.field5612[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][var24 + arg11] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class87.field1132[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg11 <= var31) {
                                            class287.field4187[var35] = var12 - 1;
                                            class451.field6468[var35] = var13 - 1;
                                            class87.field1132[var22 - 1][var21 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class399.field5612[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var31 + var24 - 1] & 0x4FA40000) != 0 || (var20[var31 + var23 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var22 < (128 - arg11) && var21 > 0 && class87.field1132[var22 + 1][var21 - 1] == 0 && (var20[arg11 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg11) {
                                            class287.field4187[var35] = var12 + 1;
                                            class451.field6468[var35] = var13 - 1;
                                            class87.field1132[var22 + 1][var21 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class399.field5612[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg11 + var23][var32 + var24 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && var21 < (128 - arg11) && class87.field1132[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][var24 + arg11] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg11; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg11 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class287.field4187[var35] = var12 - 1;
                                    class451.field6468[var35] = var13 + 1;
                                    class87.field1132[var22 - 1][var21 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class399.field5612[var22 - 1][var21 + 1] = var26;
                                }
                            } while ((128 - arg11) <= var22);
                        } while (128 - arg11 <= var21);
                    } while (class87.field1132[var22 + 1][var21 + 1] != 0);
                } while ((var20[arg11 + var23][arg11 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg11; var34++) {
                    if ((var20[var23 + var34][arg11 + var24] & 0x7E240000) != 0 || (var20[var23 + arg11][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class287.field4187[var35] = var12 + 1;
                class451.field6468[var35] = var13 + 1;
                class87.field1132[var22 + 1][var21 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class399.field5612[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V", line = 473)
    public static final void method1658(int arg0) {
        field3586++;
        class382.field5430 = class228.method1585(4, 2048, arg0, true, 8, 1, 8, 0.4F);
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V", line = 493)
    public static void method1659(int arg0) {
        field3601 = null;
        int var1 = 106 / ((-arg0 - 51) / 61);
        field3596 = null;
        field3604 = null;
        field3602 = null;
        field3587 = null;
    }
}
