import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ob")
public class LinkList {

    @OriginalMember(owner = "ob", name = "a", descriptor = "Z")
    private boolean field661 = true;

    @OriginalMember(owner = "ob", name = "b", descriptor = "I")
    private int field662 = -937;

    @OriginalMember(owner = "ob", name = "c", descriptor = "Lu;")
    public Linkable field663 = new Linkable();

    @OriginalMember(owner = "ob", name = "d", descriptor = "Lu;")
    private Linkable field664;

    @OriginalMember(owner = "ob", name = "<init>", descriptor = "(I)V")
    public LinkList(int arg0) {
        if (arg0 < 2 || arg0 > 2) {
            this.field662 = -344;
        }
        this.field663.field299 = this.field663;
        this.field663.field300 = this.field663;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;)V")
    public void method225(Linkable arg0) {
        if (arg0.field300 != null) {
            arg0.method107();
        }
        arg0.field300 = this.field663.field300;
        arg0.field299 = this.field663;
        arg0.field300.field299 = arg0;
        arg0.field299.field300 = arg0;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;I)V")
    public void method226(Linkable arg0, int arg1) {
        if (arg0.field300 != null) {
            arg0.method107();
        }
        arg0.field300 = this.field663;
        if (arg1 > 0) {
            arg0.field299 = this.field663.field299;
            arg0.field300.field299 = arg0;
            arg0.field299.field300 = arg0;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "()Lu;")
    public Linkable method227() {
        Linkable var1 = this.field663.field299;
        if (this.field663 == var1) {
            return null;
        } else {
            var1.method107();
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "()Lu;")
    public Linkable method228() {
        Linkable var1 = this.field663.field299;
        if (this.field663 == var1) {
            this.field664 = null;
            return null;
        } else {
            this.field664 = var1.field299;
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(I)Lu;")
    public Linkable method229(int arg0) {
        Linkable var2 = this.field663.field300;
        if (this.field663 == var2) {
            this.field664 = null;
            return null;
        }
        this.field664 = var2.field300;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "(I)Lu;")
    public Linkable method230(int arg0) {
        Linkable var2 = this.field664;
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (this.field663 == var2) {
            this.field664 = null;
            return null;
        } else {
            this.field664 = var2.field299;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Z)Lu;")
    public Linkable method231(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        Linkable var2 = this.field664;
        if (this.field663 == var2) {
            this.field664 = null;
            return null;
        } else {
            this.field664 = var2.field300;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "c", descriptor = "()V")
    public void method232() {
        while (true) {
            Linkable var1 = this.field663.field299;
            if (this.field663 == var1) {
                return;
            }
            var1.method107();
        }
    }
}
