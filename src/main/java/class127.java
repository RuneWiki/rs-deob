import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class127 extends class297 {

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "Lma;")
    public class5 field1901;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "Lel;")
    public static class218 field1905 = new class218();

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "Lma;")
    public static class5 field1913 = class12.method119("<br>", (byte) 86);

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "[Lma;")
    public static class5[] field1912 = new class5[200];

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "Lma;")
    public static class5 field1911 = class12.method119("Welt", (byte) 106);

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "Lma;")
    public static class5 field1910 = class12.method119("welle:", (byte) 56);

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "Lel;")
    public static class218 field1909 = new class218();

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "Lma;")
    public static class5 field1915 = class12.method119("Lade Schrifts-=tze )2 ", (byte) 118);

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "J")
    public static long field1914;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)Lhe;", line = 7)
    public static final class146 method848(int arg0, byte arg1) {
        class146 var2 = (class146) class189.field2952.method964(-257, (long) arg0);
        field1902++;
        int var3 = 106 % ((arg1 - 80) / 45);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class104.field1552.method1342(-127, class245.method1717(-1025244664, arg0), class29.method209(arg0, (byte) 102));
        class146 var5 = new class146();
        if (var4 != null) {
            var5.method930(-105, new class221(var4));
        }
        class189.field2952.method966(var5, (long) arg0, (byte) 73);
        return var5;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V", line = 44)
    public static final void method849(int arg0) {
        int var1 = 36 % ((arg0 + 46) / 39);
        for (class150 var2 = (class150) class274.field4660.method1475(14); var2 != null; var2 = (class150) class274.field4660.method1486(38)) {
            if (var2.field2161) {
                var2.method942(-9430);
            }
        }
        for (class150 var3 = (class150) class239.field3953.method1475(14); var3 != null; var3 = (class150) class239.field3953.method1486(38)) {
            if (var3.field2161) {
                var3.method942(-9430);
            }
        }
        field1908++;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V", line = 70)
    public class127() {
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I", line = 80)
    public static final int method850(int arg0, int arg1) {
        field1903++;
        if (arg0 > -23) {
            method853(44);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lma;)V", line = 94)
    public class127(class5 arg0) {
        this.field1901 = arg0;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)Lla;", line = 110)
    public static final class178 method851(boolean arg0) {
        field1907++;
        class178 var1 = new class178(class282.field4786, class281.field4765, class88.field1315[0], class287.field4836[0], class112.field1665[0], class179.field2718[0], class37.field590[0], class268.field4610);
        if (arg0) {
            return (class178) null;
        } else {
            class207.method1365(9);
            return var1;
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)V", line = 130)
    public static void method852(byte arg0) {
        field1915 = null;
        if (arg0 > -106) {
            method851(true);
        }
        field1913 = null;
        field1911 = null;
        field1912 = null;
        field1910 = null;
        field1909 = null;
        field1905 = null;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V", line = 146)
    public static final void method853(int arg0) {
        field1899++;
        if (arg0 == 255 && class209.field3329) {
            class151.field2189 = null;
            class234.field3869 = null;
            class209.field3329 = false;
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(Z)V", line = 169)
    public static final void method854(boolean arg0) {
        class50.method379(arg0);
        class217.method1465();
        field1906++;
        class21.method175();
        class169.field2580 = -1;
        class280.field4749 = class110.field1635 = new class56[4][];
        class260.field4438 = null;
        class106.method672(-32768);
        class187.field2935.method971(35);
        class266.field4543 = new class286();
        ((class164) class229.field3802).method1100((byte) -106);
        class53.field838 = 0;
        class53.field844 = new class239[255];
        class160.method1047();
        class134.field1987 = (class254[][]) null;
        class166.method1108(95);
        class50.method381(1);
        class135.method885(true);
        for (int var1 = 0; var1 < 2048; var1++) {
            class91 var2 = class267.field4593[var1];
            if (var2 != null) {
                var2.field1385 = null;
            }
        }
        class232.method1655(1);
        class36.method257();
    }
}
