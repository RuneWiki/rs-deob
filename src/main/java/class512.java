import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class512 {

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    private static int field7510;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    private static int field7511;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    private static int field7512;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    private static int field7513;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    private static int field7514;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
    private static int field7515;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
    private static int field7516;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "[I")
    private static int[] field7509;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "()V", line = 5)
    private static final void method3905() {
        field7516 = 0;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)Z", line = 9)
    private static final boolean method3906(int arg0) {
        int var1 = field7510;
        int var2 = field7512;
        int var3 = field7511;
        while (var2 >= var1) {
            var3++;
            field7511 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field7514;
            while (var1 < field7516) {
                int var5 = field7509[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field7509[var1];
                int var7 = field7509[var1 + 2];
                int var8 = field7509[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field7509[var1] = var10;
                field7509[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field7509[var11 + 3];
                if (var3 >= var12) {
                    field7509[var11] = field7509[var4];
                    field7509[var11 + 1] = field7509[var4 + 1];
                    field7509[var11 + 2] = field7509[var4 + 2];
                    field7509[var11 + 3] = field7509[var4 + 3];
                    var4 += 4;
                }
            }
            if (field7516 == var4) {
                field7516 = 0;
                return false;
            }
            method3908(var4, var1);
            field7514 = var4;
            field7510 = var1;
            var2 = var4;
        }
        field7515 = field7509[var2] >> 16;
        field7513 = field7509[var2 + 4] >> 16;
        field7509[var2] += field7509[var2 + 2];
        field7509[var2 + 4] += field7509[var2 + 6];
        var2 += 8;
        field7512 = var2;
        return true;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "([III)V", line = 90)
    private static final void method3907(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field7516;
        if (field7509 == null || field7509.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field7516; var5++) {
                var4[var5] = field7509[var5];
            }
            field7509 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field7509[field7516++] = arg0[var7];
                field7509[field7516++] = var9;
                field7509[field7516++] = arg0[var8];
                field7509[field7516++] = var10;
            } else if (var10 < var9) {
                field7509[field7516++] = arg0[var8];
                field7509[field7516++] = var10;
                field7509[field7516++] = arg0[var7];
                field7509[field7516++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)V", line = 139)
    private static final void method3908(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field7509[var3 - 4];
                    int var5 = field7509[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field7509[var3 - 4] = var5;
                        field7509[var3] = var4;
                        int var6 = field7509[var3 - 2];
                        field7509[var3 - 2] = field7509[var3 + 2];
                        field7509[var3 + 2] = var6;
                        int var7 = field7509[var3 - 1];
                        field7509[var3 - 1] = field7509[var3 + 3];
                        field7509[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(II)V", line = 177)
    private static final void method3909(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field7509[arg0];
        int var4 = field7509[arg0 + 1];
        int var5 = field7509[arg0 + 2];
        int var6 = field7509[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field7509[var7 + 1];
            if (var8 < var4) {
                field7509[var2] = field7509[var7];
                field7509[var2 + 1] = var8;
                field7509[var2 + 2] = field7509[var7 + 2];
                field7509[var2 + 3] = field7509[var7 + 3];
                var2 += 4;
                field7509[var7] = field7509[var2];
                field7509[var7 + 1] = field7509[var2 + 1];
                field7509[var7 + 2] = field7509[var2 + 2];
                field7509[var7 + 3] = field7509[var2 + 3];
            }
        }
        field7509[var2] = var3;
        field7509[var2 + 1] = var4;
        field7509[var2 + 2] = var5;
        field7509[var2 + 3] = var6;
        method3909(arg0, var2);
        method3909(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "()V", line = 221)
    public static void method3910() {
        field7509 = null;
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)V", line = 225)
    private static final void method3911(int arg0) {
        if (field7516 < 0) {
            field7512 = 0;
            field7510 = 0;
            field7514 = 0;
            field7511 = 2147483646;
            return;
        }
        method3909(0, field7516);
        int var1 = field7509[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field7516; var3 += 4) {
            int var4 = field7509[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field7509[var3];
            int var6 = field7509[var3 + 2];
            int var7 = field7509[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field7509[var3] = (var1 - var4) * var8 + var9;
            field7509[var3 + 2] = var8;
        }
        field7514 = var2;
        field7510 = var3;
        field7512 = var3;
        field7511 = var1 - 1;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lha;[II[I[I)V", line = 270)
    public static final void method3912(class18 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method3913(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lha;[IIII[I[I)V", line = 278)
    private static final void method3913(class18 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method229(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method3905();
        method3907(arg1, arg2, arg3);
        method3911(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method3906(var7[3])) {
                    return;
                }
                var8 = field7515;
                var9 = field7513;
                var10 = field7511;
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
            arg0.method213(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lha;[II)V", line = 317)
    public static final void method3914(class18 arg0, int[] arg1, int arg2) {
        method3913(arg0, arg1, 0, arg1.length, arg2, null, null);
    }
}
