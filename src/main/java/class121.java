import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class121 {

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field1741 = 0;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static final void method788(int arg0) {
        field1737++;
        class272.field4417++;
        class150.field2218.method445(255, arg0 ^ 0x594);
        if (arg0 != 1427) {
            field1741 = 117;
        }
        for (class104 var1 = (class104) class115.field1674.method1065((byte) -59); var1 != null; var1 = (class104) class115.field1674.method1066(arg0 ^ 0xFFFFFA15)) {
            if (var1.field1517 == 0) {
                class74.method514(true, (byte) 105, var1);
            }
        }
        if (class137.field1969 != null) {
            class247.method1761(class137.field1969, (byte) -95);
            class137.field1969 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public static final void method789(int arg0) {
        class161.field2407.method1511((byte) 114);
        class248.field4032.method1511((byte) 90);
        if (arg0 < 126) {
            method789(111);
        }
        class198.field3137.method1511((byte) 117);
        class11.field172.method1511((byte) 89);
        field1739++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)V")
    public static final void method790(int arg0, byte arg1) {
        class23.field291.method1514(arg0, (byte) -55);
        if (arg1 < 90) {
            field1741 = -108;
        }
        field1740++;
        class38.field453.method1514(arg0, (byte) -55);
    }
}
