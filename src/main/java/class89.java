import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class89 extends class242 {

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
    public int field1632 = 0;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    public int field1626 = -1;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "Ljf;")
    public static class229 field1630 = class212.method1457((byte) 125, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "Ljf;")
    public static class229 field1631 = class212.method1457((byte) 66, " (X");

    @OriginalMember(owner = "client!wl", name = "G", descriptor = "I")
    public static int field1642 = 0;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public int field1628;

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
    public int field1633;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
    public int field1634;

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "I")
    public int field1635;

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
    public int field1636;

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
    public int field1637;

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "I")
    public int field1638;

    @OriginalMember(owner = "client!wl", name = "D", descriptor = "I")
    public int field1639;

    @OriginalMember(owner = "client!wl", name = "E", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!wl", name = "F", descriptor = "I")
    public int field1641;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "Lek;")
    public static class185 field1629;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "[[B")
    public static byte[][] field1627;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIZ)I", line = 9)
    public static final int method634(int arg0, int arg1, boolean arg2) {
        field1625++;
        if (!arg2) {
            return -124;
        }
        int var3 = class191.method1308(arg1 + 45365, arg0 - -91923, 4, 121) + (class191.method1308(arg1 + 10294, arg0 + 37821, 2, -106) - 128 >> 1) + (class191.method1308(arg1, arg0, 1, 85) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V", line = 41)
    public static void method635(int arg0) {
        field1631 = null;
        field1627 = (byte[][]) null;
        if (arg0 < 122) {
            method634(36, 95, true);
        }
        field1629 = null;
        field1630 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZLte;)V", line = 79)
    public static final void method636(boolean arg0, class297 arg1) {
        field1640++;
        class180.field3126 = arg1;
        if (!arg0) {
            method636(false, (class297) null);
        }
    }
}
