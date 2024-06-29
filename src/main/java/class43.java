import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class43 extends class143 implements class103 {

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "Lub;")
    private class18 field523 = new class18();

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Lqa;")
    private class164 field524;

    @OriginalMember(owner = "client!ha", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lku;[I)V", line = 3)
    public final void method385(class256 arg0, int[] arg1) {
        this.field523.method163(arg0, 0);
        this.method389(arg0.hashCode(), arg0.method1539((byte) 68), arg0.method1536((byte) 117), arg0.method1537(-409134460), arg0.method1534((byte) 68), arg0.method1533(-409134460), arg1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III[[ZZ)V", line = 8)
    public final void method386(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        int var6 = 0;
        float[] var7 = new float[this.field523.method156(55)];
        for (class256 var8 = (class256) this.field523.method153(0); var8 != null; var8 = (class256) this.field523.method161(-80)) {
            var7[var6++] = var8.method1542(-124);
        }
        this.method388(var7);
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lqa;Lna;II[[I[[IIII)V", line = 29)
    public class43(class164 arg0, class35 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6);
        this.field524 = arg0;
        this.method400(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lba;IIIIZ)Z", line = 35)
    public final boolean method391(class264 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 40)
    public final void method392(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method395(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V", line = 149)
    public final void method393(int arg0, int arg1) {
        this.field524.method1068().method119(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII[[Z)V", line = 155)
    public final void method397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field524.method1068().method112(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V", line = 158)
    protected final void finalize() {
        class132.method921(this, false);
    }

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "()V")
    public final native void method120();

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "(Lba;IIIIZ)V")
    public final native void method387(class264 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "([F)V")
    private final native void method388(float[] arg0);

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "(IIIIII[I)V")
    private final native void method389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Lba;IIIIZ)V")
    public final native void method390(class264 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(III)V")
    public final native void method394(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method395(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I")
    public final native int method396(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "(IILba;)Lba;")
    public final native class264 method398(int arg0, int arg1, class264 arg2);

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "(II)I")
    public final native int method399(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "IA", descriptor = "(Lqa;Lna;II[[I[[IIII)V")
    private final native void method400(class164 arg0, class35 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "ca", descriptor = "()V")
    public final native void method401();
}
