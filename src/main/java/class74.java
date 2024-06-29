import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class74 {

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "[Z")
    public boolean[] field1503 = new boolean[256];

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "[B")
    public byte[] field1510 = new byte[4096];

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public int field1502 = 0;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "[I")
    public int[] field1508 = new int[16];

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "[[B")
    public byte[][] field1500 = new byte[6][258];

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "[Z")
    public boolean[] field1524 = new boolean[16];

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "[[I")
    public int[][] field1530 = new int[6][258];

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "[[I")
    public int[][] field1531 = new int[6][258];

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "[B")
    public byte[] field1507 = new byte[256];

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "[B")
    public byte[] field1523 = new byte[18002];

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "[I")
    public int[] field1515 = new int[6];

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "[I")
    public int[] field1517 = new int[257];

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "[B")
    public byte[] field1525 = new byte[18002];

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    public int field1532 = 0;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "[[I")
    public int[][] field1526 = new int[6][258];

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "[I")
    public int[] field1501 = new int[256];

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "[[[I")
    public static int[][][] field1511 = new int[4][105][105];

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "Lfb;")
    public static class49 field1504 = new class49(0, 0);

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "Lsd;")
    public static class166 field1534 = class135.method935("Fehler beim Laden Ihres Spielcharakters)3", 0);

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "Lsd;")
    public static class166 field1536 = class135.method935("Sprites geladen)3", 0);

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "I")
    public static volatile int field1535 = 0;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "Lsd;")
    private static class166 field1537 = class135.method935("Close", 0);

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "Lsd;")
    public static class166 field1533 = field1537;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "B")
    public byte field1513;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public int field1496;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public int field1498;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public int field1499;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public int field1506;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public int field1512;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public int field1516;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public int field1519;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
    public int field1520;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    public int field1521;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
    public int field1522;

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "I")
    public int field1527;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    public int field1528;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
    public int field1529;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1497;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "[B")
    public byte[] field1505;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "[B")
    public byte[] field1518;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "[[[B")
    public static byte[][][] field1538;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILsd;)V")
    public static final void method626(int arg0, int arg1, class166 arg2) {
        field1514++;
        class166 var3 = arg2.method1160(90).method1159(-87);
        if (arg0 != -26131) {
            field1533 = null;
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < class6.field131; var5++) {
            class123 var6 = class182.field3451[class53.field967[var5]];
            if (var6 != null && var6.field2412 != null && var6.field2412.method1146((byte) -73, var3)) {
                var4 = true;
                class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) -118, var6.field3521[0], false, var6.field3554[0], 0, 2, class41.field728.field3554[0], 0);
                if (arg1 == 1) {
                    class91.field1793++;
                    class156.field2989.method705(255, (byte) 9);
                    class156.field2989.method409((byte) -51, class53.field967[var5]);
                } else if (arg1 == 4) {
                    class156.field2989.method705(132, (byte) 9);
                    class156.field2989.method399(88, class53.field967[var5]);
                    class195.field3858++;
                } else if (arg1 == 6) {
                    class156.field2989.method705(86, (byte) 9);
                    class156.field2989.method437(class53.field967[var5], 25673);
                    class67.field1358++;
                } else if (arg1 == 7) {
                    class10.field192++;
                    class156.field2989.method705(205, (byte) 9);
                    class156.field2989.method437(class53.field967[var5], arg0 + 51804);
                }
                break;
            }
        }
        if (!var4) {
            class150.method1023((byte) -94, 0, class22.method148(new class166[] { class30.field561, var3 }, 0), class196.field3891);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method627(int arg0) {
        field1538 = null;
        field1504 = null;
        field1534 = null;
        field1497 = null;
        if (arg0 != 0) {
            method627(95);
        }
        field1533 = null;
        field1511 = null;
        field1536 = null;
        field1537 = null;
    }
}
