import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class128 {

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public int field1897;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public int field1899;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public int field1898;

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V", line = 5)
    public class128() {
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lpq;)V", line = 7)
    public class128(class128 arg0) {
        this.field1897 = arg0.field1897;
        this.field1899 = arg0.field1899;
        this.field1898 = arg0.field1898;
    }
}
