import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class DoublyLinkList {

    @OriginalMember(owner = "pb", name = "a", descriptor = "I")
    private int field666 = 485;

    @OriginalMember(owner = "pb", name = "b", descriptor = "Ldb;")
    private DoublyLinkable field667 = new DoublyLinkable();

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(I)V")
    public DoublyLinkList(int arg0) {
        this.field667.field449 = this.field667;
        this.field667.field450 = this.field667;
        if (arg0 < 4 || arg0 > 4) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Ldb;)V")
    public void method240(DoublyLinkable arg0) {
        if (arg0.field450 != null) {
            arg0.method120();
        }
        arg0.field450 = this.field667.field450;
        arg0.field449 = this.field667;
        arg0.field450.field449 = arg0;
        arg0.field449.field450 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Ldb;")
    public DoublyLinkable method241() {
        DoublyLinkable var1 = this.field667.field449;
        if (this.field667 == var1) {
            return null;
        } else {
            var1.method120();
            return var1;
        }
    }
}
