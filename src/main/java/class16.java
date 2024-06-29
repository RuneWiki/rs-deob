import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class16 {

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field236 = 0;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "Ljava/lang/String;")
    public static String field234 = "cyan:";

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field232 = "Loaded world list data";

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "Lha;")
    public static class267 field235;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "[Lij;")
    public static class69[] field231;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "[[[Lok;")
    public static class131[][][] field233;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V")
    public static final void method122(int arg0, int arg1, int arg2) {
        field230++;
        class270 var3 = class190.method1213(25702, arg1, arg0);
        var3.method1808((byte) 62);
        var3.field4226 = arg2;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public static void method123(int arg0) {
        field231 = null;
        field235 = null;
        if (arg0 == 0) {
            field233 = null;
            field232 = null;
            field234 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method124(byte arg0, String arg1) {
        field237++;
        if (arg0 != 19) {
            field231 = null;
        }
        return class175.method1148((byte) 106, arg1, true, 10);
    }
}
