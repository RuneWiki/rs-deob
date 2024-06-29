import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class146 {

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "[Z")
    public boolean[] field2027 = new boolean[256];

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "[B")
    public byte[] field2032 = new byte[18002];

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "[Z")
    public boolean[] field2031 = new boolean[16];

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
    public int field2036 = 0;

    @OriginalMember(owner = "client!cu", name = "t", descriptor = "I")
    public int field2044 = 0;

    @OriginalMember(owner = "client!cu", name = "s", descriptor = "[I")
    public int[] field2043 = new int[6];

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "[[I")
    public int[][] field2037 = new int[6][258];

    @OriginalMember(owner = "client!cu", name = "z", descriptor = "[[I")
    public int[][] field2050 = new int[6][258];

    @OriginalMember(owner = "client!cu", name = "w", descriptor = "[I")
    public int[] field2047 = new int[257];

    @OriginalMember(owner = "client!cu", name = "C", descriptor = "[[I")
    public int[][] field2053 = new int[6][258];

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "[B")
    public byte[] field2026 = new byte[18002];

    @OriginalMember(owner = "client!cu", name = "o", descriptor = "[[B")
    public byte[][] field2039 = new byte[6][258];

    @OriginalMember(owner = "client!cu", name = "F", descriptor = "[B")
    public byte[] field2056 = new byte[256];

    @OriginalMember(owner = "client!cu", name = "I", descriptor = "[I")
    public int[] field2059 = new int[256];

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "[B")
    public byte[] field2030 = new byte[4096];

    @OriginalMember(owner = "client!cu", name = "H", descriptor = "[I")
    public int[] field2058 = new int[16];

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "S")
    public static short field2033 = 320;

    @OriginalMember(owner = "client!cu", name = "A", descriptor = "[I")
    public static int[] field2051 = new int[5];

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "Lgk;")
    public static class331 field2038 = new class331("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!cu", name = "r", descriptor = "B")
    public byte field2042;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
    public int field2025;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
    public int field2028;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
    public int field2029;

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
    public int field2034;

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "I")
    public int field2035;

    @OriginalMember(owner = "client!cu", name = "p", descriptor = "I")
    public int field2040;

    @OriginalMember(owner = "client!cu", name = "q", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!cu", name = "u", descriptor = "I")
    public int field2045;

    @OriginalMember(owner = "client!cu", name = "v", descriptor = "I")
    public int field2046;

    @OriginalMember(owner = "client!cu", name = "y", descriptor = "I")
    public int field2049;

    @OriginalMember(owner = "client!cu", name = "B", descriptor = "I")
    public int field2052;

    @OriginalMember(owner = "client!cu", name = "D", descriptor = "I")
    public int field2054;

    @OriginalMember(owner = "client!cu", name = "E", descriptor = "I")
    public int field2055;

    @OriginalMember(owner = "client!cu", name = "J", descriptor = "I")
    public int field2060;

    @OriginalMember(owner = "client!cu", name = "x", descriptor = "[B")
    public byte[] field2048;

    @OriginalMember(owner = "client!cu", name = "G", descriptor = "[B")
    public byte[] field2057;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V", line = 15)
    public static void method1065(byte arg0) {
        field2051 = null;
        field2038 = null;
        if (arg0 < 17) {
            method1065((byte) -42);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILiv;)Lgu;", line = 88)
    public static final class408 method1066(int arg0, class65 arg1) {
        if (arg0 != 18002) {
            method1066(-52, null);
        }
        field2041++;
        return new class408(arg1.method599((byte) 1), arg1.method599((byte) 1), arg1.method599((byte) 1), arg1.method599((byte) 1), arg1.method580((byte) 29), arg1.method577(arg0 - 17747));
    }
}
