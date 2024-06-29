import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class366 {

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public int field5583;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public int field5581;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public int field5582;

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V")
    public class366() {
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Llo;)V")
    public class366(class366 arg0) {
        this.field5583 = arg0.field5583;
        this.field5581 = arg0.field5581;
        this.field5582 = arg0.field5582;
    }
}
