import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class51 {

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public int field663;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public int field661;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public int field662;

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V", line = 5)
    public class51() {
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lhj;)V", line = 7)
    public class51(class51 arg0) {
        this.field663 = arg0.field663;
        this.field661 = arg0.field661;
        this.field662 = arg0.field662;
    }
}
