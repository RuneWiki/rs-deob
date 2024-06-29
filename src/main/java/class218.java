import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class218 {

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "Lwn;")
    public class32 field3286 = new class32();

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "[I")
    public static int[] field3273 = new int[14];

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    public static int field3279 = 0;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field3280 = 0;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "J")
    public static long field3271 = 0L;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "[J")
    public static long[] field3282 = new long[100];

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "Lwn;")
    private class32 field3288;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "[I")
    public static int[] field3277;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "[I")
    public static int[] field3278;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIIIFZI)[[I", line = 5)
    public static final int[][] method1515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, boolean arg7, int arg8) {
        field3272++;
        class101 var9 = new class101();
        var9.field1374 = arg4;
        var9.field1353 = arg2;
        var9.field1367 = (int) ((float) arg3 * arg6);
        int[][] var10 = new int[arg0][arg5];
        var9.field1359 = arg8;
        var9.field1364 = arg7;
        var9.method43((byte) -115);
        class91.method572(arg0, 126, arg5);
        for (int var11 = 0; var11 < arg0; var11++) {
            var9.method641(var11, var10[var11], -14118);
        }
        return var10;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V", line = 37)
    public static void method1516(int arg0) {
        field3273 = null;
        field3278 = null;
        if (arg0 > -51) {
            field3279 = -1;
        }
        field3277 = null;
        field3282 = null;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILwf;BILo;Lia;II)V", line = 58)
    public static final void method1517(int arg0, class67 arg1, byte arg2, int arg3, class231 arg4, class234 arg5, int arg6, int arg7) {
        class337 var8 = new class337();
        var8.field5375 = arg6 * 128;
        field3284++;
        if (arg2 < 3) {
            field3278 = (int[]) null;
        }
        var8.field5394 = arg7;
        var8.field5374 = arg3 * 128;
        if (arg5 != null) {
            var8.field5380 = arg5.field3536;
            var8.field5381 = arg5.field3528;
            var8.field5400 = arg5.field3580;
            int var10 = arg5.field3577;
            var8.field5387 = arg5.field3592;
            var8.field5398 = arg5;
            var8.field5385 = arg5.field3579;
            var8.field5377 = arg5.field3542 * 128;
            int var11 = arg5.field3590;
            if (arg0 == 1 || arg0 == 3) {
                var11 = arg5.field3577;
                var10 = arg5.field3590;
            }
            var8.field5376 = (arg3 + var10) * 128;
            var8.field5399 = (arg6 + var11) * 128;
            if (arg5.field3588 != null) {
                var8.field5391 = true;
                var8.method2328(128);
            }
            if (var8.field5385 != null) {
                var8.field5395 = var8.field5381 + (int) ((double) (var8.field5387 - var8.field5381) * Math.random());
            }
            class250.field3968.method1814(var8, true);
        } else if (arg4 != null) {
            class140 var9 = arg4.field3503;
            var8.field5393 = arg4;
            if (var9.field2101 != null) {
                var8.field5391 = true;
                var9 = var9.method961(-126);
            }
            if (var9 != null) {
                var8.field5376 = (var9.field2111 + arg3) * 128;
                var8.field5399 = (var9.field2111 + arg6) * 128;
                var8.field5380 = class79.method516(arg4, (byte) 120);
                var8.field5377 = var9.field2158 * 128;
                var8.field5400 = var9.field2110;
            }
            class257.field4069.method1814(var8, true);
        } else if (arg1 != null) {
            var8.field5397 = arg1;
            var8.field5376 = (arg3 + arg1.method412((byte) 78)) * 128;
            var8.field5399 = (arg1.method412((byte) 76) + arg6) * 128;
            var8.field5380 = class55.method333(arg1, true);
            var8.field5377 = arg1.field820 * 128;
            var8.field5400 = arg1.field837;
            class168.field2574.method764(24369, var8, class294.method2093((byte) 100, arg1.field848));
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)Lwn;", line = 150)
    public final class32 method1518(int arg0) {
        if (arg0 != 25127) {
            this.field3286 = (class32) null;
        }
        field3283++;
        class32 var2 = this.field3288;
        if (this.field3286 == var2) {
            this.field3288 = null;
            return null;
        } else {
            this.field3288 = var2.field369;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILwn;)V", line = 176)
    public final void method1519(int arg0, class32 arg1) {
        field3274++;
        if (arg1.field370 != null) {
            arg1.method222((byte) -80);
        }
        arg1.field369 = this.field3286;
        arg1.field370 = this.field3286.field370;
        arg1.field370.field369 = arg1;
        if (arg0 != 128) {
            method1515(-42, -44, -117, 97, -62, 1, 0.08067477F, true, 101);
        }
        arg1.field369.field370 = arg1;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V", line = 194)
    public static final void method1520(byte arg0) {
        class35.field393 = "Não é possível encontrar ";
        class174.field2628 = "Carregando. Aguarde.";
        class25.field294 = "qualificação: ";
        class226.field3422 = "Biblioteca 3D iniciada";
        class314.field4915 = " da sua lista de ignorados primeiro.";
        class109.field1491 = "Ok";
        class353.field5635 = " já está na sua lista de ignorados.";
        class6.field69 = "Aguarde...";
        class246.field3873 = "M";
        field3275++;
        class274.field4340 = "roxo:";
        class180.field2710 = "Fontes carregadas";
        class110.field1513 = "Selecionar opção";
        class6.field73 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        class192.field2879 = "Mecanismo de som preparado";
        class32.field374 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class125.field1776 = "onda:";
        class220.field3311 = "onda2:";
        class322.field5007 = "Pegar";
        class247.field3918 = "Interfaces carregadas";
        class258.field4077 = "Tela título aberta";
        class112.field1565 = "amarelo:";
        class28.field341 = "Tela título carregada";
        class300.field4686 = "Alocando memória";
        if (arg0 != 50) {
            return;
        }
        class60.field711 = "Caminhar para cá";
        class184.field2771 = "Remova ";
        class74.field942 = "K";
        class185.field2795 = " mais opções";
        class7.field83 = "deslizamento:";
        class357.field5672 = " ";
        class54.field621 = "Carregando...";
        class19.field235 = " entrou no jogo.";
        class166.field2563 = "Conectado ao servidor de atualização";
        class5.field51 = "Carregando sprites - ";
        class291.field4584 = "Examinar";
        class236.field3638 = "K";
        class120.field1668 = "flash2:";
        class263.field4174 = "Mechscape carregando. Aguarde...";
        class355.field5647 = "Iniciando biblioteca 3D";
        class79.field1054 = "brilho3:";
        class293.field4617 = "Remova ";
        class290.field4571 = "Continuar";
        class99.field1341 = "Cancelar";
        class247.field3916 = "Verificando atualizações - ";
        class12.field122 = "Carregando /secure/libs_v4s/RCras - ";
        class180.field2698 = " já está na sua lista de amigos.";
        class233.field3523 = "Padrões carregados";
        class171.field2604 = "brilho1:";
        class256.field4046 = "Carregando dados da lista de mundos";
        class70.field878 = "RuneScape carregando. Aguarde...";
        class259.field4096 = "Memória alocada";
        class93.field1253 = "Dados da lista de mundos carregados";
        class146.field2314 = "Conectando ao servidor de atualização";
        class331.field5305 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class106.field1462 = "Selecionar";
        class321.field4988 = "Texturas carregadas";
        class188.field2838 = "Oculto";
        class77.field1005 = "Sprites carregados";
        class154.field2438 = "Lista de atualizações carregada";
        class63.field756 = " saiu do jogo.";
        class265.field4185 = "deseja negociar com você.";
        class126.field1790 = "Config carregada";
        class212.field3226 = "Virar para cá";
        class73.field912 = "flash1:";
        class316.field4954 = "Tentando reestabelecer conexão. Aguarde.";
        class232.field3511 = "vermelho:";
        class237.field3640 = "Carregando fontes - ";
        class50.field576 = "Usar";
        class355.field5648 = "nível: ";
        class106.field1464 = "Objeto para membros";
        class102.field1379 = "Conexão perdida.";
        class179.field2686 = "Carregando tela título - ";
        class291.field4580 = "habilidade: ";
        class108.field1479 = " da sua lista de amigos primeiro.";
        class325.field5218 = "Universo de jogo criado";
        class181.field2731 = "Carregando interfaces - ";
        class308.field4788 = "M";
        class274.field4344 = "cyan:";
        class223.field3381 = "Gerenciador de entradas carregado";
        class331.field5303 = "Carregando config - ";
        class228.field3455 = "verde:";
        class333.field5327 = "Largar";
        class311.field4885 = "tremor:";
        class135.field2025 = "Descartar";
        class106.field1461 = "Pacote de palavras carregado";
        class16.field170 = "brilho3:";
        class107.field1475 = "Carregando pacote de palavras - ";
        class309.field4808 = "Fechar";
        class332.field5316 = "brilho2:";
        class156.field2450 = "Carregando padrões - ";
        class226.field3417 = "branco:";
        class77.field1004 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class91.field1201 = "Atacar";
        class210.field3170 = "rolagem:";
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)I", line = 543)
    public final int method1521(int arg0) {
        field3276++;
        if (arg0 != 14) {
            field3279 = 46;
        }
        int var2 = 0;
        class32 var3 = this.field3286.field369;
        while (this.field3286 != var3) {
            var3 = var3.field369;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)Lwn;", line = 580)
    public final class32 method1522(byte arg0) {
        class32 var2 = this.field3286.field369;
        field3287++;
        if (this.field3286 == var2) {
            this.field3288 = null;
            return null;
        } else if (arg0 == -49) {
            this.field3288 = var2.field369;
            return var2;
        } else {
            return (class32) null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IJ)V", line = 607)
    public static final void method1523(int arg0, long arg1) {
        field3285++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class95.field1313 < 100 || class274.field4341) || class95.field1313 >= 200) {
            class306.method2157(class331.field5305, false, 0, "");
            return;
        }
        String var3 = class241.method1704(-114, arg1);
        for (int var4 = 0; var4 < class95.field1313; var4++) {
            if (class229.field3477[var4] == arg1) {
                class306.method2157(var3 + class180.field2698, false, 0, "");
                return;
            }
        }
        for (int var5 = 0; var5 < class274.field4339; var5++) {
            if (class337.field5382[var5] == arg1) {
                class306.method2157(class293.field4617 + var3 + class314.field4915, false, 0, "");
                return;
            }
        }
        if (var3.equals(class11.field113.field848)) {
            class306.method2157(class6.field73, false, 0, "");
            return;
        }
        class123.field1703++;
        class235.field3618[class95.field1313] = var3;
        class229.field3477[class95.field1313] = arg1;
        class210.field3167[class95.field1313] = 0;
        class353.field5616[class95.field1313] = "";
        class333.field5332[class95.field1313] = arg0;
        class169.field2582[class95.field1313] = false;
        class95.field1313++;
        class49.field566 = class181.field2734;
        class328.field5282.method304(38, 19830);
        class328.field5282.method1039(arg1, (byte) 112);
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V", line = 675)
    public class218() {
        this.field3286.field370 = this.field3286;
        this.field3286.field369 = this.field3286;
    }
}
