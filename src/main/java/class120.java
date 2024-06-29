import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class120 {

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
    public int field1645 = 2048;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "I")
    public int field1650 = 0;

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
    public int field1649 = 0;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
    public int field1651 = 2048;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "Lni;")
    public static class367 field1646;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "Lni;")
    public static class367 field1648;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "Lga;")
    public static class282 field1643;

    static {
        new class446(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
        field1646 = new class367(52, 4);
        field1648 = new class367(67, 5);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V", line = 12)
    public static final void method731(boolean arg0) {
        if (!arg0) {
            return;
        }
        class70.field975.method2127((byte) 9);
        field1641++;
        class81.field1184.method2127((byte) 126);
        class515.field7567.method2127((byte) 123);
        class259.field3636.method2127((byte) 123);
        class166.field2250.method2127((byte) -62);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZI)I", line = 32)
    public static final int method732(boolean arg0, int arg1) {
        if (arg0) {
            method731(false);
        }
        field1642++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lnj;I)V", line = 43)
    public final void method733(class164 arg0, int arg1) {
        if (arg1 != -31382) {
            this.field1650 = -88;
        }
        while (true) {
            int var3 = arg0.method1087(false);
            if (var3 == 0) {
                field1644++;
                return;
            }
            this.method735(var3, -6224, arg0);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V", line = 65)
    public static void method734(byte arg0) {
        field1648 = null;
        if (arg0 > 22) {
            field1643 = null;
            field1646 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILnj;)V", line = 81)
    private final void method735(int arg0, int arg1, class164 arg2) {
        if (arg1 != -6224) {
            this.field1649 = 89;
        }
        field1647++;
        if (arg0 == 1) {
            this.field1649 = arg2.method1087(false);
        } else if (arg0 == 2) {
            this.field1651 = arg2.method1074(-635989152);
        } else if (arg0 == 3) {
            this.field1645 = arg2.method1074(-635989152);
            return;
        } else if (arg0 == 4) {
            this.field1650 = arg2.method1056(arg1 ^ 0xFFFFE3B0);
            return;
        }
    }
}
