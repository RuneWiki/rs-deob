import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class480 {

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "[Liaa;")
    public static class455[] field6696 = new class455[4];

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "I")
    public static int field6697;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)V")
    public static void method2722(byte arg0) {
        field6696 = null;
        if (arg0 < 0) {
            method2722((byte) -55);
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(BII)Z")
    public static final boolean method2723(byte arg0, int arg1, int arg2) {
        if (arg0 != 94) {
            field6695 = -7;
        }
        field6697++;
        return (arg2 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Z)V")
    public static final void method2724(boolean arg0) {
        field6694++;
        class658.field9264.method1997(1);
        if (!arg0) {
            method2724(true);
        }
    }
}
