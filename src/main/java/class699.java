import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class699 {

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    private static int field9711;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    private static int field9712;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    private static int field9714;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    private static int field9715;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
    private static int field9716;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
    private static int field9717;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
    private static int field9718;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "[I")
    private static int[] field9713;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)V", line = 5)
    private static final void method3933(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field9713[arg0];
        int var4 = field9713[arg0 + 1];
        int var5 = field9713[arg0 + 2];
        int var6 = field9713[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field9713[var7 + 1];
            if (var8 < var4) {
                field9713[var2] = field9713[var7];
                field9713[var2 + 1] = var8;
                field9713[var2 + 2] = field9713[var7 + 2];
                field9713[var2 + 3] = field9713[var7 + 3];
                var2 += 4;
                field9713[var7] = field9713[var2];
                field9713[var7 + 1] = field9713[var2 + 1];
                field9713[var7 + 2] = field9713[var2 + 2];
                field9713[var7 + 3] = field9713[var2 + 3];
            }
        }
        field9713[var2] = var3;
        field9713[var2 + 1] = var4;
        field9713[var2 + 2] = var5;
        field9713[var2 + 3] = var6;
        method3933(arg0, var2);
        method3933(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "()V", line = 50)
    private static final void method3934() {
        field9715 = 0;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(II)V", line = 54)
    private static final void method3935(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field9713[var3 - 4];
                    int var5 = field9713[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field9713[var3 - 4] = var5;
                        field9713[var3] = var4;
                        int var6 = field9713[var3 - 2];
                        field9713[var3 - 2] = field9713[var3 + 2];
                        field9713[var3 + 2] = var6;
                        int var7 = field9713[var3 - 1];
                        field9713[var3 - 1] = field9713[var3 + 3];
                        field9713[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lha;[II)V", line = 91)
    public static final void method3936(class59 arg0, int[] arg1, int arg2) {
        method3938(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lha;[II[I[I)V", line = 96)
    public static final void method3937(class59 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method3938(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lha;[IIII[I[I)V", line = 104)
    private static final void method3938(class59 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method393(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method3934();
        method3940(arg1, arg2, arg3);
        method3942(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method3941(var7[3])) {
                    return;
                }
                var8 = field9718;
                var9 = field9712;
                var10 = field9714;
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
            arg0.method480(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "()V", line = 140)
    public static void method3939() {
        field9713 = null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "([III)V", line = 146)
    private static final void method3940(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field9715;
        if (field9713 == null || field9713.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field9715; var5++) {
                var4[var5] = field9713[var5];
            }
            field9713 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field9713[field9715++] = arg0[var7];
                field9713[field9715++] = var9;
                field9713[field9715++] = arg0[var8];
                field9713[field9715++] = var10;
            } else if (var10 < var9) {
                field9713[field9715++] = arg0[var8];
                field9713[field9715++] = var10;
                field9713[field9715++] = arg0[var7];
                field9713[field9715++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)Z", line = 196)
    private static final boolean method3941(int arg0) {
        int var1 = field9716;
        int var2 = field9717;
        int var3 = field9714;
        while (var2 >= var1) {
            var3++;
            field9714 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field9711;
            while (var1 < field9715) {
                int var5 = field9713[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field9713[var1];
                int var7 = field9713[var1 + 2];
                int var8 = field9713[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field9713[var1] = var10;
                field9713[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field9713[var11 + 3];
                if (var3 >= var12) {
                    field9713[var11] = field9713[var4];
                    field9713[var11 + 1] = field9713[var4 + 1];
                    field9713[var11 + 2] = field9713[var4 + 2];
                    field9713[var11 + 3] = field9713[var4 + 3];
                    var4 += 4;
                }
            }
            if (field9715 == var4) {
                field9715 = 0;
                return false;
            }
            method3935(var4, var1);
            field9711 = var4;
            field9716 = var1;
            var2 = var4;
        }
        field9718 = field9713[var2] >> 16;
        field9712 = field9713[var2 + 4] >> 16;
        field9713[var2] += field9713[var2 + 2];
        field9713[var2 + 4] += field9713[var2 + 6];
        var2 += 8;
        field9717 = var2;
        return true;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V", line = 275)
    private static final void method3942(int arg0) {
        if (field9715 < 0) {
            field9717 = 0;
            field9716 = 0;
            field9711 = 0;
            field9714 = 2147483646;
            return;
        }
        method3933(0, field9715);
        int var1 = field9713[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field9715; var3 += 4) {
            int var4 = field9713[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field9713[var3];
            int var6 = field9713[var3 + 2];
            int var7 = field9713[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field9713[var3] = (var1 - var4) * var8 + var9;
            field9713[var3 + 2] = var8;
        }
        field9711 = var2;
        field9716 = var3;
        field9717 = var3;
        field9714 = var1 - 1;
    }
}
