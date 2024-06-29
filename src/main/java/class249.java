import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class249 {

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "Lpn;")
    public static class72 field3492 = new class72(2, 8);

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "Lec;")
    public static class40 field3498 = new class40("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "Lec;")
    public static class40 field3501 = new class40("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "Lpn;")
    public static class72 field3502 = new class72(14, 8);

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3503 = "";

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "Lec;")
    public static class40 field3504 = new class40("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "Z")
    public static boolean field3505 = false;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "B")
    public byte field3494;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    public int field3495;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "Ljava/lang/String;")
    public String field3493;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "Ljava/lang/String;")
    public String field3496;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "Ljava/lang/String;")
    public String field3497;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "Ljava/lang/String;")
    public String field3500;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V")
    public static void method1512(byte arg0) {
        field3504 = null;
        field3503 = null;
        if (arg0 > 2) {
            field3492 = null;
            field3498 = null;
            field3501 = null;
            field3502 = null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)J")
    public static final long method1513(byte arg0) {
        if (arg0 == -55) {
            field3499++;
            return class122.field1512.method1960(arg0 - 31);
        } else {
            return 69L;
        }
    }
}
