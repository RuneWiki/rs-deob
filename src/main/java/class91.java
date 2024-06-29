import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class91 {

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "[I")
    public int[] field1391 = new int[6];

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "[I")
    public int[] field1395 = new int[256];

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "[[I")
    public int[][] field1398 = new int[6][258];

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "[[I")
    public int[][] field1396 = new int[6][258];

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "[B")
    public byte[] field1387 = new byte[18002];

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
    public int field1403 = 0;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "[Z")
    public boolean[] field1385 = new boolean[16];

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "[B")
    public byte[] field1402 = new byte[256];

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "[B")
    public byte[] field1407 = new byte[18002];

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "[I")
    public int[] field1399 = new int[257];

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "[[I")
    public int[][] field1408 = new int[6][258];

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "[I")
    public int[] field1388 = new int[16];

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "[B")
    public byte[] field1410 = new byte[4096];

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "[Z")
    public boolean[] field1409 = new boolean[256];

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "[[B")
    public byte[][] field1397 = new byte[6][258];

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
    public int field1416 = 0;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "Leg;")
    public static class188 field1386 = new class188(64);

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field1419 = new String[5];

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
    public static int field1418 = 0;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "B")
    public byte field1392;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public int field1383;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public int field1384;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public int field1389;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public int field1390;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public int field1394;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "I")
    public int field1401;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
    public int field1404;

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
    public int field1405;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
    public int field1406;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
    public int field1415;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "[B")
    public byte[] field1393;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "[B")
    public byte[] field1414;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 35)
    public static void method626(int arg0) {
        field1419 = null;
        field1386 = null;
        if (arg0 <= 30) {
            method626(-79);
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)Z", line = 120)
    public static final boolean method627(int arg0) {
        if (arg0 != 258) {
            method627(93);
        }
        field1412++;
        return class278.field4286 == 0 ? class89.field1362.method452(-1) : true;
    }
}
