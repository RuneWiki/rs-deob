import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class353 {

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "Lpu;")
    public static class179 field5235;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "F")
    public static float field5236;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field5237;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
    public static void method2256(boolean arg0) {
        field5235 = null;
        if (!arg0) {
            field5237 = null;
        }
    }

    static {
        new class179("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field5235 = new class179("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");
        field5236 = 1024.0F;
        field5237 = new String[200];
    }
}
