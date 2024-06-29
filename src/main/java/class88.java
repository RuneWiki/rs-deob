import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class88 {

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    private static int field1254;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    private static int field1255;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    private static int field1256;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    private static int field1257;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    private static int field1258;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    private static int field1259;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    private static int field1260;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "[I")
    private static int[] field1253;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)V", line = 3)
    private static final void method788(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field1253[arg0];
        int var4 = field1253[arg0 + 1];
        int var5 = field1253[arg0 + 2];
        int var6 = field1253[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field1253[var7 + 1];
            if (var8 < var4) {
                field1253[var2] = field1253[var7];
                field1253[var2 + 1] = var8;
                field1253[var2 + 2] = field1253[var7 + 2];
                field1253[var2 + 3] = field1253[var7 + 3];
                var2 += 4;
                field1253[var7] = field1253[var2];
                field1253[var7 + 1] = field1253[var2 + 1];
                field1253[var7 + 2] = field1253[var2 + 2];
                field1253[var7 + 3] = field1253[var2 + 3];
            }
        }
        field1253[var2] = var3;
        field1253[var2 + 1] = var4;
        field1253[var2 + 2] = var5;
        field1253[var2 + 3] = var6;
        method788(arg0, var2);
        method788(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([IIIII[I[I)V", line = 51)
    private static final void method789(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (arg5 != null && class213.field3341 - class213.field3344 != arg5.length) {
            throw new IllegalStateException();
        }
        method797();
        method796(arg0, arg1, arg2);
        method791(arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "()V", line = 64)
    private static final void method790() {
        if (field1257 < 0) {
            field1254 = 0;
            field1258 = 0;
            field1259 = 0;
            field1260 = 2147483646;
            return;
        }
        method788(0, field1257);
        int var0 = field1253[1];
        if (var0 < class213.field3344) {
            var0 = class213.field3344;
        }
        byte var1 = 0;
        int var2;
        for (var2 = 0; var2 < field1257; var2 += 4) {
            int var3 = field1253[var2 + 1];
            if (var0 < var3) {
                break;
            }
            int var4 = field1253[var2];
            int var5 = field1253[var2 + 2];
            int var6 = field1253[var2 + 3];
            int var7 = (var5 - var4 << 16) / (var6 - var3);
            int var8 = (var4 << 16) + 32768;
            field1253[var2] = (var0 - var3) * var7 + var8;
            field1253[var2 + 2] = var7;
        }
        field1259 = var1;
        field1258 = var2;
        field1254 = var2;
        field1260 = var0 - 1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[I[I)V", line = 109)
    private static final void method791(int arg0, int arg1, int[] arg2, int[] arg3) {
        method790();
        while (true) {
            int var4;
            int var5;
            int var6;
            do {
                if (!method794()) {
                    return;
                }
                var4 = field1255;
                var5 = field1256;
                var6 = field1260;
                if (arg2 == null) {
                    break;
                }
                int var7 = var6 - class213.field3344;
                if (var4 < arg2[var7] + class213.field3342) {
                    var4 = arg2[var7] + class213.field3342;
                }
                if (var5 > arg2[var7] + arg3[var7] + class213.field3342) {
                    var5 = arg2[var7] + arg3[var7] + class213.field3342;
                }
            } while (var4 >= var5);
            class213.method1602(var4, var6, var5 - var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "()V", line = 142)
    public static void method792() {
        field1253 = null;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)V", line = 147)
    private static final void method793(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field1253[var3 - 4];
                    int var5 = field1253[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field1253[var3 - 4] = var5;
                        field1253[var3] = var4;
                        int var6 = field1253[var3 - 2];
                        field1253[var3 - 2] = field1253[var3 + 2];
                        field1253[var3 + 2] = var6;
                        int var7 = field1253[var3 - 1];
                        field1253[var3 - 1] = field1253[var3 + 3];
                        field1253[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "()Z", line = 186)
    private static final boolean method794() {
        int var0 = field1258;
        int var1 = field1254;
        int var2 = field1260;
        while (var1 >= var0) {
            var2++;
            field1260 = var2;
            if (var2 >= class213.field3341) {
                return false;
            }
            int var3 = field1259;
            while (var0 < field1257) {
                int var4 = field1253[var0 + 1];
                if (var2 < var4) {
                    break;
                }
                int var5 = field1253[var0];
                int var6 = field1253[var0 + 2];
                int var7 = field1253[var0 + 3];
                int var8 = (var6 - var5 << 16) / (var7 - var4);
                int var9 = (var5 << 16) + 32768;
                field1253[var0] = var9;
                field1253[var0 + 2] = var8;
                var0 += 4;
            }
            for (int var10 = var3; var10 < var0; var10 += 4) {
                int var11 = field1253[var10 + 3];
                if (var2 >= var11) {
                    field1253[var10] = field1253[var3];
                    field1253[var10 + 1] = field1253[var3 + 1];
                    field1253[var10 + 2] = field1253[var3 + 2];
                    field1253[var10 + 3] = field1253[var3 + 3];
                    var3 += 4;
                }
            }
            if (field1257 == var3) {
                field1257 = 0;
                return false;
            }
            method793(var3, var0);
            field1259 = var3;
            field1258 = var0;
            var1 = var3;
        }
        field1255 = field1253[var1] >> 16;
        field1256 = field1253[var1 + 4] >> 16;
        field1253[var1] += field1253[var1 + 2];
        field1253[var1 + 4] += field1253[var1 + 6];
        var1 += 8;
        field1254 = var1;
        return true;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([III[I[I)V", line = 262)
    public static final void method795(int[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        method789(arg0, 0, arg0.length, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([III)V", line = 269)
    private static final void method796(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field1257;
        if (field1253 == null || field1253.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field1257; var5++) {
                var4[var5] = field1253[var5];
            }
            field1253 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field1253[field1257++] = arg0[var7];
                field1253[field1257++] = var9;
                field1253[field1257++] = arg0[var8];
                field1253[field1257++] = var10;
            } else if (var10 < var9) {
                field1253[field1257++] = arg0[var8];
                field1253[field1257++] = var10;
                field1253[field1257++] = arg0[var7];
                field1253[field1257++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "()V", line = 320)
    private static final void method797() {
        field1257 = 0;
    }
}
