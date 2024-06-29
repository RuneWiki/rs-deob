import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class217 extends class138 {

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    private static int field3540;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "()V")
    public final void method1468() {
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
    public static final void method1469(int arg0) {
        field3540 = arg0;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "()I")
    public static final int method1470() {
        return field3540;
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V")
    public class217() {
        new class206();
        new class46();
    }

    static {
        new class73(8);
        field3540 = 2;
        new class25(131056);
    }
}
