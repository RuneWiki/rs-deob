import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class LinkList {

    @OriginalMember(owner = "pb", name = "a", descriptor = "Z")
    private boolean field747 = true;

    @OriginalMember(owner = "pb", name = "b", descriptor = "Z")
    private boolean field748 = false;

    @OriginalMember(owner = "pb", name = "c", descriptor = "Lv;")
    public Linkable field749 = new Linkable();

    @OriginalMember(owner = "pb", name = "d", descriptor = "Lv;")
    private Linkable field750;

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(B)V")
    public LinkList(byte arg0) {
        this.field749.field375 = this.field749;
        this.field749.field376 = this.field749;
        if (arg0 != -118) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Lv;)V")
    public void method255(Linkable arg0) {
        if (arg0.field376 != null) {
            arg0.method120();
        }
        arg0.field376 = this.field749.field376;
        arg0.field375 = this.field749;
        arg0.field376.field375 = arg0;
        arg0.field375.field376 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(ILv;)V")
    public void method256(int arg0, Linkable arg1) {
        if (arg1.field376 != null) {
            arg1.method120();
        }
        arg1.field376 = this.field749;
        int var3 = 63 / arg0;
        arg1.field375 = this.field749.field375;
        arg1.field376.field375 = arg1;
        arg1.field375.field376 = arg1;
        if (Linkable.field377) {
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Lv;")
    public Linkable method257() {
        Linkable var1 = this.field749.field375;
        if (this.field749 == var1) {
            return null;
        } else {
            var1.method120();
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "b", descriptor = "()Lv;")
    public Linkable method258() {
        Linkable var1 = this.field749.field375;
        if (this.field749 == var1) {
            this.field750 = null;
            return null;
        } else {
            this.field750 = var1.field375;
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Z)Lv;")
    public Linkable method259(boolean arg0) {
        Linkable var2 = this.field749.field376;
        if (this.field749 == var2) {
            this.field750 = null;
            return null;
        }
        this.field750 = var2.field376;
        if (arg0) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(I)Lv;")
    public Linkable method260(int arg0) {
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        Linkable var2 = this.field750;
        if (this.field749 == var2) {
            this.field750 = null;
            return null;
        } else {
            this.field750 = var2.field375;
            return var2;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(B)Lv;")
    public Linkable method261(byte arg0) {
        if (arg0 != 96) {
            this.field748 = !this.field748;
        }
        Linkable var2 = this.field750;
        if (this.field749 == var2) {
            this.field750 = null;
            return null;
        } else {
            this.field750 = var2.field376;
            return var2;
        }
    }

    @OriginalMember(owner = "pb", name = "c", descriptor = "()V")
    public void method262() {
        while (true) {
            Linkable var1 = this.field749.field375;
            if (this.field749 == var1) {
                return;
            }
            var1.method120();
        }
    }
}
