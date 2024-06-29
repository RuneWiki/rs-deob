import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class642 {

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    private static int field8864;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    private static int field8865;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    private static int field8866;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    private static int field8867;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    private static int field8868;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    private static int field8869;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    private static int field8870;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "[I")
    private static int[] field8863;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lr;[II[I[I)V")
    public static final void method3568(class166 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method3576(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "()V")
    public static void method3569() {
        field8863 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)Z")
    private static final boolean method3570(int arg0) {
        int var1 = field8864;
        int var2 = field8865;
        int var3 = field8867;
        while (var2 >= var1) {
            var3++;
            field8867 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field8870;
            while (var1 < field8866) {
                int var5 = field8863[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field8863[var1];
                int var7 = field8863[var1 + 2];
                int var8 = field8863[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field8863[var1] = var10;
                field8863[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field8863[var11 + 3];
                if (var3 >= var12) {
                    field8863[var11] = field8863[var4];
                    field8863[var11 + 1] = field8863[var4 + 1];
                    field8863[var11 + 2] = field8863[var4 + 2];
                    field8863[var11 + 3] = field8863[var4 + 3];
                    var4 += 4;
                }
            }
            if (field8866 == var4) {
                field8866 = 0;
                return false;
            }
            method3577(var4, var1);
            field8870 = var4;
            field8864 = var1;
            var2 = var4;
        }
        field8868 = field8863[var2] >> 16;
        field8869 = field8863[var2 + 4] >> 16;
        field8863[var2] += field8863[var2 + 2];
        field8863[var2 + 4] += field8863[var2 + 6];
        var2 += 8;
        field8865 = var2;
        return true;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    private static final void method3571(int arg0) {
        if (field8866 < 0) {
            field8865 = 0;
            field8864 = 0;
            field8870 = 0;
            field8867 = 2147483646;
            return;
        }
        method3574(0, field8866);
        int var1 = field8863[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field8866; var3 += 4) {
            int var4 = field8863[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field8863[var3];
            int var6 = field8863[var3 + 2];
            int var7 = field8863[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field8863[var3] = (var1 - var4) * var8 + var9;
            field8863[var3 + 2] = var8;
        }
        field8870 = var2;
        field8864 = var3;
        field8865 = var3;
        field8867 = var1 - 1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([III)V")
    private static final void method3572(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field8866;
        if (field8863 == null || field8863.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field8866; var5++) {
                var4[var5] = field8863[var5];
            }
            field8863 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field8863[field8866++] = arg0[var7];
                field8863[field8866++] = var9;
                field8863[field8866++] = arg0[var8];
                field8863[field8866++] = var10;
            } else if (var10 < var9) {
                field8863[field8866++] = arg0[var8];
                field8863[field8866++] = var10;
                field8863[field8866++] = arg0[var7];
                field8863[field8866++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "()V")
    private static final void method3573() {
        field8866 = 0;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
    private static final void method3574(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field8863[arg0];
        int var4 = field8863[arg0 + 1];
        int var5 = field8863[arg0 + 2];
        int var6 = field8863[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field8863[var7 + 1];
            if (var8 < var4) {
                field8863[var2] = field8863[var7];
                field8863[var2 + 1] = var8;
                field8863[var2 + 2] = field8863[var7 + 2];
                field8863[var2 + 3] = field8863[var7 + 3];
                var2 += 4;
                field8863[var7] = field8863[var2];
                field8863[var7 + 1] = field8863[var2 + 1];
                field8863[var7 + 2] = field8863[var2 + 2];
                field8863[var7 + 3] = field8863[var2 + 3];
            }
        }
        field8863[var2] = var3;
        field8863[var2 + 1] = var4;
        field8863[var2 + 2] = var5;
        field8863[var2 + 3] = var6;
        method3574(arg0, var2);
        method3574(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lr;[II)V")
    public static final void method3575(class166 arg0, int[] arg1, int arg2) {
        method3576(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lr;[IIII[I[I)V")
    private static final void method3576(class166 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method174(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method3573();
        method3572(arg1, arg2, arg3);
        method3571(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method3570(var7[3])) {
                    return;
                }
                var8 = field8868;
                var9 = field8869;
                var10 = field8867;
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
            arg0.method118(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)V")
    private static final void method3577(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field8863[var3 - 4];
                    int var5 = field8863[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field8863[var3 - 4] = var5;
                        field8863[var3] = var4;
                        int var6 = field8863[var3 - 2];
                        field8863[var3 - 2] = field8863[var3 + 2];
                        field8863[var3 + 2] = var6;
                        int var7 = field8863[var3 - 1];
                        field8863[var3 - 1] = field8863[var3 + 3];
                        field8863[var3 + 3] = var7;
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
}
