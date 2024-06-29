import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class118 {

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
    public int field1584;

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "I")
    public int field1585;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "I")
    public int field1583;

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "()V", line = 5)
    public class118() {
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lrba;)V", line = 7)
    public class118(class118 arg0) {
        this.field1584 = arg0.field1584;
        this.field1585 = arg0.field1585;
        this.field1583 = arg0.field1583;
    }
}
