import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class449 {

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public int field6917 = -1;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "Loq;")
    public static class231 field6916 = new class231("", 16);

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field6918 = 0;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Lwt;")
    public class195 field6915;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "[I")
    public int[] field6914;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "[Ljava/lang/String;")
    public String[] field6919;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "[S")
    public static short[] field6920;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZILbe;IIIILqq;Ltq;)V")
    public static final void method2683(boolean arg0, int arg1, class28 arg2, int arg3, int arg4, int arg5, int arg6, class318 arg7, class427 arg8) {
        field6921++;
        if (!arg0) {
            field6916 = null;
        }
        class173 var9 = class22.field281.method1840((byte) 92, arg5);
        if (var9 == null || !var9.field2692 || !var9.method1082(class273.field4144, 18358)) {
            return;
        }
        if (var9.field2670 != null) {
            int[] var10 = new int[var9.field2670.length];
            for (int var11 = 0; var11 < var10.length / 2; var11++) {
                int var13;
                if (class408.field5928 == 4) {
                    var13 = (int) class23.field289 & 0x3FFF;
                } else {
                    var13 = (int) class23.field289 + class273.field4145 & 0x3FFF;
                }
                int var14 = class195.field3075[var13];
                int var15 = class195.field3077[var13];
                if (class408.field5928 != 4) {
                    var15 = var15 * 256 / (class222.field3427 + 256);
                    var14 = var14 * 256 / (class222.field3427 + 256);
                }
                var10[var11 * 2] = ((var9.field2670[var11 * 2 + 1] * 4 + arg3) * var14 + ((arg1 + (var9.field2670[var11 * 2] * 4)) * var15) >> 15) + arg4 + (arg8.field6175 / 2);
                var10[var11 * 2 + 1] = arg8.field6126 / 2 + arg6 - ((arg3 + (var9.field2670[var11 * 2 + 1] * 4)) * var15 - ((arg1 + (var9.field2670[var11 * 2] * 4)) * var14) >> 15);
            }
            class5.method23(arg7, var10, var9.field2680, arg8.field6287, arg8.field6159);
            for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                arg7.method1896(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[var12 * 2 + 3], var9.field2668, 1, arg2, arg4, arg6);
            }
            arg7.method1896(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field2668, 1, arg2, arg4, arg6);
        }
        class154 var16 = null;
        if (var9.field2689 != -1) {
            var16 = var9.method1083(arg7, false, 1477);
            if (var16 != null) {
                class153.method983(arg2, var16, false, arg3, arg1, arg4, arg8, arg6);
            }
        }
        if (var9.field2702 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method993();
        }
        class488 var18 = class266.field4026;
        class396 var19 = class121.field2015;
        if (var9.field2701 == 1) {
            var19 = class380.field5545;
            var18 = class217.field3343;
        }
        if (var9.field2701 == 2) {
            var18 = class493.field7514;
            var19 = class512.field7764;
        }
        class63.method438(arg2, var9.field2673, arg4, arg3, var18, (byte) -65, arg6, var9.field2702, arg8, var19, arg1, var17);
        return;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public static void method2684(byte arg0) {
        field6916 = null;
        field6920 = null;
        int var1 = 100 % ((93 - arg0) / 32);
    }
}
