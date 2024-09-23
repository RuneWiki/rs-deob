import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qb")
public class DoublyLinkList {

    @OriginalMember(owner = "qb", name = "a", descriptor = "I")
    private int field745 = -10897;

    @OriginalMember(owner = "qb", name = "b", descriptor = "I")
    private int field746 = 2;

    @OriginalMember(owner = "qb", name = "c", descriptor = "I")
    private int field747 = 15991;

    @OriginalMember(owner = "qb", name = "d", descriptor = "Lx;")
    public DoublyLinkable field748 = new DoublyLinkable();

    @OriginalMember(owner = "qb", name = "e", descriptor = "Lx;")
    private DoublyLinkable field749;

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "(Z)V")
    public DoublyLinkList(boolean arg0) {
        this.field748.field399 = this.field748;
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field748.field400 = this.field748;
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(Lx;)V")
    public void method263(DoublyLinkable arg0) {
        if (arg0.field400 != null) {
            arg0.method121();
        }
        arg0.field400 = this.field748.field400;
        arg0.field399 = this.field748;
        arg0.field400.field399 = arg0;
        arg0.field399.field400 = arg0;
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "()Lx;")
    public DoublyLinkable method264() {
        DoublyLinkable var1 = this.field748.field399;
        if (this.field748 == var1) {
            return null;
        } else {
            var1.method121();
            return var1;
        }
    }

    @OriginalMember(owner = "qb", name = "b", descriptor = "()Lx;")
    public DoublyLinkable method265() {
        DoublyLinkable var1 = this.field748.field399;
        if (this.field748 == var1) {
            this.field749 = null;
            return null;
        } else {
            this.field749 = var1.field399;
            return var1;
        }
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(Z)Lx;")
    public DoublyLinkable method266(boolean arg0) {
        DoublyLinkable var2 = this.field749;
        if (!arg0) {
            throw new NullPointerException();
        } else if (this.field748 == var2) {
            this.field749 = null;
            return null;
        } else {
            this.field749 = var2.field399;
            return var2;
        }
    }

    @OriginalMember(owner = "qb", name = "c", descriptor = "()I")
    public int method267() {
        int var1 = 0;
        for (DoublyLinkable var2 = this.field748.field399; var2 != this.field748; var2 = var2.field399) {
            var1++;
        }
        return var1;
    }
}
