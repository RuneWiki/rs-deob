import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class433 {

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "I")
    public int field6113;

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "I")
    public int field6115;

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "I")
    public int field6114;

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "()V")
    public class433() {
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Ldaa;)V")
    public class433(class433 arg0) {
        this.field6113 = arg0.field6113;
        this.field6115 = arg0.field6115;
        this.field6114 = arg0.field6114;
    }
}
