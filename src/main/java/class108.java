import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class108 {

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "Ltm;")
    public static class112 field1538 = new class112(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V", line = 11)
    public static void method676(boolean arg0) {
        field1538 = null;
        if (arg0) {
            field1539 = -72;
        }
    }
}
