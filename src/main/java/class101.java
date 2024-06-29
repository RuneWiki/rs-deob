import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class101 {

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
    public int field1596;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
    public int field1598;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
    public int field1597;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
    public int field1595;

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "()V")
    public class101() {
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lgu;)V")
    public class101(class101 arg0) {
        this.field1596 = arg0.field1596;
        this.field1598 = arg0.field1598;
        this.field1597 = arg0.field1597;
        this.field1595 = arg0.field1595;
    }
}
