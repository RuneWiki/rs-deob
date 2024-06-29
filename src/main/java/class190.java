import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class190 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Z")
    public static boolean field2985 = true;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "[I")
    public static int[] field2987 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2991 = " is already on your friend list.";

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field2990 = 0;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "[Ljg;")
    public static class297[] field2980;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "[[[I")
    public static int[][][] field2979;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 4)
    public static final void method1451(byte arg0) {
        class184.method1420(100);
        field2988++;
        class87.method785(true);
        client.method1030((byte) -73);
        class143.method1183(31);
        class286.method2074(24);
        class44.method450((byte) 25);
        class260.method1912(20930);
        class188.method1448(1830);
        class202.method1514((byte) -111);
        class236.method1761(-125);
        class193.method1471((byte) -71);
        class236.method1764(-326);
        class177.method1387((byte) -119);
        class42.method436((byte) -125);
        class10.method104(94);
        class271.method1986(0);
        class42.method434(false);
        class215.method1609((byte) -21);
        class188.method1447(94);
        if (class232.field3624 != 0) {
            for (int var1 = 0; var1 < class149.field2448.length; var1++) {
                class149.field2448[var1] = null;
            }
            class239.field3714 = 0;
        }
        class337.method2369(0);
        class134.method1138(1);
        class224.method1679(-13746);
        class178.method1388(92);
        class277.field4288.method656(0);
        if (!class240.field3737) {
            ((class224) class107.field1619).method1680((byte) 108);
        }
        class294.field4567.method1381(-101);
        class155.field2506.method214(false);
        class133.field2226.method214(false);
        class41.field659.method214(false);
        class239.field3701.method214(false);
        class181.field2856.method214(false);
        int var2 = -41 / ((arg0 + 60) / 61);
        class155.field2504.method214(false);
        class81.field1188.method214(false);
        class303.field4725.method214(false);
        class226.field3521.method214(false);
        class160.field2548.method214(false);
        class163.field2599.method214(false);
        class256.field3936.method656(0);
        class134.field2248.method656(0);
    }

    @OriginalMember(owner = "client!hc", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 74)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field2978++;
        if (class113.field1724 != null) {
            class99.field1493 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class166.field2641.length) {
                var3 = class166.field2641[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class148.field2430 >= 0 && var3 >= 0) {
                class51.field799[class148.field2430] = ~var3;
                class148.field2430 = class148.field2430 + 1 & 0x7F;
                if (class148.field2430 == class146.field2384) {
                    class148.field2430 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 106)
    public static void method1452(int arg0) {
        if (arg0 == 32) {
            field2987 = null;
            field2979 = (int[][][]) null;
            field2991 = null;
            field2980 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V", line = 126)
    public static final void method1453(int arg0) {
        class314.field4857 = "Não é possível encontrar ";
        class217.field3403 = "Sprites carregados";
        class278.field4293 = "cyan:";
        class31.field483 = "Mechscape carregando. Aguarde...";
        class311.field4822 = " ";
        class45.field716 = "Conectando ao servidor de atualização";
        class238.field3680 = "Biblioteca 3D iniciada";
        class173.field2754 = "habilidade: ";
        class352.field5627 = "RuneScape carregando. Aguarde...";
        class177.field2794 = "Selecionar";
        class94.field1440 = "Memória alocada";
        class284.field4410 = "Carregando sprites - ";
        class280.field4322 = "qualificação: ";
        class199.field3098 = "Carregando...";
        class263.field4096 = "Conectado ao servidor de atualização";
        class134.field2246 = "Carregando dados da lista de mundos";
        class82.field1190 = "Carregando config - ";
        class222.field3455 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class350.field5559 = "Mecanismo de som preparado";
        class310.field4798 = "M";
        class128.field2123 = "Fontes carregadas";
        class79.field1146 = "Virar para cá";
        class123.field1971 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class143.field2350 = "Usar";
        class277.field4285 = "deslizamento:";
        class206.field3169 = "Carregando interfaces - ";
        class255.field3933 = "Carregando texturas - ";
        class161.field2569 = "verde:";
        class353.field5635 = "Gerenciador de entradas carregado";
        class194.field3065 = "Pacote de palavras carregado";
        class153.field2489 = "Alocando memória";
        class171.field2729 = "Examinar";
        class186.field2930 = " já está na sua lista de ignorados.";
        class15.field249 = "Objeto para membros";
        class10.field136 = "Config carregada";
        class140.field2335 = "brilho2:";
        class49.field778 = "Tela título aberta";
        class126.field2109 = "Largar";
        class238.field3688 = "M";
        class268.field4134 = "Carregando. Aguarde.";
        class340.field5232 = "Remova ";
        class279.field4306 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        client.field1837 = "Universo de jogo criado";
        class46.field737 = "Aguarde...";
        class344.field5477 = "Interfaces carregadas";
        class279.field4307 = "Conexão perdida.";
        class311.field4838 = "amarelo:";
        class287.field4457 = "K";
        class261.field4000 = "Ok";
        class149.field2443 = "Descartar";
        class6.field76 = "Carregando tela título - ";
        class350.field5582 = " da sua lista de ignorados primeiro.";
        if (arg0 != 0) {
            method1451((byte) -35);
        }
        class284.field4397 = "rolagem:";
        class162.field2577 = "Padrões carregados";
        field2991 = " já está na sua lista de amigos.";
        class178.field2802 = " saiu do jogo.";
        class9.field133 = "Oculto";
        class58.field906 = "Remova ";
        class178.field2807 = "Lista de atualizações carregada";
        field2986++;
        class123.field1979 = "Cancelar";
        class184.field2893 = "K";
        class115.field1771 = "Carregando pacote de palavras - ";
        class277.field4281 = "Tela título carregada";
        class87.field1252 = "Pegar";
        class94.field1441 = "brilho1:";
        class209.field3219 = "Caminhar para cá";
        class120.field1871 = "Fechar";
        class120.field1876 = "Verificando atualizações - ";
        class313.field4847 = "Tentando reestabelecer conexão. Aguarde.";
        class163.field2598 = "brilho3:";
        class108.field1625 = " entrou no jogo.";
        class203.field3147 = "Atacar";
        class185.field2903 = "roxo:";
        class223.field3471 = "Carregando fontes - ";
        class271.field4190 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class340.field5231 = "onda2:";
        class224.field3501 = "brilho3:";
        class165.field2628 = "Carregando padrões - ";
        class158.field2529 = "Dados da lista de mundos carregados";
        class311.field4840 = "nível: ";
        class208.field3204 = "flash2:";
        class175.field2770 = "branco:";
        class93.field1402 = "Iniciando biblioteca 3D";
        class353.field5638 = "onda:";
        class79.field1142 = "flash1:";
        class239.field3719 = " mais opções";
        class309.field4774 = "Texturas carregadas";
        class174.field2762 = "Continuar";
        class297.field4601 = "tremor:";
        class222.field3450 = "Selecionar opção";
        class268.field4132 = "vermelho:";
        class335.field5125 = " da sua lista de amigos primeiro.";
    }

    @OriginalMember(owner = "client!hc", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 401)
    public final void keyTyped(KeyEvent arg0) {
        field2982++;
        if (class113.field1724 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class286.method2073(-1, var2)) {
                int var3 = class222.field3453 + 1 & 0x7F;
                if (class238.field3696 != var3) {
                    class173.field2758[class222.field3453] = -1;
                    class320.field4939[class222.field3453] = var2;
                    class222.field3453 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V", line = 430)
    public static final void method1454(boolean arg0) {
        while (true) {
            if (class244.field3803.method1622(class122.field1945, 0) >= 27) {
                int var1 = class244.field3803.method1632(14538, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class110.field1683[var1] == null) {
                        var2 = true;
                        class110.field1683[var1] = new class244();
                    }
                    class244 var3 = class110.field1683[var1];
                    class126.field2114[class6.field80++] = var1;
                    var3.field1385 = class360.field5718;
                    if (var3.field3802 != null && var3.field3802.method1118(125)) {
                        class197.method1495((byte) -128, var3);
                    }
                    int var4 = class244.field3803.method1632(14538, 1);
                    var3.method1840(class343.method2417(class244.field3803.method1632(14538, 14), (byte) -123), 256);
                    int var5 = class244.field3803.method1632(14538, 5);
                    int var6 = class131.field2219[class244.field3803.method1632(14538, 3)];
                    if (var2) {
                        var3.field1289 = var3.field1320 = var6;
                    }
                    int var7 = class244.field3803.method1632(14538, 1);
                    if (var7 == 1) {
                        class326.field5010[class120.field1861++] = var1;
                    }
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var8 = class244.field3803.method1632(14538, 5);
                    var3.method821(93, var3.field3802.field2192);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.field1288 = var3.field3802.field2189;
                    var3.field1379 = var3.field3802.field2151;
                    if (var3.field1288 == 0) {
                        var3.field1320 = 0;
                    }
                    var3.method819(var3.method808(-117), var4 == 1, -1, class173.field2746.field1290[0] + var5, class173.field2746.field1300[0] - -var8);
                    if (var3.field3802.method1118(127)) {
                        class320.method2258(0, class119.field1826, (class212) null, (class171) null, var3.field1290[0], var3, 128, 0, var3.field1300[0]);
                    }
                    continue;
                }
            }
            field2984++;
            class244.field3803.method1631((byte) 0);
            if (!arg0) {
                method1453(-63);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 506)
    public final void focusGained(FocusEvent arg0) {
        field2983++;
    }

    @OriginalMember(owner = "client!hc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 517)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class113.field1724 != null) {
            class148.field2430 = -1;
        }
        field2981++;
    }

    @OriginalMember(owner = "client!hc", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 541)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2989++;
        if (class113.field1724 == null) {
            return;
        }
        class99.field1493 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class166.field2641.length) {
            var3 = class166.field2641[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class148.field2430 >= 0 && var3 >= 0) {
            class51.field799[class148.field2430] = var3;
            class148.field2430 = class148.field2430 + 1 & 0x7F;
            if (class148.field2430 == class146.field2384) {
                class148.field2430 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class222.field3453 + 1 & 0x7F;
            if (class238.field3696 != var4) {
                class173.field2758[class222.field3453] = var3;
                class320.field4939[class222.field3453] = '\u0000';
                class222.field3453 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }
}
