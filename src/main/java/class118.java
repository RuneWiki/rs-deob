import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class118 {

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
    public static int field1356 = 0;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field1353 = new String[200];

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "Lpca;")
    public static class653 field1354 = new class653(8);

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V", line = 10)
    public static void method708(int arg0) {
        field1354 = null;
        if (arg0 != -6123) {
            method708(-111);
        }
        field1353 = null;
    }
}
