import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qb")
public class DoublyLinkList {

    @OriginalMember(owner = "qb", name = "a", descriptor = "I")
    private int field750 = 35985;

    @OriginalMember(owner = "qb", name = "b", descriptor = "I")
    private int field751 = 451;

    @OriginalMember(owner = "qb", name = "c", descriptor = "Lw;")
    public DoublyLinkable field752 = new DoublyLinkable();

    @OriginalMember(owner = "qb", name = "d", descriptor = "Lw;")
    private DoublyLinkable field753;

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "(I)V")
    public DoublyLinkList(int arg0) {
        if (arg0 <= 0) {
            this.field750 = -337;
        }
        this.field752.field393 = this.field752;
        this.field752.field394 = this.field752;
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(Lw;)V")
    public void method252(DoublyLinkable arg0) {
        if (arg0.field394 != null) {
            arg0.method107();
        }
        arg0.field394 = this.field752.field394;
        arg0.field393 = this.field752;
        arg0.field394.field393 = arg0;
        arg0.field393.field394 = arg0;
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "()Lw;")
    public DoublyLinkable method253() {
        DoublyLinkable var1 = this.field752.field393;
        if (this.field752 == var1) {
            return null;
        } else {
            var1.method107();
            return var1;
        }
    }

    @OriginalMember(owner = "qb", name = "b", descriptor = "()Lw;")
    public DoublyLinkable method254() {
        DoublyLinkable var1 = this.field752.field393;
        if (this.field752 == var1) {
            this.field753 = null;
            return null;
        } else {
            this.field753 = var1.field393;
            return var1;
        }
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(I)Lw;")
    public DoublyLinkable method255(int arg0) {
        DoublyLinkable var2 = this.field753;
        if (this.field752 == var2) {
            this.field753 = null;
            return null;
        } else {
            this.field753 = var2.field393;
            int var3 = 73 / arg0;
            return var2;
        }
    }

    @OriginalMember(owner = "qb", name = "c", descriptor = "()I")
    public int method256() {
        int var1 = 0;
        for (DoublyLinkable var2 = this.field752.field393; var2 != this.field752; var2 = var2.field393) {
            var1++;
        }
        return var1;
    }
}
