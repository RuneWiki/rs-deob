import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class327 {

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "[I")
    public static int[] field4908;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "[I")
    public static int[] field4907;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "[I")
    public static int[] field4909;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    public static final void method2036(byte arg0) {
        class434.method2536(-20860, false);
        field4906++;
        if (arg0 >= 83 && class383.field5581 >= 0 && class383.field5581 != 0) {
            class421.method2461((byte) -28, class383.field5581);
            class383.field5581 = -1;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIII)V")
    public static final void method2037(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 0) {
            method2037(7, 51, 108, -40, -14, 95);
        }
        class198.field3113 = arg1;
        class182.field2874 = arg3;
        class475.field7252 = arg2;
        class280.field4258 = arg5;
        field4905++;
        class461.field7099 = arg0;
        if (class475.field7252 >= 100) {
            int var6 = class182.field2874 * 128 + 64;
            int var7 = class280.field4258 * 128 + 64;
            int var8 = class7.method38(var6, class362.field5339, var7, (byte) -54) - class198.field3113;
            int var9 = var6 - class243.field3655;
            int var10 = var8 - class288.field4373;
            int var11 = var7 - class290.field4403;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var11 * var11)));
            class456.field6999 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class16.field226 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            class211.field3284 = 0;
            if (class456.field6999 < 1024) {
                class456.field6999 = 1024;
            }
            if (class456.field6999 > 3072) {
                class456.field6999 = 3072;
            }
        }
        class408.field5928 = 2;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static void method2038(int arg0) {
        field4908 = null;
        if (arg0 == 16251) {
            field4909 = null;
            field4907 = null;
        }
    }

    static {
        new class423("Use", "Benutzen", "Utiliser", "Usar");
        field4908 = new int[1];
    }
}
