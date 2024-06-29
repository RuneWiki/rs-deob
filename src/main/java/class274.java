import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class274 {

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "Lpr;")
    public static class407 field3471 = new class407(22, 4);

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "I")
    public static int field3474 = 0;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!vw", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field3472++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V", line = 26)
    public static void method1563(int arg0) {
        field3471 = null;
        if (arg0 != 22) {
            method1563(91);
        }
    }
}
