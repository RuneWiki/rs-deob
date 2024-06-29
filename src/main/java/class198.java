import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class198 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    private static int field2817;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    private static int field2819;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    private static int field2820;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    private static int field2821;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    private static int field2822;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    private static int field2823;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    private static int field2824;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "[I")
    private static int[] field2818;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()V", line = 3)
    public static void method1292() {
        field2818 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V", line = 6)
    private static final void method1293(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field2818[var3 - 4];
                    int var5 = field2818[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field2818[var3 - 4] = var5;
                        field2818[var3] = var4;
                        int var6 = field2818[var3 - 2];
                        field2818[var3 - 2] = field2818[var3 + 2];
                        field2818[var3 + 2] = var6;
                        int var7 = field2818[var3 - 1];
                        field2818[var3 - 1] = field2818[var3 + 3];
                        field2818[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lqa;[IIII[I[I)V", line = 46)
    private static final void method1294(class167 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method640(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1296();
        method1298(arg1, arg2, arg3);
        method1297(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1295(var7[3])) {
                    return;
                }
                var8 = field2824;
                var9 = field2819;
                var10 = field2823;
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
            arg0.method589(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)Z", line = 86)
    private static final boolean method1295(int arg0) {
        int var1 = field2820;
        int var2 = field2817;
        int var3 = field2823;
        while (var2 >= var1) {
            var3++;
            field2823 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field2822;
            while (var1 < field2821) {
                int var5 = field2818[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field2818[var1];
                int var7 = field2818[var1 + 2];
                int var8 = field2818[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field2818[var1] = var10;
                field2818[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field2818[var11 + 3];
                if (var3 >= var12) {
                    field2818[var11] = field2818[var4];
                    field2818[var11 + 1] = field2818[var4 + 1];
                    field2818[var11 + 2] = field2818[var4 + 2];
                    field2818[var11 + 3] = field2818[var4 + 3];
                    var4 += 4;
                }
            }
            if (field2821 == var4) {
                field2821 = 0;
                return false;
            }
            method1293(var4, var1);
            field2822 = var4;
            field2820 = var1;
            var2 = var4;
        }
        field2824 = field2818[var2] >> 16;
        field2819 = field2818[var2 + 4] >> 16;
        field2818[var2] += field2818[var2 + 2];
        field2818[var2 + 4] += field2818[var2 + 6];
        var2 += 8;
        field2817 = var2;
        return true;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "()V", line = 161)
    private static final void method1296() {
        field2821 = 0;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V", line = 164)
    private static final void method1297(int arg0) {
        if (field2821 < 0) {
            field2817 = 0;
            field2820 = 0;
            field2822 = 0;
            field2823 = 2147483646;
            return;
        }
        method1300(0, field2821);
        int var1 = field2818[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field2821; var3 += 4) {
            int var4 = field2818[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field2818[var3];
            int var6 = field2818[var3 + 2];
            int var7 = field2818[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field2818[var3] = (var1 - var4) * var8 + var9;
            field2818[var3 + 2] = var8;
        }
        field2822 = var2;
        field2820 = var3;
        field2817 = var3;
        field2823 = var1 - 1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([III)V", line = 214)
    private static final void method1298(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field2821;
        if (field2818 == null || field2818.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field2821; var5++) {
                var4[var5] = field2818[var5];
            }
            field2818 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field2818[field2821++] = arg0[var7];
                field2818[field2821++] = var9;
                field2818[field2821++] = arg0[var8];
                field2818[field2821++] = var10;
            } else if (var10 < var9) {
                field2818[field2821++] = arg0[var8];
                field2818[field2821++] = var10;
                field2818[field2821++] = arg0[var7];
                field2818[field2821++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lqa;[II)V", line = 265)
    public static final void method1299(class167 arg0, int[] arg1, int arg2) {
        method1294(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V", line = 269)
    private static final void method1300(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field2818[arg0];
        int var4 = field2818[arg0 + 1];
        int var5 = field2818[arg0 + 2];
        int var6 = field2818[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field2818[var7 + 1];
            if (var8 < var4) {
                field2818[var2] = field2818[var7];
                field2818[var2 + 1] = var8;
                field2818[var2 + 2] = field2818[var7 + 2];
                field2818[var2 + 3] = field2818[var7 + 3];
                var2 += 4;
                field2818[var7] = field2818[var2];
                field2818[var7 + 1] = field2818[var2 + 1];
                field2818[var7 + 2] = field2818[var2 + 2];
                field2818[var7 + 3] = field2818[var2 + 3];
            }
        }
        field2818[var2] = var3;
        field2818[var2 + 1] = var4;
        field2818[var2 + 2] = var5;
        field2818[var2 + 3] = var6;
        method1300(arg0, var2);
        method1300(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lqa;[II[I[I)V", line = 313)
    public static final void method1301(class167 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1294(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }
}
