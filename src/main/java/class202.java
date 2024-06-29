import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class202 {

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    private static int field3210;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    private static int field3211;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    private static int field3212;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    private static int field3213;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    private static int field3214;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    private static int field3215;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    private static int field3216;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "[I")
    private static int[] field3217;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([III)V", line = 7)
    private static final void method1548(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field3215;
        if (field3217 == null || field3217.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field3215; var5++) {
                var4[var5] = field3217[var5];
            }
            field3217 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field3217[field3215++] = arg0[var7];
                field3217[field3215++] = var9;
                field3217[field3215++] = arg0[var8];
                field3217[field3215++] = var10;
            } else if (var10 < var9) {
                field3217[field3215++] = arg0[var8];
                field3217[field3215++] = var10;
                field3217[field3215++] = arg0[var7];
                field3217[field3215++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "()V", line = 56)
    private static final void method1549() {
        if (field3215 < 0) {
            field3213 = 0;
            field3216 = 0;
            field3214 = 0;
            field3212 = 2147483646;
            return;
        }
        method1552(0, field3215);
        int var0 = field3217[1];
        if (var0 < class244.field4005) {
            var0 = class244.field4005;
        }
        byte var1 = 0;
        int var2;
        for (var2 = 0; var2 < field3215; var2 += 4) {
            int var3 = field3217[var2 + 1];
            if (var0 < var3) {
                break;
            }
            int var4 = field3217[var2];
            int var5 = field3217[var2 + 2];
            int var6 = field3217[var2 + 3];
            int var7 = (var5 - var4 << 16) / (var6 - var3);
            int var8 = (var4 << 16) + 32768;
            field3217[var2] = (var0 - var3) * var7 + var8;
            field3217[var2 + 2] = var7;
        }
        field3214 = var1;
        field3216 = var2;
        field3213 = var2;
        field3212 = var0 - 1;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([III[I[I)V", line = 101)
    public static final void method1550(int[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        method1551(arg0, 0, arg0.length, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([IIIII[I[I)V", line = 108)
    private static final void method1551(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (arg5 != null && class244.field4007 - class244.field4005 != arg5.length) {
            throw new IllegalStateException();
        }
        method1553();
        method1548(arg0, arg1, arg2);
        method1557(arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)V", line = 117)
    private static final void method1552(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field3217[arg0];
        int var4 = field3217[arg0 + 1];
        int var5 = field3217[arg0 + 2];
        int var6 = field3217[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field3217[var7 + 1];
            if (var8 < var4) {
                field3217[var2] = field3217[var7];
                field3217[var2 + 1] = var8;
                field3217[var2 + 2] = field3217[var7 + 2];
                field3217[var2 + 3] = field3217[var7 + 3];
                var2 += 4;
                field3217[var7] = field3217[var2];
                field3217[var7 + 1] = field3217[var2 + 1];
                field3217[var7 + 2] = field3217[var2 + 2];
                field3217[var7 + 3] = field3217[var2 + 3];
            }
        }
        field3217[var2] = var3;
        field3217[var2 + 1] = var4;
        field3217[var2 + 2] = var5;
        field3217[var2 + 3] = var6;
        method1552(arg0, var2);
        method1552(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "()V", line = 166)
    private static final void method1553() {
        field3215 = 0;
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "()V", line = 170)
    public static void method1554() {
        field3217 = null;
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "()Z", line = 174)
    private static final boolean method1555() {
        int var0 = field3216;
        int var1 = field3213;
        int var2 = field3212;
        while (var1 >= var0) {
            var2++;
            field3212 = var2;
            if (var2 >= class244.field4007) {
                return false;
            }
            int var3 = field3214;
            while (var0 < field3215) {
                int var4 = field3217[var0 + 1];
                if (var2 < var4) {
                    break;
                }
                int var5 = field3217[var0];
                int var6 = field3217[var0 + 2];
                int var7 = field3217[var0 + 3];
                int var8 = (var6 - var5 << 16) / (var7 - var4);
                int var9 = (var5 << 16) + 32768;
                field3217[var0] = var9;
                field3217[var0 + 2] = var8;
                var0 += 4;
            }
            for (int var10 = var3; var10 < var0; var10 += 4) {
                int var11 = field3217[var10 + 3];
                if (var2 >= var11) {
                    field3217[var10] = field3217[var3];
                    field3217[var10 + 1] = field3217[var3 + 1];
                    field3217[var10 + 2] = field3217[var3 + 2];
                    field3217[var10 + 3] = field3217[var3 + 3];
                    var3 += 4;
                }
            }
            if (field3215 == var3) {
                field3215 = 0;
                return false;
            }
            method1556(var3, var0);
            field3214 = var3;
            field3216 = var0;
            var1 = var3;
        }
        field3211 = field3217[var1] >> 16;
        field3210 = field3217[var1 + 4] >> 16;
        field3217[var1] += field3217[var1 + 2];
        field3217[var1 + 4] += field3217[var1 + 6];
        var1 += 8;
        field3213 = var1;
        return true;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)V", line = 253)
    private static final void method1556(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field3217[var3 - 4];
                    int var5 = field3217[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field3217[var3 - 4] = var5;
                        field3217[var3] = var4;
                        int var6 = field3217[var3 - 2];
                        field3217[var3 - 2] = field3217[var3 + 2];
                        field3217[var3 + 2] = var6;
                        int var7 = field3217[var3 - 1];
                        field3217[var3 - 1] = field3217[var3 + 3];
                        field3217[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II[I[I)V", line = 291)
    private static final void method1557(int arg0, int arg1, int[] arg2, int[] arg3) {
        method1549();
        while (true) {
            int var4;
            int var5;
            int var6;
            do {
                if (!method1555()) {
                    return;
                }
                var4 = field3211;
                var5 = field3210;
                var6 = field3212;
                if (arg2 == null) {
                    break;
                }
                int var7 = var6 - class244.field4005;
                if (var4 < arg2[var7] + class244.field4009) {
                    var4 = arg2[var7] + class244.field4009;
                }
                if (var5 > arg2[var7] + arg3[var7] + class244.field4009) {
                    var5 = arg2[var7] + arg3[var7] + class244.field4009;
                }
            } while (var4 >= var5);
            class244.method1873(var4, var6, var5 - var4, arg0, arg1);
        }
    }
}
