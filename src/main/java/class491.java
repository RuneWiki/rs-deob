import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class491 {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    private static int field7126;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    private static int field7127;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    private static int field7129;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    private static int field7130;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    private static int field7131;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    private static int field7132;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    private static int field7133;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "[I")
    private static int[] field7128;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lr;[IIII[I[I)V")
    private static final void method2843(class564 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method963(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method2847();
        method2851(arg1, arg2, arg3);
        method2844(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method2852(var7[3])) {
                    return;
                }
                var8 = field7126;
                var9 = field7127;
                var10 = field7129;
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
            arg0.method1007(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    private static final void method2844(int arg0) {
        if (field7131 < 0) {
            field7130 = 0;
            field7133 = 0;
            field7132 = 0;
            field7129 = 2147483646;
            return;
        }
        method2846(0, field7131);
        int var1 = field7128[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field7131; var3 += 4) {
            int var4 = field7128[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field7128[var3];
            int var6 = field7128[var3 + 2];
            int var7 = field7128[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field7128[var3] = (var1 - var4) * var8 + var9;
            field7128[var3 + 2] = var8;
        }
        field7132 = var2;
        field7133 = var3;
        field7130 = var3;
        field7129 = var1 - 1;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lr;[II[I[I)V")
    public static final void method2845(class564 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method2843(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V")
    private static final void method2846(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field7128[arg0];
        int var4 = field7128[arg0 + 1];
        int var5 = field7128[arg0 + 2];
        int var6 = field7128[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field7128[var7 + 1];
            if (var8 < var4) {
                field7128[var2] = field7128[var7];
                field7128[var2 + 1] = var8;
                field7128[var2 + 2] = field7128[var7 + 2];
                field7128[var2 + 3] = field7128[var7 + 3];
                var2 += 4;
                field7128[var7] = field7128[var2];
                field7128[var7 + 1] = field7128[var2 + 1];
                field7128[var7 + 2] = field7128[var2 + 2];
                field7128[var7 + 3] = field7128[var2 + 3];
            }
        }
        field7128[var2] = var3;
        field7128[var2 + 1] = var4;
        field7128[var2 + 2] = var5;
        field7128[var2 + 3] = var6;
        method2846(arg0, var2);
        method2846(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "()V")
    private static final void method2847() {
        field7131 = 0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lr;[II)V")
    public static final void method2848(class564 arg0, int[] arg1, int arg2) {
        method2843(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)V")
    private static final void method2849(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field7128[var3 - 4];
                    int var5 = field7128[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field7128[var3 - 4] = var5;
                        field7128[var3] = var4;
                        int var6 = field7128[var3 - 2];
                        field7128[var3 - 2] = field7128[var3 + 2];
                        field7128[var3 + 2] = var6;
                        int var7 = field7128[var3 - 1];
                        field7128[var3 - 1] = field7128[var3 + 3];
                        field7128[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "()V")
    public static void method2850() {
        field7128 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([III)V")
    private static final void method2851(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field7131;
        if (field7128 == null || field7128.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field7131; var5++) {
                var4[var5] = field7128[var5];
            }
            field7128 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field7128[field7131++] = arg0[var7];
                field7128[field7131++] = var9;
                field7128[field7131++] = arg0[var8];
                field7128[field7131++] = var10;
            } else if (var10 < var9) {
                field7128[field7131++] = arg0[var8];
                field7128[field7131++] = var10;
                field7128[field7131++] = arg0[var7];
                field7128[field7131++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)Z")
    private static final boolean method2852(int arg0) {
        int var1 = field7133;
        int var2 = field7130;
        int var3 = field7129;
        while (var2 >= var1) {
            var3++;
            field7129 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field7132;
            while (var1 < field7131) {
                int var5 = field7128[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field7128[var1];
                int var7 = field7128[var1 + 2];
                int var8 = field7128[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field7128[var1] = var10;
                field7128[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field7128[var11 + 3];
                if (var3 >= var12) {
                    field7128[var11] = field7128[var4];
                    field7128[var11 + 1] = field7128[var4 + 1];
                    field7128[var11 + 2] = field7128[var4 + 2];
                    field7128[var11 + 3] = field7128[var4 + 3];
                    var4 += 4;
                }
            }
            if (field7131 == var4) {
                field7131 = 0;
                return false;
            }
            method2849(var4, var1);
            field7132 = var4;
            field7133 = var1;
            var2 = var4;
        }
        field7126 = field7128[var2] >> 16;
        field7127 = field7128[var2 + 4] >> 16;
        field7128[var2] += field7128[var2 + 2];
        field7128[var2 + 4] += field7128[var2 + 6];
        var2 += 8;
        field7130 = var2;
        return true;
    }
}
