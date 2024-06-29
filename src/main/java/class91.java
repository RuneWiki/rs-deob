import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class91 extends class337 implements class240 {

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "Lfr;")
    private class497 field1412 = new class497();

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Lqa;")
    private class131 field1413;

    @OriginalMember(owner = "client!ha", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Lba;IIIIZ)V")
    public final native void method703(class502 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V")
    public final void method704(int arg0, int arg1) {
        this.field1413.method966().method2360(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!ha", name = "ca", descriptor = "()V")
    public final native void method705();

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "(Lba;IIIIZ)V")
    public final native void method706(class502 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "(II)I")
    public final native int method707(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "([F)V")
    private final native void method708(float[] arg0);

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lqa;Lna;II[[I[[IIII)V")
    public class91(class131 arg0, class253 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6);
        this.field1413 = arg0;
        this.method709(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ha", name = "IA", descriptor = "(Lqa;Lna;II[[I[[IIII)V")
    private final native void method709(class131 arg0, class253 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "()V")
    public final native void method471();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lba;IIIIZ)Z")
    public final boolean method710(class502 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III[[ZZ)V")
    public final void method711(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        int var6 = 0;
        float[] var7 = new float[this.field1412.method2960(false)];
        for (class531 var8 = (class531) this.field1412.method2957(87); var8 != null; var8 = (class531) this.field1412.method2947(-71)) {
            var7[var6++] = var8.method3151((byte) -28);
        }
        this.method708(var7);
    }

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "(IILba;)Lba;")
    public final native class502 method712(int arg0, int arg1, class502 arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method713(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field1413.method966().method2351(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method714(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method717(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lwr;[I)V")
    public final void method715(class531 arg0, int[] arg1) {
        this.field1412.method2958(arg0, (byte) 91);
        this.method716(arg0.hashCode(), arg0.method3157(-110), arg0.method3154(false), arg0.method3150((byte) 107), arg0.method3156(98), arg0.method3152(7), arg1);
    }

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class371.method2212((byte) -72, this);
    }

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "(IIIIII[I)V")
    private final native void method716(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method717(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I")
    public final native int method718(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(III)V")
    public final native void method719(int arg0, int arg1, int arg2);
}
