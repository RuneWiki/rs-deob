import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class374 {

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "[F")
    public static float[] field5309 = new float[16384];

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "[F")
    public static float[] field5308 = new float[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field5308[var2] = (float) Math.sin((double) var2 * var0);
            field5309[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
