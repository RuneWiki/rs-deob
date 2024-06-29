import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class143 {

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "I")
    public int field1755;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "I")
    public int field1754;

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "I")
    public int field1756;

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "()V", line = 5)
    public class143() {
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Ltba;)V", line = 7)
    public class143(class143 arg0) {
        this.field1755 = arg0.field1755;
        this.field1754 = arg0.field1754;
        this.field1756 = arg0.field1756;
    }
}
