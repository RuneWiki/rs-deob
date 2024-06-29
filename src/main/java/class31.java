import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class31 extends class140 {

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    private static int field564;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()I")
    public static final int method212() {
        return field564;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "()V")
    public final void method213() {
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static final void method214(int arg0) {
        field564 = arg0;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    public class31() {
        new class112();
        new class284();
    }

    static {
        new class82(8);
        field564 = 2;
        new class54(131056);
    }
}
