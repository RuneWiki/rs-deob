import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public abstract class class355 {

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "Lhn;")
    public static class509 field5259 = new class509(37, -2);

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 6)
    public static void method2230(int arg0) {
        if (arg0 == 37) {
            field5259 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBLuq;I)V", line = 16)
    public static final void method2231(int arg0, byte arg1, class114 arg2, int arg3) {
        if (arg2.field1625 == 0) {
            arg2.field1646 = arg2.field1593;
        } else if (arg2.field1625 == 1) {
            arg2.field1646 = (arg3 - arg2.field1642) / 2 + arg2.field1593;
        } else if (arg2.field1625 == 2) {
            arg2.field1646 = arg3 - arg2.field1642 - arg2.field1593;
        } else if (arg2.field1625 == 3) {
            arg2.field1646 = arg2.field1593 * arg3 >> 14;
        } else if (arg2.field1625 == 4) {
            arg2.field1646 = (arg3 - arg2.field1642) / 2 + (arg2.field1593 * arg3 >> 14);
        } else {
            arg2.field1646 = arg3 - (arg2.field1593 * arg3 >> 14) - arg2.field1642;
        }
        if (arg2.field1704 == 0) {
            arg2.field1701 = arg2.field1611;
        } else if (arg2.field1704 == 1) {
            arg2.field1701 = (arg0 - arg2.field1627) / 2 + arg2.field1611;
        } else if (arg2.field1704 == 2) {
            arg2.field1701 = arg0 - arg2.field1627 - arg2.field1611;
        } else if (arg2.field1704 == 3) {
            arg2.field1701 = arg2.field1611 * arg0 >> 14;
        } else if (arg2.field1704 == 4) {
            arg2.field1701 = (arg2.field1611 * arg0 >> 14) + (arg0 - arg2.field1627) / 2;
        } else {
            arg2.field1701 = arg0 - arg2.field1627 - (arg2.field1611 * arg0 >> 14);
        }
        field5258++;
        if (arg1 <= 75) {
            method2231(-59, (byte) 43, null, -71);
        }
        if (!class64.field780) {
            return;
        }
        if (client.method1387(arg2).field5805 == 0 && arg2.field1585 != 0) {
            return;
        }
        if (arg2.field1701 < 0) {
            arg2.field1701 = 0;
        } else if (arg2.field1701 + arg2.field1627 > arg0) {
            arg2.field1701 = arg0 - arg2.field1627;
        }
        if (arg2.field1646 < 0) {
            arg2.field1646 = 0;
            return;
        }
        if (arg3 < (arg2.field1646 + arg2.field1642)) {
            arg2.field1646 = arg3 - arg2.field1642;
            return;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILvg;)Lvg;")
    public abstract class39 method197(int arg0, class39 arg1);
}
