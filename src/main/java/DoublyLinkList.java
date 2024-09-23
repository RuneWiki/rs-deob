import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class DoublyLinkList {

    @OriginalMember(owner = "pb", name = "a", descriptor = "Z")
    private boolean field668 = false;

    @OriginalMember(owner = "pb", name = "b", descriptor = "Ldb;")
    private DoublyLinkable field669 = new DoublyLinkable();

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(I)V")
    public DoublyLinkList(int arg0) {
        this.field669.field445 = this.field669;
        this.field669.field446 = this.field669;
        int var2 = 33 / arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Ldb;)V")
    public void method233(DoublyLinkable arg0) {
        if (arg0.field446 != null) {
            arg0.method119();
        }
        arg0.field446 = this.field669.field446;
        arg0.field445 = this.field669;
        arg0.field446.field445 = arg0;
        arg0.field445.field446 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Ldb;")
    public DoublyLinkable method234() {
        DoublyLinkable var1 = this.field669.field445;
        if (this.field669 == var1) {
            return null;
        } else {
            var1.method119();
            return var1;
        }
    }
}
