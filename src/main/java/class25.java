import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HGWWWEIE")
public class class25 extends class64 {

    @OriginalMember(owner = "HGWWWEIE", name = "l", descriptor = "I")
    private int field827 = 617;

    @OriginalMember(owner = "HGWWWEIE", name = "m", descriptor = "I")
    private int field828 = -2273;

    @OriginalMember(owner = "HGWWWEIE", name = "p", descriptor = "B")
    private byte field831 = 6;

    @OriginalMember(owner = "HGWWWEIE", name = "r", descriptor = "Z")
    public boolean field833 = false;

    @OriginalMember(owner = "HGWWWEIE", name = "s", descriptor = "LIDQQUVDL;")
    private class27 field834;

    @OriginalMember(owner = "HGWWWEIE", name = "t", descriptor = "I")
    public int field835;

    @OriginalMember(owner = "HGWWWEIE", name = "u", descriptor = "I")
    public int field836;

    @OriginalMember(owner = "HGWWWEIE", name = "v", descriptor = "I")
    public int field837;

    @OriginalMember(owner = "HGWWWEIE", name = "w", descriptor = "I")
    public int field838;

    @OriginalMember(owner = "HGWWWEIE", name = "q", descriptor = "I")
    public int field832;

    @OriginalMember(owner = "HGWWWEIE", name = "n", descriptor = "I")
    private int field829;

    @OriginalMember(owner = "HGWWWEIE", name = "o", descriptor = "I")
    private int field830;

    @OriginalMember(owner = "HGWWWEIE", name = "a", descriptor = "(Z)LOIBEFFXI;")
    public final class39 method2(boolean arg0) {
        class39 var2 = this.field834.method233();
        if (arg0) {
            throw new NullPointerException();
        } else if (var2 == null) {
            return null;
        } else {
            int var3 = this.field834.field851.field165[this.field829];
            class39 var4 = new class39(false, true, var2, class55.method455(true, var3), 5);
            if (!this.field833) {
                var4.method353(10544);
                var4.method354(var3, this.field831);
                var4.field1138 = null;
                var4.field1137 = null;
            }
            if (this.field834.field854 != 128 || this.field834.field855 != 128) {
                var4.method362((byte) 7, this.field834.field855, this.field834.field854, this.field834.field854);
            }
            if (this.field834.field856 != 0) {
                if (this.field834.field856 == 90) {
                    var4.method357(true);
                }
                if (this.field834.field856 == 180) {
                    var4.method357(true);
                    var4.method357(true);
                }
                if (this.field834.field856 == 270) {
                    var4.method357(true);
                    var4.method357(true);
                    var4.method357(true);
                }
            }
            var4.method363(this.field834.field857 + 64, this.field834.field858 + 850, -30, -50, -30, true);
            return var4;
        }
    }

    @OriginalMember(owner = "HGWWWEIE", name = "a", descriptor = "(II)V")
    public final void method230(int arg0, int arg1) {
        if (this.field828 != arg0) {
            this.field827 = 98;
        }
        this.field830 += arg1;
        while (true) {
            do {
                do {
                    if (this.field830 <= this.field834.field851.method23((byte) 2, this.field829)) {
                        return;
                    }
                    this.field830 -= this.field834.field851.method23((byte) 2, this.field829) + 1;
                    this.field829++;
                } while (this.field829 < this.field834.field851.field164);
            } while (this.field829 >= 0 && this.field829 < this.field834.field851.field164);
            this.field829 = 0;
            this.field833 = true;
        }
    }

    @OriginalMember(owner = "HGWWWEIE", name = "<init>", descriptor = "(IIBIIIII)V")
    public class25(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field834 = class27.field847[arg4];
        this.field835 = arg1;
        this.field836 = arg6;
        this.field837 = arg5;
        this.field838 = arg0;
        if (arg2 != 9) {
            throw new NullPointerException();
        }
        boolean var9 = false;
        this.field832 = arg3 + arg7;
        this.field833 = false;
    }
}
