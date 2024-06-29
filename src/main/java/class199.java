import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class199 {

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
    private static int field2898;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    private static int field2899;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
    private static int field2900;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    private static int field2901;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "I")
    private static int field2902;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
    private static int field2904;

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "I")
    private static int field2905;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "[I")
    private static int[] field2903;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)V", line = 6)
    private static final void method1312(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field2903[var3 - 4];
                    int var5 = field2903[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field2903[var3 - 4] = var5;
                        field2903[var3] = var4;
                        int var6 = field2903[var3 - 2];
                        field2903[var3 - 2] = field2903[var3 + 2];
                        field2903[var3 + 2] = var6;
                        int var7 = field2903[var3 - 1];
                        field2903[var3 - 1] = field2903[var3 + 3];
                        field2903[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lya;[II)V", line = 44)
    public static final void method1313(class11 arg0, int[] arg1, int arg2) {
        method1319(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "()V", line = 47)
    public static void method1314() {
        field2903 = null;
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(II)V", line = 50)
    private static final void method1315(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field2903[arg0];
        int var4 = field2903[arg0 + 1];
        int var5 = field2903[arg0 + 2];
        int var6 = field2903[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field2903[var7 + 1];
            if (var8 < var4) {
                field2903[var2] = field2903[var7];
                field2903[var2 + 1] = var8;
                field2903[var2 + 2] = field2903[var7 + 2];
                field2903[var2 + 3] = field2903[var7 + 3];
                var2 += 4;
                field2903[var7] = field2903[var2];
                field2903[var7 + 1] = field2903[var2 + 1];
                field2903[var7 + 2] = field2903[var2 + 2];
                field2903[var7 + 3] = field2903[var2 + 3];
            }
        }
        field2903[var2] = var3;
        field2903[var2 + 1] = var4;
        field2903[var2 + 2] = var5;
        field2903[var2 + 3] = var6;
        method1315(arg0, var2);
        method1315(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V", line = 95)
    private static final void method1316(int arg0) {
        if (field2900 < 0) {
            field2904 = 0;
            field2905 = 0;
            field2901 = 0;
            field2902 = 2147483646;
            return;
        }
        method1315(0, field2900);
        int var1 = field2903[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field2900; var3 += 4) {
            int var4 = field2903[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field2903[var3];
            int var6 = field2903[var3 + 2];
            int var7 = field2903[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field2903[var3] = (var1 - var4) * var8 + var9;
            field2903[var3 + 2] = var8;
        }
        field2901 = var2;
        field2905 = var3;
        field2904 = var3;
        field2902 = var1 - 1;
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)Z", line = 144)
    private static final boolean method1317(int arg0) {
        int var1 = field2905;
        int var2 = field2904;
        int var3 = field2902;
        while (var2 >= var1) {
            var3++;
            field2902 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field2901;
            while (var1 < field2900) {
                int var5 = field2903[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field2903[var1];
                int var7 = field2903[var1 + 2];
                int var8 = field2903[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field2903[var1] = var10;
                field2903[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field2903[var11 + 3];
                if (var3 >= var12) {
                    field2903[var11] = field2903[var4];
                    field2903[var11 + 1] = field2903[var4 + 1];
                    field2903[var11 + 2] = field2903[var4 + 2];
                    field2903[var11 + 3] = field2903[var4 + 3];
                    var4 += 4;
                }
            }
            if (field2900 == var4) {
                field2900 = 0;
                return false;
            }
            method1312(var4, var1);
            field2901 = var4;
            field2905 = var1;
            var2 = var4;
        }
        field2899 = field2903[var2] >> 16;
        field2898 = field2903[var2 + 4] >> 16;
        field2903[var2] += field2903[var2 + 2];
        field2903[var2 + 4] += field2903[var2 + 6];
        var2 += 8;
        field2904 = var2;
        return true;
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "()V", line = 220)
    private static final void method1318() {
        field2900 = 0;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lya;[IIII[I[I)V", line = 227)
    private static final void method1319(class11 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method109(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1318();
        method1320(arg1, arg2, arg3);
        method1316(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1317(var7[3])) {
                    return;
                }
                var8 = field2899;
                var9 = field2898;
                var10 = field2902;
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
            arg0.method60(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "([III)V", line = 266)
    private static final void method1320(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field2900;
        if (field2903 == null || field2903.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field2900; var5++) {
                var4[var5] = field2903[var5];
            }
            field2903 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field2903[field2900++] = arg0[var7];
                field2903[field2900++] = var9;
                field2903[field2900++] = arg0[var8];
                field2903[field2900++] = var10;
            } else if (var10 < var9) {
                field2903[field2900++] = arg0[var8];
                field2903[field2900++] = var10;
                field2903[field2900++] = arg0[var7];
                field2903[field2900++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lya;[II[I[I)V", line = 315)
    public static final void method1321(class11 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1319(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }
}
