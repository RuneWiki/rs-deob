import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public abstract class class101 {

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1932 = null;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "Lmh;")
    public static class449 field1930;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 12)
    public static void method893(int arg0) {
        if (arg0 <= -95) {
            field1930 = null;
            field1932 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(FIIFIIBFIF[F)V")
    public abstract void method892(float arg0, int arg1, int arg2, float arg3, int arg4, int arg5, byte arg6, float arg7, int arg8, float arg9, float[] arg10);
}
