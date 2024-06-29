import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class135 {

    @OriginalMember(owner = "client!w", name = "c", descriptor = "Lhc;")
    public static class212 field2244 = new class212(32);

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field2247 = 0;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "[Lba;")
    public static class157[] field2250 = new class157[4];

    @OriginalMember(owner = "client!w", name = "e", descriptor = "Ldf;")
    public static class51 field2246 = class46.method233("", 100);

    @OriginalMember(owner = "client!w", name = "g", descriptor = "Ldf;")
    private static class51 field2248 = class46.method233("wave:", 100);

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Ldf;")
    public static class51 field2251 = field2248;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "[I")
    public static int[] field2253 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!w", name = "h", descriptor = "Ldf;")
    public static class51 field2249 = field2248;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "[Lcg;")
    public static class156[] field2252;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static final void method984(int arg0) {
        field2243++;
        if (arg0 == 2) {
            class162.field2656.method561(arg0 ^ 0xFFFFFFEC);
            class134.field2225 = null;
            class52.field876 = 1;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
    public static void method985(boolean arg0) {
        field2249 = null;
        field2250 = null;
        field2251 = null;
        field2248 = null;
        field2244 = null;
        field2253 = null;
        field2246 = null;
        field2252 = null;
        if (arg0) {
            method985(true);
        }
    }
}
