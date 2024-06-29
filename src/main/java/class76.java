import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class76 {

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public int field896 = 0;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "[F")
    public static float[] field894 = new float[16384];

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "[F")
    public static float[] field897 = new float[16384];

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Ltt;")
    public static class338 field899;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "[[I")
    public static int[][] field900;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "F")
    public static float field898;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Lga;")
    public static class332 field901;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lio;I)V")
    public final void method417(class157 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field895++;
        while (true) {
            int var3 = arg0.method930(255);
            if (var3 == 0) {
                return;
            }
            this.method419(var3, 119, arg0);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
    public static void method418(boolean arg0) {
        field899 = null;
        field894 = null;
        field901 = null;
        field900 = null;
        if (!arg0) {
            field897 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILio;)V")
    private final void method419(int arg0, int arg1, class157 arg2) {
        if (arg1 < 91) {
            this.method419(-34, -108, null);
        }
        if (arg0 == 5) {
            this.field896 = arg2.method963(-120);
        }
        field893++;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field894[var2] = (float) Math.sin((double) var2 * var0);
            field897[var2] = (float) Math.cos((double) var2 * var0);
        }
        field899 = new class338(82, 1);
        field900 = new int[6][];
    }
}
