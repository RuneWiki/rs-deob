import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class166 extends class223 {

    @OriginalMember(owner = "client!rl", name = "R", descriptor = "I")
    private int field2506 = 4;

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "I")
    private int field2504 = 4;

    @OriginalMember(owner = "client!rl", name = "T", descriptor = "Z")
    public static boolean field2508 = false;

    @OriginalMember(owner = "client!rl", name = "U", descriptor = "Lnf;")
    public static class162 field2509 = new class162(64);

    @OriginalMember(owner = "client!rl", name = "Z", descriptor = "I")
    public static int field2514 = 0;

    @OriginalMember(owner = "client!rl", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field2515 = "Loading - please wait.";

    @OriginalMember(owner = "client!rl", name = "bb", descriptor = "I")
    public static int field2516 = -1;

    @OriginalMember(owner = "client!rl", name = "db", descriptor = "[I")
    public static int[] field2518 = new int[500];

    @OriginalMember(owner = "client!rl", name = "eb", descriptor = "I")
    public static int field2519 = 0;

    @OriginalMember(owner = "client!rl", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field2520 = "Discard";

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!rl", name = "V", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!rl", name = "W", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!rl", name = "X", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!rl", name = "Y", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!rl", name = "cb", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "Z")
    public static boolean field2501;

    @OriginalMember(owner = "client!rl", name = "S", descriptor = "[[[I")
    public static int[][][] field2507;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "(I)V")
    public static final void method1204(int arg0) {
        class35.field606.method1172((byte) 120);
        ++field2513;
        class155.field2316.method1172((byte) 118);
        class108.field1681.method1172((byte) 117);
        int var1 = 10 % ((arg0 - 27) / 42);
    }

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "(I)V")
    public static final void method1205(int arg0) {
        ++field2517;
        if (arg0 != 0) {
            field2519 = -64;
        }
        class49.field806.method1169(true);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(CI)Z")
    public static final boolean method1206(char arg0, int arg1) {
        if (arg1 != -66) {
            method1210(-58);
        }
        ++field2502;
        return ~arg0 <= -49 && ~arg0 >= -58 || ~arg0 <= -66 && ~arg0 >= -91 || ~arg0 <= -98 && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)V")
    public static final void method1207(byte arg0) {
        ++field2500;
        if (arg0 >= -40) {
            method1210(-49);
        }
        int var1 = class257.method1738(true);
        if (var1 != 0) {
            if (~var1 != -2) {
                class270.method1830((byte) (255 & class33.field588 - 4), -115);
                class6.method38(2, (byte) 125);
                return;
            }
            class270.method1830((byte) 0, -7);
            class6.method38(512, (byte) 95);
            if (client.field2390 != null) {
                class180.method1289((byte) 92);
                return;
            }
        } else {
            class141.field2108 = null;
            class6.method38(0, (byte) 75);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)[[I")
    public final int[][] method135(int arg0, int arg1) {
        if (arg0 < 0) {
            method1206('N', -125);
        }
        ++field2512;
        int[][] var3 = super.field3572.method1818(arg1, false);
        if (super.field3572.field4257) {
            int var4 = class172.field2654 / this.field2506;
            int var5 = class250.field4008 / this.field2504;
            int[][] var7;
            if (var4 > 0) {
                int var6 = arg1 % var4;
                var7 = this.method1534(false, 0, class172.field2654 * var6 / var4);
            } else {
                var7 = this.method1534(false, 0, 0);
            }
            int[] var8 = var7[1];
            int[] var9 = var7[0];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[2];
            int[] var13 = var3[1];
            for (int var14 = 0; class250.field4008 > var14; ++var14) {
                int var15;
                if (var5 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var5;
                    var15 = class250.field4008 * var16 / var5;
                }
                var11[var14] = var9[var15];
                var13[var14] = var8[var15];
                var12[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(B)V")
    public static void method1208(byte arg0) {
        field2520 = null;
        if (arg0 != 107) {
            field2514 = 67;
        }
        field2515 = null;
        field2509 = null;
        field2518 = null;
        field2507 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        if (arg0 <= 14) {
            return null;
        } else {
            ++field2510;
            int[] var3 = super.field3588.method1611(0, arg1);
            if (super.field3588.field3722) {
                int var4 = class250.field4008 / this.field2504;
                int var5 = class172.field2654 / this.field2506;
                int[] var6;
                if (var5 <= 0) {
                    var6 = this.method1533(0, 0, -108);
                } else {
                    int var7 = arg1 % var5;
                    var6 = this.method1533(0, class172.field2654 * var7 / var5, -116);
                }
                for (int var8 = 0; var8 < class250.field4008; ++var8) {
                    if (~var4 < -1) {
                        int var9 = var8 % var4;
                        var3[var8] = var6[class250.field4008 * var9 / var4];
                    } else {
                        var3[var8] = var6[0];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(II)Lah;")
    public static final class295 method1209(int arg0, int arg1) {
        class295 var2 = (class295) class92.field1464.method1173((long) arg1, true);
        ++field2505;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class123.field1849.method721((byte) -117, class49.method412(arg1, (byte) -37), class183.method1312(arg1, (byte) -25));
            class295 var4 = new class295();
            var4.field4584 = arg1;
            int var5 = 114 % ((arg0 - 52) / 41);
            if (var3 != null) {
                var4.method1954(-1, new class31(var3));
            }
            var4.method1967((byte) -24);
            if (!field2501 && var4.field4591) {
                var4.field4629 = null;
            }
            if (var4.field4655) {
                var4.field4611 = false;
                var4.field4621 = 0;
            }
            class92.field1464.method1167((byte) -80, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
    public class166() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "(I)V")
    public static final void method1210(int arg0) {
        class83.field1248 = "Remova ";
        class291.field4523 = "Texturas carregadas";
        class39.field670 = "Continuar";
        class294.field4564 = "M";
        class67.field1039 = "Conectado ao servidor de atualização";
        class26.field446 = "Carregando fontes - ";
        class253.field4044 = "nível: ";
        class114.field1758 = "Carregando tela título - ";
        class174.field2678 = "Pegar";
        class300.field4823 = " já está na sua lista de ignorados.";
        class156.field2337 = "K";
        class126.field1893 = "brilho3:";
        class64.field1021 = "Carregando interfaces - ";
        class42.field702 = "flash2:";
        class196.field3067 = "Usar";
        class49.field811 = "qualificação: ";
        class198.field3081 = "Selecionar";
        class222.field3404 = "onda2:";
        class3.field50 = "Mechscape carregando. Aguarde...";
        class104.field1623 = "Tela título carregada";
        field2515 = "Carregando. Aguarde.";
        class252.field4021 = "roxo:";
        class107.field1669 = "Memória alocada";
        class288.field4503 = "rolagem:";
        class215.field3299 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        class167.field2524 = "verde:";
        class297.field4790 = "Sprites carregados";
        class162.field2436 = "Padrões carregados";
        class84.field1260 = "Iniciando biblioteca 3D";
        class264.field4179 = "Examinar";
        class8.field135 = "Tela título aberta";
        class273.field4365 = "Oculto";
        class290.field4512 = "Carregando dados da lista de mundos";
        class69.field1094 = "deseja negociar com você.";
        class183.field2884 = "RuneScape carregando. Aguarde...";
        class143.field2143 = " da sua lista de ignorados primeiro.";
        class164.field2480 = "Selecionar opção";
        class127.field1910 = " entrou no jogo.";
        class291.field4522 = "Cancelar";
        class57.field895 = "Remova ";
        class178.field2735 = "cyan:";
        class281.field4438 = "Caminhar para cá";
        class151.field2233 = "Gerenciador de entradas carregado";
        class159.field2377 = "Dados da lista de mundos carregados";
        class64.field1020 = "amarelo:";
        class6.field96 = "vermelho:";
        class23.field398 = "Aguarde...";
        class265.field4189 = "brilho1:";
        class79.field1209 = "Conectando ao servidor de atualização";
        class285.field4485 = "Conexão perdida.";
        class105.field1642 = "K";
        class181.field2839 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class75.field1170 = "Carregando config - ";
        class259.field4110 = "Atacar";
        class270.field4281 = "deslizamento:";
        class22.field372 = "Carregando sprites - ";
        class230.field3646 = " já está na sua lista de amigos.";
        class180.field2828 = "Carregando...";
        class262.field4138 = "habilidade: ";
        class296.field4746 = "Config carregada";
        class15.field195 = "Objeto para membros";
        class180.field2822 = "Ok";
        class259.field4104 = "Verificando atualizações - ";
        class73.field1125 = "Lista de atualizações carregada";
        class31.field549 = "Fontes carregadas";
        class131.field1945 = "Interfaces carregadas";
        class265.field4187 = "Pacote de palavras carregado";
        class83.field1253 = "Universo de jogo criado";
        class295.field4654 = " mais opções";
        class2.field40 = "tremor:";
        class297.field4778 = "brilho3:";
        class262.field4134 = "Carregando pacote de palavras - ";
        class22.field351 = " saiu do jogo.";
        class88.field1380 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class164.field2485 = "Carregando /secure/libs_v4s/RCras - ";
        class283.field4462 = "Carregando padrões - ";
        class98.field1570 = "onda:";
        field2520 = "Descartar";
        class266.field4201 = " da sua lista de amigos primeiro.";
        class63.field995 = "Largar";
        int var1 = 97 % ((arg0 - -16) / 46);
        class188.field2957 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class3.field47 = "Alocando memória";
        ++field2498;
        class161.field2420 = "Virar para cá";
        class142.field2120 = "Tentando reestabelecer conexão. Aguarde.";
        class48.field797 = "brilho2:";
        class244.field3895 = "branco:";
        class172.field2589 = "Mecanismo de som preparado";
        class9.field161 = "flash1:";
        class50.field812 = " ";
        class142.field2123 = "Fechar";
        class30.field493 = "Não é possível encontrar ";
        class156.field2331 = "Biblioteca 3D iniciada";
        class304.field4886 = "M";
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        if (arg2 != 102) {
            method1211((class92) null, -38);
        }
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field2506 = arg0.method265(arg2 + -230);
            }
        } else {
            this.field2504 = arg0.method265(-124);
        }
        ++field2503;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lub;I)V")
    public static final void method1211(class92 arg0, int arg1) {
        if (arg1 >= -50) {
            field2509 = null;
        }
        class98.field1574 = arg0;
        ++field2499;
    }
}
