import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class190 {

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field2765 = 1;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)Lcw;")
    public static final class96 method1186(boolean arg0) {
        field2767++;
        try {
            if (!arg0) {
                field2764 = -117;
            }
            return (class96) Class.forName("tk").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)Z")
    public static final boolean method1187(int arg0, int arg1, int arg2) {
        field2766++;
        if (arg1 != 0) {
            method1187(-6, -75, -75);
        }
        return (class542.method3196(arg0, arg1 - 15252, arg2) | (arg2 & 0x2000) != 0 | class444.method2811(7971, arg2, arg0)) & class147.method897(arg2, arg0, 55);
    }
}
