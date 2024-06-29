import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class471 {

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "I")
    public int field6784;

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "I")
    public int field6786;

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "I")
    public int field6785;

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "()V")
    public class471() {
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lgba;)V")
    public class471(class471 arg0) {
        this.field6784 = arg0.field6784;
        this.field6786 = arg0.field6786;
        this.field6785 = arg0.field6785;
    }
}
