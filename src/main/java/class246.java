import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class246 {

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    private static int field4005;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    private static int field4006;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    private static int field4007;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    private static int field4008;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    private static int field4009;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    private static int field4010;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    private static int field4011;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "[I")
    private static int[] field4012;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([III[I[I)V")
    public static final void method1749(int[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        method1750(arg0, 0, arg0.length, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([IIIII[I[I)V")
    private static final void method1750(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (arg5 != null && class151.field2229 - class151.field2230 != arg5.length) {
            throw new IllegalStateException();
        }
        method1754();
        method1753(arg0, arg1, arg2);
        method1755(arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "()V")
    private static final void method1751() {
        if (field4009 < 0) {
            field4005 = 0;
            field4008 = 0;
            field4007 = 0;
            field4011 = 2147483646;
            return;
        }
        method1757(0, field4009);
        int var0 = field4012[1];
        if (var0 < class151.field2230) {
            var0 = class151.field2230;
        }
        byte var1 = 0;
        int var2;
        for (var2 = 0; var2 < field4009; var2 += 4) {
            int var3 = field4012[var2 + 1];
            if (var0 < var3) {
                break;
            }
            int var4 = field4012[var2];
            int var5 = field4012[var2 + 2];
            int var6 = field4012[var2 + 3];
            int var7 = (var5 - var4 << 16) / (var6 - var3);
            int var8 = (var4 << 16) + 32768;
            field4012[var2] = (var0 - var3) * var7 + var8;
            field4012[var2 + 2] = var7;
        }
        field4007 = var1;
        field4008 = var2;
        field4005 = var2;
        field4011 = var0 - 1;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "()V")
    public static void method1752() {
        field4012 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([III)V")
    private static final void method1753(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field4009;
        if (field4012 == null || field4012.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field4009; var5++) {
                var4[var5] = field4012[var5];
            }
            field4012 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field4012[field4009++] = arg0[var7];
                field4012[field4009++] = var9;
                field4012[field4009++] = arg0[var8];
                field4012[field4009++] = var10;
            } else if (var10 < var9) {
                field4012[field4009++] = arg0[var8];
                field4012[field4009++] = var10;
                field4012[field4009++] = arg0[var7];
                field4012[field4009++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "()V")
    private static final void method1754() {
        field4009 = 0;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II[I[I)V")
    private static final void method1755(int arg0, int arg1, int[] arg2, int[] arg3) {
        method1751();
        while (method1758()) {
            int var4 = field4010;
            int var5 = field4006;
            int var6 = field4011;
            if (arg2 != null) {
                int var7 = var6 - class151.field2230;
                if (var4 < arg2[var7] + class151.field2227) {
                    var4 = arg2[var7] + class151.field2227;
                }
                if (var5 > arg2[var7] + arg3[var7] + class151.field2227) {
                    var5 = arg2[var7] + arg3[var7] + class151.field2227;
                }
            }
            class151.method1024(var4, var6, var5 - var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V")
    private static final void method1756(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field4012[var3 - 4];
                    int var5 = field4012[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field4012[var3 - 4] = var5;
                        field4012[var3] = var4;
                        int var6 = field4012[var3 - 2];
                        field4012[var3 - 2] = field4012[var3 + 2];
                        field4012[var3 + 2] = var6;
                        int var7 = field4012[var3 - 1];
                        field4012[var3 - 1] = field4012[var3 + 3];
                        field4012[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)V")
    private static final void method1757(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field4012[arg0];
        int var4 = field4012[arg0 + 1];
        int var5 = field4012[arg0 + 2];
        int var6 = field4012[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field4012[var7 + 1];
            if (var8 < var4) {
                field4012[var2] = field4012[var7];
                field4012[var2 + 1] = var8;
                field4012[var2 + 2] = field4012[var7 + 2];
                field4012[var2 + 3] = field4012[var7 + 3];
                var2 += 4;
                field4012[var7] = field4012[var2];
                field4012[var7 + 1] = field4012[var2 + 1];
                field4012[var7 + 2] = field4012[var2 + 2];
                field4012[var7 + 3] = field4012[var2 + 3];
            }
        }
        field4012[var2] = var3;
        field4012[var2 + 1] = var4;
        field4012[var2 + 2] = var5;
        field4012[var2 + 3] = var6;
        method1757(arg0, var2);
        method1757(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "()Z")
    private static final boolean method1758() {
        int var0 = field4008;
        int var1 = field4005;
        int var2 = field4011;
        while (var1 >= var0) {
            var2++;
            field4011 = var2;
            if (var2 >= class151.field2229) {
                return false;
            }
            int var3 = field4007;
            while (var0 < field4009) {
                int var4 = field4012[var0 + 1];
                if (var2 < var4) {
                    break;
                }
                int var5 = field4012[var0];
                int var6 = field4012[var0 + 2];
                int var7 = field4012[var0 + 3];
                int var8 = (var6 - var5 << 16) / (var7 - var4);
                int var9 = (var5 << 16) + 32768;
                field4012[var0] = var9;
                field4012[var0 + 2] = var8;
                var0 += 4;
            }
            for (int var10 = var3; var10 < var0; var10 += 4) {
                int var11 = field4012[var10 + 3];
                if (var2 >= var11) {
                    field4012[var10] = field4012[var3];
                    field4012[var10 + 1] = field4012[var3 + 1];
                    field4012[var10 + 2] = field4012[var3 + 2];
                    field4012[var10 + 3] = field4012[var3 + 3];
                    var3 += 4;
                }
            }
            if (field4009 == var3) {
                field4009 = 0;
                return false;
            }
            method1756(var3, var0);
            field4007 = var3;
            field4008 = var0;
            var1 = var3;
        }
        field4010 = field4012[var1] >> 16;
        field4006 = field4012[var1 + 4] >> 16;
        field4012[var1] += field4012[var1 + 2];
        field4012[var1 + 4] += field4012[var1 + 6];
        var1 += 8;
        field4005 = var1;
        return true;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "([III)V")
    public static final void method1759(int[] arg0, int arg1, int arg2) {
        method1750(arg0, 0, arg0.length, arg1, arg2, (int[]) null, (int[]) null);
    }
}
