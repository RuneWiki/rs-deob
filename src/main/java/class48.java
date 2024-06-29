import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class48 extends class136 implements class141 {

    @OriginalMember(owner = "client!ya", name = "m", descriptor = "Lsu;")
    private class192 field707 = new class192();

    @OriginalMember(owner = "client!ya", name = "n", descriptor = "Lda;")
    private class55 field708;

    @OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ya", name = "H", descriptor = "(Z)V")
    public final native void method58(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method266(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!ya", name = "sa", descriptor = "(II)I")
    public final native int method267(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "RA", descriptor = "([F)V")
    private final native void method268(float[] arg0);

    @OriginalMember(owner = "client!ya", name = "T", descriptor = "(IIIIII[I)V")
    private final native void method269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!ya", name = "ba", descriptor = "()V")
    public final native void method270();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(III[[ZZ)V")
    public final void method271(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        int var6 = 0;
        float[] var7 = new float[this.field707.method1276(98)];
        for (class154 var8 = (class154) this.field707.method1270((byte) -25); var8 != null; var8 = (class154) this.field707.method1282(0)) {
            var7[var6++] = var8.method1081(-21);
        }
        this.method268(var7);
    }

    @OriginalMember(owner = "client!ya", name = "EA", descriptor = "(III)V")
    public final native void method272(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ya", name = "JA", descriptor = "(II)I")
    public final native int method273(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field708.method429().method3393(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method275(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method266(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Lda;La;II[[I[[IIII)V")
    public class48(class55 arg0, class566 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6);
        this.field708 = arg0;
        this.method279(this.field708, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lw;IIIIZ)Z")
    public final boolean method276(class271 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Lw;IIIIZ)V")
    public final native void method277(class271 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ya", name = "FA", descriptor = "(Lw;IIIIZ)V")
    public final native void method278(class271 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class373.method2177(this, (byte) -27);
        }
    }

    @OriginalMember(owner = "client!ya", name = "j", descriptor = "(Lda;La;II[[I[[IIII)V")
    private final native void method279(class55 arg0, class566 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II)V")
    public final void method280(int arg0, int arg1) {
        this.field708.method429().method3382(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(IILw;)Lw;")
    public final native class271 method281(int arg0, int arg1, class271 arg2);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lld;[I)V")
    public final void method282(class154 arg0, int[] arg1) {
        this.field707.method1273(arg0, (byte) 122);
        this.method269(arg0.hashCode(), arg0.method1079(-868177151), arg0.method1076(false), arg0.method1074(0), arg0.method1072(2), arg0.method1083(true), arg1);
    }
}
