import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class413 {

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "Lcga;")
    public static class449 field5285 = new class449(12, 2);

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field5289 = new String[200];

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "Z")
    public static boolean field5288 = false;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5287;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V")
    public static void method2310(byte arg0) {
        field5289 = null;
        if (arg0 <= 40) {
            method2310((byte) -44);
        }
        field5285 = null;
        field5287 = null;
    }
}
