import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class433 extends class270 {

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public int field5701 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public int field5704 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public int field5700 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
    public int field5707 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public int field5698 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    public int field5709 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public int field5703 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "I")
    public int field5712 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "Lbv;")
    public class276 field5706;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
    public static int field5705 = -1;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(III)Z", line = 4)
    public final boolean method2312(int arg0, int arg1, int arg2) {
        field5702++;
        if (arg2 != Integer.MAX_VALUE) {
            this.method2312(-97, -84, -33);
        }
        if (this.field5707 <= arg1 && this.field5701 >= arg1 && this.field5704 <= arg0 && arg0 <= this.field5703) {
            return true;
        } else {
            return arg1 >= this.field5712 && arg1 <= this.field5698 && this.field5709 <= arg0 && arg0 <= this.field5700;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZ)V", line = 24)
    public static final void method2313(int arg0, boolean arg1) {
        class322.method1815(class399.field5336, arg1, class416.field5524, (byte) -31, class397.field5320);
        if (arg0 > -19) {
            field5699 = -16;
        }
        field5708++;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lbv;)V", line = 74)
    public class433(class276 arg0) {
        this.field5706 = arg0;
    }
}
