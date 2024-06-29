import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class120 {

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field2638 = 0;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Lod;")
    public static class101 field2640 = class46.method335(75, "m");

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Z")
    public static boolean field2645 = false;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "[I")
    public static int[] field2648 = new int[50];

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Lod;")
    private static class101 field2647 = class46.method335(73, "purple:");

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "Lod;")
    public static class101 field2650 = class46.method335(77, "cross");

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Lod;")
    public static class101 field2644 = field2647;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "[[I")
    public static int[][] field2651 = new int[104][104];

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Lod;")
    private static class101 field2642 = class46.method335(-68, "Hidden");

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Lod;")
    public static class101 field2639 = field2647;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "Lod;")
    public static class101 field2643 = field2642;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lac;I)V")
    public static final void method900(class4 arg0, int arg1) {
        arg0.field61 = false;
        if (arg0.field60 != null) {
            arg0.field60.field921 = 0;
        }
        field2649++;
        int var2 = 10 / ((-arg1 - 73) / 37);
        for (class4 var3 = arg0.method18(); var3 != null; var3 = arg0.method15()) {
            method900(var3, -124);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
    public static void method901(boolean arg0) {
        if (!arg0) {
            return;
        }
        field2650 = null;
        field2642 = null;
        field2647 = null;
        field2644 = null;
        field2643 = null;
        field2651 = null;
        field2640 = null;
        field2639 = null;
        field2648 = null;
    }
}
