import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class217 {

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    private static int field2994;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    private static int field2996;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    private static int field2997;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    private static int field2998;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    private static int field2999;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    private static int field3000;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    private static int field3001;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "[I")
    private static int[] field2995;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V")
    private static final void method1479(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field2995[arg0];
        int var4 = field2995[arg0 + 1];
        int var5 = field2995[arg0 + 2];
        int var6 = field2995[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field2995[var7 + 1];
            if (var8 < var4) {
                field2995[var2] = field2995[var7];
                field2995[var2 + 1] = var8;
                field2995[var2 + 2] = field2995[var7 + 2];
                field2995[var2 + 3] = field2995[var7 + 3];
                var2 += 4;
                field2995[var7] = field2995[var2];
                field2995[var7 + 1] = field2995[var2 + 1];
                field2995[var7 + 2] = field2995[var2 + 2];
                field2995[var7 + 3] = field2995[var2 + 3];
            }
        }
        field2995[var2] = var3;
        field2995[var2 + 1] = var4;
        field2995[var2 + 2] = var5;
        field2995[var2 + 3] = var6;
        method1479(arg0, var2);
        method1479(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lpe;[II[I[I)V")
    public static final void method1480(class391 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1487(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)Z")
    private static final boolean method1481(int arg0) {
        int var1 = field3001;
        int var2 = field2997;
        int var3 = field3000;
        while (var2 >= var1) {
            var3++;
            field3000 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field2994;
            while (var1 < field2998) {
                int var5 = field2995[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field2995[var1];
                int var7 = field2995[var1 + 2];
                int var8 = field2995[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field2995[var1] = var10;
                field2995[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field2995[var11 + 3];
                if (var3 >= var12) {
                    field2995[var11] = field2995[var4];
                    field2995[var11 + 1] = field2995[var4 + 1];
                    field2995[var11 + 2] = field2995[var4 + 2];
                    field2995[var11 + 3] = field2995[var4 + 3];
                    var4 += 4;
                }
            }
            if (field2998 == var4) {
                field2998 = 0;
                return false;
            }
            method1488(var4, var1);
            field2994 = var4;
            field3001 = var1;
            var2 = var4;
        }
        field2999 = field2995[var2] >> 16;
        field2996 = field2995[var2 + 4] >> 16;
        field2995[var2] += field2995[var2 + 2];
        field2995[var2 + 4] += field2995[var2 + 6];
        var2 += 8;
        field2997 = var2;
        return true;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
    private static final void method1482(int arg0) {
        if (field2998 < 0) {
            field2997 = 0;
            field3001 = 0;
            field2994 = 0;
            field3000 = 2147483646;
            return;
        }
        method1479(0, field2998);
        int var1 = field2995[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field2998; var3 += 4) {
            int var4 = field2995[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field2995[var3];
            int var6 = field2995[var3 + 2];
            int var7 = field2995[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field2995[var3] = (var1 - var4) * var8 + var9;
            field2995[var3 + 2] = var8;
        }
        field2994 = var2;
        field3001 = var3;
        field2997 = var3;
        field3000 = var1 - 1;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "()V")
    public static void method1483() {
        field2995 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lpe;[II)V")
    public static final void method1484(class391 arg0, int[] arg1, int arg2) {
        method1487(arg0, arg1, 0, arg1.length, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([III)V")
    private static final void method1485(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field2998;
        if (field2995 == null || field2995.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field2998; var5++) {
                var4[var5] = field2995[var5];
            }
            field2995 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field2995[field2998++] = arg0[var7];
                field2995[field2998++] = var9;
                field2995[field2998++] = arg0[var8];
                field2995[field2998++] = var10;
            } else if (var10 < var9) {
                field2995[field2998++] = arg0[var8];
                field2995[field2998++] = var10;
                field2995[field2998++] = arg0[var7];
                field2995[field2998++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "()V")
    private static final void method1486() {
        field2998 = 0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lpe;[IIII[I[I)V")
    private static final void method1487(class391 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method90(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1486();
        method1485(arg1, arg2, arg3);
        method1482(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1481(var7[3])) {
                    return;
                }
                var8 = field2999;
                var9 = field2996;
                var10 = field3000;
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
            arg0.method259(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)V")
    private static final void method1488(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field2995[var3 - 4];
                    int var5 = field2995[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field2995[var3 - 4] = var5;
                        field2995[var3] = var4;
                        int var6 = field2995[var3 - 2];
                        field2995[var3 - 2] = field2995[var3 + 2];
                        field2995[var3 + 2] = var6;
                        int var7 = field2995[var3 - 1];
                        field2995[var3 - 1] = field2995[var3 + 3];
                        field2995[var3 + 3] = var7;
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
