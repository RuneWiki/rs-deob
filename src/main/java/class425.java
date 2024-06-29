import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class425 {

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "I")
    public int field6162;

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "I")
    public int field6163;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "I")
    public int field6161;

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "()V")
    public class425() {
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Lifa;)V")
    public class425(class425 arg0) {
        this.field6162 = arg0.field6162;
        this.field6163 = arg0.field6163;
        this.field6161 = arg0.field6161;
    }
}
