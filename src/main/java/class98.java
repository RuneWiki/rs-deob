import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class98 extends class140 {

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    private static int field1512;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "()I")
    public static final int method741() {
        return field1512;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
    public static final void method742(int arg0) {
        field1512 = arg0;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "()V")
    public final void method743() {
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
    public class98() {
        new class230();
        new class266();
    }

    static {
        new class94(8);
        field1512 = 2;
        new class136(131056);
    }
}
