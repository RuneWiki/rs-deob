import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class110 {

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public int field1632 = 0;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public int field1631 = -1;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public int field1630 = -1;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public int field1637 = -1;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public int field1650 = -1;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public int field1636 = -1;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public int field1647 = -1;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
    public int field1655 = -1;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public int field1645 = 0;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public int field1634 = -1;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    public int field1651 = -1;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    public int field1649 = 0;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public int field1642 = -1;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
    public int field1658 = -1;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public int field1641 = 0;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public int field1646 = -1;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
    public int field1657 = 0;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
    public int field1653 = -1;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "I")
    public int field1664 = 0;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public int field1640 = -1;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "I")
    public int field1661 = -1;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
    public int field1660 = -1;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
    public int field1665 = 0;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public int field1633 = 0;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public int field1643 = -1;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "I")
    public int field1663 = 0;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
    public int field1652 = -1;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "I")
    public int field1667 = 0;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "I")
    public int field1669 = -1;

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "I")
    public int field1668 = -1;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "I")
    public int field1670 = -1;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public int field1648 = -1;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1644 = "Allocating memory";

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "S")
    public static short field1666 = 32767;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "[[I")
    public int[][] field1659;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public final void method794(int arg0) {
        if (arg0 != 0) {
            this.field1665 = 34;
        }
        field1639++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method795(int arg0, String arg1) {
        field1654++;
        for (int var2 = 0; var2 < class105.field1556.length; var2++) {
            if (class105.field1556[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return arg0 > -93 ? -103 : -1;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
    public static void method796(int arg0) {
        field1644 = null;
        if (arg0 >= -30) {
            method795(-7, (String) null);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IILca;)V")
    private final void method797(int arg0, int arg1, class54 arg2) {
        if (arg0 != -3) {
            return;
        }
        if (arg1 == 1) {
            this.field1651 = arg2.method423(-98);
            this.field1631 = arg2.method423(-114);
            if (this.field1651 == 65535) {
                this.field1651 = -1;
            }
            if (this.field1631 == 65535) {
                this.field1631 = -1;
            }
        } else if (arg1 == 2) {
            this.field1650 = arg2.method423(82);
        } else if (arg1 == 3) {
            this.field1658 = arg2.method423(-86);
        } else if (arg1 == 4) {
            this.field1652 = arg2.method423(83);
        } else if (arg1 == 5) {
            this.field1670 = arg2.method423(-113);
        } else if (arg1 == 6) {
            this.field1636 = arg2.method423(-123);
        } else if (arg1 == 7) {
            this.field1634 = arg2.method423(arg0 - 115);
        } else if (arg1 == 8) {
            this.field1646 = arg2.method423(arg0 ^ 0xFFFFFF97);
        } else if (arg1 == 9) {
            this.field1642 = arg2.method423(118);
        } else if (arg1 == 26) {
            this.field1645 = (short) (arg2.method407(255) * 4);
            this.field1641 = (short) (arg2.method407(255) * 4);
        } else if (arg1 == 27) {
            if (this.field1659 == null) {
                this.field1659 = new int[12][];
            }
            int var4 = arg2.method407(255);
            this.field1659[var4] = new int[6];
            for (int var5 = 0; var5 < 6; var5++) {
                this.field1659[var4][var5] = arg2.method457((byte) 76);
            }
        } else if (arg1 == 29) {
            this.field1657 = arg2.method407(255);
        } else if (arg1 == 30) {
            this.field1663 = arg2.method423(-125);
        } else if (arg1 == 31) {
            this.field1665 = arg2.method407(255);
        } else if (arg1 == 32) {
            this.field1633 = arg2.method423(94);
        } else if (arg1 == 33) {
            this.field1667 = arg2.method457((byte) 107);
        } else if (arg1 == 34) {
            this.field1632 = arg2.method407(arg0 ^ 0xFFFFFF02);
        } else if (arg1 == 35) {
            this.field1664 = arg2.method423(-124);
        } else if (arg1 == 36) {
            this.field1649 = arg2.method457((byte) 118);
        } else if (arg1 == 37) {
            this.field1637 = arg2.method407(255);
        } else if (arg1 == 38) {
            this.field1640 = arg2.method423(arg0 ^ 0x53);
        } else if (arg1 == 39) {
            this.field1643 = arg2.method423(87);
        } else if (arg1 == 40) {
            this.field1630 = arg2.method423(-117);
        } else if (arg1 == 41) {
            this.field1660 = arg2.method423(-89);
        } else if (arg1 == 42) {
            this.field1653 = arg2.method423(arg0 ^ 0x64);
        } else if (arg1 == 43) {
            arg2.method423(107);
        } else if (arg1 == 44) {
            arg2.method423(-115);
        } else if (arg1 == 45) {
            arg2.method423(-115);
        } else if (arg1 == 46) {
            this.field1647 = arg2.method423(arg0 ^ 0x6D);
        } else if (arg1 == 47) {
            this.field1669 = arg2.method423(79);
        } else if (arg1 == 48) {
            this.field1655 = arg2.method423(arg0 - 86);
        } else if (arg1 == 49) {
            this.field1661 = arg2.method423(82);
        } else if (arg1 == 50) {
            this.field1648 = arg2.method423(arg0 + 68);
        } else if (arg1 == 51) {
            this.field1668 = arg2.method423(-100);
        }
        field1656++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLca;)V")
    public final void method798(byte arg0, class54 arg1) {
        int var3 = -107 / ((arg0 - 35) / 49);
        while (true) {
            int var4 = arg1.method407(255);
            if (var4 == 0) {
                field1638++;
                return;
            }
            this.method797(-3, var4, arg1);
        }
    }
}
