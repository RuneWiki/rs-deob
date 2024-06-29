import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class123 {

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public static int field1724 = 0;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)V")
    public static final void method963(int arg0, int arg1) {
        class224 var2 = class118.field1653[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class224 var4 = class118.field1653[var3][arg0][arg1] = class118.field1653[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3112--;
                for (class26 var5 = var4.field3129; var5 != null; var5 = var5.field463) {
                    class228 var6 = var5.field460;
                    if (var6.field3172 == arg0 && var6.field3161 == arg1) {
                        var6.field3170--;
                    }
                }
            }
        }
        if (class118.field1653[0][arg0][arg1] == null) {
            class118.field1653[0][arg0][arg1] = new class224(0, arg0, arg1);
            class118.field1653[0][arg0][arg1].field3107 = 1;
        }
        class118.field1653[0][arg0][arg1].field3114 = var2;
        class118.field1653[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)V")
    public static final void method964(int arg0, int arg1) {
        field1723++;
        class210.field2929.method2534(arg0, arg1);
        class286.field3833.method2534(0, arg1);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
    public static final void method965(int arg0) {
        class24.field426 = "Iniciando biblioteca 3D";
        class422.field5908 = " já está na sua lista de amigos.";
        class244.field3369 = "Carregando...";
        class199.field2839 = "Cancelar";
        class338.field4607 = "Carregando. Aguarde.";
        class155.field2355 = "Biblioteca 3D iniciada";
        class184.field2679 = "Carregando texturas - ";
        class126.field1763 = "Carregando fontes - ";
        class441.field6339 = "Carregando padrões - ";
        class421.field5900 = "Gerenciador de entradas carregado";
        class435.field6201 = "Pegar";
        class134.field1909 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class381.field5342 = "Pacote de palavras carregado";
        class335.field4538 = "brilho3:";
        class126.field1772 = "rolagem:";
        class63.field967 = " já está na sua lista de ignorados.";
        class362.field4921 = "K";
        class412.field5761 = "Carregando tela título - ";
        class263.field3538 = "Alocando memória";
        class391.field5483 = "Virar para cá";
        class128.field1817 = "Dados da lista de mundos carregados";
        class266.field3578 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        class296.field3987 = "Remova ";
        class301.field4048 = "Memória alocada";
        class423.field5921 = "Tela título aberta";
        class97.field1399 = "Padrões carregados";
        class290.field3943 = "Carregando dados da lista de mundos";
        class105.field1551 = "brilho2:";
        class66.field996 = "Oculto";
        class278.field3745 = "M";
        class186.field2698 = "Tela título carregada";
        class345.field4681 = "cyan:";
        class375.field5279 = "Selecionar";
        class356.field4839 = "Mechscape carregando. Aguarde...";
        class288.field3857 = "brilho3:";
        class149.field2287 = "tremor:";
        class165.field2444 = "Conectado ao servidor de atualização";
        class243.field3354 = "Lista de atualizações carregada";
        class3.field20 = "Conexão perdida.";
        class412.field5762 = "onda2:";
        class14.field105 = "brilho1:";
        class288.field3863 = "onda:";
        class127.field1796 = "Ok";
        class94.field1366 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class417.field5858 = " da sua lista de amigos primeiro.";
        class382.field5356 = "Aguarde...";
        class235.field3254 = " da sua lista de ignorados primeiro.";
        class134.field1907 = "Config carregada";
        class233.field3206 = "Não é possível encontrar ";
        class410.field5731 = "Carregando sprites - ";
        class223.field3097 = "RuneScape carregando. Aguarde...";
        class5.field38 = "qualificação: ";
        class149.field2290 = "Atacar";
        class435.field6204 = "Descartar";
        class224.field3100 = " mais opções";
        class328.field4458 = "Usar";
        class241.field3333 = "Examinar";
        class73.field1098 = "nível: ";
        class84.field1226 = "Continuar";
        class68.field1025 = "Carregando interfaces - ";
        class185.field2692 = "flash1:";
        class148.field2266 = "Selecionar opção";
        class128.field1825 = "Texturas carregadas";
        class443.field6392 = " saiu do jogo.";
        class155.field2347 = "roxo:";
        class295.field3986 = "Carregando config - ";
        class340.field4651 = "K";
        class255.field3459 = "habilidade: ";
        class127.field1797 = "Objeto para membros";
        field1725++;
        class213.field2949 = "Verificando atualizações - ";
        class233.field3204 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class415.field5811 = "verde:";
        class283.field3786 = "Tentando reestabelecer conexão. Aguarde.";
        class387.field5447 = "Sprites carregados";
        class424.field5945 = "Largar";
        class198.field2815 = "amarelo:";
        class243.field3361 = "vermelho:";
        class386.field5441 = "Carregando pacote de palavras - ";
        class391.field5481 = "Fechar";
        class365.field5035 = "Caminhar para cá";
        class71.field1073 = "Interfaces carregadas";
        class336.field4556 = "Remova ";
        class423.field5919 = " entrou no jogo.";
        class63.field965 = "M";
        class361.field4909 = "As variáveis do sistema foram carregadas";
        class448.field6493 = "branco:";
        class398.field5577 = "flash2:";
        if (arg0 > -37) {
            return;
        }
        class273.field3665 = " ";
        class293.field3963 = "Mecanismo de som preparado";
        class284.field3806 = "Conectando ao servidor de atualização";
        class97.field1404 = "Universo de jogo criado";
        class293.field3964 = "Fontes carregadas";
        class275.field3696 = "deslizamento:";
    }
}
