import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class206 {

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "J")
    public long field3217 = 0L;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field3212 = 0;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field3209 = 0;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "[I")
    public static int[] field3227 = new int[2];

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field3220 = -1;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public int field3210;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public int field3211;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public int field3213;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public int field3216;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public int field3218;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public int field3221;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    public int field3223;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "Lbk;")
    public static class21 field3215;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "Lji;")
    public class43 field3222;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "Lji;")
    public class43 field3224;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method1384(boolean arg0, String arg1, int arg2) {
        field3214++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = class179.field2784.method1656(arg1, 250);
        int var6 = var3 + 6;
        int var7 = class179.field2784.method1665(arg1, 250) * 13;
        class211.method1424(var4 - var3, -var3 + var6, var3 + var5 + var3, var3 + var7 + var3, 0);
        class211.method1411(var4 - var3, -var3 + var6, var3 + var5 + var3, var3 + var7 + var3, 16777215);
        class179.field2784.method1673(arg1, var4, var6, var5, var7, 16777215, -1, arg2, 1, 0);
        class95.method711(239, var6 - var3, var4 - var3, var3 + var7 + var3, var3 + var5 + var3);
        if (!arg0) {
            class186.method1257(var6, var7, var5, var4, 0);
            return;
        }
        try {
            Graphics var8 = class230.field3651.getGraphics();
            class249.field4023.method182(arg2 - 11105, 0, 0, var8);
        } catch (Exception var9) {
            class230.field3651.repaint();
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public static final void method1385(int arg0) {
        class51.field748 = "Interfaces carregadas";
        client.field2437 = "Config carregada";
        class115.field1882 = "Biblioteca 3D iniciada";
        class185.field2862 = "Tela título aberta";
        class160.field2497 = "Mecanismo de som preparado";
        class88.field1511 = "Alocando memória";
        class287.field4541 = "brilho3:";
        class86.field1451 = "Memória alocada";
        class56.field924 = "deseja negociar com você.";
        class70.field1122 = "Sprites carregados";
        class20.field297 = " já está na sua lista de ignorados.";
        class152.field2380 = "flash2:";
        class75.field1252 = "Conectando ao servidor de atualização";
        class286.field4534 = "Atacar";
        class266.field4250 = "habilidade: ";
        class208.field3235 = "qualificação: ";
        class20.field301 = "Carregando sprites - ";
        class140.field2140 = "Selecionar";
        class221.field3403 = " entrou no jogo.";
        class57.field945 = " ";
        class65.field1093 = "Pegar";
        class135.field2098 = "Dados da lista de mundos carregados";
        class56.field926 = "cyan:";
        class174.field2743 = "deslizamento:";
        class139.field2131 = "Caminhar para cá";
        class135.field2102 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class168.field2627 = " saiu do jogo.";
        class11.field207 = "Pacote de palavras carregado";
        class130.field2031 = "K";
        class101.field1692 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class256.field4095 = "Aguarde...";
        class27.field368 = "onda2:";
        class89.field1563 = "Selecionar opção";
        class11.field191 = "Ok";
        class43.field610 = "Não é possível encontrar ";
        class204.field3187 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class223.field3420 = "Descartar";
        class45.field637 = "Conectado ao servidor de atualização";
        class145.field2304 = "K";
        class267.field4254 = "Carregando config - ";
        class187.field2902 = "M";
        field3226++;
        class58.field949 = "Verificando atualizações - ";
        class216.field3350 = "flash1:";
        class184.field2846 = "brilho1:";
        class75.field1249 = "roxo:";
        class196.field3096 = "Continuar";
        class104.field1735 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        class94.field1607 = "brilho3:";
        class191.field2968 = "branco:";
        class118.field1904 = "amarelo:";
        class194.field3071 = "vermelho:";
        class113.field1851 = "Examinar";
        class162.field2535 = "Largar";
        class8.field169 = "Carregando pacote de palavras - ";
        class210.field3270 = "nível: ";
        class78.field1277 = "Carregando interfaces - ";
        class259.field4150 = "Iniciando biblioteca 3D";
        class137.field2111 = "Tela título carregada";
        class263.field4187 = "RuneScape carregando. Aguarde...";
        class110.field1802 = "Gerenciador de entradas carregado";
        class19.field281 = "Oculto";
        class94.field1600 = "Cancelar";
        class104.field1738 = "Fontes carregadas";
        class158.field2455 = "Objeto para membros";
        class20.field296 = "Carregando...";
        class155.field2409 = "Tentando reestabelecer conexão. Aguarde.";
        class120.field1934 = "Carregando /secure/libs_v4s/RCras - ";
        class173.field2717 = " da sua lista de amigos primeiro.";
        class296.field4687 = "Lista de atualizações carregada";
        class263.field4188 = "Universo de jogo criado";
        class130.field2045 = "onda:";
        class132.field2069 = " mais opções";
        if (arg0 != 250) {
            method1390((String) null, -20);
        }
        class251.field4039 = "rolagem:";
        class27.field377 = "Carregando padrões - ";
        class216.field3349 = "Carregando dados da lista de mundos";
        class189.field2934 = "Conexão perdida.";
        class26.field339 = "Remova ";
        class243.field3965 = "Carregando tela título - ";
        class139.field2125 = "Carregando. Aguarde.";
        class87.field1468 = "tremor:";
        class212.field3304 = "M";
        class222.field3406 = "Virar para cá";
        class214.field3345 = " da sua lista de ignorados primeiro.";
        class145.field2310 = "Padrões carregados";
        class245.field3983 = "verde:";
        class137.field2109 = "Usar";
        class86.field1441 = "brilho2:";
        class13.field215 = "Texturas carregadas";
        class181.field2825 = "Fechar";
        class254.field4066 = "Remova ";
        class297.field4697 = " já está na sua lista de amigos.";
        class72.field1218 = "Carregando fontes - ";
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
    public static void method1386(boolean arg0) {
        if (!arg0) {
            field3227 = null;
            field3215 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
    public static final void method1387(int arg0) {
        field3219++;
        if (arg0 < 51) {
            field3212 = 0;
        }
        for (class11 var1 = (class11) class185.field2857.method1221(119); var1 != null; var1 = (class11) class185.field2857.method1227(-10626)) {
            if (var1.field200) {
                var1.method108(-64);
            }
        }
        for (class11 var2 = (class11) class102.field1699.method1221(120); var2 != null; var2 = (class11) class102.field1699.method1227(-10626)) {
            if (var2.field200) {
                var2.method108(-108);
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V")
    public static final void method1388(int arg0) {
        field3229++;
        if (arg0 != 16777215) {
            method1390((String) null, 5);
        }
        if (class166.field2599) {
            return;
        }
        class115.field1877 = true;
        class166.field2599 = true;
        if (class109.field1782) {
            class16.field244 = (float) ((int) class16.field244 + 191 & 0xFFFFFF80);
        } else {
            class157.field2445 += (24.0F - class157.field2445) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIILji;JZ)V")
    public static final void method1389(int arg0, int arg1, int arg2, int arg3, class43 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class140 var8 = new class140();
        var8.field2137 = arg4;
        var8.field2143 = arg1 * 128 + 64;
        var8.field2138 = arg2 * 128 + 64;
        var8.field2136 = arg3;
        var8.field2146 = arg5;
        if (class269.field4298[arg0][arg1][arg2] == null) {
            class269.field4298[arg0][arg1][arg2] = new class6(arg0, arg1, arg2);
        }
        class269.field4298[arg0][arg1][arg2].field144 = var8;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1390(String arg0, int arg1) {
        field3228++;
        int var2 = 0;
        if (arg1 >= -39) {
            method1384(true, (String) null, -69);
        }
        while (var2 < class43.field619.length) {
            if (class43.field619[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIII)V")
    public static final void method1391(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3225++;
        class41 var5 = class221.method1492((byte) -42, arg4, arg1);
        var5.method301(8792);
        var5.field592 = arg0;
        var5.field583 = arg3;
        var5.field584 = arg2;
    }
}
