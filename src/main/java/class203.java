import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class203 extends class542 implements class438 {

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Lfea;")
    private class47 field2857 = new class47();

    @OriginalMember(owner = "client!s", name = "i", descriptor = "La;")
    private class326 field2856;

    @OriginalMember(owner = "client!s", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!s", name = "ya", descriptor = "(Lk;IIIIZ)V")
    public final native void method696(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "(III)V")
    public final native void method699(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Luca;[I)V")
    public final void method687(class637 arg0, int[] arg1) {
        this.field2857.method414(arg0, (byte) 21);
        this.method1307(arg0.hashCode(), arg0.method3681(-27102), arg0.method3682(false), arg0.method3677(-26984), arg0.method3683(0), arg0.method3679(1705), arg1);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method686(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method698(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!s", name = "N", descriptor = "()V")
    public final native void method701();

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lk;IIIIZ)Z")
    public final boolean method690(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!s", name = "aa", descriptor = "(II)I")
    public final native int method695(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "NA", descriptor = "(Z)V")
    public final native void method810(boolean arg0);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZ)V")
    public final void method691(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        int var6 = 0;
        float[] var7 = new float[this.field2857.method419(72)];
        for (class637 var8 = (class637) this.field2857.method427(true); var8 != null; var8 = (class637) this.field2857.method420(false)) {
            var7[var6++] = var8.method3678(-23151);
        }
        this.method1306(var7);
    }

    @OriginalMember(owner = "client!s", name = "HA", descriptor = "(La;Lc;II[[I[[IIII)V")
    private final native void method1305(class326 arg0, class618 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!s", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method698(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "ba", descriptor = "(II)I")
    public final native int method694(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "X", descriptor = "(IILk;)Lk;")
    public final native class88 method692(int arg0, int arg1, class88 arg2);

    @OriginalMember(owner = "client!s", name = "F", descriptor = "(Lk;IIIIZ)V")
    public final native void method697(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "FA", descriptor = "([F)V")
    private final native void method1306(float[] arg0);

    @OriginalMember(owner = "client!s", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class124.method989(-127, this);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public final void method693(int arg0, int arg1) {
        this.field2856.method2024().method3124(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(La;Lc;II[[I[[IIII)V")
    public class203(class326 arg0, class618 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6);
        this.field2856 = arg0;
        this.method1305(this.field2856, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!s", name = "L", descriptor = "(IIIIII[I)V")
    private final native void method1307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method688(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field2856.method2024().method3122(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }
}
