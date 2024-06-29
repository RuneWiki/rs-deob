import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class101 {

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "Lqf;")
    private class311 field1343 = new class311(256);

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "Lqf;")
    private class311 field1354 = new class311(256);

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "Lug;")
    private class253 field1353;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "Lug;")
    private class253 field1352;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1350 = "Allocated memory";

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public static int field1351 = 0;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "F")
    public static float field1340;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([IIII)Lid;", line = 15)
    private final class266 method698(int[] arg0, int arg1, int arg2, int arg3) {
        field1347++;
        int var5 = arg2 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFF6);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        if (arg3 <= 67) {
            return (class266) null;
        }
        class266 var9 = (class266) this.field1354.method2168(var7, (byte) -106);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class168 var10 = (class168) this.field1343.method2168(var7, (byte) -97);
            if (var10 == null) {
                var10 = class168.method1259(this.field1353, arg1, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field1343.method2161(var10, var7, -1);
            }
            class266 var11 = var10.method1261(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method2028(13329);
                this.field1354.method2161(var11, var7, -1);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)V", line = 59)
    public static final void method699(int arg0, int arg1) {
        field1348++;
        if (arg0 != 21642) {
            method703((byte) 80);
        }
        class115.method811(class115.field1597, ((float) arg1 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        class115.method808(-50.0F, -60.0F, -50.0F);
        class115.method807(class115.field1601, 0, false);
        class115.method816();
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB[I)Lid;", line = 75)
    public final class266 method700(int arg0, byte arg1, int[] arg2) {
        field1345++;
        if (this.field1352.method1810(0) == 1) {
            return this.method705(0, arg0, arg2, -128);
        }
        if (arg1 != 2) {
            this.method698((int[]) null, -126, 39, 35);
        }
        if (this.field1352.method1826(0, arg0) != 1) {
            throw new RuntimeException();
        }
        return this.method705(arg0, 0, arg2, 110);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II[I)Lid;", line = 98)
    public final class266 method701(int arg0, int arg1, int[] arg2) {
        field1341++;
        if (this.field1353.method1810(arg1) == 1) {
            return this.method698(arg2, 0, arg0, 122);
        } else if (this.field1353.method1826(arg1, arg0) == 1) {
            return this.method698(arg2, arg0, 0, 107);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 123)
    public static void method702(int arg0) {
        int var1 = 111 / ((5 - arg0) / 57);
        field1350 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V", line = 133)
    public static final void method703(byte arg0) {
        field1349++;
        class10.field191.method1359(arg0 ^ 0xFFFFFF97);
        if (arg0 == -13) {
            class317.field5015.method1359(104);
            class231.field3604.method1359(80);
            class258.field4070.method1359(arg0 ^ 0xFFFFFF92);
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V", line = 157)
    public static final void method704(byte arg0) {
        class113.field1569 = " ";
        class2.field25 = "branco:";
        class70.field973 = "K";
        class6.field125 = "Caminhar para cá";
        class271.field4208 = "Fechar";
        class317.field5021 = "Carregando padrões - ";
        class251.field3947 = "brilho3:";
        class225.field3580 = "flash2:";
        class281.field4348 = "Conectando ao servidor de atualização";
        class333.field5187 = "amarelo:";
        class224.field3545 = "Config carregada";
        class59.field853 = "qualificação: ";
        class291.field4488 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class3.field30 = "Conexão perdida.";
        class159.field2514 = " saiu do jogo.";
        class240.field3740 = "Tela título carregada";
        class179.field2905 = "onda:";
        class270.field4198 = "K";
        class77.field1042 = "Carregando pacote de palavras - ";
        class336.field5238 = "Aguarde...";
        class339.field5292 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class234.field3663 = "Dados da lista de mundos carregados";
        class325.field5095 = "vermelho:";
        class113.field1583 = " da sua lista de ignorados primeiro.";
        class326.field5119 = "Biblioteca 3D iniciada";
        class32.field474 = "Oculto";
        class295.field4578 = "deseja negociar com você.";
        class310.field4831 = "M";
        class57.field791 = "M";
        class107.field1448 = "brilho1:";
        class141.field2243 = "Conectado ao servidor de atualização";
        class283.field4379 = "roxo:";
        class131.field1941 = "Carregando dados da lista de mundos";
        class153.field2374 = " já está na sua lista de ignorados.";
        class199.field3170 = "Alocando memória";
        class61.field896 = "cyan:";
        class202.field3219 = "Carregando...";
        class33.field486 = "Sprites carregados";
        class58.field840 = "Selecionar";
        field1342++;
        class282.field4357 = "Cancelar";
        class303.field4714 = "RuneScape carregando. Aguarde...";
        class276.field4264 = "Largar";
        class110.field1517 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        if (arg0 != -111) {
            field1350 = (String) null;
        }
        class251.field3963 = "Carregando /secure/libs_v4s/RCras - ";
        class126.field1819 = "Carregando. Aguarde.";
        class71.field983 = "Gerenciador de entradas carregado";
        class60.field892 = "Verificando atualizações - ";
        class265.field4140 = "deslizamento:";
        class232.field3623 = "Selecionar opção";
        class86.field1166 = " da sua lista de amigos primeiro.";
        field1350 = "Memória alocada";
        class134.field1965 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        class15.field262 = "verde:";
        class255.field4038 = "Padrões carregados";
        class4.field39 = "Carregando fontes - ";
        class171.field2814 = "Fontes carregadas";
        class150.field2353 = "Tela título aberta";
        class341.field5304 = "Pegar";
        class130.field1926 = "brilho2:";
        class307.field4790 = "Universo de jogo criado";
        class10.field193 = "Não é possível encontrar ";
        class310.field4818 = "Lista de atualizações carregada";
        class293.field4542 = "Mecanismo de som preparado";
        class251.field3944 = "Interfaces carregadas";
        class216.field3406 = "Remova ";
        class206.field3279 = "Carregando interfaces - ";
        class317.field5022 = "Continuar";
        class129.field1893 = "habilidade: ";
        class60.field880 = "Tentando reestabelecer conexão. Aguarde.";
        class328.field5145 = "Examinar";
        class246.field3856 = "Objeto para membros";
        class127.field1837 = "flash1:";
        class149.field2336 = "Carregando config - ";
        class22.field333 = "Texturas carregadas";
        class98.field1294 = "brilho3:";
        class291.field4485 = " entrou no jogo.";
        class160.field2538 = "Ok";
        class214.field3384 = "Carregando sprites - ";
        class159.field2480 = " já está na sua lista de amigos.";
        class78.field1044 = " mais opções";
        class302.field4646 = "Iniciando biblioteca 3D";
        class229.field3589 = "Carregando tela título - ";
        class179.field2919 = "Descartar";
        class24.field366 = "Usar";
        class1.field5 = "Remova ";
        class193.field3078 = "tremor:";
        class185.field3002 = "Virar para cá";
        class39.field559 = "onda2:";
        class174.field2852 = "rolagem:";
        class48.field628 = "Atacar";
        class179.field2913 = "Pacote de palavras carregado";
        class1.field1 = "nível: ";
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II[II)Lid;", line = 494)
    private final class266 method705(int arg0, int arg1, int[] arg2, int arg3) {
        field1344++;
        int var5 = (arg0 >>> 12 | (arg0 & 0x40000FFF) << 4) ^ arg1;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class266 var9 = (class266) this.field1354.method2168(var7, (byte) -127);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            int var10 = 66 % ((arg3 + 17) / 50);
            class324 var11 = class324.method2279(this.field1352, arg0, arg1);
            if (var11 == null) {
                return null;
            }
            class266 var12 = var11.method2282();
            this.field1354.method2161(var12, var7, -1);
            if (arg2 != null) {
                arg2[0] -= var12.field4153.length;
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lug;Lug;)V", line = 540)
    public class101(class253 arg0, class253 arg1) {
        this.field1353 = arg1;
        this.field1352 = arg0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I[B)Z", line = 550)
    public static final boolean method706(int arg0, byte[] arg1) {
        field1346++;
        class6 var2 = new class6(arg1);
        int var3 = var2.method58(-288140008);
        if (arg0 != 0) {
            field1350 = (String) null;
        }
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method58(-288140008) == 1;
        if (var4) {
            class79.method584(var2, (byte) 121);
        }
        class231.method1669(var2, true);
        return true;
    }
}
