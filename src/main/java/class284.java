import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class284 {

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "Lug;")
    public class181 field4357 = new class181();

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field4353 = 0;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4361 = " from your ignore list first.";

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "[I")
    public static int[] field4358 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "Z")
    public static boolean field4364 = false;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "J")
    public static long field4363;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "Lug;")
    private class181 field4368;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "[I")
    public static int[] field4354;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lug;B)V")
    public final void method1881(class181 arg0, byte arg1) {
        if (arg0.field2635 != null) {
            arg0.method1193(arg1 ^ 0xFFFFFFA7);
        }
        field4351++;
        arg0.field2635 = this.field4357.field2635;
        if (arg1 != -56) {
            method1884(-45);
        }
        arg0.field2633 = this.field4357;
        arg0.field2635.field2633 = arg0;
        arg0.field2633.field2635 = arg0;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLug;)V")
    public final void method1882(byte arg0, class181 arg1) {
        if (arg1.field2635 != null) {
            arg1.method1193(124);
        }
        if (arg0 <= 27) {
            field4358 = null;
        }
        arg1.field2635 = this.field4357;
        arg1.field2633 = this.field4357.field2633;
        field4370++;
        arg1.field2635.field2633 = arg1;
        arg1.field2633.field2635 = arg1;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)V")
    public static final void method1883(int arg0, int arg1) {
        class244.field3783.method938(arg1, (byte) -123);
        field4366++;
        class222.field3459.method938(arg1, (byte) -123);
        class50.field818.method938(arg1, (byte) -123);
        if (arg0 != 160) {
            method1892(32, -29);
        }
        class235.field3611.method938(arg1, (byte) -123);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static void method1884(int arg0) {
        if (arg0 != -1876) {
            field4363 = -79L;
        }
        field4358 = null;
        field4361 = null;
        field4354 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public static final void method1885(byte arg0) {
        class90.method688((byte) -69);
        field4365++;
        if (arg0 <= 21) {
            return;
        }
        class174.method1158((byte) -105);
        class166.method1127(119);
        class296.method1948(34);
        class91.method690(127);
        class141.method952(true);
        class206.method1364((byte) -119);
        class152.method1034(0);
        class277.method1849(85);
        class78.method613((byte) -118);
        class19.method133((byte) 3);
        class125.method876(94);
        class275.method1840(-1);
        class157.method1060(114);
        class16.method120(-1);
        class68.method542((byte) 95);
        class115.method826(1);
        class50.method380(0);
        class108.method786(9763);
        class262.method1778(-765);
        class166.field2446.method944(65535);
        class270.field4217.method944(65535);
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)Lug;")
    public final class181 method1886(int arg0) {
        field4367++;
        if (arg0 > -1) {
            this.method1881((class181) null, (byte) 8);
        }
        class181 var2 = this.field4368;
        if (this.field4357 == var2) {
            this.field4368 = null;
            return null;
        } else {
            this.field4368 = var2.field2633;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)Lug;")
    public final class181 method1887(int arg0) {
        field4356++;
        class181 var2 = this.field4368;
        if (this.field4357 == var2) {
            this.field4368 = null;
            return null;
        }
        if (arg0 != -24769) {
            method1885((byte) -124);
        }
        this.field4368 = var2.field2635;
        return var2;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)Lug;")
    public final class181 method1888(boolean arg0) {
        field4369++;
        class181 var2 = this.field4357.field2633;
        if (!arg0) {
            return null;
        } else if (this.field4357 == var2) {
            return null;
        } else {
            var2.method1193(111);
            return var2;
        }
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V")
    public static final void method1889(int arg0) {
        class67.field1115 = "Config carregada";
        class66.field1089 = "Continuar";
        class293.field4440 = "Pegar";
        class32.field568 = "Carregando sprites - ";
        class16.field296 = "flash1:";
        class128.field1892 = "Examinar";
        if (arg0 != 0) {
            field4358 = null;
        }
        class194.field2938 = "Selecionar opção";
        class113.field1735 = "deseja negociar com você.";
        class285.field4372 = "RuneScape carregando. Aguarde...";
        class189.field2844 = "amarelo:";
        class285.field4377 = "M";
        class174.field2553 = "M";
        class240.field3737 = "Cancelar";
        class24.field393 = "Objeto para membros";
        class295.field4491 = "Carregando. Aguarde.";
        class115.field1752 = "flash2:";
        class7.field83 = "K";
        class90.field1372 = "onda2:";
        class186.field2712 = "habilidade: ";
        class64.field1071 = "Mecanismo de som preparado";
        class69.field1145 = "Carregando padrões - ";
        class64.field1073 = "branco:";
        class176.field2586 = "Tela título carregada";
        class105.field1552 = "Conectando ao servidor de atualização";
        class194.field2929 = "Não é possível encontrar ";
        class123.field1829 = "Biblioteca 3D iniciada";
        class126.field1859 = "Caminhar para cá";
        class76.field1215 = "Pacote de palavras carregado";
        class152.field2219 = "Oculto";
        class110.field1644 = "Alocando memória";
        class15.field223 = "Ok";
        class171.field2514 = "brilho2:";
        class167.field2466 = "Gerenciador de entradas carregado";
        class182.field2644 = "Fechar";
        class100.field1463 = "Padrões carregados";
        class292.field4434 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class249.field3866 = "onda:";
        class160.field2327 = "cyan:";
        class20.field343 = "Carregando pacote de palavras - ";
        class175.field2569 = "vermelho:";
        class201.field3012 = "Descartar";
        class14.field203 = "Carregando...";
        class209.field3131 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        class240.field3728 = " entrou no jogo.";
        class6.field75 = "Remova ";
        class105.field1554 = "Carregando config - ";
        class150.field2170 = " mais opções";
        class30.field552 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class69.field1146 = "tremor:";
        class7.field84 = "Carregando tela título - ";
        field4360++;
        class51.field827 = "brilho1:";
        class91.field1380 = "brilho3:";
        class246.field3837 = " ";
        class147.field2133 = "Conexão perdida.";
        class4.field50 = "Memória alocada";
        class36.field638 = "Sprites carregados";
        class185.field2689 = " saiu do jogo.";
        class123.field1819 = "Usar";
        class109.field1616 = "Verificando atualizações - ";
        class280.field4302 = "K";
        class258.field3955 = " da sua lista de amigos primeiro.";
        class114.field1745 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class241.field3743 = "Selecionar";
        class32.field575 = "Remova ";
        field4361 = " da sua lista de ignorados primeiro.";
        class168.field2473 = "roxo:";
        class239.field3683 = "nível: ";
        class210.field3141 = "Carregando fontes - ";
        class13.field189 = "Aguarde...";
        class239.field3709 = "Carregando interfaces - ";
        class121.field1798 = "Universo de jogo criado";
        class184.field2676 = "Interfaces carregadas";
        class223.field3472 = "Iniciando biblioteca 3D";
        class42.field737 = " já está na sua lista de amigos.";
        class157.field2306 = "Tela título aberta";
        class140.field2025 = "Carregando /secure/libs_v4s/RCras - ";
        class146.field2116 = "qualificação: ";
        class117.field1763 = "Carregando dados da lista de mundos";
        class212.field3257 = "Tentando reestabelecer conexão. Aguarde.";
        class7.field91 = "rolagem:";
        class12.field185 = "verde:";
        class45.field783 = "Lista de atualizações carregada";
        class175.field2571 = "Texturas carregadas";
        class7.field88 = "deslizamento:";
        class117.field1769 = "Largar";
        class163.field2382 = "Conectado ao servidor de atualização";
        class256.field3950 = "Atacar";
        class210.field3140 = "Dados da lista de mundos carregados";
        class213.field3270 = " já está na sua lista de ignorados.";
        class12.field180 = "Virar para cá";
        class264.field4131 = "Fontes carregadas";
        class182.field2650 = "brilho3:";
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)Lug;")
    public final class181 method1890(int arg0) {
        if (arg0 != -10963) {
            field4363 = 56L;
        }
        field4359++;
        class181 var2 = this.field4357.field2635;
        if (this.field4357 == var2) {
            this.field4368 = null;
            return null;
        } else {
            this.field4368 = var2.field2635;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "(I)V")
    public final void method1891(int arg0) {
        if (arg0 <= 5) {
            return;
        }
        field4352++;
        while (true) {
            class181 var2 = this.field4357.field2633;
            if (this.field4357 == var2) {
                this.field4368 = null;
                return;
            }
            var2.method1193(125);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(II)Z")
    public static final boolean method1892(int arg0, int arg1) {
        class182.field2649 = true;
        class157.field2305 = arg0 + 1 & 0xFFFF;
        if (arg1 <= 77) {
            method1892(-75, -64);
        }
        field4350++;
        return true;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V")
    public static final void method1893(byte arg0) {
        int var1 = -49 / ((arg0 + 55) / 34);
        if (class42.field742 == 30) {
            class88.method668(true, 25);
        }
        field4355++;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
    public class284() {
        this.field4357.field2633 = this.field4357;
        this.field4357.field2635 = this.field4357;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)Lug;")
    public final class181 method1894(byte arg0) {
        field4362++;
        if (arg0 != -90) {
            field4364 = true;
        }
        class181 var2 = this.field4357.field2633;
        if (this.field4357 == var2) {
            this.field4368 = null;
            return null;
        } else {
            this.field4368 = var2.field2633;
            return var2;
        }
    }
}
