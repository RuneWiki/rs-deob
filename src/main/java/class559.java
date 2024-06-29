import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class559 {

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "I")
    private static int field8163;

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "I")
    private static int field8165;

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "I")
    private static int field8166;

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "I")
    private static int field8167;

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "I")
    private static int field8168;

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "I")
    private static int field8169;

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "I")
    private static int field8170;

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "[I")
    private static int[] field8164;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lr;[IIII[I[I)V", line = 6)
    private static final void method3267(class98 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method764(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method3274();
        method3275(arg1, arg2, arg3);
        method3273(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method3272(var7[3])) {
                    return;
                }
                var8 = field8166;
                var9 = field8168;
                var10 = field8167;
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
            arg0.method741(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "()V", line = 43)
    public static void method3268() {
        field8164 = null;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lr;[II)V", line = 46)
    public static final void method3269(class98 arg0, int[] arg1, int arg2) {
        method3267(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lr;[II[I[I)V", line = 49)
    public static final void method3270(class98 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method3267(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(II)V", line = 52)
    private static final void method3271(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field8164[var3 - 4];
                    int var5 = field8164[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field8164[var3 - 4] = var5;
                        field8164[var3] = var4;
                        int var6 = field8164[var3 - 2];
                        field8164[var3 - 2] = field8164[var3 + 2];
                        field8164[var3 + 2] = var6;
                        int var7 = field8164[var3 - 1];
                        field8164[var3 - 1] = field8164[var3 + 3];
                        field8164[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)Z", line = 90)
    private static final boolean method3272(int arg0) {
        int var1 = field8169;
        int var2 = field8170;
        int var3 = field8167;
        while (var2 >= var1) {
            var3++;
            field8167 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field8163;
            while (var1 < field8165) {
                int var5 = field8164[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field8164[var1];
                int var7 = field8164[var1 + 2];
                int var8 = field8164[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field8164[var1] = var10;
                field8164[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field8164[var11 + 3];
                if (var3 >= var12) {
                    field8164[var11] = field8164[var4];
                    field8164[var11 + 1] = field8164[var4 + 1];
                    field8164[var11 + 2] = field8164[var4 + 2];
                    field8164[var11 + 3] = field8164[var4 + 3];
                    var4 += 4;
                }
            }
            if (field8165 == var4) {
                field8165 = 0;
                return false;
            }
            method3271(var4, var1);
            field8163 = var4;
            field8169 = var1;
            var2 = var4;
        }
        field8166 = field8164[var2] >> 16;
        field8168 = field8164[var2 + 4] >> 16;
        field8164[var2] += field8164[var2 + 2];
        field8164[var2 + 4] += field8164[var2 + 6];
        var2 += 8;
        field8170 = var2;
        return true;
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)V", line = 167)
    private static final void method3273(int arg0) {
        if (field8165 < 0) {
            field8170 = 0;
            field8169 = 0;
            field8163 = 0;
            field8167 = 2147483646;
            return;
        }
        method3276(0, field8165);
        int var1 = field8164[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field8165; var3 += 4) {
            int var4 = field8164[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field8164[var3];
            int var6 = field8164[var3 + 2];
            int var7 = field8164[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field8164[var3] = (var1 - var4) * var8 + var9;
            field8164[var3 + 2] = var8;
        }
        field8163 = var2;
        field8169 = var3;
        field8170 = var3;
        field8167 = var1 - 1;
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "()V", line = 216)
    private static final void method3274() {
        field8165 = 0;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "([III)V", line = 224)
    private static final void method3275(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field8165;
        if (field8164 == null || field8164.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field8165; var5++) {
                var4[var5] = field8164[var5];
            }
            field8164 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field8164[field8165++] = arg0[var7];
                field8164[field8165++] = var9;
                field8164[field8165++] = arg0[var8];
                field8164[field8165++] = var10;
            } else if (var10 < var9) {
                field8164[field8165++] = arg0[var8];
                field8164[field8165++] = var10;
                field8164[field8165++] = arg0[var7];
                field8164[field8165++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(II)V", line = 276)
    private static final void method3276(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field8164[arg0];
        int var4 = field8164[arg0 + 1];
        int var5 = field8164[arg0 + 2];
        int var6 = field8164[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field8164[var7 + 1];
            if (var8 < var4) {
                field8164[var2] = field8164[var7];
                field8164[var2 + 1] = var8;
                field8164[var2 + 2] = field8164[var7 + 2];
                field8164[var2 + 3] = field8164[var7 + 3];
                var2 += 4;
                field8164[var7] = field8164[var2];
                field8164[var7 + 1] = field8164[var2 + 1];
                field8164[var7 + 2] = field8164[var2 + 2];
                field8164[var7 + 3] = field8164[var2 + 3];
            }
        }
        field8164[var2] = var3;
        field8164[var2 + 1] = var4;
        field8164[var2 + 2] = var5;
        field8164[var2 + 3] = var6;
        method3276(arg0, var2);
        method3276(var2 + 4, arg1);
    }
}
