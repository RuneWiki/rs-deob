import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class380 {

    @OriginalMember(owner = "client!h", name = "b", descriptor = "Lpu;")
    public static class179 field5595 = new class179("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field5598 = -1;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Lpu;")
    public static class179 field5597 = new class179("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Z")
    public static final boolean method2416(int arg0, int arg1) {
        field5594++;
        if (arg0 == -1) {
            return (arg1 & -arg1) == arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static void method2417(int arg0) {
        field5595 = null;
        if (arg0 >= -62) {
            method2417(72);
        }
        field5597 = null;
    }
}
