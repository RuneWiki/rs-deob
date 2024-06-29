import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class614 {

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    private static int field8110;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    private static int field8111;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    private static int field8112;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    private static int field8113;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    private static int field8114;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    private static int field8115;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    private static int field8117;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "[I")
    private static int[] field8116;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "()V", line = 3)
    public static void method3354() {
        field8116 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)Z", line = 7)
    private static final boolean method3355(int arg0) {
        int var1 = field8113;
        int var2 = field8110;
        int var3 = field8115;
        while (var2 >= var1) {
            var3++;
            field8115 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field8114;
            while (var1 < field8112) {
                int var5 = field8116[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field8116[var1];
                int var7 = field8116[var1 + 2];
                int var8 = field8116[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field8116[var1] = var10;
                field8116[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field8116[var11 + 3];
                if (var3 >= var12) {
                    field8116[var11] = field8116[var4];
                    field8116[var11 + 1] = field8116[var4 + 1];
                    field8116[var11 + 2] = field8116[var4 + 2];
                    field8116[var11 + 3] = field8116[var4 + 3];
                    var4 += 4;
                }
            }
            if (field8112 == var4) {
                field8112 = 0;
                return false;
            }
            method3363(var4, var1);
            field8114 = var4;
            field8113 = var1;
            var2 = var4;
        }
        field8117 = field8116[var2] >> 16;
        field8111 = field8116[var2 + 4] >> 16;
        field8116[var2] += field8116[var2 + 2];
        field8116[var2 + 4] += field8116[var2 + 6];
        var2 += 8;
        field8110 = var2;
        return true;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Loa;[II[I[I)V", line = 83)
    public static final void method3356(class651 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method3357(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Loa;[IIII[I[I)V", line = 90)
    private static final void method3357(class651 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method433(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method3362();
        method3359(arg1, arg2, arg3);
        method3358(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method3355(var7[3])) {
                    return;
                }
                var8 = field8117;
                var9 = field8111;
                var10 = field8115;
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
            arg0.method379(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V", line = 130)
    private static final void method3358(int arg0) {
        if (field8112 < 0) {
            field8110 = 0;
            field8113 = 0;
            field8114 = 0;
            field8115 = 2147483646;
            return;
        }
        method3361(0, field8112);
        int var1 = field8116[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field8112; var3 += 4) {
            int var4 = field8116[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field8116[var3];
            int var6 = field8116[var3 + 2];
            int var7 = field8116[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field8116[var3] = (var1 - var4) * var8 + var9;
            field8116[var3 + 2] = var8;
        }
        field8114 = var2;
        field8113 = var3;
        field8110 = var3;
        field8115 = var1 - 1;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([III)V", line = 179)
    private static final void method3359(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field8112;
        if (field8116 == null || field8116.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field8112; var5++) {
                var4[var5] = field8116[var5];
            }
            field8116 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field8116[field8112++] = arg0[var7];
                field8116[field8112++] = var9;
                field8116[field8112++] = arg0[var8];
                field8116[field8112++] = var10;
            } else if (var10 < var9) {
                field8116[field8112++] = arg0[var8];
                field8116[field8112++] = var10;
                field8116[field8112++] = arg0[var7];
                field8116[field8112++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Loa;[II)V", line = 228)
    public static final void method3360(class651 arg0, int[] arg1, int arg2) {
        method3357(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V", line = 232)
    private static final void method3361(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field8116[arg0];
        int var4 = field8116[arg0 + 1];
        int var5 = field8116[arg0 + 2];
        int var6 = field8116[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field8116[var7 + 1];
            if (var8 < var4) {
                field8116[var2] = field8116[var7];
                field8116[var2 + 1] = var8;
                field8116[var2 + 2] = field8116[var7 + 2];
                field8116[var2 + 3] = field8116[var7 + 3];
                var2 += 4;
                field8116[var7] = field8116[var2];
                field8116[var7 + 1] = field8116[var2 + 1];
                field8116[var7 + 2] = field8116[var2 + 2];
                field8116[var7 + 3] = field8116[var2 + 3];
            }
        }
        field8116[var2] = var3;
        field8116[var2 + 1] = var4;
        field8116[var2 + 2] = var5;
        field8116[var2 + 3] = var6;
        method3361(arg0, var2);
        method3361(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "()V", line = 276)
    private static final void method3362() {
        field8112 = 0;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)V", line = 281)
    private static final void method3363(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field8116[var3 - 4];
                    int var5 = field8116[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field8116[var3 - 4] = var5;
                        field8116[var3] = var4;
                        int var6 = field8116[var3 - 2];
                        field8116[var3 - 2] = field8116[var3 + 2];
                        field8116[var3 + 2] = var6;
                        int var7 = field8116[var3 - 1];
                        field8116[var3 - 1] = field8116[var3 + 3];
                        field8116[var3 + 3] = var7;
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
