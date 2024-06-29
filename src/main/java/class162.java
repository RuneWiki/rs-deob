import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class162 {

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "Ldv;")
    public static class566 field2360 = new class566(9, -1);

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public static void method1038(int arg0) {
        if (arg0 > 22) {
            field2360 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(FFIF)I")
    public static final int method1039(float arg0, float arg1, int arg2, float arg3) {
        if (arg2 != -11878) {
            return -43;
        }
        field2361++;
        float var4 = (arg3 < 0.0F) ? -arg3 : arg3;
        float var5 = arg1 < 0.0F ? -arg1 : arg1;
        float var6 = (arg0 < 0.0F) ? -arg0 : arg0;
        if (var5 > var4 && var6 < var5) {
            return (arg1 > 0.0F) ? 0 : 1;
        } else if (var4 < var6 && var5 < var6) {
            return arg0 > 0.0F ? 2 : 3;
        } else if (arg3 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }
}
