import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class480 {

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "[I")
    public static int[] field7012 = new int[5];

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "Lqo;")
    public static class141 field7010 = new class141(16);

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "Lui;")
    public static class375 field7014 = new class375("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "[S")
    public static short[] field7011;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V", line = 7)
    public static void method2874(int arg0) {
        field7010 = null;
        field7012 = null;
        field7014 = null;
        if (arg0 != 5) {
            field7010 = null;
        }
        field7011 = null;
    }
}
