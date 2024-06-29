import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class333 implements class203 {

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "Lta;")
    private class300 field5287 = new class300(256);

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "Lth;")
    private class57 field5285;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "Lth;")
    private class57 field5280;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "[Ljd;")
    private class280[] field5277;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "Z")
    public static boolean field5283 = false;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field5278 = 0;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field5275 = 0;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "C")
    public static char field5286;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIZIFI)[I", line = 8)
    public final int[] method1560(int arg0, int arg1, boolean arg2, int arg3, float arg4, int arg5) {
        field5282++;
        int var7 = -24 % ((arg5 + 17) / 35);
        return this.method781(arg0, 255).method2389(this, arg3, this.field5277[arg0].field4602, arg1, (double) arg4, arg2, this.field5280, (byte) 63);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([I[Ljava/lang/Object;I)V", line = 21)
    public static final void method2335(int[] arg0, Object[] arg1, int arg2) {
        if (arg2 == -26941) {
            class206.method1573(arg0, arg1, arg0.length - 1, 0, -12359);
            field5274++;
        }
    }

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "(II)Ljb;", line = 37)
    public class340 method781(int arg0, int arg1) {
        field5284++;
        class172 var3 = this.field5287.method2147((byte) 57, (long) arg0);
        if (var3 != null) {
            return (class340) var3;
        }
        if (arg1 != 255) {
            this.field5287 = (class300) null;
        }
        byte[] var4 = this.field5285.method476((byte) -7, arg0);
        if (var4 == null) {
            return null;
        } else {
            class340 var5 = new class340(new class227(var4));
            this.field5287.method2149(var5, arg1 ^ 0xFFFF8032, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V", line = 68)
    public static final void method2336(boolean arg0) {
        class257.field4314 = "onda2:";
        class74.field1260 = "Caminhar para cá";
        class236.field3916 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        if (!arg0) {
            method2335((int[]) null, (Object[]) null, -68);
        }
        class160.field2547 = " da sua lista de amigos primeiro.";
        class65.field1161 = "Fontes carregadas";
        class56.field940 = "habilidade: ";
        class102.field1663 = "vermelho:";
        class163.field2577 = "Biblioteca 3D iniciada";
        class352.field5583 = "K";
        class138.field2277 = "Iniciando biblioteca 3D";
        class160.field2548 = "RuneScape carregando. Aguarde...";
        class46.field748 = "M";
        class318.field5067 = "Fechar";
        class355.field5637 = "rolagem:";
        class7.field67 = "Carregando interfaces - ";
        class230.field3832 = "Remova ";
        class327.field5198 = "Examinar";
        class52.field861 = "branco:";
        class182.field2928 = "Objeto para membros";
        class2.field15 = "Dados da lista de mundos carregados";
        class209.field3284 = "Selecionar opção";
        class40.field592 = "Oculto";
        class270.field4493 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class350.field5562 = "Verificando atualizações - ";
        class245.field4029 = "qualificação: ";
        class172.field2747 = "Atacar";
        class272.field4519 = "Continuar";
        class285.field4659 = "verde:";
        class347.field5524 = "Carregando...";
        class54.field901 = "Universo de jogo criado";
        class127.field2157 = "cyan:";
        class131.field2234 = "Carregando /secure/libs_v4s/RCras - ";
        class335.field5303 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        class327.field5191 = "Descartar";
        class173.field2760 = " já está na sua lista de ignorados.";
        class213.field3396 = "Interfaces carregadas";
        class350.field5570 = "Carregando sprites - ";
        field5281++;
        class251.field4243 = "Padrões carregados";
        class191.field3055 = "onda:";
        class322.field5131 = "Carregando dados da lista de mundos";
        class254.field4282 = "flash2:";
        class176.field2819 = "Virar para cá";
        class124.field2124 = "Lista de atualizações carregada";
        class325.field5162 = "Carregando config - ";
        class245.field4017 = "Tela título carregada";
        class347.field5521 = "tremor:";
        class324.field5159 = "Tela título aberta";
        class201.field3203 = "brilho1:";
        class258.field4338 = "brilho3:";
        class117.field1981 = "Conectando ao servidor de atualização";
        class298.field4781 = "Gerenciador de entradas carregado";
        class247.field4041 = " ";
        class183.field2951 = " da sua lista de ignorados primeiro.";
        class313.field4972 = "Pacote de palavras carregado";
        class350.field5559 = "amarelo:";
        class148.field2373 = "Carregando. Aguarde.";
        class116.field1948 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class129.field2186 = "Aguarde...";
        class152.field2411 = "Carregando pacote de palavras - ";
        class135.field2257 = "Carregando padrões - ";
        class104.field1689 = "Cancelar";
        class261.field4406 = "Ok";
        class295.field4755 = "Não é possível encontrar ";
        class7.field69 = "roxo:";
        class206.field3249 = "Sprites carregados";
        class215.field3439 = "flash1:";
        class117.field1953 = "Usar";
        class335.field5301 = "Remova ";
        class71.field1238 = "Selecionar";
        class76.field1321 = "Texturas carregadas";
        class79.field1368 = "nível: ";
        class113.field1855 = "K";
        class204.field3228 = "Memória alocada";
        class258.field4346 = "Conectado ao servidor de atualização";
        class11.field93 = "Carregando fontes - ";
        class326.field5181 = "brilho2:";
        class231.field3840 = " já está na sua lista de amigos.";
        class300.field4841 = "Mechscape carregando. Aguarde...";
        class75.field1273 = "Largar";
        class329.field5223 = "M";
        class201.field3206 = "brilho3:";
        class253.field4272 = " saiu do jogo.";
        class54.field898 = "deslizamento:";
        class121.field2058 = "Pegar";
        class211.field3373 = "Carregando tela título - ";
        class271.field4505 = "Mecanismo de som preparado";
        class102.field1662 = "Conexão perdida.";
        class140.field2301 = "Config carregada";
        class222.field3676 = " mais opções";
        class298.field4789 = " entrou no jogo.";
        class278.field4579 = "Alocando memória";
        class169.field2693 = "Tentando reestabelecer conexão. Aguarde.";
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(IB)Ljd;", line = 339)
    public final class280 method1559(int arg0, byte arg1) {
        if (arg1 == -94) {
            field5279++;
            return this.field5277[arg0];
        } else {
            return (class280) null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "(II)Z", line = 366)
    public final boolean method1558(int arg0, int arg1) {
        field5276++;
        class340 var3 = this.method781(arg1, 255);
        if (arg0 != 0) {
            field5275 = -51;
        }
        return var3 != null && var3.method2396((byte) -74, this, this.field5280);
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lth;Lth;Lth;)V", line = 380)
    public class333(class57 arg0, class57 arg1, class57 arg2) {
        this.field5285 = arg1;
        this.field5280 = arg2;
        class227 var4 = new class227(arg0.method472(0, 38, 0));
        int var5 = var4.method1765(true);
        this.field5277 = new class280[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1720((byte) -70) == 1) {
                this.field5277[var6] = new class280();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field5277[var7] != null) {
                this.field5277[var7].field4605 = var4.method1720((byte) -65) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field5277[var8] != null) {
                this.field5277[var8].field4604 = var4.method1720((byte) -16) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field5277[var9] != null) {
                this.field5277[var9].field4610 = var4.method1720((byte) -70) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field5277[var10] != null) {
                this.field5277[var10].field4607 = var4.method1720((byte) -68) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field5277[var11] != null) {
                this.field5277[var11].field4603 = var4.method1733(0);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field5277[var12] != null) {
                this.field5277[var12].field4606 = var4.method1733(0);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field5277[var13] != null) {
                this.field5277[var13].field4599 = var4.method1733(0);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field5277[var14] != null) {
                this.field5277[var14].field4601 = var4.method1733(0);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field5277[var15] != null) {
                this.field5277[var15].field4608 = (short) var4.method1765(true);
            }
        }
        if (var4.field3760 < var4.field3793.length) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field5277[var16] != null) {
                    var4.method1733(0);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field5277[var17] != null) {
                    var4.method1733(0);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field5277[var18] != null) {
                    var4.method1720((byte) -65);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field5277[var19] != null) {
                    this.field5277[var19].field4602 = var4.method1720((byte) -36) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field5277[var20] != null) {
                    var4.method1733(0);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field5277[var21] != null) {
                    var4.method1720((byte) -56);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field5277[var22] != null) {
                    var4.method1720((byte) -17);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field5277[var23] != null) {
                    var4.method1720((byte) -33);
                }
            }
        }
    }
}
