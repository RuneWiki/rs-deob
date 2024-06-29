import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class185 extends class644 {

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field2559 = -1;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "Lhg;")
    public static class693 field2558 = new class693(9, 8);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 6)
    public static void method1247(int arg0) {
        field2558 = null;
        if (arg0 != -1) {
            method1247(-9);
        }
    }
}
