import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class335 {

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field5300 = 0;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5301 = "Please remove ";

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5303 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field5305 = 0;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "[Lim;")
    public static class201[] field5304;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "[Laj;")
    public static class209[] field5299;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V", line = 22)
    public static void method2340(int arg0) {
        field5304 = null;
        if (arg0 < 122) {
            field5303 = (String) null;
        }
        field5303 = null;
        field5301 = null;
        field5299 = null;
    }
}
