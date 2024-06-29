import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class407 {

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
    private static int field5869;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    private static int field5870;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
    private static int field5871;

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "I")
    private static int field5872;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
    private static int field5873;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    private static int field5875;

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "I")
    private static int field5876;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "[I")
    private static int[] field5874;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "()V", line = 3)
    public static void method2599() {
        field5874 = null;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "([III)V", line = 10)
    private static final void method2600(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field5873;
        if (field5874 == null || field5874.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field5873; var5++) {
                var4[var5] = field5874[var5];
            }
            field5874 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field5874[field5873++] = arg0[var7];
                field5874[field5873++] = var9;
                field5874[field5873++] = arg0[var8];
                field5874[field5873++] = var10;
            } else if (var10 < var9) {
                field5874[field5873++] = arg0[var8];
                field5874[field5873++] = var10;
                field5874[field5873++] = arg0[var7];
                field5874[field5873++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "()V", line = 61)
    private static final void method2601() {
        field5873 = 0;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)V", line = 64)
    private static final void method2602(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field5874[arg0];
        int var4 = field5874[arg0 + 1];
        int var5 = field5874[arg0 + 2];
        int var6 = field5874[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field5874[var7 + 1];
            if (var8 < var4) {
                field5874[var2] = field5874[var7];
                field5874[var2 + 1] = var8;
                field5874[var2 + 2] = field5874[var7 + 2];
                field5874[var2 + 3] = field5874[var7 + 3];
                var2 += 4;
                field5874[var7] = field5874[var2];
                field5874[var7 + 1] = field5874[var2 + 1];
                field5874[var7 + 2] = field5874[var2 + 2];
                field5874[var7 + 3] = field5874[var2 + 3];
            }
        }
        field5874[var2] = var3;
        field5874[var2 + 1] = var4;
        field5874[var2 + 2] = var5;
        field5874[var2 + 3] = var6;
        method2602(arg0, var2);
        method2602(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)Z", line = 109)
    private static final boolean method2603(int arg0) {
        int var1 = field5869;
        int var2 = field5872;
        int var3 = field5875;
        while (var2 >= var1) {
            var3++;
            field5875 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field5870;
            while (var1 < field5873) {
                int var5 = field5874[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field5874[var1];
                int var7 = field5874[var1 + 2];
                int var8 = field5874[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field5874[var1] = var10;
                field5874[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field5874[var11 + 3];
                if (var3 >= var12) {
                    field5874[var11] = field5874[var4];
                    field5874[var11 + 1] = field5874[var4 + 1];
                    field5874[var11 + 2] = field5874[var4 + 2];
                    field5874[var11 + 3] = field5874[var4 + 3];
                    var4 += 4;
                }
            }
            if (field5873 == var4) {
                field5873 = 0;
                return false;
            }
            method2605(var4, var1);
            field5870 = var4;
            field5869 = var1;
            var2 = var4;
        }
        field5876 = field5874[var2] >> 16;
        field5871 = field5874[var2 + 4] >> 16;
        field5874[var2] += field5874[var2 + 2];
        field5874[var2 + 4] += field5874[var2 + 6];
        var2 += 8;
        field5872 = var2;
        return true;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lae;[II[I[I)V", line = 185)
    public static final void method2604(class134 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method2607(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(II)V", line = 195)
    private static final void method2605(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field5874[var3 - 4];
                    int var5 = field5874[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field5874[var3 - 4] = var5;
                        field5874[var3] = var4;
                        int var6 = field5874[var3 - 2];
                        field5874[var3 - 2] = field5874[var3 + 2];
                        field5874[var3 + 2] = var6;
                        int var7 = field5874[var3 - 1];
                        field5874[var3 - 1] = field5874[var3 + 3];
                        field5874[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lae;[II)V", line = 233)
    public static final void method2606(class134 arg0, int[] arg1, int arg2) {
        method2607(arg0, arg1, 0, arg1.length, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lae;[IIII[I[I)V", line = 239)
    private static final void method2607(class134 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method659(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method2601();
        method2600(arg1, arg2, arg3);
        method2608(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method2603(var7[3])) {
                    return;
                }
                var8 = field5876;
                var9 = field5871;
                var10 = field5875;
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
            arg0.method658(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V", line = 275)
    private static final void method2608(int arg0) {
        if (field5873 < 0) {
            field5872 = 0;
            field5869 = 0;
            field5870 = 0;
            field5875 = 2147483646;
            return;
        }
        method2602(0, field5873);
        int var1 = field5874[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field5873; var3 += 4) {
            int var4 = field5874[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field5874[var3];
            int var6 = field5874[var3 + 2];
            int var7 = field5874[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field5874[var3] = (var1 - var4) * var8 + var9;
            field5874[var3 + 2] = var8;
        }
        field5870 = var2;
        field5869 = var3;
        field5872 = var3;
        field5875 = var1 - 1;
    }
}
