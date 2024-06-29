import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class241 {

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3505 = "";

    @OriginalMember(owner = "client!rga", name = "d", descriptor = "Lega;")
    public static class713 field3508 = new class713();

    @OriginalMember(owner = "client!rga", name = "f", descriptor = "[F")
    public static float[] field3510 = new float[16384];

    @OriginalMember(owner = "client!rga", name = "e", descriptor = "[F")
    public static float[] field3509 = new float[16384];

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "I")
    public static int field3507;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field3509[var2] = (float) Math.sin((double) var2 * var0);
            field3510[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(B)V", line = 14)
    public static void method1607(byte arg0) {
        field3508 = null;
        field3510 = null;
        field3505 = null;
        if (arg0 >= -100) {
            method1607((byte) 71);
        }
        field3509 = null;
    }
}
