import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class137 {

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    private static int field2075;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    private static int field2076;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    private static int field2077;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    private static int field2078;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    private static int field2079;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    private static int field2081;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    private static int field2082;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "[I")
    private static int[] field2080;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "()V", line = 3)
    private static final void method1002() {
        field2081 = 0;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)Z", line = 7)
    private static final boolean method1003(int arg0) {
        int var1 = field2077;
        int var2 = field2079;
        int var3 = field2075;
        while (var2 >= var1) {
            var3++;
            field2075 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field2078;
            while (var1 < field2081) {
                int var5 = field2080[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field2080[var1];
                int var7 = field2080[var1 + 2];
                int var8 = field2080[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field2080[var1] = var10;
                field2080[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field2080[var11 + 3];
                if (var3 >= var12) {
                    field2080[var11] = field2080[var4];
                    field2080[var11 + 1] = field2080[var4 + 1];
                    field2080[var11 + 2] = field2080[var4 + 2];
                    field2080[var11 + 3] = field2080[var4 + 3];
                    var4 += 4;
                }
            }
            if (field2081 == var4) {
                field2081 = 0;
                return false;
            }
            method1011(var4, var1);
            field2078 = var4;
            field2077 = var1;
            var2 = var4;
        }
        field2082 = field2080[var2] >> 16;
        field2076 = field2080[var2 + 4] >> 16;
        field2080[var2] += field2080[var2 + 2];
        field2080[var2 + 4] += field2080[var2 + 6];
        var2 += 8;
        field2079 = var2;
        return true;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([III)V", line = 85)
    private static final void method1004(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field2081;
        if (field2080 == null || field2080.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field2081; var5++) {
                var4[var5] = field2080[var5];
            }
            field2080 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field2080[field2081++] = arg0[var7];
                field2080[field2081++] = var9;
                field2080[field2081++] = arg0[var8];
                field2080[field2081++] = var10;
            } else if (var10 < var9) {
                field2080[field2081++] = arg0[var8];
                field2080[field2081++] = var10;
                field2080[field2081++] = arg0[var7];
                field2080[field2081++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V", line = 136)
    private static final void method1005(int arg0) {
        if (field2081 < 0) {
            field2079 = 0;
            field2077 = 0;
            field2078 = 0;
            field2075 = 2147483646;
            return;
        }
        method1010(0, field2081);
        int var1 = field2080[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field2081; var3 += 4) {
            int var4 = field2080[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field2080[var3];
            int var6 = field2080[var3 + 2];
            int var7 = field2080[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field2080[var3] = (var1 - var4) * var8 + var9;
            field2080[var3 + 2] = var8;
        }
        field2078 = var2;
        field2077 = var3;
        field2079 = var3;
        field2075 = var1 - 1;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lza;[IIII[I[I)V", line = 185)
    private static final void method1006(class299 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method545(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1002();
        method1004(arg1, arg2, arg3);
        method1005(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1003(var7[3])) {
                    return;
                }
                var8 = field2082;
                var9 = field2076;
                var10 = field2075;
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
            arg0.method566(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "()V", line = 224)
    public static void method1007() {
        field2080 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lza;[II)V", line = 231)
    public static final void method1008(class299 arg0, int[] arg1, int arg2) {
        method1006(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lza;[II[I[I)V", line = 234)
    public static final void method1009(class299 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1006(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)V", line = 239)
    private static final void method1010(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field2080[arg0];
        int var4 = field2080[arg0 + 1];
        int var5 = field2080[arg0 + 2];
        int var6 = field2080[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field2080[var7 + 1];
            if (var8 < var4) {
                field2080[var2] = field2080[var7];
                field2080[var2 + 1] = var8;
                field2080[var2 + 2] = field2080[var7 + 2];
                field2080[var2 + 3] = field2080[var7 + 3];
                var2 += 4;
                field2080[var7] = field2080[var2];
                field2080[var7 + 1] = field2080[var2 + 1];
                field2080[var7 + 2] = field2080[var2 + 2];
                field2080[var7 + 3] = field2080[var2 + 3];
            }
        }
        field2080[var2] = var3;
        field2080[var2 + 1] = var4;
        field2080[var2 + 2] = var5;
        field2080[var2 + 3] = var6;
        method1010(arg0, var2);
        method1010(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(II)V", line = 283)
    private static final void method1011(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field2080[var3 - 4];
                    int var5 = field2080[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field2080[var3 - 4] = var5;
                        field2080[var3] = var4;
                        int var6 = field2080[var3 - 2];
                        field2080[var3 - 2] = field2080[var3 + 2];
                        field2080[var3 + 2] = var6;
                        int var7 = field2080[var3 - 1];
                        field2080[var3 - 1] = field2080[var3 + 3];
                        field2080[var3 + 3] = var7;
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
