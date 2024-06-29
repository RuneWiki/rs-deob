import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class158 {

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public int field2209;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public int field2210;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public int field2207;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public int field2204;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field2203 = 0;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field2205 = 5063219;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2211 = "Loaded textures";

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "[[Lse;")
    public static class211[][] field2208;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public static void method1051(byte arg0) {
        field2208 = null;
        if (arg0 < -66) {
            field2211 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/lang/String;ZC)I")
    public static final int method1052(String arg0, boolean arg1, char arg2) {
        if (arg1) {
            field2211 = null;
        }
        field2202++;
        int var3 = 0;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0.charAt(var5) == arg2) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V")
    public static final void method1053(byte arg0) {
        class192.field2651 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        class51.field738 = "Sprites carregados";
        class232.field3514 = "brilho3:";
        class131.field1848 = "Ok";
        class281.field4362 = "Remova ";
        class242.field3712 = "Virar para cá";
        class206.field2868 = "Interfaces carregadas";
        class60.field848 = "Iniciando biblioteca 3D";
        class202.field2799 = "Carregando interfaces - ";
        class235.field3565 = "Tentando reestabelecer conexão. Aguarde.";
        class205.field2862 = "Remova ";
        field2211 = "Texturas carregadas";
        class164.field2274 = "Mecanismo de som preparado";
        class285.field4457 = "Carregando /secure/libs_v4s/RCras - ";
        class11.field111 = "Carregando pacote de palavras - ";
        class81.field1109 = "Padrões carregados";
        class294.field4630 = "cyan:";
        class153.field2126 = "Carregando...";
        class159.field2224 = "M";
        class6.field52 = "Carregando fontes - ";
        class85.field1154 = "K";
        class257.field3924 = "Fechar";
        class156.field2168 = "Tela título carregada";
        class191.field2642 = "Aguarde...";
        class143.field1985 = "flash1:";
        class79.field1096 = "habilidade: ";
        class235.field3569 = " da sua lista de ignorados primeiro.";
        class251.field3845 = "onda:";
        field2200++;
        class224.field3378 = "Carregando padrões - ";
        class103.field1438 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class269.field4133 = "Caminhar para cá";
        class101.field1421 = "nível: ";
        class188.field2602 = "deslizamento:";
        class275.field4254 = "Carregando tela título - ";
        class171.field2368 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class71.field996 = "rolagem:";
        if (arg0 <= 58) {
            method1052((String) null, true, (char) 65513);
        }
        class164.field2276 = "Universo de jogo criado";
        class81.field1106 = "K";
        class240.field3661 = "Fontes carregadas";
        class92.field1277 = "Selecionar opção";
        class16.field160 = " entrou no jogo.";
        class132.field1872 = "Atacar";
        class33.field505 = "flash2:";
        class65.field884 = "amarelo:";
        class171.field2375 = "Verificando atualizações - ";
        class277.field4295 = "Examinar";
        class249.field3817 = " saiu do jogo.";
        class212.field3186 = "verde:";
        class286.field4524 = "Selecionar";
        class82.field1119 = "Gerenciador de entradas carregado";
        class256.field3919 = "Conectando ao servidor de atualização";
        class119.field1675 = " ";
        class239.field3644 = "Alocando memória";
        class293.field4603 = "onda2:";
        class224.field3405 = "Usar";
        class269.field4127 = "Config carregada";
        class144.field2000 = "Não é possível encontrar ";
        class78.field1092 = "qualificação: ";
        class227.field3436 = "Biblioteca 3D iniciada";
        class250.field3833 = "Oculto";
        class76.field1063 = "vermelho:";
        class15.field151 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class195.field2700 = "Pegar";
        class103.field1435 = "Lista de atualizações carregada";
        class8.field71 = "roxo:";
        class160.field2230 = " já está na sua lista de amigos.";
        class47.field691 = "Pacote de palavras carregado";
        class122.field1704 = "Cancelar";
        class207.field2895 = "branco:";
        class141.field1958 = "Carregando config - ";
        class295.field4647 = "Dados da lista de mundos carregados";
        class277.field4294 = "Descartar";
        class13.field128 = "Carregando. Aguarde.";
        class123.field1733 = "brilho2:";
        class277.field4291 = "RuneScape carregando. Aguarde...";
        class222.field3325 = "Carregando sprites - ";
        class140.field1941 = "Objeto para membros";
        class246.field3762 = " já está na sua lista de ignorados.";
        class19.field277 = "brilho3:";
        class163.field2269 = "Continuar";
        class46.field679 = "tremor:";
        class108.field1505 = "Largar";
        class73.field1003 = "Conexão perdida.";
        class254.field3879 = "deseja negociar com você.";
        class145.field2024 = " da sua lista de amigos primeiro.";
        class46.field677 = "M";
        class290.field4572 = "Tela título aberta";
        class164.field2280 = "Conectado ao servidor de atualização";
        class289.field4565 = "brilho1:";
        class296.field4667 = "Memória alocada";
        class47.field692 = "Carregando dados da lista de mundos";
        class103.field1433 = " mais opções";
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILjava/lang/String;Z)Z")
    public static final boolean method1054(int arg0, int arg1, String arg2, boolean arg3) {
        field2206++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var4 = arg1;
        boolean var5 = false;
        boolean var6 = false;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var6 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg0 <= var11) {
                return false;
            }
            if (var6) {
                var11 = -var11;
            }
            int var10 = arg0 * var4 + var11;
            if (var10 / arg0 != var4) {
                return false;
            }
            var4 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
    public class158() {
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lgi;)V")
    public class158(class158 arg0) {
        this.field2209 = arg0.field2209;
        this.field2210 = arg0.field2210;
        this.field2207 = arg0.field2207;
        this.field2204 = arg0.field2204;
    }
}
