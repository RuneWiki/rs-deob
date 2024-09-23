import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ob")
public class LinkList {

    @OriginalMember(owner = "ob", name = "a", descriptor = "B")
    private byte field650 = 4;

    @OriginalMember(owner = "ob", name = "b", descriptor = "Z")
    private boolean field651 = false;

    @OriginalMember(owner = "ob", name = "c", descriptor = "I")
    private int field652 = 42815;

    @OriginalMember(owner = "ob", name = "d", descriptor = "Lu;")
    public Linkable field653 = new Linkable();

    @OriginalMember(owner = "ob", name = "e", descriptor = "Lu;")
    private Linkable field654;

    @OriginalMember(owner = "ob", name = "<init>", descriptor = "(B)V")
    public LinkList(byte arg0) {
        this.field653.field291 = this.field653;
        this.field653.field292 = this.field653;
        if (arg0 != 5) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;)V")
    public void method225(Linkable arg0) {
        if (arg0.field292 != null) {
            arg0.method107();
        }
        arg0.field292 = this.field653.field292;
        arg0.field291 = this.field653;
        arg0.field292.field291 = arg0;
        arg0.field291.field292 = arg0;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(BLu;)V")
    public void method226(byte arg0, Linkable arg1) {
        if (arg1.field292 != null) {
            arg1.method107();
        }
        arg1.field292 = this.field653;
        arg1.field291 = this.field653.field291;
        arg1.field292.field291 = arg1;
        arg1.field291.field292 = arg1;
        if (this.field650 != arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "()Lu;")
    public Linkable method227() {
        Linkable var1 = this.field653.field291;
        if (this.field653 == var1) {
            return null;
        } else {
            var1.method107();
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "()Lu;")
    public Linkable method228() {
        Linkable var1 = this.field653.field291;
        if (this.field653 == var1) {
            this.field654 = null;
            return null;
        } else {
            this.field654 = var1.field291;
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Z)Lu;")
    public Linkable method229(boolean arg0) {
        Linkable var2 = this.field653.field292;
        if (this.field653 == var2) {
            this.field654 = null;
            return null;
        }
        this.field654 = var2.field292;
        if (arg0) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(I)Lu;")
    public Linkable method230(int arg0) {
        Linkable var2 = this.field654;
        if (this.field653 == var2) {
            this.field654 = null;
            return null;
        }
        this.field654 = var2.field291;
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "(Z)Lu;")
    public Linkable method231(boolean arg0) {
        if (arg0) {
            this.field652 = 317;
        }
        Linkable var2 = this.field654;
        if (this.field653 == var2) {
            this.field654 = null;
            return null;
        } else {
            this.field654 = var2.field292;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "c", descriptor = "()V")
    public void method232() {
        while (true) {
            Linkable var1 = this.field653.field291;
            if (this.field653 == var1) {
                return;
            }
            var1.method107();
        }
    }
}
