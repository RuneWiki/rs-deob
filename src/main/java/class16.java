import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class16 extends class84 {

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    private static int field270;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
    public static final void method119(int arg0) {
        field270 = arg0;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "()V")
    public final void method120() {
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "()I")
    public static final int method121() {
        return field270;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    public class16() {
        new class55();
        new class191();
    }

    static {
        new class30(8);
        field270 = 2;
        new class118(131056);
    }
}
