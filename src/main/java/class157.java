import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class157 extends class238 {

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    private static int field2576;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "()V")
    public final void method1160() {
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "()I")
    public static final int method1161() {
        return field2576;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V")
    public static final void method1162(int arg0) {
        field2576 = arg0;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
    public class157() {
        new class38();
        new class187();
    }

    static {
        new class256(8);
        field2576 = 2;
        new class152(131056);
    }
}
