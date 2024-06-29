import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class42 extends class142 implements class103 {

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "Lar;")
    private class479 field525 = new class479();

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Lqa;")
    private class163 field526;

    @OriginalMember(owner = "client!ha", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 8)
    public final void method353(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method360(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lba;IIIIZ)Z", line = 121)
    public final boolean method355(class263 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lqa;Lna;II[[I[[IIII)V", line = 124)
    public class42(class163 arg0, class35 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6);
        this.field526 = arg0;
        this.method357(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII[[Z)V", line = 131)
    public final void method356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field526.method1086().method67(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V", line = 135)
    public final void method358(int arg0, int arg1) {
        this.field526.method1086().method72(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III[[ZZ)V", line = 145)
    public final void method362(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        int var6 = 0;
        float[] var7 = new float[this.field525.method2806((byte) -114)];
        for (class153 var8 = (class153) this.field525.method2818((byte) 121); var8 != null; var8 = (class153) this.field525.method2820((byte) -58)) {
            var7[var6++] = var8.method1023((byte) -42);
        }
        this.method354(var7);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljd;[I)V", line = 161)
    public final void method364(class153 arg0, int[] arg1) {
        this.field525.method2809(arg0, 2);
        this.method367(arg0.hashCode(), arg0.method1026(true), arg0.method1025((byte) -70), arg0.method1027(-601), arg0.method1029((byte) -122), arg0.method1021(14919), arg1);
    }

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V", line = 169)
    protected final void finalize() {
        class1.method1(this, (byte) -31);
    }

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "(II)I")
    public final native int method351(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "()V")
    public final native void method66();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Lba;IIIIZ)V")
    public final native void method352(class263 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "([F)V")
    private final native void method354(float[] arg0);

    @OriginalMember(owner = "client!ha", name = "IA", descriptor = "(Lqa;Lna;II[[I[[IIII)V")
    private final native void method357(class163 arg0, class35 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "(IILba;)Lba;")
    public final native class263 method359(int arg0, int arg1, class263 arg2);

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method360(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I")
    public final native int method361(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "(Lba;IIIIZ)V")
    public final native void method363(class263 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "ca", descriptor = "()V")
    public final native void method365();

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(III)V")
    public final native void method366(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "(IIIIII[I)V")
    private final native void method367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);
}
