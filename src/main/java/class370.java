import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class370 {

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V")
    public static final void method2127(byte arg0) {
        field4765++;
        for (class360 var1 = (class360) class368.field4759.method3672(-1); var1 != null; var1 = (class360) class368.field4759.method3662(-1)) {
            class163 var2 = var1.field4658;
            if (var2.field2259) {
                var1.method1175(-2);
                var2.method1141(true);
            } else if (class463.field6224 >= var2.field2246) {
                var2.method1138(-63, class602.field8367);
                if (var2.field2259) {
                    var1.method1175(-2);
                } else {
                    class582.method3315(var2, true);
                }
            }
        }
        if (arg0 < 122) {
            method2127((byte) -3);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(FFZF)F")
    public static final float method2128(float arg0, float arg1, boolean arg2, float arg3) {
        if (arg2) {
            return -0.27318746F;
        } else {
            field4764++;
            return (arg0 - arg1) * arg3 + arg1;
        }
    }
}
