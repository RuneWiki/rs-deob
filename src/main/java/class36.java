import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class36 {

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "I")
    private static int field567;

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "I")
    private static int field568;

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "I")
    private static int field569;

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
    private static int field570;

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "I")
    private static int field571;

    @OriginalMember(owner = "client!tfa", name = "f", descriptor = "I")
    private static int field572;

    @OriginalMember(owner = "client!tfa", name = "g", descriptor = "I")
    private static int field573;

    @OriginalMember(owner = "client!tfa", name = "h", descriptor = "[I")
    private static int[] field574;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lha;[II[I[I)V")
    public static final void method251(class65 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method252(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lha;[IIII[I[I)V")
    private static final void method252(class65 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method494(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method257();
        method259(arg1, arg2, arg3);
        method258(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method255(var7[3])) {
                    return;
                }
                var8 = field567;
                var9 = field570;
                var10 = field569;
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
            arg0.method488(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)V")
    private static final void method253(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field574[var3 - 4];
                    int var5 = field574[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field574[var3 - 4] = var5;
                        field574[var3] = var4;
                        int var6 = field574[var3 - 2];
                        field574[var3 - 2] = field574[var3 + 2];
                        field574[var3 + 2] = var6;
                        int var7 = field574[var3 - 1];
                        field574[var3 - 1] = field574[var3 + 3];
                        field574[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lha;[II)V")
    public static final void method254(class65 arg0, int[] arg1, int arg2) {
        method252(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)Z")
    private static final boolean method255(int arg0) {
        int var1 = field572;
        int var2 = field571;
        int var3 = field569;
        while (var2 >= var1) {
            var3++;
            field569 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field573;
            while (var1 < field568) {
                int var5 = field574[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field574[var1];
                int var7 = field574[var1 + 2];
                int var8 = field574[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field574[var1] = var10;
                field574[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field574[var11 + 3];
                if (var3 >= var12) {
                    field574[var11] = field574[var4];
                    field574[var11 + 1] = field574[var4 + 1];
                    field574[var11 + 2] = field574[var4 + 2];
                    field574[var11 + 3] = field574[var4 + 3];
                    var4 += 4;
                }
            }
            if (field568 == var4) {
                field568 = 0;
                return false;
            }
            method253(var4, var1);
            field573 = var4;
            field572 = var1;
            var2 = var4;
        }
        field567 = field574[var2] >> 16;
        field570 = field574[var2 + 4] >> 16;
        field574[var2] += field574[var2 + 2];
        field574[var2 + 4] += field574[var2 + 6];
        var2 += 8;
        field571 = var2;
        return true;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "()V")
    public static void method256() {
        field574 = null;
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "()V")
    private static final void method257() {
        field568 = 0;
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(I)V")
    private static final void method258(int arg0) {
        if (field568 < 0) {
            field571 = 0;
            field572 = 0;
            field573 = 0;
            field569 = 2147483646;
            return;
        }
        method260(0, field568);
        int var1 = field574[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field568; var3 += 4) {
            int var4 = field574[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field574[var3];
            int var6 = field574[var3 + 2];
            int var7 = field574[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field574[var3] = (var1 - var4) * var8 + var9;
            field574[var3 + 2] = var8;
        }
        field573 = var2;
        field572 = var3;
        field571 = var3;
        field569 = var1 - 1;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "([III)V")
    private static final void method259(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field568;
        if (field574 == null || field574.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field568; var5++) {
                var4[var5] = field574[var5];
            }
            field574 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field574[field568++] = arg0[var7];
                field574[field568++] = var9;
                field574[field568++] = arg0[var8];
                field574[field568++] = var10;
            } else if (var10 < var9) {
                field574[field568++] = arg0[var8];
                field574[field568++] = var10;
                field574[field568++] = arg0[var7];
                field574[field568++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(II)V")
    private static final void method260(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field574[arg0];
        int var4 = field574[arg0 + 1];
        int var5 = field574[arg0 + 2];
        int var6 = field574[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field574[var7 + 1];
            if (var8 < var4) {
                field574[var2] = field574[var7];
                field574[var2 + 1] = var8;
                field574[var2 + 2] = field574[var7 + 2];
                field574[var2 + 3] = field574[var7 + 3];
                var2 += 4;
                field574[var7] = field574[var2];
                field574[var7 + 1] = field574[var2 + 1];
                field574[var7 + 2] = field574[var2 + 2];
                field574[var7 + 3] = field574[var2 + 3];
            }
        }
        field574[var2] = var3;
        field574[var2 + 1] = var4;
        field574[var2 + 2] = var5;
        field574[var2 + 3] = var6;
        method260(arg0, var2);
        method260(var2 + 4, arg1);
    }
}
