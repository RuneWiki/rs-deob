import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class513 {

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    private static int field7462;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    private static int field7464;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
    private static int field7465;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
    private static int field7466;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "I")
    private static int field7467;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "I")
    private static int field7468;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
    private static int field7469;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "[I")
    private static int[] field7463;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lr;[IIII[I[I)V")
    private static final void method3104(class167 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method343(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method3111();
        method3112(arg1, arg2, arg3);
        method3110(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method3107(var7[3])) {
                    return;
                }
                var8 = field7469;
                var9 = field7462;
                var10 = field7464;
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
            arg0.method279(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)V")
    private static final void method3105(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field7463[arg0];
        int var4 = field7463[arg0 + 1];
        int var5 = field7463[arg0 + 2];
        int var6 = field7463[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field7463[var7 + 1];
            if (var8 < var4) {
                field7463[var2] = field7463[var7];
                field7463[var2 + 1] = var8;
                field7463[var2 + 2] = field7463[var7 + 2];
                field7463[var2 + 3] = field7463[var7 + 3];
                var2 += 4;
                field7463[var7] = field7463[var2];
                field7463[var7 + 1] = field7463[var2 + 1];
                field7463[var7 + 2] = field7463[var2 + 2];
                field7463[var7 + 3] = field7463[var2 + 3];
            }
        }
        field7463[var2] = var3;
        field7463[var2 + 1] = var4;
        field7463[var2 + 2] = var5;
        field7463[var2 + 3] = var6;
        method3105(arg0, var2);
        method3105(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lr;[II[I[I)V")
    public static final void method3106(class167 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method3104(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)Z")
    private static final boolean method3107(int arg0) {
        int var1 = field7465;
        int var2 = field7466;
        int var3 = field7464;
        while (var2 >= var1) {
            var3++;
            field7464 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field7467;
            while (var1 < field7468) {
                int var5 = field7463[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field7463[var1];
                int var7 = field7463[var1 + 2];
                int var8 = field7463[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field7463[var1] = var10;
                field7463[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field7463[var11 + 3];
                if (var3 >= var12) {
                    field7463[var11] = field7463[var4];
                    field7463[var11 + 1] = field7463[var4 + 1];
                    field7463[var11 + 2] = field7463[var4 + 2];
                    field7463[var11 + 3] = field7463[var4 + 3];
                    var4 += 4;
                }
            }
            if (field7468 == var4) {
                field7468 = 0;
                return false;
            }
            method3109(var4, var1);
            field7467 = var4;
            field7465 = var1;
            var2 = var4;
        }
        field7469 = field7463[var2] >> 16;
        field7462 = field7463[var2 + 4] >> 16;
        field7463[var2] += field7463[var2 + 2];
        field7463[var2 + 4] += field7463[var2 + 6];
        var2 += 8;
        field7466 = var2;
        return true;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "()V")
    public static void method3108() {
        field7463 = null;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(II)V")
    private static final void method3109(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field7463[var3 - 4];
                    int var5 = field7463[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field7463[var3 - 4] = var5;
                        field7463[var3] = var4;
                        int var6 = field7463[var3 - 2];
                        field7463[var3 - 2] = field7463[var3 + 2];
                        field7463[var3 + 2] = var6;
                        int var7 = field7463[var3 - 1];
                        field7463[var3 - 1] = field7463[var3 + 3];
                        field7463[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V")
    private static final void method3110(int arg0) {
        if (field7468 < 0) {
            field7466 = 0;
            field7465 = 0;
            field7467 = 0;
            field7464 = 2147483646;
            return;
        }
        method3105(0, field7468);
        int var1 = field7463[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field7468; var3 += 4) {
            int var4 = field7463[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field7463[var3];
            int var6 = field7463[var3 + 2];
            int var7 = field7463[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field7463[var3] = (var1 - var4) * var8 + var9;
            field7463[var3 + 2] = var8;
        }
        field7467 = var2;
        field7465 = var3;
        field7466 = var3;
        field7464 = var1 - 1;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "()V")
    private static final void method3111() {
        field7468 = 0;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "([III)V")
    private static final void method3112(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field7468;
        if (field7463 == null || field7463.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field7468; var5++) {
                var4[var5] = field7463[var5];
            }
            field7463 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field7463[field7468++] = arg0[var7];
                field7463[field7468++] = var9;
                field7463[field7468++] = arg0[var8];
                field7463[field7468++] = var10;
            } else if (var10 < var9) {
                field7463[field7468++] = arg0[var8];
                field7463[field7468++] = var10;
                field7463[field7468++] = arg0[var7];
                field7463[field7468++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lr;[II)V")
    public static final void method3113(class167 arg0, int[] arg1, int arg2) {
        method3104(arg0, arg1, 0, arg1.length, arg2, null, null);
    }
}
