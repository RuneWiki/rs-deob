import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public abstract class class35 {

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "Lkn;")
    public static class442 field538 = new class442("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "[I")
    public static int[] field543 = new int[13];

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "Lbj;")
    public static class131 field544;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public int field537;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    public int field541;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "[I")
    public int[] field540;

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field545;

    static {
        new class442("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        field544 = new class131(16);
        new class442("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V", line = 4)
    public static void method338(int arg0) {
        field543 = null;
        field545 = null;
        field544 = null;
        if (arg0 != 13) {
            field544 = null;
        }
        field538 = null;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBII)V", line = 18)
    public static final void method340(int arg0, byte arg1, int arg2, int arg3) {
        field542++;
        class76 var4 = class222.field3099[arg2][arg0];
        if (arg1 >= -56) {
            field543 = null;
        }
        class1.method7(var4 == null ? class268.field3733 : var4, (byte) -127, arg3);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method339(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public abstract void method341(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
    public abstract void method342(int arg0, int arg1, int arg2, Graphics arg3, int arg4, byte arg5);
}
