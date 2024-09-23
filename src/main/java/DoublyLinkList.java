import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qb")
public class DoublyLinkList {

    @OriginalMember(owner = "qb", name = "a", descriptor = "Z")
    private boolean field751 = false;

    @OriginalMember(owner = "qb", name = "b", descriptor = "I")
    private int field752 = 826;

    @OriginalMember(owner = "qb", name = "c", descriptor = "Lx;")
    public DoublyLinkable field753 = new DoublyLinkable();

    @OriginalMember(owner = "qb", name = "d", descriptor = "Lx;")
    private DoublyLinkable field754;

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "(I)V")
    public DoublyLinkList(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        this.field753.field396 = this.field753;
        this.field753.field397 = this.field753;
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(Lx;)V")
    public void method262(DoublyLinkable arg0) {
        if (arg0.field397 != null) {
            arg0.method120();
        }
        arg0.field397 = this.field753.field397;
        arg0.field396 = this.field753;
        arg0.field397.field396 = arg0;
        arg0.field396.field397 = arg0;
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "()Lx;")
    public DoublyLinkable method263() {
        DoublyLinkable var1 = this.field753.field396;
        if (this.field753 == var1) {
            return null;
        } else {
            var1.method120();
            return var1;
        }
    }

    @OriginalMember(owner = "qb", name = "b", descriptor = "()Lx;")
    public DoublyLinkable method264() {
        DoublyLinkable var1 = this.field753.field396;
        if (this.field753 == var1) {
            this.field754 = null;
            return null;
        } else {
            this.field754 = var1.field396;
            return var1;
        }
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(I)Lx;")
    public DoublyLinkable method265(int arg0) {
        DoublyLinkable var2 = this.field754;
        while (arg0 >= 0) {
            this.field751 = !this.field751;
        }
        if (this.field753 == var2) {
            this.field754 = null;
            return null;
        } else {
            this.field754 = var2.field396;
            return var2;
        }
    }

    @OriginalMember(owner = "qb", name = "c", descriptor = "()I")
    public int method266() {
        int var1 = 0;
        for (DoublyLinkable var2 = this.field753.field396; var2 != this.field753; var2 = var2.field396) {
            var1++;
        }
        return var1;
    }
}
