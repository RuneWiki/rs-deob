import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class180 extends Exception {

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2319 = null;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "Lil;")
    public static class68 field2318 = new class68(64);

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "[[S")
    public static short[][] field2320;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V")
    public static void method1131(byte arg0) {
        field2319 = null;
        field2320 = null;
        field2318 = null;
        if (arg0 != 50) {
            method1131((byte) -88);
        }
    }
}
