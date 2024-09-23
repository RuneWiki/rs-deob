import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class LinkList {

    @OriginalMember(owner = "pb", name = "b", descriptor = "I")
    private int field743 = 5;

    @OriginalMember(owner = "pb", name = "c", descriptor = "Z")
    private boolean field744 = false;

    @OriginalMember(owner = "pb", name = "d", descriptor = "Lv;")
    public Linkable field745 = new Linkable();

    @OriginalMember(owner = "pb", name = "a", descriptor = "I")
    private int field742;

    @OriginalMember(owner = "pb", name = "e", descriptor = "Lv;")
    private Linkable field746;

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(Z)V")
    public LinkList(boolean arg0) {
        this.field745.field379 = this.field745;
        this.field745.field380 = this.field745;
        if (arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Lv;)V")
    public void method254(Linkable arg0) {
        if (arg0.field380 != null) {
            arg0.method119();
        }
        arg0.field380 = this.field745.field380;
        arg0.field379 = this.field745;
        arg0.field380.field379 = arg0;
        arg0.field379.field380 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Lv;I)V")
    public void method255(Linkable arg0, int arg1) {
        if (arg0.field380 != null) {
            arg0.method119();
        }
        arg0.field380 = this.field745;
        if (arg1 <= 0) {
            this.field742 = -465;
        }
        arg0.field379 = this.field745.field379;
        arg0.field380.field379 = arg0;
        arg0.field379.field380 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Lv;")
    public Linkable method256() {
        Linkable var1 = this.field745.field379;
        if (this.field745 == var1) {
            return null;
        } else {
            var1.method119();
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "b", descriptor = "()Lv;")
    public Linkable method257() {
        Linkable var1 = this.field745.field379;
        if (this.field745 == var1) {
            this.field746 = null;
            return null;
        } else {
            this.field746 = var1.field379;
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(B)Lv;")
    public Linkable method258(byte arg0) {
        if (arg0 != -43) {
            throw new NullPointerException();
        }
        Linkable var2 = this.field745.field380;
        if (this.field745 == var2) {
            this.field746 = null;
            return null;
        } else {
            this.field746 = var2.field380;
            return var2;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(I)Lv;")
    public Linkable method259(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        Linkable var2 = this.field746;
        if (this.field745 == var2) {
            this.field746 = null;
            return null;
        } else {
            this.field746 = var2.field379;
            return var2;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Z)Lv;")
    public Linkable method260(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Linkable var3 = this.field746;
        if (this.field745 == var3) {
            this.field746 = null;
            return null;
        } else {
            this.field746 = var3.field380;
            return var3;
        }
    }

    @OriginalMember(owner = "pb", name = "c", descriptor = "()V")
    public void method261() {
        while (true) {
            Linkable var1 = this.field745.field379;
            if (this.field745 == var1) {
                return;
            }
            var1.method119();
        }
    }
}
