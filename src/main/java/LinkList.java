import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ob")
public class LinkList {

    @OriginalMember(owner = "ob", name = "a", descriptor = "Z")
    private boolean field661 = true;

    @OriginalMember(owner = "ob", name = "b", descriptor = "B")
    private byte field662 = 2;

    @OriginalMember(owner = "ob", name = "c", descriptor = "I")
    private int field663 = -546;

    @OriginalMember(owner = "ob", name = "d", descriptor = "I")
    private int field664 = -676;

    @OriginalMember(owner = "ob", name = "e", descriptor = "Lu;")
    public Linkable field665 = new Linkable();

    @OriginalMember(owner = "ob", name = "f", descriptor = "Lu;")
    private Linkable field666;

    @OriginalMember(owner = "ob", name = "<init>", descriptor = "(I)V")
    public LinkList(int arg0) {
        if (arg0 != 0) {
            this.field661 = !this.field661;
        }
        this.field665.field293 = this.field665;
        this.field665.field294 = this.field665;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;)V")
    public void method232(Linkable arg0) {
        if (arg0.field294 != null) {
            arg0.method108();
        }
        arg0.field294 = this.field665.field294;
        arg0.field293 = this.field665;
        arg0.field294.field293 = arg0;
        arg0.field293.field294 = arg0;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;I)V")
    public void method233(Linkable arg0, int arg1) {
        if (arg0.field294 != null) {
            arg0.method108();
        }
        arg0.field294 = this.field665;
        if (arg1 == -26173) {
            arg0.field293 = this.field665.field293;
            arg0.field294.field293 = arg0;
            arg0.field293.field294 = arg0;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "()Lu;")
    public Linkable method234() {
        Linkable var1 = this.field665.field293;
        if (this.field665 == var1) {
            return null;
        } else {
            var1.method108();
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "()Lu;")
    public Linkable method235() {
        Linkable var1 = this.field665.field293;
        if (this.field665 == var1) {
            this.field666 = null;
            return null;
        } else {
            this.field666 = var1.field293;
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(B)Lu;")
    public Linkable method236(byte arg0) {
        Linkable var2 = this.field665.field294;
        if (this.field665 == var2) {
            this.field666 = null;
            return null;
        }
        this.field666 = var2.field294;
        if (this.field662 != arg0) {
            this.field664 = 112;
        }
        return var2;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(I)Lu;")
    public Linkable method237(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        Linkable var2 = this.field666;
        if (this.field665 == var2) {
            this.field666 = null;
            return null;
        } else {
            this.field666 = var2.field293;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Z)Lu;")
    public Linkable method238(boolean arg0) {
        Linkable var2 = this.field666;
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field665 == var2) {
            this.field666 = null;
            return null;
        } else {
            this.field666 = var2.field294;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "c", descriptor = "()V")
    public void method239() {
        while (true) {
            Linkable var1 = this.field665.field293;
            if (this.field665 == var1) {
                return;
            }
            var1.method108();
        }
    }
}
