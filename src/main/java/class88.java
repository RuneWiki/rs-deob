import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class88 {

    @OriginalMember(owner = "client!j", name = "g", descriptor = "Ljd;")
    public static class92 field1732 = class202.method1325((byte) 90, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!j", name = "i", descriptor = "Ljd;")
    private static class92 field1734 = class202.method1325((byte) 90, "Jun");

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field1730 = 0;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "J")
    public static long field1738 = 0L;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "Ljd;")
    public static class92 field1735 = class202.method1325((byte) 90, "Cabbage");

    @OriginalMember(owner = "client!j", name = "k", descriptor = "Ljd;")
    private static class92 field1736 = class202.method1325((byte) 90, "Dec");

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Ljd;")
    private static class92 field1740 = class202.method1325((byte) 90, "Sep");

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Ljd;")
    private static class92 field1729 = class202.method1325((byte) 90, "Jul");

    @OriginalMember(owner = "client!j", name = "p", descriptor = "Ljd;")
    private static class92 field1741 = class202.method1325((byte) 90, "Mar");

    @OriginalMember(owner = "client!j", name = "s", descriptor = "Ljd;")
    private static class92 field1744 = class202.method1325((byte) 90, "Oct");

    @OriginalMember(owner = "client!j", name = "t", descriptor = "[I")
    public static int[] field1745 = new int[5];

    @OriginalMember(owner = "client!j", name = "l", descriptor = "Ljd;")
    private static class92 field1737 = class202.method1325((byte) 90, "Nov");

    @OriginalMember(owner = "client!j", name = "q", descriptor = "Ljd;")
    private static class92 field1742 = class202.method1325((byte) 90, "Apr");

    @OriginalMember(owner = "client!j", name = "n", descriptor = "Ljd;")
    private static class92 field1739 = class202.method1325((byte) 90, "May");

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Ljd;")
    private static class92 field1733 = class202.method1325((byte) 90, "Feb");

    @OriginalMember(owner = "client!j", name = "u", descriptor = "Ljd;")
    private static class92 field1746 = class202.method1325((byte) 90, "Aug");

    @OriginalMember(owner = "client!j", name = "f", descriptor = "Ljd;")
    private static class92 field1731 = class202.method1325((byte) 90, "Jan");

    @OriginalMember(owner = "client!j", name = "c", descriptor = "[Ljd;")
    public static class92[] field1728 = new class92[] { field1731, field1733, field1741, field1742, field1739, field1734, field1729, field1746, field1740, field1744, field1737, field1736 };

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "[S")
    public static short[] field1743;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)I")
    public static final int method587(int arg0) {
        int var1 = class118.method804(class132.field2645, class81.field1639, class151.field2991, 0);
        field1727++;
        if (var1 - class124.field2511 >= 800 || (class59.field1239[class81.field1639][class132.field2645 >> 7][class151.field2991 >> 7] & 0x4) == 0) {
            if (arg0 != -30169) {
                method588(true);
            }
            return 3;
        } else {
            return class81.field1639;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
    public static void method588(boolean arg0) {
        if (arg0) {
            return;
        }
        field1729 = null;
        field1745 = null;
        field1746 = null;
        field1728 = null;
        field1735 = null;
        field1740 = null;
        field1731 = null;
        field1736 = null;
        field1741 = null;
        field1742 = null;
        field1734 = null;
        field1743 = null;
        field1744 = null;
        field1733 = null;
        field1739 = null;
        field1732 = null;
        field1737 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method589(int arg0, int arg1, int arg2, long arg3) {
        class43 var5 = class31.field698[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field963 != null && var5.field963.field1056 == arg3) {
            return true;
        } else if (var5.field953 != null && var5.field953.field2759 == arg3) {
            return true;
        } else if (var5.field969 != null && var5.field969.field632 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field979; var6++) {
                if (var5.field966[var6].field3495 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }
}
