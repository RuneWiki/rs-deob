import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class69 {

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Lmc;")
    private static class75 field1757 = class30.method234(true, "The server is being updated)3");

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field1755 = 500;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Lmc;")
    public static class75 field1758 = class30.method234(true, "@or1@");

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field1766 = -1;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Lmc;")
    public static class75 field1763 = class30.method234(true, "title)3jpg");

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Lmc;")
    public static class75 field1756 = class30.method234(true, "Fps:");

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
    public static int[] field1761 = new int[1000];

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field1762 = 50;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "[I")
    public static int[] field1768 = new int[128];

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "Lmc;")
    public static class75 field1767 = class30.method234(true, "(U2");

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "Lmc;")
    public static class75 field1772 = class30.method234(true, "headicons_pk");

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "Lmc;")
    public static class75 field1773 = field1757;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "J")
    public long field1765;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Llc;")
    public class69 field1760;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "Llc;")
    public class69 field1771;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([Lmc;B)Lmc;", line = 11)
    public static final class75 method586(class75[] arg0, byte arg1) {
        field1753++;
        if (arg1 < 20) {
            method586(null, (byte) 104);
        }
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class129.method1015(arg0.length, 0, arg0, false);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V", line = 32)
    public static final void method587(byte arg0) {
        class63.field1676 = null;
        field1764++;
        class85.field2100 = null;
        class27.field546 = null;
        class28.field594 = null;
        class17.field336 = null;
        class62.field1626 = null;
        class52.field1287 = null;
        class63.field1675 = null;
        class8.field123 = null;
        class108.field2734 = null;
        class56.field1437 = null;
        if (arg0 != -55) {
            method588((byte) -39, -76);
        }
        class35.field827 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)Lub;", line = 58)
    public static final class119 method588(byte arg0, int arg1) {
        field1770++;
        class119 var2 = (class119) class6.field85.method559((long) arg1, -126);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class59.field1482.method436(arg1, 5, 16);
        class119 var4 = new class119();
        if (var3 != null) {
            var4.method951(new class61(var3), arg0 - 9771);
        }
        if (arg0 != -50) {
            field1762 = -72;
        }
        class6.field85.method558((long) arg1, var4, 304);
        return var4;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V", line = 109)
    public final void method589(boolean arg0) {
        field1754++;
        if (this.field1771 == null) {
            return;
        }
        this.field1771.field1760 = this.field1760;
        if (!arg0) {
            method588((byte) 53, -47);
        }
        this.field1760.field1771 = this.field1771;
        this.field1771 = null;
        this.field1760 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Z", line = 131)
    public final boolean method590(int arg0) {
        field1769++;
        if (arg0 != 1000) {
            this.method590(-37);
        }
        return this.field1771 != null;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V", line = 148)
    public static void method591(int arg0) {
        field1761 = null;
        field1758 = null;
        field1756 = null;
        field1768 = null;
        field1773 = null;
        if (arg0 <= 91) {
            field1756 = null;
        }
        field1772 = null;
        field1763 = null;
        field1757 = null;
        field1767 = null;
    }
}
