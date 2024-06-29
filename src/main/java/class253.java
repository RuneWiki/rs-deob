import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class253 extends class37 implements class200 {

    @OriginalMember(owner = "client!s", name = "k", descriptor = "Lgca;")
    private class227 field3433 = new class227();

    @OriginalMember(owner = "client!s", name = "l", descriptor = "Ll;")
    private class18 field3434;

    @OriginalMember(owner = "client!s", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lha;IIIIZ)Z", line = 5)
    public final boolean method320(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 9)
    public final void method318(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
            this.method323(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ltw;[I)V", line = 123)
    public final void method333(class186 arg0, int[] arg1) {
        this.field3433.method1441(arg0, 0);
        this.method1546(arg0.hashCode(), arg0.method1280(true), arg0.method1282((byte) 102), arg0.method1279(0), arg0.method1281(29), arg0.method1283(0), arg1);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZ)V", line = 131)
    public final void method327(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        int var6 = 0;
        float[] var7 = new float[this.field3433.method1434((byte) -85)];
        for (class186 var8 = (class186) this.field3433.method1436(28964); var8 != null; var8 = (class186) this.field3433.method1443((byte) 6)) {
            var7[var6++] = var8.method1285(-1120);
        }
        this.method1547(var7);
        for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
            for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
                if (arg3[var9][var10]) {
                    int var11 = arg0 - arg2 + var9;
                    int var12 = arg1 - arg2 + var10;
                    if (var11 >= 0 && var11 < super.field446 && var12 >= 0 && var12 < super.field438) {
                        this.method321(var11, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Ll;Lm;II[[I[[IIII)V", line = 175)
    public class253(class18 arg0, class175 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6, arg4);
        this.field3434 = arg0;
        this.method1548(this.field3434, arg1, arg2, arg3, super.field440, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!s", name = "finalize", descriptor = "()V", line = 180)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class429.method2464(-10, this);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V", line = 186)
    public final void method321(int arg0, int arg1) {
        this.field3434.method140().method1424(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V", line = 192)
    public final void method322(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field3434.method140().method1428(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V", line = 197)
    public final void method328(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!s", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public final native void method329(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "BA", descriptor = "()V")
    public final native void method325();

    @OriginalMember(owner = "client!s", name = "UA", descriptor = "(Z)V")
    public final native void method188(boolean arg0);

    @OriginalMember(owner = "client!s", name = "E", descriptor = "(Lha;IIIIZ)V")
    public final native void method330(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "VA", descriptor = "(IIIIII[I)V")
    private final native void method1546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "([F)V")
    private final native void method1547(float[] arg0);

    @OriginalMember(owner = "client!s", name = "SA", descriptor = "(Ll;Lm;II[[I[[IIII)V")
    private final native void method1548(class18 arg0, class175 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!s", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final native void method323(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "v", descriptor = "(IILha;)Lha;")
    public final native class54 method324(int arg0, int arg1, class54 arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)V")
    public final native void method319(int arg0, int arg1, int arg2);
}
