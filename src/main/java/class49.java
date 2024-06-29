import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class class49 extends class385 {

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "Lfu;")
    public class171 field811;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public int field810;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public int field802;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field789 = 0;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field792 = 0;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field800 = 0;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    private static int field806 = 0;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    public static int field807 = 0;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public static int field809 = 0;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    private static int field786 = 0;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field787 = 0;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public int field791;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    private static int field793;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public int field801;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    private static int field804;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
    public int field808;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
    public int field815;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    private static int field817;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
    private static int field818;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "[I")
    private int[] field790;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)V")
    public abstract void method381(int arg0, int arg1);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "()I")
    public final int method382() {
        return this.field810 + this.field791 + this.field801;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIII)V")
    public final void method383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field811.method1089()) {
            throw new IllegalStateException();
        }
        if (this.field790 == null) {
            this.field790 = new int[4];
        }
        this.field811.method1077(this.field790);
        this.field811.method1117(this.field811.field2510, this.field811.field2531, arg0 + arg2, arg1 + arg3);
        int var8 = this.method382();
        int var9 = this.method389();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method385(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field811.method1094(this.field790[0], this.field790[1], this.field790[2], this.field790[3]);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIII)V")
    public abstract void method385(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([I[III)V")
    public abstract void method386(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method387(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field811.method1089()) {
            throw new IllegalStateException();
        }
        this.method390(arg0, arg1, arg2, arg3, arg4, arg5);
        field805 = arg7;
        if (arg6 != 0) {
            field789 = arg7 >>> 24;
            field792 = 256 - field789;
            if (arg6 == 1) {
                field807 = (arg7 & 0xFF0000) >> 16;
                field800 = (arg7 & 0xFF00) >> 8;
                field787 = arg7 & 0xFF;
            } else {
                field806 = arg7 >>> 24;
                field786 = 256 - field806;
                int var10 = (arg7 & 0xFF00FF) * field786 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field786 & 0xFF0000;
                field809 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 0) {
            if (arg8 == 0) {
                this.method381(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method381(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method381(0, 2);
                return;
            }
        } else if (arg6 == 1) {
            if (arg8 == 0) {
                this.method381(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method381(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method381(1, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method381(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method381(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method381(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "()I")
    public final int method388() {
        return this.field810;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "()I")
    public final int method389() {
        return this.field808 + this.field802 + this.field815;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(FFFFFF)V")
    private final void method390(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field810 + this.field791 + this.field801;
        int var8 = this.field808 + this.field802 + this.field815;
        if (this.field810 != var7 || this.field802 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field808 * var11;
            float var14 = (float) this.field808 * var12;
            float var15 = (float) this.field791 * var9;
            float var16 = (float) this.field791 * var10;
            float var17 = (float) this.field801 * -var9;
            float var18 = (float) this.field801 * -var10;
            float var19 = (float) this.field815 * -var11;
            float var20 = (float) this.field815 * -var12;
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
        if (var23 < (float) this.field811.field2510) {
            var23 = (float) this.field811.field2510;
        }
        if (var24 > (float) this.field811.field2541) {
            var24 = (float) this.field811.field2541;
        }
        if (var25 < (float) this.field811.field2531) {
            var25 = (float) this.field811.field2531;
        }
        if (var26 > (float) this.field811.field2527) {
            var26 = (float) this.field811.field2527;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field803 = this.field811.field2536;
        field794 = (int) ((float) ((int) var25 * field803) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field788 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field810 / var29);
        field816 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field802 / var30);
        field814 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field810 / var30);
        field795 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field802 / var29);
        field817 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field818 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field796 = (this.field810 >> 1 << 12) + (field818 * field814 >> 4);
        field799 = (this.field802 >> 1 << 12) + (field818 * field795 >> 4);
        field812 = field817 * field788 >> 4;
        field813 = field817 * field816 >> 4;
        field804 = (int) var23;
        field797 = (int) var27;
        field793 = (int) var25;
        field798 = (int) var28;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(FFFFFFLvb;II)V")
    public final void method391(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class90 arg6, int arg7, int arg8) {
        if (this.field811.method1089()) {
            throw new IllegalStateException();
        }
        this.method390(arg0, arg1, arg2, arg3, arg4, arg5);
        class259 var10 = (class259) arg6;
        this.method386(var10.field3610, var10.field3615, field804 - arg7, -arg8 - (field798 - field793));
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(IIII)V")
    public final void method392(int arg0, int arg1, int arg2, int arg3) {
        this.field791 = arg0;
        this.field808 = arg1;
        this.field801 = arg2;
        this.field815 = arg3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILvb;II)V")
    public abstract void method393(int arg0, int arg1, class90 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lfu;II)V")
    public class49(class171 arg0, int arg1, int arg2) {
        this.field811 = arg0;
        this.field810 = arg1;
        this.field802 = arg2;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "()I")
    public final int method394() {
        return this.field802;
    }
}
