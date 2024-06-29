import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class166 {

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public int field2701 = 0;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "Lqh;")
    public static class189 field2697 = new class189(64);

    @OriginalMember(owner = "client!di", name = "k", descriptor = "Ldf;")
    private static class51 field2706 = class46.method233("You can(Wt add yourself to your own ignore list)3", 100);

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field2703 = 0;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "Ldf;")
    public static class51 field2708 = class46.method233(")1", 100);

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Ldf;")
    public static class51 field2704 = field2706;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "Lpg;")
    public static class71 field2709;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "[Ljg;")
    public static class158[] field2707;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Llb;II)V")
    private final void method1157(class121 arg0, int arg1, int arg2) {
        if (arg1 == 5) {
            this.field2701 = arg0.method876(false);
        }
        int var4 = 79 % ((-arg2 - 54) / 53);
        field2699++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static void method1158(int arg0) {
        field2704 = null;
        field2709 = null;
        field2706 = null;
        field2697 = null;
        int var1 = 81 % ((-arg0 - 40) / 41);
        field2708 = null;
        field2707 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Llb;I)V")
    public final void method1159(class121 arg0, int arg1) {
        if (arg1 <= 4) {
            this.method1159((class121) null, 31);
        }
        while (true) {
            int var3 = arg0.method897(119);
            if (var3 == 0) {
                field2700++;
                return;
            }
            this.method1157(arg0, var3, -114);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)V")
    public static final void method1160(byte arg0, int arg1) {
        class44.field701 = arg1;
        if (arg0 < 87) {
            method1160((byte) -109, -112);
        }
        field2696++;
        class42.field678 = -1;
        class3.field16 = -1;
        class120.method863(90);
    }
}
