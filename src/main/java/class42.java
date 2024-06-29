import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public abstract class class42 extends class189 {

    @OriginalMember(owner = "client!nr", name = "z", descriptor = "Z")
    public volatile boolean field582 = true;

    @OriginalMember(owner = "client!nr", name = "v", descriptor = "Los;")
    public static class309 field578 = new class309("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!nr", name = "A", descriptor = "Los;")
    public static class309 field583 = new class309("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!nr", name = "C", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!nr", name = "D", descriptor = "Los;")
    public static class309 field586;

    @OriginalMember(owner = "client!nr", name = "w", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!nr", name = "B", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!nr", name = "x", descriptor = "Z")
    public boolean field580;

    @OriginalMember(owner = "client!nr", name = "y", descriptor = "Z")
    public boolean field581;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
    public static final void method255(int arg0) {
        field579++;
        int var1 = -124 / ((17 - arg0) / 37);
        if (class99.field1922 != null) {
            class99.field1922.method1492((byte) -10);
        }
        if (class52.field1122 != null) {
            class52.field1122.method1492((byte) -10);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method256(String arg0, int arg1) {
        System.out.println("Error: " + class526.method3108(-1, arg0, "%0a", "\n"));
        field584++;
        if (arg1 != -29677) {
            method255(52);
        }
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)V")
    public static void method257(int arg0) {
        field583 = null;
        field578 = null;
        field586 = null;
        if (arg0 != 30284) {
            field586 = null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "(I)I")
    public abstract int method258(int arg0);

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "(I)[B")
    public abstract byte[] method259(int arg0);

    static {
        new class309("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        new class309("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field585 = -1;
        field586 = new class309("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");
    }
}
