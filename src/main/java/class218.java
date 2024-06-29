import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class218 extends class274 implements class251 {

    @OriginalMember(owner = "client!s", name = "n", descriptor = "Lgk;")
    private class616 field2620 = new class616();

    @OriginalMember(owner = "client!s", name = "o", descriptor = "Ll;")
    private class172 field2621;

    @OriginalMember(owner = "client!s", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!s", name = "SA", descriptor = "(Ll;Lm;II[[I[[IIII)V")
    private final native void method1271(class172 arg0, class109 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)V")
    public final native void method379(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "UA", descriptor = "(Z)V")
    public final native void method484(boolean arg0);

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Ll;Lm;II[[I[[IIII)V")
    public class218(class172 arg0, class109 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6, arg4);
        this.field2621 = arg0;
        this.method1271(this.field2621, arg1, arg2, arg3, super.field3423, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!s", name = "E", descriptor = "(Lha;IIIIZ)V")
    public final native void method390(class120 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public final void method383(int arg0, int arg1) {
        this.field2621.method935().method1075(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Leq;[I)V")
    public final void method381(class670 arg0, int[] arg1) {
        this.field2620.method3425(arg0, false);
        this.method1273(arg0.hashCode(), arg0.method3711(1795643394), arg0.method3703((byte) -29), arg0.method3706((byte) 119), arg0.method3708((byte) 83), arg0.method3710(false), arg1);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZ)V")
    public final void method376(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        int var6 = 0;
        float[] var7 = new float[this.field2620.method3429((byte) -88)];
        for (class670 var8 = (class670) this.field2620.method3434((byte) 2); var8 != null; var8 = (class670) this.field2620.method3430(true)) {
            var7[var6++] = var8.method3704((byte) -94);
        }
        this.method1272(var7);
        for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
            for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
                if (arg3[var9][var10]) {
                    int var11 = arg0 - arg2 + var9;
                    int var12 = arg1 - arg2 + var10;
                    if (var11 >= 0 && var11 < super.field3428 && var12 >= 0 && var12 < super.field3426) {
                        this.method383(var11, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method387(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class402.method2265(-64, this);
        }
    }

    @OriginalMember(owner = "client!s", name = "v", descriptor = "(IILha;)Lha;")
    public final native class120 method388(int arg0, int arg1, class120 arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method391(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method387(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!s", name = "BA", descriptor = "()V")
    public final native void method392();

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "([F)V")
    private final native void method1272(float[] arg0);

    @OriginalMember(owner = "client!s", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public final native void method385(class120 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "VA", descriptor = "(IIIIII[I)V")
    private final native void method1273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field2621.method935().method1084(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public final void method380(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public final boolean method389(class120 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }
}
