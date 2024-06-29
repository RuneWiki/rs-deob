import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class671 {

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    private static int field9396;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    private static int field9397;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    private static int field9398;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    private static int field9399;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    private static int field9400;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    private static int field9401;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    private static int field9402;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "[I")
    private static int[] field9395;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([III)V", line = 11)
    private static final void method3765(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field9401;
        if (field9395 == null || field9395.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field9401; var5++) {
                var4[var5] = field9395[var5];
            }
            field9395 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field9395[field9401++] = arg0[var7];
                field9395[field9401++] = var9;
                field9395[field9401++] = arg0[var8];
                field9395[field9401++] = var10;
            } else if (var10 < var9) {
                field9395[field9401++] = arg0[var8];
                field9395[field9401++] = var10;
                field9395[field9401++] = arg0[var7];
                field9395[field9401++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Z", line = 61)
    private static final boolean method3766(int arg0) {
        int var1 = field9400;
        int var2 = field9396;
        int var3 = field9402;
        while (var2 >= var1) {
            var3++;
            field9402 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field9399;
            while (var1 < field9401) {
                int var5 = field9395[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field9395[var1];
                int var7 = field9395[var1 + 2];
                int var8 = field9395[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field9395[var1] = var10;
                field9395[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field9395[var11 + 3];
                if (var3 >= var12) {
                    field9395[var11] = field9395[var4];
                    field9395[var11 + 1] = field9395[var4 + 1];
                    field9395[var11 + 2] = field9395[var4 + 2];
                    field9395[var11 + 3] = field9395[var4 + 3];
                    var4 += 4;
                }
            }
            if (field9401 == var4) {
                field9401 = 0;
                return false;
            }
            method3772(var4, var1);
            field9399 = var4;
            field9400 = var1;
            var2 = var4;
        }
        field9398 = field9395[var2] >> 16;
        field9397 = field9395[var2 + 4] >> 16;
        field9395[var2] += field9395[var2 + 2];
        field9395[var2 + 4] += field9395[var2 + 6];
        var2 += 8;
        field9396 = var2;
        return true;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lha;[II)V", line = 137)
    public static final void method3767(class60 arg0, int[] arg1, int arg2) {
        method3769(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V", line = 143)
    private static final void method3768(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field9395[arg0];
        int var4 = field9395[arg0 + 1];
        int var5 = field9395[arg0 + 2];
        int var6 = field9395[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field9395[var7 + 1];
            if (var8 < var4) {
                field9395[var2] = field9395[var7];
                field9395[var2 + 1] = var8;
                field9395[var2 + 2] = field9395[var7 + 2];
                field9395[var2 + 3] = field9395[var7 + 3];
                var2 += 4;
                field9395[var7] = field9395[var2];
                field9395[var7 + 1] = field9395[var2 + 1];
                field9395[var7 + 2] = field9395[var2 + 2];
                field9395[var7 + 3] = field9395[var2 + 3];
            }
        }
        field9395[var2] = var3;
        field9395[var2 + 1] = var4;
        field9395[var2 + 2] = var5;
        field9395[var2 + 3] = var6;
        method3768(arg0, var2);
        method3768(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lha;[IIII[I[I)V", line = 190)
    private static final void method3769(class60 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method483(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method3773();
        method3765(arg1, arg2, arg3);
        method3771(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method3766(var7[3])) {
                    return;
                }
                var8 = field9398;
                var9 = field9397;
                var10 = field9402;
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
            arg0.method491(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()V", line = 226)
    public static void method3770() {
        field9395 = null;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 229)
    private static final void method3771(int arg0) {
        if (field9401 < 0) {
            field9396 = 0;
            field9400 = 0;
            field9399 = 0;
            field9402 = 2147483646;
            return;
        }
        method3768(0, field9401);
        int var1 = field9395[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field9401; var3 += 4) {
            int var4 = field9395[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field9395[var3];
            int var6 = field9395[var3 + 2];
            int var7 = field9395[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field9395[var3] = (var1 - var4) * var8 + var9;
            field9395[var3 + 2] = var8;
        }
        field9399 = var2;
        field9400 = var3;
        field9396 = var3;
        field9402 = var1 - 1;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)V", line = 276)
    private static final void method3772(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field9395[var3 - 4];
                    int var5 = field9395[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field9395[var3 - 4] = var5;
                        field9395[var3] = var4;
                        int var6 = field9395[var3 - 2];
                        field9395[var3 - 2] = field9395[var3 + 2];
                        field9395[var3 + 2] = var6;
                        int var7 = field9395[var3 - 1];
                        field9395[var3 - 1] = field9395[var3 + 3];
                        field9395[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "()V", line = 314)
    private static final void method3773() {
        field9401 = 0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lha;[II[I[I)V", line = 317)
    public static final void method3774(class60 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method3769(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }
}
