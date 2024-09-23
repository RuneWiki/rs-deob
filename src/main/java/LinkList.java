import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ob")
public class LinkList {

    @OriginalMember(owner = "ob", name = "a", descriptor = "Z")
    private boolean field662 = false;

    @OriginalMember(owner = "ob", name = "b", descriptor = "I")
    private int field663 = 742;

    @OriginalMember(owner = "ob", name = "c", descriptor = "B")
    private byte field664 = -47;

    @OriginalMember(owner = "ob", name = "d", descriptor = "I")
    private int field665 = 972;

    @OriginalMember(owner = "ob", name = "e", descriptor = "Lu;")
    public Linkable field666 = new Linkable();

    @OriginalMember(owner = "ob", name = "f", descriptor = "Lu;")
    private Linkable field667;

    @OriginalMember(owner = "ob", name = "<init>", descriptor = "(B)V")
    public LinkList(byte arg0) {
        this.field666.field299 = this.field666;
        this.field666.field300 = this.field666;
        if (this.field664 != arg0) {
            this.field662 = !this.field662;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;)V")
    public void method225(Linkable arg0) {
        if (arg0.field300 != null) {
            arg0.method107();
        }
        arg0.field300 = this.field666.field300;
        arg0.field299 = this.field666;
        arg0.field300.field299 = arg0;
        arg0.field299.field300 = arg0;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;I)V")
    public void method226(Linkable arg0, int arg1) {
        if (arg0.field300 != null) {
            arg0.method107();
        }
        arg0.field300 = this.field666;
        if (arg1 == 0) {
            arg0.field299 = this.field666.field299;
            arg0.field300.field299 = arg0;
            arg0.field299.field300 = arg0;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "()Lu;")
    public Linkable method227() {
        Linkable var1 = this.field666.field299;
        if (this.field666 == var1) {
            return null;
        } else {
            var1.method107();
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "()Lu;")
    public Linkable method228() {
        Linkable var1 = this.field666.field299;
        if (this.field666 == var1) {
            this.field667 = null;
            return null;
        } else {
            this.field667 = var1.field299;
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(I)Lu;")
    public Linkable method229(int arg0) {
        Linkable var2 = this.field666.field300;
        if (this.field666 == var2) {
            this.field667 = null;
            return null;
        }
        this.field667 = var2.field300;
        if (arg0 != 0) {
            this.field662 = !this.field662;
        }
        return var2;
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "(I)Lu;")
    public Linkable method230(int arg0) {
        Linkable var2 = this.field667;
        if (this.field666 == var2) {
            this.field667 = null;
            return null;
        }
        this.field667 = var2.field299;
        if (arg0 != -29953) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "ob", name = "c", descriptor = "(I)Lu;")
    public Linkable method231(int arg0) {
        Linkable var2 = this.field667;
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else if (this.field666 == var2) {
            this.field667 = null;
            return null;
        } else {
            this.field667 = var2.field300;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "c", descriptor = "()V")
    public void method232() {
        while (true) {
            Linkable var1 = this.field666.field299;
            if (this.field666 == var1) {
                return;
            }
            var1.method107();
        }
    }
}
