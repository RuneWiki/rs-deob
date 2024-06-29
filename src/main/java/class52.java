import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class52 {

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    private static int field733;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    private static int field735;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    private static int field736;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    private static int field737;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    private static int field738;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    private static int field739;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    private static int field740;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "[I")
    private static int[] field734;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "()V")
    private static final void method411() {
        field739 = 0;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lha;[II)V")
    public static final void method412(class475 arg0, int[] arg1, int arg2) {
        method414(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
    private static final void method413(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field734[arg0];
        int var4 = field734[arg0 + 1];
        int var5 = field734[arg0 + 2];
        int var6 = field734[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field734[var7 + 1];
            if (var8 < var4) {
                field734[var2] = field734[var7];
                field734[var2 + 1] = var8;
                field734[var2 + 2] = field734[var7 + 2];
                field734[var2 + 3] = field734[var7 + 3];
                var2 += 4;
                field734[var7] = field734[var2];
                field734[var7 + 1] = field734[var2 + 1];
                field734[var7 + 2] = field734[var2 + 2];
                field734[var7 + 3] = field734[var2 + 3];
            }
        }
        field734[var2] = var3;
        field734[var2 + 1] = var4;
        field734[var2 + 2] = var5;
        field734[var2 + 3] = var6;
        method413(arg0, var2);
        method413(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lha;[IIII[I[I)V")
    private static final void method414(class475 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method422(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method411();
        method420(arg1, arg2, arg3);
        method416(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method419(var7[3])) {
                    return;
                }
                var8 = field740;
                var9 = field735;
                var10 = field736;
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
            arg0.method521(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lha;[II[I[I)V")
    public static final void method415(class475 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method414(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    private static final void method416(int arg0) {
        if (field739 < 0) {
            field733 = 0;
            field738 = 0;
            field737 = 0;
            field736 = 2147483646;
            return;
        }
        method413(0, field739);
        int var1 = field734[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field739; var3 += 4) {
            int var4 = field734[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field734[var3];
            int var6 = field734[var3 + 2];
            int var7 = field734[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field734[var3] = (var1 - var4) * var8 + var9;
            field734[var3 + 2] = var8;
        }
        field737 = var2;
        field738 = var3;
        field733 = var3;
        field736 = var1 - 1;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)V")
    private static final void method417(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field734[var3 - 4];
                    int var5 = field734[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field734[var3 - 4] = var5;
                        field734[var3] = var4;
                        int var6 = field734[var3 - 2];
                        field734[var3 - 2] = field734[var3 + 2];
                        field734[var3 + 2] = var6;
                        int var7 = field734[var3 - 1];
                        field734[var3 - 1] = field734[var3 + 3];
                        field734[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "()V")
    public static void method418() {
        field734 = null;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)Z")
    private static final boolean method419(int arg0) {
        int var1 = field738;
        int var2 = field733;
        int var3 = field736;
        while (var2 >= var1) {
            var3++;
            field736 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field737;
            while (var1 < field739) {
                int var5 = field734[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field734[var1];
                int var7 = field734[var1 + 2];
                int var8 = field734[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field734[var1] = var10;
                field734[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field734[var11 + 3];
                if (var3 >= var12) {
                    field734[var11] = field734[var4];
                    field734[var11 + 1] = field734[var4 + 1];
                    field734[var11 + 2] = field734[var4 + 2];
                    field734[var11 + 3] = field734[var4 + 3];
                    var4 += 4;
                }
            }
            if (field739 == var4) {
                field739 = 0;
                return false;
            }
            method417(var4, var1);
            field737 = var4;
            field738 = var1;
            var2 = var4;
        }
        field740 = field734[var2] >> 16;
        field735 = field734[var2 + 4] >> 16;
        field734[var2] += field734[var2 + 2];
        field734[var2 + 4] += field734[var2 + 6];
        var2 += 8;
        field733 = var2;
        return true;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([III)V")
    private static final void method420(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field739;
        if (field734 == null || field734.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field739; var5++) {
                var4[var5] = field734[var5];
            }
            field734 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field734[field739++] = arg0[var7];
                field734[field739++] = var9;
                field734[field739++] = arg0[var8];
                field734[field739++] = var10;
            } else if (var10 < var9) {
                field734[field739++] = arg0[var8];
                field734[field739++] = var10;
                field734[field739++] = arg0[var7];
                field734[field739++] = var9;
            }
            var7 = var8;
        }
    }
}
