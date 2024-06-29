import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class4 extends class279 {

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    private static int field53;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "()I")
    public static final int method29() {
        return field53;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "()V")
    public final void method30() {
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
    public static final void method31(int arg0) {
        field53 = arg0;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
    public class4() {
        new class243();
        new class48();
    }

    static {
        new class262(8);
        field53 = 2;
        new class264(131056);
    }
}
