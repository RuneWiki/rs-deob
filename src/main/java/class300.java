import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class300 {

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "[F")
    public static float[] field4123 = new float[16384];

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "[F")
    public static float[] field4124 = new float[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4123[var2] = (float) Math.sin((double) var2 * var0);
            field4124[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
