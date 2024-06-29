import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class188 {

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    private static int field2918;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    private static int field2920;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    private static int field2921;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    private static int field2922;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    private static int field2923;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    private static int field2924;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    private static int field2925;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "[I")
    private static int[] field2919;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([IIIII[I[I)V", line = 9)
    private static final void method1293(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (arg5 != null && class335.field5429 - class335.field5427 != arg5.length) {
            throw new IllegalStateException();
        }
        method1294();
        method1296(arg0, arg1, arg2);
        method1295(arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "()V", line = 17)
    private static final void method1294() {
        field2925 = 0;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II[I[I)V", line = 22)
    private static final void method1295(int arg0, int arg1, int[] arg2, int[] arg3) {
        method1299();
        while (true) {
            int var4;
            int var5;
            int var6;
            do {
                if (!method1301()) {
                    return;
                }
                var4 = field2920;
                var5 = field2921;
                var6 = field2923;
                if (arg2 == null) {
                    break;
                }
                int var7 = var6 - class335.field5427;
                if (var4 < arg2[var7] + class335.field5430) {
                    var4 = arg2[var7] + class335.field5430;
                }
                if (var5 > arg2[var7] + arg3[var7] + class335.field5430) {
                    var5 = arg2[var7] + arg3[var7] + class335.field5430;
                }
            } while (var4 >= var5);
            class335.method2374(var4, var6, var5 - var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([III)V", line = 57)
    private static final void method1296(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field2925;
        if (field2919 == null || field2919.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field2925; var5++) {
                var4[var5] = field2919[var5];
            }
            field2919 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field2919[field2925++] = arg0[var7];
                field2919[field2925++] = var9;
                field2919[field2925++] = arg0[var8];
                field2919[field2925++] = var10;
            } else if (var10 < var9) {
                field2919[field2925++] = arg0[var8];
                field2919[field2925++] = var10;
                field2919[field2925++] = arg0[var7];
                field2919[field2925++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V", line = 114)
    private static final void method1297(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field2919[var3 - 4];
                    int var5 = field2919[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field2919[var3 - 4] = var5;
                        field2919[var3] = var4;
                        int var6 = field2919[var3 - 2];
                        field2919[var3 - 2] = field2919[var3 + 2];
                        field2919[var3 + 2] = var6;
                        int var7 = field2919[var3 - 1];
                        field2919[var3 - 1] = field2919[var3 + 3];
                        field2919[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([III[I[I)V", line = 151)
    public static final void method1298(int[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        method1293(arg0, 0, arg0.length, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "()V", line = 154)
    private static final void method1299() {
        if (field2925 < 0) {
            field2922 = 0;
            field2924 = 0;
            field2918 = 0;
            field2923 = 2147483646;
            return;
        }
        method1302(0, field2925);
        int var0 = field2919[1];
        if (var0 < class335.field5427) {
            var0 = class335.field5427;
        }
        byte var1 = 0;
        int var2;
        for (var2 = 0; var2 < field2925; var2 += 4) {
            int var3 = field2919[var2 + 1];
            if (var0 < var3) {
                break;
            }
            int var4 = field2919[var2];
            int var5 = field2919[var2 + 2];
            int var6 = field2919[var2 + 3];
            int var7 = (var5 - var4 << 16) / (var6 - var3);
            int var8 = (var4 << 16) + 32768;
            field2919[var2] = (var0 - var3) * var7 + var8;
            field2919[var2 + 2] = var7;
        }
        field2918 = var1;
        field2924 = var2;
        field2922 = var2;
        field2923 = var0 - 1;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "()V", line = 199)
    public static void method1300() {
        field2919 = null;
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "()Z", line = 203)
    private static final boolean method1301() {
        int var0 = field2924;
        int var1 = field2922;
        int var2 = field2923;
        while (var1 >= var0) {
            var2++;
            field2923 = var2;
            if (var2 >= class335.field5429) {
                return false;
            }
            int var3 = field2918;
            while (var0 < field2925) {
                int var4 = field2919[var0 + 1];
                if (var2 < var4) {
                    break;
                }
                int var5 = field2919[var0];
                int var6 = field2919[var0 + 2];
                int var7 = field2919[var0 + 3];
                int var8 = (var6 - var5 << 16) / (var7 - var4);
                int var9 = (var5 << 16) + 32768;
                field2919[var0] = var9;
                field2919[var0 + 2] = var8;
                var0 += 4;
            }
            for (int var10 = var3; var10 < var0; var10 += 4) {
                int var11 = field2919[var10 + 3];
                if (var2 >= var11) {
                    field2919[var10] = field2919[var3];
                    field2919[var10 + 1] = field2919[var3 + 1];
                    field2919[var10 + 2] = field2919[var3 + 2];
                    field2919[var10 + 3] = field2919[var3 + 3];
                    var3 += 4;
                }
            }
            if (field2925 == var3) {
                field2925 = 0;
                return false;
            }
            method1297(var3, var0);
            field2918 = var3;
            field2924 = var0;
            var1 = var3;
        }
        field2920 = field2919[var1] >> 16;
        field2921 = field2919[var1 + 4] >> 16;
        field2919[var1] += field2919[var1 + 2];
        field2919[var1 + 4] += field2919[var1 + 6];
        var1 += 8;
        field2922 = var1;
        return true;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)V", line = 278)
    private static final void method1302(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field2919[arg0];
        int var4 = field2919[arg0 + 1];
        int var5 = field2919[arg0 + 2];
        int var6 = field2919[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field2919[var7 + 1];
            if (var8 < var4) {
                field2919[var2] = field2919[var7];
                field2919[var2 + 1] = var8;
                field2919[var2 + 2] = field2919[var7 + 2];
                field2919[var2 + 3] = field2919[var7 + 3];
                var2 += 4;
                field2919[var7] = field2919[var2];
                field2919[var7 + 1] = field2919[var2 + 1];
                field2919[var7 + 2] = field2919[var2 + 2];
                field2919[var7 + 3] = field2919[var2 + 3];
            }
        }
        field2919[var2] = var3;
        field2919[var2 + 1] = var4;
        field2919[var2 + 2] = var5;
        field2919[var2 + 3] = var6;
        method1302(arg0, var2);
        method1302(var2 + 4, arg1);
    }
}
