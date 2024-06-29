import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class class323 {

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Z")
    public static final boolean method2006(int arg0, int arg1) {
        if (arg1 >= -125) {
            return true;
        } else {
            field4446++;
            return arg0 == 6 || arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FIF[FIIFIZFI)V")
    public abstract void method1842(float arg0, int arg1, float arg2, float[] arg3, int arg4, int arg5, float arg6, int arg7, boolean arg8, float arg9, int arg10);
}
