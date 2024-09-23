import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pb")
public class LinkList {

    @OriginalMember(owner = "pb", name = "a", descriptor = "I")
    private int field723 = 21315;

    @OriginalMember(owner = "pb", name = "b", descriptor = "Lv;")
    public Linkable field724 = new Linkable();

    @OriginalMember(owner = "pb", name = "c", descriptor = "Lv;")
    private Linkable field725;

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(I)V")
    public LinkList(int arg0) {
        this.field724.field363 = this.field724;
        this.field724.field364 = this.field724;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Lv;)V")
    public void method247(Linkable arg0) {
        if (arg0.field364 != null) {
            arg0.method118();
        }
        arg0.field364 = this.field724.field364;
        arg0.field363 = this.field724;
        arg0.field364.field363 = arg0;
        arg0.field363.field364 = arg0;
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Lv;I)V")
    public void method248(Linkable arg0, int arg1) {
        if (arg0.field364 != null) {
            arg0.method118();
        }
        arg0.field364 = this.field724;
        arg0.field363 = this.field724.field363;
        arg0.field364.field363 = arg0;
        if (arg1 < 0) {
            arg0.field363.field364 = arg0;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()Lv;")
    public Linkable method249() {
        Linkable var1 = this.field724.field363;
        if (this.field724 == var1) {
            return null;
        } else {
            var1.method118();
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "b", descriptor = "()Lv;")
    public Linkable method250() {
        Linkable var1 = this.field724.field363;
        if (this.field724 == var1) {
            this.field725 = null;
            return null;
        } else {
            this.field725 = var1.field363;
            return var1;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Z)Lv;")
    public Linkable method251(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Linkable var3 = this.field724.field364;
        if (this.field724 == var3) {
            this.field725 = null;
            return null;
        } else {
            this.field725 = var3.field364;
            return var3;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(I)Lv;")
    public Linkable method252(int arg0) {
        if (arg0 != 7) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Linkable var3 = this.field725;
        if (this.field724 == var3) {
            this.field725 = null;
            return null;
        } else {
            this.field725 = var3.field363;
            return var3;
        }
    }

    @OriginalMember(owner = "pb", name = "b", descriptor = "(Z)Lv;")
    public Linkable method253(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Linkable var3 = this.field725;
        if (this.field724 == var3) {
            this.field725 = null;
            return null;
        } else {
            this.field725 = var3.field364;
            return var3;
        }
    }

    @OriginalMember(owner = "pb", name = "c", descriptor = "()V")
    public void method254() {
        while (true) {
            Linkable var1 = this.field724.field363;
            if (this.field724 == var1) {
                return;
            }
            var1.method118();
        }
    }
}
