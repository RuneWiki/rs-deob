import java.awt.Component;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class253 {

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Le;")
    public static class191 field4475 = class54.method368("::rebuild", 2047);

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Le;")
    public static class191 field4478 = class54.method368("Freie Welt", 2047);

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "Le;")
    private static class191 field4477 = class54.method368("Hidden", 2047);

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Le;")
    public static class191 field4474 = class54.method368("(U3", 2047);

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "Le;")
    public static class191 field4476 = class54.method368("blinken1:", 2047);

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "[I")
    public static int[] field4480 = new int[50];

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "Le;")
    public static class191 field4485 = class54.method368("<col=00ff80>", 2047);

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "Z")
    public static boolean field4484 = false;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "Le;")
    public static class191 field4482 = class54.method368("slr2)3ws?order=LPWM", 2047);

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field4486 = 0;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "Le;")
    public static class191 field4488 = field4477;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "Lng;")
    public static class121 field4491;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "[I")
    public static int[] field4489;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1755(Component arg0, int arg1) {
        arg0.addMouseListener(class17.field226);
        arg0.addMouseMotionListener(class17.field226);
        if (arg1 != 100) {
            field4489 = null;
        }
        arg0.addFocusListener(class17.field226);
        field4481++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
    public static final void method1756(boolean arg0) {
        field4487++;
        if (browsercontrol.iscreated()) {
            browsercontrol.hide();
        }
        class59.method399(93, class51.field909);
        class127.method859(0, class51.field909);
        if (class162.field2737 != null) {
            class162.field2737.method1208(true, class51.field909);
        }
        class268.method1837(-19769);
        if (arg0) {
            return;
        }
        class266.method1831(class51.field909, (byte) 12);
        method1755(class51.field909, 100);
        if (class162.field2737 != null) {
            class162.field2737.method1210(0, class51.field909);
        }
        class119.method791((byte) 71);
        class75.field1279 = 0L;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method1757(int arg0) {
        field4489 = null;
        field4476 = null;
        field4478 = null;
        field4480 = null;
        field4488 = null;
        field4477 = null;
        field4491 = null;
        field4475 = null;
        if (arg0 != 0) {
            field4474 = null;
        }
        field4485 = null;
        field4474 = null;
        field4482 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)V")
    public static final void method1758(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4490++;
        class7.method54(arg0, arg3, arg0 + arg1, arg2 + arg3);
        class7.method55(arg0, arg3, arg1, arg2, arg4);
        if (class209.field3714 < 100) {
            return;
        }
        if (class154.field2655 == null || class154.field2655.field4075 != arg1 || class154.field2655.field4073 != arg2) {
            class155 var5 = new class155(arg1, arg2);
            class7.method43(var5.field2656, arg1, arg2);
            class130.method880(class161.field2728, 0, 0, (byte) 19, 0, arg2, arg1, class189.field3327, 0);
            class154.field2655 = var5;
            class42.field740.method261(arg4);
        }
        class154.field2655.method593(arg0, arg3);
        int var6 = class68.field1198 * arg1 / class189.field3327 + arg0;
        int var7 = class193.field3483 * arg2 / class161.field2728 + arg3;
        int var8 = class224.field3987 * arg1 / class189.field3327;
        int var9 = class132.field2223 * arg2 / class161.field2728;
        class7.method57(var6, var7, var8, var9, 16711680, 128);
        class7.method48(var6, var7, var8, var9, 16711680);
        if (class199.field3561 <= 0 || class199.field3561 % 10 >= 5) {
            return;
        }
        for (class36 var10 = (class36) class226.field4067.method1173(113); var10 != null; var10 = (class36) class226.field4067.method1175(-1)) {
            if (class263.field4655 == var10.field666) {
                int var11 = var10.field664 * arg2 / class161.field2728 + arg3;
                int var12 = var10.field665 * arg1 / class189.field3327 + arg0;
                class7.method55(var12 - 2, var11 + -2, 4, 4, 16776960);
            }
        }
    }
}
