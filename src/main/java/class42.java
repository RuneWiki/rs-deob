import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class42 extends class142 implements class103 {

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "Lpk;")
    private class133 field489 = new class133();

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "Lqa;")
    private class163 field490;

    @OriginalMember(owner = "client!ha", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Lba;IIIIZ)V")
    public final native void method415(class263 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "()V")
    public final native void method101();

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "(IIIIII[I)V")
    private final native void method416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!ha", name = "IA", descriptor = "(Lqa;Lna;II[[I[[IIII)V")
    private final native void method417(class163 arg0, class35 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(III)V")
    public final native void method418(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "ca", descriptor = "()V")
    public final native void method419();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V")
    public final void method420(int arg0, int arg1) {
        this.field490.method1159().method107(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method421(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method422(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method421(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "([F)V")
    private final native void method423(float[] arg0);

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lqa;Lna;II[[I[[IIII)V")
    public class42(class163 arg0, class35 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6);
        this.field490 = arg0;
        this.method417(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lvp;[I)V")
    public final void method424(class124 arg0, int[] arg1) {
        this.field489.method1015(false, arg0);
        this.method416(arg0.hashCode(), arg0.method980(false), arg0.method981((byte) 27), arg0.method983((byte) -95), arg0.method984(97), arg0.method982((byte) -122), arg1);
    }

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "(Lba;IIIIZ)V")
    public final native void method425(class263 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I")
    public final native int method426(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field490.method1159().method98(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lba;IIIIZ)Z")
    public final boolean method428(class263 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class260.method1672((byte) 50, this);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III[[ZZ)V")
    public final void method429(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        int var6 = 0;
        float[] var7 = new float[this.field489.method1026(0)];
        for (class124 var8 = (class124) this.field489.method1018(77); var8 != null; var8 = (class124) this.field489.method1022((byte) -112)) {
            var7[var6++] = var8.method979(false);
        }
        this.method423(var7);
    }

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "(II)I")
    public final native int method430(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "(IILba;)Lba;")
    public final native class263 method431(int arg0, int arg1, class263 arg2);
}
