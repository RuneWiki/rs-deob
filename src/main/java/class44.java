import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class44 {

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public int field563;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field545 = 2;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "Ljava/lang/String;")
    public static String field556 = "M";

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "Z")
    public static boolean field570 = false;

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "J")
    public static long field573 = 0L;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public int field547;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public int field549;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public int field558;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "Lqb;")
    public class80 field554;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "[I")
    public int[] field550;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "[I")
    public int[] field561;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "[I")
    public int[] field565;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "[I")
    public int[] field568;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "[I")
    public int[] field571;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "[I")
    public int[] field572;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "[Lqb;")
    public class80[] field569;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "[[I")
    public int[][] field553;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "[[I")
    public int[][] field557;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V")
    public static final void method243(int arg0, int arg1) {
        field546++;
        class34.field437--;
        if (class34.field437 == arg0) {
            return;
        }
        class72.method404(class191.field3084, arg0 + 1, class191.field3084, arg0, class34.field437 - arg0);
        class72.method404(class78.field977, arg0 + 1, class78.field977, arg0, class34.field437 - arg0);
        class72.method407(class187.field2989, arg0 + 1, class187.field2989, arg0, class34.field437 - arg0);
        if (arg1 == -16729) {
            class72.method408(class155.field2423, arg0 + 1, class155.field2423, arg0, class34.field437 - arg0);
            class72.method409(class276.field4403, arg0 + 1, class276.field4403, arg0, class34.field437 - arg0);
            class72.method407(class251.field4104, arg0 + 1, class251.field4104, arg0, class34.field437 - arg0);
            class72.method407(class61.field805, arg0 + 1, class61.field805, arg0, class34.field437 - arg0);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIBII)V")
    public static final void method244(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        class262[] var7 = class134.field2111;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class262 var9 = var7[var8];
            if (var9 != null && var9.field4243 == 2) {
                class122.method795((var9.field4240 - class167.field2683 << 7) + var9.field4236, var9.field4242 * 2, 64, arg1, arg6 >> 1, arg3 >> 1, arg0, (var9.field4245 - class181.field2883 << 7) + var9.field4235);
                if (class134.field2128 > -1 && class73.field924 % 20 < 10) {
                    class126.field2026[var9.field4247].method315(arg5 + class134.field2128 - 12, class165.field2633 + arg2 - 28);
                }
            }
        }
        if (arg4 != 37) {
            field560 = -62;
        }
        field564++;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILcg;)V")
    public static final void method245(int arg0, class48 arg1) {
        class37 var2 = null;
        field567++;
        class32.field430 = 3;
        class200.method1397(true, -29);
        class138.field2213 = 0;
        class96.field1281 = true;
        class39.field486 = true;
        class98.field1315 = 0;
        class194.field3109 = 0;
        class160.field2549 = 2;
        class259.field4204 = true;
        if (arg0 != 31318) {
            return;
        }
        class98.field1321 = true;
        class137.field2207 = true;
        class213.field3429 = true;
        class285.field4525 = true;
        class82.field1021 = true;
        class22.field294 = 0;
        class212.field3405 = true;
        class63.field818 = 127;
        class113.field1624 = true;
        class218.field3493 = 255;
        class196.field3131 = true;
        class272.field4350 = 127;
        if (class202.field3202 < 96) {
            class268.method1801(0);
        } else {
            class268.method1801(2);
        }
        class85.field1050 = true;
        class272.field4348 = false;
        class74.field933 = 0;
        class71.field905 = false;
        class67.field855 = 0;
        class95.field1201 = 0;
        class129.field2065 = false;
        try {
            class243 var3 = arg1.method277((byte) 120, "runescape");
            while (var3.field3995 == 0) {
                class115.method752((byte) -62, 1L);
            }
            if (var3.field3995 == 1) {
                int var4 = 0;
                var2 = (class37) var3.field3992;
                byte[] var5 = new byte[(int) var2.method198((byte) -53)];
                while (var4 < var5.length) {
                    int var6 = var2.method196(var4, 0, var5.length - var4, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                    var4 += var6;
                }
                class30.method173(new class96(var5), 128);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method197(23);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILjava/lang/String;ZIIILjava/lang/String;JZZ)V")
    public static final void method246(int arg0, int arg1, String arg2, boolean arg3, int arg4, int arg5, int arg6, String arg7, long arg8, boolean arg9, boolean arg10) {
        field555++;
        if (arg6 != 21719) {
            method246(103, -49, (String) null, false, 34, -13, -84, (String) null, -65L, false, true);
        }
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class96 var14 = new class96(128);
        var14.method580((byte) 76, 10);
        var14.method572(true, (arg9 ? 4 : 0) | (arg10 ? 1 : 0) | (arg3 ? 2 : 0));
        var14.method590(arg8, 1027669520);
        var14.method574(var12[0], -1);
        var14.method566((byte) -77, arg7);
        var14.method574(var12[1], -1);
        var14.method572(true, class210.field3374);
        var14.method580((byte) 69, arg5);
        var14.method580((byte) 92, arg0);
        var14.method574(var12[2], -1);
        var14.method572(true, arg4);
        var14.method572(true, arg1);
        var14.method574(var12[3], -1);
        var14.method589((byte) 112, class127.field2033, class178.field2823);
        class96 var15 = new class96(350);
        var15.method566((byte) -87, arg2);
        int var16 = 8 - (class115.method753(arg2, (byte) 46) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method580((byte) 124, (int) (Math.random() * 255.0D));
        }
        var15.method546(var12, (byte) -93);
        class4.field57.field1228 = 0;
        class4.field57.method580((byte) 70, 22);
        class4.field57.method572(true, 2 - (-var14.field1228 - var15.field1228));
        class4.field57.method572(true, 537);
        class4.field57.method547((byte) -79, var14.field1228, var14.field1218, 0);
        class4.field57.method547((byte) -79, var15.field1228, var15.field1218, 0);
        class265.field4265 = 0;
        class86.field1062 = -3;
        class220.field3528 = 0;
        class261.field4227 = 1;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I[B)V")
    private final void method247(int arg0, byte[] arg1) {
        class96 var3 = new class96(class251.method1732(arg1, false));
        field552++;
        int var4 = var3.method584(arg0 + 6467);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field547 = var3.method597(-1197332568);
        } else {
            this.field547 = 0;
        }
        int var5 = 0;
        int var6 = var3.method584(arg0 + 6467);
        int var7 = -1;
        this.field558 = var3.method549(255);
        this.field571 = new int[this.field558];
        for (int var8 = 0; var8 < this.field558; var8++) {
            this.field571[var8] = var5 += var3.method549(255);
            if (this.field571[var8] > var7) {
                var7 = this.field571[var8];
            }
        }
        this.field549 = var7 + 1;
        this.field565 = new int[this.field549];
        this.field557 = new int[this.field549][];
        this.field568 = new int[this.field549];
        this.field572 = new int[this.field549];
        this.field561 = new int[this.field549];
        if (var6 != 0) {
            this.field550 = new int[this.field549];
            for (int var9 = 0; var9 < this.field549; var9++) {
                this.field550[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field558; var10++) {
                this.field550[this.field571[var10]] = var3.method597(-1197332568);
            }
            this.field554 = new class80(this.field550);
        }
        for (int var11 = 0; var11 < this.field558; var11++) {
            this.field565[this.field571[var11]] = var3.method597(arg0 - 1197326356);
        }
        if (arg0 != -6212) {
            this.field549 = -5;
        }
        for (int var12 = 0; var12 < this.field558; var12++) {
            this.field561[this.field571[var12]] = var3.method597(-1197332568);
        }
        for (int var13 = 0; var13 < this.field558; var13++) {
            this.field572[this.field571[var13]] = var3.method549(255);
        }
        for (int var14 = 0; var14 < this.field558; var14++) {
            int var21 = 0;
            int var22 = this.field571[var14];
            int var23 = this.field572[var22];
            this.field557[var22] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field557[var22][var25] = var21 += var3.method549(255);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field568[var22] = var24 + 1;
            if ((var24 + 1) == var23) {
                this.field557[var22] = null;
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field553 = new int[var7 + 1][];
        this.field569 = new class80[var7 + 1];
        for (int var15 = 0; var15 < this.field558; var15++) {
            int var16 = this.field571[var15];
            int var17 = this.field572[var16];
            this.field553[var16] = new int[this.field568[var16]];
            for (int var18 = 0; var18 < this.field568[var16]; var18++) {
                this.field553[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field557[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field557[var16][var19];
                }
                this.field553[var16][var20] = var3.method597(-1197332568);
            }
            this.field569[var16] = new class80(this.field553[var16]);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static void method248(byte arg0) {
        field556 = null;
        if (arg0 != 10) {
            method243(-12, 60);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static final void method249(int arg0) {
        class2.field11 = "Selecionar opção";
        class99.field1327 = "Pegar";
        field551++;
        class259.field4193 = "Carregando interfaces - ";
        class83.field1027 = "K";
        class143.field2262 = "RuneScape carregando. Aguarde...";
        class62.field816 = "Conectando ao servidor de atualização";
        class68.field860 = "Verificando atualizações - ";
        class208.field3323 = "branco:";
        class244.field4006 = "Largar";
        class261.field4226 = "habilidade: ";
        class115.field1646 = "deseja negociar com você.";
        class273.field4373 = " da sua lista de amigos primeiro.";
        class60.field767 = "Dados da lista de mundos carregados";
        class238.field3937 = "Remova ";
        class218.field3490 = " já está na sua lista de amigos.";
        class157.field2530 = "brilho3:";
        class207.field3314 = "Biblioteca 3D iniciada";
        class13.field173 = "brilho1:";
        class183.field2921 = "amarelo:";
        class119.field1694 = "Carregando pacote de palavras - ";
        class258.field4187 = "nível: ";
        class237.field3921 = "Atacar";
        class210.field3351 = "verde:";
        class190.field3072 = "Config carregada";
        class34.field433 = "Sprites carregados";
        class95.field1211 = "Mecanismo de som preparado";
        class130.field2089 = "Descartar";
        class32.field431 = " mais opções";
        field556 = "M";
        class60.field772 = "Examinar";
        class145.field2297 = "Carregando sprites - ";
        class280.field4449 = "Cancelar";
        class55.field704 = "M";
        class187.field2980 = "cyan:";
        class294.field4668 = "Não é possível encontrar ";
        class207.field3307 = "Universo de jogo criado";
        class17.field212 = "Texturas carregadas";
        class88.field1088 = "Fontes carregadas";
        class39.field478 = "Carregando...";
        class246.field4059 = "brilho2:";
        class278.field4411 = "Interfaces carregadas";
        class54.field688 = "flash2:";
        class134.field2110 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class148.field2336 = "Remova ";
        class166.field2682 = "rolagem:";
        class245.field4023 = "Memória alocada";
        class55.field697 = "Caminhar para cá";
        class230.field3828 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        class173.field2742 = "Carregando config - ";
        class34.field439 = "tremor:";
        if (arg0 != 10994) {
            field560 = -87;
        }
        class62.field813 = "Carregando. Aguarde.";
        class62.field812 = "roxo:";
        class200.field3165 = "Iniciando biblioteca 3D";
        class118.field1678 = "onda2:";
        class272.field4353 = "Tela título aberta";
        class51.field654 = "Gerenciador de entradas carregado";
        class129.field2074 = "deslizamento:";
        class196.field3130 = "Tentando reestabelecer conexão. Aguarde.";
        class46.field584 = "qualificação: ";
        class113.field1627 = "Virar para cá";
        class50.field648 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class234.field3877 = "Alocando memória";
        class82.field1014 = "Tela título carregada";
        class252.field4112 = "Carregando /secure/libs_v4s/RCras - ";
        class256.field4154 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class88.field1086 = "Aguarde...";
        class239.field3941 = "Lista de atualizações carregada";
        class209.field3344 = "Objeto para membros";
        class274.field4383 = "onda:";
        class92.field1162 = " ";
        class296.field4687 = "Carregando fontes - ";
        class247.field4066 = "Padrões carregados";
        class139.field2230 = " já está na sua lista de ignorados.";
        class189.field3064 = "vermelho:";
        class221.field3545 = "Carregando padrões - ";
        class178.field2830 = "Oculto";
        class207.field3316 = "Usar";
        class40.field503 = "K";
        class178.field2827 = " da sua lista de ignorados primeiro.";
        class225.field3615 = "flash1:";
        class98.field1298 = " saiu do jogo.";
        class191.field3077 = "Selecionar";
        class160.field2555 = "Continuar";
        class47.field593 = "Conectado ao servidor de atualização";
        class274.field4384 = "Carregando dados da lista de mundos";
        class240.field3950 = " entrou no jogo.";
        class152.field2355 = "Conexão perdida.";
        class256.field4146 = "Fechar";
        class265.field4268 = "Ok";
        class92.field1154 = "brilho3:";
        class8.field98 = "Carregando tela título - ";
        class98.field1295 = "Pacote de palavras carregado";
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)Log;")
    public static final class258 method250(int arg0, int arg1) {
        class258 var2 = (class258) class24.field325.method1469(8288, (long) arg0);
        field566++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class195.field3114.method928(11, (byte) 124, arg0);
        class258 var4 = new class258();
        if (var3 != null) {
            var4.method1761(0, new class96(var3));
        }
        class24.field325.method1467((byte) -119, var4, (long) arg0);
        return arg1 >= -38 ? null : var4;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBIIIIIIII)V")
    public static final void method251(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field559++;
        if (class116.field1653 <= arg0 && arg0 <= class114.field1634 && class116.field1653 <= arg4 && arg4 <= class114.field1634 && arg9 >= class116.field1653 && arg9 <= class114.field1634 && class116.field1653 <= arg7 && class114.field1634 >= arg7 && class117.field1656 <= arg3 && arg3 <= class132.field2105 && arg2 >= class117.field1656 && class132.field2105 >= arg2 && arg5 >= class117.field1656 && arg5 <= class132.field2105 && class117.field1656 <= arg6 && arg6 <= class132.field2105) {
            class213.method1496(arg4, arg7, arg3, arg6, arg0, arg8, arg2, arg5, arg9, 4096);
        } else {
            class74.method418(arg6, arg4, arg5, arg7, arg3, arg9, arg0, true, arg2, arg8);
        }
        if (arg1 <= 89) {
            field560 = 93;
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "([BI)V")
    public class44(byte[] arg0, int arg1) {
        this.field563 = class287.method1935(arg0, 123, arg0.length);
        if (this.field563 != arg1) {
            throw new RuntimeException();
        }
        this.method247(-6212, arg0);
    }
}
