import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ob")
public class LinkList {

    @OriginalMember(owner = "ob", name = "a", descriptor = "I")
    private int field740 = 9;

    @OriginalMember(owner = "ob", name = "b", descriptor = "Z")
    private boolean field741 = true;

    @OriginalMember(owner = "ob", name = "c", descriptor = "Lu;")
    public Linkable field742 = new Linkable();

    @OriginalMember(owner = "ob", name = "d", descriptor = "Lu;")
    private Linkable field743;

    @OriginalMember(owner = "ob", name = "<init>", descriptor = "(I)V")
    public LinkList(int arg0) {
        this.field742.field359 = this.field742;
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field742.field360 = this.field742;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;)V")
    public void method243(Linkable arg0) {
        if (arg0.field360 != null) {
            arg0.method106();
        }
        arg0.field360 = this.field742.field360;
        arg0.field359 = this.field742;
        arg0.field360.field359 = arg0;
        arg0.field359.field360 = arg0;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;I)V")
    public void method244(Linkable arg0, int arg1) {
        if (arg0.field360 != null) {
            arg0.method106();
        }
        arg0.field360 = this.field742;
        arg0.field359 = this.field742.field359;
        arg0.field360.field359 = arg0;
        arg0.field359.field360 = arg0;
        if (arg1 != -12925) {
            this.field741 = !this.field741;
        } else if (Linkable.field361) {
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "()Lu;")
    public Linkable method245() {
        Linkable var1 = this.field742.field359;
        if (this.field742 == var1) {
            return null;
        } else {
            var1.method106();
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "()Lu;")
    public Linkable method246() {
        Linkable var1 = this.field742.field359;
        if (this.field742 == var1) {
            this.field743 = null;
            return null;
        } else {
            this.field743 = var1.field359;
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(I)Lu;")
    public Linkable method247(int arg0) {
        Linkable var2 = this.field742.field360;
        if (this.field742 == var2) {
            this.field743 = null;
            return null;
        }
        this.field743 = var2.field360;
        if (arg0 != 0) {
            this.field741 = !this.field741;
        }
        return var2;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Z)Lu;")
    public Linkable method248(boolean arg0) {
        Linkable var2 = this.field743;
        if (arg0) {
            throw new NullPointerException();
        } else if (this.field742 == var2) {
            this.field743 = null;
            return null;
        } else {
            this.field743 = var2.field359;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "(I)Lu;")
    public Linkable method249(int arg0) {
        Linkable var2 = this.field743;
        if (arg0 != -20683) {
            throw new NullPointerException();
        } else if (this.field742 == var2) {
            this.field743 = null;
            return null;
        } else {
            this.field743 = var2.field360;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "c", descriptor = "()V")
    public void method250() {
        if (this.field742.field359 == this.field742) {
            return;
        }
        while (true) {
            Linkable var1 = this.field742.field359;
            if (this.field742 == var1) {
                return;
            }
            var1.method106();
        }
    }
}
