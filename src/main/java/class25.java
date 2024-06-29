import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class25 {

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public int field431;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Ljava/lang/String;")
    public static String field425;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V", line = 12)
    public static void method215(boolean arg0) {
        field425 = null;
        if (!arg0) {
            method215(true);
        }
    }
}
