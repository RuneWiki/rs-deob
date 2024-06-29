import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class614 {

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
    private static int field8622;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
    private static int field8623;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    private static int field8624;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    private static int field8626;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
    private static int field8627;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
    private static int field8628;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
    private static int field8629;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "[I")
    private static int[] field8625;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)V")
    private static final void method3378(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field8625[arg0];
        int var4 = field8625[arg0 + 1];
        int var5 = field8625[arg0 + 2];
        int var6 = field8625[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field8625[var7 + 1];
            if (var8 < var4) {
                field8625[var2] = field8625[var7];
                field8625[var2 + 1] = var8;
                field8625[var2 + 2] = field8625[var7 + 2];
                field8625[var2 + 3] = field8625[var7 + 3];
                var2 += 4;
                field8625[var7] = field8625[var2];
                field8625[var7 + 1] = field8625[var2 + 1];
                field8625[var7 + 2] = field8625[var2 + 2];
                field8625[var7 + 3] = field8625[var2 + 3];
            }
        }
        field8625[var2] = var3;
        field8625[var2 + 1] = var4;
        field8625[var2 + 2] = var5;
        field8625[var2 + 3] = var6;
        method3378(arg0, var2);
        method3378(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(II)V")
    private static final void method3379(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field8625[var3 - 4];
                    int var5 = field8625[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field8625[var3 - 4] = var5;
                        field8625[var3] = var4;
                        int var6 = field8625[var3 - 2];
                        field8625[var3 - 2] = field8625[var3 + 2];
                        field8625[var3 + 2] = var6;
                        int var7 = field8625[var3 - 1];
                        field8625[var3 - 1] = field8625[var3 + 3];
                        field8625[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lr;[II)V")
    public static final void method3380(class566 arg0, int[] arg1, int arg2) {
        method3384(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lr;[II[I[I)V")
    public static final void method3381(class566 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method3384(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)Z")
    private static final boolean method3382(int arg0) {
        int var1 = field8628;
        int var2 = field8626;
        int var3 = field8627;
        while (var2 >= var1) {
            var3++;
            field8627 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field8623;
            while (var1 < field8624) {
                int var5 = field8625[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field8625[var1];
                int var7 = field8625[var1 + 2];
                int var8 = field8625[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field8625[var1] = var10;
                field8625[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field8625[var11 + 3];
                if (var3 >= var12) {
                    field8625[var11] = field8625[var4];
                    field8625[var11 + 1] = field8625[var4 + 1];
                    field8625[var11 + 2] = field8625[var4 + 2];
                    field8625[var11 + 3] = field8625[var4 + 3];
                    var4 += 4;
                }
            }
            if (field8624 == var4) {
                field8624 = 0;
                return false;
            }
            method3379(var4, var1);
            field8623 = var4;
            field8628 = var1;
            var2 = var4;
        }
        field8622 = field8625[var2] >> 16;
        field8629 = field8625[var2 + 4] >> 16;
        field8625[var2] += field8625[var2 + 2];
        field8625[var2 + 4] += field8625[var2 + 6];
        var2 += 8;
        field8626 = var2;
        return true;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "()V")
    public static void method3383() {
        field8625 = null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lr;[IIII[I[I)V")
    private static final void method3384(class566 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method1060(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method3387();
        method3386(arg1, arg2, arg3);
        method3385(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method3382(var7[3])) {
                    return;
                }
                var8 = field8622;
                var9 = field8629;
                var10 = field8627;
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
            arg0.method1084(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V")
    private static final void method3385(int arg0) {
        if (field8624 < 0) {
            field8626 = 0;
            field8628 = 0;
            field8623 = 0;
            field8627 = 2147483646;
            return;
        }
        method3378(0, field8624);
        int var1 = field8625[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field8624; var3 += 4) {
            int var4 = field8625[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field8625[var3];
            int var6 = field8625[var3 + 2];
            int var7 = field8625[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field8625[var3] = (var1 - var4) * var8 + var9;
            field8625[var3 + 2] = var8;
        }
        field8623 = var2;
        field8628 = var3;
        field8626 = var3;
        field8627 = var1 - 1;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "([III)V")
    private static final void method3386(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field8624;
        if (field8625 == null || field8625.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field8624; var5++) {
                var4[var5] = field8625[var5];
            }
            field8625 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field8625[field8624++] = arg0[var7];
                field8625[field8624++] = var9;
                field8625[field8624++] = arg0[var8];
                field8625[field8624++] = var10;
            } else if (var10 < var9) {
                field8625[field8624++] = arg0[var8];
                field8625[field8624++] = var10;
                field8625[field8624++] = arg0[var7];
                field8625[field8624++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "()V")
    private static final void method3387() {
        field8624 = 0;
    }
}
