import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class362 {

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    public static int field5263;

    static {
        new class44("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V", line = 7)
    public static final void method2237(byte arg0) {
        if (class255.field3779 != null) {
            class255.field3779.method1197((byte) -48);
            class471.field6835 = null;
            class255.field3779 = null;
        }
        field5262++;
        if (arg0 != -53) {
            method2237((byte) 90);
        }
    }
}
