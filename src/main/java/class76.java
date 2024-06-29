import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class76 {

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    private static int field1255;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    private static int field1256;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    private static int field1257;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    private static int field1258;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    private static int field1259;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    private static int field1261;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    private static int field1262;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "[I")
    private static int[] field1260;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II[I[I)V")
    private static final void method507(int arg0, int arg1, int[] arg2, int[] arg3) {
        method508();
        while (method516()) {
            int var4 = field1256;
            int var5 = field1257;
            int var6 = field1258;
            if (arg2 != null) {
                int var7 = var6 - class127.field2003;
                if (var4 < arg2[var7] + class127.field2004) {
                    var4 = arg2[var7] + class127.field2004;
                }
                if (var5 > arg2[var7] + arg3[var7] + class127.field2004) {
                    var5 = arg2[var7] + arg3[var7] + class127.field2004;
                }
            }
            class127.method892(var4, var6, var5 - var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "()V")
    private static final void method508() {
        if (field1255 < 0) {
            field1259 = 0;
            field1261 = 0;
            field1262 = 0;
            field1258 = 2147483646;
            return;
        }
        method511(0, field1255);
        int var0 = field1260[1];
        if (var0 < class127.field2003) {
            var0 = class127.field2003;
        }
        byte var1 = 0;
        int var2;
        for (var2 = 0; var2 < field1255; var2 += 4) {
            int var3 = field1260[var2 + 1];
            if (var0 < var3) {
                break;
            }
            int var4 = field1260[var2];
            int var5 = field1260[var2 + 2];
            int var6 = field1260[var2 + 3];
            int var7 = (var5 - var4 << 16) / (var6 - var3);
            int var8 = (var4 << 16) + 32768;
            field1260[var2] = (var0 - var3) * var7 + var8;
            field1260[var2 + 2] = var7;
        }
        field1262 = var1;
        field1261 = var2;
        field1259 = var2;
        field1258 = var0 - 1;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([IIIII[I[I)V")
    private static final void method509(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (arg5 != null && class127.field2008 - class127.field2003 != arg5.length) {
            throw new IllegalStateException();
        }
        method510();
        method512(arg0, arg1, arg2);
        method507(arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "()V")
    private static final void method510() {
        field1255 = 0;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)V")
    private static final void method511(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field1260[arg0];
        int var4 = field1260[arg0 + 1];
        int var5 = field1260[arg0 + 2];
        int var6 = field1260[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field1260[var7 + 1];
            if (var8 < var4) {
                field1260[var2] = field1260[var7];
                field1260[var2 + 1] = var8;
                field1260[var2 + 2] = field1260[var7 + 2];
                field1260[var2 + 3] = field1260[var7 + 3];
                var2 += 4;
                field1260[var7] = field1260[var2];
                field1260[var7 + 1] = field1260[var2 + 1];
                field1260[var7 + 2] = field1260[var2 + 2];
                field1260[var7 + 3] = field1260[var2 + 3];
            }
        }
        field1260[var2] = var3;
        field1260[var2 + 1] = var4;
        field1260[var2 + 2] = var5;
        field1260[var2 + 3] = var6;
        method511(arg0, var2);
        method511(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([III)V")
    private static final void method512(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field1255;
        if (field1260 == null || field1260.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field1255; var5++) {
                var4[var5] = field1260[var5];
            }
            field1260 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field1260[field1255++] = arg0[var7];
                field1260[field1255++] = var9;
                field1260[field1255++] = arg0[var8];
                field1260[field1255++] = var10;
            } else if (var10 < var9) {
                field1260[field1255++] = arg0[var8];
                field1260[field1255++] = var10;
                field1260[field1255++] = arg0[var7];
                field1260[field1255++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "()V")
    public static void method513() {
        field1260 = null;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)V")
    private static final void method514(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field1260[var3 - 4];
                    int var5 = field1260[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field1260[var3 - 4] = var5;
                        field1260[var3] = var4;
                        int var6 = field1260[var3 - 2];
                        field1260[var3 - 2] = field1260[var3 + 2];
                        field1260[var3 + 2] = var6;
                        int var7 = field1260[var3 - 1];
                        field1260[var3 - 1] = field1260[var3 + 3];
                        field1260[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "([III)V")
    public static final void method515(int[] arg0, int arg1, int arg2) {
        method509(arg0, 0, arg0.length, arg1, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "()Z")
    private static final boolean method516() {
        int var0 = field1261;
        int var1 = field1259;
        int var2 = field1258;
        while (var1 >= var0) {
            var2++;
            field1258 = var2;
            if (var2 >= class127.field2008) {
                return false;
            }
            int var3 = field1262;
            while (var0 < field1255) {
                int var4 = field1260[var0 + 1];
                if (var2 < var4) {
                    break;
                }
                int var5 = field1260[var0];
                int var6 = field1260[var0 + 2];
                int var7 = field1260[var0 + 3];
                int var8 = (var6 - var5 << 16) / (var7 - var4);
                int var9 = (var5 << 16) + 32768;
                field1260[var0] = var9;
                field1260[var0 + 2] = var8;
                var0 += 4;
            }
            for (int var10 = var3; var10 < var0; var10 += 4) {
                int var11 = field1260[var10 + 3];
                if (var2 >= var11) {
                    field1260[var10] = field1260[var3];
                    field1260[var10 + 1] = field1260[var3 + 1];
                    field1260[var10 + 2] = field1260[var3 + 2];
                    field1260[var10 + 3] = field1260[var3 + 3];
                    var3 += 4;
                }
            }
            if (field1255 == var3) {
                field1255 = 0;
                return false;
            }
            method514(var3, var0);
            field1262 = var3;
            field1261 = var0;
            var1 = var3;
        }
        field1256 = field1260[var1] >> 16;
        field1257 = field1260[var1 + 4] >> 16;
        field1260[var1] += field1260[var1 + 2];
        field1260[var1 + 4] += field1260[var1 + 6];
        var1 += 8;
        field1259 = var1;
        return true;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([III[I[I)V")
    public static final void method517(int[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        method509(arg0, 0, arg0.length, arg1, arg2, arg3, arg4);
    }
}
