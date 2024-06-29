import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class79 {

    @OriginalMember(owner = "client!na", name = "l", descriptor = "Lec;")
    public static class28 field1833 = class28.method210(-46, "Bad session id)3");

    @OriginalMember(owner = "client!na", name = "m", descriptor = "Lec;")
    public static class28 field1834 = class28.method210(-46, "Enter name of player to delete from list");

    @OriginalMember(owner = "client!na", name = "i", descriptor = "Lec;")
    public static class28 field1830 = class28.method210(-46, "Jan");

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    public static int field1839 = 0;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public int field1826;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public int field1831;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public int field1832;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public int field1835;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    public int field1840;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "Loc;")
    public class87 field1828;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static void method599(int arg0) {
        field1830 = null;
        field1833 = null;
        if (arg0 != 27835) {
            field1839 = -68;
        }
        field1834 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIB)I")
    public static final int method600(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0 & 0x3;
        field1827++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (arg3 <= 29) {
            return 97;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lvb;ILvb;Z)V")
    public static final void method601(class122 arg0, int arg1, class122 arg2, boolean arg3) {
        class93.field2053 = arg0;
        class103.field2205 = arg2;
        field1829++;
        class119.field2570 = arg3;
        if (arg1 != 10) {
            field1830 = null;
        }
        class125.field2717 = class103.field2205.method947(10, (byte) 47);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public static final void method602(int arg0) {
        int var1 = -65 / ((arg0 + 85) / 37);
        if (class82.field1867.toLowerCase().indexOf("microsoft") == -1) {
            class90.field1972[44] = 71;
            class90.field1972[45] = 26;
            class90.field1972[46] = 72;
            class90.field1972[47] = 73;
            class90.field1972[59] = 57;
            class90.field1972[61] = 27;
            class90.field1972[91] = 42;
            class90.field1972[92] = 74;
            class90.field1972[93] = 43;
            if (class82.field1868 == null) {
                class90.field1972[192] = 58;
                class90.field1972[222] = 59;
            } else {
                class90.field1972[192] = 28;
                class90.field1972[222] = 58;
                class90.field1972[520] = 59;
            }
        } else {
            class90.field1972[186] = 57;
            class90.field1972[187] = 27;
            class90.field1972[188] = 71;
            class90.field1972[189] = 26;
            class90.field1972[190] = 72;
            class90.field1972[191] = 73;
            class90.field1972[192] = 58;
            class90.field1972[219] = 42;
            class90.field1972[220] = 74;
            class90.field1972[221] = 43;
            class90.field1972[222] = 59;
            class90.field1972[223] = 28;
        }
        field1836++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZ)Lec;")
    public static final class28 method603(int arg0, boolean arg1) {
        class28 var2 = class5.method25(6366, arg0);
        if (!arg1) {
            return null;
        }
        for (int var3 = var2.method214(114) - 3; var3 > 0; var3 -= 3) {
            var2 = class68.method537(1, new class28[] { var2.method228(var3, true, 0), class55.field1273, var2.method218(var3, false) });
        }
        if (var2.method214(-123) > 8) {
            var2 = class68.method537(1, new class28[] { class112.field2421, var2.method228(var2.method214(118) - 8, arg1, 0), class34.field772, var2, class78.field1821 });
        } else if (var2.method214(-76) > 4) {
            var2 = class68.method537(1, new class28[] { class112.field2424, var2.method228(var2.method214(116) - 4, true, 0), class64.field1418, var2, class78.field1821 });
        }
        field1822++;
        return class68.method537(1, new class28[] { class62.field1380, var2 });
    }
}
