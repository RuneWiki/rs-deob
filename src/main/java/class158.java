import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class158 {

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Lvf;")
    private static class265 field2898 = class87.method582(-46, "glow2:");

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Lvf;")
    public static class265 field2901 = field2898;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "Lvf;")
    public static class265 field2906 = class87.method582(-46, "Number of player models in cache:");

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "Lvf;")
    public static class265 field2909 = field2898;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public int field2897;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public int field2899;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public int field2900;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public int field2902;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public int field2903;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public int field2905;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public int field2907;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "[B")
    public byte[] field2904;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "[B")
    public byte[] field2910;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lng;I)V")
    public static final void method1060(class135 arg0, int arg1) {
        for (int var2 = 0; var2 < class16.field464; var2++) {
            int var3 = arg0.method947(27126);
            int var4 = arg0.method927(126);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class252.field4331[var3] != null) {
                class252.field4331[var3].field1824 = var4;
            }
        }
        if (arg1 < 22) {
            field2898 = null;
        }
        field2908++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method1061(int arg0) {
        field2906 = null;
        field2898 = null;
        field2909 = null;
        if (arg0 != 24) {
            method1060((class135) null, -91);
        }
        field2901 = null;
    }
}
