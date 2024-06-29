import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class584 {

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "I")
    private static int field7386;

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "I")
    private static int field7388;

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "I")
    private static int field7389;

    @OriginalMember(owner = "client!vw", name = "e", descriptor = "I")
    private static int field7390;

    @OriginalMember(owner = "client!vw", name = "f", descriptor = "I")
    private static int field7391;

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "I")
    private static int field7392;

    @OriginalMember(owner = "client!vw", name = "h", descriptor = "I")
    private static int field7393;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "[I")
    private static int[] field7387;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(II)V")
    private static final void method3121(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field7387[arg0];
        int var4 = field7387[arg0 + 1];
        int var5 = field7387[arg0 + 2];
        int var6 = field7387[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field7387[var7 + 1];
            if (var8 < var4) {
                field7387[var2] = field7387[var7];
                field7387[var2 + 1] = var8;
                field7387[var2 + 2] = field7387[var7 + 2];
                field7387[var2 + 3] = field7387[var7 + 3];
                var2 += 4;
                field7387[var7] = field7387[var2];
                field7387[var7 + 1] = field7387[var2 + 1];
                field7387[var7 + 2] = field7387[var2 + 2];
                field7387[var7 + 3] = field7387[var2 + 3];
            }
        }
        field7387[var2] = var3;
        field7387[var2 + 1] = var4;
        field7387[var2 + 2] = var5;
        field7387[var2 + 3] = var6;
        method3121(arg0, var2);
        method3121(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(II)V")
    private static final void method3122(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field7387[var3 - 4];
                    int var5 = field7387[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field7387[var3 - 4] = var5;
                        field7387[var3] = var4;
                        int var6 = field7387[var3 - 2];
                        field7387[var3 - 2] = field7387[var3 + 2];
                        field7387[var3 + 2] = var6;
                        int var7 = field7387[var3 - 1];
                        field7387[var3 - 1] = field7387[var3 + 3];
                        field7387[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V")
    private static final void method3123(int arg0) {
        if (field7388 < 0) {
            field7391 = 0;
            field7393 = 0;
            field7386 = 0;
            field7389 = 2147483646;
            return;
        }
        method3121(0, field7388);
        int var1 = field7387[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field7388; var3 += 4) {
            int var4 = field7387[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field7387[var3];
            int var6 = field7387[var3 + 2];
            int var7 = field7387[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field7387[var3] = (var1 - var4) * var8 + var9;
            field7387[var3 + 2] = var8;
        }
        field7386 = var2;
        field7393 = var3;
        field7391 = var3;
        field7389 = var1 - 1;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lha;[II)V")
    public static final void method3124(class570 arg0, int[] arg1, int arg2) {
        method3127(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(I)Z")
    private static final boolean method3125(int arg0) {
        int var1 = field7393;
        int var2 = field7391;
        int var3 = field7389;
        while (var2 >= var1) {
            var3++;
            field7389 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field7386;
            while (var1 < field7388) {
                int var5 = field7387[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field7387[var1];
                int var7 = field7387[var1 + 2];
                int var8 = field7387[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field7387[var1] = var10;
                field7387[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field7387[var11 + 3];
                if (var3 >= var12) {
                    field7387[var11] = field7387[var4];
                    field7387[var11 + 1] = field7387[var4 + 1];
                    field7387[var11 + 2] = field7387[var4 + 2];
                    field7387[var11 + 3] = field7387[var4 + 3];
                    var4 += 4;
                }
            }
            if (field7388 == var4) {
                field7388 = 0;
                return false;
            }
            method3122(var4, var1);
            field7386 = var4;
            field7393 = var1;
            var2 = var4;
        }
        field7390 = field7387[var2] >> 16;
        field7392 = field7387[var2 + 4] >> 16;
        field7387[var2] += field7387[var2 + 2];
        field7387[var2 + 4] += field7387[var2 + 6];
        var2 += 8;
        field7391 = var2;
        return true;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "()V")
    public static void method3126() {
        field7387 = null;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lha;[IIII[I[I)V")
    private static final void method3127(class570 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method924(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method3129();
        method3130(arg1, arg2, arg3);
        method3123(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method3125(var7[3])) {
                    return;
                }
                var8 = field7390;
                var9 = field7392;
                var10 = field7389;
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
            arg0.method896(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lha;[II[I[I)V")
    public static final void method3128(class570 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method3127(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "()V")
    private static final void method3129() {
        field7388 = 0;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "([III)V")
    private static final void method3130(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field7388;
        if (field7387 == null || field7387.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field7388; var5++) {
                var4[var5] = field7387[var5];
            }
            field7387 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field7387[field7388++] = arg0[var7];
                field7387[field7388++] = var9;
                field7387[field7388++] = arg0[var8];
                field7387[field7388++] = var10;
            } else if (var10 < var9) {
                field7387[field7388++] = arg0[var8];
                field7387[field7388++] = var10;
                field7387[field7388++] = arg0[var7];
                field7387[field7388++] = var9;
            }
            var7 = var8;
        }
    }
}
