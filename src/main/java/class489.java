import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class489 extends class86 {

    @OriginalMember(owner = "client!cp", name = "C", descriptor = "I")
    public int field7487;

    @OriginalMember(owner = "client!cp", name = "x", descriptor = "I")
    public int field7482;

    @OriginalMember(owner = "client!cp", name = "o", descriptor = "Lwt;")
    public static class194 field7473 = new class194("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!cp", name = "F", descriptor = "[I")
    public static int[] field7490;

    @OriginalMember(owner = "client!cp", name = "D", descriptor = "Lwt;")
    public static class194 field7488;

    @OriginalMember(owner = "client!cp", name = "p", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!cp", name = "q", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!cp", name = "r", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!cp", name = "s", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!cp", name = "t", descriptor = "I")
    public static int field7478;

    @OriginalMember(owner = "client!cp", name = "u", descriptor = "I")
    public static int field7479;

    @OriginalMember(owner = "client!cp", name = "v", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!cp", name = "w", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!cp", name = "y", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!cp", name = "A", descriptor = "I")
    public static int field7485;

    @OriginalMember(owner = "client!cp", name = "B", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!cp", name = "E", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!cp", name = "z", descriptor = "Lot;")
    public static class399 field7484;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)I")
    public final int method2933(int arg0) {
        field7483++;
        if (arg0 != 2015625216) {
            field7488 = null;
        }
        return class444.method2593(this.field7487, arg0 ^ 0x7824007E);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZI)V")
    public static final void method2934(int arg0, boolean arg1, int arg2) {
        field7474++;
        int var3 = class482.field6989.method3055(7748, class226.field3194.method1220(2969, class81.field1122));
        for (class262 var4 = (class262) class230.field3220.method2096(-21400); var4 != null; var4 = (class262) class230.field3220.method2084((byte) 19)) {
            int var8 = class190.method1195((byte) -120, var4);
            if (var8 > var3) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class383.field5696 * 16 + 21;
        int var6 = arg0 - (var3 / 2);
        if ((var3 + var6) > class223.field3156) {
            var6 = class223.field3156 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg2;
        if ((var5 + arg2) > class207.field2874) {
            var7 = class207.field2874 - var5;
        }
        class214.field3022 = var6;
        if (var7 < 0) {
            var7 = 0;
        }
        class414.field6141 = (class500.field7650 ? 26 : 22) + class383.field5696 * 16;
        class125.field1614 = var3;
        class64.field940 = var7;
        class174.field2387 = arg1;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IB)Z")
    public final boolean method2935(int arg0, byte arg1) {
        field7481++;
        if (arg1 < 116) {
            method2945(119);
        }
        return (this.field7487 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "(B)V")
    public static void method2936(byte arg0) {
        if (arg0 != 91) {
            field7488 = null;
        }
        field7484 = null;
        field7490 = null;
        field7473 = null;
        field7488 = null;
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)Z")
    public final boolean method2937(int arg0) {
        if (arg0 != 2) {
            field7473 = null;
        }
        field7475++;
        return (this.field7487 & 0x51C7C1) >> 22 != 0;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIIILqo;IIIII)Z")
    public static final boolean method2938(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class19 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field7476++;
        int var12 = arg10;
        int var13 = arg3;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg10 - var14;
        int var17 = arg3 - var15;
        class409.field6004[var14][var15] = 99;
        class379.field5659[var14][var15] = 0;
        byte var18 = 0;
        class501.field7658[var18] = arg10;
        int var19 = 0;
        int var20 = 67 % ((-arg11 - 83) / 39);
        int var36 = var18 + 1;
        class71.field1051[var18] = arg3;
        int[][] var21 = arg6.field275;
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
                                if (var36 == var19) {
                                    class488.field7462 = var13;
                                    class505.field7711 = var12;
                                    return false;
                                }
                                var12 = class501.field7658[var19];
                                var13 = class71.field1051[var19];
                                var22 = var13 - var17;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - var16;
                                var24 = var12 - arg6.field259;
                                var25 = var13 - arg6.field258;
                                if (arg1 == -4) {
                                    if (arg7 == var12 && arg9 == var13) {
                                        class488.field7462 = var13;
                                        class505.field7711 = var12;
                                        return true;
                                    }
                                } else if (arg1 == -3) {
                                    if (class222.method1373(arg4, arg9, arg7, var13, 0, arg2, var12, arg5, arg2)) {
                                        class488.field7462 = var13;
                                        class505.field7711 = var12;
                                        return true;
                                    }
                                } else if (arg1 == -2) {
                                    if (arg6.method136(true, var12, arg4, arg5, arg2, arg0, var13, arg7, arg9, arg2)) {
                                        class505.field7711 = var12;
                                        class488.field7462 = var13;
                                        return true;
                                    }
                                } else if (arg1 == -1) {
                                    if (arg6.method128(arg2, arg7, arg4, arg9, var13, arg5, arg0, (byte) -109, var12)) {
                                        class505.field7711 = var12;
                                        class488.field7462 = var13;
                                        return true;
                                    }
                                } else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
                                    if (arg6.method129(var12, arg8, arg2, arg1, arg7, arg9, var13, (byte) -66)) {
                                        class488.field7462 = var13;
                                        class505.field7711 = var12;
                                        return true;
                                    }
                                } else if (arg6.method137((byte) -105, arg1, arg2, arg7, arg8, arg9, var13, var12)) {
                                    class505.field7711 = var12;
                                    class488.field7462 = var13;
                                    return true;
                                }
                                var27 = class379.field5659[var23][var22] + 1;
                                if (var23 > 0 && class409.field6004[var23 - 1][var22] == 0 && (var21[var24 - 1][var25] & 0x43A40000) == 0 && (var21[var24 - 1][arg2 + var25 - 1] & 0x4E240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if ((arg2 - 1) <= var28) {
                                            class501.field7658[var36] = var12 - 1;
                                            class71.field1051[var36] = var13;
                                            class409.field6004[var23 - 1][var22] = 2;
                                            var36 = var36 + 1 & 0xFFF;
                                            class379.field5659[var23 - 1][var22] = var27;
                                            break;
                                        }
                                        if ((var21[var24 - 1][var25 + var28] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (128 - arg2 > var23 && class409.field6004[var23 + 1][var22] == 0 && (var21[arg2 + var24][var25] & 0x60E40000) == 0 && (var21[arg2 + var24][var25 + arg2 - 1] & 0x78240000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg2 - 1) {
                                            class501.field7658[var36] = var12 + 1;
                                            class71.field1051[var36] = var13;
                                            class409.field6004[var23 + 1][var22] = 8;
                                            var36 = var36 + 1 & 0xFFF;
                                            class379.field5659[var23 + 1][var22] = var27;
                                            break;
                                        }
                                        if ((var21[arg2 + var24][var25 + var29] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var22 > 0 && class409.field6004[var23][var22 - 1] == 0 && (var21[var24][var25 - 1] & 0x43A40000) == 0 && (var21[arg2 + var24 - 1][var25 - 1] & 0x60E40000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg2 - 1)) {
                                            class501.field7658[var36] = var12;
                                            class71.field1051[var36] = var13 - 1;
                                            class409.field6004[var23][var22 - 1] = 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class379.field5659[var23][var22 - 1] = var27;
                                            break;
                                        }
                                        if ((var21[var24 + var30][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 < (128 - arg2) && class409.field6004[var23][var22 + 1] == 0 && (var21[var24][arg2 + var25] & 0x4E240000) == 0 && (var21[arg2 + var24 - 1][arg2 + var25] & 0x78240000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg2 - 1 <= var31) {
                                            class501.field7658[var36] = var12;
                                            class71.field1051[var36] = var13 + 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class409.field6004[var23][var22 + 1] = 4;
                                            class379.field5659[var23][var22 + 1] = var27;
                                            break;
                                        }
                                        if ((var21[var24 + var31][arg2 + var25] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var23 > 0 && var22 > 0 && class409.field6004[var23 - 1][var22 - 1] == 0 && (var21[var24 - 1][var25 - 1] & 0x43A40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg2) {
                                            class501.field7658[var36] = var12 - 1;
                                            class71.field1051[var36] = var13 - 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class409.field6004[var23 - 1][var22 - 1] = 3;
                                            class379.field5659[var23 - 1][var22 - 1] = var27;
                                            break;
                                        }
                                        if ((var21[var24 - 1][var25 - (1 - var32)] & 0x4FA40000) != 0 || (var21[var24 + var32 - 1][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (128 - arg2 > var23 && var22 > 0 && class409.field6004[var23 + 1][var22 - 1] == 0 && (var21[var24 + arg2][var25 - 1] & 0x60E40000) == 0) {
                                    int var33 = 1;
                                    while (true) {
                                        if (arg2 <= var33) {
                                            class501.field7658[var36] = var12 + 1;
                                            class71.field1051[var36] = var13 - 1;
                                            class409.field6004[var23 + 1][var22 - 1] = 9;
                                            var36 = var36 + 1 & 0xFFF;
                                            class379.field5659[var23 + 1][var22 - 1] = var27;
                                            break;
                                        }
                                        if ((var21[arg2 + var24][var25 + var33 - 1] & 0x78E40000) != 0 || (var21[var24 + var33][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var33++;
                                    }
                                }
                                if (var23 > 0 && (128 - arg2) > var22 && class409.field6004[var23 - 1][var22 + 1] == 0 && (var21[var24 - 1][arg2 + var25] & 0x4E240000) == 0) {
                                    for (int var34 = 1; var34 < arg2; var34++) {
                                        if ((var21[var24 - 1][var25 + var34] & 0x4FA40000) != 0 || (var21[var24 + var34 - 1][arg2 + var25] & 0x7E240000) != 0) {
                                            continue label259;
                                        }
                                    }
                                    class501.field7658[var36] = var12 - 1;
                                    class71.field1051[var36] = var13 + 1;
                                    class409.field6004[var23 - 1][var22 + 1] = 6;
                                    var36 = var36 + 1 & 0xFFF;
                                    class379.field5659[var23 - 1][var22 + 1] = var27;
                                }
                            } while (var23 >= (128 - arg2));
                        } while (var22 >= (128 - arg2));
                    } while (class409.field6004[var23 + 1][var22 + 1] != 0);
                } while ((var21[var24 + arg2][arg2 + var25] & 0x78240000) != 0);
                for (int var35 = 1; var35 < arg2; var35++) {
                    if ((var21[var24 + var35][var25 + arg2] & 0x7E240000) != 0 || (var21[arg2 + var24][var25 + var35] & 0x78E40000) != 0) {
                        continue label282;
                    }
                }
                class501.field7658[var36] = var12 + 1;
                class71.field1051[var36] = var13 + 1;
                var36 = var36 + 1 & 0xFFF;
                class409.field6004[var23 + 1][var22 + 1] = 12;
                class379.field5659[var23 + 1][var22 + 1] = var27;
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I[SI[Ljava/lang/String;I)V")
    public static final void method2939(int arg0, short[] arg1, int arg2, String[] arg3, int arg4) {
        field7480++;
        if (arg2 != 26641 || arg4 <= arg0) {
            return;
        }
        int var5 = (arg0 + arg4) / 2;
        int var6 = arg0;
        String var7 = arg3[var5];
        arg3[var5] = arg3[arg4];
        arg3[arg4] = var7;
        short var8 = arg1[var5];
        arg1[var5] = arg1[arg4];
        arg1[arg4] = var8;
        for (int var9 = arg0; var9 < arg4; var9++) {
            if (var7 == null || arg3[var9] != null && (var9 & 0x1) > arg3[var9].compareTo(var7)) {
                String var10 = arg3[var9];
                arg3[var9] = arg3[var6];
                arg3[var6] = var10;
                short var11 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6++] = var11;
            }
        }
        arg3[arg4] = arg3[var6];
        arg3[var6] = var7;
        arg1[arg4] = arg1[var6];
        arg1[var6] = var8;
        method2939(arg0, arg1, 26641, arg3, var6 - 1);
        method2939(var6 + 1, arg1, 26641, arg3, arg4);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2940(int arg0, int arg1, byte arg2) {
        if (arg2 != 116) {
            method2936((byte) 121);
        }
        field7486++;
        return (arg1 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "(I)V")
    public static final void method2941(int arg0) {
        field7477++;
        if (!class288.field4128) {
            return;
        }
        class356 var1 = class236.method1433(class71.field1052, class303.field4394, (byte) 52);
        if (var1 != null && var1.field5175 != null) {
            class99 var2 = new class99();
            var2.field1343 = var1;
            var2.field1346 = var1.field5175;
            class396.method2358(var2);
        }
        class288.field4128 = false;
        class472.field6827 = -1;
        class450.field6553 = arg0;
        if (var1 != null) {
            class170.method1068(arg0 ^ 0x45, var1);
        }
    }

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "(I)I")
    public final int method2942(int arg0) {
        int var2 = 100 / ((arg0 + 2) / 59);
        field7485++;
        return (this.field7487 & 0x1D2F4A) >> 18;
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(II)V")
    public class489(int arg0, int arg1) {
        this.field7487 = arg0;
        this.field7482 = arg1;
    }

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "(I)Z")
    public final boolean method2943(int arg0) {
        if (arg0 < 20) {
            return false;
        } else {
            field7478++;
            return (this.field7487 & 0x2EC366) >> 21 != 0;
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(Z)Z")
    public final boolean method2944(boolean arg0) {
        if (arg0) {
            this.method2935(64, (byte) -29);
        }
        field7489++;
        return (this.field7487 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "(I)V")
    public static final void method2945(int arg0) {
        field7479++;
        int var1 = 0;
        if (class118.field1533.field6886) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        class389.method2345(var1, 6374);
        class114.field1471.method2134(arg0 - 24595, var1);
        class405.field5947.method1153(true, var1);
        class508.field7744.method559(115, var1);
        class53.field820.method2429(var1, -4213);
        class190.method1197(var1, (byte) -84);
        class390.method2352(var1, 123);
        class290.method1755(var1, (byte) -126);
        class506.method3040(var1, -8229);
        if (arg0 != 25095) {
            method2939(-64, null, -121, null, 32);
        }
        if (class323.field4729 == 10) {
            class319.method1921(arg0 - 9587, 28);
        } else if (class323.field4729 == 30) {
            class319.method1921(15508, 25);
        }
    }

    static {
        new class194("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field7490 = new int[] { 1, 2, 4, 8 };
        field7488 = new class194("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");
    }
}
