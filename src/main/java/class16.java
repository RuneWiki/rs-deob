import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GVHVJOWK")
public class class16 extends class2 {

    @OriginalMember(owner = "GVHVJOWK", name = "q", descriptor = "I")
    private int field744 = 5;

    @OriginalMember(owner = "GVHVJOWK", name = "E", descriptor = "Z")
    private boolean field758 = false;

    @OriginalMember(owner = "GVHVJOWK", name = "H", descriptor = "Z")
    private boolean field761 = false;

    @OriginalMember(owner = "GVHVJOWK", name = "I", descriptor = "Z")
    public boolean field762 = false;

    @OriginalMember(owner = "GVHVJOWK", name = "L", descriptor = "LMKJLFPRH;")
    private class35 field765;

    @OriginalMember(owner = "GVHVJOWK", name = "M", descriptor = "I")
    public int field766;

    @OriginalMember(owner = "GVHVJOWK", name = "A", descriptor = "I")
    public int field754;

    @OriginalMember(owner = "GVHVJOWK", name = "B", descriptor = "I")
    public int field755;

    @OriginalMember(owner = "GVHVJOWK", name = "C", descriptor = "I")
    public int field756;

    @OriginalMember(owner = "GVHVJOWK", name = "y", descriptor = "I")
    public int field752;

    @OriginalMember(owner = "GVHVJOWK", name = "z", descriptor = "I")
    public int field753;

    @OriginalMember(owner = "GVHVJOWK", name = "m", descriptor = "I")
    public int field740;

    @OriginalMember(owner = "GVHVJOWK", name = "n", descriptor = "I")
    public int field741;

    @OriginalMember(owner = "GVHVJOWK", name = "o", descriptor = "I")
    public int field742;

    @OriginalMember(owner = "GVHVJOWK", name = "D", descriptor = "I")
    public int field757;

    @OriginalMember(owner = "GVHVJOWK", name = "p", descriptor = "D")
    private double field743;

    @OriginalMember(owner = "GVHVJOWK", name = "r", descriptor = "D")
    private double field745;

    @OriginalMember(owner = "GVHVJOWK", name = "s", descriptor = "D")
    private double field746;

    @OriginalMember(owner = "GVHVJOWK", name = "t", descriptor = "D")
    private double field747;

    @OriginalMember(owner = "GVHVJOWK", name = "u", descriptor = "D")
    private double field748;

    @OriginalMember(owner = "GVHVJOWK", name = "v", descriptor = "D")
    public double field749;

    @OriginalMember(owner = "GVHVJOWK", name = "w", descriptor = "D")
    public double field750;

    @OriginalMember(owner = "GVHVJOWK", name = "x", descriptor = "D")
    public double field751;

    @OriginalMember(owner = "GVHVJOWK", name = "F", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "GVHVJOWK", name = "G", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "GVHVJOWK", name = "J", descriptor = "I")
    private int field763;

    @OriginalMember(owner = "GVHVJOWK", name = "K", descriptor = "I")
    private int field764;

    @OriginalMember(owner = "GVHVJOWK", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public class16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg7 != 30330) {
            this.field758 = !this.field758;
        }
        this.field765 = class35.field1198[arg4];
        this.field766 = arg5;
        this.field754 = arg11;
        this.field755 = arg0;
        this.field756 = arg10;
        this.field752 = arg6;
        this.field753 = arg3;
        this.field740 = arg9;
        this.field741 = arg2;
        this.field742 = arg8;
        this.field757 = arg1;
        this.field762 = false;
    }

    @OriginalMember(owner = "GVHVJOWK", name = "a", descriptor = "(I)LJLNSJQDR;")
    public final class26 method2(int arg0) {
        class26 var2 = this.field765.method423();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field765.field1202 != null) {
            var3 = this.field765.field1202.field1316[this.field763];
        }
        class26 var4 = new class26(class59.method524((byte) 8, var3), false, true, true, var2);
        if (var3 != -1) {
            var4.method335(19035);
            var4.method336((byte) 46, var3);
            var4.field980 = null;
            var4.field979 = null;
        }
        if (this.field765.field1205 != 128 || this.field765.field1206 != 128) {
            var4.method344(this.field765.field1205, -190, this.field765.field1206, this.field765.field1205);
        }
        var4.method340(983, this.field760);
        if (arg0 < this.field744 || arg0 > this.field744) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        var4.method345(this.field765.field1208 + 64, this.field765.field1209 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "GVHVJOWK", name = "a", descriptor = "(IIIII)V")
    public final void method242(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0) {
            return;
        }
        if (!this.field762) {
            double var6 = (double) (arg0 - this.field754);
            double var8 = (double) (arg4 - this.field755);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field749 = (double) this.field741 * var6 / var10 + (double) this.field754;
            this.field750 = (double) this.field741 * var8 / var10 + (double) this.field755;
            this.field751 = this.field756;
        }
        double var12 = (double) (this.field753 + 1 - arg3);
        this.field745 = ((double) arg0 - this.field749) / var12;
        this.field746 = ((double) arg4 - this.field750) / var12;
        this.field747 = Math.sqrt(this.field746 * this.field746 + this.field745 * this.field745);
        if (!this.field762) {
            this.field748 = -this.field747 * Math.tan((double) this.field740 * 0.02454369D);
        }
        this.field743 = ((double) arg1 - this.field751 - this.field748 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "GVHVJOWK", name = "a", descriptor = "(II)V")
    public final void method243(int arg0, int arg1) {
        this.field762 = true;
        this.field749 += (double) arg1 * this.field745;
        this.field750 += (double) arg1 * this.field746;
        this.field751 += this.field743 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field748;
        this.field748 += (double) arg1 * this.field743;
        this.field759 = (int) (Math.atan2(this.field745, this.field746) * 325.949D) + 1024 & 0x7FF;
        this.field760 = (int) (Math.atan2(this.field748, this.field747) * 325.949D) & 0x7FF;
        if (arg0 != 28508 || this.field765.field1202 == null) {
            return;
        }
        this.field764 += arg1;
        while (this.field764 > this.field765.field1202.method457(this.field763, this.field761)) {
            this.field764 -= this.field765.field1202.method457(this.field763, this.field761) + 1;
            this.field763++;
            if (this.field763 >= this.field765.field1202.field1315) {
                this.field763 = 0;
            }
        }
    }
}
