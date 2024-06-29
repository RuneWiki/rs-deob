import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class82 {

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field1828 = 0;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "Lrd;")
    private static class114 field1841 = class84.method656("Report abuse", (byte) 118);

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Lrd;")
    public static class114 field1829 = class84.method656("blinken1:", (byte) 118);

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "Lrd;")
    public static class114 field1842 = class84.method656("::noclip", (byte) 114);

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "Lrd;")
    public static class114 field1846 = class84.method656("T", (byte) 119);

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "Lrd;")
    private static class114 field1835 = class84.method656(" from your friend list first", (byte) 125);

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "Lrd;")
    public static class114 field1853 = class84.method656("Ihr Spielkonto wurde deaktiviert)3", (byte) 115);

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "Lrd;")
    public static class114 field1839 = class84.method656("Konfig geladen)3", (byte) 114);

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "Lrd;")
    public static class114 field1831 = field1841;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "Lrd;")
    public static class114 field1851 = class84.method656("leuchten3:", (byte) 124);

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "Lrd;")
    public static class114 field1844 = field1835;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "Lrd;")
    public static class114 field1850 = class84.method656("Handel)4Duell", (byte) 118);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public int field1830;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public int field1833;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public int field1840;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    public int field1847;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public int field1849;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "Lha;")
    public class50 field1832;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "Lha;")
    public class50 field1836;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "Lha;")
    public class50 field1837;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "Lnd;")
    public static class90 field1848;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)V")
    public static final void method637(boolean arg0, int arg1) {
        field1852++;
        if (!class1.method1(0, arg1)) {
            return;
        }
        class90[] var2 = class78.field1772[arg1];
        int var3 = 0;
        if (!arg0) {
            return;
        }
        while (var2.length > var3) {
            class90 var4 = var2[var3];
            if (var4 != null) {
                var4.field2042 = 0;
                var4.field2007 = 0;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIZ)I")
    public static final int method638(int arg0, int arg1, boolean arg2) {
        field1834++;
        class132 var3 = (class132) class132.field3197.method783(-1, (long) arg0);
        if (var3 == null) {
            return 0;
        } else {
            if (!arg2) {
                method640(116, -111, -73, -101, 106, -114, -51, -22, 12, 58);
            }
            return arg1 >= 0 && arg1 < var3.field3186.length ? var3.field3186[arg1] : 0;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public static void method639(int arg0) {
        if (arg0 < 84) {
            field1851 = null;
        }
        field1846 = null;
        field1851 = null;
        field1848 = null;
        field1853 = null;
        field1842 = null;
        field1835 = null;
        field1844 = null;
        field1850 = null;
        field1839 = null;
        field1829 = null;
        field1831 = null;
        field1841 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method640(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1854++;
        class98 var10 = null;
        for (class98 var11 = (class98) class72.field1598.method654((byte) 30); var11 != null; var11 = (class98) class72.field1598.method644((byte) -68)) {
            if (var11.field2233 == arg6 && var11.field2237 == arg1 && var11.field2225 == arg0 && var11.field2220 == arg7) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class98();
            var10.field2220 = arg7;
            var10.field2225 = arg0;
            var10.field2233 = arg6;
            var10.field2237 = arg1;
            class79.method631((byte) 103, var10);
            class72.field1598.method645(var10, (byte) 103);
        }
        var10.field2217 = arg4;
        if (arg5 >= -108) {
            method639(-52);
        }
        var10.field2236 = arg8;
        var10.field2228 = arg2;
        var10.field2238 = arg9;
        var10.field2230 = arg3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)Z")
    public static final boolean method641(int arg0, int arg1, int arg2) {
        if (arg0 == 11) {
            arg0 = 10;
        }
        class12 var3 = class130.method1048(-76, arg2);
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        field1838++;
        if (arg1 != -11090) {
            field1839 = null;
        }
        return var3.method89(125, arg0);
    }
}
