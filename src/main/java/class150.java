import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class150 {

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field2242 = 0;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "Lak;")
    public static class234 field2243 = new class234("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "Lhn;")
    public static class509 field2244 = new class509(6, 20);

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field2245 = 0;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "Lhn;")
    public static class509 field2247;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "Lclient;")
    public static client field2246;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "[I")
    public static int[] field2249;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V", line = 6)
    public static void method1042(byte arg0) {
        field2249 = null;
        if (arg0 >= 90) {
            field2244 = null;
            field2247 = null;
            field2246 = null;
            field2243 = null;
        }
    }
}
