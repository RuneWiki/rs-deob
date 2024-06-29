import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class337 extends class64 {

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    private int field5147 = 0;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "Z")
    private boolean field5164 = false;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
    private int field5156 = -1;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
    private int field5158 = -32768;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
    private int field5150 = 0;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "Z")
    private boolean field5176 = false;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
    private int field5159;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    public int field5157;

    @OriginalMember(owner = "client!wg", name = "db", descriptor = "I")
    public int field5183;

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
    public int field5175;

    @OriginalMember(owner = "client!wg", name = "eb", descriptor = "I")
    private int field5184;

    @OriginalMember(owner = "client!wg", name = "Z", descriptor = "I")
    private int field5179;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
    private int field5162;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
    private int field5173;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    private int field5145;

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
    public int field5177;

    @OriginalMember(owner = "client!wg", name = "ab", descriptor = "I")
    public int field5180;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "Lbg;")
    private class93 field5163;

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "Li;")
    public static class15 field5169 = new class15(0, 0);

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "D")
    public double field5149;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "D")
    private double field5152;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "D")
    private double field5166;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "D")
    public double field5167;

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "D")
    private double field5168;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "D")
    private double field5170;

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "D")
    private double field5171;

    @OriginalMember(owner = "client!wg", name = "cb", descriptor = "D")
    public double field5182;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
    private int field5155;

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!wg", name = "bb", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!wg", name = "gb", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!wg", name = "hb", descriptor = "I")
    public int field5187;

    @OriginalMember(owner = "client!wg", name = "fb", descriptor = "Lrn;")
    public static class18 field5185;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "Lem;")
    private class273 field5146;

    @OriginalMember(owner = "client!wg", name = "ib", descriptor = "[[[B")
    public static byte[][][] field5188;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V", line = 7)
    public final void method2364(int arg0, int arg1) {
        if (this.field5179 == -1) {
            this.field5149 += (double) arg1 * this.field5171;
        } else {
            this.field5149 += this.field5166 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field5171;
            this.field5171 += (double) arg1 * this.field5166;
        }
        this.field5167 += (double) arg1 * this.field5152;
        this.field5182 += (double) arg1 * this.field5168;
        int var3 = 13 % ((62 - arg0) / 44);
        this.field5176 = true;
        field5178++;
        this.field5187 = (int) (Math.atan2(this.field5168, this.field5152) * 325.949D) + 1024 & 0x7FF;
        this.field5155 = (int) (Math.atan2(this.field5171, this.field5170) * 325.949D) & 0x7FF;
        if (this.field5163 == null) {
            return;
        }
        this.field5147 += arg1;
        while (true) {
            do {
                do {
                    if (this.field5147 <= this.field5163.field1429[this.field5150]) {
                        return;
                    }
                    this.field5147 -= this.field5163.field1429[this.field5150];
                    this.field5150++;
                    if (this.field5150 >= this.field5163.field1428.length) {
                        this.field5150 -= this.field5163.field1430;
                        if (this.field5150 < 0 || this.field5150 >= this.field5163.field1428.length) {
                            this.field5150 = 0;
                        }
                    }
                    this.field5156 = this.field5150 + 1;
                } while (this.field5156 < this.field5163.field1428.length);
                this.field5156 -= this.field5163.field1430;
            } while (this.field5156 >= 0 && this.field5156 < this.field5163.field1428.length);
            this.field5156 = -1;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V", line = 60)
    public static void method2365(int arg0) {
        field5188 = (byte[][][]) null;
        field5169 = null;
        field5185 = null;
        if (arg0 >= -101) {
            method2370((byte) 3, 41);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIII)V", line = 72)
    public final void method32(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5161++;
        if (!this.field5164) {
            class52 var6 = this.method2366(false);
            if (var6 == null) {
                return;
            }
            this.method2368((byte) 54, var6);
        }
        if (this.field5146 != null) {
            this.field5146.method2014(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "()I", line = 100)
    public final int method21() {
        field5154++;
        return this.field5158;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 313)
    public class337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field5159 = arg3;
        this.field5157 = arg6;
        this.field5183 = arg10;
        this.field5175 = arg1;
        this.field5184 = arg0;
        this.field5176 = false;
        this.field5179 = arg7;
        this.field5162 = arg2;
        this.field5173 = arg4;
        this.field5145 = arg8;
        this.field5177 = arg5;
        this.field5180 = arg9;
        int var12 = class292.method2110(this.field5184, (byte) 82).field4343;
        if (var12 == -1) {
            this.field5163 = null;
        } else {
            this.field5163 = class126.method1091((byte) 11, var12);
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(Z)Lhm;", line = 123)
    private final class52 method2366(boolean arg0) {
        field5151++;
        class281 var2 = class292.method2110(this.field5184, (byte) 90);
        class52 var3 = var2.method2050(this.field5150, this.field5156, (byte) -127, this.field5147);
        if (var3 == null) {
            return null;
        } else {
            var3.method509(this.field5155);
            return arg0 ? (class52) null : var3;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZIIII)V", line = 144)
    public final void method2367(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0) {
            method2365(2);
        }
        field5174++;
        if (!this.field5176) {
            double var6 = (double) (arg2 - this.field5162);
            double var8 = (double) (arg3 - this.field5159);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field5149 = (double) this.field5173;
            this.field5167 = (double) this.field5145 * var8 / var10 + (double) this.field5159;
            this.field5182 = (double) this.field5145 * var6 / var10 + (double) this.field5162;
        }
        double var12 = (double) (this.field5157 + 1 - arg1);
        this.field5152 = ((double) arg3 - this.field5167) / var12;
        this.field5168 = ((double) arg2 - this.field5182) / var12;
        this.field5170 = Math.sqrt(this.field5168 * this.field5168 + this.field5152 * this.field5152);
        if (this.field5179 == -1) {
            this.field5171 = ((double) arg4 - this.field5149) / var12;
        } else {
            if (!this.field5176) {
                this.field5171 = -this.field5170 * Math.tan((double) this.field5179 * 0.02454369D);
            }
            this.field5166 = ((double) arg4 - this.field5149 - this.field5171 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIIIJILem;)V", line = 187)
    public final void method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class273 arg10) {
        field5153++;
        class52 var13 = this.method2366(false);
        if (var13 != null) {
            this.method2368((byte) 54, var13);
            var13.method27(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field5146);
            this.field5158 = var13.method21();
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLhm;)V", line = 205)
    private final void method2368(byte arg0, class52 arg1) {
        field5148++;
        if (class240.field3737) {
            class56 var3 = (class56) arg1;
            if ((this.field5146 == null || this.field5146.field4205) && (var3.field851 != null || var3.field826 != null)) {
                this.field5146 = new class273(class360.field5718, 1, 1);
            }
            if (this.field5146 != null) {
                this.field5146.method2010(var3.field851, var3.field826, false, var3.field844, var3.field857, var3.field842);
            }
        } else {
            class124 var4 = (class124) arg1;
            if ((this.field5146 == null || this.field5146.field4205) && (var4.field2012 != null || var4.field1999 != null)) {
                this.field5146 = new class273(class360.field5718, 1, 1);
            }
            if (this.field5146 != null) {
                this.field5146.method2010(var4.field2012, var4.field1999, false, var4.field2003, var4.field1984, var4.field2023);
            }
        }
        if (arg0 != 54) {
            this.method2367(false, 73, -35, 54, -1);
        }
        this.field5164 = true;
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V", line = 251)
    public static final void method2369(int arg0) {
        class148.field2423.method656(arg0);
        field5160++;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)I", line = 262)
    public static final int method2370(byte arg0, int arg1) {
        field5165++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        if (arg0 == 84) {
            int var7 = var6 | var6 >>> 16;
            return ~var7 & arg1;
        } else {
            return 37;
        }
    }
}
