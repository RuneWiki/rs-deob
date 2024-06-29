import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class159 extends class90 {

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    public int field3241;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
    public int field3237;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "[I")
    public static int[] field3235 = new int[32];

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "Lrf;")
    private static class163 field3238 = class53.method392(121, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "Lrf;")
    public static class163 field3240 = field3238;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "Lrf;")
    public static class163 field3243;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "Lrf;")
    public static class163 field3245;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "Lrf;")
    public static class163 field3244;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)V")
    public static void method1004(byte arg0) {
        int var1 = -90 % ((arg0 - 3) / 50);
        field3235 = null;
        field3244 = null;
        field3243 = null;
        field3245 = null;
        field3238 = null;
        field3240 = null;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(II)V")
    public class159(int arg0, int arg1) {
        this.field3241 = arg0;
        this.field3237 = arg1;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3235[var1] = var0 - 1;
            var0 += var0;
        }
        field3243 = class53.method392(-109, "T");
        field3245 = class53.method392(-99, "W-=hlen Sie eine Option");
        field3244 = class53.method392(-49, "sich mit einer anderen Welt zu verbinden)3");
    }
}
