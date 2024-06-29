import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "Lud;")
    public static class27 field27 = new class27(11, 0, 1, 2);

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "F")
    public static float field31;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "Ll;")
    public static class16 field34;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "Lba;")
    public class264 field28;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "Lt;")
    public class474 field26;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "Lqn;")
    public static class47 field29;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "Lhc;")
    public static class94 field25;

    static {
        new class335("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(BC)Z", line = 4)
    public static final boolean method14(byte arg0, char arg1) {
        field30++;
        if (arg0 >= -55) {
            field31 = 0.9376945F;
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V", line = 20)
    public static void method15(int arg0) {
        field29 = null;
        field27 = null;
        if (arg0 > 4) {
            field25 = null;
            field34 = null;
        }
    }
}
