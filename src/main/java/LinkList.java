import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ob")
public class LinkList {

    @OriginalMember(owner = "ob", name = "a", descriptor = "Z")
    private boolean field739 = true;

    @OriginalMember(owner = "ob", name = "b", descriptor = "Z")
    private boolean field740 = true;

    @OriginalMember(owner = "ob", name = "c", descriptor = "I")
    private int field741 = -676;

    @OriginalMember(owner = "ob", name = "d", descriptor = "Lu;")
    public Linkable field742 = new Linkable();

    @OriginalMember(owner = "ob", name = "e", descriptor = "Lu;")
    private Linkable field743;

    @OriginalMember(owner = "ob", name = "<init>", descriptor = "(I)V")
    public LinkList(int arg0) {
        if (arg0 >= 0) {
            this.field739 = !this.field739;
        }
        this.field742.field363 = this.field742;
        this.field742.field364 = this.field742;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;)V")
    public void method240(Linkable arg0) {
        if (arg0.field364 != null) {
            arg0.method106();
        }
        arg0.field364 = this.field742.field364;
        arg0.field363 = this.field742;
        arg0.field364.field363 = arg0;
        arg0.field363.field364 = arg0;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(ZLu;)V")
    public void method241(boolean arg0, Linkable arg1) {
        if (arg1.field364 != null) {
            arg1.method106();
        }
        arg1.field364 = this.field742;
        arg1.field363 = this.field742.field363;
        arg1.field364.field363 = arg1;
        if (arg0) {
            this.field741 = 91;
        }
        arg1.field363.field364 = arg1;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "()Lu;")
    public Linkable method242() {
        Linkable var1 = this.field742.field363;
        if (this.field742 == var1) {
            return null;
        } else {
            var1.method106();
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "()Lu;")
    public Linkable method243() {
        Linkable var1 = this.field742.field363;
        if (this.field742 == var1) {
            this.field743 = null;
            return null;
        } else {
            this.field743 = var1.field363;
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Z)Lu;")
    public Linkable method244(boolean arg0) {
        Linkable var2 = this.field742.field364;
        if (arg0) {
            this.field740 = !this.field740;
        }
        if (this.field742 == var2) {
            this.field743 = null;
            return null;
        } else {
            this.field743 = var2.field364;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(B)Lu;")
    public Linkable method245(byte arg0) {
        Linkable var2 = this.field743;
        if (this.field742 == var2) {
            this.field743 = null;
            return null;
        }
        this.field743 = var2.field363;
        if (arg0 == 0) {
            boolean var3 = false;
        } else {
            this.field740 = !this.field740;
        }
        return var2;
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "(Z)Lu;")
    public Linkable method246(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        Linkable var2 = this.field743;
        if (this.field742 == var2) {
            this.field743 = null;
            return null;
        } else {
            this.field743 = var2.field364;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "c", descriptor = "()V")
    public void method247() {
        if (this.field742.field363 == this.field742) {
            return;
        }
        while (true) {
            Linkable var1 = this.field742.field363;
            if (this.field742 == var1) {
                return;
            }
            var1.method106();
        }
    }
}
