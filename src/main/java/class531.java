import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class531 {

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    private static int field7815;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    private static int field7817;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    private static int field7818;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    private static int field7819;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    private static int field7820;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
    private static int field7821;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    private static int field7822;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "[I")
    private static int[] field7816;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)V")
    private static final void method3121(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field7816[arg0];
        int var4 = field7816[arg0 + 1];
        int var5 = field7816[arg0 + 2];
        int var6 = field7816[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field7816[var7 + 1];
            if (var8 < var4) {
                field7816[var2] = field7816[var7];
                field7816[var2 + 1] = var8;
                field7816[var2 + 2] = field7816[var7 + 2];
                field7816[var2 + 3] = field7816[var7 + 3];
                var2 += 4;
                field7816[var7] = field7816[var2];
                field7816[var7 + 1] = field7816[var2 + 1];
                field7816[var7 + 2] = field7816[var2 + 2];
                field7816[var7 + 3] = field7816[var2 + 3];
            }
        }
        field7816[var2] = var3;
        field7816[var2 + 1] = var4;
        field7816[var2 + 2] = var5;
        field7816[var2 + 3] = var6;
        method3121(arg0, var2);
        method3121(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "([III)V")
    private static final void method3122(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field7815;
        if (field7816 == null || field7816.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field7815; var5++) {
                var4[var5] = field7816[var5];
            }
            field7816 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field7816[field7815++] = arg0[var7];
                field7816[field7815++] = var9;
                field7816[field7815++] = arg0[var8];
                field7816[field7815++] = var10;
            } else if (var10 < var9) {
                field7816[field7815++] = arg0[var8];
                field7816[field7815++] = var10;
                field7816[field7815++] = arg0[var7];
                field7816[field7815++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "()V")
    private static final void method3123() {
        field7815 = 0;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(II)V")
    private static final void method3124(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field7816[var3 - 4];
                    int var5 = field7816[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field7816[var3 - 4] = var5;
                        field7816[var3] = var4;
                        int var6 = field7816[var3 - 2];
                        field7816[var3 - 2] = field7816[var3 + 2];
                        field7816[var3 + 2] = var6;
                        int var7 = field7816[var3 - 1];
                        field7816[var3 - 1] = field7816[var3 + 3];
                        field7816[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lqa;[II)V")
    public static final void method3125(class162 arg0, int[] arg1, int arg2) {
        method3126(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lqa;[IIII[I[I)V")
    private static final void method3126(class162 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method613(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method3123();
        method3122(arg1, arg2, arg3);
        method3130(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method3129(var7[3])) {
                    return;
                }
                var8 = field7818;
                var9 = field7820;
                var10 = field7817;
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
            arg0.method542(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "()V")
    public static void method3127() {
        field7816 = null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lqa;[II[I[I)V")
    public static final void method3128(class162 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method3126(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)Z")
    private static final boolean method3129(int arg0) {
        int var1 = field7821;
        int var2 = field7822;
        int var3 = field7817;
        while (var2 >= var1) {
            var3++;
            field7817 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field7819;
            while (var1 < field7815) {
                int var5 = field7816[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field7816[var1];
                int var7 = field7816[var1 + 2];
                int var8 = field7816[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field7816[var1] = var10;
                field7816[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field7816[var11 + 3];
                if (var3 >= var12) {
                    field7816[var11] = field7816[var4];
                    field7816[var11 + 1] = field7816[var4 + 1];
                    field7816[var11 + 2] = field7816[var4 + 2];
                    field7816[var11 + 3] = field7816[var4 + 3];
                    var4 += 4;
                }
            }
            if (field7815 == var4) {
                field7815 = 0;
                return false;
            }
            method3124(var4, var1);
            field7819 = var4;
            field7821 = var1;
            var2 = var4;
        }
        field7818 = field7816[var2] >> 16;
        field7820 = field7816[var2 + 4] >> 16;
        field7816[var2] += field7816[var2 + 2];
        field7816[var2 + 4] += field7816[var2 + 6];
        var2 += 8;
        field7822 = var2;
        return true;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)V")
    private static final void method3130(int arg0) {
        if (field7815 < 0) {
            field7822 = 0;
            field7821 = 0;
            field7819 = 0;
            field7817 = 2147483646;
            return;
        }
        method3121(0, field7815);
        int var1 = field7816[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field7815; var3 += 4) {
            int var4 = field7816[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field7816[var3];
            int var6 = field7816[var3 + 2];
            int var7 = field7816[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field7816[var3] = (var1 - var4) * var8 + var9;
            field7816[var3 + 2] = var8;
        }
        field7819 = var2;
        field7821 = var3;
        field7822 = var3;
        field7817 = var1 - 1;
    }
}
