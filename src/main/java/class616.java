import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public abstract class class616 extends class408 {

    @OriginalMember(owner = "client!te", name = "A", descriptor = "Lvm;")
    public class688 field8672;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public int field8671;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "F")
    public static float field8670;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    public static int field8673;

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lvm;I)V", line = 9)
    public class616(class688 arg0, int arg1) {
        this.field8672 = arg0;
        this.field8671 = arg1;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method35(byte arg0);

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)Z")
    public abstract boolean method36(boolean arg0);
}
