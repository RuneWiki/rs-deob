import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class290 {

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "I")
    private static int field3991;

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "I")
    private static int field3992;

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "I")
    private static int field3994;

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "I")
    private static int field3995;

    @OriginalMember(owner = "client!ow", name = "f", descriptor = "I")
    private static int field3996;

    @OriginalMember(owner = "client!ow", name = "g", descriptor = "I")
    private static int field3997;

    @OriginalMember(owner = "client!ow", name = "h", descriptor = "I")
    private static int field3998;

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "[I")
    private static int[] field3993;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lqa;[II[I[I)V")
    public static final void method1864(class207 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1871(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lqa;[II)V")
    public static final void method1865(class207 arg0, int[] arg1, int arg2) {
        method1871(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "([III)V")
    private static final void method1866(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field3992;
        if (field3993 == null || field3993.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field3992; var5++) {
                var4[var5] = field3993[var5];
            }
            field3993 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field3993[field3992++] = arg0[var7];
                field3993[field3992++] = var9;
                field3993[field3992++] = arg0[var8];
                field3993[field3992++] = var10;
            } else if (var10 < var9) {
                field3993[field3992++] = arg0[var8];
                field3993[field3992++] = var10;
                field3993[field3992++] = arg0[var7];
                field3993[field3992++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)V")
    private static final void method1867(int arg0) {
        if (field3992 < 0) {
            field3997 = 0;
            field3996 = 0;
            field3998 = 0;
            field3994 = 2147483646;
            return;
        }
        method1870(0, field3992);
        int var1 = field3993[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field3992; var3 += 4) {
            int var4 = field3993[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field3993[var3];
            int var6 = field3993[var3 + 2];
            int var7 = field3993[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field3993[var3] = (var1 - var4) * var8 + var9;
            field3993[var3 + 2] = var8;
        }
        field3998 = var2;
        field3996 = var3;
        field3997 = var3;
        field3994 = var1 - 1;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "()V")
    private static final void method1868() {
        field3992 = 0;
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(I)Z")
    private static final boolean method1869(int arg0) {
        int var1 = field3996;
        int var2 = field3997;
        int var3 = field3994;
        while (var2 >= var1) {
            var3++;
            field3994 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field3998;
            while (var1 < field3992) {
                int var5 = field3993[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field3993[var1];
                int var7 = field3993[var1 + 2];
                int var8 = field3993[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field3993[var1] = var10;
                field3993[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field3993[var11 + 3];
                if (var3 >= var12) {
                    field3993[var11] = field3993[var4];
                    field3993[var11 + 1] = field3993[var4 + 1];
                    field3993[var11 + 2] = field3993[var4 + 2];
                    field3993[var11 + 3] = field3993[var4 + 3];
                    var4 += 4;
                }
            }
            if (field3992 == var4) {
                field3992 = 0;
                return false;
            }
            method1873(var4, var1);
            field3998 = var4;
            field3996 = var1;
            var2 = var4;
        }
        field3991 = field3993[var2] >> 16;
        field3995 = field3993[var2 + 4] >> 16;
        field3993[var2] += field3993[var2 + 2];
        field3993[var2 + 4] += field3993[var2 + 6];
        var2 += 8;
        field3997 = var2;
        return true;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(II)V")
    private static final void method1870(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field3993[arg0];
        int var4 = field3993[arg0 + 1];
        int var5 = field3993[arg0 + 2];
        int var6 = field3993[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field3993[var7 + 1];
            if (var8 < var4) {
                field3993[var2] = field3993[var7];
                field3993[var2 + 1] = var8;
                field3993[var2 + 2] = field3993[var7 + 2];
                field3993[var2 + 3] = field3993[var7 + 3];
                var2 += 4;
                field3993[var7] = field3993[var2];
                field3993[var7 + 1] = field3993[var2 + 1];
                field3993[var7 + 2] = field3993[var2 + 2];
                field3993[var7 + 3] = field3993[var2 + 3];
            }
        }
        field3993[var2] = var3;
        field3993[var2 + 1] = var4;
        field3993[var2 + 2] = var5;
        field3993[var2 + 3] = var6;
        method1870(arg0, var2);
        method1870(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lqa;[IIII[I[I)V")
    private static final void method1871(class207 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method1350(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1868();
        method1866(arg1, arg2, arg3);
        method1867(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1869(var7[3])) {
                    return;
                }
                var8 = field3991;
                var9 = field3995;
                var10 = field3994;
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
            arg0.method1329(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "()V")
    public static void method1872() {
        field3993 = null;
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(II)V")
    private static final void method1873(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field3993[var3 - 4];
                    int var5 = field3993[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field3993[var3 - 4] = var5;
                        field3993[var3] = var4;
                        int var6 = field3993[var3 - 2];
                        field3993[var3 - 2] = field3993[var3 + 2];
                        field3993[var3 + 2] = var6;
                        int var7 = field3993[var3 - 1];
                        field3993[var3 - 1] = field3993[var3 + 3];
                        field3993[var3 + 3] = var7;
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
