import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Lw;")
    public DoublyLinkable field389;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "Lw;")
    public DoublyLinkable field390;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "Z")
    public static boolean field391;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()V")
    public void method107() {
        if (this.field390 != null) {
            this.field390.field389 = this.field389;
            this.field389.field390 = this.field390;
            this.field389 = null;
            this.field390 = null;
        }
    }
}
