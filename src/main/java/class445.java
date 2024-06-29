import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class445 {

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "[Lbo;")
    public static class225[] field6493 = new class225[0];

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "Lid;")
    public static class224 field6492 = new class224("", 17);

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
    public static void method2627(byte arg0) {
        if (arg0 != 18) {
            method2627((byte) -106);
        }
        field6493 = null;
        field6492 = null;
    }

    static {
        new class567("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        new class567("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
    }
}
