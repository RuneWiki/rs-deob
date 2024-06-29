import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class624 {

    @OriginalMember(owner = "client!via", name = "a", descriptor = "I")
    private static int field8740;

    @OriginalMember(owner = "client!via", name = "b", descriptor = "I")
    private static int field8741;

    @OriginalMember(owner = "client!via", name = "c", descriptor = "I")
    private static int field8742;

    @OriginalMember(owner = "client!via", name = "d", descriptor = "I")
    private static int field8743;

    @OriginalMember(owner = "client!via", name = "e", descriptor = "I")
    private static int field8744;

    @OriginalMember(owner = "client!via", name = "f", descriptor = "I")
    private static int field8745;

    @OriginalMember(owner = "client!via", name = "h", descriptor = "I")
    private static int field8747;

    @OriginalMember(owner = "client!via", name = "g", descriptor = "[I")
    private static int[] field8746;

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(Lha;[II[I[I)V")
    public static final void method3587(class473 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method3588(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(Lha;[IIII[I[I)V")
    private static final void method3588(class473 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method160(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method3596();
        method3591(arg1, arg2, arg3);
        method3590(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method3594(var7[3])) {
                    return;
                }
                var8 = field8745;
                var9 = field8740;
                var10 = field8744;
                if (arg5 == null) {
                    break;
                }
                int var11 = var10 - var7[1];
                if (var8 < arg5[var11] + var7[0]) {
                    var8 = arg5[var11] + var7[0];
                }
                if (var9 > arg5[var11] + arg6[var11] + var7[0]) {
                    var9 = arg5[var11] + arg6[var11] + var7[0];
                }
            } while (var9 - var8 <= 0);
            arg0.method152(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(II)V")
    private static final void method3589(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field8746[arg0];
        int var4 = field8746[arg0 + 1];
        int var5 = field8746[arg0 + 2];
        int var6 = field8746[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field8746[var7 + 1];
            if (var8 < var4) {
                field8746[var2] = field8746[var7];
                field8746[var2 + 1] = var8;
                field8746[var2 + 2] = field8746[var7 + 2];
                field8746[var2 + 3] = field8746[var7 + 3];
                var2 += 4;
                field8746[var7] = field8746[var2];
                field8746[var7 + 1] = field8746[var2 + 1];
                field8746[var7 + 2] = field8746[var2 + 2];
                field8746[var7 + 3] = field8746[var2 + 3];
            }
        }
        field8746[var2] = var3;
        field8746[var2 + 1] = var4;
        field8746[var2 + 2] = var5;
        field8746[var2 + 3] = var6;
        method3589(arg0, var2);
        method3589(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(I)V")
    private static final void method3590(int arg0) {
        if (field8741 < 0) {
            field8747 = 0;
            field8743 = 0;
            field8742 = 0;
            field8744 = 2147483646;
            return;
        }
        method3589(0, field8741);
        int var1 = field8746[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field8741; var3 += 4) {
            int var4 = field8746[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field8746[var3];
            int var6 = field8746[var3 + 2];
            int var7 = field8746[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field8746[var3] = (var1 - var4) * var8 + var9;
            field8746[var3 + 2] = var8;
        }
        field8742 = var2;
        field8743 = var3;
        field8747 = var3;
        field8744 = var1 - 1;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "([III)V")
    private static final void method3591(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field8741;
        if (field8746 == null || field8746.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field8741; var5++) {
                var4[var5] = field8746[var5];
            }
            field8746 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field8746[field8741++] = arg0[var7];
                field8746[field8741++] = var9;
                field8746[field8741++] = arg0[var8];
                field8746[field8741++] = var10;
            } else if (var10 < var9) {
                field8746[field8741++] = arg0[var8];
                field8746[field8741++] = var10;
                field8746[field8741++] = arg0[var7];
                field8746[field8741++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(II)V")
    private static final void method3592(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field8746[var3 - 4];
                    int var5 = field8746[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field8746[var3 - 4] = var5;
                        field8746[var3] = var4;
                        int var6 = field8746[var3 - 2];
                        field8746[var3 - 2] = field8746[var3 + 2];
                        field8746[var3 + 2] = var6;
                        int var7 = field8746[var3 - 1];
                        field8746[var3 - 1] = field8746[var3 + 3];
                        field8746[var3 + 3] = var7;
                    }
                }
                if (!var2) {
                    arg1 -= 4;
                    continue;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(Lha;[II)V")
    public static final void method3593(class473 arg0, int[] arg1, int arg2) {
        method3588(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(I)Z")
    private static final boolean method3594(int arg0) {
        int var1 = field8743;
        int var2 = field8747;
        int var3 = field8744;
        while (var2 >= var1) {
            var3++;
            field8744 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field8742;
            while (var1 < field8741) {
                int var5 = field8746[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field8746[var1];
                int var7 = field8746[var1 + 2];
                int var8 = field8746[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field8746[var1] = var10;
                field8746[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field8746[var11 + 3];
                if (var3 >= var12) {
                    field8746[var11] = field8746[var4];
                    field8746[var11 + 1] = field8746[var4 + 1];
                    field8746[var11 + 2] = field8746[var4 + 2];
                    field8746[var11 + 3] = field8746[var4 + 3];
                    var4 += 4;
                }
            }
            if (field8741 == var4) {
                field8741 = 0;
                return false;
            }
            method3592(var4, var1);
            field8742 = var4;
            field8743 = var1;
            var2 = var4;
        }
        field8745 = field8746[var2] >> 16;
        field8740 = field8746[var2 + 4] >> 16;
        field8746[var2] += field8746[var2 + 2];
        field8746[var2 + 4] += field8746[var2 + 6];
        var2 += 8;
        field8747 = var2;
        return true;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "()V")
    public static void method3595() {
        field8746 = null;
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "()V")
    private static final void method3596() {
        field8741 = 0;
    }
}
