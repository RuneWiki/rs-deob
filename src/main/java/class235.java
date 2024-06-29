import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class235 extends class176 implements class28 {

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Lbu;")
    private class19 field3410 = new class19();

    @OriginalMember(owner = "client!s", name = "f", descriptor = "La;")
    private class530 field3409;

    @OriginalMember(owner = "client!s", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V", line = 3)
    public final void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field3409.method3202().method2962(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lnm;[I)V", line = 6)
    public final void method1236(class405 arg0, int[] arg1) {
        this.field3410.method131(arg0, 0);
        this.method1510(arg0.hashCode(), arg0.method2388((byte) -98), arg0.method2383(2039035457), arg0.method2389(-10161), arg0.method2390(6042), arg0.method2384(630), arg1);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 11)
    public final void method1235(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method1234(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V", line = 121)
    public final void method583(int arg0, int arg1) {
        this.field3409.method3202().method2961(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!s", name = "finalize", descriptor = "()V", line = 128)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class292.method1797(93, this);
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(La;Lc;II[[I[[IIII)V", line = 138)
    public class235(class530 arg0, class160 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6);
        this.field3409 = arg0;
        this.method1508(this.field3409, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZ)V", line = 146)
    public final void method1230(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        int var6 = 0;
        float[] var7 = new float[this.field3410.method127(0)];
        for (class405 var8 = (class405) this.field3410.method124((byte) 42); var8 != null; var8 = (class405) this.field3410.method120(-84)) {
            var7[var6++] = var8.method2382(0);
        }
        this.method1509(var7);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lk;IIIIZ)Z", line = 165)
    public final boolean method1240(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!s", name = "aa", descriptor = "(II)I")
    public final native int method1233(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "HA", descriptor = "(La;Lc;II[[I[[IIII)V")
    private final native void method1508(class530 arg0, class160 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!s", name = "FA", descriptor = "([F)V")
    private final native void method1509(float[] arg0);

    @OriginalMember(owner = "client!s", name = "NA", descriptor = "(Z)V")
    public final native void method63(boolean arg0);

    @OriginalMember(owner = "client!s", name = "X", descriptor = "(IILk;)Lk;")
    public final native class485 method1231(int arg0, int arg1, class485 arg2);

    @OriginalMember(owner = "client!s", name = "N", descriptor = "()V")
    public final native void method1237();

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "(III)V")
    public final native void method1238(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method1234(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "ba", descriptor = "(II)I")
    public final native int method1239(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "ya", descriptor = "(Lk;IIIIZ)V")
    public final native void method1241(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "F", descriptor = "(Lk;IIIIZ)V")
    public final native void method1232(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "L", descriptor = "(IIIIII[I)V")
    private final native void method1510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);
}
