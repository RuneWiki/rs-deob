import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class185 {

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "[I")
    public static int[] field2765 = new int[256];

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "[I")
    public static int[] field2763 = new int[2500];

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field2769 = 0;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "Z")
    public static boolean field2762 = false;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "Lka;")
    public static class200 field2766;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILlm;)V", line = 12)
    public static final void method1273(int arg0, class210 arg1) {
        field2768++;
        if (class17.field209) {
            return;
        }
        if (class117.field1817) {
            class308.method2130();
        } else {
            class46.method302();
        }
        class163.field2453 = class258.method1758(class305.field4648, -2001, arg1);
        int var2 = class251.field3747;
        int var3 = var2 * 956 / 503;
        class163.field2453.method949((class136.field2071 - var3) / 2, arg0, var3, var2);
        class97.field1457 = class298.method2079(0, class197.field2964, arg1);
        class97.field1457.method396(class136.field2071 / 2 - class97.field1457.field2350 / 2, 18);
        class17.field209 = true;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V", line = 45)
    public static void method1274(boolean arg0) {
        field2765 = null;
        if (arg0) {
            method1274(true);
        }
        field2763 = null;
        field2766 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)I", line = 58)
    public static final int method1275(int arg0, int arg1) {
        field2767++;
        return arg1 == 2500 ? arg0 >>> 7 : 88;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB)V", line = 78)
    public static final void method1276(int arg0, byte arg1) {
        if (arg1 >= -81) {
            field2766 = (class200) null;
        }
        class223 var2 = (class223) class295.field4520.method1320((long) arg0, 13002);
        field2764++;
        if (var2 != null) {
            var2.method714(-56);
        }
    }
}
