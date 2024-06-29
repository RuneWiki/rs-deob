import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class476 {

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "Lcw;")
    public static class179 field6808 = new class179("game3", 2);

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "Lnt;")
    public static class220 field6811 = new class220();

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "I")
    public static int field6809;

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "Ljava/applet/Applet;")
    public static Applet field6812;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(B)V")
    public static void method2869(byte arg0) {
        field6811 = null;
        int var1 = -33 % ((arg0 - 4) / 59);
        field6808 = null;
        field6812 = null;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZIIIIIFI)[I")
    public static final int[] method2870(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, int arg7) {
        field6809++;
        int[] var8 = new int[arg4];
        class313 var9 = new class313();
        var9.field4431 = (int) (arg6 * 4096.0F);
        var9.field4425 = arg1;
        var9.field4416 = arg0;
        var9.field4419 = arg5;
        int var10 = -105 / ((arg7 + 48) / 33);
        var9.field4422 = arg3;
        var9.field4430 = arg2;
        var9.method121(false);
        class458.method2795(1, -1, arg4);
        var9.method2026(0, var8, 2);
        return var8;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Z)V")
    public static final void method2871(boolean arg0) {
        field6810++;
        class37.field552.method4204((byte) -55);
        class380.field5294.method4204((byte) -107);
        if (arg0) {
            method2870(false, 46, -38, -69, -34, -125, -0.31679413F, -50);
        }
    }
}
