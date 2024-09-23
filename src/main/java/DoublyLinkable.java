import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("db")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "db", name = "g", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "db", name = "e", descriptor = "Ldb;")
    public DoublyLinkable field440;

    @OriginalMember(owner = "db", name = "f", descriptor = "Ldb;")
    public DoublyLinkable field441;

    @OriginalMember(owner = "db", name = "b", descriptor = "()V")
    public void method119() {
        if (this.field441 != null) {
            this.field441.field440 = this.field440;
            this.field440.field441 = this.field441;
            this.field440 = null;
            this.field441 = null;
        }
    }
}
