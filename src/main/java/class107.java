import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class107 {

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Z")
    public static boolean field1772 = false;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Le;")
    public static class191 field1773 = class54.method368("sl_stars", 2047);

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Le;")
    public static class191 field1775 = class54.method368("<col=ffff00>", 2047);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field1771 = 0;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Z")
    public static boolean field1781 = false;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "Le;")
    private static class191 field1780 = class54.method368("Choose Option", 2047);

    @OriginalMember(owner = "client!le", name = "l", descriptor = "Le;")
    public static class191 field1782 = class54.method368(")4g", 2047);

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Le;")
    public static class191 field1774 = field1780;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Le;")
    public static class191 field1778 = class54.method368("; version=1; path=)4; domain=", 2047);

    @OriginalMember(owner = "client!le", name = "f", descriptor = "Lci;")
    public static class162 field1776 = new class162(5000);

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field1784 = 0;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)[B")
    public static final synchronized byte[] method685(int arg0, byte arg1) {
        field1783++;
        if (arg0 == 100 && class194.field3496 > 0) {
            byte[] var2 = class135.field2266[--class194.field3496];
            class135.field2266[class194.field3496] = null;
            return var2;
        }
        int var3 = 12 % ((-arg1 - 56) / 40);
        if (arg0 == 5000 && class41.field727 > 0) {
            byte[] var4 = class126.field2078[--class41.field727];
            class126.field2078[class41.field727] = null;
            return var4;
        } else if (arg0 == 30000 && class183.field3143 > 0) {
            byte[] var5 = class230.field4135[--class183.field3143];
            class230.field4135[class183.field3143] = null;
            return var5;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)I")
    public static final int method686(int arg0, int arg1, int arg2) {
        field1779++;
        int var3 = class273.method1865(arg1 - 1, (byte) -42, arg2 - 1) + class273.method1865(arg1 + 1, (byte) -42, arg2 - 1) + class273.method1865(arg1 - 1, (byte) -42, arg2 + 1) + class273.method1865(arg1 + 1, (byte) -42, arg2 + 1);
        if (arg0 < 73) {
            method687(48);
        }
        int var4 = class273.method1865(arg1 - 1, (byte) -42, arg2) - (-class273.method1865(arg1 + 1, (byte) -42, arg2) - (class273.method1865(arg1, (byte) -42, arg2 - 1) + class273.method1865(arg1, (byte) -42, arg2 + 1)));
        int var5 = class273.method1865(arg1, (byte) -42, arg2);
        return var4 / 8 + (var3 / 16 + (var5 / 4));
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static void method687(int arg0) {
        field1773 = null;
        field1778 = null;
        field1782 = null;
        field1775 = null;
        field1776 = null;
        field1774 = null;
        field1780 = null;
        int var1 = 9 / ((arg0 + 24) / 48);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    public static final void method688(int arg0) {
        field1777++;
        class62.field1110.method985(0);
        if (arg0 != -30198) {
            method687(-94);
        }
        class18.field241.method985(0);
        class163.field2756.method985(0);
    }
}
