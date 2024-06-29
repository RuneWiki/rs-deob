import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class82 extends class42 {

    @OriginalMember(owner = "client!nd", name = "eb", descriptor = "Lad;")
    private static class5 field1926 = class88.method674("Connection timed out)3", -121);

    @OriginalMember(owner = "client!nd", name = "ib", descriptor = "I")
    public static int field1930 = 0;

    @OriginalMember(owner = "client!nd", name = "gb", descriptor = "Lad;")
    public static class5 field1928 = field1926;

    @OriginalMember(owner = "client!nd", name = "hb", descriptor = "I")
    public static int field1929 = 0;

    @OriginalMember(owner = "client!nd", name = "lb", descriptor = "Lad;")
    public static class5 field1933 = class88.method674("gleiten:", -83);

    @OriginalMember(owner = "client!nd", name = "tb", descriptor = "I")
    public static int field1941 = 0;

    @OriginalMember(owner = "client!nd", name = "ob", descriptor = "Lad;")
    public static class5 field1936 = class88.method674("Begeben Sie sich in ein freies Gebiet)1 um", 59);

    @OriginalMember(owner = "client!nd", name = "rb", descriptor = "Lad;")
    private static class5 field1939 = class88.method674("Too many incorrect logins from your address)3", 28);

    @OriginalMember(owner = "client!nd", name = "qb", descriptor = "Lad;")
    public static class5 field1938 = field1939;

    @OriginalMember(owner = "client!nd", name = "db", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!nd", name = "jb", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!nd", name = "mb", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!nd", name = "nb", descriptor = "I")
    public int field1935;

    @OriginalMember(owner = "client!nd", name = "pb", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!nd", name = "sb", descriptor = "I")
    public int field1940;

    @OriginalMember(owner = "client!nd", name = "ub", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!nd", name = "vb", descriptor = "I")
    public int field1943;

    @OriginalMember(owner = "client!nd", name = "fb", descriptor = "Lsb;")
    public static class110 field1927;

    @OriginalMember(owner = "client!nd", name = "kb", descriptor = "Lsd;")
    public static class112 field1932;

    @OriginalMember(owner = "client!nd", name = "cb", descriptor = "Lvd;")
    public static class130 field1924;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBI)I", line = 7)
    public static final int method634(int arg0, byte arg1, int arg2) {
        field1934++;
        long var3 = (long) ((arg2 << 16) + arg0);
        if (class99.field2397 != null && class99.field2397.field363 == var3) {
            return arg1 == -69 ? class77.field1813.field957 * 99 / (class77.field1813.field974.length - class99.field2397.field2737) + 1 : -117;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)Lad;", line = 39)
    public static final class5 method635(int arg0, int arg1) {
        int var2 = -51 % ((62 - arg1) / 63);
        field1937++;
        if (arg0 < 100000) {
            return class106.method864(18413, arg0);
        } else if (arg0 < 10000000) {
            return class69.method546(true, new class5[] { class106.method864(18413, arg0 / 1000), class81.field1901 });
        } else {
            return class69.method546(true, new class5[] { class106.method864(18413, arg0 / 1000000), class13.field385 });
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lgb;I)V", line = 62)
    public final void method636(class39 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method330(-30864);
            if (var3 == 0) {
                if (arg1 != 99) {
                    return;
                }
                field1931++;
                return;
            }
            this.method638(var3, arg0, -1367544112);
        }
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V", line = 83)
    public static void method637(int arg0) {
        field1938 = null;
        field1939 = null;
        field1926 = null;
        field1924 = null;
        if (arg0 >= -101) {
            return;
        }
        field1933 = null;
        field1936 = null;
        field1928 = null;
        field1927 = null;
        field1932 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILgb;I)V", line = 113)
    private final void method638(int arg0, class39 arg1, int arg2) {
        if (arg2 != -1367544112) {
            field1933 = null;
        }
        if (arg0 == 1) {
            this.field1935 = arg1.method343((byte) -6);
            this.field1940 = arg1.method330(arg2 + 1367513248);
            this.field1943 = arg1.method330(arg2 ^ 0x518369A0);
        }
        field1942++;
    }
}
