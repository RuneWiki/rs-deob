import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class9 {

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field85 = 0;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)Ljava/lang/String;")
    public static final String method47(int arg0) {
        field84++;
        if (arg0 <= 97) {
            method47(41);
        }
        String var1 = "www";
        if (class573.field7904 == class172.field2390) {
            var1 = "www-wtrc";
        } else if (class629.field8454 == class172.field2390) {
            var1 = "www-wtqa";
        } else if (class439.field6122 == class172.field2390) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class237.field3514 != null) {
            var2 = "/p=" + class237.field3514;
        }
        return "http://" + var1 + "." + class289.field4140.field7714 + ".com/l=" + class120.field1576 + "/a=" + class593.field8043 + var2 + "/";
    }
}
