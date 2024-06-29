import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class94 extends class398 {

    @OriginalMember(owner = "client!ki", name = "M", descriptor = "I")
    public static int field1345 = 500;

    @OriginalMember(owner = "client!ki", name = "P", descriptor = "Ljava/lang/String;")
    public static String field1348 = "";

    @OriginalMember(owner = "client!ki", name = "U", descriptor = "Z")
    public static boolean field1353 = false;

    @OriginalMember(owner = "client!ki", name = "K", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!ki", name = "O", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!ki", name = "Q", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!ki", name = "R", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!ki", name = "S", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!ki", name = "T", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!ki", name = "J", descriptor = "Lro;")
    public static class248 field1343;

    @OriginalMember(owner = "client!ki", name = "V", descriptor = "Llm;")
    public static class347 field1354;

    @OriginalMember(owner = "client!ki", name = "N", descriptor = "[[B")
    public static byte[][] field1346;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method95(int arg0, int arg1) {
        ++field1351;
        if (arg1 != 0) {
            return null;
        } else {
            int[] var3 = super.field5927.method305(arg0, (byte) 127);
            if (super.field5927.field591) {
                int[] var4 = this.method2558(0, 29295, arg0);
                int[] var5 = this.method2558(1, 29295, arg0);
                int[] var6 = this.method2558(2, 29295, arg0);
                for (int var7 = 0; ~class140.field1922 < ~var7; ++var7) {
                    int var8 = var6[var7];
                    if (~var8 == -4097) {
                        var3[var7] = var4[var7];
                    } else if (~var8 != -1) {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)V", line = 56)
    public static final void method654(byte arg0) {
        class346.field4972 = "nível: ";
        class159.field2148 = " da sua lista de amigos primeiro.";
        class223.field2942 = "onda2:";
        class451.field6585 = "Remova ";
        class218.field2883 = " já está na sua lista de ignorados.";
        class405.field6016 = "Carregando texturas - ";
        class259.field3783 = "Conectado ao servidor de atualização";
        class184.field2490 = "amarelo:";
        class306.field4502 = "Sprites carregados";
        class288.field4159 = "Mechscape carregando. Aguarde...";
        class228.field3032 = "brilho3:";
        class144.field1967 = " saiu do jogo.";
        class423.field6237 = "Mecanismo de som preparado";
        class333.field4829 = "Pacote de palavras carregado";
        class202.field2706 = "Texturas carregadas";
        class72.field1045 = "roxo:";
        class218.field2884 = "Cancelar";
        class369.field5333 = "M";
        class153.field2075 = "brilho2:";
        class148.field2034 = "Fontes carregadas";
        class356.field5145 = "Descartar";
        class147.field2014 = "onda:";
        class264.field3831 = "Tela título carregada";
        if (arg0 == 14) {
            class396.field5866 = " já está na sua lista de amigos.";
            class166.field2244 = "Padrões carregados";
            class315.field4600 = "Lista de atualizações carregada";
            class398.field5937 = "K";
            class197.field2629 = "habilidade: ";
            class167.field2262 = "Iniciando biblioteca 3D";
            class407.field6037 = "Virar para cá";
            class442.field6475 = "Conexão perdida.";
            class230.field3075 = "K";
            class435.field6401 = "Selecionar opção";
            class211.field2829 = "Tentando reestabelecer conexão. Aguarde.";
            class379.field5507 = "Atacar";
            class298.field4321 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
            class182.field2456 = "branco:";
            class194.field2599 = "deslizamento:";
            class363.field5244 = "rolagem:";
            class104.field1515 = "brilho3:";
            class117.field1650 = "M";
            class234.field3127 = "vermelho:";
            class432.field6342 = "Carregando dados da lista de mundos";
            class105.field1524 = "Você não pode adicionar a si próprio à sua lista de amigos.";
            class400.field5968 = "tremor:";
            class17.field259 = "Não é possível encontrar ";
            class431.field6337 = "brilho1:";
            class291.field4172 = "As variáveis do sistema foram carregadas";
            class171.field2295 = "Selecionar";
            class237.field3184 = "Remova ";
            class234.field3125 = "Memória alocada";
            class407.field6045 = "Fechar";
            class353.field5112 = "Carregando sprites - ";
            class159.field2149 = " ";
            class112.field1583 = "Ok";
            class38.field532 = "Examinar";
            class92.field1295 = "cyan:";
            class218.field2882 = "Carregando tela título - ";
            class347.field5030 = "Objeto para membros";
            class323.field4736 = "Gerenciador de entradas carregado";
            class396.field5857 = "Continuar";
            class83.field1201 = "flash2:";
            class267.field3857 = "Interfaces carregadas";
            class153.field2072 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
            class284.field4136 = "Carregando pacote de palavras - ";
            class277.field4014 = "Carregando interfaces - ";
            class372.field5413 = "Carregando. Aguarde.";
            ++field1347;
            class278.field4027 = "RuneScape carregando. Aguarde...";
            class442.field6481 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
            class44.field628 = "Carregando padrões - ";
            class199.field2654 = "Pegar";
            class7.field93 = "Conectando ao servidor de atualização";
            class174.field2325 = "flash1:";
            class124.field1725 = "qualificação: ";
            class205.field2769 = "Universo de jogo criado";
            class353.field5109 = "Alocando memória";
            class165.field2228 = " entrou no jogo.";
            class171.field2300 = "Config carregada";
            class353.field5116 = "Dados da lista de mundos carregados";
            class225.field2960 = "Caminhar para cá";
            class173.field2316 = "Aguarde...";
            class319.field4660 = " da sua lista de ignorados primeiro.";
            class331.field4814 = "Biblioteca 3D iniciada";
            class120.field1679 = " mais opções";
            class52.field714 = "Carregando fontes - ";
            class393.field5623 = "Largar";
            class163.field2186 = "verde:";
            class169.field2270 = "Verificando atualizações - ";
            class384.field5553 = "Usar";
            class296.field4252 = "Tela título aberta";
            class161.field2161 = "Carregando config - ";
            class313.field4587 = "Oculto";
            class270.field3921 = "Carregando...";
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lnj;II)V", line = 338)
    public final void method208(class228 arg0, int arg1, int arg2) {
        if (arg2 != -13132) {
            this.method95(63, -86);
        }
        if (~arg1 == -1) {
            super.field5931 = ~arg0.method1348(-101) == -2;
        }
        ++field1350;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V", line = 356)
    public class94() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)V", line = 360)
    public static void method655(int arg0) {
        field1346 = null;
        field1343 = null;
        field1354 = null;
        field1348 = null;
        int var1 = 123 / ((arg0 - 51) / 43);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)[[I", line = 378)
    public final int[][] method99(int arg0, int arg1) {
        ++field1344;
        if (arg1 != 2) {
            method655(-84);
        }
        int[][] var3 = super.field5933.method2205((byte) -114, arg0);
        if (super.field5933.field4847) {
            int[] var4 = this.method2558(2, 29295, arg0);
            int[][] var5 = this.method2561(arg0, (byte) -74, 0);
            int[][] var6 = this.method2561(arg0, (byte) -76, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class140.field1922 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 == 0) {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                } else {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }
}
