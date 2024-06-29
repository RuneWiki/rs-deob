import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class49 extends class139 implements class144 {

    @OriginalMember(owner = "client!ya", name = "k", descriptor = "Lgj;")
    private class593 field695 = new class593();

    @OriginalMember(owner = "client!ya", name = "l", descriptor = "Lda;")
    private class57 field696;

    @OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIII[[Z)V", line = 3)
    public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field696.method461().method3444(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Lda;La;II[[I[[IIII)V", line = 9)
    public class49(class57 arg0, class579 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6);
        this.field696 = arg0;
        this.method334(this.field696, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V", line = 23)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class550.method3055((byte) -20, this);
        }
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(III[[ZZ)V", line = 33)
    public final void method201(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        int var6 = 0;
        float[] var7 = new float[this.field695.method3261((byte) -67)];
        for (class65 var8 = (class65) this.field695.method3257(-73); var8 != null; var8 = (class65) this.field695.method3263((byte) -80)) {
            var7[var6++] = var8.method519(true);
        }
        this.method335(var7);
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lw;IIIIZ)Z", line = 49)
    public final boolean method203(class276 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 53)
    public final void method204(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method194(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lpv;[I)V", line = 165)
    public final void method206(class65 arg0, int[] arg1) {
        this.field695.method3265(arg0, (byte) -125);
        this.method336(arg0.hashCode(), arg0.method515((byte) 115), arg0.method516(-18736), arg0.method518((byte) -100), arg0.method522(-114), arg0.method514(108), arg1);
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II)V", line = 171)
    public final void method18(int arg0, int arg1) {
        this.field696.method461().method3441(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!ya", name = "ba", descriptor = "()V")
    public final native void method207();

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(IILw;)Lw;")
    public final native class276 method199(int arg0, int arg1, class276 arg2);

    @OriginalMember(owner = "client!ya", name = "j", descriptor = "(Lda;La;II[[I[[IIII)V")
    private final native void method334(class57 arg0, class579 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ya", name = "EA", descriptor = "(III)V")
    public final native void method209(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ya", name = "RA", descriptor = "([F)V")
    private final native void method335(float[] arg0);

    @OriginalMember(owner = "client!ya", name = "JA", descriptor = "(II)I")
    public final native int method195(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "FA", descriptor = "(Lw;IIIIZ)V")
    public final native void method208(class276 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ya", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method194(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!ya", name = "T", descriptor = "(IIIIII[I)V")
    private final native void method336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!ya", name = "sa", descriptor = "(II)I")
    public final native int method200(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "H", descriptor = "(Z)V")
    public final native void method132(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Lw;IIIIZ)V")
    public final native void method198(class276 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);
}
