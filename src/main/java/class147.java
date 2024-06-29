import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class147 {

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    private static int field2455;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    private static int field2456;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    private static int field2458;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    private static int field2459;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    private static int field2460;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    private static int field2461;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    private static int field2462;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "[I")
    private static int[] field2457;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
    public static void method1087() {
        field2457 = null;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "()V")
    private static final void method1088() {
        field2455 = 0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
    private static final void method1089(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field2457[arg0];
        int var4 = field2457[arg0 + 1];
        int var5 = field2457[arg0 + 2];
        int var6 = field2457[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field2457[var7 + 1];
            if (var8 < var4) {
                field2457[var2] = field2457[var7];
                field2457[var2 + 1] = var8;
                field2457[var2 + 2] = field2457[var7 + 2];
                field2457[var2 + 3] = field2457[var7 + 3];
                var2 += 4;
                field2457[var7] = field2457[var2];
                field2457[var7 + 1] = field2457[var2 + 1];
                field2457[var7 + 2] = field2457[var2 + 2];
                field2457[var7 + 3] = field2457[var2 + 3];
            }
        }
        field2457[var2] = var3;
        field2457[var2 + 1] = var4;
        field2457[var2 + 2] = var5;
        field2457[var2 + 3] = var6;
        method1089(arg0, var2);
        method1089(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([III)V")
    private static final void method1090(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field2455;
        if (field2457 == null || field2457.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field2455; var5++) {
                var4[var5] = field2457[var5];
            }
            field2457 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field2457[field2455++] = arg0[var7];
                field2457[field2455++] = var9;
                field2457[field2455++] = arg0[var8];
                field2457[field2455++] = var10;
            } else if (var10 < var9) {
                field2457[field2455++] = arg0[var8];
                field2457[field2455++] = var10;
                field2457[field2455++] = arg0[var7];
                field2457[field2455++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lza;[IIII[I[I)V")
    private static final void method1091(class288 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method387(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1088();
        method1090(arg1, arg2, arg3);
        method1095(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1094(var7[3])) {
                    return;
                }
                var8 = field2459;
                var9 = field2460;
                var10 = field2458;
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
            arg0.method345(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lza;[II[I[I)V")
    public static final void method1092(class288 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1091(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)V")
    private static final void method1093(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field2457[var3 - 4];
                    int var5 = field2457[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field2457[var3 - 4] = var5;
                        field2457[var3] = var4;
                        int var6 = field2457[var3 - 2];
                        field2457[var3 - 2] = field2457[var3 + 2];
                        field2457[var3 + 2] = var6;
                        int var7 = field2457[var3 - 1];
                        field2457[var3 - 1] = field2457[var3 + 3];
                        field2457[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)Z")
    private static final boolean method1094(int arg0) {
        int var1 = field2461;
        int var2 = field2462;
        int var3 = field2458;
        while (var2 >= var1) {
            var3++;
            field2458 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field2456;
            while (var1 < field2455) {
                int var5 = field2457[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field2457[var1];
                int var7 = field2457[var1 + 2];
                int var8 = field2457[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field2457[var1] = var10;
                field2457[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field2457[var11 + 3];
                if (var3 >= var12) {
                    field2457[var11] = field2457[var4];
                    field2457[var11 + 1] = field2457[var4 + 1];
                    field2457[var11 + 2] = field2457[var4 + 2];
                    field2457[var11 + 3] = field2457[var4 + 3];
                    var4 += 4;
                }
            }
            if (field2455 == var4) {
                field2455 = 0;
                return false;
            }
            method1093(var4, var1);
            field2456 = var4;
            field2461 = var1;
            var2 = var4;
        }
        field2459 = field2457[var2] >> 16;
        field2460 = field2457[var2 + 4] >> 16;
        field2457[var2] += field2457[var2 + 2];
        field2457[var2 + 4] += field2457[var2 + 6];
        var2 += 8;
        field2462 = var2;
        return true;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    private static final void method1095(int arg0) {
        if (field2455 < 0) {
            field2462 = 0;
            field2461 = 0;
            field2456 = 0;
            field2458 = 2147483646;
            return;
        }
        method1089(0, field2455);
        int var1 = field2457[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field2455; var3 += 4) {
            int var4 = field2457[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field2457[var3];
            int var6 = field2457[var3 + 2];
            int var7 = field2457[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field2457[var3] = (var1 - var4) * var8 + var9;
            field2457[var3 + 2] = var8;
        }
        field2456 = var2;
        field2461 = var3;
        field2462 = var3;
        field2458 = var1 - 1;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lza;[II)V")
    public static final void method1096(class288 arg0, int[] arg1, int arg2) {
        method1091(arg0, arg1, 0, arg1.length, arg2, null, null);
    }
}
