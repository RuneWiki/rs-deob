import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class228 {

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "I")
    private static int field2955;

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "I")
    private static int field2956;

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "I")
    private static int field2957;

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "I")
    private static int field2959;

    @OriginalMember(owner = "client!jda", name = "f", descriptor = "I")
    private static int field2960;

    @OriginalMember(owner = "client!jda", name = "g", descriptor = "I")
    private static int field2961;

    @OriginalMember(owner = "client!jda", name = "h", descriptor = "I")
    private static int field2962;

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "[I")
    private static int[] field2958;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(II)V", line = 3)
    private static final void method1351(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field2958[arg0];
        int var4 = field2958[arg0 + 1];
        int var5 = field2958[arg0 + 2];
        int var6 = field2958[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field2958[var7 + 1];
            if (var8 < var4) {
                field2958[var2] = field2958[var7];
                field2958[var2 + 1] = var8;
                field2958[var2 + 2] = field2958[var7 + 2];
                field2958[var2 + 3] = field2958[var7 + 3];
                var2 += 4;
                field2958[var7] = field2958[var2];
                field2958[var7 + 1] = field2958[var2 + 1];
                field2958[var7 + 2] = field2958[var2 + 2];
                field2958[var7 + 3] = field2958[var2 + 3];
            }
        }
        field2958[var2] = var3;
        field2958[var2 + 1] = var4;
        field2958[var2 + 2] = var5;
        field2958[var2 + 3] = var6;
        method1351(arg0, var2);
        method1351(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)Z", line = 48)
    private static final boolean method1352(int arg0) {
        int var1 = field2962;
        int var2 = field2957;
        int var3 = field2961;
        while (var2 >= var1) {
            var3++;
            field2961 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field2959;
            while (var1 < field2955) {
                int var5 = field2958[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field2958[var1];
                int var7 = field2958[var1 + 2];
                int var8 = field2958[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field2958[var1] = var10;
                field2958[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field2958[var11 + 3];
                if (var3 >= var12) {
                    field2958[var11] = field2958[var4];
                    field2958[var11 + 1] = field2958[var4 + 1];
                    field2958[var11 + 2] = field2958[var4 + 2];
                    field2958[var11 + 3] = field2958[var4 + 3];
                    var4 += 4;
                }
            }
            if (field2955 == var4) {
                field2955 = 0;
                return false;
            }
            method1360(var4, var1);
            field2959 = var4;
            field2962 = var1;
            var2 = var4;
        }
        field2960 = field2958[var2] >> 16;
        field2956 = field2958[var2 + 4] >> 16;
        field2958[var2] += field2958[var2 + 2];
        field2958[var2 + 4] += field2958[var2 + 6];
        var2 += 8;
        field2957 = var2;
        return true;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "([III)V", line = 127)
    private static final void method1353(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field2955;
        if (field2958 == null || field2958.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field2955; var5++) {
                var4[var5] = field2958[var5];
            }
            field2958 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field2958[field2955++] = arg0[var7];
                field2958[field2955++] = var9;
                field2958[field2955++] = arg0[var8];
                field2958[field2955++] = var10;
            } else if (var10 < var9) {
                field2958[field2955++] = arg0[var8];
                field2958[field2955++] = var10;
                field2958[field2955++] = arg0[var7];
                field2958[field2955++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lha;[IIII[I[I)V", line = 181)
    private static final void method1354(class60 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method398(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1357();
        method1353(arg1, arg2, arg3);
        method1359(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1352(var7[3])) {
                    return;
                }
                var8 = field2960;
                var9 = field2956;
                var10 = field2961;
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
            arg0.method347(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "()V", line = 217)
    public static void method1355() {
        field2958 = null;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lha;[II)V", line = 222)
    public static final void method1356(class60 arg0, int[] arg1, int arg2) {
        method1354(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "()V", line = 226)
    private static final void method1357() {
        field2955 = 0;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lha;[II[I[I)V", line = 232)
    public static final void method1358(class60 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1354(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)V", line = 237)
    private static final void method1359(int arg0) {
        if (field2955 < 0) {
            field2957 = 0;
            field2962 = 0;
            field2959 = 0;
            field2961 = 2147483646;
            return;
        }
        method1351(0, field2955);
        int var1 = field2958[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field2955; var3 += 4) {
            int var4 = field2958[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field2958[var3];
            int var6 = field2958[var3 + 2];
            int var7 = field2958[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field2958[var3] = (var1 - var4) * var8 + var9;
            field2958[var3 + 2] = var8;
        }
        field2959 = var2;
        field2962 = var3;
        field2957 = var3;
        field2961 = var1 - 1;
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(II)V", line = 283)
    private static final void method1360(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field2958[var3 - 4];
                    int var5 = field2958[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field2958[var3 - 4] = var5;
                        field2958[var3] = var4;
                        int var6 = field2958[var3 - 2];
                        field2958[var3 - 2] = field2958[var3 + 2];
                        field2958[var3 + 2] = var6;
                        int var7 = field2958[var3 - 1];
                        field2958[var3 - 1] = field2958[var3 + 3];
                        field2958[var3 + 3] = var7;
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
