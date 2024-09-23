import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qb")
public class DoublyLinkList {

    @OriginalMember(owner = "qb", name = "a", descriptor = "Z")
    private boolean field745 = false;

    @OriginalMember(owner = "qb", name = "b", descriptor = "Z")
    private boolean field746 = false;

    @OriginalMember(owner = "qb", name = "c", descriptor = "Lx;")
    public DoublyLinkable field747 = new DoublyLinkable();

    @OriginalMember(owner = "qb", name = "d", descriptor = "Lx;")
    private DoublyLinkable field748;

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "(I)V")
    public DoublyLinkList(int arg0) {
        if (arg0 != 0) {
            this.field746 = !this.field746;
        }
        this.field747.field401 = this.field747;
        this.field747.field402 = this.field747;
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(Lx;)V")
    public void method263(DoublyLinkable arg0) {
        if (arg0.field402 != null) {
            arg0.method121();
        }
        arg0.field402 = this.field747.field402;
        arg0.field401 = this.field747;
        arg0.field402.field401 = arg0;
        arg0.field401.field402 = arg0;
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "()Lx;")
    public DoublyLinkable method264() {
        DoublyLinkable var1 = this.field747.field401;
        if (this.field747 == var1) {
            return null;
        } else {
            var1.method121();
            return var1;
        }
    }

    @OriginalMember(owner = "qb", name = "b", descriptor = "()Lx;")
    public DoublyLinkable method265() {
        DoublyLinkable var1 = this.field747.field401;
        if (this.field747 == var1) {
            this.field748 = null;
            return null;
        } else {
            this.field748 = var1.field401;
            return var1;
        }
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(I)Lx;")
    public DoublyLinkable method266(int arg0) {
        DoublyLinkable var2 = this.field748;
        if (this.field747 == var2) {
            this.field748 = null;
            return null;
        }
        this.field748 = var2.field401;
        if (arg0 != 6) {
            this.field745 = !this.field745;
        }
        return var2;
    }

    @OriginalMember(owner = "qb", name = "c", descriptor = "()I")
    public int method267() {
        int var1 = 0;
        for (DoublyLinkable var2 = this.field747.field401; var2 != this.field747; var2 = var2.field401) {
            var1++;
        }
        return var1;
    }
}
