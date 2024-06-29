import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class402 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    private static int field5910;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    private static int field5911;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    private static int field5912;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    private static int field5913;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    private static int field5914;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    private static int field5916;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    private static int field5917;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "[I")
    private static int[] field5915;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    private static final void method2506(int arg0) {
        if (field5913 < 0) {
            field5917 = 0;
            field5910 = 0;
            field5912 = 0;
            field5911 = 2147483646;
            return;
        }
        method2513(0, field5913);
        int var1 = field5915[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field5913; var3 += 4) {
            int var4 = field5915[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field5915[var3];
            int var6 = field5915[var3 + 2];
            int var7 = field5915[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field5915[var3] = (var1 - var4) * var8 + var9;
            field5915[var3 + 2] = var8;
        }
        field5912 = var2;
        field5910 = var3;
        field5917 = var3;
        field5911 = var1 - 1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lha;[II[I[I)V")
    public static final void method2507(class59 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method2511(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lha;[II)V")
    public static final void method2508(class59 arg0, int[] arg1, int arg2) {
        method2511(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
    public static void method2509() {
        field5915 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([III)V")
    private static final void method2510(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field5913;
        if (field5915 == null || field5915.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field5913; var5++) {
                var4[var5] = field5915[var5];
            }
            field5915 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field5915[field5913++] = arg0[var7];
                field5915[field5913++] = var9;
                field5915[field5913++] = arg0[var8];
                field5915[field5913++] = var10;
            } else if (var10 < var9) {
                field5915[field5913++] = arg0[var8];
                field5915[field5913++] = var10;
                field5915[field5913++] = arg0[var7];
                field5915[field5913++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lha;[IIII[I[I)V")
    private static final void method2511(class59 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method206(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method2512();
        method2510(arg1, arg2, arg3);
        method2506(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method2515(var7[3])) {
                    return;
                }
                var8 = field5914;
                var9 = field5916;
                var10 = field5911;
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
            arg0.method226(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()V")
    private static final void method2512() {
        field5913 = 0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V")
    private static final void method2513(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field5915[arg0];
        int var4 = field5915[arg0 + 1];
        int var5 = field5915[arg0 + 2];
        int var6 = field5915[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field5915[var7 + 1];
            if (var8 < var4) {
                field5915[var2] = field5915[var7];
                field5915[var2 + 1] = var8;
                field5915[var2 + 2] = field5915[var7 + 2];
                field5915[var2 + 3] = field5915[var7 + 3];
                var2 += 4;
                field5915[var7] = field5915[var2];
                field5915[var7 + 1] = field5915[var2 + 1];
                field5915[var7 + 2] = field5915[var2 + 2];
                field5915[var7 + 3] = field5915[var2 + 3];
            }
        }
        field5915[var2] = var3;
        field5915[var2 + 1] = var4;
        field5915[var2 + 2] = var5;
        field5915[var2 + 3] = var6;
        method2513(arg0, var2);
        method2513(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II)V")
    private static final void method2514(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field5915[var3 - 4];
                    int var5 = field5915[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field5915[var3 - 4] = var5;
                        field5915[var3] = var4;
                        int var6 = field5915[var3 - 2];
                        field5915[var3 - 2] = field5915[var3 + 2];
                        field5915[var3 + 2] = var6;
                        int var7 = field5915[var3 - 1];
                        field5915[var3 - 1] = field5915[var3 + 3];
                        field5915[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)Z")
    private static final boolean method2515(int arg0) {
        int var1 = field5910;
        int var2 = field5917;
        int var3 = field5911;
        while (var2 >= var1) {
            var3++;
            field5911 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field5912;
            while (var1 < field5913) {
                int var5 = field5915[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field5915[var1];
                int var7 = field5915[var1 + 2];
                int var8 = field5915[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field5915[var1] = var10;
                field5915[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field5915[var11 + 3];
                if (var3 >= var12) {
                    field5915[var11] = field5915[var4];
                    field5915[var11 + 1] = field5915[var4 + 1];
                    field5915[var11 + 2] = field5915[var4 + 2];
                    field5915[var11 + 3] = field5915[var4 + 3];
                    var4 += 4;
                }
            }
            if (field5913 == var4) {
                field5913 = 0;
                return false;
            }
            method2514(var4, var1);
            field5912 = var4;
            field5910 = var1;
            var2 = var4;
        }
        field5914 = field5915[var2] >> 16;
        field5916 = field5915[var2 + 4] >> 16;
        field5915[var2] += field5915[var2 + 2];
        field5915[var2 + 4] += field5915[var2 + 6];
        var2 += 8;
        field5917 = var2;
        return true;
    }
}
