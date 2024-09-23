import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("db")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "db", name = "g", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "db", name = "e", descriptor = "Ldb;")
    public DoublyLinkable field449;

    @OriginalMember(owner = "db", name = "f", descriptor = "Ldb;")
    public DoublyLinkable field450;

    @OriginalMember(owner = "db", name = "b", descriptor = "()V")
    public void method120() {
        if (this.field450 != null) {
            this.field450.field449 = this.field449;
            this.field449.field450 = this.field450;
            this.field449 = null;
            this.field450 = null;
        }
    }
}
