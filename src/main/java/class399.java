import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class399 implements class216 {

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "Lhc;")
    private class142 field5567;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field5568 = -1;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field5566 = 0;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "F")
    public static float field5564;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZB)V", line = 4)
    public final void method328(boolean arg0, byte arg1) {
        if (arg0) {
            class341.field4807.method504(0, 0, class228.field3251, class199.field2993, this.field5567.field2272, 0);
        }
        field5570++;
        if (arg1 > -60) {
            field5566 = -118;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V", line = 21)
    public final void method324(byte arg0) {
        field5571++;
        if (arg0 < 34) {
            field5566 = 61;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lvfa;I)V", line = 36)
    public static final void method2347(class672 arg0, int arg1) {
        if (arg1 == 2260) {
            if (class496.field6681 == arg0.field9321) {
                class12.field192[arg0.field9294] = true;
            }
            field5565++;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)Z", line = 51)
    public final boolean method320(int arg0) {
        if (arg0 != 5618) {
            field5566 = 68;
        }
        field5569++;
        return true;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lhc;)V", line = 63)
    public class399(class142 arg0) {
        this.field5567 = arg0;
    }
}
