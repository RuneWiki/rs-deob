import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EEYSIGWL")
public class class14 extends class54 {

    @OriginalMember(owner = "EEYSIGWL", name = "h", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "EEYSIGWL", name = "f", descriptor = "LEEYSIGWL;")
    public class14 field653;

    @OriginalMember(owner = "EEYSIGWL", name = "g", descriptor = "LEEYSIGWL;")
    public class14 field654;

    @OriginalMember(owner = "EEYSIGWL", name = "b", descriptor = "()V")
    public void method215() {
        if (this.field654 != null) {
            this.field654.field653 = this.field653;
            this.field653.field654 = this.field654;
            this.field653 = null;
            this.field654 = null;
        }
    }
}
