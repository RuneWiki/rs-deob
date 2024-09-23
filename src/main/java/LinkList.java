import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ob")
public class LinkList {

    @OriginalMember(owner = "ob", name = "a", descriptor = "I")
    private int field741 = 6;

    @OriginalMember(owner = "ob", name = "b", descriptor = "B")
    private byte field742 = 1;

    @OriginalMember(owner = "ob", name = "c", descriptor = "Z")
    private boolean field743 = false;

    @OriginalMember(owner = "ob", name = "d", descriptor = "Lu;")
    public Linkable field744 = new Linkable();

    @OriginalMember(owner = "ob", name = "e", descriptor = "Lu;")
    private Linkable field745;

    @OriginalMember(owner = "ob", name = "<init>", descriptor = "(I)V")
    public LinkList(int arg0) {
        this.field744.field362 = this.field744;
        if (arg0 != 0) {
            this.field743 = !this.field743;
        }
        this.field744.field363 = this.field744;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;)V")
    public void method245(Linkable arg0) {
        if (arg0.field363 != null) {
            arg0.method106();
        }
        arg0.field363 = this.field744.field363;
        arg0.field362 = this.field744;
        arg0.field363.field362 = arg0;
        arg0.field362.field363 = arg0;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(ILu;)V")
    public void method246(int arg0, Linkable arg1) {
        if (arg0 != 7) {
            this.field741 = 65;
        }
        if (arg1.field363 != null) {
            arg1.method106();
        }
        arg1.field363 = this.field744;
        arg1.field362 = this.field744.field362;
        arg1.field363.field362 = arg1;
        arg1.field362.field363 = arg1;
        if (Linkable.field364) {
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "()Lu;")
    public Linkable method247() {
        Linkable var1 = this.field744.field362;
        if (this.field744 == var1) {
            return null;
        } else {
            var1.method106();
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "()Lu;")
    public Linkable method248() {
        Linkable var1 = this.field744.field362;
        if (this.field744 == var1) {
            this.field745 = null;
            return null;
        } else {
            this.field745 = var1.field362;
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Z)Lu;")
    public Linkable method249(boolean arg0) {
        Linkable var2 = this.field744.field363;
        if (this.field744 == var2) {
            this.field745 = null;
            return null;
        }
        this.field745 = var2.field363;
        if (!arg0) {
            this.field743 = !this.field743;
        }
        return var2;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(B)Lu;")
    public Linkable method250(byte arg0) {
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        Linkable var2 = this.field745;
        if (this.field744 == var2) {
            this.field745 = null;
            return null;
        } else {
            this.field745 = var2.field362;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "(B)Lu;")
    public Linkable method251(byte arg0) {
        Linkable var2 = this.field745;
        if (this.field742 == arg0) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (this.field744 == var2) {
            this.field745 = null;
            return null;
        } else {
            this.field745 = var2.field363;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "c", descriptor = "()V")
    public void method252() {
        if (this.field744.field362 == this.field744) {
            return;
        }
        while (true) {
            Linkable var1 = this.field744.field362;
            if (this.field744 == var1) {
                return;
            }
            var1.method106();
        }
    }
}
