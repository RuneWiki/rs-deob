import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class665 extends class278 implements class529 {

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Lnt;")
    private class220 field9331 = new class220();

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    private int field9333 = -1;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "Loa;")
    private class691 field9332;

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lbh;[I)V", line = 4)
    public final void method1079(class36 arg0, int[] arg1) {
        this.field9331.method1526(arg0, 96);
        this.method3737(arg0.hashCode(), arg0.method290((byte) 0), arg0.method298(false), arg0.method291(0), arg0.method294(120), arg0.method292(6865), arg1);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III[[ZZII)V", line = 10)
    public final void method1096(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.field9333 = arg5;
        int var8 = 0;
        float[] var9 = new float[this.field9331.method1531(0)];
        for (class36 var10 = (class36) this.field9331.method1522(true); var10 != null; var10 = (class36) this.field9331.method1527((byte) 83)) {
            var9[var8++] = var10.method296((byte) 3);
        }
        this.method3738(var9);
        for (int var11 = 0; var11 < arg2 + arg2; ++var11) {
            for (int var12 = 0; var12 < arg2 + arg2; ++var12) {
                if (arg3[var11][var12]) {
                    int var13 = arg0 - arg2 + var11;
                    int var14 = arg1 - arg2 + var12;
                    if (var13 >= 0 && var13 < super.field3924 && var14 >= 0 && var14 < super.field3914) {
                        this.method1077(var13, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V", line = 58)
    public final void method1077(int arg0, int arg1) {
        if (this.field9333 < 0) {
            this.field9332.method3887().method3560(this, arg0, arg1);
        } else {
            this.field9332.method3887().method3551(this, arg0, arg1, this.field9333);
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Loa;Lya;II[[I[[IIII)V", line = 65)
    public class665(class691 arg0, class51 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6, arg4);
        this.field9332 = arg0;
        this.method3736(this.field9332, arg1, arg2, arg3, super.field3916, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIII[[Z)V", line = 71)
    public final void method1091(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field9332.method3887().method3559(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III[[ZZI)V", line = 75)
    public final void method1078(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.field9333 = -1;
        int var7 = 0;
        float[] var8 = new float[this.field9331.method1531(0)];
        for (class36 var9 = (class36) this.field9331.method1522(true); var9 != null; var9 = (class36) this.field9331.method1527((byte) 86)) {
            var8[var7++] = var9.method296((byte) 3);
        }
        this.method3738(var8);
        for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
            for (int var11 = 0; var11 < arg2 + arg2; ++var11) {
                if (arg3[var10][var11]) {
                    int var12 = arg0 - arg2 + var10;
                    int var13 = arg1 - arg2 + var11;
                    if (var12 >= 0 && var12 < super.field3924 && var13 >= 0 && var13 < super.field3914) {
                        this.method1077(var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 128)
    public final void method1080(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method1092(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 237)
    public final boolean method1095(class181 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V", line = 245)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class727.method4045(this, 13483);
        }
    }

    @OriginalMember(owner = "client!t", name = "ga", descriptor = "(Loa;Lya;II[[I[[IIII)V")
    private final native void method3736(class691 arg0, class51 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!t", name = "fa", descriptor = "(IILr;)Lr;")
    public final native class181 method1086(int arg0, int arg1, class181 arg2);

    @OriginalMember(owner = "client!t", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final native void method1089(class181 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!t", name = "V", descriptor = "(IIIIII[I)V")
    private final native void method3737(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!t", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method1092(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!t", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final native void method1081(class181 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!t", name = "YA", descriptor = "()V")
    public final native void method1085();

    @OriginalMember(owner = "client!t", name = "w", descriptor = "(Z)V")
    public final native void method107(boolean arg0);

    @OriginalMember(owner = "client!t", name = "ka", descriptor = "(III)V")
    public final native void method1093(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "q", descriptor = "([F)V")
    private final native void method3738(float[] arg0);
}
