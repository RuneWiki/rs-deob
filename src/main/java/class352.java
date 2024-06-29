import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class352 {

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Lbd;")
    public static class44 field5141 = new class44("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "J")
    public static long field5142;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field5140;

    static {
        new class44("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field5142 = 0L;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIII)I", line = 4)
    public static final int method2209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5140++;
        if ((arg3 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg0;
            arg0 = var7;
        }
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg1;
        } else if (arg2 == var8) {
            return 1 + 7 - arg5 - arg6;
        } else if (var8 == 2) {
            return -arg0 - (arg1 - 8);
        } else {
            return arg6;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V", line = 36)
    public static void method2210(byte arg0) {
        if (arg0 == 102) {
            field5141 = null;
        }
    }
}
