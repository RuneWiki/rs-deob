import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class100 {

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field1388 = 0;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1389 = new String[100];

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1390;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method771(int arg0) {
        field1390 = null;
        if (arg0 > 126) {
            field1389 = null;
        }
    }
}
