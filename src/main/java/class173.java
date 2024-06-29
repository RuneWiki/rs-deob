import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class173 {

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    private static int field2555;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    private static int field2556;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    private static int field2557;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    private static int field2558;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    private static int field2559;

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "I")
    private static int field2561;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
    private static int field2562;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "[I")
    private static int[] field2560;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)Z", line = 5)
    private static final boolean method1315(int arg0) {
        int var1 = field2558;
        int var2 = field2561;
        int var3 = field2559;
        while (var2 >= var1) {
            var3++;
            field2559 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field2562;
            while (var1 < field2555) {
                int var5 = field2560[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field2560[var1];
                int var7 = field2560[var1 + 2];
                int var8 = field2560[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field2560[var1] = var10;
                field2560[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field2560[var11 + 3];
                if (var3 >= var12) {
                    field2560[var11] = field2560[var4];
                    field2560[var11 + 1] = field2560[var4 + 1];
                    field2560[var11 + 2] = field2560[var4 + 2];
                    field2560[var11 + 3] = field2560[var4 + 3];
                    var4 += 4;
                }
            }
            if (field2555 == var4) {
                field2555 = 0;
                return false;
            }
            method1318(var4, var1);
            field2562 = var4;
            field2558 = var1;
            var2 = var4;
        }
        field2557 = field2560[var2] >> 16;
        field2556 = field2560[var2 + 4] >> 16;
        field2560[var2] += field2560[var2 + 2];
        field2560[var2 + 4] += field2560[var2 + 6];
        var2 += 8;
        field2561 = var2;
        return true;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V", line = 84)
    private static final void method1316(int arg0) {
        if (field2555 < 0) {
            field2561 = 0;
            field2558 = 0;
            field2562 = 0;
            field2559 = 2147483646;
            return;
        }
        method1320(0, field2555);
        int var1 = field2560[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field2555; var3 += 4) {
            int var4 = field2560[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field2560[var3];
            int var6 = field2560[var3 + 2];
            int var7 = field2560[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field2560[var3] = (var1 - var4) * var8 + var9;
            field2560[var3 + 2] = var8;
        }
        field2562 = var2;
        field2558 = var3;
        field2561 = var3;
        field2559 = var1 - 1;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lja;[II[I[I)V", line = 130)
    public static final void method1317(class90 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1323(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)V", line = 133)
    private static final void method1318(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field2560[var3 - 4];
                    int var5 = field2560[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field2560[var3 - 4] = var5;
                        field2560[var3] = var4;
                        int var6 = field2560[var3 - 2];
                        field2560[var3 - 2] = field2560[var3 + 2];
                        field2560[var3 + 2] = var6;
                        int var7 = field2560[var3 - 1];
                        field2560[var3 - 1] = field2560[var3 + 3];
                        field2560[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "()V", line = 170)
    private static final void method1319() {
        field2555 = 0;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(II)V", line = 177)
    private static final void method1320(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field2560[arg0];
        int var4 = field2560[arg0 + 1];
        int var5 = field2560[arg0 + 2];
        int var6 = field2560[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field2560[var7 + 1];
            if (var8 < var4) {
                field2560[var2] = field2560[var7];
                field2560[var2 + 1] = var8;
                field2560[var2 + 2] = field2560[var7 + 2];
                field2560[var2 + 3] = field2560[var7 + 3];
                var2 += 4;
                field2560[var7] = field2560[var2];
                field2560[var7 + 1] = field2560[var2 + 1];
                field2560[var7 + 2] = field2560[var2 + 2];
                field2560[var7 + 3] = field2560[var2 + 3];
            }
        }
        field2560[var2] = var3;
        field2560[var2 + 1] = var4;
        field2560[var2 + 2] = var5;
        field2560[var2 + 3] = var6;
        method1320(arg0, var2);
        method1320(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "()V", line = 221)
    public static void method1321() {
        field2560 = null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lja;[II)V", line = 224)
    public static final void method1322(class90 arg0, int[] arg1, int arg2) {
        method1323(arg0, arg1, 0, arg1.length, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lja;[IIII[I[I)V", line = 230)
    private static final void method1323(class90 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method708(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1319();
        method1324(arg1, arg2, arg3);
        method1316(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1315(var7[3])) {
                    return;
                }
                var8 = field2557;
                var9 = field2556;
                var10 = field2559;
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
            arg0.method729(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "([III)V", line = 269)
    private static final void method1324(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field2555;
        if (field2560 == null || field2560.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field2555; var5++) {
                var4[var5] = field2560[var5];
            }
            field2560 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field2560[field2555++] = arg0[var7];
                field2560[field2555++] = var9;
                field2560[field2555++] = arg0[var8];
                field2560[field2555++] = var10;
            } else if (var10 < var9) {
                field2560[field2555++] = arg0[var8];
                field2560[field2555++] = var10;
                field2560[field2555++] = arg0[var7];
                field2560[field2555++] = var9;
            }
            var7 = var8;
        }
    }
}
