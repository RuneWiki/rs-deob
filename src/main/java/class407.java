import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class407 {

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public int field5799;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public int field5801;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public int field5800;

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V", line = 5)
    public class407() {
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lge;)V", line = 7)
    public class407(class407 arg0) {
        this.field5799 = arg0.field5799;
        this.field5801 = arg0.field5801;
        this.field5800 = arg0.field5800;
    }
}
