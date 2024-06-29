import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class125 extends class175 {

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "I")
    public int field2081 = -1;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "Z")
    public boolean field2077 = true;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
    public int field2082 = -1;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
    public int field2089 = 12800;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "I")
    public int field2091 = 0;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
    public int field2097 = 12800;

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "I")
    public int field2102 = 0;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    public int field2076;

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "I")
    public int field2093;

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "Ljava/lang/String;")
    public String field2090;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "Ljava/lang/String;")
    public String field2084;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "Lsj;")
    public class48 field2079;

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "I")
    public static int field2088 = -1;

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "Leg;")
    public static class272 field2096 = new class272(64);

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "Ljava/lang/String;")
    public static String field2099 = "wave:";

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "Leg;")
    public static class272 field2100 = new class272(64);

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILfi;IB)V")
    public static final void method865(int arg0, class235 arg1, int arg2, byte arg3) {
        if (arg1.field672 == arg0 && arg0 != -1) {
            class21 var4 = class267.method1812((byte) 89, arg0);
            int var5 = var4.field239;
            if (var5 == 1) {
                arg1.field623 = 0;
                arg1.field681 = 0;
                arg1.field658 = 1;
                arg1.field642 = arg2;
                arg1.field607 = 0;
                class150.method1022(var4, (byte) 127, arg1.field681, arg1.field613, class197.field3179 == arg1, arg1.field614);
            }
            if (var5 == 2) {
                arg1.field607 = 0;
            }
        } else if (arg0 == -1 || arg1.field672 == -1 || class267.method1812((byte) 89, arg0).field257 >= class267.method1812((byte) 89, arg1.field672).field257) {
            arg1.field681 = 0;
            arg1.field658 = 1;
            arg1.field637 = arg1.field644;
            arg1.field672 = arg0;
            arg1.field623 = 0;
            arg1.field607 = 0;
            arg1.field642 = arg2;
            if (arg1.field672 != -1) {
                class150.method1022(class267.method1812((byte) 89, arg1.field672), (byte) 7, arg1.field681, arg1.field613, class197.field3179 == arg1, arg1.field614);
            }
        }
        if (arg3 == -6) {
            field2078++;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)J")
    public static final long method866(int arg0, int arg1, int arg2) {
        class99 var3 = class273.field4415[arg0][arg1][arg2];
        return var3 == null || var3.field1491 == null ? 0L : var3.field1491.field187;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IBI)Z")
    public final boolean method867(int arg0, byte arg1, int arg2) {
        field2085++;
        if (arg1 != -118) {
            method870((byte) -29);
        }
        for (class52 var4 = (class52) this.field2079.method365(arg1 + 121); var4 != null; var4 = (class52) this.field2079.method372((byte) 7)) {
            if (var4.method405(arg0, arg2, 20513)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIZ)[I")
    public final int[] method868(int arg0, int arg1, boolean arg2) {
        field2080++;
        if (!arg2) {
            return null;
        }
        for (class52 var4 = (class52) this.field2079.method365(3); var4 != null; var4 = (class52) this.field2079.method372((byte) 7)) {
            if (var4.method405(arg1, arg0, 20513)) {
                return var4.method406(arg0, arg1, -1);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljj;I)V")
    public static final void method869(class134 arg0, int arg1) {
        field2101++;
        class284.field4544 = arg0.method947(arg1 ^ 0xFFFFACA3, "p11_full");
        class225.field3562 = arg0.method947(-24925, "p12_full");
        class191.field3055 = arg0.method947(-24925, "b12_full");
        class108.field1873 = arg0.method947(-24925, "mapfunction");
        class228.field3631 = arg0.method947(-24925, "hitmarks");
        class67.field950 = arg0.method947(arg1 ^ 0xFFFFACA3, "hitbar_default");
        class257.field4110 = arg0.method947(-24925, "headicons_pk");
        class254.field4062 = arg0.method947(-24925, "headicons_prayer");
        class169.field2741 = arg0.method947(-24925, "hint_headicons");
        class81.field1130 = arg0.method947(-24925, "hint_mapmarkers");
        if (arg1 != 12800) {
            return;
        }
        class197.field3182 = arg0.method947(-24925, "mapflag");
        class28.field329 = arg0.method947(-24925, "cross");
        class258.field4121 = arg0.method947(-24925, "mapdots");
        class136.field2261 = arg0.method947(arg1 ^ 0xFFFFACA3, "scrollbar");
        class129.field2160 = arg0.method947(arg1 - 37725, "name_icons");
        class188.field3016 = arg0.method947(-24925, "floorshadows");
        class67.field945 = arg0.method947(arg1 - 37725, "compass");
        class30.field372 = arg0.method947(-24925, "hint_mapedge");
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V")
    public static void method870(byte arg0) {
        int var1 = 38 / ((arg0 + 11) / 39);
        field2100 = null;
        field2099 = null;
        field2096 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIII)[I")
    public final int[] method871(int arg0, int arg1, int arg2, int arg3) {
        field2087++;
        if (arg0 != -8251) {
            method875(20);
        }
        for (class52 var5 = (class52) this.field2079.method365(3); var5 != null; var5 = (class52) this.field2079.method372((byte) 7)) {
            if (var5.method408(arg3, arg2, arg1, (byte) -120)) {
                return var5.method406(arg3, arg2, -1);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[BIILjava/lang/String;I)I")
    public static final int method872(int arg0, byte[] arg1, int arg2, int arg3, String arg4, int arg5) {
        int var6 = arg2 - arg5;
        if (arg0 < 101) {
            return 42;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg4.charAt(arg5 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg1[arg3 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg1[arg3 + var7] = -128;
            } else if (var8 == '‚') {
                arg1[arg3 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg1[arg3 + var7] = -125;
            } else if (var8 == '„') {
                arg1[arg3 + var7] = -124;
            } else if (var8 == '…') {
                arg1[arg3 + var7] = -123;
            } else if (var8 == '†') {
                arg1[arg3 + var7] = -122;
            } else if (var8 == '‡') {
                arg1[arg3 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg1[arg3 + var7] = -120;
            } else if (var8 == '‰') {
                arg1[arg3 + var7] = -119;
            } else if (var8 == 'Š') {
                arg1[arg3 + var7] = -118;
            } else if (var8 == '‹') {
                arg1[arg3 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg1[arg3 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg1[arg3 + var7] = -114;
            } else if (var8 == '‘') {
                arg1[arg3 + var7] = -111;
            } else if (var8 == '’') {
                arg1[arg3 + var7] = -110;
            } else if (var8 == '“') {
                arg1[arg3 + var7] = -109;
            } else if (var8 == '”') {
                arg1[arg3 + var7] = -108;
            } else if (var8 == '•') {
                arg1[arg3 + var7] = -107;
            } else if (var8 == '–') {
                arg1[arg3 + var7] = -106;
            } else if (var8 == '—') {
                arg1[arg3 + var7] = -105;
            } else if (var8 == '˜') {
                arg1[arg3 + var7] = -104;
            } else if (var8 == '™') {
                arg1[arg3 + var7] = -103;
            } else if (var8 == 'š') {
                arg1[arg3 + var7] = -102;
            } else if (var8 == '›') {
                arg1[arg3 + var7] = -101;
            } else if (var8 == 'œ') {
                arg1[arg3 + var7] = -100;
            } else if (var8 == 'ž') {
                arg1[arg3 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg1[arg3 + var7] = -97;
            } else {
                arg1[arg3 + var7] = 63;
            }
        }
        field2086++;
        return var6;
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(III)[I")
    public final int[] method873(int arg0, int arg1, int arg2) {
        field2095++;
        for (class52 var4 = (class52) this.field2079.method365(3); var4 != null; var4 = (class52) this.field2079.method372((byte) 7)) {
            if (var4.method404(arg0, arg1, -121)) {
                return var4.method410(-97, arg0, arg1);
            }
        }
        if (arg2 <= 3) {
            field2098 = -101;
        }
        return null;
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)V")
    public final void method874(byte arg0) {
        this.field2102 = 0;
        field2083++;
        this.field2091 = 0;
        this.field2097 = 12800;
        if (arg0 < 80) {
            return;
        }
        this.field2089 = 12800;
        for (class52 var2 = (class52) this.field2079.method365(3); var2 != null; var2 = (class52) this.field2079.method372((byte) 7)) {
            if (var2.field728 < this.field2089) {
                this.field2089 = var2.field728;
            }
            if (this.field2091 < var2.field731) {
                this.field2091 = var2.field731;
            }
            if (this.field2097 > var2.field733) {
                this.field2097 = var2.field733;
            }
            if (this.field2102 < var2.field741) {
                this.field2102 = var2.field741;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "(I)V")
    public static final void method875(int arg0) {
        class23.field295 = "M";
        class280.field4475 = "habilidade: ";
        class21.field256 = "Carregando. Aguarde.";
        class289.field4620 = "K";
        field2092++;
        class96.field1443 = "Carregando config - ";
        class101.field1530 = "Verificando atualizações - ";
        class62.field865 = "qualificação: ";
        class17.field198 = "Gerenciador de entradas carregado";
        class203.field3260 = "Lista de atualizações carregada";
        class295.field4668 = "Tela título carregada";
        class262.field4150 = "Aguarde...";
        class93.field1329 = "Texturas carregadas";
        class238.field3804 = "Pacote de palavras carregado";
        class206.field3308 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        class153.field2475 = "Carregando interfaces - ";
        class78.field1074 = "Conectado ao servidor de atualização";
        class18.field215 = "K";
        class223.field3547 = "Carregando fontes - ";
        class107.field1857 = "Universo de jogo criado";
        class93.field1328 = "Ok";
        class256.field4099 = "brilho3:";
        class146.field2359 = "tremor:";
        class102.field1540 = "cyan:";
        class12.field167 = "verde:";
        class48.field591 = "Iniciando biblioteca 3D";
        class191.field3049 = " mais opções";
        client.field3614 = "vermelho:";
        class92.field1318 = "Remova ";
        class41.field491 = " da sua lista de amigos primeiro.";
        class75.field1035 = "M";
        class290.field4630 = "deseja negociar com você.";
        class173.field2800 = "nível: ";
        class260.field4131 = "Carregando /secure/libs_v4s/RCras - ";
        class205.field3278 = "rolagem:";
        class144.field2333 = "Atacar";
        class79.field1080 = "Fontes carregadas";
        class26.field314 = "flash1:";
        class205.field3290 = "Caminhar para cá";
        class169.field2742 = " da sua lista de ignorados primeiro.";
        class77.field1047 = "Não é possível encontrar ";
        class201.field3234 = " entrou no jogo.";
        class152.field2462 = "deslizamento:";
        class233.field3718 = "Alocando memória";
        class171.field2757 = "Config carregada";
        class246.field3954 = "Continuar";
        class175.field2818 = "Sprites carregados";
        class159.field2596 = "Descartar";
        class246.field3956 = "Dados da lista de mundos carregados";
        client.field3601 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class283.field4509 = "Carregando...";
        class49.field665 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class226.field3575 = "Mecanismo de som preparado";
        class44.field526 = "Selecionar";
        class75.field1019 = "Padrões carregados";
        field2099 = "onda:";
        class34.field427 = "Interfaces carregadas";
        class124.field2070 = "RuneScape carregando. Aguarde...";
        class193.field3104 = "Virar para cá";
        class78.field1070 = "roxo:";
        class45.field543 = "Examinar";
        class54.field774 = "Conectando ao servidor de atualização";
        class16.field197 = "brilho3:";
        class104.field1732 = " saiu do jogo.";
        class280.field4473 = "Tela título aberta";
        class183.field2929 = "brilho1:";
        class184.field2936 = "onda2:";
        class46.field556 = "Usar";
        class243.field3893 = "flash2:";
        class38.field469 = "Carregando dados da lista de mundos";
        class87.field1184 = "Remova ";
        class293.field4648 = "brilho2:";
        class122.field2053 = "Carregando pacote de palavras - ";
        class295.field4669 = "Carregando tela título - ";
        class185.field2977 = "branco:";
        class51.field723 = "Fechar";
        class251.field4013 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class271.field4381 = "Carregando padrões - ";
        class258.field4115 = "Conexão perdida.";
        class224.field3558 = "amarelo:";
        class62.field849 = " ";
        class228.field3632 = "Biblioteca 3D iniciada";
        class175.field2814 = "Objeto para membros";
        class155.field2493 = "Tentando reestabelecer conexão. Aguarde.";
        class22.field277 = "Pegar";
        if (arg0 != 0) {
            return;
        }
        class127.field2111 = "Oculto";
        class253.field4047 = "Memória alocada";
        class188.field3010 = "Largar";
        class104.field1730 = " já está na sua lista de amigos.";
        class166.field2702 = "Carregando sprites - ";
        class184.field2935 = "Cancelar";
        class264.field4202 = " já está na sua lista de ignorados.";
        class205.field3282 = "Selecionar opção";
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
    public class125(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field2082 = arg4;
        this.field2076 = arg3;
        this.field2081 = arg6;
        this.field2093 = arg0;
        this.field2090 = arg1;
        if (this.field2081 == 255) {
            this.field2081 = 0;
        }
        this.field2077 = arg5;
        this.field2084 = arg2;
        this.field2079 = new class48();
    }
}
