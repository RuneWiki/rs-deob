import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 extends class47 {

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    private int field61 = -32768;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "Z")
    private boolean field62 = false;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    private int field65 = 0;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    private int field67 = -1;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    private int field60 = 0;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    private int field56;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public int field52;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public int field46;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    private int field50;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public int field53;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
    public int field55;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
    private int field73;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    private int field57;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    private int field71;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
    public int field58;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    private int field64;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "Lqm;")
    private class247 field47;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field42 = 0;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "D")
    private double field41;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "D")
    public double field48;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "D")
    private double field49;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "D")
    private double field51;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "D")
    public double field54;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "D")
    public double field66;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "D")
    private double field69;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "D")
    private double field75;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    private int field45;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    public int field72;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "Lid;")
    private class274 field63;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIIIJILid;)V", line = 32)
    public final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class274 arg10) {
        class201 var13 = this.method10((byte) 112);
        field70++;
        if (var13 != null) {
            var13.method8(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field63);
            this.field61 = var13.method11();
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)V", line = 54)
    public final void method9(byte arg0, int arg1) {
        this.field66 += (double) arg1 * this.field75;
        this.field62 = true;
        field76++;
        this.field48 += (double) arg1 * this.field41;
        if (this.field73 == -1) {
            this.field54 += (double) arg1 * this.field49;
        } else {
            this.field54 += this.field51 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field49;
            this.field49 += (double) arg1 * this.field51;
        }
        this.field72 = (int) (Math.atan2(this.field75, this.field41) * 325.949D) + 1024 & 0x7FF;
        this.field45 = (int) (Math.atan2(this.field49, this.field69) * 325.949D) & 0x7FF;
        if (this.field47 != null) {
            this.field65 += arg1;
            label44: while (true) {
                do {
                    do {
                        if (this.field65 <= this.field47.field3746[this.field60]) {
                            break label44;
                        }
                        this.field65 -= this.field47.field3746[this.field60];
                        this.field60++;
                        if (this.field47.field3734.length <= this.field60) {
                            this.field60 -= this.field47.field3753;
                            if (this.field60 < 0 || this.field47.field3734.length <= this.field60) {
                                this.field60 = 0;
                            }
                        }
                        this.field67 = this.field60 + 1;
                    } while (this.field47.field3734.length > this.field67);
                    this.field67 -= this.field47.field3753;
                } while (this.field67 >= 0 && this.field67 < this.field47.field3734.length);
                this.field67 = -1;
            }
        }
        int var3 = 118 / ((arg0 - 40) / 51);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)Luc;", line = 110)
    private final class201 method10(byte arg0) {
        field68++;
        class159 var2 = class120.method818((byte) 96, this.field50);
        if (arg0 <= 111) {
            this.method8(109, -81, -108, -56, 65, 23, -60, 85, -17L, -61, (class274) null);
        }
        class201 var3 = var2.method1054(this.field67, this.field60, 3899, this.field65);
        if (var3 == null) {
            return null;
        } else {
            var3.method700(this.field45);
            return var3;
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 218)
    public class3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field56 = arg2;
        this.field62 = false;
        this.field52 = arg10;
        this.field46 = arg6;
        this.field50 = arg0;
        this.field53 = arg1;
        this.field55 = arg9;
        this.field73 = arg7;
        this.field57 = arg8;
        this.field71 = arg4;
        this.field58 = arg5;
        this.field64 = arg3;
        int var12 = class120.method818((byte) 96, this.field50).field2205;
        if (var12 == -1) {
            this.field47 = null;
        } else {
            this.field47 = class185.method1289(var12, (byte) 111);
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "()I", line = 141)
    public final int method11() {
        field43++;
        return this.field61;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIII)V", line = 166)
    public final void method12(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field40++;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(IIIII)V", line = 176)
    public final void method13(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field74++;
        if (!this.field62) {
            double var6 = (double) (arg1 - this.field56);
            double var8 = (double) (arg0 - this.field64);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field66 = (double) this.field57 * var6 / var10 + (double) this.field56;
            this.field54 = (double) this.field71;
            this.field48 = (double) this.field57 * var8 / var10 + (double) this.field64;
        }
        double var12 = (double) (this.field46 + 1 - arg2);
        this.field75 = ((double) arg1 - this.field66) / var12;
        this.field41 = ((double) arg0 - this.field48) / var12;
        this.field69 = Math.sqrt(this.field75 * this.field75 + this.field41 * this.field41);
        if (~this.field73 == arg3) {
            this.field49 = ((double) arg4 - this.field54) / var12;
        } else {
            if (!this.field62) {
                this.field49 = -this.field69 * Math.tan((double) this.field73 * 0.02454369D);
            }
            this.field51 = ((double) arg4 - this.field54 - (this.field49 * var12)) * 2.0D / (var12 * var12);
        }
    }
}
