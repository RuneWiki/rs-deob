import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class537 {

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "Lqk;")
    public static class148 field7513 = new class148(41, 3);

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "I")
    public static int field7512;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V")
    public static void method3197(int arg0) {
        if (arg0 <= 110) {
            method3198(-50, -1.1376263F, -1.724241F, 1.4267334F, 122);
        }
        field7513 = null;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(IFFFI)F")
    public static final float method3198(int arg0, float arg1, float arg2, float arg3, int arg4) {
        field7512++;
        if (arg4 >= -116) {
            field7513 = null;
        }
        float[] var5 = class532.field7463[arg0];
        return var5[2] * arg2 + var5[1] * arg1 + var5[0] * arg3;
    }
}
