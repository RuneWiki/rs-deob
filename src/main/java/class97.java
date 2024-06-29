import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class97 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "[F")
    public static float[] field1205 = new float[16384];

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "[F")
    public static float[] field1206 = new float[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field1206[var2] = (float) Math.sin((double) var2 * var0);
            field1205[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
