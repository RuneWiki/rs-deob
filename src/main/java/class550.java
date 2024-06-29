import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class550 extends class108 {

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public int field7794;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public int field7795;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "J")
    public static long field7793 = 0L;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field7796;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field7797;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)V")
    public static final void method3094(int arg0, boolean arg1) {
        field7796++;
        if (arg1) {
            if (class609.field8659 != -1) {
                class409.method2481(class609.field8659, true);
            }
            for (class553 var2 = (class553) class639.field9274.method734(0); var2 != null; var2 = (class553) class639.field9274.method736(-1)) {
                if (!var2.method912(false)) {
                    var2 = (class553) class639.field9274.method734(~arg0);
                    if (var2 == null) {
                        break;
                    }
                }
                class61.method489(-27920, true, false, var2);
            }
            class609.field8659 = -1;
            class639.field9274 = new class78(8);
            class17.method201((byte) -126);
            class609.field8659 = class221.field3318;
            class185.method1240(arg0 + 32769, false);
            class530.method2980(-6891);
            class30.method276(class609.field8659);
        }
        class633.field9208 = false;
        class621.field8755 = "";
        class646.field9387 = "";
        class37.method322(true);
        class185.field2692 = arg0;
        class549.method3085(false, class354.field5063);
        class644.field9367 = new class400();
        class644.field9367.field1571[0] = class146.field2247 / 2;
        class644.field9367.field5108 = class146.field2247 * 128 / 2;
        class644.field9367.field5109 = class66.field990 * 128 / 2;
        class216.field3274 = 0;
        class545.field7584 = 0;
        class644.field9367.field1572[0] = class66.field990 / 2;
        if (class377.field5547 == 2) {
            class545.field7584 = class168.field2453 << 7;
            class216.field3274 = class322.field4665 << 7;
        } else {
            class421.method2531((byte) -66);
        }
        class150.method1077(78);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)I")
    public static final int method3095(int arg0, int arg1) {
        if (arg0 == 1706) {
            field7797++;
            return arg1 & 0xFF;
        } else {
            return 29;
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(II)V")
    public class550(int arg0, int arg1) {
        this.field7794 = arg0;
        this.field7795 = arg1;
    }
}
