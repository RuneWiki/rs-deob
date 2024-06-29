import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class132 extends class206 implements class47 {

    @OriginalMember(owner = "client!b", name = "m", descriptor = "Lvr;")
    private class306 field1911 = new class306();

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Lh;")
    private class161 field1910;

    @OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lh;Lba;II[[I[[IIII)V", line = 3)
    public class132(class161 arg0, class79 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6);
        this.field1910 = arg0;
        this.method856(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)V", line = 8)
    public final void method842(int arg0, int arg1) {
        this.field1910.method1060().method2686(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIII[[Z)V", line = 11)
    public final void method843(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field1910.method1060().method2692(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V", line = 15)
    protected final void finalize() {
        class342.method2198(this, (byte) -50);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 19)
    public final void method845(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method850(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lj;IIIIZ)Z", line = 129)
    public final boolean method847(class229 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ldd;[I)V", line = 140)
    public final void method854(class471 arg0, int[] arg1) {
        this.field1911.method1958(arg0, 0);
        this.method852(arg0.hashCode(), arg0.method2827(23087), arg0.method2825(45), arg0.method2832(15), arg0.method2830(126), arg0.method2833(false), arg1);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III[[ZZ)V", line = 152)
    public final void method858(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        int var6 = 0;
        float[] var7 = new float[this.field1911.method1967(95)];
        for (class471 var8 = (class471) this.field1911.method1970(64); var8 != null; var8 = (class471) this.field1911.method1960(24)) {
            var7[var6++] = var8.method2826(-1);
        }
        this.method846(var7);
    }

    @OriginalMember(owner = "client!b", name = "SA", descriptor = "(Lj;IIIIZ)V")
    public final native void method844(class229 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!b", name = "oa", descriptor = "([F)V")
    private final native void method846(float[] arg0);

    @OriginalMember(owner = "client!b", name = "QA", descriptor = "(III)V")
    public final native void method848(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!b", name = "I", descriptor = "(II)I")
    public final native int method849(int arg0, int arg1);

    @OriginalMember(owner = "client!b", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method850(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!b", name = "f", descriptor = "()V")
    public final native void method851();

    @OriginalMember(owner = "client!b", name = "j", descriptor = "(IIIIII[I)V")
    private final native void method852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!b", name = "va", descriptor = "(II)I")
    public final native int method853(int arg0, int arg1);

    @OriginalMember(owner = "client!b", name = "ya", descriptor = "()V")
    public final native void method218();

    @OriginalMember(owner = "client!b", name = "U", descriptor = "(Lj;IIIIZ)V")
    public final native void method855(class229 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!b", name = "G", descriptor = "(Lh;Lba;II[[I[[IIII)V")
    private final native void method856(class161 arg0, class79 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!b", name = "O", descriptor = "(IILj;)Lj;")
    public final native class229 method857(int arg0, int arg1, class229 arg2);
}
