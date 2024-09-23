import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qb")
public class DoublyLinkList {

    @OriginalMember(owner = "qb", name = "a", descriptor = "Lx;")
    public DoublyLinkable field751 = new DoublyLinkable();

    @OriginalMember(owner = "qb", name = "b", descriptor = "Lx;")
    private DoublyLinkable field752;

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "(I)V")
    public DoublyLinkList(int arg0) {
        if (arg0 != 2) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field751.field401 = this.field751;
        this.field751.field402 = this.field751;
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(Lx;)V")
    public void method263(DoublyLinkable arg0) {
        if (arg0.field402 != null) {
            arg0.method121();
        }
        arg0.field402 = this.field751.field402;
        arg0.field401 = this.field751;
        arg0.field402.field401 = arg0;
        arg0.field401.field402 = arg0;
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "()Lx;")
    public DoublyLinkable method264() {
        DoublyLinkable var1 = this.field751.field401;
        if (this.field751 == var1) {
            return null;
        } else {
            var1.method121();
            return var1;
        }
    }

    @OriginalMember(owner = "qb", name = "b", descriptor = "()Lx;")
    public DoublyLinkable method265() {
        DoublyLinkable var1 = this.field751.field401;
        if (this.field751 == var1) {
            this.field752 = null;
            return null;
        } else {
            this.field752 = var1.field401;
            return var1;
        }
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(I)Lx;")
    public DoublyLinkable method266(int arg0) {
        DoublyLinkable var2 = this.field752;
        if (this.field751 == var2) {
            this.field752 = null;
            return null;
        }
        this.field752 = var2.field401;
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "qb", name = "c", descriptor = "()I")
    public int method267() {
        int var1 = 0;
        for (DoublyLinkable var2 = this.field751.field401; var2 != this.field751; var2 = var2.field401) {
            var1++;
        }
        return var1;
    }
}
