import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class547 {

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "F")
    public static float field7717;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
    public static int field7718;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method3226(byte arg0, String arg1) {
        field7718++;
        int var2 = 65 / ((arg0 + 50) / 33);
        return class50.method456(arg1, 10, true, 55);
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)Z")
    public static final boolean method3227(int arg0) {
        field7716++;
        if (arg0 > -65) {
            method3227(-93);
        }
        return class409.field5682 > 0;
    }
}
