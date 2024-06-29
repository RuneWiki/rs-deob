import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class453 {

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field6485 = -1;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIZII)Lvi;")
    public static final class633 method2613(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field6484++;
        class633 var5 = new class633();
        if (arg0 != 1) {
            field6485 = 32;
        }
        var5.field8921 = arg3;
        var5.field8920 = arg1;
        class14.field117.method3671(false, var5, (long) arg4);
        class346.method2063(24329, arg1);
        class452 var6 = class92.method464(arg4, arg0 ^ 0xF5FF3771);
        if (var6 != null) {
            class130.method741(var6, arg0 + 26033);
        }
        if (class250.field3132 != null) {
            class130.method741(class250.field3132, 26034);
            class250.field3132 = null;
        }
        class571.method3226(45);
        if (var6 != null) {
            class8.method50(!arg2, var6, -17006);
        }
        if (!arg2) {
            class281.method1637(arg1);
        }
        if (!arg2 && class209.field2466 != -1) {
            class633.method3561(false, class209.field2466, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method2614(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 <= 81) {
            method2614(67, -69, 47, 43, -113, 90, -25, -122, 64);
        }
        field6487++;
        if (class255.method1506(arg2, (byte) 113)) {
            if (class483.field6965[arg2] == null) {
                class446.method2588(-128, arg1, arg5, arg0, class102.field1106[arg2], arg7, arg8, -1, arg4, arg6);
            } else {
                class446.method2588(-128, arg1, arg5, arg0, class483.field6965[arg2], arg7, arg8, -1, arg4, arg6);
            }
        } else if (arg7 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class313.field3894[var9] = true;
            }
        } else {
            class313.field3894[arg7] = true;
        }
    }
}
