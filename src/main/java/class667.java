import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class667 extends class278 implements class532 {

    @OriginalMember(owner = "client!t", name = "o", descriptor = "Lbg;")
    private class464 field9070 = new class464();

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    private int field9071 = -1;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "Loa;")
    private class693 field9069;

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIII[[Z)V", line = 6)
    public final void method1819(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field9069.method3904().method3473(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V", line = 11)
    public final void method1812(int arg0, int arg1) {
        if (this.field9071 < 0) {
            this.field9069.method3904().method3470(this, arg0, arg1);
        } else {
            this.field9069.method3904().method3453(this, arg0, arg1, this.field9071);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 19)
    public final boolean method1813(class180 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III[[ZZII)V", line = 23)
    public final void method1823(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.field9071 = arg5;
        int var8 = 0;
        float[] var9 = new float[this.field9070.method2764(34)];
        for (class465 var10 = (class465) this.field9070.method2765(-12261); var10 != null; var10 = (class465) this.field9070.method2759(-15361)) {
            var9[var8++] = var10.method2780(-18277);
        }
        this.method3638(var9);
        for (int var11 = 0; var11 < arg2 + arg2; ++var11) {
            for (int var12 = 0; var12 < arg2 + arg2; ++var12) {
                if (arg3[var11][var12]) {
                    int var13 = arg0 - arg2 + var11;
                    int var14 = arg1 - arg2 + var12;
                    if (var13 >= 0 && var13 < super.field3935 && var14 >= 0 && var14 < super.field3930) {
                        this.method1812(var13, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Loa;Lya;II[[I[[IIII)V", line = 71)
    public class667(class693 arg0, class51 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6, arg4);
        this.field9069 = arg0;
        this.method3640(this.field9069, arg1, arg2, arg3, super.field3932, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 77)
    public final void method1825(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method1818(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V", line = 186)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class198.method1216((byte) 123, this);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lwi;[I)V", line = 193)
    public final void method1824(class465 arg0, int[] arg1) {
        this.field9070.method2770((byte) -13, arg0);
        this.method3639(arg0.hashCode(), arg0.method2772(false), arg0.method2774(-109), arg0.method2773(true), arg0.method2777(-1), arg0.method2778((byte) -106), arg1);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III[[ZZI)V", line = 199)
    public final void method1817(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.field9071 = -1;
        int var7 = 0;
        float[] var8 = new float[this.field9070.method2764(66)];
        for (class465 var9 = (class465) this.field9070.method2765(-12261); var9 != null; var9 = (class465) this.field9070.method2759(-15361)) {
            var8[var7++] = var9.method2780(-18277);
        }
        this.method3638(var8);
        for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
            for (int var11 = 0; var11 < arg2 + arg2; ++var11) {
                if (arg3[var10][var11]) {
                    int var12 = arg0 - arg2 + var10;
                    int var13 = arg1 - arg2 + var11;
                    if (var12 >= 0 && var12 < super.field3935 && var13 >= 0 && var13 < super.field3930) {
                        this.method1812(var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final native void method1810(class180 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!t", name = "q", descriptor = "([F)V")
    private final native void method3638(float[] arg0);

    @OriginalMember(owner = "client!t", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final native void method1811(class180 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!t", name = "YA", descriptor = "()V")
    public final native void method1821();

    @OriginalMember(owner = "client!t", name = "ka", descriptor = "(III)V")
    public final native void method1809(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "w", descriptor = "(Z)V")
    public final native void method106(boolean arg0);

    @OriginalMember(owner = "client!t", name = "fa", descriptor = "(IILr;)Lr;")
    public final native class180 method1822(int arg0, int arg1, class180 arg2);

    @OriginalMember(owner = "client!t", name = "V", descriptor = "(IIIIII[I)V")
    private final native void method3639(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!t", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method1818(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!t", name = "ga", descriptor = "(Loa;Lya;II[[I[[IIII)V")
    private final native void method3640(class693 arg0, class51 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);
}
