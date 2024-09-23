import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ob")
public class LinkList {

    @OriginalMember(owner = "ob", name = "a", descriptor = "I")
    private int field738 = 3;

    @OriginalMember(owner = "ob", name = "b", descriptor = "Z")
    private boolean field739 = false;

    @OriginalMember(owner = "ob", name = "c", descriptor = "Lu;")
    public Linkable field740 = new Linkable();

    @OriginalMember(owner = "ob", name = "d", descriptor = "Lu;")
    private Linkable field741;

    @OriginalMember(owner = "ob", name = "<init>", descriptor = "(Z)V")
    public LinkList(boolean arg0) {
        this.field740.field358 = this.field740;
        this.field740.field359 = this.field740;
        if (arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;)V")
    public void method241(Linkable arg0) {
        if (arg0.field359 != null) {
            arg0.method106();
        }
        arg0.field359 = this.field740.field359;
        arg0.field358 = this.field740;
        arg0.field359.field358 = arg0;
        arg0.field358.field359 = arg0;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;Z)V")
    public void method242(Linkable arg0, boolean arg1) {
        if (arg0.field359 != null) {
            arg0.method106();
        }
        arg0.field359 = this.field740;
        arg0.field358 = this.field740.field358;
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        arg0.field359.field358 = arg0;
        arg0.field358.field359 = arg0;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "()Lu;")
    public Linkable method243() {
        Linkable var1 = this.field740.field358;
        if (this.field740 == var1) {
            return null;
        } else {
            var1.method106();
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "()Lu;")
    public Linkable method244() {
        Linkable var1 = this.field740.field358;
        if (this.field740 == var1) {
            this.field741 = null;
            return null;
        } else {
            this.field741 = var1.field358;
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(B)Lu;")
    public Linkable method245(byte arg0) {
        Linkable var2 = this.field740.field359;
        if (this.field740 == var2) {
            this.field741 = null;
            return null;
        }
        this.field741 = var2.field359;
        if (arg0 == 5) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Z)Lu;")
    public Linkable method246(boolean arg0) {
        Linkable var2 = this.field741;
        if (this.field740 == var2) {
            this.field741 = null;
            return null;
        }
        this.field741 = var2.field358;
        if (arg0) {
            this.field738 = -361;
        }
        return var2;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(I)Lu;")
    public Linkable method247(int arg0) {
        Linkable var2 = this.field741;
        if (arg0 != 0) {
            this.field739 = !this.field739;
        }
        if (this.field740 == var2) {
            this.field741 = null;
            return null;
        } else {
            this.field741 = var2.field359;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "c", descriptor = "()V")
    public void method248() {
        if (this.field740.field358 == this.field740) {
            return;
        }
        while (true) {
            Linkable var1 = this.field740.field358;
            if (this.field740 == var1) {
                return;
            }
            var1.method106();
        }
    }
}
