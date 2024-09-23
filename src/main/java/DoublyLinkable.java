import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("x")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "x", name = "g", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "x", name = "e", descriptor = "Lx;")
    public DoublyLinkable field389;

    @OriginalMember(owner = "x", name = "f", descriptor = "Lx;")
    public DoublyLinkable field390;

    @OriginalMember(owner = "x", name = "b", descriptor = "()V")
    public void method119() {
        if (this.field390 != null) {
            this.field390.field389 = this.field389;
            this.field389.field390 = this.field390;
            this.field389 = null;
            this.field390 = null;
        }
    }
}
