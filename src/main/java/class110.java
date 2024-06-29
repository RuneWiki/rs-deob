import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class110 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Lck;")
    public static class119 field1676 = class298.method1987((byte) 76, "montara");

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "[J")
    public static long[] field1680 = new long[32];

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field1682 = -1;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "Lpi;")
    public static class73 field1681 = new class73(64);

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Lck;")
    private static class119 field1685 = class298.method1987((byte) 114, "Members only world");

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Lck;")
    public static class119 field1684 = field1685;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Lsd;")
    public static class278 field1683;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "[Lck;")
    public static class119[] field1677;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)J", line = 21)
    public static final synchronized long method707(byte arg0) {
        field1678++;
        long var1 = System.currentTimeMillis();
        if (var1 < class99.field1508) {
            class84.field1265 += class99.field1508 - var1;
        }
        class99.field1508 = var1;
        if (arg0 <= 65) {
            field1682 = 106;
        }
        return var1 + class84.field1265;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 54)
    public static void method708(int arg0) {
        field1676 = null;
        field1683 = null;
        if (arg0 != 0) {
            method708(31);
        }
        field1684 = null;
        field1685 = null;
        field1681 = null;
        field1680 = null;
        field1677 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILml;)Lml;", line = 79)
    public static final class134 method709(int arg0, class134 arg1) {
        field1679++;
        if (~arg1.field2024 != arg0) {
            return class20.method153(arg0 + 1, arg1.field2024);
        }
        int var2 = arg1.field2120 >>> 16;
        for (class288 var3 = (class288) class206.field3268.method1325(-71); var3 != null; var3 = (class288) class206.field3268.method1332(-78)) {
            if (var3.field4739 == var2) {
                return class20.method153(1, (int) var3.field1218);
            }
        }
        return null;
    }
}
