import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class10 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    private static int field148;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    private static int field149;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    private static int field150;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    private static int field152;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    private static int field153;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    private static int field154;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    private static int field155;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "[I")
    private static int[] field151;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)Z", line = 4)
    private static final boolean method73(int arg0) {
        int var1 = field152;
        int var2 = field148;
        int var3 = field155;
        while (var2 >= var1) {
            var3++;
            field155 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field150;
            while (var1 < field149) {
                int var5 = field151[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field151[var1];
                int var7 = field151[var1 + 2];
                int var8 = field151[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field151[var1] = var10;
                field151[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field151[var11 + 3];
                if (var3 >= var12) {
                    field151[var11] = field151[var4];
                    field151[var11 + 1] = field151[var4 + 1];
                    field151[var11 + 2] = field151[var4 + 2];
                    field151[var11 + 3] = field151[var4 + 3];
                    var4 += 4;
                }
            }
            if (field149 == var4) {
                field149 = 0;
                return false;
            }
            method77(var4, var1);
            field150 = var4;
            field152 = var1;
            var2 = var4;
        }
        field154 = field151[var2] >> 16;
        field153 = field151[var2 + 4] >> 16;
        field151[var2] += field151[var2 + 2];
        field151[var2 + 4] += field151[var2 + 6];
        var2 += 8;
        field148 = var2;
        return true;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Leq;[IIII[I[I)V", line = 82)
    private static final void method74(class134 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method785(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method82();
        method80(arg1, arg2, arg3);
        method79(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method73(var7[3])) {
                    return;
                }
                var8 = field154;
                var9 = field153;
                var10 = field155;
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
            arg0.method793(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V", line = 121)
    private static final void method75(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field151[arg0];
        int var4 = field151[arg0 + 1];
        int var5 = field151[arg0 + 2];
        int var6 = field151[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field151[var7 + 1];
            if (var8 < var4) {
                field151[var2] = field151[var7];
                field151[var2 + 1] = var8;
                field151[var2 + 2] = field151[var7 + 2];
                field151[var2 + 3] = field151[var7 + 3];
                var2 += 4;
                field151[var7] = field151[var2];
                field151[var7 + 1] = field151[var2 + 1];
                field151[var7 + 2] = field151[var2 + 2];
                field151[var7 + 3] = field151[var2 + 3];
            }
        }
        field151[var2] = var3;
        field151[var2 + 1] = var4;
        field151[var2 + 2] = var5;
        field151[var2 + 3] = var6;
        method75(arg0, var2);
        method75(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V", line = 168)
    public static void method76() {
        field151 = null;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)V", line = 171)
    private static final void method77(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field151[var3 - 4];
                    int var5 = field151[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field151[var3 - 4] = var5;
                        field151[var3] = var4;
                        int var6 = field151[var3 - 2];
                        field151[var3 - 2] = field151[var3 + 2];
                        field151[var3 + 2] = var6;
                        int var7 = field151[var3 - 1];
                        field151[var3 - 1] = field151[var3 + 3];
                        field151[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Leq;[II[I[I)V", line = 210)
    public static final void method78(class134 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method74(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V", line = 215)
    private static final void method79(int arg0) {
        if (field149 < 0) {
            field148 = 0;
            field152 = 0;
            field150 = 0;
            field155 = 2147483646;
            return;
        }
        method75(0, field149);
        int var1 = field151[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field149; var3 += 4) {
            int var4 = field151[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field151[var3];
            int var6 = field151[var3 + 2];
            int var7 = field151[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field151[var3] = (var1 - var4) * var8 + var9;
            field151[var3 + 2] = var8;
        }
        field150 = var2;
        field152 = var3;
        field148 = var3;
        field155 = var1 - 1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([III)V", line = 265)
    private static final void method80(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field149;
        if (field151 == null || field151.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field149; var5++) {
                var4[var5] = field151[var5];
            }
            field151 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field151[field149++] = arg0[var7];
                field151[field149++] = var9;
                field151[field149++] = arg0[var8];
                field151[field149++] = var10;
            } else if (var10 < var9) {
                field151[field149++] = arg0[var8];
                field151[field149++] = var10;
                field151[field149++] = arg0[var7];
                field151[field149++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Leq;[II)V", line = 314)
    public static final void method81(class134 arg0, int[] arg1, int arg2) {
        method74(arg0, arg1, 0, arg1.length, arg2, null, null);
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()V", line = 317)
    private static final void method82() {
        field149 = 0;
    }
}
