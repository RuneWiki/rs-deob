import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class31 {

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "[I")
    public static int[] field373 = new int[2];

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Lqe;")
    public static class168 field370 = class66.method448("Hidden)2use", -108);

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field377 = 0;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field378 = 99;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lrd;")
    public static class207 field375;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZ)V")
    public static final void method202(int arg0, boolean arg1) {
        class243.field4222 = false;
        field376++;
        class233.field3968 = -1;
        class161.field2764 = 0;
        if (!arg1) {
            method203(true);
        }
        class177.field3120 = null;
        class135.field2361 = 1;
        class96.field1514 = arg0;
        class221.field3804 = -1;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
    public static final void method203(boolean arg0) {
        class204 var1 = class62.field845;
        synchronized (class62.field845) {
            class89.field1384 = class145.field2535;
            class146.field2550 = class202.field3514;
            if (!arg0) {
                method202(-80, true);
            }
            class123.field2026++;
            class161.field2765 = class249.field4306;
            class200.field3454 = class66.field932;
            class198.field3422 = class254.field4394;
            class9.field97 = class105.field1689;
            class182.field3240 = class66.field931;
            class66.field932 = 0;
        }
        field371++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static void method204(byte arg0) {
        field370 = null;
        field375 = null;
        field373 = null;
        if (arg0 <= 65) {
            method203(true);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)I")
    public static final int method205(int arg0, int arg1) {
        field372++;
        if (arg1 < 18) {
            return -34;
        } else {
            int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
            int var3 = arg0 * 6 - 61440;
            int var4 = (arg0 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        }
    }
}
