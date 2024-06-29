import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class46 extends class86 {

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    public int field730 = 0;

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "I")
    public int field738 = -1;

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "Ljava/lang/String;")
    public static String field734 = " is already on your friend list.";

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
    public int field725;

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "I")
    public int field726;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
    public int field727;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "I")
    public int field728;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
    public int field729;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
    public int field731;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
    public int field733;

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "I")
    public int field735;

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
    public int field736;

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "Lti;")
    public static class5 field737;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "[Llk;")
    public static class83[] field732;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
    public static void method378(byte arg0) {
        field732 = null;
        field737 = null;
        field734 = null;
        int var1 = 117 % ((arg0 + 15) / 46);
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V")
    public static final void method379(byte arg0) {
        class17.field269 = 0;
        class214.field3305 = 0;
        class190.method1283(18817);
        class169.method1131(125);
        field724++;
        class79.method625(20);
        class179.method1190(105);
        if (arg0 >= -88) {
            return;
        }
        for (int var1 = 0; var1 < class214.field3305; var1++) {
            int var3 = class296.field4675[var1];
            if (class267.field4256 != class41.field675[var3].field4161) {
                if (class41.field675[var3].field444 > 0) {
                    class143.method986(class41.field675[var3], 0);
                }
                class41.field675[var3] = null;
            }
        }
        if (class79.field1329 != class239.field3692.field588) {
            throw new RuntimeException("gpp1 pos:" + class239.field3692.field588 + " psize:" + class79.field1329);
        }
        for (int var2 = 0; var2 < class5.field78; var2++) {
            if (class41.field675[class166.field2510[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class5.field78);
            }
        }
    }
}
