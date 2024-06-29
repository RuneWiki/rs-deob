import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class454 {

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "[B")
    public static byte[] field6396 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field6397 = 999999;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Lsc;")
    public static class211 field6395;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)Z")
    public static final boolean method2669(int arg0, byte arg1) {
        if (arg1 == -89) {
            field6394++;
            return arg0 == 11 || arg0 == 12 || arg0 == 1004 || arg0 == 8 || arg0 == 2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lwp;Lnp;IIIII)V")
    public static final void method2670(class109 arg0, class313 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 > 0) {
            field6396 = null;
        }
        field6398++;
        if (class482.field6790 < 100) {
            class469.method2757((byte) 27, arg1, arg0);
        }
        arg1.method617(arg5, arg4, arg5 + arg6, arg4 - -arg3);
        if (class482.field6790 < 100) {
            byte var7 = 20;
            int var8 = arg6 / 2 + arg5;
            int var9 = arg3 / 2 + (arg4 - var7) - 18;
            arg1.method650(arg5, arg4, arg6, arg3, -16777216, 0);
            arg1.method641(var8 - 152, var9, 304, 34, class335.field4876[class163.field2416].getRGB(), 0);
            arg1.method650(var8 - 150, var9 - -2, class482.field6790 * 3, 30, class31.field415[class163.field2416].getRGB(), 0);
            class491.field6928.method1596(0, class456.field6412.method2065(-127, class326.field4711), class311.field4396[class163.field2416].getRGB(), -1, var7 + var9, var8);
            return;
        }
        int var10 = class128.field1666 - ((int) ((float) arg6 / class395.field5614));
        int var11 = (int) ((float) arg3 / class395.field5614) + class220.field3280;
        int var12 = class128.field1666 + ((int) ((float) arg6 / class395.field5614));
        class441.field6110 = class128.field1666 - ((int) ((float) arg6 / class395.field5614));
        int var13 = class220.field3280 - ((int) ((float) arg3 / class395.field5614));
        class128.field1671 = (int) ((float) (arg3 * 2) / class395.field5614);
        class172.field2504 = (int) ((float) (arg6 * 2) / class395.field5614);
        class342.field4975 = class220.field3280 - ((int) ((float) arg3 / class395.field5614));
        class395.method2367(class395.field5638 + var10, var11 - -class395.field5623, class395.field5638 + var12, class395.field5623 + var13, arg5, arg4, arg5 + arg6, arg3 + arg4 - -1);
        class395.method2362(arg1);
        class486 var14 = class395.method2372(arg1);
        class448.method2613(var14, 0, 0, arg1, false);
        if (class303.field4313 > 0) {
            class393.field5582--;
            if (class393.field5582 == 0) {
                class303.field4313--;
                class393.field5582 = 20;
            }
        }
        if (!class79.field971) {
            return;
        }
        int var15 = arg5 + arg6 - 5;
        int var16 = arg3 + arg4 - 8;
        class92.field1166.method1593(-1, 115, var15, var16, 16776960, "Fps:" + class393.field5584);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class92.field1166.method1593(-1, 76, var15, var20, var19, "Mem:" + var18 + "k");
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static void method2671(int arg0) {
        if (arg0 != 25516) {
            method2670((class109) null, (class313) null, -3, -103, 68, -2, 72);
        }
        field6395 = null;
        field6396 = null;
    }
}
