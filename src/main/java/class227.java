import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class227 {

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "[F")
    public static float[] field3376 = new float[16384];

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "[F")
    public static float[] field3377 = new float[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field3377[var2] = (float) Math.sin((double) var2 * var0);
            field3376[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
