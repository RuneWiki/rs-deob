import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class174 {

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    private static int field2392;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    private static int field2393;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    private static int field2394;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    private static int field2395;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    private static int field2396;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    private static int field2397;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    private static int field2399;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "[I")
    private static int[] field2398;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)V", line = 7)
    private static final void method1275(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field2398[arg0];
        int var4 = field2398[arg0 + 1];
        int var5 = field2398[arg0 + 2];
        int var6 = field2398[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field2398[var7 + 1];
            if (var8 < var4) {
                field2398[var2] = field2398[var7];
                field2398[var2 + 1] = var8;
                field2398[var2 + 2] = field2398[var7 + 2];
                field2398[var2 + 3] = field2398[var7 + 3];
                var2 += 4;
                field2398[var7] = field2398[var2];
                field2398[var7 + 1] = field2398[var2 + 1];
                field2398[var7 + 2] = field2398[var2 + 2];
                field2398[var7 + 3] = field2398[var2 + 3];
            }
        }
        field2398[var2] = var3;
        field2398[var2 + 1] = var4;
        field2398[var2 + 2] = var5;
        field2398[var2 + 3] = var6;
        method1275(arg0, var2);
        method1275(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II[I[I)V", line = 53)
    private static final void method1276(int arg0, int arg1, int[] arg2, int[] arg3) {
        method1283();
        while (method1280()) {
            int var4 = field2393;
            int var5 = field2392;
            int var6 = field2399;
            if (arg2 != null) {
                int var7 = var6 - class37.field446;
                if (var4 < arg2[var7] + class37.field450) {
                    var4 = arg2[var7] + class37.field450;
                }
                if (var5 > arg2[var7] + arg3[var7] + class37.field450) {
                    var5 = arg2[var7] + arg3[var7] + class37.field450;
                }
            }
            class37.method251(var4, var6, var5 - var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([III)V", line = 79)
    public static final void method1277(int[] arg0, int arg1, int arg2) {
        method1282(arg0, 0, arg0.length, arg1, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()V", line = 83)
    public static void method1278() {
        field2398 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([III[I[I)V", line = 87)
    public static final void method1279(int[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        method1282(arg0, 0, arg0.length, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "()Z", line = 91)
    private static final boolean method1280() {
        int var0 = field2395;
        int var1 = field2397;
        int var2 = field2399;
        while (var1 >= var0) {
            var2++;
            field2399 = var2;
            if (var2 >= class37.field453) {
                return false;
            }
            int var3 = field2396;
            while (var0 < field2394) {
                int var4 = field2398[var0 + 1];
                if (var2 < var4) {
                    break;
                }
                int var5 = field2398[var0];
                int var6 = field2398[var0 + 2];
                int var7 = field2398[var0 + 3];
                int var8 = (var6 - var5 << 16) / (var7 - var4);
                int var9 = (var5 << 16) + 32768;
                field2398[var0] = var9;
                field2398[var0 + 2] = var8;
                var0 += 4;
            }
            for (int var10 = var3; var10 < var0; var10 += 4) {
                int var11 = field2398[var10 + 3];
                if (var2 >= var11) {
                    field2398[var10] = field2398[var3];
                    field2398[var10 + 1] = field2398[var3 + 1];
                    field2398[var10 + 2] = field2398[var3 + 2];
                    field2398[var10 + 3] = field2398[var3 + 3];
                    var3 += 4;
                }
            }
            if (field2394 == var3) {
                field2394 = 0;
                return false;
            }
            method1284(var3, var0);
            field2396 = var3;
            field2395 = var0;
            var1 = var3;
        }
        field2393 = field2398[var1] >> 16;
        field2392 = field2398[var1 + 4] >> 16;
        field2398[var1] += field2398[var1 + 2];
        field2398[var1 + 4] += field2398[var1 + 6];
        var1 += 8;
        field2397 = var1;
        return true;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "([III)V", line = 170)
    private static final void method1281(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field2394;
        if (field2398 == null || field2398.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field2394; var5++) {
                var4[var5] = field2398[var5];
            }
            field2398 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field2398[field2394++] = arg0[var7];
                field2398[field2394++] = var9;
                field2398[field2394++] = arg0[var8];
                field2398[field2394++] = var10;
            } else if (var10 < var9) {
                field2398[field2394++] = arg0[var8];
                field2398[field2394++] = var10;
                field2398[field2394++] = arg0[var7];
                field2398[field2394++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([IIIII[I[I)V", line = 223)
    private static final void method1282(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (arg5 != null && class37.field453 - class37.field446 != arg5.length) {
            throw new IllegalStateException();
        }
        method1285();
        method1281(arg0, arg1, arg2);
        method1276(arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "()V", line = 233)
    private static final void method1283() {
        if (field2394 < 0) {
            field2397 = 0;
            field2395 = 0;
            field2396 = 0;
            field2399 = 2147483646;
            return;
        }
        method1275(0, field2394);
        int var0 = field2398[1];
        if (var0 < class37.field446) {
            var0 = class37.field446;
        }
        byte var1 = 0;
        int var2;
        for (var2 = 0; var2 < field2394; var2 += 4) {
            int var3 = field2398[var2 + 1];
            if (var0 < var3) {
                break;
            }
            int var4 = field2398[var2];
            int var5 = field2398[var2 + 2];
            int var6 = field2398[var2 + 3];
            int var7 = (var5 - var4 << 16) / (var6 - var3);
            int var8 = (var4 << 16) + 32768;
            field2398[var2] = (var0 - var3) * var7 + var8;
            field2398[var2 + 2] = var7;
        }
        field2396 = var1;
        field2395 = var2;
        field2397 = var2;
        field2399 = var0 - 1;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)V", line = 279)
    private static final void method1284(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field2398[var3 - 4];
                    int var5 = field2398[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field2398[var3 - 4] = var5;
                        field2398[var3] = var4;
                        int var6 = field2398[var3 - 2];
                        field2398[var3 - 2] = field2398[var3 + 2];
                        field2398[var3 + 2] = var6;
                        int var7 = field2398[var3 - 1];
                        field2398[var3 - 1] = field2398[var3 + 3];
                        field2398[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "()V", line = 319)
    private static final void method1285() {
        field2394 = 0;
    }
}
