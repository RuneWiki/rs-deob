import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class32 extends class21 {

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    private static int field468;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
    public static final void method214(int arg0) {
        field468 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "()V")
    public final void method215() {
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "()I")
    public static final int method216() {
        return field468;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
    public class32() {
        new class52();
        new class60();
    }

    static {
        new class219(8);
        field468 = 2;
        new class101(131056);
    }
}
