import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 {

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    private static int field48;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    private static int field49;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    private static int field50;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    private static int field52;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    private static int field53;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    private static int field54;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    private static int field55;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "[I")
    private static int[] field51;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)Z")
    private static final boolean method20(int arg0) {
        int var1 = field52;
        int var2 = field55;
        int var3 = field49;
        while (var2 >= var1) {
            var3++;
            field49 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field48;
            while (var1 < field53) {
                int var5 = field51[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field51[var1];
                int var7 = field51[var1 + 2];
                int var8 = field51[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field51[var1] = var10;
                field51[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field51[var11 + 3];
                if (var3 >= var12) {
                    field51[var11] = field51[var4];
                    field51[var11 + 1] = field51[var4 + 1];
                    field51[var11 + 2] = field51[var4 + 2];
                    field51[var11 + 3] = field51[var4 + 3];
                    var4 += 4;
                }
            }
            if (field53 == var4) {
                field53 = 0;
                return false;
            }
            method25(var4, var1);
            field48 = var4;
            field52 = var1;
            var2 = var4;
        }
        field50 = field51[var2] >> 16;
        field54 = field51[var2 + 4] >> 16;
        field51[var2] += field51[var2 + 2];
        field51[var2 + 4] += field51[var2 + 6];
        var2 += 8;
        field55 = var2;
        return true;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lqq;[II)V")
    public static final void method21(class318 arg0, int[] arg1, int arg2) {
        method29(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "()V")
    public static void method22() {
        field51 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lqq;[II[I[I)V")
    public static final void method23(class318 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method29(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "()V")
    private static final void method24() {
        field53 = 0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
    private static final void method25(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field51[var3 - 4];
                    int var5 = field51[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field51[var3 - 4] = var5;
                        field51[var3] = var4;
                        int var6 = field51[var3 - 2];
                        field51[var3 - 2] = field51[var3 + 2];
                        field51[var3 + 2] = var6;
                        int var7 = field51[var3 - 1];
                        field51[var3 - 1] = field51[var3 + 3];
                        field51[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([III)V")
    private static final void method26(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field53;
        if (field51 == null || field51.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field53; var5++) {
                var4[var5] = field51[var5];
            }
            field51 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field51[field53++] = arg0[var7];
                field51[field53++] = var9;
                field51[field53++] = arg0[var8];
                field51[field53++] = var10;
            } else if (var10 < var9) {
                field51[field53++] = arg0[var8];
                field51[field53++] = var10;
                field51[field53++] = arg0[var7];
                field51[field53++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    private static final void method27(int arg0) {
        if (field53 < 0) {
            field55 = 0;
            field52 = 0;
            field48 = 0;
            field49 = 2147483646;
            return;
        }
        method28(0, field53);
        int var1 = field51[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field53; var3 += 4) {
            int var4 = field51[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field51[var3];
            int var6 = field51[var3 + 2];
            int var7 = field51[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field51[var3] = (var1 - var4) * var8 + var9;
            field51[var3 + 2] = var8;
        }
        field48 = var2;
        field52 = var3;
        field55 = var3;
        field49 = var1 - 1;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)V")
    private static final void method28(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field51[arg0];
        int var4 = field51[arg0 + 1];
        int var5 = field51[arg0 + 2];
        int var6 = field51[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field51[var7 + 1];
            if (var8 < var4) {
                field51[var2] = field51[var7];
                field51[var2 + 1] = var8;
                field51[var2 + 2] = field51[var7 + 2];
                field51[var2 + 3] = field51[var7 + 3];
                var2 += 4;
                field51[var7] = field51[var2];
                field51[var7 + 1] = field51[var2 + 1];
                field51[var7 + 2] = field51[var2 + 2];
                field51[var7 + 3] = field51[var2 + 3];
            }
        }
        field51[var2] = var3;
        field51[var2 + 1] = var4;
        field51[var2 + 2] = var5;
        field51[var2 + 3] = var6;
        method28(arg0, var2);
        method28(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lqq;[IIII[I[I)V")
    private static final void method29(class318 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method1936(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method24();
        method26(arg1, arg2, arg3);
        method27(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method20(var7[3])) {
                    return;
                }
                var8 = field50;
                var9 = field54;
                var10 = field49;
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
            arg0.method1963(var8, var10, var9 - var8, arg4, 1);
        }
    }
}
