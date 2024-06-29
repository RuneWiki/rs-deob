import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class75 {

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "[I")
    public int[] field1613 = new int[16];

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public int field1623 = 0;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "[Z")
    public boolean[] field1619 = new boolean[16];

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "[I")
    public int[] field1633 = new int[6];

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "[B")
    public byte[] field1627 = new byte[4096];

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "[[I")
    public int[][] field1646 = new int[6][258];

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "[I")
    public int[] field1629 = new int[257];

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "[I")
    public int[] field1642 = new int[256];

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "[B")
    public byte[] field1644 = new byte[18002];

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "[B")
    public byte[] field1636 = new byte[18002];

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "[Z")
    public boolean[] field1609 = new boolean[256];

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public int field1618 = 0;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "[B")
    public byte[] field1616 = new byte[256];

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "[[I")
    public int[][] field1651 = new int[6][258];

    @OriginalMember(owner = "client!kf", name = "ab", descriptor = "[[B")
    public byte[][] field1658 = new byte[6][258];

    @OriginalMember(owner = "client!kf", name = "Y", descriptor = "[[I")
    public int[][] field1656 = new int[6][258];

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Loa;")
    private static class98 field1615 = class38.method349(255, "To play on this world move to a free area first");

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Loa;")
    private static class98 field1608 = class38.method349(255, "Click to continue");

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Loa;")
    private static class98 field1607 = class38.method349(255, "Location");

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Loa;")
    public static class98 field1610 = field1608;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "Loa;")
    public static class98 field1640 = field1615;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Loa;")
    public static class98 field1612 = class38.method349(255, "");

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "I")
    public static int field1650 = 0;

    @OriginalMember(owner = "client!kf", name = "U", descriptor = "Loa;")
    public static class98 field1652 = class38.method349(255, " (X");

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "Loa;")
    private static class98 field1621 = class38.method349(255, "Report abuse");

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "Loa;")
    public static class98 field1637 = class38.method349(255, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "Loa;")
    public static class98 field1630 = field1621;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "Loa;")
    public static class98 field1641 = class38.method349(255, "Diese Betatest)2Welt ist nur f-Ur eingeladene");

    @OriginalMember(owner = "client!kf", name = "X", descriptor = "[[I")
    public static int[][] field1655 = new int[5][5000];

    @OriginalMember(owner = "client!kf", name = "Z", descriptor = "Loa;")
    public static class98 field1657 = field1607;

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "B")
    public byte field1645;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public int field1614;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public int field1620;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public int field1622;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public int field1625;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
    public int field1638;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
    public int field1639;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    public int field1643;

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "I")
    public int field1648;

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "I")
    public int field1649;

    @OriginalMember(owner = "client!kf", name = "V", descriptor = "I")
    public int field1653;

    @OriginalMember(owner = "client!kf", name = "W", descriptor = "I")
    public int field1654;

    @OriginalMember(owner = "client!kf", name = "bb", descriptor = "I")
    public int field1659;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "[B")
    public byte[] field1635;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "[B")
    public byte[] field1647;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ltb;ZILgb;Ltb;)V")
    public static final void method616(class130 arg0, boolean arg1, int arg2, class45 arg3, class130 arg4) {
        class108.field2445 = arg0;
        class32.field780 = arg4;
        class129.field2964 = arg1;
        class113.field2547 = class108.field2445.method1062(arg2, (byte) 59);
        class120.field2694 = arg3;
        field1628++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method617(int arg0, String arg1, Throwable arg2) {
        field1606++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class5.method26(arg2, 32);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace((char) arg0, '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class106.field2433.field1492 != null) {
                class93 var8 = class106.field2433.method587(new URL(class106.field2433.field1492.getCodeBase(), "clienterror.ws?c=" + class6.field112 + "&u=" + class112.field2503 + "&v1=" + class72.field1503 + "&v2=" + class72.field1500 + "&e=" + var7), -17597);
                while (var8.field2134 == 0) {
                    class82.method691(1L, (byte) -120);
                }
                if (var8.field2134 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field2130;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)I")
    public static final int method618(int arg0, int arg1, int arg2) {
        field1631++;
        int var3 = arg0 + arg2 * 57;
        if (arg1 < 80) {
            method618(-48, -89, -1);
        }
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)I")
    public static final int method619(int arg0) {
        field1634++;
        if (arg0 > -124) {
            method618(-83, -116, 54);
        }
        return class6.field106++;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public static void method620(int arg0) {
        field1652 = null;
        field1630 = null;
        field1641 = null;
        field1607 = null;
        field1655 = null;
        field1621 = null;
        field1615 = null;
        field1657 = null;
        field1608 = null;
        field1637 = null;
        if (arg0 <= 63) {
            method617(-22, null, null);
        }
        field1612 = null;
        field1610 = null;
        field1640 = null;
    }
}
