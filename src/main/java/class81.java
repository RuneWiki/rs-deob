import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class81 {

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public int field1351;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public int field1354;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public int field1353;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public int field1352;

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V", line = 6)
    public class81() {
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lnh;)V", line = 8)
    public class81(class81 arg0) {
        this.field1351 = arg0.field1351;
        this.field1354 = arg0.field1354;
        this.field1353 = arg0.field1353;
        this.field1352 = arg0.field1352;
    }
}
