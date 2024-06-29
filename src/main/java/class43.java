import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class43 extends class270 {

    @OriginalMember(owner = "client!na", name = "m", descriptor = "Lmfa;")
    public class562 field451 = new class562();

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "[B")
    public static byte[] field454;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(III)Z", line = 13)
    public static final boolean method216(int arg0, int arg1, int arg2) {
        field453++;
        if (arg2 == 2048) {
            return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 25)
    public static void method217(int arg0) {
        if (arg0 != 21682) {
            field452 = -72;
        }
        field454 = null;
    }
}
