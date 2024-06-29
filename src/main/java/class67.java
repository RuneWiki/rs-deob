import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class67 extends class24 {

    @OriginalMember(owner = "client!la", name = "P", descriptor = "Lv;")
    private static class122 field1720 = class55.method425(-75, "Enter your username (V password)3");

    @OriginalMember(owner = "client!la", name = "I", descriptor = "I")
    public static int field1714 = 0;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "Lv;")
    public static class122 field1712 = field1720;

    @OriginalMember(owner = "client!la", name = "L", descriptor = "Lv;")
    private static class122 field1717 = class55.method425(-52, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!la", name = "V", descriptor = "Lv;")
    private static class122 field1726 = class55.method425(-79, "Please try using a different world)3");

    @OriginalMember(owner = "client!la", name = "X", descriptor = "Lv;")
    public static class122 field1727 = class55.method425(-62, "blinken1:");

    @OriginalMember(owner = "client!la", name = "R", descriptor = "Lv;")
    public static class122 field1722 = field1726;

    @OriginalMember(owner = "client!la", name = "S", descriptor = "Lv;")
    public static class122 field1723 = field1726;

    @OriginalMember(owner = "client!la", name = "O", descriptor = "Lv;")
    public static class122 field1719 = field1726;

    @OriginalMember(owner = "client!la", name = "J", descriptor = "Lv;")
    private static class122 field1715 = class55.method425(-117, "wave2:");

    @OriginalMember(owner = "client!la", name = "ab", descriptor = "Lv;")
    public static class122 field1730 = field1715;

    @OriginalMember(owner = "client!la", name = "Z", descriptor = "Lv;")
    public static class122 field1729 = field1726;

    @OriginalMember(owner = "client!la", name = "eb", descriptor = "[I")
    public static int[] field1734 = new int[100];

    @OriginalMember(owner = "client!la", name = "N", descriptor = "Lv;")
    public static class122 field1718 = field1717;

    @OriginalMember(owner = "client!la", name = "gb", descriptor = "I")
    public static int field1736 = 0;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "Lv;")
    public static class122 field1713 = field1726;

    @OriginalMember(owner = "client!la", name = "db", descriptor = "Lv;")
    public static class122 field1733 = class55.method425(-50, " ");

    @OriginalMember(owner = "client!la", name = "hb", descriptor = "I")
    public static int field1737 = 0;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "[I")
    public static int[] field1724 = new int[100];

    @OriginalMember(owner = "client!la", name = "fb", descriptor = "I")
    public static int field1735 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!la", name = "ib", descriptor = "Lv;")
    public static class122 field1738 = field1717;

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "Lv;")
    public static class122 field1721 = field1726;

    @OriginalMember(owner = "client!la", name = "jb", descriptor = "Lv;")
    public static class122 field1739 = field1717;

    @OriginalMember(owner = "client!la", name = "K", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!la", name = "Y", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!la", name = "cb", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "Lv;")
    public class122 field1711;

    @OriginalMember(owner = "client!la", name = "bb", descriptor = "Lvb;")
    public static class124 field1731;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V", line = 17)
    public static final void method536(byte arg0) {
        field1732++;
        if (arg0 != -12) {
            field1722 = null;
        }
        for (class51 var1 = (class51) class91.field2333.method311((byte) 119); var1 != null; var1 = (class51) class91.field2333.method302((byte) -81)) {
            if (var1.field1309 != null) {
                var1.method404(false);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V", line = 48)
    public static void method537(boolean arg0) {
        field1726 = null;
        field1722 = null;
        field1713 = null;
        field1729 = null;
        field1723 = null;
        field1733 = null;
        field1731 = null;
        field1717 = null;
        field1720 = null;
        field1738 = null;
        field1718 = null;
        field1730 = null;
        field1721 = null;
        field1734 = null;
        field1712 = null;
        field1724 = null;
        field1719 = null;
        field1739 = null;
        field1727 = null;
        if (arg0) {
            field1730 = null;
        }
        field1715 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Lp;", line = 88)
    public static final class90 method538(int arg0, int arg1) {
        field1716++;
        if (arg0 != -20970) {
            field1734 = null;
        }
        class90 var2 = (class90) class21.field556.method436(arg0 + 20922, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class125.field3035.method611(0, 14, arg1);
        class90 var4 = new class90();
        if (var3 != null) {
            var4.method722(0, new class64(var3));
        }
        class21.field556.method437((long) arg1, var4, (byte) 69);
        return var4;
    }
}
