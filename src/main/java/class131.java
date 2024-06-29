import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class131 {

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "[B")
    public byte[] field1896 = new byte[256];

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    public int field1898 = 0;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "[B")
    public byte[] field1887 = new byte[4096];

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "[Z")
    public boolean[] field1903 = new boolean[16];

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "[I")
    public int[] field1891 = new int[6];

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "[[I")
    public int[][] field1894 = new int[6][258];

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "[[I")
    public int[][] field1904 = new int[6][258];

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public int field1888 = 0;

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "[B")
    public byte[] field1908 = new byte[18002];

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "[[I")
    public int[][] field1911 = new int[6][258];

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "[[B")
    public byte[][] field1900 = new byte[6][258];

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "[Z")
    public boolean[] field1913 = new boolean[256];

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "[B")
    public byte[] field1918 = new byte[18002];

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "[I")
    public int[] field1912 = new int[257];

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "[I")
    public int[] field1890 = new int[256];

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "[I")
    public int[] field1919 = new int[16];

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public static int field1889 = 0;

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "Ljava/lang/String;")
    public static String field1910 = "wave:";

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "[I")
    public static int[] field1909 = new int[4096];

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "B")
    public byte field1884;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public int field1886;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public int field1892;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public int field1893;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    public int field1895;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public int field1897;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
    public int field1901;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
    public int field1902;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
    public int field1906;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "I")
    public int field1907;

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "I")
    public int field1914;

    @OriginalMember(owner = "client!fm", name = "F", descriptor = "I")
    public int field1915;

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "I")
    public int field1917;

    @OriginalMember(owner = "client!fm", name = "K", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
    public int field1921;

    @OriginalMember(owner = "client!fm", name = "M", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!fm", name = "N", descriptor = "Lph;")
    public static class361 field1923;

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "Ljava/awt/Frame;")
    public static Frame field1905;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "[B")
    public byte[] field1885;

    @OriginalMember(owner = "client!fm", name = "G", descriptor = "[B")
    public byte[] field1916;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lqf;I)Z", line = 29)
    public static final boolean method951(class359 arg0, int arg1) {
        if (arg1 != 26565) {
            field1889 = 63;
        }
        field1920++;
        if (arg0.field5515 == 205) {
            class361.field5721 = 250;
            return true;
        } else {
            return false;
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1909[var0] = class240.method1771(var0, -1806);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 159)
    public static void method952(int arg0) {
        if (arg0 <= 23) {
            method951((class359) null, 18);
        }
        field1910 = null;
        field1923 = null;
        field1905 = null;
        field1909 = null;
    }
}
