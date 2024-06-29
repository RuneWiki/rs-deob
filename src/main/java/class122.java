import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class122 extends class271 {

    @OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
    public static int field1662 = 0;

    @OriginalMember(owner = "client!gp", name = "G", descriptor = "S")
    public static short field1671 = 1;

    @OriginalMember(owner = "client!gp", name = "H", descriptor = "Z")
    public static boolean field1672 = false;

    @OriginalMember(owner = "client!gp", name = "I", descriptor = "[I")
    public static int[] field1673 = new int[25];

    @OriginalMember(owner = "client!gp", name = "E", descriptor = "Lap;")
    public static class310 field1669 = new class310(20, 18);

    @OriginalMember(owner = "client!gp", name = "v", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!gp", name = "w", descriptor = "I")
    public int field1661;

    @OriginalMember(owner = "client!gp", name = "y", descriptor = "I")
    public int field1663;

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!gp", name = "A", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!gp", name = "C", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!gp", name = "D", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!gp", name = "F", descriptor = "I")
    public int field1670;

    @OriginalMember(owner = "client!gp", name = "B", descriptor = "J")
    public long field1666;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "(I)V")
    public static void method935(int arg0) {
        field1673 = null;
        if (arg0 < 89) {
            field1671 = 104;
        }
        field1669 = null;
    }

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "(I)I")
    public final int method936(int arg0) {
        if (arg0 != 0) {
            this.field1663 = 37;
        }
        field1668++;
        return this.field1670;
    }

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "(I)I")
    public final int method937(int arg0) {
        field1664++;
        if (arg0 != 5) {
            this.method937(-5);
        }
        return this.field1663;
    }

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "(I)I")
    public final int method938(int arg0) {
        if (arg0 != 1) {
            this.method938(-17);
        }
        field1660++;
        return this.field1661;
    }

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "(B)J")
    public final long method939(byte arg0) {
        if (arg0 <= 80) {
            this.method937(38);
        }
        field1667++;
        return this.field1666;
    }
}
