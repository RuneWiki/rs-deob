import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class class111 extends class101 {

    @OriginalMember(owner = "client!qha", name = "w", descriptor = "I")
    public int field1529;

    @OriginalMember(owner = "client!qha", name = "o", descriptor = "I")
    public int field1521;

    @OriginalMember(owner = "client!qha", name = "n", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!qha", name = "p", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!qha", name = "q", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!qha", name = "r", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!qha", name = "s", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!qha", name = "t", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!qha", name = "u", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!qha", name = "v", descriptor = "[[Lor;")
    public static class668[][] field1528;

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(B)Z", line = 6)
    public final boolean method836(byte arg0) {
        field1524++;
        if (arg0 == -55) {
            return (this.field1521 >> 21 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)Z", line = 18)
    public final boolean method837(int arg0) {
        int var2 = -112 / ((-arg0 - 33) / 49);
        field1522++;
        return (this.field1521 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(I)I", line = 29)
    public final int method838(int arg0) {
        field1520++;
        if (arg0 > -2) {
            this.method837(60);
        }
        return (this.field1521 & 0x1D47F7) >> 18;
    }

    @OriginalMember(owner = "client!qha", name = "d", descriptor = "(I)I", line = 43)
    public final int method839(int arg0) {
        field1525++;
        return arg0 == 0 ? class263.method1734(17356, this.field1521) : -84;
    }

    @OriginalMember(owner = "client!qha", name = "d", descriptor = "(B)Z", line = 57)
    public final boolean method840(byte arg0) {
        field1527++;
        if (arg0 > -58) {
            return true;
        } else {
            return (this.field1521 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!qha", name = "e", descriptor = "(B)V", line = 69)
    public static void method841(byte arg0) {
        if (arg0 != -51) {
            method841((byte) -72);
        }
        field1528 = null;
    }

    @OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(II)V", line = 82)
    public class111(int arg0, int arg1) {
        this.field1529 = arg1;
        this.field1521 = arg0;
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(II)Z", line = 92)
    public final boolean method842(int arg0, int arg1) {
        field1523++;
        if (arg0 == 19061) {
            return (this.field1521 >> arg1 + 1 & 0x1) != 0;
        } else {
            return false;
        }
    }
}
