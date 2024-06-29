import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class455 extends class40 {

    @OriginalMember(owner = "client!km", name = "x", descriptor = "I")
    public static int field6488 = -1;

    @OriginalMember(owner = "client!km", name = "y", descriptor = "I")
    public static int field6489 = 1405;

    @OriginalMember(owner = "client!km", name = "v", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!km", name = "w", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!km", name = "A", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!km", name = "z", descriptor = "Lkga;")
    public static class551 field6490;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "(B)V", line = 5)
    public static final void method2775(byte arg0) {
        if (arg0 == 19) {
            class166.field2358.method557(94, 5);
            ++field6486;
            class159.field2290.method986((byte) 105, 5);
            class434.field6215.method2244(5, (byte) 86);
            class375.field5421.method2679(arg0 ^ 17, 5);
            class288.field4000.method2830((byte) 73, 5);
            class425.field6147.method4154(5, false);
            class610.field8698.method3007(5, false);
            class596.field8476.method2257(5, (byte) -41);
            class215.field3233.method1145(5, arg0 + -19819);
            class600.field8526.method906(94, 5);
            class306.field4169.method1692(32503, 5);
            class386.field5581.method2692(5, 36);
            class258.field3697.method4089(5, false);
            class332.field4513.method1900(5, (byte) -42);
            class451.field6457.method1718(true, 5);
            field6490.method3319(5, (byte) 121);
            class154.field2237.method1796((byte) 122, 5);
            class139.field1897.method15((byte) 5, 5);
            class113.field1587.method3423(5, true);
            class379.field5506.method3364(-121, 5);
            class544.method3275((byte) 117, 5);
            class687.method3897(50, 4);
            class218.method1539(-18134, 50);
            class329.method2025((byte) 6, 5);
            class602.method3508(5, (byte) 84);
            class501.field7281.method2207(5, arg0 + -18);
            class487.field7018.method2207(5, 1);
            class572.field8248.method2207(5, arg0 ^ 18);
            class405.field5767.method2207(5, 1);
            class529.field7712.method2207(5, 1);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(FI)V", line = 46)
    public final void method424(float arg0, int arg1) {
        super.field685 = arg0;
        if (arg1 == -1) {
            ++field6491;
        }
    }

    @OriginalMember(owner = "client!km", name = "e", descriptor = "(I)V", line = 57)
    public static void method2776(int arg0) {
        if (arg0 != 5) {
            method2776(113);
        }
        field6490 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BIII)V", line = 68)
    public final void method428(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = 61 / ((arg0 - 46) / 45);
        ++field6487;
        super.field679 = arg2;
        super.field678 = arg1;
        super.field688 = arg3;
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(IIIIIF)V", line = 80)
    public class455(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
