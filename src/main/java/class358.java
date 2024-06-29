import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class358 {

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "F")
    public static float field4773 = 0.25F;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)Z")
    public static final boolean method2016(int arg0, int arg1) {
        field4770++;
        if (arg1 >= -85) {
            method2016(-64, -64);
        }
        return arg0 == 59 || arg0 == 3 || arg0 == 1007 || arg0 == 19 || arg0 == 11;
    }
}
