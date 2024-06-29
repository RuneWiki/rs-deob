import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class190 extends class320 {

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "Ljava/lang/String;")
    public String field3186;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "J")
    public static long field3185 = 0L;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "[I")
    public static int[] field3187 = new int[32];

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3188 = "Take";

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILlg;)Llg;", line = 5)
    public static final class137 method1439(int arg0, class137 arg1) {
        field3184++;
        if (arg1.field2465 != -1) {
            return class146.method1167(arg0 ^ 0x45BA65B1, arg1.field2465);
        } else if (arg0 == 1) {
            int var2 = arg1.field2462 >>> 16;
            class125 var3 = new class125(class172.field2972);
            for (class228 var4 = (class228) var3.method1044(false); var4 != null; var4 = (class228) var3.method1045((byte) 107)) {
                if (var4.field3833 == var2) {
                    return class146.method1167(1169843632, (int) var4.field5062);
                }
            }
            return null;
        } else {
            return (class137) null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(IIII)I", line = 37)
    public static final int method1440(int arg0, int arg1, int arg2, int arg3) {
        field3189++;
        int var4 = arg1 / arg0;
        int var5 = arg0 - 1 & arg1;
        int var6 = arg2 / arg0;
        int var7 = arg0 - 1 & arg2;
        if (arg3 != 0) {
            return -109;
        }
        int var8 = class356.method2469(var6, -1, var4);
        int var9 = class356.method2469(var6 + 1, -1, var4);
        int var10 = class356.method2469(var6, ~arg3, var4 + 1);
        int var11 = class356.method2469(var6 + 1, -1, var4 + 1);
        int var12 = class198.method1492(arg0, var9, var8, false, var7);
        int var13 = class198.method1492(arg0, var11, var10, false, var7);
        return class198.method1492(arg0, var13, var12, false, var5);
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V", line = 77)
    public static void method1441(int arg0) {
        field3187 = null;
        if (arg0 != 3) {
            method1439(-66, (class137) null);
        }
        field3188 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 87)
    public static final void method1442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class95 var20 = new class95(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class279.field4430[var21][arg1][arg2] == null) {
                    class279.field4430[var21][arg1][arg2] = new class257(var21, arg1, arg2);
                }
            }
            class279.field4430[arg0][arg1][arg2].field4156 = var20;
        } else if (arg3 == 1) {
            class95 var22 = new class95(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class279.field4430[var23][arg1][arg2] == null) {
                    class279.field4430[var23][arg1][arg2] = new class257(var23, arg1, arg2);
                }
            }
            class279.field4430[arg0][arg1][arg2].field4156 = var22;
        } else {
            class192 var24 = new class192(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class279.field4430[var25][arg1][arg2] == null) {
                    class279.field4430[var25][arg1][arg2] = new class257(var25, arg1, arg2);
                }
            }
            class279.field4430[arg0][arg1][arg2].field4141 = var24;
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V", line = 136)
    public class190() {
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V", line = 140)
    public static final void method1443(int arg0, int arg1) {
        class257 var2 = class279.field4430[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class257 var4 = class279.field4430[var3][arg0][arg1] = class279.field4430[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field4153--;
                for (int var5 = 0; var5 < var4.field4150; var5++) {
                    class241 var6 = var4.field4147[var5];
                    if ((var6.field3936 >> 29 & 0x3L) == 2L && var6.field3932 == arg0 && var6.field3929 == arg1) {
                        var6.field3939--;
                    }
                }
            }
        }
        if (class279.field4430[0][arg0][arg1] == null) {
            class279.field4430[0][arg0][arg1] = new class257(0, arg0, arg1);
        }
        class279.field4430[0][arg0][arg1].field4145 = var2;
        class279.field4430[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 175)
    public class190(String arg0) {
        this.field3186 = arg0;
    }
}
