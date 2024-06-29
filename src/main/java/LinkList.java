import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class LinkList {

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Z")
    private boolean field745 = false;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "B")
    private byte field746 = 9;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    private int field747 = -44203;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "Lu;")
    public Linkable field748 = new Linkable();

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    private int field744;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Lu;")
    private Linkable field749;

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(B)V")
    public LinkList(byte arg0) {
        this.field748.field367 = this.field748;
        this.field748.field368 = this.field748;
        if (this.field746 == arg0) {
            boolean var2 = false;
        } else {
            this.field744 = 171;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lu;)V")
    public void method244(Linkable arg0) {
        if (arg0.field368 != null) {
            arg0.method106();
        }
        arg0.field368 = this.field748.field368;
        arg0.field367 = this.field748;
        arg0.field368.field367 = arg0;
        arg0.field367.field368 = arg0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZLu;)V")
    public void method245(boolean arg0, Linkable arg1) {
        if (arg1.field368 != null) {
            arg1.method106();
        }
        arg1.field368 = this.field748;
        arg1.field367 = this.field748.field367;
        arg1.field368.field367 = arg1;
        arg1.field367.field368 = arg1;
        if (arg0) {
            this.field745 = !this.field745;
        } else if (Linkable.field369) {
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "()Lu;")
    public Linkable method246() {
        Linkable var1 = this.field748.field367;
        if (this.field748 == var1) {
            return null;
        } else {
            var1.method106();
            return var1;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "()Lu;")
    public Linkable method247() {
        Linkable var1 = this.field748.field367;
        if (this.field748 == var1) {
            this.field749 = null;
            return null;
        } else {
            this.field749 = var1.field367;
            return var1;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Lu;")
    public Linkable method248(int arg0) {
        if (arg0 != -42339) {
            this.field747 = 140;
        }
        Linkable var2 = this.field748.field368;
        if (this.field748 == var2) {
            this.field749 = null;
            return null;
        } else {
            this.field749 = var2.field368;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)Lu;")
    public Linkable method249(int arg0) {
        Linkable var2 = this.field749;
        int var3 = 26 / arg0;
        if (this.field748 == var2) {
            this.field749 = null;
            return null;
        } else {
            this.field749 = var2.field367;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Lu;")
    public Linkable method250(boolean arg0) {
        Linkable var2 = this.field749;
        if (this.field748 == var2) {
            this.field749 = null;
            return null;
        }
        this.field749 = var2.field368;
        if (arg0) {
            this.field744 = 131;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "()V")
    public void method251() {
        if (this.field748.field367 == this.field748) {
            return;
        }
        while (true) {
            Linkable var1 = this.field748.field367;
            if (this.field748 == var1) {
                return;
            }
            var1.method106();
        }
    }
}
