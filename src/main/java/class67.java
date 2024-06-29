import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class67 {

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public int field892 = -1;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "Lvt;")
    public static class344 field893;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "Lws;")
    public class532 field889;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "[I")
    public int[] field888;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "[Ljava/lang/String;")
    public String[] field890;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
    public static void method386(boolean arg0) {
        if (!arg0) {
            field893 = null;
        }
        field893 = null;
    }

    static {
        new class344("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        field893 = new class344("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");
    }
}
