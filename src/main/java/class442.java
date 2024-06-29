import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class442 {

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
    private static int field6494;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    private static int field6495;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
    private static int field6497;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    private static int field6498;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
    private static int field6499;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    private static int field6500;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
    private static int field6501;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "[I")
    private static int[] field6496;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "([III)V")
    private static final void method3391(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field6500;
        if (field6496 == null || field6496.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field6500; var5++) {
                var4[var5] = field6496[var5];
            }
            field6496 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field6496[field6500++] = arg0[var7];
                field6496[field6500++] = var9;
                field6496[field6500++] = arg0[var8];
                field6496[field6500++] = var10;
            } else if (var10 < var9) {
                field6496[field6500++] = arg0[var8];
                field6496[field6500++] = var10;
                field6496[field6500++] = arg0[var7];
                field6496[field6500++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "()V")
    private static final void method3392() {
        field6500 = 0;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)V")
    private static final void method3393(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field6496[arg0];
        int var4 = field6496[arg0 + 1];
        int var5 = field6496[arg0 + 2];
        int var6 = field6496[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field6496[var7 + 1];
            if (var8 < var4) {
                field6496[var2] = field6496[var7];
                field6496[var2 + 1] = var8;
                field6496[var2 + 2] = field6496[var7 + 2];
                field6496[var2 + 3] = field6496[var7 + 3];
                var2 += 4;
                field6496[var7] = field6496[var2];
                field6496[var7 + 1] = field6496[var2 + 1];
                field6496[var7 + 2] = field6496[var2 + 2];
                field6496[var7 + 3] = field6496[var2 + 3];
            }
        }
        field6496[var2] = var3;
        field6496[var2 + 1] = var4;
        field6496[var2 + 2] = var5;
        field6496[var2 + 3] = var6;
        method3393(arg0, var2);
        method3393(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(II)V")
    private static final void method3394(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field6496[var3 - 4];
                    int var5 = field6496[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field6496[var3 - 4] = var5;
                        field6496[var3] = var4;
                        int var6 = field6496[var3 - 2];
                        field6496[var3 - 2] = field6496[var3 + 2];
                        field6496[var3 + 2] = var6;
                        int var7 = field6496[var3 - 1];
                        field6496[var3 - 1] = field6496[var3 + 3];
                        field6496[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)Z")
    private static final boolean method3395(int arg0) {
        int var1 = field6495;
        int var2 = field6494;
        int var3 = field6497;
        while (var2 >= var1) {
            var3++;
            field6497 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field6501;
            while (var1 < field6500) {
                int var5 = field6496[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field6496[var1];
                int var7 = field6496[var1 + 2];
                int var8 = field6496[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field6496[var1] = var10;
                field6496[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field6496[var11 + 3];
                if (var3 >= var12) {
                    field6496[var11] = field6496[var4];
                    field6496[var11 + 1] = field6496[var4 + 1];
                    field6496[var11 + 2] = field6496[var4 + 2];
                    field6496[var11 + 3] = field6496[var4 + 3];
                    var4 += 4;
                }
            }
            if (field6500 == var4) {
                field6500 = 0;
                return false;
            }
            method3394(var4, var1);
            field6501 = var4;
            field6495 = var1;
            var2 = var4;
        }
        field6499 = field6496[var2] >> 16;
        field6498 = field6496[var2 + 4] >> 16;
        field6496[var2] += field6496[var2 + 2];
        field6496[var2 + 4] += field6496[var2 + 6];
        var2 += 8;
        field6494 = var2;
        return true;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lha;[II[I[I)V")
    public static final void method3396(class66 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method3399(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V")
    private static final void method3397(int arg0) {
        if (field6500 < 0) {
            field6494 = 0;
            field6495 = 0;
            field6501 = 0;
            field6497 = 2147483646;
            return;
        }
        method3393(0, field6500);
        int var1 = field6496[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field6500; var3 += 4) {
            int var4 = field6496[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field6496[var3];
            int var6 = field6496[var3 + 2];
            int var7 = field6496[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field6496[var3] = (var1 - var4) * var8 + var9;
            field6496[var3 + 2] = var8;
        }
        field6501 = var2;
        field6495 = var3;
        field6494 = var3;
        field6497 = var1 - 1;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "()V")
    public static void method3398() {
        field6496 = null;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lha;[IIII[I[I)V")
    private static final void method3399(class66 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method543(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method3392();
        method3391(arg1, arg2, arg3);
        method3397(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method3395(var7[3])) {
                    return;
                }
                var8 = field6499;
                var9 = field6498;
                var10 = field6497;
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
            arg0.method482(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lha;[II)V")
    public static final void method3400(class66 arg0, int[] arg1, int arg2) {
        method3399(arg0, arg1, 0, arg1.length, arg2, null, null);
    }
}
