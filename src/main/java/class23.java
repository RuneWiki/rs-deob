import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!HMUVVYST")
public class class23 extends class56 {

    @OriginalMember(owner = "client!HMUVVYST", name = "u", descriptor = "I")
    private int field795 = -140;

    @OriginalMember(owner = "client!HMUVVYST", name = "w", descriptor = "Z")
    private boolean field797 = false;

    @OriginalMember(owner = "client!HMUVVYST", name = "L", descriptor = "Z")
    public boolean field812 = false;

    @OriginalMember(owner = "client!HMUVVYST", name = "q", descriptor = "LEBBSHPSJ;")
    private class12 field791;

    @OriginalMember(owner = "client!HMUVVYST", name = "K", descriptor = "I")
    public int field811;

    @OriginalMember(owner = "client!HMUVVYST", name = "m", descriptor = "I")
    public int field787;

    @OriginalMember(owner = "client!HMUVVYST", name = "n", descriptor = "I")
    public int field788;

    @OriginalMember(owner = "client!HMUVVYST", name = "o", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "client!HMUVVYST", name = "G", descriptor = "I")
    public int field807;

    @OriginalMember(owner = "client!HMUVVYST", name = "H", descriptor = "I")
    public int field808;

    @OriginalMember(owner = "client!HMUVVYST", name = "x", descriptor = "I")
    public int field798;

    @OriginalMember(owner = "client!HMUVVYST", name = "y", descriptor = "I")
    public int field799;

    @OriginalMember(owner = "client!HMUVVYST", name = "z", descriptor = "I")
    public int field800;

    @OriginalMember(owner = "client!HMUVVYST", name = "p", descriptor = "I")
    public int field790;

    @OriginalMember(owner = "client!HMUVVYST", name = "r", descriptor = "D")
    public double field792;

    @OriginalMember(owner = "client!HMUVVYST", name = "s", descriptor = "D")
    public double field793;

    @OriginalMember(owner = "client!HMUVVYST", name = "t", descriptor = "D")
    public double field794;

    @OriginalMember(owner = "client!HMUVVYST", name = "v", descriptor = "D")
    private double field796;

    @OriginalMember(owner = "client!HMUVVYST", name = "C", descriptor = "D")
    private double field803;

    @OriginalMember(owner = "client!HMUVVYST", name = "D", descriptor = "D")
    private double field804;

    @OriginalMember(owner = "client!HMUVVYST", name = "E", descriptor = "D")
    private double field805;

    @OriginalMember(owner = "client!HMUVVYST", name = "F", descriptor = "D")
    private double field806;

    @OriginalMember(owner = "client!HMUVVYST", name = "A", descriptor = "I")
    private int field801;

    @OriginalMember(owner = "client!HMUVVYST", name = "B", descriptor = "I")
    private int field802;

    @OriginalMember(owner = "client!HMUVVYST", name = "I", descriptor = "I")
    public int field809;

    @OriginalMember(owner = "client!HMUVVYST", name = "J", descriptor = "I")
    public int field810;

    @OriginalMember(owner = "client!HMUVVYST", name = "a", descriptor = "(IIZII)V")
    public final void method228(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!this.field812) {
            double var6 = (double) (arg0 - this.field787);
            double var8 = (double) (arg4 - this.field788);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field792 = (double) this.field799 * var6 / var10 + (double) this.field787;
            this.field793 = (double) this.field799 * var8 / var10 + (double) this.field788;
            this.field794 = this.field789;
        }
        double var12 = (double) (this.field808 + 1 - arg3);
        this.field803 = ((double) arg0 - this.field792) / var12;
        this.field804 = ((double) arg4 - this.field793) / var12;
        this.field805 = Math.sqrt(this.field804 * this.field804 + this.field803 * this.field803);
        if (arg2) {
            this.field797 = !this.field797;
        }
        if (!this.field812) {
            this.field806 = -this.field805 * Math.tan((double) this.field798 * 0.02454369D);
        }
        this.field796 = ((double) arg1 - this.field794 - this.field806 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!HMUVVYST", name = "a", descriptor = "(B)LJJMVUSJJ;")
    public final class29 method214(byte arg0) {
        class29 var2 = this.field791.method210();
        if (arg0 != 7) {
            throw new NullPointerException();
        } else if (var2 == null) {
            return null;
        } else {
            int var3 = -1;
            if (this.field791.field687 != null) {
                var3 = this.field791.field687.field1630[this.field801];
            }
            class29 var4 = new class29(true, class42.method382(var3, 4), false, 9, var2);
            if (var3 != -1) {
                var4.method307(979);
                var4.method308(var3, 771);
                var4.field953 = null;
                var4.field952 = null;
            }
            if (this.field791.field690 != 128 || this.field791.field691 != 128) {
                var4.method316(this.field791.field691, this.field791.field690, this.field791.field690, true);
            }
            var4.method312(22252, this.field810);
            var4.method317(this.field791.field693 + 64, this.field791.field694 + 850, -30, -50, -30, true);
            return var4;
        }
    }

    @OriginalMember(owner = "client!HMUVVYST", name = "a", descriptor = "(ZI)V")
    public final void method229(boolean arg0, int arg1) {
        this.field812 = true;
        this.field792 += (double) arg1 * this.field803;
        if (arg0) {
            this.field797 = !this.field797;
        }
        this.field793 += (double) arg1 * this.field804;
        this.field794 += this.field796 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field806;
        this.field806 += (double) arg1 * this.field796;
        this.field809 = (int) (Math.atan2(this.field803, this.field804) * 325.949D) + 1024 & 0x7FF;
        this.field810 = (int) (Math.atan2(this.field806, this.field805) * 325.949D) & 0x7FF;
        if (this.field791.field687 == null) {
            return;
        }
        this.field802 += arg1;
        while (this.field802 > this.field791.field687.method532(this.field801, (byte) 6)) {
            this.field802 -= this.field791.field687.method532(this.field801, (byte) 6);
            this.field801++;
            if (this.field801 >= this.field791.field687.field1629) {
                this.field801 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!HMUVVYST", name = "<init>", descriptor = "(IIIIBIIIIIII)V")
    public class23(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field791 = class12.field683[arg10];
        this.field811 = arg8;
        this.field787 = arg11;
        this.field788 = arg9;
        this.field789 = arg1;
        if (arg4 == 2) {
            boolean var13 = false;
        } else {
            this.field795 = 223;
        }
        this.field807 = arg0;
        this.field808 = arg2;
        this.field798 = arg3;
        this.field799 = arg6;
        this.field800 = arg5;
        this.field790 = arg7;
        this.field812 = false;
    }
}
