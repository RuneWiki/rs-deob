import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class328 {

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    private static int field4936;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    private static int field4937;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    private static int field4938;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    private static int field4939;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    private static int field4940;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    private static int field4942;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
    private static int field4943;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "[I")
    private static int[] field4941;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "([IIIII[I[I)V", line = 8)
    private static final void method2267(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (arg5 != null && class44.field621 - class44.field616 != arg5.length) {
            throw new IllegalStateException();
        }
        method2268();
        method2275(arg0, arg1, arg2);
        method2277(arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "()V", line = 16)
    private static final void method2268() {
        field4943 = 0;
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "()Z", line = 22)
    private static final boolean method2269() {
        int var0 = field4937;
        int var1 = field4939;
        int var2 = field4936;
        while (var1 >= var0) {
            var2++;
            field4936 = var2;
            if (var2 >= class44.field621) {
                return false;
            }
            int var3 = field4940;
            while (var0 < field4943) {
                int var4 = field4941[var0 + 1];
                if (var2 < var4) {
                    break;
                }
                int var5 = field4941[var0];
                int var6 = field4941[var0 + 2];
                int var7 = field4941[var0 + 3];
                int var8 = (var6 - var5 << 16) / (var7 - var4);
                int var9 = (var5 << 16) + 32768;
                field4941[var0] = var9;
                field4941[var0 + 2] = var8;
                var0 += 4;
            }
            for (int var10 = var3; var10 < var0; var10 += 4) {
                int var11 = field4941[var10 + 3];
                if (var2 >= var11) {
                    field4941[var10] = field4941[var3];
                    field4941[var10 + 1] = field4941[var3 + 1];
                    field4941[var10 + 2] = field4941[var3 + 2];
                    field4941[var10 + 3] = field4941[var3 + 3];
                    var3 += 4;
                }
            }
            if (field4943 == var3) {
                field4943 = 0;
                return false;
            }
            method2271(var3, var0);
            field4940 = var3;
            field4937 = var0;
            var1 = var3;
        }
        field4942 = field4941[var1] >> 16;
        field4938 = field4941[var1 + 4] >> 16;
        field4941[var1] += field4941[var1 + 2];
        field4941[var1 + 4] += field4941[var1 + 6];
        var1 += 8;
        field4939 = var1;
        return true;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)V", line = 100)
    private static final void method2270(int arg0, int arg1) {
        if (arg1 <= arg0 + 4) {
            return;
        }
        int var2 = arg0;
        int var3 = field4941[arg0];
        int var4 = field4941[arg0 + 1];
        int var5 = field4941[arg0 + 2];
        int var6 = field4941[arg0 + 3];
        for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field4941[var7 + 1];
            if (var8 < var4) {
                field4941[var2] = field4941[var7];
                field4941[var2 + 1] = var8;
                field4941[var2 + 2] = field4941[var7 + 2];
                field4941[var2 + 3] = field4941[var7 + 3];
                var2 += 4;
                field4941[var7] = field4941[var2];
                field4941[var7 + 1] = field4941[var2 + 1];
                field4941[var7 + 2] = field4941[var2 + 2];
                field4941[var7 + 3] = field4941[var2 + 3];
            }
        }
        field4941[var2] = var3;
        field4941[var2 + 1] = var4;
        field4941[var2 + 2] = var5;
        field4941[var2 + 3] = var6;
        method2270(arg0, var2);
        method2270(var2 + 4, arg1);
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(II)V", line = 144)
    private static final void method2271(int arg0, int arg1) {
        while (true) {
            if (arg1 >= arg0 + 8) {
                boolean var2 = true;
                for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
                    int var4 = field4941[var3 - 4];
                    int var5 = field4941[var3];
                    if (var4 > var5) {
                        var2 = false;
                        field4941[var3 - 4] = var5;
                        field4941[var3] = var4;
                        int var6 = field4941[var3 - 2];
                        field4941[var3 - 2] = field4941[var3 + 2];
                        field4941[var3 + 2] = var6;
                        int var7 = field4941[var3 - 1];
                        field4941[var3 - 1] = field4941[var3 + 3];
                        field4941[var3 + 3] = var7;
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

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "()V", line = 181)
    private static final void method2272() {
        if (field4943 < 0) {
            field4939 = 0;
            field4937 = 0;
            field4940 = 0;
            field4936 = 2147483646;
            return;
        }
        method2270(0, field4943);
        int var0 = field4941[1];
        if (var0 < class44.field616) {
            var0 = class44.field616;
        }
        byte var1 = 0;
        int var2;
        for (var2 = 0; var2 < field4943; var2 += 4) {
            int var3 = field4941[var2 + 1];
            if (var0 < var3) {
                break;
            }
            int var4 = field4941[var2];
            int var5 = field4941[var2 + 2];
            int var6 = field4941[var2 + 3];
            int var7 = (var5 - var4 << 16) / (var6 - var3);
            int var8 = (var4 << 16) + 32768;
            field4941[var2] = (var0 - var3) * var7 + var8;
            field4941[var2 + 2] = var7;
        }
        field4940 = var1;
        field4937 = var2;
        field4939 = var2;
        field4936 = var0 - 1;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "([III[I[I)V", line = 227)
    public static final void method2273(int[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        method2267(arg0, 0, arg0.length, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "([III)V", line = 230)
    public static final void method2274(int[] arg0, int arg1, int arg2) {
        method2267(arg0, 0, arg0.length, arg1, arg2, (int[]) null, (int[]) null);
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "([III)V", line = 236)
    private static final void method2275(int[] arg0, int arg1, int arg2) {
        int var3 = (arg2 << 1) + field4943;
        if (field4941 == null || field4941.length < var3) {
            int[] var4 = new int[var3];
            for (int var5 = 0; var5 < field4943; var5++) {
                var4[var5] = field4941[var5];
            }
            field4941 = var4;
        }
        int var6 = arg1 + arg2;
        int var7 = var6 - 2;
        for (int var8 = arg1; var8 < var6; var8 += 2) {
            int var9 = arg0[var7 + 1];
            int var10 = arg0[var8 + 1];
            if (var9 < var10) {
                field4941[field4943++] = arg0[var7];
                field4941[field4943++] = var9;
                field4941[field4943++] = arg0[var8];
                field4941[field4943++] = var10;
            } else if (var10 < var9) {
                field4941[field4943++] = arg0[var8];
                field4941[field4943++] = var10;
                field4941[field4943++] = arg0[var7];
                field4941[field4943++] = var9;
            }
            var7 = var8;
        }
    }

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "()V", line = 285)
    public static void method2276() {
        field4941 = null;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II[I[I)V", line = 294)
    private static final void method2277(int arg0, int arg1, int[] arg2, int[] arg3) {
        method2272();
        while (method2269()) {
            int var4 = field4942;
            int var5 = field4938;
            int var6 = field4936;
            if (arg2 != null) {
                int var7 = var6 - class44.field616;
                if (var4 < arg2[var7] + class44.field622) {
                    var4 = arg2[var7] + class44.field622;
                }
                if (var5 > arg2[var7] + arg3[var7] + class44.field622) {
                    var5 = arg2[var7] + arg3[var7] + class44.field622;
                }
            }
            class44.method329(var4, var6, var5 - var4, arg0, arg1);
        }
    }
}
