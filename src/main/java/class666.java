import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class666 extends class278 implements class531 {

    @OriginalMember(owner = "client!t", name = "m", descriptor = "Lbq;")
    private class289 field9486 = new class289();

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    private int field9488 = -1;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "Loa;")
    private class692 field9487;

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIII[[Z)V", line = 3)
    public final void method1662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field9487.method3900().method3518(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III[[ZZII)V", line = 7)
    public final void method1670(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.field9488 = arg5;
        int var8 = 0;
        float[] var9 = new float[this.field9486.method1727(121)];
        for (class163 var10 = (class163) this.field9486.method1719(65280); var10 != null; var10 = (class163) this.field9486.method1723(-20665)) {
            var9[var8++] = var10.method1011(24617);
        }
        this.method3790(var9);
        for (int var11 = 0; var11 < arg2 + arg2; ++var11) {
            for (int var12 = 0; var12 < arg2 + arg2; ++var12) {
                if (arg3[var11][var12]) {
                    int var13 = arg0 - arg2 + var11;
                    int var14 = arg1 - arg2 + var12;
                    if (var13 >= 0 && var13 < super.field3410 && var14 >= 0 && var14 < super.field3408) {
                        this.method1672(var13, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V", line = 56)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class684.method3871(this, true);
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Loa;Lya;II[[I[[IIII)V", line = 61)
    public class666(class692 arg0, class51 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6, arg4);
        this.field9487 = arg0;
        this.method3789(this.field9487, arg1, arg2, arg3, super.field3415, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lada;[I)V", line = 66)
    public final void method1668(class163 arg0, int[] arg1) {
        this.field9486.method1721((byte) -80, arg0);
        this.method3788(arg0.hashCode(), arg0.method1012((byte) 127), arg0.method1006(31079), arg0.method1013(9179409), arg0.method1007(73), arg0.method1010(-5636), arg1);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 70)
    public final boolean method1669(class182 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 74)
    public final void method1665(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method1673(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V", line = 186)
    public final void method1672(int arg0, int arg1) {
        if (this.field9488 < 0) {
            this.field9487.method3900().method3516(this, arg0, arg1);
        } else {
            this.field9487.method3900().method3495(this, arg0, arg1, this.field9488);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III[[ZZI)V", line = 196)
    public final void method1667(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.field9488 = -1;
        int var7 = 0;
        float[] var8 = new float[this.field9486.method1727(120)];
        for (class163 var9 = (class163) this.field9486.method1719(65280); var9 != null; var9 = (class163) this.field9486.method1723(-20665)) {
            var8[var7++] = var9.method1011(24617);
        }
        this.method3790(var8);
        for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
            for (int var11 = 0; var11 < arg2 + arg2; ++var11) {
                if (arg3[var10][var11]) {
                    int var12 = arg0 - arg2 + var10;
                    int var13 = arg1 - arg2 + var11;
                    if (var12 >= 0 && var12 < super.field3410 && var13 >= 0 && var13 < super.field3408) {
                        this.method1672(var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final native void method1663(class182 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!t", name = "V", descriptor = "(IIIIII[I)V")
    private final native void method3788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!t", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final native void method1677(class182 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!t", name = "ka", descriptor = "(III)V")
    public final native void method1666(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "YA", descriptor = "()V")
    public final native void method1674();

    @OriginalMember(owner = "client!t", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method1673(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!t", name = "ga", descriptor = "(Loa;Lya;II[[I[[IIII)V")
    private final native void method3789(class692 arg0, class51 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!t", name = "fa", descriptor = "(IILr;)Lr;")
    public final native class182 method1678(int arg0, int arg1, class182 arg2);

    @OriginalMember(owner = "client!t", name = "q", descriptor = "([F)V")
    private final native void method3790(float[] arg0);

    @OriginalMember(owner = "client!t", name = "w", descriptor = "(Z)V")
    public final native void method83(boolean arg0);
}
