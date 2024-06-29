import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class699 extends class293 implements class560 {

    @OriginalMember(owner = "client!t", name = "n", descriptor = "Lat;")
    private class398 field10055 = new class398();

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    private int field10057 = -1;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "Loa;")
    private class725 field10056;

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lih;[I)V", line = 5)
    public final void method713(class731 arg0, int[] arg1) {
        this.field10055.method3220(arg0, 0);
        this.method5074(arg0.hashCode(), arg0.method5300(32), arg0.method5297(false), arg0.method5298(-4), arg0.method5295(32), arg0.method5294(true), arg1);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V", line = 10)
    public final void method700(int arg0, int arg1) {
        if (this.field10057 < 0) {
            this.field10056.method5269().method4681(this, arg0, arg1);
        } else {
            this.field10056.method5269().method4692(this, arg0, arg1, this.field10057);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III[[ZZI)V", line = 17)
    public final void method711(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.field10057 = -1;
        int var7 = 0;
        float[] var8 = new float[this.field10055.method3222(false)];
        for (class731 var9 = (class731) this.field10055.method3228(11); var9 != null; var9 = (class731) this.field10055.method3216(true)) {
            var8[var7++] = var9.method5299(31541);
        }
        this.method5073(var8);
        for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
            for (int var11 = 0; var11 < arg2 + arg2; ++var11) {
                if (arg3[var10][var11]) {
                    int var12 = arg0 - arg2 + var10;
                    int var13 = arg1 - arg2 + var11;
                    if (var12 >= 0 && var12 < super.field4704 && var13 >= 0 && var13 < super.field4697) {
                        this.method700(var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III[[ZZII)V", line = 66)
    public final void method703(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.field10057 = arg5;
        int var8 = 0;
        float[] var9 = new float[this.field10055.method3222(false)];
        for (class731 var10 = (class731) this.field10055.method3228(11); var10 != null; var10 = (class731) this.field10055.method3216(true)) {
            var9[var8++] = var10.method5299(31541);
        }
        this.method5073(var9);
        for (int var11 = 0; var11 < arg2 + arg2; ++var11) {
            for (int var12 = 0; var12 < arg2 + arg2; ++var12) {
                if (arg3[var11][var12]) {
                    int var13 = arg0 - arg2 + var11;
                    int var14 = arg1 - arg2 + var12;
                    if (var13 >= 0 && var13 < super.field4704 && var14 >= 0 && var14 < super.field4697) {
                        this.method700(var13, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 120)
    public final void method715(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method705(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 230)
    public final boolean method716(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Loa;Lya;II[[I[[IIII)V", line = 233)
    public class699(class725 arg0, class56 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6, arg4);
        this.field10056 = arg0;
        this.method5072(this.field10056, arg1, arg2, arg3, super.field4700, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIII[[Z)V", line = 238)
    public final void method710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field10056.method5269().method4687(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V", line = 242)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class377.method3103(this, false);
        }
    }

    @OriginalMember(owner = "client!t", name = "fa", descriptor = "(IILr;)Lr;")
    public final native class192 method712(int arg0, int arg1, class192 arg2);

    @OriginalMember(owner = "client!t", name = "ga", descriptor = "(Loa;Lya;II[[I[[IIII)V")
    private final native void method5072(class725 arg0, class56 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!t", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final native void method714(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!t", name = "YA", descriptor = "()V")
    public final native void method702();

    @OriginalMember(owner = "client!t", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method705(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!t", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final native void method701(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!t", name = "q", descriptor = "([F)V")
    private final native void method5073(float[] arg0);

    @OriginalMember(owner = "client!t", name = "w", descriptor = "(Z)V")
    public final native void method121(boolean arg0);

    @OriginalMember(owner = "client!t", name = "ka", descriptor = "(III)V")
    public final native void method706(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "V", descriptor = "(IIIIII[I)V")
    private final native void method5074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);
}
