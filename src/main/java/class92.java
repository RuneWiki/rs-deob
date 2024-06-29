import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class92 extends class103 {

    @OriginalMember(owner = "client!o", name = "gb", descriptor = "Lvc;")
    public static class137 field2172 = class45.method325("Lade Benutzeroberfl-=che )2 ", -46);

    @OriginalMember(owner = "client!o", name = "jb", descriptor = "Lvc;")
    private static class137 field2175 = class45.method325("flash2:", -46);

    @OriginalMember(owner = "client!o", name = "hb", descriptor = "Lvc;")
    public static class137 field2173 = class45.method325("headicons_hint", -46);

    @OriginalMember(owner = "client!o", name = "nb", descriptor = "Lvc;")
    public static class137 field2179 = class45.method325("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1", -46);

    @OriginalMember(owner = "client!o", name = "qb", descriptor = "Lvc;")
    public static class137 field2182 = class45.method325(":", -46);

    @OriginalMember(owner = "client!o", name = "fb", descriptor = "I")
    public static int field2171 = 0;

    @OriginalMember(owner = "client!o", name = "lb", descriptor = "Lvc;")
    public static class137 field2177 = field2175;

    @OriginalMember(owner = "client!o", name = "pb", descriptor = "Lvc;")
    private static class137 field2181 = class45.method325("World", -46);

    @OriginalMember(owner = "client!o", name = "ob", descriptor = "[[[I")
    public static int[][][] field2180 = new int[4][13][13];

    @OriginalMember(owner = "client!o", name = "ub", descriptor = "Lvc;")
    public static class137 field2186 = class45.method325("Regelversto-8 melden", -46);

    @OriginalMember(owner = "client!o", name = "yb", descriptor = "Lvc;")
    public static class137 field2190 = class45.method325("(WSpielkonto wiederherstellen(W Option auf der Hauptseite)3", -46);

    @OriginalMember(owner = "client!o", name = "wb", descriptor = "Lvc;")
    public static class137 field2188 = field2181;

    @OriginalMember(owner = "client!o", name = "tb", descriptor = "I")
    public static int field2185 = 0;

    @OriginalMember(owner = "client!o", name = "kb", descriptor = "[I")
    public static int[] field2176 = new int[2000];

    @OriginalMember(owner = "client!o", name = "zb", descriptor = "I")
    public static int field2191 = 99;

    @OriginalMember(owner = "client!o", name = "ib", descriptor = "I")
    public int field2174;

    @OriginalMember(owner = "client!o", name = "sb", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!o", name = "vb", descriptor = "I")
    public int field2187;

    @OriginalMember(owner = "client!o", name = "xb", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!o", name = "mb", descriptor = "Lia;")
    public static class57 field2178;

    @OriginalMember(owner = "client!o", name = "rb", descriptor = "Lnb;")
    public static class88 field2183;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)Lbf;")
    public final class14 method38(boolean arg0) {
        if (arg0) {
            field2184++;
            return class39.method286((byte) 117, this.field2187).method1078(120, this.field2174);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(Z)V")
    public static void method675(boolean arg0) {
        field2182 = null;
        field2179 = null;
        field2188 = null;
        field2181 = null;
        field2177 = null;
        field2186 = null;
        field2172 = null;
        field2180 = null;
        field2178 = null;
        if (!arg0) {
            return;
        }
        field2183 = null;
        field2190 = null;
        field2175 = null;
        field2173 = null;
        field2176 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BJ)V")
    public static final void method676(byte arg0, long arg1) {
        field2189++;
        if (arg1 == 0L) {
            return;
        }
        if (class39.field868 >= 100) {
            class109.method792(0, class104.field2419, -4, class45.field999);
            return;
        }
        class137 var3 = class105.method757(126, arg1).method1016((byte) 125);
        int var4 = 0;
        int var5 = 110 / ((arg0 + 40) / 61);
        while (class39.field868 > var4) {
            if (class93.field2212[var4] == arg1) {
                class109.method792(0, class88.method666(-82, new class137[] { var3, class77.field1716 }), -4, class45.field999);
                return;
            }
            var4++;
        }
        for (int var6 = 0; var6 < class80.field1832; var6++) {
            if (class68.field1395[var6] == arg1) {
                class109.method792(0, class88.method666(125, new class137[] { class77.field1707, var3, class53.field1183 }), -4, class45.field999);
                return;
            }
        }
        if (var3.method1026(-1, class104.field2412.field2909)) {
            return;
        }
        class105.field2432++;
        class93.field2212[class39.field868++] = arg1;
        class34.field737 = true;
        class72.field1527.method845(12, 100);
        class72.field1527.method840(false, arg1);
    }
}
