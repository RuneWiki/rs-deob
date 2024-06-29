import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class422 {

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "[I")
    public static int[] field5735 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
    public static final void method2489(int arg0) {
        field5734++;
        if (arg0 > -74) {
            return;
        }
        for (class245 var1 = (class245) class57.field760.method3188((byte) -100); var1 != null; var1 = (class245) class57.field760.method3182((byte) -73)) {
            if (class49.method270((byte) -123, var1.field3094)) {
                class234.method1481(var1, 6550);
            }
        }
        if (class50.field673 == 1) {
            class24.method150(-125);
            return;
        }
        class433.method2527(true, class81.field1095, class641.field9318, class431.field5868, class423.field5739);
        int var2 = class627.field9137.method856(0, class245.field3102.method2157(class245.field3103, 4074));
        for (class245 var3 = (class245) class57.field760.method3188((byte) -100); var3 != null; var3 = (class245) class57.field760.method3182((byte) -115)) {
            int var4 = class117.method644(var3, (byte) 115);
            if (var4 > var2) {
                var2 = var4;
            }
        }
        class641.field9318 = var2 + 8;
        class81.field1095 = (class641.field9319 ? 26 : 22) + class50.field673 * 16;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V")
    public static void method2490(byte arg0) {
        int var1 = -46 / ((arg0 + 9) / 41);
        field5735 = null;
    }
}
