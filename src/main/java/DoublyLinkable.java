import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("w")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "w", name = "e", descriptor = "Lw;")
    public DoublyLinkable field389;

    @OriginalMember(owner = "w", name = "f", descriptor = "Lw;")
    public DoublyLinkable field390;

    @OriginalMember(owner = "w", name = "g", descriptor = "Z")
    public static boolean field391;

    @OriginalMember(owner = "w", name = "b", descriptor = "()V")
    public void method107() {
        if (this.field390 != null) {
            this.field390.field389 = this.field389;
            this.field389.field390 = this.field390;
            this.field389 = null;
            this.field390 = null;
        }
    }
}
