import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class82 extends class20 {

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public static int field1813 = 128;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "Lsc;")
    public static class128 field1812 = class129.method1017(false, "<col=40ff00>");

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "Lsc;")
    public static class128 field1816 = class129.method1017(false, "Freie Welt");

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "Lsc;")
    public static class128 field1811 = class129.method1017(false, "Hierhin gehen");

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "Lsc;")
    private static class128 field1814 = class129.method1017(false, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "Lsc;")
    public static class128 field1826 = field1814;

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "[I")
    public static int[] field1836 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!lf", name = "eb", descriptor = "[I")
    public static int[] field1840 = new int[500];

    @OriginalMember(owner = "client!lf", name = "jb", descriptor = "Lsc;")
    public static class128 field1845 = class129.method1017(false, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public int field1815;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    public int field1817;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public int field1818;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public int field1820;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public int field1821;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public int field1822;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public int field1823;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public int field1824;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    public int field1825;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
    public int field1829;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
    public int field1830;

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!lf", name = "bb", descriptor = "I")
    public int field1837;

    @OriginalMember(owner = "client!lf", name = "cb", descriptor = "I")
    public int field1838;

    @OriginalMember(owner = "client!lf", name = "db", descriptor = "I")
    public int field1839;

    @OriginalMember(owner = "client!lf", name = "fb", descriptor = "I")
    public int field1841;

    @OriginalMember(owner = "client!lf", name = "gb", descriptor = "I")
    public int field1842;

    @OriginalMember(owner = "client!lf", name = "hb", descriptor = "I")
    public int field1843;

    @OriginalMember(owner = "client!lf", name = "ib", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "Lpc;")
    public class107 field1834;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "Lu;")
    public class139 field1831;

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "Lve;")
    public class151 field1832;

    @OriginalMember(owner = "client!lf", name = "kb", descriptor = "Lcd;")
    public class19 field1846;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lsf;Lgf;ZZLsf;)V")
    public static final void method603(class131 arg0, class48 arg1, boolean arg2, boolean arg3, class131 arg4) {
        class134.field3147 = arg4;
        class86.field1953 = arg0;
        if (!arg2) {
            method607(112, 68, -93);
        }
        class62.field1331 = arg3;
        class134.field3147.method1022(119, 10);
        class120.field2729 = arg1;
        field1844++;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(B)V")
    public final void method604(byte arg0) {
        this.field1834 = null;
        this.field1832 = null;
        if (arg0 == 95) {
            this.field1846 = null;
            field1833++;
            this.field1831 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)V")
    public static void method605(byte arg0) {
        if (arg0 != -33) {
            return;
        }
        field1836 = null;
        field1840 = null;
        field1816 = null;
        field1845 = null;
        field1812 = null;
        field1814 = null;
        field1826 = null;
        field1811 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(JB)V")
    public static final void method606(long arg0, byte arg1) {
        if (arg1 != 1) {
            method606(-11L, (byte) 106);
        }
        field1828++;
        if (arg0 != 0L) {
            class152.field3502.method507(-83, 119);
            class125.field2831++;
            class152.field3502.method651(-1070186000, arg0);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
    public static final void method607(int arg0, int arg1, int arg2) {
        field1827++;
        if (class7.field103 < 2 && class105.field2392 == 0 && !class65.field1459) {
            return;
        }
        class128 var3;
        if (class105.field2392 == 1 && class7.field103 < 2) {
            var3 = class51.method395(new class128[] { class14.field273, class64.field1370, class53.field1067, class79.field1767 }, false);
        } else if (class65.field1459 && class7.field103 < 2) {
            var3 = class51.method395(new class128[] { class110.field2486, class64.field1370, class35.field656, class79.field1767 }, false);
        } else {
            var3 = class40.method287((byte) 123, class7.field103 - 1);
        }
        if (arg1 != 10) {
            field1812 = null;
        }
        if (class7.field103 > 2) {
            var3 = class51.method395(new class128[] { var3, class50.field1011, class111.method857(class7.field103 - 2, (byte) -62), class144.field3356 }, false);
        }
        int var4 = class97.field2255.method1068(var3, arg2 + 4, arg0 + 15, 16777215, 0, class79.field1768, class116.field2614);
        class19.method169((byte) -58, arg2 + 4, class97.field2255.method1079(var3) + var4, 15, arg0);
    }
}
