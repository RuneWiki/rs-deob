import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class392 extends class270 {

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    private int field5731;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    public static int field5735 = 0;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)Lnd;", line = 5)
    public static final class413 method2497(int arg0, int arg1) {
        ++field5728;
        class413 var2 = (class413) class191.field2828.method2228(-1, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class243.field3544.method1355(arg0, arg1 + -12607, 11);
            class413 var4 = new class413();
            if (arg1 != 0) {
                method2499(true, 77);
            }
            if (var3 != null) {
                var4.method2591((byte) -77, new class37(var3));
            }
            class191.field2828.method2226((long) arg0, var4, (byte) -108);
            return var4;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)[I", line = 29)
    public final int[] method81(byte arg0, int arg1) {
        ++field5738;
        if (arg0 <= 26) {
            return null;
        } else {
            int[] var3 = super.field4053.method396(arg1, 85);
            if (super.field4053.field815) {
                class82.method638(var3, 0, class161.field2445, this.field5731);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(I)V", line = 52)
    public static final void method2498(int arg0) {
        ++field5736;
        if (~class132.field2136 != -1) {
            try {
                if (~(++class148.field2285) < -1501) {
                    if (class124.field2028 != null) {
                        class124.field2028.method1654(-21013);
                        class124.field2028 = null;
                    }
                    if (class257.field3719 >= 1) {
                        class11.field159 = -5;
                        class132.field2136 = 0;
                        return;
                    }
                    class132.field2136 = 1;
                    class148.field2285 = 0;
                    ++class257.field3719;
                    if (class285.field4266 != class115.field1827) {
                        class285.field4266 = class115.field1827;
                    } else {
                        class285.field4266 = class50.field801;
                    }
                }
                if (class132.field2136 == 1) {
                    class20.field296 = class188.field2783.method1383(class285.field4266, true, class409.field5971);
                    class132.field2136 = 2;
                }
                if (~class132.field2136 == arg0) {
                    if (class20.field296.field2121 == 2) {
                        throw new IOException();
                    }
                    if (~class20.field296.field2121 != -2) {
                        return;
                    }
                    class124.field2028 = new class219((Socket) class20.field296.field2125, class188.field2783);
                    class20.field296 = null;
                    class124.field2028.method1653(class13.field216.field578, 3, class13.field216.field565, 0);
                    if (class157.field2389 != null) {
                        class157.field2389.method2257(-17664);
                    }
                    if (class91.field1446 != null) {
                        class91.field1446.method2257(-17664);
                    }
                    int var1 = class124.field2028.method1662(1);
                    if (class157.field2389 != null) {
                        class157.field2389.method2257(-17664);
                    }
                    if (class91.field1446 != null) {
                        class91.field1446.method2257(-17664);
                    }
                    if (~var1 != -102) {
                        class132.field2136 = 0;
                        class11.field159 = var1;
                        class124.field2028.method1654(-21013);
                        class124.field2028 = null;
                        return;
                    }
                    class132.field2136 = 3;
                }
                if (~class132.field2136 == -4) {
                    if (~class124.field2028.method1655(-10561) <= -3) {
                        int var2 = class124.field2028.method1662(1) << 8 | class124.field2028.method1662(1);
                        class257.method1853(-1974171769, var2);
                        if (class419.field6108 == -1) {
                            class11.field159 = 6;
                            class132.field2136 = 0;
                            class124.field2028.method1654(-21013);
                            class124.field2028 = null;
                        } else {
                            class132.field2136 = 0;
                            class124.field2028.method1654(-21013);
                            class124.field2028 = null;
                            class249.method1794(-5425);
                        }
                    }
                }
            } catch (IOException var3) {
                if (class124.field2028 != null) {
                    class124.field2028.method1654(arg0 ^ 21014);
                    class124.field2028 = null;
                }
                if (~class257.field3719 <= -2) {
                    class132.field2136 = 0;
                    class11.field159 = -4;
                } else {
                    ++class257.field3719;
                    class148.field2285 = 0;
                    class132.field2136 = 1;
                    if (~class285.field4266 != ~class115.field1827) {
                        class285.field4266 = class115.field1827;
                    } else {
                        class285.field4266 = class50.field801;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BLec;I)V", line = 196)
    public final void method78(byte arg0, class37 arg1, int arg2) {
        ++field5737;
        if (~arg2 == -1) {
            this.field5731 = (arg1.method271((byte) 115) << 12) / 255;
        }
        if (arg0 != 108) {
            method2497(89, 10);
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(ZI)I", line = 223)
    public static final int method2499(boolean arg0, int arg1) {
        ++field5733;
        if (!arg0) {
            field5735 = 16;
        }
        return arg1 & 255;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V", line = 234)
    public class392() {
        this(4096);
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(I)V", line = 237)
    public class392(int arg0) {
        super(0, true);
        this.field5731 = 4096;
        this.field5731 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V", line = 248)
    public static final void method2500(int arg0) {
        class397.field5815 = "Memória alocada";
        class100.field1564 = "deslizamento:";
        class161.field2446 = "nível: ";
        class422.field6142 = "K";
        class361.field5152 = "M";
        class18.field258 = "qualificação: ";
        class242.field3535 = "Pacote de palavras carregado";
        class270.field4058 = " da sua lista de amigos primeiro.";
        class157.field2395 = "Texturas carregadas";
        class33.field486 = "Carregando dados da lista de mundos";
        class113.field1816 = "Alocando memória";
        class214.field3164 = "Conectando ao servidor de atualização";
        class263.field3961 = "Carregando pacote de palavras - ";
        class451.field6560 = "onda:";
        class322.field4648 = "RuneScape carregando. Aguarde...";
        class72.field1210 = "Virar para cá";
        class420.field6136 = "Conexão perdida.";
        class30.field445 = "brilho1:";
        class19.field267 = "Usar";
        class268.field4023 = "Iniciando biblioteca 3D";
        class351.field5006 = "Tentando reestabelecer conexão. Aguarde.";
        class164.field2467 = "Fontes carregadas";
        class183.field2696 = "Examinar";
        class211.field3144 = "Config carregada";
        class441.field6408 = "Tela título aberta";
        class380.field5391 = "Carregando config - ";
        class252.field3634 = "amarelo:";
        class16.field234 = " já está na sua lista de amigos.";
        class22.field341 = "K";
        class281.field4212 = "Aguarde...";
        class5.field35 = "Carregando padrões - ";
        class447.field6518 = "Fechar";
        class391.field5712 = "Selecionar opção";
        class147.field2278 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class135.field2166 = "tremor:";
        ++field5734;
        class379.field5382 = "verde:";
        class98.field1533 = "brilho3:";
        class143.field2238 = "Continuar";
        class418.field6069 = "Carregando interfaces - ";
        class250.field3618 = "Oculto";
        class239.field3445 = "Pegar";
        if (arg0 == 11) {
            class106.field1754 = "Verificando atualizações - ";
            class234.field3393 = "Objeto para membros";
            class39.field611 = "Padrões carregados";
            class39.field613 = "Sprites carregados";
            class333.field4778 = "flash2:";
            class267.field4000 = "Biblioteca 3D iniciada";
            class364.field5182 = "Tela título carregada";
            class429.field6210 = "Você não pode adicionar a si próprio à sua lista de amigos.";
            class450.field6536 = "Conectado ao servidor de atualização";
            class432.field6225 = "branco:";
            class320.field4622 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
            class220.field3272 = "Não é possível encontrar ";
            class389.field5593 = "Universo de jogo criado";
            class306.field4472 = "Dados da lista de mundos carregados";
            class171.field2545 = "Mechscape carregando. Aguarde...";
            class358.field5111 = "Carregando texturas - ";
            class117.field1851 = "Carregando. Aguarde.";
            class113.field1820 = " entrou no jogo.";
            class422.field6145 = "As variáveis do sistema foram carregadas";
            class40.field617 = "Carregando...";
            class387.field5551 = "Descartar";
            class362.field5163 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
            class437.field6363 = " saiu do jogo.";
            class365.field5196 = "flash1:";
            class360.field5136 = "Lista de atualizações carregada";
            class387.field5543 = "Cancelar";
            class27.field398 = "Caminhar para cá";
            client.field3652 = "Interfaces carregadas";
            class109.field1777 = "roxo:";
            class37.field540 = " da sua lista de ignorados primeiro.";
            class105.field1745 = " ";
            class172.field2553 = "Ok";
            class148.field2283 = "brilho3:";
            class437.field6361 = "M";
            class193.field2847 = "Remova ";
            class77.field1306 = "Selecionar";
            class39.field610 = "rolagem:";
            class247.field3584 = "Carregando tela título - ";
            class418.field6068 = "Atacar";
            class63.field1022 = "Largar";
            class23.field354 = "vermelho:";
            class275.field4145 = "onda2:";
            class191.field2831 = "Remova ";
            class28.field423 = "Gerenciador de entradas carregado";
            class98.field1540 = "Carregando fontes - ";
            class398.field5860 = "cyan:";
            class376.field5329 = "brilho2:";
            class39.field612 = " já está na sua lista de ignorados.";
            class447.field6521 = "habilidade: ";
            class255.field3692 = "Mecanismo de som preparado";
            class98.field1535 = " mais opções";
            class21.field314 = "Carregando sprites - ";
        }
    }
}
