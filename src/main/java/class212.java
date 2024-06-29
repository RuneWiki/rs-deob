import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class212 {

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "[F")
    public static float[] field2902 = new float[16384];

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "[F")
    public static float[] field2903 = new float[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field2903[var2] = (float) Math.sin((double) var2 * var0);
            field2902[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
