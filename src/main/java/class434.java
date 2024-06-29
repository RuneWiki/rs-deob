import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class434 {

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "[F")
    public static float[] field6138 = new float[16384];

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "[F")
    public static float[] field6139 = new float[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field6139[var2] = (float) Math.sin((double) var2 * var0);
            field6138[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
