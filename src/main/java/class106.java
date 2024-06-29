import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class106 {

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "[I")
    public static int[] field1351 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "[[S")
    public static short[][] field1354 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "[[B")
    public static byte[][] field1347;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLjava/lang/String;I)I", line = 5)
    public static final int method613(byte arg0, String arg1, int arg2) {
        if (arg0 != 78) {
            method617(90);
        }
        field1350++;
        return class214.method1463(55, true, arg2, arg1);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V", line = 17)
    public static void method614(byte arg0) {
        field1354 = (short[][]) null;
        field1351 = null;
        field1347 = (byte[][]) null;
        if (arg0 > -115) {
            field1354 = (short[][]) ((short[][]) null);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 30)
    public static final String method615(int arg0, boolean arg1) {
        if (!arg1) {
            method621(37, (class175) null, (class189[]) null);
        }
        field1348++;
        return class148.field2061[arg0].length() <= 0 ? class221.field3124[arg0] : class221.field3124[arg0] + class255.field3881 + class148.field2061[arg0];
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)V", line = 50)
    public static final void method616(byte arg0) {
        if (arg0 >= -118) {
            method614((byte) 90);
        }
        class179.field2597.method1237((byte) 12);
        field1352++;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 64)
    public static final void method617(int arg0) {
        field1356++;
        if (class231.field3373 < 0) {
            class308.field4765 = -1;
            class30.field383 = -1;
            class231.field3373 = 0;
        }
        if (class231.field3373 > class291.field4574) {
            class308.field4765 = -1;
            class30.field383 = -1;
            class231.field3373 = class291.field4574;
        }
        if (arg0 != -8915) {
            method616((byte) -41);
        }
        if (class184.field2663 < 0) {
            class308.field4765 = -1;
            class30.field383 = -1;
            class184.field2663 = 0;
        }
        if (class184.field2663 > class308.field4766) {
            class30.field383 = -1;
            class184.field2663 = class308.field4766;
            class308.field4765 = -1;
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V", line = 107)
    public static final void method618(int arg0) {
        if (arg0 != 200) {
            return;
        }
        field1358++;
        class299.method2114();
        class191.field2730 = null;
        class22.field305 = -1;
        class191.method1324(arg0 - 79);
        class28.field357.method1564(39);
        class230.field3365 = new class42();
        ((class63) class215.field3020).method367(8055);
        class344.method2375();
        class193.field2775 = 0;
        class193.field2767 = new class62[255];
        class108.method713();
        class178.method1223();
        class121.method823(2);
        class221.method1522(false, arg0 ^ 0xFFFFFF37);
        class15.method104(50);
        class84.method492((byte) -97);
        for (int var1 = 0; var1 < 2048; var1++) {
            class109 var2 = class328.field5009[var1];
            if (var2 != null) {
                var2.field2430 = null;
            }
        }
        if (class250.field3787) {
            class178.method1227(104, 104);
            class187.method1298(class308.field4759, 0);
            class274.method1979();
        }
        class192.method1329(class164.field2271, arg0 ^ 0xC8, class78.field979);
        class312.method2193(class164.field2271, -125);
        class167.field2326 = null;
        class142.field1987 = null;
        class320.field4921 = null;
        class296.field4615 = null;
        class137.field1919 = null;
        if (class17.field236 == 5) {
            class184.method1280(class164.field2271, arg0 ^ 0x374);
        }
        if (class17.field236 == 10) {
            class179.method1244(false, false);
        }
        if (class17.field236 == 30) {
            class97.method587(-15525, 25);
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)[Lhi;", line = 174)
    public static final class307[] method619(int arg0) {
        if (arg0 != 4783) {
            field1351 = (int[]) null;
        }
        field1353++;
        class307[] var1 = new class307[class21.field266];
        for (int var2 = 0; var2 < class21.field266; var2++) {
            if (class250.field3787) {
                var1[var2] = new class273(class99.field1288, class78.field988, class120.field1681[var2], class223.field3150[var2], class54.field664[var2], class264.field4159[var2], class153.field2105[var2], class134.field1854);
            } else {
                var1[var2] = new class234(class99.field1288, class78.field988, class120.field1681[var2], class223.field3150[var2], class54.field664[var2], class264.field4159[var2], class153.field2105[var2], class134.field1854);
            }
        }
        class321.method2238(13);
        return var1;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V", line = 201)
    public static final void method620(boolean arg0) {
        class311.field4810 = "Interfaces carregadas";
        class27.field353 = "Texturas carregadas";
        class137.field1916 = "Carregando...";
        class328.field5017 = "Lista de atualizações carregada";
        class154.field2128 = "Carregando tela título - ";
        class38.field461 = "Padrões carregados";
        class252.field3830 = "vermelho:";
        class236.field3436 = "Verificando atualizações - ";
        class27.field354 = "Carregando dados da lista de mundos";
        class239.field3591 = "Carregando /secure/libs_v4s/RCras - ";
        class42.field500 = "cyan:";
        class204.field2860 = " já está na sua lista de ignorados.";
        class256.field3898 = "Oculto";
        class206.field2890 = "amarelo:";
        class285.field4477 = "Alocando memória";
        class342.field5312 = "Dados da lista de mundos carregados";
        class186.field2693 = "Tela título aberta";
        class309.field4779 = "deseja negociar com você.";
        class264.field4164 = "Carregando sprites - ";
        class289.field4527 = "Carregando interfaces - ";
        class229.field3342 = " entrou no jogo.";
        class275.field4290 = "M";
        class58.field701 = "Não é possível encontrar ";
        class19.field252 = "qualificação: ";
        class152.field2094 = " já está na sua lista de amigos.";
        class253.field3845 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        class145.field2019 = "M";
        class204.field2869 = "Tela título carregada";
        class50.field629 = "Usar";
        class56.field685 = "Iniciando biblioteca 3D";
        class146.field2035 = "Pacote de palavras carregado";
        class40.field482 = "Remova ";
        class159.field2201 = "Biblioteca 3D iniciada";
        class196.field2812 = "Conexão perdida.";
        if (!arg0) {
            return;
        }
        class298.field4657 = "Descartar";
        class339.field5263 = "Carregando padrões - ";
        class218.field3062 = " saiu do jogo.";
        class283.field4442 = "deslizamento:";
        class134.field1859 = "Gerenciador de entradas carregado";
        class171.field2457 = "Conectando ao servidor de atualização";
        class279.field4338 = "nível: ";
        class279.field4339 = "Cancelar";
        class301.field4699 = "flash1:";
        class62.field789 = "Fechar";
        class343.field5323 = "Examinar";
        class163.field2255 = "Sprites carregados";
        class103.field1336 = "Ok";
        class148.field2058 = "Continuar";
        class315.field4858 = "RuneScape carregando. Aguarde...";
        class195.field2799 = "Fontes carregadas";
        class255.field3881 = " ";
        class218.field3068 = "onda2:";
        class305.field4727 = "rolagem:";
        class254.field3870 = "Carregando config - ";
        class170.field2431 = "Universo de jogo criado";
        class227.field3239 = "Memória alocada";
        class286.field4504 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class258.field3919 = "tremor:";
        class146.field2025 = "Carregando pacote de palavras - ";
        class307.field4754 = "brilho1:";
        class237.field3479 = "verde:";
        field1349++;
        class311.field4813 = "Atacar";
        class98.field1286 = "Objeto para membros";
        class316.field4870 = "brilho2:";
        class149.field2063 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class226.field3226 = " da sua lista de ignorados primeiro.";
        class295.field4609 = "onda:";
        class163.field2251 = "Carregando. Aguarde.";
        class73.field942 = "Pegar";
        class240.field3612 = "habilidade: ";
        class321.field4923 = "K";
        class247.field3738 = "K";
        class15.field199 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class97.field1274 = "branco:";
        class279.field4328 = "Virar para cá";
        class129.field1775 = "Conectado ao servidor de atualização";
        class164.field2262 = "Selecionar opção";
        class158.field2176 = "Tentando reestabelecer conexão. Aguarde.";
        class40.field470 = "flash2:";
        class107.field1361 = " mais opções";
        class303.field4707 = "brilho3:";
        class316.field4875 = "Carregando fontes - ";
        class116.field1641 = "Config carregada";
        class279.field4327 = "Remova ";
        class15.field213 = "Caminhar para cá";
        class121.field1696 = "Largar";
        class284.field4453 = " da sua lista de amigos primeiro.";
        class115.field1638 = "roxo:";
        class235.field3424 = "Selecionar";
        class233.field3403 = "brilho3:";
        class61.field749 = "Mecanismo de som preparado";
        class218.field3061 = "Aguarde...";
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILlc;[Laf;)V", line = 546)
    public static final void method621(int arg0, class175 arg1, class189[] arg2) {
        class63.field825 = arg2;
        class42.field501 = arg1;
        field1355++;
        class74.field960 = new boolean[class63.field825.length];
        class335.field5171.method1533(9);
        int var3 = class42.field501.method1179((byte) -110, "details");
        int[] var4 = class42.field501.method1187(var3, (byte) 13);
        for (int var5 = arg0; var5 < var4.length; var5++) {
            class335.field5171.method1541(false, class285.method2040(var4[var5], true, new class107(class42.field501.method1199(28815, var4[var5], var3))), (long) var4[var5]);
        }
    }
}
