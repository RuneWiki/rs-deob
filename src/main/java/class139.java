import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class139 {

    @OriginalMember(owner = "client!bs", name = "u", descriptor = "[[I")
    public int[][] field1600 = new int[6][258];

    @OriginalMember(owner = "client!bs", name = "w", descriptor = "I")
    public int field1602 = 0;

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "[I")
    public int[] field1592 = new int[6];

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "[I")
    public int[] field1582 = new int[256];

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "[B")
    public byte[] field1583 = new byte[18002];

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "[I")
    public int[] field1584 = new int[16];

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "[[I")
    public int[][] field1585 = new int[6][258];

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "[B")
    public byte[] field1589 = new byte[18002];

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "[I")
    public int[] field1581 = new int[257];

    @OriginalMember(owner = "client!bs", name = "z", descriptor = "[Z")
    public boolean[] field1605 = new boolean[16];

    @OriginalMember(owner = "client!bs", name = "x", descriptor = "I")
    public int field1603 = 0;

    @OriginalMember(owner = "client!bs", name = "q", descriptor = "[[B")
    public byte[][] field1596 = new byte[6][258];

    @OriginalMember(owner = "client!bs", name = "G", descriptor = "[[I")
    public int[][] field1612 = new int[6][258];

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "[B")
    public byte[] field1587 = new byte[256];

    @OriginalMember(owner = "client!bs", name = "H", descriptor = "[B")
    public byte[] field1613 = new byte[4096];

    @OriginalMember(owner = "client!bs", name = "L", descriptor = "[Z")
    public boolean[] field1616 = new boolean[256];

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
    public static int field1590 = 0;

    @OriginalMember(owner = "client!bs", name = "K", descriptor = "Z")
    public static boolean field1615 = false;

    @OriginalMember(owner = "client!bs", name = "p", descriptor = "B")
    public byte field1595;

    @OriginalMember(owner = "client!bs", name = "o", descriptor = "F")
    public static float field1594;

    @OriginalMember(owner = "client!bs", name = "D", descriptor = "F")
    public static float field1609;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public int field1580;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
    public int field1586;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "I")
    public int field1588;

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "I")
    public int field1591;

    @OriginalMember(owner = "client!bs", name = "n", descriptor = "I")
    public int field1593;

    @OriginalMember(owner = "client!bs", name = "r", descriptor = "I")
    public int field1597;

    @OriginalMember(owner = "client!bs", name = "s", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!bs", name = "t", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!bs", name = "v", descriptor = "I")
    public int field1601;

    @OriginalMember(owner = "client!bs", name = "A", descriptor = "I")
    public int field1606;

    @OriginalMember(owner = "client!bs", name = "B", descriptor = "I")
    public int field1607;

    @OriginalMember(owner = "client!bs", name = "C", descriptor = "I")
    public int field1608;

    @OriginalMember(owner = "client!bs", name = "E", descriptor = "I")
    public int field1610;

    @OriginalMember(owner = "client!bs", name = "F", descriptor = "I")
    public int field1611;

    @OriginalMember(owner = "client!bs", name = "M", descriptor = "I")
    public int field1617;

    @OriginalMember(owner = "client!bs", name = "y", descriptor = "[B")
    public byte[] field1604;

    @OriginalMember(owner = "client!bs", name = "J", descriptor = "[B")
    public byte[] field1614;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(BLjava/awt/Component;)Lug;")
    public static final class287 method893(byte arg0, Component arg1) {
        field1599++;
        if (arg0 >= -111) {
            method893((byte) -52, (Component) null);
        }
        return new class105(arg1);
    }
}
