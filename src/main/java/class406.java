import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class406 extends class339 {

    @OriginalMember(owner = "client!gk", name = "Q", descriptor = "Lh;")
    public static class572 field5550;

    @OriginalMember(owner = "client!gk", name = "T", descriptor = "[I")
    public static int[] field5553;

    @OriginalMember(owner = "client!gk", name = "O", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!gk", name = "S", descriptor = "Llk;")
    public static class504 field5552;

    @OriginalMember(owner = "client!gk", name = "R", descriptor = "[[B")
    public static byte[][] field5551;

    static {
        new class572("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field5550 = new class572("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");
        new class572("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field5553 = new int[32];
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BII)I", line = 3)
    public static final int method2391(byte arg0, int arg1, int arg2) {
        if (arg2 < arg1) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        field5549++;
        int var4 = -94 / ((arg0 - 55) / 63);
        while (arg1 != 0) {
            int var5 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var5;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V", line = 43)
    public static void method2392(int arg0) {
        field5553 = null;
        if (arg0 == 32) {
            field5551 = null;
            field5552 = null;
            field5550 = null;
        }
    }
}
