import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class447 {

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "Lgf;")
    public static class180 field6545;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "Lao;")
    public static class188 field6547;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "Lhh;")
    public static class84 field6544;

    static {
        new class180("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        new class180("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field6545 = new class180("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)V", line = 14)
    public static void method2706(byte arg0) {
        field6544 = null;
        if (arg0 < -115) {
            field6545 = null;
            field6547 = null;
        }
    }
}
