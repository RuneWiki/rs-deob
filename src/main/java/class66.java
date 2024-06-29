import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class66 {

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "Lej;")
    public static class104 field1114 = new class104("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
    public static void method548(int arg0) {
        if (arg0 == 5557) {
            field1114 = null;
        }
    }

    static {
        new class104("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
    }
}
