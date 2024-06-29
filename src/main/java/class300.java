import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class300 extends class240 {

    @OriginalMember(owner = "client!no", name = "n", descriptor = "I")
    public static int field4466 = 2;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "I")
    public static int field4465 = 0;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "I")
    public static int field4469 = 0;

    @OriginalMember(owner = "client!no", name = "o", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IBIIZ)V", line = 3)
    public static final void method1887(int arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        field4467++;
        if (class480.method2837((byte) -74, arg3)) {
            if (arg1 != -23) {
                method1887(71, (byte) -90, -64, 36, false);
            }
            class63.method325(arg0, -44, -1, arg2, arg4, class284.field4130[arg3]);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZLso;)Z", line = 19)
    public static final boolean method1888(boolean arg0, class334 arg1) {
        field4468++;
        if (arg1 == null) {
            return false;
        } else if (!arg0) {
            return true;
        } else if (!arg1.field4805) {
            return false;
        } else if (!arg1.method2026(2, class429.field6181)) {
            return false;
        } else if (class282.field4112.method233(64, (long) arg1.field4800) == null) {
            return class414.field5910.method233(-127, (long) arg1.field4795) == null;
        } else {
            return false;
        }
    }
}
