import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class560 {

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    private static int field7983;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    private static int field7984;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    private static int field7985;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    private static int field7986;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    private static int field7987;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    private static int field7988;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    private static int field7989;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "[I")
    private static int[] field7982;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V", line = 3)
    private static final void method3249(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field7982[arg0];
        int var4 = field7982[arg0 + 1];
        int var5 = field7982[arg0 + 2];
        int var6 = field7982[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field7982[var7 + 1];
            if (var8 < var4) {
                field7982[var2] = field7982[var7];
                field7982[var2 + 1] = var8;
                field7982[var2 + 2] = field7982[var7 + 2];
                field7982[var2 + 3] = field7982[var7 + 3];
                var2 += 4;
                field7982[var7] = field7982[var2];
                field7982[var7 + 1] = field7982[var2 + 1];
                field7982[var7 + 2] = field7982[var2 + 2];
                field7982[var7 + 3] = field7982[var2 + 3];
            }
        }
        field7982[var2] = var3;
        field7982[var2 + 1] = var4;
        field7982[var2 + 2] = var5;
        field7982[var2 + 3] = var6;
        method3249(arg0, var2);
        method3249(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([III)V", line = 50)
    private static final void method3250(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field7989;
        if (field7982 == null || field7982.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field7989; var5++) {
                var4[var5] = field7982[var5];
            }
            field7982 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field7982[field7989++] = arg0[var7];
                field7982[field7989++] = var9;
                field7982[field7989++] = arg0[var8];
                field7982[field7989++] = var10;
            } else if (var10 < var9) {
                field7982[field7989++] = arg0[var8];
                field7982[field7989++] = var10;
                field7982[field7989++] = arg0[var7];
                field7982[field7989++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()V", line = 103)
    public static void method3251() {
        field7982 = null;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "()V", line = 106)
    private static final void method3252() {
        field7989 = 0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lha;[II)V", line = 111)
    public static final void method3253(class66 arg0, int[] arg1, int arg2) {
        method3258(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V", line = 114)
    private static final void method3254(int arg0) {
        if (field7989 < 0) {
            field7985 = 0;
            field7987 = 0;
            field7984 = 0;
            field7983 = 2147483646;
            return;
        }
        method3249(0, field7989);
        int var1 = field7982[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field7989; var3 += 4) {
            int var4 = field7982[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field7982[var3];
            int var6 = field7982[var3 + 2];
            int var7 = field7982[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field7982[var3] = (var1 - var4) * var8 + var9;
            field7982[var3 + 2] = var8;
        }
        field7984 = var2;
        field7987 = var3;
        field7985 = var3;
        field7983 = var1 - 1;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)V", line = 159)
    private static final void method3255(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field7982[var3 - 4];
                    int var5 = field7982[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field7982[var3 - 4] = var5;
                        field7982[var3] = var4;
                        int var6 = field7982[var3 - 2];
                        field7982[var3 - 2] = field7982[var3 + 2];
                        field7982[var3 + 2] = var6;
                        int var7 = field7982[var3 - 1];
                        field7982[var3 - 1] = field7982[var3 + 3];
                        field7982[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lha;[II[I[I)V", line = 198)
    public static final void method3256(class66 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method3258(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)Z", line = 204)
    private static final boolean method3257(int arg0) {
        int var1 = field7987;
        int var2 = field7985;
        int var3 = field7983;
        while (var2 >= var1) {
            var3++;
            field7983 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field7984;
            while (var1 < field7989) {
                int var5 = field7982[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field7982[var1];
                int var7 = field7982[var1 + 2];
                int var8 = field7982[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field7982[var1] = var10;
                field7982[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field7982[var11 + 3];
                if (var3 >= var12) {
                    field7982[var11] = field7982[var4];
                    field7982[var11 + 1] = field7982[var4 + 1];
                    field7982[var11 + 2] = field7982[var4 + 2];
                    field7982[var11 + 3] = field7982[var4 + 3];
                    var4 += 4;
                }
            }
            if (field7989 == var4) {
                field7989 = 0;
                return false;
            }
            method3255(var4, var1);
            field7984 = var4;
            field7987 = var1;
            var2 = var4;
        }
        field7988 = field7982[var2] >> 16;
        field7986 = field7982[var2 + 4] >> 16;
        field7982[var2] += field7982[var2 + 2];
        field7982[var2 + 4] += field7982[var2 + 6];
        var2 += 8;
        field7985 = var2;
        return true;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lha;[IIII[I[I)V", line = 283)
    private static final void method3258(class66 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method428(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method3252();
        method3250(arg1, arg2, arg3);
        method3254(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method3257(var7[3])) {
                    return;
                }
                var8 = field7988;
                var9 = field7986;
                var10 = field7983;
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
            arg0.method440(var8, var10, var9 - var8, arg4, 1);
        }
    }
}
