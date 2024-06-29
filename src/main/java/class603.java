import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public abstract class class603 extends class356 {

    @OriginalMember(owner = "client!lw", name = "u", descriptor = "I")
    public int field8544;

    @OriginalMember(owner = "client!lw", name = "v", descriptor = "Llo;")
    public class686 field8545;

    @OriginalMember(owner = "client!lw", name = "w", descriptor = "Lqn;")
    public static class59 field8546;

    @OriginalMember(owner = "client!lw", name = "x", descriptor = "Z")
    public static boolean field8547;

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Llo;I)V", line = 11)
    public class603(class686 arg0, int arg1) {
        this.field8544 = arg1;
        this.field8545 = arg0;
    }

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(I)V", line = 20)
    public static void method3368(int arg0) {
        field8546 = null;
        if (arg0 != 2364) {
            method3368(123);
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)Z")
    public abstract boolean method463(byte arg0);

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method462(int arg0);
}
