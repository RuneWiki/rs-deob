import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class69 {

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "[F")
    public static float[] field859 = new float[16384];

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "[F")
    public static float[] field860 = new float[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field860[var2] = (float) Math.sin((double) var2 * var0);
            field859[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
