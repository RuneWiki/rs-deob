import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class43 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    private static int field896;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    private static int field898;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    private static int field899;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    private static int field900;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    private static int field901;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    private static int field902;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    private static int field903;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "[I")
    private static int[] field897;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([III)V", line = 4)
    public static final void method358(int[] arg0, int arg1, int arg2) {
        method366(arg0, 0, arg0.length, arg1, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V", line = 8)
    private static final void method359(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field897[arg0];
        int var4 = field897[arg0 + 1];
        int var5 = field897[arg0 + 2];
        int var6 = field897[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field897[var7 + 1];
            if (var8 < var4) {
                field897[var2] = field897[var7];
                field897[var2 + 1] = var8;
                field897[var2 + 2] = field897[var7 + 2];
                field897[var2 + 3] = field897[var7 + 3];
                var2 += 4;
                field897[var7] = field897[var2];
                field897[var7 + 1] = field897[var2 + 1];
                field897[var7 + 2] = field897[var2 + 2];
                field897[var7 + 3] = field897[var2 + 3];
            }
        }
        field897[var2] = var3;
        field897[var2 + 1] = var4;
        field897[var2 + 2] = var5;
        field897[var2 + 3] = var6;
        method359(arg0, var2);
        method359(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()Z", line = 54)
    private static final boolean method360() {
        int var0 = field900;
        int var1 = field902;
        int var2 = field901;
        while (var1 >= var0) {
            var2++;
            field901 = var2;
            if (var2 >= class270.field4399) {
                return false;
            }
            int var3 = field903;
            while (var0 < field898) {
                int var4 = field897[var0 + 1];
                if (var2 < var4) {
                    break;
                }
                int var5 = field897[var0];
                int var6 = field897[var0 + 2];
                int var7 = field897[var0 + 3];
                int var8 = (var6 - var5 << 16) / (var7 - var4);
                int var9 = (var5 << 16) + 32768;
                field897[var0] = var9;
                field897[var0 + 2] = var8;
                var0 += 4;
            }
            for (int var10 = var3; var10 < var0; var10 += 4) {
                int var11 = field897[var10 + 3];
                if (var2 >= var11) {
                    field897[var10] = field897[var3];
                    field897[var10 + 1] = field897[var3 + 1];
                    field897[var10 + 2] = field897[var3 + 2];
                    field897[var10 + 3] = field897[var3 + 3];
                    var3 += 4;
                }
            }
            if (field898 == var3) {
                field898 = 0;
                return false;
            }
            method361(var3, var0);
            field903 = var3;
            field900 = var0;
            var1 = var3;
        }
        field899 = field897[var1] >> 16;
        field896 = field897[var1 + 4] >> 16;
        field897[var1] += field897[var1 + 2];
        field897[var1 + 4] += field897[var1 + 6];
        var1 += 8;
        field902 = var1;
        return true;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V", line = 129)
    private static final void method361(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field897[var3 - 4];
                    int var5 = field897[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field897[var3 - 4] = var5;
                        field897[var3] = var4;
                        int var6 = field897[var3 - 2];
                        field897[var3 - 2] = field897[var3 + 2];
                        field897[var3 + 2] = var6;
                        int var7 = field897[var3 - 1];
                        field897[var3 - 1] = field897[var3 + 3];
                        field897[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "()V", line = 166)
    private static final void method362() {
        field898 = 0;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "([III)V", line = 174)
    private static final void method363(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field898;
        if (field897 == null || field897.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field898; var5++) {
                var4[var5] = field897[var5];
            }
            field897 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field897[field898++] = arg0[var7];
                field897[field898++] = var9;
                field897[field898++] = arg0[var8];
                field897[field898++] = var10;
            } else if (var10 < var9) {
                field897[field898++] = arg0[var8];
                field897[field898++] = var10;
                field897[field898++] = arg0[var7];
                field897[field898++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([III[I[I)V", line = 227)
    public static final void method364(int[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        method366(arg0, 0, arg0.length, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "()V", line = 231)
    private static final void method365() {
        if (field898 < 0) {
            field902 = 0;
            field900 = 0;
            field903 = 0;
            field901 = 2147483646;
            return;
        }
        method359(0, field898);
        int var0 = field897[1];
        if (var0 < class270.field4407) {
            var0 = class270.field4407;
        }
        byte var1 = 0;
        int var2;
        for (var2 = 0; var2 < field898; var2 += 4) {
            int var3 = field897[var2 + 1];
            if (var0 < var3) {
                break;
            }
            int var4 = field897[var2];
            int var5 = field897[var2 + 2];
            int var6 = field897[var2 + 3];
            int var7 = (var5 - var4 << 16) / (var6 - var3);
            int var8 = (var4 << 16) + 32768;
            field897[var2] = (var0 - var3) * var7 + var8;
            field897[var2 + 2] = var7;
        }
        field903 = var1;
        field900 = var2;
        field902 = var2;
        field901 = var0 - 1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([IIIII[I[I)V", line = 282)
    private static final void method366(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (arg5 != null && class270.field4399 - class270.field4407 != arg5.length) {
            throw new IllegalStateException();
        }
        method362();
        method363(arg0, arg1, arg2);
        method367(arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II[I[I)V", line = 290)
    private static final void method367(int arg0, int arg1, int[] arg2, int[] arg3) {
        method365();
        while (method360()) {
            int var4 = field899;
            int var5 = field896;
            int var6 = field901;
            if (arg2 != null) {
                int var7 = var6 - class270.field4407;
                if (var4 < arg2[var7] + class270.field4400) {
                    var4 = arg2[var7] + class270.field4400;
                }
                if (var5 > arg2[var7] + arg3[var7] + class270.field4400) {
                    var5 = arg2[var7] + arg3[var7] + class270.field4400;
                }
            }
            class270.method1912(var4, var6, var5 - var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "()V", line = 318)
    public static void method368() {
        field897 = null;
    }
}
