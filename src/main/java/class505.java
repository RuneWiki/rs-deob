import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public abstract class class505 {

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field7338 = 0;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "[I")
    public static int[] field7339 = new int[13];

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "Lom;")
    public static class254 field7341;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "[Lit;")
    public static class459[] field7337;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "[[[I")
    public static int[][][] field7340;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 4)
    public static void method3021(int arg0) {
        field7341 = null;
        if (arg0 != 18321) {
            method3021(-93);
        }
        field7339 = null;
        field7340 = null;
        field7337 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIBFIF[FFIF)V")
    public abstract void method1(int arg0, int arg1, int arg2, byte arg3, float arg4, int arg5, float arg6, float[] arg7, float arg8, int arg9, float arg10);
}
