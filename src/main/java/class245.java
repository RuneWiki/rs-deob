import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class245 extends class57 {

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    private static int field3660;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "()I")
    public static final int method1540() {
        return field3660;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
    public static final void method1541(int arg0) {
        field3660 = arg0;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "()V")
    public final void method1542() {
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
    public class245() {
        new class129();
        new class159();
    }

    static {
        new class120(8);
        field3660 = 2;
        new class248(131056);
    }
}
