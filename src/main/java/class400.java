import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public abstract class class400 {

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "Lqfa;")
    public static class85 field5810 = new class85(78, -2);

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "Z")
    public static boolean field5813 = false;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field5811;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "[[[Ldf;")
    public static class370[][][] field5812;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II[FIFIFIFIF)V")
    public abstract void method2176(int arg0, int arg1, float[] arg2, int arg3, float arg4, int arg5, float arg6, int arg7, float arg8, int arg9, float arg10);

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
    public static void method2453(int arg0) {
        field5812 = null;
        field5811 = null;
        int var1 = 51 % ((82 - arg0) / 34);
        field5810 = null;
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)V")
    public static final void method2454(int arg0) {
        field5809++;
        if (class199.field3098 == 7) {
            class85.method852(-120, false);
            return;
        }
        class275.field4099 = class165.field2755;
        if (arg0 >= -72) {
            method2454(-33);
        }
        class165.field2755 = null;
        class118.method1038(13, 1);
    }
}
