import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class418 {

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "[I")
    public int[] field6046 = new int[256];

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "[I")
    public int[] field6044 = new int[257];

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "[[B")
    public byte[][] field6050 = new byte[6][258];

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "[[I")
    public int[][] field6051 = new int[6][258];

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "[[I")
    public int[][] field6053 = new int[6][258];

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "[I")
    public int[] field6033 = new int[6];

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public int field6047 = 0;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "[B")
    public byte[] field6059 = new byte[18002];

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "[Z")
    public boolean[] field6061 = new boolean[16];

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "[B")
    public byte[] field6060 = new byte[256];

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "[B")
    public byte[] field6054 = new byte[18002];

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "[Z")
    public boolean[] field6049 = new boolean[256];

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "[I")
    public int[] field6057 = new int[16];

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "[[I")
    public int[][] field6040 = new int[6][258];

    @OriginalMember(owner = "client!ii", name = "J", descriptor = "I")
    public int field6066 = 0;

    @OriginalMember(owner = "client!ii", name = "L", descriptor = "[B")
    public byte[] field6068 = new byte[4096];

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "J")
    public static long field6062 = 0L;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "[Z")
    public static boolean[] field6063 = new boolean[8];

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "B")
    public byte field6034;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public int field6037;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public int field6038;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public int field6039;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public int field6041;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public int field6042;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public int field6043;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
    public int field6045;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
    public int field6048;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
    public int field6052;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
    public int field6055;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
    public int field6058;

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "I")
    public int field6064;

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "I")
    public int field6065;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "Lkg;")
    public static class223 field6031;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "[B")
    public byte[] field6035;

    @OriginalMember(owner = "client!ii", name = "K", descriptor = "[B")
    public byte[] field6067;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZJ)V", line = 6)
    public static final void method2587(boolean arg0, long arg1) {
        field6056++;
        if (arg0 || arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class200.method1382(arg1 - 1L, -117);
            class200.method1382(1L, -123);
        } else {
            class200.method1382(arg1, -120);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BLjava/lang/String;I)V", line = 30)
    public static final void method2588(byte arg0, String arg1, int arg2) {
        field6036++;
        int var3 = 115 / ((arg0 + 7) / 40);
        int var4 = class208.field2933;
        int[] var5 = class88.field1085;
        boolean var6 = false;
        for (int var7 = 0; var7 < var4; var7++) {
            class380 var8 = class455.field6731[var5[var7]];
            if (var8 != null && class187.field2619 != var8 && var8.field5587 != null && var8.field5587.equalsIgnoreCase(arg1)) {
                if (arg2 == 1) {
                    class63.field830++;
                    class257.method1773((byte) -10, class214.field3029);
                    class159.field2132.method1763(2725, 0);
                    class159.field2132.method1707(var5[var7], -79);
                } else if (arg2 == 4) {
                    class257.method1773((byte) -10, class133.field1831);
                    class150.field2026++;
                    class159.field2132.method1727(-128, 0);
                    class159.field2132.method1707(var5[var7], -100);
                } else if (arg2 == 5) {
                    class72.field934++;
                    class257.method1773((byte) -10, class380.field5569);
                    class159.field2132.method1707(var5[var7], -77);
                    class159.field2132.method1708(-6258, 0);
                } else if (arg2 == 6) {
                    class371.field5429++;
                    class257.method1773((byte) -10, class420.field6081);
                    class159.field2132.method1707(var5[var7], -112);
                    class159.field2132.method1763(2725, 0);
                } else if (arg2 == 7) {
                    class199.field2804++;
                    class257.method1773((byte) -10, class266.field3944);
                    class159.field2132.method1750((byte) 0, var5[var7]);
                    class159.field2132.method1727(-128, 0);
                }
                var6 = true;
                break;
            }
        }
        if (!var6) {
            class328.method2147(128, class170.field2219.method2543(false, class153.field2073) + arg1);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 111)
    public static void method2589(int arg0) {
        field6031 = null;
        if (arg0 != 256) {
            method2589(35);
        }
        field6063 = null;
    }
}
