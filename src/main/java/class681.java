import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class681 {

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public int field9320;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public int field9322;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public int field9321;

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V", line = 5)
    public class681() {
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lfk;)V", line = 7)
    public class681(class681 arg0) {
        this.field9320 = arg0.field9320;
        this.field9322 = arg0.field9322;
        this.field9321 = arg0.field9321;
    }
}
