import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class189 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "[Laa;")
    public static class343[] field2776;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method1290(int arg0) {
        if (arg0 > -32) {
            method1290(92);
        }
        field2776 = null;
    }

    static {
        new class44("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
    }
}
