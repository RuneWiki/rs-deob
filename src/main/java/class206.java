import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class206 {

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    private static int field2950;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    private static int field2951;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    private static int field2953;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    private static int field2954;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    private static int field2955;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    private static int field2956;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    private static int field2957;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "[I")
    private static int[] field2952;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([III)V")
    private static final void method1384(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field2955;
        if (field2952 == null || field2952.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field2955; var5++) {
                var4[var5] = field2952[var5];
            }
            field2952 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field2952[field2955++] = arg0[var7];
                field2952[field2955++] = var9;
                field2952[field2955++] = arg0[var8];
                field2952[field2955++] = var10;
            } else if (var10 < var9) {
                field2952[field2955++] = arg0[var8];
                field2952[field2955++] = var10;
                field2952[field2955++] = arg0[var7];
                field2952[field2955++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "()V")
    private static final void method1385() {
        field2955 = 0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V")
    private static final void method1386(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field2952[arg0];
        int var4 = field2952[arg0 + 1];
        int var5 = field2952[arg0 + 2];
        int var6 = field2952[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field2952[var7 + 1];
            if (var8 < var4) {
                field2952[var2] = field2952[var7];
                field2952[var2 + 1] = var8;
                field2952[var2 + 2] = field2952[var7 + 2];
                field2952[var2 + 3] = field2952[var7 + 3];
                var2 += 4;
                field2952[var7] = field2952[var2];
                field2952[var7 + 1] = field2952[var2 + 1];
                field2952[var7 + 2] = field2952[var2 + 2];
                field2952[var7 + 3] = field2952[var2 + 3];
            }
        }
        field2952[var2] = var3;
        field2952[var2 + 1] = var4;
        field2952[var2 + 2] = var5;
        field2952[var2 + 3] = var6;
        method1386(arg0, var2);
        method1386(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lqa;[IIII[I[I)V")
    private static final void method1387(class162 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method1062(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1385();
        method1384(arg1, arg2, arg3);
        method1391(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1393(var7[3])) {
                    return;
                }
                var8 = field2954;
                var9 = field2953;
                var10 = field2957;
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
            arg0.method1092(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)V")
    private static final void method1388(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field2952[var3 - 4];
                    int var5 = field2952[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field2952[var3 - 4] = var5;
                        field2952[var3] = var4;
                        int var6 = field2952[var3 - 2];
                        field2952[var3 - 2] = field2952[var3 + 2];
                        field2952[var3 + 2] = var6;
                        int var7 = field2952[var3 - 1];
                        field2952[var3 - 1] = field2952[var3 + 3];
                        field2952[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lqa;[II)V")
    public static final void method1389(class162 arg0, int[] arg1, int arg2) {
        method1387(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "()V")
    public static void method1390() {
        field2952 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    private static final void method1391(int arg0) {
        if (field2955 < 0) {
            field2956 = 0;
            field2951 = 0;
            field2950 = 0;
            field2957 = 2147483646;
            return;
        }
        method1386(0, field2955);
        int var1 = field2952[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field2955; var3 += 4) {
            int var4 = field2952[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field2952[var3];
            int var6 = field2952[var3 + 2];
            int var7 = field2952[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field2952[var3] = (var1 - var4) * var8 + var9;
            field2952[var3 + 2] = var8;
        }
        field2950 = var2;
        field2951 = var3;
        field2956 = var3;
        field2957 = var1 - 1;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lqa;[II[I[I)V")
    public static final void method1392(class162 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1387(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)Z")
    private static final boolean method1393(int arg0) {
        int var1 = field2951;
        int var2 = field2956;
        int var3 = field2957;
        while (var2 >= var1) {
            var3++;
            field2957 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field2950;
            while (var1 < field2955) {
                int var5 = field2952[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field2952[var1];
                int var7 = field2952[var1 + 2];
                int var8 = field2952[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field2952[var1] = var10;
                field2952[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field2952[var11 + 3];
                if (var3 >= var12) {
                    field2952[var11] = field2952[var4];
                    field2952[var11 + 1] = field2952[var4 + 1];
                    field2952[var11 + 2] = field2952[var4 + 2];
                    field2952[var11 + 3] = field2952[var4 + 3];
                    var4 += 4;
                }
            }
            if (field2955 == var4) {
                field2955 = 0;
                return false;
            }
            method1388(var4, var1);
            field2950 = var4;
            field2951 = var1;
            var2 = var4;
        }
        field2954 = field2952[var2] >> 16;
        field2953 = field2952[var2 + 4] >> 16;
        field2952[var2] += field2952[var2 + 2];
        field2952[var2 + 4] += field2952[var2 + 6];
        var2 += 8;
        field2956 = var2;
        return true;
    }
}
