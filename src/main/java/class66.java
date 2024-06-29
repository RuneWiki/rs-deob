import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class66 {

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field1758 = 0;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field1767 = -1;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "Lke;")
    private static class65 field1772 = class1.method17("go back to the main RuneScape webpage", -112);

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field1766 = 0;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "Lke;")
    public static class65 field1759 = field1772;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "[[[I")
    public static int[][][] field1754 = new int[4][13][13];

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public static int field1773 = 0;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "I")
    public static int field1782 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "Lke;")
    public static class65 field1768 = class1.method17("compass", -114);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public int field1750;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public int field1752;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public int field1753;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public int field1756;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public int field1757;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public int field1760;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public int field1761;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public int field1762;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public int field1763;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public int field1765;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public int field1769;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "I")
    public int field1774;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "I")
    public int field1775;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "I")
    public int field1777;

    @OriginalMember(owner = "client!la", name = "C", descriptor = "I")
    public int field1778;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "I")
    public int field1779;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "I")
    public int field1780;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "I")
    public int field1781;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "[[[B")
    public static byte[][][] field1751;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 35)
    public static void method566(int arg0) {
        field1754 = null;
        field1751 = null;
        if (arg0 > -64) {
            method567(-91, false, null, -114);
        }
        field1772 = null;
        field1759 = null;
        field1768 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ[BI)V", line = 53)
    public static final void method567(int arg0, boolean arg1, byte[] arg2, int arg3) {
        int var4 = 22 % ((-arg3 - 40) / 57);
        field1764++;
        if (class93.field2464 == null) {
            return;
        }
        if (class35.field890 >= 0) {
            class93.field2464.method90((byte) 59);
            class56.field1462 = 0;
            class35.field890 = -1;
            class58.field1593 = null;
            class12.field246 = 20;
        }
        if (arg2 == null) {
            return;
        }
        if (class12.field246 > 0) {
            class93.field2464.method88(arg0, (byte) -92);
            class12.field246 = 0;
        }
        class35.field890 = arg0;
        class93.field2464.method89((byte) -126, arg1, arg0, arg2);
    }
}
