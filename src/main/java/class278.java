import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class278 extends class43 {

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public int field3596 = -1;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "Z")
    public boolean field3598 = false;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field3592 = 0;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public static int field3602 = -1;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "[I")
    public static int[] field3597 = new int[1000];

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "Z")
    public static boolean field3604 = false;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "Lhq;")
    public static class365 field3607;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "Lcq;")
    public static class72 field3609;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public int field3593;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public int field3595;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public int field3601;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public int field3603;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public int field3605;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "J")
    public static long field3606;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "Lod;")
    public static class399 field3600;

    static {
        new class72("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field3607 = new class365(4);
        field3609 = new class72("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V", line = 11)
    public static void method1743(int arg0) {
        int var1 = -55 % ((49 - arg0) / 51);
        field3600 = null;
        field3609 = null;
        field3597 = null;
        field3607 = null;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I)V", line = 58)
    public class278(int arg0) {
        this.field3596 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V", line = 41)
    public static final void method1744(int arg0) {
        class57.field660 = 0;
        if (arg0 == -29715) {
            field3594++;
            class97.field1138.method1701(true);
            class49.field574 = false;
        }
    }
}
