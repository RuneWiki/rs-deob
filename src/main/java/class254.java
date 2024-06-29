import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class254 extends class37 implements class199 {

    @OriginalMember(owner = "client!s", name = "q", descriptor = "Loe;")
    private class183 field3458 = new class183();

    @OriginalMember(owner = "client!s", name = "r", descriptor = "Ll;")
    private class18 field3459;

    @OriginalMember(owner = "client!s", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!s", name = "BA", descriptor = "()V")
    public final native void method432();

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public final void method435(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field3459.method282().method1364(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZ)V")
    public final void method436(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        int var6 = 0;
        float[] var7 = new float[this.field3458.method1142(-22382)];
        for (class530 var8 = (class530) this.field3458.method1132((byte) 126); var8 != null; var8 = (class530) this.field3458.method1134(8446)) {
            var7[var6++] = var8.method3117(false);
        }
        this.method1552(var7);
        for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
            for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
                if (arg3[var9][var10]) {
                    int var11 = arg0 - arg2 + var9;
                    int var12 = arg1 - arg2 + var10;
                    if (var11 >= 0 && var11 < super.field702 && var12 >= 0 && var12 < super.field706) {
                        this.method424(var11, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)V")
    public final native void method434(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method425(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        boolean var18 = false;
        if (arg9 != null) {
            int[] var19 = arg9;
            for (int var20 = 0; var20 < var19.length; ++var20) {
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
        int[] var28 = arg10 != null ? new int[var22 * 3] : null;
        int[] var29 = arg3 != null ? new int[var22 * 3] : null;
        int[] var30 = arg5 != null ? new int[var22 * 3] : null;
        int var31 = 0;
        for (int var32 = 0; var32 < var22; ++var32) {
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
            ++var31;
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
            ++var31;
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
            ++var31;
        }
        if (var18 || var28 != null) {
            this.method431(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!s", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class542.method3175(this, 0);
        }
    }

    @OriginalMember(owner = "client!s", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public final native void method430(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lul;[I)V")
    public final void method426(class530 arg0, int[] arg1) {
        this.field3458.method1129(arg0, 262144);
        this.method1554(arg0.hashCode(), arg0.method3118(34037), arg0.method3119(3553), arg0.method3115(-30190), arg0.method3122(-11184), arg0.method3120(true), arg1);
    }

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "([F)V")
    private final native void method1552(float[] arg0);

    @OriginalMember(owner = "client!s", name = "E", descriptor = "(Lha;IIIIZ)V")
    public final native void method429(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "v", descriptor = "(IILha;)Lha;")
    public final native class54 method423(int arg0, int arg1, class54 arg2);

    @OriginalMember(owner = "client!s", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method431(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public final boolean method427(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!s", name = "SA", descriptor = "(Ll;Lm;II[[I[[IIII)V")
    private final native void method1553(class18 arg0, class174 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!s", name = "VA", descriptor = "(IIIIII[I)V")
    private final native void method1554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!s", name = "UA", descriptor = "(Z)V")
    public final native void method221(boolean arg0);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public final void method424(int arg0, int arg1) {
        this.field3459.method282().method1362(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Ll;Lm;II[[I[[IIII)V")
    public class254(class18 arg0, class174 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6, arg4);
        this.field3459 = arg0;
        this.method1553(this.field3459, arg1, arg2, arg3, super.field700, arg5, arg6, arg7, arg8);
    }
}
