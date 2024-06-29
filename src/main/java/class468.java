import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public abstract class class468 extends class191 {

    @OriginalMember(owner = "client!fv", name = "t", descriptor = "Lrh;")
    public class478 field6828;

    @OriginalMember(owner = "client!fv", name = "v", descriptor = "I")
    public int field6830;

    @OriginalMember(owner = "client!fv", name = "u", descriptor = "I")
    public int field6829;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
    private static int field6812 = 0;

    @OriginalMember(owner = "client!fv", name = "p", descriptor = "I")
    public static int field6824 = 0;

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
    public static int field6819 = 0;

    @OriginalMember(owner = "client!fv", name = "o", descriptor = "I")
    public static int field6823 = 0;

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "I")
    public static int field6820 = 0;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
    public static int field6811 = 0;

    @OriginalMember(owner = "client!fv", name = "E", descriptor = "I")
    public static int field6839 = 0;

    @OriginalMember(owner = "client!fv", name = "G", descriptor = "I")
    private static int field6841 = 0;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
    public int field6809;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "I")
    private static int field6817;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "I")
    public static int field6821;

    @OriginalMember(owner = "client!fv", name = "n", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!fv", name = "q", descriptor = "I")
    private static int field6825;

    @OriginalMember(owner = "client!fv", name = "r", descriptor = "I")
    private static int field6826;

    @OriginalMember(owner = "client!fv", name = "s", descriptor = "I")
    public int field6827;

    @OriginalMember(owner = "client!fv", name = "w", descriptor = "I")
    public int field6831;

    @OriginalMember(owner = "client!fv", name = "x", descriptor = "I")
    public int field6832;

    @OriginalMember(owner = "client!fv", name = "y", descriptor = "I")
    public static int field6833;

    @OriginalMember(owner = "client!fv", name = "A", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!fv", name = "B", descriptor = "I")
    private static int field6836;

    @OriginalMember(owner = "client!fv", name = "C", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!fv", name = "D", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!fv", name = "F", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!fv", name = "z", descriptor = "[I")
    private int[] field6834;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(FFFFFF)V", line = 20)
    private final void method2789(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field6831 + this.field6830 + this.field6827;
        int var8 = this.field6832 + this.field6829 + this.field6809;
        if (this.field6830 != var7 || this.field6829 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field6832 * var11;
            float var14 = (float) this.field6832 * var12;
            float var15 = (float) this.field6831 * var9;
            float var16 = (float) this.field6831 * var10;
            float var17 = (float) this.field6827 * -var9;
            float var18 = (float) this.field6827 * -var10;
            float var19 = (float) this.field6809 * -var11;
            float var20 = (float) this.field6809 * -var12;
            arg0 += var13 + var15;
            arg1 += var14 + var16;
            arg2 += var13 + var17;
            arg3 += var14 + var18;
            arg4 += var15 + var19;
            arg5 += var16 + var20;
        }
        float var21 = arg2 + arg4 - arg0;
        float var22 = arg5 + arg3 - arg1;
        float var23;
        float var24;
        if (arg0 < arg2) {
            var23 = arg0;
            var24 = arg2;
        } else {
            var23 = arg2;
            var24 = arg0;
        }
        if (arg4 < var23) {
            var23 = arg4;
        }
        if (var21 < var23) {
            var23 = var21;
        }
        if (arg4 > var24) {
            var24 = arg4;
        }
        if (var21 > var24) {
            var24 = var21;
        }
        float var25;
        float var26;
        if (arg1 < arg3) {
            var25 = arg1;
            var26 = arg3;
        } else {
            var25 = arg3;
            var26 = arg1;
        }
        if (arg5 < var25) {
            var25 = arg5;
        }
        if (var22 < var25) {
            var25 = var22;
        }
        if (arg5 > var26) {
            var26 = arg5;
        }
        if (var22 > var26) {
            var26 = var22;
        }
        if (var23 < (float) this.field6828.field6976) {
            var23 = this.field6828.field6976;
        }
        if (var24 > (float) this.field6828.field6985) {
            var24 = this.field6828.field6985;
        }
        if (var25 < (float) this.field6828.field6978) {
            var25 = this.field6828.field6978;
        }
        if (var26 > (float) this.field6828.field6988) {
            var26 = this.field6828.field6988;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field6838 = this.field6828.field6973;
        field6815 = (int) ((float) ((int) var25 * field6838) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field6818 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field6830 / var29);
        field6822 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field6829 / var30);
        field6810 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field6830 / var30);
        field6840 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field6829 / var29);
        field6817 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field6825 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field6835 = (this.field6830 >> 1 << 12) + (field6825 * field6810 >> 4);
        field6833 = (this.field6829 >> 1 << 12) + (field6840 * field6825 >> 4);
        field6814 = field6818 * field6817 >> 4;
        field6837 = field6822 * field6817 >> 4;
        field6836 = (int) var23;
        field6816 = (int) var27;
        field6826 = (int) var25;
        field6813 = (int) var28;
    }

    @OriginalMember(owner = "client!fv", name = "UA", descriptor = "()I", line = 160)
    public final int method220() {
        return this.field6830;
    }

    @OriginalMember(owner = "client!fv", name = "ja", descriptor = "()I", line = 172)
    public final int method209() {
        return this.field6831 + this.field6830 + this.field6827;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(FFFFFFLea;II)V", line = 185)
    public final void method213(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class15 arg6, int arg7, int arg8) {
        if (this.field6828.method2869()) {
            throw new IllegalStateException();
        }
        this.method2789(arg0, arg1, arg2, arg3, arg4, arg5);
        class129 var10 = (class129) arg6;
        this.method33(var10.field1819, var10.field1821, field6836 - arg7, -arg8 - (field6813 - field6826));
    }

    @OriginalMember(owner = "client!fv", name = "qa", descriptor = "()I", line = 202)
    public final int method214() {
        return this.field6829;
    }

    @OriginalMember(owner = "client!fv", name = "D", descriptor = "(IIIIIII)V", line = 207)
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field6828.method2869()) {
            throw new IllegalStateException();
        }
        if (this.field6834 == null) {
            this.field6834 = new int[4];
        }
        this.field6828.method1048(this.field6834);
        this.field6828.method1110(this.field6828.field6976, this.field6828.field6978, arg0 + arg2, arg1 + arg3);
        int var8 = this.method209();
        int var9 = this.method219();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method32(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field6828.method1046(this.field6834[0], this.field6834[1], this.field6834[2], this.field6834[3]);
    }

    @OriginalMember(owner = "client!fv", name = "ka", descriptor = "(IIII)V", line = 245)
    public final void method221(int arg0, int arg1, int arg2, int arg3) {
        this.field6831 = arg0;
        this.field6832 = arg1;
        this.field6827 = arg2;
        this.field6809 = arg3;
    }

    @OriginalMember(owner = "client!fv", name = "JA", descriptor = "()I", line = 251)
    public final int method219() {
        return this.field6832 + this.field6829 + this.field6809;
    }

    @OriginalMember(owner = "client!fv", name = "aa", descriptor = "(FFFFFFIII)V", line = 262)
    public final void method217(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field6828.method2869()) {
            throw new IllegalStateException();
        }
        this.method2789(arg0, arg1, arg2, arg3, arg4, arg5);
        field6821 = arg7;
        if (arg6 != 1) {
            field6820 = arg7 >>> 24;
            field6839 = 256 - field6820;
            if (arg6 == 0) {
                field6823 = (arg7 & 0xFF0000) >> 16;
                field6819 = (arg7 & 0xFF00) >> 8;
                field6811 = arg7 & 0xFF;
            } else if (arg6 == 2) {
                field6841 = arg7 >>> 24;
                field6812 = 256 - field6841;
                int var10 = (arg7 & 0xFF00FF) * field6812 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field6812 & 0xFF0000;
                field6824 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 1) {
            if (arg8 == 0) {
                this.method29(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method29(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method29(1, 2);
                return;
            }
        } else if (arg6 == 0) {
            if (arg8 == 0) {
                this.method29(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method29(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method29(0, 2);
                return;
            }
        } else if (arg6 == 3) {
            if (arg8 == 0) {
                this.method29(3, 0);
                return;
            }
            if (arg8 == 1) {
                this.method29(3, 1);
                return;
            }
            if (arg8 == 2) {
                this.method29(3, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method29(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method29(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method29(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lrh;II)V", line = 361)
    public class468(class478 arg0, int arg1, int arg2) {
        this.field6828 = arg0;
        this.field6830 = arg1;
        this.field6829 = arg2;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "([I[III)V")
    public abstract void method33(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fv", name = "M", descriptor = "(IIIIIII)V")
    public abstract void method34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!fv", name = "YA", descriptor = "(IIIII)V")
    public abstract void method32(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IILea;II)V")
    public abstract void method30(int arg0, int arg1, class15 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(II)V")
    public abstract void method29(int arg0, int arg1);
}
