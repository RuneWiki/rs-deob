import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class67 {

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "Lsg;")
    public static class30 field1467 = class167.method1221((byte) 33, "<col=ffff00>");

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field1471 = 0;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "[J")
    public static long[] field1473 = new long[32];

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Lsg;")
    private static class30 field1466 = class167.method1221((byte) 33, "Loaded sprites");

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "Lsg;")
    public static class30 field1468 = field1466;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static final void method603(byte arg0) {
        if (class149.field2843 != null) {
            class149.field2843.method490(256);
        }
        field1469++;
        if (arg0 != -59) {
            method604(-23);
        }
        if (class11.field217 != null) {
            class11.field217.method490(256);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static void method604(int arg0) {
        if (arg0 >= 22) {
            field1468 = null;
            field1467 = null;
            field1466 = null;
            field1473 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)Lnh;")
    public static final class94 method605(int arg0, byte arg1) {
        field1474++;
        class94 var2 = (class94) class69.field1525.method1644((byte) -86, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class150.field2856.method1115(arg0, (byte) -75, 3);
        int var4 = 34 / ((arg1 + 17) / 49);
        class94 var5 = new class94();
        if (var3 != null) {
            var5.method762(10, new class8(var3));
        }
        class69.field1525.method1646((long) arg0, var5, -110);
        return var5;
    }
}
