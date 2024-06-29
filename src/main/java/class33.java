import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class33 {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Lct;")
    public static class285 field426 = new class285(27, 8);

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "Lui;")
    public static class451 field428;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
    public static void method272(boolean arg0) {
        if (!arg0) {
            field426 = null;
        }
        field428 = null;
        field426 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Z")
    public static final boolean method273(int arg0) {
        if (arg0 == -1) {
            field429++;
            return class64.field885;
        } else {
            return false;
        }
    }

    static {
        new class332("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
    }
}
