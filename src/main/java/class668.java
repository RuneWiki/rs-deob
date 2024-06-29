import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class668 extends class281 implements class533 {

    @OriginalMember(owner = "client!t", name = "k", descriptor = "Lkba;")
    private class108 field9283 = new class108();

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    private int field9285 = -1;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Loa;")
    private class694 field9284;

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field9284.method3918().method3505(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!t", name = "V", descriptor = "(IIIIII[I)V")
    private final native void method3762(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!t", name = "ga", descriptor = "(Loa;Lya;II[[I[[IIII)V")
    private final native void method3763(class694 arg0, class53 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1541(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.field9285 = arg5;
        int var8 = 0;
        float[] var9 = new float[this.field9283.method730(0)];
        for (class551 var10 = (class551) this.field9283.method724(32); var10 != null; var10 = (class551) this.field9283.method723(92)) {
            var9[var8++] = var10.method3131(false);
        }
        this.method3764(var9);
        for (int var11 = 0; var11 < arg2 + arg2; ++var11) {
            for (int var12 = 0; var12 < arg2 + arg2; ++var12) {
                if (arg3[var11][var12]) {
                    int var13 = arg0 - arg2 + var11;
                    int var14 = arg1 - arg2 + var12;
                    if (var13 >= 0 && var13 < super.field3727 && var14 >= 0 && var14 < super.field3728) {
                        this.method1543(var13, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final native void method1529(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!t", name = "fa", descriptor = "(IILr;)Lr;")
    public final native class184 method1540(int arg0, int arg1, class184 arg2);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1548(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.field9285 = -1;
        int var7 = 0;
        float[] var8 = new float[this.field9283.method730(0)];
        for (class551 var9 = (class551) this.field9283.method724(32); var9 != null; var9 = (class551) this.field9283.method723(102)) {
            var8[var7++] = var9.method3131(false);
        }
        this.method3764(var8);
        for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
            for (int var11 = 0; var11 < arg2 + arg2; ++var11) {
                if (arg3[var10][var11]) {
                    int var12 = arg0 - arg2 + var10;
                    int var13 = arg1 - arg2 + var11;
                    if (var12 >= 0 && var12 < super.field3727 && var13 >= 0 && var13 < super.field3728) {
                        this.method1543(var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II)V")
    public final void method1543(int arg0, int arg1) {
        if (this.field9285 < 0) {
            this.field9284.method3918().method3497(this, arg0, arg1);
        } else {
            this.field9284.method3918().method3480(this, arg0, arg1, this.field9285);
        }
    }

    @OriginalMember(owner = "client!t", name = "ka", descriptor = "(III)V")
    public final native void method1528(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method1544(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!t", name = "w", descriptor = "(Z)V")
    public final native void method73(boolean arg0);

    @OriginalMember(owner = "client!t", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final native void method1535(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1530(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method1544(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lcba;[I)V")
    public final void method1538(class551 arg0, int[] arg1) {
        this.field9283.method725(arg0, -20911);
        this.method3762(arg0.hashCode(), arg0.method3130(7019), arg0.method3137((byte) 94), arg0.method3136(28699), arg0.method3133(-14), arg0.method3135((byte) -78), arg1);
    }

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class280.method1680(false, this);
        }
    }

    @OriginalMember(owner = "client!t", name = "q", descriptor = "([F)V")
    private final native void method3764(float[] arg0);

    @OriginalMember(owner = "client!t", name = "YA", descriptor = "()V")
    public final native void method1542();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1534(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Loa;Lya;II[[I[[IIII)V")
    public class668(class694 arg0, class53 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6, arg4);
        this.field9284 = arg0;
        this.method3763(this.field9284, arg1, arg2, arg3, super.field3723, arg5, arg6, arg7, arg8);
    }
}
