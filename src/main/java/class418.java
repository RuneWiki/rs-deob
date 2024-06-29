import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class418 {

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Lbm;")
    public static class204 field6008;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field6009;

    static {
        new class332("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        field6008 = new class204("LIVE", 0);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 13)
    public static void method2482(int arg0) {
        field6008 = null;
        int var1 = -48 % ((arg0 + 31) / 47);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 28)
    public static final void method2483(byte arg0) {
        if (class398.field5829 != null) {
            class398.field5829.method2223(111);
        }
        field6007++;
        if (class395.field5816 != null) {
            class395.field5816.method2223(106);
        }
        if (arg0 < 54) {
            field6009 = -122;
        }
    }
}
