import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class146 {

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2153 = "Connection lost.";

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2151 = "shake:";

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "J")
    public static long field2152 = 0L;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "Lch;")
    public static class93 field2154 = class7.method40(0);

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2155 = "Prepared sound engine";

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Z")
    public static boolean field2157 = false;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field2156 = 0;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
    public static void method971(boolean arg0) {
        field2151 = null;
        if (arg0) {
            field2153 = null;
            field2155 = null;
            field2154 = null;
        }
    }
}
