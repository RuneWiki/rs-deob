import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class101 {

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public int field1886 = 0;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public int field1885 = 0;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Lai;")
    public static class10 field1880 = class44.method278("Texturen geladen)3", 121);

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field1890 = 0;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "Lai;")
    public static class10 field1893 = class44.method278("mapfunction", -72);

    @OriginalMember(owner = "client!la", name = "s", descriptor = "Lai;")
    public static class10 field1897 = class44.method278(" )2> ", 123);

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field1888 = 0;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field1901 = 0;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field1900 = 0;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Ldb;")
    public static class32 field1882 = new class32(32);

    @OriginalMember(owner = "client!la", name = "z", descriptor = "Lai;")
    public static class10 field1904 = class44.method278("", -84);

    @OriginalMember(owner = "client!la", name = "B", descriptor = "Lai;")
    public static class10 field1906 = class44.method278("sl_arrows", 116);

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public int field1884;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public int field1889;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public int field1891;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public int field1895;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public int field1896;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public int field1898;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public int field1902;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "Lmb;")
    public static class111 field1903;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "Lnc;")
    public static class121 field1894;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Lnd;")
    public class122 field1879;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "Lnd;")
    public class122 field1892;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "Lph;")
    public static class144 field1887;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "Lta;")
    public static class173 field1905;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IBII)I")
    public static final int method665(int arg0, byte arg1, int arg2, int arg3) {
        field1883++;
        if ((class185.field3527[arg3][arg2][arg0] & 0x8) != 0) {
            return 0;
        } else if (arg3 <= 0 || (class185.field3527[1][arg2][arg0] & 0x2) == 0) {
            if (arg1 != -79) {
                method665(12, (byte) -113, -75, -71);
            }
            return arg3;
        } else {
            return arg3 - 1;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method666(int arg0) {
        field1880 = null;
        field1893 = null;
        field1904 = null;
        field1905 = null;
        field1887 = null;
        field1903 = null;
        field1894 = null;
        field1882 = null;
        int var1 = 120 / ((-arg0 - 37) / 58);
        field1897 = null;
        field1906 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lc;Lai;BLai;)Lbf;")
    public static final class17 method667(class21 arg0, class10 arg1, byte arg2, class10 arg3) {
        int var4 = -83 % ((arg2 + 8) / 35);
        field1881++;
        int var5 = arg0.method156(0, arg1);
        int var6 = arg0.method154(var5, true, arg3);
        return class55.method379(var6, arg0, 23991, var5);
    }
}
