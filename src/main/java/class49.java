import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class49 extends class140 implements class145 {

    @OriginalMember(owner = "client!ya", name = "g", descriptor = "Lws;")
    private class333 field642 = new class333();

    @OriginalMember(owner = "client!ya", name = "f", descriptor = "Lda;")
    private class57 field641;

    @OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lw;IIIIZ)Z", line = 6)
    public final boolean method187(class279 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II)V", line = 17)
    public final void method186(int arg0, int arg1) {
        this.field641.method472().method3489(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIII[[Z)V", line = 23)
    public final void method189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field641.method472().method3495(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V", line = 26)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class368.method2146((byte) -99, this);
        }
    }

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Lda;La;II[[I[[IIII)V", line = 32)
    public class49(class57 arg0, class579 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6);
        this.field641 = arg0;
        this.method290(this.field641, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(III[[ZZ)V", line = 40)
    public final void method195(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        int var6 = 0;
        float[] var7 = new float[this.field642.method1912(16)];
        for (class227 var8 = (class227) this.field642.method1909(true); var8 != null; var8 = (class227) this.field642.method1916((byte) 101)) {
            var7[var6++] = var8.method1368(128);
        }
        this.method291(var7);
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lbj;[I)V", line = 56)
    public final void method198(class227 arg0, int[] arg1) {
        this.field642.method1904(arg0, -50);
        this.method292(arg0.hashCode(), arg0.method1374((byte) 67), arg0.method1373((byte) -39), arg0.method1370((byte) -5), arg0.method1367(13), arg0.method1372(125), arg1);
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 65)
    public final void method203(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method196(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(IILw;)Lw;")
    public final native class279 method199(int arg0, int arg1, class279 arg2);

    @OriginalMember(owner = "client!ya", name = "j", descriptor = "(Lda;La;II[[I[[IIII)V")
    private final native void method290(class57 arg0, class579 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ya", name = "ba", descriptor = "()V")
    public final native void method191();

    @OriginalMember(owner = "client!ya", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method196(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!ya", name = "JA", descriptor = "(II)I")
    public final native int method201(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Lw;IIIIZ)V")
    public final native void method197(class279 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ya", name = "sa", descriptor = "(II)I")
    public final native int method194(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "RA", descriptor = "([F)V")
    private final native void method291(float[] arg0);

    @OriginalMember(owner = "client!ya", name = "H", descriptor = "(Z)V")
    public final native void method57(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "EA", descriptor = "(III)V")
    public final native void method202(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ya", name = "T", descriptor = "(IIIIII[I)V")
    private final native void method292(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!ya", name = "FA", descriptor = "(Lw;IIIIZ)V")
    public final native void method190(class279 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);
}
