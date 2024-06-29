import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class286 {

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field4593 = 0;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4596 = "Face here";

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field4598 = 0;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "Lpg;")
    public static class435 field4594;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static void method1938(int arg0) {
        if (arg0 >= -19) {
            method1939((byte) -125);
        }
        field4596 = null;
        field4594 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)I")
    public static final int method1939(byte arg0) {
        if (arg0 <= 103) {
            method1938(94);
        }
        field4595++;
        return 15;
    }
}
