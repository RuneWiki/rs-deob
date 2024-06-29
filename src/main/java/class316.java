import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class316 {

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    private static int field4583;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    private static int field4584;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    private static int field4585;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    private static int field4586;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    private static int field4587;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    private static int field4588;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    private static int field4589;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "[I")
    private static int[] field4582;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "()V")
    private static final void method2019() {
        field4586 = 0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lnp;[II)V")
    public static final void method2020(class313 arg0, int[] arg1, int arg2) {
        method2025(arg0, arg1, 0, arg1.length, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)Z")
    private static final boolean method2021(int arg0) {
        int var1 = field4583;
        int var2 = field4584;
        int var3 = field4587;
        while (var2 >= var1) {
            var3++;
            field4587 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field4585;
            while (var1 < field4586) {
                int var5 = field4582[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field4582[var1];
                int var7 = field4582[var1 + 2];
                int var8 = field4582[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field4582[var1] = var10;
                field4582[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field4582[var11 + 3];
                if (var3 >= var12) {
                    field4582[var11] = field4582[var4];
                    field4582[var11 + 1] = field4582[var4 + 1];
                    field4582[var11 + 2] = field4582[var4 + 2];
                    field4582[var11 + 3] = field4582[var4 + 3];
                    var4 += 4;
                }
            }
            if (field4586 == var4) {
                field4586 = 0;
                return false;
            }
            method2028(var4, var1);
            field4585 = var4;
            field4583 = var1;
            var2 = var4;
        }
        field4589 = field4582[var2] >> 16;
        field4588 = field4582[var2 + 4] >> 16;
        field4582[var2] += field4582[var2 + 2];
        field4582[var2 + 4] += field4582[var2 + 6];
        var2 += 8;
        field4584 = var2;
        return true;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([III)V")
    private static final void method2022(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field4586;
        if (field4582 == null || field4582.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field4586; var5++) {
                var4[var5] = field4582[var5];
            }
            field4582 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field4582[field4586++] = arg0[var7];
                field4582[field4586++] = var9;
                field4582[field4586++] = arg0[var8];
                field4582[field4586++] = var10;
            } else if (var10 < var9) {
                field4582[field4586++] = arg0[var8];
                field4582[field4586++] = var10;
                field4582[field4586++] = arg0[var7];
                field4582[field4586++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lnp;[II[I[I)V")
    public static final void method2023(class313 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method2025(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "()V")
    public static void method2024() {
        field4582 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lnp;[IIII[I[I)V")
    private static final void method2025(class313 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method690(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method2019();
        method2022(arg1, arg2, arg3);
        method2027(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method2021(var7[3])) {
                    return;
                }
                var8 = field4589;
                var9 = field4588;
                var10 = field4587;
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
            arg0.method600(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)V")
    private static final void method2026(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field4582[arg0];
        int var4 = field4582[arg0 + 1];
        int var5 = field4582[arg0 + 2];
        int var6 = field4582[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field4582[var7 + 1];
            if (var8 < var4) {
                field4582[var2] = field4582[var7];
                field4582[var2 + 1] = var8;
                field4582[var2 + 2] = field4582[var7 + 2];
                field4582[var2 + 3] = field4582[var7 + 3];
                var2 += 4;
                field4582[var7] = field4582[var2];
                field4582[var7 + 1] = field4582[var2 + 1];
                field4582[var7 + 2] = field4582[var2 + 2];
                field4582[var7 + 3] = field4582[var2 + 3];
            }
        }
        field4582[var2] = var3;
        field4582[var2 + 1] = var4;
        field4582[var2 + 2] = var5;
        field4582[var2 + 3] = var6;
        method2026(arg0, var2);
        method2026(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    private static final void method2027(int arg0) {
        if (field4586 < 0) {
            field4584 = 0;
            field4583 = 0;
            field4585 = 0;
            field4587 = 2147483646;
            return;
        }
        method2026(0, field4586);
        int var1 = field4582[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field4586; var3 += 4) {
            int var4 = field4582[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field4582[var3];
            int var6 = field4582[var3 + 2];
            int var7 = field4582[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field4582[var3] = (var1 - var4) * var8 + var9;
            field4582[var3 + 2] = var8;
        }
        field4585 = var2;
        field4583 = var3;
        field4584 = var3;
        field4587 = var1 - 1;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)V")
    private static final void method2028(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field4582[var3 - 4];
                    int var5 = field4582[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field4582[var3 - 4] = var5;
                        field4582[var3] = var4;
                        int var6 = field4582[var3 - 2];
                        field4582[var3 - 2] = field4582[var3 + 2];
                        field4582[var3 + 2] = var6;
                        int var7 = field4582[var3 - 1];
                        field4582[var3 - 1] = field4582[var3 + 3];
                        field4582[var3 + 3] = var7;
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
