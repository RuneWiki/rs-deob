import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class141 extends class196 {

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
    public static int field2126 = 0;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    public static int field2122 = 0;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "Ltd;")
    public static class192 field2129 = new class192(16);

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
    public int field2125;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
    public int field2130;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "I")
    public int field2136;

    @OriginalMember(owner = "client!ng", name = "P", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!ng", name = "R", descriptor = "I")
    public int field2139;

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "Llm;")
    public static class210 field2134;

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "Ljava/lang/String;")
    public String field2135;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "[I")
    public int[] field2132;

    @OriginalMember(owner = "client!ng", name = "Q", descriptor = "[I")
    public int[] field2138;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "[Ltd;")
    public class192[] field2124;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "[Ljava/lang/String;")
    public String[] field2128;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V", line = 5)
    public static void method1011(int arg0) {
        if (arg0 == 0) {
            field2134 = null;
            field2129 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V", line = 16)
    public static final void method1012(byte arg0) {
        class249.method1679();
        field2123++;
        class271.field4157 = null;
        class198.field2972 = -1;
        class241.method1634(arg0 + 195);
        class4.field23.method1677(false);
        class195.field2941 = new class245();
        ((class292) class148.field2233).method2043(101);
        class31.field409 = 0;
        class31.field411 = new class266[255];
        class83.method548();
        class32.method230();
        class189.method1291((byte) 5);
        class198.method1363(-1, false);
        class6.method16(24428);
        for (int var1 = 0; var1 < 2048; var1++) {
            class195 var2 = class241.field3592[var1];
            if (var2 != null) {
                var2.field1517 = null;
            }
        }
        if (class117.field1817) {
            class32.method228(104, 104);
            class18.method119();
        }
        class228.method1578(class68.field898, (byte) -56, class257.field3889);
        class94.method669(class68.field898, (byte) 67);
        class212.field3224 = null;
        if (arg0 != -73) {
            method1013(-22, (byte) -82);
        }
        class9.field67 = null;
        class7.field52 = null;
        class305.field4651 = null;
        class134.field2046 = null;
        if (class293.field4490 == 5) {
            class185.method1273(0, class68.field898);
        }
        if (class293.field4490 == 10) {
            class150.method1084(-28967, false);
        }
        if (class293.field4490 == 30) {
            class163.method1155(25, 10);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)Lsm;", line = 77)
    public static final class120 method1013(int arg0, byte arg1) {
        field2127++;
        class120 var2 = (class120) class181.field2702.method1674(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class153.field2307.method1441(arg0, (byte) -44, 26);
        if (arg1 != 117) {
            method1016((byte) 70);
        }
        class120 var4 = new class120();
        if (var3 != null) {
            var4.method872(new class263(var3), 24368);
        }
        class181.field2702.method1672(-126, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(III)I", line = 102)
    public static final int method1014(int arg0, int arg1, int arg2) {
        field2133++;
        int var3 = 5 / ((arg2 + 76) / 48);
        int var4 = arg1 >>> 31;
        return (arg1 + var4) / arg0 - var4;
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)V", line = 116)
    public static final void method1015(int arg0) {
        class295.field4527 = "Pegar";
        class299.field4570 = " ";
        class181.field2704 = "branco:";
        class15.field169 = "nível: ";
        class263.field4010 = " já está na sua lista de ignorados.";
        class316.field4777 = "onda2:";
        class9.field80 = "Iniciando biblioteca 3D";
        class194.field2907 = "Pacote de palavras carregado";
        class274.field4205 = "Examinar";
        class57.field721 = "Continuar";
        class98.field1506 = "K";
        class202.field3026 = "Carregando /secure/libs_v4s/RCras - ";
        class22.field329 = "onda:";
        class230.field3479 = "Alocando memória";
        class247.field3685 = " entrou no jogo.";
        class201.field3015 = "Interfaces carregadas";
        class26.field370 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class298.field4559 = "Carregando tela título - ";
        class286.field4322 = "Biblioteca 3D iniciada";
        class57.field716 = "RuneScape carregando. Aguarde...";
        class187.field2791 = "brilho3:";
        class311.field4738 = "Carregando config - ";
        class124.field1941 = "M";
        class96.field1438 = " da sua lista de ignorados primeiro.";
        class270.field4138 = "Descartar";
        class67.field892 = "Carregando sprites - ";
        class292.field4459 = "Não é possível encontrar ";
        class327.field4920 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class154.field2312 = "Selecionar opção";
        class234.field3520 = "tremor:";
        class179.field2657 = "M";
        class318.field4806 = "Remova ";
        class228.field3463 = "Conectando ao servidor de atualização";
        class36.field441 = "Carregando dados da lista de mundos";
        class162.field2436 = "Largar";
        class42.field515 = "Tentando reestabelecer conexão. Aguarde.";
        class186.field2777 = "Sprites carregados";
        class38.field455 = "Dados da lista de mundos carregados";
        class79.field1087 = "Verificando atualizações - ";
        class73.field956 = "Remova ";
        class48.field603 = "Aguarde...";
        class134.field2052 = "Carregando interfaces - ";
        class121.field1893 = "Fechar";
        class152.field2299 = "Config carregada";
        class64.field841 = " da sua lista de amigos primeiro.";
        class104.field1647 = "vermelho:";
        class299.field4562 = "K";
        class200.field2996 = "qualificação: ";
        class67.field879 = "Conexão perdida.";
        class221.field3371 = "Ok";
        class245.field3651 = "brilho3:";
        class29.field397 = " mais opções";
        class151.field2265 = "habilidade: ";
        class222.field3390 = "Universo de jogo criado";
        class114.field1751 = "roxo:";
        class285.field4309 = "Mecanismo de som preparado";
        class237.field3551 = "Objeto para membros";
        class16.field182 = "Lista de atualizações carregada";
        class51.field635 = "Fontes carregadas";
        class176.field2602 = "rolagem:";
        class258.field3915 = "Memória alocada";
        class192.field2884 = "flash1:";
        class16.field179 = "Gerenciador de entradas carregado";
        class211.field3216 = "Virar para cá";
        class170.field2556 = "brilho1:";
        class167.field2506 = "deslizamento:";
        class292.field4442 = "Usar";
        class177.field2619 = "Tela título carregada";
        class160.field2399 = "amarelo:";
        class211.field3209 = " já está na sua lista de amigos.";
        class121.field1898 = "Cancelar";
        if (arg0 != 21334) {
            field2122 = 117;
        }
        class326.field4914 = "Caminhar para cá";
        class190.field2822 = "Oculto";
        class315.field4760 = "cyan:";
        class79.field1102 = "Texturas carregadas";
        class73.field949 = "brilho2:";
        class124.field1935 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        class170.field2563 = "deseja negociar com você.";
        class166.field2503 = "Carregando pacote de palavras - ";
        class257.field3892 = " saiu do jogo.";
        class35.field434 = "Carregando. Aguarde.";
        class35.field431 = "Carregando...";
        class131.field2022 = "flash2:";
        class38.field465 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class226.field3436 = "Conectado ao servidor de atualização";
        class45.field572 = "Selecionar";
        field2131++;
        class270.field4149 = "verde:";
        class288.field4348 = "Carregando fontes - ";
        class51.field642 = "Atacar";
        class159.field2386 = "Tela título aberta";
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(B)Lbk;", line = 477)
    public static final class157 method1016(byte arg0) {
        field2121++;
        class157 var1;
        if (class117.field1817) {
            var1 = new class324(class12.field136, class132.field2034, class203.field3039[0], class184.field2754[0], class203.field3051[0], class160.field2403[0], class205.field3083[0], class66.field865);
        } else {
            var1 = new class59(class12.field136, class132.field2034, class203.field3039[0], class184.field2754[0], class203.field3051[0], class160.field2403[0], class205.field3083[0], class66.field865);
        }
        if (arg0 >= -54) {
            return (class157) null;
        } else {
            class10.method49((byte) 87);
            return var1;
        }
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(B)V", line = 500)
    public static final void method1017(byte arg0) {
        while (true) {
            if (class207.field3137.method26(class3.field13, -11394) >= 27) {
                int var1 = class207.field3137.method24((byte) -122, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class187.field2788[var1] == null) {
                        class187.field2788[var1] = new class69();
                        var2 = true;
                    }
                    class69 var3 = class187.field2788[var1];
                    class56.field711[class172.field2577++] = var1;
                    var3.field1498 = class304.field4641;
                    if (var3.field914 != null && var3.field914.method389(false)) {
                        class38.method265(var3, -61);
                    }
                    int var4 = class157.field2351[class207.field3137.method24((byte) -122, 3)];
                    if (var2) {
                        var3.field1474 = var3.field1470 = var4;
                    }
                    int var5 = class207.field3137.method24((byte) -122, 5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = class207.field3137.method24((byte) -122, 1);
                    var3.method458(16, class235.method1615(class207.field3137.method24((byte) -122, 14), 1128));
                    int var7 = class207.field3137.method24((byte) -122, 1);
                    if (var7 == 1) {
                        class278.field4234[class230.field3476++] = var1;
                    }
                    int var8 = class207.field3137.method24((byte) -122, 5);
                    var3.method698(var3.field914.field759, (byte) -76);
                    var3.field1546 = var3.field914.field763;
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.field1475 = var3.field914.field754;
                    if (var3.field1475 == 0) {
                        var3.field1470 = 0;
                    }
                    var3.method701(var6 == 1, class114.field1750.field1541[0] + var5, var3.method696((byte) 117), 21611, class114.field1750.field1516[0] + var8);
                    if (var3.field914.method389(false)) {
                        class5.method10(0, (byte) -128, var3.field1541[0], (class195) null, var3.field1516[0], class180.field2697, (class22) null, var3);
                    }
                    continue;
                }
            }
            class207.field3137.method27((byte) 0);
            field2137++;
            if (arg0 <= 38) {
                field2134 = (class210) null;
            }
            return;
        }
    }
}
