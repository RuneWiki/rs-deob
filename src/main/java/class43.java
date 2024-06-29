import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class43 extends class24 implements class416 {

    @OriginalMember(owner = "client!da", name = "k", descriptor = "Lgw;")
    private class118 field868 = new class118();

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Lc;")
    private class125 field867;

    @OriginalMember(owner = "client!da", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lni;[I)V", line = 8)
    public final void method157(class369 arg0, int[] arg1) {
        this.field868.method866((byte) 10, arg0);
        this.method423(arg0.hashCode(), arg0.method2264((byte) -45), arg0.method2262(6), arg0.method2261((byte) 96), arg0.method2260(true), arg0.method2259(127), arg1);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V", line = 14)
    public final void method144(int arg0, int arg1) {
        this.field867.method922().method2621(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lc;Lk;II[[I[[IIII)V", line = 18)
    public class43(class125 arg0, class404 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6);
        this.field867 = arg0;
        this.method424(this.field867, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III[[ZZ)V", line = 24)
    public final void method152(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        int var6 = 0;
        float[] var7 = new float[this.field868.method852(true)];
        for (class369 var8 = (class369) this.field868.method863(-1); var8 != null; var8 = (class369) this.field868.method865(-1)) {
            var7[var6++] = var8.method2258((byte) 120);
        }
        this.method422(var7);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lia;IIIIZ)Z", line = 39)
    public final boolean method154(class424 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V", line = 44)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class493.method2895(this, false);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 56)
    public final void method147(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method151(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII[[Z)V", line = 167)
    public final void method146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field867.method922().method2614(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!da", name = "R", descriptor = "(II)I")
    public final native int method143(int arg0, int arg1);

    @OriginalMember(owner = "client!da", name = "oa", descriptor = "(II)I")
    public final native int method156(int arg0, int arg1);

    @OriginalMember(owner = "client!da", name = "pa", descriptor = "()V")
    public final native void method382();

    @OriginalMember(owner = "client!da", name = "H", descriptor = "(Lia;IIIIZ)V")
    public final native void method150(class424 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!da", name = "ta", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method151(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!da", name = "m", descriptor = "(III)V")
    public final native void method149(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "DA", descriptor = "([F)V")
    private final native void method422(float[] arg0);

    @OriginalMember(owner = "client!da", name = "q", descriptor = "(IILia;)Lia;")
    public final native class424 method153(int arg0, int arg1, class424 arg2);

    @OriginalMember(owner = "client!da", name = "U", descriptor = "()V")
    public final native void method155();

    @OriginalMember(owner = "client!da", name = "la", descriptor = "(IIIIII[I)V")
    private final native void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!da", name = "GA", descriptor = "(Lc;Lk;II[[I[[IIII)V")
    private final native void method424(class125 arg0, class404 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!da", name = "ia", descriptor = "(Lia;IIIIZ)V")
    public final native void method148(class424 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);
}
