import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class162 {

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "F")
    public static float field2454;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 8)
    public static final String method1265(int arg0, String arg1, String arg2, String arg3) {
        if (arg0 != -1) {
            return null;
        }
        field2450++;
        for (int var4 = arg3.indexOf(arg2); var4 != -1; var4 = arg3.indexOf(arg2, arg1.length() + var4)) {
            arg3 = arg3.substring(0, var4) + arg1 + arg3.substring(arg2.length() + var4);
        }
        return arg3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILja;Ldj;Lqa;IIILrr;)V", line = 28)
    public static final void method1266(int arg0, class90 arg1, class304 arg2, class242 arg3, int arg4, int arg5, int arg6, class198 arg7) {
        field2453++;
        int var8 = arg7.field2898 - (arg4 / 2 + 5);
        if (arg5 > -72) {
            method1265(-46, (String) null, (String) null, (String) null);
        }
        int var9 = arg6 + 2;
        if (arg3.field3491 != 0) {
            arg1.method736(arg0 * arg2.method2081() + arg6 + 1 - var9, (byte) -40, arg3.field3491, arg4 + 10, var8, var9);
        }
        if (arg3.field3489 != 0) {
            arg1.method721(var9, arg3.field3489, var8, arg4 + 10, (byte) -69, arg6 + arg2.method2081() * arg0 + 1 - var9);
        }
        int var10 = arg3.field3525;
        if (arg7.field2886 && arg3.field3494 != -1) {
            var10 = arg3.field3494;
        }
        for (int var11 = 0; var11 < arg0; var11++) {
            String var12 = class74.field1273[var11];
            if (var11 < (arg0 - 1)) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg2.method2079(arg1, var12, arg7.field2898, arg6, var10, true);
            arg6 += arg2.method2081();
        }
    }
}
