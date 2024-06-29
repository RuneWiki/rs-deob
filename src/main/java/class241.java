import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class241 {

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    private static int field3772;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    private static int field3773;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    private static int field3774;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    private static int field3776;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    private static int field3777;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    private static int field3778;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    private static int field3779;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "[I")
    private static int[] field3775;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V", line = 3)
    public static void method1821() {
        field3775 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([IIIII[I[I)V", line = 14)
    private static final void method1822(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (arg5 != null && class60.field931 - class60.field934 != arg5.length) {
            throw new IllegalStateException();
        }
        method1824();
        method1828(arg0, arg1, arg2);
        method1829(arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "()V", line = 23)
    private static final void method1823() {
        if (field3776 < 0) {
            field3778 = 0;
            field3777 = 0;
            field3779 = 0;
            field3774 = 2147483646;
            return;
        }
        method1827(0, field3776);
        int var0 = field3775[1];
        if (var0 < class60.field934) {
            var0 = class60.field934;
        }
        byte var1 = 0;
        int var2;
        for (var2 = 0; var2 < field3776; var2 += 4) {
            int var3 = field3775[var2 + 1];
            if (var0 < var3) {
                break;
            }
            int var4 = field3775[var2];
            int var5 = field3775[var2 + 2];
            int var6 = field3775[var2 + 3];
            int var7 = (var5 - var4 << 16) / (var6 - var3);
            int var8 = (var4 << 16) + 32768;
            field3775[var2] = (var0 - var3) * var7 + var8;
            field3775[var2 + 2] = var7;
        }
        field3779 = var1;
        field3777 = var2;
        field3778 = var2;
        field3774 = var0 - 1;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "()V", line = 68)
    private static final void method1824() {
        field3776 = 0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([III)V", line = 71)
    public static final void method1825(int[] arg0, int arg1, int arg2) {
        method1822(arg0, 0, arg0.length, arg1, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([III[I[I)V", line = 74)
    public static final void method1826(int[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        method1822(arg0, 0, arg0.length, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V", line = 78)
    private static final void method1827(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field3775[arg0];
        int var4 = field3775[arg0 + 1];
        int var5 = field3775[arg0 + 2];
        int var6 = field3775[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field3775[var7 + 1];
            if (var8 < var4) {
                field3775[var2] = field3775[var7];
                field3775[var2 + 1] = var8;
                field3775[var2 + 2] = field3775[var7 + 2];
                field3775[var2 + 3] = field3775[var7 + 3];
                var2 += 4;
                field3775[var7] = field3775[var2];
                field3775[var7 + 1] = field3775[var2 + 1];
                field3775[var7 + 2] = field3775[var2 + 2];
                field3775[var7 + 3] = field3775[var2 + 3];
            }
        }
        field3775[var2] = var3;
        field3775[var2 + 1] = var4;
        field3775[var2 + 2] = var5;
        field3775[var2 + 3] = var6;
        method1827(arg0, var2);
        method1827(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "([III)V", line = 128)
    private static final void method1828(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field3776;
        if (field3775 == null || field3775.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field3776; var5++) {
                var4[var5] = field3775[var5];
            }
            field3775 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field3775[field3776++] = arg0[var7];
                field3775[field3776++] = var9;
                field3775[field3776++] = arg0[var8];
                field3775[field3776++] = var10;
            } else if (var10 < var9) {
                field3775[field3776++] = arg0[var8];
                field3775[field3776++] = var10;
                field3775[field3776++] = arg0[var7];
                field3775[field3776++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II[I[I)V", line = 177)
    private static final void method1829(int arg0, int arg1, int[] arg2, int[] arg3) {
        method1823();
        while (method1830()) {
            int var4 = field3772;
            int var5 = field3773;
            int var6 = field3774;
            if (arg2 != null) {
                int var7 = var6 - class60.field934;
                if (var4 < arg2[var7] + class60.field936) {
                    var4 = arg2[var7] + class60.field936;
                }
                if (var5 > arg2[var7] + arg3[var7] + class60.field936) {
                    var5 = arg2[var7] + arg3[var7] + class60.field936;
                }
            }
            class60.method600(var4, var6, var5 - var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "()Z", line = 204)
    private static final boolean method1830() {
        int var0 = field3777;
        int var1 = field3778;
        int var2 = field3774;
        while (var1 >= var0) {
            var2++;
            field3774 = var2;
            if (var2 >= class60.field931) {
                return false;
            }
            int var3 = field3779;
            while (var0 < field3776) {
                int var4 = field3775[var0 + 1];
                if (var2 < var4) {
                    break;
                }
                int var5 = field3775[var0];
                int var6 = field3775[var0 + 2];
                int var7 = field3775[var0 + 3];
                int var8 = (var6 - var5 << 16) / (var7 - var4);
                int var9 = (var5 << 16) + 32768;
                field3775[var0] = var9;
                field3775[var0 + 2] = var8;
                var0 += 4;
            }
            for (int var10 = var3; var10 < var0; var10 += 4) {
                int var11 = field3775[var10 + 3];
                if (var2 >= var11) {
                    field3775[var10] = field3775[var3];
                    field3775[var10 + 1] = field3775[var3 + 1];
                    field3775[var10 + 2] = field3775[var3 + 2];
                    field3775[var10 + 3] = field3775[var3 + 3];
                    var3 += 4;
                }
            }
            if (field3776 == var3) {
                field3776 = 0;
                return false;
            }
            method1831(var3, var0);
            field3779 = var3;
            field3777 = var0;
            var1 = var3;
        }
        field3772 = field3775[var1] >> 16;
        field3773 = field3775[var1 + 4] >> 16;
        field3775[var1] += field3775[var1 + 2];
        field3775[var1 + 4] += field3775[var1 + 6];
        var1 += 8;
        field3778 = var1;
        return true;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)V", line = 281)
    private static final void method1831(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field3775[var3 - 4];
                    int var5 = field3775[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field3775[var3 - 4] = var5;
                        field3775[var3] = var4;
                        int var6 = field3775[var3 - 2];
                        field3775[var3 - 2] = field3775[var3 + 2];
                        field3775[var3 + 2] = var6;
                        int var7 = field3775[var3 - 1];
                        field3775[var3 - 1] = field3775[var3 + 3];
                        field3775[var3 + 3] = var7;
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
