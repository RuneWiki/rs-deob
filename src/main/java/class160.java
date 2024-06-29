import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class160 {

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    private static int field1976;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    private static int field1977;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    private static int field1978;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    private static int field1979;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    private static int field1980;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    private static int field1981;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    private static int field1983;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "[I")
    private static int[] field1982;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lha;[II)V", line = 3)
    public static final void method1119(class66 arg0, int[] arg1, int arg2) {
        method1121(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V", line = 6)
    private static final void method1120(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field1982[arg0];
        int var4 = field1982[arg0 + 1];
        int var5 = field1982[arg0 + 2];
        int var6 = field1982[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field1982[var7 + 1];
            if (var8 < var4) {
                field1982[var2] = field1982[var7];
                field1982[var2 + 1] = var8;
                field1982[var2 + 2] = field1982[var7 + 2];
                field1982[var2 + 3] = field1982[var7 + 3];
                var2 += 4;
                field1982[var7] = field1982[var2];
                field1982[var7 + 1] = field1982[var2 + 1];
                field1982[var7 + 2] = field1982[var2 + 2];
                field1982[var7 + 3] = field1982[var2 + 3];
            }
        }
        field1982[var2] = var3;
        field1982[var2 + 1] = var4;
        field1982[var2 + 2] = var5;
        field1982[var2 + 3] = var6;
        method1120(arg0, var2);
        method1120(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lha;[IIII[I[I)V", line = 54)
    private static final void method1121(class66 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method566(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1123();
        method1127(arg1, arg2, arg3);
        method1128(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1122(var7[3])) {
                    return;
                }
                var8 = field1980;
                var9 = field1978;
                var10 = field1983;
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
            arg0.method593(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Z", line = 93)
    private static final boolean method1122(int arg0) {
        int var1 = field1981;
        int var2 = field1976;
        int var3 = field1983;
        while (var2 >= var1) {
            var3++;
            field1983 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field1979;
            while (var1 < field1977) {
                int var5 = field1982[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field1982[var1];
                int var7 = field1982[var1 + 2];
                int var8 = field1982[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field1982[var1] = var10;
                field1982[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field1982[var11 + 3];
                if (var3 >= var12) {
                    field1982[var11] = field1982[var4];
                    field1982[var11 + 1] = field1982[var4 + 1];
                    field1982[var11 + 2] = field1982[var4 + 2];
                    field1982[var11 + 3] = field1982[var4 + 3];
                    var4 += 4;
                }
            }
            if (field1977 == var4) {
                field1977 = 0;
                return false;
            }
            method1124(var4, var1);
            field1979 = var4;
            field1981 = var1;
            var2 = var4;
        }
        field1980 = field1982[var2] >> 16;
        field1978 = field1982[var2 + 4] >> 16;
        field1982[var2] += field1982[var2 + 2];
        field1982[var2 + 4] += field1982[var2 + 6];
        var2 += 8;
        field1976 = var2;
        return true;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "()V", line = 170)
    private static final void method1123() {
        field1977 = 0;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)V", line = 173)
    private static final void method1124(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field1982[var3 - 4];
                    int var5 = field1982[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field1982[var3 - 4] = var5;
                        field1982[var3] = var4;
                        int var6 = field1982[var3 - 2];
                        field1982[var3 - 2] = field1982[var3 + 2];
                        field1982[var3 + 2] = var6;
                        int var7 = field1982[var3 - 1];
                        field1982[var3 - 1] = field1982[var3 + 3];
                        field1982[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "()V", line = 213)
    public static void method1125() {
        field1982 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lha;[II[I[I)V", line = 216)
    public static final void method1126(class66 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1121(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([III)V", line = 224)
    private static final void method1127(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field1977;
        if (field1982 == null || field1982.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field1977; var5++) {
                var4[var5] = field1982[var5];
            }
            field1982 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field1982[field1977++] = arg0[var7];
                field1982[field1977++] = var9;
                field1982[field1977++] = arg0[var8];
                field1982[field1977++] = var10;
            } else if (var10 < var9) {
                field1982[field1977++] = arg0[var8];
                field1982[field1977++] = var10;
                field1982[field1977++] = arg0[var7];
                field1982[field1977++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V", line = 273)
    private static final void method1128(int arg0) {
        if (field1977 < 0) {
            field1976 = 0;
            field1981 = 0;
            field1979 = 0;
            field1983 = 2147483646;
            return;
        }
        method1120(0, field1977);
        int var1 = field1982[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field1977; var3 += 4) {
            int var4 = field1982[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field1982[var3];
            int var6 = field1982[var3 + 2];
            int var7 = field1982[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field1982[var3] = (var1 - var4) * var8 + var9;
            field1982[var3 + 2] = var8;
        }
        field1979 = var2;
        field1981 = var3;
        field1976 = var3;
        field1983 = var1 - 1;
    }
}
