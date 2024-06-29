import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class136 {

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "[[I")
    public int[][] field1841 = new int[6][258];

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "[Z")
    public boolean[] field1845 = new boolean[16];

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "I")
    public int field1851 = 0;

    @OriginalMember(owner = "client!gp", name = "u", descriptor = "[I")
    public int[] field1860 = new int[256];

    @OriginalMember(owner = "client!gp", name = "B", descriptor = "[B")
    public byte[] field1867 = new byte[256];

    @OriginalMember(owner = "client!gp", name = "F", descriptor = "[B")
    public byte[] field1871 = new byte[18002];

    @OriginalMember(owner = "client!gp", name = "t", descriptor = "[I")
    public int[] field1859 = new int[6];

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
    public int field1850 = 0;

    @OriginalMember(owner = "client!gp", name = "x", descriptor = "[Z")
    public boolean[] field1863 = new boolean[256];

    @OriginalMember(owner = "client!gp", name = "A", descriptor = "[[B")
    public byte[][] field1866 = new byte[6][258];

    @OriginalMember(owner = "client!gp", name = "E", descriptor = "[[I")
    public int[][] field1870 = new int[6][258];

    @OriginalMember(owner = "client!gp", name = "H", descriptor = "[[I")
    public int[][] field1873 = new int[6][258];

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "[B")
    public byte[] field1840 = new byte[18002];

    @OriginalMember(owner = "client!gp", name = "J", descriptor = "[I")
    public int[] field1875 = new int[16];

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "[I")
    public int[] field1847 = new int[257];

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "[B")
    public byte[] field1846 = new byte[4096];

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "Lru;")
    public static class177 field1848 = new class177(8);

    @OriginalMember(owner = "client!gp", name = "L", descriptor = "I")
    public static int field1877 = -1;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "B")
    public byte field1843;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    public int field1842;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    public int field1844;

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "I")
    public int field1849;

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "I")
    public int field1852;

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
    public int field1853;

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
    public int field1855;

    @OriginalMember(owner = "client!gp", name = "q", descriptor = "I")
    public int field1856;

    @OriginalMember(owner = "client!gp", name = "s", descriptor = "I")
    public int field1858;

    @OriginalMember(owner = "client!gp", name = "v", descriptor = "I")
    public int field1861;

    @OriginalMember(owner = "client!gp", name = "w", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!gp", name = "y", descriptor = "I")
    public int field1864;

    @OriginalMember(owner = "client!gp", name = "C", descriptor = "I")
    public int field1868;

    @OriginalMember(owner = "client!gp", name = "D", descriptor = "I")
    public int field1869;

    @OriginalMember(owner = "client!gp", name = "G", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!gp", name = "I", descriptor = "I")
    public int field1874;

    @OriginalMember(owner = "client!gp", name = "K", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!gp", name = "r", descriptor = "[B")
    public byte[] field1857;

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "[B")
    public byte[] field1865;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIII)V")
    public static final void method832(int arg0, int arg1, int arg2, int arg3) {
        class409 var4 = class217.field3699[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class304 var5 = var4.field6189;
        class304 var6 = var4.field6192;
        if (var5 != null) {
            var5.field4781 = var5.field4781 * arg3 / (0x10 << class56.field908 - 7);
            var5.field4777 = var5.field4777 * arg3 / (0x10 << class56.field908 - 7);
        }
        if (var6 != null) {
            var6.field4781 = var6.field4781 * arg3 / (0x10 << class56.field908 - 7);
            var6.field4777 = var6.field4777 * arg3 / (0x10 << class56.field908 - 7);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)V")
    public static void method833(byte arg0) {
        field1848 = null;
        if (arg0 != -48) {
            method832(13, -40, 108, -20);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(BII)Z")
    public static final boolean method834(byte arg0, int arg1, int arg2) {
        field1862++;
        if (arg0 == -54) {
            return (arg1 & 0x800) != 0;
        } else {
            return false;
        }
    }
}
