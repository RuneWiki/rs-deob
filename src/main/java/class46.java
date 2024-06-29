import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class46 {

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    private static int field519;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    private static int field520;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    private static int field521;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    private static int field522;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
    private static int field523;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
    private static int field524;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
    private static int field526;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "[I")
    private static int[] field525;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "()Z", line = 10)
    private static final boolean method280() {
        int var0 = field524;
        int var1 = field520;
        int var2 = field526;
        while (var1 >= var0) {
            var2++;
            field526 = var2;
            if (var2 >= class239.field3667) {
                return false;
            }
            int var3 = field522;
            while (var0 < field519) {
                int var4 = field525[var0 + 1];
                if (var2 < var4) {
                    break;
                }
                int var5 = field525[var0];
                int var6 = field525[var0 + 2];
                int var7 = field525[var0 + 3];
                int var8 = (var6 - var5 << 16) / (var7 - var4);
                int var9 = (var5 << 16) + 32768;
                field525[var0] = var9;
                field525[var0 + 2] = var8;
                var0 += 4;
            }
            for (int var10 = var3; var10 < var0; var10 += 4) {
                int var11 = field525[var10 + 3];
                if (var2 >= var11) {
                    field525[var10] = field525[var3];
                    field525[var10 + 1] = field525[var3 + 1];
                    field525[var10 + 2] = field525[var3 + 2];
                    field525[var10 + 3] = field525[var3 + 3];
                    var3 += 4;
                }
            }
            if (field519 == var3) {
                field519 = 0;
                return false;
            }
            method281(var3, var0);
            field522 = var3;
            field524 = var0;
            var1 = var3;
        }
        field523 = field525[var1] >> 16;
        field521 = field525[var1 + 4] >> 16;
        field525[var1] += field525[var1 + 2];
        field525[var1 + 4] += field525[var1 + 6];
        var1 += 8;
        field520 = var1;
        return true;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)V", line = 85)
    private static final void method281(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field525[var3 - 4];
                    int var5 = field525[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field525[var3 - 4] = var5;
                        field525[var3] = var4;
                        int var6 = field525[var3 - 2];
                        field525[var3 - 2] = field525[var3 + 2];
                        field525[var3 + 2] = var6;
                        int var7 = field525[var3 - 1];
                        field525[var3 - 1] = field525[var3 + 3];
                        field525[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "()V", line = 122)
    private static final void method282() {
        field519 = 0;
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "()V", line = 125)
    public static void method283() {
        field525 = null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "([IIIII[I[I)V", line = 132)
    private static final void method284(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (arg5 != null && class239.field3667 - class239.field3666 != arg5.length) {
            throw new IllegalStateException();
        }
        method282();
        method289(arg0, arg1, arg2);
        method287(arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "()V", line = 142)
    private static final void method285() {
        if (field519 < 0) {
            field520 = 0;
            field524 = 0;
            field522 = 0;
            field526 = 2147483646;
            return;
        }
        method286(0, field519);
        int var0 = field525[1];
        if (var0 < class239.field3666) {
            var0 = class239.field3666;
        }
        byte var1 = 0;
        int var2;
        for (var2 = 0; var2 < field519; var2 += 4) {
            int var3 = field525[var2 + 1];
            if (var0 < var3) {
                break;
            }
            int var4 = field525[var2];
            int var5 = field525[var2 + 2];
            int var6 = field525[var2 + 3];
            int var7 = (var5 - var4 << 16) / (var6 - var3);
            int var8 = (var4 << 16) + 32768;
            field525[var2] = (var0 - var3) * var7 + var8;
            field525[var2 + 2] = var7;
        }
        field522 = var1;
        field524 = var2;
        field520 = var2;
        field526 = var0 - 1;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)V", line = 189)
    private static final void method286(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field525[arg0];
        int var4 = field525[arg0 + 1];
        int var5 = field525[arg0 + 2];
        int var6 = field525[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field525[var7 + 1];
            if (var8 < var4) {
                field525[var2] = field525[var7];
                field525[var2 + 1] = var8;
                field525[var2 + 2] = field525[var7 + 2];
                field525[var2 + 3] = field525[var7 + 3];
                var2 += 4;
                field525[var7] = field525[var2];
                field525[var7 + 1] = field525[var2 + 1];
                field525[var7 + 2] = field525[var2 + 2];
                field525[var7 + 3] = field525[var2 + 3];
            }
        }
        field525[var2] = var3;
        field525[var2 + 1] = var4;
        field525[var2 + 2] = var5;
        field525[var2 + 3] = var6;
        method286(arg0, var2);
        method286(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II[I[I)V", line = 234)
    private static final void method287(int arg0, int arg1, int[] arg2, int[] arg3) {
        method285();
        while (true) {
            int var4;
            int var5;
            int var6;
            do {
                if (!method280()) {
                    return;
                }
                var4 = field523;
                var5 = field521;
                var6 = field526;
                if (arg2 == null) {
                    break;
                }
                int var7 = var6 - class239.field3666;
                if (var4 < arg2[var7] + class239.field3665) {
                    var4 = arg2[var7] + class239.field3665;
                }
                if (var5 > arg2[var7] + arg3[var7] + class239.field3665) {
                    var5 = arg2[var7] + arg3[var7] + class239.field3665;
                }
            } while (var4 >= var5);
            class239.method1654(var4, var6, var5 - var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "([III[I[I)V", line = 264)
    public static final void method288(int[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        method284(arg0, 0, arg0.length, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "([III)V", line = 272)
    private static final void method289(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field519;
        if (field525 == null || field525.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field519; var5++) {
                var4[var5] = field525[var5];
            }
            field525 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field525[field519++] = arg0[var7];
                field525[field519++] = var9;
                field525[field519++] = arg0[var8];
                field525[field519++] = var10;
            } else if (var10 < var9) {
                field525[field519++] = arg0[var8];
                field525[field519++] = var10;
                field525[field519++] = arg0[var7];
                field525[field519++] = var9;
            }
            var7 = var8;
        }
    }
}
