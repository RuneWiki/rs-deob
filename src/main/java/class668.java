import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class668 extends class281 implements class532 {

    @OriginalMember(owner = "client!t", name = "k", descriptor = "Luh;")
    private class168 field9113 = new class168();

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    private int field9115 = -1;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Loa;")
    private class694 field9114;

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1156(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.field9115 = arg5;
        int var8 = 0;
        float[] var9 = new float[this.field9113.method1272(0)];
        for (class669 var10 = (class669) this.field9113.method1269(4); var10 != null; var10 = (class669) this.field9113.method1264((byte) 34)) {
            var9[var8++] = var10.method3756(-37);
        }
        this.method3749(var9);
        for (int var11 = 0; var11 < arg2 + arg2; ++var11) {
            for (int var12 = 0; var12 < arg2 + arg2; ++var12) {
                if (arg3[var11][var12]) {
                    int var13 = arg0 - arg2 + var11;
                    int var14 = arg1 - arg2 + var12;
                    if (var13 >= 0 && var13 < super.field3937 && var14 >= 0 && var14 < super.field3940) {
                        this.method1150(var13, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final native void method1149(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V")
    public final void method1150(int arg0, int arg1) {
        if (this.field9115 < 0) {
            this.field9114.method3882().method3504(this, arg0, arg1);
        } else {
            this.field9114.method3882().method3514(this, arg0, arg1, this.field9115);
        }
    }

    @OriginalMember(owner = "client!t", name = "w", descriptor = "(Z)V")
    public final native void method129(boolean arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1161(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method1159(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lab;[I)V")
    public final void method1158(class669 arg0, int[] arg1) {
        this.field9113.method1273(arg0, -20180);
        this.method3750(arg0.hashCode(), arg0.method3759(-1), arg0.method3757(124), arg0.method3752((byte) 83), arg0.method3758(-1), arg0.method3755(-1), arg1);
    }

    @OriginalMember(owner = "client!t", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final native void method1151(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!t", name = "q", descriptor = "([F)V")
    private final native void method3749(float[] arg0);

    @OriginalMember(owner = "client!t", name = "ka", descriptor = "(III)V")
    public final native void method1155(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Loa;Lya;II[[I[[IIII)V")
    public class668(class694 arg0, class52 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6, arg4);
        this.field9114 = arg0;
        this.method3751(this.field9114, arg1, arg2, arg3, super.field3934, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1154(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!t", name = "V", descriptor = "(IIIIII[I)V")
    private final native void method3750(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!t", name = "YA", descriptor = "()V")
    public final native void method1153();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1160(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.field9115 = -1;
        int var7 = 0;
        float[] var8 = new float[this.field9113.method1272(0)];
        for (class669 var9 = (class669) this.field9113.method1269(4); var9 != null; var9 = (class669) this.field9113.method1264((byte) 40)) {
            var8[var7++] = var9.method3756(-65);
        }
        this.method3749(var8);
        for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
            for (int var11 = 0; var11 < arg2 + arg2; ++var11) {
                if (arg3[var10][var11]) {
                    int var12 = arg0 - arg2 + var10;
                    int var13 = arg1 - arg2 + var11;
                    if (var12 >= 0 && var12 < super.field3937 && var13 >= 0 && var13 < super.field3940) {
                        this.method1150(var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "fa", descriptor = "(IILr;)Lr;")
    public final native class184 method1146(int arg0, int arg1, class184 arg2);

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class305.method1997(0, this);
        }
    }

    @OriginalMember(owner = "client!t", name = "ga", descriptor = "(Loa;Lya;II[[I[[IIII)V")
    private final native void method3751(class694 arg0, class52 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!t", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method1159(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field9114.method3882().method3515(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }
}
