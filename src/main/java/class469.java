import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class469 extends class223 implements class400 {

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "Lnj;")
    private class317 field7181 = new class317();

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "Lw;")
    private class459 field7180;

    @OriginalMember(owner = "client!fa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Las;[I)V")
    public final void method694(class415 arg0, int[] arg1) {
        this.field7181.method2124(arg0, (byte) -113);
        this.method2924(arg0.hashCode(), arg0.method2650(122), arg0.method2645(117), arg0.method2654(0), arg0.method2651(-121), arg0.method2647(-36), arg1);
    }

    @OriginalMember(owner = "client!fa", name = "ua", descriptor = "(II)I")
    public final native int method688(int arg0, int arg1);

    @OriginalMember(owner = "client!fa", name = "OA", descriptor = "(IILi;)Li;")
    public final native class521 method697(int arg0, int arg1, class521 arg2);

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lw;Lg;II[[I[[IIII)V")
    public class469(class459 arg0, class97 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6);
        this.field7180 = arg0;
        this.method2926(this.field7180, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!fa", name = "ca", descriptor = "(II)I")
    public final native int method692(int arg0, int arg1);

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "(Li;IIIIZ)V")
    public final native void method698(class521 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!fa", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method687(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Li;IIIIZ)Z")
    public final boolean method696(class521 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIII[I)V")
    private final native void method2924(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "()V")
    public final native void method175();

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "([F)V")
    private final native void method2925(float[] arg0);

    @OriginalMember(owner = "client!fa", name = "aa", descriptor = "()V")
    public final native void method700();

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "(Lw;Lg;II[[I[[IIII)V")
    private final native void method2926(class459 arg0, class97 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method686(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method687(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method690(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field7180.method2886().method183(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III[[ZZ)V")
    public final void method689(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        int var6 = 0;
        float[] var7 = new float[this.field7181.method2114((byte) -95)];
        for (class415 var8 = (class415) this.field7181.method2123(60); var8 != null; var8 = (class415) this.field7181.method2126((byte) 61)) {
            var7[var6++] = var8.method2648(false);
        }
        this.method2925(var7);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
    public final void method699(int arg0, int arg1) {
        this.field7180.method2886().method171(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!fa", name = "qa", descriptor = "(III)V")
    public final native void method684(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class431.method2721(this, false);
        }
    }

    @OriginalMember(owner = "client!fa", name = "ba", descriptor = "(Li;IIIIZ)V")
    public final native void method685(class521 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);
}
