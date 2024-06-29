import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public abstract class class278 {

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "I")
    public static int field3453 = 1400;

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "B")
    public static byte field3454;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(II)V", line = 11)
    public static final void method1623(int arg0, int arg1) {
        class310.field3831.method83((byte) -2, arg0);
        if (arg1 == 1400) {
            field3452++;
        }
    }
}
