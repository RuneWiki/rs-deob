import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class47 extends class425 {

    @OriginalMember(owner = "client!aea", name = "s", descriptor = "I")
    public volatile int field1143 = -1;

    @OriginalMember(owner = "client!aea", name = "m", descriptor = "Ljava/lang/String;")
    public volatile String field1137;

    @OriginalMember(owner = "client!aea", name = "n", descriptor = "[I")
    public static int[] field1138 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!aea", name = "o", descriptor = "[I")
    public static int[] field1139 = new int[50];

    @OriginalMember(owner = "client!aea", name = "p", descriptor = "[I")
    public static int[] field1140 = new int[2048];

    @OriginalMember(owner = "client!aea", name = "k", descriptor = "F")
    public static float field1135;

    @OriginalMember(owner = "client!aea", name = "j", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!aea", name = "r", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!aea", name = "l", descriptor = "Lom;")
    public static class344 field1136;

    @OriginalMember(owner = "client!aea", name = "q", descriptor = "[Lf;")
    public static class702[] field1141;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILcd;)Z")
    public static final boolean method597(int arg0, class288 arg1) {
        field1134++;
        if (arg0 != 50) {
            return true;
        } else if (arg1 == null) {
            return false;
        } else if (!arg1.field4311) {
            return false;
        } else if (!arg1.method1923(class407.field5870, 31846)) {
            return false;
        } else if (class364.field5409.method2596((long) arg1.field4294, 80) == null) {
            return class480.field6895.method2596((long) arg1.field4320, 49) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)V")
    public static void method598(byte arg0) {
        field1138 = null;
        field1141 = null;
        field1140 = null;
        int var1 = -115 % ((arg0 + 58) / 36);
        field1136 = null;
        field1139 = null;
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class47(String arg0) {
        this.field1137 = arg0;
    }
}
