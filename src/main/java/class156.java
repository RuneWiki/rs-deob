import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class156 {

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    private static int field2226;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    private static int field2227;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    private static int field2228;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    private static int field2229;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    private static int field2230;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    private static int field2231;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    private static int field2232;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "[I")
    private static int[] field2225;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V", line = 6)
    private static final void method1112(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field2225[var3 - 4];
                    int var5 = field2225[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field2225[var3 - 4] = var5;
                        field2225[var3] = var4;
                        int var6 = field2225[var3 - 2];
                        field2225[var3 - 2] = field2225[var3 + 2];
                        field2225[var3 + 2] = var6;
                        int var7 = field2225[var3 - 1];
                        field2225[var3 - 1] = field2225[var3 + 3];
                        field2225[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lr;[IIII[I[I)V", line = 46)
    private static final void method1113(class98 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method628(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1115();
        method1114(arg1, arg2, arg3);
        method1121(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1116(var7[3])) {
                    return;
                }
                var8 = field2229;
                var9 = field2232;
                var10 = field2227;
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
            arg0.method691(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([III)V", line = 86)
    private static final void method1114(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field2230;
        if (field2225 == null || field2225.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field2230; var5++) {
                var4[var5] = field2225[var5];
            }
            field2225 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field2225[field2230++] = arg0[var7];
                field2225[field2230++] = var9;
                field2225[field2230++] = arg0[var8];
                field2225[field2230++] = var10;
            } else if (var10 < var9) {
                field2225[field2230++] = arg0[var8];
                field2225[field2230++] = var10;
                field2225[field2230++] = arg0[var7];
                field2225[field2230++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()V", line = 136)
    private static final void method1115() {
        field2230 = 0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Z", line = 141)
    private static final boolean method1116(int arg0) {
        int var1 = field2228;
        int var2 = field2231;
        int var3 = field2227;
        while (var2 >= var1) {
            var3++;
            field2227 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field2226;
            while (var1 < field2230) {
                int var5 = field2225[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field2225[var1];
                int var7 = field2225[var1 + 2];
                int var8 = field2225[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field2225[var1] = var10;
                field2225[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field2225[var11 + 3];
                if (var3 >= var12) {
                    field2225[var11] = field2225[var4];
                    field2225[var11 + 1] = field2225[var4 + 1];
                    field2225[var11 + 2] = field2225[var4 + 2];
                    field2225[var11 + 3] = field2225[var4 + 3];
                    var4 += 4;
                }
            }
            if (field2230 == var4) {
                field2230 = 0;
                return false;
            }
            method1112(var4, var1);
            field2226 = var4;
            field2228 = var1;
            var2 = var4;
        }
        field2229 = field2225[var2] >> 16;
        field2232 = field2225[var2 + 4] >> 16;
        field2225[var2] += field2225[var2 + 2];
        field2225[var2 + 4] += field2225[var2 + 6];
        var2 += 8;
        field2231 = var2;
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "()V", line = 216)
    public static void method1117() {
        field2225 = null;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)V", line = 220)
    private static final void method1118(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field2225[arg0];
        int var4 = field2225[arg0 + 1];
        int var5 = field2225[arg0 + 2];
        int var6 = field2225[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field2225[var7 + 1];
            if (var8 < var4) {
                field2225[var2] = field2225[var7];
                field2225[var2 + 1] = var8;
                field2225[var2 + 2] = field2225[var7 + 2];
                field2225[var2 + 3] = field2225[var7 + 3];
                var2 += 4;
                field2225[var7] = field2225[var2];
                field2225[var7 + 1] = field2225[var2 + 1];
                field2225[var7 + 2] = field2225[var2 + 2];
                field2225[var7 + 3] = field2225[var2 + 3];
            }
        }
        field2225[var2] = var3;
        field2225[var2 + 1] = var4;
        field2225[var2 + 2] = var5;
        field2225[var2 + 3] = var6;
        method1118(arg0, var2);
        method1118(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lr;[II)V", line = 268)
    public static final void method1119(class98 arg0, int[] arg1, int arg2) {
        method1113(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lr;[II[I[I)V", line = 271)
    public static final void method1120(class98 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1113(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V", line = 274)
    private static final void method1121(int arg0) {
        if (field2230 < 0) {
            field2231 = 0;
            field2228 = 0;
            field2226 = 0;
            field2227 = 2147483646;
            return;
        }
        method1118(0, field2230);
        int var1 = field2225[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field2230; var3 += 4) {
            int var4 = field2225[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field2225[var3];
            int var6 = field2225[var3 + 2];
            int var7 = field2225[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field2225[var3] = (var1 - var4) * var8 + var9;
            field2225[var3 + 2] = var8;
        }
        field2226 = var2;
        field2228 = var3;
        field2231 = var3;
        field2227 = var1 - 1;
    }
}
