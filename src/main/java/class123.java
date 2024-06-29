import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class123 {

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Z")
    public static boolean field2028;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Lbg;")
    public static class310 field2030;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Llt;")
    public static class458 field2027;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static final void method848(int arg0) {
        field2029++;
        if (arg0 == -8229) {
            class57.field973.method1749((byte) 126);
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public static void method849(int arg0) {
        field2027 = null;
        if (arg0 == 24363) {
            field2030 = null;
        }
    }

    static {
        new class423("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field2028 = false;
        field2030 = new class310(64, 18);
        field2031 = 0;
    }
}
