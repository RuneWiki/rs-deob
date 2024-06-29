import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class239 {

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public static int field4036 = 0;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "Lce;")
    private static class126 field4034 = class206.method1445(-7923, " has logged in)3");

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "Lce;")
    public static class126 field4033 = field4034;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "Lce;")
    public static class126 field4039 = class206.method1445(-7923, "rouge:");

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "Z")
    public static boolean field4038 = false;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "Lce;")
    public static class126 field4035 = class206.method1445(-7923, "Cach-B");

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V", line = 11)
    public static void method1642(byte arg0) {
        field4033 = null;
        field4034 = null;
        field4035 = null;
        field4039 = null;
        if (arg0 > -2) {
            method1643(true);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)V", line = 33)
    public static final void method1643(boolean arg0) {
        field4037++;
        class17.field229++;
        if (!arg0) {
            field4035 = (class126) null;
        }
        class103.field1645.method1238(110, 120);
        class103.field1645.method962(-121, 0L);
    }
}
