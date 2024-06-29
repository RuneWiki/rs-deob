import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class159 {

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "[F")
    public static float[] field2240 = new float[16384];

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "[F")
    public static float[] field2241 = new float[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field2241[var2] = (float) Math.sin((double) var2 * var0);
            field2240[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
