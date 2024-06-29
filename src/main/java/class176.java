import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class176 extends class354 {

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "Z")
    public static boolean field2677 = false;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)[I", line = 7)
    public final int[] method253(int arg0, byte arg1) {
        if (arg1 == -95) {
            field2676++;
            return class154.field2358;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V", line = 18)
    public class176() {
        super(0, true);
    }
}
