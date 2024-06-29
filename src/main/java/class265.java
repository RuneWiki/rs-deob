import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class265 {

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Lth;")
    public static class57 field4049 = new class57(4);

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field4053 = 0;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "S")
    public static short field4055 = 256;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "Z")
    public static boolean field4054 = false;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "J")
    public static long field4052;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lgd;)V", line = 10)
    public static final void method1963(class180 arg0) {
        for (int var1 = arg0.field2590; var1 <= arg0.field2581; var1++) {
            for (int var2 = arg0.field2580; var2 <= arg0.field2601; var2++) {
                class167 var3 = class302.field4502[arg0.field2579][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2407; var4++) {
                        if (var3.field2406[var4] == arg0) {
                            var3.field2407--;
                            for (int var5 = var4; var5 < var3.field2407; var5++) {
                                var3.field2406[var5] = var3.field2406[var5 + 1];
                                var3.field2413[var5] = var3.field2413[var5 + 1];
                            }
                            var3.field2406[var3.field2407] = null;
                            break;
                        }
                    }
                    var3.field2409 = 0;
                    for (int var6 = 0; var6 < var3.field2407; var6++) {
                        var3.field2409 |= var3.field2413[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 68)
    public static void method1964(int arg0) {
        if (arg0 == 1) {
            field4049 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([Ljava/lang/Object;I[III)V", line = 78)
    public static final void method1965(Object[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field4050++;
        if (arg1 != 2) {
            method1963((class180) null);
        }
        if (arg4 >= arg3) {
            return;
        }
        int var5 = (arg3 + arg4) / 2;
        int var6 = arg4;
        int var7 = arg2[var5];
        arg2[var5] = arg2[arg3];
        arg2[arg3] = var7;
        Object var8 = arg0[var5];
        arg0[var5] = arg0[arg3];
        arg0[arg3] = var8;
        for (int var9 = arg4; var9 < arg3; var9++) {
            if ((var9 & 0x1) + var7 > arg2[var9]) {
                int var10 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6] = var10;
                Object var11 = arg0[var9];
                arg0[var9] = arg0[var6];
                arg0[var6++] = var11;
            }
        }
        arg2[arg3] = arg2[var6];
        arg2[var6] = var7;
        arg0[arg3] = arg0[var6];
        arg0[var6] = var8;
        method1965(arg0, 2, arg2, var6 - 1, arg4);
        method1965(arg0, 2, arg2, arg3, var6 + 1);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)I", line = 137)
    public static final int method1966(int arg0) {
        int var1 = 59 / ((arg0 - 56) / 56);
        field4051++;
        return 2;
    }
}
