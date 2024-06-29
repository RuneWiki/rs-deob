import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 {

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field49 = -1;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IBI)Z")
    public static final boolean method17(int arg0, byte arg1, int arg2) {
        if (arg1 != -67) {
            method17(102, (byte) -23, -84);
        }
        field50++;
        return (arg2 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static final void method18(int arg0) {
        field48++;
        if (class566.field7989 != null) {
            class566.field7989.method507((byte) -128);
        }
        if (class188.field2264 != null) {
            class188.field2264.method507((byte) -78);
        }
        if (arg0 != 22696) {
            method18(-42);
        }
    }
}
