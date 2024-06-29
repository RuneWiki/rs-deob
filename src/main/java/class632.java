import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class632 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "[F")
    public static float[] field9087 = new float[16384];

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "[I")
    public static int[] field9090 = new int[3];

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "[F")
    public static float[] field9089 = new float[16384];

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "[I")
    public static int[] field9092 = new int[8];

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field9088;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field9091;

    @OriginalMember(owner = "client!qf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9088++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method3617(int arg0) {
        field9090 = null;
        field9089 = null;
        if (arg0 != 0) {
            method3617(-48);
        }
        field9087 = null;
        field9092 = null;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field9089[var2] = (float) Math.sin((double) var2 * var0);
            field9087[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
