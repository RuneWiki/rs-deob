import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class95 extends class36 {

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    private static int field1530;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()I")
    public static final int method669() {
        return field1530;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
    public static final void method670(int arg0) {
        field1530 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "()V")
    public final void method671() {
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
    public class95() {
        new class15();
        new class90();
    }

    static {
        new class120(8);
        field1530 = 2;
        new class25(131056);
    }
}
