import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class216 {

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    private static int field3160;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    private static int field3161;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    private static int field3162;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    private static int field3163;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    private static int field3164;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    private static int field3165;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    private static int field3167;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "[I")
    private static int[] field3166;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
    private static final void method1499(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field3166[arg0];
        int var4 = field3166[arg0 + 1];
        int var5 = field3166[arg0 + 2];
        int var6 = field3166[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field3166[var7 + 1];
            if (var8 < var4) {
                field3166[var2] = field3166[var7];
                field3166[var2 + 1] = var8;
                field3166[var2 + 2] = field3166[var7 + 2];
                field3166[var2 + 3] = field3166[var7 + 3];
                var2 += 4;
                field3166[var7] = field3166[var2];
                field3166[var7 + 1] = field3166[var2 + 1];
                field3166[var7 + 2] = field3166[var2 + 2];
                field3166[var7 + 3] = field3166[var2 + 3];
            }
        }
        field3166[var2] = var3;
        field3166[var2 + 1] = var4;
        field3166[var2 + 2] = var5;
        field3166[var2 + 3] = var6;
        method1499(arg0, var2);
        method1499(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()V")
    public static void method1500() {
        field3166 = null;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)V")
    private static final void method1501(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field3166[var3 - 4];
                    int var5 = field3166[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field3166[var3 - 4] = var5;
                        field3166[var3] = var4;
                        int var6 = field3166[var3 - 2];
                        field3166[var3 - 2] = field3166[var3 + 2];
                        field3166[var3 + 2] = var6;
                        int var7 = field3166[var3 - 1];
                        field3166[var3 - 1] = field3166[var3 + 3];
                        field3166[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([III)V")
    private static final void method1502(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field3165;
        if (field3166 == null || field3166.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field3165; var5++) {
                var4[var5] = field3166[var5];
            }
            field3166 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field3166[field3165++] = arg0[var7];
                field3166[field3165++] = var9;
                field3166[field3165++] = arg0[var8];
                field3166[field3165++] = var10;
            } else if (var10 < var9) {
                field3166[field3165++] = arg0[var8];
                field3166[field3165++] = var10;
                field3166[field3165++] = arg0[var7];
                field3166[field3165++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([III[I[I)V")
    public static final void method1503(int[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        method1507(arg0, 0, arg0.length, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "()Z")
    private static final boolean method1504() {
        int var0 = field3164;
        int var1 = field3161;
        int var2 = field3163;
        while (var1 >= var0) {
            var2++;
            field3163 = var2;
            if (var2 >= class130.field2161) {
                return false;
            }
            int var3 = field3167;
            while (var0 < field3165) {
                int var4 = field3166[var0 + 1];
                if (var2 < var4) {
                    break;
                }
                int var5 = field3166[var0];
                int var6 = field3166[var0 + 2];
                int var7 = field3166[var0 + 3];
                int var8 = (var6 - var5 << 16) / (var7 - var4);
                int var9 = (var5 << 16) + 32768;
                field3166[var0] = var9;
                field3166[var0 + 2] = var8;
                var0 += 4;
            }
            for (int var10 = var3; var10 < var0; var10 += 4) {
                int var11 = field3166[var10 + 3];
                if (var2 >= var11) {
                    field3166[var10] = field3166[var3];
                    field3166[var10 + 1] = field3166[var3 + 1];
                    field3166[var10 + 2] = field3166[var3 + 2];
                    field3166[var10 + 3] = field3166[var3 + 3];
                    var3 += 4;
                }
            }
            if (field3165 == var3) {
                field3165 = 0;
                return false;
            }
            method1501(var3, var0);
            field3167 = var3;
            field3164 = var0;
            var1 = var3;
        }
        field3162 = field3166[var1] >> 16;
        field3160 = field3166[var1 + 4] >> 16;
        field3166[var1] += field3166[var1 + 2];
        field3166[var1 + 4] += field3166[var1 + 6];
        var1 += 8;
        field3161 = var1;
        return true;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[I[I)V")
    private static final void method1505(int arg0, int arg1, int[] arg2, int[] arg3) {
        method1509();
        while (method1504()) {
            int var4 = field3162;
            int var5 = field3160;
            int var6 = field3163;
            if (arg2 != null) {
                int var7 = var6 - class130.field2160;
                if (var4 < arg2[var7] + class130.field2163) {
                    var4 = arg2[var7] + class130.field2163;
                }
                if (var5 > arg2[var7] + arg3[var7] + class130.field2163) {
                    var5 = arg2[var7] + arg3[var7] + class130.field2163;
                }
            }
            class130.method1004(var4, var6, var5 - var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "([III)V")
    public static final void method1506(int[] arg0, int arg1, int arg2) {
        method1507(arg0, 0, arg0.length, arg1, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([IIIII[I[I)V")
    private static final void method1507(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (arg5 != null && class130.field2161 - class130.field2160 != arg5.length) {
            throw new IllegalStateException();
        }
        method1508();
        method1502(arg0, arg1, arg2);
        method1505(arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "()V")
    private static final void method1508() {
        field3165 = 0;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "()V")
    private static final void method1509() {
        if (field3165 < 0) {
            field3161 = 0;
            field3164 = 0;
            field3167 = 0;
            field3163 = 2147483646;
            return;
        }
        method1499(0, field3165);
        int var0 = field3166[1];
        if (var0 < class130.field2160) {
            var0 = class130.field2160;
        }
        byte var1 = 0;
        int var2;
        for (var2 = 0; var2 < field3165; var2 += 4) {
            int var3 = field3166[var2 + 1];
            if (var0 < var3) {
                break;
            }
            int var4 = field3166[var2];
            int var5 = field3166[var2 + 2];
            int var6 = field3166[var2 + 3];
            int var7 = (var5 - var4 << 16) / (var6 - var3);
            int var8 = (var4 << 16) + 32768;
            field3166[var2] = (var0 - var3) * var7 + var8;
            field3166[var2 + 2] = var7;
        }
        field3167 = var1;
        field3164 = var2;
        field3161 = var2;
        field3163 = var0 - 1;
    }
}
