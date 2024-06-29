import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class120 {

    @OriginalMember(owner = "client!r", name = "g", descriptor = "[[I")
    public int[][] field1636 = new int[6][258];

    @OriginalMember(owner = "client!r", name = "s", descriptor = "[Z")
    public boolean[] field1648 = new boolean[256];

    @OriginalMember(owner = "client!r", name = "f", descriptor = "[I")
    public int[] field1635 = new int[16];

    @OriginalMember(owner = "client!r", name = "o", descriptor = "[B")
    public byte[] field1644 = new byte[18002];

    @OriginalMember(owner = "client!r", name = "u", descriptor = "[[I")
    public int[][] field1650 = new int[6][258];

    @OriginalMember(owner = "client!r", name = "i", descriptor = "[B")
    public byte[] field1638 = new byte[256];

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public int field1634 = 0;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "[I")
    public int[] field1647 = new int[257];

    @OriginalMember(owner = "client!r", name = "G", descriptor = "[I")
    public int[] field1661 = new int[256];

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public int field1654 = 0;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "[[I")
    public int[][] field1657 = new int[6][258];

    @OriginalMember(owner = "client!r", name = "z", descriptor = "[[B")
    public byte[][] field1655 = new byte[6][258];

    @OriginalMember(owner = "client!r", name = "I", descriptor = "[B")
    public byte[] field1663 = new byte[18002];

    @OriginalMember(owner = "client!r", name = "D", descriptor = "[Z")
    public boolean[] field1658 = new boolean[16];

    @OriginalMember(owner = "client!r", name = "J", descriptor = "[I")
    public int[] field1664 = new int[6];

    @OriginalMember(owner = "client!r", name = "K", descriptor = "[B")
    public byte[] field1665 = new byte[4096];

    @OriginalMember(owner = "client!r", name = "q", descriptor = "[S")
    public static short[] field1646 = new short[] { 44, 18, 30, 10, 4, 12, 17, 6 };

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Lfg;")
    public static class83 field1630 = new class83("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!r", name = "h", descriptor = "B")
    public byte field1637;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public int field1631;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public int field1633;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public int field1639;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public int field1641;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public int field1642;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public int field1645;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public int field1649;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public int field1651;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public int field1652;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    public int field1656;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    public int field1659;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "I")
    public int field1660;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "I")
    public int field1662;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "[B")
    public byte[] field1632;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "[B")
    public byte[] field1643;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V", line = 11)
    public static final void method759(byte arg0) {
        field1640++;
        if (arg0 < 15) {
            method760(-123);
        }
        for (int var1 = 0; var1 < class84.field1168.length; var1++) {
            for (int var2 = 0; var2 < class84.field1168[var1].length; var2++) {
                class84.field1168[var1][var2] = class514.field7555;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 60)
    public static void method760(int arg0) {
        field1630 = null;
        field1646 = null;
        if (arg0 != 12831) {
            method760(-118);
        }
    }
}
