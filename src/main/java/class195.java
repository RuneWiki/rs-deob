import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class195 {

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
    public static int field2839 = -1;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "[I")
    public static int[] field2834 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "Lic;")
    public static class491 field2835;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
    public static final void method1311(int arg0) {
        int var1 = 30 / ((arg0 + 68) / 41);
        field2838++;
        if (class348.field5015.method1106()) {
            class348.field5015.method1085(class364.field5570);
            class133.method890((byte) -3);
            class348.field5015.method1071(class364.field5570);
            class348.field5015.method1066(class364.field5570);
        } else {
            class14.method91((byte) 87, class170.field2529);
        }
        class377.method2315(false);
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V")
    public static void method1312(int arg0) {
        field2835 = null;
        field2834 = null;
        if (arg0 != 262143) {
            field2839 = -33;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLwp;)Ljava/lang/String;")
    public static final String method1313(byte arg0, class118 arg1) {
        field2836++;
        if (arg0 <= 105) {
            field2839 = -91;
        }
        return arg1.field1778 == null || arg1.field1778.length() <= 0 ? arg1.field1783 : arg1.field1783 + class423.field6350.method2838(false, class143.field2137) + arg1.field1778;
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)V")
    public static final void method1314(int arg0) {
        if (arg0 <= 112) {
            field2839 = -106;
        }
        for (int var1 = 0; var1 < class299.field4256; var1++) {
            class297 var2 = class333.field4700[var1];
            if (var2.field4227 == 2) {
                if (var2.field4226 == null) {
                    var2.field4234 = Integer.MIN_VALUE;
                } else {
                    class366.field5591.method1794(var2.field4226);
                }
            }
        }
        field2837++;
    }
}
