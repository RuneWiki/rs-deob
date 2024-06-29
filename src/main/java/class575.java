import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class575 {

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field8087 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public static int field8090 = 0;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "F")
    public static float field8086;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    public static int field8088;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public static int field8089;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIIBI)V", line = 3)
    public static final void method3297(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        if (arg6 != 85) {
            return;
        }
        field8089++;
        if (arg1 == arg4) {
            class365.method2112(arg1, arg7, arg2, arg3, (byte) 107, arg5, arg0);
        } else if (arg5 - arg1 >= class667.field9373 && arg1 + arg5 <= class225.field2994 && arg7 - arg4 >= class546.field7619 && class760.field10606 >= arg7 + arg4) {
            class634.method3553(arg2, arg3, arg1, -64, arg7, arg0, arg4, arg5);
        } else {
            class589.method3346(arg4, arg2, arg3, arg0, arg5, arg7, arg6 ^ 0xFFFFFFA8, arg1);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)V", line = 31)
    public static void method3298(boolean arg0) {
        field8087 = null;
        if (!arg0) {
            method3297(24, -74, 72, 113, 28, 29, (byte) -6, 87);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IZ)Z", line = 45)
    public static final boolean method3299(int arg0, boolean arg1) {
        if (arg1) {
            field8088++;
            return arg0 == 7 || arg0 == 8 || arg0 == 9;
        } else {
            return true;
        }
    }
}
