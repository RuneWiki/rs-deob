import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class303 {

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "[F")
    public static float[] field4032 = new float[16384];

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "[F")
    public static float[] field4033 = new float[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4033[var2] = (float) Math.sin((double) var2 * var0);
            field4032[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
