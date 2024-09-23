import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class DoublyLinkList {

    @OriginalMember(owner = "pb", name = "a", descriptor = "I")
    private int field749 = 310;

    @OriginalMember(owner = "pb", name = "b", descriptor = "Z")
    private boolean field750 = false;

    @OriginalMember(owner = "pb", name = "c", descriptor = "Lw;")
    public DoublyLinkable field751 = new DoublyLinkable();

    @OriginalMember(owner = "pb", name = "d", descriptor = "Lw;")
    private DoublyLinkable field752;

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(I)V")
    public DoublyLinkList(int arg0) {
        if (arg0 != 49694) {
            throw new NullPointerException();
        }
        this.field751.field394 = this.field751;
        this.field751.field395 = this.field751;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Lw;)V")
    public void method253(DoublyLinkable arg0) {
        if (arg0.field395 != null) {
            arg0.method107();
        }
        arg0.field395 = this.field751.field395;
        arg0.field394 = this.field751;
        arg0.field395.field394 = arg0;
        arg0.field394.field395 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Lw;")
    public DoublyLinkable method254() {
        DoublyLinkable var1 = this.field751.field394;
        if (this.field751 == var1) {
            return null;
        } else {
            var1.method107();
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "b", descriptor = "()Lw;")
    public DoublyLinkable method255() {
        DoublyLinkable var1 = this.field751.field394;
        if (this.field751 == var1) {
            this.field752 = null;
            return null;
        } else {
            this.field752 = var1.field394;
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(I)Lw;")
    public DoublyLinkable method256(int arg0) {
        DoublyLinkable var2 = this.field752;
        if (this.field751 == var2) {
            this.field752 = null;
            return null;
        }
        this.field752 = var2.field394;
        if (arg0 < 7 || arg0 > 7) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "pb", name = "c", descriptor = "()I")
    public int method257() {
        int var1 = 0;
        for (DoublyLinkable var2 = this.field751.field394; var2 != this.field751; var2 = var2.field394) {
            var1++;
        }
        return var1;
    }
}
