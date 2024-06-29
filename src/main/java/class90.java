import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class90 extends class181 {

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "[Laj;")
    public static class1[] field1742 = new class1[28];

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "Lli;")
    public static class185 field1743 = class245.method1649("details", 124);

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
    public static int field1745 = 0;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
    public static int field1748 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
    public static int field1750 = 0;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "I")
    public static int field1752 = 0;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "Lli;")
    public static class185 field1741 = class245.method1649(")3runescape)3com)4l=", 125);

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "[[B")
    public static byte[][] field1756 = new byte[50][];

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
    private int field1751;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!dc", name = "db", descriptor = "I")
    public int field1758;

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "Lrh;")
    public static class115 field1744;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "Lli;")
    public class185 field1739;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Lli;")
    public static final class185 method591(int arg0, int arg1) {
        field1753++;
        return arg1 == 0 ? class249.method1669(false, 10, arg0, false) : null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjd;)V")
    public final void method592(int arg0, class118 arg1) {
        if (arg0 != 0) {
            method597(-107, -101, true);
        }
        field1754++;
        while (true) {
            int var3 = arg1.method867(false);
            if (var3 == 0) {
                return;
            }
            this.method596(arg0 - 6, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)Lai;")
    public static final class106 method593(byte arg0, int arg1) {
        field1747++;
        int var2 = 73 % ((arg0 - 21) / 38);
        class106 var3 = (class106) class127.field2269.method1615(-28166, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = class102.field1851.method1688(0, arg1 & 0x7FFF, 1);
        } else {
            var4 = class184.field3386.method1688(0, arg1, 1);
        }
        class106 var5 = new class106();
        if (var4 != null) {
            var5.method747((byte) -70, new class118(var4));
        }
        if (arg1 >= 32768) {
            var5.method750(23588);
        }
        class127.field2269.method1620(var5, (byte) 49, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
    public static void method594(byte arg0) {
        field1742 = null;
        if (arg0 == 116) {
            field1741 = null;
            field1744 = null;
            field1756 = null;
            field1743 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)Z")
    public final boolean method595(byte arg0) {
        if (arg0 != -124) {
            field1741 = null;
        }
        field1757++;
        return this.field1751 == 115;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjd;I)V")
    private final void method596(int arg0, class118 arg1, int arg2) {
        field1740++;
        if (arg0 != -6) {
            method594((byte) 101);
        }
        if (arg2 == 1) {
            this.field1751 = arg1.method867(false);
        } else if (arg2 == 2) {
            this.field1758 = arg1.method875((byte) 16);
        } else if (arg2 == 5) {
            this.field1739 = arg1.method865(9199);
            return;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIZ)V")
    public static final void method597(int arg0, int arg1, boolean arg2) {
        field1749++;
        class174 var3 = class249.method1671(1, arg1, (byte) -109);
        var3.method1233(0);
        if (arg2) {
            method594((byte) 47);
        }
        var3.field3186 = arg0;
    }
}
