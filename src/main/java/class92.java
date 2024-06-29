import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class92 {

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "[B")
    public byte[] field1407 = new byte[18002];

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "[[I")
    public int[][] field1416 = new int[6][258];

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
    public int field1424 = 0;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public int field1402 = 0;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "[Z")
    public boolean[] field1420 = new boolean[256];

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "[B")
    public byte[] field1429 = new byte[256];

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "[[B")
    public byte[][] field1415 = new byte[6][258];

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "[I")
    public int[] field1425 = new int[256];

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "[I")
    public int[] field1412 = new int[257];

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "[I")
    public int[] field1422 = new int[16];

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "[B")
    public byte[] field1439 = new byte[18002];

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "[[I")
    public int[][] field1411 = new int[6][258];

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "[[I")
    public int[][] field1427 = new int[6][258];

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "[I")
    public int[] field1409 = new int[6];

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "[B")
    public byte[] field1430 = new byte[4096];

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "[Z")
    public boolean[] field1433 = new boolean[16];

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1403 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "B")
    public byte field1426;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public int field1401;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public int field1404;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public int field1406;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public int field1414;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public int field1419;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public int field1421;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
    public int field1428;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
    public int field1431;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
    public int field1436;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
    public int field1437;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
    public int field1438;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
    public int field1440;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "Lhc;")
    public static class229 field1434;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "[B")
    public byte[] field1423;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "[B")
    public byte[] field1432;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "[[[B")
    public static byte[][][] field1435;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)I")
    public static final int method615(int arg0, int arg1) {
        field1417++;
        if (arg0 != 258) {
            field1403 = null;
        }
        if (arg1 > 0) {
            return 1;
        } else if (arg1 < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
    public static void method616(boolean arg0) {
        if (arg0) {
            field1403 = null;
            field1435 = null;
            field1434 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(Z)V")
    public static final void method617(boolean arg0) {
        if (arg0) {
            method618((byte) 18, -28, -64);
        }
        field1410++;
        class136.field1985.method1430(-1);
        class125.field1858.method1430(-1);
        class53.field729.method1430(-1);
        class149.field2212.method1430(-1);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BII)I")
    public static final int method618(byte arg0, int arg1, int arg2) {
        int var3 = -34 / ((-arg0 - 60) / 46);
        int var4 = 1;
        field1408++;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var4 = arg2 * var4;
            }
            arg1 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg1 == 1) {
            return arg2 * var4;
        } else {
            return var4;
        }
    }
}
