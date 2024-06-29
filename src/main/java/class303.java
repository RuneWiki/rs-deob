import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class303 {

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    private static int field4972;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    private static int field4973;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    private static int field4975;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    private static int field4976;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    private static int field4977;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    private static int field4978;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    private static int field4979;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "[I")
    private static int[] field4974;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)V", line = 3)
    private static final void method2119(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field4974[arg0];
        int var4 = field4974[arg0 + 1];
        int var5 = field4974[arg0 + 2];
        int var6 = field4974[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field4974[var7 + 1];
            if (var8 < var4) {
                field4974[var2] = field4974[var7];
                field4974[var2 + 1] = var8;
                field4974[var2 + 2] = field4974[var7 + 2];
                field4974[var2 + 3] = field4974[var7 + 3];
                var2 += 4;
                field4974[var7] = field4974[var2];
                field4974[var7 + 1] = field4974[var2 + 1];
                field4974[var7 + 2] = field4974[var2 + 2];
                field4974[var7 + 3] = field4974[var2 + 3];
            }
        }
        field4974[var2] = var3;
        field4974[var2 + 1] = var4;
        field4974[var2 + 2] = var5;
        field4974[var2 + 3] = var6;
        method2119(arg0, var2);
        method2119(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(II)V", line = 47)
    private static final void method2120(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field4974[var3 - 4];
                    int var5 = field4974[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field4974[var3 - 4] = var5;
                        field4974[var3] = var4;
                        int var6 = field4974[var3 - 2];
                        field4974[var3 - 2] = field4974[var3 + 2];
                        field4974[var3 + 2] = var6;
                        int var7 = field4974[var3 - 1];
                        field4974[var3 - 1] = field4974[var3 + 3];
                        field4974[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!am", name = "a", descriptor = "([IIIII[I[I)V", line = 88)
    private static final void method2121(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (arg5 != null && class317.field5232 - class317.field5235 != arg5.length) {
            throw new IllegalStateException();
        }
        method2129();
        method2126(arg0, arg1, arg2);
        method2123(arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "([III[I[I)V", line = 96)
    public static final void method2122(int[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        method2121(arg0, 0, arg0.length, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II[I[I)V", line = 102)
    private static final void method2123(int arg0, int arg1, int[] arg2, int[] arg3) {
        method2124();
        while (method2127()) {
            int var4 = field4978;
            int var5 = field4979;
            int var6 = field4972;
            if (arg2 != null) {
                int var7 = var6 - class317.field5235;
                if (var4 < arg2[var7] + class317.field5234) {
                    var4 = arg2[var7] + class317.field5234;
                }
                if (var5 > arg2[var7] + arg3[var7] + class317.field5234) {
                    var5 = arg2[var7] + arg3[var7] + class317.field5234;
                }
            }
            class317.method2284(var4, var6, var5 - var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "()V", line = 130)
    private static final void method2124() {
        if (field4977 < 0) {
            field4976 = 0;
            field4975 = 0;
            field4973 = 0;
            field4972 = 2147483646;
            return;
        }
        method2119(0, field4977);
        int var0 = field4974[1];
        if (var0 < class317.field5235) {
            var0 = class317.field5235;
        }
        byte var1 = 0;
        int var2;
        for (var2 = 0; var2 < field4977; var2 += 4) {
            int var3 = field4974[var2 + 1];
            if (var0 < var3) {
                break;
            }
            int var4 = field4974[var2];
            int var5 = field4974[var2 + 2];
            int var6 = field4974[var2 + 3];
            int var7 = (var5 - var4 << 16) / (var6 - var3);
            int var8 = (var4 << 16) + 32768;
            field4974[var2] = (var0 - var3) * var7 + var8;
            field4974[var2 + 2] = var7;
        }
        field4973 = var1;
        field4975 = var2;
        field4976 = var2;
        field4972 = var0 - 1;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "()V", line = 175)
    public static void method2125() {
        field4974 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "([III)V", line = 182)
    private static final void method2126(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field4977;
        if (field4974 == null || field4974.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field4977; var5++) {
                var4[var5] = field4974[var5];
            }
            field4974 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field4974[field4977++] = arg0[var7];
                field4974[field4977++] = var9;
                field4974[field4977++] = arg0[var8];
                field4974[field4977++] = var10;
            } else if (var10 < var9) {
                field4974[field4977++] = arg0[var8];
                field4974[field4977++] = var10;
                field4974[field4977++] = arg0[var7];
                field4974[field4977++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "()Z", line = 233)
    private static final boolean method2127() {
        int var0 = field4975;
        int var1 = field4976;
        int var2 = field4972;
        while (var1 >= var0) {
            var2++;
            field4972 = var2;
            if (var2 >= class317.field5232) {
                return false;
            }
            int var3 = field4973;
            while (var0 < field4977) {
                int var4 = field4974[var0 + 1];
                if (var2 < var4) {
                    break;
                }
                int var5 = field4974[var0];
                int var6 = field4974[var0 + 2];
                int var7 = field4974[var0 + 3];
                int var8 = (var6 - var5 << 16) / (var7 - var4);
                int var9 = (var5 << 16) + 32768;
                field4974[var0] = var9;
                field4974[var0 + 2] = var8;
                var0 += 4;
            }
            for (int var10 = var3; var10 < var0; var10 += 4) {
                int var11 = field4974[var10 + 3];
                if (var2 >= var11) {
                    field4974[var10] = field4974[var3];
                    field4974[var10 + 1] = field4974[var3 + 1];
                    field4974[var10 + 2] = field4974[var3 + 2];
                    field4974[var10 + 3] = field4974[var3 + 3];
                    var3 += 4;
                }
            }
            if (field4977 == var3) {
                field4977 = 0;
                return false;
            }
            method2120(var3, var0);
            field4973 = var3;
            field4975 = var0;
            var1 = var3;
        }
        field4978 = field4974[var1] >> 16;
        field4979 = field4974[var1 + 4] >> 16;
        field4974[var1] += field4974[var1 + 2];
        field4974[var1 + 4] += field4974[var1 + 6];
        var1 += 8;
        field4976 = var1;
        return true;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "([III)V", line = 309)
    public static final void method2128(int[] arg0, int arg1, int arg2) {
        method2121(arg0, 0, arg0.length, arg1, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "()V", line = 312)
    private static final void method2129() {
        field4977 = 0;
    }
}
