import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class486 {

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
    private static int field7088;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "I")
    private static int field7089;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "I")
    private static int field7091;

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
    private static int field7092;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
    private static int field7093;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
    private static int field7094;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
    private static int field7095;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "[I")
    private static int[] field7090;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)Z", line = 4)
    private static final boolean method2948(int arg0) {
        int var1 = field7092;
        int var2 = field7095;
        int var3 = field7089;
        while (var2 >= var1) {
            var3++;
            field7089 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field7094;
            while (var1 < field7091) {
                int var5 = field7090[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field7090[var1];
                int var7 = field7090[var1 + 2];
                int var8 = field7090[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field7090[var1] = var10;
                field7090[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field7090[var11 + 3];
                if (var3 >= var12) {
                    field7090[var11] = field7090[var4];
                    field7090[var11 + 1] = field7090[var4 + 1];
                    field7090[var11 + 2] = field7090[var4 + 2];
                    field7090[var11 + 3] = field7090[var4 + 3];
                    var4 += 4;
                }
            }
            if (field7091 == var4) {
                field7091 = 0;
                return false;
            }
            method2955(var4, var1);
            field7094 = var4;
            field7092 = var1;
            var2 = var4;
        }
        field7093 = field7090[var2] >> 16;
        field7088 = field7090[var2 + 4] >> 16;
        field7090[var2] += field7090[var2 + 2];
        field7090[var2 + 4] += field7090[var2 + 6];
        var2 += 8;
        field7095 = var2;
        return true;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "([III)V", line = 83)
    private static final void method2949(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field7091;
        if (field7090 == null || field7090.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field7091; var5++) {
                var4[var5] = field7090[var5];
            }
            field7090 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field7090[field7091++] = arg0[var7];
                field7090[field7091++] = var9;
                field7090[field7091++] = arg0[var8];
                field7090[field7091++] = var10;
            } else if (var10 < var9) {
                field7090[field7091++] = arg0[var8];
                field7090[field7091++] = var10;
                field7090[field7091++] = arg0[var7];
                field7090[field7091++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "()V", line = 132)
    public static void method2950() {
        field7090 = null;
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)V", line = 135)
    private static final void method2951(int arg0) {
        if (field7091 < 0) {
            field7095 = 0;
            field7092 = 0;
            field7094 = 0;
            field7089 = 2147483646;
            return;
        }
        method2956(0, field7091);
        int var1 = field7090[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field7091; var3 += 4) {
            int var4 = field7090[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field7090[var3];
            int var6 = field7090[var3 + 2];
            int var7 = field7090[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field7090[var3] = (var1 - var4) * var8 + var9;
            field7090[var3 + 2] = var8;
        }
        field7094 = var2;
        field7092 = var3;
        field7095 = var3;
        field7089 = var1 - 1;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lya;[IIII[I[I)V", line = 184)
    private static final void method2952(class38 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method267(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method2954();
        method2949(arg1, arg2, arg3);
        method2951(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method2948(var7[3])) {
                    return;
                }
                var8 = field7093;
                var9 = field7088;
                var10 = field7089;
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
            arg0.method301(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lya;[II[I[I)V", line = 222)
    public static final void method2953(class38 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method2952(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "()V", line = 227)
    private static final void method2954() {
        field7091 = 0;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)V", line = 233)
    private static final void method2955(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field7090[var3 - 4];
                    int var5 = field7090[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field7090[var3 - 4] = var5;
                        field7090[var3] = var4;
                        int var6 = field7090[var3 - 2];
                        field7090[var3 - 2] = field7090[var3 + 2];
                        field7090[var3 + 2] = var6;
                        int var7 = field7090[var3 - 1];
                        field7090[var3 - 1] = field7090[var3 + 3];
                        field7090[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(II)V", line = 270)
    private static final void method2956(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field7090[arg0];
        int var4 = field7090[arg0 + 1];
        int var5 = field7090[arg0 + 2];
        int var6 = field7090[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field7090[var7 + 1];
            if (var8 < var4) {
                field7090[var2] = field7090[var7];
                field7090[var2 + 1] = var8;
                field7090[var2 + 2] = field7090[var7 + 2];
                field7090[var2 + 3] = field7090[var7 + 3];
                var2 += 4;
                field7090[var7] = field7090[var2];
                field7090[var7 + 1] = field7090[var2 + 1];
                field7090[var7 + 2] = field7090[var2 + 2];
                field7090[var7 + 3] = field7090[var2 + 3];
            }
        }
        field7090[var2] = var3;
        field7090[var2 + 1] = var4;
        field7090[var2 + 2] = var5;
        field7090[var2 + 3] = var6;
        method2956(arg0, var2);
        method2956(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lya;[II)V", line = 315)
    public static final void method2957(class38 arg0, int[] arg1, int arg2) {
        method2952(arg0, arg1, 0, arg1.length, arg2, null, null);
    }
}
