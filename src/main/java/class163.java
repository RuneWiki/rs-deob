import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class163 {

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    private static int field2490;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    private static int field2491;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    private static int field2492;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    private static int field2493;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
    private static int field2494;

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
    private static int field2495;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "I")
    private static int field2496;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "[I")
    private static int[] field2489;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Loa;[II[I[I)V", line = 4)
    public static final void method1128(class638 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1133(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Loa;[II)V", line = 11)
    public static final void method1129(class638 arg0, int[] arg1, int arg2) {
        method1133(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)V", line = 14)
    private static final void method1130(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field2489[arg0];
        int var4 = field2489[arg0 + 1];
        int var5 = field2489[arg0 + 2];
        int var6 = field2489[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field2489[var7 + 1];
            if (var8 < var4) {
                field2489[var2] = field2489[var7];
                field2489[var2 + 1] = var8;
                field2489[var2 + 2] = field2489[var7 + 2];
                field2489[var2 + 3] = field2489[var7 + 3];
                var2 += 4;
                field2489[var7] = field2489[var2];
                field2489[var7 + 1] = field2489[var2 + 1];
                field2489[var7 + 2] = field2489[var2 + 2];
                field2489[var7 + 3] = field2489[var2 + 3];
            }
        }
        field2489[var2] = var3;
        field2489[var2 + 1] = var4;
        field2489[var2 + 2] = var5;
        field2489[var2 + 3] = var6;
        method1130(arg0, var2);
        method1130(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "([III)V", line = 61)
    private static final void method1131(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field2491;
        if (field2489 == null || field2489.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field2491; var5++) {
                var4[var5] = field2489[var5];
            }
            field2489 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field2489[field2491++] = arg0[var7];
                field2489[field2491++] = var9;
                field2489[field2491++] = arg0[var8];
                field2489[field2491++] = var10;
            } else if (var10 < var9) {
                field2489[field2491++] = arg0[var8];
                field2489[field2491++] = var10;
                field2489[field2491++] = arg0[var7];
                field2489[field2491++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "()V", line = 111)
    private static final void method1132() {
        field2491 = 0;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Loa;[IIII[I[I)V", line = 117)
    private static final void method1133(class638 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method416(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1132();
        method1131(arg1, arg2, arg3);
        method1134(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1137(var7[3])) {
                    return;
                }
                var8 = field2496;
                var9 = field2492;
                var10 = field2493;
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
            arg0.method445(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V", line = 153)
    private static final void method1134(int arg0) {
        if (field2491 < 0) {
            field2490 = 0;
            field2494 = 0;
            field2495 = 0;
            field2493 = 2147483646;
            return;
        }
        method1130(0, field2491);
        int var1 = field2489[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field2491; var3 += 4) {
            int var4 = field2489[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field2489[var3];
            int var6 = field2489[var3 + 2];
            int var7 = field2489[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field2489[var3] = (var1 - var4) * var8 + var9;
            field2489[var3 + 2] = var8;
        }
        field2495 = var2;
        field2494 = var3;
        field2490 = var3;
        field2493 = var1 - 1;
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "()V", line = 199)
    public static void method1135() {
        field2489 = null;
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(II)V", line = 202)
    private static final void method1136(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field2489[var3 - 4];
                    int var5 = field2489[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field2489[var3 - 4] = var5;
                        field2489[var3] = var4;
                        int var6 = field2489[var3 - 2];
                        field2489[var3 - 2] = field2489[var3 + 2];
                        field2489[var3 + 2] = var6;
                        int var7 = field2489[var3 - 1];
                        field2489[var3 - 1] = field2489[var3 + 3];
                        field2489[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)Z", line = 242)
    private static final boolean method1137(int arg0) {
        int var1 = field2494;
        int var2 = field2490;
        int var3 = field2493;
        while (var2 >= var1) {
            var3++;
            field2493 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field2495;
            while (var1 < field2491) {
                int var5 = field2489[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field2489[var1];
                int var7 = field2489[var1 + 2];
                int var8 = field2489[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field2489[var1] = var10;
                field2489[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field2489[var11 + 3];
                if (var3 >= var12) {
                    field2489[var11] = field2489[var4];
                    field2489[var11 + 1] = field2489[var4 + 1];
                    field2489[var11 + 2] = field2489[var4 + 2];
                    field2489[var11 + 3] = field2489[var4 + 3];
                    var4 += 4;
                }
            }
            if (field2491 == var4) {
                field2491 = 0;
                return false;
            }
            method1136(var4, var1);
            field2495 = var4;
            field2494 = var1;
            var2 = var4;
        }
        field2496 = field2489[var2] >> 16;
        field2492 = field2489[var2 + 4] >> 16;
        field2489[var2] += field2489[var2 + 2];
        field2489[var2 + 4] += field2489[var2 + 6];
        var2 += 8;
        field2490 = var2;
        return true;
    }
}
