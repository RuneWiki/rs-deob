import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class155 extends class91 {

    @OriginalMember(owner = "client!taa", name = "m", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!taa", name = "k", descriptor = "Ltaa;")
    public class155 field2449;

    @OriginalMember(owner = "client!taa", name = "l", descriptor = "Ltaa;")
    public class155 field2450;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)V")
    public final void method1207(byte arg0) {
        field2451++;
        if (this.field2449 == null) {
            return;
        }
        this.field2449.field2450 = this.field2450;
        if (arg0 != -1) {
            this.field2449 = null;
        }
        this.field2450.field2449 = this.field2449;
        this.field2450 = null;
        this.field2449 = null;
    }
}
