import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("db")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "db", name = "h", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "db", name = "f", descriptor = "Ldb;")
    public DoublyLinkable field445;

    @OriginalMember(owner = "db", name = "g", descriptor = "Ldb;")
    public DoublyLinkable field446;

    @OriginalMember(owner = "db", name = "b", descriptor = "()V")
    public void method119() {
        if (this.field446 != null) {
            this.field446.field445 = this.field445;
            this.field445.field446 = this.field446;
            this.field445 = null;
            this.field446 = null;
        }
    }
}
