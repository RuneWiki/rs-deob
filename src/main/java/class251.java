import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class251 {

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    private static int field3436;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    private static int field3437;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    private static int field3438;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    private static int field3439;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    private static int field3440;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    private static int field3441;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    private static int field3442;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "[I")
    private static int[] field3435;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "()V")
    private static final void method1392() {
        field3436 = 0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)V")
    private static final void method1393(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field3435[arg0];
        int var4 = field3435[arg0 + 1];
        int var5 = field3435[arg0 + 2];
        int var6 = field3435[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field3435[var7 + 1];
            if (var8 < var4) {
                field3435[var2] = field3435[var7];
                field3435[var2 + 1] = var8;
                field3435[var2 + 2] = field3435[var7 + 2];
                field3435[var2 + 3] = field3435[var7 + 3];
                var2 += 4;
                field3435[var7] = field3435[var2];
                field3435[var7 + 1] = field3435[var2 + 1];
                field3435[var7 + 2] = field3435[var2 + 2];
                field3435[var7 + 3] = field3435[var2 + 3];
            }
        }
        field3435[var2] = var3;
        field3435[var2 + 1] = var4;
        field3435[var2 + 2] = var5;
        field3435[var2 + 3] = var6;
        method1393(arg0, var2);
        method1393(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lvm;[IIII[I[I)V")
    private static final void method1394(class322 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method1629(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1392();
        method1401(arg1, arg2, arg3);
        method1397(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1399(var7[3])) {
                    return;
                }
                var8 = field3442;
                var9 = field3439;
                var10 = field3440;
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
            arg0.method1591(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lvm;[II[I[I)V")
    public static final void method1395(class322 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1394(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(II)V")
    private static final void method1396(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field3435[var3 - 4];
                    int var5 = field3435[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field3435[var3 - 4] = var5;
                        field3435[var3] = var4;
                        int var6 = field3435[var3 - 2];
                        field3435[var3 - 2] = field3435[var3 + 2];
                        field3435[var3 + 2] = var6;
                        int var7 = field3435[var3 - 1];
                        field3435[var3 - 1] = field3435[var3 + 3];
                        field3435[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    private static final void method1397(int arg0) {
        if (field3436 < 0) {
            field3437 = 0;
            field3438 = 0;
            field3441 = 0;
            field3440 = 2147483646;
            return;
        }
        method1393(0, field3436);
        int var1 = field3435[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field3436; var3 += 4) {
            int var4 = field3435[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field3435[var3];
            int var6 = field3435[var3 + 2];
            int var7 = field3435[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field3435[var3] = (var1 - var4) * var8 + var9;
            field3435[var3 + 2] = var8;
        }
        field3441 = var2;
        field3438 = var3;
        field3437 = var3;
        field3440 = var1 - 1;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "()V")
    public static void method1398() {
        field3435 = null;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)Z")
    private static final boolean method1399(int arg0) {
        int var1 = field3438;
        int var2 = field3437;
        int var3 = field3440;
        while (var2 >= var1) {
            var3++;
            field3440 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field3441;
            while (var1 < field3436) {
                int var5 = field3435[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field3435[var1];
                int var7 = field3435[var1 + 2];
                int var8 = field3435[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field3435[var1] = var10;
                field3435[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field3435[var11 + 3];
                if (var3 >= var12) {
                    field3435[var11] = field3435[var4];
                    field3435[var11 + 1] = field3435[var4 + 1];
                    field3435[var11 + 2] = field3435[var4 + 2];
                    field3435[var11 + 3] = field3435[var4 + 3];
                    var4 += 4;
                }
            }
            if (field3436 == var4) {
                field3436 = 0;
                return false;
            }
            method1396(var4, var1);
            field3441 = var4;
            field3438 = var1;
            var2 = var4;
        }
        field3442 = field3435[var2] >> 16;
        field3439 = field3435[var2 + 4] >> 16;
        field3435[var2] += field3435[var2 + 2];
        field3435[var2 + 4] += field3435[var2 + 6];
        var2 += 8;
        field3437 = var2;
        return true;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lvm;[II)V")
    public static final void method1400(class322 arg0, int[] arg1, int arg2) {
        method1394(arg0, arg1, 0, arg1.length, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([III)V")
    private static final void method1401(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field3436;
        if (field3435 == null || field3435.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field3436; var5++) {
                var4[var5] = field3435[var5];
            }
            field3435 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field3435[field3436++] = arg0[var7];
                field3435[field3436++] = var9;
                field3435[field3436++] = arg0[var8];
                field3435[field3436++] = var10;
            } else if (var10 < var9) {
                field3435[field3436++] = arg0[var8];
                field3435[field3436++] = var10;
                field3435[field3436++] = arg0[var7];
                field3435[field3436++] = var9;
            }
            var7 = var8;
        }
    }
}
