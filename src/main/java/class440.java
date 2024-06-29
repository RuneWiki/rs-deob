import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class440 {

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Z")
    public static boolean field6550 = false;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field6552;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Lhu;")
    public static class469 field6549;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V", line = 7)
    public static final void method2660(byte arg0) {
        field6552++;
        class75.field1006.field1292 = 0;
        class486.field7134.field1292 = 0;
        class339.field5361 = null;
        class434.field6453 = null;
        class375.field5739 = 0;
        class156.field2261 = 0;
        class338.field5357 = null;
        class329.field5109 = null;
        class461.field6755 = 0;
        class461.method2767(21492);
        class75.method494(-1);
        for (int var1 = 0; var1 < 2048; var1++) {
            class439.field6539[var1] = null;
        }
        class339.field5365 = null;
        if (arg0 <= 55) {
            return;
        }
        for (int var2 = 0; var2 < class151.field2174.length; var2++) {
            class194 var4 = class151.field2174[var2];
            if (var4 != null) {
                var4.field5257 = -1;
            }
        }
        class55.method374(-31697);
        class432.field6409 = 1;
        class524.method3106(30, (byte) 44);
        for (int var3 = 0; var3 < 100; var3++) {
            class326.field5002[var3] = true;
        }
        class240.method1612(122);
        class295.field4365 = null;
        class381.field5814 = 0L;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V", line = 62)
    public static void method2661(byte arg0) {
        field6549 = null;
        if (arg0 != 72) {
            field6549 = null;
        }
    }
}
