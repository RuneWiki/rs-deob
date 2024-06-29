import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class183 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    private static int field2753;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    private static int field2754;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    private static int field2756;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    private static int field2757;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    private static int field2758;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    private static int field2759;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    private static int field2760;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "[I")
    private static int[] field2755;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)V", line = 4)
    private static final void method1258(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field2755[arg0];
        int var4 = field2755[arg0 + 1];
        int var5 = field2755[arg0 + 2];
        int var6 = field2755[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field2755[var7 + 1];
            if (var8 < var4) {
                field2755[var2] = field2755[var7];
                field2755[var2 + 1] = var8;
                field2755[var2 + 2] = field2755[var7 + 2];
                field2755[var2 + 3] = field2755[var7 + 3];
                var2 += 4;
                field2755[var7] = field2755[var2];
                field2755[var7 + 1] = field2755[var2 + 1];
                field2755[var7 + 2] = field2755[var2 + 2];
                field2755[var7 + 3] = field2755[var2 + 3];
            }
        }
        field2755[var2] = var3;
        field2755[var2 + 1] = var4;
        field2755[var2 + 2] = var5;
        field2755[var2 + 3] = var6;
        method1258(arg0, var2);
        method1258(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II[I[I)V", line = 51)
    private static final void method1259(int arg0, int arg1, int[] arg2, int[] arg3) {
        method1265();
        while (method1266()) {
            int var4 = field2756;
            int var5 = field2753;
            int var6 = field2758;
            if (arg2 != null) {
                int var7 = var6 - class343.field5433;
                if (var4 < arg2[var7] + class343.field5434) {
                    var4 = arg2[var7] + class343.field5434;
                }
                if (var5 > arg2[var7] + arg3[var7] + class343.field5434) {
                    var5 = arg2[var7] + arg3[var7] + class343.field5434;
                }
            }
            class343.method2362(var4, var6, var5 - var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([III)V", line = 80)
    public static final void method1260(int[] arg0, int arg1, int arg2) {
        method1267(arg0, 0, arg0.length, arg1, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)V", line = 85)
    private static final void method1261(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field2755[var3 - 4];
                    int var5 = field2755[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field2755[var3 - 4] = var5;
                        field2755[var3] = var4;
                        int var6 = field2755[var3 - 2];
                        field2755[var3 - 2] = field2755[var3 + 2];
                        field2755[var3 + 2] = var6;
                        int var7 = field2755[var3 - 1];
                        field2755[var3 - 1] = field2755[var3 + 3];
                        field2755[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()V", line = 123)
    private static final void method1262() {
        field2757 = 0;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "([III)V", line = 132)
    private static final void method1263(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field2757;
        if (field2755 == null || field2755.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field2757; var5++) {
                var4[var5] = field2755[var5];
            }
            field2755 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field2755[field2757++] = arg0[var7];
                field2755[field2757++] = var9;
                field2755[field2757++] = arg0[var8];
                field2755[field2757++] = var10;
            } else if (var10 < var9) {
                field2755[field2757++] = arg0[var8];
                field2755[field2757++] = var10;
                field2755[field2757++] = arg0[var7];
                field2755[field2757++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([III[I[I)V", line = 181)
    public static final void method1264(int[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        method1267(arg0, 0, arg0.length, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "()V", line = 184)
    private static final void method1265() {
        if (field2757 < 0) {
            field2760 = 0;
            field2759 = 0;
            field2754 = 0;
            field2758 = 2147483646;
            return;
        }
        method1258(0, field2757);
        int var0 = field2755[1];
        if (var0 < class343.field5433) {
            var0 = class343.field5433;
        }
        byte var1 = 0;
        int var2;
        for (var2 = 0; var2 < field2757; var2 += 4) {
            int var3 = field2755[var2 + 1];
            if (var0 < var3) {
                break;
            }
            int var4 = field2755[var2];
            int var5 = field2755[var2 + 2];
            int var6 = field2755[var2 + 3];
            int var7 = (var5 - var4 << 16) / (var6 - var3);
            int var8 = (var4 << 16) + 32768;
            field2755[var2] = (var0 - var3) * var7 + var8;
            field2755[var2 + 2] = var7;
        }
        field2754 = var1;
        field2759 = var2;
        field2760 = var2;
        field2758 = var0 - 1;
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "()Z", line = 232)
    private static final boolean method1266() {
        int var0 = field2759;
        int var1 = field2760;
        int var2 = field2758;
        while (var1 >= var0) {
            var2++;
            field2758 = var2;
            if (var2 >= class343.field5435) {
                return false;
            }
            int var3 = field2754;
            while (var0 < field2757) {
                int var4 = field2755[var0 + 1];
                if (var2 < var4) {
                    break;
                }
                int var5 = field2755[var0];
                int var6 = field2755[var0 + 2];
                int var7 = field2755[var0 + 3];
                int var8 = (var6 - var5 << 16) / (var7 - var4);
                int var9 = (var5 << 16) + 32768;
                field2755[var0] = var9;
                field2755[var0 + 2] = var8;
                var0 += 4;
            }
            for (int var10 = var3; var10 < var0; var10 += 4) {
                int var11 = field2755[var10 + 3];
                if (var2 >= var11) {
                    field2755[var10] = field2755[var3];
                    field2755[var10 + 1] = field2755[var3 + 1];
                    field2755[var10 + 2] = field2755[var3 + 2];
                    field2755[var10 + 3] = field2755[var3 + 3];
                    var3 += 4;
                }
            }
            if (field2757 == var3) {
                field2757 = 0;
                return false;
            }
            method1261(var3, var0);
            field2754 = var3;
            field2759 = var0;
            var1 = var3;
        }
        field2756 = field2755[var1] >> 16;
        field2753 = field2755[var1 + 4] >> 16;
        field2755[var1] += field2755[var1 + 2];
        field2755[var1 + 4] += field2755[var1 + 6];
        var1 += 8;
        field2760 = var1;
        return true;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([IIIII[I[I)V", line = 311)
    private static final void method1267(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (arg5 != null && class343.field5435 - class343.field5433 != arg5.length) {
            throw new IllegalStateException();
        }
        method1262();
        method1263(arg0, arg1, arg2);
        method1259(arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "()V", line = 319)
    public static void method1268() {
        field2755 = null;
    }
}
