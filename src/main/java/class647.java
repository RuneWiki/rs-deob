import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class647 extends class402 implements class752 {

    @OriginalMember(owner = "client!t", name = "m", descriptor = "Lqia;")
    private class547 field8908 = new class547();

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    private int field8909 = -1;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Loa;")
    private class50 field8907;

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIII[[Z)V", line = 3)
    public final void method541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field8907.method406().method3534(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Loa;Lya;II[[I[[IIII)V", line = 10)
    public class647(class50 arg0, class305 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6, arg4);
        this.field8907 = arg0;
        this.method3504(this.field8907, arg1, arg2, arg3, super.field5565, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 17)
    public final void method552(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method545(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V", line = 127)
    public final void method549(int arg0, int arg1) {
        if (this.field8909 < 0) {
            this.field8907.method406().method3560(this, arg0, arg1);
        } else {
            this.field8907.method406().method3541(this, arg0, arg1, this.field8909);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III[[ZZI)V", line = 134)
    public final void method544(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.field8909 = -1;
        int var7 = 0;
        float[] var8 = new float[this.field8908.method3122(667)];
        for (class621 var9 = (class621) this.field8908.method3111(63); var9 != null; var9 = (class621) this.field8908.method3116(-81)) {
            var8[var7++] = var9.method3405(false);
        }
        this.method3502(var8);
        for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
            for (int var11 = 0; var11 < arg2 + arg2; ++var11) {
                if (arg3[var10][var11]) {
                    int var12 = arg0 - arg2 + var10;
                    int var13 = arg1 - arg2 + var11;
                    if (var12 >= 0 && var12 < super.field5569 && var13 >= 0 && var13 < super.field5562) {
                        this.method549(var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V", line = 180)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class133.method841(0, this);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lpk;[I)V", line = 185)
    public final void method539(class621 arg0, int[] arg1) {
        this.field8908.method3110(arg0, 1);
        this.method3503(arg0.hashCode(), arg0.method3402(true), arg0.method3403((byte) 97), arg0.method3404(-1), arg0.method3399((byte) -108), arg0.method3401(4), arg1);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 194)
    public final boolean method546(class108 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III[[ZZII)V", line = 199)
    public final void method550(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.field8909 = arg5;
        int var8 = 0;
        float[] var9 = new float[this.field8908.method3122(667)];
        for (class621 var10 = (class621) this.field8908.method3111(93); var10 != null; var10 = (class621) this.field8908.method3116(-118)) {
            var9[var8++] = var10.method3405(false);
        }
        this.method3502(var9);
        for (int var11 = 0; var11 < arg2 + arg2; ++var11) {
            for (int var12 = 0; var12 < arg2 + arg2; ++var12) {
                if (arg3[var11][var12]) {
                    int var13 = arg0 - arg2 + var11;
                    int var14 = arg1 - arg2 + var12;
                    if (var13 >= 0 && var13 < super.field5569 && var14 >= 0 && var14 < super.field5562) {
                        this.method549(var13, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "ka", descriptor = "(III)V")
    public final native void method540(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "fa", descriptor = "(IILr;)Lr;")
    public final native class108 method553(int arg0, int arg1, class108 arg2);

    @OriginalMember(owner = "client!t", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final native void method548(class108 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!t", name = "YA", descriptor = "()V")
    public final native void method547();

    @OriginalMember(owner = "client!t", name = "q", descriptor = "([F)V")
    private final native void method3502(float[] arg0);

    @OriginalMember(owner = "client!t", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method545(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!t", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final native void method551(class108 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!t", name = "V", descriptor = "(IIIIII[I)V")
    private final native void method3503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!t", name = "ga", descriptor = "(Loa;Lya;II[[I[[IIII)V")
    private final native void method3504(class50 arg0, class305 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!t", name = "w", descriptor = "(Z)V")
    public final native void method414(boolean arg0);
}
