import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class185 {

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public int field2600;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public int field2601;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public int field2599;

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
    public class185() {
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lvj;)V")
    public class185(class185 arg0) {
        this.field2600 = arg0.field2600;
        this.field2601 = arg0.field2601;
        this.field2599 = arg0.field2599;
    }
}
