import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class149 {

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "Lkj;")
    private class215 field2476;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "Lem;")
    private class292 field2461;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "Lra;")
    private class122 field2475;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "[I")
    public static int[] field2462 = new int[2];

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static volatile int field2472 = 0;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "[Lel;")
    public static class293[] field2466 = new class293[8];

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "Lpf;")
    public static class17 field2467 = new class17(16);

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "Lab;")
    private class249 field2463;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "Lbc;")
    public static class279 field2469;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "[Lgd;")
    private class189[] field2468;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "[[B")
    public static byte[][] field2465;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class313.field5031[arg0][var8][var14] == -class265.field4430) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class245.field4123[arg0][arg1][arg3] + arg5;
            if (!class61.method422(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class61.method422(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class61.method422(var9, var11, var13)) {
                return false;
            } else if (class61.method422(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class136.method1009(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class61.method422(var6 + 1, class245.field4123[arg0][arg1][arg3] + arg5, var7 + 1) && class61.method422(var6 + 128 - 1, class245.field4123[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class61.method422(var6 + 128 - 1, class245.field4123[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class61.method422(var6 + 1, class245.field4123[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static void method1110(int arg0) {
        field2465 = null;
        field2462 = null;
        field2466 = null;
        field2469 = null;
        if (arg0 == -20893) {
            field2467 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILbi;Lbi;)Lgd;")
    public final class189 method1111(int arg0, int arg1, class27 arg2, class27 arg3) {
        field2470++;
        if (arg0 != -5) {
            this.method1113((class27) null, 113, 99, true, (class27) null);
        }
        return this.method1113(arg3, arg1, 1, true, arg2);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)Z")
    public final boolean method1112(byte arg0) {
        field2471++;
        if (this.field2463 != null) {
            return true;
        }
        if (this.field2475 == null) {
            if (this.field2476.method1527(117)) {
                return false;
            }
            this.field2475 = this.field2476.method1533(255, 1220901488, true, (byte) 0, 255);
        }
        if (arg0 <= 36) {
            field2466 = null;
        }
        if (this.field2475.field1114) {
            return false;
        } else {
            this.field2463 = new class249(this.field2475.method83(255));
            this.field2468 = new class189[(this.field2463.field4182.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lbi;IIZLbi;)Lgd;")
    private final class189 method1113(class27 arg0, int arg1, int arg2, boolean arg3, class27 arg4) {
        field2464++;
        if (this.field2463 == null) {
            throw new RuntimeException();
        }
        this.field2463.field4160 = arg1 * 8 + 5;
        if (this.field2463.field4160 >= this.field2463.field4182.length) {
            throw new RuntimeException();
        } else if (this.field2468[arg1] == null) {
            int var6 = this.field2463.method1800(127);
            if (arg2 != 1) {
                this.method1115(-25);
            }
            int var7 = this.field2463.method1800(93);
            class189 var8 = new class189(arg1, arg4, arg0, this.field2476, this.field2461, var6, var7, arg3);
            this.field2468[arg1] = var8;
            return var8;
        } else {
            return this.field2468[arg1];
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public static final void method1114(int arg0) {
        class271.field4492 = "Cancelar";
        class21.field382 = "rolagem:";
        class132.field2171 = "Carregando dados da lista de mundos";
        class12.field217 = "Mechscape carregando. Aguarde...";
        class137.field2250 = "Oculto";
        class90.field1497 = "Selecionar opção";
        class134.field2205 = "nível: ";
        class195.field3117 = "Universo de jogo criado";
        class115.field1957 = "K";
        class93.field1532 = "Memória alocada";
        class303.field4936 = "Interfaces carregadas";
        class162.field2628 = "Objeto para membros";
        field2473++;
        class194.field3113 = "Carregando pacote de palavras - ";
        class16.field321 = "Gerenciador de entradas carregado";
        class110.field1828 = " mais opções";
        class199.field3219 = "Alocando memória";
        if (arg0 != 0) {
            method1110(-67);
        }
        class136.field2242 = "Sprites carregados";
        class227.field3847 = " da sua lista de amigos primeiro.";
        class279.field4642 = "Tela título aberta";
        class115.field1956 = "Carregando tela título - ";
        class3.field110 = "brilho3:";
        class5.field121 = "habilidade: ";
        class207.field3351 = "Padrões carregados";
        class264.field4413 = "Conexão perdida.";
        class302.field4919 = " saiu do jogo.";
        class109.field1798 = "Atacar";
        class43.field651 = "Iniciando biblioteca 3D";
        class241.field4064 = "Continuar";
        class138.field2261 = "Carregando...";
        class58.field1010 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class143.field2356 = "Ok";
        class84.field1394 = "RuneScape carregando. Aguarde...";
        class12.field261 = "Carregando interfaces - ";
        class287.field4749 = "Conectado ao servidor de atualização";
        class286.field4734 = "Pegar";
        class105.field1734 = " já está na sua lista de ignorados.";
        class44.field675 = "Carregando sprites - ";
        class36.field570 = "Carregando config - ";
        class213.field3595 = "onda:";
        class87.field1450 = " da sua lista de ignorados primeiro.";
        class292.field4784 = "verde:";
        class119.field2000 = "qualificação: ";
        class49.field844 = "Carregando padrões - ";
        class215.field3627 = "amarelo:";
        class50.field855 = "K";
        class120.field2019 = "Carregando texturas - ";
        class253.field4286 = "Pacote de palavras carregado";
        class246.field4128 = "Tela título carregada";
        class258.field4344 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class5.field127 = "Carregando. Aguarde.";
        class44.field689 = "Conectando ao servidor de atualização";
        class113.field1925 = "Examinar";
        class132.field2178 = "Virar para cá";
        class80.field1342 = "cyan:";
        class293.field4822 = "Carregando fontes - ";
        class96.field1555 = "Verificando atualizações - ";
        class279.field4645 = "Largar";
        class272.field4551 = "Remova ";
        class277.field4619 = " já está na sua lista de amigos.";
        class88.field1457 = " entrou no jogo.";
        class181.field2880 = "Não é possível encontrar ";
        class280.field4652 = "Caminhar para cá";
        class224.field3786 = "roxo:";
        class224.field3783 = "onda2:";
        class23.field426 = "deslizamento:";
        class136.field2237 = "Fechar";
        class152.field2545 = " ";
        class283.field4674 = "Descartar";
        class141.field2324 = "Selecionar";
        class86.field1431 = "branco:";
        class22.field409 = "Tentando reestabelecer conexão. Aguarde.";
        class95.field1550 = "Lista de atualizações carregada";
        class263.field4391 = "Fontes carregadas";
        class167.field2701 = "brilho2:";
        class124.field2098 = "flash2:";
        class245.field4116 = "Usar";
        class1.field43 = "vermelho:";
        class206.field3331 = "Dados da lista de mundos carregados";
        class1.field76 = "M";
        class264.field4400 = "Remova ";
        class31.field516 = "Aguarde...";
        class251.field4245 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        class42.field640 = "brilho1:";
        class282.field4670 = "Texturas carregadas";
        class30.field501 = "Config carregada";
        class227.field3848 = "brilho3:";
        class169.field2737 = "tremor:";
        class313.field5054 = "flash1:";
        class217.field3670 = "Biblioteca 3D iniciada";
        class23.field416 = "Mecanismo de som preparado";
        class205.field3292 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class296.field4850 = "M";
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
    public final void method1115(int arg0) {
        if (arg0 != 20010) {
            this.field2476 = null;
        }
        field2474++;
        if (this.field2468 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field2468.length; var2++) {
            if (this.field2468[var2] != null) {
                this.field2468[var2].method1361((byte) -18);
            }
        }
        for (int var3 = 0; var3 < this.field2468.length; var3++) {
            if (this.field2468[var3] != null) {
                this.field2468[var3].method1362((byte) 62);
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lkj;Lem;)V")
    public class149(class215 arg0, class292 arg1) {
        this.field2476 = arg0;
        this.field2461 = arg1;
        if (!this.field2476.method1527(78)) {
            this.field2475 = this.field2476.method1533(255, 1220901488, true, (byte) 0, 255);
        }
    }
}
