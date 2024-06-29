import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class63 extends class176 {

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "[I")
    private int[] field880 = new int[16];

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "[I")
    public int[] field882 = new int[16];

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "[[Llj;")
    private class276[][] field881 = new class276[16][128];

    @OriginalMember(owner = "client!cl", name = "V", descriptor = "[I")
    private int[] field905 = new int[16];

    @OriginalMember(owner = "client!cl", name = "S", descriptor = "I")
    private int field902 = 256;

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
    private int field892 = 1000000;

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "[I")
    private int[] field894 = new int[16];

    @OriginalMember(owner = "client!cl", name = "U", descriptor = "[I")
    private int[] field904 = new int[16];

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "[I")
    private int[] field901 = new int[16];

    @OriginalMember(owner = "client!cl", name = "Z", descriptor = "[I")
    private int[] field909 = new int[16];

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "[I")
    public int[] field893 = new int[16];

    @OriginalMember(owner = "client!cl", name = "ib", descriptor = "[I")
    private int[] field918 = new int[16];

    @OriginalMember(owner = "client!cl", name = "Bb", descriptor = "[I")
    public int[] field937 = new int[16];

    @OriginalMember(owner = "client!cl", name = "xb", descriptor = "[[Llj;")
    private class276[][] field933 = new class276[16][128];

    @OriginalMember(owner = "client!cl", name = "Eb", descriptor = "[I")
    private int[] field940 = new int[16];

    @OriginalMember(owner = "client!cl", name = "gb", descriptor = "[I")
    private int[] field916 = new int[16];

    @OriginalMember(owner = "client!cl", name = "Nb", descriptor = "[I")
    private int[] field949 = new int[16];

    @OriginalMember(owner = "client!cl", name = "bb", descriptor = "[I")
    private int[] field911 = new int[16];

    @OriginalMember(owner = "client!cl", name = "Pb", descriptor = "[I")
    private int[] field951 = new int[16];

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "[I")
    private int[] field878 = new int[16];

    @OriginalMember(owner = "client!cl", name = "Rb", descriptor = "Lea;")
    private class325 field953 = new class325();

    @OriginalMember(owner = "client!cl", name = "Ub", descriptor = "Lam;")
    private class330 field956 = new class330(this);

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "Ljf;")
    private class227 field891 = new class227(128);

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field883 = null;

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
    public static int field889 = 0;

    @OriginalMember(owner = "client!cl", name = "nb", descriptor = "[Ljava/lang/String;")
    public static String[] field923 = new String[1000];

    @OriginalMember(owner = "client!cl", name = "Fb", descriptor = "I")
    public static int field941 = 0;

    @OriginalMember(owner = "client!cl", name = "N", descriptor = "[I")
    public static int[] field897 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!cl", name = "K", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!cl", name = "O", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!cl", name = "T", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!cl", name = "W", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!cl", name = "X", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!cl", name = "Y", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!cl", name = "ab", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!cl", name = "cb", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!cl", name = "db", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!cl", name = "eb", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!cl", name = "fb", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!cl", name = "hb", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!cl", name = "kb", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!cl", name = "lb", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!cl", name = "mb", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!cl", name = "ob", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!cl", name = "pb", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!cl", name = "qb", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!cl", name = "rb", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!cl", name = "sb", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!cl", name = "tb", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!cl", name = "ub", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!cl", name = "vb", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!cl", name = "wb", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!cl", name = "yb", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!cl", name = "zb", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!cl", name = "Ab", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!cl", name = "Cb", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!cl", name = "Db", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!cl", name = "Hb", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!cl", name = "Ib", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!cl", name = "Jb", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!cl", name = "Kb", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!cl", name = "Lb", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!cl", name = "Mb", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!cl", name = "Qb", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!cl", name = "Sb", descriptor = "I")
    private int field954;

    @OriginalMember(owner = "client!cl", name = "Wb", descriptor = "I")
    private int field958;

    @OriginalMember(owner = "client!cl", name = "Zb", descriptor = "I")
    private int field961;

    @OriginalMember(owner = "client!cl", name = "Tb", descriptor = "J")
    private long field955;

    @OriginalMember(owner = "client!cl", name = "Xb", descriptor = "J")
    private long field959;

    @OriginalMember(owner = "client!cl", name = "Yb", descriptor = "Lik;")
    private class327 field960;

    @OriginalMember(owner = "client!cl", name = "Ob", descriptor = "Ljm;")
    public static class69 field950;

    @OriginalMember(owner = "client!cl", name = "jb", descriptor = "Ljava/awt/Frame;")
    public static Frame field919;

    @OriginalMember(owner = "client!cl", name = "Vb", descriptor = "Z")
    private boolean field957;

    @OriginalMember(owner = "client!cl", name = "ac", descriptor = "Z")
    private boolean field962;

    @OriginalMember(owner = "client!cl", name = "Gb", descriptor = "[I")
    public static int[] field942;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIII)V", line = 5)
    public static final void method415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class225.field3597 = arg5;
        class277.field4276 = arg2;
        class45.field635 = arg0;
        class160.field2494 = arg1;
        class143.field2261 = arg4;
        field943++;
        if (arg3 <= 9) {
            field923 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V", line = 21)
    public final synchronized void method416(byte arg0) {
        if (arg0 != 97) {
            this.method427((class327) null, -81, true);
        }
        for (class165 var2 = (class165) this.field891.method1549((byte) -54); var2 != null; var2 = (class165) this.field891.method1546(-1)) {
            var2.method1128((byte) 87);
        }
        field926++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZILlj;)V", line = 41)
    public final void method417(boolean arg0, int arg1, class276 arg2) {
        field885++;
        int var4 = arg2.field4245.field1091.length;
        if (arg1 != 8) {
            this.method427((class327) null, -46, true);
        }
        int var6;
        if (arg0 && arg2.field4245.field1092) {
            int var5 = var4 + var4 - arg2.field4245.field1095;
            var6 = (int) ((long) this.field893[arg2.field4249] * (long) var5 >> 6);
            int var7 = var4 << 8;
            if (var6 >= var7) {
                var6 = var7 + var7 - var6 - 1;
                arg2.field4251.method2254(true);
            }
        } else {
            var6 = (int) ((long) this.field893[arg2.field4249] * (long) var4 >> 6);
        }
        arg2.field4251.method2247(var6);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIII)V", line = 76)
    private final void method418(int arg0, int arg1, int arg2, int arg3) {
        field929++;
        this.method422(64, arg2, arg3 ^ arg3, arg0);
        if ((this.field937[arg0] & 0x2) != 0) {
            for (class276 var5 = (class276) this.field956.field5104.method6(true); var5 != null; var5 = (class276) this.field956.field5104.method8(18820)) {
                if (var5.field4249 == arg0 && var5.field4256 < 0) {
                    this.field881[arg0][var5.field4242] = null;
                    this.field881[arg0][arg2] = var5;
                    int var6 = var5.field4264 + (var5.field4263 * var5.field4241 >> 12);
                    var5.field4264 += arg2 - var5.field4242 << 8;
                    var5.field4241 = var6 - var5.field4264;
                    var5.field4263 = 4096;
                    var5.field4242 = arg2;
                    return;
                }
            }
        }
        class165 var7 = (class165) this.field891.method1558((long) this.field916[arg0], false);
        if (var7 == null) {
            return;
        }
        class73 var8 = var7.field2543[arg2];
        if (var8 == null) {
            return;
        }
        class276 var9 = new class276();
        var9.field4249 = arg0;
        var9.field4245 = var8;
        var9.field4254 = var7;
        var9.field4266 = var7.field2531[arg2];
        var9.field4247 = var7.field2547[arg2];
        var9.field4242 = arg2;
        var9.field4268 = var7.field2541 * arg1 * arg1 * var7.field2542[arg2] + 1024 >> 11;
        var9.field4267 = var7.field2539[arg2] & 0xFF;
        var9.field4264 = (arg2 << 8) - (var7.field2546[arg2] & 0x7FFF);
        var9.field4256 = -1;
        var9.field4255 = 0;
        var9.field4259 = 0;
        var9.field4270 = 0;
        var9.field4244 = 0;
        if (this.field893[arg0] == 0) {
            var9.field4251 = class331.method2263(var8, this.method453(var9, -126), this.method441(var9, (byte) 25), this.method439((byte) 36, var9));
        } else {
            var9.field4251 = class331.method2263(var8, this.method453(var9, -127), 0, this.method439((byte) 36, var9));
            this.method417(var7.field2546[arg2] < 0, 8, var9);
        }
        if (var7.field2546[arg2] < 0) {
            var9.field4251.method2262(-1);
        }
        if (var9.field4247 >= 0) {
            class276 var10 = this.field933[arg0][var9.field4247];
            if (var10 != null && var10.field4256 < 0) {
                this.field881[arg0][var10.field4242] = null;
                var10.field4256 = 0;
            }
            this.field933[arg0][var9.field4247] = var9;
        }
        this.field956.field5104.method7((byte) -51, var9);
        this.field881[arg0][arg2] = var9;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V", line = 2089)
    public class63() {
        this.method444(true, 256, -1);
        this.method454(true, (byte) -44);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZ)V", line = 172)
    private final synchronized void method419(int arg0, boolean arg1) {
        field888++;
        this.field953.method2206();
        this.field960 = null;
        this.method454(arg1, (byte) -44);
        if (arg0 != 27285) {
            this.method449(-36, 49);
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V", line = 187)
    public static final void method420(int arg0) {
        field886++;
        class297.field4547 = null;
        class173.field2641 = (byte[][][]) null;
        class298.field4586 = (byte[][][]) null;
        class22.field276 = null;
        class138.field2143 = null;
        class3.field32 = null;
        class107.field1635 = null;
        class274.field4218 = (int[][][]) null;
        class192.field2908 = null;
        class58.field827 = (byte[][][]) null;
        class280.field4323 = (byte[][][]) null;
        class246.field3861 = (byte[][][]) null;
        if (arg0 != -100) {
            field950 = (class69) null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)V", line = 209)
    private final void method421(int arg0, byte arg1) {
        field948++;
        int var3 = -87 / ((73 - arg1) / 41);
        if (arg0 < 0) {
            for (int var4 = 0; var4 < 16; var4++) {
                this.method421(var4, (byte) 117);
            }
            return;
        }
        this.field951[arg0] = 12800;
        this.field909[arg0] = 8192;
        this.field905[arg0] = 16383;
        this.field894[arg0] = 8192;
        this.field901[arg0] = 0;
        this.field940[arg0] = 8192;
        this.method424(120, arg0);
        this.method449(arg0, -5052);
        this.field937[arg0] = 0;
        this.field949[arg0] = 32767;
        this.field918[arg0] = 256;
        this.field893[arg0] = 0;
        this.method451(arg0, 2097152, 8192);
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(IIII)V", line = 244)
    private final void method422(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            method428(false, -13);
        }
        field917++;
        class276 var5 = this.field881[arg3][arg1];
        if (var5 == null) {
            return;
        }
        this.field881[arg3][arg1] = null;
        if ((this.field937[arg3] & 0x2) == 0) {
            var5.field4256 = 0;
            return;
        }
        for (class276 var6 = (class276) this.field956.field5104.method10((byte) 116); var6 != null; var6 = (class276) this.field956.field5104.method13((byte) -32)) {
            if (var5.field4249 == var6.field4249 && var6.field4256 < 0 && var5 != var6) {
                var5.field4256 = 0;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "([III)V", line = 286)
    public final synchronized void method217(int[] arg0, int arg1, int arg2) {
        field935++;
        if (this.field953.method2199()) {
            int var4 = this.field953.field5057 * this.field892 / class282.field4337;
            do {
                long var5 = this.field959 + ((long) arg2 * (long) var4);
                if (this.field955 - var5 >= 0L) {
                    this.field959 = var5;
                    break;
                }
                int var7 = (int) ((this.field955 + ((long) var4) - this.field959 - 1L) / (long) var4);
                this.field959 += (long) var4 * (long) var7;
                arg2 -= var7;
                this.field956.method217(arg0, arg1, var7);
                arg1 += var7;
                this.method437(32716);
            } while (this.field953.method2199());
        }
        this.field956.method217(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIB)V", line = 327)
    private final void method423(int arg0, int arg1, byte arg2) {
        if (arg2 > -109) {
            method448(62);
        }
        field936++;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V", line = 337)
    public final synchronized void method211(int arg0) {
        field945++;
        if (this.field953.method2199()) {
            int var2 = this.field953.field5057 * this.field892 / class282.field4337;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field959;
                if (this.field955 - var3 >= 0L) {
                    this.field959 = var3;
                    break;
                }
                int var5 = (int) ((this.field955 - (this.field959 - (long) var2) - 1L) / (long) var2);
                arg0 -= var5;
                this.field959 += (long) var2 * (long) var5;
                this.field956.method211(var5);
                this.method437(32716);
            } while (this.field953.method2199());
        }
        this.field956.method211(arg0);
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "()I", line = 374)
    public final synchronized int method216() {
        field912++;
        return 0;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)V", line = 382)
    private final void method424(int arg0, int arg1) {
        field910++;
        if ((this.field937[arg1] & 0x2) != 0) {
            for (class276 var3 = (class276) this.field956.field5104.method10((byte) 92); var3 != null; var3 = (class276) this.field956.field5104.method13((byte) -32)) {
                if (var3.field4249 == arg1 && this.field881[arg1][var3.field4242] == null && var3.field4256 < 0) {
                    var3.field4256 = 0;
                }
            }
        }
        if (arg0 <= 106) {
            this.field955 = -112L;
        }
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)V", line = 427)
    public static final void method425(int arg0) {
        class304.field4751 = "Carregando padrões - ";
        class170.field2589 = "onda2:";
        class40.field572 = "amarelo:";
        class187.field2842 = "Remova ";
        class93.field1436 = "M";
        class255.field3991 = "Sprites carregados";
        class299.field4641 = " ";
        class282.field4336 = "Virar para cá";
        class306.field4801 = "Caminhar para cá";
        class330.field5114 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class152.field2411 = " saiu do jogo.";
        class266.field4102 = "Iniciando biblioteca 3D";
        class231.field3723 = "Objeto para membros";
        class233.field3749 = "tremor:";
        class190.field2899 = "vermelho:";
        class154.field2416 = "Padrões carregados";
        class169.field2580 = "Interfaces carregadas";
        class334.field5190 = "Conectando ao servidor de atualização";
        class40.field573 = "Gerenciador de entradas carregado";
        if (arg0 >= -68) {
            field883 = (String[]) null;
        }
        class82.field1224 = "Selecionar opção";
        class77.field1149 = "Ok";
        class161.field2498 = "flash2:";
        class106.field1622 = "Memória alocada";
        class84.field1280 = "Config carregada";
        class51.field730 = "brilho3:";
        class264.field4066 = "deslizamento:";
        class246.field3855 = "Fechar";
        class35.field450 = " da sua lista de amigos primeiro.";
        field921++;
        class110.field1701 = "Conectado ao servidor de atualização";
        class282.field4330 = "Lista de atualizações carregada";
        class23.field297 = "Conexão perdida.";
        class280.field4326 = "Examinar";
        class262.field4055 = "Carregando dados da lista de mundos";
        class105.field1613 = "rolagem:";
        class294.field4542 = "K";
        class107.field1644 = "brilho1:";
        class27.field353 = "qualificação: ";
        class79.field1176 = "Cancelar";
        class200.field3016 = "Carregando. Aguarde.";
        class124.field1936 = "verde:";
        class190.field2892 = " já está na sua lista de amigos.";
        class228.field3657 = "Oculto";
        class174.field2642 = "brilho3:";
        class231.field3726 = "habilidade: ";
        class26.field340 = "Carregando fontes - ";
        class158.field2465 = "M";
        class82.field1244 = "Carregando pacote de palavras - ";
        class164.field2530 = "Aguarde...";
        class220.field3498 = "Continuar";
        class143.field2265 = "Alocando memória";
        class305.field4768 = "brilho2:";
        class334.field5201 = "Descartar";
        class3.field29 = "Tela título aberta";
        class329.field5088 = "Carregando interfaces - ";
        class330.field5099 = "Universo de jogo criado";
        class15.field157 = " mais opções";
        class177.field2693 = " entrou no jogo.";
        class285.field4373 = "Tela título carregada";
        class26.field338 = "Carregando tela título - ";
        class108.field1670 = "Carregando...";
        class125.field1951 = "Pegar";
        class332.field5141 = "Biblioteca 3D iniciada";
        class229.field3688 = "deseja negociar com você.";
        class136.field2110 = "flash1:";
        class125.field1950 = "Fontes carregadas";
        class130.field2027 = "Texturas carregadas";
        class317.field4982 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class205.field3093 = "Pacote de palavras carregado";
        class309.field4859 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        class293.field4511 = "Atacar";
        class69.field1028 = "Tentando reestabelecer conexão. Aguarde.";
        class203.field3062 = "Selecionar";
        class82.field1217 = "Usar";
        class332.field5137 = " da sua lista de ignorados primeiro.";
        class185.field2832 = "nível: ";
        class132.field2090 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class29.field363 = "Carregando sprites - ";
        class338.field5231 = "Mecanismo de som preparado";
        class51.field731 = "Dados da lista de mundos carregados";
        class133.field2101 = "onda:";
        class259.field4028 = "RuneScape carregando. Aguarde...";
        class24.field303 = "Carregando /secure/libs_v4s/RCras - ";
        class155.field2438 = "branco:";
        class23.field287 = "roxo:";
        class89.field1357 = "cyan:";
        class123.field1924 = "Não é possível encontrar ";
        class307.field4835 = "Remova ";
        class275.field4240 = " já está na sua lista de ignorados.";
        class106.field1628 = "K";
        class150.field2366 = "Carregando config - ";
        class247.field3885 = "Verificando atualizações - ";
        class177.field2712 = "Largar";
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(III)V", line = 751)
    public final synchronized void method426(int arg0, int arg1, int arg2) {
        this.method445(arg2, arg0, arg1);
        field931++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lik;IZ)V", line = 759)
    public final synchronized void method427(class327 arg0, int arg1, boolean arg2) {
        this.method450(arg0, true, 0, arg2);
        field890++;
        if (arg1 != -15879) {
            this.method220();
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)Lj;", line = 771)
    public static final class148 method428(boolean arg0, int arg1) {
        if (arg0) {
            field883 = (String[]) null;
        }
        field914++;
        class148 var2 = (class148) class255.field3981.method1294((long) arg1, 116);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class3.field33.method2103(0, class19.method151(arg1, (byte) 55), class117.method806(arg0, arg1));
        class148 var4 = new class148();
        var4.field2343 = arg1;
        if (var3 != null) {
            var4.method1043(new class303(var3), 48);
        }
        class255.field3981.method1292((long) arg1, -127, var4);
        return var4;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(III)V", line = 796)
    private final void method429(int arg0, int arg1, int arg2) {
        this.field894[arg1] = arg2;
        if (arg0 >= -78) {
            this.method417(true, 124, (class276) null);
        }
        field939++;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)V", line = 814)
    private final void method430(int arg0, int arg1) {
        class276 var3 = (class276) this.field956.field5104.method10((byte) 123);
        if (arg0 <= 62) {
            field877 = -50;
        }
        while (var3 != null) {
            if (arg1 < 0 || var3.field4249 == arg1) {
                if (var3.field4251 != null) {
                    var3.field4251.method2259(class282.field4337 / 100);
                    if (var3.field4251.method2271()) {
                        this.field956.field5116.method214(var3.field4251);
                    }
                    var3.method1811(0);
                }
                if (var3.field4256 < 0) {
                    this.field881[var3.field4249][var3.field4242] = null;
                }
                var3.method1284(0);
            }
            var3 = (class276) this.field956.field5104.method13((byte) -32);
        }
        field952++;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(IIIIIIII)V", line = 849)
    public static final void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field932++;
        if (class256.field3995 <= arg3 && arg1 <= class118.field1834 && class323.field5030 <= arg6 && arg2 <= class88.field1324) {
            class83.method573(arg1, arg0, 2011948108, arg2, arg5, arg4, arg3, arg6);
        } else {
            class237.method1615(-112, arg2, arg3, arg5, arg0, arg6, arg4, arg1);
        }
        if (arg7 < 124) {
            field883 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(ZI)V", line = 872)
    private final void method432(boolean arg0, int arg1) {
        int var3 = arg1 & 0xF0;
        field899++;
        if (var3 == 128) {
            int var22 = arg1 >> 16 & 0x7F;
            int var23 = arg1 >> 8 & 0x7F;
            int var24 = arg1 & 0xF;
            this.method422(var22, var23, 0, var24);
            return;
        }
        if (!arg0) {
            this.field882 = (int[]) null;
        }
        if (var3 == 144) {
            int var4 = (arg1 & 0x7FCD) >> 8;
            int var5 = arg1 >> 16 & 0x7F;
            int var6 = arg1 & 0xF;
            if (var5 <= 0) {
                this.method422(64, var4, 0, var6);
            } else {
                this.method418(var6, var5, var4, -1929503189);
            }
        } else if (var3 == 160) {
            int var7 = arg1 & 0xF;
            int var8 = (arg1 & 0x7FC0) >> 8;
            int var9 = (arg1 & 0x7FE96E) >> 16;
            this.method456(var8, var7, 118, var9);
        } else if (var3 == 176) {
            int var10 = arg1 >> 16 & 0x7F;
            int var11 = (arg1 & 0x7FA0) >> 8;
            int var12 = arg1 & 0xF;
            if (var11 == 0) {
                this.field880[var12] = class311.method2135(this.field880[var12], -2080769) + (var10 << 14);
            }
            if (var11 == 32) {
                this.field880[var12] = class311.method2135(-16257, this.field880[var12]) + (var10 << 7);
            }
            if (var11 == 1) {
                this.field901[var12] = (var10 << 7) + class311.method2135(this.field901[var12], -16257);
            }
            if (var11 == 33) {
                this.field901[var12] = var10 + class311.method2135(-128, this.field901[var12]);
            }
            if (var11 == 5) {
                this.field940[var12] = (var10 << 7) + class311.method2135(this.field940[var12], -16257);
            }
            if (var11 == 37) {
                this.field940[var12] = class311.method2135(-128, this.field940[var12]) + var10;
            }
            if (var11 == 7) {
                this.field951[var12] = (var10 << 7) + class311.method2135(this.field951[var12], -16257);
            }
            if (var11 == 39) {
                this.field951[var12] = class311.method2135(-128, this.field951[var12]) + var10;
            }
            if (var11 == 10) {
                this.field909[var12] = class311.method2135(-16257, this.field909[var12]) + (var10 << 7);
            }
            if (var11 == 42) {
                this.field909[var12] = var10 + class311.method2135(this.field909[var12], -128);
            }
            if (var11 == 11) {
                this.field905[var12] = (var10 << 7) + class311.method2135(-16257, this.field905[var12]);
            }
            if (var11 == 43) {
                this.field905[var12] = var10 + class311.method2135(this.field905[var12], -128);
            }
            if (var11 == 64) {
                if (var10 < 64) {
                    this.field937[var12] = class311.method2135(this.field937[var12], -2);
                } else {
                    this.field937[var12] = class276.method1810(this.field937[var12], 1);
                }
            }
            if (var11 == 65) {
                if (var10 >= 64) {
                    this.field937[var12] = class276.method1810(this.field937[var12], 2);
                } else {
                    this.method424(113, var12);
                    this.field937[var12] = class311.method2135(this.field937[var12], -3);
                }
            }
            if (var11 == 99) {
                this.field949[var12] = class311.method2135(127, this.field949[var12]) + (var10 << 7);
            }
            if (var11 == 98) {
                this.field949[var12] = class311.method2135(16256, this.field949[var12]) + var10;
            }
            if (var11 == 101) {
                this.field949[var12] = (var10 << 7) + class311.method2135(127, this.field949[var12]) + 16384;
            }
            if (var11 == 100) {
                this.field949[var12] = var10 + (class311.method2135(16256, this.field949[var12]) + 16384);
            }
            if (var11 == 120) {
                this.method430(89, var12);
            }
            if (var11 == 121) {
                this.method421(var12, (byte) 122);
            }
            if (var11 == 123) {
                this.method438(1025326728, var12);
            }
            if (var11 == 6) {
                int var13 = this.field949[var12];
                if (var13 == 16384) {
                    this.field918[var12] = class311.method2135(this.field918[var12], -16257) + (var10 << 7);
                }
            }
            if (var11 == 38) {
                int var14 = this.field949[var12];
                if (var14 == 16384) {
                    this.field918[var12] = class311.method2135(-128, this.field918[var12]) + var10;
                }
            }
            if (var11 == 16) {
                this.field893[var12] = class311.method2135(-16257, this.field893[var12]) + (var10 << 7);
            }
            if (var11 == 48) {
                this.field893[var12] = class311.method2135(-128, this.field893[var12]) + var10;
            }
            if (var11 == 81) {
                if (var10 >= 64) {
                    this.field937[var12] = class276.method1810(this.field937[var12], 4);
                } else {
                    this.method449(var12, -5052);
                    this.field937[var12] = class311.method2135(this.field937[var12], -5);
                }
            }
            if (var11 == 17) {
                this.method451(var12, 2097152, (this.field904[var12] & 0xFFFFC07F) + (var10 << 7));
            }
            if (var11 == 49) {
                this.method451(var12, 2097152, (this.field904[var12] & 0xFFFFFF80) + var10);
            }
        } else if (var3 == 192) {
            int var20 = arg1 & 0xF;
            int var21 = (arg1 & 0x7F26) >> 8;
            this.method446(var20, 0, this.field880[var20] + var21);
        } else if (var3 == 208) {
            int var15 = arg1 & 0xF;
            int var16 = (arg1 & 0x7FCC) >> 8;
            this.method423(var15, var16, (byte) -126);
        } else if (var3 == 224) {
            int var18 = arg1 & 0xF;
            int var19 = (arg1 >> 8 & 0x7F) + (arg1 >> 9 & 0x3F80);
            this.method429(-80, var18, var19);
        } else {
            int var17 = arg1 & 0xFF;
            if (var17 == 255) {
                this.method454(true, (byte) -44);
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III[ILlj;)Z", line = 1110)
    public final boolean method433(int arg0, int arg1, int arg2, int[] arg3, class276 arg4) {
        arg4.field4261 = class282.field4337 / 100;
        field913++;
        if (arg4.field4256 >= 0 && arg4.field4251 == null || arg4.field4251.method2256()) {
            arg4.method1811(0);
            arg4.method1284(0);
            if (arg4.field4247 > 0 && this.field933[arg4.field4249][arg4.field4247] == arg4) {
                this.field933[arg4.field4249][arg4.field4247] = null;
            }
            return true;
        }
        int var6 = arg4.field4263;
        if (arg2 != 128) {
            this.method456(-122, 86, 41, 71);
        }
        if (var6 > 0) {
            int var7 = var6 - (int) (Math.pow(2.0D, (double) this.field940[arg4.field4249] * 4.921259842519685E-4D) * 16.0D + 0.5D);
            if (var7 < 0) {
                var7 = 0;
            }
            arg4.field4263 = var7;
        }
        boolean var8 = false;
        arg4.field4251.method2258(this.method453(arg4, -122));
        double var9 = (double) ((arg4.field4242 - 60 << 8) + (arg4.field4263 * arg4.field4241 >> 12)) * 5.086263020833333E-6D;
        class109 var11 = arg4.field4266;
        arg4.field4258++;
        arg4.field4250 += var11.field1684;
        if (var11.field1688 > 0) {
            if (var11.field1681 <= 0) {
                arg4.field4244 += 128;
            } else {
                arg4.field4244 += (int) (Math.pow(2.0D, (double) var11.field1681 * var9) * 128.0D + 0.5D);
            }
            if (arg4.field4244 * var11.field1688 >= 819200) {
                var8 = true;
            }
        }
        if (var11.field1690 != null) {
            if (var11.field1678 <= 0) {
                arg4.field4255 += 128;
            } else {
                arg4.field4255 += (int) (Math.pow(2.0D, (double) var11.field1678 * var9) * 128.0D + 0.5D);
            }
            while ((var11.field1690.length - 2) > arg4.field4259 && (var11.field1690[arg4.field4259 + 2] & 0xFF << 8) < arg4.field4255) {
                arg4.field4259 += 2;
            }
            if (var11.field1690.length - 2 == arg4.field4259 && var11.field1690[arg4.field4259 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg4.field4256 >= 0 && var11.field1686 != null && (this.field937[arg4.field4249] & 0x1) == 0 && (arg4.field4247 < 0 || this.field933[arg4.field4249][arg4.field4247] != arg4)) {
            if (var11.field1680 <= 0) {
                arg4.field4256 += 128;
            } else {
                arg4.field4256 += (int) (Math.pow(2.0D, (double) var11.field1680 * var9) * 128.0D + 0.5D);
            }
            while (arg4.field4270 < var11.field1686.length - 2 && arg4.field4256 > (var11.field1686[arg4.field4270 + 2] & 0xFF) << 8) {
                arg4.field4270 += 2;
            }
            if ((var11.field1686.length - 2) == arg4.field4270) {
                var8 = true;
            }
        }
        if (!var8) {
            arg4.field4251.method2257(arg4.field4261, this.method441(arg4, (byte) 27), this.method439((byte) 36, arg4));
            return false;
        }
        arg4.field4251.method2259(arg4.field4261);
        if (arg3 == null) {
            arg4.field4251.method211(arg0);
        } else {
            arg4.field4251.method217(arg3, arg1, arg0);
        }
        if (arg4.field4251.method2271()) {
            this.field956.field5116.method214(arg4.field4251);
        }
        arg4.method1811(0);
        if (arg4.field4256 >= 0) {
            arg4.method1284(0);
            if (arg4.field4247 > 0 && this.field933[arg4.field4249][arg4.field4247] == arg4) {
                this.field933[arg4.field4249][arg4.field4247] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLlj;)Z", line = 1240)
    public final boolean method434(byte arg0, class276 arg1) {
        if (arg0 > -81) {
            this.field956 = (class330) null;
        }
        field922++;
        if (arg1.field4251 != null) {
            return false;
        }
        if (arg1.field4256 >= 0) {
            arg1.method1284(0);
            if (arg1.field4247 > 0 && this.field933[arg1.field4249][arg1.field4247] == arg1) {
                this.field933[arg1.field4249][arg1.field4247] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(II)V", line = 1273)
    public final synchronized void method435(int arg0, int arg1) {
        this.field902 = arg1;
        field946++;
        if (arg0 != 8) {
            this.method440(10);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLw;Lik;ILwf;)Z", line = 1286)
    public final synchronized boolean method436(byte arg0, class210 arg1, class327 arg2, int arg3, class306 arg4) {
        arg2.method2221();
        field924++;
        int[] var6 = null;
        boolean var7 = true;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class220 var8 = (class220) arg2.field5075.method1549((byte) 93); var8 != null; var8 = (class220) arg2.field5075.method1546(-1)) {
            int var9 = (int) var8.field2852;
            class165 var10 = (class165) this.field891.method1558((long) var9, false);
            if (var10 == null) {
                var10 = class115.method796(85, var9, arg4);
                if (var10 == null) {
                    var7 = false;
                    continue;
                }
                this.field891.method1550(var10, (long) var9, (byte) 101);
            }
            if (!var10.method1126(var6, var8.field3494, arg1, 0)) {
                var7 = false;
            }
        }
        if (arg0 != -120) {
            this.method434((byte) 91, (class276) null);
        }
        if (var7) {
            arg2.method2222();
        }
        return var7;
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V", line = 1349)
    private final void method437(int arg0) {
        field934++;
        int var2 = this.field954;
        long var3 = this.field955;
        int var5 = this.field958;
        if (this.field960 != null && this.field961 == var5) {
            this.method450(this.field960, this.field962, 0, this.field957);
            this.method437(32716);
            return;
        }
        while (this.field958 == var5) {
            while (this.field953.field5055[var2] == var5) {
                this.field953.method2196(var2);
                int var6 = this.field953.method2200(var2);
                if (var6 == 1) {
                    this.field953.method2207();
                    this.field953.method2198(var2);
                    if (this.field953.method2203()) {
                        if (this.field960 != null) {
                            this.method427(this.field960, -15879, this.field957);
                            this.method437(32716);
                            return;
                        }
                        if (!this.field957 || var5 == 0) {
                            this.method454(true, (byte) -44);
                            this.field953.method2206();
                            return;
                        }
                        this.field953.method2201(var3);
                    }
                    break;
                }
                if ((var6 & 0x80) != 0) {
                    this.method432(true, var6);
                }
                this.field953.method2193(var2);
                this.field953.method2198(var2);
            }
            var2 = this.field953.method2205();
            var5 = this.field953.field5055[var2];
            var3 = this.field953.method2204(var5);
        }
        if (arg0 != 32716) {
            return;
        }
        this.field955 = var3;
        this.field954 = var2;
        this.field958 = var5;
        if (this.field960 != null && var5 > this.field961) {
            this.field958 = this.field961;
            this.field954 = -1;
            this.field955 = this.field953.method2204(this.field958);
        }
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(II)V", line = 1436)
    private final void method438(int arg0, int arg1) {
        if (arg0 != 1025326728) {
            return;
        }
        for (class276 var3 = (class276) this.field956.field5104.method10((byte) 58); var3 != null; var3 = (class276) this.field956.field5104.method13((byte) -32)) {
            if ((arg1 < 0 || var3.field4249 == arg1) && var3.field4256 < 0) {
                this.field881[var3.field4249][var3.field4242] = null;
                var3.field4256 = 0;
            }
        }
        field930++;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(BLlj;)I", line = 1462)
    private final int method439(byte arg0, class276 arg1) {
        field927++;
        if (arg0 == 36) {
            int var3 = this.field909[arg1.field4249];
            return var3 >= 8192 ? 16384 - ((128 - arg1.field4267) * (16384 - var3) + 32 >> 6) : arg1.field4267 * var3 - -32 >> 6;
        } else {
            return 67;
        }
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)I", line = 1479)
    public final int method440(int arg0) {
        if (arg0 != 2) {
            this.method419(-21, true);
        }
        field925++;
        return this.field902;
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "()Lic;", line = 1491)
    public final synchronized class176 method213() {
        field907++;
        return null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Llj;B)I", line = 1501)
    private final int method441(class276 arg0, byte arg1) {
        field879++;
        if (this.field878[arg0.field4249] == 0) {
            return 0;
        }
        int var3 = this.field951[arg0.field4249] * this.field905[arg0.field4249] + 4096 >> 13;
        class109 var4 = arg0.field4266;
        int var5 = var3 * var3 + 16384 >> 15;
        int var6 = arg0.field4268 * var5 + 16384 >> 15;
        if (arg1 < 0) {
            this.method445(-64, -50, -46);
        }
        int var7 = this.field902 * var6 + 128 >> 8;
        int var8 = this.field878[arg0.field4249] * var7 + 128 >> 8;
        if (var4.field1688 > 0) {
            var8 = (int) ((double) var8 * Math.pow(0.5D, (double) arg0.field4244 * 1.953125E-5D * (double) var4.field1688) + 0.5D);
        }
        if (var4.field1690 != null) {
            int var9 = var4.field1690[arg0.field4259 + 1];
            int var10 = arg0.field4255;
            if (arg0.field4259 < (var4.field1690.length - 2)) {
                int var11 = (var4.field1690[arg0.field4259] & 0xFF) << 8;
                int var12 = (var4.field1690[arg0.field4259 + 2] & 0xFF) << 8;
                var9 += (var4.field1690[arg0.field4259 + 3] - var9) * (var10 - var11) / (var12 - var11);
            }
            var8 = var8 * var9 + 32 >> 6;
        }
        if (arg0.field4256 > 0 && var4.field1686 != null) {
            int var13 = arg0.field4256;
            int var14 = var4.field1686[arg0.field4270 + 1];
            if (arg0.field4270 < var4.field1686.length - 2) {
                int var15 = var4.field1686[arg0.field4270] & 0xFF << 8;
                int var16 = (var4.field1686[arg0.field4270 + 2] & 0xFF) << 8;
                var14 += (var4.field1686[arg0.field4270 + 3] - var14) * (var13 - var15) / (var16 - var15);
            }
            var8 = var8 * var14 + 32 >> 6;
        }
        return var8;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I", line = 1579)
    public static final int method442(int arg0, String arg1, String arg2, int arg3) {
        field895++;
        int var4 = arg2.length();
        int var5 = 0;
        char var6 = 0;
        int var7 = arg1.length();
        int var8 = 0;
        int var9 = -17 / ((-arg0 - 20) / 63);
        char var10 = 0;
        while (var5 - var6 < var4 || var8 - var10 < var7) {
            if (var4 <= (var5 - var6)) {
                return -1;
            }
            if (var7 <= var8 - var10) {
                return 1;
            }
            char var23;
            if (var6 == '\u0000') {
                var23 = arg2.charAt(var5++);
            } else {
                var23 = var6;
                boolean var24 = false;
            }
            char var25;
            if (var10 == '\u0000') {
                var25 = arg1.charAt(var8++);
            } else {
                var25 = var10;
                boolean var26 = false;
            }
            var6 = class83.method572(var23, (byte) 114);
            var10 = class83.method572(var25, (byte) 95);
            char var27 = class37.method266(arg3, var23, 110);
            char var28 = class37.method266(arg3, var25, 110);
            if (var27 != var28 && Character.toUpperCase(var27) != Character.toUpperCase(var28)) {
                char var29 = Character.toLowerCase(var27);
                char var30 = Character.toLowerCase(var28);
                if (var29 != var30) {
                    return class92.method630(-1, arg3, var29) - class92.method630(-1, arg3, var30);
                }
            }
        }
        int var11 = Math.min(var4, var7);
        for (int var12 = 0; var12 < var11; var12++) {
            int var13;
            int var14;
            if (arg3 == 2) {
                var13 = var7 - var12 - 1;
                var14 = var4 - var12 - 1;
            } else {
                var13 = var12;
                var14 = var12;
            }
            char var15 = arg2.charAt(var14);
            char var16 = arg1.charAt(var13);
            if (var15 != var16 && Character.toUpperCase(var15) != Character.toUpperCase(var16)) {
                char var17 = Character.toLowerCase(var15);
                char var18 = Character.toLowerCase(var16);
                if (var17 != var18) {
                    return class92.method630(-1, arg3, var17) - class92.method630(-1, arg3, var18);
                }
            }
        }
        int var19 = var4 - var7;
        if (var19 != 0) {
            return var19;
        }
        for (int var20 = 0; var20 < var11; var20++) {
            char var21 = arg2.charAt(var20);
            char var22 = arg1.charAt(var20);
            if (var21 != var22) {
                return class92.method630(-1, arg3, var21) - class92.method630(-1, arg3, var22);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "(I)V", line = 1706)
    public final synchronized void method443(int arg0) {
        if (arg0 == 127) {
            this.method419(27285, true);
            field906++;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZII)V", line = 1724)
    private final synchronized void method444(boolean arg0, int arg1, int arg2) {
        field944++;
        if (arg2 < 0) {
            for (int var4 = 0; var4 < 16; var4++) {
                this.field878[var4] = arg1;
            }
        } else {
            this.field878[arg2] = arg1;
        }
        if (!arg0) {
            this.method435(16, -3);
        }
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(III)V", line = 1747)
    private final void method445(int arg0, int arg1, int arg2) {
        field947++;
        this.field911[arg1] = arg0;
        this.field880[arg1] = class311.method2135(arg0, -128);
        if (arg2 == 128) {
            this.method446(arg1, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(III)V", line = 1769)
    private final void method446(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            return;
        }
        if (this.field916[arg0] != arg2) {
            this.field916[arg0] = arg2;
            for (int var4 = 0; var4 < 128; var4++) {
                this.field933[arg0][var4] = null;
            }
        }
        field903++;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(ZI)I", line = 1792)
    public static final int method447(boolean arg0, int arg1) {
        field908++;
        if (arg1 > 0) {
            return 1;
        } else if (arg0) {
            return -33;
        } else if (arg1 >= 0) {
            return 0;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "(I)V", line = 1814)
    public static void method448(int arg0) {
        field942 = null;
        field897 = null;
        field923 = null;
        if (arg0 != -527009460) {
            method442(-79, (String) null, (String) null, -25);
        }
        field950 = null;
        field883 = null;
        field919 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "()Lic;", line = 1830)
    public final synchronized class176 method220() {
        field900++;
        return this.field956;
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(II)V", line = 1839)
    private final void method449(int arg0, int arg1) {
        if (arg1 != -5052) {
            this.method419(97, true);
        }
        field898++;
        if ((this.field937[arg0] & 0x4) == 0) {
            return;
        }
        for (class276 var3 = (class276) this.field956.field5104.method10((byte) 45); var3 != null; var3 = (class276) this.field956.field5104.method13((byte) -32)) {
            if (var3.field4249 == arg0) {
                var3.field4246 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lik;ZIZ)V", line = 1881)
    private final synchronized void method450(class327 arg0, boolean arg1, int arg2, boolean arg3) {
        field884++;
        this.method419(arg2 ^ 0x6A95, arg1);
        this.field953.method2194(arg0.field5076);
        this.field959 = (long) arg2;
        this.field957 = arg3;
        int var5 = this.field953.method2197();
        for (int var6 = 0; var6 < var5; var6++) {
            this.field953.method2196(var6);
            this.field953.method2193(var6);
            this.field953.method2198(var6);
        }
        this.field954 = this.field953.method2205();
        this.field958 = this.field953.field5055[this.field954];
        this.field955 = this.field953.method2204(this.field958);
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(III)V", line = 1912)
    private final void method451(int arg0, int arg1, int arg2) {
        field920++;
        this.field904[arg0] = arg2;
        this.field882[arg0] = (int) (Math.pow(2.0D, (double) arg2 * 5.4931640625E-4D) * (double) arg1 + 0.5D);
    }

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "(I)Z", line = 1936)
    public final synchronized boolean method452(int arg0) {
        field915++;
        if (arg0 != -1) {
            field883 = (String[]) null;
        }
        return this.field953.method2199();
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Llj;I)I", line = 1959)
    private final int method453(class276 arg0, int arg1) {
        int var3 = (arg0.field4263 * arg0.field4241 >> 12) + arg0.field4264;
        field887++;
        class109 var4 = arg0.field4266;
        int var5 = ((this.field894[arg0.field4249] - 8192) * this.field918[arg0.field4249] >> 12) + var3;
        if (arg1 >= -114) {
            this.field916 = (int[]) null;
        }
        if (var4.field1684 > 0 && (var4.field1689 > 0 || this.field901[arg0.field4249] > 0)) {
            int var6 = var4.field1683 << 1;
            int var7 = var4.field1689 << 2;
            if (arg0.field4258 < var6) {
                var7 = arg0.field4258 * var7 / var6;
            }
            int var8 = (this.field901[arg0.field4249] >> 7) + var7;
            double var9 = Math.sin((double) (arg0.field4250 & 0x1FF) * 0.01227184630308513D);
            var5 += (int) ((double) var8 * var9);
        }
        int var11 = (int) ((double) (arg0.field4245.field1094 * 256) * Math.pow(2.0D, (double) var5 * 3.255208333333333E-4D) / (double) class282.field4337 + 0.5D);
        return var11 < 1 ? 1 : var11;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZB)V", line = 2006)
    private final void method454(boolean arg0, byte arg1) {
        field938++;
        if (arg0) {
            this.method430(71, -1);
        } else {
            this.method438(arg1 + 1025326772, -1);
        }
        this.method421(-1, (byte) -67);
        for (int var3 = 0; var3 < 16; var3++) {
            this.field916[var3] = this.field911[var3];
        }
        int var4 = 0;
        if (arg1 == -44) {
            while (var4 < 16) {
                this.field880[var4] = class311.method2135(this.field911[var4], -128);
                var4++;
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(Z)V", line = 2047)
    public final synchronized void method455(boolean arg0) {
        for (class165 var2 = (class165) this.field891.method1549((byte) 90); var2 != null; var2 = (class165) this.field891.method1546(-1)) {
            var2.method1284(0);
        }
        if (!arg0) {
            method420(-74);
        }
        field896++;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(IIII)V", line = 2065)
    private final void method456(int arg0, int arg1, int arg2, int arg3) {
        field928++;
        if (arg2 < 75) {
            this.method220();
        }
    }
}
