import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class87 {

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "[S")
    public static short[] field1722 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "Lob;")
    private static class141 field1730 = class175.method1195(40, "scroll:");

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "Lob;")
    public static class141 field1737 = class175.method1195(40, "Einloggen");

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "Lob;")
    public static class141 field1724 = class175.method1195(40, "hel");

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "Z")
    public static boolean field1739 = false;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "Lob;")
    public static class141 field1729 = class175.method1195(40, "headicons_pk");

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Lob;")
    public static class141 field1721 = field1730;

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "I")
    public static int field1741 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "Lob;")
    public static class141 field1748 = field1730;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public int field1718;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public int field1719;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public int field1720;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public int field1723;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public int field1726;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public int field1727;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public int field1728;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public int field1731;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public int field1732;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public int field1733;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
    public int field1734;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
    public int field1736;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
    public int field1740;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "I")
    public int field1742;

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "I")
    public int field1743;

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "I")
    public int field1744;

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "I")
    public int field1746;

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "I")
    public int field1749;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)Lob;")
    public static final class141 method590(int arg0, int arg1) {
        field1747++;
        return arg1 > arg0 ? class78.method543((byte) 93, arg0) : class168.field3242;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V")
    public static void method591(boolean arg0) {
        field1730 = null;
        field1722 = null;
        field1721 = null;
        if (arg0) {
            method594(95);
        }
        field1724 = null;
        field1729 = null;
        field1737 = null;
        field1748 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)V")
    public static final void method592(int arg0, int arg1, int arg2, int arg3) {
        field1738++;
        if (class30.field580 == arg2 || arg0 == 0 || class39.field786 >= 50 || arg1 == -1) {
            return;
        }
        class178.field3517[class39.field786] = arg1;
        class88.field1767[class39.field786] = arg0;
        class49.field921[class39.field786] = arg3;
        class104.field2012[class39.field786] = null;
        class106.field2043[class39.field786] = 0;
        class39.field786++;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lca;II)V")
    public static final void method593(class22 arg0, int arg1, int arg2) {
        field1725++;
        if (class86.field1709 == null) {
            class46.method305(null, true, arg1, (byte) 0, -18963, 0, 255);
            class168.field3239[arg2] = arg0;
        } else {
            class86.field1709.field2865 = arg2 * 8 + 5;
            int var3 = class86.field1709.method979(1029109968);
            int var4 = class86.field1709.method979(arg1 ^ 0x3D56F82F);
            arg0.method135(var3, (byte) 88, var4);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static final void method594(int arg0) {
        if (arg0 != -18802) {
            field1748 = null;
        }
        class135.field2572.method1385(9946);
        field1745++;
        class125.field2405.method1385(9946);
    }
}
