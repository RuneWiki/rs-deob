import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class112 extends class218 {

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    private static int field1604;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()I")
    public static final int method726() {
        return field1604;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public static final void method727(int arg0) {
        field1604 = arg0;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
    public final void method728() {
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
    public class112() {
        new class13();
        new class97();
    }

    static {
        new class134(8);
        field1604 = 2;
        new class114(131056);
    }
}
