import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class145 extends class117 {

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "Ljava/lang/String;")
    public String field2092;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field2090 = 0;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "[I")
    public static int[] field2093 = new int[500];

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field2097 = 0;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public static int field2096 = -1;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field2095 = 0;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "[I")
    public static int[] field2091;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V", line = 7)
    public static void method1037(boolean arg0) {
        if (arg0) {
            field2091 = null;
            field2093 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V", line = 38)
    public class145() {
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 40)
    public class145(String arg0) {
        this.field2092 = arg0;
    }
}
