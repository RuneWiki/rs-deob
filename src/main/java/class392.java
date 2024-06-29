import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class392 {

    @OriginalMember(owner = "client!po", name = "a", descriptor = "Lap;")
    public static class335 field5263 = new class335("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!po", name = "c", descriptor = "Ljk;")
    public static class449 field5265 = new class449(10);

    @OriginalMember(owner = "client!po", name = "d", descriptor = "[I")
    public static int[] field5266 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V", line = 8)
    public static void method2222(int arg0) {
        field5265 = null;
        field5263 = null;
        if (arg0 != 5087) {
            field5265 = null;
        }
        field5266 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V", line = 26)
    public static final void method2223(boolean arg0) {
        field5264++;
        if (class476.field6887.toLowerCase().indexOf("microsoft") == -1) {
            class418.field5937[45] = 26;
            class418.field5937[93] = 43;
            class418.field5937[61] = 27;
            class418.field5937[92] = 74;
            class418.field5937[59] = 57;
            class418.field5937[44] = 71;
            class418.field5937[47] = 73;
            if (class476.field6909 == null) {
                class418.field5937[222] = 59;
                class418.field5937[192] = 58;
            } else {
                class418.field5937[222] = 58;
                class418.field5937[520] = 59;
                class418.field5937[192] = 28;
            }
            class418.field5937[91] = 42;
            class418.field5937[46] = 72;
        } else {
            class418.field5937[222] = 59;
            class418.field5937[189] = 26;
            class418.field5937[186] = 57;
            class418.field5937[190] = 72;
            class418.field5937[191] = 73;
            class418.field5937[219] = 42;
            class418.field5937[192] = 58;
            class418.field5937[221] = 43;
            class418.field5937[187] = 27;
            class418.field5937[188] = 71;
            class418.field5937[220] = 74;
            class418.field5937[223] = 28;
        }
        if (!arg0) {
            field5263 = null;
        }
    }
}
