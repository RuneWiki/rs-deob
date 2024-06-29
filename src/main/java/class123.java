import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class123 {

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "[F")
    public static float[] field1392 = new float[16384];

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "[F")
    public static float[] field1391 = new float[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field1391[var2] = (float) Math.sin((double) var2 * var0);
            field1392[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
