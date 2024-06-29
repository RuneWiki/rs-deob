import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class95 {

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1367 = "Use";

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Z")
    public static boolean field1368 = false;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Lbf;")
    public static class108 field1370;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static final void method610(byte arg0) {
        field1369++;
        if (!class294.method1973(2) && class249.field3890 != class166.field2364) {
            class126.method812(class166.field2364, class250.field3905.field4053[0], class250.field3905.field4143[0], (byte) -109, class281.field4460, false, class200.field3045, false);
            return;
        }
        if (arg0 <= 105) {
            field1368 = true;
        }
        class81.method517(0);
        if (class166.field2364 != class126.field1775) {
            class182.method1164((byte) 76);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
    public static void method611(byte arg0) {
        field1367 = null;
        int var1 = -78 / ((arg0 + 23) / 60);
        field1370 = null;
    }
}
