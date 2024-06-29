import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public abstract class class385 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Ltu;")
    public static class7 field5063 = new class7();

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "[I")
    public static int[] field5064 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "[Z")
    public static boolean[] field5068 = new boolean[8];

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5066;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "[I")
    public static int[] field5065;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 3)
    public static void method2301(int arg0) {
        if (arg0 > -94) {
            return;
        }
        field5068 = null;
        field5064 = null;
        field5066 = null;
        field5065 = null;
        field5063 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(FIFIF[FIIFII)V")
    public abstract void method1399(float arg0, int arg1, float arg2, int arg3, float arg4, float[] arg5, int arg6, int arg7, float arg8, int arg9, int arg10);
}
