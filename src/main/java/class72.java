import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class72 {

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "[F")
    public static float[] field1039 = new float[16384];

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "[F")
    public static float[] field1040 = new float[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field1040[var2] = (float) Math.sin((double) var2 * var0);
            field1039[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
