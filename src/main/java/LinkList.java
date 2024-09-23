import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ob")
public class LinkList {

    @OriginalMember(owner = "ob", name = "a", descriptor = "I")
    private int field746 = -292;

    @OriginalMember(owner = "ob", name = "b", descriptor = "Lu;")
    public Linkable field747 = new Linkable();

    @OriginalMember(owner = "ob", name = "c", descriptor = "Lu;")
    private Linkable field748;

    @OriginalMember(owner = "ob", name = "<init>", descriptor = "(I)V")
    public LinkList(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        this.field747.field366 = this.field747;
        this.field747.field367 = this.field747;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;)V")
    public void method245(Linkable arg0) {
        if (arg0.field367 != null) {
            arg0.method106();
        }
        arg0.field367 = this.field747.field367;
        arg0.field366 = this.field747;
        arg0.field367.field366 = arg0;
        arg0.field366.field367 = arg0;
        if (Linkable.field368) {
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;I)V")
    public void method246(Linkable arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        if (arg0.field367 != null) {
            arg0.method106();
        }
        arg0.field367 = this.field747;
        arg0.field366 = this.field747.field366;
        arg0.field367.field366 = arg0;
        arg0.field366.field367 = arg0;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "()Lu;")
    public Linkable method247() {
        Linkable var1 = this.field747.field366;
        if (this.field747 == var1) {
            return null;
        } else {
            var1.method106();
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "()Lu;")
    public Linkable method248() {
        Linkable var1 = this.field747.field366;
        if (this.field747 == var1) {
            this.field748 = null;
            return null;
        } else {
            this.field748 = var1.field366;
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(I)Lu;")
    public Linkable method249(int arg0) {
        if (arg0 != 6) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Linkable var3 = this.field747.field367;
        if (this.field747 == var3) {
            this.field748 = null;
            return null;
        } else {
            this.field748 = var3.field367;
            return var3;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "(I)Lu;")
    public Linkable method250(int arg0) {
        if (arg0 != 7) {
            throw new NullPointerException();
        }
        Linkable var2 = this.field748;
        if (this.field747 == var2) {
            this.field748 = null;
            return null;
        } else {
            this.field748 = var2.field366;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "c", descriptor = "(I)Lu;")
    public Linkable method251(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        Linkable var2 = this.field748;
        if (this.field747 == var2) {
            this.field748 = null;
            return null;
        } else {
            this.field748 = var2.field367;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "c", descriptor = "()V")
    public void method252() {
        if (this.field747.field366 == this.field747) {
            return;
        }
        while (true) {
            Linkable var1 = this.field747.field366;
            if (this.field747 == var1) {
                return;
            }
            var1.method106();
        }
    }
}
