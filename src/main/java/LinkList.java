import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nb")
public class LinkList {

    @OriginalMember(owner = "nb", name = "a", descriptor = "Z")
    private boolean field624 = true;

    @OriginalMember(owner = "nb", name = "b", descriptor = "B")
    private byte field625 = 69;

    @OriginalMember(owner = "nb", name = "c", descriptor = "I")
    private int field626 = 845;

    @OriginalMember(owner = "nb", name = "d", descriptor = "Lt;")
    public Linkable field627 = new Linkable();

    @OriginalMember(owner = "nb", name = "e", descriptor = "Lt;")
    public Linkable field628;

    @OriginalMember(owner = "nb", name = "<init>", descriptor = "(I)V")
    public LinkList(int arg0) {
        this.field627.field274 = this.field627;
        this.field627.field275 = this.field627;
        int var2 = 11 / arg0;
    }

    @OriginalMember(owner = "nb", name = "a", descriptor = "(Lt;)V")
    public void method201(Linkable arg0) {
        if (arg0.field275 != null) {
            arg0.method89();
        }
        arg0.field275 = this.field627.field275;
        arg0.field274 = this.field627;
        arg0.field275.field274 = arg0;
        arg0.field274.field275 = arg0;
    }

    @OriginalMember(owner = "nb", name = "a", descriptor = "()Lt;")
    public Linkable method202() {
        Linkable var1 = this.field627.field274;
        if (this.field627 == var1) {
            return null;
        } else {
            var1.method89();
            return var1;
        }
    }

    @OriginalMember(owner = "nb", name = "b", descriptor = "()Lt;")
    public Linkable method203() {
        Linkable var1 = this.field627.field274;
        if (this.field627 == var1) {
            this.field628 = null;
            return null;
        } else {
            this.field628 = var1.field274;
            return var1;
        }
    }

    @OriginalMember(owner = "nb", name = "a", descriptor = "(B)Lt;")
    public Linkable method204(byte arg0) {
        if (this.field625 != arg0) {
            throw new NullPointerException();
        }
        Linkable var2 = this.field627.field275;
        if (this.field627 == var2) {
            this.field628 = null;
            return null;
        } else {
            this.field628 = var2.field275;
            return var2;
        }
    }

    @OriginalMember(owner = "nb", name = "a", descriptor = "(I)Lt;")
    public Linkable method205(int arg0) {
        Linkable var2 = this.field628;
        if (this.field627 == var2) {
            this.field628 = null;
            return null;
        }
        this.field628 = var2.field274;
        if (arg0 != -14092) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "nb", name = "b", descriptor = "(B)Lt;")
    public Linkable method206(byte arg0) {
        Linkable var2 = this.field628;
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        if (this.field627 == var2) {
            this.field628 = null;
            return null;
        } else {
            this.field628 = var2.field275;
            return var2;
        }
    }

    @OriginalMember(owner = "nb", name = "c", descriptor = "()V")
    public void method207() {
        while (true) {
            Linkable var1 = this.field627.field274;
            if (this.field627 == var1) {
                return;
            }
            var1.method89();
        }
    }
}
