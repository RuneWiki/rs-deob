import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class326 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Lqw;")
    public static class71 field4503 = new class71(0, 7);

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Lqw;")
    public static class71 field4504 = new class71(13, 7);

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "[F")
    public static float[] field4506 = new float[16384];

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "[F")
    public static float[] field4507 = new float[16384];

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "S")
    public static short field4509;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method1960(int arg0, int arg1, int arg2) {
        field4508++;
        int var3 = arg1 - arg0;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (~var3 > arg2) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
    public static void method1961(byte arg0) {
        field4506 = null;
        field4504 = null;
        if (arg0 > 15) {
            field4507 = null;
            field4503 = null;
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4507[var2] = (float) Math.sin((double) var2 * var0);
            field4506[var2] = (float) Math.cos((double) var2 * var0);
        }
        field4509 = 32767;
    }
}
