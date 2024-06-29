import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class464 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    private static int field6670;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    private static int field6671;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    private static int field6672;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    private static int field6673;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    private static int field6674;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    private static int field6675;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    private static int field6676;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "[I")
    private static int[] field6677;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "()V")
    public static void method2730() {
        field6677 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([III)V")
    private static final void method2731(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field6673;
        if (field6677 == null || field6677.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field6673; var5++) {
                var4[var5] = field6677[var5];
            }
            field6677 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field6677[field6673++] = arg0[var7];
                field6677[field6673++] = var9;
                field6677[field6673++] = arg0[var8];
                field6677[field6673++] = var10;
            } else if (var10 < var9) {
                field6677[field6673++] = arg0[var8];
                field6677[field6673++] = var10;
                field6677[field6673++] = arg0[var7];
                field6677[field6673++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lr;[II)V")
    public static final void method2732(class166 arg0, int[] arg1, int arg2) {
        method2736(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)Z")
    private static final boolean method2733(int arg0) {
        int var1 = field6670;
        int var2 = field6675;
        int var3 = field6676;
        while (var2 >= var1) {
            var3++;
            field6676 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field6672;
            while (var1 < field6673) {
                int var5 = field6677[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field6677[var1];
                int var7 = field6677[var1 + 2];
                int var8 = field6677[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field6677[var1] = var10;
                field6677[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field6677[var11 + 3];
                if (var3 >= var12) {
                    field6677[var11] = field6677[var4];
                    field6677[var11 + 1] = field6677[var4 + 1];
                    field6677[var11 + 2] = field6677[var4 + 2];
                    field6677[var11 + 3] = field6677[var4 + 3];
                    var4 += 4;
                }
            }
            if (field6673 == var4) {
                field6673 = 0;
                return false;
            }
            method2734(var4, var1);
            field6672 = var4;
            field6670 = var1;
            var2 = var4;
        }
        field6674 = field6677[var2] >> 16;
        field6671 = field6677[var2 + 4] >> 16;
        field6677[var2] += field6677[var2 + 2];
        field6677[var2 + 4] += field6677[var2 + 6];
        var2 += 8;
        field6675 = var2;
        return true;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
    private static final void method2734(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field6677[var3 - 4];
                    int var5 = field6677[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field6677[var3 - 4] = var5;
                        field6677[var3] = var4;
                        int var6 = field6677[var3 - 2];
                        field6677[var3 - 2] = field6677[var3 + 2];
                        field6677[var3 + 2] = var6;
                        int var7 = field6677[var3 - 1];
                        field6677[var3 - 1] = field6677[var3 + 3];
                        field6677[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lr;[II[I[I)V")
    public static final void method2735(class166 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method2736(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lr;[IIII[I[I)V")
    private static final void method2736(class166 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method204(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method2737();
        method2731(arg1, arg2, arg3);
        method2739(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method2733(var7[3])) {
                    return;
                }
                var8 = field6674;
                var9 = field6671;
                var10 = field6676;
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
            arg0.method202(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "()V")
    private static final void method2737() {
        field6673 = 0;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)V")
    private static final void method2738(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field6677[arg0];
        int var4 = field6677[arg0 + 1];
        int var5 = field6677[arg0 + 2];
        int var6 = field6677[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field6677[var7 + 1];
            if (var8 < var4) {
                field6677[var2] = field6677[var7];
                field6677[var2 + 1] = var8;
                field6677[var2 + 2] = field6677[var7 + 2];
                field6677[var2 + 3] = field6677[var7 + 3];
                var2 += 4;
                field6677[var7] = field6677[var2];
                field6677[var7 + 1] = field6677[var2 + 1];
                field6677[var7 + 2] = field6677[var2 + 2];
                field6677[var7 + 3] = field6677[var2 + 3];
            }
        }
        field6677[var2] = var3;
        field6677[var2 + 1] = var4;
        field6677[var2 + 2] = var5;
        field6677[var2 + 3] = var6;
        method2738(arg0, var2);
        method2738(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    private static final void method2739(int arg0) {
        if (field6673 < 0) {
            field6675 = 0;
            field6670 = 0;
            field6672 = 0;
            field6676 = 2147483646;
            return;
        }
        method2738(0, field6673);
        int var1 = field6677[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field6673; var3 += 4) {
            int var4 = field6677[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field6677[var3];
            int var6 = field6677[var3 + 2];
            int var7 = field6677[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field6677[var3] = (var1 - var4) * var8 + var9;
            field6677[var3 + 2] = var8;
        }
        field6672 = var2;
        field6670 = var3;
        field6675 = var3;
        field6676 = var1 - 1;
    }
}
