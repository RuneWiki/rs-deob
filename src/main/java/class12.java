import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CSHXWWDM")
public class class12 extends class30 {

    @OriginalMember(owner = "CSHXWWDM", name = "v", descriptor = "Z")
    public boolean field652 = false;

    @OriginalMember(owner = "CSHXWWDM", name = "B", descriptor = "B")
    private byte field658 = 3;

    @OriginalMember(owner = "CSHXWWDM", name = "D", descriptor = "Z")
    private boolean field660 = false;

    @OriginalMember(owner = "CSHXWWDM", name = "L", descriptor = "B")
    private byte field668 = 23;

    @OriginalMember(owner = "CSHXWWDM", name = "w", descriptor = "LBKJQHSVH;")
    private class6 field653;

    @OriginalMember(owner = "CSHXWWDM", name = "C", descriptor = "I")
    public int field659;

    @OriginalMember(owner = "CSHXWWDM", name = "r", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "CSHXWWDM", name = "s", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "CSHXWWDM", name = "t", descriptor = "I")
    public int field650;

    @OriginalMember(owner = "CSHXWWDM", name = "l", descriptor = "I")
    public int field642;

    @OriginalMember(owner = "CSHXWWDM", name = "m", descriptor = "I")
    public int field643;

    @OriginalMember(owner = "CSHXWWDM", name = "E", descriptor = "I")
    public int field661;

    @OriginalMember(owner = "CSHXWWDM", name = "F", descriptor = "I")
    public int field662;

    @OriginalMember(owner = "CSHXWWDM", name = "G", descriptor = "I")
    public int field663;

    @OriginalMember(owner = "CSHXWWDM", name = "u", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "CSHXWWDM", name = "n", descriptor = "D")
    public double field644;

    @OriginalMember(owner = "CSHXWWDM", name = "o", descriptor = "D")
    public double field645;

    @OriginalMember(owner = "CSHXWWDM", name = "p", descriptor = "D")
    public double field646;

    @OriginalMember(owner = "CSHXWWDM", name = "q", descriptor = "D")
    private double field647;

    @OriginalMember(owner = "CSHXWWDM", name = "H", descriptor = "D")
    private double field664;

    @OriginalMember(owner = "CSHXWWDM", name = "I", descriptor = "D")
    private double field665;

    @OriginalMember(owner = "CSHXWWDM", name = "J", descriptor = "D")
    private double field666;

    @OriginalMember(owner = "CSHXWWDM", name = "K", descriptor = "D")
    private double field667;

    @OriginalMember(owner = "CSHXWWDM", name = "x", descriptor = "I")
    private int field654;

    @OriginalMember(owner = "CSHXWWDM", name = "y", descriptor = "I")
    private int field655;

    @OriginalMember(owner = "CSHXWWDM", name = "z", descriptor = "I")
    public int field656;

    @OriginalMember(owner = "CSHXWWDM", name = "A", descriptor = "I")
    public int field657;

    @OriginalMember(owner = "CSHXWWDM", name = "a", descriptor = "(IIIZI)V")
    public final void method189(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            return;
        }
        if (!this.field652) {
            double var6 = (double) (arg0 - this.field648);
            double var8 = (double) (arg4 - this.field649);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field644 = (double) this.field662 * var6 / var10 + (double) this.field648;
            this.field645 = (double) this.field662 * var8 / var10 + (double) this.field649;
            this.field646 = this.field650;
        }
        double var12 = (double) (this.field643 + 1 - arg2);
        this.field664 = ((double) arg0 - this.field644) / var12;
        this.field665 = ((double) arg4 - this.field645) / var12;
        this.field666 = Math.sqrt(this.field665 * this.field665 + this.field664 * this.field664);
        if (!this.field652) {
            this.field667 = -this.field666 * Math.tan((double) this.field661 * 0.02454369D);
        }
        this.field647 = ((double) arg1 - this.field646 - this.field667 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "CSHXWWDM", name = "a", descriptor = "(II)V")
    public final void method190(int arg0, int arg1) {
        this.field652 = true;
        this.field644 += (double) arg0 * this.field664;
        this.field645 += (double) arg0 * this.field665;
        if (arg1 >= 0) {
            return;
        }
        this.field646 += this.field647 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field667;
        this.field667 += (double) arg0 * this.field647;
        this.field656 = (int) (Math.atan2(this.field664, this.field665) * 325.949D) + 1024 & 0x7FF;
        this.field657 = (int) (Math.atan2(this.field667, this.field666) * 325.949D) & 0x7FF;
        if (this.field653.field65 == null) {
            return;
        }
        this.field655 += arg0;
        while (this.field655 > this.field653.field65.method319(this.field654, this.field658)) {
            this.field655 -= this.field653.field65.method319(this.field654, this.field658) + 1;
            this.field654++;
            if (this.field654 >= this.field653.field65.field1188) {
                this.field654 = 0;
            }
        }
    }

    @OriginalMember(owner = "CSHXWWDM", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public class12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field653 = class6.field61[arg10];
        this.field659 = arg8;
        this.field648 = arg0;
        this.field649 = arg11;
        this.field650 = arg1;
        this.field642 = arg9;
        this.field643 = arg4;
        this.field661 = arg2;
        this.field662 = arg5;
        this.field663 = arg6;
        if (arg3 != 9330) {
            throw new NullPointerException();
        }
        this.field651 = arg7;
        this.field652 = false;
    }

    @OriginalMember(owner = "CSHXWWDM", name = "a", descriptor = "(I)LVYUQHOMO;")
    public final class66 method13(int arg0) {
        class66 var2 = this.field653.method16();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field653.field65 != null) {
            var3 = this.field653.field65.field1189[this.field654];
        }
        class66 var4 = new class66(true, class2.method11((byte) 85, var3), var2, this.field668, false);
        int var5 = 17 / arg0;
        if (var3 != -1) {
            var4.method414((byte) 56);
            var4.method415(var3, 3);
            var4.field1511 = null;
            var4.field1510 = null;
        }
        if (this.field653.field68 != 128 || this.field653.field69 != 128) {
            var4.method423(this.field653.field68, this.field653.field69, this.field653.field68, 0);
        }
        var4.method419(this.field657, 246);
        var4.method424(this.field653.field71 + 64, this.field653.field72 + 850, -30, -50, -30, true);
        return var4;
    }
}
