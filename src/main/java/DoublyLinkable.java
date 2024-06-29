import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Ldb;")
    public DoublyLinkable field438;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Ldb;")
    public DoublyLinkable field439;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "()V")
    public void method120() {
        if (this.field439 != null) {
            this.field439.field438 = this.field438;
            this.field438.field439 = this.field439;
            this.field438 = null;
            this.field439 = null;
        }
    }
}
