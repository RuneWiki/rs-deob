import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class158 extends class38 implements class350 {

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "Lsr;")
    private class167 field2062 = new class167();

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "Lw;")
    private class197 field2063;

    @OriginalMember(owner = "client!fa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
    public final void method211(int arg0, int arg1) {
        this.field2063.method1148().method2459(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!fa", name = "aa", descriptor = "()V")
    public final native void method206();

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "()V")
    public final native void method426();

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method222(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method207(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "(Li;IIIIZ)V")
    public final native void method214(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field2063.method1148().method2464(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Li;IIIIZ)Z")
    public final boolean method212(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!fa", name = "ca", descriptor = "(II)I")
    public final native int method216(int arg0, int arg1);

    @OriginalMember(owner = "client!fa", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method207(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III[[ZZ)V")
    public final void method208(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        int var6 = 0;
        float[] var7 = new float[this.field2062.method978(126)];
        for (class309 var8 = (class309) this.field2062.method970(12); var8 != null; var8 = (class309) this.field2062.method976((byte) 74)) {
            var7[var6++] = var8.method1849(110);
        }
        this.method945(var7);
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lw;Lg;II[[I[[IIII)V")
    public class158(class197 arg0, class108 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6);
        this.field2063 = arg0;
        this.method947(this.field2063, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "([F)V")
    private final native void method945(float[] arg0);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lbn;[I)V")
    public final void method215(class309 arg0, int[] arg1) {
        this.field2062.method975(0, arg0);
        this.method946(arg0.hashCode(), arg0.method1840((byte) 106), arg0.method1841(0), arg0.method1842((byte) 97), arg0.method1845((byte) -98), arg0.method1847(8), arg1);
    }

    @OriginalMember(owner = "client!fa", name = "ba", descriptor = "(Li;IIIIZ)V")
    public final native void method209(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!fa", name = "ua", descriptor = "(II)I")
    public final native int method217(int arg0, int arg1);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIII[I)V")
    private final native void method946(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "(Lw;Lg;II[[I[[IIII)V")
    private final native void method947(class197 arg0, class108 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!fa", name = "OA", descriptor = "(IILi;)Li;")
    public final native class31 method221(int arg0, int arg1, class31 arg2);

    @OriginalMember(owner = "client!fa", name = "qa", descriptor = "(III)V")
    public final native void method210(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class269.method1636(this, true);
        }
    }
}
