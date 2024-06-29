import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class347 {

    @OriginalMember(owner = "client!es", name = "a", descriptor = "F")
    public static float field5042;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
    public static final void method2145(boolean arg0) {
        class520.field7335 = new String[500];
        class2.field17 = class467.field6721.field2126 - (-class467.field6721.field2132 - 2);
        field5043++;
        class588.field8242 = class244.field3796.field2132 + class244.field3796.field2126 + 2;
        for (int var1 = 0; var1 < class520.field7335.length; var1++) {
            class520.field7335[var1] = "";
        }
        if (arg0) {
            field5042 = 1.1462911F;
        }
        class262.method1723(true, class274.field4117.method1804(7175, class512.field7203));
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2146(int arg0, String arg1) {
        field5044++;
        if (arg0 != -2) {
            return null;
        } else if (class174.field2478.startsWith("win")) {
            return arg1 + ".dll";
        } else if (class174.field2478.startsWith("linux")) {
            return "lib" + arg1 + ".so";
        } else if (class174.field2478.startsWith("mac")) {
            return "lib" + arg1 + ".dylib";
        } else {
            return null;
        }
    }
}
