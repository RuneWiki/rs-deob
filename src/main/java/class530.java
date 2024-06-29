import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public abstract class class530 {

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "Lvj;")
    public static class304 field7812;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "Lvj;")
    public static class304 field7814;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
    public static int field7809;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
    public static int field7810;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
    public static int field7811;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILs;)Ls;")
    public abstract class183 method1454(int arg0, class183 arg1);

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
    public static void method3117(int arg0) {
        field7814 = null;
        if (arg0 > -65) {
            method3117(28);
        }
        field7812 = null;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 1) {
            field7812 = null;
        }
        if (class308.field4055 <= arg4 && arg5 <= class71.field1077 && class353.field4777 <= arg2 && class300.field3971 >= arg0) {
            if (arg1 == 1) {
                class62.method433(arg0, arg5, (byte) 56, arg4, arg6, arg2);
            } else {
                class359.method2095(arg4, arg3 + 92, arg0, arg1, arg5, arg2, arg6);
            }
        } else if (arg1 == 1) {
            class321.method1847(arg2, -69, arg0, arg5, arg6, arg4);
        } else {
            class231.method1442(0, arg6, arg4, arg1, arg0, arg5, arg2);
        }
        field7809++;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lbo;ILjava/lang/String;Z)Lbm;")
    public static final class74 method3119(class511 arg0, int arg1, String arg2, boolean arg3) {
        field7810++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg1, var4);
        if (arg3) {
            field7814 = null;
        }
        OpenGL.glProgramStringARB(arg1, 34933, arg2);
        OpenGL.glGetIntegerv(34379, class281.field3697, 0);
        if (class281.field3697[0] == -1) {
            OpenGL.glBindProgramARB(arg1, 0);
            return new class74(arg0, arg1, var4);
        } else {
            OpenGL.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILcl;IIIIIIIIII)Z")
    public static final boolean method3120(int arg0, class173 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field7811++;
        int var12 = arg6;
        int var13 = arg3;
        byte var14 = 64;
        byte var15 = 64;
        if (arg5 < 88) {
            field7812 = null;
        }
        int var16 = arg6 - var14;
        int var17 = arg3 - var15;
        class430.field5885[var14][var15] = 99;
        class494.field6867[var14][var15] = 0;
        byte var18 = 0;
        class153.field2210[var18] = arg6;
        int var19 = 0;
        int var35 = var18 + 1;
        class71.field1066[var18] = arg3;
        int[][] var20 = arg1.field2519;
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
                                    class212.field2888 = var13;
                                    class296.field3878 = var12;
                                    return false;
                                }
                                var13 = class71.field1066[var19];
                                var12 = class153.field2210[var19];
                                var19 = var19 + 1 & 0xFFF;
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var23 = var12 - arg1.field2512;
                                var24 = var13 - arg1.field2522;
                                if (arg8 == -4) {
                                    if (arg4 == var12 && arg11 == var13) {
                                        class212.field2888 = var13;
                                        class296.field3878 = var12;
                                        return true;
                                    }
                                } else if (arg8 == -3) {
                                    if (class201.method1289(arg2, arg0, true, arg7, arg4, arg11, arg2, var12, var13)) {
                                        class296.field3878 = var12;
                                        class212.field2888 = var13;
                                        return true;
                                    }
                                } else if (arg8 == -2) {
                                    if (arg1.method1151(arg2, arg4, arg7, arg0, arg9, var12, var13, arg11, -65537, arg2)) {
                                        class212.field2888 = var13;
                                        class296.field3878 = var12;
                                        return true;
                                    }
                                } else if (arg8 == -1) {
                                    if (arg1.method1152(-86, var12, arg7, arg9, var13, arg2, arg4, arg0, arg11)) {
                                        class212.field2888 = var13;
                                        class296.field3878 = var12;
                                        return true;
                                    }
                                } else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
                                    if (arg1.method1154(arg4, var12, arg11, arg8, (byte) 58, var13, arg2, arg10)) {
                                        class296.field3878 = var12;
                                        class212.field2888 = var13;
                                        return true;
                                    }
                                } else if (arg1.method1150(var12, arg11, var13, arg8, arg2, arg4, -24128, arg10)) {
                                    class296.field3878 = var12;
                                    class212.field2888 = var13;
                                    return true;
                                }
                                var26 = class494.field6867[var22][var21] + 1;
                                if (var22 > 0 && class430.field5885[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 - (1 - arg2)] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= arg2 - 1) {
                                            class153.field2210[var35] = var12 - 1;
                                            class71.field1066[var35] = var13;
                                            class430.field5885[var22 - 1][var21] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class494.field6867[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if ((128 - arg2) > var22 && class430.field5885[var22 + 1][var21] == 0 && (var20[arg2 + var23][var24] & 0x60E40000) == 0 && (var20[var23 + arg2][var24 + arg2 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= arg2 - 1) {
                                            class153.field2210[var35] = var12 + 1;
                                            class71.field1066[var35] = var13;
                                            class430.field5885[var22 + 1][var21] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class494.field6867[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[arg2 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class430.field5885[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg2 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if ((arg2 - 1) <= var29) {
                                            class153.field2210[var35] = var12;
                                            class71.field1066[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class430.field5885[var22][var21 - 1] = 1;
                                            class494.field6867[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (128 - arg2 > var21 && class430.field5885[var22][var21 + 1] == 0 && (var20[var23][arg2 + var24] & 0x4E240000) == 0 && (var20[arg2 + var23 - 1][arg2 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg2 - 1)) {
                                            class153.field2210[var35] = var12;
                                            class71.field1066[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class430.field5885[var22][var21 + 1] = 4;
                                            class494.field6867[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg2 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class430.field5885[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg2 <= var31) {
                                            class153.field2210[var35] = var12 - 1;
                                            class71.field1066[var35] = var13 - 1;
                                            class430.field5885[var22 - 1][var21 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class494.field6867[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 - (1 - var31)] & 0x4FA40000) != 0 || (var20[var31 + var23 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var22 < (128 - arg2) && var21 > 0 && class430.field5885[var22 + 1][var21 - 1] == 0 && (var20[arg2 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg2) {
                                            class153.field2210[var35] = var12 + 1;
                                            class71.field1066[var35] = var13 - 1;
                                            class430.field5885[var22 + 1][var21 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class494.field6867[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg2 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && var21 < 128 - arg2 && class430.field5885[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][arg2 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg2; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg2 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class153.field2210[var35] = var12 - 1;
                                    class71.field1066[var35] = var13 + 1;
                                    class430.field5885[var22 - 1][var21 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class494.field6867[var22 - 1][var21 + 1] = var26;
                                }
                            } while (var22 >= (128 - arg2));
                        } while (var21 >= 128 - arg2);
                    } while (class430.field5885[var22 + 1][var21 + 1] != 0);
                } while ((var20[var23 + arg2][arg2 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg2; var34++) {
                    if ((var20[var23 + var34][var24 + arg2] & 0x7E240000) != 0 || (var20[arg2 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class153.field2210[var35] = var12 + 1;
                class71.field1066[var35] = var13 + 1;
                class430.field5885[var22 + 1][var21 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class494.field6867[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    static {
        new class304("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field7812 = new class304("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");
        field7814 = new class304("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");
    }
}
