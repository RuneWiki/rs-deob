import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class42 extends class23 implements class415 {

    @OriginalMember(owner = "client!da", name = "k", descriptor = "Lps;")
    private class63 field615 = new class63();

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Lc;")
    private class124 field616;

    @OriginalMember(owner = "client!da", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!da", name = "ta", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method216(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method221(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method216(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III[[ZZ)V")
    public final void method213(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        int var6 = 0;
        float[] var7 = new float[this.field615.method446(4090)];
        for (class28 var8 = (class28) this.field615.method445(33); var8 != null; var8 = (class28) this.field615.method451(false)) {
            var7[var6++] = var8.method253(true);
        }
        this.method342(var7);
    }

    @OriginalMember(owner = "client!da", name = "R", descriptor = "(II)I")
    public final native int method218(int arg0, int arg1);

    @OriginalMember(owner = "client!da", name = "q", descriptor = "(IILia;)Lia;")
    public final native class423 method215(int arg0, int arg1, class423 arg2);

    @OriginalMember(owner = "client!da", name = "pa", descriptor = "()V")
    public final native void method304();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lia;IIIIZ)Z")
    public final boolean method212(class423 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lbe;[I)V")
    public final void method217(class28 arg0, int[] arg1) {
        this.field615.method453((byte) 110, arg0);
        this.method341(arg0.hashCode(), arg0.method257(-71), arg0.method250((byte) 84), arg0.method255(-7164), arg0.method252(67), arg0.method254(true), arg1);
    }

    @OriginalMember(owner = "client!da", name = "H", descriptor = "(Lia;IIIIZ)V")
    public final native void method223(class423 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!da", name = "oa", descriptor = "(II)I")
    public final native int method222(int arg0, int arg1);

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lc;Lk;II[[I[[IIII)V")
    public class42(class124 arg0, class403 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6);
        this.field616 = arg0;
        this.method340(this.field616, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V")
    public final void method210(int arg0, int arg1) {
        this.field616.method773().method2681(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!da", name = "U", descriptor = "()V")
    public final native void method211();

    @OriginalMember(owner = "client!da", name = "GA", descriptor = "(Lc;Lk;II[[I[[IIII)V")
    private final native void method340(class124 arg0, class403 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field616.method773().method2684(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!da", name = "m", descriptor = "(III)V")
    public final native void method219(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "ia", descriptor = "(Lia;IIIIZ)V")
    public final native void method209(class423 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!da", name = "la", descriptor = "(IIIIII[I)V")
    private final native void method341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!da", name = "DA", descriptor = "([F)V")
    private final native void method342(float[] arg0);

    @OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class93.method626(this, 0);
        }
    }
}
