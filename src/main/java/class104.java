import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class104 {

    @OriginalMember(owner = "client!p", name = "f", descriptor = "[B")
    public byte[] field1827 = new byte[4096];

    @OriginalMember(owner = "client!p", name = "d", descriptor = "[[I")
    public int[][] field1825 = new int[6][258];

    @OriginalMember(owner = "client!p", name = "i", descriptor = "[[I")
    public int[][] field1830 = new int[6][258];

    @OriginalMember(owner = "client!p", name = "h", descriptor = "[Z")
    public boolean[] field1829 = new boolean[16];

    @OriginalMember(owner = "client!p", name = "s", descriptor = "[I")
    public int[] field1840 = new int[16];

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public int field1845 = 0;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "[B")
    public byte[] field1842 = new byte[256];

    @OriginalMember(owner = "client!p", name = "k", descriptor = "[B")
    public byte[] field1832 = new byte[18002];

    @OriginalMember(owner = "client!p", name = "n", descriptor = "[I")
    public int[] field1835 = new int[257];

    @OriginalMember(owner = "client!p", name = "p", descriptor = "[I")
    public int[] field1837 = new int[256];

    @OriginalMember(owner = "client!p", name = "B", descriptor = "[[I")
    public int[][] field1849 = new int[6][258];

    @OriginalMember(owner = "client!p", name = "C", descriptor = "I")
    public int field1850 = 0;

    @OriginalMember(owner = "client!p", name = "D", descriptor = "[Z")
    public boolean[] field1851 = new boolean[256];

    @OriginalMember(owner = "client!p", name = "H", descriptor = "[I")
    public int[] field1855 = new int[6];

    @OriginalMember(owner = "client!p", name = "F", descriptor = "[[B")
    public byte[][] field1853 = new byte[6][258];

    @OriginalMember(owner = "client!p", name = "A", descriptor = "[B")
    public byte[] field1848 = new byte[18002];

    @OriginalMember(owner = "client!p", name = "g", descriptor = "[C")
    public static char[] field1828 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field1822 = 0;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "[I")
    public static int[] field1831 = new int[25];

    @OriginalMember(owner = "client!p", name = "q", descriptor = "B")
    public byte field1838;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public int field1824;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public int field1826;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public int field1833;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public int field1834;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public int field1836;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public int field1839;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    public int field1841;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "I")
    public int field1843;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "I")
    public int field1846;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "I")
    public int field1847;

    @OriginalMember(owner = "client!p", name = "E", descriptor = "I")
    public int field1852;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "I")
    public int field1854;

    @OriginalMember(owner = "client!p", name = "I", descriptor = "I")
    public int field1856;

    @OriginalMember(owner = "client!p", name = "J", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "[B")
    public byte[] field1823;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "[B")
    public byte[] field1844;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public static void method707(int arg0) {
        if (arg0 >= -105) {
            field1831 = null;
        }
        field1828 = null;
        field1831 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZB)C")
    public static final char method708(boolean arg0, byte arg1) {
        field1857++;
        int var2 = arg1 & 0xFF;
        if (!arg0) {
            return (char) 65523;
        } else if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (var2 >= 128 && var2 < 160) {
                char var3 = field1828[var2 - 128];
                if (var3 == '\u0000') {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        }
    }
}
