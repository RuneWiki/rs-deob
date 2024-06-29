import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class67 extends class277 {

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    private static int field1110;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "()V")
    public final void method492() {
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
    public static final void method493(int arg0) {
        field1110 = arg0;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "()I")
    public static final int method494() {
        return field1110;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
    public class67() {
        new class104();
        new class180();
    }

    static {
        new class95(8);
        field1110 = 2;
        new class88(131056);
    }
}
