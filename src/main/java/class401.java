import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class401 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "[F")
    public static float[] field5867 = new float[16384];

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "[F")
    public static float[] field5868 = new float[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field5867[var2] = (float) Math.sin((double) var2 * var0);
            field5868[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
