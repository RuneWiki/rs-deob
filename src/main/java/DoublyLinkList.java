import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qb")
public class DoublyLinkList {

    @OriginalMember(owner = "qb", name = "a", descriptor = "I")
    private int field774 = 19781;

    @OriginalMember(owner = "qb", name = "b", descriptor = "I")
    private int field775 = 591;

    @OriginalMember(owner = "qb", name = "c", descriptor = "Z")
    private boolean field776 = true;

    @OriginalMember(owner = "qb", name = "d", descriptor = "Lx;")
    public DoublyLinkable field777 = new DoublyLinkable();

    @OriginalMember(owner = "qb", name = "e", descriptor = "Lx;")
    private DoublyLinkable field778;

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "(Z)V")
    public DoublyLinkList(boolean arg0) {
        this.field777.field418 = this.field777;
        if (arg0) {
            this.field775 = -180;
        }
        this.field777.field419 = this.field777;
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(Lx;)V")
    public void method263(DoublyLinkable arg0) {
        if (arg0.field419 != null) {
            arg0.method121();
        }
        arg0.field419 = this.field777.field419;
        arg0.field418 = this.field777;
        arg0.field419.field418 = arg0;
        arg0.field418.field419 = arg0;
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "()Lx;")
    public DoublyLinkable method264() {
        DoublyLinkable var1 = this.field777.field418;
        if (this.field777 == var1) {
            return null;
        } else {
            var1.method121();
            return var1;
        }
    }

    @OriginalMember(owner = "qb", name = "b", descriptor = "()Lx;")
    public DoublyLinkable method265() {
        DoublyLinkable var1 = this.field777.field418;
        if (this.field777 == var1) {
            this.field778 = null;
            return null;
        } else {
            this.field778 = var1.field418;
            return var1;
        }
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(I)Lx;")
    public DoublyLinkable method266(int arg0) {
        DoublyLinkable var2 = this.field778;
        if (this.field777 == var2) {
            this.field778 = null;
            return null;
        }
        this.field778 = var2.field418;
        if (arg0 != 17736) {
            this.field776 = !this.field776;
        }
        return var2;
    }

    @OriginalMember(owner = "qb", name = "c", descriptor = "()I")
    public int method267() {
        int var1 = 0;
        for (DoublyLinkable var2 = this.field777.field418; var2 != this.field777; var2 = var2.field418) {
            var1++;
        }
        return var1;
    }
}
