import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class622 extends class213 {

    @OriginalMember(owner = "client!ufa", name = "h", descriptor = "Lae;")
    public class228 field8828;

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "Lpr;")
    public static class407 field8826 = new class407(72, 0);

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "Lpr;")
    public static class407 field8827 = new class407(51, 6);

    @OriginalMember(owner = "client!ufa", name = "j", descriptor = "F")
    public static float field8830;

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "I")
    public static int field8825;

    @OriginalMember(owner = "client!ufa", name = "i", descriptor = "I")
    public static int field8829;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Z)V", line = 3)
    public static void method3486(boolean arg0) {
        field8827 = null;
        field8826 = null;
        if (arg0) {
            field8827 = null;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IZI)Z", line = 17)
    public static final boolean method3487(int arg0, boolean arg1, int arg2) {
        field8825++;
        if (arg0 == 11) {
            arg0 = 10;
        }
        class335 var3 = class195.field2339.method3729(arg2, (byte) 109);
        if (arg1) {
            if (arg0 >= 5 && arg0 <= 8) {
                arg0 = 4;
            }
            return var3.method1884(78, arg0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(I)V", line = 47)
    public static final void method3488(int arg0) {
        class126.field1430 = null;
        class644.field9114 = -1;
        if (arg0 != 6065) {
            field8830 = -0.14754042F;
        }
        field8824++;
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Lfo;II[B)V", line = 59)
    public class622(class473 arg0, int arg1, int arg2, byte[] arg3) {
        this.field8828 = arg0.method2741(class595.field8446, false, arg3, arg1, (byte) 127, arg2);
        this.field8828.method1331(-7684, false, false);
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Lfo;II[I)V", line = 71)
    public class622(class473 arg0, int arg1, int arg2, int[] arg3) {
        this.field8828 = arg0.method2732(arg3, arg1, false, 0, arg2);
        this.field8828.method1331(-7684, false, false);
    }
}
