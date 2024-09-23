import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class LinkList {

    @OriginalMember(owner = "pb", name = "a", descriptor = "Z")
    private boolean field766 = false;

    @OriginalMember(owner = "pb", name = "b", descriptor = "I")
    private int field767 = -14686;

    @OriginalMember(owner = "pb", name = "c", descriptor = "I")
    private int field768 = 19781;

    @OriginalMember(owner = "pb", name = "d", descriptor = "Z")
    private boolean field769 = true;

    @OriginalMember(owner = "pb", name = "e", descriptor = "I")
    private int field770 = 253;

    @OriginalMember(owner = "pb", name = "f", descriptor = "Z")
    private boolean field771 = false;

    @OriginalMember(owner = "pb", name = "g", descriptor = "Lv;")
    public Linkable field772 = new Linkable();

    @OriginalMember(owner = "pb", name = "h", descriptor = "Lv;")
    private Linkable field773;

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(Z)V")
    public LinkList(boolean arg0) {
        if (!arg0) {
            this.field766 = !this.field766;
        }
        this.field772.field391 = this.field772;
        this.field772.field392 = this.field772;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Lv;)V")
    public void method255(Linkable arg0) {
        if (arg0.field392 != null) {
            arg0.method120();
        }
        arg0.field392 = this.field772.field392;
        arg0.field391 = this.field772;
        arg0.field392.field391 = arg0;
        arg0.field391.field392 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Lv;I)V")
    public void method256(Linkable arg0, int arg1) {
        if (arg0.field392 != null) {
            arg0.method120();
        }
        arg0.field392 = this.field772;
        arg0.field391 = this.field772.field391;
        arg0.field392.field391 = arg0;
        if (arg1 != -5257) {
            this.field769 = !this.field769;
        }
        arg0.field391.field392 = arg0;
        if (Linkable.field393) {
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Lv;")
    public Linkable method257() {
        Linkable var1 = this.field772.field391;
        if (this.field772 == var1) {
            return null;
        } else {
            var1.method120();
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "b", descriptor = "()Lv;")
    public Linkable method258() {
        Linkable var1 = this.field772.field391;
        if (this.field772 == var1) {
            this.field773 = null;
            return null;
        } else {
            this.field773 = var1.field391;
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(B)Lv;")
    public Linkable method259(byte arg0) {
        Linkable var2 = this.field772.field392;
        if (arg0 != 69) {
            throw new NullPointerException();
        } else if (this.field772 == var2) {
            this.field773 = null;
            return null;
        } else {
            this.field773 = var2.field392;
            return var2;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(I)Lv;")
    public Linkable method260(int arg0) {
        Linkable var2 = this.field773;
        if (arg0 != 17736) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field772 == var2) {
            this.field773 = null;
            return null;
        } else {
            this.field773 = var2.field391;
            return var2;
        }
    }

    @OriginalMember(owner = "pb", name = "b", descriptor = "(I)Lv;")
    public Linkable method261(int arg0) {
        Linkable var2 = this.field773;
        if (this.field772 == var2) {
            this.field773 = null;
            return null;
        }
        this.field773 = var2.field392;
        if (this.field768 != arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "pb", name = "c", descriptor = "()V")
    public void method262() {
        while (true) {
            Linkable var1 = this.field772.field391;
            if (this.field772 == var1) {
                return;
            }
            var1.method120();
        }
    }
}
