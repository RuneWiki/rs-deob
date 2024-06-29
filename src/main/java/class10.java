import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class10 extends class253 {

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "Z")
    private boolean field127 = false;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    private int field135 = 0;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    private int field150 = -32768;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    private int field161 = 0;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    private int field160 = -1;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public int field137;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    public int field146;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public int field143;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public int field138;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    private int field163;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
    private int field145;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
    private int field148;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
    public int field158;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
    private int field149;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    private int field140;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    private int field154;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "Loh;")
    private class281 field134;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "S")
    public static short field129 = 1;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "Lka;")
    public static class104 field132 = new class104(5000);

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "D")
    private double field128;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "D")
    private double field136;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "D")
    private double field141;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "D")
    public double field144;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "D")
    public double field151;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "D")
    public double field155;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "D")
    private double field157;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "D")
    private double field162;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public int field130;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    private int field159;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "Lvh;")
    private class64 field156;

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 252)
    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field137 = arg1;
        this.field146 = arg10;
        this.field143 = arg6;
        this.field138 = arg9;
        this.field163 = arg8;
        this.field145 = arg0;
        this.field148 = arg4;
        this.field158 = arg5;
        this.field127 = false;
        this.field149 = arg3;
        this.field140 = arg7;
        this.field154 = arg2;
        int var12 = class112.method831(this.field145, true).field4117;
        if (var12 == -1) {
            this.field134 = null;
        } else {
            this.field134 = class133.method948(var12, (byte) 33);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII)V", line = 24)
    public final void method71(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field139++;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)Lwi;", line = 34)
    private final class221 method72(int arg0) {
        field142++;
        class265 var2 = class112.method831(this.field145, true);
        class221 var3 = var2.method1809(this.field160, 2, this.field135, this.field161);
        if (var3 == null) {
            return null;
        }
        var3.method204(this.field159);
        if (arg0 > -108) {
            this.field136 = -1.4003197972551564D;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(BI)I", line = 60)
    public static final int method73(byte arg0, int arg1) {
        int var8 = arg1 - 1;
        int var2 = var8 | var8 >>> 1;
        field131++;
        int var3 = var2 | var2 >>> 2;
        int var4 = 31 / ((arg0 - 62) / 57);
        int var5 = var3 | var3 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return var7 + 1;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V", line = 76)
    public final void method74(int arg0, int arg1) {
        this.field151 += (double) arg1 * this.field162;
        this.field144 += (double) arg1 * this.field136;
        if (this.field140 == -1) {
            this.field155 += (double) arg1 * this.field128;
        } else {
            this.field155 += this.field141 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field128;
            this.field128 += (double) arg1 * this.field141;
        }
        this.field127 = true;
        field133++;
        if (arg0 < 98) {
            return;
        }
        this.field130 = (int) (Math.atan2(this.field136, this.field162) * 325.949D) + 1024 & 0x7FF;
        this.field159 = (int) (Math.atan2(this.field128, this.field157) * 325.949D) & 0x7FF;
        if (this.field134 == null) {
            return;
        }
        this.field135 += arg1;
        while (true) {
            do {
                do {
                    if (this.field134.field4322[this.field161] >= this.field135) {
                        return;
                    }
                    this.field135 -= this.field134.field4322[this.field161];
                    this.field161++;
                    if (this.field161 >= this.field134.field4326.length) {
                        this.field161 -= this.field134.field4337;
                        if (this.field161 < 0 || this.field134.field4326.length <= this.field161) {
                            this.field161 = 0;
                        }
                    }
                    this.field160 = this.field161 + 1;
                } while (this.field134.field4326.length > this.field160);
                this.field160 -= this.field134.field4337;
            } while (this.field160 >= 0 && this.field134.field4326.length > this.field160);
            this.field160 = -1;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIIIJILvh;)V", line = 137)
    public final void method75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class64 arg10) {
        field152++;
        class221 var13 = this.method72(-110);
        if (var13 != null) {
            var13.method75(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field156);
            this.field150 = var13.method76();
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()I", line = 153)
    public final int method76() {
        field147++;
        return this.field150;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V", line = 168)
    public static void method77(int arg0) {
        field132 = null;
        int var1 = 40 / ((arg0 + 9) / 43);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(III)J", line = 187)
    public static final long method78(int arg0, int arg1, int arg2) {
        class142 var3 = class256.field4013[arg0][arg1][arg2];
        return var3 == null || var3.field2213 == null ? 0L : var3.field2213.field1602;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIB)V", line = 198)
    public final void method79(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (!this.field127) {
            double var6 = (double) (arg1 - this.field154);
            double var8 = (double) (arg3 - this.field149);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field144 = (double) this.field163 * var6 / var10 + (double) this.field154;
            this.field151 = (double) this.field163 * var8 / var10 + (double) this.field149;
            this.field155 = (double) this.field148;
        }
        if (arg4 != 89) {
            return;
        }
        double var12 = (double) (this.field143 + 1 - arg0);
        this.field136 = ((double) arg1 - this.field144) / var12;
        field153++;
        this.field162 = ((double) arg3 - this.field151) / var12;
        this.field157 = Math.sqrt(this.field162 * this.field162 + this.field136 * this.field136);
        if (this.field140 == -1) {
            this.field128 = ((double) arg2 - this.field155) / var12;
        } else {
            if (!this.field127) {
                this.field128 = -this.field157 * Math.tan((double) this.field140 * 0.02454369D);
            }
            this.field141 = ((double) arg2 - this.field155 - (this.field128 * var12)) * 2.0D / (var12 * var12);
        }
    }
}
