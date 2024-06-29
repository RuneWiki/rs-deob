import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class53 {

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public int field601;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public int field600;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public int field602;

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
    public class53() {
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lal;)V")
    public class53(class53 arg0) {
        this.field601 = arg0.field601;
        this.field600 = arg0.field600;
        this.field602 = arg0.field602;
    }
}
