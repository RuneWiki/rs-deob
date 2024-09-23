import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class LinkList {

    @OriginalMember(owner = "pb", name = "a", descriptor = "Z")
    private boolean field740 = true;

    @OriginalMember(owner = "pb", name = "b", descriptor = "I")
    private int field741 = 15991;

    @OriginalMember(owner = "pb", name = "c", descriptor = "I")
    private int field742 = 7;

    @OriginalMember(owner = "pb", name = "d", descriptor = "Lv;")
    public Linkable field743 = new Linkable();

    @OriginalMember(owner = "pb", name = "e", descriptor = "Lv;")
    private Linkable field744;

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(I)V")
    public LinkList(int arg0) {
        if (arg0 >= 0) {
            this.field742 = -347;
        }
        this.field743.field373 = this.field743;
        this.field743.field374 = this.field743;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Lv;)V")
    public void method255(Linkable arg0) {
        if (arg0.field374 != null) {
            arg0.method120();
        }
        arg0.field374 = this.field743.field374;
        arg0.field373 = this.field743;
        arg0.field374.field373 = arg0;
        arg0.field373.field374 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Lv;I)V")
    public void method256(Linkable arg0, int arg1) {
        if (arg0.field374 != null) {
            arg0.method120();
        }
        arg0.field374 = this.field743;
        arg0.field373 = this.field743.field373;
        arg0.field374.field373 = arg0;
        arg0.field373.field374 = arg0;
        if (arg1 != 6) {
            this.field740 = !this.field740;
        } else if (Linkable.field375) {
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Lv;")
    public Linkable method257() {
        Linkable var1 = this.field743.field373;
        if (this.field743 == var1) {
            return null;
        } else {
            var1.method120();
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "b", descriptor = "()Lv;")
    public Linkable method258() {
        Linkable var1 = this.field743.field373;
        if (this.field743 == var1) {
            this.field744 = null;
            return null;
        } else {
            this.field744 = var1.field373;
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(B)Lv;")
    public Linkable method259(byte arg0) {
        Linkable var2 = this.field743.field374;
        if (arg0 != 1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field743 == var2) {
            this.field744 = null;
            return null;
        } else {
            this.field744 = var2.field374;
            return var2;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Z)Lv;")
    public Linkable method260(boolean arg0) {
        Linkable var2 = this.field744;
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field743 == var2) {
            this.field744 = null;
            return null;
        } else {
            this.field744 = var2.field373;
            return var2;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(I)Lv;")
    public Linkable method261(int arg0) {
        Linkable var2 = this.field744;
        if (this.field741 != arg0) {
            throw new NullPointerException();
        } else if (this.field743 == var2) {
            this.field744 = null;
            return null;
        } else {
            this.field744 = var2.field374;
            return var2;
        }
    }

    @OriginalMember(owner = "pb", name = "c", descriptor = "()V")
    public void method262() {
        while (true) {
            Linkable var1 = this.field743.field373;
            if (this.field743 == var1) {
                return;
            }
            var1.method120();
        }
    }
}
