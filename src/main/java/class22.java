import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class22 {

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Ljava/lang/String;")
    public static String field328 = "flash2:";

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Lja;")
    public static class59 field329;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
    public static void method188(boolean arg0) {
        field328 = null;
        field329 = null;
        if (!arg0) {
            field327 = -79;
        }
    }
}
