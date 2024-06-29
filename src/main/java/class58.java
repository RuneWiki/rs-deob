import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class58 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "[F")
    public static float[] field769 = new float[16384];

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "[F")
    public static float[] field770 = new float[16384];

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field769[var2] = (float) Math.sin((double) var2 * var0);
            field770[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
