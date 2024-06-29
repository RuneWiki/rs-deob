import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class154 {

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    private static int field2451;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    private static int field2452;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    private static int field2453;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
    private static int field2454;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "I")
    private static int field2455;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "I")
    private static int field2456;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
    private static int field2458;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "[I")
    private static int[] field2457;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "()Z", line = 6)
    private static final boolean method1198() {
        int var0 = field2453;
        int var1 = field2452;
        int var2 = field2451;
        while (var1 >= var0) {
            var2++;
            field2451 = var2;
            if (var2 >= class246.field4039) {
                return false;
            }
            int var3 = field2454;
            while (var0 < field2455) {
                int var4 = field2457[var0 + 1];
                if (var2 < var4) {
                    break;
                }
                int var5 = field2457[var0];
                int var6 = field2457[var0 + 2];
                int var7 = field2457[var0 + 3];
                int var8 = (var6 - var5 << 16) / (var7 - var4);
                int var9 = (var5 << 16) + 32768;
                field2457[var0] = var9;
                field2457[var0 + 2] = var8;
                var0 += 4;
            }
            for (int var10 = var3; var10 < var0; var10 += 4) {
                int var11 = field2457[var10 + 3];
                if (var2 >= var11) {
                    field2457[var10] = field2457[var3];
                    field2457[var10 + 1] = field2457[var3 + 1];
                    field2457[var10 + 2] = field2457[var3 + 2];
                    field2457[var10 + 3] = field2457[var3 + 3];
                    var3 += 4;
                }
            }
            if (field2455 == var3) {
                field2455 = 0;
                return false;
            }
            method1208(var3, var0);
            field2454 = var3;
            field2453 = var0;
            var1 = var3;
        }
        field2456 = field2457[var1] >> 16;
        field2458 = field2457[var1 + 4] >> 16;
        field2457[var1] += field2457[var1 + 2];
        field2457[var1 + 4] += field2457[var1 + 6];
        var1 += 8;
        field2452 = var1;
        return true;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(II[I[I)V", line = 81)
    private static final void method1199(int arg0, int arg1, int[] arg2, int[] arg3) {
        method1206();
        while (method1198()) {
            int var4 = field2456;
            int var5 = field2458;
            int var6 = field2451;
            if (arg2 != null) {
                int var7 = var6 - class246.field4038;
                if (var4 < arg2[var7] + class246.field4032) {
                    var4 = arg2[var7] + class246.field4032;
                }
                if (var5 > arg2[var7] + arg3[var7] + class246.field4032) {
                    var5 = arg2[var7] + arg3[var7] + class246.field4032;
                }
            }
            class246.method1902(var4, var6, var5 - var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "()V", line = 107)
    private static final void method1200() {
        field2455 = 0;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "([IIIII[I[I)V", line = 114)
    private static final void method1201(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (arg5 != null && class246.field4039 - class246.field4038 != arg5.length) {
            throw new IllegalStateException();
        }
        method1200();
        method1203(arg0, arg1, arg2);
        method1199(arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)V", line = 122)
    private static final void method1202(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field2457[arg0];
        int var4 = field2457[arg0 + 1];
        int var5 = field2457[arg0 + 2];
        int var6 = field2457[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field2457[var7 + 1];
            if (var8 < var4) {
                field2457[var2] = field2457[var7];
                field2457[var2 + 1] = var8;
                field2457[var2 + 2] = field2457[var7 + 2];
                field2457[var2 + 3] = field2457[var7 + 3];
                var2 += 4;
                field2457[var7] = field2457[var2];
                field2457[var7 + 1] = field2457[var2 + 1];
                field2457[var7 + 2] = field2457[var2 + 2];
                field2457[var7 + 3] = field2457[var2 + 3];
            }
        }
        field2457[var2] = var3;
        field2457[var2 + 1] = var4;
        field2457[var2 + 2] = var5;
        field2457[var2 + 3] = var6;
        method1202(arg0, var2);
        method1202(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "([III)V", line = 171)
    private static final void method1203(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field2455;
        if (field2457 == null || field2457.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field2455; var5++) {
                var4[var5] = field2457[var5];
            }
            field2457 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field2457[field2455++] = arg0[var7];
                field2457[field2455++] = var9;
                field2457[field2455++] = arg0[var8];
                field2457[field2455++] = var10;
            } else if (var10 < var9) {
                field2457[field2455++] = arg0[var8];
                field2457[field2455++] = var10;
                field2457[field2455++] = arg0[var7];
                field2457[field2455++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "()V", line = 220)
    public static void method1204() {
        field2457 = null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "([III[I[I)V", line = 228)
    public static final void method1205(int[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        method1201(arg0, 0, arg0.length, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "()V", line = 231)
    private static final void method1206() {
        if (field2455 < 0) {
            field2452 = 0;
            field2453 = 0;
            field2454 = 0;
            field2451 = 2147483646;
            return;
        }
        method1202(0, field2455);
        int var0 = field2457[1];
        if (var0 < class246.field4038) {
            var0 = class246.field4038;
        }
        byte var1 = 0;
        int var2;
        for (var2 = 0; var2 < field2455; var2 += 4) {
            int var3 = field2457[var2 + 1];
            if (var0 < var3) {
                break;
            }
            int var4 = field2457[var2];
            int var5 = field2457[var2 + 2];
            int var6 = field2457[var2 + 3];
            int var7 = (var5 - var4 << 16) / (var6 - var3);
            int var8 = (var4 << 16) + 32768;
            field2457[var2] = (var0 - var3) * var7 + var8;
            field2457[var2 + 2] = var7;
        }
        field2454 = var1;
        field2453 = var2;
        field2452 = var2;
        field2451 = var0 - 1;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "([III)V", line = 280)
    public static final void method1207(int[] arg0, int arg1, int arg2) {
        method1201(arg0, 0, arg0.length, arg1, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)V", line = 284)
    private static final void method1208(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field2457[var3 - 4];
                    int var5 = field2457[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field2457[var3 - 4] = var5;
                        field2457[var3] = var4;
                        int var6 = field2457[var3 - 2];
                        field2457[var3 - 2] = field2457[var3 + 2];
                        field2457[var3 + 2] = var6;
                        int var7 = field2457[var3 - 1];
                        field2457[var3 - 1] = field2457[var3 + 3];
                        field2457[var3 + 3] = var7;
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
