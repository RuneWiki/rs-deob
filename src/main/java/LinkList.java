import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ob")
public class LinkList {

    @OriginalMember(owner = "ob", name = "a", descriptor = "Z")
    private boolean field747 = true;

    @OriginalMember(owner = "ob", name = "b", descriptor = "I")
    private int field748 = 530;

    @OriginalMember(owner = "ob", name = "c", descriptor = "I")
    private int field749 = 9;

    @OriginalMember(owner = "ob", name = "d", descriptor = "Lu;")
    public Linkable field750 = new Linkable();

    @OriginalMember(owner = "ob", name = "e", descriptor = "Lu;")
    private Linkable field751;

    @OriginalMember(owner = "ob", name = "<init>", descriptor = "(I)V")
    public LinkList(int arg0) {
        this.field750.field361 = this.field750;
        this.field750.field362 = this.field750;
        if (arg0 < 6 || arg0 > 6) {
            this.field749 = -277;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;)V")
    public void method245(Linkable arg0) {
        if (arg0.field362 != null) {
            arg0.method106();
        }
        arg0.field362 = this.field750.field362;
        arg0.field361 = this.field750;
        arg0.field362.field361 = arg0;
        arg0.field361.field362 = arg0;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;Z)V")
    public void method246(Linkable arg0, boolean arg1) {
        if (arg0.field362 != null) {
            arg0.method106();
        }
        arg0.field362 = this.field750;
        arg0.field361 = this.field750.field361;
        if (arg1) {
            arg0.field362.field361 = arg0;
            arg0.field361.field362 = arg0;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "()Lu;")
    public Linkable method247() {
        Linkable var1 = this.field750.field361;
        if (this.field750 == var1) {
            return null;
        } else {
            var1.method106();
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "()Lu;")
    public Linkable method248() {
        Linkable var1 = this.field750.field361;
        if (this.field750 == var1) {
            this.field751 = null;
            return null;
        } else {
            this.field751 = var1.field361;
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(I)Lu;")
    public Linkable method249(int arg0) {
        Linkable var2 = this.field750.field362;
        if (arg0 != 8) {
            throw new NullPointerException();
        } else if (this.field750 == var2) {
            this.field751 = null;
            return null;
        } else {
            this.field751 = var2.field362;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "(I)Lu;")
    public Linkable method250(int arg0) {
        Linkable var2 = this.field751;
        if (this.field750 == var2) {
            this.field751 = null;
            return null;
        }
        this.field751 = var2.field361;
        if (arg0 != 0) {
            this.field747 = !this.field747;
        }
        return var2;
    }

    @OriginalMember(owner = "ob", name = "c", descriptor = "(I)Lu;")
    public Linkable method251(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        Linkable var2 = this.field751;
        if (this.field750 == var2) {
            this.field751 = null;
            return null;
        } else {
            this.field751 = var2.field362;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "c", descriptor = "()V")
    public void method252() {
        if (this.field750.field361 == this.field750) {
            return;
        }
        while (true) {
            Linkable var1 = this.field750.field361;
            if (this.field750 == var1) {
                return;
            }
            var1.method106();
        }
    }
}
