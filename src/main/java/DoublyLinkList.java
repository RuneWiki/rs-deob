import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CZYJUOKA")
public class DoublyLinkList {

    @OriginalMember(owner = "client!CZYJUOKA", name = "a", descriptor = "Z")
    private boolean field630 = true;

    @OriginalMember(owner = "client!CZYJUOKA", name = "b", descriptor = "LDPPNUUMQ;")
    public DoublyLinkable field631 = new DoublyLinkable();

    @OriginalMember(owner = "client!CZYJUOKA", name = "c", descriptor = "LDPPNUUMQ;")
    private DoublyLinkable field632;

    @OriginalMember(owner = "client!CZYJUOKA", name = "<init>", descriptor = "(Z)V")
    public DoublyLinkList(boolean arg0) {
        this.field631.field633 = this.field631;
        this.field631.field634 = this.field631;
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!CZYJUOKA", name = "a", descriptor = "(LDPPNUUMQ;)V")
    public void method180(DoublyLinkable arg0) {
        if (arg0.field634 != null) {
            arg0.method185();
        }
        arg0.field634 = this.field631.field634;
        arg0.field633 = this.field631;
        arg0.field634.field633 = arg0;
        arg0.field633.field634 = arg0;
    }

    @OriginalMember(owner = "client!CZYJUOKA", name = "a", descriptor = "()LDPPNUUMQ;")
    public DoublyLinkable method181() {
        DoublyLinkable var1 = this.field631.field633;
        if (this.field631 == var1) {
            return null;
        } else {
            var1.method185();
            return var1;
        }
    }

    @OriginalMember(owner = "client!CZYJUOKA", name = "b", descriptor = "()LDPPNUUMQ;")
    public DoublyLinkable method182() {
        DoublyLinkable var1 = this.field631.field633;
        if (this.field631 == var1) {
            this.field632 = null;
            return null;
        } else {
            this.field632 = var1.field633;
            return var1;
        }
    }

    @OriginalMember(owner = "client!CZYJUOKA", name = "a", descriptor = "(I)LDPPNUUMQ;")
    public DoublyLinkable method183(int arg0) {
        DoublyLinkable var2 = this.field632;
        if (this.field631 == var2) {
            this.field632 = null;
            return null;
        }
        this.field632 = var2.field633;
        if (arg0 < 1 || arg0 > 1) {
            this.field630 = !this.field630;
        }
        return var2;
    }

    @OriginalMember(owner = "client!CZYJUOKA", name = "c", descriptor = "()I")
    public int method184() {
        int var1 = 0;
        for (DoublyLinkable var2 = this.field631.field633; var2 != this.field631; var2 = var2.field633) {
            var1++;
        }
        return var1;
    }
}
