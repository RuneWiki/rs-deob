import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class197 {

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "[F")
    public static float[] field2640 = new float[16384];

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "[F")
    public static float[] field2641 = new float[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field2640[var2] = (float) Math.sin((double) var2 * var0);
            field2641[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
