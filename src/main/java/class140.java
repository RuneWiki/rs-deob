import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class140 {

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "Ltf;")
    private class115 field2265;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "Lnl;")
    private class101 field2272;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Lqj;")
    private class155 field2264;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field2261 = -1;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Lti;")
    public static class5 field2269 = new class5(64);

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2279 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    public static int field2280 = 0;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "[I")
    public static int[] field2282 = new int[14];

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "Lfj;")
    private class274 field2274;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "[I")
    public static int[] field2284;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "[Lhk;")
    private class133[] field2268;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public static final void method964(byte arg0) {
        field2267++;
        if (class238.field3741 == 30) {
            class143.method983(25, 16590);
        }
        if (arg0 <= 46) {
            method964((byte) -16);
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)Z")
    public final boolean method965(byte arg0) {
        field2270++;
        if (arg0 >= -19) {
            this.method971((class64) null, 35, (class64) null, true, -88);
        }
        if (this.field2274 != null) {
            return true;
        }
        if (this.field2264 == null) {
            if (this.field2272.method715((byte) -47)) {
                return false;
            }
            this.field2264 = this.field2272.method724(true, 255, (byte) 0, false, 255);
        }
        if (this.field2264.field2461) {
            return false;
        } else {
            this.field2274 = new class274(this.field2264.method1045(true));
            this.field2268 = new class133[(this.field2274.field4441.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)V")
    public static final void method966(byte arg0) {
        if (arg0 == 3) {
            field2273++;
            class275.field4497.method1873(arg0 ^ 0xFFFFE314);
            class16.field303.method1873(-7401);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static void method967(int arg0) {
        field2284 = null;
        if (arg0 != 8) {
            field2280 = 10;
        }
        field2269 = null;
        field2279 = null;
        field2282 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLki;Lki;I)Lhk;")
    public final class133 method968(boolean arg0, class64 arg1, class64 arg2, int arg3) {
        field2276++;
        if (!arg0) {
            method972((byte) 104, 115);
        }
        return this.method971(arg1, 8, arg2, true, arg3);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
    public static final void method969(int arg0) {
        class24.field446 = "brilho1:";
        class238.field3734 = "onda2:";
        class198.field3183 = "Carregando sprites - ";
        class120.field1906 = "verde:";
        class65.field1044 = "Continuar";
        class98.field1552 = "Examinar";
        class237.field3721 = "Biblioteca 3D iniciada";
        class174.field2914 = "brilho3:";
        class70.field1131 = "Padrões carregados";
        class291.field4769 = "M";
        class115.field1755 = "Carregando. Aguarde.";
        class43.field647 = "flash2:";
        class90.field1404 = "tremor:";
        class133.field2137 = "Interfaces carregadas";
        class57.field825 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class236.field3694 = "Remova ";
        class87.field1363 = "flash1:";
        class306.field4980 = "Oculto";
        class22.field409 = "Não é possível encontrar ";
        class177.field2942 = "Config carregada";
        class74.field1197 = "Universo de jogo criado";
        class54.field788 = "Ok";
        class192.field3140 = "vermelho:";
        class275.field4511 = "habilidade: ";
        class302.field4947 = "Iniciando biblioteca 3D";
        class26.field470 = "deseja negociar com você.";
        class253.field4153 = " já está na sua lista de ignorados.";
        class205.field3300 = "brilho2:";
        class17.field306 = "Lista de atualizações carregada";
        class4.field105 = "Tela título aberta";
        class99.field1564 = "roxo:";
        class148.field2369 = "deslizamento:";
        class62.field908 = "Cancelar";
        class225.field3529 = "Memória alocada";
        class48.field703 = "Mechscape carregando. Aguarde...";
        class310.field5020 = "rolagem:";
        class152.field2442 = "K";
        class247.field3887 = " já está na sua lista de amigos.";
        class277.field4526 = "Conectando ao servidor de atualização";
        class217.field3415 = "Texturas carregadas";
        class91.field1437 = "Tela título carregada";
        class8.field184 = "Aguarde...";
        class263.field4305 = " entrou no jogo.";
        class229.field3594 = "onda:";
        if (arg0 > -42) {
            field2282 = null;
        }
        field2271++;
        class248.field4070 = "Carregando /secure/libs_v4s/RCras - ";
        class33.field543 = "Largar";
        class70.field1127 = " ";
        class311.field5031 = "M";
        class287.field4643 = "Remova ";
        class88.field1377 = "Virar para cá";
        class188.field3094 = "Mecanismo de som preparado";
        field2279 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        class123.field1958 = "Selecionar opção";
        class8.field189 = "K";
        class157.field2519 = " da sua lista de amigos primeiro.";
        class177.field2945 = "Carregando tela título - ";
        class146.field2350 = "Dados da lista de mundos carregados";
        class192.field3131 = "Carregando dados da lista de mundos";
        class229.field3582 = "Carregando padrões - ";
        class268.field4334 = "Verificando atualizações - ";
        class183.field3034 = "amarelo:";
        class68.field1085 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class22.field419 = "Fontes carregadas";
        class99.field1563 = "Carregando pacote de palavras - ";
        class200.field3206 = "Atacar";
        class82.field1326 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class263.field4298 = "Sprites carregados";
        class14.field293 = "qualificação: ";
        class248.field3910 = "Carregando fontes - ";
        class302.field4943 = "Tentando reestabelecer conexão. Aguarde.";
        class157.field2507 = "Selecionar";
        class183.field3041 = "Carregando...";
        class66.field1073 = " da sua lista de ignorados primeiro.";
        class33.field540 = "Caminhar para cá";
        class257.field4233 = "Descartar";
        class134.field2176 = "RuneScape carregando. Aguarde...";
        class302.field4942 = "cyan:";
        class200.field3198 = "Pegar";
        class120.field1903 = "branco:";
        class155.field2472 = "Gerenciador de entradas carregado";
        class299.field4911 = "nível: ";
        class220.field3468 = "Conexão perdida.";
        class307.field4990 = " mais opções";
        class225.field3532 = "Alocando memória";
        class232.field3626 = "Pacote de palavras carregado";
        class137.field2212 = "Carregando interfaces - ";
        class123.field1961 = "Conectado ao servidor de atualização";
        class259.field4246 = "Objeto para membros";
        class33.field537 = "Usar";
        class25.field458 = "brilho3:";
        class174.field2916 = "Fechar";
        class59.field863 = "Carregando config - ";
        class165.field2733 = " saiu do jogo.";
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
    public final void method970(boolean arg0) {
        field2266++;
        if (this.field2268 == null) {
            return;
        }
        if (arg0) {
            this.field2268 = null;
        }
        for (int var2 = 0; var2 < this.field2268.length; var2++) {
            if (this.field2268[var2] != null) {
                this.field2268[var2].method909((byte) 98);
            }
        }
        for (int var3 = 0; var3 < this.field2268.length; var3++) {
            if (this.field2268[var3] != null) {
                this.field2268[var3].method910(0);
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lki;ILki;ZI)Lhk;")
    private final class133 method971(class64 arg0, int arg1, class64 arg2, boolean arg3, int arg4) {
        field2263++;
        if (this.field2274 == null) {
            throw new RuntimeException();
        }
        this.field2274.field4458 = arg1 * arg4 + 5;
        if (this.field2274.field4458 >= this.field2274.field4441.length) {
            throw new RuntimeException();
        } else if (this.field2268[arg4] == null) {
            int var6 = this.field2274.method1833((byte) -104);
            int var7 = this.field2274.method1833((byte) -104);
            class133 var8 = new class133(arg4, arg0, arg2, this.field2272, this.field2265, var6, var7, arg3);
            this.field2268[arg4] = var8;
            return var8;
        } else {
            return this.field2268[arg4];
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BI)V")
    public static final void method972(byte arg0, int arg1) {
        if (arg0 != -98) {
            method964((byte) 29);
        }
        field2277++;
        class291 var2 = class61.method389(arg1, 1, arg0 ^ 0xFFFFFF9E);
        var2.method2010(0);
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lnl;Ltf;)V")
    public class140(class101 arg0, class115 arg1) {
        this.field2265 = arg1;
        this.field2272 = arg0;
        if (!this.field2272.method715((byte) -47)) {
            this.field2264 = this.field2272.method724(true, 255, (byte) 0, false, 255);
        }
    }
}
