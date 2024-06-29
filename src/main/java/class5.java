import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class5 {

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Llc;")
    public static class270 field46;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Lvf;")
    public static class60 field48;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Llf;")
    public static class94 field44;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "[Lah;")
    public static class156[] field51;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "[[I")
    public static int[][] field49;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
    public static final void method25(int arg0, int arg1) {
        class131.field2175 = -1;
        class141.field2276 = arg0;
        field53++;
        class284.field4572 = 100;
        class59.field867 = arg1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIBLmh;I)V")
    public static final void method26(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class263 arg6, int arg7) {
        if (class59.field897) {
            class313.field5035 = 32;
        } else {
            class313.field5035 = 0;
        }
        class59.field897 = false;
        field47++;
        if (class79.field1274 != 0) {
            if (arg0 <= arg1 && arg0 + 16 > arg1 && arg2 <= arg4 && (arg2 + 16) > arg4) {
                arg6.field4160 -= 4;
                class63.method476(arg6, 14105);
            } else if (arg0 <= arg1 && arg0 + 16 > arg1 && arg4 >= arg7 + arg2 - 16 && arg4 < (arg2 + arg7)) {
                arg6.field4160 += 4;
                class63.method476(arg6, 14105);
            } else if (arg1 >= arg0 - class313.field5035 && (arg0 + class313.field5035 + 16) > arg1 && arg4 >= (arg2 + 16) && (arg2 + arg7 - 16) > arg4) {
                int var8 = (arg7 - 32) * arg7 / arg3;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg4 - (var8 / 2) - arg2 - 16;
                int var10 = arg7 - var8 - 32;
                arg6.field4160 = (arg3 - arg7) * var9 / var10;
                class63.method476(arg6, 14105);
                class59.field897 = true;
            }
        }
        int var11 = 10 % ((arg5 - 33) / 54);
        if (class201.field2956 == 0) {
            return;
        }
        int var12 = arg6.field4215;
        if (arg0 - var12 <= arg1 && arg4 >= arg2 && arg0 + 16 > arg1 && arg4 <= arg2 + arg7) {
            arg6.field4160 += class201.field2956 * 45;
            class63.method476(arg6, 14105);
            return;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method27(int arg0, String arg1, Throwable arg2) {
        field45++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class45.method273(arg2, 41);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class187.method1337(var3, (byte) 63);
            int var4 = 34 % ((arg0 - 53) / 54);
            String var5 = class57.method403((byte) 65, var3, "%3a", ":");
            String var6 = class57.method403((byte) 65, var5, "%40", "@");
            String var7 = class57.method403((byte) 65, var6, "%26", "&");
            String var8 = class57.method403((byte) 65, var7, "%23", "#");
            if (class221.field3222.field2020 != null) {
                class60 var9 = class221.field3222.method926(new URL(class221.field3222.field2020.getCodeBase(), "clienterror.ws?c=" + class155.field2412 + "&u=" + class303.field4898 + "&v1=" + class122.field2014 + "&v2=" + class122.field2028 + "&e=" + var8), -53);
                while (var9.field936 == 0) {
                    class155.method1130(1, 1L);
                }
                if (var9.field936 == 1) {
                    DataInputStream var10 = (DataInputStream) var9.field932;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static final void method28(int arg0) {
        class156.field2446 = "Pacote de palavras carregado";
        class231.field3386 = "Conectando ao servidor de atualização";
        class259.field4011 = "Tela título carregada";
        class121.field2007 = "flash2:";
        class273.field4422 = "Interfaces carregadas";
        class190.field2811 = "Oculto";
        class295.field4750 = "Caminhar para cá";
        class264.field4239 = " da sua lista de amigos primeiro.";
        class84.field1342 = "Biblioteca 3D iniciada";
        class94.field1581 = "Selecionar";
        class220.field3215 = "tremor:";
        field52++;
        class197.field2900 = "Aguarde...";
        class280.field4519 = "K";
        class183.field2745 = "Dados da lista de mundos carregados";
        class13.field152 = "Universo de jogo criado";
        class218.field3191 = "Sprites carregados";
        class167.field2553 = "Atacar";
        class259.field4006 = "Carregando /secure/libs_v4s/RCras - ";
        class182.field2731 = "K";
        class213.field3137 = "brilho3:";
        class62.field945 = " ";
        class275.field4458 = "Conexão perdida.";
        class281.field4539 = "Tela título aberta";
        class292.field4641 = "Verificando atualizações - ";
        class236.field3456 = "flash1:";
        class303.field4911 = "Mecanismo de som preparado";
        class35.field452 = "Examinar";
        class260.field4026 = "Usar";
        class250.field3777 = "Carregando pacote de palavras - ";
        class214.field3146 = "Carregando. Aguarde.";
        class159.field2471 = "Padrões carregados";
        class144.field2331 = "Ok";
        class129.field2153 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class147.field2356 = "Remova ";
        class139.field2265 = "rolagem:";
        class225.field3310 = "Carregando interfaces - ";
        class1.field21 = "nível: ";
        class241.field3539 = "Fontes carregadas";
        class8.field91 = "Gerenciador de entradas carregado";
        class252.field3801 = " saiu do jogo.";
        class308.field4964 = " entrou no jogo.";
        class220.field3212 = "Carregando sprites - ";
        class231.field3392 = "brilho2:";
        class110.field1842 = "Carregando dados da lista de mundos";
        class287.field4594 = "branco:";
        class249.field3771 = "habilidade: ";
        class300.field4845 = "Texturas carregadas";
        class112.field1866 = "Continuar";
        class12.field140 = "Não é possível encontrar ";
        class231.field3390 = "Carregando fontes - ";
        class240.field3522 = "Memória alocada";
        class256.field3861 = "Virar para cá";
        class183.field2743 = " já está na sua lista de ignorados.";
        class140.field2273 = "Alocando memória";
        class241.field3542 = " já está na sua lista de amigos.";
        class224.field3297 = "Objeto para membros";
        class245.field3609 = "Largar";
        class65.field985 = "amarelo:";
        class35.field450 = "Descartar";
        class170.field2575 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class143.field2310 = "Selecionar opção";
        class171.field2589 = "Cancelar";
        class66.field1012 = "Mechscape carregando. Aguarde...";
        class306.field4947 = "deseja negociar com você.";
        class200.field2942 = "Carregando tela título - ";
        class188.field2794 = "Pegar";
        class282.field4550 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class160.field2490 = "Config carregada";
        class280.field4508 = "Remova ";
        class7.field66 = "Carregando padrões - ";
        class279.field4490 = "vermelho:";
        class270.field4357 = "Conectado ao servidor de atualização";
        class101.field1708 = "brilho3:";
        class140.field2270 = "M";
        class236.field3447 = "Iniciando biblioteca 3D";
        class242.field3569 = "onda2:";
        class121.field2002 = " da sua lista de ignorados primeiro.";
        class194.field2856 = "qualificação: ";
        class276.field4467 = "verde:";
        class300.field4840 = "brilho1:";
        class230.field3376 = "onda:";
        class204.field3013 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        class107.field1821 = " mais opções";
        class19.field203 = "Carregando...";
        if (arg0 >= -107) {
            method29(false);
        }
        client.field1982 = "cyan:";
        class256.field3867 = "RuneScape carregando. Aguarde...";
        class66.field989 = "Carregando config - ";
        class100.field1707 = "M";
        class86.field1371 = "Fechar";
        class45.field590 = "roxo:";
        class240.field3529 = "Tentando reestabelecer conexão. Aguarde.";
        class219.field3194 = "deslizamento:";
        class81.field1289 = "Lista de atualizações carregada";
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
    public static void method29(boolean arg0) {
        field48 = null;
        field51 = null;
        if (!arg0) {
            field44 = null;
        }
        field46 = null;
        field49 = null;
        field44 = null;
    }
}
