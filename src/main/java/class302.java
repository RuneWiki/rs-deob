import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class302 extends class145 {

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "I")
    public static int field4889 = -1;

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "Z")
    public static volatile boolean field4887 = false;

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "I")
    public static int field4893 = 0;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "B")
    public byte field4888;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "I")
    public int field4892;

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "Llc;")
    public static class270 field4884;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "Lhc;")
    public class53 field4885;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
    public static final void method2058(int arg0, int arg1) {
        ++field4894;
        --class147.field2360;
        if (~class147.field2360 != ~arg1) {
            class117.method879(class121.field1988, arg0 + arg1, class121.field1988, arg1, -arg1 + class147.field2360);
            class117.method879(class221.field3219, arg1 + 1, class221.field3219, arg1, -arg1 + class147.field2360);
            class117.method878(class149.field2385, arg1 + 1, class149.field2385, arg1, -arg1 + class147.field2360);
            class117.method876(class204.field3009, arg1 + 1, class204.field3009, arg1, class147.field2360 - arg1);
            class117.method873(class303.field4910, arg1 + 1, class303.field4910, arg1, -arg1 + class147.field2360);
            class117.method878(class141.field2277, arg1 - -1, class141.field2277, arg1, -arg1 + class147.field2360);
            class117.method878(class131.field2173, arg1 - -1, class131.field2173, arg1, -arg1 + class147.field2360);
        }
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)I")
    public final int method223(int arg0) {
        if (arg0 != 100) {
            field4893 = 100;
        }
        ++field4882;
        return this.field4885 == null ? 0 : this.field4885.field735 * 100 / (this.field4885.field758.length + -this.field4888);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Llc;III)Lbc;")
    public static final class148 method2059(class270 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 30858) {
            return null;
        } else {
            ++field4890;
            return !class144.method1079(arg3, arg0, arg2, (byte) 59) ? null : class113.method850((byte) 84);
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)[B")
    public final byte[] method222(byte arg0) {
        ++field4883;
        int var2 = -121 / ((2 - arg0) / 33);
        if (!super.field2341 && ~this.field4885.field735 <= ~(this.field4885.field758.length - this.field4888)) {
            return this.field4885.field758;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "(I)V")
    public static void method2060(int arg0) {
        if (arg0 >= 25) {
            field4884 = null;
        }
    }
}
