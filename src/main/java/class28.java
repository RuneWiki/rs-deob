import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class28 {

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public int field265;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public int field266;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public int field268;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public int field267;

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class28() {
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lbh;)V")
    public class28(class28 arg0) {
        this.field265 = arg0.field265;
        this.field266 = arg0.field266;
        this.field268 = arg0.field268;
        this.field267 = arg0.field267;
    }
}
