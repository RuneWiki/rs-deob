import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class268 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4299;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static void method1757(byte arg0) {
        if (arg0 <= 107) {
            field4298 = -26;
        }
        field4299 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lbj;B)Lra;")
    public static final class122 method1758(class215 arg0, byte arg1) {
        field4301++;
        if (arg1 >= -27) {
            field4298 = -127;
        }
        return new class122(arg0.method1356(false), arg0.method1356(false), arg0.method1356(false), arg0.method1356(false), arg0.method1403(6591), arg0.method1374((byte) -60));
    }
}
