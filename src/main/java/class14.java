import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FIEFABCJ")
public class class14 extends class28 {

    @OriginalMember(owner = "FIEFABCJ", name = "x", descriptor = "Z")
    public boolean field653 = false;

    @OriginalMember(owner = "FIEFABCJ", name = "G", descriptor = "I")
    private int field662 = -22512;

    @OriginalMember(owner = "FIEFABCJ", name = "L", descriptor = "LSNGXEJOJ;")
    private class55 field667;

    @OriginalMember(owner = "FIEFABCJ", name = "w", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "FIEFABCJ", name = "C", descriptor = "I")
    public int field658;

    @OriginalMember(owner = "FIEFABCJ", name = "D", descriptor = "I")
    public int field659;

    @OriginalMember(owner = "FIEFABCJ", name = "E", descriptor = "I")
    public int field660;

    @OriginalMember(owner = "FIEFABCJ", name = "r", descriptor = "I")
    public int field647;

    @OriginalMember(owner = "FIEFABCJ", name = "s", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "FIEFABCJ", name = "t", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "FIEFABCJ", name = "u", descriptor = "I")
    public int field650;

    @OriginalMember(owner = "FIEFABCJ", name = "v", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "FIEFABCJ", name = "F", descriptor = "I")
    public int field661;

    @OriginalMember(owner = "FIEFABCJ", name = "q", descriptor = "D")
    private double field646;

    @OriginalMember(owner = "FIEFABCJ", name = "y", descriptor = "D")
    private double field654;

    @OriginalMember(owner = "FIEFABCJ", name = "z", descriptor = "D")
    private double field655;

    @OriginalMember(owner = "FIEFABCJ", name = "A", descriptor = "D")
    private double field656;

    @OriginalMember(owner = "FIEFABCJ", name = "B", descriptor = "D")
    private double field657;

    @OriginalMember(owner = "FIEFABCJ", name = "I", descriptor = "D")
    public double field664;

    @OriginalMember(owner = "FIEFABCJ", name = "J", descriptor = "D")
    public double field665;

    @OriginalMember(owner = "FIEFABCJ", name = "K", descriptor = "D")
    public double field666;

    @OriginalMember(owner = "FIEFABCJ", name = "n", descriptor = "I")
    private int field643;

    @OriginalMember(owner = "FIEFABCJ", name = "o", descriptor = "I")
    public int field644;

    @OriginalMember(owner = "FIEFABCJ", name = "p", descriptor = "I")
    public int field645;

    @OriginalMember(owner = "FIEFABCJ", name = "H", descriptor = "I")
    private int field663;

    @OriginalMember(owner = "FIEFABCJ", name = "M", descriptor = "I")
    private int field668;

    @OriginalMember(owner = "FIEFABCJ", name = "N", descriptor = "I")
    private int field669;

    @OriginalMember(owner = "FIEFABCJ", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field667 = class55.field1422[arg5];
        if (this.field662 != arg4) {
            throw new NullPointerException();
        }
        this.field652 = arg2;
        this.field658 = arg6;
        this.field659 = arg11;
        this.field660 = arg9;
        this.field647 = arg0;
        this.field648 = arg3;
        this.field649 = arg10;
        this.field650 = arg8;
        this.field651 = arg1;
        this.field661 = arg7;
        this.field653 = false;
    }

    @OriginalMember(owner = "FIEFABCJ", name = "a", descriptor = "(II)V")
    public final void method205(int arg0, int arg1) {
        this.field653 = true;
        this.field664 += (double) arg1 * this.field654;
        this.field665 += (double) arg1 * this.field655;
        this.field666 += this.field646 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field657;
        this.field657 += (double) arg1 * this.field646;
        this.field644 = (int) (Math.atan2(this.field654, this.field655) * 325.949D) + 1024 & 0x7FF;
        if (arg0 != 0) {
            this.field643 = 92;
        }
        this.field645 = (int) (Math.atan2(this.field657, this.field656) * 325.949D) & 0x7FF;
        if (this.field667.field1426 == null) {
            return;
        }
        this.field669 += arg1;
        while (this.field669 > this.field667.field1426.method493(this.field668, (byte) 2)) {
            this.field669 -= this.field667.field1426.method493(this.field668, (byte) 2) + 1;
            this.field668++;
            if (this.field668 >= this.field667.field1426.field1454) {
                this.field668 = 0;
            }
        }
    }

    @OriginalMember(owner = "FIEFABCJ", name = "a", descriptor = "(I)LNJPATAFL;")
    public final class35 method206(int arg0) {
        class35 var2 = this.field667.method478();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field667.field1426 != null) {
            var3 = this.field667.field1426.field1455[this.field668];
        }
        class35 var4 = new class35(class57.method491(var3, this.field663), false, true, (byte) 45, var2);
        if (var3 != -1) {
            var4.method341(9566);
            var4.method342(true, var3);
            var4.field1025 = null;
            var4.field1024 = null;
        }
        if (this.field667.field1429 != 128 || this.field667.field1430 != 128) {
            var4.method350(this.field667.field1429, true, this.field667.field1429, this.field667.field1430);
        }
        var4.method346(this.field645, (byte) -119);
        var4.method351(this.field667.field1432 + 64, this.field667.field1433 + 850, -30, -50, -30, true);
        if (arg0 != 9) {
            throw new NullPointerException();
        }
        return var4;
    }

    @OriginalMember(owner = "FIEFABCJ", name = "a", descriptor = "(IIZII)V")
    public final void method207(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!this.field653) {
            double var6 = (double) (arg3 - this.field658);
            double var8 = (double) (arg1 - this.field659);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field664 = (double) this.field650 * var6 / var10 + (double) this.field658;
            this.field665 = (double) this.field650 * var8 / var10 + (double) this.field659;
            this.field666 = this.field660;
        }
        double var12 = (double) (this.field648 + 1 - arg4);
        if (arg2) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        this.field654 = ((double) arg3 - this.field664) / var12;
        this.field655 = ((double) arg1 - this.field665) / var12;
        this.field656 = Math.sqrt(this.field655 * this.field655 + this.field654 * this.field654);
        if (!this.field653) {
            this.field657 = -this.field656 * Math.tan((double) this.field649 * 0.02454369D);
        }
        this.field646 = ((double) arg0 - this.field666 - this.field657 * var12) * 2.0D / (var12 * var12);
    }
}
