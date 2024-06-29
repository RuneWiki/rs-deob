import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class218 extends class35 implements class276 {

    @OriginalMember(owner = "client!b", name = "j", descriptor = "Lug;")
    private class392 field3131 = new class392();

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Lh;")
    private class469 field3132;

    @OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lh;Lba;II[[I[[IIII)V")
    public class218(class469 arg0, class262 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6);
        this.field3132 = arg0;
        this.method1454(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!b", name = "QA", descriptor = "(III)V")
    public final native void method373(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!b", name = "I", descriptor = "(II)I")
    public final native int method376(int arg0, int arg1);

    @OriginalMember(owner = "client!b", name = "j", descriptor = "(IIIIII[I)V")
    private final native void method1453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III[[ZZ)V")
    public final void method375(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        int var6 = 0;
        float[] var7 = new float[this.field3131.method2420(0)];
        for (class462 var8 = (class462) this.field3131.method2427(106); var8 != null; var8 = (class462) this.field3131.method2422(-85)) {
            var7[var6++] = var8.method2748(true);
        }
        this.method1455(var7);
    }

    @OriginalMember(owner = "client!b", name = "va", descriptor = "(II)I")
    public final native int method371(int arg0, int arg1);

    @OriginalMember(owner = "client!b", name = "U", descriptor = "(Lj;IIIIZ)V")
    public final native void method366(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!b", name = "G", descriptor = "(Lh;Lba;II[[I[[IIII)V")
    private final native void method1454(class469 arg0, class262 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)V")
    public final void method365(int arg0, int arg1) {
        this.field3132.method2778().method56(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!b", name = "oa", descriptor = "([F)V")
    private final native void method1455(float[] arg0);

    @OriginalMember(owner = "client!b", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method370(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method367(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method370(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!b", name = "ya", descriptor = "()V")
    public final native void method59();

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lfk;[I)V")
    public final void method378(class462 arg0, int[] arg1) {
        this.field3131.method2417(-120, arg0);
        this.method1453(arg0.hashCode(), arg0.method2752(-25273), arg0.method2746((byte) -58), arg0.method2744(-254), arg0.method2749((byte) -95), arg0.method2750(true), arg1);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lj;IIIIZ)Z")
    public final boolean method369(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!b", name = "SA", descriptor = "(Lj;IIIIZ)V")
    public final native void method364(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!b", name = "f", descriptor = "()V")
    public final native void method362();

    @OriginalMember(owner = "client!b", name = "O", descriptor = "(IILj;)Lj;")
    public final native class377 method372(int arg0, int arg1, class377 arg2);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method374(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field3132.method2778().method64(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class379.method2355(4650, this);
    }
}
