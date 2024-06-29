import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public abstract class class444 {

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field6551 = -1;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "Lqp;")
    public static class466 field6550 = new class466("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field6549;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method2637(String arg0, int arg1, int arg2) {
        field6548++;
        class97 var3 = class348.method2064(arg2, arg1, 101);
        var3.method712((byte) -87);
        var3.field1469 = arg0;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static void method2638(int arg0) {
        if (arg0 == -9116) {
            field6550 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2639(int arg0, int arg1, byte arg2) {
        if (arg2 != 11) {
            field6550 = null;
        }
        field6549++;
        return (arg1 & 0x400) != 0;
    }
}
