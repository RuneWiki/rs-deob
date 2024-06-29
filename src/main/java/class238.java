import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class238 {

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field3689 = 0;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field3686 = 0;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "[I")
    public static int[] field3680 = new int[4096];

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Z")
    public static boolean field3691 = false;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public int field3683;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "Lag;")
    public static class188 field3682;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Ljava/lang/String;")
    public String field3677;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static final void method1600(int arg0) {
        class221.method1479(-68);
        class116.method845((byte) -117);
        class175.method1146((byte) -78);
        class273.method1839(32233);
        class141.method976(0);
        class87.method700(true);
        class252.method1686(arg0 + 20582);
        field3687++;
        class109.method817((byte) 102);
        class241.method1627((byte) -73);
        class270.method1828(false);
        class231.method1525(arg0 + 832);
        class90.method712((byte) -126);
        client.method1061(false);
        class155.method1039((byte) -41);
        class154.method1034(true);
        class260.method1723(true);
        class127.method901((byte) 74);
        class130.method917(arg0 + 36);
        if (class210.field3258 != 0) {
            for (int var1 = 0; var1 < class136.field2114.length; var1++) {
                class136.field2114[var1] = null;
            }
            class42.field683 = 0;
        }
        class120.method862(true);
        method1602((byte) -32);
        class263.field4110.method1782(-87);
        ((class287) class97.field1547).method1929(arg0 - 60);
        class258.field3952.method1700(127);
        class221.field3461.method1150(-125);
        class99.field1584.method1150(-120);
        if (arg0 != 64) {
            field3691 = true;
        }
        class190.field3029.method1150(arg0 - 167);
        class72.field1152.method1150(arg0 - 149);
        client.field2408.method1150(-96);
        class158.field2427.method1150(-78);
        class259.field3983.method1150(arg0 - 143);
        class90.field1459.method1150(-114);
        class203.field3163.method1150(-87);
        class146.field2273.method1150(arg0 ^ 0xFFFFFFE5);
        class111.field1747.method1150(-107);
        class287.field4524.method1782(arg0 ^ 0x32);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BZ)V")
    public static final void method1601(byte arg0, boolean arg1) {
        byte[][] var2 = class86.field1417;
        int var3 = class259.field3987.length;
        int var4 = 0;
        if (arg0 <= 27) {
            field3682 = null;
        }
        while (var3 > var4) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class221.field3454[var4] >> 8) * 64 - class118.field1828;
                int var7 = (class221.field3454[var4] & 0xFF) * 64 - class129.field2008;
                class130.method916(-115);
                class196.method1314(var5, arg1, var6, class72.field1142, 2, var7);
            }
            var4++;
        }
        field3681++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    private static final void method1602(byte arg0) {
        class26.field399.method1782(-116);
        if (arg0 <= -26) {
            field3684++;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
    public static void method1603(int arg0) {
        field3680 = null;
        if (arg0 != 4096) {
            field3680 = null;
        }
        field3682 = null;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V")
    public static final void method1604(byte arg0) {
        class23.field348 = " mais opções";
        class160.field2447 = "onda:";
        class256.field3920 = "Usar";
        class191.field3037 = "Remova ";
        class229.field3583 = "Carregando dados da lista de mundos";
        class98.field1572 = "Carregando interfaces - ";
        class35.field559 = "vermelho:";
        class142.field2181 = "brilho3:";
        class169.field2535 = "Continuar";
        class180.field2691 = "Cancelar";
        class78.field1312 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class55.field848 = "Carregando. Aguarde.";
        class266.field4253 = "Pacote de palavras carregado";
        class134.field2103 = "cyan:";
        class160.field2451 = "Tentando reestabelecer conexão. Aguarde.";
        class215.field3315 = "Selecionar opção";
        class202.field3154 = "Padrões carregados";
        class161.field2465 = "habilidade: ";
        int var1 = -34 % ((arg0 - 13) / 54);
        class149.field2307 = "Fontes carregadas";
        class175.field2605 = "Iniciando biblioteca 3D";
        class87.field1428 = "Conectando ao servidor de atualização";
        class220.field3449 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class124.field1964 = "K";
        class247.field3827 = "Pegar";
        class55.field847 = "Tela título carregada";
        class218.field3418 = "Atacar";
        class259.field3984 = "brilho1:";
        class247.field3819 = "Memória alocada";
        class28.field435 = "Tela título aberta";
        class120.field1857 = "brilho2:";
        class171.field2542 = "nível: ";
        class19.field294 = "Conectado ao servidor de atualização";
        class254.field3902 = "Ok";
        class140.field2162 = "Carregando pacote de palavras - ";
        class70.field1124 = "Dados da lista de mundos carregados";
        class209.field3251 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class151.field2340 = "Texturas carregadas";
        class220.field3452 = "Carregando...";
        class214.field3308 = "onda2:";
        class25.field389 = "branco:";
        class64.field1026 = "rolagem:";
        class102.field1629 = "Lista de atualizações carregada";
        class117.field1822 = "Examinar";
        class212.field3287 = " saiu do jogo.";
        class10.field205 = "Remova ";
        class28.field411 = "Carregando /secure/libs_v4s/RCras - ";
        class292.field4602 = "deslizamento:";
        class124.field1954 = "Universo de jogo criado";
        class10.field206 = " já está na sua lista de ignorados.";
        class143.field2208 = "Fechar";
        class65.field1037 = "Carregando sprites - ";
        class174.field2584 = "verde:";
        class34.field546 = "Verificando atualizações - ";
        class29.field454 = "Não é possível encontrar ";
        class93.field1505 = "Caminhar para cá";
        class203.field3165 = "Config carregada";
        class273.field4311 = "Interfaces carregadas";
        class160.field2445 = "Aguarde...";
        class16.field254 = "deseja negociar com você.";
        class22.field328 = "flash2:";
        class280.field4385 = "Carregando tela título - ";
        class143.field2207 = "roxo:";
        class121.field1867 = " da sua lista de amigos primeiro.";
        class267.field4255 = "Conexão perdida.";
        class63.field1012 = " entrou no jogo.";
        class148.field2294 = "M";
        class226.field3544 = "amarelo:";
        class8.field177 = "Carregando config - ";
        class111.field1745 = " ";
        class55.field855 = "M";
        class31.field496 = "flash1:";
        class69.field1099 = "brilho3:";
        class216.field3331 = "Alocando memória";
        class50.field802 = "Descartar";
        class1.field17 = "Largar";
        class46.field734 = " já está na sua lista de amigos.";
        class290.field4569 = "Oculto";
        class100.field1615 = "Biblioteca 3D iniciada";
        class163.field2481 = "Objeto para membros";
        class26.field403 = "Mecanismo de som preparado";
        class219.field3430 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        class187.field2815 = " da sua lista de ignorados primeiro.";
        class297.field4692 = "RuneScape carregando. Aguarde...";
        class148.field2292 = "Gerenciador de entradas carregado";
        class119.field1843 = "tremor:";
        class7.field124 = "qualificação: ";
        field3679++;
        class235.field3644 = "Sprites carregados";
        class28.field448 = "Carregando padrões - ";
        class126.field1984 = "K";
        class9.field189 = "Selecionar";
        class218.field3417 = "Virar para cá";
        class246.field3805 = "Carregando fontes - ";
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Luf;B)V")
    public static final void method1605(class176 arg0, byte arg1) {
        class195.field3078 = arg0;
        if (arg1 != 98) {
            field3686 = -67;
        }
        field3690++;
        class140.field2170 = class195.field3078.method1165(3, 16);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILuf;II)[Lqd;")
    public static final class3[] method1606(int arg0, class176 arg1, int arg2, int arg3) {
        field3688++;
        if (class261.method1750(arg1, arg2, arg3, (byte) 47)) {
            return arg0 == -25519 ? class99.method770((byte) -128) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZI)Ljava/lang/String;")
    public static final String method1607(int arg0, boolean arg1, int arg2) {
        if (arg2 != -17218) {
            method1606(81, (class176) null, 98, 55);
        }
        field3685++;
        return arg1 && arg0 >= 0 ? class29.method233(10, (byte) 75, arg1, arg0) : Integer.toString(arg0);
    }
}
