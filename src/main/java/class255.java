import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class255 extends class75 {

    @OriginalMember(owner = "client!be", name = "y", descriptor = "I")
    private static int field4377;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()I")
    public static final int method1677() {
        return field4377;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "()V")
    public final void method1678() {
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public static final void method1679(int arg0) {
        field4377 = arg0;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class255() {
        new class241();
        new class117();
    }

    static {
        new class246(8);
        field4377 = 2;
        new class135(131056);
    }
}
