import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class424 {

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Lim;")
    public static class353 field5740 = new class353(19, 8);

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Lvt;")
    public static class344 field5741 = new class344("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "[I")
    public static int[] field5742 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "[I")
    public static int[] field5744 = new int[4096];

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "Lim;")
    public static class353 field5743 = new class353(86, 10);

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "F")
    public static float field5745;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public static void method2494(int arg0) {
        field5740 = null;
        field5744 = null;
        field5743 = null;
        field5742 = null;
        if (arg0 > -69) {
            field5747 = 121;
        }
        field5741 = null;
    }

    static {
        new class344("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
    }
}
