import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BSBQPUWL")
public class class8 extends class58 {

    @OriginalMember(owner = "client!BSBQPUWL", name = "G", descriptor = "I")
    private int field127 = 1;

    @OriginalMember(owner = "client!BSBQPUWL", name = "H", descriptor = "Z")
    public boolean field128 = false;

    @OriginalMember(owner = "client!BSBQPUWL", name = "J", descriptor = "LXYSJIYWF;")
    private class67 field130;

    @OriginalMember(owner = "client!BSBQPUWL", name = "q", descriptor = "I")
    public int field111;

    @OriginalMember(owner = "client!BSBQPUWL", name = "y", descriptor = "I")
    public int field119;

    @OriginalMember(owner = "client!BSBQPUWL", name = "z", descriptor = "I")
    public int field120;

    @OriginalMember(owner = "client!BSBQPUWL", name = "A", descriptor = "I")
    public int field121;

    @OriginalMember(owner = "client!BSBQPUWL", name = "r", descriptor = "I")
    public int field112;

    @OriginalMember(owner = "client!BSBQPUWL", name = "s", descriptor = "I")
    public int field113;

    @OriginalMember(owner = "client!BSBQPUWL", name = "m", descriptor = "I")
    public int field107;

    @OriginalMember(owner = "client!BSBQPUWL", name = "n", descriptor = "I")
    public int field108;

    @OriginalMember(owner = "client!BSBQPUWL", name = "o", descriptor = "I")
    public int field109;

    @OriginalMember(owner = "client!BSBQPUWL", name = "B", descriptor = "I")
    public int field122;

    @OriginalMember(owner = "client!BSBQPUWL", name = "v", descriptor = "D")
    public double field116;

    @OriginalMember(owner = "client!BSBQPUWL", name = "w", descriptor = "D")
    public double field117;

    @OriginalMember(owner = "client!BSBQPUWL", name = "x", descriptor = "D")
    public double field118;

    @OriginalMember(owner = "client!BSBQPUWL", name = "C", descriptor = "D")
    private double field123;

    @OriginalMember(owner = "client!BSBQPUWL", name = "D", descriptor = "D")
    private double field124;

    @OriginalMember(owner = "client!BSBQPUWL", name = "E", descriptor = "D")
    private double field125;

    @OriginalMember(owner = "client!BSBQPUWL", name = "F", descriptor = "D")
    private double field126;

    @OriginalMember(owner = "client!BSBQPUWL", name = "I", descriptor = "D")
    private double field129;

    @OriginalMember(owner = "client!BSBQPUWL", name = "p", descriptor = "I")
    private int field110;

    @OriginalMember(owner = "client!BSBQPUWL", name = "t", descriptor = "I")
    public int field114;

    @OriginalMember(owner = "client!BSBQPUWL", name = "u", descriptor = "I")
    public int field115;

    @OriginalMember(owner = "client!BSBQPUWL", name = "K", descriptor = "I")
    private int field131;

    @OriginalMember(owner = "client!BSBQPUWL", name = "L", descriptor = "I")
    private int field132;

    @OriginalMember(owner = "client!BSBQPUWL", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public class8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field130 = class67.field1691[arg4];
        this.field111 = arg3;
        this.field119 = arg5;
        this.field120 = arg6;
        if (arg11 != 0) {
            throw new NullPointerException();
        }
        this.field121 = arg10;
        this.field112 = arg2;
        this.field113 = arg7;
        this.field107 = arg9;
        this.field108 = arg8;
        this.field109 = arg0;
        this.field122 = arg1;
        this.field128 = false;
    }

    @OriginalMember(owner = "client!BSBQPUWL", name = "a", descriptor = "(IZ)V")
    public final void method42(int arg0, boolean arg1) {
        this.field128 = true;
        this.field116 += (double) arg0 * this.field123;
        this.field117 += (double) arg0 * this.field124;
        this.field118 += this.field129 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field126;
        if (!arg1) {
            return;
        }
        this.field126 += (double) arg0 * this.field129;
        this.field114 = (int) (Math.atan2(this.field123, this.field124) * 325.949D) + 1024 & 0x7FF;
        this.field115 = (int) (Math.atan2(this.field126, this.field125) * 325.949D) & 0x7FF;
        if (this.field130.field1695 == null) {
            return;
        }
        this.field132 += arg0;
        while (this.field132 > this.field130.field1695.method207((byte) 6, this.field131)) {
            this.field132 -= this.field130.field1695.method207((byte) 6, this.field131);
            this.field131++;
            if (this.field131 >= this.field130.field1695.field718) {
                this.field131 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!BSBQPUWL", name = "a", descriptor = "(I)LOJGAHFXC;")
    public final class41 method1(int arg0) {
        class41 var2 = this.field130.method582();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field130.field1695 != null) {
            var3 = this.field130.field1695.field719[this.field131];
        }
        class41 var4 = new class41(class37.method395(var3, (byte) 1), false, true, -900, var2);
        if (var3 != -1) {
            var4.method420(this.field110);
            var4.method421(771, var3);
            var4.field1221 = null;
            var4.field1220 = null;
        }
        if (this.field130.field1698 != 128 || this.field130.field1699 != 128) {
            var4.method429(this.field130.field1698, this.field127, this.field130.field1699, this.field130.field1698);
        }
        var4.method425(171, this.field115);
        var4.method430(this.field130.field1701 + 64, this.field130.field1702 + 850, -30, -50, -30, true);
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        return var4;
    }

    @OriginalMember(owner = "client!BSBQPUWL", name = "a", descriptor = "(IIIII)V")
    public final void method43(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field128) {
            double var6 = (double) (arg4 - this.field119);
            double var8 = (double) (arg0 - this.field120);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field116 = (double) this.field108 * var6 / var10 + (double) this.field119;
            this.field117 = (double) this.field108 * var8 / var10 + (double) this.field120;
            this.field118 = this.field121;
        }
        double var12 = (double) (this.field113 + 1 - arg2);
        this.field123 = ((double) arg4 - this.field116) / var12;
        this.field124 = ((double) arg0 - this.field117) / var12;
        if (arg3 != -37962) {
            return;
        }
        this.field125 = Math.sqrt(this.field124 * this.field124 + this.field123 * this.field123);
        if (!this.field128) {
            this.field126 = -this.field125 * Math.tan((double) this.field107 * 0.02454369D);
        }
        this.field129 = ((double) arg1 - this.field118 - this.field126 * var12) * 2.0D / (var12 * var12);
    }
}
