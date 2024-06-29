import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public abstract class class44 extends class52 {

    @OriginalMember(owner = "client!wba", name = "v", descriptor = "Let;")
    public class511 field840;

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "I")
    public int field823;

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "I")
    public int field820;

    @OriginalMember(owner = "client!wba", name = "f", descriptor = "I")
    public static int field824 = 0;

    @OriginalMember(owner = "client!wba", name = "g", descriptor = "I")
    public static int field825 = 0;

    @OriginalMember(owner = "client!wba", name = "n", descriptor = "I")
    public static int field832 = 0;

    @OriginalMember(owner = "client!wba", name = "u", descriptor = "I")
    public static int field839 = 0;

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "I")
    private static int field821 = 0;

    @OriginalMember(owner = "client!wba", name = "D", descriptor = "I")
    private static int field848 = 0;

    @OriginalMember(owner = "client!wba", name = "z", descriptor = "I")
    public static int field844 = 0;

    @OriginalMember(owner = "client!wba", name = "C", descriptor = "I")
    public static int field847 = 0;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "I")
    private static int field819;

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!wba", name = "h", descriptor = "I")
    private static int field826;

    @OriginalMember(owner = "client!wba", name = "i", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!wba", name = "j", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!wba", name = "k", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!wba", name = "l", descriptor = "I")
    public int field830;

    @OriginalMember(owner = "client!wba", name = "m", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!wba", name = "o", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!wba", name = "p", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!wba", name = "q", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!wba", name = "r", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!wba", name = "s", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!wba", name = "t", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!wba", name = "w", descriptor = "I")
    public int field841;

    @OriginalMember(owner = "client!wba", name = "x", descriptor = "I")
    private static int field842;

    @OriginalMember(owner = "client!wba", name = "A", descriptor = "I")
    public int field845;

    @OriginalMember(owner = "client!wba", name = "B", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!wba", name = "E", descriptor = "I")
    private static int field849;

    @OriginalMember(owner = "client!wba", name = "F", descriptor = "I")
    public int field850;

    @OriginalMember(owner = "client!wba", name = "G", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!wba", name = "y", descriptor = "[I")
    private int[] field843;

    @OriginalMember(owner = "client!wba", name = "EA", descriptor = "()I")
    public final int method419() {
        return this.field845 + this.field823 + this.field830;
    }

    @OriginalMember(owner = "client!wba", name = "KA", descriptor = "(IIII)V")
    public final void method420(int arg0, int arg1, int arg2, int arg3) {
        this.field845 = arg0;
        this.field850 = arg1;
        this.field830 = arg2;
        this.field841 = arg3;
    }

    @OriginalMember(owner = "client!wba", name = "DA", descriptor = "(IIIII)V")
    public abstract void method421(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wba", name = "la", descriptor = "()I")
    public final int method422() {
        return this.field820;
    }

    @OriginalMember(owner = "client!wba", name = "ra", descriptor = "(IIIIIII)V")
    public abstract void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!wba", name = "CA", descriptor = "(FFFFFFIII)V")
    public final void method424(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field840.method2951()) {
            throw new IllegalStateException();
        } else if (this.method430(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field836 = arg7;
            if (arg6 != 1) {
                field847 = arg7 >>> 24;
                field832 = 256 - field847;
                if (arg6 == 0) {
                    field844 = (arg7 & 0xFF0000) >> 16;
                    field824 = (arg7 & 0xFF00) >> 8;
                    field825 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field821 = arg7 >>> 24;
                    field848 = 256 - field821;
                    int var10 = (arg7 & 0xFF00FF) * field848 & 0xFF00FF00;
                    int var11 = (arg7 & 0xFF00) * field848 & 0xFF0000;
                    field839 = (var10 | var11) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method425(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method425(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method425(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method425(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method425(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method425(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method425(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method425(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method425(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method425(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method425(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method425(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(II)V")
    public abstract void method425(int arg0, int arg1);

    @OriginalMember(owner = "client!wba", name = "i", descriptor = "(IIIIIII)V")
    public final void method426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field840.method2951()) {
            throw new IllegalStateException();
        }
        if (this.field843 == null) {
            this.field843 = new int[4];
        }
        this.field840.method1350(this.field843);
        this.field840.method1303(this.field840.field7165, this.field840.field7160, arg0 + arg2, arg1 + arg3);
        int var8 = this.method419();
        int var9 = this.method432();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method421(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field840.method1308(this.field843[0], this.field843[1], this.field843[2], this.field843[3]);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "([I[III)V")
    public abstract void method427(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(FFFFFFLpa;II)V")
    public final void method428(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class310 arg6, int arg7, int arg8) {
        if (this.field840.method2951()) {
            throw new IllegalStateException();
        } else if (this.method430(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class491 var10 = (class491) arg6;
            this.method427(var10.field6873, var10.field6874, field849 - arg7, -arg8 - (field846 - field826));
        }
    }

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "()I")
    public final int method429() {
        return this.field823;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(FFFFFF)Z")
    private final boolean method430(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field845 + this.field823 + this.field830;
        int var8 = this.field850 + this.field820 + this.field841;
        if (this.field823 != var7 || this.field820 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field850 * var11;
            float var14 = (float) this.field850 * var12;
            float var15 = (float) this.field845 * var9;
            float var16 = (float) this.field845 * var10;
            float var17 = (float) this.field830 * -var9;
            float var18 = (float) this.field830 * -var10;
            float var19 = (float) this.field841 * -var11;
            float var20 = (float) this.field841 * -var12;
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
        if (var23 < (float) this.field840.field7165) {
            var23 = this.field840.field7165;
        }
        if (var24 > (float) this.field840.field7170) {
            var24 = this.field840.field7170;
        }
        if (var25 < (float) this.field840.field7160) {
            var25 = this.field840.field7160;
        }
        if (var26 > (float) this.field840.field7173) {
            var26 = this.field840.field7173;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field835 = this.field840.field7182;
        field834 = (int) ((float) ((int) var25 * field835) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field838 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field823 / var29);
        field828 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field820 / var30);
        field827 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field823 / var30);
        field831 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field820 / var29);
        field842 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field819 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field833 = (this.field823 >> 1 << 12) + (field827 * field819 >> 4);
        field822 = (this.field820 >> 1 << 12) + (field831 * field819 >> 4);
        field829 = field842 * field838 >> 4;
        field837 = field842 * field828 >> 4;
        field849 = (int) var23;
        field851 = (int) var27;
        field826 = (int) var25;
        field846 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IILpa;II)V")
    public abstract void method431(int arg0, int arg1, class310 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wba", name = "ma", descriptor = "()I")
    public final int method432() {
        return this.field850 + this.field820 + this.field841;
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Let;II)V")
    public class44(class511 arg0, int arg1, int arg2) {
        this.field840 = arg0;
        this.field823 = arg1;
        this.field820 = arg2;
    }
}
