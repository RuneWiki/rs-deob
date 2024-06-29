import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class427 {

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    private static int field5853;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    private static int field5854;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    private static int field5855;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    private static int field5856;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    private static int field5857;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    private static int field5858;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    private static int field5859;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "[I")
    private static int[] field5860;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)Z", line = 4)
    private static final boolean method2524(int arg0) {
        int var1 = field5853;
        int var2 = field5855;
        int var3 = field5856;
        while (var2 >= var1) {
            var3++;
            field5856 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field5859;
            while (var1 < field5858) {
                int var5 = field5860[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field5860[var1];
                int var7 = field5860[var1 + 2];
                int var8 = field5860[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field5860[var1] = var10;
                field5860[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field5860[var11 + 3];
                if (var3 >= var12) {
                    field5860[var11] = field5860[var4];
                    field5860[var11 + 1] = field5860[var4 + 1];
                    field5860[var11 + 2] = field5860[var4 + 2];
                    field5860[var11 + 3] = field5860[var4 + 3];
                    var4 += 4;
                }
            }
            if (field5858 == var4) {
                field5858 = 0;
                return false;
            }
            method2526(var4, var1);
            field5859 = var4;
            field5853 = var1;
            var2 = var4;
        }
        field5857 = field5860[var2] >> 16;
        field5854 = field5860[var2 + 4] >> 16;
        field5860[var2] += field5860[var2 + 2];
        field5860[var2 + 4] += field5860[var2 + 6];
        var2 += 8;
        field5855 = var2;
        return true;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V", line = 79)
    private static final void method2525(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field5860[arg0];
        int var4 = field5860[arg0 + 1];
        int var5 = field5860[arg0 + 2];
        int var6 = field5860[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field5860[var7 + 1];
            if (var8 < var4) {
                field5860[var2] = field5860[var7];
                field5860[var2 + 1] = var8;
                field5860[var2 + 2] = field5860[var7 + 2];
                field5860[var2 + 3] = field5860[var7 + 3];
                var2 += 4;
                field5860[var7] = field5860[var2];
                field5860[var7 + 1] = field5860[var2 + 1];
                field5860[var7 + 2] = field5860[var2 + 2];
                field5860[var7 + 3] = field5860[var2 + 3];
            }
        }
        field5860[var2] = var3;
        field5860[var2 + 1] = var4;
        field5860[var2 + 2] = var5;
        field5860[var2 + 3] = var6;
        method2525(arg0, var2);
        method2525(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)V", line = 125)
    private static final void method2526(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field5860[var3 - 4];
                    int var5 = field5860[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field5860[var3 - 4] = var5;
                        field5860[var3] = var4;
                        int var6 = field5860[var3 - 2];
                        field5860[var3 - 2] = field5860[var3 + 2];
                        field5860[var3 + 2] = var6;
                        int var7 = field5860[var3 - 1];
                        field5860[var3 - 1] = field5860[var3 + 3];
                        field5860[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "()V", line = 166)
    public static void method2527() {
        field5860 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "([III)V", line = 172)
    private static final void method2528(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field5858;
        if (field5860 == null || field5860.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field5858; var5++) {
                var4[var5] = field5860[var5];
            }
            field5860 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field5860[field5858++] = arg0[var7];
                field5860[field5858++] = var9;
                field5860[field5858++] = arg0[var8];
                field5860[field5858++] = var10;
            } else if (var10 < var9) {
                field5860[field5858++] = arg0[var8];
                field5860[field5858++] = var10;
                field5860[field5858++] = arg0[var7];
                field5860[field5858++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lqa;[II)V", line = 221)
    public static final void method2529(class129 arg0, int[] arg1, int arg2) {
        method2530(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lqa;[IIII[I[I)V", line = 229)
    private static final void method2530(class129 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method846(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method2532();
        method2528(arg1, arg2, arg3);
        method2531(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method2524(var7[3])) {
                    return;
                }
                var8 = field5857;
                var9 = field5854;
                var10 = field5856;
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
            arg0.method904(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V", line = 269)
    private static final void method2531(int arg0) {
        if (field5858 < 0) {
            field5855 = 0;
            field5853 = 0;
            field5859 = 0;
            field5856 = 2147483646;
            return;
        }
        method2525(0, field5858);
        int var1 = field5860[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field5858; var3 += 4) {
            int var4 = field5860[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field5860[var3];
            int var6 = field5860[var3 + 2];
            int var7 = field5860[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field5860[var3] = (var1 - var4) * var8 + var9;
            field5860[var3 + 2] = var8;
        }
        field5859 = var2;
        field5853 = var3;
        field5855 = var3;
        field5856 = var1 - 1;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "()V", line = 314)
    private static final void method2532() {
        field5858 = 0;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lqa;[II[I[I)V", line = 317)
    public static final void method2533(class129 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method2530(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }
}
