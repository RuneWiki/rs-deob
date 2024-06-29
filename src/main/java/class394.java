import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class394 {

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    private static int field5461;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    private static int field5462;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    private static int field5463;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    private static int field5464;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    private static int field5465;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "I")
    private static int field5466;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "I")
    private static int field5467;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "[I")
    private static int[] field5460;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lwm;[IIII[I[I)V", line = 7)
    private static final void method2400(class364 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method2074(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method2405();
        method2403(arg1, arg2, arg3);
        method2402(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method2404(var7[3])) {
                    return;
                }
                var8 = field5463;
                var9 = field5461;
                var10 = field5465;
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
            arg0.method2073(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "()V", line = 43)
    public static void method2401() {
        field5460 = null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V", line = 46)
    private static final void method2402(int arg0) {
        if (field5464 < 0) {
            field5462 = 0;
            field5467 = 0;
            field5466 = 0;
            field5465 = 2147483646;
            return;
        }
        method2407(0, field5464);
        int var1 = field5460[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field5464; var3 += 4) {
            int var4 = field5460[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field5460[var3];
            int var6 = field5460[var3 + 2];
            int var7 = field5460[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field5460[var3] = (var1 - var4) * var8 + var9;
            field5460[var3 + 2] = var8;
        }
        field5466 = var2;
        field5467 = var3;
        field5462 = var3;
        field5465 = var1 - 1;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "([III)V", line = 95)
    private static final void method2403(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field5464;
        if (field5460 == null || field5460.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field5464; var5++) {
                var4[var5] = field5460[var5];
            }
            field5460 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field5460[field5464++] = arg0[var7];
                field5460[field5464++] = var9;
                field5460[field5464++] = arg0[var8];
                field5460[field5464++] = var10;
            } else if (var10 < var9) {
                field5460[field5464++] = arg0[var8];
                field5460[field5464++] = var10;
                field5460[field5464++] = arg0[var7];
                field5460[field5464++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)Z", line = 148)
    private static final boolean method2404(int arg0) {
        int var1 = field5467;
        int var2 = field5462;
        int var3 = field5465;
        while (var2 >= var1) {
            var3++;
            field5465 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field5466;
            while (var1 < field5464) {
                int var5 = field5460[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field5460[var1];
                int var7 = field5460[var1 + 2];
                int var8 = field5460[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field5460[var1] = var10;
                field5460[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field5460[var11 + 3];
                if (var3 >= var12) {
                    field5460[var11] = field5460[var4];
                    field5460[var11 + 1] = field5460[var4 + 1];
                    field5460[var11 + 2] = field5460[var4 + 2];
                    field5460[var11 + 3] = field5460[var4 + 3];
                    var4 += 4;
                }
            }
            if (field5464 == var4) {
                field5464 = 0;
                return false;
            }
            method2406(var4, var1);
            field5466 = var4;
            field5467 = var1;
            var2 = var4;
        }
        field5463 = field5460[var2] >> 16;
        field5461 = field5460[var2 + 4] >> 16;
        field5460[var2] += field5460[var2 + 2];
        field5460[var2 + 4] += field5460[var2 + 6];
        var2 += 8;
        field5462 = var2;
        return true;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "()V", line = 223)
    private static final void method2405() {
        field5464 = 0;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)V", line = 227)
    private static final void method2406(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field5460[var3 - 4];
                    int var5 = field5460[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field5460[var3 - 4] = var5;
                        field5460[var3] = var4;
                        int var6 = field5460[var3 - 2];
                        field5460[var3 - 2] = field5460[var3 + 2];
                        field5460[var3 + 2] = var6;
                        int var7 = field5460[var3 - 1];
                        field5460[var3 - 1] = field5460[var3 + 3];
                        field5460[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(II)V", line = 268)
    private static final void method2407(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field5460[arg0];
        int var4 = field5460[arg0 + 1];
        int var5 = field5460[arg0 + 2];
        int var6 = field5460[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field5460[var7 + 1];
            if (var8 < var4) {
                field5460[var2] = field5460[var7];
                field5460[var2 + 1] = var8;
                field5460[var2 + 2] = field5460[var7 + 2];
                field5460[var2 + 3] = field5460[var7 + 3];
                var2 += 4;
                field5460[var7] = field5460[var2];
                field5460[var7 + 1] = field5460[var2 + 1];
                field5460[var7 + 2] = field5460[var2 + 2];
                field5460[var7 + 3] = field5460[var2 + 3];
            }
        }
        field5460[var2] = var3;
        field5460[var2 + 1] = var4;
        field5460[var2 + 2] = var5;
        field5460[var2 + 3] = var6;
        method2407(arg0, var2);
        method2407(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lwm;[II)V", line = 312)
    public static final void method2408(class364 arg0, int[] arg1, int arg2) {
        method2400(arg0, arg1, 0, arg1.length, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lwm;[II[I[I)V", line = 317)
    public static final void method2409(class364 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method2400(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }
}
