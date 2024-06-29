import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class490 {

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
    private static int field6842;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    private static int field6843;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
    private static int field6844;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
    private static int field6846;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
    private static int field6847;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    private static int field6848;

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "I")
    private static int field6849;

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "[I")
    private static int[] field6845;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
    private static final void method2823(int arg0) {
        if (field6847 < 0) {
            field6848 = 0;
            field6849 = 0;
            field6846 = 0;
            field6842 = 2147483646;
            return;
        }
        method2826(0, field6847);
        int var1 = field6845[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field6847; var3 += 4) {
            int var4 = field6845[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field6845[var3];
            int var6 = field6845[var3 + 2];
            int var7 = field6845[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field6845[var3] = (var1 - var4) * var8 + var9;
            field6845[var3 + 2] = var8;
        }
        field6846 = var2;
        field6849 = var3;
        field6848 = var3;
        field6842 = var1 - 1;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)V")
    private static final void method2824(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field6845[var3 - 4];
                    int var5 = field6845[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field6845[var3 - 4] = var5;
                        field6845[var3] = var4;
                        int var6 = field6845[var3 - 2];
                        field6845[var3 - 2] = field6845[var3 + 2];
                        field6845[var3 + 2] = var6;
                        int var7 = field6845[var3 - 1];
                        field6845[var3 - 1] = field6845[var3 + 3];
                        field6845[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "()V")
    public static void method2825() {
        field6845 = null;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(II)V")
    private static final void method2826(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field6845[arg0];
        int var4 = field6845[arg0 + 1];
        int var5 = field6845[arg0 + 2];
        int var6 = field6845[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field6845[var7 + 1];
            if (var8 < var4) {
                field6845[var2] = field6845[var7];
                field6845[var2 + 1] = var8;
                field6845[var2 + 2] = field6845[var7 + 2];
                field6845[var2 + 3] = field6845[var7 + 3];
                var2 += 4;
                field6845[var7] = field6845[var2];
                field6845[var7 + 1] = field6845[var2 + 1];
                field6845[var7 + 2] = field6845[var2 + 2];
                field6845[var7 + 3] = field6845[var2 + 3];
            }
        }
        field6845[var2] = var3;
        field6845[var2 + 1] = var4;
        field6845[var2 + 2] = var5;
        field6845[var2 + 3] = var6;
        method2826(arg0, var2);
        method2826(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "()V")
    private static final void method2827() {
        field6847 = 0;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lza;[II[I[I)V")
    public static final void method2828(class290 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method2830(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)Z")
    private static final boolean method2829(int arg0) {
        int var1 = field6849;
        int var2 = field6848;
        int var3 = field6842;
        while (var2 >= var1) {
            var3++;
            field6842 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field6846;
            while (var1 < field6847) {
                int var5 = field6845[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field6845[var1];
                int var7 = field6845[var1 + 2];
                int var8 = field6845[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field6845[var1] = var10;
                field6845[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field6845[var11 + 3];
                if (var3 >= var12) {
                    field6845[var11] = field6845[var4];
                    field6845[var11 + 1] = field6845[var4 + 1];
                    field6845[var11 + 2] = field6845[var4 + 2];
                    field6845[var11 + 3] = field6845[var4 + 3];
                    var4 += 4;
                }
            }
            if (field6847 == var4) {
                field6847 = 0;
                return false;
            }
            method2824(var4, var1);
            field6846 = var4;
            field6849 = var1;
            var2 = var4;
        }
        field6844 = field6845[var2] >> 16;
        field6843 = field6845[var2 + 4] >> 16;
        field6845[var2] += field6845[var2 + 2];
        field6845[var2 + 4] += field6845[var2 + 6];
        var2 += 8;
        field6848 = var2;
        return true;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lza;[IIII[I[I)V")
    private static final void method2830(class290 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method343(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method2827();
        method2831(arg1, arg2, arg3);
        method2823(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method2829(var7[3])) {
                    return;
                }
                var8 = field6844;
                var9 = field6843;
                var10 = field6842;
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
            arg0.method387(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "([III)V")
    private static final void method2831(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field6847;
        if (field6845 == null || field6845.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field6847; var5++) {
                var4[var5] = field6845[var5];
            }
            field6845 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field6845[field6847++] = arg0[var7];
                field6845[field6847++] = var9;
                field6845[field6847++] = arg0[var8];
                field6845[field6847++] = var10;
            } else if (var10 < var9) {
                field6845[field6847++] = arg0[var8];
                field6845[field6847++] = var10;
                field6845[field6847++] = arg0[var7];
                field6845[field6847++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lza;[II)V")
    public static final void method2832(class290 arg0, int[] arg1, int arg2) {
        method2830(arg0, arg1, 0, arg1.length, arg2, null, null);
    }
}
