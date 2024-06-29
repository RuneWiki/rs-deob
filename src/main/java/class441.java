import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class441 {

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public int field6455;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public int field6453;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public int field6452;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public int field6454;

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V", line = 6)
    public class441() {
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lhd;)V", line = 8)
    public class441(class441 arg0) {
        this.field6455 = arg0.field6455;
        this.field6453 = arg0.field6453;
        this.field6452 = arg0.field6452;
        this.field6454 = arg0.field6454;
    }
}
