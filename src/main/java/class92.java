import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public class class92 {

    @OriginalMember(owner = "client!aja", name = "c", descriptor = "Lqe;")
    public static class469 field1282 = new class469(72, 2);

    @OriginalMember(owner = "client!aja", name = "e", descriptor = "I")
    public static int field1284 = -1;

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!aja", name = "d", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!aja", name = "f", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!aja", name = "g", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!aja", name = "h", descriptor = "Lcr;")
    public static class575 field1287;

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(I)V")
    public static void method726(int arg0) {
        field1287 = null;
        if (arg0 == 24290) {
            field1282 = null;
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(BI)V")
    public static final void method727(byte arg0, int arg1) {
        field1281++;
        if (arg0 < 51) {
            return;
        }
        class106 var2 = class671.field9364;
        synchronized (class671.field9364) {
            class671.field9364.method807(arg1, -1);
        }
        class106 var3 = class391.field5893;
        synchronized (class391.field5893) {
            class391.field5893.method807(arg1, -1);
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(Z)V")
    public static final void method728(boolean arg0) {
        field1283++;
        class421.field6283 = null;
        if (class419.field6265 && class756.method4219((byte) 8) != 1) {
            class9.method65(0, (byte) -122, class87.field1246 == 3 || class87.field1246 == 7, class27.method138((byte) -121), 0, class476.method2870((byte) 80));
        }
        int var1 = 0;
        int var2 = 0;
        if (!arg0) {
            field1285 = 19;
        }
        if (class419.field6265) {
            var1 = class210.method1422(true);
            var2 = class407.method2589((byte) -45);
        }
        class10.method72(class501.field7123 + var1, var1, var2 + class510.field7263, var2, -1, var2, (byte) 122, var1, class87.field1249);
        if (class421.field6283 != null) {
            class455.method2788(class510.field7263 + var2, class531.field7570.field566, var2, -1412584499, class754.field10541, class501.field7123 + var1, 100, true, class421.field6283, class181.field2779, var1);
            class421.field6283 = null;
        }
    }
}
