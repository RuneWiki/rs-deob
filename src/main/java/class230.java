import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class230 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    private static int field3405;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    private static int field3406;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    private static int field3407;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    private static int field3408;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    private static int field3409;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    private static int field3411;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    private static int field3412;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "[I")
    private static int[] field3410;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "()V")
    public static void method1499() {
        field3410 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lqa;[IIII[I[I)V")
    private static final void method1500(class167 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method1025(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1506();
        method1504(arg1, arg2, arg3);
        method1501(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1503(var7[3])) {
                    return;
                }
                var8 = field3406;
                var9 = field3408;
                var10 = field3409;
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
            arg0.method1015(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    private static final void method1501(int arg0) {
        if (field3405 < 0) {
            field3412 = 0;
            field3407 = 0;
            field3411 = 0;
            field3409 = 2147483646;
            return;
        }
        method1505(0, field3405);
        int var1 = field3410[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field3405; var3 += 4) {
            int var4 = field3410[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field3410[var3];
            int var6 = field3410[var3 + 2];
            int var7 = field3410[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field3410[var3] = (var1 - var4) * var8 + var9;
            field3410[var3 + 2] = var8;
        }
        field3411 = var2;
        field3407 = var3;
        field3412 = var3;
        field3409 = var1 - 1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lqa;[II[I[I)V")
    public static final void method1502(class167 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1500(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)Z")
    private static final boolean method1503(int arg0) {
        int var1 = field3407;
        int var2 = field3412;
        int var3 = field3409;
        while (var2 >= var1) {
            var3++;
            field3409 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field3411;
            while (var1 < field3405) {
                int var5 = field3410[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field3410[var1];
                int var7 = field3410[var1 + 2];
                int var8 = field3410[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field3410[var1] = var10;
                field3410[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field3410[var11 + 3];
                if (var3 >= var12) {
                    field3410[var11] = field3410[var4];
                    field3410[var11 + 1] = field3410[var4 + 1];
                    field3410[var11 + 2] = field3410[var4 + 2];
                    field3410[var11 + 3] = field3410[var4 + 3];
                    var4 += 4;
                }
            }
            if (field3405 == var4) {
                field3405 = 0;
                return false;
            }
            method1508(var4, var1);
            field3411 = var4;
            field3407 = var1;
            var2 = var4;
        }
        field3406 = field3410[var2] >> 16;
        field3408 = field3410[var2 + 4] >> 16;
        field3410[var2] += field3410[var2 + 2];
        field3410[var2 + 4] += field3410[var2 + 6];
        var2 += 8;
        field3412 = var2;
        return true;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([III)V")
    private static final void method1504(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field3405;
        if (field3410 == null || field3410.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field3405; var5++) {
                var4[var5] = field3410[var5];
            }
            field3410 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field3410[field3405++] = arg0[var7];
                field3410[field3405++] = var9;
                field3410[field3405++] = arg0[var8];
                field3410[field3405++] = var10;
            } else if (var10 < var9) {
                field3410[field3405++] = arg0[var8];
                field3410[field3405++] = var10;
                field3410[field3405++] = arg0[var7];
                field3410[field3405++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
    private static final void method1505(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field3410[arg0];
        int var4 = field3410[arg0 + 1];
        int var5 = field3410[arg0 + 2];
        int var6 = field3410[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field3410[var7 + 1];
            if (var8 < var4) {
                field3410[var2] = field3410[var7];
                field3410[var2 + 1] = var8;
                field3410[var2 + 2] = field3410[var7 + 2];
                field3410[var2 + 3] = field3410[var7 + 3];
                var2 += 4;
                field3410[var7] = field3410[var2];
                field3410[var7 + 1] = field3410[var2 + 1];
                field3410[var7 + 2] = field3410[var2 + 2];
                field3410[var7 + 3] = field3410[var2 + 3];
            }
        }
        field3410[var2] = var3;
        field3410[var2 + 1] = var4;
        field3410[var2 + 2] = var5;
        field3410[var2 + 3] = var6;
        method1505(arg0, var2);
        method1505(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "()V")
    private static final void method1506() {
        field3405 = 0;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lqa;[II)V")
    public static final void method1507(class167 arg0, int[] arg1, int arg2) {
        method1500(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)V")
    private static final void method1508(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field3410[var3 - 4];
                    int var5 = field3410[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field3410[var3 - 4] = var5;
                        field3410[var3] = var4;
                        int var6 = field3410[var3 - 2];
                        field3410[var3 - 2] = field3410[var3 + 2];
                        field3410[var3 + 2] = var6;
                        int var7 = field3410[var3 - 1];
                        field3410[var3 - 1] = field3410[var3 + 3];
                        field3410[var3 + 3] = var7;
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
}
