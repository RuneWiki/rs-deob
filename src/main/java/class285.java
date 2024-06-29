import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class285 extends class180 {

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "J")
    public long field3899;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "Lmq;")
    public static class104 field3901;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "Lfc;")
    public static class343 field3904;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
    public static void method1762(int arg0) {
        field3901 = null;
        if (arg0 >= -34) {
            field3903 = -49;
        }
        field3904 = null;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
    public class285() {
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(J)V")
    public class285(long arg0) {
        this.field3899 = arg0;
    }

    static {
        new class112("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        field3900 = 0;
        new class112("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field3902 = 0;
        field3901 = new class104(8);
        field3903 = 0;
    }
}
