import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class224 {

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "[F")
    public static float[] field3359 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "Lia;")
    public static class547 field3360 = new class547();

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "[[Z")
    public static boolean[][] field3361;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public static void method1535(byte arg0) {
        if (arg0 < -65) {
            field3361 = null;
            field3359 = null;
            field3360 = null;
        }
    }
}
