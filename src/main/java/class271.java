import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class271 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    private static int field3428;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    private static int field3429;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    private static int field3430;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    private static int field3431;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    private static int field3432;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    private static int field3433;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    private static int field3435;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "[I")
    private static int[] field3434;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Loa;[IIII[I[I)V", line = 8)
    private static final void method1609(class650 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method478(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1614();
        method1616(arg1, arg2, arg3);
        method1617(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1610(var7[3])) {
                    return;
                }
                var8 = field3431;
                var9 = field3430;
                var10 = field3433;
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
            arg0.method454(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)Z", line = 45)
    private static final boolean method1610(int arg0) {
        int var1 = field3428;
        int var2 = field3432;
        int var3 = field3433;
        while (var2 >= var1) {
            var3++;
            field3433 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field3429;
            while (var1 < field3435) {
                int var5 = field3434[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field3434[var1];
                int var7 = field3434[var1 + 2];
                int var8 = field3434[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field3434[var1] = var10;
                field3434[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field3434[var11 + 3];
                if (var3 >= var12) {
                    field3434[var11] = field3434[var4];
                    field3434[var11 + 1] = field3434[var4 + 1];
                    field3434[var11 + 2] = field3434[var4 + 2];
                    field3434[var11 + 3] = field3434[var4 + 3];
                    var4 += 4;
                }
            }
            if (field3435 == var4) {
                field3435 = 0;
                return false;
            }
            method1611(var4, var1);
            field3429 = var4;
            field3428 = var1;
            var2 = var4;
        }
        field3431 = field3434[var2] >> 16;
        field3430 = field3434[var2 + 4] >> 16;
        field3434[var2] += field3434[var2 + 2];
        field3434[var2 + 4] += field3434[var2 + 6];
        var2 += 8;
        field3432 = var2;
        return true;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V", line = 120)
    private static final void method1611(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field3434[var3 - 4];
                    int var5 = field3434[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field3434[var3 - 4] = var5;
                        field3434[var3] = var4;
                        int var6 = field3434[var3 - 2];
                        field3434[var3 - 2] = field3434[var3 + 2];
                        field3434[var3 + 2] = var6;
                        int var7 = field3434[var3 - 1];
                        field3434[var3 - 1] = field3434[var3 + 3];
                        field3434[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Loa;[II)V", line = 158)
    public static final void method1612(class650 arg0, int[] arg1, int arg2) {
        method1609(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Loa;[II[I[I)V", line = 161)
    public static final void method1613(class650 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1609(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "()V", line = 166)
    private static final void method1614() {
        field3435 = 0;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)V", line = 169)
    private static final void method1615(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field3434[arg0];
        int var4 = field3434[arg0 + 1];
        int var5 = field3434[arg0 + 2];
        int var6 = field3434[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field3434[var7 + 1];
            if (var8 < var4) {
                field3434[var2] = field3434[var7];
                field3434[var2 + 1] = var8;
                field3434[var2 + 2] = field3434[var7 + 2];
                field3434[var2 + 3] = field3434[var7 + 3];
                var2 += 4;
                field3434[var7] = field3434[var2];
                field3434[var7 + 1] = field3434[var2 + 1];
                field3434[var7 + 2] = field3434[var2 + 2];
                field3434[var7 + 3] = field3434[var2 + 3];
            }
        }
        field3434[var2] = var3;
        field3434[var2 + 1] = var4;
        field3434[var2 + 2] = var5;
        field3434[var2 + 3] = var6;
        method1615(arg0, var2);
        method1615(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "([III)V", line = 217)
    private static final void method1616(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field3435;
        if (field3434 == null || field3434.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field3435; var5++) {
                var4[var5] = field3434[var5];
            }
            field3434 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field3434[field3435++] = arg0[var7];
                field3434[field3435++] = var9;
                field3434[field3435++] = arg0[var8];
                field3434[field3435++] = var10;
            } else if (var10 < var9) {
                field3434[field3435++] = arg0[var8];
                field3434[field3435++] = var10;
                field3434[field3435++] = arg0[var7];
                field3434[field3435++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V", line = 272)
    private static final void method1617(int arg0) {
        if (field3435 < 0) {
            field3432 = 0;
            field3428 = 0;
            field3429 = 0;
            field3433 = 2147483646;
            return;
        }
        method1615(0, field3435);
        int var1 = field3434[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field3435; var3 += 4) {
            int var4 = field3434[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field3434[var3];
            int var6 = field3434[var3 + 2];
            int var7 = field3434[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field3434[var3] = (var1 - var4) * var8 + var9;
            field3434[var3 + 2] = var8;
        }
        field3429 = var2;
        field3428 = var3;
        field3432 = var3;
        field3433 = var1 - 1;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "()V", line = 317)
    public static void method1618() {
        field3434 = null;
    }
}
