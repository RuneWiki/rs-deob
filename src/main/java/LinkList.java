import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ob")
public class LinkList {

    @OriginalMember(owner = "ob", name = "a", descriptor = "I")
    private int field661 = -865;

    @OriginalMember(owner = "ob", name = "b", descriptor = "Z")
    private boolean field662 = false;

    @OriginalMember(owner = "ob", name = "c", descriptor = "Z")
    private boolean field663 = true;

    @OriginalMember(owner = "ob", name = "d", descriptor = "Lu;")
    private Linkable field664 = new Linkable();

    @OriginalMember(owner = "ob", name = "e", descriptor = "Lu;")
    private Linkable field665;

    @OriginalMember(owner = "ob", name = "<init>", descriptor = "(B)V")
    public LinkList(byte arg0) {
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        this.field664.field296 = this.field664;
        this.field664.field297 = this.field664;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;)V")
    public void method224(Linkable arg0) {
        if (arg0.field297 != null) {
            arg0.method106();
        }
        arg0.field297 = this.field664.field297;
        arg0.field296 = this.field664;
        arg0.field297.field296 = arg0;
        arg0.field296.field297 = arg0;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;I)V")
    public void method225(Linkable arg0, int arg1) {
        if (arg0.field297 != null) {
            arg0.method106();
        }
        arg0.field297 = this.field664;
        arg0.field296 = this.field664.field296;
        arg0.field297.field296 = arg0;
        if (arg1 <= 0) {
            this.field661 = 407;
        }
        arg0.field296.field297 = arg0;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "()Lu;")
    public Linkable method226() {
        Linkable var1 = this.field664.field296;
        if (this.field664 == var1) {
            return null;
        } else {
            var1.method106();
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "()Lu;")
    public Linkable method227() {
        Linkable var1 = this.field664.field296;
        if (this.field664 == var1) {
            this.field665 = null;
            return null;
        } else {
            this.field665 = var1.field296;
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(I)Lu;")
    public Linkable method228(int arg0) {
        Linkable var2 = this.field664.field297;
        if (this.field664 == var2) {
            this.field665 = null;
            return null;
        }
        this.field665 = var2.field297;
        if (arg0 != -13562) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(B)Lu;")
    public Linkable method229(byte arg0) {
        Linkable var2 = this.field665;
        if (arg0 != 8) {
            this.field662 = !this.field662;
        }
        if (this.field664 == var2) {
            this.field665 = null;
            return null;
        } else {
            this.field665 = var2.field296;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "(B)Lu;")
    public Linkable method230(byte arg0) {
        Linkable var2 = this.field665;
        if (this.field664 == var2) {
            this.field665 = null;
            return null;
        }
        this.field665 = var2.field297;
        if (arg0 == 4) {
            boolean var3 = false;
        } else {
            this.field662 = !this.field662;
        }
        return var2;
    }

    @OriginalMember(owner = "ob", name = "c", descriptor = "()V")
    public void method231() {
        while (true) {
            Linkable var1 = this.field664.field296;
            if (this.field664 == var1) {
                return;
            }
            var1.method106();
        }
    }
}
