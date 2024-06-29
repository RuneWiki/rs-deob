import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class101 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Lck;")
    private static class119 field1527 = class298.method1987((byte) 92, "Sep");

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Lck;")
    private static class119 field1529 = class298.method1987((byte) 29, "Jul");

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Lck;")
    private static class119 field1530 = class298.method1987((byte) 53, "May");

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Lck;")
    private static class119 field1535 = class298.method1987((byte) 39, "Dec");

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "Lck;")
    private static class119 field1536 = class298.method1987((byte) 14, "Aug");

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Lck;")
    private static class119 field1534 = class298.method1987((byte) 22, "Apr");

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Lck;")
    public static class119 field1533 = class298.method1987((byte) 120, "k");

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "Lck;")
    private static class119 field1542 = class298.method1987((byte) 92, "Jan");

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "Lck;")
    private static class119 field1538 = class298.method1987((byte) 94, "Feb");

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "Lck;")
    private static class119 field1540 = class298.method1987((byte) 13, "Mar");

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Lck;")
    private static class119 field1537 = class298.method1987((byte) 69, "Oct");

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "Lck;")
    public static class119 field1543 = class298.method1987((byte) 93, "cookieprefix");

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "Lck;")
    private static class119 field1541 = class298.method1987((byte) 116, "Nov");

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Lck;")
    private static class119 field1539 = class298.method1987((byte) 78, "Jun");

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "[Lck;")
    public static class119[] field1544 = new class119[] { field1542, field1538, field1540, field1534, field1530, field1539, field1529, field1536, field1527, field1537, field1541, field1535 };

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "F")
    public static float field1528;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V", line = 18)
    public static void method671(boolean arg0) {
        field1542 = null;
        field1537 = null;
        field1538 = null;
        field1527 = null;
        field1536 = null;
        field1535 = null;
        field1541 = null;
        field1544 = null;
        field1540 = null;
        field1530 = null;
        field1534 = null;
        field1533 = null;
        if (arg0) {
            field1543 = (class119) null;
        }
        field1529 = null;
        field1539 = null;
        field1543 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIB)V", line = 71)
    public static final void method672(int arg0, int arg1, byte arg2) {
        field1545++;
        class68 var3 = class252.method1622(arg1, (byte) -109);
        int var4 = var3.field1055;
        int var5 = var3.field1053;
        int var6 = var3.field1052;
        if (arg2 >= -79) {
            method672(75, -99, (byte) 67);
        }
        int var7 = class198.field3169[var6 - var5];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class263.method1703(~var8 & class277.field4548[var4] | var8 & arg0 << var5, -93, var4);
    }
}
