import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class DoublyLinkList {

    @OriginalMember(owner = "pb", name = "a", descriptor = "Z")
    private boolean field665 = false;

    @OriginalMember(owner = "pb", name = "b", descriptor = "Ldb;")
    private DoublyLinkable field666 = new DoublyLinkable();

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(I)V")
    public DoublyLinkList(int arg0) {
        this.field666.field440 = this.field666;
        this.field666.field441 = this.field666;
        if (arg0 != 35274) {
            this.field665 = !this.field665;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Ldb;)V")
    public void method233(DoublyLinkable arg0) {
        if (arg0.field441 != null) {
            arg0.method119();
        }
        arg0.field441 = this.field666.field441;
        arg0.field440 = this.field666;
        arg0.field441.field440 = arg0;
        arg0.field440.field441 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Ldb;")
    public DoublyLinkable method234() {
        DoublyLinkable var1 = this.field666.field440;
        if (this.field666 == var1) {
            return null;
        } else {
            var1.method119();
            return var1;
        }
    }
}
