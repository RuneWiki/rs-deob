import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class235 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    private static int field3970;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    private static int field3971;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    private static int field3972;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    private static int field3973;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    private static int field3974;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    private static int field3975;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    private static int field3976;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "[I")
    private static int[] field3977;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()Z")
    private static final boolean method1682() {
        int var0 = field3973;
        int var1 = field3974;
        int var2 = field3970;
        while (var1 >= var0) {
            var2++;
            field3970 = var2;
            if (var2 >= class211.field3554) {
                return false;
            }
            int var3 = field3972;
            while (var0 < field3976) {
                int var4 = field3977[var0 + 1];
                if (var2 < var4) {
                    break;
                }
                int var5 = field3977[var0];
                int var6 = field3977[var0 + 2];
                int var7 = field3977[var0 + 3];
                int var8 = (var6 - var5 << 16) / (var7 - var4);
                int var9 = (var5 << 16) + 32768;
                field3977[var0] = var9;
                field3977[var0 + 2] = var8;
                var0 += 4;
            }
            for (int var10 = var3; var10 < var0; var10 += 4) {
                int var11 = field3977[var10 + 3];
                if (var2 >= var11) {
                    field3977[var10] = field3977[var3];
                    field3977[var10 + 1] = field3977[var3 + 1];
                    field3977[var10 + 2] = field3977[var3 + 2];
                    field3977[var10 + 3] = field3977[var3 + 3];
                    var3 += 4;
                }
            }
            if (field3976 == var3) {
                field3976 = 0;
                return false;
            }
            method1686(var3, var0);
            field3972 = var3;
            field3973 = var0;
            var1 = var3;
        }
        field3975 = field3977[var1] >> 16;
        field3971 = field3977[var1 + 4] >> 16;
        field3977[var1] += field3977[var1 + 2];
        field3977[var1 + 4] += field3977[var1 + 6];
        var1 += 8;
        field3974 = var1;
        return true;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([IIIII[I[I)V")
    private static final void method1683(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (arg5 != null && class211.field3554 - class211.field3550 != arg5.length) {
            throw new IllegalStateException();
        }
        method1692();
        method1687(arg0, arg1, arg2);
        method1691(arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "()V")
    public static void method1684() {
        field3977 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([III[I[I)V")
    public static final void method1685(int[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        method1683(arg0, 0, arg0.length, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
    private static final void method1686(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field3977[var3 - 4];
                    int var5 = field3977[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field3977[var3 - 4] = var5;
                        field3977[var3] = var4;
                        int var6 = field3977[var3 - 2];
                        field3977[var3 - 2] = field3977[var3 + 2];
                        field3977[var3 + 2] = var6;
                        int var7 = field3977[var3 - 1];
                        field3977[var3 - 1] = field3977[var3 + 3];
                        field3977[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([III)V")
    private static final void method1687(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field3976;
        if (field3977 == null || field3977.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field3976; var5++) {
                var4[var5] = field3977[var5];
            }
            field3977 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field3977[field3976++] = arg0[var7];
                field3977[field3976++] = var9;
                field3977[field3976++] = arg0[var8];
                field3977[field3976++] = var10;
            } else if (var10 < var9) {
                field3977[field3976++] = arg0[var8];
                field3977[field3976++] = var10;
                field3977[field3976++] = arg0[var7];
                field3977[field3976++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "([III)V")
    public static final void method1688(int[] arg0, int arg1, int arg2) {
        method1683(arg0, 0, arg0.length, arg1, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)V")
    private static final void method1689(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field3977[arg0];
        int var4 = field3977[arg0 + 1];
        int var5 = field3977[arg0 + 2];
        int var6 = field3977[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field3977[var7 + 1];
            if (var8 < var4) {
                field3977[var2] = field3977[var7];
                field3977[var2 + 1] = var8;
                field3977[var2 + 2] = field3977[var7 + 2];
                field3977[var2 + 3] = field3977[var7 + 3];
                var2 += 4;
                field3977[var7] = field3977[var2];
                field3977[var7 + 1] = field3977[var2 + 1];
                field3977[var7 + 2] = field3977[var2 + 2];
                field3977[var7 + 3] = field3977[var2 + 3];
            }
        }
        field3977[var2] = var3;
        field3977[var2 + 1] = var4;
        field3977[var2 + 2] = var5;
        field3977[var2 + 3] = var6;
        method1689(arg0, var2);
        method1689(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "()V")
    private static final void method1690() {
        if (field3976 < 0) {
            field3974 = 0;
            field3973 = 0;
            field3972 = 0;
            field3970 = 2147483646;
            return;
        }
        method1689(0, field3976);
        int var0 = field3977[1];
        if (var0 < class211.field3550) {
            var0 = class211.field3550;
        }
        byte var1 = 0;
        int var2;
        for (var2 = 0; var2 < field3976; var2 += 4) {
            int var3 = field3977[var2 + 1];
            if (var0 < var3) {
                break;
            }
            int var4 = field3977[var2];
            int var5 = field3977[var2 + 2];
            int var6 = field3977[var2 + 3];
            int var7 = (var5 - var4 << 16) / (var6 - var3);
            int var8 = (var4 << 16) + 32768;
            field3977[var2] = (var0 - var3) * var7 + var8;
            field3977[var2 + 2] = var7;
        }
        field3972 = var1;
        field3973 = var2;
        field3974 = var2;
        field3970 = var0 - 1;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II[I[I)V")
    private static final void method1691(int arg0, int arg1, int[] arg2, int[] arg3) {
        method1690();
        while (method1682()) {
            int var4 = field3975;
            int var5 = field3971;
            int var6 = field3970;
            if (arg2 != null) {
                int var7 = var6 - class211.field3550;
                if (var4 < arg2[var7] + class211.field3553) {
                    var4 = arg2[var7] + class211.field3553;
                }
                if (var5 > arg2[var7] + arg3[var7] + class211.field3553) {
                    var5 = arg2[var7] + arg3[var7] + class211.field3553;
                }
            }
            class211.method1476(var4, var6, var5 - var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "()V")
    private static final void method1692() {
        field3976 = 0;
    }
}
