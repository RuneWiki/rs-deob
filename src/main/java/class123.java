import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class123 {

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "J")
    public long field1702 = 0L;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "[[S")
    public static short[][] field1692 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static volatile int field1694 = 0;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    public static int field1706 = 0;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "F")
    public static float field1693;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public int field1688;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public int field1689;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public int field1690;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public int field1695;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public int field1698;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "Lnk;")
    public static class16 field1699;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "Lio;")
    public class294 field1697;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "Lio;")
    public class294 field1705;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "[Lkg;")
    public static class85[] field1700;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V", line = 14)
    public static final void method790(boolean arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class231.field3497[var1] = false;
        }
        class30.field355 = -1;
        class233.field3525 = 0;
        class120.field1667 = 1;
        if (arg0) {
            field1687 = -75;
        }
        class140.field2159 = 0;
        field1704++;
        class130.field1879 = -1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZZ)Z", line = 47)
    public static final boolean method791(boolean arg0, boolean arg1) {
        field1696++;
        boolean var2 = class152.method1116();
        if (arg1) {
            field1694 = 126;
        }
        if (var2 == arg0) {
            return true;
        }
        if (!arg0) {
            class152.method1110();
        } else if (!class152.method1112() || !class152.method1117() || !class152.method1118()) {
            arg0 = false;
        }
        class151.field2386 = arg0;
        class160.method1162(class156.field2451, (byte) -125);
        if (var2 == arg0) {
            return false;
        } else {
            ((class138) class104.field1438).method948(-49);
            return true;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V", line = 89)
    public static void method792(byte arg0) {
        field1700 = null;
        field1699 = null;
        field1692 = (short[][]) null;
        int var1 = 61 % ((30 - arg0) / 52);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIII)V", line = 103)
    public static final void method793(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == -2266) {
            field1691++;
            String var4 = "::tele " + arg0 + "," + (arg3 >> 6) + "," + (arg1 >> 6) + "," + (arg3 & 0x3F) + "," + (arg1 & 0x3F);
            System.out.println(var4);
            class109.method702((byte) 54, var4);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V", line = 116)
    public static final void method794(int arg0, int arg1, int arg2) {
        class226.field3412 = true;
        class76.field997 = arg0;
        class6.field70 = arg1;
        class250.field3969 = arg2;
        class179.field2690 = -1;
        class347.field5511 = -1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)Lia;", line = 126)
    public static final class234 method795(int arg0, int arg1) {
        field1701++;
        class234 var2 = (class234) class187.field2808.method380(arg0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class253.field4015.method100(class230.method1596(arg1, arg0 - 8), class57.method341(arg1, 82), (byte) -107);
        class234 var4 = new class234();
        var4.field3594 = arg1;
        if (var3 != null) {
            var4.method1626(-1, new class143(var3));
        }
        var4.method1610(-127);
        if (!class225.field3396 && var4.field3534) {
            var4.field3562 = null;
        }
        if (var4.field3545) {
            var4.field3606 = false;
            var4.field3602 = 0;
        }
        class187.field2808.method377((long) arg1, var4, -1);
        return var4;
    }
}
