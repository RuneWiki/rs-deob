import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class251 {

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
    private static int field4095;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
    private static int field4096;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
    private static int field4097;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "I")
    private static int field4098;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
    private static int field4099;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
    private static int field4100;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
    private static int field4101;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "[I")
    private static int[] field4094;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Le;[II)V")
    public static final void method1738(class312 arg0, int[] arg1, int arg2) {
        method1742(arg0, arg1, 0, arg1.length, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Z")
    private static final boolean method1739(int arg0) {
        int var1 = field4096;
        int var2 = field4095;
        int var3 = field4100;
        while (var2 >= var1) {
            var3++;
            field4100 = var3;
            if (var3 >= arg0) {
                return false;
            }
            int var4 = field4098;
            while (var1 < field4099) {
                int var5 = field4094[var1 + 1];
                if (var3 < var5) {
                    break;
                }
                int var6 = field4094[var1];
                int var7 = field4094[var1 + 2];
                int var8 = field4094[var1 + 3];
                int var9 = (var7 - var6 << 16) / (var8 - var5);
                int var10 = (var6 << 16) + 32768;
                field4094[var1] = var10;
                field4094[var1 + 2] = var9;
                var1 += 4;
            }
            for (int var11 = var4; var11 < var1; var11 += 4) {
                int var12 = field4094[var11 + 3];
                if (var3 >= var12) {
                    field4094[var11] = field4094[var4];
                    field4094[var11 + 1] = field4094[var4 + 1];
                    field4094[var11 + 2] = field4094[var4 + 2];
                    field4094[var11 + 3] = field4094[var4 + 3];
                    var4 += 4;
                }
            }
            if (field4099 == var4) {
                field4099 = 0;
                return false;
            }
            method1747(var4, var1);
            field4098 = var4;
            field4096 = var1;
            var2 = var4;
        }
        field4097 = field4094[var2] >> 16;
        field4101 = field4094[var2 + 4] >> 16;
        field4094[var2] += field4094[var2 + 2];
        field4094[var2 + 4] += field4094[var2 + 6];
        var2 += 8;
        field4095 = var2;
        return true;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "()V")
    private static final void method1740() {
        field4099 = 0;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "([III)V")
    private static final void method1741(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field4099;
        if (field4094 == null || field4094.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field4099; var5++) {
                var4[var5] = field4094[var5];
            }
            field4094 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field4094[field4099++] = arg0[var7];
                field4094[field4099++] = var9;
                field4094[field4099++] = arg0[var8];
                field4094[field4099++] = var10;
            } else if (var10 < var9) {
                field4094[field4099++] = arg0[var8];
                field4094[field4099++] = var10;
                field4094[field4099++] = arg0[var7];
                field4094[field4099++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Le;[IIII[I[I)V")
    private static final void method1742(class312 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        int[] var7 = new int[4];
        arg0.method654(var7);
        if (arg5 != null && var7[3] - var7[1] != arg5.length) {
            throw new IllegalStateException();
        }
        method1740();
        method1741(arg1, arg2, arg3);
        method1744(var7[1]);
        while (true) {
            int var8;
            int var9;
            int var10;
            do {
                if (!method1739(var7[3])) {
                    return;
                }
                var8 = field4097;
                var9 = field4101;
                var10 = field4100;
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
            arg0.method684(var8, var10, var9 - var8, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Le;[II[I[I)V")
    public static final void method1743(class312 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        method1742(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V")
    private static final void method1744(int arg0) {
        if (field4099 < 0) {
            field4095 = 0;
            field4096 = 0;
            field4098 = 0;
            field4100 = 2147483646;
            return;
        }
        method1745(0, field4099);
        int var1 = field4094[1];
        if (var1 < arg0) {
            var1 = arg0;
        }
        byte var2 = 0;
        int var3;
        for (var3 = 0; var3 < field4099; var3 += 4) {
            int var4 = field4094[var3 + 1];
            if (var1 < var4) {
                break;
            }
            int var5 = field4094[var3];
            int var6 = field4094[var3 + 2];
            int var7 = field4094[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field4094[var3] = (var1 - var4) * var8 + var9;
            field4094[var3 + 2] = var8;
        }
        field4098 = var2;
        field4096 = var3;
        field4095 = var3;
        field4100 = var1 - 1;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)V")
    private static final void method1745(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field4094[arg0];
        int var4 = field4094[arg0 + 1];
        int var5 = field4094[arg0 + 2];
        int var6 = field4094[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field4094[var7 + 1];
            if (var8 < var4) {
                field4094[var2] = field4094[var7];
                field4094[var2 + 1] = var8;
                field4094[var2 + 2] = field4094[var7 + 2];
                field4094[var2 + 3] = field4094[var7 + 3];
                var2 += 4;
                field4094[var7] = field4094[var2];
                field4094[var7 + 1] = field4094[var2 + 1];
                field4094[var7 + 2] = field4094[var2 + 2];
                field4094[var7 + 3] = field4094[var2 + 3];
            }
        }
        field4094[var2] = var3;
        field4094[var2 + 1] = var4;
        field4094[var2 + 2] = var5;
        field4094[var2 + 3] = var6;
        method1745(arg0, var2);
        method1745(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "()V")
    public static void method1746() {
        field4094 = null;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(II)V")
    private static final void method1747(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field4094[var3 - 4];
                    int var5 = field4094[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field4094[var3 - 4] = var5;
                        field4094[var3] = var4;
                        int var6 = field4094[var3 - 2];
                        field4094[var3 - 2] = field4094[var3 + 2];
                        field4094[var3 + 2] = var6;
                        int var7 = field4094[var3 - 1];
                        field4094[var3 - 1] = field4094[var3 + 3];
                        field4094[var3 + 3] = var7;
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
