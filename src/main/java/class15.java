import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!HDKZMJGE")
public class class15 extends class35 {

    @OriginalMember(owner = "client!HDKZMJGE", name = "t", descriptor = "I")
    private int field715 = 3;

    @OriginalMember(owner = "client!HDKZMJGE", name = "x", descriptor = "Z")
    private boolean field719 = false;

    @OriginalMember(owner = "client!HDKZMJGE", name = "y", descriptor = "Z")
    public boolean field720 = false;

    @OriginalMember(owner = "client!HDKZMJGE", name = "L", descriptor = "I")
    private int field733 = 58;

    @OriginalMember(owner = "client!HDKZMJGE", name = "w", descriptor = "LFOXTQZWB;")
    private class13 field718;

    @OriginalMember(owner = "client!HDKZMJGE", name = "K", descriptor = "I")
    public int field732;

    @OriginalMember(owner = "client!HDKZMJGE", name = "C", descriptor = "I")
    public int field724;

    @OriginalMember(owner = "client!HDKZMJGE", name = "D", descriptor = "I")
    public int field725;

    @OriginalMember(owner = "client!HDKZMJGE", name = "E", descriptor = "I")
    public int field726;

    @OriginalMember(owner = "client!HDKZMJGE", name = "u", descriptor = "I")
    public int field716;

    @OriginalMember(owner = "client!HDKZMJGE", name = "v", descriptor = "I")
    public int field717;

    @OriginalMember(owner = "client!HDKZMJGE", name = "H", descriptor = "I")
    public int field729;

    @OriginalMember(owner = "client!HDKZMJGE", name = "I", descriptor = "I")
    public int field730;

    @OriginalMember(owner = "client!HDKZMJGE", name = "J", descriptor = "I")
    public int field731;

    @OriginalMember(owner = "client!HDKZMJGE", name = "F", descriptor = "I")
    public int field727;

    @OriginalMember(owner = "client!HDKZMJGE", name = "p", descriptor = "D")
    private double field711;

    @OriginalMember(owner = "client!HDKZMJGE", name = "q", descriptor = "D")
    private double field712;

    @OriginalMember(owner = "client!HDKZMJGE", name = "r", descriptor = "D")
    private double field713;

    @OriginalMember(owner = "client!HDKZMJGE", name = "s", descriptor = "D")
    private double field714;

    @OriginalMember(owner = "client!HDKZMJGE", name = "z", descriptor = "D")
    public double field721;

    @OriginalMember(owner = "client!HDKZMJGE", name = "A", descriptor = "D")
    public double field722;

    @OriginalMember(owner = "client!HDKZMJGE", name = "B", descriptor = "D")
    public double field723;

    @OriginalMember(owner = "client!HDKZMJGE", name = "G", descriptor = "D")
    private double field728;

    @OriginalMember(owner = "client!HDKZMJGE", name = "n", descriptor = "I")
    private int field709;

    @OriginalMember(owner = "client!HDKZMJGE", name = "o", descriptor = "I")
    private int field710;

    @OriginalMember(owner = "client!HDKZMJGE", name = "M", descriptor = "I")
    public int field734;

    @OriginalMember(owner = "client!HDKZMJGE", name = "N", descriptor = "I")
    public int field735;

    @OriginalMember(owner = "client!HDKZMJGE", name = "a", descriptor = "(BIIII)V")
    public final void method217(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == 7) {
            boolean var6 = false;
        } else {
            this.field733 = 22;
        }
        if (!this.field720) {
            double var7 = (double) (arg1 - this.field724);
            double var9 = (double) (arg3 - this.field725);
            double var11 = Math.sqrt(var7 * var7 + var9 * var9);
            this.field721 = (double) this.field730 * var7 / var11 + (double) this.field724;
            this.field722 = (double) this.field730 * var9 / var11 + (double) this.field725;
            this.field723 = this.field726;
        }
        double var13 = (double) (this.field717 + 1 - arg4);
        this.field711 = ((double) arg1 - this.field721) / var13;
        this.field712 = ((double) arg3 - this.field722) / var13;
        this.field713 = Math.sqrt(this.field712 * this.field712 + this.field711 * this.field711);
        if (!this.field720) {
            this.field714 = -this.field713 * Math.tan((double) this.field729 * 0.02454369D);
        }
        this.field728 = ((double) arg2 - this.field723 - this.field714 * var13) * 2.0D / (var13 * var13);
    }

    @OriginalMember(owner = "client!HDKZMJGE", name = "a", descriptor = "(ZI)V")
    public final void method218(boolean arg0, int arg1) {
        this.field720 = true;
        this.field721 += (double) arg1 * this.field711;
        this.field722 += (double) arg1 * this.field712;
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field723 += this.field728 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field714;
        this.field714 += (double) arg1 * this.field728;
        this.field734 = (int) (Math.atan2(this.field711, this.field712) * 325.949D) + 1024 & 0x7FF;
        this.field735 = (int) (Math.atan2(this.field714, this.field713) * 325.949D) & 0x7FF;
        if (this.field718.field692 == null) {
            return;
        }
        this.field710 += arg1;
        while (this.field710 > this.field718.field692.method240((byte) 0, this.field709)) {
            this.field710 -= this.field718.field692.method240((byte) 0, this.field709) + 1;
            this.field709++;
            if (this.field709 >= this.field718.field692.field850) {
                this.field709 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!HDKZMJGE", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public class15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field718 = class13.field688[arg8];
        this.field732 = arg11;
        this.field724 = arg0;
        this.field725 = arg2;
        this.field726 = arg7;
        this.field716 = arg10;
        this.field717 = arg9;
        this.field729 = arg3;
        this.field730 = arg5;
        this.field731 = arg6;
        this.field727 = arg1;
        if (arg4 != -40800) {
            this.field719 = !this.field719;
        }
        this.field720 = false;
    }

    @OriginalMember(owner = "client!HDKZMJGE", name = "a", descriptor = "(I)LNGYJLUVS;")
    public final class37 method206(int arg0) {
        class37 var2 = this.field718.method210();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field718.field692 != null) {
            var3 = this.field718.field692.field851[this.field709];
        }
        class37 var4 = new class37(class49.method428((byte) 9, var3), true, true, var2, false);
        if (var3 != -1) {
            var4.method298(false);
            var4.method299(var3, 0);
            var4.field1027 = null;
            var4.field1026 = null;
        }
        if (this.field718.field695 != 128 || this.field718.field696 != 128) {
            var4.method307(this.field718.field695, true, this.field718.field695, this.field718.field696);
        }
        var4.method303(true, this.field735);
        if (arg0 != -12617) {
            this.field715 = 381;
        }
        var4.method308(this.field718.field698 + 64, this.field718.field699 + 850, -30, -50, -30, true);
        return var4;
    }
}
