import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class346 {

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Z")
    public static boolean field4421 = false;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Lme;")
    public static class668 field4418 = new class668(20);

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field4423 = 0;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1990(int arg0, int arg1) {
        field4420++;
        String var2 = Integer.toString(arg1);
        int var3 = -86 % ((14 - arg0) / 60);
        for (int var4 = var2.length() - 3; var4 > 0; var4 -= 3) {
            var2 = var2.substring(0, var4) + "," + var2.substring(var4);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class604.field8157.method3280((byte) -126, class144.field1890) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class604.field8159.method3280((byte) 87, class144.field1890) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
    public static void method1991(boolean arg0) {
        field4418 = null;
        if (arg0) {
            method1991(true);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIILpe;)Lsga;")
    public static final class547 method1992(int arg0, int arg1, int arg2, class615 arg3) {
        field4419++;
        byte[] var4 = arg3.method3346(-1, arg2, arg0);
        if (var4 == null) {
            return null;
        } else {
            if (arg1 != 14278) {
                field4418 = null;
            }
            return new class547(var4);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(FFFII)F")
    public static final float method1993(float arg0, float arg1, float arg2, int arg3, int arg4) {
        field4422++;
        int var5 = -82 % ((arg3 - 27) / 35);
        float[] var6 = class480.field6395[arg4];
        return var6[2] * arg1 + var6[0] * arg2 + var6[1] * arg0;
    }
}
