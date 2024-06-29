import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class288 {

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "I")
    private static int field4510;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "I")
    private static int field4511;

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
    private static int field4512;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "I")
    private static int field4513;

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "I")
    private static int field4514;

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
    private static int field4515;

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "I")
    private static int field4517;

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "[I")
    private static int[] field4516;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V")
    private static final void method1935(int arg0) {
        if (field4511 < 0) {
            field4510 = 0;
            field4514 = 0;
            field4512 = 0;
            field4515 = 2147483646;
            return;
        }
        method1937(0, field4511);
        int var1 = field4516[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field4511; var3 += 4) {
            int var4 = field4516[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field4516[var3];
            int var6 = field4516[var3 + 2];
            int var7 = field4516[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field4516[var3] = (var1 - var4) * var8 + var9;
            field4516[var3 + 2] = var8;
        }
        field4512 = var2;
        field4514 = var3;
        field4510 = var3;
        field4515 = var1 - 1;
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)Z")
    private static final boolean method1936(int arg0) {
        int var1 = field4514;
        int var2 = field4510;
        int var3 = field4515;
        while (var2 >= var1) {
            var3++;
            field4515 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field4512;
            while (var1 < field4511) {
                int var5 = field4516[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field4516[var1];
                int var7 = field4516[var1 + 2];
                int var8 = field4516[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field4516[var1] = var10;
                field4516[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field4516[var11 + 3];
                if (var3 >= var12) {
                    field4516[var11] = field4516[var4];
                    field4516[var11 + 1] = field4516[var4 + 1];
                    field4516[var11 + 2] = field4516[var4 + 2];
                    field4516[var11 + 3] = field4516[var4 + 3];
                    var4 += 4;
                }
            }
            if (field4511 == var4) {
                field4511 = 0;
                return false;
            }
            method1938(var4, var1);
            field4512 = var4;
            field4514 = var1;
            var2 = var4;
        }
        field4513 = field4516[var2] >> 16;
        field4517 = field4516[var2 + 4] >> 16;
        field4516[var2] += field4516[var2 + 2];
        field4516[var2 + 4] += field4516[var2 + 6];
        var2 += 8;
        field4510 = var2;
        return true;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)V")
    private static final void method1937(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field4516[arg0];
        int var4 = field4516[arg0 + 1];
        int var5 = field4516[arg0 + 2];
        int var6 = field4516[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field4516[var7 + 1];
            if (var8 < var4) {
                field4516[var2] = field4516[var7];
                field4516[var2 + 1] = var8;
                field4516[var2 + 2] = field4516[var7 + 2];
                field4516[var2 + 3] = field4516[var7 + 3];
                var2 += 4;
                field4516[var7] = field4516[var2];
                field4516[var7 + 1] = field4516[var2 + 1];
                field4516[var7 + 2] = field4516[var2 + 2];
                field4516[var7 + 3] = field4516[var2 + 3];
            }
        }
        field4516[var2] = var3;
        field4516[var2 + 1] = var4;
        field4516[var2 + 2] = var5;
        field4516[var2 + 3] = var6;
        method1937(arg0, var2);
        method1937(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(II)V")
    private static final void method1938(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field4516[var3 - 4];
                    int var5 = field4516[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field4516[var3 - 4] = var5;
                        field4516[var3] = var4;
                        int var6 = field4516[var3 - 2];
                        field4516[var3 - 2] = field4516[var3 + 2];
                        field4516[var3 + 2] = var6;
                        int var7 = field4516[var3 - 1];
                        field4516[var3 - 1] = field4516[var3 + 3];
                        field4516[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "()V")
    private static final void method1939() {
        field4511 = 0;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "([III)V")
    private static final void method1940(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field4511;
        if (field4516 == null || field4516.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field4511; var5++) {
                var4[var5] = field4516[var5];
            }
            field4516 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field4516[field4511++] = arg0[var7];
                field4516[field4511++] = var9;
                field4516[field4511++] = arg0[var8];
                field4516[field4511++] = var10;
            } else if (var10 < var9) {
                field4516[field4511++] = arg0[var8];
                field4516[field4511++] = var10;
                field4516[field4511++] = arg0[var7];
                field4516[field4511++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lza;[II[I[I)V")
    public static final void method1941(class497 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1944(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lza;[II)V")
    public static final void method1942(class497 arg0, int[] arg1, int arg2) {
        method1944(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "()V")
    public static void method1943() {
        field4516 = null;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lza;[IIII[I[I)V")
    private static final void method1944(class497 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method1237(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1939();
        method1940(arg1, arg2, arg3);
        method1935(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1936(var7[3])) {
                    return;
                }
                var8 = field4513;
                var9 = field4517;
                var10 = field4515;
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
            arg0.method1332(var8, var10, var9 - var8, arg4, 1);
        }
    }
}
