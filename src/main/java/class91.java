import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class91 extends class37 {

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    private static int field1618;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()I")
    public static final int method628() {
        return field1618;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static final void method629(int arg0) {
        field1618 = arg0;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "()V")
    public final void method630() {
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    public class91() {
        new class205();
        new class160();
    }

    static {
        new class40(8);
        field1618 = 2;
        new class280(131056);
    }
}
