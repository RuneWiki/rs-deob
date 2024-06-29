import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class705 {

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    private static int field9683;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    private static int field9684;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    private static int field9685;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    private static int field9686;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    private static int field9688;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    private static int field9689;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    private static int field9690;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "[I")
    private static int[] field9687;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "()V")
    private static final void method3930() {
        field9689 = 0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)Z")
    private static final boolean method3931(int arg0) {
        int var1 = field9685;
        int var2 = field9686;
        int var3 = field9690;
        while (var2 >= var1) {
            var3++;
            field9690 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field9684;
            while (var1 < field9689) {
                int var5 = field9687[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field9687[var1];
                int var7 = field9687[var1 + 2];
                int var8 = field9687[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field9687[var1] = var10;
                field9687[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field9687[var11 + 3];
                if (var3 >= var12) {
                    field9687[var11] = field9687[var4];
                    field9687[var11 + 1] = field9687[var4 + 1];
                    field9687[var11 + 2] = field9687[var4 + 2];
                    field9687[var11 + 3] = field9687[var4 + 3];
                    var4 += 4;
                }
            }
            if (field9689 == var4) {
                field9689 = 0;
                return false;
            }
            method3933(var4, var1);
            field9684 = var4;
            field9685 = var1;
            var2 = var4;
        }
        field9688 = field9687[var2] >> 16;
        field9683 = field9687[var2 + 4] >> 16;
        field9687[var2] += field9687[var2 + 2];
        field9687[var2 + 4] += field9687[var2 + 6];
        var2 += 8;
        field9686 = var2;
        return true;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
    private static final void method3932(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field9687[arg0];
        int var4 = field9687[arg0 + 1];
        int var5 = field9687[arg0 + 2];
        int var6 = field9687[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field9687[var7 + 1];
            if (var8 < var4) {
                field9687[var2] = field9687[var7];
                field9687[var2 + 1] = var8;
                field9687[var2 + 2] = field9687[var7 + 2];
                field9687[var2 + 3] = field9687[var7 + 3];
                var2 += 4;
                field9687[var7] = field9687[var2];
                field9687[var7 + 1] = field9687[var2 + 1];
                field9687[var7 + 2] = field9687[var2 + 2];
                field9687[var7 + 3] = field9687[var2 + 3];
            }
        }
        field9687[var2] = var3;
        field9687[var2 + 1] = var4;
        field9687[var2 + 2] = var5;
        field9687[var2 + 3] = var6;
        method3932(arg0, var2);
        method3932(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)V")
    private static final void method3933(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field9687[var3 - 4];
                    int var5 = field9687[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field9687[var3 - 4] = var5;
                        field9687[var3] = var4;
                        int var6 = field9687[var3 - 2];
                        field9687[var3 - 2] = field9687[var3 + 2];
                        field9687[var3 + 2] = var6;
                        int var7 = field9687[var3 - 1];
                        field9687[var3 - 1] = field9687[var3 + 3];
                        field9687[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lha;[II)V")
    public static final void method3934(class66 arg0, int[] arg1, int arg2) {
        method3938(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    private static final void method3935(int arg0) {
        if (field9689 < 0) {
            field9686 = 0;
            field9685 = 0;
            field9684 = 0;
            field9690 = 2147483646;
            return;
        }
        method3932(0, field9689);
        int var1 = field9687[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field9689; var3 += 4) {
            int var4 = field9687[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field9687[var3];
            int var6 = field9687[var3 + 2];
            int var7 = field9687[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field9687[var3] = (var1 - var4) * var8 + var9;
            field9687[var3 + 2] = var8;
        }
        field9684 = var2;
        field9685 = var3;
        field9686 = var3;
        field9690 = var1 - 1;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "()V")
    public static void method3936() {
        field9687 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([III)V")
    private static final void method3937(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field9689;
        if (field9687 == null || field9687.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field9689; var5++) {
                var4[var5] = field9687[var5];
            }
            field9687 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field9687[field9689++] = arg0[var7];
                field9687[field9689++] = var9;
                field9687[field9689++] = arg0[var8];
                field9687[field9689++] = var10;
            } else if (var10 < var9) {
                field9687[field9689++] = arg0[var8];
                field9687[field9689++] = var10;
                field9687[field9689++] = arg0[var7];
                field9687[field9689++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lha;[IIII[I[I)V")
    private static final void method3938(class66 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method580(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method3930();
        method3937(arg1, arg2, arg3);
        method3935(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method3931(var7[3])) {
                    return;
                }
                var8 = field9688;
                var9 = field9683;
                var10 = field9690;
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
            arg0.method591(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lha;[II[I[I)V")
    public static final void method3939(class66 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method3938(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }
}
