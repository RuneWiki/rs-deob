import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class196 {

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field2892 = 1400;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "Z")
    public static boolean field2896 = false;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "F")
    public static float field2898;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public int field2894;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public int field2895;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public int field2899;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public int field2900;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "Lsg;")
    public static class337 field2893;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "Lqi;")
    public static class487 field2901;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)V")
    public static final void method1322(byte arg0, int arg1) {
        if (arg0 != 25) {
            method1322((byte) 26, 75);
        }
        if (class423.field5715 == null || arg1 > class423.field5715.length) {
            class423.field5715 = new int[arg1];
        }
        field2897++;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public static void method1323(byte arg0) {
        field2893 = null;
        field2901 = null;
        if (arg0 != -38) {
            method1323((byte) 60);
        }
    }
}
