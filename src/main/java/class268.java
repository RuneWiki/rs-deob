import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class268 {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Lcba;")
    public static class471 field3752 = new class471(102, 16);

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZIII)V")
    public static final void method1750(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            field3752 = null;
        }
        class479.field6754.method117(85, arg3);
        field3753++;
        class479.field6754.method91((byte) 88, arg2);
        class479.field6754.method109(arg1, 255);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public static void method1751(byte arg0) {
        if (arg0 == 71) {
            field3752 = null;
        }
    }
}
