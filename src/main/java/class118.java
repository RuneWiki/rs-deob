import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class118 extends class87 {

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    public static int field1732 = 0;

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "I")
    public static int field1735 = 0;

    @OriginalMember(owner = "client!mh", name = "W", descriptor = "Z")
    public static boolean field1736 = false;

    @OriginalMember(owner = "client!mh", name = "bb", descriptor = "I")
    public static int field1741 = -2;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "B")
    public byte field1730;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!mh", name = "Y", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!mh", name = "Z", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!mh", name = "ab", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!mh", name = "db", descriptor = "I")
    public int field1743;

    @OriginalMember(owner = "client!mh", name = "X", descriptor = "Lkl;")
    public class114 field1737;

    @OriginalMember(owner = "client!mh", name = "cb", descriptor = "Lnk;")
    public static class11 field1742;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "Lve;")
    public static class233 field1727;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "[[[B")
    public static byte[][][] field1729;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(Z)[B")
    public final byte[] method594(boolean arg0) {
        ++field1739;
        if (!arg0) {
            method815(83, (String) null);
        }
        if (!super.field1339 && this.field1737.field1673 >= this.field1737.field1629.length + -this.field1730) {
            return this.field1737.field1629;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILve;IB)Lvd;")
    public static final class117 method813(int arg0, class233 arg1, int arg2, byte arg3) {
        ++field1740;
        if (!class110.method718(arg1, (byte) -117, arg2, arg0)) {
            return null;
        } else {
            if (arg3 <= 35) {
                field1732 = 43;
            }
            return class24.method179(113);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
    public static void method814(byte arg0) {
        if (arg0 == 35) {
            field1727 = null;
            field1742 = null;
            field1729 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method815(int arg0, String arg1) {
        ++field1728;
        if (arg0 > 72) {
            for (class225 var2 = (class225) class14.field216.method656(110); var2 != null; var2 = (class225) class14.field216.method650(126)) {
                if (var2.field3381.equals(arg1)) {
                    class70.field1099 = var2;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "(I)I")
    public final int method596(int arg0) {
        if (arg0 != -899) {
            this.field1737 = null;
        }
        ++field1733;
        return this.field1737 == null ? 0 : this.field1737.field1673 * 100 / (this.field1737.field1629.length + -this.field1730);
    }
}
