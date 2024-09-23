import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class DoublyLinkList {

    @OriginalMember(owner = "pb", name = "a", descriptor = "Z")
    private boolean field666 = false;

    @OriginalMember(owner = "pb", name = "b", descriptor = "Z")
    private boolean field667 = true;

    @OriginalMember(owner = "pb", name = "c", descriptor = "I")
    private int field668 = 638;

    @OriginalMember(owner = "pb", name = "d", descriptor = "Ldb;")
    private DoublyLinkable field669 = new DoublyLinkable();

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(I)V")
    public DoublyLinkList(int arg0) {
        this.field669.field439 = this.field669;
        int var2 = 59 / arg0;
        this.field669.field440 = this.field669;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Ldb;)V")
    public void method232(DoublyLinkable arg0) {
        if (arg0.field440 != null) {
            arg0.method118();
        }
        arg0.field440 = this.field669.field440;
        arg0.field439 = this.field669;
        arg0.field440.field439 = arg0;
        arg0.field439.field440 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Ldb;")
    public DoublyLinkable method233() {
        DoublyLinkable var1 = this.field669.field439;
        if (this.field669 == var1) {
            return null;
        } else {
            var1.method118();
            return var1;
        }
    }
}
