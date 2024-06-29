import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public abstract class class314 extends class55 {

    @OriginalMember(owner = "client!hfa", name = "k", descriptor = "Z")
    public static boolean field4236 = true;

    @OriginalMember(owner = "client!hfa", name = "m", descriptor = "I")
    public static int field4238 = 0;

    @OriginalMember(owner = "client!hfa", name = "n", descriptor = "Z")
    public static boolean field4239 = false;

    @OriginalMember(owner = "client!hfa", name = "l", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)I")
    public abstract int method1875(int arg0);

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "(I)I")
    public abstract int method1876(int arg0);

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)Ljava/lang/String;")
    public static final String method1877(byte arg0) {
        if (arg0 >= -28) {
            return null;
        }
        field4237++;
        String var1 = "www";
        if (class472.field6539 == class200.field2376) {
            var1 = "www-wtrc";
        } else if (class83.field1165 == class200.field2376) {
            var1 = "www-wtqa";
        } else if (class522.field7046 == class200.field2376) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class734.field10237 != null) {
            var2 = "/p=" + class734.field10237;
        }
        return "http://" + var1 + "." + class51.field541.field3144 + ".com/l=" + class723.field10095 + "/a=" + class586.field8204 + var2 + "/";
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Z)J")
    public abstract long method1878(boolean arg0);

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "(I)I")
    public abstract int method1879(int arg0);

    @OriginalMember(owner = "client!hfa", name = "e", descriptor = "(I)I")
    public abstract int method1880(int arg0);
}
