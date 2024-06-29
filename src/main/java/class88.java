import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class88 extends class255 {

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    private static int field1593;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
    public static final void method651(int arg0) {
        field1593 = arg0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "()I")
    public static final int method652() {
        return field1593;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "()V")
    public final void method653() {
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
    public class88() {
        new class16();
        new class157();
    }

    static {
        new class126(8);
        field1593 = 2;
        new class74(131056);
    }
}
