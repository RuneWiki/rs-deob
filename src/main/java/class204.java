import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class204 extends class544 implements class439 {

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Lbv;")
    private class568 field2678 = new class568();

    @OriginalMember(owner = "client!s", name = "j", descriptor = "La;")
    private class328 field2679;

    @OriginalMember(owner = "client!s", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(La;Lc;II[[I[[IIII)V")
    public class204(class328 arg0, class619 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6);
        this.field2679 = arg0;
        this.method1307(this.field2679, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "(III)V")
    public final native void method1044(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "N", descriptor = "()V")
    public final native void method1046();

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lww;[I)V")
    public final void method1032(class592 arg0, int[] arg1) {
        this.field2678.method3181(arg0, true);
        this.method1309(arg0.hashCode(), arg0.method3414(232), arg0.method3416(-2), arg0.method3415((byte) 117), arg0.method3420(true), arg0.method3419(101), arg1);
    }

    @OriginalMember(owner = "client!s", name = "HA", descriptor = "(La;Lc;II[[I[[IIII)V")
    private final native void method1307(class328 arg0, class619 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lk;IIIIZ)Z")
    public final boolean method1034(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!s", name = "aa", descriptor = "(II)I")
    public final native int method1040(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "FA", descriptor = "([F)V")
    private final native void method1308(float[] arg0);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1045(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        int var6 = 0;
        float[] var7 = new float[this.field2678.method3176(false)];
        for (class592 var8 = (class592) this.field2678.method3188((byte) -100); var8 != null; var8 = (class592) this.field2678.method3182((byte) -34)) {
            var7[var6++] = var8.method3422(108);
        }
        this.method1308(var7);
    }

    @OriginalMember(owner = "client!s", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class243.method1506(this, 0);
        }
    }

    @OriginalMember(owner = "client!s", name = "L", descriptor = "(IIIIII[I)V")
    private final native void method1309(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!s", name = "X", descriptor = "(IILk;)Lk;")
    public final native class88 method1035(int arg0, int arg1, class88 arg2);

    @OriginalMember(owner = "client!s", name = "ba", descriptor = "(II)I")
    public final native int method1031(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "F", descriptor = "(Lk;IIIIZ)V")
    public final native void method1041(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1047(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method1043(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method885(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field2679.method2031().method3129(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!s", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method1043(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "NA", descriptor = "(Z)V")
    public final native void method503(boolean arg0);

    @OriginalMember(owner = "client!s", name = "ya", descriptor = "(Lk;IIIIZ)V")
    public final native void method1037(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public final void method883(int arg0, int arg1) {
        this.field2679.method2031().method3121(this, arg0, arg1);
    }
}
