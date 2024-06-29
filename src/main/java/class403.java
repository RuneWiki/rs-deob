import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class403 extends class11 implements class28 {

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "Lnv;")
    private class44 field5958 = new class44();

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "Lw;")
    private class69 field5959;

    @OriginalMember(owner = "client!fa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lw;Lg;II[[I[[IIII)V", line = 7)
    public class403(class69 arg0, class427 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6);
        this.field5959 = arg0;
        this.method2535(this.field5959, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V", line = 13)
    public final void method69(int arg0, int arg1) {
        this.field5959.method576().method483(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Li;IIIIZ)Z", line = 18)
    public final boolean method66(class200 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIII[[Z)V", line = 22)
    public final void method62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field5959.method576().method476(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III[[ZZ)V", line = 27)
    public final void method67(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        int var6 = 0;
        float[] var7 = new float[this.field5958.method297(0)];
        for (class344 var8 = (class344) this.field5958.method295((byte) 115); var8 != null; var8 = (class344) this.field5958.method296(true)) {
            var7[var6++] = var8.method2211(-62);
        }
        this.method2537(var7);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 48)
    public final void method63(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method59(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lrd;[I)V", line = 164)
    public final void method60(class344 arg0, int[] arg1) {
        this.field5958.method292((byte) 121, arg0);
        this.method2536(arg0.hashCode(), arg0.method2214((byte) 114), arg0.method2217(true), arg0.method2216(-1), arg0.method2218(921), arg0.method2212(-1), arg1);
    }

    @OriginalMember(owner = "client!fa", name = "finalize", descriptor = "()V", line = 168)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class45.method300(this, 0);
        }
    }

    @OriginalMember(owner = "client!fa", name = "qa", descriptor = "(III)V")
    public final native void method58(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fa", name = "ua", descriptor = "(II)I")
    public final native int method56(int arg0, int arg1);

    @OriginalMember(owner = "client!fa", name = "OA", descriptor = "(IILi;)Li;")
    public final native class200 method54(int arg0, int arg1, class200 arg2);

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "(Lw;Lg;II[[I[[IIII)V")
    private final native void method2535(class69 arg0, class427 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "(Li;IIIIZ)V")
    public final native void method61(class200 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!fa", name = "aa", descriptor = "()V")
    public final native void method64();

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIII[I)V")
    private final native void method2536(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!fa", name = "ba", descriptor = "(Li;IIIIZ)V")
    public final native void method55(class200 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "()V")
    public final native void method164();

    @OriginalMember(owner = "client!fa", name = "ca", descriptor = "(II)I")
    public final native int method68(int arg0, int arg1);

    @OriginalMember(owner = "client!fa", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method59(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "([F)V")
    private final native void method2537(float[] arg0);
}
