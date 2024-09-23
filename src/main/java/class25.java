import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HEJSGXMA")
public class class25 extends class20 {

    @OriginalMember(owner = "HEJSGXMA", name = "l", descriptor = "I")
    private int field792 = 6;

    @OriginalMember(owner = "HEJSGXMA", name = "m", descriptor = "Z")
    public boolean field793 = false;

    @OriginalMember(owner = "HEJSGXMA", name = "x", descriptor = "Z")
    private boolean field804 = false;

    @OriginalMember(owner = "HEJSGXMA", name = "y", descriptor = "I")
    private int field805 = -508;

    @OriginalMember(owner = "HEJSGXMA", name = "E", descriptor = "B")
    private byte field811 = 1;

    @OriginalMember(owner = "HEJSGXMA", name = "I", descriptor = "I")
    private int field815 = -374;

    @OriginalMember(owner = "HEJSGXMA", name = "L", descriptor = "Z")
    private boolean field818 = true;

    @OriginalMember(owner = "HEJSGXMA", name = "P", descriptor = "Z")
    private boolean field822 = true;

    @OriginalMember(owner = "HEJSGXMA", name = "t", descriptor = "LUAVNMKVJ;")
    private class64 field800;

    @OriginalMember(owner = "HEJSGXMA", name = "z", descriptor = "I")
    public int field806;

    @OriginalMember(owner = "HEJSGXMA", name = "A", descriptor = "I")
    public int field807;

    @OriginalMember(owner = "HEJSGXMA", name = "B", descriptor = "I")
    public int field808;

    @OriginalMember(owner = "HEJSGXMA", name = "C", descriptor = "I")
    public int field809;

    @OriginalMember(owner = "HEJSGXMA", name = "r", descriptor = "I")
    public int field798;

    @OriginalMember(owner = "HEJSGXMA", name = "s", descriptor = "I")
    public int field799;

    @OriginalMember(owner = "HEJSGXMA", name = "F", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "HEJSGXMA", name = "G", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "HEJSGXMA", name = "H", descriptor = "I")
    public int field814;

    @OriginalMember(owner = "HEJSGXMA", name = "D", descriptor = "I")
    public int field810;

    @OriginalMember(owner = "HEJSGXMA", name = "n", descriptor = "D")
    private double field794;

    @OriginalMember(owner = "HEJSGXMA", name = "o", descriptor = "D")
    private double field795;

    @OriginalMember(owner = "HEJSGXMA", name = "p", descriptor = "D")
    private double field796;

    @OriginalMember(owner = "HEJSGXMA", name = "q", descriptor = "D")
    private double field797;

    @OriginalMember(owner = "HEJSGXMA", name = "u", descriptor = "D")
    public double field801;

    @OriginalMember(owner = "HEJSGXMA", name = "v", descriptor = "D")
    public double field802;

    @OriginalMember(owner = "HEJSGXMA", name = "w", descriptor = "D")
    public double field803;

    @OriginalMember(owner = "HEJSGXMA", name = "M", descriptor = "D")
    private double field819;

    @OriginalMember(owner = "HEJSGXMA", name = "J", descriptor = "I")
    public int field816;

    @OriginalMember(owner = "HEJSGXMA", name = "K", descriptor = "I")
    public int field817;

    @OriginalMember(owner = "HEJSGXMA", name = "N", descriptor = "I")
    private int field820;

    @OriginalMember(owner = "HEJSGXMA", name = "O", descriptor = "I")
    private int field821;

    @OriginalMember(owner = "HEJSGXMA", name = "a", descriptor = "(II)V")
    public final void method286(int arg0, int arg1) {
        this.field793 = true;
        if (arg0 <= 0) {
            return;
        }
        this.field801 += (double) arg1 * this.field794;
        this.field802 += (double) arg1 * this.field795;
        this.field803 += this.field819 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field797;
        this.field797 += (double) arg1 * this.field819;
        this.field816 = (int) (Math.atan2(this.field794, this.field795) * 325.949D) + 1024 & 0x7FF;
        this.field817 = (int) (Math.atan2(this.field797, this.field796) * 325.949D) & 0x7FF;
        if (this.field800.field1561 == null) {
            return;
        }
        this.field821 += arg1;
        while (this.field821 > this.field800.field1561.method361(this.field792, this.field820)) {
            this.field821 -= this.field800.field1561.method361(this.field792, this.field820) + 1;
            this.field820++;
            if (this.field820 >= this.field800.field1561.field954) {
                this.field820 = 0;
            }
        }
    }

    @OriginalMember(owner = "HEJSGXMA", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public class25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field800 = class64.field1557[arg0];
        this.field806 = arg11;
        this.field807 = arg2;
        this.field808 = arg7;
        this.field809 = arg6;
        if (arg5 != 0) {
            this.field822 = !this.field822;
        }
        this.field798 = arg1;
        this.field799 = arg8;
        this.field812 = arg10;
        this.field813 = arg4;
        this.field814 = arg3;
        this.field810 = arg9;
        this.field793 = false;
    }

    @OriginalMember(owner = "HEJSGXMA", name = "a", descriptor = "(IIIIZ)V")
    public final void method287(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!this.field793) {
            double var6 = (double) (arg1 - this.field807);
            double var8 = (double) (arg2 - this.field808);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field801 = (double) this.field813 * var6 / var10 + (double) this.field807;
            this.field802 = (double) this.field813 * var8 / var10 + (double) this.field808;
            this.field803 = this.field809;
        }
        double var12 = (double) (this.field799 + 1 - arg3);
        this.field794 = ((double) arg1 - this.field801) / var12;
        this.field795 = ((double) arg2 - this.field802) / var12;
        this.field796 = Math.sqrt(this.field795 * this.field795 + this.field794 * this.field794);
        if (!this.field793) {
            this.field797 = -this.field796 * Math.tan((double) this.field812 * 0.02454369D);
        }
        this.field819 = ((double) arg0 - this.field803 - this.field797 * var12) * 2.0D / (var12 * var12);
        if (!arg4) {
            this.field805 = -453;
        }
    }

    @OriginalMember(owner = "HEJSGXMA", name = "a", descriptor = "(I)LRTQSBWRH;")
    public final class59 method199(int arg0) {
        class59 var2 = this.field800.method502();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field800.field1561 != null) {
            var3 = this.field800.field1561.field955[this.field820];
        }
        class59 var4 = new class59(true, -28456, class18.method229(var3, 8), var2, false);
        if (var3 != -1) {
            var4.method461(this.field815);
            var4.method462(var3, this.field811);
            var4.field1336 = null;
            var4.field1335 = null;
        }
        if (this.field800.field1564 != 128 || this.field800.field1565 != 128) {
            var4.method470(this.field800.field1565, this.field800.field1564, this.field800.field1564, true);
        }
        var4.method466(this.field817, -798);
        var4.method471(this.field800.field1567 + 64, this.field800.field1568 + 850, -30, -50, -30, true);
        if (arg0 >= 0) {
            this.field804 = !this.field804;
        }
        return var4;
    }
}
