import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class71 {

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "Lcf;")
    public static class93 field1285 = class147.method1066(")1", -48);

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "Lcf;")
    public static class93 field1286 = class147.method1066("Fertigkeit: ", -48);

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
    public static void method476(byte arg0) {
        int var1 = 92 / ((arg0 + 72) / 35);
        field1286 = null;
        field1285 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB)V")
    public static final void method477(int arg0, byte arg1) {
        field1290++;
        int var2 = 92 / ((arg1 + 59) / 56);
        class60.field1021 = 1000 / arg0;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI)I")
    public static final int method478(byte arg0, int arg1) {
        if (arg0 > -81) {
            method478((byte) -122, -120);
        }
        if (class92.field1625 != null) {
            class92.field1625.method947((byte) 29);
            class92.field1625 = null;
        }
        field1288++;
        class87.field1566++;
        if (class87.field1566 > 4) {
            class188.field3455 = 0;
            class87.field1566 = 0;
            return arg1;
        }
        if (class275.field4930 == class105.field1820) {
            class275.field4930 = class268.field4792;
        } else {
            class275.field4930 = class105.field1820;
        }
        class188.field3455 = 0;
        return -1;
    }
}
