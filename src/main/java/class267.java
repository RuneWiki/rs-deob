import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class267 {

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    private static int field4465;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
    private static int field4466;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
    private static int field4468;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
    private static int field4469;

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
    private static int field4470;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
    private static int field4471;

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "I")
    private static int field4472;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "[I")
    private static int[] field4467;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(II)V", line = 4)
    private static final void method1782(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field4467[var3 - 4];
                    int var5 = field4467[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field4467[var3 - 4] = var5;
                        field4467[var3] = var4;
                        int var6 = field4467[var3 - 2];
                        field4467[var3 - 2] = field4467[var3 + 2];
                        field4467[var3 + 2] = var6;
                        int var7 = field4467[var3 - 1];
                        field4467[var3 - 1] = field4467[var3 + 3];
                        field4467[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "()V", line = 41)
    private static final void method1783() {
        field4465 = 0;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lza;[II[I[I)V", line = 48)
    public static final void method1784(class491 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1785(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lza;[IIII[I[I)V", line = 54)
    private static final void method1785(class491 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method908(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1783();
        method1788(arg1, arg2, arg3);
        method1786(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1787(var7[3])) {
                    return;
                }
                var8 = field4468;
                var9 = field4466;
                var10 = field4472;
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
            arg0.method854(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V", line = 91)
    private static final void method1786(int arg0) {
        if (field4465 < 0) {
            field4469 = 0;
            field4471 = 0;
            field4470 = 0;
            field4472 = 2147483646;
            return;
        }
        method1791(0, field4465);
        int var1 = field4467[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field4465; var3 += 4) {
            int var4 = field4467[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field4467[var3];
            int var6 = field4467[var3 + 2];
            int var7 = field4467[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field4467[var3] = (var1 - var4) * var8 + var9;
            field4467[var3 + 2] = var8;
        }
        field4470 = var2;
        field4471 = var3;
        field4469 = var3;
        field4472 = var1 - 1;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)Z", line = 138)
    private static final boolean method1787(int arg0) {
        int var1 = field4471;
        int var2 = field4469;
        int var3 = field4472;
        while (var2 >= var1) {
            var3++;
            field4472 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field4470;
            while (var1 < field4465) {
                int var5 = field4467[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field4467[var1];
                int var7 = field4467[var1 + 2];
                int var8 = field4467[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field4467[var1] = var10;
                field4467[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field4467[var11 + 3];
                if (var3 >= var12) {
                    field4467[var11] = field4467[var4];
                    field4467[var11 + 1] = field4467[var4 + 1];
                    field4467[var11 + 2] = field4467[var4 + 2];
                    field4467[var11 + 3] = field4467[var4 + 3];
                    var4 += 4;
                }
            }
            if (field4465 == var4) {
                field4465 = 0;
                return false;
            }
            method1782(var4, var1);
            field4470 = var4;
            field4471 = var1;
            var2 = var4;
        }
        field4468 = field4467[var2] >> 16;
        field4466 = field4467[var2 + 4] >> 16;
        field4467[var2] += field4467[var2 + 2];
        field4467[var2 + 4] += field4467[var2 + 6];
        var2 += 8;
        field4469 = var2;
        return true;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "([III)V", line = 216)
    private static final void method1788(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field4465;
        if (field4467 == null || field4467.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field4465; var5++) {
                var4[var5] = field4467[var5];
            }
            field4467 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field4467[field4465++] = arg0[var7];
                field4467[field4465++] = var9;
                field4467[field4465++] = arg0[var8];
                field4467[field4465++] = var10;
            } else if (var10 < var9) {
                field4467[field4465++] = arg0[var8];
                field4467[field4465++] = var10;
                field4467[field4465++] = arg0[var7];
                field4467[field4465++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "()V", line = 269)
    public static void method1789() {
        field4467 = null;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lza;[II)V", line = 273)
    public static final void method1790(class491 arg0, int[] arg1, int arg2) {
        method1785(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(II)V", line = 276)
    private static final void method1791(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field4467[arg0];
        int var4 = field4467[arg0 + 1];
        int var5 = field4467[arg0 + 2];
        int var6 = field4467[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field4467[var7 + 1];
            if (var8 < var4) {
                field4467[var2] = field4467[var7];
                field4467[var2 + 1] = var8;
                field4467[var2 + 2] = field4467[var7 + 2];
                field4467[var2 + 3] = field4467[var7 + 3];
                var2 += 4;
                field4467[var7] = field4467[var2];
                field4467[var7 + 1] = field4467[var2 + 1];
                field4467[var7 + 2] = field4467[var2 + 2];
                field4467[var7 + 3] = field4467[var2 + 3];
            }
        }
        field4467[var2] = var3;
        field4467[var2 + 1] = var4;
        field4467[var2 + 2] = var5;
        field4467[var2 + 3] = var6;
        method1791(arg0, var2);
        method1791(var2 + 4, arg1);
    }
}
