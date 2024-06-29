import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class59 {

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Lui;")
    public static class375 field789 = new class375("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Lns;")
    public static class438 field790;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "[[Ljb;")
    public static class499[][] field791;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V", line = 10)
    public static final void method398(byte arg0) {
        field787++;
        class442.field6574 = 0;
        int var1 = 0;
        int var2 = 75 / ((56 - arg0) / 40);
        while (var1 < 2048) {
            class289.field4303[var1] = null;
            class363.field5624[var1] = 1;
            class57.field759[var1] = null;
            var1++;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V", line = 31)
    public static void method399(byte arg0) {
        field790 = null;
        if (arg0 != 92) {
            method399((byte) -8);
        }
        field789 = null;
        field791 = null;
    }
}
