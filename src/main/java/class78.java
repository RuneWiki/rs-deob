import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class78 {

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public int field1112;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public int field1114;

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
    public class78() {
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lqm;)V")
    public class78(class78 arg0) {
        this.field1113 = arg0.field1113;
        this.field1112 = arg0.field1112;
        this.field1114 = arg0.field1114;
    }
}
