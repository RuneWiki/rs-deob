import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class271 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    private static int field4005;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    private static int field4006;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    private static int field4007;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    private static int field4008;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    private static int field4010;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    private static int field4011;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    private static int field4012;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "[I")
    private static int[] field4009;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lya;[II)V", line = 7)
    public static final void method1744(class38 arg0, int[] arg1, int arg2) {
        method1750(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V", line = 11)
    private static final void method1745(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field4009[arg0];
        int var4 = field4009[arg0 + 1];
        int var5 = field4009[arg0 + 2];
        int var6 = field4009[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field4009[var7 + 1];
            if (var8 < var4) {
                field4009[var2] = field4009[var7];
                field4009[var2 + 1] = var8;
                field4009[var2 + 2] = field4009[var7 + 2];
                field4009[var2 + 3] = field4009[var7 + 3];
                var2 += 4;
                field4009[var7] = field4009[var2];
                field4009[var7 + 1] = field4009[var2 + 1];
                field4009[var7 + 2] = field4009[var2 + 2];
                field4009[var7 + 3] = field4009[var2 + 3];
            }
        }
        field4009[var2] = var3;
        field4009[var2 + 1] = var4;
        field4009[var2 + 2] = var5;
        field4009[var2 + 3] = var6;
        method1745(arg0, var2);
        method1745(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)V", line = 55)
    private static final void method1746(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field4009[var3 - 4];
                    int var5 = field4009[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field4009[var3 - 4] = var5;
                        field4009[var3] = var4;
                        int var6 = field4009[var3 - 2];
                        field4009[var3 - 2] = field4009[var3 + 2];
                        field4009[var3 + 2] = var6;
                        int var7 = field4009[var3 - 1];
                        field4009[var3 - 1] = field4009[var3 + 3];
                        field4009[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "()V", line = 94)
    public static void method1747() {
        field4009 = null;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "()V", line = 97)
    private static final void method1748() {
        field4008 = 0;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)Z", line = 101)
    private static final boolean method1749(int arg0) {
        int var1 = field4005;
        int var2 = field4007;
        int var3 = field4011;
        while (var2 >= var1) {
            var3++;
            field4011 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field4010;
            while (var1 < field4008) {
                int var5 = field4009[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field4009[var1];
                int var7 = field4009[var1 + 2];
                int var8 = field4009[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field4009[var1] = var10;
                field4009[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field4009[var11 + 3];
                if (var3 >= var12) {
                    field4009[var11] = field4009[var4];
                    field4009[var11 + 1] = field4009[var4 + 1];
                    field4009[var11 + 2] = field4009[var4 + 2];
                    field4009[var11 + 3] = field4009[var4 + 3];
                    var4 += 4;
                }
            }
            if (field4008 == var4) {
                field4008 = 0;
                return false;
            }
            method1746(var4, var1);
            field4010 = var4;
            field4005 = var1;
            var2 = var4;
        }
        field4006 = field4009[var2] >> 16;
        field4012 = field4009[var2 + 4] >> 16;
        field4009[var2] += field4009[var2 + 2];
        field4009[var2 + 4] += field4009[var2 + 6];
        var2 += 8;
        field4007 = var2;
        return true;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lya;[IIII[I[I)V", line = 180)
    private static final void method1750(class38 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method332(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1748();
        method1753(arg1, arg2, arg3);
        method1751(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1749(var7[3])) {
                    return;
                }
                var8 = field4006;
                var9 = field4012;
                var10 = field4011;
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
            arg0.method391(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V", line = 217)
    private static final void method1751(int arg0) {
        if (field4008 < 0) {
            field4007 = 0;
            field4005 = 0;
            field4010 = 0;
            field4011 = 2147483646;
            return;
        }
        method1745(0, field4008);
        int var1 = field4009[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field4008; var3 += 4) {
            int var4 = field4009[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field4009[var3];
            int var6 = field4009[var3 + 2];
            int var7 = field4009[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field4009[var3] = (var1 - var4) * var8 + var9;
            field4009[var3 + 2] = var8;
        }
        field4010 = var2;
        field4005 = var3;
        field4007 = var3;
        field4011 = var1 - 1;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lya;[II[I[I)V", line = 262)
    public static final void method1752(class38 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1750(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([III)V", line = 271)
    private static final void method1753(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field4008;
        if (field4009 == null || field4009.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field4008; var5++) {
                var4[var5] = field4009[var5];
            }
            field4009 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field4009[field4008++] = arg0[var7];
                field4009[field4008++] = var9;
                field4009[field4008++] = arg0[var8];
                field4009[field4008++] = var10;
            } else if (var10 < var9) {
                field4009[field4008++] = arg0[var8];
                field4009[field4008++] = var10;
                field4009[field4008++] = arg0[var7];
                field4009[field4008++] = var9;
            }
            var7 = var8;
        }
    }
}
