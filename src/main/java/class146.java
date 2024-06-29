import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class146 {

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
    public static int field2454 = -1;

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "Lhga;")
    public static class158 field2455 = new class158(80, 8);

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "Z")
    public static boolean field2456 = true;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
    public int field2453;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "Ljava/lang/String;")
    public String field2451;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIII)Lcw;")
    public static final class165 method1235(int arg0, int arg1, int arg2, int arg3) {
        field2452++;
        class165 var4 = null;
        if (arg1 == 0) {
            var4 = class271.method1917(class420.field6424, (byte) -106, class435.field6614);
            class192.field3174++;
        }
        if (arg1 == 1) {
            var4 = class271.method1917(class420.field6424, (byte) -60, class500.field7338);
            class557.field8054++;
        }
        if (arg2 != 80) {
            method1235(62, 5, 85, 87);
        }
        var4.field2776.method76(false, class612.field8702 + arg3);
        var4.field2776.method25(true, arg0 + class626.field8855);
        var4.field2776.method36((byte) -120, class83.field1024.method1515(82, arg2 - 180) ? 1 : 0);
        class353.field5615 = false;
        class473.field7005 = arg0;
        class43.field599 = arg3;
        class354.method2380(arg2 ^ 0x6C);
        return var4;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V")
    public static void method1236(byte arg0) {
        int var1 = -98 / ((arg0 + 67) / 59);
        field2455 = null;
    }
}
