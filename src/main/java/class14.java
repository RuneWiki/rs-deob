import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class14 {

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field189 = new String[8];

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field194 = 3353893;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    private int field195;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public int field197;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public int field198;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static void method81(byte arg0) {
        int var1 = -51 % ((arg0 + 46) / 39);
        field189 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIILeh;)V")
    private final void method82(int arg0, int arg1, int arg2, class101 arg3) {
        if (~arg2 == arg0) {
            this.field195 = arg3.method677(false);
        } else if (arg2 == 2) {
            this.field197 = arg3.method669((byte) 36);
            this.field198 = arg3.method669((byte) 36);
        }
        field196++;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ldi;")
    public static final class99 method83(Throwable arg0, String arg1) {
        field199++;
        class99 var2;
        if (arg0 instanceof class99) {
            var2 = (class99) arg0;
            var2.field1698 = var2.field1698 + ' ' + arg1;
        } else {
            var2 = new class99(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static final void method84(int arg0) {
        class29.field429 = "brilho3:";
        class239.field3935 = "Cancelar";
        class248.field4063 = "Alocando memória";
        field190++;
        class273.field4382 = "cyan:";
        class240.field3949 = "Selecionar opção";
        class266.field4305 = "Remova ";
        class125.field2190 = "brilho3:";
        class296.field4701 = "Virar para cá";
        class3.field31 = "Sprites carregados";
        class211.field3562 = "Dados da lista de mundos carregados";
        class58.field1022 = "Mecanismo de som preparado";
        class215.field3626 = "Carregando padrões - ";
        class77.field1263 = "Pacote de palavras carregado";
        class152.field2537 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class294.field4687 = "Selecionar";
        class141.field2429 = " da sua lista de ignorados primeiro.";
        class91.field1611 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class73.field1207 = "Ok";
        class205.field3355 = "Carregando config - ";
        class139.field2394 = "Gerenciador de entradas carregado";
        class212.field3580 = "Verificando atualizações - ";
        class25.field388 = "tremor:";
        class176.field2894 = "K";
        class245.field4029 = "Tela título aberta";
        class1.field4 = "onda2:";
        class272.field4371 = "Conectado ao servidor de atualização";
        class41.field613 = " entrou no jogo.";
        class154.field2584 = "Carregando...";
        class121.field2141 = " já está na sua lista de amigos.";
        class154.field2578 = "Conectando ao servidor de atualização";
        class290.field4637 = "Fontes carregadas";
        class165.field2709 = "Fechar";
        class274.field4391 = "K";
        class293.field4672 = "flash2:";
        class62.field1086 = " já está na sua lista de ignorados.";
        class219.field3678 = "deseja negociar com você.";
        class199.field3280 = "Carregando interfaces - ";
        class11.field157 = " da sua lista de amigos primeiro.";
        class161.field2679 = " saiu do jogo.";
        class134.field2324 = "Carregando pacote de palavras - ";
        class161.field2683 = "Carregando sprites - ";
        class74.field1228 = "Carregando tela título - ";
        class58.field1012 = "roxo:";
        class160.field2669 = "Biblioteca 3D iniciada";
        class189.field3070 = "Conexão perdida.";
        class295.field4692 = "Remova ";
        class286.field4521 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class37.field527 = "Memória alocada";
        class92.field1617 = "rolagem:";
        class81.field1468 = "habilidade: ";
        class98.field1695 = "vermelho:";
        class92.field1618 = "Interfaces carregadas";
        class228.field3839 = "Continuar";
        class142.field2440 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        class67.field1121 = "brilho1:";
        class229.field3864 = "brilho2:";
        class239.field3938 = "nível: ";
        class215.field3631 = "Aguarde...";
        class55.field962 = "Caminhar para cá";
        class176.field2897 = "Tentando reestabelecer conexão. Aguarde.";
        class31.field459 = "verde:";
        class93.field1637 = "Padrões carregados";
        class45.field631 = "Usar";
        class96.field1655 = "Pegar";
        class286.field4517 = "qualificação: ";
        if (arg0 != 32) {
            return;
        }
        class108.field1938 = "Carregando fontes - ";
        class211.field3560 = "Atacar";
        class134.field2323 = " mais opções";
        class42.field618 = " ";
        class30.field453 = "Iniciando biblioteca 3D";
        class60.field1049 = "Objeto para membros";
        class239.field3920 = "Largar";
        class145.field2482 = "M";
        class189.field3057 = "flash1:";
        class183.field2980 = "Lista de atualizações carregada";
        class220.field3687 = "onda:";
        class286.field4528 = "Config carregada";
        class277.field4436 = "Examinar";
        class261.field4259 = "Tela título carregada";
        class69.field1138 = "Oculto";
        client.field4535 = "Texturas carregadas";
        class191.field3085 = "Carregando dados da lista de mundos";
        class215.field3627 = "branco:";
        class261.field4257 = "Carregando. Aguarde.";
        class102.field1791 = "Descartar";
        class79.field1361 = "Não é possível encontrar ";
        class21.field332 = "deslizamento:";
        class109.field1981 = "Carregando /secure/libs_v4s/RCras - ";
        class105.field1862 = "RuneScape carregando. Aguarde...";
        class62.field1085 = "M";
        class201.field3308 = "amarelo:";
        class52.field918 = "Universo de jogo criado";
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILeh;I)V")
    public final void method85(int arg0, class101 arg1, int arg2) {
        if (arg2 < 30) {
            this.field197 = -118;
        }
        while (true) {
            int var4 = arg1.method669((byte) 36);
            if (var4 == 0) {
                field193++;
                return;
            }
            this.method82(-2, arg0, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)V")
    public static final void method86(int arg0, int arg1) {
        if (arg1 != 14130) {
            method84(102);
        }
        field192++;
        class55 var2 = class62.method395(4, arg0, (byte) -66);
        var2.method341((byte) 62);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)Lda;")
    public final class197 method87(boolean arg0) {
        field191++;
        class197 var2 = (class197) class30.field442.method57((long) this.field195, -109);
        if (var2 != null) {
            return var2;
        }
        class197 var3 = class149.method1030(this.field195, 0, class68.field1124, (byte) 123);
        if (var3 != null) {
            class30.field442.method62(0, var3, (long) this.field195);
        }
        return arg0 ? null : var3;
    }
}
