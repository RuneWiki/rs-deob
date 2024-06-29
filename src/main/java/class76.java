import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class76 {

    @OriginalMember(owner = "client!md", name = "m", descriptor = "Lv;")
    public static class122 field2047 = class55.method425(-74, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Lv;")
    private static class122 field2036 = class55.method425(-107, "No reply from loginserver)3");

    @OriginalMember(owner = "client!md", name = "h", descriptor = "J")
    public static long field2042 = 0L;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "Lv;")
    public static class122 field2048 = class55.method425(-49, "60 Sekunden noch einmal)3)3)3");

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Lv;")
    public static class122 field2040 = field2036;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "Lv;")
    private static class122 field2044 = class55.method425(-56, "wave:");

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Lv;")
    public static class122 field2037 = field2044;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Lv;")
    public static class122 field2041 = class55.method425(-86, "Ihre Freunde)2Liste ist voll(Q Mitglieder k\u001c1nnen 200 Freunde hinzuf\u001c1gen)1 freie Spieler nur 100)3");

    @OriginalMember(owner = "client!md", name = "l", descriptor = "Lv;")
    public static class122 field2046 = class55.method425(-93, "scrollen:");

    @OriginalMember(owner = "client!md", name = "k", descriptor = "Lv;")
    public static class122 field2045 = class55.method425(-64, "welle:");

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "[I")
    public static int[] field2035;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "[[Lfe;")
    public static class36[][] field2039;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V", line = 10)
    public static void method640(int arg0) {
        if (arg0 != -18255) {
            field2037 = null;
        }
        field2036 = null;
        field2037 = null;
        field2046 = null;
        field2047 = null;
        field2035 = null;
        field2045 = null;
        field2044 = null;
        field2039 = null;
        field2040 = null;
        field2041 = null;
        field2048 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)V", line = 48)
    public static final void method641(int arg0, boolean arg1) {
        field2043++;
        if (class44.field1156 == arg0) {
            return;
        }
        if (class44.field1156 == 0) {
            class33.method294(-1);
        }
        if (arg0 == 20 || arg0 == 40) {
            class103.field2568 = 0;
            class34.field854 = 0;
            class67.field1714 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && class81.field2122 != null) {
            class81.field2122.method586(99);
        }
        if (class44.field1156 == 25 || class44.field1156 == 40) {
            class122.method964((byte) -97);
            class117.method896();
        }
        if (class44.field1156 == 25) {
            class7.field174 = 0;
            class50.field1279 = 1;
            class19.field476 = 0;
            client.field458 = 0;
            class26.field701 = 1;
        }
        if (arg0 == 0 || arg0 == 35) {
            class70.method574(true);
            class74.method622(false);
            if (class47.field1223 == null) {
                class47.field1223 = class74.method616(class54.field1411, 503, 765, 1);
            }
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class47.field1223 = null;
            class70.method574(true);
            class73.method597(class16.field397, class54.field1411, (byte) -93, class70.field1845);
        }
        if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
            class47.field1223 = null;
            class74.method622(!arg1);
            class56.method433(class16.field397, class54.field1411, (byte) 92);
        }
        class81.field2121 = arg1;
        class44.field1156 = arg0;
    }
}
