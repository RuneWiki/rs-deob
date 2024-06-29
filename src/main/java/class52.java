import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class52 {

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Lpe;")
    public static class615 field716;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Z")
    public static boolean field715;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIII)I")
    public static final int method459(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field714++;
        int var5 = arg2 & 0xF;
        int var6 = var5 >= 8 ? arg1 : arg3;
        int var7 = 46 / ((-arg4 - 24) / 45);
        int var8 = var5 < 4 ? arg1 : (var5 == 12 || var5 == 14 ? arg3 : arg0);
        return ((var5 & 0x2) == 0 ? var8 : -var8) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method460(byte arg0) {
        int var1 = 41 / ((-arg0 - 52) / 41);
        field716 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)Z")
    public static final boolean method461(boolean arg0) {
        field717++;
        class424 var1 = class658.field9176.field4702.field5497;
        if (arg0) {
            field716 = null;
        }
        if (var1 == null || class658.field9176.field4702 == var1) {
            return false;
        }
        class57 var2 = (class57) var1;
        if (var2.field776 >= 2000) {
            var2.field776 -= 2000;
        }
        return var2.field776 == 1003;
    }
}
