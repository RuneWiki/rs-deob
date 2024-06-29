import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class25 {

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "I")
    public static int field229 = 0;

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "[Lgf;")
    public static class73[] field231 = new class73[14];

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "Ljava/lang/String;")
    public static String field232;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZI)V", line = 3)
    public static final void method106(boolean arg0, int arg1) {
        if (class409.field5750 == null) {
            class419.method2533(1);
        }
        int var2 = -94 % ((arg1 - 59) / 42);
        field230++;
        if (arg0) {
            class409.field5750.method965(12160);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V", line = 22)
    public static void method107(byte arg0) {
        field232 = null;
        field231 = null;
        if (arg0 != 67) {
            field229 = -82;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZB)V", line = 43)
    public static final void method108(boolean arg0, byte arg1) {
        field228++;
        if (arg0 && class46.field483 != null) {
            class710.field9836 = class46.field483.field4427;
        } else {
            class710.field9836 = -1;
        }
        class378.field5431 = null;
        if (arg1 != -112) {
            return;
        }
        class46.field483 = null;
        class94.field1093 = null;
        class130.field1678 = 0;
        class46.method367();
        class46.field490.method1046((byte) 126);
        class748.field10329 = null;
        class531.field7312 = null;
        class602.field8448 = null;
        class732.field10114 = null;
        class83.field1004 = -1;
        class116.field1580 = null;
        class759.field10432 = -1;
        class120.field1595 = null;
        class428.field5976 = null;
        class46.field491 = null;
        class120.field1599 = null;
        class498.field6832 = null;
        if (class46.field485 != null) {
            class46.field485.method513(89);
            class46.field485.method518(64, 128, (byte) 125);
        }
        if (class46.field482 != null) {
            class46.field482.method2917((byte) 69, 64, 64);
        }
        if (class46.field484 != null) {
            class46.field484.method3067(64, (byte) 120);
        }
        class650.field9089.method1965((byte) 116, 64);
    }
}
