import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ob")
public class LinkList {

    @OriginalMember(owner = "ob", name = "a", descriptor = "Z")
    private boolean field742 = true;

    @OriginalMember(owner = "ob", name = "b", descriptor = "I")
    private int field743 = 5;

    @OriginalMember(owner = "ob", name = "c", descriptor = "Lu;")
    public Linkable field744 = new Linkable();

    @OriginalMember(owner = "ob", name = "d", descriptor = "Lu;")
    private Linkable field745;

    @OriginalMember(owner = "ob", name = "<init>", descriptor = "(I)V")
    public LinkList(int arg0) {
        this.field744.field366 = this.field744;
        while (arg0 >= 0) {
            this.field743 = 177;
        }
        this.field744.field367 = this.field744;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;)V")
    public void method245(Linkable arg0) {
        if (arg0.field367 != null) {
            arg0.method106();
        }
        arg0.field367 = this.field744.field367;
        arg0.field366 = this.field744;
        arg0.field367.field366 = arg0;
        arg0.field366.field367 = arg0;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;B)V")
    public void method246(Linkable arg0, byte arg1) {
        if (arg0.field367 != null) {
            arg0.method106();
        }
        arg0.field367 = this.field744;
        arg0.field366 = this.field744.field366;
        arg0.field367.field366 = arg0;
        if (arg1 != 23) {
            this.field742 = !this.field742;
        }
        arg0.field366.field367 = arg0;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "()Lu;")
    public Linkable method247() {
        Linkable var1 = this.field744.field366;
        if (this.field744 == var1) {
            return null;
        } else {
            var1.method106();
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "()Lu;")
    public Linkable method248() {
        Linkable var1 = this.field744.field366;
        if (this.field744 == var1) {
            this.field745 = null;
            return null;
        } else {
            this.field745 = var1.field366;
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Z)Lu;")
    public Linkable method249(boolean arg0) {
        Linkable var2 = this.field744.field367;
        if (this.field744 == var2) {
            this.field745 = null;
            return null;
        }
        this.field745 = var2.field367;
        if (!arg0) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "(Z)Lu;")
    public Linkable method250(boolean arg0) {
        Linkable var2 = this.field745;
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field744 == var2) {
            this.field745 = null;
            return null;
        } else {
            this.field745 = var2.field366;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(I)Lu;")
    public Linkable method251(int arg0) {
        Linkable var2 = this.field745;
        int var3 = 6 / arg0;
        if (this.field744 == var2) {
            this.field745 = null;
            return null;
        } else {
            this.field745 = var2.field367;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "c", descriptor = "()V")
    public void method252() {
        if (this.field744.field366 == this.field744) {
            return;
        }
        while (true) {
            Linkable var1 = this.field744.field366;
            if (this.field744 == var1) {
                return;
            }
            var1.method106();
        }
    }
}
