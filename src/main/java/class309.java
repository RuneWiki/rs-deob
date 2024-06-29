import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class309 {

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    private static int field4411;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    private static int field4412;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    private static int field4413;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    private static int field4414;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    private static int field4415;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    private static int field4416;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    private static int field4418;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "[I")
    private static int[] field4417;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V", line = 4)
    private static final void method1931(int arg0) {
        if (field4411 < 0) {
            field4412 = 0;
            field4418 = 0;
            field4413 = 0;
            field4416 = 2147483646;
            return;
        }
        method1940(0, field4411);
        int var1 = field4417[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field4411; var3 += 4) {
            int var4 = field4417[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field4417[var3];
            int var6 = field4417[var3 + 2];
            int var7 = field4417[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field4417[var3] = (var1 - var4) * var8 + var9;
            field4417[var3 + 2] = var8;
        }
        field4413 = var2;
        field4418 = var3;
        field4412 = var3;
        field4416 = var1 - 1;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)Z", line = 50)
    private static final boolean method1932(int arg0) {
        int var1 = field4418;
        int var2 = field4412;
        int var3 = field4416;
        while (var2 >= var1) {
            var3++;
            field4416 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field4413;
            while (var1 < field4411) {
                int var5 = field4417[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field4417[var1];
                int var7 = field4417[var1 + 2];
                int var8 = field4417[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field4417[var1] = var10;
                field4417[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field4417[var11 + 3];
                if (var3 >= var12) {
                    field4417[var11] = field4417[var4];
                    field4417[var11 + 1] = field4417[var4 + 1];
                    field4417[var11 + 2] = field4417[var4 + 2];
                    field4417[var11 + 3] = field4417[var4 + 3];
                    var4 += 4;
                }
            }
            if (field4411 == var4) {
                field4411 = 0;
                return false;
            }
            method1934(var4, var1);
            field4413 = var4;
            field4418 = var1;
            var2 = var4;
        }
        field4415 = field4417[var2] >> 16;
        field4414 = field4417[var2 + 4] >> 16;
        field4417[var2] += field4417[var2 + 2];
        field4417[var2 + 4] += field4417[var2 + 6];
        var2 += 8;
        field4412 = var2;
        return true;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([III)V", line = 130)
    private static final void method1933(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field4411;
        if (field4417 == null || field4417.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field4411; var5++) {
                var4[var5] = field4417[var5];
            }
            field4417 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field4417[field4411++] = arg0[var7];
                field4417[field4411++] = var9;
                field4417[field4411++] = arg0[var8];
                field4417[field4411++] = var10;
            } else if (var10 < var9) {
                field4417[field4411++] = arg0[var8];
                field4417[field4411++] = var10;
                field4417[field4411++] = arg0[var7];
                field4417[field4411++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V", line = 181)
    private static final void method1934(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field4417[var3 - 4];
                    int var5 = field4417[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field4417[var3 - 4] = var5;
                        field4417[var3] = var4;
                        int var6 = field4417[var3 - 2];
                        field4417[var3 - 2] = field4417[var3 + 2];
                        field4417[var3 + 2] = var6;
                        int var7 = field4417[var3 - 1];
                        field4417[var3 - 1] = field4417[var3 + 3];
                        field4417[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Len;[IIII[I[I)V", line = 223)
    private static final void method1935(class174 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method1004(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1939();
        method1933(arg1, arg2, arg3);
        method1931(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1932(var7[3])) {
                    return;
                }
                var8 = field4415;
                var9 = field4414;
                var10 = field4416;
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
            arg0.method972(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Len;[II)V", line = 259)
    public static final void method1936(class174 arg0, int[] arg1, int arg2) {
        method1935(arg0, arg1, 0, arg1.length, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "()V", line = 263)
    public static void method1937() {
        field4417 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Len;[II[I[I)V", line = 268)
    public static final void method1938(class174 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1935(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "()V", line = 273)
    private static final void method1939() {
        field4411 = 0;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)V", line = 276)
    private static final void method1940(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field4417[arg0];
        int var4 = field4417[arg0 + 1];
        int var5 = field4417[arg0 + 2];
        int var6 = field4417[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field4417[var7 + 1];
            if (var8 < var4) {
                field4417[var2] = field4417[var7];
                field4417[var2 + 1] = var8;
                field4417[var2 + 2] = field4417[var7 + 2];
                field4417[var2 + 3] = field4417[var7 + 3];
                var2 += 4;
                field4417[var7] = field4417[var2];
                field4417[var7 + 1] = field4417[var2 + 1];
                field4417[var7 + 2] = field4417[var2 + 2];
                field4417[var7 + 3] = field4417[var2 + 3];
            }
        }
        field4417[var2] = var3;
        field4417[var2 + 1] = var4;
        field4417[var2 + 2] = var5;
        field4417[var2 + 3] = var6;
        method1940(arg0, var2);
        method1940(var2 + 4, arg1);
    }
}
