import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class128 {

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "I")
    public int field1603;

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "I")
    public int field1605;

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "I")
    public int field1606;

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "I")
    public int field1604;

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "()V", line = 6)
    public class128() {
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Luaa;)V", line = 8)
    public class128(class128 arg0) {
        this.field1603 = arg0.field1603;
        this.field1605 = arg0.field1605;
        this.field1606 = arg0.field1606;
        this.field1604 = arg0.field1604;
    }
}
