import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class433 {

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public int field6469;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public int field6470;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public int field6468;

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V", line = 5)
    public class433() {
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lfc;)V", line = 7)
    public class433(class433 arg0) {
        this.field6469 = arg0.field6469;
        this.field6470 = arg0.field6470;
        this.field6468 = arg0.field6468;
    }
}
