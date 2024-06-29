import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class328 extends class305 {

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "Z")
    public boolean field5016 = true;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    public int field5013 = -1;

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
    public int field5023 = 12800;

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "I")
    public int field5027 = -1;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "I")
    public int field5026 = 12800;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    public int field5014 = 0;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
    public int field5024 = 0;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public int field5018;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "Ljava/lang/String;")
    public String field5022;

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "Ljava/lang/String;")
    public String field5030;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public int field5017;

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "Lth;")
    public class55 field5025;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "J")
    public static long field5012 = 0L;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "Lth;")
    public static class55 field5020 = new class55();

    @OriginalMember(owner = "client!bf", name = "db", descriptor = "Z")
    public static boolean field5037 = false;

    @OriginalMember(owner = "client!bf", name = "ab", descriptor = "[I")
    public static int[] field5034 = new int[50];

    @OriginalMember(owner = "client!bf", name = "fb", descriptor = "I")
    public static int field5039 = -1;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!bf", name = "X", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!bf", name = "bb", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!bf", name = "eb", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!bf", name = "Z", descriptor = "Log;")
    public static class225 field5033;

    @OriginalMember(owner = "client!bf", name = "cb", descriptor = "Lgn;")
    public static class257 field5036;

    @OriginalMember(owner = "client!bf", name = "Y", descriptor = "[I")
    public static int[] field5032;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)Z", line = 6)
    public final boolean method2269(int arg0, int arg1, int arg2) {
        field5015++;
        if (arg2 != 1) {
            this.method2272((byte) -124);
        }
        for (class99 var4 = (class99) this.field5025.method424(-69); var4 != null; var4 = (class99) this.field5025.method425(-32547)) {
            if (var4.method647(arg0, (byte) 89, arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIB)[I", line = 34)
    public final int[] method2270(int arg0, int arg1, byte arg2) {
        field5011++;
        for (class99 var4 = (class99) this.field5025.method424(-61); var4 != null; var4 = (class99) this.field5025.method425(-32547)) {
            if (var4.method647(arg1, (byte) 89, arg0)) {
                return var4.method654(arg0, arg1, 1);
            }
        }
        if (arg2 == 91) {
            return null;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V", line = 596)
    public class328(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field5013 = arg6;
        this.field5027 = arg4;
        if (this.field5013 == 255) {
            this.field5013 = 0;
        }
        this.field5018 = arg3;
        this.field5016 = arg5;
        this.field5022 = arg2;
        this.field5030 = arg1;
        this.field5017 = arg0;
        this.field5025 = new class55();
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V", line = 65)
    public static void method2271(int arg0) {
        field5033 = null;
        field5034 = null;
        if (arg0 == -6894) {
            field5036 = null;
            field5032 = null;
            field5020 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)V", line = 82)
    public final void method2272(byte arg0) {
        this.field5024 = 0;
        this.field5014 = 0;
        this.field5026 = 12800;
        field5021++;
        this.field5023 = 12800;
        for (class99 var2 = (class99) this.field5025.method424(-105); var2 != null; var2 = (class99) this.field5025.method425(-32547)) {
            if (var2.field1730 > this.field5024) {
                this.field5024 = var2.field1730;
            }
            if (var2.field1725 < this.field5023) {
                this.field5023 = var2.field1725;
            }
            if (var2.field1742 > this.field5014) {
                this.field5014 = var2.field1742;
            }
            if (var2.field1741 < this.field5026) {
                this.field5026 = var2.field1741;
            }
        }
        if (arg0 >= -99) {
            field5033 = (class225) null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IBIII)V", line = 120)
    public static final void method2273(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class147.field2401; var5++) {
            if (class77.field1541[var5] + class263.field4086[var5] > arg4 && arg0 + arg4 > class263.field4086[var5] && class215.field3444[var5] + class186.field3029[var5] > arg2 && class215.field3444[var5] < arg2 + arg3) {
                class220.field3490[var5] = true;
            }
        }
        if (arg1 <= 122) {
            method2273(22, (byte) -30, -25, 77, 66);
        }
        field5028++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIZ)[I", line = 149)
    public final int[] method2274(int arg0, int arg1, int arg2, boolean arg3) {
        field5035++;
        if (!arg3) {
            this.field5024 = -22;
        }
        for (class99 var5 = (class99) this.field5025.method424(-60); var5 != null; var5 = (class99) this.field5025.method425(-32547)) {
            if (var5.method651(arg0, 31272, arg1, arg2)) {
                return var5.method654(arg2, arg0, 1);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)[I", line = 174)
    public final int[] method2275(int arg0, int arg1, int arg2) {
        field5029++;
        int var4 = 115 % ((-arg2 - 58) / 52);
        for (class99 var5 = (class99) this.field5025.method424(-126); var5 != null; var5 = (class99) this.field5025.method425(-32547)) {
            if (var5.method652(5218, arg0, arg1)) {
                return var5.method649(arg0, (byte) 16, arg1);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V", line = 215)
    public static final void method2276(int arg0) {
        class268.field4122 = "onda2:";
        class148.field2427 = "Alocando memória";
        class235.field3691 = "Conexão perdida.";
        class210.field3385 = "verde:";
        class228.field3602 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class68.field1322 = "Oculto";
        class180.field2901 = " já está na sua lista de amigos.";
        class185.field3017 = "Sprites carregados";
        class344.field5344 = "Carregando interfaces - ";
        class179.field2878 = "brilho3:";
        class256.field4004 = "Padrões carregados";
        class226.field3578 = " saiu do jogo.";
        class216.field3457 = " mais opções";
        class42.field810 = "Dados da lista de mundos carregados";
        class123.field2127 = "amarelo:";
        class21.field450 = "Lista de atualizações carregada";
        class46.field958 = "branco:";
        class18.field332 = "Largar";
        class219.field3478 = "Carregando. Aguarde.";
        class123.field2132 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class226.field3580 = "Examinar";
        class155.field2527 = "brilho2:";
        client.field911 = "flash2:";
        class59.field1165 = "Ok";
        class42.field807 = "roxo:";
        class41.field785 = "Interfaces carregadas";
        class41.field792 = "brilho1:";
        class104.field1798 = "vermelho:";
        if (arg0 != 241) {
            return;
        }
        class134.field2258 = "Conectado ao servidor de atualização";
        class119.field2077 = "K";
        class90.field1662 = "Carregando padrões - ";
        class85.field1601 = "Verificando atualizações - ";
        class283.field4372 = "Fontes carregadas";
        class259.field4033 = "Carregando fontes - ";
        class240.field3757 = "brilho3:";
        class247.field3830 = "Texturas carregadas";
        class256.field4000 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        class80.field1570 = "Fechar";
        class334.field5129 = "K";
        class212.field3406 = "Pegar";
        class106.field1836 = "Objeto para membros";
        class136.field2287 = "Universo de jogo criado";
        class112.field1978 = "Biblioteca 3D iniciada";
        class69.field1475 = " já está na sua lista de ignorados.";
        class211.field3393 = "Não é possível encontrar ";
        class38.field736 = "Carregando tela título - ";
        class24.field479 = "cyan:";
        class165.field2657 = "Pacote de palavras carregado";
        class227.field3585 = "habilidade: ";
        class227.field3590 = "Tela título carregada";
        class345.field5352 = "Tentando reestabelecer conexão. Aguarde.";
        class147.field2410 = "M";
        class166.field2677 = "Remova ";
        class294.field4491 = "Config carregada";
        class307.field4646 = "Aguarde...";
        class342.field5320 = "Memória alocada";
        class101.field1777 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class150.field2455 = "Carregando pacote de palavras - ";
        field5019++;
        class94.field1693 = "Usar";
        class70.field1487 = "Mecanismo de som preparado";
        class239.field3735 = "Caminhar para cá";
        class197.field3175 = "Iniciando biblioteca 3D";
        class169.field2729 = "qualificação: ";
        class125.field2165 = "flash1:";
        class67.field1273 = "onda:";
        class86.field1624 = " entrou no jogo.";
        class148.field2430 = "Carregando...";
        class294.field4498 = "Carregando dados da lista de mundos";
        class64.field1232 = "Atacar";
        class253.field3961 = " da sua lista de amigos primeiro.";
        class162.field2614 = "Tela título aberta";
        class103.field1780 = "Cancelar";
        class277.field4253 = "deslizamento:";
        class322.field4899 = "Carregando sprites - ";
        class319.field4867 = "rolagem:";
        class118.field2062 = "deseja negociar com você.";
        class171.field2763 = "Virar para cá";
        class135.field2270 = "RuneScape carregando. Aguarde...";
        class116.field2047 = "Conectando ao servidor de atualização";
        class329.field5048 = "Carregando config - ";
        class61.field1182 = "Gerenciador de entradas carregado";
        class81.field1579 = "Selecionar";
        class80.field1576 = " da sua lista de ignorados primeiro.";
        class330.field5059 = "Selecionar opção";
        class203.field3306 = "Descartar";
        class123.field2131 = "Carregando /secure/libs_v4s/RCras - ";
        class183.field2929 = "tremor:";
        class31.field645 = "M";
        class52.field1045 = " ";
        class128.field2194 = "Continuar";
        class219.field3469 = "Remova ";
        class93.field1679 = "nível: ";
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ICI)I", line = 565)
    public static final int method2277(int arg0, char arg1, int arg2) {
        if (arg0 > -113) {
            method2271(-42);
        }
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg1 == 'ñ' && arg2 == 0) {
            var3 = 1762;
        }
        field5031++;
        return var3;
    }
}
