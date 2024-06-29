import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class307 {

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "Loh;")
    public static class258 field5211 = class153.method1046(": ", 94);

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "[I")
    public static int[] field5212 = new int[50];

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Loh;")
    public static class258 field5214 = class153.method1046("<col=00ffff>", 87);

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Loh;")
    public static class258 field5215 = class153.method1046("mapflag", 108);

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "[[B")
    public static byte[][] field5216 = new byte[250][];

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field5217 = 0;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)I", line = 5)
    public static int method2139(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V", line = 25)
    public static void method2140(byte arg0) {
        field5215 = null;
        field5211 = null;
        field5212 = null;
        field5214 = null;
        field5216 = (byte[][]) null;
        if (arg0 != 69) {
            method2141(31, (class157[]) null);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I[Lgd;)V", line = 38)
    public static final void method2141(int arg0, class157[] arg1) {
        class13.field168[arg0] = arg1;
    }
}
