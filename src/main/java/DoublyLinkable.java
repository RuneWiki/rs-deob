import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("db")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "db", name = "h", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "db", name = "f", descriptor = "Ldb;")
    public DoublyLinkable field437;

    @OriginalMember(owner = "db", name = "g", descriptor = "Ldb;")
    public DoublyLinkable field438;

    @OriginalMember(owner = "db", name = "b", descriptor = "()V")
    public void method119() {
        if (this.field438 != null) {
            this.field438.field437 = this.field437;
            this.field437.field438 = this.field438;
            this.field437 = null;
            this.field438 = null;
        }
    }
}
