import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qb")
public class DoublyLinkList {

    @OriginalMember(owner = "qb", name = "a", descriptor = "Z")
    private boolean field732 = true;

    @OriginalMember(owner = "qb", name = "b", descriptor = "Lx;")
    public DoublyLinkable field733 = new DoublyLinkable();

    @OriginalMember(owner = "qb", name = "c", descriptor = "Lx;")
    private DoublyLinkable field734;

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "(B)V")
    public DoublyLinkList(byte arg0) {
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        this.field733.field393 = this.field733;
        this.field733.field394 = this.field733;
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(Lx;)V")
    public void method255(DoublyLinkable arg0) {
        if (arg0.field394 != null) {
            arg0.method119();
        }
        arg0.field394 = this.field733.field394;
        arg0.field393 = this.field733;
        arg0.field394.field393 = arg0;
        arg0.field393.field394 = arg0;
        if (Linkable.field369) {
        }
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "()Lx;")
    public DoublyLinkable method256() {
        DoublyLinkable var1 = this.field733.field393;
        if (this.field733 == var1) {
            return null;
        } else {
            var1.method119();
            return var1;
        }
    }

    @OriginalMember(owner = "qb", name = "b", descriptor = "()Lx;")
    public DoublyLinkable method257() {
        DoublyLinkable var1 = this.field733.field393;
        if (this.field733 == var1) {
            this.field734 = null;
            return null;
        } else {
            this.field734 = var1.field393;
            return var1;
        }
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(Z)Lx;")
    public DoublyLinkable method258(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        DoublyLinkable var2 = this.field734;
        if (this.field733 == var2) {
            this.field734 = null;
            return null;
        } else {
            this.field734 = var2.field393;
            return var2;
        }
    }

    @OriginalMember(owner = "qb", name = "c", descriptor = "()I")
    public int method259() {
        int var1 = 0;
        for (DoublyLinkable var2 = this.field733.field393; var2 != this.field733; var2 = var2.field393) {
            var1++;
        }
        return var1;
    }
}
