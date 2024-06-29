import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public abstract class class59 {

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field609 = 1338;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Loca;", line = 3)
    public static final class594 method316(Throwable arg0, String arg1) {
        field608++;
        class594 var2;
        if ((arg0 instanceof class594)) {
            var2 = (class594) arg0;
            var2.field8378 = var2.field8378 + ' ' + arg1;
        } else {
            var2 = new class594(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(JJ)J", line = 23)
    public static long method317(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIILsp;Lsp;III)V", line = 31)
    public static final void method318(int arg0, int arg1, int arg2, int arg3, int arg4, class677 arg5, class677 arg6, int arg7, int arg8, int arg9) {
        field611++;
        int var10 = arg6.method1419(-92);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class534 var12 = (class534) class66.field667.method78(0, (long) var10);
        if (var12 == null) {
            class550[] var13 = class550.method3117(class408.field5441, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class701.field9813.method1041(var13[0], true);
            class66.field667.method92(arg1 ^ 0x53B, (long) var10, var12);
        }
        class372.method2165(arg0, arg5.field5166, -128, arg9 >> 1, arg5.field5179, arg2, arg7 >> 1, arg5.field5176, 0, arg5.method1414(-31789) * 256);
        int var14 = class703.field9873[0] + arg4 - 18;
        int var15 = class703.field9873[1] + arg3 - 54 - 16;
        int var16 = arg8 / 4 * 18 + var14;
        int var17 = arg8 % 4 * 18 + var15;
        var12.method3001(var16, var17);
        if (arg5 == arg6) {
            class701.field9813.method3201(-256, 18, 6195, 18, var17 - 1, var16 - 1);
        }
        if (arg1 != 1338) {
            field609 = 122;
        }
        class237 var18 = class162.method881(12918);
        var18.field2948 = var16;
        var18.field2943 = arg6;
        var18.field2947 = var17 + 16;
        var18.field2950 = var17;
        var18.field2944 = var16 + 16;
        class474.field6833.method1670((byte) -31, var18);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZIII)V", line = 82)
    public static final void method319(boolean arg0, int arg1, int arg2, int arg3) {
        int var4 = class639.field9075.field6764 * arg3 >> 8;
        if (!arg0) {
            return;
        }
        field610++;
        if (var4 != 0 && arg2 != -1) {
            class193.method1175(0, arg2, class246.field3047, 0, var4, false);
            class19.field151 = true;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)J")
    public abstract long method320(byte arg0);
}
