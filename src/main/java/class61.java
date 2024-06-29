import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class61 extends class127 {

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "I")
    public static int field1533 = 0;

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "Lhb;")
    private static class44 field1543 = class102.method810("Enter name of player to add to list", -28606);

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "Lhb;")
    public static class44 field1532 = class102.method810("huffman", -28606);

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "Lhb;")
    public static class44 field1541 = field1543;

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "Lhb;")
    public static class44 field1531 = class102.method810("Mem:", -28606);

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "Lhb;")
    public static class44 field1538 = class102.method810("Regeln versto-8en hat)3", -28606);

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "[I")
    public static int[] field1549 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "I")
    public static int field1550 = 0;

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "Lhb;")
    private static class44 field1548 = class102.method810("No matching objects found)1 please shorten search", -28606);

    @OriginalMember(owner = "client!ka", name = "ab", descriptor = "Lhb;")
    public static class44 field1558 = class102.method810("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", -28606);

    @OriginalMember(owner = "client!ka", name = "bb", descriptor = "Lhb;")
    public static class44 field1559 = field1548;

    @OriginalMember(owner = "client!ka", name = "cb", descriptor = "Lhb;")
    public static class44 field1560 = class102.method810("hitmarks", -28606);

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "Lhb;")
    public static class44 field1552 = class102.method810("(WSpielkonto wiederherstellen(W Option auf der Hauptseite)3", -28606);

    @OriginalMember(owner = "client!ka", name = "eb", descriptor = "Lhb;")
    public static class44 field1562 = class102.method810("Titelbild geladen)3", -28606);

    @OriginalMember(owner = "client!ka", name = "gb", descriptor = "Lhb;")
    public static class44 field1564 = class102.method810("Verbindung mit Freunde)2Server)3)3)3", -28606);

    @OriginalMember(owner = "client!ka", name = "db", descriptor = "Lhb;")
    public static class44 field1561 = class102.method810("Cabbage", -28606);

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "I")
    public int field1534;

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "I")
    public int field1536;

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "I")
    public int field1537;

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "I")
    public int field1540;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "I")
    public int field1544;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "I")
    public int field1547;

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "I")
    public int field1551;

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!ka", name = "X", descriptor = "I")
    public int field1555;

    @OriginalMember(owner = "client!ka", name = "Y", descriptor = "I")
    public int field1556;

    @OriginalMember(owner = "client!ka", name = "fb", descriptor = "I")
    public int field1563;

    @OriginalMember(owner = "client!ka", name = "hb", descriptor = "Lfb;")
    public static class33 field1565;

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "Ljc;")
    public class57 field1539;

    @OriginalMember(owner = "client!ka", name = "Z", descriptor = "Lne;")
    public static class83 field1557;

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "Lba;")
    public class8 field1542;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "Lba;")
    public class8 field1545;

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "[I")
    public int[] field1554;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V", line = 15)
    public final void method563(byte arg0) {
        if (arg0 != -9) {
            this.method563((byte) 92);
        }
        field1546++;
        int var2 = this.field1556;
        class57 var3 = this.field1539.method533((byte) 127);
        if (var3 == null) {
            this.field1555 = 0;
            this.field1563 = 0;
            this.field1540 = 0;
            this.field1556 = -1;
            this.field1554 = null;
        } else {
            this.field1556 = var3.field1457;
            this.field1563 = var3.field1471;
            this.field1555 = var3.field1490;
            this.field1554 = var3.field1469;
            this.field1540 = var3.field1452 * 128;
        }
        if (this.field1556 != var2 && this.field1545 != null) {
            class41.field948.method28(this.field1545);
            this.field1545 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(Z)V", line = 76)
    public static void method564(boolean arg0) {
        field1549 = null;
        field1564 = null;
        field1531 = null;
        field1552 = null;
        field1562 = null;
        if (!arg0) {
            method565(false, true, (byte) 120, -87, true);
        }
        field1565 = null;
        field1543 = null;
        field1558 = null;
        field1541 = null;
        field1532 = null;
        field1560 = null;
        field1548 = null;
        field1557 = null;
        field1559 = null;
        field1538 = null;
        field1561 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZZBIZ)Lqd;", line = 141)
    public static final class100 method565(boolean arg0, boolean arg1, byte arg2, int arg3, boolean arg4) {
        field1553++;
        if (arg2 != 21) {
            field1538 = null;
        }
        class102 var5 = null;
        if (class129.field3106 != null) {
            var5 = new class102(arg3, class129.field3106, class47.field1164[arg3], 1000000);
        }
        return new class100(var5, class88.field2256, arg3, arg0, arg1, arg4);
    }
}
