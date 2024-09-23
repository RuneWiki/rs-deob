import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class LinkList {

    @OriginalMember(owner = "pb", name = "b", descriptor = "Z")
    private boolean field742 = false;

    @OriginalMember(owner = "pb", name = "c", descriptor = "Lv;")
    public Linkable field743 = new Linkable();

    @OriginalMember(owner = "pb", name = "a", descriptor = "I")
    private int field741;

    @OriginalMember(owner = "pb", name = "d", descriptor = "Lv;")
    private Linkable field744;

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(Z)V")
    public LinkList(boolean arg0) {
        if (arg0) {
            this.field741 = -32;
        }
        this.field743.field375 = this.field743;
        this.field743.field376 = this.field743;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Lv;)V")
    public void method255(Linkable arg0) {
        if (arg0.field376 != null) {
            arg0.method120();
        }
        arg0.field376 = this.field743.field376;
        arg0.field375 = this.field743;
        arg0.field376.field375 = arg0;
        arg0.field375.field376 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Lv;I)V")
    public void method256(Linkable arg0, int arg1) {
        if (arg0.field376 != null) {
            arg0.method120();
        }
        arg0.field376 = this.field743;
        arg0.field375 = this.field743.field375;
        arg0.field376.field375 = arg0;
        while (arg1 >= 0) {
            this.field742 = !this.field742;
        }
        arg0.field375.field376 = arg0;
        if (Linkable.field377) {
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Lv;")
    public Linkable method257() {
        Linkable var1 = this.field743.field375;
        if (this.field743 == var1) {
            return null;
        } else {
            var1.method120();
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "b", descriptor = "()Lv;")
    public Linkable method258() {
        Linkable var1 = this.field743.field375;
        if (this.field743 == var1) {
            this.field744 = null;
            return null;
        } else {
            this.field744 = var1.field375;
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(B)Lv;")
    public Linkable method259(byte arg0) {
        if (arg0 != 2) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Linkable var3 = this.field743.field376;
        if (this.field743 == var3) {
            this.field744 = null;
            return null;
        } else {
            this.field744 = var3.field376;
            return var3;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(I)Lv;")
    public Linkable method260(int arg0) {
        Linkable var2 = this.field744;
        if (this.field743 == var2) {
            this.field744 = null;
            return null;
        }
        this.field744 = var2.field375;
        if (arg0 != 6) {
            this.field742 = !this.field742;
        }
        return var2;
    }

    @OriginalMember(owner = "pb", name = "b", descriptor = "(I)Lv;")
    public Linkable method261(int arg0) {
        Linkable var2 = this.field744;
        if (arg0 != 0) {
            this.field741 = -273;
        }
        if (this.field743 == var2) {
            this.field744 = null;
            return null;
        } else {
            this.field744 = var2.field376;
            return var2;
        }
    }

    @OriginalMember(owner = "pb", name = "c", descriptor = "()V")
    public void method262() {
        while (true) {
            Linkable var1 = this.field743.field375;
            if (this.field743 == var1) {
                return;
            }
            var1.method120();
        }
    }
}
