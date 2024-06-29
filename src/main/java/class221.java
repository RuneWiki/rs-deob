import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class221 {

    @OriginalMember(owner = "client!js", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3181 = null;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "S")
    public static short field3182 = 256;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "Lqi;")
    public static class406 field3183 = new class406(512);

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)V")
    public static void method1367(boolean arg0) {
        field3181 = null;
        if (!arg0) {
            method1367(true);
        }
        field3183 = null;
    }
}
