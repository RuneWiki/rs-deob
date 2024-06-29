import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class450 {

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    private static int field6437;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    private static int field6438;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    private static int field6439;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    private static int field6440;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    private static int field6441;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    private static int field6443;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    private static int field6444;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "[I")
    private static int[] field6442;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lha;[II[I[I)V", line = 5)
    public static final void method2749(class543 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method2753(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()V", line = 8)
    public static void method2750() {
        field6442 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([III)V", line = 14)
    private static final void method2751(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field6440;
        if (field6442 == null || field6442.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field6440; var5++) {
                var4[var5] = field6442[var5];
            }
            field6442 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field6442[field6440++] = arg0[var7];
                field6442[field6440++] = var9;
                field6442[field6440++] = arg0[var8];
                field6442[field6440++] = var10;
            } else if (var10 < var9) {
                field6442[field6440++] = arg0[var8];
                field6442[field6440++] = var10;
                field6442[field6440++] = arg0[var7];
                field6442[field6440++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 63)
    private static final void method2752(int arg0) {
        if (field6440 < 0) {
            field6441 = 0;
            field6443 = 0;
            field6437 = 0;
            field6438 = 2147483646;
            return;
        }
        method2756(0, field6440);
        int var1 = field6442[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field6440; var3 += 4) {
            int var4 = field6442[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field6442[var3];
            int var6 = field6442[var3 + 2];
            int var7 = field6442[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field6442[var3] = (var1 - var4) * var8 + var9;
            field6442[var3 + 2] = var8;
        }
        field6437 = var2;
        field6443 = var3;
        field6441 = var3;
        field6438 = var1 - 1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lha;[IIII[I[I)V", line = 111)
    private static final void method2753(class543 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method358(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method2758();
        method2751(arg1, arg2, arg3);
        method2752(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method2755(var7[3])) {
                    return;
                }
                var8 = field6439;
                var9 = field6444;
                var10 = field6438;
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
            arg0.method357(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)V", line = 147)
    private static final void method2754(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field6442[var3 - 4];
                    int var5 = field6442[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field6442[var3 - 4] = var5;
                        field6442[var3] = var4;
                        int var6 = field6442[var3 - 2];
                        field6442[var3 - 2] = field6442[var3 + 2];
                        field6442[var3 + 2] = var6;
                        int var7 = field6442[var3 - 1];
                        field6442[var3 - 1] = field6442[var3 + 3];
                        field6442[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)Z", line = 187)
    private static final boolean method2755(int arg0) {
        int var1 = field6443;
        int var2 = field6441;
        int var3 = field6438;
        while (var2 >= var1) {
            var3++;
            field6438 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field6437;
            while (var1 < field6440) {
                int var5 = field6442[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field6442[var1];
                int var7 = field6442[var1 + 2];
                int var8 = field6442[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field6442[var1] = var10;
                field6442[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field6442[var11 + 3];
                if (var3 >= var12) {
                    field6442[var11] = field6442[var4];
                    field6442[var11 + 1] = field6442[var4 + 1];
                    field6442[var11 + 2] = field6442[var4 + 2];
                    field6442[var11 + 3] = field6442[var4 + 3];
                    var4 += 4;
                }
            }
            if (field6440 == var4) {
                field6440 = 0;
                return false;
            }
            method2754(var4, var1);
            field6437 = var4;
            field6443 = var1;
            var2 = var4;
        }
        field6439 = field6442[var2] >> 16;
        field6444 = field6442[var2 + 4] >> 16;
        field6442[var2] += field6442[var2 + 2];
        field6442[var2 + 4] += field6442[var2 + 6];
        var2 += 8;
        field6441 = var2;
        return true;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II)V", line = 264)
    private static final void method2756(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field6442[arg0];
        int var4 = field6442[arg0 + 1];
        int var5 = field6442[arg0 + 2];
        int var6 = field6442[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field6442[var7 + 1];
            if (var8 < var4) {
                field6442[var2] = field6442[var7];
                field6442[var2 + 1] = var8;
                field6442[var2 + 2] = field6442[var7 + 2];
                field6442[var2 + 3] = field6442[var7 + 3];
                var2 += 4;
                field6442[var7] = field6442[var2];
                field6442[var7 + 1] = field6442[var2 + 1];
                field6442[var7 + 2] = field6442[var2 + 2];
                field6442[var7 + 3] = field6442[var2 + 3];
            }
        }
        field6442[var2] = var3;
        field6442[var2 + 1] = var4;
        field6442[var2 + 2] = var5;
        field6442[var2 + 3] = var6;
        method2756(arg0, var2);
        method2756(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lha;[II)V", line = 313)
    public static final void method2757(class543 arg0, int[] arg1, int arg2) {
        method2753(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()V", line = 316)
    private static final void method2758() {
        field6440 = 0;
    }
}
