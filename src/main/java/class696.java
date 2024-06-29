import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class696 {

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public int field9758;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public int field9756;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public int field9757;

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V")
    public class696() {
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lmp;)V")
    public class696(class696 arg0) {
        this.field9758 = arg0.field9758;
        this.field9756 = arg0.field9756;
        this.field9757 = arg0.field9757;
    }
}
