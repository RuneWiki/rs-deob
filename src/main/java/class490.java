import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class490 {

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field7491 = 1;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "Lgn;")
    public static class475 field7492 = new class475(40, -1);

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "Lqg;")
    public static class307 field7494;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method2946(int arg0) {
        field7494 = null;
        if (arg0 != -5949) {
            field7491 = -86;
        }
        field7492 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BII)Z")
    public static final boolean method2947(byte arg0, int arg1, int arg2) {
        field7493++;
        if (arg0 < 67) {
            method2946(64);
        }
        return class164.method1041(arg1, false, arg2) & class226.method1394(0, arg2, arg1);
    }
}
