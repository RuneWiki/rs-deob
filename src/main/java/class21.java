import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class21 {

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "Ljava/lang/String;")
    public static String field328 = " is already on your ignore list.";

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field330 = new String[1000];

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "Lsc;")
    public static class20 field329;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BIIIII)V", line = 10)
    public static final void method128(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field331++;
        int var6 = 54 % ((-arg0 - 72) / 45);
        if (arg2 > class261.field3911 || arg4 < class326.field4901) {
            return;
        }
        boolean var7;
        if (class355.field5452 > arg5) {
            var7 = false;
            arg5 = class355.field5452;
        } else if (class348.field5378 < arg5) {
            var7 = false;
            arg5 = class348.field5378;
        } else {
            var7 = true;
        }
        boolean var8;
        if (class355.field5452 > arg3) {
            arg3 = class355.field5452;
            var8 = false;
        } else if (arg3 <= class348.field5378) {
            var8 = true;
        } else {
            var8 = false;
            arg3 = class348.field5378;
        }
        if (class326.field4901 <= arg2) {
            class329.method2285(arg3, class274.field4158[arg2++], (byte) -95, arg5, arg1);
        } else {
            arg2 = class326.field4901;
        }
        if (arg4 <= class261.field3911) {
            class329.method2285(arg3, class274.field4158[arg4--], (byte) 113, arg5, arg1);
        } else {
            arg4 = class261.field3911;
        }
        if (var8 && var7) {
            for (int var9 = arg2; var9 <= arg4; var9++) {
                int[] var10 = class274.field4158[var9];
                var10[arg3] = var10[arg5] = arg1;
            }
        } else if (var8) {
            for (int var11 = arg2; var11 <= arg4; var11++) {
                class274.field4158[var11][arg3] = arg1;
            }
        } else if (var7) {
            for (int var12 = arg2; var12 <= arg4; var12++) {
                class274.field4158[var12][arg5] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)V", line = 119)
    public static void method129(boolean arg0) {
        field328 = null;
        if (!arg0) {
            field329 = null;
            field330 = null;
        }
    }
}
