import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class145 {

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    public int field2069;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public int field2070;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
    public int field2071;

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V", line = 5)
    public class145() {
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Laq;)V", line = 7)
    public class145(class145 arg0) {
        this.field2069 = arg0.field2069;
        this.field2070 = arg0.field2070;
        this.field2071 = arg0.field2071;
    }
}
