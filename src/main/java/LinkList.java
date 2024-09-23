import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ob")
public class LinkList {

    @OriginalMember(owner = "ob", name = "a", descriptor = "Lu;")
    public Linkable field752 = new Linkable();

    @OriginalMember(owner = "ob", name = "b", descriptor = "Lu;")
    private Linkable field753;

    @OriginalMember(owner = "ob", name = "<init>", descriptor = "(I)V")
    public LinkList(int arg0) {
        this.field752.field365 = this.field752;
        int var2 = 91 / arg0;
        this.field752.field366 = this.field752;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;)V")
    public void method245(Linkable arg0) {
        if (arg0.field366 != null) {
            arg0.method106();
        }
        arg0.field366 = this.field752.field366;
        arg0.field365 = this.field752;
        arg0.field366.field365 = arg0;
        arg0.field365.field366 = arg0;
        if (Linkable.field367) {
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(ZLu;)V")
    public void method246(boolean arg0, Linkable arg1) {
        if (arg0) {
            return;
        }
        if (arg1.field366 != null) {
            arg1.method106();
        }
        arg1.field366 = this.field752;
        arg1.field365 = this.field752.field365;
        arg1.field366.field365 = arg1;
        arg1.field365.field366 = arg1;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "()Lu;")
    public Linkable method247() {
        Linkable var1 = this.field752.field365;
        if (this.field752 == var1) {
            return null;
        } else {
            var1.method106();
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "()Lu;")
    public Linkable method248() {
        Linkable var1 = this.field752.field365;
        if (this.field752 == var1) {
            this.field753 = null;
            return null;
        } else {
            this.field753 = var1.field365;
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Z)Lu;")
    public Linkable method249(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        Linkable var2 = this.field752.field366;
        if (this.field752 == var2) {
            this.field753 = null;
            return null;
        } else {
            this.field753 = var2.field366;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "(Z)Lu;")
    public Linkable method250(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Linkable var3 = this.field753;
        if (this.field752 == var3) {
            this.field753 = null;
            return null;
        } else {
            this.field753 = var3.field365;
            return var3;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(B)Lu;")
    public Linkable method251(byte arg0) {
        if (arg0 != 73) {
            throw new NullPointerException();
        }
        Linkable var2 = this.field753;
        if (this.field752 == var2) {
            this.field753 = null;
            return null;
        } else {
            this.field753 = var2.field366;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "c", descriptor = "()V")
    public void method252() {
        if (this.field752.field365 == this.field752) {
            return;
        }
        while (true) {
            Linkable var1 = this.field752.field365;
            if (this.field752 == var1) {
                return;
            }
            var1.method106();
        }
    }
}
