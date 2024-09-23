import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qb")
public class DoublyLinkList {

    @OriginalMember(owner = "qb", name = "a", descriptor = "I")
    private int field726 = 309;

    @OriginalMember(owner = "qb", name = "b", descriptor = "Lx;")
    public DoublyLinkable field727 = new DoublyLinkable();

    @OriginalMember(owner = "qb", name = "c", descriptor = "Lx;")
    private DoublyLinkable field728;

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "(I)V")
    public DoublyLinkList(int arg0) {
        int var2 = 32 / arg0;
        this.field727.field389 = this.field727;
        this.field727.field390 = this.field727;
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(Lx;)V")
    public void method255(DoublyLinkable arg0) {
        if (arg0.field390 != null) {
            arg0.method119();
        }
        arg0.field390 = this.field727.field390;
        arg0.field389 = this.field727;
        arg0.field390.field389 = arg0;
        arg0.field389.field390 = arg0;
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "()Lx;")
    public DoublyLinkable method256() {
        DoublyLinkable var1 = this.field727.field389;
        if (this.field727 == var1) {
            return null;
        } else {
            var1.method119();
            return var1;
        }
    }

    @OriginalMember(owner = "qb", name = "b", descriptor = "()Lx;")
    public DoublyLinkable method257() {
        DoublyLinkable var1 = this.field727.field389;
        if (this.field727 == var1) {
            this.field728 = null;
            return null;
        } else {
            this.field728 = var1.field389;
            return var1;
        }
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(I)Lx;")
    public DoublyLinkable method258(int arg0) {
        DoublyLinkable var2 = this.field728;
        if (this.field727 == var2) {
            this.field728 = null;
            return null;
        }
        this.field728 = var2.field389;
        if (arg0 != 7) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "qb", name = "c", descriptor = "()I")
    public int method259() {
        int var1 = 0;
        for (DoublyLinkable var2 = this.field727.field389; var2 != this.field727; var2 = var2.field389) {
            var1++;
        }
        return var1;
    }
}
