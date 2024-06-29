import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class118 extends class207 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Lcj;")
    public static class143 field1794 = new class143(0, 0);

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "[I")
    public static int[] field1811 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "Ljava/lang/String;")
    public static String field1812 = "Loading interfaces - ";

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "F")
    public static float field1814;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1796;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1797;

    @OriginalMember(owner = "client!rb", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 5)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        field1798++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 15)
    public static final void method866(int arg0) {
        field1802++;
        if (arg0 == 4) {
            class320.field4994.method2174(arg0 - 10389);
        }
    }

    @OriginalMember(owner = "client!rb", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 27)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field1813++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 34)
    public final void method867(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg0 != 32722) {
            this.startProduction((ImageConsumer) null);
        }
        this.method873(126);
        field1806++;
        arg3.drawImage(this.field3176, arg2, arg1, this);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIII)V", line = 50)
    public static final void method868(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1809++;
        if (arg1 >= class206.field3170 && class12.field184 >= arg2 && class119.field1817 <= arg3 && class141.field2187 >= arg4) {
            class186.method1329(arg3, arg4, arg6, arg1, false, arg7, arg5, arg2);
        } else {
            class97.method719(arg4, 95, arg6, arg1, arg3, arg2, arg7, arg5);
        }
        if (arg0 != 19240) {
            field1812 = (String) null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/awt/Component;IIB)V", line = 68)
    public final void method869(Component arg0, int arg1, int arg2, byte arg3) {
        field1805++;
        this.field3173 = new int[arg1 * arg2 + 1];
        this.field3179 = arg2;
        this.field3174 = arg1;
        this.field1796 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3176 = arg0.createImage(this);
        this.method873(126);
        arg0.prepareImage(this.field3176, this);
        this.method873(125);
        arg0.prepareImage(this.field3176, this);
        this.method873(127);
        int var5 = 27 % ((44 - arg3) / 53);
        arg0.prepareImage(this.field3176, this);
        this.method1475(true);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILl;Ll;)V", line = 89)
    public static final void method870(int arg0, class133 arg1, class133 arg2) {
        if (arg0 != 0) {
            method868(58, -75, 3, 40, -18, -44, 54, 26);
        }
        field1807++;
        class29.field429 = arg1;
        class182.field2737 = arg2;
    }

    @OriginalMember(owner = "client!rb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 101)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        field1800++;
        this.field1797 = arg0;
        arg0.setDimensions(this.field3174, this.field3179);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1796);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!rb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 116)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1797 == arg0) {
            this.field1797 = null;
        }
        field1804++;
    }

    @OriginalMember(owner = "client!rb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 128)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field1801++;
        return this.field1797 == arg0;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZILjava/awt/Graphics;III)V", line = 142)
    public final void method871(boolean arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        if (arg0) {
            return;
        }
        field1795++;
        this.method874((byte) -30, arg3, arg5, arg1, arg4);
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg4, arg5, arg3, arg1);
        arg2.drawImage(this.field3176, 0, 0, this);
        arg2.setClip(var7);
    }

    @OriginalMember(owner = "client!rb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 162)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1810++;
        return true;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V", line = 172)
    public static void method872(int arg0) {
        field1794 = null;
        field1812 = null;
        field1811 = null;
        if (arg0 != 255) {
            field1812 = (String) null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V", line = 184)
    private final synchronized void method873(int arg0) {
        field1799++;
        if (this.field1797 != null) {
            this.field1797.setPixels(0, 0, this.field3174, this.field3179, this.field1796, this.field3173, 0, this.field3174);
            if (arg0 > 122) {
                this.field1797.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BIIII)V", line = 212)
    private final synchronized void method874(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1808++;
        if (this.field1797 == null) {
            return;
        }
        this.field1797.setPixels(arg4, arg2, arg1, arg3, this.field1796, this.field3173, this.field3174 * arg2 + arg4, this.field3174);
        if (arg0 != -30) {
            this.field1797 = (ImageConsumer) null;
        }
        this.field1797.imageComplete(2);
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)V", line = 238)
    public static final void method875(byte arg0) {
        class342.field5329 = "nível: ";
        class327.field5091 = "K";
        class185.field2774 = "deseja negociar com você.";
        class278.field4289 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        class148.field2243 = "habilidade: ";
        class176.field2673 = "flash2:";
        class16.field232 = "Selecionar";
        class195.field2916 = "brilho3:";
        class51.field836 = "Conexão perdida.";
        class258.field4050 = "Pegar";
        class252.field3979 = "Atacar";
        class292.field4543 = "Aguarde...";
        class204.field3076 = "amarelo:";
        class175.field2654 = "Config carregada";
        class244.field3896 = "onda2:";
        class119.field1821 = "Universo de jogo criado";
        class191.field2859 = " da sua lista de amigos primeiro.";
        class62.field995 = "Carregando padrões - ";
        class315.field4894 = "Objeto para membros";
        class181.field2733 = "rolagem:";
        class222.field3541 = "Alocando memória";
        class65.field1023 = "verde:";
        class195.field2913 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class332.field5163 = "Cancelar";
        class200.field3003 = "Verificando atualizações - ";
        class153.field2309 = "Tela título carregada";
        class179.field2697 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class190.field2855 = " já está na sua lista de amigos.";
        field1803++;
        class317.field4955 = " ";
        class60.field973 = "Virar para cá";
        class98.field1569 = "flash1:";
        class128.field2022 = "Carregando config - ";
        class308.field4779 = "Lista de atualizações carregada";
        class279.field4302 = "Fontes carregadas";
        class90.field1438 = "Carregando sprites - ";
        class52.field864 = "K";
        class154.field2314 = "Biblioteca 3D iniciada";
        class73.field1205 = "Conectado ao servidor de atualização";
        class156.field2334 = "Carregando. Aguarde.";
        class259.field4058 = "Fechar";
        class91.field1452 = "Dados da lista de mundos carregados";
        class208.field3183 = "qualificação: ";
        class267.field4169 = "Tela título aberta";
        class220.field3518 = "Carregando /secure/libs_v4s/RCras - ";
        class232.field3681 = "Pacote de palavras carregado";
        class108.field1696 = "brilho3:";
        class149.field2258 = "Examinar";
        class289.field4510 = "Mecanismo de som preparado";
        field1812 = "Carregando interfaces - ";
        class201.field3020 = "Carregando tela título - ";
        class163.field2450 = "branco:";
        class70.field1135 = "RuneScape carregando. Aguarde...";
        class11.field166 = " já está na sua lista de ignorados.";
        class289.field4496 = "Oculto";
        class213.field3254 = "Largar";
        class91.field1453 = "Caminhar para cá";
        class121.field1851 = "Remova ";
        class154.field2322 = "tremor:";
        class174.field2640 = "Ok";
        class133.field2117 = "Carregando dados da lista de mundos";
        class165.field2475 = "Texturas carregadas";
        class238.field3787 = " saiu do jogo.";
        class318.field4974 = "Sprites carregados";
        class194.field2903 = "vermelho:";
        class50.field807 = "Descartar";
        class175.field2659 = "Conectando ao servidor de atualização";
        class260.field4074 = "Carregando pacote de palavras - ";
        class63.field1010 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class214.field3264 = "Tentando reestabelecer conexão. Aguarde.";
        class228.field3625 = "Carregando fontes - ";
        class203.field3048 = "onda:";
        class130.field2044 = "M";
        class119.field1824 = "brilho2:";
        if (arg0 <= 49) {
            method875((byte) 103);
        }
        class242.field3866 = "Gerenciador de entradas carregado";
        class104.field1614 = " entrou no jogo.";
        class105.field1624 = "Interfaces carregadas";
        class125.field1959 = "Continuar";
        class275.field4250 = "brilho1:";
        class106.field1646 = " mais opções";
        class229.field3647 = " da sua lista de ignorados primeiro.";
        class203.field3042 = "Carregando...";
        class244.field3908 = "roxo:";
        class29.field420 = "Iniciando biblioteca 3D";
        class201.field3013 = "Não é possível encontrar ";
        class244.field3909 = "Remova ";
        class186.field2776 = "Usar";
        class177.field2678 = "cyan:";
        class5.field46 = "M";
        class174.field2630 = "Selecionar opção";
        class80.field1267 = "deslizamento:";
        class63.field1001 = "Memória alocada";
        class222.field3539 = "Padrões carregados";
    }
}
