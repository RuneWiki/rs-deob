import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class84 extends class121 {

    @OriginalMember(owner = "client!ma", name = "cb", descriptor = "I")
    public static int field2088 = 0;

    @OriginalMember(owner = "client!ma", name = "bb", descriptor = "Lhe;")
    public static class54 field2087 = class6.method58("mapedge", false);

    @OriginalMember(owner = "client!ma", name = "ab", descriptor = "I")
    public static int field2086 = 0;

    @OriginalMember(owner = "client!ma", name = "fb", descriptor = "I")
    public static int field2091 = 0;

    @OriginalMember(owner = "client!ma", name = "db", descriptor = "Lhe;")
    private static class54 field2089 = class6.method58("Welcome to RuneScape", false);

    @OriginalMember(owner = "client!ma", name = "eb", descriptor = "Lhe;")
    private static class54 field2090 = class6.method58(" is already on your ignore list", false);

    @OriginalMember(owner = "client!ma", name = "ib", descriptor = "J")
    public static long field2094 = 0L;

    @OriginalMember(owner = "client!ma", name = "lb", descriptor = "I")
    public static int field2097 = 0;

    @OriginalMember(owner = "client!ma", name = "mb", descriptor = "Lhe;")
    public static class54 field2098 = field2090;

    @OriginalMember(owner = "client!ma", name = "ob", descriptor = "Lhe;")
    public static class54 field2100 = field2089;

    @OriginalMember(owner = "client!ma", name = "qb", descriptor = "Lhe;")
    public static class54 field2102 = class6.method58("event_opbase", false);

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "I")
    public static int field2084 = 1;

    @OriginalMember(owner = "client!ma", name = "rb", descriptor = "Lhe;")
    public static class54 field2103 = class6.method58("<)4col>", false);

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "B")
    public byte field2083;

    @OriginalMember(owner = "client!ma", name = "nb", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!ma", name = "pb", descriptor = "I")
    public int field2101;

    @OriginalMember(owner = "client!ma", name = "gb", descriptor = "Leb;")
    public class31 field2092;

    @OriginalMember(owner = "client!ma", name = "hb", descriptor = "Lef;")
    public static class35 field2093;

    @OriginalMember(owner = "client!ma", name = "jb", descriptor = "Lnc;")
    public static class93 field2095;

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "[[[B")
    public static byte[][][] field2085;

    @OriginalMember(owner = "client!ma", name = "kb", descriptor = "[[[B")
    public static byte[][][] field2096;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZJ)V")
    public static final void method684(boolean arg0, long arg1) {
        field2099++;
        if (arg1 == 0L) {
            return;
        }
        class131.field2969.method454(218, 125);
        class131.field2969.method677(189354448, arg1);
        class80.field1950++;
        if (!arg0) {
            field2084 = -61;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
    public static void method685(byte arg0) {
        field2093 = null;
        field2089 = null;
        field2102 = null;
        field2096 = null;
        field2100 = null;
        field2098 = null;
        field2095 = null;
        if (arg0 >= -40) {
            method684(true, -36L);
        }
        field2103 = null;
        field2087 = null;
        field2085 = null;
        field2090 = null;
    }
}
