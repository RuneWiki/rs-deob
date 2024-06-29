import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class182 {

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    private static int field2725;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    private static int field2726;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    private static int field2727;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    private static int field2728;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    private static int field2729;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    private static int field2730;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    private static int field2731;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "[I")
    private static int[] field2732;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    private static final void method1095(int arg0) {
        if (field2729 < 0) {
            field2728 = 0;
            field2731 = 0;
            field2730 = 0;
            field2725 = 2147483646;
            return;
        }
        method1101(0, field2729);
        int var1 = field2732[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field2729; var3 += 4) {
            int var4 = field2732[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field2732[var3];
            int var6 = field2732[var3 + 2];
            int var7 = field2732[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field2732[var3] = (var1 - var4) * var8 + var9;
            field2732[var3 + 2] = var8;
        }
        field2730 = var2;
        field2731 = var3;
        field2728 = var3;
        field2725 = var1 - 1;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()V")
    public static void method1096() {
        field2732 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ldr;[II[I[I)V")
    public static final void method1097(class261 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1099(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
    private static final void method1098(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field2732[var3 - 4];
                    int var5 = field2732[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field2732[var3 - 4] = var5;
                        field2732[var3] = var4;
                        int var6 = field2732[var3 - 2];
                        field2732[var3 - 2] = field2732[var3 + 2];
                        field2732[var3 + 2] = var6;
                        int var7 = field2732[var3 - 1];
                        field2732[var3 - 1] = field2732[var3 + 3];
                        field2732[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ldr;[IIII[I[I)V")
    private static final void method1099(class261 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method415(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1102();
        method1104(arg1, arg2, arg3);
        method1095(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1100(var7[3])) {
                    return;
                }
                var8 = field2726;
                var9 = field2727;
                var10 = field2725;
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
            arg0.method418(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)Z")
    private static final boolean method1100(int arg0) {
        int var1 = field2731;
        int var2 = field2728;
        int var3 = field2725;
        while (var2 >= var1) {
            var3++;
            field2725 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field2730;
            while (var1 < field2729) {
                int var5 = field2732[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field2732[var1];
                int var7 = field2732[var1 + 2];
                int var8 = field2732[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field2732[var1] = var10;
                field2732[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field2732[var11 + 3];
                if (var3 >= var12) {
                    field2732[var11] = field2732[var4];
                    field2732[var11 + 1] = field2732[var4 + 1];
                    field2732[var11 + 2] = field2732[var4 + 2];
                    field2732[var11 + 3] = field2732[var4 + 3];
                    var4 += 4;
                }
            }
            if (field2729 == var4) {
                field2729 = 0;
                return false;
            }
            method1098(var4, var1);
            field2730 = var4;
            field2731 = var1;
            var2 = var4;
        }
        field2726 = field2732[var2] >> 16;
        field2727 = field2732[var2 + 4] >> 16;
        field2732[var2] += field2732[var2 + 2];
        field2732[var2 + 4] += field2732[var2 + 6];
        var2 += 8;
        field2728 = var2;
        return true;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)V")
    private static final void method1101(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field2732[arg0];
        int var4 = field2732[arg0 + 1];
        int var5 = field2732[arg0 + 2];
        int var6 = field2732[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field2732[var7 + 1];
            if (var8 < var4) {
                field2732[var2] = field2732[var7];
                field2732[var2 + 1] = var8;
                field2732[var2 + 2] = field2732[var7 + 2];
                field2732[var2 + 3] = field2732[var7 + 3];
                var2 += 4;
                field2732[var7] = field2732[var2];
                field2732[var7 + 1] = field2732[var2 + 1];
                field2732[var7 + 2] = field2732[var2 + 2];
                field2732[var7 + 3] = field2732[var2 + 3];
            }
        }
        field2732[var2] = var3;
        field2732[var2 + 1] = var4;
        field2732[var2 + 2] = var5;
        field2732[var2 + 3] = var6;
        method1101(arg0, var2);
        method1101(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "()V")
    private static final void method1102() {
        field2729 = 0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ldr;[II)V")
    public static final void method1103(class261 arg0, int[] arg1, int arg2) {
        method1099(arg0, arg1, 0, arg1.length, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([III)V")
    private static final void method1104(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field2729;
        if (field2732 == null || field2732.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field2729; var5++) {
                var4[var5] = field2732[var5];
            }
            field2732 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field2732[field2729++] = arg0[var7];
                field2732[field2729++] = var9;
                field2732[field2729++] = arg0[var8];
                field2732[field2729++] = var10;
            } else if (var10 < var9) {
                field2732[field2729++] = arg0[var8];
                field2732[field2729++] = var10;
                field2732[field2729++] = arg0[var7];
                field2732[field2729++] = var9;
            }
            var7 = var8;
        }
    }
}
