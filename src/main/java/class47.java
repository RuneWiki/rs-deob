import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class47 {

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Lwb;")
    public static class130 field1259 = class26.method212("@red@", -32376);

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Lwb;")
    public static class130 field1256 = class26.method212("Ein kostenloses Spielkonto erstellen)3", -32376);

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Lwb;")
    private static class130 field1254 = class26.method212("Your account has been disabled)3", -32376);

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Lwb;")
    public static class130 field1262 = class26.method212("@gr2@", -32376);

    @OriginalMember(owner = "client!he", name = "j", descriptor = "Lwb;")
    public static class130 field1263 = field1254;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field1265 = 0;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "Lwb;")
    public static class130 field1261 = class26.method212("Das ist eine Mitglieder)2Welt(Q", -32376);

    @OriginalMember(owner = "client!he", name = "n", descriptor = "B")
    public static byte field1267 = 0;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field1258 = 1;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "[I")
    public static int[] field1269 = new int[500];

    @OriginalMember(owner = "client!he", name = "r", descriptor = "Lwb;")
    private static class130 field1271 = class26.method212("Loaded wordpack", -32376);

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Lwb;")
    public static class130 field1257 = field1271;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "Lwb;")
    public static class130 field1270 = class26.method212("Konfig geladen)3", -32376);

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Lce;")
    public static class18 field1255;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "Lac;")
    public static class4 field1272;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "[I")
    public static int[] field1260;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V", line = 53)
    public static void method421(byte arg0) {
        field1269 = null;
        field1259 = null;
        field1257 = null;
        field1255 = null;
        field1271 = null;
        field1261 = null;
        if (arg0 != 63) {
            method421((byte) 92);
        }
        field1263 = null;
        field1254 = null;
        field1270 = null;
        field1272 = null;
        field1260 = null;
        field1262 = null;
        field1256 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V", line = 102)
    public static final void method422(boolean arg0) {
        field1268++;
        for (class85 var1 = (class85) class41.field1155.method813(66); var1 != null; var1 = (class85) class41.field1155.method814((byte) -19)) {
            if (class71.field1818 != var1.field2038 || var1.field2032) {
                var1.method714((byte) -103);
            } else if (class130.field3128 >= var1.field2042) {
                var1.method640(class31.field860, -1);
                if (var1.field2032) {
                    var1.method714((byte) -82);
                } else {
                    class79.field1926.method267(var1.field2038, var1.field2036, var1.field2025, var1.field2033, 60, var1, 0, -1, false);
                }
            }
        }
        if (!arg0) {
            field1272 = null;
        }
    }
}
