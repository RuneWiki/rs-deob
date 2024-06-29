import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class282 extends class69 {

    @OriginalMember(owner = "client!eba", name = "n", descriptor = "Ljava/lang/String;")
    public String field4042;

    @OriginalMember(owner = "client!eba", name = "o", descriptor = "Z")
    public static boolean field4043 = true;

    @OriginalMember(owner = "client!eba", name = "j", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!eba", name = "k", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!eba", name = "l", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!eba", name = "m", descriptor = "Lhw;")
    public static class300 field4041;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V", line = 6)
    public static void method1832(byte arg0) {
        if (arg0 <= 18) {
            field4041 = null;
        }
        field4041 = null;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIFI[BLnh;IIFFFFB)V", line = 17)
    public static final void method1833(int arg0, int arg1, float arg2, int arg3, byte[] arg4, class551 arg5, int arg6, int arg7, float arg8, float arg9, float arg10, float arg11, byte arg12) {
        if (arg12 != 77) {
            field4041 = null;
        }
        for (int var13 = 0; var13 < arg3; var13++) {
            class194.method1270(arg10, arg0, arg12 ^ 0xFF4D, arg9, arg3, arg8, arg6, var13, arg5, arg11, arg1, arg7, arg4, arg2);
            arg0 += arg1 * arg6;
        }
        field4038++;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)[Loe;", line = 37)
    public static final class15[] method1834(int arg0) {
        field4039++;
        return arg0 == 0 ? new class15[] { class568.field8007, class636.field8913, class446.field6251 } : null;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZB)Z", line = 48)
    public static final boolean method1835(boolean arg0, byte arg1) {
        if (arg1 <= 79) {
            field4041 = null;
        }
        field4040++;
        boolean var2 = class111.field1332.method147();
        if (var2 == arg0) {
            return true;
        }
        if (!arg0) {
            class111.field1332.method167();
        } else if (!class111.field1332.method199()) {
            arg0 = false;
        }
        if (arg0 == var2) {
            return false;
        } else {
            class688.field9602.method3503(class688.field9602.field8544, -125, arg0 ? 1 : 0);
            class266.method1738(118);
            return true;
        }
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "()V", line = 85)
    public class282() {
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 87)
    public class282(String arg0) {
        this.field4042 = arg0;
    }
}
