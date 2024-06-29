import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class131 {

    @OriginalMember(owner = "client!br", name = "c", descriptor = "Lwl;")
    public static class452 field1669 = new class452(14, 1);

    @OriginalMember(owner = "client!br", name = "d", descriptor = "Ljg;")
    public static class241 field1670 = new class241(64);

    @OriginalMember(owner = "client!br", name = "e", descriptor = "Lnn;")
    public static class151 field1671 = new class151("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!br", name = "f", descriptor = "Lpf;")
    public static class425 field1672 = new class425(54, 8);

    @OriginalMember(owner = "client!br", name = "a", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IB)V")
    public static final void method775(int arg0, byte arg1) {
        field1667++;
        if (arg1 != 1) {
            method775(4, (byte) -105);
        }
        class32 var2 = class136.method854(5, (byte) 86, arg0);
        var2.method192(arg1 - 17452);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V")
    public static void method776(byte arg0) {
        field1671 = null;
        int var1 = -5 % ((arg0 - 16) / 42);
        field1672 = null;
        field1669 = null;
        field1670 = null;
    }
}
