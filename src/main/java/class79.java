import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class79 extends class12 {

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "Z")
    public boolean field1656 = false;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "Lpe;")
    private static class109 field1654 = class141.method1120("wave:", 0);

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "Lpe;")
    public static class109 field1653 = field1654;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "Lpe;")
    private static class109 field1658 = class141.method1120("Walk here", 0);

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "Z")
    public static boolean field1660 = false;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "Lpe;")
    public static class109 field1662 = field1654;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "Lpe;")
    public static class109 field1664 = class141.method1120("http:)4)4", 0);

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "Lpe;")
    public static class109 field1663 = field1658;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public int field1652;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public int field1655;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Lk;")
    public static final class69 method633(int arg0) {
        field1657++;
        class69 var1 = new class69();
        var1.field1389 = class107.field2246[0];
        var1.field1384 = class92.field1970[0];
        var1.field1386 = class57.field1142[0];
        var1.field1385 = client.field519;
        var1.field1387 = class152.field3342[0];
        var1.field1383 = class61.field1225;
        var1.field1382 = class120.field2668[arg0];
        var1.field1388 = class131.field2879;
        class46.method413(-18078);
        return var1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
    public static final void method634(int arg0, int arg1) {
        class128.field2840 = arg0;
        class157.field3622 = -1;
        class55.field1118 = 1;
        class95.field2036 = arg1;
        class48.field998 = 0;
        class144.field3170 = false;
        field1659++;
        class94.field2023 = null;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
    public static void method635(int arg0) {
        field1658 = null;
        field1662 = null;
        field1653 = null;
        if (arg0 != -1) {
            method636(-56, -112, -12);
        }
        field1654 = null;
        field1663 = null;
        field1664 = null;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)Z")
    public static final boolean method636(int arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            field1661++;
            return (arg2 >> arg0 + 1 & 0x1) != 0;
        } else {
            return true;
        }
    }
}
