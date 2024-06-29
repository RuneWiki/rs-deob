import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class43 extends class145 implements class105 {

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "Loe;")
    private class137 field557 = new class137();

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Lqa;")
    private class166 field556;

    @OriginalMember(owner = "client!ha", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lba;IIIIZ)Z", line = 5)
    public final boolean method399(class265 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII[[Z)V", line = 8)
    public final void method400(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field556.method1111().method120(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V", line = 11)
    public final void method401(int arg0, int arg1) {
        this.field556.method1111().method110(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 17)
    public final void method403(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        boolean var18 = false;
        if (arg9 != null) {
            int[] var19 = arg9;
            for (int var20 = 0; var20 < var19.length; var20++) {
                int var21 = var19[var20];
                if (var21 != -1) {
                    var18 = true;
                    break;
                }
            }
        }
        int var22 = arg9.length;
        int[] var23 = new int[var22 * 3];
        int[] var24 = new int[var22 * 3];
        int[] var25 = new int[var22 * 3];
        int[] var26 = new int[var22 * 3];
        int[] var27 = new int[var22 * 3];
        int[] var28 = arg10 == null ? null : new int[var22 * 3];
        int[] var29 = arg3 == null ? null : new int[var22 * 3];
        int[] var30 = arg5 == null ? null : new int[var22 * 3];
        int var31 = 0;
        for (int var32 = 0; var32 < var22; var32++) {
            int var33 = arg6[var32];
            int var34 = arg7[var32];
            int var35 = arg8[var32];
            var23[var31] = arg2[var33];
            var24[var31] = arg4[var33];
            var25[var31] = arg9[var32];
            var26[var31] = arg11[var32];
            var27[var31] = arg12[var32];
            if (arg10 != null) {
                var28[var31] = arg10[var32];
            }
            if (arg3 != null) {
                var29[var31] = arg3[var33];
            }
            if (arg5 != null) {
                var30[var31] = arg5[var33];
            }
            var31++;
            var23[var31] = arg2[var34];
            var24[var31] = arg4[var34];
            var25[var31] = arg9[var32];
            var26[var31] = arg11[var32];
            var27[var31] = arg12[var32];
            if (arg10 != null) {
                var28[var31] = arg10[var32];
            }
            if (arg3 != null) {
                var29[var31] = arg3[var34];
            }
            if (arg5 != null) {
                var30[var31] = arg5[var34];
            }
            var31++;
            var23[var31] = arg2[var35];
            var24[var31] = arg4[var35];
            var25[var31] = arg9[var32];
            var26[var31] = arg11[var32];
            var27[var31] = arg12[var32];
            if (arg10 != null) {
                var28[var31] = arg10[var32];
            }
            if (arg3 != null) {
                var29[var31] = arg3[var35];
            }
            if (arg5 != null) {
                var30[var31] = arg5[var35];
            }
            var31++;
        }
        if (var18 || var28 != null) {
            this.method414(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III[[ZZ)V", line = 127)
    public final void method404(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        int var6 = 0;
        float[] var7 = new float[this.field557.method1000((byte) 125)];
        for (class470 var8 = (class470) this.field557.method1004((byte) -80); var8 != null; var8 = (class470) this.field557.method996(1)) {
            var7[var6++] = var8.method2834(124);
        }
        this.method409(var7);
    }

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V", line = 144)
    protected final void finalize() {
        class438.method2701(-22, this);
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lqa;Lna;II[[I[[IIII)V", line = 157)
    public class43(class166 arg0, class35 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6);
        this.field556 = arg0;
        this.method402(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lqp;[I)V", line = 164)
    public final void method415(class470 arg0, int[] arg1) {
        this.field557.method994(arg0, -3610);
        this.method406(arg0.hashCode(), arg0.method2835(-30143), arg0.method2832(false), arg0.method2833((byte) 78), arg0.method2838((byte) -89), arg0.method2836((byte) 54), arg1);
    }

    @OriginalMember(owner = "client!ha", name = "IA", descriptor = "(Lqa;Lna;II[[I[[IIII)V")
    private final native void method402(class166 arg0, class35 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(III)V")
    public final native void method405(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "(IIIIII[I)V")
    private final native void method406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!ha", name = "ca", descriptor = "()V")
    public final native void method407();

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "(IILba;)Lba;")
    public final native class265 method408(int arg0, int arg1, class265 arg2);

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "([F)V")
    private final native void method409(float[] arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Lba;IIIIZ)V")
    public final native void method410(class265 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "(II)I")
    public final native int method411(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I")
    public final native int method412(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "()V")
    public final native void method119();

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "(Lba;IIIIZ)V")
    public final native void method413(class265 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method414(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);
}
