import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public abstract class class294 {

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "F")
    public static float field4169 = 1024.0F;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "[[B")
    public static byte[][] field4168;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(F[FIIIIIIFFF)V")
    public abstract void method1891(float arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float arg8, float arg9, float arg10);

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)Z")
    public static final boolean method1892(int arg0, int arg1) {
        field4171++;
        if (arg1 > -95) {
            field4169 = 0.56644154F;
        }
        return arg0 == 1 || arg0 == 3 || arg0 == 5;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V")
    public static void method1893(boolean arg0) {
        field4168 = null;
        if (arg0) {
            field4169 = 2.0797677F;
        }
    }
}
