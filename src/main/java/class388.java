import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class388 {

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "[S")
    public static short[] field5141 = new short[] { 45, 21, 60, 9, 5, 19, 30, 6 };

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "Z")
    public static boolean field5142 = false;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Lql;")
    public static class689 field5140;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILfg;)V", line = 6)
    public static final void method2246(int arg0, class117 arg1) {
        field5138++;
        if (!field5142 && arg0 == 19) {
            arg1.method2797(arg0 ^ 0xFFFFFF8E);
            class398.field5290--;
        }
    }

    @OriginalMember(owner = "client!mf", name = "toString", descriptor = "()Ljava/lang/String;", line = 22)
    public final String toString() {
        field5139++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 34)
    public static void method2247(int arg0) {
        field5140 = null;
        field5141 = null;
        if (arg0 != 14182) {
            method2246(-121, null);
        }
    }
}
