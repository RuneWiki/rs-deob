import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class11 {

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public int field123;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V", line = 5)
    public class11() {
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lvl;)V", line = 7)
    public class11(class11 arg0) {
        this.field123 = arg0.field123;
        this.field124 = arg0.field124;
        this.field125 = arg0.field125;
    }
}
