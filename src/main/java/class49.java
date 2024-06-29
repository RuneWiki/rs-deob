import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class49 {

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public int field593;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public int field594;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    public int field592;

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
    public class49() {
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lin;)V")
    public class49(class49 arg0) {
        this.field593 = arg0.field593;
        this.field594 = arg0.field594;
        this.field592 = arg0.field592;
    }
}
