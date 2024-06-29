import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class204 extends class543 implements class439 {

    @OriginalMember(owner = "client!s", name = "m", descriptor = "Lrk;")
    private class419 field3035 = new class419();

    @OriginalMember(owner = "client!s", name = "l", descriptor = "La;")
    private class329 field3034;

    @OriginalMember(owner = "client!s", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZ)V", line = 10)
    public final void method1318(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        int var6 = 0;
        float[] var7 = new float[this.field3035.method2491(-18626)];
        for (class535 var8 = (class535) this.field3035.method2496((byte) 108); var8 != null; var8 = (class535) this.field3035.method2494(48)) {
            var7[var6++] = var8.method3145(2);
        }
        this.method1327(var7);
    }

    @OriginalMember(owner = "client!s", name = "finalize", descriptor = "()V", line = 33)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class75.method437(this, -1);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V", line = 40)
    public final void method1324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field3034.method2059().method3253(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(La;Lc;II[[I[[IIII)V", line = 46)
    public class204(class329 arg0, class618 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6);
        this.field3034 = arg0;
        this.method1316(this.field3034, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lk;IIIIZ)Z", line = 51)
    public final boolean method1325(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 55)
    public final void method1326(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method1320(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lat;[I)V", line = 165)
    public final void method1328(class535 arg0, int[] arg1) {
        this.field3035.method2492(arg0, (byte) 75);
        this.method1315(arg0.hashCode(), arg0.method3151(-91), arg0.method3150(2), arg0.method3143(-76), arg0.method3146(0), arg0.method3148((byte) -78), arg1);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V", line = 171)
    public final void method1330(int arg0, int arg1) {
        this.field3034.method2059().method3250(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!s", name = "F", descriptor = "(Lk;IIIIZ)V")
    public final native void method1314(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "L", descriptor = "(IIIIII[I)V")
    private final native void method1315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!s", name = "HA", descriptor = "(La;Lc;II[[I[[IIII)V")
    private final native void method1316(class329 arg0, class618 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "(III)V")
    public final native void method1317(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "NA", descriptor = "(Z)V")
    public final native void method530(boolean arg0);

    @OriginalMember(owner = "client!s", name = "ba", descriptor = "(II)I")
    public final native int method1319(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method1320(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "N", descriptor = "()V")
    public final native void method1321();

    @OriginalMember(owner = "client!s", name = "ya", descriptor = "(Lk;IIIIZ)V")
    public final native void method1322(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "aa", descriptor = "(II)I")
    public final native int method1323(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "FA", descriptor = "([F)V")
    private final native void method1327(float[] arg0);

    @OriginalMember(owner = "client!s", name = "X", descriptor = "(IILk;)Lk;")
    public final native class88 method1329(int arg0, int arg1, class88 arg2);
}
