import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class252 {

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field3438 = 0;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "Z")
    public static boolean field3437 = false;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "Laa;")
    public static class76 field3436 = new class76(72, 8);

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Z")
    public static final boolean method1506(int arg0, int arg1, int arg2) {
        field3439++;
        return (class524.field7736[1][arg2][arg1] & 0x2) != arg0;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public static void method1507(byte arg0) {
        if (arg0 > -100) {
            method1506(-101, 106, 120);
        }
        field3436 = null;
    }
}
