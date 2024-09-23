import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qb")
public class DoublyLinkList {

    @OriginalMember(owner = "qb", name = "a", descriptor = "Lx;")
    public DoublyLinkable field747 = new DoublyLinkable();

    @OriginalMember(owner = "qb", name = "b", descriptor = "Lx;")
    private DoublyLinkable field748;

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "(I)V")
    public DoublyLinkList(int arg0) {
        int var2 = 61 / arg0;
        this.field747.field405 = this.field747;
        this.field747.field406 = this.field747;
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(Lx;)V")
    public void method262(DoublyLinkable arg0) {
        if (arg0.field406 != null) {
            arg0.method120();
        }
        arg0.field406 = this.field747.field406;
        arg0.field405 = this.field747;
        arg0.field406.field405 = arg0;
        arg0.field405.field406 = arg0;
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "()Lx;")
    public DoublyLinkable method263() {
        DoublyLinkable var1 = this.field747.field405;
        if (this.field747 == var1) {
            return null;
        } else {
            var1.method120();
            return var1;
        }
    }

    @OriginalMember(owner = "qb", name = "b", descriptor = "()Lx;")
    public DoublyLinkable method264() {
        DoublyLinkable var1 = this.field747.field405;
        if (this.field747 == var1) {
            this.field748 = null;
            return null;
        } else {
            this.field748 = var1.field405;
            return var1;
        }
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(I)Lx;")
    public DoublyLinkable method265(int arg0) {
        DoublyLinkable var2 = this.field748;
        if (this.field747 == var2) {
            this.field748 = null;
            return null;
        }
        this.field748 = var2.field405;
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "qb", name = "c", descriptor = "()I")
    public int method266() {
        int var1 = 0;
        for (DoublyLinkable var2 = this.field747.field405; var2 != this.field747; var2 = var2.field405) {
            var1++;
        }
        return var1;
    }
}
