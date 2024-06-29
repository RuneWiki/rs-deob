import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class419 {

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
    private static int field6098;

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
    private static int field6099;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
    private static int field6100;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
    private static int field6102;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "I")
    private static int field6103;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
    private static int field6104;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
    private static int field6105;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "[I")
    private static int[] field6101;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V", line = 3)
    private static final void method2636(int arg0) {
        if (field6104 < 0) {
            field6103 = 0;
            field6098 = 0;
            field6105 = 0;
            field6099 = 2147483646;
            return;
        }
        method2643(0, field6104);
        int var1 = field6101[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field6104; var3 += 4) {
            int var4 = field6101[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field6101[var3];
            int var6 = field6101[var3 + 2];
            int var7 = field6101[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field6101[var3] = (var1 - var4) * var8 + var9;
            field6101[var3 + 2] = var8;
        }
        field6105 = var2;
        field6098 = var3;
        field6103 = var3;
        field6099 = var1 - 1;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "()V", line = 48)
    public static void method2637() {
        field6101 = null;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ltj;[IIII[I[I)V", line = 55)
    private static final void method2638(class298 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method474(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method2639();
        method2642(arg1, arg2, arg3);
        method2636(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method2640(var7[3])) {
                    return;
                }
                var8 = field6102;
                var9 = field6100;
                var10 = field6099;
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
            arg0.method510(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "()V", line = 93)
    private static final void method2639() {
        field6104 = 0;
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)Z", line = 98)
    private static final boolean method2640(int arg0) {
        int var1 = field6098;
        int var2 = field6103;
        int var3 = field6099;
        while (var2 >= var1) {
            var3++;
            field6099 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field6105;
            while (var1 < field6104) {
                int var5 = field6101[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field6101[var1];
                int var7 = field6101[var1 + 2];
                int var8 = field6101[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field6101[var1] = var10;
                field6101[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field6101[var11 + 3];
                if (var3 >= var12) {
                    field6101[var11] = field6101[var4];
                    field6101[var11 + 1] = field6101[var4 + 1];
                    field6101[var11 + 2] = field6101[var4 + 2];
                    field6101[var11 + 3] = field6101[var4 + 3];
                    var4 += 4;
                }
            }
            if (field6104 == var4) {
                field6104 = 0;
                return false;
            }
            method2645(var4, var1);
            field6105 = var4;
            field6098 = var1;
            var2 = var4;
        }
        field6102 = field6101[var2] >> 16;
        field6100 = field6101[var2 + 4] >> 16;
        field6101[var2] += field6101[var2 + 2];
        field6101[var2 + 4] += field6101[var2 + 6];
        var2 += 8;
        field6103 = var2;
        return true;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ltj;[II[I[I)V", line = 174)
    public static final void method2641(class298 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method2638(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "([III)V", line = 184)
    private static final void method2642(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field6104;
        if (field6101 == null || field6101.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field6104; var5++) {
                var4[var5] = field6101[var5];
            }
            field6101 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field6101[field6104++] = arg0[var7];
                field6101[field6104++] = var9;
                field6101[field6104++] = arg0[var8];
                field6101[field6104++] = var10;
            } else if (var10 < var9) {
                field6101[field6104++] = arg0[var8];
                field6101[field6104++] = var10;
                field6101[field6104++] = arg0[var7];
                field6101[field6104++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)V", line = 234)
    private static final void method2643(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field6101[arg0];
        int var4 = field6101[arg0 + 1];
        int var5 = field6101[arg0 + 2];
        int var6 = field6101[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field6101[var7 + 1];
            if (var8 < var4) {
                field6101[var2] = field6101[var7];
                field6101[var2 + 1] = var8;
                field6101[var2 + 2] = field6101[var7 + 2];
                field6101[var2 + 3] = field6101[var7 + 3];
                var2 += 4;
                field6101[var7] = field6101[var2];
                field6101[var7 + 1] = field6101[var2 + 1];
                field6101[var7 + 2] = field6101[var2 + 2];
                field6101[var7 + 3] = field6101[var2 + 3];
            }
        }
        field6101[var2] = var3;
        field6101[var2 + 1] = var4;
        field6101[var2 + 2] = var5;
        field6101[var2 + 3] = var6;
        method2643(arg0, var2);
        method2643(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ltj;[II)V", line = 279)
    public static final void method2644(class298 arg0, int[] arg1, int arg2) {
        method2638(arg0, arg1, 0, arg1.length, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(II)V", line = 283)
    private static final void method2645(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field6101[var3 - 4];
                    int var5 = field6101[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field6101[var3 - 4] = var5;
                        field6101[var3] = var4;
                        int var6 = field6101[var3 - 2];
                        field6101[var3 - 2] = field6101[var3 + 2];
                        field6101[var3 + 2] = var6;
                        int var7 = field6101[var3 - 1];
                        field6101[var3 - 1] = field6101[var3 + 3];
                        field6101[var3 + 3] = var7;
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
