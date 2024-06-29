import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class161 {

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "[[S")
    public static short[][] field2392 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    public static int field2395 = 0;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field2391 = 2;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "[[I")
    public static int[][] field2398 = new int[128][128];

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public static int field2390 = 0;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)I")
    public static final int method1207(int arg0, int arg1, int arg2) {
        field2396++;
        int var3 = class131.method1023(4, arg0 + 91923, arg2 + 45365, -30) + ((class131.method1023(2, arg0 + 37821, arg2 + 10294, -30) - 128 >> 1) - 128) + (class131.method1023(1, arg0, arg2, -30) + -128 >> 2);
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return arg1 <= 47 ? 65 : var4;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)V")
    public static final void method1208(int arg0, int arg1) {
        if (arg1 > arg0 || arg0 > 2) {
            arg0 = 0;
        }
        field2389++;
        class445.field6399 = arg0;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
    public static void method1209(int arg0) {
        field2392 = null;
        field2398 = null;
        if (arg0 != 2107909889) {
            method1210(true, (byte) -61);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZB)V")
    public static final void method1210(boolean arg0, byte arg1) {
        class127.method996(-92);
        field2394++;
        if (class166.field2472 != 30 && class166.field2472 != 25) {
            return;
        }
        class37.field565++;
        if (arg1 > -106) {
            field2391 = 95;
        }
        if (class37.field565 < 50 && !arg0) {
            return;
        }
        class37.field565 = 0;
        if (!class69.field1029 && class105.field1540 != null) {
            class3.field13++;
            class355.field4828.method1801(210, (byte) -115);
            try {
                class105.field1540.method2737(class355.field4828.field3882, 0, class355.field4828.field3938, -126);
                class355.field4828.field3938 = 0;
            } catch (IOException var2) {
                class69.field1029 = true;
            }
        }
        class127.method996(-89);
    }
}
