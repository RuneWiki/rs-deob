import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class187 {

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    private static int field2599;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    private static int field2600;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    private static int field2601;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    private static int field2602;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    private static int field2603;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    private static int field2604;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    private static int field2605;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "[I")
    private static int[] field2606;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V")
    private static final void method1222(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field2606[arg0];
        int var4 = field2606[arg0 + 1];
        int var5 = field2606[arg0 + 2];
        int var6 = field2606[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field2606[var7 + 1];
            if (var8 < var4) {
                field2606[var2] = field2606[var7];
                field2606[var2 + 1] = var8;
                field2606[var2 + 2] = field2606[var7 + 2];
                field2606[var2 + 3] = field2606[var7 + 3];
                var2 += 4;
                field2606[var7] = field2606[var2];
                field2606[var7 + 1] = field2606[var2 + 1];
                field2606[var7 + 2] = field2606[var2 + 2];
                field2606[var7 + 3] = field2606[var2 + 3];
            }
        }
        field2606[var2] = var3;
        field2606[var2 + 1] = var4;
        field2606[var2 + 2] = var5;
        field2606[var2 + 3] = var6;
        method1222(arg0, var2);
        method1222(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "([III)V")
    private static final void method1223(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field2600;
        if (field2606 == null || field2606.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field2600; var5++) {
                var4[var5] = field2606[var5];
            }
            field2606 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field2606[field2600++] = arg0[var7];
                field2606[field2600++] = var9;
                field2606[field2600++] = arg0[var8];
                field2606[field2600++] = var10;
            } else if (var10 < var9) {
                field2606[field2600++] = arg0[var8];
                field2606[field2600++] = var10;
                field2606[field2600++] = arg0[var7];
                field2606[field2600++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Laa;[IIII[I[I)V")
    private static final void method1224(class281 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method1796(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1225();
        method1223(arg1, arg2, arg3);
        method1231(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1226(var7[3])) {
                    return;
                }
                var8 = field2599;
                var9 = field2602;
                var10 = field2603;
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
            arg0.method1771(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "()V")
    private static final void method1225() {
        field2600 = 0;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)Z")
    private static final boolean method1226(int arg0) {
        int var1 = field2601;
        int var2 = field2605;
        int var3 = field2603;
        while (var2 >= var1) {
            var3++;
            field2603 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field2604;
            while (var1 < field2600) {
                int var5 = field2606[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field2606[var1];
                int var7 = field2606[var1 + 2];
                int var8 = field2606[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field2606[var1] = var10;
                field2606[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field2606[var11 + 3];
                if (var3 >= var12) {
                    field2606[var11] = field2606[var4];
                    field2606[var11 + 1] = field2606[var4 + 1];
                    field2606[var11 + 2] = field2606[var4 + 2];
                    field2606[var11 + 3] = field2606[var4 + 3];
                    var4 += 4;
                }
            }
            if (field2600 == var4) {
                field2600 = 0;
                return false;
            }
            method1227(var4, var1);
            field2604 = var4;
            field2601 = var1;
            var2 = var4;
        }
        field2599 = field2606[var2] >> 16;
        field2602 = field2606[var2 + 4] >> 16;
        field2606[var2] += field2606[var2 + 2];
        field2606[var2 + 4] += field2606[var2 + 6];
        var2 += 8;
        field2605 = var2;
        return true;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)V")
    private static final void method1227(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field2606[var3 - 4];
                    int var5 = field2606[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field2606[var3 - 4] = var5;
                        field2606[var3] = var4;
                        int var6 = field2606[var3 - 2];
                        field2606[var3 - 2] = field2606[var3 + 2];
                        field2606[var3 + 2] = var6;
                        int var7 = field2606[var3 - 1];
                        field2606[var3 - 1] = field2606[var3 + 3];
                        field2606[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "()V")
    public static void method1228() {
        field2606 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Laa;[II[I[I)V")
    public static final void method1229(class281 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1224(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Laa;[II)V")
    public static final void method1230(class281 arg0, int[] arg1, int arg2) {
        method1224(arg0, arg1, 0, arg1.length, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    private static final void method1231(int arg0) {
        if (field2600 < 0) {
            field2605 = 0;
            field2601 = 0;
            field2604 = 0;
            field2603 = 2147483646;
            return;
        }
        method1222(0, field2600);
        int var1 = field2606[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field2600; var3 += 4) {
            int var4 = field2606[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field2606[var3];
            int var6 = field2606[var3 + 2];
            int var7 = field2606[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field2606[var3] = (var1 - var4) * var8 + var9;
            field2606[var3 + 2] = var8;
        }
        field2604 = var2;
        field2601 = var3;
        field2605 = var3;
        field2603 = var1 - 1;
    }
}
