import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class155 {

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    private static int field2090;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    private static int field2091;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    private static int field2092;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    private static int field2094;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    private static int field2095;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    private static int field2096;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    private static int field2097;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "[I")
    private static int[] field2093;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "()V", line = 3)
    public static void method1073() {
        field2093 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lha;[II)V", line = 6)
    public static final void method1074(class66 arg0, int[] arg1, int arg2) {
        method1077(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 12)
    private static final void method1075(int arg0) {
        if (field2095 < 0) {
            field2091 = 0;
            field2092 = 0;
            field2097 = 0;
            field2090 = 2147483646;
            return;
        }
        method1081(0, field2095);
        int var1 = field2093[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field2095; var3 += 4) {
            int var4 = field2093[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field2093[var3];
            int var6 = field2093[var3 + 2];
            int var7 = field2093[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field2093[var3] = (var1 - var4) * var8 + var9;
            field2093[var3 + 2] = var8;
        }
        field2097 = var2;
        field2092 = var3;
        field2091 = var3;
        field2090 = var1 - 1;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)V", line = 61)
    private static final void method1076(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field2093[var3 - 4];
                    int var5 = field2093[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field2093[var3 - 4] = var5;
                        field2093[var3] = var4;
                        int var6 = field2093[var3 - 2];
                        field2093[var3 - 2] = field2093[var3 + 2];
                        field2093[var3 + 2] = var6;
                        int var7 = field2093[var3 - 1];
                        field2093[var3 - 1] = field2093[var3 + 3];
                        field2093[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lha;[IIII[I[I)V", line = 101)
    private static final void method1077(class66 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method467(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1078();
        method1082(arg1, arg2, arg3);
        method1075(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1080(var7[3])) {
                    return;
                }
                var8 = field2094;
                var9 = field2096;
                var10 = field2090;
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
            arg0.method474(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "()V", line = 138)
    private static final void method1078() {
        field2095 = 0;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lha;[II[I[I)V", line = 141)
    public static final void method1079(class66 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1077(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)Z", line = 145)
    private static final boolean method1080(int arg0) {
        int var1 = field2092;
        int var2 = field2091;
        int var3 = field2090;
        while (var2 >= var1) {
            var3++;
            field2090 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field2097;
            while (var1 < field2095) {
                int var5 = field2093[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field2093[var1];
                int var7 = field2093[var1 + 2];
                int var8 = field2093[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field2093[var1] = var10;
                field2093[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field2093[var11 + 3];
                if (var3 >= var12) {
                    field2093[var11] = field2093[var4];
                    field2093[var11 + 1] = field2093[var4 + 1];
                    field2093[var11 + 2] = field2093[var4 + 2];
                    field2093[var11 + 3] = field2093[var4 + 3];
                    var4 += 4;
                }
            }
            if (field2095 == var4) {
                field2095 = 0;
                return false;
            }
            method1076(var4, var1);
            field2097 = var4;
            field2092 = var1;
            var2 = var4;
        }
        field2094 = field2093[var2] >> 16;
        field2096 = field2093[var2 + 4] >> 16;
        field2093[var2] += field2093[var2 + 2];
        field2093[var2 + 4] += field2093[var2 + 6];
        var2 += 8;
        field2091 = var2;
        return true;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)V", line = 220)
    private static final void method1081(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field2093[arg0];
        int var4 = field2093[arg0 + 1];
        int var5 = field2093[arg0 + 2];
        int var6 = field2093[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field2093[var7 + 1];
            if (var8 < var4) {
                field2093[var2] = field2093[var7];
                field2093[var2 + 1] = var8;
                field2093[var2 + 2] = field2093[var7 + 2];
                field2093[var2 + 3] = field2093[var7 + 3];
                var2 += 4;
                field2093[var7] = field2093[var2];
                field2093[var7 + 1] = field2093[var2 + 1];
                field2093[var7 + 2] = field2093[var2 + 2];
                field2093[var7 + 3] = field2093[var2 + 3];
            }
        }
        field2093[var2] = var3;
        field2093[var2 + 1] = var4;
        field2093[var2 + 2] = var5;
        field2093[var2 + 3] = var6;
        method1081(arg0, var2);
        method1081(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "([III)V", line = 270)
    private static final void method1082(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field2095;
        if (field2093 == null || field2093.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field2095; var5++) {
                var4[var5] = field2093[var5];
            }
            field2093 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field2093[field2095++] = arg0[var7];
                field2093[field2095++] = var9;
                field2093[field2095++] = arg0[var8];
                field2093[field2095++] = var10;
            } else if (var10 < var9) {
                field2093[field2095++] = arg0[var8];
                field2093[field2095++] = var10;
                field2093[field2095++] = arg0[var7];
                field2093[field2095++] = var9;
            }
            var7 = var8;
        }
    }
}
