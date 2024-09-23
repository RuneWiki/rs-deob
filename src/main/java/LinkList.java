import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ob")
public class LinkList {

    @OriginalMember(owner = "ob", name = "b", descriptor = "I")
    private int field663 = 485;

    @OriginalMember(owner = "ob", name = "c", descriptor = "Lu;")
    public Linkable field664 = new Linkable();

    @OriginalMember(owner = "ob", name = "a", descriptor = "I")
    private int field662;

    @OriginalMember(owner = "ob", name = "d", descriptor = "Lu;")
    private Linkable field665;

    @OriginalMember(owner = "ob", name = "<init>", descriptor = "(B)V")
    public LinkList(byte arg0) {
        this.field664.field300 = this.field664;
        if (arg0 != 30) {
            this.field662 = 412;
        }
        this.field664.field301 = this.field664;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;)V")
    public void method232(Linkable arg0) {
        if (arg0.field301 != null) {
            arg0.method108();
        }
        arg0.field301 = this.field664.field301;
        arg0.field300 = this.field664;
        arg0.field301.field300 = arg0;
        arg0.field300.field301 = arg0;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;B)V")
    public void method233(Linkable arg0, byte arg1) {
        if (arg1 != 4) {
            return;
        }
        boolean var3 = false;
        if (arg0.field301 != null) {
            arg0.method108();
        }
        arg0.field301 = this.field664;
        arg0.field300 = this.field664.field300;
        arg0.field301.field300 = arg0;
        arg0.field300.field301 = arg0;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "()Lu;")
    public Linkable method234() {
        Linkable var1 = this.field664.field300;
        if (this.field664 == var1) {
            return null;
        } else {
            var1.method108();
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "()Lu;")
    public Linkable method235() {
        Linkable var1 = this.field664.field300;
        if (this.field664 == var1) {
            this.field665 = null;
            return null;
        } else {
            this.field665 = var1.field300;
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(I)Lu;")
    public Linkable method236(int arg0) {
        Linkable var2 = this.field664.field301;
        int var3 = 88 / arg0;
        if (this.field664 == var2) {
            this.field665 = null;
            return null;
        } else {
            this.field665 = var2.field301;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "(I)Lu;")
    public Linkable method237(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Linkable var3 = this.field665;
        if (this.field664 == var3) {
            this.field665 = null;
            return null;
        } else {
            this.field665 = var3.field300;
            return var3;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(B)Lu;")
    public Linkable method238(byte arg0) {
        Linkable var2 = this.field665;
        if (this.field664 == var2) {
            this.field665 = null;
            return null;
        }
        this.field665 = var2.field301;
        if (arg0 != 6) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "ob", name = "c", descriptor = "()V")
    public void method239() {
        while (true) {
            Linkable var1 = this.field664.field300;
            if (this.field664 == var1) {
                return;
            }
            var1.method108();
        }
    }
}
