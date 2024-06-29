import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class76 {

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "[Lbl;")
    public static class35[] field1188 = new class35[32768];

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "[I")
    public static int[] field1189 = new int[1024];

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1191 = "cyan:";

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public static int field1196 = 0;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B[S[Ljava/lang/String;)V")
    public static final void method496(byte arg0, short[] arg1, String[] arg2) {
        class310.method2109(0, arg1, arg2.length - 1, arg2, 108);
        field1194++;
        if (arg0 != -96) {
            field1191 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lkk;B)Lkk;")
    public static final class254 method497(class254 arg0, byte arg1) {
        field1192++;
        if (arg0.field4167 != -1) {
            return class80.method534(102, arg0.field4167);
        }
        if (arg1 != 60) {
            method499(-74);
        }
        int var2 = arg0.field4077 >>> 16;
        class11 var3 = new class11(class258.field4241);
        for (class229 var4 = (class229) var3.method61(77); var4 != null; var4 = (class229) var3.method63((byte) -86)) {
            if (var4.field3658 == var2) {
                return class80.method534(108, (int) var4.field2102);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)J")
    public static final long method498(int arg0, int arg1, int arg2) {
        class154 var3 = class27.field346[arg0][arg1][arg2];
        return var3 == null || var3.field2414 == null ? 0L : var3.field2414.field1465;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public static final void method499(int arg0) {
        class292.field4823 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class218.field3489 = "deslizamento:";
        class250.field3982 = "Carregando. Aguarde.";
        class110.field1683 = "brilho1:";
        class126.field1949 = "Tentando reestabelecer conexão. Aguarde.";
        class45.field614 = " entrou no jogo.";
        class103.field1558 = "Carregando interfaces - ";
        class271.field4446 = "Carregando dados da lista de mundos";
        class93.field1413 = "Sprites carregados";
        class263.field4347 = "Carregando sprites - ";
        class257.field4230 = "habilidade: ";
        class128.field1973 = "Largar";
        if (arg0 != 0) {
            field1188 = null;
        }
        class123.field1879 = "Pacote de palavras carregado";
        class16.field231 = "K";
        class131.field2014 = "onda:";
        class50.field681 = "brilho2:";
        class252.field3993 = "M";
        class276.field4577 = "Tela título carregada";
        class245.field3900 = "Alocando memória";
        class93.field1415 = "verde:";
        class36.field473 = "Carregando tela título - ";
        class288.field4791 = "Pegar";
        class194.field3069 = "Dados da lista de mundos carregados";
        class141.field2171 = "Memória alocada";
        class19.field255 = "nível: ";
        class74.field1164 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        class156.field2473 = "Universo de jogo criado";
        class115.field1729 = " mais opções";
        class20.field271 = "Virar para cá";
        class98.field1470 = "tremor:";
        class106.field1645 = " ";
        class72.field1050 = "Config carregada";
        class14.field210 = " já está na sua lista de amigos.";
        class42.field588 = "rolagem:";
        class221.field3543 = "Caminhar para cá";
        class175.field2742 = "Padrões carregados";
        class52.field699 = "Mechscape carregando. Aguarde...";
        class35.field444 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class204.field3290 = "flash1:";
        class294.field4836 = " saiu do jogo.";
        class294.field4844 = "branco:";
        class73.field1083 = "Iniciando biblioteca 3D";
        class160.field2528 = "Conectado ao servidor de atualização";
        class178.field2770 = "Lista de atualizações carregada";
        class314.field5055 = "Selecionar";
        class178.field2776 = "Texturas carregadas";
        class74.field1113 = "qualificação: ";
        class78.field1238 = "brilho3:";
        class314.field5058 = "Ok";
        class12.field161 = "Fontes carregadas";
        class27.field347 = "Examinar";
        class90.field1393 = "Atacar";
        class274.field4528 = "Gerenciador de entradas carregado";
        class300.field4930 = "Carregando config - ";
        class84.field1332 = "Cancelar";
        class75.field1184 = "Carregando fontes - ";
        class196.field3116 = "roxo:";
        class37.field481 = "M";
        class138.field2143 = "amarelo:";
        class78.field1243 = "Mecanismo de som preparado";
        class216.field3448 = "Biblioteca 3D iniciada";
        class121.field1852 = "Fechar";
        class272.field4469 = " da sua lista de ignorados primeiro.";
        class232.field3706 = " já está na sua lista de ignorados.";
        field1195++;
        class11.field138 = "Carregando texturas - ";
        class82.field1305 = "Remova ";
        class127.field1965 = "Não é possível encontrar ";
        class160.field2530 = " da sua lista de amigos primeiro.";
        class16.field229 = "Continuar";
        field1191 = "cyan:";
        class262.field4333 = "Selecionar opção";
        class218.field3488 = "RuneScape carregando. Aguarde...";
        class9.field116 = "Carregando padrões - ";
        class248.field3949 = "flash2:";
        class59.field896 = "Remova ";
        class29.field373 = "Objeto para membros";
        class79.field1246 = "Tela título aberta";
        class271.field4448 = "Verificando atualizações - ";
        class197.field3128 = "Aguarde...";
        class18.field250 = "Usar";
        class306.field4977 = "Descartar";
        class299.field4914 = "vermelho:";
        class280.field4634 = "Conectando ao servidor de atualização";
        class127.field1967 = "Carregando pacote de palavras - ";
        class147.field2306 = "Interfaces carregadas";
        class126.field1954 = "Conexão perdida.";
        class159.field2516 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class311.field5027 = "K";
        class19.field264 = "Carregando...";
        class121.field1860 = "brilho3:";
        class74.field1091 = "Oculto";
        class285.field4760 = "onda2:";
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
    public static final void method500(int arg0) {
        field1193++;
        class260.field4262.method145(-103);
        int var1 = 0 % ((arg0 - 82) / 38);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public static void method501(byte arg0) {
        field1191 = null;
        field1188 = null;
        field1189 = null;
        int var1 = 28 % ((-arg0 - 1) / 42);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method502(String arg0, int arg1, int arg2) {
        field1187++;
        class36 var3 = class161.method1067(2, arg2, (byte) 81);
        if (arg1 == -1) {
            var3.method219(arg1 - 86);
            var3.field459 = arg0;
        }
    }
}
