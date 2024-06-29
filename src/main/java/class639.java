import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class639 {

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field9072 = 0;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field9071;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Ljo;")
    public static class303 field9069;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Ljo;")
    public static class303 field9070;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lbfa;Loa;IIII)V")
    public static final void method3601(class335 arg0, class635 arg1, int arg2, int arg3, int arg4, int arg5) {
        field9071++;
        class370 var6 = class536.field7655.method2773(true, arg0.field4373);
        if (var6.field4803 == -1) {
            return;
        }
        int var7;
        if (arg0.field4354) {
            int var8 = arg0.field4341 + arg5;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class458 var9 = var6.method2020(arg0.field4412, var7, 0, arg1);
        if (var9 == null) {
            return;
        }
        int var10 = arg0.field4410;
        int var11 = -63 / ((arg4 - 66) / 45);
        int var12 = arg0.field4322;
        if ((var7 & 0x1) == 1) {
            var12 = arg0.field4410;
            var10 = arg0.field4322;
        }
        int var13 = var9.method418();
        int var14 = var9.method408();
        if (var6.field4807) {
            var13 = var10 * 4;
            var14 = var12 * 4;
        }
        if (var6.field4805 == 0) {
            var9.method2611(arg3, arg2 + 4 - (var12 * 4), var13, var14);
        } else {
            var9.method413(arg3, arg2 + 4 - (var12 * 4), var13, var14, 0, var6.field4805 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
    public static void method3602(boolean arg0) {
        field9070 = null;
        if (arg0) {
            field9069 = null;
        }
        field9069 = null;
    }
}
