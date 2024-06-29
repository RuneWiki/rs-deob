import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class71 {

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "B")
    public static byte field1007 = -6;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IB)Z")
    public static final boolean method631(int arg0, byte arg1) {
        int var2 = 102 / ((-arg1 - 56) / 54);
        field1009++;
        return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILha;)V")
    public static final void method632(int arg0, class65 arg1) {
        field1008++;
        if (class170.field2272 == class551.field7456.field2250 || class626.field8501 == null) {
            return;
        }
        if (arg0 != 32006) {
            field1007 = -7;
        }
        if (class515.method2994(arg1, class551.field7456.field2250, -3)) {
            class170.field2272 = class551.field7456.field2250;
        }
    }
}
