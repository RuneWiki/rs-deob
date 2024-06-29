import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class37 {

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field492 = 0;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "Lkq;")
    public static class696 field491 = new class696(1, 2);

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 11)
    public static void method307(int arg0) {
        field491 = null;
        if (arg0 < 107) {
            method308(null, null, -107);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([I[JI)V", line = 21)
    public static final void method308(int[] arg0, long[] arg1, int arg2) {
        field493++;
        class282.method1751(arg1.length + arg2, 0, arg1, arg0, 1);
    }
}
