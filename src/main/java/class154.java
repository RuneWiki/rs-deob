import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class154 extends class159 {

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field2507 = 1337;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field2510 = new String[100];

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIII)V", line = 3)
    public static final void method1119(int arg0, int arg1, int arg2, int arg3) {
        field2508++;
        int var4 = class186.field2990.field2560 * arg1 >> 8;
        if (arg2 != var4 && arg3 != -1) {
            class363.method2222((byte) 75, arg3, var4, class199.field3246, false, 0);
            class281.field4250 = true;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V", line = 30)
    public static void method1120(byte arg0) {
        if (arg0 == 126) {
            field2510 = null;
        }
    }
}
